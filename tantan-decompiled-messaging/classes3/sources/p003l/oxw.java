package p003l;

import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.data.User;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class oxw extends hww<sxw> {

    /* JADX INFO: renamed from: a */
    public String f6282a;

    /* JADX INFO: renamed from: b */
    public String f6283b;

    public oxw(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p003l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo3202g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            this.f6282a = (String) user.profile.extensions.marriage.mateAge.get(0);
            this.f6283b = (String) user.profile.extensions.marriage.mateAge.get(1);
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            this.f6282a = (String) user.profile.extensions.marriage.mateHeight.get(0);
            this.f6283b = (String) user.profile.extensions.marriage.mateHeight.get(1);
        }
    }
}
