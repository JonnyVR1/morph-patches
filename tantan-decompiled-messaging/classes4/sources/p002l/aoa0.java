package p002l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.DraweeView;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.d30;
import l.djj;
import l.e30;
import l.ejj;
import l.f30;
import l.f9j;
import l.ftd0;
import l.j760;
import l.mcr;
import l.mkd0;
import l.n11;
import l.nbq0;
import l.o6j0;
import l.q860;
import l.qib0;
import l.qp8;
import l.sb90;
import l.t100;
import l.v9j;
import l.vsd0;
import l.vwb;
import l.w9j;
import l.wsh;
import l.x2c0;
import l.xdl0;
import l.xma;
import rx.c;
import rx.subjects.a;
import v.VDraweeView;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aoa0 extends ah90 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f7776A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f7777B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f7778C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f7779D;

    /* JADX INFO: renamed from: E */
    public VRelative f7780E;

    /* JADX INFO: renamed from: F */
    public VDraweeView f7781F;

    /* JADX INFO: renamed from: G */
    public VText f7782G;

    /* JADX INFO: renamed from: H */
    public VLinear f7783H;

    /* JADX INFO: renamed from: I */
    public VText f7784I;

    /* JADX INFO: renamed from: J */
    public VText f7785J;

    /* JADX INFO: renamed from: K */
    public View f7786K;

    /* JADX INFO: renamed from: L */
    public q860<CoreMomentInfo> f7787L;

    /* JADX INFO: renamed from: M */
    public String f7788M;

    /* JADX INFO: renamed from: N */
    public a<q860<CoreMomentInfo>> f7789N;

    /* JADX INFO: renamed from: O */
    public boolean f7790O;

    /* JADX INFO: renamed from: P */
    public boolean f7791P;

    /* JADX INFO: renamed from: Q */
    public q860<CoreMomentInfo> f7792Q;

    /* JADX INFO: renamed from: R */
    public d30 f7793R;

    /* JADX INFO: renamed from: S */
    public nbq0 f7794S;

    /* JADX INFO: renamed from: T */
    public VLinear f7795T;

    /* JADX INFO: renamed from: u */
    public LinearLayout f7796u;

    /* JADX INFO: renamed from: v */
    public VLinear f7797v;

    /* JADX INFO: renamed from: w */
    public VText f7798w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f7799x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f7800y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f7801z;

    /* JADX INFO: renamed from: l.aoa0$a */
    public class C0492a implements f30 {
        public C0492a() {
        }

        public void call(Object obj, Object obj2) {
            if (obj instanceof VDraweeView) {
                VDraweeView vDraweeView = (VDraweeView) obj;
                ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = t100.d(89.0f);
                    layoutParams.width = t100.d(89.0f);
                    vDraweeView.setLayoutParams(layoutParams);
                }
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.s(t100.d(6.0f));
                djj djjVarA = new ejj(aoa0.this.mo3351O().act().getResources()).a();
                djjVarA.H(roundingParams);
                vDraweeView.setHierarchy(djjVarA);
            }
        }
    }

    public aoa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f7786K = null;
        this.f7789N = a.b();
        this.f7791P = false;
        m14461p().creates(new e30() { // from class: l.rna0
            public final void call(Object obj) {
                this.f18614a.m9945l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m9926V(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ c m9928X(String str, Boolean bool) {
        return bool.booleanValue() ? CoreModule.N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.N().coreMomentCachedMoments(str, 0, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m9932h0(View view) {
        m9936b0().call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public c<q860<CoreMomentInfo>> m9933o0() {
        final String strUserId = mo3351O().userId();
        return mo3351O().mo1523P1() ? CoreModule.N().coreMomentMoments(strUserId, CoreMomentInfo.JSON_ADAPTER) : CoreModule.c.f0.wh(strUserId).flatMap(new w9j() { // from class: l.zna0
            public final Object call(Object obj) {
                return aoa0.m9928X(strUserId, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    private void m9934t0() {
        if (CoreModule.N().u6() && !mo3351O().mo1523P1() && NullChecker.a(this.f7795T)) {
            if (this.f7794S == null) {
                nbq0 nbq0VarGk = CoreModule.N().Gk(mo3351O().act(), "p_suggest_user_profile_info_view");
                this.f7794S = nbq0VarGk;
                this.f7795T.addView(nbq0VarGk.getView());
                xdl0.V(this.f7794S.getView(), t100.d(4.0f));
            }
            User userMo1517K2 = mo3351O().mo1517K2();
            if (userMo1517K2 == null) {
                userMo1517K2 = CoreModule.N().getUserById(mo3351O().userId());
            }
            nbq0 nbq0Var = this.f7794S;
            if (userMo1517K2 == null) {
                xdl0.M(nbq0Var.getView(), false);
            } else {
                nbq0Var.a(userMo1517K2, CoreModule.N().Ns());
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    private void m9935v0() {
        wsh.a(wsh.k(), wsh.j(), "p_suggest_user_profile_info_view");
        if (CoreModule.c.e0.p9().isJailedOrRestrict()) {
            CoreModule.K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.N().isPostingMoment()) {
                return;
            }
            CoreModule.N().Nr(mo3351O().act(), vwb.f0(new Media[0]), true, LiveMessage.LiveMessageType.OTHER, wsh.k(), wsh.l(), (String) null);
        }
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: b0 */
    public final d30 m9936b0() {
        if (this.f7793R == null) {
            this.f7793R = new d30() { // from class: l.yna0
                public final void call() {
                    this.f22985a.m9941g0();
                }
            };
        }
        return this.f7793R;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9937c0() {
        xdl0.M(this.f7799x, false);
        xdl0.M(this.f7801z, false);
        xdl0.M(this.f7777B, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m9938d0() {
        if ("from_new_meet_picks_feed".equals(mo3351O().from()) && !xma.G3()) {
            return true;
        }
        if ("from_new_meet_see_feed".equals(mo3351O().from()) && n3b0.m18486q()) {
            return true;
        }
        return "from_meet_feed".equals(mo3351O().from()) && xma.e4();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m9939e0(User user) {
        if (!mo3351O().mo2600E1() || mo3351O().mo2821m3(user)) {
            return true;
        }
        return (!mo3351O().userId().equals(CoreModule.H().userId()) && NullChecker.a(user) && user.unilateralBlock()) || mo3351O().mo2762c3(user) || mo3351O().mo2672P(mo3351O().userId());
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m9940f0() {
        return qp8.b() || mo3351O().mo1501D2();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m9941g0() {
        if (mo3351O().mo2821m3(mo3351O().mo1517K2()) || mo3351O().mo2762c3(mo3351O().mo1517K2()) || "from_guess_liker_result".equals(mo3351O().from())) {
            return;
        }
        if (qp8.b()) {
            m9948p0();
        }
        mo3351O().act().startActivity(CoreModule.N().argsToMomentsInProfileAct(mo3351O().act(), mo3351O().userId(), "from_ProfileFrag"));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m9942i0(j760 j760Var) {
        this.f7789N.onNext(new q860((List) j760Var.b, (DbLinks) null));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (!mo3351O().mo1501D2() && !mo3351O().mo1530S()) {
            this.f7798w.setText(mo3351O().mo1523P1() ? R.string.Vi : R.string.N);
        }
        this.f7796u.setOnClickListener(new View.OnClickListener() { // from class: l.qna0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f18100a.m9932h0(view2);
            }
        });
        if (m9940f0() || CoreModule.Q().a().a()) {
            m9937c0();
            m9953w0(null);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m9943j0(q860 q860Var) {
        this.f7787L = q860Var;
        m9949q0(q860Var);
        mo3351O().mo2867t1();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m9944k0(Throwable th) {
        this.f7791P = false;
        mo3351O().mo2867t1();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (sb90.c(mo3351O().mo1517K2()) || az50.INSTANCE.m10128i(mo3351O().userId()) || q8p.INSTANCE.m21088j(mo3351O().userId()) || m9939e0(mo3351O().mo1517K2())) {
            return false;
        }
        if (m9947n0()) {
            return true;
        }
        if (mo3351O().mo2600E1() && (((!"from_meet_picks_feed".equals(mo3351O().from()) && !"from_new_meet_picks_feed".equals(mo3351O().from()) && !"from_picks".equals(mo3351O().from()) && !"p_picks_profile".equals(mo3351O().from()) && !"p_picks_profile_card".equals(mo3351O().from()) && !"from_meet_picks_card".equals(mo3351O().from())) || xma.G3()) && !m9938d0())) {
            return this.f7791P;
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m9945l0(Bundle bundle) {
        if (!mo3351O().mo1523P1()) {
            CoreModule.N().cq(mo3351O().userId(), false, CoreMomentInfo.JSON_ADAPTER, "profile").subscribe(mkd0.H(new e30() { // from class: l.tna0
                public final void call(Object obj) {
                    this.f20312a.m9942i0((j760) obj);
                }
            }, new e30() { // from class: l.una0
                public final void call(Object obj) {
                    aoa0.m9926V((Throwable) obj);
                }
            }));
        }
        if (!mo3351O().mo2600E1()) {
            this.f7791P = false;
            mo3351O().mo2867t1();
            return;
        }
        if (f9j.a(mo3351O().from())) {
            this.f7791P = true;
        } else if (mo3351O().mo2665O1()) {
            this.f7791P = CoreModule.N().coreMomentHasMoments(mo3351O().userId());
        }
        m14461p().duringCreated(new v9j() { // from class: l.vna0
            public final Object call() {
                return this.f21231a.m9933o0();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.wna0
            public final void call(Object obj) {
                this.f21882a.m9943j0((q860) obj);
            }
        }, new e30() { // from class: l.xna0
            public final void call(Object obj) {
                this.f22363a.m9944k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m9946m0(View view) {
        m9935v0();
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m9947n0() {
        q860<CoreMomentInfo> q860Var;
        return mo3351O().mo1523P1() && !mo3351O().mo2625I1() && (q860Var = this.f7787L) != null && q860Var.a.size() == 0;
    }

    /* JADX INFO: renamed from: p0 */
    public void m9948p0() {
        o6j0.e("e_moment", "p_suggest_user_profile_info_view", new j760[]{j760.a("owner_id", mo3351O().userId())});
    }

    /* JADX INFO: renamed from: q0 */
    public final void m9949q0(q860<CoreMomentInfo> q860Var) {
        n11.c();
        boolean z = this.f7791P;
        User userById = CoreModule.N().getUserById(mo3351O().userId());
        if (CoreModule.Q().a().a()) {
            userById = CoreModule.Q().getUserById(mo3351O().userId());
        }
        boolean z2 = false;
        if (NullChecker.a(userById) && userById.unilateralBlock()) {
            this.f7791P = false;
        } else if (!m9947n0() && q860Var.a.size() == 0) {
            if (CoreModule.N().Rc() && mo3351O().mo1523P1()) {
                z2 = true;
            }
            this.f7791P = z2;
        } else {
            this.f7791P = true;
        }
        if (z != this.f7791P) {
            mo3351O().mo1515J3();
        } else if (z && m14457h()) {
            m9951s0(mo3351O().userId(), q860Var);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void mo9950r0(boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m9951s0(String str, q860<CoreMomentInfo> q860Var) {
        if (q860Var == null) {
            return;
        }
        if (NullChecker.a(this.f7780E)) {
            this.f7780E.setVisibility(8);
        }
        if (q860Var.a.size() == 0 && NullChecker.a(this.f7780E) && CoreModule.N().Rc()) {
            this.f7779D.setVisibility(8);
            this.f7780E.setVisibility(0);
            this.f7784I.setTypeface((Typeface) null, 1);
            this.f7782G.setTypeface((Typeface) null, 1);
            String strJ = wsh.j();
            if (TextUtils.isEmpty(strJ)) {
                strJ = wsh.f();
            }
            this.f7784I.setText(strJ);
            this.f7785J.setText(wsh.i());
            this.f7782G.setText(wsh.g());
            String strH = wsh.h();
            if (TextUtils.isEmpty(strH)) {
                qib0.G.Y0(this.f7781F, x2c0.zj);
            } else {
                qib0.G.L0(this.f7781F, strH);
            }
            xdl0.E0(this.f7780E, new View.OnClickListener() { // from class: l.sna0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19135a.m9946m0(view);
                }
            });
            if (this.f7790O) {
                return;
            }
            wsh.m(wsh.k(), wsh.j(), "p_suggest_user_profile_info_view");
            this.f7790O = true;
            return;
        }
        if (!mo3351O().mo2625I1()) {
            mo9950r0(q860Var.a.size() == 0);
            if (q860Var.a.size() == 0) {
                m9954x0();
                this.f7779D.setVisibility(8);
                return;
            }
        }
        if (q860Var.equals(this.f7792Q)) {
            return;
        }
        this.f7779D.setVisibility(0);
        n11.c();
        User userById = CoreModule.N().getUserById(str);
        if (CoreModule.Q().a().a()) {
            userById = CoreModule.Q().getUserById(str);
        }
        if (q860Var.a.size() == 0) {
            this.f7796u.setVisibility(8);
        } else {
            if (NullChecker.a(userById) && userById.unilateralBlock()) {
                this.f7796u.setVisibility(8);
            } else {
                this.f7796u.setVisibility(0);
            }
            this.f7791P = true;
            DraweeView[] draweeViewArr = {this.f7799x, this.f7801z, this.f7777B};
            if (m9940f0() && m9953w0(q860Var)) {
                m9954x0();
                m9934t0();
                return;
            }
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < q860Var.a.size(); i2++) {
                for (Video video : ((CoreMomentInfo) q860Var.a.get(i2)).media) {
                    if (i < 3) {
                        if (video instanceof Picture) {
                            xdl0.M0(draweeViewArr[i], true);
                            qib0.G.Q0(draweeViewArr[i], ((Picture) video).momentPictureSmall());
                            draweeViewArr[i].getHierarchy().c((Drawable) null);
                        } else if (video instanceof Video) {
                            Video video2 = video;
                            if (NullChecker.b(video2.cover) && NullChecker.b(((Media) video2.cover).url)) {
                                xdl0.M0(draweeViewArr[i], true);
                                qib0.G.Q0(draweeViewArr[i], video2.cover.momentPictureSmall());
                                draweeViewArr[i].getHierarchy().c(new vsd0(mo3351O().act().getResources().getDrawable(x2c0.Zr), ftd0.g));
                            }
                        }
                        i++;
                    }
                }
            }
            if ("from_guess_liker_result".equals(mo3351O().from()) && i == 0) {
                this.f7796u.setVisibility(8);
            }
            while (i < 3) {
                qib0.G.o(draweeViewArr[i]);
                if (i == 0) {
                    xdl0.M0(draweeViewArr[i], false);
                } else {
                    xdl0.M(draweeViewArr[i], false);
                }
                i++;
            }
        }
        this.f7792Q = q860Var;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m9951s0(mo3351O().userId(), this.f7787L);
    }

    /* JADX INFO: renamed from: u0 */
    public void m9952u0(String str) {
        this.f7788M = str;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m9953w0(q860<CoreMomentInfo> q860Var) {
        String strUserId = mo3351O().userId();
        HashMap map = new HashMap();
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_MOMENT", q860Var);
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_USER_ID", strUserId);
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_CLICK", m9936b0());
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_PROCESS", new C0492a());
        return CoreModule.N().useFeedInsertViewProxy(mo3351O().act(), 1, map, new View[]{this.f7779D, null, null, null, this.f7797v});
    }

    /* JADX INFO: renamed from: x0 */
    public final void m9954x0() {
        m9651Q(this.f7786K, 0);
    }
}
