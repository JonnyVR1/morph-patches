package p149l;

import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class m0u extends atu {

    /* JADX INFO: renamed from: l */
    public List<LiveSquareTabBean> f130771l;

    /* JADX INFO: renamed from: m */
    public final LiveHomeEventBus f130772m;

    public m0u(FragmentManager fragmentManager, int i, int i2, LiveHomeEventBus liveHomeEventBus) {
        super(fragmentManager, true, i, i2);
        this.f130771l = new ArrayList();
        this.f130772m = liveHomeEventBus;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f130771l.size();
    }

    @Override // p149l.atu
    /* JADX INFO: renamed from: k */
    public LiveVPagerBaseFrag mo98885k(int i) {
        return l0u.INSTANCE.m148121d(this.f130771l.get(i), this.f130772m);
    }

    /* JADX INFO: renamed from: l */
    public List<LiveSquareTabBean> m152544l() {
        return this.f130771l;
    }

    /* JADX INFO: renamed from: m */
    public void m152545m(List<LiveSquareTabBean> list) {
        this.f130771l.clear();
        this.f130771l.addAll(list);
        m98884j();
        notifyDataSetChanged();
    }
}
