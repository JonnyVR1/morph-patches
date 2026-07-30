package p153l;

import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public class y0x extends gzw<a1x> {

    /* JADX INFO: renamed from: a */
    public User f197059a;

    public y0x(ner nerVar) {
        super(nerVar);
    }

    @Override // p153l.gzw
    /* JADX INFO: renamed from: g0 */
    public void mo95433g0(MarrySeriesType marrySeriesType, User user) {
        User userMo225055clone = user.mo225055clone();
        this.f197059a = userMo225055clone;
        if (jyb.m147479J(userMo225055clone.profile.extensions.marriage.mateStatus)) {
            this.f197059a.profile.extensions.marriage.mateStatus = jyb.m147507f0("unlimited");
        }
        if (jyb.m147479J(this.f197059a.profile.extensions.marriage.mateAge)) {
            this.f197059a.profile.extensions.marriage.mateAge = jyb.m147507f0("18", "unlimited");
        }
        if (jyb.m147479J(this.f197059a.profile.extensions.marriage.mateQualification)) {
            this.f197059a.profile.extensions.marriage.mateQualification = jyb.m147507f0("unlimited");
        }
        if (jyb.m147479J(this.f197059a.profile.extensions.marriage.mateHeight)) {
            this.f197059a.profile.extensions.marriage.mateHeight = jyb.m147507f0("unlimited", "unlimited");
        }
        if (jyb.m147479J(this.f197059a.profile.extensions.marriage.mateIncome)) {
            this.f197059a.profile.extensions.marriage.mateIncome = jyb.m147507f0("unlimited");
        }
        if (jyb.m147479J(this.f197059a.profile.extensions.marriage.mateAddress)) {
            this.f197059a.profile.extensions.marriage.mateAddress = jyb.m147507f0("different_city");
        }
        if (jyb.m147479J(this.f197059a.profile.extensions.marriage.mateDescription)) {
            this.f197059a.profile.extensions.marriage.mateDescription = jyb.m147507f0("");
        }
    }
}
