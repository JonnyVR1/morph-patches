package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.VerificationTagView;
import com.p051p1.mobile.putong.core.newui.home.views.WealthLevelView;
import com.p051p1.mobile.putong.core.p058ui.settings.IntlPersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.settings.addemoji.AddEmojiAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes4.dex */
public class no90 extends ep90 {

    /* JADX INFO: renamed from: A */
    public LinearLayout f142941A;

    /* JADX INFO: renamed from: B */
    public VImage f142942B;

    /* JADX INFO: renamed from: C */
    public VImage f142943C;

    /* JADX INFO: renamed from: D */
    public VerificationTagView f142944D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f142945E;

    /* JADX INFO: renamed from: F */
    public VText f142946F;

    /* JADX INFO: renamed from: G */
    public VText f142947G;

    /* JADX INFO: renamed from: H */
    public VImage f142948H;

    /* JADX INFO: renamed from: I */
    public WealthLevelView f142949I;

    /* JADX INFO: renamed from: J */
    public VText f142950J;

    /* JADX INFO: renamed from: K */
    public VText f142951K;

    /* JADX INFO: renamed from: L */
    public VText f142952L;

    /* JADX INFO: renamed from: M */
    public VLinear f142953M;

    /* JADX INFO: renamed from: N */
    public VText_AutoFit f142954N;

    /* JADX INFO: renamed from: O */
    public VLinear f142955O;

    /* JADX INFO: renamed from: P */
    public VImage f142956P;

    /* JADX INFO: renamed from: Q */
    public VText f142957Q;

    /* JADX INFO: renamed from: R */
    public VText f142958R;

    /* JADX INFO: renamed from: S */
    public RelativeLayout f142959S;

    /* JADX INFO: renamed from: T */
    public Runnable f142960T;

    /* JADX INFO: renamed from: U */
    public RecyclerView.AbstractC0584t f142961U;

    /* JADX INFO: renamed from: V */
    public boolean f142962V;

    /* JADX INFO: renamed from: W */
    public sgj f142963W;

    /* JADX INFO: renamed from: u */
    public LinearLayout f142964u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f142965v;

    /* JADX INFO: renamed from: w */
    public VLinear_FillerMeasure f142966w;

    /* JADX INFO: renamed from: x */
    public VText f142967x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f142968y;

    /* JADX INFO: renamed from: z */
    public VImage f142969z;

