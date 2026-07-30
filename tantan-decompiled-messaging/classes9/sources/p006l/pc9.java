package p006l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.RiskSelfData;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import l.hpd0;
import l.mqi0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pc9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f18674R;

    /* JADX INFO: renamed from: S */
    public long f18675S;

    /* JADX INFO: renamed from: T */
    public long f18676T;

    /* JADX INFO: renamed from: U */
    public int f18677U;

    /* JADX INFO: renamed from: V */
    public boolean f18678V;

    /* JADX INFO: renamed from: W */
    public String f18679W;

    public pc9(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: j3 */
    public final zpd0 m21075j3(int i) {
        return new zpd0("core_risk_self_" + i + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: k3 */
    public c<CoreData> m21076k3(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        boolean z = false;
        boolean z2 = str3.contains("user") && mqi0.o() > this.f18675S && !mqi0.C(mqi0.o(), this.f18675S);
        if (str3.contains("description") && mqi0.o() > this.f18676T && !mqi0.C(mqi0.o(), this.f18676T)) {
            z = true;
        }
        return (z2 || z) ? m21083r3(str, str2, str3).filter(new w9j() { // from class: l.hc9
            public final Object call(Object obj) {
                CoreData coreData = (CoreData) obj;
                return Boolean.valueOf(NullChecker.a(coreData) && (NullChecker.a(coreData.userRisk) || NullChecker.a(coreData.descriptionRisk)));
            }
        }).map(new w9j() { // from class: l.ic9
            public final Object call(Object obj) {
                return this.f14355a.m21078m3((CoreData) obj);
            }
        }) : c.just(CoreData.new_());
    }

    /* JADX INFO: renamed from: l3 */
    public c<RiskSelfData> m21077l3(@NonNull final String str) {
        return m21084s3(str).map(new w9j() { // from class: l.fc9
            public final Object call(Object obj) {
                return this.f12646a.m21079n3(str, (List) obj);
            }
        }).filter(new w9j() { // from class: l.gc9
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((RiskSelfData) obj));
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ CoreData m21078m3(CoreData coreData) {
        if (NullChecker.a(coreData.userRisk) && coreData.userRisk.limited) {
            this.f18675S = mqi0.o();
        }
        if (NullChecker.a(coreData.descriptionRisk) && coreData.descriptionRisk.limited) {
            this.f18676T = mqi0.o();
        }
        return coreData;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ RiskSelfData m21079n3(String str, List list) {
        if (vwb.J(list)) {
            return null;
        }
        if (TextUtils.equals(str, "me")) {
            return (RiskSelfData) list.get(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RiskSelfData riskSelfData = (RiskSelfData) it.next();
            if (riskSelfData != null && mqi0.o() > ((Long) m21075j3(riskSelfData.id).get()).longValue() + 259200000) {
                return riskSelfData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public void m21080o3() {
        this.f18677U = 0;
        this.f18678V = true;
    }

    /* JADX INFO: renamed from: p3 */
    public void m21081p3() {
        if (this.f18678V) {
            this.f18677U++;
        }
    }

    /* JADX INFO: renamed from: q3 */
    public void m21082q3(RiskSelfData riskSelfData) {
        m21075j3(riskSelfData.id).put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: r3 */
    public final c<CoreData> m21083r3(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Uri.Builder builderAppendQueryParameter = Uri.parse(C0154a.m3143J0("/risk/" + str)).buildUpon().appendQueryParameter("scene", str2).appendQueryParameter("content", str3);
        if (TextUtils.equals(str2, "swipe")) {
            builderAppendQueryParameter.appendQueryParameter("swipeCount", String.valueOf(this.f18677U));
        }
        final String string = builderAppendQueryParameter.build().toString();
        return CoreModule.f1534c.scheduled("getRiskOther" + mqi0.o(), 0, new v9j() { // from class: l.jc9
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.nc9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).a("time-zone", TimeZone.getDefault() == null ? "" : TimeZone.getDefault().getID()).f().b();
                    }
                }).map(new w9j() { // from class: l.oc9
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final c<List<RiskSelfData>> m21084s3(@NonNull String str) {
        final String string = Uri.parse(C0154a.m3143J0("/risk")).buildUpon().appendQueryParameter("scene", str).toString();
        return CoreModule.f1534c.scheduled("getRiskSelf" + mqi0.o(), 0, new v9j() { // from class: l.kc9
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.lc9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(str).a("time-zone", TimeZone.getDefault() == null ? "" : TimeZone.getDefault().getID()).f().b();
                    }
                }).map(new w9j() { // from class: l.mc9
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).risks;
                    }
                });
            }
        });
    }
}
