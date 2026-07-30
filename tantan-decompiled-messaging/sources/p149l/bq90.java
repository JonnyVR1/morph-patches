package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.IntlMoreGender;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bq90 extends zp90 {

    /* JADX INFO: renamed from: S */
    public spa0 f76759S;

    /* JADX INFO: renamed from: T */
    public HashMap<View, View> f76760T;

    /* JADX INFO: renamed from: U */
    public String f76761U;

    public bq90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f76759S = new spa0();
        this.f76760T = new HashMap<>();
    }

    @Override // p149l.zp90
    /* JADX INFO: renamed from: f0 */
    public void mo103360f0(int i) {
        super.mo103360f0(i);
        VText vText = this.f76759S.f165773H;
        if (vText != null) {
            vText.setText(R$string.f17857Jk);
        }
    }

    @Override // p149l.zp90
    /* JADX INFO: renamed from: g0 */
    public void mo103361g0(int i) {
        this.f204218C.setHint(i);
        VText vText = this.f76759S.f165770E;
        if (vText != null) {
            if (i == R$string.f18067Qk) {
                vText.setText(R$string.f18037Pk);
            } else if (i == R$string.f17947Mk) {
                vText.setText(R$string.f17917Lk);
            } else if (i == R$string.f18097Rk) {
                vText.setText(R$string.f18127Sk);
            }
        }
    }

    @Override // p149l.zp90
    /* JADX INFO: renamed from: h0 */
    public void mo103362h0(int i) {
        super.mo103362h0(i);
        VText vText = this.f76759S.f165779N;
        if (vText != null) {
            vText.setText(R$string.f18217Vk);
        }
    }

    @Override // p149l.zp90
    /* JADX INFO: renamed from: i0 */
    public void mo103363i0(VText vText) {
        super.mo103363i0(vText);
        m96420Q(vText, vText.getVisibility());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m103364j0(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams.gravity = 16;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m103365k0(String str) {
        this.f76761U = str;
        zvf0.m220368A("e_to_other_profile_drainage_risk_notice", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("risk_userid", mo52800O().userId()));
    }

    @Override // p149l.zp90, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        boolean zIsEmpty = TextUtils.isEmpty(i0g0.m133869j0(mo52800O().mo51069K2().profile.zodiac));
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            this.f204233R = z;
            return true;
        }
        if (TextUtils.isEmpty(mo52800O().mo51069K2().description)) {
            return super.mo52729l();
        }
        this.f204233R = true;
        return true;
    }

    @Override // p149l.zp90, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f96100ya, viewGroup, false);
        this.f76759S.m185350a(viewInflate);
        spa0 spa0Var = this.f76759S;
        this.f204234u = spa0Var.f165792a;
        this.f204235v = spa0Var.f165794b;
        VText vText = spa0Var.f165830t;
        this.f204238y = vText;
        this.f204239z = spa0Var.f165836w;
        this.f204216A = spa0Var.f165842z;
        this.f204217B = spa0Var.f165768C;
        this.f204218C = spa0Var.f165771F;
        this.f204219D = spa0Var.f165774I;
        VText vText2 = spa0Var.f165780O;
        this.f204222G = vText2;
        this.f204224I = spa0Var.f165786U;
        this.f204226K = spa0Var.f165793a0;
        this.f204225J = spa0Var.f165789X;
        this.f204223H = spa0Var.f165783R;
        this.f204227L = spa0Var.f165807h0;
        this.f204228M = spa0Var.f165813k0;
        this.f204229N = spa0Var.f165819n0;
        this.f204230O = spa0Var.f165825q0;
        this.f204231P = spa0Var.f165831t0;
        this.f204232Q = spa0Var.f165837w0;
        this.f204236w = spa0Var.f165812k;
        this.f204237x = spa0Var.f165818n;
        this.f204220E = spa0Var.f165777L;
        this.f204221F = vText2;
        m96409E(vText, spa0Var.f165826r);
        m96409E(this.f204239z, this.f76759S.f165832u);
        m96409E(this.f204216A, this.f76759S.f165838x);
        m96409E(this.f204217B, this.f76759S.f165766A);
        m96409E(this.f204218C, this.f76759S.f165769D);
        m96409E(this.f204219D, this.f76759S.f165772G);
        m96409E(this.f204222G, this.f76759S.f165778M);
        m96409E(this.f204224I, this.f76759S.f165784S);
        m96409E(this.f204226K, this.f76759S.f165790Y);
        m96409E(this.f204225J, this.f76759S.f165787V);
        m96409E(this.f204223H, this.f76759S.f165781P);
        m96409E(this.f204227L, this.f76759S.f165807h0);
        m96409E(this.f204228M, this.f76759S.f165809i0);
        m96409E(this.f204229N, this.f76759S.f165815l0);
        m96409E(this.f204230O, this.f76759S.f165821o0);
        m96409E(this.f204231P, this.f76759S.f165827r0);
        spa0 spa0Var2 = this.f76759S;
        m96409E(spa0Var2.f165805g0, spa0Var2.f165801e0);
        m96409E(this.f204236w, this.f76759S.f165812k);
        m96409E(this.f204237x, this.f76759S.f165818n);
        m96409E(this.f204220E, this.f76759S.f165775J);
        m96409E(this.f204221F, this.f76759S.f165778M);
        m96409E(this.f204232Q, this.f76759S.f165833u0);
        this.f76760T.put(this.f204238y, this.f76759S.f165826r);
        this.f76760T.put(this.f204239z, this.f76759S.f165832u);
        this.f76760T.put(this.f204216A, this.f76759S.f165838x);
        this.f76760T.put(this.f204217B, this.f76759S.f165766A);
        this.f76760T.put(this.f204218C, this.f76759S.f165769D);
        this.f76760T.put(this.f204219D, this.f76759S.f165772G);
        this.f76760T.put(this.f204222G, this.f76759S.f165778M);
        this.f76760T.put(this.f204224I, this.f76759S.f165784S);
        this.f76760T.put(this.f204226K, this.f76759S.f165790Y);
        HashMap<View, View> map = this.f76760T;
        spa0 spa0Var3 = this.f76759S;
        map.put(spa0Var3.f165805g0, spa0Var3.f165801e0);
        this.f76760T.put(this.f204225J, this.f76759S.f165787V);
        this.f76760T.put(this.f204223H, this.f76759S.f165781P);
        this.f76760T.put(this.f204227L, this.f76759S.f165807h0);
        this.f76760T.put(this.f204228M, this.f76759S.f165809i0);
        this.f76760T.put(this.f204229N, this.f76759S.f165815l0);
        this.f76760T.put(this.f204230O, this.f76759S.f165821o0);
        this.f76760T.put(this.f204231P, this.f76759S.f165827r0);
        this.f76760T.put(this.f204236w, this.f76759S.f165812k);
        this.f76760T.put(this.f204237x, this.f76759S.f165818n);
        this.f76760T.put(this.f204220E, this.f76759S.f165775J);
        this.f76760T.put(this.f204221F, this.f76759S.f165778M);
        this.f76760T.put(this.f204232Q, this.f76759S.f165833u0);
        if (IntlCountryCodeController.m28115k() && Network.language().startsWith("ru")) {
            spa0 spa0Var4 = this.f76759S;
            m103364j0(spa0Var4.f165804g, spa0Var4.f165822p, spa0Var4.f165834v, spa0Var4.f165840y, spa0Var4.f165767B, spa0Var4.f165770E, spa0Var4.f165773H, spa0Var4.f165776K, spa0Var4.f165779N, spa0Var4.f165785T, spa0Var4.f165791Z, spa0Var4.f165803f0);
        }
        return viewInflate;
    }

    @Override // p149l.zp90, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        super.mo52731t();
        String strM133869j0 = i0g0.m133869j0(mo52800O().mo51069K2().profile.zodiac);
        Settings settings = mo52800O().mo51069K2().settings;
        boolean z = NullChecker.m81303a(settings) && qib0.f154713b0.f139230a.mo28172rq(settings.getSettingGroup());
        if (z) {
            xdl0.m208344M(this.f76759S.f165796c, settings != null && settings.getSettingGroup().gender.showOnProfile.booleanValue());
            String str = null;
            IntlMoreGender intlMoreGender = settings == null ? null : settings.getSettingGroup().gender;
            IntlGender intlGender = intlMoreGender == null ? null : intlMoreGender.newGender;
            Gender gender = mo52800O().mo51069K2().gender;
            if (!z || intlGender == null) {
                intlGender = IntlGender.get(gender.toString());
            }
            if (intlMoreGender != null && z) {
                str = intlMoreGender.subGender;
            }
            if (str == null) {
                str = "";
            }
            this.f76759S.f165800e.setText(qib0.f154713b0.f139230a.mo28157Lr(intlGender, str));
        }
        if (TextUtils.isEmpty(strM133869j0) || b43.m100168b()) {
            this.f76759S.f165820o.setVisibility(8);
        } else {
            this.f76759S.f165824q.setText(strM133869j0);
            this.f76759S.f165820o.setVisibility(0);
            this.f204234u.setVisibility(0);
        }
        String str2 = mo52800O().mo51069K2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        spa0 spa0Var = this.f76759S;
        if (zIsEmpty) {
            m96420Q(spa0Var.f165801e0, 8);
        } else {
            m96420Q(spa0Var.f165801e0, 0);
            this.f76759S.f165805g0.setText(str2);
        }
        this.f76759S.f165794b.setTypeface(Typeface.DEFAULT_BOLD);
        this.f76759S.f165767B.setText(CoreModule.f17544b.getString(R$string.f18007Ok));
        if (b43.m100168b()) {
            Profile profile = mo52800O().mo51069K2().profile;
            if (!vwb.m200296J(profile.extensions.physical.bloodType) && !TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) {
                xdl0.m208345M0(this.f76759S.f165826r, true);
            }
        }
        if (IntlCountryCodeController.m28114j()) {
            Profile profile2 = mo52800O().mo51069K2().profile;
            if (NullChecker.m81303a(profile2) && NullChecker.m81303a(profile2.extensions) && NullChecker.m81303a(profile2.extensions.basic)) {
                if (!vwb.m200296J(profile2.extensions.basic.ethnicity)) {
                    xdl0.m208344M(this.f76759S.f165808i, true);
                }
                if (!vwb.m200296J(profile2.extensions.basic.language)) {
                    xdl0.m208344M(this.f76759S.f165814l, true);
                }
            }
        }
        Profile profile3 = mo52800O().mo51069K2().profile;
        if (NullChecker.m81303a(profile3) && NullChecker.m81303a(profile3.studies)) {
            boolean zIsEmpty2 = TextUtils.isEmpty(profile3.studies.school);
            spa0 spa0Var2 = this.f76759S;
            if (zIsEmpty2) {
                xdl0.m208344M(spa0Var2.f165778M, false);
            } else {
                xdl0.m208344M(spa0Var2.f165778M, true);
            }
            boolean zEquals = TEnum.equals(profile3.studies.qualification, "unknown_");
            spa0 spa0Var3 = this.f76759S;
            if (zEquals) {
                xdl0.m208344M(spa0Var3.f165775J, false);
            } else {
                xdl0.m208344M(spa0Var3.f165775J, true);
            }
        }
        User userMo51069K2 = mo52800O().mo51069K2();
        if (NullChecker.m81303a(userMo51069K2)) {
            xdl0.m208344M(this.f76759S.f165795b0, true);
            this.f76759S.f165799d0.setText(mqi0.m155942m((long) userMo51069K2.createdTime));
        }
        if (TextUtils.isEmpty(this.f76761U)) {
            return;
        }
        this.f76759S.f165841y0.setText(this.f76761U);
        xdl0.m208344M(this.f76759S.f165839x0, true);
    }
}
