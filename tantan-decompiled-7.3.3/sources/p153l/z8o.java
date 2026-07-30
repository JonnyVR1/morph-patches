package p153l;

import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class z8o extends ubu {

    /* JADX INFO: renamed from: c */
    public List<LiveSquareBannerBean> f203405c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSuggestLive> f203406d;

    /* JADX INFO: renamed from: e */
    public Pair<View, View> f203407e;

    public z8o(List<BLiveSuggestLive> list, Pagination pagination) {
        super(list, pagination);
        this.f203405c = new ArrayList();
        this.f203407e = null;
    }

    /* JADX INFO: renamed from: F */
    public Pair<View, View> m219012F() {
        return this.f203407e;
    }

    /* JADX INFO: renamed from: G */
    public boolean m219013G() {
        return jyb.m147479J(this.f203405c);
    }

    /* JADX INFO: renamed from: H */
    public void m219014H(Pair<View, View> pair) {
        this.f203407e = pair;
    }
}
