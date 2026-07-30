package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0004J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0004R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010/\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\"\u00102\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R\"\u00105\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, m88121d2 = {"Ll/o6n0;", "Ll/iam;", "Ll/j6n0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "e", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "f", "(Ll/j6n0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "p", RXScreenCaptureService.KEY_INDEX, "n", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "Landroidx/constraintlayout/widget/ConstraintLayout;", "m", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "b", "k", "set_container", "_container", "Lv/VText;", "c", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", Constants.INAPP_DATA_TAG, "get_info", "set_info", "_info", BLiveStormDanmakuGiftResourceType.f45292l, "set_create_btn", "_create_btn", "j", "set_close_btn", "_close_btn", "g", "Ll/j6n0;", "Ll/c0s;", "h", "Ll/c0s;", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class o6n0 implements iam<j6n0> {

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
    public j6n0 presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public c0s dialog;

    /* JADX INFO: renamed from: a */
    public static Unit m166266a(View view) {
        view.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m166267b(o6n0 o6n0Var, View view) {
        view.getClass();
        j6n0 j6n0Var = o6n0Var.presenter;
        if (j6n0Var != null) {
            j6n0Var.m143676M3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m166268c(o6n0 o6n0Var, View view) {
        view.getClass();
        o6n0Var.m166272i();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m166269d(o6n0 o6n0Var, View view) {
        view.getClass();
        o6n0Var.m166272i();
        return Unit.INSTANCE;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        j6n0 j6n0Var = this.presenter;
        if (j6n0Var != null) {
            return j6n0Var.act();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final View m166270e(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM170916b = p6n0.m170916b(this, inflater, parent);
        viewM170916b.getClass();
        return viewM170916b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable j6n0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: i */
    public final void m166272i() {
        ynp0.m216937n(this.dialog);
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VText m166273j() {
        VText vText = this._close_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_close_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final ConstraintLayout m166274k() {
        ConstraintLayout constraintLayout = this._container;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m166275l() {
        VText vText = this._create_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_create_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final ConstraintLayout m166276m() {
        ConstraintLayout constraintLayout = this._root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m166277n() {
        czq.m113347c(m166276m(), new Function1() { // from class: l.k6n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o6n0.m166268c(this.f124193a, (View) obj);
            }
        });
        czq.m113347c(m166274k(), new Function1() { // from class: l.l6n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o6n0.m166266a((View) obj);
            }
        });
        czq.m113347c(m166275l(), new Function1() { // from class: l.m6n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o6n0.m166267b(this.f135017a, (View) obj);
            }
        });
        czq.m113347c(m166273j(), new Function1() { // from class: l.n6n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o6n0.m166269d(this.f140477a, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m166278p() {
        Act act;
        if (this.dialog == null && (act = act()) != null) {
            LayoutInflater layoutInflaterInflater = act.inflater();
            layoutInflaterInflater.getClass();
            this.dialog = new c0s(this.presenter, m166270e(layoutInflaterInflater, null));
            m166277n();
        }
        c0s c0sVar = this.dialog;
        if (c0sVar != null) {
            c0sVar.show();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
