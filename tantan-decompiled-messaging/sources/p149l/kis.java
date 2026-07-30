package p149l;

import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public class kis {

    /* JADX INFO: renamed from: a */
    public int f123387a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<GiftTrayData> f123388b = new ArrayDeque<>(3);

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<GiftTrayData> f123389c = new ArrayDeque<>(3);

    /* JADX INFO: renamed from: a */
    public void m146130a(GiftTrayData giftTrayData) {
        if (giftTrayData == null || giftTrayData.f50099e == 0) {
            return;
        }
        while (this.f123389c.size() >= 3) {
            this.f123389c.removeFirst();
        }
        giftTrayData.f50097c = System.currentTimeMillis();
        this.f123389c.add(giftTrayData);
        this.f123387a++;
    }

    /* JADX INFO: renamed from: b */
    public void m146131b(GiftTrayData giftTrayData) {
        if (giftTrayData == null || giftTrayData.f50099e == 0) {
            return;
        }
        this.f123389c.remove(giftTrayData);
        while (this.f123388b.size() >= 3) {
            this.f123388b.removeFirst();
        }
        giftTrayData.f50097c = System.currentTimeMillis();
        this.f123388b.add(giftTrayData);
        int i = this.f123387a - 1;
        this.f123387a = i;
        if (i <= 0) {
            this.f123387a = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m146132c() {
        this.f123388b.clear();
        this.f123389c.clear();
    }

    /* JADX INFO: renamed from: d */
    public aet m146133d() {
        aet aetVar = new aet();
        aetVar.m96130d(this.f123387a);
        aetVar.m96129c(vwb.m200303Q(this.f123388b, new w9j() { // from class: l.jis
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new zdt((GiftTrayData) obj);
            }
        }));
        aetVar.m96128b(vwb.m200303Q(this.f123389c, new w9j() { // from class: l.jis
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new zdt((GiftTrayData) obj);
            }
        }));
        return aetVar;
    }
}
