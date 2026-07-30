package p153l;

import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveRightAnchorInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class a9d0 {

    /* JADX INFO: renamed from: a */
    public List<BLiveRightAnchorInfo> f69035a;

    /* JADX INFO: renamed from: b */
    public Pagination f69036b;

    /* JADX INFO: renamed from: c */
    public boolean f69037c;

    public a9d0(List<BLiveRightAnchorInfo> list, Pagination pagination, boolean z) {
        this.f69035a = list;
        this.f69036b = pagination;
        this.f69037c = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m96555a() {
        return !this.f69037c && jyb.m147479J(this.f69035a);
    }

    /* JADX INFO: renamed from: b */
    public List<BLiveRightAnchorInfo> m96556b() {
        return this.f69035a;
    }

    /* JADX INFO: renamed from: c */
    public Pagination m96557c() {
        return this.f69036b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m96558d() {
        return this.f69037c;
    }
}
