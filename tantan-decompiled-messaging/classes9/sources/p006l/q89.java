package p006l;

import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Envelope;
import l.e30;
import l.jo0;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class q89 extends ax6 {

    /* JADX INFO: renamed from: R */
    public int f19661R;

    /* JADX INFO: renamed from: S */
    public double f19662S;

    /* JADX INFO: renamed from: T */
    public double f19663T;

    /* JADX INFO: renamed from: U */
    public double f19664U;

    /* JADX INFO: renamed from: V */
    public boolean f19665V;

    public q89(C0158c c0158c) {
        super(c0158c);
        this.f19661R = 10;
        this.f19662S = 0.0d;
        this.f19663T = 0.37d;
        this.f19664U = 0.19d;
    }

    /* JADX INFO: renamed from: d3 */
    public PurchaseType m21960d3() {
        if (!ura.m25555e().m25559d().m5839pn()) {
            return PurchaseType.TYPE_NONE;
        }
        if (this.f19662S > this.f19663T) {
            return PurchaseType.TYPE_ULTRA_PREMIUM;
        }
        if (ura.m25555e().m25559d().m5673Or()) {
            return this.f19662S < this.f19664U ? PurchaseType.TYPE_GET_VIP : PurchaseType.TYPE_GET_LIKERS;
        }
        if (ura.m25555e().m25559d().m5594As()) {
            return this.f19662S < this.f19664U ? PurchaseType.TYPE_GET_VIP : PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        return PurchaseType.TYPE_NONE;
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m21961e3() {
        if (ura.m25555e().m25559d().m5741bm()) {
            return false;
        }
        return m21962f3();
    }

    /* JADX INFO: renamed from: f3 */
    public final boolean m21962f3() {
        return ura.m25555e().m25559d().m5774gq() && this.f19661R == 1 && Double.compare(this.f19662S, this.f19664U) >= 0;
    }

    /* JADX INFO: renamed from: g3 */
    public boolean m21963g3() {
        return false;
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m21964h3() {
        if (ura.m25555e().m25559d().m5741bm()) {
            return false;
        }
        return m21962f3();
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m21965i3() {
        int i;
        if (ura.m25555e().m25559d().m5774gq()) {
            return ura.m25555e().m25559d().m5741bm() || (i = this.f19661R) > 1 || (i == 1 && this.f19662S <= this.f19663T);
        }
        return false;
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m21966j3() {
        return false;
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m21967k3() {
        return this.f19662S > this.f19663T;
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m21968l3() {
        return ura.m25555e().m25559d().m5774gq() && !ura.m25555e().m25559d().m5741bm() && this.f19661R == 1 && this.f19662S > this.f19663T;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m21969m3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        int i = moduleData.payWillInfo;
        if (i <= 0 || i > 10) {
            this.f19661R = 10;
        } else {
            this.f19661R = i;
        }
        double d = moduleData.payWillScore;
        if (d >= 0.0d) {
            this.f19662S = d;
        } else {
            this.f19662S = 0.0d;
        }
        double d2 = moduleData.payWillScoreThreshold;
        if (d2 >= 0.0d) {
            this.f19663T = d2;
        }
        double d3 = moduleData.scoreThresholdOther;
        if (d3 >= 0.0d) {
            this.f19664U = d3;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ c m21970n3() {
        return ia20.m16571e(new v9j() { // from class: l.o89
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/payWillInfo")).f().b();
            }
        }).doOnNext(new e30() { // from class: l.p89
            public final void call(Object obj) {
                this.f18627a.m21969m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public c<Envelope> m21971o3() {
        return this.f8580Q.scheduled("payWillInfo", 0, new v9j() { // from class: l.n89
            public final Object call() {
                return this.f17530a.m21970n3();
            }
        }).observeOn(jo0.a());
    }
}
