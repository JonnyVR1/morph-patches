package p149l;

import android.text.TextUtils;
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
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareMenuBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareSingleEntryBean;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class e8v {

    /* JADX INFO: renamed from: a */
    public List<LiveVoiceInternalSquareMenuBean> f89877a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m115294b(Act act, LiveVoiceInternalSquareSingleEntryBean liveVoiceInternalSquareSingleEntryBean) {
        xps.m210534a(act, liveVoiceInternalSquareSingleEntryBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceInternalSquareSingleEntryBean.getTrackData());
    }

    /* JADX INFO: renamed from: d */
    public final void m115296d(Act act) {
        if (IntlCountryCodeController.m28121q()) {
            s9s.f163232f.m134386s(act);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m115297e(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean, Act act, View view) {
        zvf0.m220399u("e_start_audio_room_entrance", "p_audio_explore_recommend", j760.m140076a("entrance_type", "bottom_left"), j760.m140076a("audio_tab_id", liveVoiceInternalSquareBean == null ? "" : liveVoiceInternalSquareBean.getTabId()));
        m115296d(act);
        ehn0.m116502e(act, AnchorStartData.getBuilder().m67563n("create-room-btn").m67569t("bottom_left").m67560k());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m115298f(Act act, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean, View view) {
        m115299g(act, liveVoiceInternalSquareBean.getTabId());
    }

    /* JADX INFO: renamed from: g */
    public final void m115299g(final Act act, String str) {
        if (MomentAllowForwardState.allow.equals(dpn0.m112919b(100001))) {
            act.duringCreated(LiveVoiceInternalSquareApi.requestRandom(str)).subscribe(ffw.m121194e(new e30() { // from class: l.d8v
                @Override // p149l.e30
                public final void call(Object obj) {
                    e8v.m115294b(act, (LiveVoiceInternalSquareSingleEntryBean) obj);
                }
            }, new ult()));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m115301i(FrameLayout frameLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (liveVoiceInternalSquareBean == null || s9s.f163228b.m195746U6() || !(frameLayout.getContext() instanceof Act)) {
            return;
        }
        Act act = (Act) frameLayout.getContext();
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(f5c0.f95024L2);
        if (linearLayout == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(frameLayout.getContext()).inflate(s6c0.f162758h2, (ViewGroup) frameLayout, false);
            int i = xdl0.f192404f;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = t100.f167261j;
            frameLayout.addView(linearLayout, layoutParams);
            LiveVoiceInternalSquareMenuBean liveVoiceInternalSquareMenuBean = new LiveVoiceInternalSquareMenuBean();
            liveVoiceInternalSquareMenuBean.setButtonType(0);
            liveVoiceInternalSquareMenuBean.setButtonName("创建房间");
            liveVoiceInternalSquareMenuBean.setButtonIconUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IldEM0ZWNjJZRllLQkozSjRBVjY0SEJHRE1EV0lCNDE0IiwidyI6NzIsImgiOjcyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTAxNTMyNTc3MzQzNzAxMzc2OH0.png");
            this.f89877a.add(liveVoiceInternalSquareMenuBean);
            LiveVoiceInternalSquareMenuBean liveVoiceInternalSquareMenuBean2 = new LiveVoiceInternalSquareMenuBean();
            liveVoiceInternalSquareMenuBean2.setButtonType(1);
            liveVoiceInternalSquareMenuBean2.setButtonName("随机匹配");
            liveVoiceInternalSquareMenuBean2.setButtonIconUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjZPNU5aSU5BSDRPRTNDTlBVWldXVVJMT1E3Nk0yVjE0IiwidyI6NzIsImgiOjcyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTA5MTk4OTI2MDc0NDQ0OH0.png");
            this.f89877a.add(liveVoiceInternalSquareMenuBean2);
        }
        m115302j(act, this.f89877a, linearLayout, liveVoiceInternalSquareBean);
        m115303k(act, this.f89877a, linearLayout, liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: j */
    public final void m115302j(Act act, List<LiveVoiceInternalSquareMenuBean> list, LinearLayout linearLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (list.size() == 0 || TextUtils.isEmpty(list.get(0).getButtonName())) {
            return;
        }
        LiveVoiceInternalSquareMenuBean liveVoiceInternalSquareMenuBean = list.get(0);
        ((TextView) linearLayout.findViewById(f5c0.f94998F0)).setText(liveVoiceInternalSquareMenuBean.getButtonName());
        hxs.m133407t("context_square", (VDraweeView) linearLayout.findViewById(f5c0.f94994E0), liveVoiceInternalSquareMenuBean.getButtonIconUrl(), t100.f167265n);
        m115304l(act, linearLayout.findViewById(f5c0.f95002G0), liveVoiceInternalSquareMenuBean.getButtonType(), liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: k */
    public final void m115303k(Act act, List<LiveVoiceInternalSquareMenuBean> list, LinearLayout linearLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        View viewFindViewById = linearLayout.findViewById(f5c0.f95142s1);
        xdl0.m208344M(viewFindViewById, false);
        View viewFindViewById2 = linearLayout.findViewById(f5c0.f95166y1);
        xdl0.m208344M(viewFindViewById2, false);
        if (list.size() < 2 || TextUtils.isEmpty(list.get(1).getButtonName())) {
            return;
        }
        xdl0.m208344M(viewFindViewById2, true);
        xdl0.m208344M(viewFindViewById, true);
        LiveVoiceInternalSquareMenuBean liveVoiceInternalSquareMenuBean = list.get(1);
        TextView textView = (TextView) linearLayout.findViewById(f5c0.f95138r1);
        hxs.m133407t("context_square", (VDraweeView) linearLayout.findViewById(f5c0.f95134q1), liveVoiceInternalSquareMenuBean.getButtonIconUrl(), t100.f167265n);
        textView.setText(liveVoiceInternalSquareMenuBean.getButtonName());
        m115304l(act, viewFindViewById, liveVoiceInternalSquareMenuBean.getButtonType(), liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: l */
    public final void m115304l(final Act act, View view, int i, final LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (view == null) {
            return;
        }
        if (i == 0) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.b8v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f74172a.m115297e(liveVoiceInternalSquareBean, act, view2);
                }
            });
        } else if (i == 1 && liveVoiceInternalSquareBean != null) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.c8v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f79814a.m115298f(act, liveVoiceInternalSquareBean, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public void m115300h(FrameLayout frameLayout, boolean z) {
    }
}
