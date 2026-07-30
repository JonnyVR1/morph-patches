package com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntryCardData;
import com.p051p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntrySuggested;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalHeaderView;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import com.p051p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.dhw;
import p153l.i4g0;
import p153l.jyb;
import p153l.pcj;
import p153l.q7v;
import p153l.r0u;
import p153l.r1j0;
import p153l.uxr;
import p153l.y20;
import p153l.y6v;
import p153l.yrs;
import p153l.z20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVoiceInternalHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VRecyclerView f46360c;

    /* JADX INFO: renamed from: d */
    public VRecyclerView f46361d;

    /* JADX INFO: renamed from: e */
    public List<uxr<?>> f46362e;

    /* JADX INFO: renamed from: f */
    public Frag f46363f;

    /* JADX INFO: renamed from: g */
    public q7v f46364g;

    /* JADX INFO: renamed from: h */
    public r0u f46365h;

    /* JADX INFO: renamed from: i */
    public z20<LiveQuickEntryCardData, Integer> f46366i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.virtualVoice.square.header.LiveVoiceInternalHeaderView$a */
    public class C12699a extends GridLayoutManager.AbstractC0554c {
        public C12699a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return LiveVoiceInternalHeaderView.this.f46365h.m68539K(i);
        }
    }

    public LiveVoiceInternalHeaderView(Context context) {
        super(context);
        this.f46366i = new z20() { // from class: l.u6v
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f177806a.m71069Z((LiveQuickEntryCardData) obj, (Integer) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m71062R(Throwable th) {
    }

    /* JADX INFO: renamed from: V */
    public final void m71065V(View view) {
        y6v.m214521a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public r0u m71066W() {
        this.f46365h = r0u.m179247J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 6, 1, false);
        gridLayoutManager.m3327v(new C12699a());
        this.f46360c.setLayoutManager(gridLayoutManager);
        this.f46360c.setAdapter(this.f46365h);
        this.f46360c.setItemAnimator(null);
        this.f46365h.m200149o0(this.f46363f, new pcj() { // from class: l.x6v
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f192641a.m71068Y();
            }
        }, LiveTeenDialogAct.f47064g);
        this.f46365h.m68552X(false);
        return this.f46365h;
    }

    /* JADX INFO: renamed from: X */
    public final q7v m71067X() {
        q7v q7vVar = new q7v();
        this.f46364g = q7vVar;
        q7vVar.m175711i0(this.f46366i);
        this.f46361d.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f46361d.setAdapter(this.f46364g);
        return this.f46364g;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m71068Y() {
        return Boolean.valueOf(!jyb.m147479J(this.f46362e));
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m71069Z(LiveQuickEntryCardData liveQuickEntryCardData, Integer num) {
        i4g0.m138521s("e_audio_shortcut", "p_audio_explore_recommend", liveQuickEntryCardData.getTrackData());
        m71073d0(liveQuickEntryCardData.getSource(), num);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m71070a0(Integer num, BaseLiveListBean baseLiveListBean) {
        if (baseLiveListBean == null || jyb.m147479J(baseLiveListBean.getList())) {
            r1j0.m179420g("当前暂无这类群组，你来创建一个吧");
            return;
        }
        yrs.m217233a(this.f46363f.act(), ((LiveQuickEntrySuggested) baseLiveListBean.getList().get(0)).getGoAction());
        LiveCardTrackData trackData = ((LiveQuickEntrySuggested) baseLiveListBean.getList().get(0)).getTrackData();
        trackData.put(FirebaseAnalytics.Param.INDEX, num);
        i4g0.m138521s("e_live_audio_room_enter", "p_audio_explore_recommend", trackData);
    }

    /* JADX INFO: renamed from: b0 */
    public void m71071b0(List<uxr<?>> list) {
        this.f46362e = list;
        if (this.f46365h == null) {
            this.f46365h = m71066W();
        }
        if (list.size() != 0 || this.f46365h.getItemCount() <= 1) {
            this.f46365h.m68554Z(list);
            this.f46365h.m200145k0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m71072c0(Frag frag, List<LiveQuickEntryCardData> list) {
        this.f46363f = frag;
        if (this.f46364g == null) {
            this.f46364g = m71067X();
        }
        this.f46364g.m175710h0(list);
        bnl0.m105524M(this.f46361d, !jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: d0 */
    public void m71073d0(String str, final Integer num) {
        this.f46363f.duringCreated(LiveVoiceInternalSquareApi.requestEntrysSuggested(str)).subscribe(dhw.m115826e(new y20() { // from class: l.v6v
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182693a.m71070a0(num, (BaseLiveListBean) obj);
            }
        }, new y20() { // from class: l.w6v
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveVoiceInternalHeaderView.m71062R((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71065V(this);
    }

    public LiveVoiceInternalHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46366i = new z20() { // from class: l.u6v
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f177806a.m71069Z((LiveQuickEntryCardData) obj, (Integer) obj2);
            }
        };
    }

    public LiveVoiceInternalHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46366i = new z20() { // from class: l.u6v
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f177806a.m71069Z((LiveQuickEntryCardData) obj, (Integer) obj2);
            }
        };
    }
}
