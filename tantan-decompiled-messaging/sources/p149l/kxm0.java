package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0004J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00102\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R\"\u00105\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, m87232d2 = {"Ll/kxm0;", "Ll/s7m;", "Ll/fxm0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "f", "(Ll/fxm0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "p", RXScreenCaptureService.KEY_INDEX, "n", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "m", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "b", "k", "set_container", "_container", "Lv/VText;", "c", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", Constants.INAPP_DATA_TAG, "get_info", "set_info", "_info", BLiveStormDanmakuGiftResourceType.f44444l, "set_create_btn", "_create_btn", "j", "set_close_btn", "_close_btn", "g", "Ll/fxm0;", "Ll/byr;", "h", "Ll/byr;", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kxm0 implements s7m<fxm0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ConstraintLayout _container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _info;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _create_btn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _close_btn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public fxm0 presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public byr dialog;

    /* JADX INFO: renamed from: a */
    public static Unit m147791a(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m147792b(kxm0 kxm0Var, View view) {
        view.getClass();
        fxm0 fxm0Var = kxm0Var.presenter;
        if (fxm0Var != null) {
            fxm0Var.m123640M3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m147793c(kxm0 kxm0Var, View view) {
        view.getClass();
        kxm0Var.m147797i();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m147794d(kxm0 kxm0Var, View view) {
        view.getClass();
        kxm0Var.m147797i();
        return Unit.INSTANCE;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        fxm0 fxm0Var = this.presenter;
        if (fxm0Var != null) {
            return fxm0Var.act();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m147795e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM152074b = lxm0.m152074b(this, inflater, parent);
        viewM152074b.getClass();
        return viewM152074b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable fxm0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: i */
    public final void m147797i() {
        uep0.m193327n(this.dialog);
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VText m147798j() {
        VText vText = this._close_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_close_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ConstraintLayout m147799k() {
        ConstraintLayout constraintLayout = this._container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m147800l() {
        VText vText = this._create_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_create_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ConstraintLayout m147801m() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m147802n() {
        cxq.m109105c(m147801m(), new Function1() { // from class: l.gxm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kxm0.m147793c(this.f104907a, (View) obj);
            }
        });
        cxq.m109105c(m147799k(), new Function1() { // from class: l.hxm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kxm0.m147791a((View) obj);
            }
        });
        cxq.m109105c(m147800l(), new Function1() { // from class: l.ixm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kxm0.m147792b(this.f115377a, (View) obj);
            }
        });
        cxq.m109105c(m147798j(), new Function1() { // from class: l.jxm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kxm0.m147794d(this.f120235a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m147803p() {
        Act act;
        if (this.dialog == null && (act = act()) != null) {
            LayoutInflater layoutInflaterInflater = act.inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new byr(this.presenter, m147795e(layoutInflaterInflater, null));
            m147802n();
        }
        byr byrVar = this.dialog;
        if (byrVar != null) {
            byrVar.show();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
