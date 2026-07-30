package p002l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftSkin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.hxs;
import l.kvc0;
import l.mep0;
import l.t100;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\fR\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020H8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010W\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u00103\u001a\u0004\bU\u00105\"\u0004\bV\u00107R\"\u0010[\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u00103\u001a\u0004\bY\u00105\"\u0004\bZ\u00107R\"\u0010_\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u00103\u001a\u0004\b]\u00105\"\u0004\b^\u00107¨\u0006`"}, d2 = {"Ll/cjs;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/wjs;", "Lcom/p1/mobile/android/app/Act;", "act", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/wjs;)V", "Landroid/view/View;", "view", "", "J", "(Landroid/view/View;)V", "m", "r", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;", "info", "U", "(Lcom/p1/mobile/putong/live/base/data/BLiveNewGiftSkin;)V", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "l", "Landroid/view/View;", "P", "()Landroid/view/View;", "set_shadow", "_shadow", "L", "set_bg", "_bg", "Landroid/widget/ImageView;", "n", "Landroid/widget/ImageView;", "M", "()Landroid/widget/ImageView;", "set_bg_img", "(Landroid/widget/ImageView;)V", "_bg_img", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_title_layout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_title_layout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_title_layout", "Landroid/widget/TextView;", "p", "Landroid/widget/TextView;", "T", "()Landroid/widget/TextView;", "set_title", "(Landroid/widget/TextView;)V", "_title", "Lv/VText;", "q", "Lv/VText;", "S", "()Lv/VText;", "set_sub_title", "(Lv/VText;)V", "_sub_title", "Lv/VImage;", "Lv/VImage;", "K", "()Lv/VImage;", "set_back", "(Lv/VImage;)V", "_back", "Lv/VDraweeView;", "s", "Lv/VDraweeView;", "O", "()Lv/VDraweeView;", "set_gift_tray_bg", "(Lv/VDraweeView;)V", "_gift_tray_bg", "t", "R", "set_skin_img", "_skin_img", "u", "get_skin_title", "set_skin_title", "_skin_title", "v", "Q", "set_skin_describe", "_skin_describe", "w", "N", "set_bt", "_bt", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cjs extends LiveMenuDialogHolder<wjs> {

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
    public cjs(@NotNull Act act, @NotNull wjs wjsVar) {
        super(t6c0.f20094z1, act, wjsVar);
        act.getClass();
        wjsVar.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m11063F(cjs cjsVar, View view) {
        ((wjs) cjsVar.f3799b).m24683V3(false);
        ((wjs) cjsVar.f3799b).m25548F2().LiveGiftSkinEventGroup.showGiftSkinList().p();
    }

    /* JADX INFO: renamed from: G */
    public static void m11064G(cjs cjsVar, View view) {
        cjsVar.mo5216p();
    }

    /* JADX INFO: renamed from: H */
    public static void m11065H(cjs cjsVar, View view) {
        ((wjs) cjsVar.f3799b).m24683V3(true);
        ((wjs) cjsVar.f3799b).m25548F2().LiveGiftSkinEventGroup.showGiftSkinList().p();
    }

    /* JADX INFO: renamed from: I */
    public static void m11066I(cjs cjsVar, View view) {
        cjsVar.mo5216p();
    }

    /* JADX INFO: renamed from: J */
    public final void m11067J(View view) {
        djs.m11923a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VImage m11068K() {
        VImage vImage = this._back;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final View m11069L() {
        View view = this._bg;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final ImageView m11070M() {
        ImageView imageView = this._bg_img;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_bg_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final TextView m11071N() {
        TextView textView = this._bt;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_bt");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VDraweeView m11072O() {
        VDraweeView vDraweeView = this._gift_tray_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_gift_tray_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final View m11073P() {
        View view = this._shadow;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_shadow");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final TextView m11074Q() {
        TextView textView = this._skin_describe;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_skin_describe");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final VDraweeView m11075R() {
        VDraweeView vDraweeView = this._skin_img;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_skin_img");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final VText m11076S() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final TextView m11077T() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: U */
    public final void m11078U(@NotNull BLiveNewGiftSkin info) {
        info.getClass();
        m11077T().setText(info.name);
        m11076S().setText(info.expiredText);
        m11074Q().setText(info.describe);
        hxs.s("context_livingAct", m11075R(), info.icon);
        hxs.s("context_livingAct", m11072O(), "https://static.tancdn.com/pe-webplatform/01aOcaf4kRhZq0EjNlvNPnJh.png");
        m11071N().setEnabled(false);
        String str = info.status;
        int iHashCode = str.hashCode();
        if (iHashCode == -1097452790) {
            if (str.equals("locked")) {
                m11071N().setTextColor(kvc0.a(h1c0.f11797j1));
                m11071N().setBackground(kvc0.c("#0DFFFFFF", 10));
                m11071N().setEnabled(false);
                m11071N().setText("未获得");
                return;
            }
            return;
        }
        if (iHashCode == -210949405) {
            if (str.equals("unlocked")) {
                m11071N().setEnabled(true);
                m11071N().setText("穿戴");
                m11071N().setBackground(kvc0.c("#FE7E1D", 10));
                m11071N().setTextColor(kvc0.a(h1c0.f11836w1));
                xdl0.E0(m11071N(), new View.OnClickListener() { // from class: l.ajs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        cjs.m11065H(this.f7662a, view);
                    }
                });
                return;
            }
            return;
        }
        if (iHashCode == 588913375 && str.equals("equipped")) {
            m11071N().setEnabled(true);
            m11071N().setText("卸下");
            m11071N().setBackground(kvc0.c("#0DFFFFFF", 10));
            m11071N().setTextColor(kvc0.a(h1c0.f11836w1));
            xdl0.E0(m11071N(), new View.OnClickListener() { // from class: l.bjs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cjs.m11063F(this.f8188a, view);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(@NotNull View view) {
        view.getClass();
        super.mo5214m(view);
        m11067J(view);
        m11079r();
    }

    /* JADX INFO: renamed from: r */
    public final void m11079r() {
        View viewM11069L = m11069L();
        int i = t100.q;
        mep0.c1(viewM11069L, 0, 0, 0, -i, i);
        mep0.c1(m11070M(), 0, 0, 0, -i, i);
        xdl0.E0(m11068K(), new View.OnClickListener() { // from class: l.yis
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cjs.m11066I(this.f22912a, view);
            }
        });
        xdl0.E0(m11073P(), new View.OnClickListener() { // from class: l.zis
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cjs.m11064G(this.f23444a, view);
            }
        });
    }
}
