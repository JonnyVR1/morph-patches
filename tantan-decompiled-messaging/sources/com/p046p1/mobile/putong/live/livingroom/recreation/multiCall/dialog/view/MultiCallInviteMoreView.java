package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallInviteMoreViewBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteMoreView;
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
import p147v.VImage;
import p147v.VText;
import p149l.cxq;
import p149l.e51;
import p149l.e710;
import p149l.h1c0;
import p149l.i3c0;
import p149l.rxl;
import p149l.v610;
import p149l.w8u;
import p149l.x610;
import p149l.xdl0;
import p149l.zi10;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u000eJ\u001b\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018¢\u0006\u0004\b\u001f\u0010\u001cJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteMoreView;", "Ll/rxl;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallInviteMoreViewBindings;", "Ll/e710;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "showEmpty", "", "u0", "(Z)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "F", "()V", "onDetachedFromWindow", "isRefresh", "v0", "", "Ll/v610;", "data", "t0", "(Ljava/util/List;)V", "", "ids", "s0", Item.TYPE, "p0", "(Ll/v610;)V", "", "listCount", "checkCount", "q0", "(II)V", "m", "Lcom/p1/mobile/android/app/Act;", "Ll/x610;", "n", "Lkotlin/Lazy;", "getInviteMoreAdapter", "()Ll/x610;", "inviteMoreAdapter", "Lkotlin/Function0;", "o", "Lkotlin/jvm/functions/Function0;", "getFriendInvites", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallInviteMoreView extends LiveMultiCallInviteMoreViewBindings<e710> implements rxl {

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
        this.inviteMoreAdapter = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.j710
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallInviteMoreView.m75720o0();
            }
        });
        this.getFriendInvites = new Function0() { // from class: l.k710
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallInviteMoreView.m75716k0(this.f121525a);
            }
        };
    }

    private final x610 getInviteMoreAdapter() {
        return (x610) this.inviteMoreAdapter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m75714i0(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: j0 */
    public static Unit m75715j0(MultiCallInviteMoreView multiCallInviteMoreView, View view) {
        view.getClass();
        ((e710) multiCallInviteMoreView.f47984d).m115177T3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static Unit m75716k0(MultiCallInviteMoreView multiCallInviteMoreView) {
        ((e710) multiCallInviteMoreView.f47984d).m115176S3(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m75717l0(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: m0 */
    public static Unit m75718m0(MultiCallInviteMoreView multiCallInviteMoreView, View view) {
        view.getClass();
        List<String> listM207164f0 = multiCallInviteMoreView.getInviteMoreAdapter().m207164f0();
        zi10.INSTANCE.m218904j(listM207164f0.size());
        ((e710) multiCallInviteMoreView.f47984d).m115178U3(listM207164f0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o0 */
    public static x610 m75720o0() {
        return new x610();
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m75721r0(MultiCallInviteMoreView multiCallInviteMoreView) {
        ((e710) multiCallInviteMoreView.f47984d).m115176S3(true);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m75722u0(boolean showEmpty) {
        xdl0.m208344M(this.f47990j, !showEmpty);
        xdl0.m208344M(this.f47991k, showEmpty);
        if (showEmpty) {
            this.f47991k.m68717b(i3c0.f110820P3);
            this.f47991k.f44654b.setText(w8u.m202217t(R$string.f46870O8));
        }
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: F */
    public void mo75692F() {
        super.mo75692F();
        m75724q0(getInviteMoreAdapter().getItemCount(), getInviteMoreAdapter().m207164f0().size());
        Context context = getContext();
        final Function0<Unit> function0 = this.getFriendInvites;
        e51.m114743H(context, new Runnable() { // from class: l.l710
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallInviteMoreView.m75714i0(function0);
            }
        }, 300L);
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: R */
    public void mo75693R(@NotNull Act act) {
        act.getClass();
        this.act = act;
        RecyclerView recyclerView = this.f47990j;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(getInviteMoreAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.f47989i;
        swipeRefreshLayout.setColorSchemeResources(h1c0.f105410u1, h1c0.f105401r1, h1c0.f105404s1, h1c0.f105407t1);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.f710
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                MultiCallInviteMoreView.m75721r0(this.f96192a);
            }
        });
        VImage vImage = this.f47987g;
        vImage.getClass();
        cxq.m109105c(vImage, new Function1() { // from class: l.g710
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallInviteMoreView.m75715j0(this.f101324a, (View) obj);
            }
        });
        VText vText = this.f47992l;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.h710
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallInviteMoreView.m75718m0(this.f106188a, (View) obj);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Function0<Unit> function0 = this.getFriendInvites;
        e51.m114745J(new Runnable() { // from class: l.i710
            @Override // java.lang.Runnable
            public final void run() {
                MultiCallInviteMoreView.m75717l0(function0);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75723p0(@NotNull v610 item) {
        item.getClass();
        x610 inviteMoreAdapter = getInviteMoreAdapter();
        int size = inviteMoreAdapter.m207165g0().size();
        if (item.getChecked() || size < 9) {
            inviteMoreAdapter.m207163e0(item);
            inviteMoreAdapter.m67360O(item);
            m75724q0(inviteMoreAdapter.getItemCount(), inviteMoreAdapter.m207165g0().size());
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75724q0(int listCount, int checkCount) {
        xdl0.m208345M0(this.f47992l, listCount > 0);
        if (listCount > 0) {
            this.f47992l.setBackgroundResource(checkCount > 0 ? i3c0.f111130q0 : i3c0.f110871U);
            this.f47992l.setText(w8u.m202218u(R$string.f46609C8, Integer.valueOf(checkCount)));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m75725s0(@NotNull List<String> ids) {
        ids.getClass();
        getInviteMoreAdapter().m207166h0(ids);
        m75724q0(getInviteMoreAdapter().getItemCount(), 0);
        m75722u0(getInviteMoreAdapter().m67355J().isEmpty());
    }

    /* JADX INFO: renamed from: t0 */
    public final void m75726t0(@NotNull List<v610> data) {
        data.getClass();
        m75722u0(data.isEmpty());
        getInviteMoreAdapter().m67371Z(data);
        m75724q0(data.size(), 0);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m75727v0(boolean isRefresh) {
        this.f47989i.setRefreshing(isRefresh);
    }

    public /* synthetic */ MultiCallInviteMoreView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
