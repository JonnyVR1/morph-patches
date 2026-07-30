package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.other.side.LiveSiderLiveItemView;

/* JADX INFO: loaded from: classes5.dex */
public class zxt extends z0u<LiveSiderLiveItemView> {

    /* JADX INFO: renamed from: j */
    public final String f206518j;

    public zxt(@NonNull BLiveSuggestLive bLiveSuggestLive, String str, int i) {
        super(bLiveSuggestLive, null, 1, i);
        this.f206518j = str;
    }

    @Override // p153l.z0u, p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        return false;
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: K */
    public BLiveTrackShowLabel mo103115K() {
        if (xau.m209914x(this.f202383a.anchor.location) == null) {
            return null;
        }
        BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
        bLiveTrackShowLabelNew_.room_name = this.f202383a.room.title;
        return bLiveTrackShowLabelNew_;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo72182m(LiveSiderLiveItemView liveSiderLiveItemView) {
        super.mo72182m(liveSiderLiveItemView);
        liveSiderLiveItemView.f52115b.setClipChildren(false);
        bnl0.m105507D0(qa00.m175859d(140.0f), liveSiderLiveItemView.f52115b.getTextureView());
        ynp0.m216936m(liveSiderLiveItemView.f52114a, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: T */
    public String m222074T() {
        return this.f206518j;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LiveSiderLiveItemView liveSiderLiveItemView) {
        String string;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor;
        super.mo71749u(liveSiderLiveItemView);
        if (TextUtils.isEmpty(this.f202383a.room.coverUrl)) {
            bnl0.m105525M0(liveSiderLiveItemView.f52115b, false);
        } else {
            bnl0.m105525M0(liveSiderLiveItemView.f52115b, true);
            izs.m142871v("context_livingAct", liveSiderLiveItemView.f52115b.getSimpleDraweeView(), this.f202383a.room.coverUrl, qa00.m175859d(140.0f), qa00.m175859d(140.0f), true, false, true, null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f202383a.recommendInfo.reason);
        BLiveSuggestLive bLiveSuggestLive = this.f202383a;
        if (zIsEmpty) {
            string = (!TextUtils.isEmpty(bLiveSuggestLive.room.title) || (bLiveSuggestLiveAnchor = this.f202383a.anchor) == null) ? this.f202383a.room.title : zrv.f205803e.getString(R$string.f47786Rd, bLiveSuggestLiveAnchor.name);
        } else {
            string = bLiveSuggestLive.recommendInfo.reason;
        }
        liveSiderLiveItemView.f52118e.setText(string);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor2 = this.f202383a.anchor;
        if (bLiveSuggestLiveAnchor2 != null) {
            liveSiderLiveItemView.f52117d.setText(bLiveSuggestLiveAnchor2.name);
        }
    }

    @Override // p153l.z0u, p153l.d3q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo72183w(LiveSiderLiveItemView liveSiderLiveItemView) {
        super.mo72183w(liveSiderLiveItemView);
        liveSiderLiveItemView.f52115b.m69958q();
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo175699N(LiveSiderLiveItemView liveSiderLiveItemView) {
        liveSiderLiveItemView.f52115b.m69955n(this.f202383a.videoCaptureUrl);
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo175700O(LiveSiderLiveItemView liveSiderLiveItemView) {
        liveSiderLiveItemView.f52115b.m69958q();
    }

    @Override // p153l.z0u
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return k950.m148863a(this.f206518j, ((zxt) obj).f206518j);
        }
        return false;
    }

    @Override // p153l.z0u
    public int hashCode() {
        return k950.m148864b(Integer.valueOf(super.hashCode()), this.f206518j);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199293w3;
    }
}
