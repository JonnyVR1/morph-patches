package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u0004J\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010\u0004J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00106\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u00109\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\"\u0010>\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010#R\"\u0010A\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m88121d2 = {"Ll/wp10;", "Ll/iam;", "Ll/cq10;", "<init>", "()V", "", "init", "presenter", Constants.INAPP_DATA_TAG, "(Ll/cq10;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "data", "j", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "", "showSeconds", "", "cnt", "k", "(IJ)V", BLiveStormDanmakuGiftResourceType.f45292l, "e", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Lv/VText;", "a", "Lv/VText;", "get_apply_title", "()Lv/VText;", "set_apply_title", "(Lv/VText;)V", "_apply_title", "Landroidx/constraintlayout/widget/Guideline;", "b", "Landroidx/constraintlayout/widget/Guideline;", "get_horizontal_line", "()Landroidx/constraintlayout/widget/Guideline;", "set_horizontal_line", "(Landroidx/constraintlayout/widget/Guideline;)V", "_horizontal_line", "get_vertical_line", "set_vertical_line", "_vertical_line", RXScreenCaptureService.KEY_INDEX, "set_reject", "_reject", "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "_divider", "f", "set_agree", "_agree", "g", "Ll/cq10;", "Ll/g4s;", "h", "Ll/g4s;", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wp10 implements iam<cq10> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _apply_title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Guideline _horizontal_line;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Guideline _vertical_line;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _reject;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _divider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _agree;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public cq10 presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public g4s dialog;

    /* JADX INFO: renamed from: a */
    public static void m207407a(wp10 wp10Var, View view) {
        cq10 cq10Var = wp10Var.presenter;
        if (cq10Var == null) {
            Intrinsics.m88391r("presenter");
            cq10Var = null;
        }
        cq10Var.m111874S3();
    }

    /* JADX INFO: renamed from: b */
    public static void m207408b(wp10 wp10Var, View view) {
        cq10 cq10Var = wp10Var.presenter;
        if (cq10Var == null) {
            Intrinsics.m88391r("presenter");
            cq10Var = null;
        }
        cq10Var.m111873R3();
    }

    private final void init() {
        if (this.dialog == null) {
            cq10 cq10Var = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(yec0.f198696A4, (ViewGroup) null);
            cq10 cq10Var2 = this.presenter;
            if (cq10Var2 == null) {
                Intrinsics.m88391r("presenter");
            } else {
                cq10Var = cq10Var2;
            }
            g4s g4sVar = new g4s(cq10Var, jgc0.f120695b, viewInflate);
            this.dialog = g4sVar;
            g4sVar.setCancelable(false);
            g4s g4sVar2 = this.dialog;
            if (g4sVar2 != null) {
                g4sVar2.setCanceledOnTouchOutside(false);
            }
            viewInflate.getClass();
            m207409c(viewInflate);
            bnl0.m105509E0(m207413i(), new View.OnClickListener() { // from class: l.up10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wp10.m207408b(this.f180207a, view);
                }
            });
            bnl0.m105509E0(m207412f(), new View.OnClickListener() { // from class: l.vp10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wp10.m207407a(this.f185205a, view);
                }
            });
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        cq10 cq10Var = this.presenter;
        if (cq10Var == null) {
            Intrinsics.m88391r("presenter");
            cq10Var = null;
        }
        return cq10Var.act();
    }

    /* JADX INFO: renamed from: c */
    public final void m207409c(View view) {
        dq10.m117439a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull cq10 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: e */
    public final void m207411e() {
        g4s g4sVar = this.dialog;
        if (g4sVar == null || !g4sVar.isShowing()) {
            return;
        }
        g4sVar.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VText m207412f() {
        VText vText = this._agree;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_agree");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VText m207413i() {
        VText vText = this._reject;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_reject");
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m207414j(@NotNull BLiveMultiCall data) {
        data.getClass();
        init();
        long j = data.showSeconds;
        int i = j > 0 ? (int) j : 60;
        cq10 cq10Var = this.presenter;
        if (cq10Var == null) {
            Intrinsics.m88391r("presenter");
            cq10Var = null;
        }
        cq10Var.m111871O3(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m207415k(int showSeconds, long cnt) {
        m207413i().setText(xau.m209911u(R$string.f48147i9, Long.valueOf(((long) showSeconds) - cnt)));
    }

    /* JADX INFO: renamed from: l */
    public final void m207416l() {
        g4s g4sVar = this.dialog;
        if (g4sVar == null || g4sVar.isShowing()) {
            return;
        }
        g4sVar.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
