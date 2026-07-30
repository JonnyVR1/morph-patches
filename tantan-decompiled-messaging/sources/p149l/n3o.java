package p149l;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class n3o extends atu {

    /* JADX INFO: renamed from: l */
    public final List<BLiveSquareTab> f137011l;

    /* JADX INFO: renamed from: m */
    public final LiveHomeEventBus f137012m;

    public n3o(FragmentManager fragmentManager, @NonNull List<BLiveSquareTab> list, int i, int i2, LiveHomeEventBus liveHomeEventBus) {
        super(fragmentManager, true, i, i2);
        this.f137011l = list;
        this.f137012m = liveHomeEventBus;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f137011l.size();
    }

    @Override // p149l.atu
    /* JADX INFO: renamed from: k */
    public LiveVPagerBaseFrag mo98885k(int i) {
        return m3o.INSTANCE.m152949e(this.f137011l.get(i), i == this.f71679h, this.f137012m);
    }
}
