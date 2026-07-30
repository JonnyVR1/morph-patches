package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallListDetail;
import com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.GiftWallPageView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g2k implements iam<k2k> {

    /* JADX INFO: renamed from: a */
    public final GiftWallPageView f101851a;

    /* JADX INFO: renamed from: b */
    public k2k<rwn0, g2k> f101852b;

    public g2k(Act act) {
        this.f101851a = GiftWallPageView.m78146d0(act.inflater());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f101851a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(k2k k2kVar) {
        this.f101852b = k2kVar;
    }

    /* JADX INFO: renamed from: b */
    public void m128629b() {
        this.f101851a.m78149c0();
    }

    /* JADX INFO: renamed from: c */
    public View m128630c() {
        return this.f101851a;
    }

    /* JADX INFO: renamed from: d */
    public void m128631d(List<BLiveVoiceGiftWallListDetail> list) {
        this.f101851a.setListDate(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m128632r() {
        this.f101851a.m78151f0(this.f101852b);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
