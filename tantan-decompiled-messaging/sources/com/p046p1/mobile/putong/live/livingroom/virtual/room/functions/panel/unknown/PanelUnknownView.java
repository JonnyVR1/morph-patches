package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGuideTemplate;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoicePanelUnknownViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.unknown.PanelUnknownView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VLinear;
import p149l.bt0;
import p149l.cxq;
import p149l.dt0;
import p149l.e0o0;
import p149l.e30;
import p149l.fbp0;
import p149l.h1c0;
import p149l.h4t;
import p149l.hvl0;
import p149l.i3c0;
import p149l.j760;
import p149l.kvc0;
import p149l.m760;
import p149l.nnn0;
import p149l.t100;
import p149l.vwb;
import p149l.w7n0;
import p149l.x7n0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/unknown/PanelUnknownView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoicePanelUnknownViewBindings;", "Ll/m760;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "r", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGuideTemplate;", "templates", "j", "(Ljava/util/List;)V", "", "collapse", RXScreenCaptureService.KEY_INDEX, "(Z)V", "visible", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "h", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "animator", "Z", "isCollapse", "", "k", "I", "getExpandViewHeight", "()I", "setExpandViewHeight", "(I)V", "expandViewHeight", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PanelUnknownView extends LiveVirtualVoicePanelUnknownViewBindings<m760> {

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
    public static void m77398b(PanelUnknownView panelUnknownView) {
        panelUnknownView.m77406l(false);
    }

    /* JADX INFO: renamed from: c */
    public static Unit m77399c(PanelUnknownView panelUnknownView, View view) {
        view.getClass();
        ((m760) panelUnknownView.f48141a).m206028F2().VoiceVirtualLiveEvent.collapsePanel().m172467p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m77400d(List list, final PanelUnknownView panelUnknownView, BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate) {
        final hvl0 hvl0Var = new hvl0(bLiveVoiceGuideTemplate);
        hvl0Var.mo109662A(new View.OnClickListener() { // from class: l.r760
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PanelUnknownView.m77403k(this.f158012a, hvl0Var, view);
            }
        });
        list.add(hvl0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m77402f(PanelUnknownView panelUnknownView) {
        xdl0.m208344M(panelUnknownView.f48146f, true);
        panelUnknownView.m77406l(true);
    }

    /* JADX INFO: renamed from: k */
    public static final void m77403k(PanelUnknownView panelUnknownView, hvl0 hvl0Var, View view) {
        m760 m760Var = (m760) panelUnknownView.f48141a;
        BLiveVoiceGuideTemplate bLiveVoiceGuideTemplate = hvl0Var.f109668a;
        bLiveVoiceGuideTemplate.getClass();
        m760Var.m153351K3(bLiveVoiceGuideTemplate);
    }

    public final int getExpandViewHeight() {
        return this.expandViewHeight;
    }

    /* JADX INFO: renamed from: i */
    public final void m77404i(boolean collapse) {
        dt0.m113503C(this.animator);
        VFrame vFrame = this.f48146f;
        Property property = View.ALPHA;
        if (collapse) {
            Animator duration = bt0.m103741n(vFrame, property, 1.0f, 0.0f).setDuration(300L);
            this.animator = duration;
            bt0.m103733f(duration, new Runnable() { // from class: l.n760
                @Override // java.lang.Runnable
                public final void run() {
                    PanelUnknownView.m77398b(this.f137487a);
                }
            });
        } else {
            Animator duration2 = bt0.m103741n(vFrame, property, 0.0f, 1.0f).setDuration(400L);
            this.animator = duration2;
            bt0.m103749v(duration2, new Runnable() { // from class: l.o760
                @Override // java.lang.Runnable
                public final void run() {
                    PanelUnknownView.m77402f(this.f142470a);
                }
            });
        }
        Animator animator = this.animator;
        animator.getClass();
        animator.setInterpolator(bt0.f77155b);
        Animator animator2 = this.animator;
        if (animator2 != null) {
            animator2.start();
        }
        this.isCollapse = collapse;
        xdl0.m208344M(this.f48144d, collapse);
    }

    /* JADX INFO: renamed from: j */
    public final void m77405j(@NotNull List<? extends BLiveVoiceGuideTemplate> templates) {
        templates.getClass();
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(templates, new e30() { // from class: l.q760
            @Override // p149l.e30
            public final void call(Object obj) {
                PanelUnknownView.m77400d(arrayList, this, (BLiveVoiceGuideTemplate) obj);
            }
        });
        int size = (arrayList.size() / 2) + (arrayList.size() % 2 == 0 ? 0 : 1);
        int iM186890d = (t100.m186890d(38.0f) * size) + (t100.m186890d(10.0f) * (size - 1));
        this.expandViewHeight = iM186890d;
        boolean z = this.isCollapse;
        VFrame vFrame = this.f48146f;
        if (z) {
            xdl0.m208344M(vFrame, false);
        } else {
            xdl0.m208325C0(vFrame, iM186890d);
        }
        T t = this.f48141a;
        t.getClass();
        xdl0.m208344M(this, e0o0.m114322h((h4t) t));
        LiveBaseAdapter liveBaseAdapter = this.adapter;
        if (liveBaseAdapter == null) {
            Intrinsics.m87502r("adapter");
            liveBaseAdapter = null;
        }
        liveBaseAdapter.m67371Z(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m77406l(boolean visible) {
        xdl0.m208344M(this.f48147g, visible);
        if (visible) {
            String strM120390f = fbp0.m120390f(((nnn0) ((m760) this.f48141a).m206027E2()).mo97490p());
            j760 j760VarM200311Y = vwb.m200311Y("roomId", ((nnn0) ((m760) this.f48141a).m206027E2()).m149818o());
            j760 j760VarM200311Y2 = vwb.m200311Y("anchorId", ((nnn0) ((m760) this.f48141a).m206027E2()).m132140j0());
            j760 j760VarM200311Y3 = vwb.m200311Y("liveId", ((nnn0) ((m760) this.f48141a).m206027E2()).m149814k());
            T t = this.f48141a;
            t.getClass();
            zvf0.m220368A("e_audio_game_panel", strM120390f, j760VarM200311Y, j760VarM200311Y2, j760VarM200311Y3, vwb.m200311Y("user_type", e0o0.m114325l((h4t) t)));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m77407r() {
        this.f48144d.setImageResource(i3c0.f111247z9);
        this.f48145e.setText("此刻，你想做点什么？");
        xdl0.m208372e0(this.f48143c, t100.f167276y);
        T t = this.f48141a;
        t.getClass();
        w7n0.m202025b((h4t) t);
        this.f48145e.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        VLinear vLinear = this.f48143c;
        vLinear.getClass();
        cxq.m109105c(vLinear, new Function1() { // from class: l.p760
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PanelUnknownView.m77399c(this.f147480a, (View) obj);
            }
        });
        this.adapter = new LiveBaseAdapter();
        this.f48147g.setLayoutManager(new GridLayoutManager(getContext(), 2));
        LiveBaseAdapter liveBaseAdapter = null;
        this.f48147g.setItemAnimator(null);
        RecyclerView recyclerView = this.f48147g;
        LiveBaseAdapter liveBaseAdapter2 = this.adapter;
        if (liveBaseAdapter2 == null) {
            Intrinsics.m87502r("adapter");
        } else {
            liveBaseAdapter = liveBaseAdapter2;
        }
        recyclerView.setAdapter(liveBaseAdapter);
        xdl0.m208327D0(x7n0.m207301a(), this.f48146f);
        xdl0.m208344M(this.f48144d, this.isCollapse);
        xdl0.m208344M(this, false);
    }

    public final void setExpandViewHeight(int i) {
        this.expandViewHeight = i;
    }
}
