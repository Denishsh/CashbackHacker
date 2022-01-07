import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    public CashbackHackService service;
    public static CashbackHackService serviceNew;

    // test

    @org.junit.Before
    public void init() {
        service = new CashbackHackService();
    }

    @BeforeAll
    static void initNew() {
        serviceNew = new CashbackHackService();
    }


    @org.junit.Test
    public void remainMoreTest() {
        Assert.assertEquals(999, service.remain(1001));
        Assert.assertEquals(995, service.remain(1005));
    }

    @Test
    public void remainMoreNewTest() {
        assertEquals(999, serviceNew.remain(1001));
        assertEquals(995, serviceNew.remain(1005));
    }

    @org.junit.Test
    public void remainLess1000Test() {
        Assert.assertEquals(1000, service.remain(0));
        Assert.assertEquals(999, service.remain(1));
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void remainLess1000NewTest() {
        assertEquals(1000, serviceNew.remain(0));
        assertEquals(999, serviceNew.remain(1));
        assertEquals(1, serviceNew.remain(999));
    }

    @org.junit.Test
    public void remain1000Test() {
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void remain1000NewTest() {
        assertEquals(0, serviceNew.remain(1000));
    }
}
