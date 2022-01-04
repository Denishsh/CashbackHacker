import org.junit.Assert;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    public CashbackHackService service;

    @org.junit.Before
    public void init() {
        service = new CashbackHackService();
    }

    @org.junit.Test
    public void remainMoreTest() {
        Assert.assertEquals(999, service.remain(1001));
        Assert.assertEquals(995, service.remain(1005));
    }

    @org.junit.Test
    public void remainLess1000Test() {
        Assert.assertEquals(1000, service.remain(0));
        Assert.assertEquals(999, service.remain(1));
        Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void remain1000Test() {
        Assert.assertEquals(0, service.remain(1000));
    }

}
