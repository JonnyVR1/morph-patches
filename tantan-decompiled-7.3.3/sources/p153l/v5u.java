package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveTeenagerLive;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class v5u {

    /* JADX INFO: renamed from: a */
    public List<BLiveTeenagerLive> f182568a;

    /* JADX INFO: renamed from: b */
    public Pagination f182569b;

    /* JADX INFO: renamed from: c */
    public boolean f182570c;

    public v5u(List<BLiveTeenagerLive> list, Pagination pagination) {
        ArrayList arrayList = new ArrayList();
        this.f182568a = arrayList;
        this.f182570c = false;
        arrayList.addAll(list);
        this.f182569b = pagination;
    }

    /* JADX INFO: renamed from: a */
    public boolean m199919a() {
        Pagination pagination = this.f182569b;
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m199920b() {
        return jyb.m147479J(this.f182568a);
    }

    /* JADX INFO: renamed from: c */
    public boolean m199921c() {
        boolean z = this.f182570c;
        this.f182570c = false;
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m199922d(@Nullable List<BLiveTeenagerLive> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f182568a.addAll(list);
    }

    /* JADX INFO: renamed from: e */
    public void m199923e(boolean z) {
        this.f182570c = z;
    }

    /* JADX INFO: renamed from: f */
    public void m199924f(Pagination pagination) {
        this.f182569b = pagination;
    }
}
