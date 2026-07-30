package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ewa0 extends ep90 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f96104A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f96105B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f96106C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f96107D;

    /* JADX INFO: renamed from: E */
    public VRelative f96108E;

    /* JADX INFO: renamed from: F */
    public VDraweeView f96109F;

    /* JADX INFO: renamed from: G */
    public VText f96110G;

    /* JADX INFO: renamed from: H */
    public VLinear f96111H;

    /* JADX INFO: renamed from: I */
    public VText f96112I;

    /* JADX INFO: renamed from: J */
    public VText f96113J;

    /* JADX INFO: renamed from: K */
    public View f96114K;

    /* JADX INFO: renamed from: L */
    public vg60<CoreMomentInfo> f96115L;

    /* JADX INFO: renamed from: M */
    public String f96116M;

    /* JADX INFO: renamed from: N */
    public C22507a<vg60<CoreMomentInfo>> f96117N;

    /* JADX INFO: renamed from: O */
    public boolean f96118O;

    /* JADX INFO: renamed from: P */
    public boolean f96119P;

    /* JADX INFO: renamed from: Q */
    public vg60<CoreMomentInfo> f96120Q;

    /* JADX INFO: renamed from: R */
    public x20 f96121R;

    /* JADX INFO: renamed from: S */
    public skq0 f96122S;

    /* JADX INFO: renamed from: T */
    public VLinear f96123T;

    /* JADX INFO: renamed from: u */
    public LinearLayout f96124u;

    /* JADX INFO: renamed from: v */
    public VLinear f96125v;

    /* JADX INFO: renamed from: w */
    public VText f96126w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f96127x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f96128y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f96129z;

    /* JADX INFO: renamed from: l.ewa0$a */
    public class C16849a implements z20 {
        public C16849a() {
        }

        @Override // p153l.z20
        public void call(Object obj, Object obj2) {
            if (obj instanceof VDraweeView) {
                VDraweeView vDraweeView = (VDraweeView) obj;
                ViewGroup.LayoutParams layoutParams = vDraweeView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = qa00.m175859d(89.0f);
                    layoutParams.width = qa00.m175859d(89.0f);
                    vDraweeView.setLayoutParams(layoutParams);
                }
                RoundingParams roundingParams = new RoundingParams();
                roundingParams.m8319s(qa00.m175859d(6.0f));
                wlj wljVarM211638a = new xlj(ewa0.this.mo53983O().act().getResources()).m211638a();
                wljVarM211638a.m207045H(roundingParams);
                vDraweeView.setHierarchy(wljVarM211638a);
            }
        }
    }

    public ewa0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f96114K = null;
        this.f96117N = C22507a.m222758b();
        this.f96119P = false;
        m168321p().creates(new y20() { // from class: l.vva0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185918a.m122918l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m122899V(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ C22421c m122901X(String str, Boolean bool) {
        return bool.booleanValue() ? CoreModule.m30932N().coreMomentMoments(str, CoreMomentInfo.JSON_ADAPTER) : CoreModule.m30932N().coreMomentCachedMoments(str, 0, CoreMomentInfo.JSON_ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m122905h0(View view) {
        m122909b0().call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public C22421c<vg60<CoreMomentInfo>> m122906o0() {
        final String strUserId = mo53983O().userId();
        return mo53983O().mo52258P1() ? CoreModule.m30932N().coreMomentMoments(strUserId, CoreMomentInfo.JSON_ADAPTER) : CoreModule.f18264c.f20384f0.m34173wh(strUserId).flatMap(new qcj() { // from class: l.dwa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewa0.m122901X(strUserId, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t0 */
    private void m122907t0() {
        if (CoreModule.m30932N().mo61577u6() && !mo53983O().mo52258P1() && NullChecker.m82486a(this.f96123T)) {
            if (this.f96122S == null) {
                skq0 skq0VarMo61461Gk = CoreModule.m30932N().mo61461Gk(mo53983O().act(), OMSDialogPositon.p_suggest_user_profile_info_view);
                this.f96122S = skq0VarMo61461Gk;
                this.f96123T.addView(skq0VarMo61461Gk.getView());
                bnl0.m105538V(this.f96122S.getView(), qa00.m175859d(4.0f));
            }
            User userMo52252K2 = mo53983O().mo52252K2();
            if (userMo52252K2 == null) {
                userMo52252K2 = CoreModule.m30932N().getUserById(mo53983O().userId());
            }
            skq0 skq0Var = this.f96122S;
            if (userMo52252K2 == null) {
                bnl0.m105524M(skq0Var.getView(), false);
            } else {
                skq0Var.mo65605a(userMo52252K2, CoreModule.m30932N().mo61483Ns());
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    private void m122908v0() {
        luh.m155929a(luh.m155939k(), luh.m155938j(), OMSDialogPositon.p_suggest_user_profile_info_view);
        if (CoreModule.f18264c.f20381e0.m116600p9().isJailedOrRestrict()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
        } else {
            if (CoreModule.m30932N().isPostingMoment()) {
                return;
            }
            CoreModule.m30932N().mo61482Nr(mo53983O().act(), jyb.m147507f0(new Media[0]), true, "other", luh.m155939k(), luh.m155940l(), null);
        }
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: b0 */
    public final x20 m122909b0() {
        if (this.f96121R == null) {
            this.f96121R = new x20() { // from class: l.cwa0
                @Override // p153l.x20
                public final void call() {
                    this.f84108a.m122914g0();
                }
            };
        }
        return this.f96121R;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m122910c0() {
        bnl0.m105524M(this.f96127x, false);
        bnl0.m105524M(this.f96129z, false);
        bnl0.m105524M(this.f96105B, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m122911d0() {
        if ("from_new_meet_picks_feed".equals(mo53983O().from()) && !joa.m146358H3()) {
            return true;
        }
        if ("from_new_meet_see_feed".equals(mo53983O().from()) && rbb0.m180744q()) {
            return true;
        }
        return "from_meet_feed".equals(mo53983O().from()) && joa.m146386f4();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m122912e0(User user) {
        if (!mo53983O().mo53254E1() || mo53983O().mo53472m3(user)) {
            return true;
        }
        return (!mo53983O().userId().equals(CoreModule.m30929H().userId()) && NullChecker.m82486a(user) && user.unilateralBlock()) || mo53983O().mo53416c3(user) || mo53983O().mo53326P(mo53983O().userId());
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m122913f0() {
        return vq8.m202358b() || mo53983O().mo52236D2();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m122914g0() {
        if (mo53983O().mo53472m3(mo53983O().mo52252K2()) || mo53983O().mo53416c3(mo53983O().mo52252K2()) || "from_guess_liker_result".equals(mo53983O().from())) {
            return;
        }
        if (vq8.m202358b()) {
            m122921p0();
        }
        mo53983O().act().startActivity(CoreModule.m30932N().argsToMomentsInProfileAct(mo53983O().act(), mo53983O().userId(), "from_ProfileFrag"));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m122915i0(pf60 pf60Var) {
        this.f96117N.onNext(new vg60<>((List) pf60Var.f152157b, null));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (!mo53983O().mo52236D2() && !mo53983O().mo52265S()) {
            this.f96126w.setText(mo53983O().mo52258P1() ? R$string.f19620rj : R$string.f18686N);
        }
        this.f96124u.setOnClickListener(new View.OnClickListener() { // from class: l.uva0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f181133a.m122905h0(view2);
            }
        });
        if (m122913f0() || CoreModule.m30934Q().mo68438a().mo134409a()) {
            m122910c0();
            m122926w0(null);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m122916j0(vg60 vg60Var) {
        this.f96115L = vg60Var;
        m122922q0(vg60Var);
        mo53983O().mo53517t1();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m122917k0(Throwable th) {
        this.f96119P = false;
        mo53983O().mo53517t1();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if (wj90.m206620c(mo53983O().mo52252K2()) || f760.INSTANCE.m124362i(mo53983O().userId()) || qap.INSTANCE.m175972j(mo53983O().userId()) || m122912e0(mo53983O().mo52252K2())) {
            return false;
        }
        if (m122920n0()) {
            return true;
        }
        if (mo53983O().mo53254E1() && (((!"from_meet_picks_feed".equals(mo53983O().from()) && !"from_new_meet_picks_feed".equals(mo53983O().from()) && !"from_picks".equals(mo53983O().from()) && !"p_picks_profile".equals(mo53983O().from()) && !"p_picks_profile_card".equals(mo53983O().from()) && !"from_meet_picks_card".equals(mo53983O().from())) || joa.m146358H3()) && !m122911d0())) {
            return this.f96119P;
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m122918l0(Bundle bundle) {
        if (!mo53983O().mo52258P1()) {
            CoreModule.m30932N().mo61528cq(mo53983O().userId(), false, CoreMomentInfo.JSON_ADAPTER, "profile").subscribe(psd0.m173597H(new y20() { // from class: l.xva0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196370a.m122915i0((pf60) obj);
                }
            }, new y20() { // from class: l.yva0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ewa0.m122899V((Throwable) obj);
                }
            }));
        }
        if (!mo53983O().mo53254E1()) {
            this.f96119P = false;
            mo53983O().mo53517t1();
            return;
        }
        if (zbj.m219194a(mo53983O().from())) {
            this.f96119P = true;
        } else if (mo53983O().mo53319O1()) {
            this.f96119P = CoreModule.m30932N().coreMomentHasMoments(mo53983O().userId());
        }
        m168321p().duringCreated(new pcj() { // from class: l.zva0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f206198a.m122906o0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.awa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73721a.m122916j0((vg60) obj);
            }
        }, new y20() { // from class: l.bwa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78693a.m122917k0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m122919m0(View view) {
        m122908v0();
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m122920n0() {
        vg60<CoreMomentInfo> vg60Var;
        return mo53983O().mo52258P1() && !mo53983O().mo53279I1() && (vg60Var = this.f96115L) != null && vg60Var.f184001a.size() == 0;
    }

    /* JADX INFO: renamed from: p0 */
    public void m122921p0() {
        sfj0.m185598e("e_moment", OMSDialogPositon.p_suggest_user_profile_info_view, pf60.m172085a("owner_id", mo53983O().userId()));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m122922q0(vg60<CoreMomentInfo> vg60Var) {
        u11.m193889c();
        boolean z = this.f96119P;
        User userById = CoreModule.m30932N().getUserById(mo53983O().userId());
        if (CoreModule.m30934Q().mo68438a().mo134409a()) {
            userById = CoreModule.m30934Q().getUserById(mo53983O().userId());
        }
        boolean z2 = false;
        if (NullChecker.m82486a(userById) && userById.unilateralBlock()) {
            this.f96119P = false;
        } else if (!m122920n0() && vg60Var.f184001a.size() == 0) {
            if (CoreModule.m30932N().mo61495Rc() && mo53983O().mo52258P1()) {
                z2 = true;
            }
            this.f96119P = z2;
        } else {
            this.f96119P = true;
        }
        if (z != this.f96119P) {
            mo53983O().mo52250J3();
        } else if (z && m168317h()) {
            m122924s0(mo53983O().userId(), vg60Var);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void mo122923r0(boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m122924s0(String str, vg60<CoreMomentInfo> vg60Var) {
        if (vg60Var == null) {
            return;
        }
        if (NullChecker.m82486a(this.f96108E)) {
            this.f96108E.setVisibility(8);
        }
        if (vg60Var.f184001a.size() == 0 && NullChecker.m82486a(this.f96108E) && CoreModule.m30932N().mo61495Rc()) {
            this.f96107D.setVisibility(8);
            this.f96108E.setVisibility(0);
            this.f96112I.setTypeface(null, 1);
            this.f96110G.setTypeface(null, 1);
            String strM155938j = luh.m155938j();
            if (TextUtils.isEmpty(strM155938j)) {
                strM155938j = luh.m155934f();
            }
            this.f96112I.setText(strM155938j);
            this.f96113J.setText(luh.m155937i());
            this.f96110G.setText(luh.m155935g());
            String strM155936h = luh.m155936h();
            if (TextUtils.isEmpty(strM155936h)) {
                uqb0.f180374G.m127138Y0(this.f96109F, dbc0.f87255nk);
            } else {
                uqb0.f180374G.m127115L0(this.f96109F, strM155936h);
            }
            bnl0.m105509E0(this.f96108E, new View.OnClickListener() { // from class: l.wva0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f190933a.m122919m0(view);
                }
            });
            if (this.f96118O) {
                return;
            }
            luh.m155941m(luh.m155939k(), luh.m155938j(), OMSDialogPositon.p_suggest_user_profile_info_view);
            this.f96118O = true;
            return;
        }
        if (!mo53983O().mo53279I1()) {
            mo122923r0(vg60Var.f184001a.size() == 0);
            if (vg60Var.f184001a.size() == 0) {
                m122927x0();
                this.f96107D.setVisibility(8);
                return;
            }
        }
        if (vg60Var.equals(this.f96120Q)) {
            return;
        }
        this.f96107D.setVisibility(0);
        u11.m193889c();
        User userById = CoreModule.m30932N().getUserById(str);
        if (CoreModule.m30934Q().mo68438a().mo134409a()) {
            userById = CoreModule.m30934Q().getUserById(str);
        }
        if (vg60Var.f184001a.size() == 0) {
            this.f96124u.setVisibility(8);
        } else {
            if (NullChecker.m82486a(userById) && userById.unilateralBlock()) {
                this.f96124u.setVisibility(8);
            } else {
                this.f96124u.setVisibility(0);
            }
            this.f96119P = true;
            VDraweeView[] vDraweeViewArr = {this.f96127x, this.f96129z, this.f96105B};
            if (m122913f0() && m122926w0(vg60Var)) {
                m122927x0();
                m122907t0();
                return;
            }
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < vg60Var.f184001a.size(); i2++) {
                for (Media media : vg60Var.f184001a.get(i2).media) {
                    if (i < 3) {
                        if (media instanceof Picture) {
                            bnl0.m105525M0(vDraweeViewArr[i], true);
                            uqb0.f180374G.m127125Q0(vDraweeViewArr[i], ((Picture) media).momentPictureSmall());
                            vDraweeViewArr[i].getHierarchy().mo118277c(null);
                        } else if (media instanceof Video) {
                            Video video = (Video) media;
                            if (NullChecker.m82487b(video.cover) && NullChecker.m82487b(video.cover.url)) {
                                bnl0.m105525M0(vDraweeViewArr[i], true);
                                uqb0.f180374G.m127125Q0(vDraweeViewArr[i], video.cover.momentPictureSmall());
                                vDraweeViewArr[i].getHierarchy().mo118277c(new x0e0(mo53983O().act().getResources().getDrawable(dbc0.f86421Ns), h1e0.f107450g));
                            }
                        }
                        i++;
                    }
                }
            }
            if ("from_guess_liker_result".equals(mo53983O().from()) && i == 0) {
                this.f96124u.setVisibility(8);
            }
            while (i < 3) {
                uqb0.f180374G.m98798o(vDraweeViewArr[i]);
                if (i == 0) {
                    bnl0.m105525M0(vDraweeViewArr[i], false);
                } else {
                    bnl0.m105524M(vDraweeViewArr[i], false);
                }
                i++;
            }
        }
        this.f96120Q = vg60Var;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m122924s0(mo53983O().userId(), this.f96115L);
    }

    /* JADX INFO: renamed from: u0 */
    public void m122925u0(String str) {
        this.f96116M = str;
    }

    /* JADX INFO: renamed from: w0 */
    public final boolean m122926w0(vg60<CoreMomentInfo> vg60Var) {
        String strUserId = mo53983O().userId();
        HashMap map = new HashMap();
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_MOMENT", vg60Var);
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_USER_ID", strUserId);
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_DATA_CLICK", m122909b0());
        map.put("FEED_INSERT_PART_ATTENTION_BUTTON_MOMENT_VIEW_PROCESS", new C16849a());
        return CoreModule.m30932N().useFeedInsertViewProxy(mo53983O().act(), 1, map, this.f96107D, null, null, null, this.f96125v);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m122927x0() {
        m121845Q(this.f96114K, 0);
    }
}
