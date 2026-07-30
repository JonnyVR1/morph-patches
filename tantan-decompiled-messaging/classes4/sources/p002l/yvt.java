package p002l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.other.side.LiveSiderLiveItemView;
import com.p1.mobile.putong.live.base.data.BLiveSettings;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import l.hxs;
import l.n80;
import l.t100;
import l.uep0;
import l.v050;
import l.w8u;
import l.xdl0;
import l.ym2;
import l.ypv;
import l.yyt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yvt extends yyt<LiveSiderLiveItemView> {

    /* JADX INFO: renamed from: j */
    public final String f23122j;

    public yvt(@NonNull BLiveSuggestLive bLiveSuggestLive, String str, int i) {
        super(bLiveSuggestLive, (BLiveSettings) null, 1, i);
        this.f23122j = str;
    }

    /* JADX INFO: renamed from: F */
    public boolean m26943F(n80 n80Var) {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public BLiveTrackShowLabel m26944K() {
        if (w8u.x(((yyt) this).a.anchor.location) == null) {
            return null;
        }
        BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
        bLiveTrackShowLabelNew_.room_name = ((yyt) this).a.room.title;
        return bLiveTrackShowLabelNew_;
    }

    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m26953m(LiveSiderLiveItemView liveSiderLiveItemView) {
        super/*l.d1q*/.m(liveSiderLiveItemView);
        liveSiderLiveItemView.f7309b.setClipChildren(false);
        xdl0.D0(t100.d(140.0f), new View[]{liveSiderLiveItemView.f7309b.getTextureView()});
        uep0.m(liveSiderLiveItemView.f7308a, t100.d(10.0f));
    }

    /* JADX INFO: renamed from: T */
    public String m26948T() {
        return this.f23122j;
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void m26955u(LiveSiderLiveItemView liveSiderLiveItemView) {
        String string;
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor;
        super/*l.d1q*/.u(liveSiderLiveItemView);
        if (TextUtils.isEmpty(((yyt) this).a.room.coverUrl)) {
            xdl0.M0(liveSiderLiveItemView.f7309b, false);
        } else {
            xdl0.M0(liveSiderLiveItemView.f7309b, true);
            hxs.v("context_livingAct", liveSiderLiveItemView.f7309b.getSimpleDraweeView(), ((yyt) this).a.room.coverUrl, t100.d(140.0f), t100.d(140.0f), true, false, true, (ym2) null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(((yyt) this).a.recommendInfo.reason);
        BLiveSuggestLive bLiveSuggestLive = ((yyt) this).a;
        if (zIsEmpty) {
            string = (!TextUtils.isEmpty(bLiveSuggestLive.room.title) || (bLiveSuggestLiveAnchor = ((yyt) this).a.anchor) == null) ? ((yyt) this).a.room.title : ypv.e.getString(R$string.f2980Rd, bLiveSuggestLiveAnchor.name);
        } else {
            string = bLiveSuggestLive.recommendInfo.reason;
        }
        liveSiderLiveItemView.f7312e.setText(string);
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor2 = ((yyt) this).a.anchor;
        if (bLiveSuggestLiveAnchor2 != null) {
            liveSiderLiveItemView.f7311d.setText(bLiveSuggestLiveAnchor2.name);
        }
    }

    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void m26956w(LiveSiderLiveItemView liveSiderLiveItemView) {
        super.w(liveSiderLiveItemView);
        liveSiderLiveItemView.f7309b.q();
    }

    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void m26945N(LiveSiderLiveItemView liveSiderLiveItemView) {
        liveSiderLiveItemView.f7309b.n(((yyt) this).a.videoCaptureUrl);
    }

    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void m26946O(LiveSiderLiveItemView liveSiderLiveItemView) {
        liveSiderLiveItemView.f7309b.q();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return v050.a(this.f23122j, ((yvt) obj).f23122j);
        }
        return false;
    }

    public int hashCode() {
        return v050.b(new Object[]{Integer.valueOf(super.hashCode()), this.f23122j});
    }

    /* JADX INFO: renamed from: o */
    public int m26954o() {
        return t6c0.f20057w3;
    }
}
