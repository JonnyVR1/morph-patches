package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallApplyViewBindings;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallApplyView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.d3q;
import p153l.k0m;
import p153l.l51;
import p153l.n9c0;
import p153l.obc0;
import p153l.s910;
import p153l.ua10;
import p153l.xau;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallApplyView;", "Ll/k0m;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallApplyViewBindings;", "Ll/ua10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showEmpty", "", "q0", "(Z)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "", "Ll/s910;", "data", "p0", "(Ljava/util/List;)V", "F", "()V", "isRefresh", "r0", "", "id", "o0", "(Ljava/lang/String;)V", "n0", "l0", "(Ljava/lang/String;)Ll/s910;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "getApplyAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "applyAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class MultiCallApplyView extends LiveMultiCallApplyViewBindings<ua10> implements k0m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy applyAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallApplyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.applyAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.la10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallApplyView.m76871j0();
            }
        });
    }

    private final LiveBaseAdapter getApplyAdapter() {
        return (LiveBaseAdapter) this.applyAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m76870i0(MultiCallApplyView multiCallApplyView) {
        ((ua10) multiCallApplyView.f48817d).m195155V3();
    }

    /* JADX INFO: renamed from: j0 */
    public static LiveBaseAdapter m76871j0() {
        return new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m76873m0(MultiCallApplyView multiCallApplyView) {
        ((ua10) multiCallApplyView.f48817d).m195155V3();
    }

    /* JADX INFO: renamed from: q0 */
    private final void m76874q0(boolean showEmpty) {
        bnl0.m105524M(this.f48820g, !showEmpty);
        bnl0.m105524M(this.f48821h, showEmpty);
        if (showEmpty) {
            this.f48821h.m69900b(obc0.f146148P3);
            this.f48821h.f45502b.setText(xau.m209910t(R$string.f47697N8));
        }
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: F */
    public void mo76875F() {
        super.mo76875F();
        l51.m152888H(getContext(), new Runnable() { // from class: l.ka10
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallApplyView.m76870i0(this.f124613a);
            }
        }, 300L);
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: R */
    public void mo76876R(@NotNull Act act) {
        act.getClass();
        RecyclerView recyclerView = this.f48820g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getApplyAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.f48819f;
        swipeRefreshLayout.setColorSchemeResources(n9c0.f140871u1, n9c0.f140862r1, n9c0.f140865s1, n9c0.f140868t1);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.ja10
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                MultiCallApplyView.m76873m0(this.f118933a);
            }
        });
        m76874q0(true);
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public final s910 m76877l0(@NotNull String id) {
        Object next;
        id.getClass();
        List<d3q<?>> listM68538J = getApplyAdapter().m68538J();
        listM68538J.getClass();
        Iterator<T> it = listM68538J.iterator();
        while (it.hasNext()) {
            next = it.next();
            d3q d3qVar = (d3q) next;
            if ((d3qVar instanceof s910) && Intrinsics.m88377d(((s910) d3qVar).getApplyData().f45248id, id)) {
                return (s910) next;
            }
        }
        next = null;
        return (s910) next;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m76878n0(@NotNull String id) {
        id.getClass();
        s910 s910VarM76877l0 = m76877l0(id);
        if (s910VarM76877l0 != null) {
            getApplyAdapter().m68543O(s910VarM76877l0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m76879o0(@NotNull String id) {
        id.getClass();
        s910 s910VarM76877l0 = m76877l0(id);
        if (s910VarM76877l0 != null) {
            getApplyAdapter().m68551W(s910VarM76877l0);
            s910VarM76877l0.m185128J(true);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m76880p0(@NotNull List<s910> data) {
        data.getClass();
        m76874q0(data.isEmpty());
        getApplyAdapter().m68554Z(data);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m76881r0(boolean isRefresh) {
        this.f48819f.setRefreshing(isRefresh);
    }

    public /* synthetic */ MultiCallApplyView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
