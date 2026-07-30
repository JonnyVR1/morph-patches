package p153l;

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
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.api.LiveVoiceInternalSquareSingleEntryBean;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public class bav {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m103235c(Act act, LiveVoiceInternalSquareSingleEntryBean liveVoiceInternalSquareSingleEntryBean) {
        yrs.m217233a(act, liveVoiceInternalSquareSingleEntryBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceInternalSquareSingleEntryBean.getTrackData());
    }

    /* JADX INFO: renamed from: d */
    public final void m103236d(Act act) {
        if (IntlCountryCodeController.m29120q()) {
            tbs.f172993f.m143717s(act);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m103237e(LiveVoiceInternalSquareBean liveVoiceInternalSquareBean, Act act, View view) {
        i4g0.m138523u("e_start_audio_room_entrance", "p_audio_explore_recommend", pf60.m172085a("entrance_type", "upper_right_button"), pf60.m172085a("audio_tab_id", liveVoiceInternalSquareBean == null ? "" : liveVoiceInternalSquareBean.getTabId()));
        m103236d(act);
        iqn0.m141677e(act, AnchorStartData.getBuilder().m68746n("create-room-btn").m68752t("upper_right_button").m68743k());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m103238f(Act act, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean, View view) {
        m103239g(act, liveVoiceInternalSquareBean.getTabId());
    }

    /* JADX INFO: renamed from: g */
    public final void m103239g(final Act act, String str) {
        if (MomentAllowForwardState.allow.equals(hyn0.m137760b(100001))) {
            act.duringCreated(LiveVoiceInternalSquareApi.requestRandom(str)).subscribe(dhw.m115826e(new y20() { // from class: l.aav
                @Override // p153l.y20
                public final void call(Object obj) {
                    bav.m103235c(act, (LiveVoiceInternalSquareSingleEntryBean) obj);
                }
            }, new wnt()));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m103240h(FrameLayout frameLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (frameLayout == null || !(frameLayout.getContext() instanceof Act) || tbs.f172989b.m203533U6()) {
            return;
        }
        Act act = (Act) frameLayout.getContext();
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(ldc0.f131481L2);
        if (linearLayout == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(frameLayout.getContext()).inflate(xec0.f193868g2, (ViewGroup) frameLayout, false);
            frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-2, qa00.m175859d(34.0f)));
            m103241i(act, linearLayout, liveVoiceInternalSquareBean);
        }
        m103241i(act, linearLayout, liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: i */
    public final void m103241i(Act act, LinearLayout linearLayout, LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        TextView textView = (TextView) linearLayout.findViewById(ldc0.f131455F0);
        View viewFindViewById = linearLayout.findViewById(ldc0.f131451E0);
        if (viewFindViewById != null) {
            bnl0.m105524M(viewFindViewById, false);
        }
        textView.setText("创建");
        m103242j(act, linearLayout.findViewById(ldc0.f131459G0), 0, liveVoiceInternalSquareBean);
    }

    /* JADX INFO: renamed from: j */
    public final void m103242j(final Act act, View view, int i, final LiveVoiceInternalSquareBean liveVoiceInternalSquareBean) {
        if (view == null) {
            return;
        }
        if (i == 0) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.y9v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f198126a.m103237e(liveVoiceInternalSquareBean, act, view2);
                }
            });
        } else if (i == 1 && liveVoiceInternalSquareBean != null) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.z9v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f203513a.m103238f(act, liveVoiceInternalSquareBean, view2);
                }
            });
        }
    }
}
