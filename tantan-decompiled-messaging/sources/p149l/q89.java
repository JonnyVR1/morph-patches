package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.Envelope;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class q89 extends ax6 {

    /* JADX INFO: renamed from: R */
    public int f153140R;

    /* JADX INFO: renamed from: S */
    public double f153141S;

    /* JADX INFO: renamed from: T */
    public double f153142T;

    /* JADX INFO: renamed from: U */
    public double f153143U;

    /* JADX INFO: renamed from: V */
    public boolean f153144V;

    public q89(C4732c c4732c) {
        super(c4732c);
        this.f153140R = 10;
        this.f153141S = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f153142T = 0.37d;
        this.f153143U = 0.19d;
    }

    /* JADX INFO: renamed from: d3 */
    public PurchaseType m173356d3() {
        if (!ura.m195053e().m195057d().mo33902pn()) {
            return PurchaseType.TYPE_NONE;
        }
        if (this.f153141S > this.f153142T) {
            return PurchaseType.TYPE_ULTRA_PREMIUM;
        }
        if (ura.m195053e().m195057d().mo33736Or()) {
            return this.f153141S < this.f153143U ? PurchaseType.TYPE_GET_VIP : PurchaseType.TYPE_GET_LIKERS;
        }
        if (ura.m195053e().m195057d().mo33657As()) {
            return this.f153141S < this.f153143U ? PurchaseType.TYPE_GET_VIP : PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        return PurchaseType.TYPE_NONE;
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m173357e3() {
        if (ura.m195053e().m195057d().mo33804bm()) {
            return false;
        }
        return m173358f3();
    }

    /* JADX INFO: renamed from: f3 */
    public final boolean m173358f3() {
        return ura.m195053e().m195057d().mo33837gq() && this.f153140R == 1 && Double.compare(this.f153141S, this.f153143U) >= 0;
    }

    /* JADX INFO: renamed from: g3 */
    public boolean m173359g3() {
        return false;
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m173360h3() {
        if (ura.m195053e().m195057d().mo33804bm()) {
            return false;
        }
        return m173358f3();
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m173361i3() {
        int i;
        if (ura.m195053e().m195057d().mo33837gq()) {
            return ura.m195053e().m195057d().mo33804bm() || (i = this.f153140R) > 1 || (i == 1 && this.f153141S <= this.f153142T);
        }
        return false;
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m173362j3() {
        return false;
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m173363k3() {
        return this.f153141S > this.f153142T;
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m173364l3() {
        return ura.m195053e().m195057d().mo33837gq() && !ura.m195053e().m195057d().mo33804bm() && this.f153140R == 1 && this.f153141S > this.f153142T;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m173365m3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        int i = coreData.payWillInfo;
        if (i <= 0 || i > 10) {
            this.f153140R = 10;
        } else {
            this.f153140R = i;
        }
        double d = coreData.payWillScore;
        if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f153141S = d;
        } else {
            this.f153141S = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        double d2 = coreData.payWillScoreThreshold;
        if (d2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f153142T = d2;
        }
        double d3 = coreData.scoreThresholdOther;
        if (d3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f153143U = d3;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22306c m173366n3() {
        return ia20.m135121e(new v9j() { // from class: l.o89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/payWillInfo")).m185887f().m185883b();
            }
        }).doOnNext(new e30() { // from class: l.p89
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147572a.m173365m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<Envelope> m173367o3() {
        return this.f72126Q.scheduled("payWillInfo", 0, new v9j() { // from class: l.n89
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f137606a.m173366n3();
            }
        }).observeOn(jo0.m142408a());
    }
}
