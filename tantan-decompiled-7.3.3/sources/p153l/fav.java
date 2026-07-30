package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareMenuBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareSingleEntryBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class fav {

    /* JADX INFO: renamed from: a */
    public List<LiveVoiceInternalSquareMenuBean> f98015a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m124772b(Act act, LiveVoiceInternalSquareSingleEntryBean liveVoiceInternalSquareSingleEntryBean) {
        yrs.m217233a(act, liveVoiceInternalSquareSingleEntryBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceInternalSquareSingleEntryBean.getTrackData());
    }

    /* JADX INFO: renamed from: d */
    public final void m124774d(Act act) {
        if (IntlCountryCodeController.m29120q()) {
            tbs.f172993f.m143717s(act);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m124775e(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean, Act act, View view) {
        i4g0.m138523u("e_start_audio_room_entrance", "p_audio_explore_recommend", pf60.m172085a("entrance_type", "bottom_left"), pf60.m172085a("audio_tab_id", liveVoiceInternalSquareBean == null ? "" : liveVoiceInternalSquareBean.getTabId()));
        m124774d(act);
        iqn0.m141677e(act, AnchorStartData.getBuilder().m68746n("create-room-btn").m68752t("bottom_left").m68743k());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m124776f(Act act, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean, View view) {
        m124777g(act, liveVoiceInternalSquareBean.getTabId());
    }

    /* JADX INFO: renamed from: g */
    public final void m124777g(final Act act, String str) {
        if (MomentAllowForwardState.allow.equals(hyn0.m137760b(100001))) {
            act.duringCreated(LiveVoiceInternalSquareApi.requestRandom(str)).subscribe(dhw.m115826e(new y20() { // from class: l.eav
                @Override // p153l.y20
                public final void call(Object obj) {
                    fav.m124772b(act, (LiveVoiceInternalSquareSingleEntryBean) obj);
                }
            }, new wnt()));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m124779i(FrameLayout frameLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (liveVoiceInternalSquareBean == null || tbs.f172989b.m203533U6() || !(frameLayout.getContext() instanceof Act)) {
            return;
        }
        Act act = (Act) frameLayout.getContext();
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(ldc0.f131481L2);
        if (linearLayout == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(frameLayout.getContext()).inflate(xec0.f193872h2, (ViewGroup) frameLayout, false);
            int i = bnl0.f77545f;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = qa00.f156323j;
            frameLayout.addView(linearLayout, layoutParams);
            LiveVoiceInternalSquareMenuBean liveVoiceInternalSquareMenuBean = new LiveVoiceInternalSquareMenuBean();
            liveVoiceInternalSquareMenuBean.setButtonType(0);
            liveVoiceInternalSquareMenuBean.setButtonName("创建房间");
            liveVoiceInternalSquareMenuBean.setButtonIconUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IldEM0ZWNjJZRllLQkozSjRBVjY0SEJHRE1EV0lCNDE0IiwidyI6NzIsImgiOjcyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTAxNTMyNTc3MzQzNzAxMzc2OH0.png");
            this.f98015a.add(liveVoiceInternalSquareMenuBean);
            LiveVoiceInternalSquareMenuBean liveVoiceInternalSquareMenuBean2 = new LiveVoiceInternalSquareMenuBean();
            liveVoiceInternalSquareMenuBean2.setButtonType(1);
            liveVoiceInternalSquareMenuBean2.setButtonName("随机匹配");
            liveVoiceInternalSquareMenuBean2.setButtonIconUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjZPNU5aSU5BSDRPRTNDTlBVWldXVVJMT1E3Nk0yVjE0IiwidyI6NzIsImgiOjcyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTA5MTk4OTI2MDc0NDQ0OH0.png");
            this.f98015a.add(liveVoiceInternalSquareMenuBean2);
        }
        m124780j(act, this.f98015a, linearLayout, liveVoiceInternalSquareBean);
        m124781k(act, this.f98015a, linearLayout, liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: j */
    public final void m124780j(Act act, List<LiveVoiceInternalSquareMenuBean> list, LinearLayout linearLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (list.size() == 0 || TextUtils.isEmpty(list.get(0).getButtonName())) {
            return;
        }
        LiveVoiceInternalSquareMenuBean liveVoiceInternalSquareMenuBean = list.get(0);
        ((TextView) linearLayout.findViewById(ldc0.f131455F0)).setText(liveVoiceInternalSquareMenuBean.getButtonName());
        izs.m142869t("context_square", (VDraweeView) linearLayout.findViewById(ldc0.f131451E0), liveVoiceInternalSquareMenuBean.getButtonIconUrl(), qa00.f156327n);
        m124782l(act, linearLayout.findViewById(ldc0.f131459G0), liveVoiceInternalSquareMenuBean.getButtonType(), liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: k */
    public final void m124781k(Act act, List<LiveVoiceInternalSquareMenuBean> list, LinearLayout linearLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        View viewFindViewById = linearLayout.findViewById(ldc0.f131599s1);
        bnl0.m105524M(viewFindViewById, false);
        View viewFindViewById2 = linearLayout.findViewById(ldc0.f131623y1);
        bnl0.m105524M(viewFindViewById2, false);
        if (list.size() < 2 || TextUtils.isEmpty(list.get(1).getButtonName())) {
            return;
        }
        bnl0.m105524M(viewFindViewById2, true);
        bnl0.m105524M(viewFindViewById, true);
        LiveVoiceInternalSquareMenuBean liveVoiceInternalSquareMenuBean = list.get(1);
        TextView textView = (TextView) linearLayout.findViewById(ldc0.f131595r1);
        izs.m142869t("context_square", (VDraweeView) linearLayout.findViewById(ldc0.f131591q1), liveVoiceInternalSquareMenuBean.getButtonIconUrl(), qa00.f156327n);
        textView.setText(liveVoiceInternalSquareMenuBean.getButtonName());
        m124782l(act, viewFindViewById, liveVoiceInternalSquareMenuBean.getButtonType(), liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: l */
    public final void m124782l(final Act act, View view, int i, final LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (view == null) {
            return;
        }
        if (i == 0) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.cav
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f80619a.m124775e(liveVoiceInternalSquareBean, act, view2);
                }
            });
        } else if (i == 1 && liveVoiceInternalSquareBean != null) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.dav
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f85926a.m124776f(act, liveVoiceInternalSquareBean, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public void m124778h(FrameLayout frameLayout, boolean z) {
    }
}
