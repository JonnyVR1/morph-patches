package p153l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.RiskSelfData;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class yd9 extends dy6 {

    /* JADX INFO: renamed from: R */
    public jxd0 f198578R;

    /* JADX INFO: renamed from: S */
    public long f198579S;

    /* JADX INFO: renamed from: T */
    public long f198580T;

    /* JADX INFO: renamed from: U */
    public int f198581U;

    /* JADX INFO: renamed from: V */
    public boolean f198582V;

    /* JADX INFO: renamed from: W */
    public String f198583W;

    public yd9(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ CoreData m215187a3(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: j3 */
    public final byd0 m215196j3(int i) {
        return new byd0("core_risk_self_" + i + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: k3 */
    public C22421c<CoreData> m215197k3(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        boolean z = false;
        boolean z2 = str3.contains("user") && pzi0.m174454o() > this.f198579S && !pzi0.m174438C(pzi0.m174454o(), this.f198579S);
        if (str3.contains("description") && pzi0.m174454o() > this.f198580T && !pzi0.m174438C(pzi0.m174454o(), this.f198580T)) {
            z = true;
        }
        return (z2 || z) ? m215204r3(str, str2, str3).filter(new qcj() { // from class: l.qd9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                CoreData coreData = (CoreData) obj;
                return Boolean.valueOf(NullChecker.m82486a(coreData) && (NullChecker.m82486a(coreData.userRisk) || NullChecker.m82486a(coreData.descriptionRisk)));
            }
        }).map(new qcj() { // from class: l.rd9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f162295a.m215199m3((CoreData) obj);
            }
        }) : C22421c.just(CoreData.new_());
    }

    /* JADX INFO: renamed from: l3 */
    public C22421c<RiskSelfData> m215198l3(@NonNull final String str) {
        return m215205s3(str).map(new qcj() { // from class: l.od9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f146856a.m215200n3(str, (List) obj);
            }
        }).filter(new qcj() { // from class: l.pd9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((RiskSelfData) obj));
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ CoreData m215199m3(CoreData coreData) {
        if (NullChecker.m82486a(coreData.userRisk) && coreData.userRisk.limited) {
            this.f198579S = pzi0.m174454o();
        }
        if (NullChecker.m82486a(coreData.descriptionRisk) && coreData.descriptionRisk.limited) {
            this.f198580T = pzi0.m174454o();
        }
        return coreData;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ RiskSelfData m215200n3(String str, List list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        if (TextUtils.equals(str, "me")) {
            return (RiskSelfData) list.get(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RiskSelfData riskSelfData = (RiskSelfData) it.next();
            if (riskSelfData != null && pzi0.m174454o() > m215196j3(riskSelfData.f21238id).get().longValue() + 259200000) {
                return riskSelfData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public void m215201o3() {
        this.f198581U = 0;
        this.f198582V = true;
    }

    /* JADX INFO: renamed from: p3 */
    public void m215202p3() {
        if (this.f198582V) {
            this.f198581U++;
        }
    }

    /* JADX INFO: renamed from: q3 */
    public void m215203q3(RiskSelfData riskSelfData) {
        m215196j3(riskSelfData.f21238id).put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: r3 */
    public final C22421c<CoreData> m215204r3(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Uri.Builder builderAppendQueryParameter = Uri.parse(C4879a.m32216J0("/risk/" + str)).buildUpon().appendQueryParameter("scene", str2).appendQueryParameter("content", str3);
        if (TextUtils.equals(str2, "swipe")) {
            builderAppendQueryParameter.appendQueryParameter("swipeCount", String.valueOf(this.f198581U));
        }
        final String string = builderAppendQueryParameter.build().toString();
        return CoreModule.f18264c.scheduled("getRiskOther" + pzi0.m174454o(), 0, new pcj() { // from class: l.sd9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.wd9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209027a("time-zone", TimeZone.getDefault() == null ? "" : TimeZone.getDefault().getID()).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.xd9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return yd9.m215187a3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final C22421c<List<RiskSelfData>> m215205s3(@NonNull String str) {
        final String string = Uri.parse(C4879a.m32216J0("/risk")).buildUpon().appendQueryParameter("scene", str).toString();
        return CoreModule.f18264c.scheduled("getRiskSelf" + pzi0.m174454o(), 0, new pcj() { // from class: l.td9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.ud9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(str).m209027a("time-zone", TimeZone.getDefault() == null ? "" : TimeZone.getDefault().getID()).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.vd9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).risks;
                    }
                });
            }
        });
    }
}
