package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightMedalTipsView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class w3d0 extends b1d0<RightMedalTipsView> {

    /* JADX INFO: renamed from: e */
    public final List<BLiveRightItem> f184374e;

    /* JADX INFO: renamed from: f */
    public final boolean f184375f;

    public w3d0(List<BLiveRightItem> list, boolean z) {
        this.f184374e = list;
        this.f184375f = z;
    }

    /* JADX INFO: renamed from: H */
    public List<BLiveRightItem> m201279H() {
        return this.f184374e;
    }

    /* JADX INFO: renamed from: I */
    public boolean m201280I() {
        return this.f184375f;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RightMedalTipsView rightMedalTipsView) {
        super.mo70566u(rightMedalTipsView);
        rightMedalTipsView.m70633k(this);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70759v(RightMedalTipsView rightMedalTipsView, @NonNull List<Object> list) {
        super.mo70759v(rightMedalTipsView, list);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162785p1;
    }
}
