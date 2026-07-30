package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.VoiceConversationsEntryInternal;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.newui.main.base.TabName;

/* JADX INFO: loaded from: classes9.dex */
public class mbn0 extends ar2<VoiceConversationsEntryInternal> {
    private LiveVoiceInternalEntryBean info;
    private long lastRefreshTime;
    private Runnable timerRunnable;

    public mbn0(ner nerVar) {
        super(nerVar);
        this.lastRefreshTime = 0L;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m157796g0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m157803r0(Integer num) {
        this.info.setUnreadShowNumber(num.intValue());
        ((VoiceConversationsEntryInternal) this.viewModel).setRedDot(this.info);
        m157812x0(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m157804s0(Throwable th) {
        m157809p0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public void m157805u0() {
        long jM203649ib = ((long) (tbs.f172989b.m203649ib() * 1000)) * 5;
        if (pzi0.m174454o() - this.lastRefreshTime >= jM203649ib) {
            l51.m152890J(this.timerRunnable);
            duringCreated(new pcj() { // from class: l.hbn0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return LiveVoiceInternalSquareApi.getVoiceSummaryEntryData();
                }
            }, false).subscribe(dhw.m115826e(new y20() { // from class: l.ibn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114237a.m157809p0((LiveVoiceInternalEntryBean) obj);
                }
            }, new y20() { // from class: l.jbn0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f119983a.m157804s0((Throwable) obj);
                }
            }));
            this.lastRefreshTime = pzi0.m174454o();
            l51.m152888H(act(), this.timerRunnable, jM203649ib);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m157806A0() {
        this.lastRefreshTime = 0L;
        m157805u0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(new pcj() { // from class: l.bbn0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return mbs.m157878u(TabName.Msg);
            }
        }, false).subscribe(dhw.m115825d(new y20() { // from class: l.dbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87688a.m157807n0((Bundle) obj);
            }
        }));
        duringCreated(((gm3) tbs.m190077m(itd0.f116821c)).m130730e()).filter(new qcj() { // from class: l.ebn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f92943a.m157810q0((Integer) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.fbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98119a.m157803r0((Integer) obj);
            }
        }));
        this.timerRunnable = new Runnable() { // from class: l.gbn0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103481a.m157805u0();
            }
        };
        m157805u0();
    }

    @Override // p153l.k3m
    public void destroy() {
        Runnable runnable = this.timerRunnable;
        if (runnable != null) {
            l51.m152890J(runnable);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m157807n0(Bundle bundle) {
        Act act = act();
        if (act != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", y6s.f197712e);
            act.startActivity(LiveIndependentSettingAct.m71882Z1(act, "voice_internal_square_page", bundle2));
            mbs.m157821G().mo68412M6().mo127350u(act(), bundle);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m157808o0(Context context, LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        if (context == null || liveVoiceInternalEntryBean == null) {
            return;
        }
        if (liveVoiceInternalEntryBean.getHasRedSpot() || uqb0.f180396b0.f170326c.mo68411Lh().mo175947d().m222761e().intValue() > 0) {
            m157813y0(liveVoiceInternalEntryBean);
        }
        if (liveVoiceInternalEntryBean.getGoAction() == null) {
            h3g0.m133482a(context, null);
            return;
        }
        if (!liveVoiceInternalEntryBean.isJumpBackToMessage()) {
            Bundle bundle = new Bundle();
            bundle.putString("source", y6s.f197712e);
            context.startActivity(LiveIndependentSettingAct.m71882Z1(context, "voice_internal_square_page", bundle));
        }
        yrs.m217233a(context, liveVoiceInternalEntryBean.getGoAction());
        LiveCardTracker.trackMc(liveVoiceInternalEntryBean.getTrackData());
    }

    /* JADX INFO: renamed from: p0 */
    public final void m157809p0(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        this.info = liveVoiceInternalEntryBean;
        int unreadShowNumber = 0;
        if (liveVoiceInternalEntryBean == null || (TextUtils.isEmpty(liveVoiceInternalEntryBean.getTitle()) && TextUtils.isEmpty(liveVoiceInternalEntryBean.getSubTitle()) && jyb.m147479J(liveVoiceInternalEntryBean.getHeadSculptureList()))) {
            ((VoiceConversationsEntryInternal) this.viewModel).m71030j();
            this.lastRefreshTime = pzi0.m174454o();
        } else {
            ((VoiceConversationsEntryInternal) this.viewModel).m71032l(liveVoiceInternalEntryBean);
            if (liveVoiceInternalEntryBean.getUnreadShowNumber() > 0) {
                unreadShowNumber = liveVoiceInternalEntryBean.getUnreadShowNumber();
            } else if (liveVoiceInternalEntryBean.getHasRedSpot()) {
                unreadShowNumber = 1;
            }
        }
        m157812x0(unreadShowNumber);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Boolean m157810q0(Integer num) {
        LiveVoiceInternalEntryBean liveVoiceInternalEntryBean;
        return Boolean.valueOf((num == null || (liveVoiceInternalEntryBean = this.info) == null || liveVoiceInternalEntryBean.getUnreadShowNumber() == num.intValue()) ? false : true);
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m157811t0(LiveVoiceInternalEntryBean liveVoiceInternalEntryBean, BaseLiveBean baseLiveBean) {
        liveVoiceInternalEntryBean.setHasRedSpot(false);
        liveVoiceInternalEntryBean.setUnreadShowNumber(0);
        ((VoiceConversationsEntryInternal) this.viewModel).setRedDot(liveVoiceInternalEntryBean);
        m157812x0(0);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m157812x0(int i) {
        uqb0.f180396b0.f170326c.mo68411Lh().mo175947d().m137019l(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: y0 */
    public void m157813y0(final LiveVoiceInternalEntryBean liveVoiceInternalEntryBean) {
        duringCreated(new pcj() { // from class: l.kbn0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return LiveVoiceInternalSquareApi.postClearSummaryEntryRedSpot();
            }
        }, false).subscribe(dhw.m115826e(new y20() { // from class: l.lbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131215a.m157811t0(liveVoiceInternalEntryBean, (BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.cbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                mbn0.m157796g0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public void m157814z0() {
        m157805u0();
    }
}
