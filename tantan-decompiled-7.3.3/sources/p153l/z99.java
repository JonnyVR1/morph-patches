package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.Envelope;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class z99 extends dy6 {

    /* JADX INFO: renamed from: R */
    public int f203451R;

    /* JADX INFO: renamed from: S */
    public double f203452S;

    /* JADX INFO: renamed from: T */
    public double f203453T;

    /* JADX INFO: renamed from: U */
    public double f203454U;

    /* JADX INFO: renamed from: V */
    public boolean f203455V;

    public z99(C4883c c4883c) {
        super(c4883c);
        this.f203451R = 10;
        this.f203452S = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f203453T = 0.37d;
        this.f203454U = 0.19d;
    }

    /* JADX INFO: renamed from: d3 */
    public PurchaseType m219059d3() {
        if (!gta.m132210e().m132214d().mo34905pn()) {
            return PurchaseType.TYPE_NONE;
        }
        if (this.f203452S > this.f203453T) {
            return PurchaseType.TYPE_ULTRA_PREMIUM;
        }
        if (gta.m132210e().m132214d().mo34739Or()) {
            return this.f203452S < this.f203454U ? PurchaseType.TYPE_GET_VIP : PurchaseType.TYPE_GET_LIKERS;
        }
        if (gta.m132210e().m132214d().mo34660As()) {
            return this.f203452S < this.f203454U ? PurchaseType.TYPE_GET_VIP : PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        return PurchaseType.TYPE_NONE;
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m219060e3() {
        if (gta.m132210e().m132214d().mo34807bm()) {
            return false;
        }
        return m219061f3();
    }

    /* JADX INFO: renamed from: f3 */
    public final boolean m219061f3() {
        return gta.m132210e().m132214d().mo34840gq() && this.f203451R == 1 && Double.compare(this.f203452S, this.f203454U) >= 0;
    }

    /* JADX INFO: renamed from: g3 */
    public boolean m219062g3() {
        return false;
    }

    /* JADX INFO: renamed from: h3 */
    public boolean m219063h3() {
        if (gta.m132210e().m132214d().mo34807bm()) {
            return false;
        }
        return m219061f3();
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m219064i3() {
        int i;
        if (gta.m132210e().m132214d().mo34840gq()) {
            return gta.m132210e().m132214d().mo34807bm() || (i = this.f203451R) > 1 || (i == 1 && this.f203452S <= this.f203453T);
        }
        return false;
    }

    /* JADX INFO: renamed from: j3 */
    public boolean m219065j3() {
        return false;
    }

    /* JADX INFO: renamed from: k3 */
    public boolean m219066k3() {
        return this.f203452S > this.f203453T;
    }

    /* JADX INFO: renamed from: l3 */
    public boolean m219067l3() {
        return gta.m132210e().m132214d().mo34840gq() && !gta.m132210e().m132214d().mo34807bm() && this.f203451R == 1 && this.f203452S > this.f203453T;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m219068m3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        int i = coreData.payWillInfo;
        if (i <= 0 || i > 10) {
            this.f203451R = 10;
        } else {
            this.f203451R = i;
        }
        double d = coreData.payWillScore;
        if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f203452S = d;
        } else {
            this.f203452S = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        double d2 = coreData.payWillScoreThreshold;
        if (d2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f203453T = d2;
        }
        double d3 = coreData.scoreThresholdOther;
        if (d3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f203454U = d3;
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ C22421c m219069n3() {
        return qi20.m176658e(new pcj() { // from class: l.x99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/payWillInfo")).m209032f().m209028b();
            }
        }).doOnNext(new y20() { // from class: l.y99
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198067a.m219068m3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<Envelope> m219070o3() {
        return this.f91137Q.scheduled("payWillInfo", 0, new pcj() { // from class: l.w99
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f187988a.m219069n3();
            }
        }).observeOn(fo0.m126432a());
    }
}
