package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class aoa0 extends ah90 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f70800A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f70801B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f70802C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f70803D;

    /* JADX INFO: renamed from: E */
    public VRelative f70804E;

    /* JADX INFO: renamed from: F */
    public VDraweeView f70805F;

    /* JADX INFO: renamed from: G */
    public VText f70806G;

    /* JADX INFO: renamed from: H */
    public VLinear f70807H;

    /* JADX INFO: renamed from: I */
    public VText f70808I;

    /* JADX INFO: renamed from: J */
    public VText f70809J;

    /* JADX INFO: renamed from: K */
    public View f70810K;

    /* JADX INFO: renamed from: L */
    public q860<CoreMomentInfo> f70811L;

    /* JADX INFO: renamed from: M */
    public String f70812M;

    /* JADX INFO: renamed from: N */
    public C22392a<q860<CoreMomentInfo>> f70813N;

    /* JADX INFO: renamed from: O */
    public boolean f70814O;

    /* JADX INFO: renamed from: P */
    public boolean f70815P;

    /* JADX INFO: renamed from: Q */
    public q860<CoreMomentInfo> f70816Q;

    /* JADX INFO: renamed from: R */
    public d30 f70817R;

    /* JADX INFO: renamed from: S */
    public nbq0 f70818S;

    /* JADX INFO: renamed from: T */
    public VLinear f70819T;

    /* JADX INFO: renamed from: u */
    public LinearLayout f70820u;

    /* JADX INFO: renamed from: v */
    public VLinear f70821v;

    /* JADX INFO: renamed from: w */
    public VText f70822w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f70823x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f70824y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f70825z;

    /* JADX INFO: renamed from: l.aoa0$a */
    public class C15676a implements f30 {
        public C15676a() {
        }

        @Override // p149l.f30
        public void call(Object obj, Object obj2) {
            if (obj instanceof VDraweeView) {
                VDraweeView vDraweeView = (VDraweeView) obj;
                ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = t100.m186890d(89.0f);
                    layoutParams.width = t100.m186890d(89.0f);
                    vDraweeView.setLayoutParams(layoutParams);
                }
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.m8265s(t100.m186890d(6.0f));
                djj djjVarM116872a = new ejj(aoa0.this.mo52800O().act().getResources()).m116872a();
                djjVarM116872a.m112053H(roundingParams);
                vDraweeView.setHierarchy(djjVarM116872a);
            }
        }
    }

    public aoa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f70810K = null;
        this.f70813N = C22392a.m221512b();
        this.f70815P = false;
        m131821p().creates(new e30() { // from class: l.rna0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160255a.m97867l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m97848V(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ C22306c m97850X(String str, Boolean bool) {
        return bool.booleanValue() ? CoreModule.m29934N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.m29934N().coreMomentCachedMoments(str, 0, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m97854h0(View view) {
        m97858b0().call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public C22306c<q860<CoreMomentInfo>> m97855o0() {
        final String strUserId = mo52800O().userId();
        return mo52800O().mo51075P1() ? CoreModule.m29934N().coreMomentMoments(strUserId, CoreMomentInfo.JSON_ADAPTER) : CoreModule.f17545c.f19642f0.m33170wh(strUserId).flatMap(new w9j() { // from class: l.zna0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return aoa0.m97850X(strUserId, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    private void m97856t0() {
        if (CoreModule.m29934N().mo60393u6() && !mo52800O().mo51075P1() && NullChecker.m81303a(this.f70819T)) {
            if (this.f70818S == null) {
                nbq0 nbq0VarMo60277Gk = CoreModule.m29934N().mo60277Gk(mo52800O().act(), OMSDialogPositon.p_suggest_user_profile_info_view);
                this.f70818S = nbq0VarMo60277Gk;
                this.f70819T.addView(nbq0VarMo60277Gk.getView());
                xdl0.m208358V(this.f70818S.getView(), t100.m186890d(4.0f));
            }
            User userMo51069K2 = mo52800O().mo51069K2();
            if (userMo51069K2 == null) {
                userMo51069K2 = CoreModule.m29934N().getUserById(mo52800O().userId());
            }
            nbq0 nbq0Var = this.f70818S;
            if (userMo51069K2 == null) {
                xdl0.m208344M(nbq0Var.getView(), false);
            } else {
                nbq0Var.mo64422a(userMo51069K2, CoreModule.m29934N().mo60299Ns());
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    private void m97857v0() {
        wsh.m205496a(wsh.m205506k(), wsh.m205505j(), OMSDialogPositon.p_suggest_user_profile_info_view);
        if (CoreModule.f17545c.f19639e0.m169527p9().isJailedOrRestrict()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.m29934N().isPostingMoment()) {
                return;
            }
            CoreModule.m29934N().mo60298Nr(mo52800O().act(), vwb.m200324f0(new Media[0]), true, "other", wsh.m205506k(), wsh.m205507l(), null);
        }
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: b0 */
    public final d30 m97858b0() {
        if (this.f70817R == null) {
            this.f70817R = new d30() { // from class: l.yna0
                @Override // p149l.d30
                public final void call() {
                    this.f199150a.m97863g0();
                }
            };
        }
        return this.f70817R;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m97859c0() {
        xdl0.m208344M(this.f70823x, false);
        xdl0.m208344M(this.f70825z, false);
        xdl0.m208344M(this.f70801B, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m97860d0() {
        if ("from_new_meet_picks_feed".equals(mo52800O().from()) && !xma.m210044G3()) {
            return true;
        }
        if ("from_new_meet_see_feed".equals(mo52800O().from()) && n3b0.m157742q()) {
            return true;
        }
        return "from_meet_feed".equals(mo52800O().from()) && xma.m210071e4();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m97861e0(User user) {
        if (!mo52800O().mo52071E1() || mo52800O().mo52289m3(user)) {
            return true;
        }
        return (!mo52800O().userId().equals(CoreModule.m29931H().userId()) && NullChecker.m81303a(user) && user.unilateralBlock()) || mo52800O().mo52233c3(user) || mo52800O().mo52143P(mo52800O().userId());
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m97862f0() {
        return qp8.m175817b() || mo52800O().mo51053D2();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m97863g0() {
        if (mo52800O().mo52289m3(mo52800O().mo51069K2()) || mo52800O().mo52233c3(mo52800O().mo51069K2()) || "from_guess_liker_result".equals(mo52800O().from())) {
            return;
        }
        if (qp8.m175817b()) {
            m97870p0();
        }
        mo52800O().act().startActivity(CoreModule.m29934N().argsToMomentsInProfileAct(mo52800O().act(), mo52800O().userId(), "from_ProfileFrag"));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m97864i0(j760 j760Var) {
        this.f70813N.onNext(new q860<>((List) j760Var.f116565b, null));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (!mo52800O().mo51053D2() && !mo52800O().mo51082S()) {
            this.f70822w.setText(mo52800O().mo51075P1() ? R$string.f18215Vi : R$string.f17956N);
        }
        this.f70820u.setOnClickListener(new View.OnClickListener() { // from class: l.qna0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f155407a.m97854h0(view2);
            }
        });
        if (m97862f0() || CoreModule.m29936Q().mo67255a().mo124834a()) {
            m97859c0();
            m97875w0(null);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m97865j0(q860 q860Var) {
        this.f70811L = q860Var;
        m97871q0(q860Var);
        mo52800O().mo52334t1();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m97866k0(Throwable th) {
        this.f70815P = false;
        mo52800O().mo52334t1();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (sb90.m183207c(mo52800O().mo51069K2()) || az50.INSTANCE.m99629i(mo52800O().userId()) || q8p.INSTANCE.m173435j(mo52800O().userId()) || m97861e0(mo52800O().mo51069K2())) {
            return false;
        }
        if (m97869n0()) {
            return true;
        }
        if (mo52800O().mo52071E1() && (((!"from_meet_picks_feed".equals(mo52800O().from()) && !"from_new_meet_picks_feed".equals(mo52800O().from()) && !"from_picks".equals(mo52800O().from()) && !"p_picks_profile".equals(mo52800O().from()) && !"p_picks_profile_card".equals(mo52800O().from()) && !"from_meet_picks_card".equals(mo52800O().from())) || xma.m210044G3()) && !m97860d0())) {
            return this.f70815P;
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m97867l0(Bundle bundle) {
        if (!mo52800O().mo51075P1()) {
            CoreModule.m29934N().mo60344cq(mo52800O().userId(), false, CoreMomentInfo.JSON_ADAPTER, "profile").subscribe(mkd0.m154956H(new e30() { // from class: l.tna0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171224a.m97864i0((j760) obj);
                }
            }, new e30() { // from class: l.una0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aoa0.m97848V((Throwable) obj);
                }
            }));
        }
        if (!mo52800O().mo52071E1()) {
            this.f70815P = false;
            mo52800O().mo52334t1();
            return;
        }
        if (f9j.m120084a(mo52800O().from())) {
            this.f70815P = true;
        } else if (mo52800O().mo52136O1()) {
            this.f70815P = CoreModule.m29934N().coreMomentHasMoments(mo52800O().userId());
        }
        m131821p().duringCreated(new v9j() { // from class: l.vna0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f182221a.m97855o0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.wna0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187289a.m97865j0((q860) obj);
            }
        }, new e30() { // from class: l.xna0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193651a.m97866k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m97868m0(View view) {
        m97857v0();
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m97869n0() {
        q860<CoreMomentInfo> q860Var;
        return mo52800O().mo51075P1() && !mo52800O().mo52096I1() && (q860Var = this.f70811L) != null && q860Var.f153135a.size() == 0;
    }

    /* JADX INFO: renamed from: p0 */
    public void m97870p0() {
        o6j0.m162861e("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, j760.m140076a("owner_id", mo52800O().userId()));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m97871q0(q860<CoreMomentInfo> q860Var) {
        n11.m157330c();
        boolean z = this.f70815P;
        User userById = CoreModule.m29934N().getUserById(mo52800O().userId());
        if (CoreModule.m29936Q().mo67255a().mo124834a()) {
            userById = CoreModule.m29936Q().getUserById(mo52800O().userId());
        }
        boolean z2 = false;
        if (NullChecker.m81303a(userById) && userById.unilateralBlock()) {
            this.f70815P = false;
        } else if (!m97869n0() && q860Var.f153135a.size() == 0) {
            if (CoreModule.m29934N().mo60311Rc() && mo52800O().mo51075P1()) {
                z2 = true;
            }
            this.f70815P = z2;
        } else {
            this.f70815P = true;
        }
        if (z != this.f70815P) {
            mo52800O().mo51067J3();
        } else if (z && m131817h()) {
            m97873s0(mo52800O().userId(), q860Var);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void mo97872r0(boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m97873s0(String str, q860<CoreMomentInfo> q860Var) {
        if (q860Var == null) {
            return;
        }
        if (NullChecker.m81303a(this.f70804E)) {
            this.f70804E.setVisibility(8);
        }
        if (q860Var.f153135a.size() == 0 && NullChecker.m81303a(this.f70804E) && CoreModule.m29934N().mo60311Rc()) {
            this.f70803D.setVisibility(8);
            this.f70804E.setVisibility(0);
            this.f70808I.setTypeface(null, 1);
            this.f70806G.setTypeface(null, 1);
            String strM205505j = wsh.m205505j();
            if (TextUtils.isEmpty(strM205505j)) {
                strM205505j = wsh.m205501f();
            }
            this.f70808I.setText(strM205505j);
            this.f70809J.setText(wsh.m205504i());
            this.f70806G.setText(wsh.m205502g());
            String strM205503h = wsh.m205503h();
            if (TextUtils.isEmpty(strM205503h)) {
                qib0.f154691G.m102354Y0(this.f70805F, x2c0.f190782zj);
            } else {
                qib0.f154691G.m102331L0(this.f70805F, strM205503h);
            }
            xdl0.m208329E0(this.f70804E, new View.OnClickListener() { // from class: l.sna0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165421a.m97868m0(view);
                }
            });
            if (this.f70814O) {
                return;
            }
            wsh.m205508m(wsh.m205506k(), wsh.m205505j(), OMSDialogPositon.p_suggest_user_profile_info_view);
            this.f70814O = true;
            return;
        }
        if (!mo52800O().mo52096I1()) {
            mo97872r0(q860Var.f153135a.size() == 0);
            if (q860Var.f153135a.size() == 0) {
                m97876x0();
                this.f70803D.setVisibility(8);
                return;
            }
        }
        if (q860Var.equals(this.f70816Q)) {
            return;
        }
        this.f70803D.setVisibility(0);
        n11.m157330c();
        User userById = CoreModule.m29934N().getUserById(str);
        if (CoreModule.m29936Q().mo67255a().mo124834a()) {
            userById = CoreModule.m29936Q().getUserById(str);
        }
        if (q860Var.f153135a.size() == 0) {
            this.f70820u.setVisibility(8);
        } else {
            if (NullChecker.m81303a(userById) && userById.unilateralBlock()) {
                this.f70820u.setVisibility(8);
            } else {
                this.f70820u.setVisibility(0);
            }
            this.f70815P = true;
            VDraweeView[] vDraweeViewArr = {this.f70823x, this.f70825z, this.f70801B};
            if (m97862f0() && m97875w0(q860Var)) {
                m97876x0();
                m97856t0();
                return;
            }
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < q860Var.f153135a.size(); i2++) {
                for (Media media : q860Var.f153135a.get(i2).media) {
                    if (i < 3) {
                        if (media instanceof Picture) {
                            xdl0.m208345M0(vDraweeViewArr[i], true);
                            qib0.f154691G.m102341Q0(vDraweeViewArr[i], ((Picture) media).momentPictureSmall());
                            vDraweeViewArr[i].getHierarchy().mo112056c(null);
                        } else if (media instanceof Video) {
                            Video video = (Video) media;
                            if (NullChecker.m81304b(video.cover) && NullChecker.m81304b(video.cover.url)) {
                                xdl0.m208345M0(vDraweeViewArr[i], true);
                                qib0.f154691G.m102341Q0(vDraweeViewArr[i], video.cover.momentPictureSmall());
                                vDraweeViewArr[i].getHierarchy().mo112056c(new vsd0(mo52800O().act().getResources().getDrawable(x2c0.f189962Zr), ftd0.f99183g));
                            }
                        }
                        i++;
                    }
                }
            }
            if ("from_guess_liker_result".equals(mo52800O().from()) && i == 0) {
                this.f70820u.setVisibility(8);
            }
            while (i < 3) {
                qib0.f154691G.m184725o(vDraweeViewArr[i]);
                if (i == 0) {
                    xdl0.m208345M0(vDraweeViewArr[i], false);
                } else {
                    xdl0.m208344M(vDraweeViewArr[i], false);
                }
                i++;
            }
        }
        this.f70816Q = q860Var;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m97873s0(mo52800O().userId(), this.f70811L);
    }

    /* JADX INFO: renamed from: u0 */
    public void m97874u0(String str) {
        this.f70812M = str;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m97875w0(q860<CoreMomentInfo> q860Var) {
        String strUserId = mo52800O().userId();
        HashMap map = new HashMap();
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_MOMENT", q860Var);
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_USER_ID", strUserId);
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_CLICK", m97858b0());
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_PROCESS", new C15676a());
        return CoreModule.m29934N().useFeedInsertViewProxy(mo52800O().act(), 1, map, this.f70803D, null, null, null, this.f70821v);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m97876x0() {
        m96420Q(this.f70810K, 0);
    }
}
