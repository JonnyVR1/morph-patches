package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.other.side.LiveSiderLiveItemView;

/* JADX INFO: loaded from: classes4.dex */
public class yvt extends yyt<LiveSiderLiveItemView> {

    /* JADX INFO: renamed from: j */
    public final String f200291j;

    public yvt(@NonNull BLiveSuggestLive bLiveSuggestLive, String str, int i) {
        super(bLiveSuggestLive, null, 1, i);
        this.f200291j = str;
    }

    @Override // p149l.yyt, p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        return false;
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: K */
    public BLiveTrackShowLabel mo100692K() {
        if (w8u.m202221x(this.f200806a.anchor.location) == null) {
            return null;
        }
        BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
        bLiveTrackShowLabelNew_.room_name = this.f200806a.room.title;
        return bLiveTrackShowLabelNew_;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo70999m(LiveSiderLiveItemView liveSiderLiveItemView) {
        super.mo70999m(liveSiderLiveItemView);
        liveSiderLiveItemView.f51267b.setClipChildren(false);
        xdl0.m208327D0(t100.m186890d(140.0f), liveSiderLiveItemView.f51267b.getTextureView());
        uep0.m193326m(liveSiderLiveItemView.f51266a, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: T */
    public String m216230T() {
        return this.f200291j;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo70566u(LiveSiderLiveItemView liveSiderLiveItemView) {
        String string;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor;
        super.mo70566u(liveSiderLiveItemView);
        if (TextUtils.isEmpty(this.f200806a.room.coverUrl)) {
            xdl0.m208345M0(liveSiderLiveItemView.f51267b, false);
        } else {
            xdl0.m208345M0(liveSiderLiveItemView.f51267b, true);
            hxs.m133409v("context_livingAct", liveSiderLiveItemView.f51267b.getSimpleDraweeView(), this.f200806a.room.coverUrl, t100.m186890d(140.0f), t100.m186890d(140.0f), true, false, true, null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f200806a.recommendInfo.reason);
        BLiveSuggestLive bLiveSuggestLive = this.f200806a;
        if (zIsEmpty) {
            string = (!TextUtils.isEmpty(bLiveSuggestLive.room.title) || (bLiveSuggestLiveAnchor = this.f200806a.anchor) == null) ? this.f200806a.room.title : ypv.f199497e.getString(R$string.f46938Rd, bLiveSuggestLiveAnchor.name);
        } else {
            string = bLiveSuggestLive.recommendInfo.reason;
        }
        liveSiderLiveItemView.f51270e.setText(string);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor2 = this.f200806a.anchor;
        if (bLiveSuggestLiveAnchor2 != null) {
            liveSiderLiveItemView.f51269d.setText(bLiveSuggestLiveAnchor2.name);
        }
    }

    @Override // p149l.yyt, p149l.d1q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo71000w(LiveSiderLiveItemView liveSiderLiveItemView) {
        super.mo71000w(liveSiderLiveItemView);
        liveSiderLiveItemView.f51267b.m68775q();
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo173091N(LiveSiderLiveItemView liveSiderLiveItemView) {
        liveSiderLiveItemView.f51267b.m68772n(this.f200806a.videoCaptureUrl);
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo173092O(LiveSiderLiveItemView liveSiderLiveItemView) {
        liveSiderLiveItemView.f51267b.m68775q();
    }

    @Override // p149l.yyt
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return v050.m196470a(this.f200291j, ((yvt) obj).f200291j);
        }
        return false;
    }

    @Override // p149l.yyt
    public int hashCode() {
        return v050.m196471b(Integer.valueOf(super.hashCode()), this.f200291j);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168561w3;
    }
}
