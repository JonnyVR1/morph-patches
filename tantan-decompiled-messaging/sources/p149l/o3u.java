package p149l;

import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class o3u extends t9u {

    /* JADX INFO: renamed from: c */
    public List<LiveSquareBannerBean> f141709c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSuggestLive> f141710d;

    /* JADX INFO: renamed from: e */
    public Pair<View, View> f141711e;

    public o3u(List<BLiveSuggestLive> list, Pagination pagination) {
        super(list, pagination);
        this.f141709c = new ArrayList();
        this.f141711e = null;
    }

    /* JADX INFO: renamed from: F */
    public boolean m162488F() {
        return vwb.m200296J(this.f141709c);
    }
}
