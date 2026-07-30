package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveTeenagerLive;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class u3u {

    /* JADX INFO: renamed from: a */
    public List<BLiveTeenagerLive> f173650a;

    /* JADX INFO: renamed from: b */
    public Pagination f173651b;

    /* JADX INFO: renamed from: c */
    public boolean f173652c;

    public u3u(List<BLiveTeenagerLive> list, Pagination pagination) {
        ArrayList arrayList = new ArrayList();
        this.f173650a = arrayList;
        this.f173652c = false;
        arrayList.addAll(list);
        this.f173651b = pagination;
    }

    /* JADX INFO: renamed from: a */
    public boolean m191619a() {
        Pagination pagination = this.f173651b;
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m191620b() {
        return vwb.m200296J(this.f173650a);
    }

    /* JADX INFO: renamed from: c */
    public boolean m191621c() {
        boolean z = this.f173652c;
        this.f173652c = false;
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m191622d(@Nullable List<BLiveTeenagerLive> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f173650a.addAll(list);
    }

    /* JADX INFO: renamed from: e */
    public void m191623e(boolean z) {
        this.f173652c = z;
    }

    /* JADX INFO: renamed from: f */
    public void m191624f(Pagination pagination) {
        this.f173651b = pagination;
    }
}
