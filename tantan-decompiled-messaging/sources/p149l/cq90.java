package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.QualificationType;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class cq90 {
    /* JADX INFO: renamed from: a */
    public boolean m108235a(a1m a1mVar, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Studies studies;
        QualificationType qualificationType;
        User userMo51069K2 = a1mVar.mo51069K2();
        Profile profile = userMo51069K2.profile;
        Studies studies2 = profile.studies;
        if (studies2.active) {
            boolean z7 = !TextUtils.isEmpty(studies2.major);
            if (a1mVar.mo51075P1() && NullChecker.m81303a(userMo51069K2.settings) && userMo51069K2.settings.hideSchoolName()) {
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
        if (!IntlCountryCodeController.m28116l() || (((!userMo51069K2.isMe() || userMo51069K2.isFemale()) && userMo51069K2.isMe()) || (!a1mVar.mo51119m0() && ((studies = profile.studies) == null || (qualificationType = studies.qualification) == null || TEnum.equals(qualificationType, "unknown_"))))) {
            z5 = false;
            z6 = false;
        } else {
            z5 = !TextUtils.isEmpty(str);
            z6 = !TextUtils.isEmpty(profile.studies.school);
            if (yij0.m214932J(profile.studies.qualification)) {
                z3 = false;
            } else {
                z6 = false;
            }
        }
        return z || z3 || z4 || z2 || !TextUtils.isEmpty(profile.hometown) || !TextUtils.isEmpty(profile.hangouts) || z5 || (b43.m100168b() && !vwb.m200296J(profile.extensions.physical.bloodType) && !TEnum.equals(profile.extensions.physical.bloodType.get(0), "unknown_")) || z6;
    }
}
