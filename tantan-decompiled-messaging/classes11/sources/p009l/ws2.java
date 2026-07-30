package p009l;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.IntlMoreGender;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Work;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.b43;
import l.nha0;
import l.qib0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.xs2;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ws2 extends p3l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f22293f;

    /* JADX INFO: renamed from: g */
    public VLinear f22294g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f22295h;

    /* JADX INFO: renamed from: i */
    public ExpandedCardCommonLabelView f22296i;

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        LabelData labelDataM24480I = m24480I(user);
        if (NullChecker.a(labelDataM24480I)) {
            arrayList.add(labelDataM24480I);
        }
        LabelData labelDataM24479H = m24479H(user);
        if (NullChecker.a(labelDataM24479H)) {
            arrayList.add(labelDataM24479H);
        }
        LabelData labelDataM24484M = m24484M(user);
        if (NullChecker.a(labelDataM24484M)) {
            arrayList.add(labelDataM24484M);
        }
        LabelData labelDataM24476E = m24476E(user);
        if (NullChecker.a(labelDataM24476E)) {
            arrayList.add(labelDataM24476E);
        }
        LabelData labelDataM24488Q = m24488Q(user);
        if (NullChecker.a(labelDataM24488Q)) {
            arrayList.add(labelDataM24488Q);
        }
        LabelData labelDataM24485N = m24485N(user);
        if (NullChecker.a(labelDataM24485N)) {
            arrayList.add(labelDataM24485N);
        } else {
            LabelData labelDataM24483L = m24483L(user);
            if (NullChecker.a(labelDataM24483L)) {
                arrayList.add(labelDataM24483L);
            }
        }
        LabelData labelDataM24477F = m24477F(user);
        if (NullChecker.a(labelDataM24477F)) {
            arrayList.add(labelDataM24477F);
        }
        LabelData labelDataM24478G = m24478G(user);
        if (NullChecker.a(labelDataM24478G)) {
            arrayList.add(labelDataM24478G);
        }
        LabelData labelDataM24487P = m24487P(user);
        if (NullChecker.a(labelDataM24487P)) {
            arrayList.add(labelDataM24487P);
        }
        LabelData labelDataM24482K = m24482K(user);
        if (NullChecker.a(labelDataM24482K)) {
            arrayList.add(labelDataM24482K);
        }
        LabelData labelDataM24481J = m24481J(user);
        if (NullChecker.a(labelDataM24481J)) {
            arrayList.add(labelDataM24481J);
        }
        this.f22296i.m2211d(arrayList);
        xdl0.M(m24921m(), !arrayList.isEmpty());
    }

    /* JADX INFO: renamed from: D */
    public final void m24475D(View view) {
        xs2.a(this, view);
    }

    /* JADX INFO: renamed from: E */
    public LabelData m24476E(User user) {
        if (!b43.b() || vwb.J(user.profile.extensions.physical.bloodType) || TEnum.equals((BloodType) user.profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = b43.a((BloodType) user.profile.extensions.physical.bloodType.get(0));
        labelDataNew_.iconDrawableRes = x2c0.Ts;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: F */
    public LabelData m24477F(User user) {
        Profile profile = user.profile;
        String str = !profile.studies.active ? profile.work.company : "";
        if (TextUtils.isEmpty(str) || !m24489R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = x2c0.Us;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: G */
    public LabelData m24478G(User user) {
        QualificationType qualificationType;
        Studies studies = user.profile.studies;
        if ((studies == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_")) && TextUtils.isEmpty(user.profile.school)) {
            return null;
        }
        String strM24486O = m24486O(user.profile.studies.qualification);
        if (TextUtils.isEmpty(strM24486O)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = strM24486O;
        labelDataNew_.iconDrawableRes = x2c0.dt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: H */
    public LabelData m24479H(User user) {
        if (!IntlCountryCodeController.j() || vwb.J(user.profile.extensions.basic.ethnicity)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = nha0.INSTANCE.d(user.profile.extensions.basic.ethnicity);
        labelDataNew_.iconDrawableRes = x2c0.Vs;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public LabelData m24480I(User user) {
        boolean zRq;
        IntlMoreGender intlMoreGender;
        Settings settings = user.settings;
        if (settings == null || !(zRq = qib0.b0.a.rq(settings.getSettingGroup())) || (intlMoreGender = settings.getSettingGroup().gender) == null || !intlMoreGender.showOnProfile.booleanValue()) {
            return null;
        }
        IntlGender intlGender = intlMoreGender.newGender;
        Gender gender = user.gender;
        if (!zRq || intlGender == null) {
            intlGender = IntlGender.get(gender.toString());
        }
        String str = zRq ? intlMoreGender.subGender : null;
        if (str == null) {
            str = "";
        }
        String strLr = qib0.b0.a.Lr(intlGender, str);
        if (TextUtils.isEmpty(strLr)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = strLr;
        int i = x2c0.Ws;
        if (intlGender.equals(IntlGender.get("male"))) {
            i = x2c0.Ys;
        } else if (intlGender.equals(IntlGender.get("female"))) {
            i = x2c0.Xs;
        }
        labelDataNew_.iconDrawableRes = i;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: J */
    public LabelData m24481J(User user) {
        String str = user.profile.hangouts;
        if (TextUtils.isEmpty(str) || !m24489R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = CoreModule.b.getString(R.string.Cf) + " " + str;
        labelDataNew_.iconDrawableRes = x2c0.Zs;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: K */
    public LabelData m24482K(User user) {
        String str = user.profile.hometown;
        if (TextUtils.isEmpty(str) || !m24489R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = x2c0.at;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: L */
    public LabelData m24483L(User user) {
        Work work = user.profile.work;
        String str = work.industry;
        String str2 = work.department;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str = str + "·" + str2;
        } else if (TextUtils.isEmpty(str)) {
            str = !TextUtils.isEmpty(str2) ? str2 : "";
        }
        if (TextUtils.isEmpty(str) || !m24489R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = x2c0.bt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: M */
    public LabelData m24484M(User user) {
        if (!IntlCountryCodeController.j() || vwb.J(user.profile.extensions.basic.language)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = nha0.INSTANCE.e(user.profile.extensions.basic.language);
        labelDataNew_.iconDrawableRes = x2c0.ct;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    @Nullable
    /* JADX INFO: renamed from: N */
    public LabelData m24485N(User user) {
        Studies studies = user.profile.studies;
        if (!studies.active) {
            return null;
        }
        String str = studies.major;
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = CoreModule.b.getString(R.string.Xk);
        if (!TextUtils.isEmpty(str) && m24489R(str)) {
            labelDataNew_.name = CoreModule.b.getString(R.string.Xk) + "·" + str;
        }
        labelDataNew_.iconDrawableRes = x2c0.bt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: O */
    public String m24486O(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return App.e.getString(R.string.ub);
            case "BACHELOR":
                return App.e.getString(R.string.sb);
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return App.e.getString(R.string.tb);
            case "DOCTOR":
                return App.e.getString(R.string.wb);
            default:
                return App.e.getString(R.string.vb);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public LabelData m24487P(User user) {
        String str = user.profile.studies.school;
        if (TextUtils.isEmpty(str) || !m24489R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = x2c0.et;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: Q */
    public LabelData m24488Q(User user) {
        int i;
        int i2;
        if (TextUtils.isEmpty(i0g0.m16137j0(user.profile.zodiac)) || b43.b()) {
            return null;
        }
        Application application = App.e;
        String string = user.profile.zodiac.toString();
        string.getClass();
        switch (string) {
            case "aquarius":
                i = com.p1.mobile.putong.common.R.string.k3;
                i2 = x2c0.m4;
                break;
            case "capricorn":
                i = com.p1.mobile.putong.common.R.string.n3;
                i2 = x2c0.l4;
                break;
            case "cancer":
                i = com.p1.mobile.putong.common.R.string.m3;
                i2 = x2c0.r4;
                break;
            case "gemini":
                i = com.p1.mobile.putong.common.R.string.o3;
                i2 = x2c0.n4;
                break;
            case "pisces":
                i = com.p1.mobile.putong.common.R.string.r3;
                i2 = x2c0.q4;
                break;
            case "taurus":
                i = com.p1.mobile.putong.common.R.string.u3;
                i2 = x2c0.p4;
                break;
            case "leo":
                i = com.p1.mobile.putong.common.R.string.p3;
                i2 = x2c0.s4;
                break;
            case "aries":
                i = com.p1.mobile.putong.common.R.string.l3;
                i2 = x2c0.o4;
                break;
            case "libra":
                i = com.p1.mobile.putong.common.R.string.q3;
                i2 = x2c0.u4;
                break;
            case "virgo":
                i = com.p1.mobile.putong.common.R.string.w3;
                i2 = x2c0.t4;
                break;
            case "scorpio":
                i = com.p1.mobile.putong.common.R.string.t3;
                i2 = x2c0.j4;
                break;
            case "sagittarius":
                i = com.p1.mobile.putong.common.R.string.s3;
                i2 = x2c0.k4;
                break;
            default:
                i2 = 0;
                i = -1;
                break;
        }
        if (i == -1) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = application.getResources().getString(i);
        labelDataNew_.iconDrawableRes = i2;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: R */
    public boolean m24489R(String str) {
        return (TextUtils.equals(str, CoreModule.b.getString(R.string.Dj)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    @Override // p009l.xkf
    /* JADX INFO: renamed from: g */
    public void mo2127g(View view) {
        super.mo2127g(view);
        m24475D(view);
        this.f22296i.m2213f();
    }
}
