package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseRelationShip;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class v5g {

    /* JADX INFO: renamed from: a */
    public BLiveFanBase f182537a;

    /* JADX INFO: renamed from: b */
    public BLiveFanBaseRelationShip f182538b;

    public v5g(@Nullable List<BLiveFanBase> list, @Nullable List<BLiveFanBaseRelationShip> list2) {
        if (!jyb.m147479J(list)) {
            this.f182537a = list.get(0);
        }
        if (jyb.m147479J(list2)) {
            return;
        }
        this.f182538b = list2.get(0);
    }

    /* JADX INFO: renamed from: a */
    public static v5g m199845a() {
        List list = Collections.EMPTY_LIST;
        return new v5g(list, list);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public BLiveFanBase m199846b() {
        return this.f182537a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m199847c(String str) {
        BLiveFanBaseRelationShip bLiveFanBaseRelationShip = this.f182538b;
        return bLiveFanBaseRelationShip != null && this.f182537a != null && "join".equals(bLiveFanBaseRelationShip.state) && this.f182538b.userId.equals(str) && this.f182538b.anchorId.equals(this.f182537a.anchorId);
    }

    /* JADX INFO: renamed from: d */
    public void m199848d(@Nullable List<BLiveFanBaseRelationShip> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f182538b = list.get(0);
    }
}
