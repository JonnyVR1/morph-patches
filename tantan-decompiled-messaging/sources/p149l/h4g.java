package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseRelationShip;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class h4g {

    /* JADX INFO: renamed from: a */
    public BLiveFanBase f105834a;

    /* JADX INFO: renamed from: b */
    public BLiveFanBaseRelationShip f105835b;

    public h4g(@Nullable List<BLiveFanBase> list, @Nullable List<BLiveFanBaseRelationShip> list2) {
        if (!vwb.m200296J(list)) {
            this.f105834a = list.get(0);
        }
        if (vwb.m200296J(list2)) {
            return;
        }
        this.f105835b = list2.get(0);
    }

    /* JADX INFO: renamed from: a */
    public static h4g m129236a() {
        List list = Collections.EMPTY_LIST;
        return new h4g(list, list);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public BLiveFanBase m129237b() {
        return this.f105834a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m129238c(String str) {
        BLiveFanBaseRelationShip bLiveFanBaseRelationShip = this.f105835b;
        return bLiveFanBaseRelationShip != null && this.f105834a != null && "join".equals(bLiveFanBaseRelationShip.state) && this.f105835b.userId.equals(str) && this.f105835b.anchorId.equals(this.f105834a.anchorId);
    }

    /* JADX INFO: renamed from: d */
    public void m129239d(@Nullable List<BLiveFanBaseRelationShip> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f105835b = list.get(0);
    }
}
