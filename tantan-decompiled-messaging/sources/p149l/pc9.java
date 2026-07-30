package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.RiskSelfData;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class pc9 extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f148152R;

    /* JADX INFO: renamed from: S */
    public long f148153S;

    /* JADX INFO: renamed from: T */
    public long f148154T;

    /* JADX INFO: renamed from: U */
    public int f148155U;

    /* JADX INFO: renamed from: V */
    public boolean f148156V;

    /* JADX INFO: renamed from: W */
    public String f148157W;

    public pc9(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ CoreData m168321a3(Envelope envelope) {
        return (CoreData) envelope.getModuleData(CoreData.class);
    }

    /* JADX INFO: renamed from: j3 */
    public final zpd0 m168330j3(int i) {
        return new zpd0("core_risk_self_" + i + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: k3 */
    public C22306c<CoreData> m168331k3(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        boolean z = false;
        boolean z2 = str3.contains("user") && mqi0.m155944o() > this.f148153S && !mqi0.m155928C(mqi0.m155944o(), this.f148153S);
        if (str3.contains("description") && mqi0.m155944o() > this.f148154T && !mqi0.m155928C(mqi0.m155944o(), this.f148154T)) {
            z = true;
        }
        return (z2 || z) ? m168338r3(str, str2, str3).filter(new w9j() { // from class: l.hc9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                CoreData coreData = (CoreData) obj;
                return Boolean.valueOf(NullChecker.m81303a(coreData) && (NullChecker.m81303a(coreData.userRisk) || NullChecker.m81303a(coreData.descriptionRisk)));
            }
        }).map(new w9j() { // from class: l.ic9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f112444a.m168333m3((CoreData) obj);
            }
        }) : C22306c.just(CoreData.new_());
    }

    /* JADX INFO: renamed from: l3 */
    public C22306c<RiskSelfData> m168332l3(@NonNull final String str) {
        return m168339s3(str).map(new w9j() { // from class: l.fc9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f96779a.m168334n3(str, (List) obj);
            }
        }).filter(new w9j() { // from class: l.gc9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((RiskSelfData) obj));
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ CoreData m168333m3(CoreData coreData) {
        if (NullChecker.m81303a(coreData.userRisk) && coreData.userRisk.limited) {
            this.f148153S = mqi0.m155944o();
        }
        if (NullChecker.m81303a(coreData.descriptionRisk) && coreData.descriptionRisk.limited) {
            this.f148154T = mqi0.m155944o();
        }
        return coreData;
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ RiskSelfData m168334n3(String str, List list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        if (TextUtils.equals(str, "me")) {
            return (RiskSelfData) list.get(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RiskSelfData riskSelfData = (RiskSelfData) it.next();
            if (riskSelfData != null && mqi0.m155944o() > m168330j3(riskSelfData.f20496id).get().longValue() + 259200000) {
                return riskSelfData;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o3 */
    public void m168335o3() {
        this.f148155U = 0;
        this.f148156V = true;
    }

    /* JADX INFO: renamed from: p3 */
    public void m168336p3() {
        if (this.f148156V) {
            this.f148155U++;
        }
    }

    /* JADX INFO: renamed from: q3 */
    public void m168337q3(RiskSelfData riskSelfData) {
        m168330j3(riskSelfData.f20496id).put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: r3 */
    public final C22306c<CoreData> m168338r3(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Uri.Builder builderAppendQueryParameter = Uri.parse(C4728a.m31213J0("/risk/" + str)).buildUpon().appendQueryParameter("scene", str2).appendQueryParameter("content", str3);
        if (TextUtils.equals(str2, "swipe")) {
            builderAppendQueryParameter.appendQueryParameter("swipeCount", String.valueOf(this.f148155U));
        }
        final String string = builderAppendQueryParameter.build().toString();
        return CoreModule.f17545c.scheduled("getRiskOther" + mqi0.m155944o(), 0, new v9j() { // from class: l.jc9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.nc9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185882a("time-zone", TimeZone.getDefault() == null ? "" : TimeZone.getDefault().getID()).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.oc9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return pc9.m168321a3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public final C22306c<List<RiskSelfData>> m168339s3(@NonNull String str) {
        final String string = Uri.parse(C4728a.m31213J0("/risk")).buildUpon().appendQueryParameter("scene", str).toString();
        return CoreModule.f17545c.scheduled("getRiskSelf" + mqi0.m155944o(), 0, new v9j() { // from class: l.kc9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.lc9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(str).m185882a("time-zone", TimeZone.getDefault() == null ? "" : TimeZone.getDefault().getID()).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.mc9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).risks;
                    }
                });
            }
        });
    }
}
