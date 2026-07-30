package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.live.base.data.BLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareSuggestItemView;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class y6o extends b7o<IntlLiveSquareSuggestItemView> implements m3m {

    /* JADX INFO: renamed from: j */
    public boolean f196586j;

    public y6o(@NonNull BLiveSuggestLive bLiveSuggestLive, @Nullable BLiveSettings bLiveSettings, int i, int i2) {
        super(bLiveSuggestLive, bLiveSettings, i, i2);
        this.f196586j = false;
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: P */
    public HashMap<String, String> mo213151P() {
        if (!this.f196586j) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("module", "no_action_toast");
        return map;
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: Q */
    public void mo213152Q() {
        adu.m96008d(m216565I().m129662a(), mo109667p(), mo213151P());
        if (this.f196586j) {
            zvf0.m220396r("e_live_no_action_toast", mo109667p());
        }
    }

    /* JADX INFO: renamed from: S */
    public void m213153S(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        xdl0.m208325C0(intlLiveSquareSuggestItemView, this.f200812g);
        xdl0.m208327D0(this.f200812g, intlLiveSquareSuggestItemView);
        xdl0.m208325C0(intlLiveSquareSuggestItemView.f45839c, this.f200812g / 2);
        uep0.m193326m(intlLiveSquareSuggestItemView, t100.f167260i);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo70999m(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        super.mo70999m(intlLiveSquareSuggestItemView);
        m213153S(intlLiveSquareSuggestItemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo70566u(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = this.f200806a.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            intlLiveSquareSuggestItemView.setDistance(bLiveSuggestLiveAnchor.location);
            intlLiveSquareSuggestItemView.setAnchorGrade(this.f200806a.anchor);
        } else {
            intlLiveSquareSuggestItemView.m70360s();
        }
        if (this.f200806a.room != null) {
            SimpleDraweeView simpleDraweeView = intlLiveSquareSuggestItemView.f45837a.getSimpleDraweeView();
            String str = this.f200806a.room.coverUrl;
            int i = this.f200812g;
            hxs.m133409v("context_square", simpleDraweeView, str, i, i, true, false, ipn.m137564a(), null);
            intlLiveSquareSuggestItemView.setLiveName(this.f200806a.room.title);
        }
        intlLiveSquareSuggestItemView.f45849m.setTextSize(14.0f);
        intlLiveSquareSuggestItemView.setAudienceAmount(Long.toString(Math.round(this.f200806a.memberCount)));
        intlLiveSquareSuggestItemView.m70363w(!this.f200806a.isOnLive());
        intlLiveSquareSuggestItemView.m70362v(this.f196586j);
        BLiveSuggestLive bLiveSuggestLive = this.f200806a;
        if (bLiveSuggestLive.specialLabel != null && vwb.m200296J(bLiveSuggestLive.coverLabels) && vwb.m200296J(this.f200806a.coverLabelsV2)) {
            intlLiveSquareSuggestItemView.f45842f.m70343d(this.f200806a.specialLabel, this.f200807b);
        } else {
            intlLiveSquareSuggestItemView.f45842f.m70342c();
        }
        xdl0.m208344M(intlLiveSquareSuggestItemView.f45846j, !vwb.m200296J(this.f200806a.coverLabelsV2));
        if (vwb.m200296J(this.f200806a.coverLabelsV2)) {
            dun.m113738b(this.f200806a.coverLabels, intlLiveSquareSuggestItemView);
        } else {
            intlLiveSquareSuggestItemView.f45846j.m68757O(this.f200806a.coverLabelsV2);
        }
        m213159Y(this.f200806a, intlLiveSquareSuggestItemView);
        super.mo70566u(intlLiveSquareSuggestItemView);
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo213150L(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView, @NonNull List<Object> list) {
        super.mo213150L(intlLiveSquareSuggestItemView, list);
        if (vwb.m200296J(list)) {
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof ftk) {
            boolean show = ((ftk) obj).getShow();
            this.f196586j = show;
            intlLiveSquareSuggestItemView.m70362v(show);
            if (this.f196586j) {
                zvf0.m220402x("e_live_no_action_toast", mo109667p());
            }
        }
    }

    @Override // p149l.yyt, p149l.d1q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo71000w(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        super.mo71000w(intlLiveSquareSuggestItemView);
        mo173092O(intlLiveSquareSuggestItemView);
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo173091N(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        intlLiveSquareSuggestItemView.f45837a.m68772n(this.f200806a.videoCaptureUrl);
        intlLiveSquareSuggestItemView.m70362v(this.f196586j);
    }

    /* JADX INFO: renamed from: Y */
    public final void m213159Y(BLiveSuggestLive bLiveSuggestLive, IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveSuggestLive.intlFrame;
        if (bLiveIntlLiveFrame == null || TextUtils.isEmpty(bLiveIntlLiveFrame.frameId)) {
            xdl0.m208344M(intlLiveSquareSuggestItemView.f45840d, false);
            return;
        }
        BLiveFrame bLiveFrameM96260b = afn.m96259a().m96260b(bLiveSuggestLive.intlFrame.frameId);
        if (bLiveFrameM96260b == null) {
            xdl0.m208344M(intlLiveSquareSuggestItemView.f45840d, false);
        } else {
            intlLiveSquareSuggestItemView.m70361u(bLiveFrameM96260b.framePicUrl, bLiveFrameM96260b.frameSvgUrl);
        }
    }

    @Override // p149l.yyt
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo173092O(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        intlLiveSquareSuggestItemView.f45837a.m68775q();
    }

    @Override // p149l.m3m
    /* JADX INFO: renamed from: b */
    public void mo70351b(RecyclerView.AbstractC0566d0 abstractC0566d0, StaggeredGridLayoutManager.C0593c c0593c) {
        m213153S((IntlLiveSquareSuggestItemView) abstractC0566d0.itemView);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162736c0;
    }
}
