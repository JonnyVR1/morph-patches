package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareSingleEntryBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes13.dex */
public class a8v {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m95364c(Act act, LiveVoiceInternalSquareSingleEntryBean liveVoiceInternalSquareSingleEntryBean) {
        xps.m210534a(act, liveVoiceInternalSquareSingleEntryBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceInternalSquareSingleEntryBean.getTrackData());
    }

    /* JADX INFO: renamed from: d */
    public final void m95365d(Act act) {
        if (IntlCountryCodeController.m28121q()) {
            s9s.f163232f.m134386s(act);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m95366e(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean, Act act, View view) {
        zvf0.m220399u("e_start_audio_room_entrance", "p_audio_explore_recommend", j760.m140076a("entrance_type", "upper_right_button"), j760.m140076a("audio_tab_id", liveVoiceInternalSquareBean == null ? "" : liveVoiceInternalSquareBean.getTabId()));
        m95365d(act);
        ehn0.m116502e(act, AnchorStartData.getBuilder().m67563n("create-room-btn").m67569t("upper_right_button").m67560k());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m95367f(Act act, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean, View view) {
        m95368g(act, liveVoiceInternalSquareBean.getTabId());
    }

    /* JADX INFO: renamed from: g */
    public final void m95368g(final Act act, String str) {
        if (MomentAllowForwardState.allow.equals(dpn0.m112919b(100001))) {
            act.duringCreated(LiveVoiceInternalSquareApi.requestRandom(str)).subscribe(ffw.m121194e(new e30() { // from class: l.z7v
                @Override // p149l.e30
                public final void call(Object obj) {
                    a8v.m95364c(act, (LiveVoiceInternalSquareSingleEntryBean) obj);
                }
            }, new ult()));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m95369h(FrameLayout frameLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (frameLayout == null || !(frameLayout.getContext() instanceof Act) || s9s.f163228b.m195746U6()) {
            return;
        }
        Act act = (Act) frameLayout.getContext();
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(f5c0.f95024L2);
        if (linearLayout == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(frameLayout.getContext()).inflate(s6c0.f162754g2, (ViewGroup) frameLayout, false);
            frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, t100.m186890d(34.0f)));
            m95370i(act, linearLayout, liveVoiceInternalSquareBean);
        }
        m95370i(act, linearLayout, liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: i */
    public final void m95370i(Act act, LinearLayout linearLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        TextView textView = (TextView) linearLayout.findViewById(f5c0.f94998F0);
        View viewFindViewById = linearLayout.findViewById(f5c0.f94994E0);
        if (viewFindViewById != null) {
            xdl0.m208344M(viewFindViewById, false);
        }
        textView.setText("创建");
        m95371j(act, linearLayout.findViewById(f5c0.f95002G0), 0, liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: j */
    public final void m95371j(final Act act, View view, int i, final LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (view == null) {
            return;
        }
        if (i == 0) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.x7v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f191377a.m95366e(liveVoiceInternalSquareBean, act, view2);
                }
            });
        } else if (i == 1 && liveVoiceInternalSquareBean != null) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.y7v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f196735a.m95367f(act, liveVoiceInternalSquareBean, view2);
                }
            });
        }
    }
}
