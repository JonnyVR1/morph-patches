package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.live.base.data.BLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlLiveFrame;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLiveAnchor;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareSuggestItemView;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class y8o extends b9o<IntlLiveSquareSuggestItemView> implements d6m {

    /* JADX INFO: renamed from: j */
    public boolean f198018j;

    public y8o(@NonNull BLiveSuggestLive bLiveSuggestLive, @Nullable BLiveSettings bLiveSettings, int i, int i2) {
        super(bLiveSuggestLive, bLiveSettings, i, i2);
        this.f198018j = false;
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: P */
    public HashMap<String, String> mo214754P() {
        if (!this.f198018j) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("module", "no_action_toast");
        return map;
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: Q */
    public void mo214755Q() {
        bfu.m104072d(m218162I().m149392a(), mo113885p(), mo214754P());
        if (this.f198018j) {
            i4g0.m138520r("e_live_no_action_toast", mo113885p());
        }
    }

    /* JADX INFO: renamed from: S */
    public void m214756S(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        bnl0.m105505C0(intlLiveSquareSuggestItemView, this.f202389g);
        bnl0.m105507D0(this.f202389g, intlLiveSquareSuggestItemView);
        bnl0.m105505C0(intlLiveSquareSuggestItemView.f46687c, this.f202389g / 2);
        ynp0.m216936m(intlLiveSquareSuggestItemView, qa00.f156322i);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo72182m(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        super.mo72182m(intlLiveSquareSuggestItemView);
        m214756S(intlLiveSquareSuggestItemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo71749u(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        BLiveSuggestLiveAnchor bLiveSuggestLiveAnchor = this.f202383a.anchor;
        if (bLiveSuggestLiveAnchor != null) {
            intlLiveSquareSuggestItemView.setDistance(bLiveSuggestLiveAnchor.location);
            intlLiveSquareSuggestItemView.setAnchorGrade(this.f202383a.anchor);
        } else {
            intlLiveSquareSuggestItemView.m71543s();
        }
        if (this.f202383a.room != null) {
            SimpleDraweeView simpleDraweeView = intlLiveSquareSuggestItemView.f46685a.getSimpleDraweeView();
            String str = this.f202383a.room.coverUrl;
            int i = this.f202389g;
            izs.m142871v("context_square", simpleDraweeView, str, i, i, true, false, irn.m141839a(), null);
            intlLiveSquareSuggestItemView.setLiveName(this.f202383a.room.title);
        }
        intlLiveSquareSuggestItemView.f46697m.setTextSize(14.0f);
        intlLiveSquareSuggestItemView.setAudienceAmount(Long.toString(Math.round(this.f202383a.memberCount)));
        intlLiveSquareSuggestItemView.m71546w(!this.f202383a.isOnLive());
        intlLiveSquareSuggestItemView.m71545v(this.f198018j);
        BLiveSuggestLive bLiveSuggestLive = this.f202383a;
        if (bLiveSuggestLive.specialLabel != null && jyb.m147479J(bLiveSuggestLive.coverLabels) && jyb.m147479J(this.f202383a.coverLabelsV2)) {
            intlLiveSquareSuggestItemView.f46690f.m71526d(this.f202383a.specialLabel, this.f202384b);
        } else {
            intlLiveSquareSuggestItemView.f46690f.m71525c();
        }
        bnl0.m105524M(intlLiveSquareSuggestItemView.f46694j, !jyb.m147479J(this.f202383a.coverLabelsV2));
        if (jyb.m147479J(this.f202383a.coverLabelsV2)) {
            dwn.m118417b(this.f202383a.coverLabels, intlLiveSquareSuggestItemView);
        } else {
            intlLiveSquareSuggestItemView.f46694j.m69940O(this.f202383a.coverLabelsV2);
        }
        m214762Y(this.f202383a, intlLiveSquareSuggestItemView);
        super.mo71749u(intlLiveSquareSuggestItemView);
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo214753L(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView, @NonNull List<Object> list) {
        super.mo214753L(intlLiveSquareSuggestItemView, list);
        if (jyb.m147479J(list)) {
            return;
        }
        Object obj = list.get(0);
        if (obj instanceof vvk) {
            boolean show = ((vvk) obj).getShow();
            this.f198018j = show;
            intlLiveSquareSuggestItemView.m71545v(show);
            if (this.f198018j) {
                i4g0.m138526x("e_live_no_action_toast", mo113885p());
            }
        }
    }

    @Override // p153l.z0u, p153l.d3q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo72183w(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        super.mo72183w(intlLiveSquareSuggestItemView);
        mo175700O(intlLiveSquareSuggestItemView);
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo175699N(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        intlLiveSquareSuggestItemView.f46685a.m69955n(this.f202383a.videoCaptureUrl);
        intlLiveSquareSuggestItemView.m71545v(this.f198018j);
    }

    /* JADX INFO: renamed from: Y */
    public final void m214762Y(BLiveSuggestLive bLiveSuggestLive, IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        BLiveIntlLiveFrame bLiveIntlLiveFrame = bLiveSuggestLive.intlFrame;
        if (bLiveIntlLiveFrame == null || TextUtils.isEmpty(bLiveIntlLiveFrame.frameId)) {
            bnl0.m105524M(intlLiveSquareSuggestItemView.f46688d, false);
            return;
        }
        BLiveFrame bLiveFrameM97855b = ahn.m97854a().m97855b(bLiveSuggestLive.intlFrame.frameId);
        if (bLiveFrameM97855b == null) {
            bnl0.m105524M(intlLiveSquareSuggestItemView.f46688d, false);
        } else {
            intlLiveSquareSuggestItemView.m71544u(bLiveFrameM97855b.framePicUrl, bLiveFrameM97855b.frameSvgUrl);
        }
    }

    @Override // p153l.z0u
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo175700O(IntlLiveSquareSuggestItemView intlLiveSquareSuggestItemView) {
        intlLiveSquareSuggestItemView.f46685a.m69958q();
    }

    @Override // p153l.d6m
    /* JADX INFO: renamed from: b */
    public void mo71534b(RecyclerView.AbstractC0569e0 abstractC0569e0, StaggeredGridLayoutManager.C0595c c0595c) {
        m214756S((IntlLiveSquareSuggestItemView) abstractC0569e0.itemView);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193850c0;
    }
}
