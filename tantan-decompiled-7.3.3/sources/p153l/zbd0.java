package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightMedalTipsView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class zbd0 extends e9d0<RightMedalTipsView> {

    /* JADX INFO: renamed from: e */
    public final List<BLiveRightItem> f203661e;

    /* JADX INFO: renamed from: f */
    public final boolean f203662f;

    public zbd0(List<BLiveRightItem> list, boolean z) {
        this.f203661e = list;
        this.f203662f = z;
    }

    /* JADX INFO: renamed from: H */
    public List<BLiveRightItem> m219187H() {
        return this.f203661e;
    }

    /* JADX INFO: renamed from: I */
    public boolean m219188I() {
        return this.f203662f;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightMedalTipsView rightMedalTipsView) {
        super.mo71749u(rightMedalTipsView);
        rightMedalTipsView.m71816k(this);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo71942v(RightMedalTipsView rightMedalTipsView, @NonNull List<Object> list) {
        super.mo71942v(rightMedalTipsView, list);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193899p1;
    }
}