    /* JADX INFO: renamed from: l.no90$a */
    public class C18913a extends RecyclerView.AbstractC0584t {
        public C18913a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (no90.this.f142960T != null) {
                no90.this.f142960T.run();
            }
        }
    }

    public no90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f142961U = new C18913a();
        this.f142962V = false;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m164094T() {
    }

    /* JADX INFO: renamed from: Z */
    private Act m164099Z() {
        return mo53983O().act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m164100c0(View view) {
        m164099Z().startActivity(IntlPersonalDetailsAct.INSTANCE.m56186a(mo53983O().act(), "profile"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ Boolean m164101d0(User user) {
        return Boolean.valueOf(mo53983O().mo52258P1() && !mo53983O().mo52302m0());
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: Y */
    public final void m164102Y(View view) {
        oo90.m168569a(this, view);
    }

    /* JADX INFO: renamed from: a0 */
    public String m164103a0(User user) {
        if (!CoreModule.f18264c.f20303E0.m141060B3(user) && d79.m114701r0(user) && NullChecker.m82486a(CoreModule.m30930K().me_()) && !TextUtils.isEmpty(CoreModule.m30930K().me_().location.region.city)) {
            bnl0.m105524M(this.f142946F, false);
            bnl0.m105538V(this.f142947G, qa00.m175859d(0.0f));
        }
        return e1b.m118955M0(m164099Z(), user);
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m164104b0() {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m164105e0(boolean z, View view) {
        mo53983O().startActivity(AddEmojiAct.m56414b2(m164099Z(), true, !z, AuthenticationTokenClaims.JSON_KEY_NAME));
        m164099Z().overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m164106f0(View view) {
        i4g0.m138520r("e_profile_page_hide_active_time_button", OMSDialogPositon.p_suggest_user_profile_info_view);
        Intent intent = new Intent(m164099Z(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        mo53983O().startActivity(intent);
    }

    /* JADX INFO: renamed from: g0 */
    public void mo99295g0(boolean z) {
        User userMo52252K2 = mo53983O().mo52252K2();
        final boolean zMo52258P1 = mo53983O().mo52258P1();
        if (userMo52252K2 == null) {
            return;
        }
        bnl0.m105524M(this.f142969z, true);
        this.f142969z.setOnClickListener(new View.OnClickListener() { // from class: l.ko90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127705a.m164105e0(zMo52258P1, view);
            }
        });
        if (jyb.m147479J(userMo52252K2.profile.extensions.interest.emoji)) {
            if (!z) {
                bnl0.m105524M(this.f142969z, false);
            }
            bnl0.m105524M(this.f142968y, false);
            this.f142969z.setImageResource(dbc0.f86841b);
            if (z && zMo52258P1) {
                bnl0.m105524M(this.f142969z, true);
                this.f142969z.post(new Runnable() { // from class: l.lo90
                    @Override // java.lang.Runnable
                    public final void run() {
                        no90.m164094T();
                    }
                });
                return;
            }
            return;
        }
        bnl0.m105524M(this.f142968y, true);
        uqb0.f180374G.m127115L0(this.f142968y, uqb0.f180392X.m135325n(userMo52252K2.profile.extensions.interest.emoji.get(0)) + ".png");
        VImage vImage = this.f142969z;
        if (!z) {
            bnl0.m105524M(vImage, false);
        } else {
            bnl0.m105524M(vImage, true);
            this.f142969z.setImageResource(dbc0.f87001fs);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m164107h0(boolean z) {
        bnl0.m105524M(this.f142955O, z);
        this.f142957Q.setText(R$string.f18906U9);
        bnl0.m105509E0(this.f142955O, new View.OnClickListener() { // from class: l.mo90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137800a.m164106f0(view);
            }
        });
        if (!z) {
            if (NullChecker.m82486a(this.f142963W)) {
                this.f142963W.m185781a();
            }
        } else {
            if (!this.f142962V) {
                i4g0.m138526x("e_profile_page_hide_active_time_button", OMSDialogPositon.p_suggest_user_profile_info_view);
                this.f142962V = true;
            }
            if (this.f142963W == null) {
                this.f142963W = new sgj(this.f142956P);
            }
            this.f142963W.m185783c();
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m164108i0(User user) {
        boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
        LinearLayout linearLayout = this.f142941A;
        if (zIsPicVerificationVerified) {
            bnl0.m105524M(linearLayout, true);
            bnl0.m105524M(this.f142944D, false);
        } else {
            bnl0.m105524M(linearLayout, false);
            bnl0.m105524M(this.f142944D, false);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        m121834E(this.f142954N, this.f142953M);
        mo53983O().mo53378W().addOnScrollListener(this.f142961U);
        if (!mo53983O().mo52302m0() && !mo53983O().mo52236D2() && !mo53983O().mo52265S()) {
            this.f142964u.setBackgroundResource(c9c0.f80435l1);
        }
        if (mo53983O().mo52302m0()) {
            this.f142964u.setOnClickListener(new View.OnClickListener() { // from class: l.go90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f105278a.m164100c0(view2);
                }
            });
        }
        if (User.isTeamAccount(mo53983O().userId())) {
            m121845Q(this.f142946F, 8);
            m121845Q(this.f142947G, 8);
            m121845Q(this.f142954N, 8);
        }
        m168321p().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).filter(new qcj() { // from class: l.ho90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f110878a.m164101d0((User) obj);
            }
        }).map(new qcj() { // from class: l.io90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((user.membership.hideActivityTime && user.isVIP()) ? false : true);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.jo90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121979a.m164107h0(((Boolean) obj).booleanValue());
            }
        }));
        if (!mo53983O().mo52302m0()) {
            m121845Q(this.f142958R, 8);
        } else if (r43.m179739b()) {
            this.f142958R.setText(R$string.f19007Xk);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m164109j0(User user) {
        if (!user.superLikedMe() || m164104b0() || br5.m106046q(user)) {
            this.f142967x.setText(user.name);
            if (pgj.m172247d() && user.isVIP() && !user.gpHideVip() && !user.isHideIconFromSVip()) {
                this.f142967x.setTextColor(m164099Z().color(c9c0.f80362O1));
            }
        } else {
            this.f142967x.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mo53983O().act().getResources().getDrawable(dbc0.f87294oq), (Drawable) null);
            this.f142967x.setTextColor(Color.parseColor("#03aeff"));
            this.f142967x.setText(user.name);
        }
        this.f142946F.setText(String.valueOf(user.age));
        if (vq8.m202358b()) {
            this.f142949I.m40231u(user.hierarchy, OMSDialogPositon.p_suggest_user_profile_info_view, true, null);
        }
        m164110k0(user, this.f142954N);
        Profile profile = user.profile;
        rgk0.m181451d(this.f142946F, user.gender, user.age.intValue(), false, user);
        if (!r43.m179739b() || jyb.m147479J(profile.extensions.physical.bloodType) || TEnum.equals(profile.extensions.physical.bloodType.get(0), "UNKNOWN")) {
            this.f142947G.setText(q8g0.m175804j0(user.profile.zodiac));
            this.f142947G.setBackgroundDrawable(jde.m144406b(q8g0.m175806l0(user.profile.zodiac), qa00.m175859d(4.0f)));
        } else {
            this.f142947G.setText(r43.m179738a(profile.extensions.physical.bloodType.get(0)));
            this.f142947G.setBackgroundDrawable(jde.m144406b(q8g0.m175810o(profile.extensions.physical.bloodType.get(0)), qa00.m175859d(4.0f)));
        }
        CoreModule.m30933P().m143408e().mo35989o7(m164099Z(), user, this.f142948H, true, false);
        if (!mo53983O().mo52258P1() && !user.isVIP()) {
            this.f142948H.setVisibility(8);
        }
        boolean zMo52258P1 = mo53983O().mo52258P1();
        VText vText = this.f142950J;
        if (zMo52258P1) {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f142951K, false);
        } else {
            rgk0.m181452e(vText, this.f142951K, user, mo53983O().mo53478me(), false);
        }
        if (!r43.m179739b()) {
            bnl0.m105525M0(this.f142947G, true);
            return;
        }
        if (jyb.m147479J(user.profile.extensions.physical.bloodType) || TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "unknown_")) {
            bnl0.m105524M(this.f142947G, false);
            return;
        }
        boolean zEquals = TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "UNKNOWN");
        VText vText2 = this.f142947G;
        if (zEquals) {
            bnl0.m105524M(vText2, false);
        } else {
            bnl0.m105525M0(vText2, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX INFO: renamed from: k0 */
    public void m164110k0(User user, VText_AutoFit vText_AutoFit) {
        String strM164103a0;
        if (NullChecker.m82487b(user.profile) && NullChecker.m82487b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (!studies.active || !studies.verified || TextUtils.isEmpty(studies.school)) {
                strM164103a0 = m164103a0(user);
                if (TextUtils.isEmpty(strM164103a0)) {
                    m121845Q(vText_AutoFit, 8);
                } else {
                    vText_AutoFit.setText(strM164103a0);
                }
            } else if (mo53983O().mo52258P1() && NullChecker.m82486a(user.settings) && user.settings.hideSchoolName()) {
                vText_AutoFit.setText(m164103a0(user));
            } else {
                vText_AutoFit.setText(user.profile.studies.school + "  " + m164103a0(user));
            }
        } else {
            strM164103a0 = m164103a0(user);
            if (TextUtils.isEmpty(strM164103a0)) {
                m121845Q(vText_AutoFit, 8);
            } else {
                vText_AutoFit.setText(strM164103a0);
            }
        }
        vText_AutoFit.m224514p();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public void mo99296l0(User user) {
        m121845Q(this.f142952L, 8);
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f125849ga, viewGroup, false);
        m164102Y(viewInflate);
        return viewInflate;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        User userM189086i2 = mo53983O().mo52302m0() ? mo53983O().m189086i2() : mo53983O().mo52252K2();
        m164109j0(userM189086i2);
        mo99295g0(mo53983O().mo52302m0());
        mo99296l0(userM189086i2);
        m164108i0(userM189086i2);
        if (nrb0.m164466b()) {
            bnl0.m105524M(this.f142952L, false);
            bnl0.m105524M(this.f142941A, false);
            bnl0.m105524M(this.f142944D, false);
            uqb0.f180396b0.f170325b.showUserVerificationLogo(m164099Z(), userM189086i2, this.f142943C);
        }
        if (mo53983O().mo52302m0() || !"home_card".equals(mo53983O().from())) {
            return;
        }
        if ((mo53983O().mo52252K2().superLikedMe() || mo53983O().mo52252K2().letter()) && !br5.m106046q(mo53983O().mo52252K2())) {
            this.f142967x.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mo53983O().act().getResources().getDrawable(dbc0.f87294oq), (Drawable) null);
            this.f142967x.setTextColor(Color.parseColor("#03aeff"));
        }
    }
}
