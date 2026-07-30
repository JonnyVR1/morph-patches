package p002l;

import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.util.ArrayDeque;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kis {

    /* JADX INFO: renamed from: a */
    public int f14350a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<GiftTrayData> f14351b = new ArrayDeque<>(3);

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<GiftTrayData> f14352c = new ArrayDeque<>(3);

    /* JADX INFO: renamed from: a */
    public void m16635a(GiftTrayData giftTrayData) {
        if (giftTrayData == null || giftTrayData.f6141e == 0) {
            return;
        }
        while (this.f14352c.size() >= 3) {
            this.f14352c.removeFirst();
        }
        giftTrayData.f6139c = System.currentTimeMillis();
        this.f14352c.add(giftTrayData);
        this.f14350a++;
    }

    /* JADX INFO: renamed from: b */
    public void m16636b(GiftTrayData giftTrayData) {
        if (giftTrayData == null || giftTrayData.f6141e == 0) {
            return;
        }
        this.f14352c.remove(giftTrayData);
        while (this.f14351b.size() >= 3) {
            this.f14351b.removeFirst();
        }
        giftTrayData.f6139c = System.currentTimeMillis();
        this.f14351b.add(giftTrayData);
        int i = this.f14350a - 1;
        this.f14350a = i;
        if (i <= 0) {
            this.f14350a = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m16637c() {
        this.f14351b.clear();
        this.f14352c.clear();
    }

    /* JADX INFO: renamed from: d */
    public aet m16638d() {
        aet aetVar = new aet();
        aetVar.m9611d(this.f14350a);
        aetVar.m9610c(vwb.Q(this.f14351b, new w9j() { // from class: l.jis
            public final Object call(Object obj) {
                return new zdt((GiftTrayData) obj);
            }
        }));
        aetVar.m9609b(vwb.Q(this.f14352c, new w9j() { // from class: l.jis
            public final Object call(Object obj) {
                return new zdt((GiftTrayData) obj);
            }
        }));
        return aetVar;
    }
}
