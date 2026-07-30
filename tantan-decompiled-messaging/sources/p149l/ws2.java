package p149l;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.IntlMoreGender;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class ws2 extends p3l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f187856f;

    /* JADX INFO: renamed from: g */
    public VLinear f187857g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f187858h;

    /* JADX INFO: renamed from: i */
    public ExpandedCardCommonLabelView f187859i;

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        LabelData labelDataM205342I = m205342I(user);
        if (NullChecker.m81303a(labelDataM205342I)) {
            arrayList.add(labelDataM205342I);
        }
        LabelData labelDataM205341H = m205341H(user);
        if (NullChecker.m81303a(labelDataM205341H)) {
            arrayList.add(labelDataM205341H);
        }
        LabelData labelDataM205346M = m205346M(user);
        if (NullChecker.m81303a(labelDataM205346M)) {
            arrayList.add(labelDataM205346M);
        }
        LabelData labelDataM205338E = m205338E(user);
        if (NullChecker.m81303a(labelDataM205338E)) {
            arrayList.add(labelDataM205338E);
        }
        LabelData labelDataM205350Q = m205350Q(user);
        if (NullChecker.m81303a(labelDataM205350Q)) {
            arrayList.add(labelDataM205350Q);
        }
        LabelData labelDataM205347N = m205347N(user);
        if (NullChecker.m81303a(labelDataM205347N)) {
            arrayList.add(labelDataM205347N);
        } else {
            LabelData labelDataM205345L = m205345L(user);
            if (NullChecker.m81303a(labelDataM205345L)) {
                arrayList.add(labelDataM205345L);
            }
        }
        LabelData labelDataM205339F = m205339F(user);
        if (NullChecker.m81303a(labelDataM205339F)) {
            arrayList.add(labelDataM205339F);
        }
        LabelData labelDataM205340G = m205340G(user);
        if (NullChecker.m81303a(labelDataM205340G)) {
            arrayList.add(labelDataM205340G);
        }
        LabelData labelDataM205349P = m205349P(user);
        if (NullChecker.m81303a(labelDataM205349P)) {
            arrayList.add(labelDataM205349P);
        }
        LabelData labelDataM205344K = m205344K(user);
        if (NullChecker.m81303a(labelDataM205344K)) {
            arrayList.add(labelDataM205344K);
        }
        LabelData labelDataM205343J = m205343J(user);
        if (NullChecker.m81303a(labelDataM205343J)) {
            arrayList.add(labelDataM205343J);
        }
        this.f187859i.m38233d(arrayList);
        xdl0.m208344M(m209783m(), !arrayList.isEmpty());
    }

    /* JADX INFO: renamed from: D */
    public final void m205337D(View view) {
        xs2.m210730a(this, view);
    }

    /* JADX INFO: renamed from: E */
    public LabelData m205338E(User user) {
        if (!b43.m100168b() || vwb.m200296J(user.profile.extensions.physical.bloodType) || TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = b43.m100167a(user.profile.extensions.physical.bloodType.get(0));
        labelDataNew_.iconDrawableRes = x2c0.f189777Ts;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: F */
    public LabelData m205339F(User user) {
        Profile profile = user.profile;
        String str = !profile.studies.active ? profile.work.company : "";
        if (TextUtils.isEmpty(str) || !m205351R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = x2c0.f189808Us;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: G */
    public LabelData m205340G(User user) {
        QualificationType qualificationType;
        Studies studies = user.profile.studies;
        if ((studies == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_")) && TextUtils.isEmpty(user.profile.school)) {
            return null;
        }
        String strM205348O = m205348O(user.profile.studies.qualification);
        if (TextUtils.isEmpty(strM205348O)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = strM205348O;
        labelDataNew_.iconDrawableRes = x2c0.f190090dt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: H */
    public LabelData m205341H(User user) {
        if (!IntlCountryCodeController.m28114j() || vwb.m200296J(user.profile.extensions.basic.ethnicity)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = nha0.INSTANCE.m159389d(user.profile.extensions.basic.ethnicity);
        labelDataNew_.iconDrawableRes = x2c0.f189839Vs;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public LabelData m205342I(User user) {
        boolean zMo28172rq;
        IntlMoreGender intlMoreGender;
        Settings settings = user.settings;
        if (settings == null || !(zMo28172rq = qib0.f154713b0.f139230a.mo28172rq(settings.getSettingGroup())) || (intlMoreGender = settings.getSettingGroup().gender) == null || !intlMoreGender.showOnProfile.booleanValue()) {
            return null;
        }
        IntlGender intlGender = intlMoreGender.newGender;
        Gender gender = user.gender;
        if (!zMo28172rq || intlGender == null) {
            intlGender = IntlGender.get(gender.toString());
        }
        String str = zMo28172rq ? intlMoreGender.subGender : null;
        if (str == null) {
            str = "";
        }
        String strMo28157Lr = qib0.f154713b0.f139230a.mo28157Lr(intlGender, str);
        if (TextUtils.isEmpty(strMo28157Lr)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = strMo28157Lr;
        int i = x2c0.f189870Ws;
        if (intlGender.equals(IntlGender.get("male"))) {
            i = x2c0.f189932Ys;
        } else if (intlGender.equals(IntlGender.get("female"))) {
            i = x2c0.f189901Xs;
        }
        labelDataNew_.iconDrawableRes = i;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: J */
    public LabelData m205343J(User user) {
        String str = user.profile.hangouts;
        if (TextUtils.isEmpty(str) || !m205351R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = CoreModule.f17544b.getString(R$string.f17642Cf) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str;
        labelDataNew_.iconDrawableRes = x2c0.f189963Zs;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: K */
    public LabelData m205344K(User user) {
        String str = user.profile.hometown;
        if (TextUtils.isEmpty(str) || !m205351R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = x2c0.f189995at;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: L */
    public LabelData m205345L(User user) {
        Work work = user.profile.work;
        String str = work.industry;
        String str2 = work.department;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str = str + "·" + str2;
        } else if (TextUtils.isEmpty(str)) {
            str = !TextUtils.isEmpty(str2) ? str2 : "";
        }
        if (TextUtils.isEmpty(str) || !m205351R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = x2c0.f190027bt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: M */
    public LabelData m205346M(User user) {
        if (!IntlCountryCodeController.m28114j() || vwb.m200296J(user.profile.extensions.basic.language)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = nha0.INSTANCE.m159390e(user.profile.extensions.basic.language);
        labelDataNew_.iconDrawableRes = x2c0.f190059ct;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    @Nullable
    /* JADX INFO: renamed from: N */
    public LabelData m205347N(User user) {
        Studies studies = user.profile.studies;
        if (!studies.active) {
            return null;
        }
        String str = studies.major;
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = CoreModule.f17544b.getString(R$string.f18277Xk);
        if (!TextUtils.isEmpty(str) && m205351R(str)) {
            labelDataNew_.name = CoreModule.f17544b.getString(R$string.f18277Xk) + "·" + str;
        }
        labelDataNew_.iconDrawableRes = x2c0.f190027bt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: O */
    public String m205348O(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return App.f15369e.getString(R$string.f18970ub);
            case "BACHELOR":
                return App.f15369e.getString(R$string.f18910sb);
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return App.f15369e.getString(R$string.f18940tb);
            case "DOCTOR":
                return App.f15369e.getString(R$string.f19030wb);
            default:
                return App.f15369e.getString(R$string.f19000vb);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public LabelData m205349P(User user) {
        String str = user.profile.studies.school;
        if (TextUtils.isEmpty(str) || !m205351R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = x2c0.f190122et;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: Q */
    public LabelData m205350Q(User user) {
        int i;
        int i2;
        if (TextUtils.isEmpty(i0g0.m133869j0(user.profile.zodiac)) || b43.m100168b()) {
            return null;
        }
        Application application = App.f15369e;
        String string = user.profile.zodiac.toString();
        string.getClass();
        switch (string) {
            case "aquarius":
                i = com.p046p1.mobile.putong.common.R$string.f17459k3;
                i2 = x2c0.f190351m4;
                break;
            case "capricorn":
                i = com.p046p1.mobile.putong.common.R$string.f17474n3;
                i2 = x2c0.f190319l4;
                break;
            case "cancer":
                i = com.p046p1.mobile.putong.common.R$string.f17469m3;
                i2 = x2c0.f190511r4;
                break;
            case "gemini":
                i = com.p046p1.mobile.putong.common.R$string.f17479o3;
                i2 = x2c0.f190383n4;
                break;
            case "pisces":
                i = com.p046p1.mobile.putong.common.R$string.f17494r3;
                i2 = x2c0.f190479q4;
                break;
            case "taurus":
                i = com.p046p1.mobile.putong.common.R$string.f17509u3;
                i2 = x2c0.f190447p4;
                break;
            case "leo":
                i = com.p046p1.mobile.putong.common.R$string.f17484p3;
                i2 = x2c0.f190543s4;
                break;
            case "aries":
                i = com.p046p1.mobile.putong.common.R$string.f17464l3;
                i2 = x2c0.f190415o4;
                break;
            case "libra":
                i = com.p046p1.mobile.putong.common.R$string.f17489q3;
                i2 = x2c0.f190607u4;
                break;
            case "virgo":
                i = com.p046p1.mobile.putong.common.R$string.f17519w3;
                i2 = x2c0.f190575t4;
                break;
            case "scorpio":
                i = com.p046p1.mobile.putong.common.R$string.f17504t3;
                i2 = x2c0.f190255j4;
                break;
            case "sagittarius":
                i = com.p046p1.mobile.putong.common.R$string.f17499s3;
                i2 = x2c0.f190287k4;
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
    public boolean m205351R(String str) {
        return (TextUtils.equals(str, CoreModule.f17544b.getString(R$string.f17676Dj)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    @Override // p149l.xkf
    /* JADX INFO: renamed from: g */
    public void mo38153g(View view) {
        super.mo38153g(view);
        m205337D(view);
        this.f187859i.m38235f();
    }
}
