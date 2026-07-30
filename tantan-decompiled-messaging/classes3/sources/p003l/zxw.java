package p003l;

import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.data.User;
import l.mcr;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zxw extends hww<byw> {

    /* JADX INFO: renamed from: a */
    public User f9501a;

    public zxw(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo3202g0(MarrySeriesType marrySeriesType, User user) {
        User userClone = user.clone();
        this.f9501a = userClone;
        if (vwb.J(userClone.profile.extensions.marriage.mateStatus)) {
            this.f9501a.profile.extensions.marriage.mateStatus = vwb.f0(new String[]{"unlimited"});
        }
        if (vwb.J(this.f9501a.profile.extensions.marriage.mateAge)) {
            this.f9501a.profile.extensions.marriage.mateAge = vwb.f0(new String[]{"18", "unlimited"});
        }
        if (vwb.J(this.f9501a.profile.extensions.marriage.mateQualification)) {
            this.f9501a.profile.extensions.marriage.mateQualification = vwb.f0(new String[]{"unlimited"});
        }
        if (vwb.J(this.f9501a.profile.extensions.marriage.mateHeight)) {
            this.f9501a.profile.extensions.marriage.mateHeight = vwb.f0(new String[]{"unlimited", "unlimited"});
        }
        if (vwb.J(this.f9501a.profile.extensions.marriage.mateIncome)) {
            this.f9501a.profile.extensions.marriage.mateIncome = vwb.f0(new String[]{"unlimited"});
        }
        if (vwb.J(this.f9501a.profile.extensions.marriage.mateAddress)) {
            this.f9501a.profile.extensions.marriage.mateAddress = vwb.f0(new String[]{"different_city"});
        }
        if (vwb.J(this.f9501a.profile.extensions.marriage.mateDescription)) {
            this.f9501a.profile.extensions.marriage.mateDescription = vwb.f0(new String[]{""});
        }
    }
}
