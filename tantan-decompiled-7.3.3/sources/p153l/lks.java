package p153l;

import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public class lks {

    /* JADX INFO: renamed from: a */
    public int f132496a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<GiftTrayData> f132497b = new ArrayDeque<>(3);

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<GiftTrayData> f132498c = new ArrayDeque<>(3);

    /* JADX INFO: renamed from: a */
    public void m154651a(GiftTrayData giftTrayData) {
        if (giftTrayData == null || giftTrayData.f50947e == 0) {
            return;
        }
        while (this.f132498c.size() >= 3) {
            this.f132498c.removeFirst();
        }
        giftTrayData.f50945c = System.currentTimeMillis();
        this.f132498c.add(giftTrayData);
        this.f132496a++;
    }

    /* JADX INFO: renamed from: b */
    public void m154652b(GiftTrayData giftTrayData) {
        if (giftTrayData == null || giftTrayData.f50947e == 0) {
            return;
        }
        this.f132498c.remove(giftTrayData);
        while (this.f132497b.size() >= 3) {
            this.f132497b.removeFirst();
        }
        giftTrayData.f50945c = System.currentTimeMillis();
        this.f132497b.add(giftTrayData);
        int i = this.f132496a - 1;
        this.f132496a = i;
        if (i <= 0) {
            this.f132496a = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m154653c() {
        this.f132497b.clear();
        this.f132498c.clear();
    }

    /* JADX INFO: renamed from: d */
    public bgt m154654d() {
        bgt bgtVar = new bgt();
        bgtVar.m104240d(this.f132496a);
        bgtVar.m104239c(jyb.m147486Q(this.f132497b, new qcj() { // from class: l.kks
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new agt((GiftTrayData) obj);
            }
        }));
        bgtVar.m104238b(jyb.m147486Q(this.f132498c, new qcj() { // from class: l.kks
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new agt((GiftTrayData) obj);
            }
        }));
        return bgtVar;
    }
}
