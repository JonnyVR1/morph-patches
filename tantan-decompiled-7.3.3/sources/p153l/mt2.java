package p153l;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.IntlMoreGender;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VLinear;

/* JADX INFO: loaded from: classes11.dex */
public class mt2 extends f6l {

    /* JADX INFO: renamed from: f */
    public ExpandedBasicInfoRootLayout f138536f;

    /* JADX INFO: renamed from: g */
    public VLinear f138537g;

    /* JADX INFO: renamed from: h */
    public VText_Medium f138538h;

    /* JADX INFO: renamed from: i */
    public ExpandedCardCommonLabelView f138539i;

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        LabelData labelDataM159950I = m159950I(user);
        if (NullChecker.m82486a(labelDataM159950I)) {
            arrayList.add(labelDataM159950I);
        }
        LabelData labelDataM159949H = m159949H(user);
        if (NullChecker.m82486a(labelDataM159949H)) {
            arrayList.add(labelDataM159949H);
        }
        LabelData labelDataM159954M = m159954M(user);
        if (NullChecker.m82486a(labelDataM159954M)) {
            arrayList.add(labelDataM159954M);
        }
        LabelData labelDataM159946E = m159946E(user);
        if (NullChecker.m82486a(labelDataM159946E)) {
            arrayList.add(labelDataM159946E);
        }
        LabelData labelDataM159958Q = m159958Q(user);
        if (NullChecker.m82486a(labelDataM159958Q)) {
            arrayList.add(labelDataM159958Q);
        }
        LabelData labelDataM159955N = m159955N(user);
        if (NullChecker.m82486a(labelDataM159955N)) {
            arrayList.add(labelDataM159955N);
        } else {
            LabelData labelDataM159953L = m159953L(user);
            if (NullChecker.m82486a(labelDataM159953L)) {
                arrayList.add(labelDataM159953L);
            }
        }
        LabelData labelDataM159947F = m159947F(user);
        if (NullChecker.m82486a(labelDataM159947F)) {
            arrayList.add(labelDataM159947F);
        }
        LabelData labelDataM159948G = m159948G(user);
        if (NullChecker.m82486a(labelDataM159948G)) {
            arrayList.add(labelDataM159948G);
        }
        LabelData labelDataM159957P = m159957P(user);
        if (NullChecker.m82486a(labelDataM159957P)) {
            arrayList.add(labelDataM159957P);
        }
        LabelData labelDataM159952K = m159952K(user);
        if (NullChecker.m82486a(labelDataM159952K)) {
            arrayList.add(labelDataM159952K);
        }
        LabelData labelDataM159951J = m159951J(user);
        if (NullChecker.m82486a(labelDataM159951J)) {
            arrayList.add(labelDataM159951J);
        }
        this.f138539i.m39236d(arrayList);
        bnl0.m105524M(m116952m(), !arrayList.isEmpty());
    }

    /* JADX INFO: renamed from: D */
    public final void m159945D(View view) {
        nt2.m164688a(this, view);
    }

    /* JADX INFO: renamed from: E */
    public LabelData m159946E(User user) {
        if (!r43.m179739b() || jyb.m147479J(user.profile.extensions.physical.bloodType) || TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "unknown_")) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = r43.m179738a(user.profile.extensions.physical.bloodType.get(0));
        labelDataNew_.iconDrawableRes = dbc0.f86262It;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: F */
    public LabelData m159947F(User user) {
        Profile profile = user.profile;
        String str = !profile.studies.active ? profile.work.company : "";
        if (TextUtils.isEmpty(str) || !m159959R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = dbc0.f86294Jt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: G */
    public LabelData m159948G(User user) {
        QualificationType qualificationType;
        Studies studies = user.profile.studies;
        if ((studies == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_")) && TextUtils.isEmpty(user.profile.school)) {
            return null;
        }
        String strM159956O = m159956O(user.profile.studies.qualification);
        if (TextUtils.isEmpty(strM159956O)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = strM159956O;
        labelDataNew_.iconDrawableRes = dbc0.f86582St;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: H */
    public LabelData m159949H(User user) {
        if (!IntlCountryCodeController.m29113j() || jyb.m147479J(user.profile.extensions.basic.ethnicity)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = rpa0.INSTANCE.m182515d(user.profile.extensions.basic.ethnicity);
        labelDataNew_.iconDrawableRes = dbc0.f86326Kt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public LabelData m159950I(User user) {
        boolean zMo29171rq;
        IntlMoreGender intlMoreGender;
        Settings settings = user.settings;
        if (settings == null || !(zMo29171rq = uqb0.f180396b0.f170324a.mo29171rq(settings.getSettingGroup())) || (intlMoreGender = settings.getSettingGroup().gender) == null || !intlMoreGender.showOnProfile.booleanValue()) {
            return null;
        }
        IntlGender intlGender = intlMoreGender.newGender;
        Gender gender = user.gender;
        if (!zMo29171rq || intlGender == null) {
            intlGender = IntlGender.get(gender.toString());
        }
        String str = zMo29171rq ? intlMoreGender.subGender : null;
        if (str == null) {
            str = "";
        }
        String strMo29156Lr = uqb0.f180396b0.f170324a.mo29156Lr(intlGender, str);
        if (TextUtils.isEmpty(strMo29156Lr)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = strMo29156Lr;
        int i = dbc0.f86358Lt;
        if (intlGender.equals(IntlGender.get("male"))) {
            i = dbc0.f86422Nt;
        } else if (intlGender.equals(IntlGender.get("female"))) {
            i = dbc0.f86390Mt;
        }
        labelDataNew_.iconDrawableRes = i;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: J */
    public LabelData m159951J(User user) {
        String str = user.profile.hangouts;
        if (TextUtils.isEmpty(str) || !m159959R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = CoreModule.f18263b.getString(R$string.f18912Uf) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str;
        labelDataNew_.iconDrawableRes = dbc0.f86454Ot;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: K */
    public LabelData m159952K(User user) {
        String str = user.profile.hometown;
        if (TextUtils.isEmpty(str) || !m159959R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = dbc0.f86486Pt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: L */
    public LabelData m159953L(User user) {
        Work work = user.profile.work;
        String str = work.industry;
        String str2 = work.department;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str = str + "·" + str2;
        } else if (TextUtils.isEmpty(str)) {
            str = !TextUtils.isEmpty(str2) ? str2 : "";
        }
        if (TextUtils.isEmpty(str) || !m159959R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = dbc0.f86518Qt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: M */
    public LabelData m159954M(User user) {
        if (!IntlCountryCodeController.m29113j() || jyb.m147479J(user.profile.extensions.basic.language)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = rpa0.INSTANCE.m182516e(user.profile.extensions.basic.language);
        labelDataNew_.iconDrawableRes = dbc0.f86550Rt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    @Nullable
    /* JADX INFO: renamed from: N */
    public LabelData m159955N(User user) {
        Studies studies = user.profile.studies;
        if (!studies.active) {
            return null;
        }
        String str = studies.major;
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = CoreModule.f18263b.getString(R$string.f19684tl);
        if (!TextUtils.isEmpty(str) && m159959R(str)) {
            labelDataNew_.name = CoreModule.f18263b.getString(R$string.f19684tl) + "·" + str;
        }
        labelDataNew_.iconDrawableRes = dbc0.f86518Qt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: O */
    public String m159956O(QualificationType qualificationType) {
        String string = qualificationType.toString();
        string.getClass();
        switch (string) {
            case "MASTER":
                return App.f16088e.getString(R$string.f18576Jb);
            case "BACHELOR":
                return App.f16088e.getString(R$string.f18514Hb);
            case "unknown_":
                return "";
            case "HIGH_SCHOOL":
                return App.f16088e.getString(R$string.f18545Ib);
            case "DOCTOR":
                return App.f16088e.getString(R$string.f18638Lb);
            default:
                return App.f16088e.getString(R$string.f18607Kb);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public LabelData m159957P(User user) {
        String str = user.profile.studies.school;
        if (TextUtils.isEmpty(str) || !m159959R(str)) {
            return null;
        }
        LabelData labelDataNew_ = LabelData.new_();
        labelDataNew_.name = str;
        labelDataNew_.iconDrawableRes = dbc0.f86614Tt;
        labelDataNew_.highlight = false;
        return labelDataNew_;
    }

    /* JADX INFO: renamed from: Q */
    public LabelData m159958Q(User user) {
        int i;
        int i2;
        if (TextUtils.isEmpty(q8g0.m175804j0(user.profile.zodiac)) || r43.m179739b()) {
            return null;
        }
        Application application = App.f16088e;
        String string = user.profile.zodiac.toString();
        string.getClass();
        switch (string) {
            case "aquarius":
                i = com.p051p1.mobile.putong.common.R$string.f18178k3;
                i2 = dbc0.f87239n4;
                break;
            case "capricorn":
                i = com.p051p1.mobile.putong.common.R$string.f18193n3;
                i2 = dbc0.f87206m4;
                break;
            case "cancer":
                i = com.p051p1.mobile.putong.common.R$string.f18188m3;
                i2 = dbc0.f87404s4;
                break;
            case "gemini":
                i = com.p051p1.mobile.putong.common.R$string.f18198o3;
                i2 = dbc0.f87272o4;
                break;
            case "pisces":
                i = com.p051p1.mobile.putong.common.R$string.f18213r3;
                i2 = dbc0.f87371r4;
                break;
            case "taurus":
                i = com.p051p1.mobile.putong.common.R$string.f18228u3;
                i2 = dbc0.f87338q4;
                break;
            case "leo":
                i = com.p051p1.mobile.putong.common.R$string.f18203p3;
                i2 = dbc0.f87437t4;
                break;
            case "aries":
                i = com.p051p1.mobile.putong.common.R$string.f18183l3;
                i2 = dbc0.f87305p4;
                break;
            case "libra":
                i = com.p051p1.mobile.putong.common.R$string.f18208q3;
                i2 = dbc0.f87502v4;
                break;
            case "virgo":
                i = com.p051p1.mobile.putong.common.R$string.f18238w3;
                i2 = dbc0.f87470u4;
                break;
            case "scorpio":
                i = com.p051p1.mobile.putong.common.R$string.f18223t3;
                i2 = dbc0.f87140k4;
                break;
            case "sagittarius":
                i = com.p051p1.mobile.putong.common.R$string.f18218s3;
                i2 = dbc0.f87173l4;
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
    public boolean m159959R(String str) {
        return (TextUtils.equals(str, CoreModule.f18263b.getString(R$string.f19066Zj)) || TextUtils.equals(str, "Temporarily not revealed") || TextUtils.equals(str, "暫不透露") || TextUtils.equals(str, "暂不透露") || TextUtils.equals(str, "不限") || TextUtils.equals(str, "暂无")) ? false : true;
    }

    @Override // p153l.dmf
    /* JADX INFO: renamed from: g */
    public void mo39156g(View view) {
        super.mo39156g(view);
        m159945D(view);
        this.f138539i.m39238f();
    }
}
