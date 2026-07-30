package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallApplyViewBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallApplyView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.d1q;
import p149l.e51;
import p149l.h1c0;
import p149l.i110;
import p149l.i3c0;
import p149l.k210;
import p149l.rxl;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallApplyView;", "Ll/rxl;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallApplyViewBindings;", "Ll/k210;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showEmpty", "", "q0", "(Z)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "", "Ll/i110;", "data", "p0", "(Ljava/util/List;)V", "F", "()V", "isRefresh", "r0", "", "id", "o0", "(Ljava/lang/String;)V", "n0", "l0", "(Ljava/lang/String;)Ll/i110;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "getApplyAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "applyAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class MultiCallApplyView extends LiveMultiCallApplyViewBindings<k210> implements rxl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy applyAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallApplyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.applyAdapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.b210
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallApplyView.m75688j0();
            }
        });
    }

    private final LiveBaseAdapter getApplyAdapter() {
        return (LiveBaseAdapter) this.applyAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m75687i0(MultiCallApplyView multiCallApplyView) {
        ((k210) multiCallApplyView.f47969d).m144255V3();
    }

    /* JADX INFO: renamed from: j0 */
    public static LiveBaseAdapter m75688j0() {
        return new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m75690m0(MultiCallApplyView multiCallApplyView) {
        ((k210) multiCallApplyView.f47969d).m144255V3();
    }

    /* JADX INFO: renamed from: q0 */
    private final void m75691q0(boolean showEmpty) {
        xdl0.m208344M(this.f47972g, !showEmpty);
        xdl0.m208344M(this.f47973h, showEmpty);
        if (showEmpty) {
            this.f47973h.m68717b(i3c0.f110820P3);
            this.f47973h.f44654b.setText(w8u.m202217t(R$string.f46849N8));
        }
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: F */
    public void mo75692F() {
        super.mo75692F();
        e51.m114743H(getContext(), new Runnable() { // from class: l.a210
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallApplyView.m75687i0(this.f67217a);
            }
        }, 300L);
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: R */
    public void mo75693R(@NotNull Act act) {
        act.getClass();
        RecyclerView recyclerView = this.f47972g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getApplyAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.f47971f;
        swipeRefreshLayout.setColorSchemeResources(h1c0.f105410u1, h1c0.f105401r1, h1c0.f105404s1, h1c0.f105407t1);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.z110
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                MultiCallApplyView.m75690m0(this.f201043a);
            }
        });
        m75691q0(true);
    }

    @Nullable
    /* JADX INFO: renamed from: l0 */
    public final i110 m75694l0(@NotNull String id) {
        Object next;
        id.getClass();
        List<d1q<?>> listM67355J = getApplyAdapter().m67355J();
        listM67355J.getClass();
        Iterator<T> it = listM67355J.iterator();
        while (it.hasNext()) {
            next = it.next();
            d1q d1qVar = (d1q) next;
            if ((d1qVar instanceof i110) && Intrinsics.m87488d(((i110) d1qVar).getApplyData().f44400id, id)) {
                return (i110) next;
            }
        }
        next = null;
        return (i110) next;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m75695n0(@NotNull String id) {
        id.getClass();
        i110 i110VarM75694l0 = m75694l0(id);
        if (i110VarM75694l0 != null) {
            getApplyAdapter().m67360O(i110VarM75694l0);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75696o0(@NotNull String id) {
        id.getClass();
        i110 i110VarM75694l0 = m75694l0(id);
        if (i110VarM75694l0 != null) {
            getApplyAdapter().m67368W(i110VarM75694l0);
            i110VarM75694l0.m133952J(true);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75697p0(@NotNull List<i110> data) {
        data.getClass();
        m75691q0(data.isEmpty());
        getApplyAdapter().m67371Z(data);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m75698r0(boolean isRefresh) {
        this.f47971f.setRefreshing(isRefresh);
    }

    public /* synthetic */ MultiCallApplyView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
