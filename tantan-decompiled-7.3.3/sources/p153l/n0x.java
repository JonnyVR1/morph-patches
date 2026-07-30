package p153l;

import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public class n0x extends gzw<r0x> {

    /* JADX INFO: renamed from: a */
    public String f139686a;

    /* JADX INFO: renamed from: b */
    public String f139687b;

    public n0x(ner nerVar) {
        super(nerVar);
    }

    @Override // p153l.gzw
    /* JADX INFO: renamed from: g0 */
    public void mo95433g0(MarrySeriesType marrySeriesType, User user) {
        if (marrySeriesType == MarrySeriesType.MATE_AGE) {
            this.f139686a = user.profile.extensions.marriage.mateAge.get(0);
            this.f139687b = user.profile.extensions.marriage.mateAge.get(1);
        } else if (marrySeriesType == MarrySeriesType.MATE_HEIGHT) {
            this.f139686a = user.profile.extensions.marriage.mateHeight.get(0);
            this.f139687b = user.profile.extensions.marriage.mateHeight.get(1);
        }
    }
}
