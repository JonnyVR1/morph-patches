package p153l;

import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class n2u extends bvu {

    /* JADX INFO: renamed from: l */
    public List<LiveSquareTabBean> f139892l;

    /* JADX INFO: renamed from: m */
    public final LiveHomeEventBus f139893m;

    public n2u(FragmentManager fragmentManager, int i, int i2, LiveHomeEventBus liveHomeEventBus) {
        super(fragmentManager, true, i, i2);
        this.f139892l = new ArrayList();
        this.f139893m = liveHomeEventBus;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f139892l.size();
    }

    @Override // p153l.bvu
    /* JADX INFO: renamed from: k */
    public LiveVPagerBaseFrag mo106611k(int i) {
        return m2u.INSTANCE.m156907d(this.f139892l.get(i), this.f139893m);
    }

    /* JADX INFO: renamed from: l */
    public List<LiveSquareTabBean> m161256l() {
        return this.f139892l;
    }

    /* JADX INFO: renamed from: m */
    public void m161257m(List<LiveSquareTabBean> list) {
        this.f139892l.clear();
        this.f139892l.addAll(list);
        m106610j();
        notifyDataSetChanged();
    }
}
