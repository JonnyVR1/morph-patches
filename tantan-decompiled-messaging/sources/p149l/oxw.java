package p149l;

import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public class oxw extends hww<sxw> {

    /* JADX INFO: renamed from: a */
    public String f146257a;

    /* JADX INFO: renamed from: b */
    public String f146258b;

    public oxw(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p149l.hww
    /* JADX INFO: renamed from: g0 */
    public void mo104384g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            this.f146257a = user.profile.extensions.marriage.mateAge.get(0);
            this.f146258b = user.profile.extensions.marriage.mateAge.get(1);
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            this.f146257a = user.profile.extensions.marriage.mateHeight.get(0);
            this.f146258b = user.profile.extensions.marriage.mateHeight.get(1);
        }
    }
}
