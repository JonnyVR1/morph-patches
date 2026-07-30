package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fy90 extends dy90 {

    /* JADX INFO: renamed from: S */
    public wxa0 f101352S;

    /* JADX INFO: renamed from: T */
    public HashMap<View, View> f101353T;

    /* JADX INFO: renamed from: U */
    public String f101354U;

    public fy90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f101352S = new wxa0();
        this.f101353T = new HashMap<>();
    }

    @Override // p153l.dy90
    /* JADX INFO: renamed from: f0 */
    public void mo118658f0(int i) {
        super.mo118658f0(i);
        VText vText = this.f101352S.f191399H;
        if (vText != null) {
            vText.setText(R$string.f19252fl);
        }
    }

    @Override // p153l.dy90
    /* JADX INFO: renamed from: g0 */
    public void mo118659g0(int i) {
        this.f91174C.setHint(i);
        VText vText = this.f101352S.f191396E;
        if (vText != null) {
            if (i == R$string.f19467ml) {
                vText.setText(R$string.f19436ll);
            } else if (i == R$string.f19344il) {
                vText.setText(R$string.f19314hl);
            } else if (i == R$string.f19498nl) {
                vText.setText(R$string.f19529ol);
            }
        }
    }

    @Override // p153l.dy90
    /* JADX INFO: renamed from: h0 */
    public void mo118660h0(int i) {
        super.mo118660h0(i);
        VText vText = this.f101352S.f191405N;
        if (vText != null) {
            vText.setText(R$string.f19622rl);
        }
    }

    @Override // p153l.dy90
    /* JADX INFO: renamed from: i0 */
    public void mo118661i0(VText vText) {
        super.mo118661i0(vText);
        m121845Q(vText, vText.getVisibility());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m128077j0(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.gravity = 16;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m128078k0(String str) {
        this.f101354U = str;
        i4g0.m138492A("e_to_other_profile_drainage_risk_notice", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("risk_userid", mo53983O().userId()));
    }

    @Override // p153l.dy90, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        boolean zIsEmpty = TextUtils.isEmpty(q8g0.m175804j0(mo53983O().mo52252K2().profile.zodiac));
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            this.f91189R = z;
            return true;
        }
        if (TextUtils.isEmpty(mo53983O().mo52252K2().description)) {
            return super.mo53912l();
        }
        this.f91189R = true;
        return true;
    }

    @Override // p153l.dy90, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f125411Fa, viewGroup, false);
        this.f101352S.m208395a(viewInflate);
        wxa0 wxa0Var = this.f101352S;
        this.f91190u = wxa0Var.f191418a;
        this.f91191v = wxa0Var.f191420b;
        VText vText = wxa0Var.f191456t;
        this.f91194y = vText;
        this.f91195z = wxa0Var.f191462w;
        this.f91172A = wxa0Var.f191468z;
        this.f91173B = wxa0Var.f191394C;
        this.f91174C = wxa0Var.f191397F;
        this.f91175D = wxa0Var.f191400I;
        VText vText2 = wxa0Var.f191406O;
        this.f91178G = vText2;
        this.f91180I = wxa0Var.f191412U;
        this.f91182K = wxa0Var.f191419a0;
        this.f91181J = wxa0Var.f191415X;
        this.f91179H = wxa0Var.f191409R;
        this.f91183L = wxa0Var.f191433h0;
        this.f91184M = wxa0Var.f191439k0;
        this.f91185N = wxa0Var.f191445n0;
        this.f91186O = wxa0Var.f191451q0;
        this.f91187P = wxa0Var.f191457t0;
        this.f91188Q = wxa0Var.f191463w0;
        this.f91192w = wxa0Var.f191438k;
        this.f91193x = wxa0Var.f191444n;
        this.f91176E = wxa0Var.f191403L;
        this.f91177F = vText2;
        m121834E(vText, wxa0Var.f191452r);
        m121834E(this.f91195z, this.f101352S.f191458u);
        m121834E(this.f91172A, this.f101352S.f191464x);
        m121834E(this.f91173B, this.f101352S.f191392A);
        m121834E(this.f91174C, this.f101352S.f191395D);
        m121834E(this.f91175D, this.f101352S.f191398G);
        m121834E(this.f91178G, this.f101352S.f191404M);
        m121834E(this.f91180I, this.f101352S.f191410S);
        m121834E(this.f91182K, this.f101352S.f191416Y);
        m121834E(this.f91181J, this.f101352S.f191413V);
        m121834E(this.f91179H, this.f101352S.f191407P);
        m121834E(this.f91183L, this.f101352S.f191433h0);
        m121834E(this.f91184M, this.f101352S.f191435i0);
        m121834E(this.f91185N, this.f101352S.f191441l0);
        m121834E(this.f91186O, this.f101352S.f191447o0);
        m121834E(this.f91187P, this.f101352S.f191453r0);
        wxa0 wxa0Var2 = this.f101352S;
        m121834E(wxa0Var2.f191431g0, wxa0Var2.f191427e0);
        m121834E(this.f91192w, this.f101352S.f191438k);
        m121834E(this.f91193x, this.f101352S.f191444n);
        m121834E(this.f91176E, this.f101352S.f191401J);
        m121834E(this.f91177F, this.f101352S.f191404M);
        m121834E(this.f91188Q, this.f101352S.f191459u0);
        this.f101353T.put(this.f91194y, this.f101352S.f191452r);
        this.f101353T.put(this.f91195z, this.f101352S.f191458u);
        this.f101353T.put(this.f91172A, this.f101352S.f191464x);
        this.f101353T.put(this.f91173B, this.f101352S.f191392A);
        this.f101353T.put(this.f91174C, this.f101352S.f191395D);
        this.f101353T.put(this.f91175D, this.f101352S.f191398G);
        this.f101353T.put(this.f91178G, this.f101352S.f191404M);
        this.f101353T.put(this.f91180I, this.f101352S.f191410S);
        this.f101353T.put(this.f91182K, this.f101352S.f191416Y);
        HashMap<View, View> map = this.f101353T;
        wxa0 wxa0Var3 = this.f101352S;
        map.put(wxa0Var3.f191431g0, wxa0Var3.f191427e0);
        this.f101353T.put(this.f91181J, this.f101352S.f191413V);
        this.f101353T.put(this.f91179H, this.f101352S.f191407P);
        this.f101353T.put(this.f91183L, this.f101352S.f191433h0);
        this.f101353T.put(this.f91184M, this.f101352S.f191435i0);
        this.f101353T.put(this.f91185N, this.f101352S.f191441l0);
        this.f101353T.put(this.f91186O, this.f101352S.f191447o0);
        this.f101353T.put(this.f91187P, this.f101352S.f191453r0);
        this.f101353T.put(this.f91192w, this.f101352S.f191438k);
        this.f101353T.put(this.f91193x, this.f101352S.f191444n);
        this.f101353T.put(this.f91176E, this.f101352S.f191401J);
        this.f101353T.put(this.f91177F, this.f101352S.f191404M);
        this.f101353T.put(this.f91188Q, this.f101352S.f191459u0);
        if (IntlCountryCodeController.m29114k() && Network.language().startsWith("ru")) {
            wxa0 wxa0Var4 = this.f101352S;
            m128077j0(wxa0Var4.f191430g, wxa0Var4.f191448p, wxa0Var4.f191460v, wxa0Var4.f191466y, wxa0Var4.f191393B, wxa0Var4.f191396E, wxa0Var4.f191399H, wxa0Var4.f191402K, wxa0Var4.f191405N, wxa0Var4.f191411T, wxa0Var4.f191417Z, wxa0Var4.f191429f0);
        }
        return viewInflate;
    }

    @Override // p153l.dy90, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        super.mo53914t();
        String strM175804j0 = q8g0.m175804j0(mo53983O().mo52252K2().profile.zodiac);
        Settings settings = mo53983O().mo52252K2().settings;
        boolean z = NullChecker.m82486a(settings) && uqb0.f180396b0.f170324a.mo29171rq(settings.getSettingGroup());
        if (z) {
            bnl0.m105524M(this.f101352S.f191422c, settings != null && settings.getSettingGroup().gender.showOnProfile.booleanValue());
            String str = null;
            IntlMoreGender intlMoreGender = settings == null ? null : settings.getSettingGroup().gender;
            IntlGender intlGender = intlMoreGender == null ? null : intlMoreGender.newGender;
            Gender gender = mo53983O().mo52252K2().gender;
            if (!z || intlGender == null) {
                intlGender = IntlGender.get(gender.toString());
            }
            if (intlMoreGender != null && z) {
                str = intlMoreGender.subGender;
            }
            if (str == null) {
                str = "";
            }
            this.f101352S.f191426e.setText(uqb0.f180396b0.f170324a.mo29156Lr(intlGender, str));
        }
        if (TextUtils.isEmpty(strM175804j0) || r43.m179739b()) {
            this.f101352S.f191446o.setVisibility(8);
        } else {
            this.f101352S.f191450q.setText(strM175804j0);
            this.f101352S.f191446o.setVisibility(0);
            this.f91190u.setVisibility(0);
        }
        String str2 = mo53983O().mo52252K2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        wxa0 wxa0Var = this.f101352S;
        if (zIsEmpty) {
            m121845Q(wxa0Var.f191427e0, 8);
        } else {
            m121845Q(wxa0Var.f191427e0, 0);
            this.f101352S.f191431g0.setText(str2);
        }
        this.f101352S.f191420b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f101352S.f191393B.setText(CoreModule.f18263b.getString(R$string.f19405kl));
        if (r43.m179739b()) {
            Profile profile = mo53983O().mo52252K2().profile;
            if (!jyb.m147479J(profile.extensions.physical.bloodType) && !TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
                bnl0.m105525M0(this.f101352S.f191452r, true);
            }
        }
        if (IntlCountryCodeController.m29113j()) {
            Profile profile2 = mo53983O().mo52252K2().profile;
            if (NullChecker.m82486a(profile2) && NullChecker.m82486a(profile2.extensions) && NullChecker.m82486a(profile2.extensions.basic)) {
                if (!jyb.m147479J(profile2.extensions.basic.ethnicity)) {
                    bnl0.m105524M(this.f101352S.f191434i, true);
                }
                if (!jyb.m147479J(profile2.extensions.basic.language)) {
                    bnl0.m105524M(this.f101352S.f191440l, true);
                }
            }
        }
        Profile profile3 = mo53983O().mo52252K2().profile;
        if (NullChecker.m82486a(profile3) && NullChecker.m82486a(profile3.studies)) {
            boolean zIsEmpty2 = TextUtils.isEmpty(profile3.studies.school);
            wxa0 wxa0Var2 = this.f101352S;
            if (zIsEmpty2) {
                bnl0.m105524M(wxa0Var2.f191404M, false);
            } else {
                bnl0.m105524M(wxa0Var2.f191404M, true);
            }
            boolean zEquals = TEnum.equals(profile3.studies.qualification, "unknown_");
            wxa0 wxa0Var3 = this.f101352S;
            if (zEquals) {
                bnl0.m105524M(wxa0Var3.f191401J, false);
            } else {
                bnl0.m105524M(wxa0Var3.f191401J, true);
            }
        }
        User userMo52252K2 = mo53983O().mo52252K2();
        if (NullChecker.m82486a(userMo52252K2)) {
            bnl0.m105524M(this.f101352S.f191421b0, true);
            this.f101352S.f191425d0.setText(pzi0.m174452m((long) userMo52252K2.createdTime));
        }
        if (TextUtils.isEmpty(this.f101354U)) {
            return;
        }
        this.f101352S.f191467y0.setText(this.f101354U);
        bnl0.m105524M(this.f101352S.f191465x0, true);
    }
}
