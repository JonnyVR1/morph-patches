package p153l;

import android.view.View;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLivePopUp;
import com.p051p1.mobile.putong.live.external.intl.common.gameguide.IntlGameGuideDialogView;
import com.p051p1.mobile.putong.live.external.square.api.ModelData;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010,¨\u00062"}, m88121d2 = {"Ll/o4n;", "Ll/txs;", "Ll/ner;", "lifecycleProvider", "Ll/nus;", BaseSei.INFO, "<init>", "(Ll/ner;Ll/nus;)V", "", p7f.GPS_DIRECTION_TRUE, "()V", "", "W2", "()Z", "Lcom/p1/mobile/putong/live/base/data/BLivePopUp;", "data", "a3", "(Lcom/p1/mobile/putong/live/base/data/BLivePopUp;)V", "Ll/gkn;", "f", "Ll/gkn;", "T2", "()Ll/gkn;", "api", "Lkotlin/Function1;", "g", "Lkotlin/jvm/functions/Function1;", "getEnterRoomAction", "()Lkotlin/jvm/functions/Function1;", "X2", "(Lkotlin/jvm/functions/Function1;)V", "enterRoomAction", "Ll/jl80;", "h", "Ll/jl80;", "getDialog", "()Ll/jl80;", "setDialog", "(Ll/jl80;)V", OMSTemplateType.dialog, RXScreenCaptureService.KEY_INDEX, "Z", "U2", "Z2", "(Z)V", "fragIsShow", "j", "V2", "Y2", "isFirstStart", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class o4n extends txs {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final gkn api;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Function1<? super BLivePopUp, Unit> enterRoomAction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public jl80 dialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean fragIsShow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isFirstStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4n(@NotNull ner nerVar, @NotNull nus nusVar) {
        super(nerVar, nusVar);
        nerVar.getClass();
        nusVar.getClass();
        this.api = new gkn(nerVar);
        this.isFirstStart = true;
    }

    /* JADX INFO: renamed from: R2 */
    public static Unit m166062R2(o4n o4nVar, ModelData modelData) {
        modelData.getClass();
        if (modelData.isSuccess() && o4nVar.api.getResultData() != null && o4nVar.fragIsShow) {
            BLivePopUp resultData = o4nVar.api.getResultData();
            resultData.getClass();
            o4nVar.m166072a3(resultData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b3 */
    public static final Unit m166064b3(o4n o4nVar, BLivePopUp bLivePopUp) {
        jl80 jl80Var = o4nVar.dialog;
        if (jl80Var != null) {
            jl80Var.dismiss();
        }
        Function1<? super BLivePopUp, Unit> function1 = o4nVar.enterRoomAction;
        if (function1 != null) {
            function1.invoke(bLivePopUp);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c3 */
    public static final Unit m166065c3(o4n o4nVar) {
        jl80 jl80Var = o4nVar.dialog;
        if (jl80Var != null) {
            jl80Var.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        this.api.observe(new Function1() { // from class: l.l4n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o4n.m166062R2(this.f129989a, (ModelData) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: T2, reason: from getter */
    public final gkn getApi() {
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
    public boolean mo106899W2() {
        throw null;
    }

    /* JADX INFO: renamed from: X2 */
    public final void m166069X2(@Nullable Function1<? super BLivePopUp, Unit> function1) {
        this.enterRoomAction = function1;
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m166070Y2(boolean z) {
        this.isFirstStart = z;
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m166071Z2(boolean z) {
        this.fragIsShow = z;
    }

    /* JADX INFO: renamed from: a3 */
    public final void m166072a3(final BLivePopUp data) {
        jl80 jl80Var = this.dialog;
        if (jl80Var != null) {
            jl80Var.getClass();
            if (jl80Var.isShowing()) {
                return;
            }
        }
        Act act = getAct();
        if (act == null || act.isFinishing()) {
            return;
        }
        jl80 jl80VarM146049r0 = new jl80.C17971a(act.act).m146022Q(xec0.f193784H).m146021P(true).m146049r0();
        this.dialog = jl80VarM146049r0;
        if (jl80VarM146049r0 != null) {
            jl80VarM146049r0.setCanceledOnTouchOutside(true);
        }
        jl80 jl80Var2 = this.dialog;
        View viewM145966L = jl80Var2 != null ? jl80Var2.m145966L() : null;
        viewM145966L.getClass();
        IntlGameGuideDialogView intlGameGuideDialogView = (IntlGameGuideDialogView) viewM145966L;
        intlGameGuideDialogView.m71113f(data, mo106899W2());
        intlGameGuideDialogView.setSureAction(new Function0() { // from class: l.m4n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o4n.m166064b3(this.f134816a, data);
            }
        });
        intlGameGuideDialogView.setDismissAction(new Function0() { // from class: l.n4n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o4n.m166065c3(this.f140243a);
            }
        });
    }
}
