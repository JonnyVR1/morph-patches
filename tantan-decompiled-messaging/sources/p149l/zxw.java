package p149l;

import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public class zxw extends hww<byw> {

    /* JADX INFO: renamed from: a */
    public User f205564a;

    public zxw(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p149l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo104384g0(MarrySeriesType marrySeriesType, User user) {
        User userMo223809clone = user.mo223809clone();
        this.f205564a = userMo223809clone;
        if (vwb.m200296J(userMo223809clone.profile.extensions.marriage.mateStatus)) {
            this.f205564a.profile.extensions.marriage.mateStatus = vwb.m200324f0("unlimited");
        }
        if (vwb.m200296J(this.f205564a.profile.extensions.marriage.mateAge)) {
            this.f205564a.profile.extensions.marriage.mateAge = vwb.m200324f0("18", "unlimited");
        }
        if (vwb.m200296J(this.f205564a.profile.extensions.marriage.mateQualification)) {
            this.f205564a.profile.extensions.marriage.mateQualification = vwb.m200324f0("unlimited");
        }
        if (vwb.m200296J(this.f205564a.profile.extensions.marriage.mateHeight)) {
            this.f205564a.profile.extensions.marriage.mateHeight = vwb.m200324f0("unlimited", "unlimited");
        }
        if (vwb.m200296J(this.f205564a.profile.extensions.marriage.mateIncome)) {
            this.f205564a.profile.extensions.marriage.mateIncome = vwb.m200324f0("unlimited");
        }
        if (vwb.m200296J(this.f205564a.profile.extensions.marriage.mateAddress)) {
            this.f205564a.profile.extensions.marriage.mateAddress = vwb.m200324f0("different_city");
        }
        if (vwb.m200296J(this.f205564a.profile.extensions.marriage.mateDescription)) {
            this.f205564a.profile.extensions.marriage.mateDescription = vwb.m200324f0("");
        }
    }
}
