package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLivePopUp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/fup;", "Ll/o2n;", "Ll/mcr;", "lifecycleProvider", "Ll/mss;", BaseSei.INFO, "<init>", "(Ll/mcr;Ll/mss;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "", "W2", "()Z", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class fup extends o2n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fup(@NotNull mcr mcrVar, @NotNull mss mssVar) {
        super(mcrVar, mssVar);
        mcrVar.getClass();
        mssVar.getClass();
        m162313X2(new Function1() { // from class: l.eup
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fup.m123208e3(this.f93267a, (BLivePopUp) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public static void m123207d3(fup fupVar, Boolean bool) {
        fupVar.m162315Z2(!bool.booleanValue());
        if (fupVar.getFragIsShow() && fupVar.getIsFirstStart()) {
            fupVar.m162314Y2(false);
            fupVar.getApi().m126384p();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public static Unit m123208e3(fup fupVar, BLivePopUp bLivePopUp) {
        bLivePopUp.getClass();
        Act act = fupVar.act();
        if (act != null) {
            act.startActivity(s9s.f163232f.m134373f(act.act(), AudienceStartData.getBuilder().m67606Q(true).m67594E(bLivePopUp.liveId).m67604O(bLivePopUp.source).m67611u()));
        }
        return Unit.INSTANCE;
    }

    @Override // p149l.o2n, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(wlo0.INSTANCE.m203843a()).subscribe(ffw.m121193d(new e30() { // from class: l.dup
            @Override // p149l.e30
            public final void call(Object obj) {
                fup.m123207d3(this.f88006a, (Boolean) obj);
            }
        }));
    }

    @Override // p149l.o2n
    /* JADX INFO: renamed from: W2 */
    public boolean mo104064W2() {
        return false;
    }
}
