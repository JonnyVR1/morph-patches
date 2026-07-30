package p149l;

import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveRightAnchorInfo;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class x0d0 {

    /* JADX INFO: renamed from: a */
    public List<BLiveRightAnchorInfo> f188963a;

    /* JADX INFO: renamed from: b */
    public Pagination f188964b;

    /* JADX INFO: renamed from: c */
    public boolean f188965c;

    public x0d0(List<BLiveRightAnchorInfo> list, Pagination pagination, boolean z) {
        this.f188963a = list;
        this.f188964b = pagination;
        this.f188965c = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m206606a() {
        return !this.f188965c && vwb.m200296J(this.f188963a);
    }

    /* JADX INFO: renamed from: b */
    public List<BLiveRightAnchorInfo> m206607b() {
        return this.f188963a;
    }

    /* JADX INFO: renamed from: c */
    public Pagination m206608c() {
        return this.f188964b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m206609d() {
        return this.f188965c;
    }
}
