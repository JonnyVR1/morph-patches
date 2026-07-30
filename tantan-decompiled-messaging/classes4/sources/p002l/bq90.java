package p002l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.IntlMoreGender;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.b43;
import l.f6c0;
import l.i0g0;
import l.j760;
import l.mcr;
import l.mqi0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bq90 extends zp90 {

    /* JADX INFO: renamed from: S */
    public spa0 f8306S;

    /* JADX INFO: renamed from: T */
    public HashMap<View, View> f8307T;

    /* JADX INFO: renamed from: U */
    public String f8308U;

    public bq90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f8306S = new spa0();
        this.f8307T = new HashMap<>();
    }

    @Override // p002l.zp90
    /* JADX INFO: renamed from: f0 */
    public void mo10543f0(int i) {
        super.mo10543f0(i);
        VText vText = this.f8306S.f19161H;
        if (vText != null) {
            vText.setText(R.string.Jk);
        }
    }

    @Override // p002l.zp90
    /* JADX INFO: renamed from: g0 */
    public void mo10544g0(int i) {
        this.f23539C.setHint(i);
        VText vText = this.f8306S.f19158E;
        if (vText != null) {
            if (i == R.string.Qk) {
                vText.setText(R.string.Pk);
            } else if (i == R.string.Mk) {
                vText.setText(R.string.Lk);
            } else if (i == R.string.Rk) {
                vText.setText(R.string.Sk);
            }
        }
    }

    @Override // p002l.zp90
    /* JADX INFO: renamed from: h0 */
    public void mo10545h0(int i) {
        super.mo10545h0(i);
        VText vText = this.f8306S.f19167N;
        if (vText != null) {
            vText.setText(R.string.Vk);
        }
    }

    @Override // p002l.zp90
    /* JADX INFO: renamed from: i0 */
    public void mo10546i0(VText vText) {
        super.mo10546i0(vText);
        m9651Q(vText, vText.getVisibility());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m10547j0(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.gravity = 16;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m10548k0(String str) {
        this.f8308U = str;
        zvf0.A("e_to_other_profile_drainage_risk_notice", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("risk_userid", mo3351O().userId())});
    }

    @Override // p002l.zp90, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        boolean zIsEmpty = TextUtils.isEmpty(i0g0.j0(mo3351O().mo1517K2().profile.zodiac));
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            this.f23554R = z;
            return true;
        }
        if (TextUtils.isEmpty(mo3351O().mo1517K2().description)) {
            return super.mo3280l();
        }
        this.f23554R = true;
        return true;
    }

    @Override // p002l.zp90, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewInflate = mo3351O().mo9267H2().inflate(f6c0.ya, viewGroup, false);
        this.f8306S.m22589a(viewInflate);
        spa0 spa0Var = this.f8306S;
        this.f23555u = spa0Var.f19180a;
        this.f23556v = spa0Var.f19182b;
        VText vText = spa0Var.f19218t;
        this.f23559y = vText;
        this.f23560z = spa0Var.f19224w;
        this.f23537A = spa0Var.f19230z;
        this.f23538B = spa0Var.f19156C;
        this.f23539C = spa0Var.f19159F;
        this.f23540D = spa0Var.f19162I;
        VText vText2 = spa0Var.f19168O;
        this.f23543G = vText2;
        this.f23545I = spa0Var.f19174U;
        this.f23547K = spa0Var.f19181a0;
        this.f23546J = spa0Var.f19177X;
        this.f23544H = spa0Var.f19171R;
        this.f23548L = spa0Var.f19195h0;
        this.f23549M = spa0Var.f19201k0;
        this.f23550N = spa0Var.f19207n0;
        this.f23551O = spa0Var.f19213q0;
        this.f23552P = spa0Var.f19219t0;
        this.f23553Q = spa0Var.f19225w0;
        this.f23557w = spa0Var.f19200k;
        this.f23558x = spa0Var.f19206n;
        this.f23541E = spa0Var.f19165L;
        this.f23542F = vText2;
        m9640E(vText, spa0Var.f19214r);
        m9640E(this.f23560z, this.f8306S.f19220u);
        m9640E(this.f23537A, this.f8306S.f19226x);
        m9640E(this.f23538B, this.f8306S.f19154A);
        m9640E(this.f23539C, this.f8306S.f19157D);
        m9640E(this.f23540D, this.f8306S.f19160G);
        m9640E(this.f23543G, this.f8306S.f19166M);
        m9640E(this.f23545I, this.f8306S.f19172S);
        m9640E(this.f23547K, this.f8306S.f19178Y);
        m9640E(this.f23546J, this.f8306S.f19175V);
        m9640E(this.f23544H, this.f8306S.f19169P);
        m9640E(this.f23548L, this.f8306S.f19195h0);
        m9640E(this.f23549M, this.f8306S.f19197i0);
        m9640E(this.f23550N, this.f8306S.f19203l0);
        m9640E(this.f23551O, this.f8306S.f19209o0);
        m9640E(this.f23552P, this.f8306S.f19215r0);
        spa0 spa0Var2 = this.f8306S;
        m9640E(spa0Var2.f19193g0, spa0Var2.f19189e0);
        m9640E(this.f23557w, this.f8306S.f19200k);
        m9640E(this.f23558x, this.f8306S.f19206n);
        m9640E(this.f23541E, this.f8306S.f19163J);
        m9640E(this.f23542F, this.f8306S.f19166M);
        m9640E(this.f23553Q, this.f8306S.f19221u0);
        this.f8307T.put(this.f23559y, this.f8306S.f19214r);
        this.f8307T.put(this.f23560z, this.f8306S.f19220u);
        this.f8307T.put(this.f23537A, this.f8306S.f19226x);
        this.f8307T.put(this.f23538B, this.f8306S.f19154A);
        this.f8307T.put(this.f23539C, this.f8306S.f19157D);
        this.f8307T.put(this.f23540D, this.f8306S.f19160G);
        this.f8307T.put(this.f23543G, this.f8306S.f19166M);
        this.f8307T.put(this.f23545I, this.f8306S.f19172S);
        this.f8307T.put(this.f23547K, this.f8306S.f19178Y);
        HashMap<View, View> map = this.f8307T;
        spa0 spa0Var3 = this.f8306S;
        map.put(spa0Var3.f19193g0, spa0Var3.f19189e0);
        this.f8307T.put(this.f23546J, this.f8306S.f19175V);
        this.f8307T.put(this.f23544H, this.f8306S.f19169P);
        this.f8307T.put(this.f23548L, this.f8306S.f19195h0);
        this.f8307T.put(this.f23549M, this.f8306S.f19197i0);
        this.f8307T.put(this.f23550N, this.f8306S.f19203l0);
        this.f8307T.put(this.f23551O, this.f8306S.f19209o0);
        this.f8307T.put(this.f23552P, this.f8306S.f19215r0);
        this.f8307T.put(this.f23557w, this.f8306S.f19200k);
        this.f8307T.put(this.f23558x, this.f8306S.f19206n);
        this.f8307T.put(this.f23541E, this.f8306S.f19163J);
        this.f8307T.put(this.f23542F, this.f8306S.f19166M);
        this.f8307T.put(this.f23553Q, this.f8306S.f19221u0);
        if (IntlCountryCodeController.k() && Network.language().startsWith("ru")) {
            spa0 spa0Var4 = this.f8306S;
            m10547j0(spa0Var4.f19192g, spa0Var4.f19210p, spa0Var4.f19222v, spa0Var4.f19228y, spa0Var4.f19155B, spa0Var4.f19158E, spa0Var4.f19161H, spa0Var4.f19164K, spa0Var4.f19167N, spa0Var4.f19173T, spa0Var4.f19179Z, spa0Var4.f19191f0);
        }
        return viewInflate;
    }

    @Override // p002l.zp90, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        super.mo3282t();
        String strJ0 = i0g0.j0(mo3351O().mo1517K2().profile.zodiac);
        Settings settings = mo3351O().mo1517K2().settings;
        boolean z = NullChecker.a(settings) && qib0.b0.a.rq(settings.getSettingGroup());
        if (z) {
            xdl0.M(this.f8306S.f19184c, settings != null && settings.getSettingGroup().gender.showOnProfile.booleanValue());
            String str = null;
            IntlMoreGender intlMoreGender = settings == null ? null : settings.getSettingGroup().gender;
            IntlGender intlGender = intlMoreGender == null ? null : intlMoreGender.newGender;
            Gender gender = mo3351O().mo1517K2().gender;
            if (!z || intlGender == null) {
                intlGender = IntlGender.get(gender.toString());
            }
            if (intlMoreGender != null && z) {
                str = intlMoreGender.subGender;
            }
            if (str == null) {
                str = "";
            }
            this.f8306S.f19188e.setText(qib0.b0.a.Lr(intlGender, str));
        }
        if (TextUtils.isEmpty(strJ0) || b43.b()) {
            this.f8306S.f19208o.setVisibility(8);
        } else {
            this.f8306S.f19212q.setText(strJ0);
            this.f8306S.f19208o.setVisibility(0);
            this.f23555u.setVisibility(0);
        }
        String str2 = mo3351O().mo1517K2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        spa0 spa0Var = this.f8306S;
        if (zIsEmpty) {
            m9651Q(spa0Var.f19189e0, 8);
        } else {
            m9651Q(spa0Var.f19189e0, 0);
            this.f8306S.f19193g0.setText(str2);
        }
        this.f8306S.f19182b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f8306S.f19155B.setText(CoreModule.b.getString(R.string.Ok));
        if (b43.b()) {
            Profile profile = mo3351O().mo1517K2().profile;
            if (!vwb.J(profile.extensions.physical.bloodType) && !TEnum.equals((BloodType) profile.extensions.physical.bloodType.get(0), "unknown_")) {
                xdl0.M0(this.f8306S.f19214r, true);
            }
        }
        if (IntlCountryCodeController.j()) {
            Profile profile2 = mo3351O().mo1517K2().profile;
            if (NullChecker.a(profile2) && NullChecker.a(profile2.extensions) && NullChecker.a(profile2.extensions.basic)) {
                if (!vwb.J(profile2.extensions.basic.ethnicity)) {
                    xdl0.M(this.f8306S.f19196i, true);
                }
                if (!vwb.J(profile2.extensions.basic.language)) {
                    xdl0.M(this.f8306S.f19202l, true);
                }
            }
        }
        Profile profile3 = mo3351O().mo1517K2().profile;
        if (NullChecker.a(profile3) && NullChecker.a(profile3.studies)) {
            boolean zIsEmpty2 = TextUtils.isEmpty(profile3.studies.school);
            spa0 spa0Var2 = this.f8306S;
            if (zIsEmpty2) {
                xdl0.M(spa0Var2.f19166M, false);
            } else {
                xdl0.M(spa0Var2.f19166M, true);
            }
            boolean zEquals = TEnum.equals(profile3.studies.qualification, "unknown_");
            spa0 spa0Var3 = this.f8306S;
            if (zEquals) {
                xdl0.M(spa0Var3.f19163J, false);
            } else {
                xdl0.M(spa0Var3.f19163J, true);
            }
        }
        User userMo1517K2 = mo3351O().mo1517K2();
        if (NullChecker.a(userMo1517K2)) {
            xdl0.M(this.f8306S.f19183b0, true);
            this.f8306S.f19187d0.setText(mqi0.m((long) userMo1517K2.createdTime));
        }
        if (TextUtils.isEmpty(this.f8308U)) {
            return;
        }
        this.f8306S.f19229y0.setText(this.f8308U);
        xdl0.M(this.f8306S.f19227x0, true);
    }
}
