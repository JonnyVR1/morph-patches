package p149l;

import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class z6o extends t9u {

    /* JADX INFO: renamed from: c */
    public List<LiveSquareBannerBean> f201940c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSuggestLive> f201941d;

    /* JADX INFO: renamed from: e */
    public Pair<View, View> f201942e;

    public z6o(List<BLiveSuggestLive> list, Pagination pagination) {
        super(list, pagination);
        this.f201940c = new ArrayList();
        this.f201942e = null;
    }

    /* JADX INFO: renamed from: F */
    public Pair<View, View> m217398F() {
        return this.f201942e;
    }

    /* JADX INFO: renamed from: G */
    public boolean m217399G() {
        return vwb.m200296J(this.f201940c);
    }

    /* JADX INFO: renamed from: H */
    public void m217400H(Pair<View, View> pair) {
        this.f201942e = pair;
    }
}
