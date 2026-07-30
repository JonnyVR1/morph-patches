package p149l;

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
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.VerificationTagView;
import com.p046p1.mobile.putong.core.newui.home.views.WealthLevelView;
import com.p046p1.mobile.putong.core.p053ui.settings.IntlPersonalDetailsAct;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.p046p1.mobile.putong.core.p053ui.settings.addemoji.AddEmojiAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes4.dex */
public class jg90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public LinearLayout f117734A;

    /* JADX INFO: renamed from: B */
    public VImage f117735B;

    /* JADX INFO: renamed from: C */
    public VImage f117736C;

    /* JADX INFO: renamed from: D */
    public VerificationTagView f117737D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f117738E;

    /* JADX INFO: renamed from: F */
    public VText f117739F;

    /* JADX INFO: renamed from: G */
    public VText f117740G;

    /* JADX INFO: renamed from: H */
    public VImage f117741H;

    /* JADX INFO: renamed from: I */
    public WealthLevelView f117742I;

    /* JADX INFO: renamed from: J */
    public VText f117743J;

    /* JADX INFO: renamed from: K */
    public VText f117744K;

    /* JADX INFO: renamed from: L */
    public VText f117745L;

    /* JADX INFO: renamed from: M */
    public VLinear f117746M;

    /* JADX INFO: renamed from: N */
    public VText_AutoFit f117747N;

    /* JADX INFO: renamed from: O */
    public VLinear f117748O;

    /* JADX INFO: renamed from: P */
    public VImage f117749P;

    /* JADX INFO: renamed from: Q */
    public VText f117750Q;

    /* JADX INFO: renamed from: R */
    public VText f117751R;

    /* JADX INFO: renamed from: S */
    public RelativeLayout f117752S;

    /* JADX INFO: renamed from: T */
    public Runnable f117753T;

    /* JADX INFO: renamed from: U */
    public RecyclerView.AbstractC0582t f117754U;

    /* JADX INFO: renamed from: V */
    public boolean f117755V;

    /* JADX INFO: renamed from: W */
    public ydj f117756W;

    /* JADX INFO: renamed from: u */
    public LinearLayout f117757u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f117758v;

    /* JADX INFO: renamed from: w */
    public VLinear_FillerMeasure f117759w;

    /* JADX INFO: renamed from: x */
    public VText f117760x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f117761y;

    /* JADX INFO: renamed from: z */
    public VImage f117762z;

    /* JADX INFO: renamed from: l.jg90$a */
    public class C17763a extends RecyclerView.AbstractC0582t {
        public C17763a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (jg90.this.f117753T != null) {
                jg90.this.f117753T.run();
            }
        }
    }

    public jg90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f117754U = new C17763a();
        this.f117755V = false;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m141261T() {
    }

    /* JADX INFO: renamed from: Z */
    private Act m141266Z() {
        return mo52800O().act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m141267c0(View view) {
        m141266Z().startActivity(IntlPersonalDetailsAct.INSTANCE.m55003a(mo52800O().act(), "profile"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ Boolean m141268d0(User user) {
        return Boolean.valueOf(mo52800O().mo51075P1() && !mo52800O().mo51119m0());
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: Y */
    public final void m141269Y(View view) {
        kg90.m145886a(this, view);
    }

    /* JADX INFO: renamed from: a0 */
    public String m141270a0(User user) {
        if (!CoreModule.f17545c.f19561E0.m203772B3(user) && u59.m191843n0(user) && NullChecker.m81303a(CoreModule.m29932K().me_()) && !TextUtils.isEmpty(CoreModule.m29932K().me_().location.region.city)) {
            xdl0.m208344M(this.f117739F, false);
            xdl0.m208358V(this.f117740G, t100.m186890d(0.0f));
        }
        return rza.m181733M0(m141266Z(), user);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m141271b0() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m141272e0(boolean z, View view) {
        mo52800O().startActivity(AddEmojiAct.m55231a2(m141266Z(), true, !z, AuthenticationTokenClaims.JSON_KEY_NAME));
        m141266Z().overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m141273f0(View view) {
        zvf0.m220396r("e_profile_page_hide_active_time_button", OMSDialogPositon.p_suggest_user_profile_info_view);
        Intent intent = new Intent(m141266Z(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        mo52800O().startActivity(intent);
    }

    /* JADX INFO: renamed from: g0 */
    public void mo141274g0(boolean z) {
        User userMo51069K2 = mo52800O().mo51069K2();
        final boolean zMo51075P1 = mo52800O().mo51075P1();
        if (userMo51069K2 == null) {
            return;
        }
        xdl0.m208344M(this.f117762z, true);
        this.f117762z.setOnClickListener(new View.OnClickListener() { // from class: l.gg90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102476a.m141272e0(zMo51075P1, view);
            }
        });
        if (vwb.m200296J(userMo51069K2.profile.extensions.interest.emoji)) {
            if (!z) {
                xdl0.m208344M(this.f117762z, false);
            }
            xdl0.m208344M(this.f117761y, false);
            this.f117762z.setImageResource(x2c0.f189997b);
            if (z && zMo51075P1) {
                xdl0.m208344M(this.f117762z, true);
                this.f117762z.post(new Runnable() { // from class: l.hg90
                    @Override // java.lang.Runnable
                    public final void run() {
                        jg90.m141261T();
                    }
                });
                return;
            }
            return;
        }
        xdl0.m208344M(this.f117761y, true);
        qib0.f154691G.m102331L0(this.f117761y, qib0.f154709X.m126254n(userMo51069K2.profile.extensions.interest.emoji.get(0)) + ".png");
        VImage vImage = this.f117762z;
        if (!z) {
            xdl0.m208344M(vImage, false);
        } else {
            xdl0.m208344M(vImage, true);
            this.f117762z.setImageResource(x2c0.f190534rr);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m141275h0(boolean z) {
        xdl0.m208344M(this.f117748O, z);
        this.f117750Q.setText(R$string.f17876K9);
        xdl0.m208329E0(this.f117748O, new View.OnClickListener() { // from class: l.ig90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113087a.m141273f0(view);
            }
        });
        if (!z) {
            if (NullChecker.m81303a(this.f117756W)) {
                this.f117756W.m214281a();
            }
        } else {
            if (!this.f117755V) {
                zvf0.m220402x("e_profile_page_hide_active_time_button", OMSDialogPositon.p_suggest_user_profile_info_view);
                this.f117755V = true;
            }
            if (this.f117756W == null) {
                this.f117756W = new ydj(this.f117749P);
            }
            this.f117756W.m214283c();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m141276i0(User user) {
        boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
        LinearLayout linearLayout = this.f117734A;
        if (zIsPicVerificationVerified) {
            xdl0.m208344M(linearLayout, true);
            xdl0.m208344M(this.f117737D, false);
        } else {
            xdl0.m208344M(linearLayout, false);
            xdl0.m208344M(this.f117737D, false);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        m96409E(this.f117747N, this.f117746M);
        mo52800O().mo52195W().addOnScrollListener(this.f117754U);
        if (!mo52800O().mo51119m0() && !mo52800O().mo51053D2() && !mo52800O().mo51082S()) {
            this.f117757u.setBackgroundResource(w0c0.f183862k1);
        }
        if (mo52800O().mo51119m0()) {
            this.f117757u.setOnClickListener(new View.OnClickListener() { // from class: l.cg90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f80729a.m141267c0(view2);
                }
            });
        }
        if (User.isTeamAccount(mo52800O().userId())) {
            m96420Q(this.f117739F, 8);
            m96420Q(this.f117740G, 8);
            m96420Q(this.f117747N, 8);
        }
        m131821p().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).filter(new w9j() { // from class: l.dg90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86063a.m141268d0((User) obj);
            }
        }).map(new w9j() { // from class: l.eg90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((user.membership.hideActivityTime && user.isVIP()) ? false : true);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.fg90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97341a.m141275h0(((Boolean) obj).booleanValue());
            }
        }));
        if (!mo52800O().mo51119m0()) {
            m96420Q(this.f117751R, 8);
        } else if (b43.m100168b()) {
            this.f117751R.setText(R$string.f17617Bk);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m141277j0(User user) {
        if (!user.superLikedMe() || m141271b0() || xp5.m210477q(user)) {
            this.f117760x.setText(user.name);
            if (vdj.m198002d() && user.isVIP() && !user.gpHideVip() && !user.isHideIconFromSVip()) {
                this.f117760x.setTextColor(m141266Z().color(w0c0.f183790N1));
            }
        } else {
            this.f117760x.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mo52800O().act().getResources().getDrawable(x2c0.f189179Ap), (Drawable) null);
            this.f117760x.setTextColor(Color.parseColor("#03aeff"));
            this.f117760x.setText(user.name);
        }
        this.f117739F.setText(String.valueOf(user.age));
        if (qp8.m175817b()) {
            this.f117742I.m39228u(user.hierarchy, OMSDialogPositon.p_suggest_user_profile_info_view, true, null);
        }
        m141278k0(user, this.f117747N);
        Profile profile = user.profile;
        l7k0.m148809d(this.f117739F, user.gender, user.age.intValue(), false, user);
        if (!b43.m100168b() || vwb.m200296J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "UNKNOWN")) {
            this.f117740G.setText(i0g0.m133869j0(user.profile.zodiac));
            this.f117740G.setBackgroundDrawable(fce.m120425b(i0g0.m133871l0(user.profile.zodiac), t100.m186890d(4.0f)));
        } else {
            this.f117740G.setText(b43.m100167a(profile.extensions.physical.bloodType.get(0)));
            this.f117740G.setBackgroundDrawable(fce.m120425b(i0g0.m133875o(profile.extensions.physical.bloodType.get(0)), t100.m186890d(4.0f)));
        }
        CoreModule.m29935P().m94654e().mo34986o7(m141266Z(), user, this.f117741H, true, false);
        if (!mo52800O().mo51075P1() && !user.isVIP()) {
            this.f117741H.setVisibility(8);
        }
        boolean zMo51075P1 = mo52800O().mo51075P1();
        VText vText = this.f117743J;
        if (zMo51075P1) {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f117744K, false);
        } else {
            l7k0.m148810e(vText, this.f117744K, user, mo52800O().mo52295me(), false);
        }
        if (!b43.m100168b()) {
            xdl0.m208345M0(this.f117740G, true);
            return;
        }
        if (vwb.m200296J(user.profile.extensions.physical.bloodType) || TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "unknown_")) {
            xdl0.m208344M(this.f117740G, false);
            return;
        }
        boolean zEquals = TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "UNKNOWN");
        VText vText2 = this.f117740G;
        if (zEquals) {
            xdl0.m208344M(vText2, false);
        } else {
            xdl0.m208345M0(vText2, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX INFO: renamed from: k0 */
    public void m141278k0(User user, VText_AutoFit vText_AutoFit) {
        String strM141270a0;
        if (NullChecker.m81304b(user.profile) && NullChecker.m81304b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (!studies.active || !studies.verified || TextUtils.isEmpty(studies.school)) {
                strM141270a0 = m141270a0(user);
                if (TextUtils.isEmpty(strM141270a0)) {
                    m96420Q(vText_AutoFit, 8);
                } else {
                    vText_AutoFit.setText(strM141270a0);
                }
            } else if (mo52800O().mo51075P1() && NullChecker.m81303a(user.settings) && user.settings.hideSchoolName()) {
                vText_AutoFit.setText(m141270a0(user));
            } else {
                vText_AutoFit.setText(user.profile.studies.school + "  " + m141270a0(user));
            }
        } else {
            strM141270a0 = m141270a0(user);
            if (TextUtils.isEmpty(strM141270a0)) {
                m96420Q(vText_AutoFit, 8);
            } else {
                vText_AutoFit.setText(strM141270a0);
            }
        }
        vText_AutoFit.m223268p();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public void mo141279l0(User user) {
        m96420Q(this.f117745L, 8);
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f95676Z9, viewGroup, false);
        m141269Y(viewInflate);
        return viewInflate;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        User userM94569i2 = mo52800O().mo51119m0() ? mo52800O().m94569i2() : mo52800O().mo51069K2();
        m141277j0(userM94569i2);
        mo141274g0(mo52800O().mo51119m0());
        mo141279l0(userM94569i2);
        m141276i0(userM94569i2);
        if (jjb0.m141784b()) {
            xdl0.m208344M(this.f117745L, false);
            xdl0.m208344M(this.f117734A, false);
            xdl0.m208344M(this.f117737D, false);
            qib0.f154713b0.f139231b.showUserVerificationLogo(m141266Z(), userM94569i2, this.f117736C);
        }
        if (mo52800O().mo51119m0() || !"home_card".equals(mo52800O().from())) {
            return;
        }
        if ((mo52800O().mo51069K2().superLikedMe() || mo52800O().mo51069K2().letter()) && !xp5.m210477q(mo52800O().mo51069K2())) {
            this.f117760x.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mo52800O().act().getResources().getDrawable(x2c0.f189179Ap), (Drawable) null);
            this.f117760x.setTextColor(Color.parseColor("#03aeff"));
        }
    }
}
