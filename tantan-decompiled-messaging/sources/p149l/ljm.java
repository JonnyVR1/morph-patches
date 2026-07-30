package p149l;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class ljm extends pq2 {

    /* JADX INFO: renamed from: n */
    private final LinkedBlockingDeque<izm> f128357n;

    /* JADX INFO: renamed from: o */
    private int f128358o;

    /* JADX INFO: renamed from: p */
    private int[] f128359p;

    /* JADX INFO: renamed from: q */
    private ReentrantLock f128360q;

    /* JADX INFO: renamed from: r */
    private int f128361r;

    /* JADX INFO: renamed from: s */
    private ConcurrentHashMap<String, String> f128362s;

    /* JADX INFO: renamed from: t */
    private ConcurrentHashMap<String, String> f128363t;

    /* JADX INFO: renamed from: u */
    private AtomicBoolean f128364u;

    public ljm(String str, int i) {
        super(str, i);
        this.f128357n = new LinkedBlockingDeque<>();
        this.f128358o = -1;
        this.f128360q = new ReentrantLock();
        this.f128361r = 0;
        this.f128362s = new ConcurrentHashMap<>();
        this.f128363t = new ConcurrentHashMap<>();
        this.f128364u = new AtomicBoolean(true);
    }

    public String toString() {
        return "主域名 " + this.f150739c + "\n当前使用的地址是 " + this.f150741e + "\n最大失败次数=" + m170879d() + "\n备用域名列表是 " + this.f150737a + "\n备用端口有 " + this.f128359p;
    }
}
