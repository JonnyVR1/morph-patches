package p153l;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class n5o extends bvu {

    /* JADX INFO: renamed from: l */
    public final List<BLiveSquareTab> f140373l;

    /* JADX INFO: renamed from: m */
    public final LiveHomeEventBus f140374m;

    public n5o(FragmentManager fragmentManager, @NonNull List<BLiveSquareTab> list, int i, int i2, LiveHomeEventBus liveHomeEventBus) {
        super(fragmentManager, true, i, i2);
        this.f140373l = list;
        this.f140374m = liveHomeEventBus;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f140373l.size();
    }

    @Override // p153l.bvu
    /* JADX INFO: renamed from: k */
    public LiveVPagerBaseFrag mo106611k(int i) {
        return m5o.INSTANCE.m157112e(this.f140373l.get(i), i == this.f78634h, this.f140374m);
    }
}
