package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u0004J\r\u0010 \u001a\u00020\u0005¢\u0006\u0004\b \u0010\u0004J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00106\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u00109\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R\"\u0010>\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010#R\"\u0010A\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m87232d2 = {"Ll/mh10;", "Ll/s7m;", "Ll/sh10;", "<init>", "()V", "", "init", "presenter", Constants.INAPP_DATA_TAG, "(Ll/sh10;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "data", "j", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;)V", "", "showSeconds", "", "cnt", "k", "(IJ)V", BLiveStormDanmakuGiftResourceType.f44444l, "e", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Lv/VText;", "a", "Lv/VText;", "get_apply_title", "()Lv/VText;", "set_apply_title", "(Lv/VText;)V", "_apply_title", "Landroidx/constraintlayout/widget/Guideline;", "b", "Landroidx/constraintlayout/widget/Guideline;", "get_horizontal_line", "()Landroidx/constraintlayout/widget/Guideline;", "set_horizontal_line", "(Landroidx/constraintlayout/widget/Guideline;)V", "_horizontal_line", "get_vertical_line", "set_vertical_line", "_vertical_line", RXScreenCaptureService.KEY_INDEX, "set_reject", "_reject", "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "_divider", "f", "set_agree", "_agree", "g", "Ll/sh10;", "Ll/f2s;", "h", "Ll/f2s;", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mh10 implements s7m<sh10> {

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
    public sh10 presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public f2s dialog;

    /* JADX INFO: renamed from: a */
    public static void m154599a(mh10 mh10Var, View view) {
        sh10 sh10Var = mh10Var.presenter;
        if (sh10Var == null) {
            Intrinsics.m87502r("presenter");
            sh10Var = null;
        }
        sh10Var.m184151S3();
    }

    /* JADX INFO: renamed from: b */
    public static void m154600b(mh10 mh10Var, View view) {
        sh10 sh10Var = mh10Var.presenter;
        if (sh10Var == null) {
            Intrinsics.m87502r("presenter");
            sh10Var = null;
        }
        sh10Var.m184150R3();
    }

    private final void init() {
        if (this.dialog == null) {
            sh10 sh10Var = null;
            View viewInflate = LayoutInflater.from(getContext()).inflate(t6c0.f167964A4, (ViewGroup) null);
            sh10 sh10Var2 = this.presenter;
            if (sh10Var2 == null) {
                Intrinsics.m87502r("presenter");
            } else {
                sh10Var = sh10Var2;
            }
            f2s f2sVar = new f2s(sh10Var, d8c0.f84847b, viewInflate);
            this.dialog = f2sVar;
            f2sVar.setCancelable(false);
            f2s f2sVar2 = this.dialog;
            if (f2sVar2 != null) {
                f2sVar2.setCanceledOnTouchOutside(false);
            }
            viewInflate.getClass();
            m154601c(viewInflate);
            xdl0.m208329E0(m154605i(), new View.OnClickListener() { // from class: l.kh10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mh10.m154600b(this.f123113a, view);
                }
            });
            xdl0.m208329E0(m154604f(), new View.OnClickListener() { // from class: l.lh10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mh10.m154599a(this.f128030a, view);
                }
            });
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        sh10 sh10Var = this.presenter;
        if (sh10Var == null) {
            Intrinsics.m87502r("presenter");
            sh10Var = null;
        }
        return sh10Var.act();
    }

    /* JADX INFO: renamed from: c */
    public final void m154601c(View view) {
        th10.m188843a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull sh10 presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: e */
    public final void m154603e() {
        f2s f2sVar = this.dialog;
        if (f2sVar == null || !f2sVar.isShowing()) {
            return;
        }
        f2sVar.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VText m154604f() {
        VText vText = this._agree;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_agree");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VText m154605i() {
        VText vText = this._reject;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_reject");
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m154606j(@NotNull BLiveMultiCall data) {
        data.getClass();
        init();
        long j = data.showSeconds;
        int i = j > 0 ? (int) j : 60;
        sh10 sh10Var = this.presenter;
        if (sh10Var == null) {
            Intrinsics.m87502r("presenter");
            sh10Var = null;
        }
        sh10Var.m184148O3(i);
    }

    /* JADX INFO: renamed from: k */
    public final void m154607k(int showSeconds, long cnt) {
        m154605i().setText(w8u.m202218u(R$string.f47299i9, Long.valueOf(((long) showSeconds) - cnt)));
    }

    /* JADX INFO: renamed from: l */
    public final void m154608l() {
        f2s f2sVar = this.dialog;
        if (f2sVar == null || f2sVar.isShowing()) {
            return;
        }
        f2sVar.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
