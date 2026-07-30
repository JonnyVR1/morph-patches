package p153l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\fR\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010W\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00103\u001a\u0004\bU\u00105\"\u0004\bV\u00107R\"\u0010[\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u00103\u001a\u0004\bY\u00105\"\u0004\bZ\u00107R\"\u0010_\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u00103\u001a\u0004\b]\u00105\"\u0004\b^\u00107¨\u0006`"}, m88121d2 = {"Ll/dls;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/xls;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/xls;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "J", "(Landroid/view/View;)V", "m", "r", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", BaseSei.INFO, "U", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/view/View;", "P", "()Landroid/view/View;", "set_shadow", "_shadow", "L", "set_bg", "_bg", "Landroid/widget/ImageView;", "n", "Landroid/widget/ImageView;", "M", "()Landroid/widget/ImageView;", "set_bg_img", "(Landroid/widget/ImageView;)V", "_bg_img", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_title_layout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_title_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_title_layout", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", p7f.GPS_DIRECTION_TRUE, "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", p7f.LATITUDE_SOUTH, "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", "K", "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VDraweeView;", BloodType.f39576O, "()Lv/VDraweeView;", "set_gift_tray_bg", "(Lv/VDraweeView;)V", "_gift_tray_bg", Constants.KEY_T, "R", "set_skin_img", "_skin_img", "u", "get_skin_title", "set_skin_title", "_skin_title", ResourceDirection.f39656v, "Q", "set_skin_describe", "_skin_describe", "w", "N", "set_bt", "_bt", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dls extends LiveMenuDialogHolder<xls> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public View _shadow;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public ImageView _bg_img;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public ConstraintLayout _title_layout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _back;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VDraweeView _gift_tray_bg;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VDraweeView _skin_img;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public TextView _skin_title;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public TextView _skin_describe;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TextView _bt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dls(@NotNull Act act, @NotNull xls xlsVar) {
        super(yec0.f199330z1, act, xlsVar);
        act.getClass();
        xlsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m116846F(dls dlsVar, View view) {
        ((xls) dlsVar.f48605b).m211678V3(false);
        ((xls) dlsVar.f48605b).m213811F2().LiveGiftSkinEventGroup.showGiftSkinList().m199277p();
    }

    /* JADX INFO: renamed from: G */
    public static void m116847G(dls dlsVar, View view) {
        dlsVar.mo73021p();
    }

    /* JADX INFO: renamed from: H */
    public static void m116848H(dls dlsVar, View view) {
        ((xls) dlsVar.f48605b).m211678V3(true);
        ((xls) dlsVar.f48605b).m213811F2().LiveGiftSkinEventGroup.showGiftSkinList().m199277p();
    }

    /* JADX INFO: renamed from: I */
    public static void m116849I(dls dlsVar, View view) {
        dlsVar.mo73021p();
    }

    /* JADX INFO: renamed from: J */
    public final void m116850J(View view) {
        els.m121256a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VImage m116851K() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final View m116852L() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final ImageView m116853M() {
        ImageView imageView = this._bg_img;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final TextView m116854N() {
        TextView textView = this._bt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VDraweeView m116855O() {
        VDraweeView vDraweeView = this._gift_tray_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_gift_tray_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final View m116856P() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final TextView m116857Q() {
        TextView textView = this._skin_describe;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_skin_describe");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VDraweeView m116858R() {
        VDraweeView vDraweeView = this._skin_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_skin_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m116859S() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final TextView m116860T() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: U */
    public final void m116861U(@NotNull BLiveNewGiftSkin info) {
        info.getClass();
        m116860T().setText(info.name);
        m116859S().setText(info.expiredText);
        m116857Q().setText(info.describe);
        izs.m142868s("context_livingAct", m116858R(), info.icon);
        izs.m142868s("context_livingAct", m116855O(), "https://static.tancdn.com/pe-webplatform/01aOcaf4kRhZq0EjNlvNPnJh.png");
        m116854N().setEnabled(false);
        String str = info.status;
        int iHashCode = str.hashCode();
        if (iHashCode == -1097452790) {
            if (str.equals("locked")) {
                m116854N().setTextColor(n3d0.m161277a(n9c0.f140838j1));
                m116854N().setBackground(n3d0.m161279c("#0DFFFFFF", 10));
                m116854N().setEnabled(false);
                m116854N().setText("未获得");
                return;
            }
            return;
        }
        if (iHashCode == -210949405) {
            if (str.equals("unlocked")) {
                m116854N().setEnabled(true);
                m116854N().setText("穿戴");
                m116854N().setBackground(n3d0.m161279c("#FE7E1D", 10));
                m116854N().setTextColor(n3d0.m161277a(n9c0.f140877w1));
                bnl0.m105509E0(m116854N(), new View.OnClickListener() { // from class: l.bls
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dls.m116848H(this.f77209a, view);
                    }
                });
                return;
            }
            return;
        }
        if (iHashCode == 588913375 && str.equals("equipped")) {
            m116854N().setEnabled(true);
            m116854N().setText("卸下");
            m116854N().setBackground(n3d0.m161279c("#0DFFFFFF", 10));
            m116854N().setTextColor(n3d0.m161277a(n9c0.f140877w1));
            bnl0.m105509E0(m116854N(), new View.OnClickListener() { // from class: l.cls
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dls.m116846F(this.f82426a, view);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m116850J(view);
        m116862r();
    }

    /* JADX INFO: renamed from: r */
    public final void m116862r() {
        View viewM116852L = m116852L();
        int i = qa00.f156330q;
        qnp0.m177260c1(viewM116852L, 0, 0, 0, -i, i);
        qnp0.m177260c1(m116853M(), 0, 0, 0, -i, i);
        bnl0.m105509E0(m116851K(), new View.OnClickListener() { // from class: l.zks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dls.m116849I(this.f204856a, view);
            }
        });
        bnl0.m105509E0(m116856P(), new View.OnClickListener() { // from class: l.als
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dls.m116847G(this.f72152a, view);
            }
        });
    }
}
