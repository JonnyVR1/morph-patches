package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundRelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\"\u00104\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010\u0018\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R\"\u0010N\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bL\u0010D\"\u0004\bM\u0010FR\"\u0010T\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010P\u001a\u0004\bH\u0010Q\"\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u0010V¨\u0006X"}, m88121d2 = {"Ll/ex60;", "Ll/q2m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "k", "(Landroid/view/View;)V", ResourceDirection.f39656v, "()V", "h", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "c", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;", "set_root_layout", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundRelativeLayout;)V", "_root_layout", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "r", "()Lv/VDraweeView;", "set_img_bg_decoration", "(Lv/VDraweeView;)V", "_img_bg_decoration", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "e", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "get_top", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;", "set_top", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundView;)V", "_top", "Lv/VFrame;", "f", "Lv/VFrame;", "get_image_container", "()Lv/VFrame;", "set_image_container", "(Lv/VFrame;)V", "_image_container", "g", "p", "set_image_container_img_bg", "_image_container_img_bg", "o", "set_image_container_img", "_image_container_img", "Lv/VImage;", RXScreenCaptureService.KEY_INDEX, "Lv/VImage;", "q", "()Lv/VImage;", "set_image_container_star_img", "(Lv/VImage;)V", "_image_container_star_img", "j", BLiveStormDanmakuGiftResourceType.f45294s, "set_peg_tag", "_peg_tag", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "u", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", BLiveStormDanmakuGiftResourceType.f45292l, "n", "set_desc_img", "_desc_img", "m", "set_desc", "_desc", "Lv/VButton;", "Lv/VButton;", "()Lv/VButton;", "set_bt", "(Lv/VButton;)V", "_bt", "Ll/pej0;", "Ll/pej0;", OMSTemplateType.dialog, "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ex60 extends q2m {

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
    public pej0 dialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex60(@NotNull Act act) {
        super(act);
        act.getClass();
    }

    /* JADX INFO: renamed from: i */
    public static void m123014i(ex60 ex60Var, View view) {
        ix60.INSTANCE.m142476h0();
        if (ex60Var.m175059g()) {
            pej0 pej0Var = ex60Var.dialog;
            if (pej0Var == null) {
                Intrinsics.m88391r(OMSTemplateType.dialog);
                pej0Var = null;
            }
            pej0Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m123015j(ex60 ex60Var, DialogInterface dialogInterface) {
        w1e.m204401e(ex60Var.m175058f());
    }

    @Override // p153l.q2m
    /* JADX INFO: renamed from: h */
    public void mo123016h() {
        pej0 pej0Var = null;
        View viewInflate = p9r.m171370a(getAct()).inflate(kec0.f125979o5, (ViewGroup) null);
        viewInflate.getClass();
        m123017k(viewInflate);
        this.dialog = m175057e(getAct(), viewInflate);
        m123028v();
        pej0 pej0Var2 = this.dialog;
        if (pej0Var2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var2 = null;
        }
        pej0Var2.show();
        pej0 pej0Var3 = this.dialog;
        if (pej0Var3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            pej0Var = pej0Var3;
        }
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.cx60
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ex60.m123015j(this.f84178a, dialogInterface);
            }
        });
        w1e.m204402f(m175058f());
    }

    /* JADX INFO: renamed from: k */
    public final void m123017k(View view) {
        fx60.m127930a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VButton m123018l() {
        VButton vButton = this._bt;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final TextView m123019m() {
        TextView textView = this._desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VImage m123020n() {
        VImage vImage = this._desc_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_desc_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VDraweeView m123021o() {
        VDraweeView vDraweeView = this._image_container_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image_container_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VDraweeView m123022p() {
        VDraweeView vDraweeView = this._image_container_img_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image_container_img_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VImage m123023q() {
        VImage vImage = this._image_container_star_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_image_container_star_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final VDraweeView m123024r() {
        VDraweeView vDraweeView = this._img_bg_decoration;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_img_bg_decoration");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VDraweeView m123025s() {
        VDraweeView vDraweeView = this._peg_tag;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_peg_tag");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final RoundRelativeLayout m123026t() {
        RoundRelativeLayout roundRelativeLayout = this._root_layout;
        if (roundRelativeLayout != null) {
            return roundRelativeLayout;
        }
        Intrinsics.m88391r("_root_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final TextView m123027u() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final void m123028v() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            bnl0.m105509E0(m123018l(), new View.OnClickListener() { // from class: l.dx60
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ex60.m123014i(this.f91071a, view);
                }
            });
            ix60 ix60Var = ix60.INSTANCE;
            ix60Var.m142441D(m123024r());
            ix60Var.m142440C(m123026t());
            ix60Var.m142464b0(m123027u());
            ix60Var.m142443F(m123020n());
            ix60Var.m142452P(m123023q());
            ix60Var.m142442E(m123019m(), m123018l(), getAct());
            ix60Var.m142445H(m123022p(), ix60Var.m142467d(), qa00.m175859d(330.0f), qa00.m175859d(382.0f));
            ix60Var.m142446I(m123021o(), userM116600p9.isFemale());
            ix60.m142435K(ix60Var, m123025s(), userM116600p9.isFemale(), false, 4, null);
        }
    }
}
