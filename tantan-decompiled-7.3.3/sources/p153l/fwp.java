package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLivePopUp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/fwp;", "Ll/o4n;", "Ll/ner;", "lifecycleProvider", "Ll/nus;", BaseSei.INFO, "<init>", "(Ll/ner;Ll/nus;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "", "W2", "()Z", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class fwp extends o4n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwp(@NotNull ner nerVar, @NotNull nus nusVar) {
        super(nerVar, nusVar);
        nerVar.getClass();
        nusVar.getClass();
        m166069X2(new Function1() { // from class: l.ewp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fwp.m127830e3(this.f96180a, (BLivePopUp) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public static void m127829d3(fwp fwpVar, Boolean bool) {
        fwpVar.m166071Z2(!bool.booleanValue());
        if (fwpVar.getFragIsShow() && fwpVar.getIsFirstStart()) {
            fwpVar.m166070Y2(false);
            fwpVar.getApi().m130597p();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public static Unit m127830e3(fwp fwpVar, BLivePopUp bLivePopUp) {
        bLivePopUp.getClass();
        Act act = fwpVar.act();
        if (act != null) {
            act.startActivity(tbs.f172993f.m143704f(act.act(), AudienceStartData.getBuilder().m68789Q(true).m68777E(bLivePopUp.liveId).m68787O(bLivePopUp.source).m68794u()));
        }
        return Unit.INSTANCE;
    }

    @Override // p153l.o4n, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(avo0.INSTANCE.m100477a()).subscribe(dhw.m115825d(new y20() { // from class: l.dwp
            @Override // p153l.y20
            public final void call(Object obj) {
                fwp.m127829d3(this.f91037a, (Boolean) obj);
            }
        }));
    }

    @Override // p153l.o4n
    /* JADX INFO: renamed from: W2 */
    public boolean mo106899W2() {
        return false;
    }
}
