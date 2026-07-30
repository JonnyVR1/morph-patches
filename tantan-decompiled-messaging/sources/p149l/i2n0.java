package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.entry.VoiceConversationsEntryInternal;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: classes13.dex */
public class i2n0 extends jq2<VoiceConversationsEntryInternal> {
    private LiveVoiceInternalEntryBean info;
    private long lastRefreshTime;
    private Runnable timerRunnable;

    public i2n0(mcr mcrVar) {
        super(mcrVar);
        this.lastRefreshTime = 0L;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m134062g0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m134069r0(Integer num) {
        this.info.setUnreadShowNumber(num.intValue());
        ((VoiceConversationsEntryInternal) this.viewModel).setRedDot(this.info);
        m134078x0(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m134070s0(Throwable th) {
        m134075p0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m134071u0() {
        long jM195862ib = ((long) (s9s.f163228b.m195862ib() * 1000)) * 5;
        if (mqi0.m155944o() - this.lastRefreshTime >= jM195862ib) {
            e51.m114745J(this.timerRunnable);
            duringCreated(new v9j() { // from class: l.d2n0
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return LiveVoiceInternalSquareApi.getVoiceSummaryEntryData();
                }
            }, false).subscribe(ffw.m121194e(new e30() { // from class: l.e2n0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88933a.m134075p0((LiveVoiceInternalEntryBean) obj);
                }
            }, new e30() { // from class: l.f2n0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94224a.m134070s0((Throwable) obj);
                }
            }));
            this.lastRefreshTime = mqi0.m155944o();
            e51.m114743H(act(), this.timerRunnable, jM195862ib);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m134072A0() {
        this.lastRefreshTime = 0L;
        m134071u0();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(new v9j() { // from class: l.x1n0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return l9s.m149101u(TabName.Msg);
            }
        }, false).subscribe(ffw.m121193d(new e30() { // from class: l.z1n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201085a.m134073n0((Bundle) obj);
            }
        }));
        duringCreated(((hl3) s9s.m182763m(gld0.f103313c)).m131631e()).filter(new w9j() { // from class: l.a2n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67273a.m134076q0((Integer) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.b2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72710a.m134069r0((Integer) obj);
            }
        }));
        this.timerRunnable = new Runnable() { // from class: l.c2n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78373a.m134071u0();
            }
        };
        m134071u0();
    }

    @Override // p149l.q0m
    public void destroy() {
        Runnable runnable = this.timerRunnable;
        if (runnable != null) {
            e51.m114745J(runnable);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m134073n0(Bundle bundle) {
        Act act = act();
        if (act != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", x4s.f191057e);
            act.startActivity(LiveIndependentSettingAct.m70699Y1(act, "voice_internal_square_page", bundle2));
            l9s.m149044G().mo67229M6().mo102436u(act(), bundle);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m134074o0(Context context, LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        if (context == null || liveVoiceInternalEntryBean == null) {
            return;
        }
        if (liveVoiceInternalEntryBean.getHasRedSpot() || qib0.f154713b0.f139232c.mo67228Lh().mo95350d().m221515e().intValue() > 0) {
            m134079y0(liveVoiceInternalEntryBean);
        }
        if (liveVoiceInternalEntryBean.getGoAction() == null) {
            yuf0.m216111a(context, null);
            return;
        }
        if (!liveVoiceInternalEntryBean.isJumpBackToMessage()) {
            Bundle bundle = new Bundle();
            bundle.putString("source", x4s.f191057e);
            context.startActivity(LiveIndependentSettingAct.m70699Y1(context, "voice_internal_square_page", bundle));
        }
        xps.m210534a(context, liveVoiceInternalEntryBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceInternalEntryBean.getTrackData());
    }

    /* JADX INFO: renamed from: p0 */
    public final void m134075p0(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        this.info = liveVoiceInternalEntryBean;
        int unreadShowNumber = 0;
        if (liveVoiceInternalEntryBean == null || (TextUtils.isEmpty(liveVoiceInternalEntryBean.getTitle()) && TextUtils.isEmpty(liveVoiceInternalEntryBean.getSubTitle()) && vwb.m200296J(liveVoiceInternalEntryBean.getHeadSculptureList()))) {
            ((VoiceConversationsEntryInternal) this.viewModel).m69847j();
            this.lastRefreshTime = mqi0.m155944o();
        } else {
            ((VoiceConversationsEntryInternal) this.viewModel).m69849l(liveVoiceInternalEntryBean);
            if (liveVoiceInternalEntryBean.getUnreadShowNumber() > 0) {
                unreadShowNumber = liveVoiceInternalEntryBean.getUnreadShowNumber();
            } else if (liveVoiceInternalEntryBean.getHasRedSpot()) {
                unreadShowNumber = 1;
            }
        }
        m134078x0(unreadShowNumber);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Boolean m134076q0(Integer num) {
        LiveVoiceInternalEntryBean liveVoiceInternalEntryBean;
        return Boolean.valueOf((num == null || (liveVoiceInternalEntryBean = this.info) == null || liveVoiceInternalEntryBean.getUnreadShowNumber() == num.intValue()) ? false : true);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m134077t0(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean, BaseLiveBean baseLiveBean) {
        liveVoiceInternalEntryBean.setHasRedSpot(false);
        liveVoiceInternalEntryBean.setUnreadShowNumber(0);
        ((VoiceConversationsEntryInternal) this.viewModel).setRedDot(liveVoiceInternalEntryBean);
        m134078x0(0);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m134078x0(int i) {
        qib0.f154713b0.f139232c.mo67228Lh().mo95350d().m132487l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: y0 */
    public void m134079y0(final LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        duringCreated(new v9j() { // from class: l.g2n0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return LiveVoiceInternalSquareApi.postClearSummaryEntryRedSpot();
            }
        }, false).subscribe(ffw.m121194e(new e30() { // from class: l.h2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105541a.m134077t0(liveVoiceInternalEntryBean, (BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.y1n0
            @Override // p149l.e30
            public final void call(Object obj) {
                i2n0.m134062g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m134080z0() {
        m134071u0();
    }
}
