package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallInviteMoreViewBindings;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
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
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.czq;
import p153l.ff10;
import p153l.hf10;
import p153l.jr10;
import p153l.k0m;
import p153l.l51;
import p153l.n9c0;
import p153l.obc0;
import p153l.of10;
import p153l.xau;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u000eJ\u001b\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018¢\u0006\u0004\b\u001f\u0010\u001cJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteMoreView;", "Ll/k0m;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallInviteMoreViewBindings;", "Ll/of10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showEmpty", "", "u0", "(Z)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "F", "()V", "onDetachedFromWindow", "isRefresh", "v0", "", "Ll/ff10;", "data", "t0", "(Ljava/util/List;)V", "", "ids", "s0", Item.TYPE, "p0", "(Ll/ff10;)V", "", "listCount", "checkCount", "q0", "(II)V", "m", "Lcom/p1/mobile/android/app/Act;", "Ll/hf10;", "n", "Lkotlin/Lazy;", "getInviteMoreAdapter", "()Ll/hf10;", "inviteMoreAdapter", "Lkotlin/Function0;", "o", "Lkotlin/jvm/functions/Function0;", "getFriendInvites", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MultiCallInviteMoreView extends LiveMultiCallInviteMoreViewBindings<of10> implements k0m {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy inviteMoreAdapter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> getFriendInvites;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallInviteMoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.inviteMoreAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.tf10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallInviteMoreView.m76903o0();
            }
        });
        this.getFriendInvites = new Function0() { // from class: l.uf10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallInviteMoreView.m76899k0(this.f178726a);
            }
        };
    }

    private final hf10 getInviteMoreAdapter() {
        return (hf10) this.inviteMoreAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m76897i0(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m76898j0(MultiCallInviteMoreView multiCallInviteMoreView, View view) {
        view.getClass();
        ((of10) multiCallInviteMoreView.f48832d).m167400T3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static Unit m76899k0(MultiCallInviteMoreView multiCallInviteMoreView) {
        ((of10) multiCallInviteMoreView.f48832d).m167399S3(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m76900l0(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m76901m0(MultiCallInviteMoreView multiCallInviteMoreView, View view) {
        view.getClass();
        List<String> listM134682f0 = multiCallInviteMoreView.getInviteMoreAdapter().m134682f0();
        jr10.INSTANCE.m146668j(listM134682f0.size());
        ((of10) multiCallInviteMoreView.f48832d).m167401U3(listM134682f0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static hf10 m76903o0() {
        return new hf10();
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m76904r0(MultiCallInviteMoreView multiCallInviteMoreView) {
        ((of10) multiCallInviteMoreView.f48832d).m167399S3(true);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m76905u0(boolean showEmpty) {
        bnl0.m105524M(this.f48838j, !showEmpty);
        bnl0.m105524M(this.f48839k, showEmpty);
        if (showEmpty) {
            this.f48839k.m69900b(obc0.f146148P3);
            this.f48839k.f45502b.setText(xau.m209910t(R$string.f47718O8));
        }
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: F */
    public void mo76875F() {
        super.mo76875F();
        m76907q0(getInviteMoreAdapter().getItemCount(), getInviteMoreAdapter().m134682f0().size());
        Context context = getContext();
        final Function0<Unit> function0 = this.getFriendInvites;
        l51.m152888H(context, new Runnable() { // from class: l.vf10
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallInviteMoreView.m76897i0(function0);
            }
        }, 300L);
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: R */
    public void mo76876R(@NotNull Act act) {
        act.getClass();
        this.act = act;
        RecyclerView recyclerView = this.f48838j;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getInviteMoreAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.f48837i;
        swipeRefreshLayout.setColorSchemeResources(n9c0.f140871u1, n9c0.f140862r1, n9c0.f140865s1, n9c0.f140868t1);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.pf10
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                MultiCallInviteMoreView.m76904r0(this.f152148a);
            }
        });
        VImage vImage = this.f48835g;
        vImage.getClass();
        czq.m113347c(vImage, new Function1() { // from class: l.qf10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallInviteMoreView.m76898j0(this.f157237a, (View) obj);
            }
        });
        VText vText = this.f48840l;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.rf10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallInviteMoreView.m76901m0(this.f162756a, (View) obj);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Function0<Unit> function0 = this.getFriendInvites;
        l51.m152890J(new Runnable() { // from class: l.sf10
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallInviteMoreView.m76900l0(function0);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m76906p0(@NotNull ff10 item) {
        item.getClass();
        hf10 inviteMoreAdapter = getInviteMoreAdapter();
        int size = inviteMoreAdapter.m134683g0().size();
        if (item.getChecked() || size < 9) {
            inviteMoreAdapter.m134681e0(item);
            inviteMoreAdapter.m68543O(item);
            m76907q0(inviteMoreAdapter.getItemCount(), inviteMoreAdapter.m134683g0().size());
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m76907q0(int listCount, int checkCount) {
        bnl0.m105525M0(this.f48840l, listCount > 0);
        if (listCount > 0) {
            this.f48840l.setBackgroundResource(checkCount > 0 ? obc0.f146458q0 : obc0.f146199U);
            this.f48840l.setText(xau.m209911u(R$string.f47457C8, Integer.valueOf(checkCount)));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m76908s0(@NotNull List<String> ids) {
        ids.getClass();
        getInviteMoreAdapter().m134684h0(ids);
        m76907q0(getInviteMoreAdapter().getItemCount(), 0);
        m76905u0(getInviteMoreAdapter().m68538J().isEmpty());
    }

    /* JADX INFO: renamed from: t0 */
    public final void m76909t0(@NotNull List<ff10> data) {
        data.getClass();
        m76905u0(data.isEmpty());
        getInviteMoreAdapter().m68554Z(data);
        m76907q0(data.size(), 0);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m76910v0(boolean isRefresh) {
        this.f48837i.setRefreshing(isRefresh);
    }

    public /* synthetic */ MultiCallInviteMoreView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
