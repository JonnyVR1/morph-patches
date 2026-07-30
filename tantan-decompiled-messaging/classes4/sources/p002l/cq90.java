package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.QualificationType;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.b43;
import l.vwb;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cq90 {
    /* JADX INFO: renamed from: a */
    public boolean m11326a(a1m a1mVar, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Studies studies;
        QualificationType qualificationType;
        User userMo1517K2 = a1mVar.mo1517K2();
        Profile profile = userMo1517K2.profile;
        Studies studies2 = profile.studies;
        if (studies2.active) {
            boolean z7 = !TextUtils.isEmpty(studies2.major);
            if (a1mVar.mo1523P1() && NullChecker.a(userMo1517K2.settings) && userMo1517K2.settings.hideSchoolName()) {
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
        if (!IntlCountryCodeController.l() || (((!userMo1517K2.isMe() || userMo1517K2.isFemale()) && userMo1517K2.isMe()) || (!a1mVar.mo1570m0() && ((studies = profile.studies) == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_"))))) {
            z5 = false;
            z6 = false;
        } else {
            z5 = !TextUtils.isEmpty(str);
            z6 = !TextUtils.isEmpty(profile.studies.school);
            if (yij0.J(profile.studies.qualification)) {
                z3 = false;
            } else {
                z6 = false;
            }
        }
        return z || z3 || z4 || z2 || !TextUtils.isEmpty(profile.hometown) || !TextUtils.isEmpty(profile.hangouts) || z5 || (b43.b() && !vwb.J(profile.extensions.physical.bloodType) && !TEnum.equals((BloodType) profile.extensions.physical.bloodType.get(0), "unknown_")) || z6;
    }
}
