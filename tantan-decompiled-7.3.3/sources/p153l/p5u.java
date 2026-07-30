package p153l;

import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class p5u extends ubu {

    /* JADX INFO: renamed from: c */
    public List<LiveSquareBannerBean> f150693c;

    /* JADX INFO: renamed from: d */
    public List<BLiveSuggestLive> f150694d;

    /* JADX INFO: renamed from: e */
    public Pair<View, View> f150695e;

    public p5u(List<BLiveSuggestLive> list, Pagination pagination) {
        super(list, pagination);
        this.f150693c = new ArrayList();
        this.f150695e = null;
    }

    /* JADX INFO: renamed from: F */
    public boolean m170682F() {
        return jyb.m147479J(this.f150693c);
    }
}
