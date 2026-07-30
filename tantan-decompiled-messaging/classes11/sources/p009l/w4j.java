package p009l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0034d;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.nbq0;
import l.qib0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class w4j extends wl2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m23887o(xh0[] xh0VarArr, View view) {
        xh0 xh0Var = xh0VarArr[0];
        if (xh0Var == null) {
            return;
        }
        xh0Var.c();
        xh0VarArr[0] = null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m23888p(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m23891s(ProfileListFrag profileListFrag) {
        profileListFrag.o();
        profileListFrag.A4 = true;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m23893u(d30 d30Var, xh0[] xh0VarArr, View view) {
        d30Var.call();
        xh0 xh0Var = xh0VarArr[0];
        if (xh0Var == null) {
            return;
        }
        xh0Var.c();
        xh0VarArr[0] = null;
    }

    /* JADX INFO: renamed from: A */
    public final void m23895A(VDraweeView vDraweeView, Media media) {
        xdl0.M0(vDraweeView, true);
        Picture pictureCover = media instanceof Video ? media.cover() : (Picture) media;
        if (pictureCover == null || TEnum.equals(((Media) pictureCover).status, "raw") || TextUtils.isEmpty(((Media) pictureCover).url)) {
            return;
        }
        qib0.G.Q0(vDraweeView, pictureCover.calculatedWidth(t100.G));
    }

    /* JADX INFO: renamed from: B */
    public final void m23896B(Act act) {
        if (CoreModule.c.e0.p9().isJailedOrRestrict()) {
            CoreModule.K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.N().isPostingMoment()) {
                return;
            }
            CoreModule.N().Nr(act, vwb.f0(new Media[0]), true, "other", wsh.m24532d(), wsh.m24533e(), (String) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.wl2
    /* JADX INFO: renamed from: c */
    public void mo11838c(C0034d c0034d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo11838c(c0034d, view, frameLayout, i, context);
        if (view instanceof CardBottomMomentLayout) {
            CardBottomMomentLayout cardBottomMomentLayout = (CardBottomMomentLayout) view;
            m24310k(cardBottomMomentLayout.f2335c, c0034d, i);
            if (CoreModule.N().u6()) {
                int childCount = cardBottomMomentLayout.f2337e.getChildCount();
                nbq0 nbq0VarGk = null;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = cardBottomMomentLayout.f2337e.getChildAt(i2);
                    if (childAt instanceof nbq0) {
                        nbq0VarGk = (nbq0) childAt;
                    }
                }
                if (nbq0VarGk == null) {
                    nbq0VarGk = CoreModule.N().Gk((Act) context, "p_suggest_users_home_view");
                    cardBottomMomentLayout.f2337e.addView(nbq0VarGk.getView());
                    xdl0.V(nbq0VarGk.getView(), t100.d(4.0f));
                }
                nbq0VarGk.b(c0034d.getUser(), CoreModule.N().Ns());
            }
            xdl0.M(cardBottomMomentLayout.f2339g, true);
            xdl0.M(cardBottomMomentLayout.f2344l, false);
            xdl0.M0(cardBottomMomentLayout.f2340h, false);
            xdl0.M0(cardBottomMomentLayout.f2341i, false);
            xdl0.M0(cardBottomMomentLayout.f2342j, false);
            xdl0.M0(cardBottomMomentLayout.f2343k, false);
            ArrayList arrayListN = vwb.n(c0034d.getUserInfo().userMedia, new w9j() { // from class: l.o4j
                public final Object call(Object obj) {
                    Media media = (Media) obj;
                    return Boolean.valueOf((media instanceof Picture) || (media instanceof Video));
                }
            });
            if (arrayListN.size() > 0) {
                m23895A(cardBottomMomentLayout.f2340h, (Media) arrayListN.get(0));
            }
            if (arrayListN.size() > 1) {
                m23895A(cardBottomMomentLayout.f2341i, (Media) arrayListN.get(1));
            }
            if (arrayListN.size() > 2) {
                m23895A(cardBottomMomentLayout.f2342j, (Media) arrayListN.get(2));
            }
            if (arrayListN.size() > 3) {
                m23895A(cardBottomMomentLayout.f2343k, (Media) arrayListN.get(3));
                xdl0.W(view, t100.E);
            }
            if (CoreModule.N().Rc() && vwb.J(arrayListN)) {
                xdl0.M(cardBottomMomentLayout.f2339g, false);
                xdl0.M(cardBottomMomentLayout.f2344l, true);
                cardBottomMomentLayout.f2346n.setTypeface((Typeface) null, 1);
                cardBottomMomentLayout.f2347o.setText(wsh.m24531c());
                cardBottomMomentLayout.f2346n.setText(wsh.m24530b());
                m23897w(c0034d, cardBottomMomentLayout.f2344l, context);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m23897w(C0034d c0034d, View view, final Context context) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.r4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f19635a.m23898x(context, view2);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m23898x(Context context, View view) {
        wsh.m24529a(wsh.m24532d(), wsh.m24531c(), "p_edit_profile_view");
        Act act = (Act) context;
        ProfileListFrag profileListFrag = (Frag) act.fragmentManager().h0(R.id.content);
        if (profileListFrag instanceof ProfileListFrag) {
            final ProfileListFrag profileListFrag2 = profileListFrag;
            if (NullChecker.a(profileListFrag2.N8())) {
                m23900z(act, new d30() { // from class: l.s4j
                    public final void call() {
                        w4j.m23891s(profileListFrag2);
                    }
                });
                return;
            }
        }
        m23896B(act);
    }

    @Override // p009l.fol
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public boolean mo11837a(C0034d c0034d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c0034d.getUser() != null && c0034d.getUserInfo() != null) {
            if (CoreModule.N().Rc() && c0034d.m1454k() && (vwb.J(c0034d.getUserInfo().userMedia) || vwb.r(c0034d.getUserInfo().userMedia, new w9j() { // from class: l.p4j
                public final Object call(Object obj) {
                    Media media = (Media) obj;
                    return Boolean.valueOf((media instanceof Picture) || (media instanceof Video));
                }
            }) == null)) {
                return true;
            }
            if (!vwb.J(c0034d.getUserInfo().userMedia) && NullChecker.a(vwb.r(c0034d.getUserInfo().userMedia, new w9j() { // from class: l.q4j
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
    public final void m23900z(Act act, final d30 d30Var) {
        xh0.a aVar = new xh0.a(act);
        aVar.j("当前有还未保存的资料，点击保存后可直接跳转动态发布").s("资料尚未保存").q(com.p1.mobile.putong.core.R.string.u).o(new View.OnClickListener() { // from class: l.t4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w4j.m23893u(d30Var, xh0VarArr, view);
            }
        }).e(com.p1.mobile.putong.core.R.string.c).m(new DialogInterface.OnDismissListener() { // from class: l.u4j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w4j.m23888p(dialogInterface);
            }
        }).c(new View.OnClickListener() { // from class: l.v4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w4j.m23887o(xh0VarArr, view);
            }
        });
        xh0 xh0VarA = aVar.a();
        final xh0[] xh0VarArr = {xh0VarA};
        xh0VarA.g();
    }
}
