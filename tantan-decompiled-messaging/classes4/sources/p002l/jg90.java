package p002l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.newui.home.VerificationTagView;
import com.p1.mobile.putong.core.newui.home.views.WealthLevelView;
import com.p1.mobile.putong.core.ui.settings.IntlPersonalDetailsAct;
import com.p1.mobile.putong.core.ui.settings.SettingsFragOld;
import com.p1.mobile.putong.core.ui.settings.addemoji.AddEmojiAct;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.b43;
import l.d30;
import l.e30;
import l.f6c0;
import l.fce;
import l.i0g0;
import l.jjb0;
import l.kg90;
import l.l7k0;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.qp8;
import l.rza;
import l.rzb0;
import l.t100;
import l.u59;
import l.vdj;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xp5;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VLinear_FillerMeasure;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jg90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public LinearLayout f13731A;

    /* JADX INFO: renamed from: B */
    public VImage f13732B;

    /* JADX INFO: renamed from: C */
    public VImage f13733C;

    /* JADX INFO: renamed from: D */
    public VerificationTagView f13734D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f13735E;

    /* JADX INFO: renamed from: F */
    public VText f13736F;

    /* JADX INFO: renamed from: G */
    public VText f13737G;

    /* JADX INFO: renamed from: H */
    public VImage f13738H;

    /* JADX INFO: renamed from: I */
    public WealthLevelView f13739I;

    /* JADX INFO: renamed from: J */
    public VText f13740J;

    /* JADX INFO: renamed from: K */
    public VText f13741K;

    /* JADX INFO: renamed from: L */
    public VText f13742L;

    /* JADX INFO: renamed from: M */
    public VLinear f13743M;

    /* JADX INFO: renamed from: N */
    public VText_AutoFit f13744N;

    /* JADX INFO: renamed from: O */
    public VLinear f13745O;

    /* JADX INFO: renamed from: P */
    public VImage f13746P;

    /* JADX INFO: renamed from: Q */
    public VText f13747Q;

    /* JADX INFO: renamed from: R */
    public VText f13748R;

    /* JADX INFO: renamed from: S */
    public RelativeLayout f13749S;

    /* JADX INFO: renamed from: T */
    public Runnable f13750T;

    /* JADX INFO: renamed from: U */
    public RecyclerView.t f13751U;

    /* JADX INFO: renamed from: V */
    public boolean f13752V;

    /* JADX INFO: renamed from: W */
    public ydj f13753W;

    /* JADX INFO: renamed from: u */
    public LinearLayout f13754u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f13755v;

    /* JADX INFO: renamed from: w */
    public VLinear_FillerMeasure f13756w;

    /* JADX INFO: renamed from: x */
    public VText f13757x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f13758y;

    /* JADX INFO: renamed from: z */
    public VImage f13759z;

    /* JADX INFO: renamed from: l.jg90$a */
    public class C0633a extends RecyclerView.t {
        public C0633a() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (jg90.this.f13750T != null) {
                jg90.this.f13750T.run();
            }
        }
    }

    public jg90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f13751U = new C0633a();
        this.f13752V = false;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m15883T() {
    }

    /* JADX INFO: renamed from: Z */
    private Act m15888Z() {
        return mo3351O().act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m15889c0(View view) {
        m15888Z().startActivity(IntlPersonalDetailsAct.Companion.a(mo3351O().act(), "profile"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ Boolean m15890d0(User user) {
        return Boolean.valueOf(mo3351O().mo1523P1() && !mo3351O().mo1570m0());
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: Y */
    public final void m15891Y(View view) {
        kg90.a(this, view);
    }

    /* JADX INFO: renamed from: a0 */
    public String m15892a0(User user) {
        if (!CoreModule.c.E0.B3(user) && u59.n0(user) && NullChecker.a(CoreModule.K().me_()) && !TextUtils.isEmpty(CoreModule.K().me_().location.region.city)) {
            xdl0.M(this.f13736F, false);
            xdl0.V(this.f13737G, t100.d(0.0f));
        }
        return rza.M0(m15888Z(), user);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m15893b0() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m15894e0(boolean z, View view) {
        mo3351O().startActivity(AddEmojiAct.a2(m15888Z(), true, !z, "name"));
        m15888Z().overridePendingTransition(rzb0.y, rzb0.q);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m15895f0(View view) {
        zvf0.r("e_profile_page_hide_active_time_button", "p_suggest_user_profile_info_view");
        Intent intent = new Intent((Context) m15888Z(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        mo3351O().startActivity(intent);
    }

    /* JADX INFO: renamed from: g0 */
    public void mo15896g0(boolean z) {
        User userMo1517K2 = mo3351O().mo1517K2();
        final boolean zMo1523P1 = mo3351O().mo1523P1();
        if (userMo1517K2 == null) {
            return;
        }
        xdl0.M(this.f13759z, true);
        this.f13759z.setOnClickListener(new View.OnClickListener() { // from class: l.gg90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11401a.m15894e0(zMo1523P1, view);
            }
        });
        if (vwb.J(userMo1517K2.profile.extensions.interest.emoji)) {
            if (!z) {
                xdl0.M(this.f13759z, false);
            }
            xdl0.M(this.f13758y, false);
            this.f13759z.setImageResource(x2c0.b);
            if (z && zMo1523P1) {
                xdl0.M(this.f13759z, true);
                this.f13759z.post(new Runnable() { // from class: l.hg90
                    @Override // java.lang.Runnable
                    public final void run() {
                        jg90.m15883T();
                    }
                });
                return;
            }
            return;
        }
        xdl0.M(this.f13758y, true);
        qib0.G.L0(this.f13758y, qib0.X.n((String) userMo1517K2.profile.extensions.interest.emoji.get(0)) + ".png");
        VImage vImage = this.f13759z;
        if (!z) {
            xdl0.M(vImage, false);
        } else {
            xdl0.M(vImage, true);
            this.f13759z.setImageResource(x2c0.rr);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m15897h0(boolean z) {
        xdl0.M(this.f13745O, z);
        this.f13747Q.setText(R.string.K9);
        xdl0.E0(this.f13745O, new View.OnClickListener() { // from class: l.ig90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13225a.m15895f0(view);
            }
        });
        if (!z) {
            if (NullChecker.a(this.f13753W)) {
                this.f13753W.m26654a();
            }
        } else {
            if (!this.f13752V) {
                zvf0.x("e_profile_page_hide_active_time_button", "p_suggest_user_profile_info_view");
                this.f13752V = true;
            }
            if (this.f13753W == null) {
                this.f13753W = new ydj(this.f13746P);
            }
            this.f13753W.m26656c();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m15898i0(User user) {
        boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
        LinearLayout linearLayout = this.f13731A;
        if (zIsPicVerificationVerified) {
            xdl0.M(linearLayout, true);
            xdl0.M(this.f13734D, false);
        } else {
            xdl0.M(linearLayout, false);
            xdl0.M(this.f13734D, false);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        m9640E(this.f13744N, this.f13743M);
        mo3351O().mo2724W().addOnScrollListener(this.f13751U);
        if (!mo3351O().mo1570m0() && !mo3351O().mo1501D2() && !mo3351O().mo1530S()) {
            this.f13754u.setBackgroundResource(w0c0.k1);
        }
        if (mo3351O().mo1570m0()) {
            this.f13754u.setOnClickListener(new View.OnClickListener() { // from class: l.cg90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8657a.m15889c0(view2);
                }
            });
        }
        if (User.isTeamAccount(mo3351O().userId())) {
            m9651Q(this.f13736F, 8);
            m9651Q(this.f13737G, 8);
            m9651Q(this.f13744N, 8);
        }
        m14461p().duringCreated(CoreModule.c.e0.o9()).filter(new w9j() { // from class: l.dg90
            public final Object call(Object obj) {
                return this.f9208a.m15890d0((User) obj);
            }
        }).map(new w9j() { // from class: l.eg90
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((user.membership.hideActivityTime && user.isVIP()) ? false : true);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.fg90
            public final void call(Object obj) {
                this.f10326a.m15897h0(((Boolean) obj).booleanValue());
            }
        }));
        if (!mo3351O().mo1570m0()) {
            m9651Q(this.f13748R, 8);
        } else if (b43.b()) {
            this.f13748R.setText(R.string.Bk);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m15899j0(User user) {
        if (!user.superLikedMe() || m15893b0() || xp5.q(user)) {
            this.f13757x.setText(user.name);
            if (vdj.d() && user.isVIP() && !user.gpHideVip() && !user.isHideIconFromSVip()) {
                this.f13757x.setTextColor(m15888Z().color(w0c0.N1));
            }
        } else {
            this.f13757x.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mo3351O().act().getResources().getDrawable(x2c0.Ap), (Drawable) null);
            this.f13757x.setTextColor(Color.parseColor("#03aeff"));
            this.f13757x.setText(user.name);
        }
        this.f13736F.setText(String.valueOf(user.age));
        if (qp8.b()) {
            this.f13739I.u(user.hierarchy, "p_suggest_user_profile_info_view", true, (d30) null);
        }
        m15900k0(user, this.f13744N);
        Profile profile = user.profile;
        l7k0.d(this.f13736F, user.gender, user.age.intValue(), false, user);
        if (!b43.b() || vwb.J(profile.extensions.physical.bloodType) || TEnum.equals((BloodType) profile.extensions.physical.bloodType.get(0), "UNKNOWN")) {
            this.f13737G.setText(i0g0.j0(user.profile.zodiac));
            this.f13737G.setBackgroundDrawable(fce.b(i0g0.l0(user.profile.zodiac), t100.d(4.0f)));
        } else {
            this.f13737G.setText(b43.a((BloodType) profile.extensions.physical.bloodType.get(0)));
            this.f13737G.setBackgroundDrawable(fce.b(i0g0.o((BloodType) profile.extensions.physical.bloodType.get(0)), t100.d(4.0f)));
        }
        CoreModule.P().e().o7(m15888Z(), user, this.f13738H, true, false);
        if (!mo3351O().mo1523P1() && !user.isVIP()) {
            this.f13738H.setVisibility(8);
        }
        boolean zMo1523P1 = mo3351O().mo1523P1();
        VText vText = this.f13740J;
        if (zMo1523P1) {
            xdl0.M(vText, false);
            xdl0.M(this.f13741K, false);
        } else {
            l7k0.e(vText, this.f13741K, user, mo3351O().mo2827me(), false);
        }
        if (!b43.b()) {
            xdl0.M0(this.f13737G, true);
            return;
        }
        if (vwb.J(user.profile.extensions.physical.bloodType) || TEnum.equals((BloodType) user.profile.extensions.physical.bloodType.get(0), "unknown_")) {
            xdl0.M(this.f13737G, false);
            return;
        }
        boolean zEquals = TEnum.equals((BloodType) user.profile.extensions.physical.bloodType.get(0), "UNKNOWN");
        VText vText2 = this.f13737G;
        if (zEquals) {
            xdl0.M(vText2, false);
        } else {
            xdl0.M0(vText2, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX INFO: renamed from: k0 */
    public void m15900k0(User user, VText_AutoFit vText_AutoFit) {
        String strM15892a0;
        if (NullChecker.b(user.profile) && NullChecker.b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (!studies.active || !studies.verified || TextUtils.isEmpty(studies.school)) {
                strM15892a0 = m15892a0(user);
                if (TextUtils.isEmpty(strM15892a0)) {
                    m9651Q(vText_AutoFit, 8);
                } else {
                    vText_AutoFit.setText(strM15892a0);
                }
            } else if (mo3351O().mo1523P1() && NullChecker.a(user.settings) && user.settings.hideSchoolName()) {
                vText_AutoFit.setText(m15892a0(user));
            } else {
                vText_AutoFit.setText(user.profile.studies.school + "  " + m15892a0(user));
            }
        } else {
            strM15892a0 = m15892a0(user);
            if (TextUtils.isEmpty(strM15892a0)) {
                m9651Q(vText_AutoFit, 8);
            } else {
                vText_AutoFit.setText(strM15892a0);
            }
        }
        vText_AutoFit.p();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public void mo15901l0(User user) {
        m9651Q(this.f13742L, 8);
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewInflate = mo3351O().mo9267H2().inflate(f6c0.Z9, viewGroup, false);
        m15891Y(viewInflate);
        return viewInflate;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        User userM9268i2 = mo3351O().mo1570m0() ? mo3351O().m9268i2() : mo3351O().mo1517K2();
        m15899j0(userM9268i2);
        mo15896g0(mo3351O().mo1570m0());
        mo15901l0(userM9268i2);
        m15898i0(userM9268i2);
        if (jjb0.b()) {
            xdl0.M(this.f13742L, false);
            xdl0.M(this.f13731A, false);
            xdl0.M(this.f13734D, false);
            qib0.b0.b.showUserVerificationLogo(m15888Z(), userM9268i2, this.f13733C);
        }
        if (mo3351O().mo1570m0() || !"home_card".equals(mo3351O().from())) {
            return;
        }
        if ((mo3351O().mo1517K2().superLikedMe() || mo3351O().mo1517K2().letter()) && !xp5.q(mo3351O().mo1517K2())) {
            this.f13757x.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mo3351O().act().getResources().getDrawable(x2c0.Ap), (Drawable) null);
            this.f13757x.setTextColor(Color.parseColor("#03aeff"));
        }
    }
}
