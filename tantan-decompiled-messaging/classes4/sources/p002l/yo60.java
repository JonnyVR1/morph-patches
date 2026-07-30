package p002l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundRelativeLayout;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.f6c0;
import l.i0e;
import l.l5j0;
import l.o7r;
import l.t100;
import l.xdl0;
import l.zo60;
import org.jetbrains.annotations.NotNull;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\"\u00104\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010\u0018\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R\"\u0010N\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bL\u0010D\"\u0004\bM\u0010FR\"\u0010T\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010P\u001a\u0004\bH\u0010Q\"\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u0010V¨\u0006X"}, d2 = {"Ll/yo60;", "Ll/wzl;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", "view", "", "k", "(Landroid/view/View;)V", "v", "()V", "h", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "t", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;)V", "_root_layout", "Lv/VDraweeView;", "d", "Lv/VDraweeView;", "r", "()Lv/VDraweeView;", "set_img_bg_decoration", "(Lv/VDraweeView;)V", "_img_bg_decoration", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "e", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "get_top", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "set_top", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;)V", "_top", "Lv/VFrame;", "f", "Lv/VFrame;", "get_image_container", "()Lv/VFrame;", "set_image_container", "(Lv/VFrame;)V", "_image_container", "g", "p", "set_image_container_img_bg", "_image_container_img_bg", "o", "set_image_container_img", "_image_container_img", "Lv/VImage;", "i", "Lv/VImage;", "q", "()Lv/VImage;", "set_image_container_star_img", "(Lv/VImage;)V", "_image_container_star_img", "j", "s", "set_peg_tag", "_peg_tag", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "l", "n", "set_desc_img", "_desc_img", "m", "set_desc", "_desc", "Lv/VButton;", "Lv/VButton;", "()Lv/VButton;", "set_bt", "(Lv/VButton;)V", "_bt", "Ll/l5j0;", "Ll/l5j0;", "dialog", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yo60 extends wzl {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public RoundRelativeLayout _root_layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _img_bg_decoration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public RoundView _top;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VFrame _image_container;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _image_container_img_bg;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VDraweeView _image_container_img;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _image_container_star_img;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VDraweeView _peg_tag;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VImage _desc_img;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VButton _bt;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo60(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: i */
    public static void m26826i(yo60 yo60Var, View view) {
        cp60.INSTANCE.m11250h0();
        if (yo60Var.m25563g()) {
            l5j0 l5j0Var = yo60Var.dialog;
            if (l5j0Var == null) {
                Intrinsics.r("dialog");
                l5j0Var = null;
            }
            l5j0Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m26827j(yo60 yo60Var, DialogInterface dialogInterface) {
        i0e.e(yo60Var.m25562f());
    }

    @Override // p002l.wzl
    /* JADX INFO: renamed from: h */
    public void mo16142h() {
        Dialog dialog = null;
        View viewInflate = o7r.a(getAct()).inflate(f6c0.n5, (ViewGroup) null);
        viewInflate.getClass();
        m26828k(viewInflate);
        this.dialog = m25561e(getAct(), viewInflate);
        m26839v();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
            dialog2 = null;
        }
        dialog2.show();
        Dialog dialog3 = this.dialog;
        if (dialog3 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog3;
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wo60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yo60.m26827j(this.f21887a, dialogInterface);
            }
        });
        i0e.f(m25562f());
    }

    /* JADX INFO: renamed from: k */
    public final void m26828k(View view) {
        zo60.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VButton m26829l() {
        VButton vButton = this._bt;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final TextView m26830m() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VImage m26831n() {
        VImage vImage = this._desc_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_desc_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VDraweeView m26832o() {
        VDraweeView vDraweeView = this._image_container_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image_container_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m26833p() {
        VDraweeView vDraweeView = this._image_container_img_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image_container_img_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VImage m26834q() {
        VImage vImage = this._image_container_star_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_image_container_star_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final VDraweeView m26835r() {
        VDraweeView vDraweeView = this._img_bg_decoration;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_img_bg_decoration");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m26836s() {
        VDraweeView vDraweeView = this._peg_tag;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_peg_tag");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final RoundRelativeLayout m26837t() {
        RoundRelativeLayout roundRelativeLayout = this._root_layout;
        if (roundRelativeLayout != null) {
            return roundRelativeLayout;
        }
        Intrinsics.r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m26838u() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m26839v() {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            xdl0.E0(m26829l(), new View.OnClickListener() { // from class: l.xo60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yo60.m26826i(this.f22384a, view);
                }
            });
            cp60 cp60Var = cp60.INSTANCE;
            cp60Var.m11215D(m26835r());
            cp60Var.m11214C(m26837t());
            cp60Var.m11238b0(m26838u());
            cp60Var.m11217F(m26831n());
            cp60Var.m11226P(m26834q());
            cp60Var.m11216E(m26830m(), m26829l(), getAct());
            cp60Var.m11219H(m26833p(), cp60Var.m11241d(), t100.d(330.0f), t100.d(382.0f));
            cp60Var.m11220I(m26832o(), userP9.isFemale());
            cp60.m11209K(cp60Var, m26836s(), userP9.isFemale(), false, 4, null);
        }
    }
}
