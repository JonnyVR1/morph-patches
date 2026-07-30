package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallAudienceBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallAudienceView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0017R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallAudienceView;", "Ll/rxl;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallAudienceBindings;", "Ll/f810;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showEmpty", "", "t0", "(Z)V", "isRefresh", "u0", "", "Ll/v610;", "data", "s0", "(Ljava/util/List;)V", "F", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "Lkotlin/Function0;", "start", "finish", "r0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "q0", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "getAudienceAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "audienceAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallAudienceView extends LiveMultiCallAudienceBindings<f810> implements rxl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy audienceAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallAudienceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.audienceAdapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.s210
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallAudienceView.m75702l0();
            }
        });
    }

    private final LiveBaseAdapter getAudienceAdapter() {
        return (LiveBaseAdapter) this.audienceAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m75699i0(Function0 function0, MultiCallAudienceView multiCallAudienceView, List list) {
        function0.invoke();
        list.getClass();
        multiCallAudienceView.m75711s0(list);
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m75700j0(MultiCallAudienceView multiCallAudienceView) {
        multiCallAudienceView.m75708u0(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m75701k0(Function0 function0, Throwable th) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: l0 */
    public static LiveBaseAdapter m75702l0() {
        return new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m75704n0(MultiCallAudienceView multiCallAudienceView) {
        multiCallAudienceView.m75709q0();
    }

    /* JADX INFO: renamed from: o0 */
    public static Unit m75705o0(MultiCallAudienceView multiCallAudienceView) {
        multiCallAudienceView.m75708u0(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m75706p0(MultiCallAudienceView multiCallAudienceView) {
        multiCallAudienceView.m75709q0();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m75707t0(boolean showEmpty) {
        xdl0.m208344M(this.f47977g, !showEmpty);
        xdl0.m208344M(this.f47978h, showEmpty);
        if (showEmpty) {
            this.f47978h.m68717b(i3c0.f110820P3);
            this.f47978h.f44654b.setText(w8u.m202217t(R$string.f47038W8));
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m75708u0(boolean isRefresh) {
        this.f47976f.setRefreshing(isRefresh);
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: F */
    public void mo75692F() {
        super.mo75692F();
        e51.m114743H(getContext(), new Runnable() { // from class: l.r210
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallAudienceView.m75704n0(this.f157357a);
            }
        }, 300L);
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: R */
    public void mo75693R(@NotNull Act act) {
        act.getClass();
        RecyclerView recyclerView = this.f47977g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getAudienceAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.f47976f;
        swipeRefreshLayout.setColorSchemeResources(h1c0.f105410u1, h1c0.f105401r1, h1c0.f105404s1, h1c0.f105407t1);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.t210
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                MultiCallAudienceView.m75706p0(this.f167433a);
            }
        });
        m75707t0(true);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75709q0() {
        m75710r0(new Function0() { // from class: l.u210
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallAudienceView.m75705o0(this.f173060a);
            }
        }, new Function0() { // from class: l.v210
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallAudienceView.m75700j0(this.f179339a);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m75710r0(@NotNull Function0<Unit> start, @NotNull final Function0<Unit> finish) {
        start.getClass();
        finish.getClass();
        start.invoke();
        ((f810) this.f47974d).m119864b4().subscribe(ffw.m121194e(new e30() { // from class: l.w210
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiCallAudienceView.m75699i0(finish, this, (List) obj);
            }
        }, new e30() { // from class: l.x210
            @Override // p149l.e30
            public final void call(Object obj) {
                MultiCallAudienceView.m75701k0(finish, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m75711s0(@NotNull List<v610> data) {
        data.getClass();
        m75707t0(data.isEmpty());
        getAudienceAdapter().m67371Z(data);
    }

    public /* synthetic */ MultiCallAudienceView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
