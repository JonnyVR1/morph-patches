package p153l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8021d;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class r7j extends em2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m180147o(th0[] th0VarArr, View view) {
        th0 th0Var = th0VarArr[0];
        if (th0Var == null) {
            return;
        }
        th0Var.m191137c();
        th0VarArr[0] = null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m180148p(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m180151s(ProfileListFrag profileListFrag) {
        profileListFrag.mo52306o();
        profileListFrag.f34463A4 = true;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m180153u(x20 x20Var, th0[] th0VarArr, View view) {
        x20Var.call();
        th0 th0Var = th0VarArr[0];
        if (th0Var == null) {
            return;
        }
        th0Var.m191137c();
        th0VarArr[0] = null;
    }

    /* JADX INFO: renamed from: A */
    public final void m180155A(VDraweeView vDraweeView, Media media) {
        bnl0.m105525M0(vDraweeView, true);
        Picture pictureCover = media instanceof Video ? media.cover() : (Picture) media;
        if (pictureCover == null || TEnum.equals(pictureCover.status, "raw") || TextUtils.isEmpty(pictureCover.url)) {
            return;
        }
        uqb0.f180374G.m127125Q0(vDraweeView, pictureCover.calculatedWidth(qa00.f156294G));
    }

    /* JADX INFO: renamed from: B */
    public final void m180156B(Act act) {
        if (CoreModule.f18264c.f20381e0.m116600p9().isJailedOrRestrict()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.m30932N().isPostingMoment()) {
                return;
            }
            CoreModule.m30932N().mo61482Nr(act, jyb.m147507f0(new Media[0]), true, "other", luh.m155932d(), luh.m155933e(), null);
        }
    }

    @Override // p153l.em2
    /* JADX INFO: renamed from: c */
    public void mo96365c(C8021d c8021d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo96365c(c8021d, view, frameLayout, i, context);
        if (view instanceof CardBottomMomentLayout) {
            CardBottomMomentLayout cardBottomMomentLayout = (CardBottomMomentLayout) view;
            m121321k(cardBottomMomentLayout.f24299c, c8021d, i);
            if (CoreModule.m30932N().mo61577u6()) {
                int childCount = cardBottomMomentLayout.f24301e.getChildCount();
                skq0 skq0VarMo61461Gk = null;
                for (int i2 = 0; i2 < childCount; i2++) {
                    KeyEvent.Callback childAt = cardBottomMomentLayout.f24301e.getChildAt(i2);
                    if (childAt instanceof skq0) {
                        skq0VarMo61461Gk = (skq0) childAt;
                    }
                }
                if (skq0VarMo61461Gk == null) {
                    skq0VarMo61461Gk = CoreModule.m30932N().mo61461Gk((Act) context, "p_suggest_users_home_view");
                    cardBottomMomentLayout.f24301e.addView(skq0VarMo61461Gk.getView());
                    bnl0.m105538V(skq0VarMo61461Gk.getView(), qa00.m175859d(4.0f));
                }
                skq0VarMo61461Gk.mo65606b(c8021d.getUser(), CoreModule.m30932N().mo61483Ns());
            }
            bnl0.m105524M(cardBottomMomentLayout.f24303g, true);
            bnl0.m105524M(cardBottomMomentLayout.f24308l, false);
            bnl0.m105525M0(cardBottomMomentLayout.f24304h, false);
            bnl0.m105525M0(cardBottomMomentLayout.f24305i, false);
            bnl0.m105525M0(cardBottomMomentLayout.f24306j, false);
            bnl0.m105525M0(cardBottomMomentLayout.f24307k, false);
            ArrayList arrayListM147522n = jyb.m147522n(c8021d.getUserInfo().userMedia, new qcj() { // from class: l.j7j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Media media = (Media) obj;
                    return Boolean.valueOf((media instanceof Picture) || (media instanceof Video));
                }
            });
            if (arrayListM147522n.size() > 0) {
                m180155A(cardBottomMomentLayout.f24304h, (Media) arrayListM147522n.get(0));
            }
            if (arrayListM147522n.size() > 1) {
                m180155A(cardBottomMomentLayout.f24305i, (Media) arrayListM147522n.get(1));
            }
            if (arrayListM147522n.size() > 2) {
                m180155A(cardBottomMomentLayout.f24306j, (Media) arrayListM147522n.get(2));
            }
            if (arrayListM147522n.size() > 3) {
                m180155A(cardBottomMomentLayout.f24307k, (Media) arrayListM147522n.get(3));
                bnl0.m105539W(view, qa00.f156292E);
            }
            if (CoreModule.m30932N().mo61495Rc() && jyb.m147479J(arrayListM147522n)) {
                bnl0.m105524M(cardBottomMomentLayout.f24303g, false);
                bnl0.m105524M(cardBottomMomentLayout.f24308l, true);
                cardBottomMomentLayout.f24310n.setTypeface(null, 1);
                cardBottomMomentLayout.f24311o.setText(luh.m155931c());
                cardBottomMomentLayout.f24310n.setText(luh.m155930b());
                m180157w(c8021d, cardBottomMomentLayout.f24308l, context);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m180157w(C8021d c8021d, View view, final Context context) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.m7j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f135082a.m180158x(context, view2);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m180158x(Context context, View view) {
        luh.m155929a(luh.m155932d(), luh.m155931c(), "p_edit_profile_view");
        Act act = (Act) context;
        Frag frag = (Frag) act.fragmentManager().m2555h0(R.id.content);
        if (frag instanceof ProfileListFrag) {
            final ProfileListFrag profileListFrag = (ProfileListFrag) frag;
            if (NullChecker.m82486a(profileListFrag.m53315N8())) {
                m180160z(act, new x20() { // from class: l.n7j
                    @Override // p153l.x20
                    public final void call() {
                        r7j.m180151s(profileListFrag);
                    }
                });
                return;
            }
        }
        m180156B(act);
    }

    @Override // p153l.qql
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public boolean mo96364a(C8021d c8021d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c8021d.getUser() != null && c8021d.getUserInfo() != null) {
            if (CoreModule.m30932N().mo61495Rc() && c8021d.m38486k() && (jyb.m147479J(c8021d.getUserInfo().userMedia) || jyb.m147529r(c8021d.getUserInfo().userMedia, new qcj() { // from class: l.k7j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Media media = (Media) obj;
                    return Boolean.valueOf((media instanceof Picture) || (media instanceof Video));
                }
            }) == null)) {
                return true;
            }
            if (!jyb.m147479J(c8021d.getUserInfo().userMedia) && NullChecker.m82486a(jyb.m147529r(c8021d.getUserInfo().userMedia, new qcj() { // from class: l.l7j
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    Media media = (Media) obj;
                    return Boolean.valueOf((media instanceof Picture) || (media instanceof Video));
                }
            }))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final void m180160z(Act act, final x20 x20Var) {
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j("当前有还未保存的资料，点击保存后可直接跳转动态发布").m191160s("资料尚未保存").m191158q(R$string.f19693u).m191156o(new View.OnClickListener() { // from class: l.o7j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r7j.m180153u(x20Var, th0VarArr, view);
            }
        }).m191146e(R$string.f19138c).m191154m(new DialogInterface.OnDismissListener() { // from class: l.p7j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                r7j.m180148p(dialogInterface);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.q7j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r7j.m180147o(th0VarArr, view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        final th0[] th0VarArr = {th0VarM191142a};
        th0VarM191142a.m191141g();
    }
}
