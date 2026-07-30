package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallAudienceBindings;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallAudienceView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.bnl0;
import p153l.dhw;
import p153l.ff10;
import p153l.k0m;
import p153l.l51;
import p153l.n9c0;
import p153l.obc0;
import p153l.pg10;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0017R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallAudienceView;", "Ll/k0m;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallAudienceBindings;", "Ll/pg10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showEmpty", "", "t0", "(Z)V", "isRefresh", "u0", "", "Ll/ff10;", "data", "s0", "(Ljava/util/List;)V", "F", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "Lkotlin/Function0;", "start", "finish", "r0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "q0", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "getAudienceAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "audienceAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MultiCallAudienceView extends LiveMultiCallAudienceBindings<pg10> implements k0m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy audienceAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallAudienceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.audienceAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.cb10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallAudienceView.m76885l0();
            }
        });
    }

    private final LiveBaseAdapter getAudienceAdapter() {
        return (LiveBaseAdapter) this.audienceAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m76882i0(Function0 function0, MultiCallAudienceView multiCallAudienceView, List list) {
        function0.invoke();
        list.getClass();
        multiCallAudienceView.m76894s0(list);
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m76883j0(MultiCallAudienceView multiCallAudienceView) {
        multiCallAudienceView.m76891u0(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m76884k0(Function0 function0, Throwable th) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: l0 */
    public static LiveBaseAdapter m76885l0() {
        return new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m76887n0(MultiCallAudienceView multiCallAudienceView) {
        multiCallAudienceView.m76892q0();
    }

    /* JADX INFO: renamed from: o0 */
    public static Unit m76888o0(MultiCallAudienceView multiCallAudienceView) {
        multiCallAudienceView.m76891u0(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m76889p0(MultiCallAudienceView multiCallAudienceView) {
        multiCallAudienceView.m76892q0();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m76890t0(boolean showEmpty) {
        bnl0.m105524M(this.f48825g, !showEmpty);
        bnl0.m105524M(this.f48826h, showEmpty);
        if (showEmpty) {
            this.f48826h.m69900b(obc0.f146148P3);
            this.f48826h.f45502b.setText(xau.m209910t(R$string.f47886W8));
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m76891u0(boolean isRefresh) {
        this.f48824f.setRefreshing(isRefresh);
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: F */
    public void mo76875F() {
        super.mo76875F();
        l51.m152888H(getContext(), new Runnable() { // from class: l.bb10
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallAudienceView.m76887n0(this.f75766a);
            }
        }, 300L);
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: R */
    public void mo76876R(@NotNull Act act) {
        act.getClass();
        RecyclerView recyclerView = this.f48825g;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getAudienceAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.f48824f;
        swipeRefreshLayout.setColorSchemeResources(n9c0.f140871u1, n9c0.f140862r1, n9c0.f140865s1, n9c0.f140868t1);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.db10
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                MultiCallAudienceView.m76889p0(this.f85960a);
            }
        });
        m76890t0(true);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m76892q0() {
        m76893r0(new Function0() { // from class: l.eb10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallAudienceView.m76888o0(this.f92824a);
            }
        }, new Function0() { // from class: l.fb10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallAudienceView.m76883j0(this.f98032a);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m76893r0(@NotNull Function0<Unit> start, @NotNull final Function0<Unit> finish) {
        start.getClass();
        finish.getClass();
        start.invoke();
        ((pg10) this.f48822d).m172196b4().subscribe(dhw.m115826e(new y20() { // from class: l.gb10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiCallAudienceView.m76882i0(finish, this, (List) obj);
            }
        }, new y20() { // from class: l.hb10
            @Override // p153l.y20
            public final void call(Object obj) {
                MultiCallAudienceView.m76884k0(finish, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m76894s0(@NotNull List<ff10> data) {
        data.getClass();
        m76890t0(data.isEmpty());
        getAudienceAdapter().m68554Z(data);
    }

    public /* synthetic */ MultiCallAudienceView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
