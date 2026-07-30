package com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntryCardData;
import com.p046p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntrySuggested;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalHeaderView;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p046p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.e30;
import p149l.f30;
import p149l.ffw;
import p149l.osi0;
import p149l.p5v;
import p149l.qyt;
import p149l.tvr;
import p149l.v9j;
import p149l.vwb;
import p149l.x4v;
import p149l.xdl0;
import p149l.xps;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVoiceInternalHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRecyclerView f45512c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f45513d;

    /* JADX INFO: renamed from: e */
    public List<tvr<?>> f45514e;

    /* JADX INFO: renamed from: f */
    public Frag f45515f;

    /* JADX INFO: renamed from: g */
    public p5v f45516g;

    /* JADX INFO: renamed from: h */
    public qyt f45517h;

    /* JADX INFO: renamed from: i */
    public f30<LiveQuickEntryCardData, Integer> f45518i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalHeaderView$a */
    public class C12536a extends GridLayoutManager.AbstractC0553c {
        public C12536a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return LiveVoiceInternalHeaderView.this.f45517h.m67356K(i);
        }
    }

    public LiveVoiceInternalHeaderView(Context context) {
        super(context);
        this.f45518i = new f30() { // from class: l.t4v
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f167751a.m69886Z((LiveQuickEntryCardData) obj, (Integer) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m69879R(Throwable th) {
    }

    /* JADX INFO: renamed from: V */
    public final void m69882V(View view) {
        x4v.m207039a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public qyt m69883W() {
        this.f45517h = qyt.m177065J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6, 1, false);
        gridLayoutManager.m3326v(new C12536a());
        this.f45512c.setLayoutManager(gridLayoutManager);
        this.f45512c.setAdapter(this.f45517h);
        this.f45512c.setItemAnimator(null);
        this.f45517h.m191781o0(this.f45515f, new v9j() { // from class: l.w4v
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f184610a.m69885Y();
            }
        }, LiveTeenDialogAct.f46216g);
        this.f45517h.m67369X(false);
        return this.f45517h;
    }

    /* JADX INFO: renamed from: X */
    public final p5v m69884X() {
        p5v p5vVar = new p5v();
        this.f45516g = p5vVar;
        p5vVar.m167519i0(this.f45518i);
        this.f45513d.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f45513d.setAdapter(this.f45516g);
        return this.f45516g;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m69885Y() {
        return Boolean.valueOf(!vwb.m200296J(this.f45514e));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m69886Z(LiveQuickEntryCardData liveQuickEntryCardData, Integer num) {
        zvf0.m220397s("e_audio_shortcut", "p_audio_explore_recommend", liveQuickEntryCardData.getTrackData());
        m69890d0(liveQuickEntryCardData.getSource(), num);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m69887a0(Integer num, BaseLiveListBean baseLiveListBean) {
        if (baseLiveListBean == null || vwb.m200296J(baseLiveListBean.getList())) {
            osi0.m165783g("当前暂无这类群组，你来创建一个吧");
            return;
        }
        xps.m210534a(this.f45515f.act(), ((LiveQuickEntrySuggested) baseLiveListBean.getList().get(0)).getGoAction());
        LiveCardTrackData trackData = ((LiveQuickEntrySuggested) baseLiveListBean.getList().get(0)).getTrackData();
        trackData.put(FirebaseAnalytics.Param.INDEX, num);
        zvf0.m220397s("e_live_audio_room_enter", "p_audio_explore_recommend", trackData);
    }

    /* JADX INFO: renamed from: b0 */
    public void m69888b0(List<tvr<?>> list) {
        this.f45514e = list;
        if (this.f45517h == null) {
            this.f45517h = m69883W();
        }
        if (list.size() != 0 || this.f45517h.getItemCount() <= 1) {
            this.f45517h.m67371Z(list);
            this.f45517h.m191777k0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m69889c0(Frag frag, List<LiveQuickEntryCardData> list) {
        this.f45515f = frag;
        if (this.f45516g == null) {
            this.f45516g = m69884X();
        }
        this.f45516g.m167518h0(list);
        xdl0.m208344M(this.f45513d, !vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: d0 */
    public void m69890d0(String str, final Integer num) {
        this.f45515f.duringCreated(LiveVoiceInternalSquareApi.requestEntrysSuggested(str)).subscribe(ffw.m121194e(new e30() { // from class: l.u4v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174631a.m69887a0(num, (BaseLiveListBean) obj);
            }
        }, new e30() { // from class: l.v4v
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveVoiceInternalHeaderView.m69879R((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69882V(this);
    }

    public LiveVoiceInternalHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45518i = new f30() { // from class: l.t4v
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f167751a.m69886Z((LiveQuickEntryCardData) obj, (Integer) obj2);
            }
        };
    }

    public LiveVoiceInternalHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45518i = new f30() { // from class: l.t4v
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f167751a.m69886Z((LiveQuickEntryCardData) obj, (Integer) obj2);
            }
        };
    }
}
