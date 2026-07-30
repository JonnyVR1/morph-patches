package p149l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7870d;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomMomentLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class w4j extends wl2 {
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m201514o(xh0[] xh0VarArr, View view) {
        xh0 xh0Var = xh0VarArr[0];
        if (xh0Var == null) {
            return;
        }
        xh0Var.m208717c();
        xh0VarArr[0] = null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m201515p(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m201518s(ProfileListFrag profileListFrag) {
        profileListFrag.mo51123o();
        profileListFrag.f33615A4 = true;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m201520u(d30 d30Var, xh0[] xh0VarArr, View view) {
        d30Var.call();
        xh0 xh0Var = xh0VarArr[0];
        if (xh0Var == null) {
            return;
        }
        xh0Var.m208717c();
        xh0VarArr[0] = null;
    }

    /* JADX INFO: renamed from: A */
    public final void m201522A(VDraweeView vDraweeView, Media media) {
        xdl0.m208345M0(vDraweeView, true);
        Picture pictureCover = media instanceof Video ? media.cover() : (Picture) media;
        if (pictureCover == null || TEnum.equals(pictureCover.status, "raw") || TextUtils.isEmpty(pictureCover.url)) {
            return;
        }
        qib0.f154691G.m102341Q0(vDraweeView, pictureCover.calculatedWidth(t100.f167232G));
    }

    /* JADX INFO: renamed from: B */
    public final void m201523B(Act act) {
        if (CoreModule.f17545c.f19639e0.m169527p9().isJailedOrRestrict()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.m29934N().isPostingMoment()) {
                return;
            }
            CoreModule.m29934N().mo60298Nr(act, vwb.m200324f0(new Media[0]), true, "other", wsh.m205499d(), wsh.m205500e(), null);
        }
    }

    @Override // p149l.wl2
    /* JADX INFO: renamed from: c */
    public void mo100261c(C7870d c7870d, View view, FrameLayout frameLayout, int i, Context context) {
        super.mo100261c(c7870d, view, frameLayout, i, context);
        if (view instanceof CardBottomMomentLayout) {
            CardBottomMomentLayout cardBottomMomentLayout = (CardBottomMomentLayout) view;
            m203741k(cardBottomMomentLayout.f23557c, c7870d, i);
            if (CoreModule.m29934N().mo60393u6()) {
                int childCount = cardBottomMomentLayout.f23559e.getChildCount();
                nbq0 nbq0VarMo60277Gk = null;
                for (int i2 = 0; i2 < childCount; i2++) {
                    KeyEvent.Callback childAt = cardBottomMomentLayout.f23559e.getChildAt(i2);
                    if (childAt instanceof nbq0) {
                        nbq0VarMo60277Gk = (nbq0) childAt;
                    }
                }
                if (nbq0VarMo60277Gk == null) {
                    nbq0VarMo60277Gk = CoreModule.m29934N().mo60277Gk((Act) context, "p_suggest_users_home_view");
                    cardBottomMomentLayout.f23559e.addView(nbq0VarMo60277Gk.getView());
                    xdl0.m208358V(nbq0VarMo60277Gk.getView(), t100.m186890d(4.0f));
                }
                nbq0VarMo60277Gk.mo64423b(c7870d.getUser(), CoreModule.m29934N().mo60299Ns());
            }
            xdl0.m208344M(cardBottomMomentLayout.f23561g, true);
            xdl0.m208344M(cardBottomMomentLayout.f23566l, false);
            xdl0.m208345M0(cardBottomMomentLayout.f23562h, false);
            xdl0.m208345M0(cardBottomMomentLayout.f23563i, false);
            xdl0.m208345M0(cardBottomMomentLayout.f23564j, false);
            xdl0.m208345M0(cardBottomMomentLayout.f23565k, false);
            ArrayList arrayListM200339n = vwb.m200339n(c7870d.getUserInfo().userMedia, new w9j() { // from class: l.o4j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Media media = (Media) obj;
                    return Boolean.valueOf((media instanceof Picture) || (media instanceof Video));
                }
            });
            if (arrayListM200339n.size() > 0) {
                m201522A(cardBottomMomentLayout.f23562h, (Media) arrayListM200339n.get(0));
            }
            if (arrayListM200339n.size() > 1) {
                m201522A(cardBottomMomentLayout.f23563i, (Media) arrayListM200339n.get(1));
            }
            if (arrayListM200339n.size() > 2) {
                m201522A(cardBottomMomentLayout.f23564j, (Media) arrayListM200339n.get(2));
            }
            if (arrayListM200339n.size() > 3) {
                m201522A(cardBottomMomentLayout.f23565k, (Media) arrayListM200339n.get(3));
                xdl0.m208359W(view, t100.f167230E);
            }
            if (CoreModule.m29934N().mo60311Rc() && vwb.m200296J(arrayListM200339n)) {
                xdl0.m208344M(cardBottomMomentLayout.f23561g, false);
                xdl0.m208344M(cardBottomMomentLayout.f23566l, true);
                cardBottomMomentLayout.f23568n.setTypeface(null, 1);
                cardBottomMomentLayout.f23569o.setText(wsh.m205498c());
                cardBottomMomentLayout.f23568n.setText(wsh.m205497b());
                m201524w(c7870d, cardBottomMomentLayout.f23566l, context);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m201524w(C7870d c7870d, View view, final Context context) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.r4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f157700a.m201525x(context, view2);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m201525x(Context context, View view) {
        wsh.m205496a(wsh.m205499d(), wsh.m205498c(), "p_edit_profile_view");
        Act act = (Act) context;
        Frag frag = (Frag) act.fragmentManager().m2554h0(R.id.content);
        if (frag instanceof ProfileListFrag) {
            final ProfileListFrag profileListFrag = (ProfileListFrag) frag;
            if (NullChecker.m81303a(profileListFrag.m52132N8())) {
                m201527z(act, new d30() { // from class: l.s4j
                    @Override // p149l.d30
                    public final void call() {
                        w4j.m201518s(profileListFrag);
                    }
                });
                return;
            }
        }
        m201523B(act);
    }

    @Override // p149l.fol
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public boolean mo100260a(C7870d c7870d, int i, CardBottomFrame cardBottomFrame, Context context) {
        if (c7870d.getUser() != null && c7870d.getUserInfo() != null) {
            if (CoreModule.m29934N().mo60311Rc() && c7870d.m37483k() && (vwb.m200296J(c7870d.getUserInfo().userMedia) || vwb.m200346r(c7870d.getUserInfo().userMedia, new w9j() { // from class: l.p4j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    Media media = (Media) obj;
                    return Boolean.valueOf((media instanceof Picture) || (media instanceof Video));
                }
            }) == null)) {
                return true;
            }
            if (!vwb.m200296J(c7870d.getUserInfo().userMedia) && NullChecker.m81303a(vwb.m200346r(c7870d.getUserInfo().userMedia, new w9j() { // from class: l.q4j
                @Override // p149l.w9j
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
    public final void m201527z(Act act, final d30 d30Var) {
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j("当前有还未保存的资料，点击保存后可直接跳转动态发布").m208740s("资料尚未保存").m208738q(R$string.f18958u).m208736o(new View.OnClickListener() { // from class: l.t4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w4j.m201520u(d30Var, xh0VarArr, view);
            }
        }).m208726e(R$string.f18408c).m208734m(new DialogInterface.OnDismissListener() { // from class: l.u4j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w4j.m201515p(dialogInterface);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.v4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w4j.m201514o(xh0VarArr, view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        final xh0[] xh0VarArr = {xh0VarM208722a};
        xh0VarM208722a.m208721g();
    }
}
