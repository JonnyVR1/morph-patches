package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallLivingFriendBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallLivingFriendView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e30;
import p149l.e51;
import p149l.f810;
import p149l.ffw;
import p149l.h1c0;
import p149l.i3c0;
import p149l.rxl;
import p149l.v610;
import p149l.w8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0017R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallLivingFriendView;", "Ll/rxl;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallLivingFriendBindings;", "Ll/f810;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showEmpty", "", "r0", "(Z)V", "isRefresh", "s0", "", "Ll/v610;", "data", "q0", "(Ljava/util/List;)V", "F", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "p0", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "getLivingAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "livingAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallLivingFriendView extends LiveMultiCallLivingFriendBindings<f810> implements rxl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy livingAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallLivingFriendView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.livingAdapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.o910
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallLivingFriendView.m75739i0();
            }
        });
    }

    private final LiveBaseAdapter getLivingAdapter() {
        return (LiveBaseAdapter) this.livingAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static LiveBaseAdapter m75739i0() {
        return new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m75740j0(MultiCallLivingFriendView multiCallLivingFriendView, Throwable th) {
        th.getClass();
        multiCallLivingFriendView.m75747s0(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m75742l0(MultiCallLivingFriendView multiCallLivingFriendView) {
        multiCallLivingFriendView.m75748p0();
    }

    /* JADX INFO: renamed from: m0 */
    public static void m75743m0(MultiCallLivingFriendView multiCallLivingFriendView, List list) {
        list.getClass();
        multiCallLivingFriendView.m75749q0(list);
    }

    /* JADX INFO: renamed from: n0 */
    public static Unit m75744n0(MultiCallLivingFriendView multiCallLivingFriendView, List list) {
        list.getClass();
        multiCallLivingFriendView.m75747s0(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m75745o0(MultiCallLivingFriendView multiCallLivingFriendView) {
        multiCallLivingFriendView.m75748p0();
    }

    /* JADX INFO: renamed from: r0 */
    private final void m75746r0(boolean showEmpty) {
        xdl0.m208344M(this.f48004g, !showEmpty);
        xdl0.m208344M(this.f48005h, showEmpty);
        if (showEmpty) {
            this.f48005h.m68717b(i3c0.f110820P3);
            this.f48005h.f44654b.setText(w8u.m202217t(R$string.f46954S8));
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final void m75747s0(boolean isRefresh) {
        this.f48003f.setRefreshing(isRefresh);
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: F */
    public void mo75692F() {
        super.mo75692F();
        e51.m114743H(getContext(), new Runnable() { // from class: l.p910
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallLivingFriendView.m75742l0(this.f147656a);
            }
        }, 300L);
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: R */
    public void mo75693R(@NotNull Act act) {
        act.getClass();
        RecyclerView recyclerView = this.f48004g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getLivingAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.f48003f;
        swipeRefreshLayout.setColorSchemeResources(h1c0.f105410u1, h1c0.f105401r1, h1c0.f105404s1, h1c0.f105407t1);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.q910
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                MultiCallLivingFriendView.m75745o0(this.f153356a);
            }
        });
        ((f810) this.f48001d).m119863a4().subscribe(ffw.m121197h(new e30() { // from class: l.r910
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiCallLivingFriendView.m75743m0(this.f158271a, (List) obj);
            }
        }));
        m75746r0(true);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75748p0() {
        m75747s0(true);
        ((f810) this.f48001d).m119867f4(new Function1() { // from class: l.s910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallLivingFriendView.m75744n0(this.f163134a, (List) obj);
            }
        }, new Function1() { // from class: l.t910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallLivingFriendView.m75740j0(this.f168979a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75749q0(@NotNull List<v610> data) {
        data.getClass();
        m75746r0(data.isEmpty());
        getLivingAdapter().m67371Z(data);
    }

    public /* synthetic */ MultiCallLivingFriendView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
