package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.QualificationType;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class gy90 {
    /* JADX INFO: renamed from: a */
    public boolean m132939a(t3m t3mVar, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Studies studies;
        QualificationType qualificationType;
        User userMo52252K2 = t3mVar.mo52252K2();
        Profile profile = userMo52252K2.profile;
        Studies studies2 = profile.studies;
        if (studies2.active) {
            boolean z7 = !TextUtils.isEmpty(studies2.major);
            if (t3mVar.mo52258P1() && NullChecker.m82486a(userMo52252K2.settings) && userMo52252K2.settings.hideSchoolName()) {
                z2 = z7;
                z = true;
                z4 = true;
                z3 = false;
            } else {
                boolean zIsEmpty = TextUtils.isEmpty(profile.studies.school);
                z4 = !zIsEmpty;
                z3 = false;
                z2 = z7;
                z = true;
            }
        } else {
            z = !TextUtils.isEmpty(profile.work.industry);
            z2 = !TextUtils.isEmpty(profile.work.department);
            z3 = !TextUtils.isEmpty(profile.work.company);
            z4 = false;
        }
        if (!IntlCountryCodeController.m29115l() || (((!userMo52252K2.isMe() || userMo52252K2.isFemale()) && userMo52252K2.isMe()) || (!t3mVar.mo52302m0() && ((studies = profile.studies) == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_"))))) {
            z5 = false;
            z6 = false;
        } else {
            z5 = !TextUtils.isEmpty(str);
            z6 = !TextUtils.isEmpty(profile.studies.school);
            if (bsj0.m106252J(profile.studies.qualification)) {
                z3 = false;
            } else {
                z6 = false;
            }
        }
        return z || z3 || z4 || z2 || !TextUtils.isEmpty(profile.hometown) || !TextUtils.isEmpty(profile.hangouts) || z5 || (r43.m179739b() && !jyb.m147479J(profile.extensions.physical.bloodType) && !TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) || z6;
    }
}
