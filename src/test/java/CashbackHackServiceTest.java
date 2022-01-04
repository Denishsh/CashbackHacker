import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    public CashbackHackService service;

    @BeforeTest
    public void init() {
        service = new CashbackHackService();
    }

    @Test
    public void remainMoreTest() {
        Assert.assertEquals(service.remain(1001), 999);
        Assert.assertEquals(service.remain(1005), 995);
    }

    @Test
    public void remainLess1000Test() {
        Assert.assertEquals(service.remain(0), 1000);
        Assert.assertEquals(service.remain(1), 999);
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void remain1000Test() {
        Assert.assertEquals(service.remain(1000), 0);
    }

}
