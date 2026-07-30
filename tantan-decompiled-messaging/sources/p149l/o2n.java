package p149l;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLivePopUp;
import com.p046p1.mobile.putong.live.external.intl.common.gameguide.IntlGameGuideDialogView;
import com.p046p1.mobile.putong.live.external.square.api.ModelData;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010,¨\u00062"}, m87232d2 = {"Ll/o2n;", "Ll/svs;", "Ll/mcr;", "lifecycleProvider", "Ll/mss;", BaseSei.INFO, "<init>", "(Ll/mcr;Ll/mss;)V", "", j6f.GPS_DIRECTION_TRUE, "()V", "", "W2", "()Z", "Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "data", "a3", "(Lcom/p1/mobile/putong/live/base/data/BLivePopUp;)V", "Ll/gin;", "f", "Ll/gin;", "T2", "()Ll/gin;", "api", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "getEnterRoomAction", "()Lkotlin/jvm/functions/Function1;", "X2", "(Lkotlin/jvm/functions/Function1;)V", "enterRoomAction", "Ll/dd80;", "h", "Ll/dd80;", "getDialog", "()Ll/dd80;", "setDialog", "(Ll/dd80;)V", OMSTemplateType.dialog, RXScreenCaptureService.KEY_INDEX, "Z", "U2", "Z2", "(Z)V", "fragIsShow", "j", "V2", "Y2", "isFirstStart", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class o2n extends svs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final gin api;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Function1<? super BLivePopUp, Unit> enterRoomAction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public dd80 dialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean fragIsShow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isFirstStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2n(@NotNull mcr mcrVar, @NotNull mss mssVar) {
        super(mcrVar, mssVar);
        mcrVar.getClass();
        mssVar.getClass();
        this.api = new gin(mcrVar);
        this.isFirstStart = true;
    }

    /* JADX INFO: renamed from: R2 */
    public static Unit m162306R2(o2n o2nVar, ModelData modelData) {
        modelData.getClass();
        if (modelData.isSuccess() && o2nVar.api.getResultData() != null && o2nVar.fragIsShow) {
            BLivePopUp resultData = o2nVar.api.getResultData();
            resultData.getClass();
            o2nVar.m162316a3(resultData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b3 */
    public static final Unit m162308b3(o2n o2nVar, BLivePopUp bLivePopUp) {
        dd80 dd80Var = o2nVar.dialog;
        if (dd80Var != null) {
            dd80Var.dismiss();
        }
        Function1<? super BLivePopUp, Unit> function1 = o2nVar.enterRoomAction;
        if (function1 != null) {
            function1.invoke(bLivePopUp);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c3 */
    public static final Unit m162309c3(o2n o2nVar) {
        dd80 dd80Var = o2nVar.dialog;
        if (dd80Var != null) {
            dd80Var.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        this.api.observe(new Function1() { // from class: l.l2n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o2n.m162306R2(this.f125798a, (ModelData) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: T2, reason: from getter */
    public final gin getApi() {
        return this.api;
    }

    /* JADX INFO: renamed from: U2, reason: from getter */
    public final boolean getFragIsShow() {
        return this.fragIsShow;
    }

    /* JADX INFO: renamed from: V2, reason: from getter */
    public final boolean getIsFirstStart() {
        return this.isFirstStart;
    }

    /* JADX INFO: renamed from: W2 */
    public boolean mo104064W2() {
        throw null;
    }

    /* JADX INFO: renamed from: X2 */
    public final void m162313X2(@Nullable Function1<? super BLivePopUp, Unit> function1) {
        this.enterRoomAction = function1;
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m162314Y2(boolean z) {
        this.isFirstStart = z;
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m162315Z2(boolean z) {
        this.fragIsShow = z;
    }

    /* JADX INFO: renamed from: a3 */
    public final void m162316a3(final BLivePopUp data) {
        dd80 dd80Var = this.dialog;
        if (dd80Var != null) {
            dd80Var.getClass();
            if (dd80Var.isShowing()) {
                return;
            }
        }
        Act act = getAct();
        if (act == null || act.isFinishing()) {
            return;
        }
        dd80 dd80VarM110989r0 = new dd80.C16336a(act.act).m110962Q(s6c0.f162670H).m110961P(true).m110989r0();
        this.dialog = dd80VarM110989r0;
        if (dd80VarM110989r0 != null) {
            dd80VarM110989r0.setCanceledOnTouchOutside(true);
        }
        dd80 dd80Var2 = this.dialog;
        View viewM110906L = dd80Var2 != null ? dd80Var2.m110906L() : null;
        viewM110906L.getClass();
        IntlGameGuideDialogView intlGameGuideDialogView = (IntlGameGuideDialogView) viewM110906L;
        intlGameGuideDialogView.m69930f(data, mo104064W2());
        intlGameGuideDialogView.setSureAction(new Function0() { // from class: l.m2n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o2n.m162308b3(this.f130931a, data);
            }
        });
        intlGameGuideDialogView.setDismissAction(new Function0() { // from class: l.n2n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o2n.m162309c3(this.f136860a);
            }
        });
    }
}
