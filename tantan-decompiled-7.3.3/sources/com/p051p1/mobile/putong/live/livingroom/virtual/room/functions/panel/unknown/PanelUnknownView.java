package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGuideTemplate;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoicePanelUnknownViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown.PanelUnknownView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p151v.VLinear;
import p153l.ahn0;
import p153l.bhn0;
import p153l.bnl0;
import p153l.czq;
import p153l.gt0;
import p153l.i4g0;
import p153l.i6t;
import p153l.i9o0;
import p153l.it0;
import p153l.jkp0;
import p153l.jyb;
import p153l.l4m0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.pf60;
import p153l.qa00;
import p153l.rwn0;
import p153l.sf60;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/unknown/PanelUnknownView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoicePanelUnknownViewBindings;", "Ll/sf60;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGuideTemplate;", "templates", "j", "(Ljava/util/List;)V", "", "collapse", RXScreenCaptureService.KEY_INDEX, "(Z)V", "visible", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "h", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "animator", "Z", "isCollapse", "", "k", "I", "getExpandViewHeight", "()I", "setExpandViewHeight", "(I)V", "expandViewHeight", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PanelUnknownView extends LiveVirtualVoicePanelUnknownViewBindings<sf60> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public LiveBaseAdapter adapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Animator animator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isCollapse;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int expandViewHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelUnknownView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m78581b(PanelUnknownView panelUnknownView) {
        panelUnknownView.m78589l(false);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m78582c(PanelUnknownView panelUnknownView, View view) {
        view.getClass();
        ((sf60) panelUnknownView.f48989a).m213811F2().VoiceVirtualLiveEvent.collapsePanel().m199277p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m78583d(List list, final PanelUnknownView panelUnknownView, BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate) {
        final l4m0 l4m0Var = new l4m0(bLiveVoiceGuideTemplate);
        l4m0Var.mo113881A(new View.OnClickListener() { // from class: l.xf60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PanelUnknownView.m78586k(this.f194006a, l4m0Var, view);
            }
        });
        list.add(l4m0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m78585f(PanelUnknownView panelUnknownView) {
        bnl0.m105524M(panelUnknownView.f48994f, true);
        panelUnknownView.m78589l(true);
    }

    /* JADX INFO: renamed from: k */
    public static final void m78586k(PanelUnknownView panelUnknownView, l4m0 l4m0Var, View view) {
        sf60 sf60Var = (sf60) panelUnknownView.f48989a;
        BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate = l4m0Var.f129988a;
        bLiveVoiceGuideTemplate.getClass();
        sf60Var.m185583K3(bLiveVoiceGuideTemplate);
    }

    public final int getExpandViewHeight() {
        return this.expandViewHeight;
    }

    /* JADX INFO: renamed from: i */
    public final void m78587i(boolean collapse) {
        it0.m142009C(this.animator);
        VFrame vFrame = this.f48994f;
        Property property = View.ALPHA;
        if (collapse) {
            Animator duration = gt0.m132168n(vFrame, property, 1.0f, 0.0f).setDuration(300L);
            this.animator = duration;
            gt0.m132160f(duration, new Runnable() { // from class: l.tf60
                @Override // java.lang.Runnable
                public final void run() {
                    PanelUnknownView.m78581b(this.f173931a);
                }
            });
        } else {
            Animator duration2 = gt0.m132168n(vFrame, property, 0.0f, 1.0f).setDuration(400L);
            this.animator = duration2;
            gt0.m132176v(duration2, new Runnable() { // from class: l.uf60
                @Override // java.lang.Runnable
                public final void run() {
                    PanelUnknownView.m78585f(this.f178739a);
                }
            });
        }
        Animator animator = this.animator;
        animator.getClass();
        animator.setInterpolator(gt0.f106347b);
        Animator animator2 = this.animator;
        if (animator2 != null) {
            animator2.start();
        }
        this.isCollapse = collapse;
        bnl0.m105524M(this.f48992d, collapse);
    }

    /* JADX INFO: renamed from: j */
    public final void m78588j(@NotNull List<? extends BLiveVoiceGuideTemplate> templates) {
        templates.getClass();
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(templates, new y20() { // from class: l.wf60
            @Override // p153l.y20
            public final void call(Object obj) {
                PanelUnknownView.m78583d(arrayList, this, (BLiveVoiceGuideTemplate) obj);
            }
        });
        int size = (arrayList.size() / 2) + (arrayList.size() % 2 == 0 ? 0 : 1);
        int iM175859d = (qa00.m175859d(38.0f) * size) + (qa00.m175859d(10.0f) * (size - 1));
        this.expandViewHeight = iM175859d;
        boolean z = this.isCollapse;
        VFrame vFrame = this.f48994f;
        if (z) {
            bnl0.m105524M(vFrame, false);
        } else {
            bnl0.m105505C0(vFrame, iM175859d);
        }
        T t = this.f48989a;
        t.getClass();
        bnl0.m105524M(this, i9o0.m139137h((i6t) t));
        LiveBaseAdapter liveBaseAdapter = this.adapter;
        if (liveBaseAdapter == null) {
            Intrinsics.m88391r("adapter");
            liveBaseAdapter = null;
        }
        liveBaseAdapter.m68554Z(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m78589l(boolean visible) {
        bnl0.m105524M(this.f48995g, visible);
        if (visible) {
            String strM145875f = jkp0.m145875f(((rwn0) ((sf60) this.f48989a).m213810E2()).mo118373p());
            pf60 pf60VarM147494Y = jyb.m147494Y("roomId", ((rwn0) ((sf60) this.f48989a).m213810E2()).m202194o());
            pf60 pf60VarM147494Y2 = jyb.m147494Y("anchorId", ((rwn0) ((sf60) this.f48989a).m213810E2()).m168526j0());
            pf60 pf60VarM147494Y3 = jyb.m147494Y("liveId", ((rwn0) ((sf60) this.f48989a).m213810E2()).m202191k());
            T t = this.f48989a;
            t.getClass();
            i4g0.m138492A("e_audio_game_panel", strM145875f, pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, jyb.m147494Y("user_type", i9o0.m139140l((i6t) t)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m78590r() {
        this.f48992d.setImageResource(obc0.f146575z9);
        this.f48993e.setText("此刻，你想做点什么？");
        bnl0.m105552e0(this.f48991c, qa00.f156338y);
        T t = this.f48989a;
        t.getClass();
        ahn0.m97860b((i6t) t);
        this.f48993e.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        VLinear vLinear = this.f48991c;
        vLinear.getClass();
        czq.m113347c(vLinear, new Function1() { // from class: l.vf60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PanelUnknownView.m78582c(this.f183882a, (View) obj);
            }
        });
        this.adapter = new LiveBaseAdapter();
        this.f48995g.setLayoutManager(new GridLayoutManager(getContext(), 2));
        LiveBaseAdapter liveBaseAdapter = null;
        this.f48995g.setItemAnimator(null);
        RecyclerView recyclerView = this.f48995g;
        LiveBaseAdapter liveBaseAdapter2 = this.adapter;
        if (liveBaseAdapter2 == null) {
            Intrinsics.m88391r("adapter");
        } else {
            liveBaseAdapter = liveBaseAdapter2;
        }
        recyclerView.setAdapter(liveBaseAdapter);
        bnl0.m105507D0(bhn0.m104350a(), this.f48994f);
        bnl0.m105524M(this.f48992d, this.isCollapse);
        bnl0.m105524M(this, false);
    }

    public final void setExpandViewHeight(int i) {
        this.expandViewHeight = i;
    }
}
