package com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.view.RollItemView;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveMultiCallInviteViewBindings;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.cxq;
import p149l.f810;
import p149l.h1c0;
import p149l.i3c0;
import p149l.j5d0;
import p149l.kvc0;
import p149l.mqv;
import p149l.rxl;
import p149l.sqh0;
import p149l.svq;
import p149l.t6c0;
import p149l.u610;
import p149l.w9j;
import p149l.xdl0;
import p149l.zi10;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&RE\u0010-\u001a,\u0012(\u0012&\u0012\f\u0012\n )*\u0004\u0018\u00010\u000b0\u000b )*\u0012\u0012\f\u0012\n )*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010,¨\u0006."}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteView;", "Ll/rxl;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallInviteViewBindings;", "Ll/f810;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/mqv;", "Ll/j5d0;", "user", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", "p0", "(Ll/mqv;)Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", "", "F", "()V", "o0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "onAttachedToWindow", "", "isTabSelected", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "s0", "(ZLcom/google/android/material/tabs/TabLayout$Tab;)V", "q0", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/android/app/Act;", "Ll/u610;", "m", "Lkotlin/Lazy;", "getInvitePageAdapter", "()Ll/u610;", "invitePageAdapter", "", "kotlin.jvm.PlatformType", "n", "getUserPicList", "()Ljava/util/List;", "userPicList", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MultiCallInviteView extends LiveMultiCallInviteViewBindings<f810> implements rxl {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy invitePageAdapter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy userPicList;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteView$a", "Ll/sqh0;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12897a extends sqh0 {
        public C12897a() {
        }

        @Override // p149l.sqh0, com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            MultiCallInviteView.this.m75738s0(true, tab);
            MultiCallInviteView.this.f48000k.m4250j(tab.getPosition(), false);
        }

        @Override // p149l.sqh0, com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
            super.onTabUnselected(tab);
            MultiCallInviteView.this.m75738s0(false, tab);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallInviteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.invitePageAdapter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.o710
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallInviteView.m75732m0(this.f142448a);
            }
        });
        this.userPicList = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.p710
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallInviteView.m75730k0();
            }
        });
    }

    private final u610 getInvitePageAdapter() {
        return (u610) this.invitePageAdapter.getValue();
    }

    private final List<mqv<j5d0>> getUserPicList() {
        return (List) this.userPicList.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m75728i0(MultiCallInviteView multiCallInviteView, TabLayout.Tab tab, int i) {
        tab.getClass();
        TextView textView = new TextView(multiCallInviteView.getContext());
        textView.setPadding(svq.m186103c(13), svq.m186103c(7), svq.m186103c(13), svq.m186103c(7));
        textView.setGravity(17);
        textView.setText(multiCallInviteView.getInvitePageAdapter().m191901J(i));
        tab.setCustomView(textView);
    }

    /* JADX INFO: renamed from: k0 */
    public static List m75730k0() {
        return CollectionsKt.listOf((Object[]) new mqv[]{mqv.m155998f(new j5d0(i3c0.f110831Q3, null, 2, null)), mqv.m155998f(new j5d0(i3c0.f110842R3, null, 2, null)), mqv.m155998f(new j5d0(i3c0.f110853S3, null, 2, null)), mqv.m155998f(new j5d0(i3c0.f110831Q3, null, 2, null))});
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m75731l0(MultiCallInviteView multiCallInviteView, View view) {
        view.getClass();
        zi10.INSTANCE.m218903i();
        ((f810) multiCallInviteView.f47993d).m119866d4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static u610 m75732m0(MultiCallInviteView multiCallInviteView) {
        Act act = multiCallInviteView.act;
        if (act == null) {
            Intrinsics.m87502r(SocialConstants.PARAM_ACT);
            act = null;
        }
        T t = multiCallInviteView.f47993d;
        t.getClass();
        return new u610(act, (f810) t);
    }

    /* JADX INFO: renamed from: p0 */
    private final MultiCallFriendsRollUserView m75734p0(mqv<j5d0> user) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(t6c0.f168406k4, (ViewGroup) null);
        if ((viewInflate instanceof MultiCallFriendsRollUserView) && user != null) {
            MultiCallFriendsRollUserView multiCallFriendsRollUserView = (MultiCallFriendsRollUserView) viewInflate;
            multiCallFriendsRollUserView.setViewPadding(svq.m186103c(3));
            multiCallFriendsRollUserView.mo68836a(user);
        }
        viewInflate.getClass();
        return (MultiCallFriendsRollUserView) viewInflate;
    }

    /* JADX INFO: renamed from: r0 */
    public static final RollItemView m75735r0(MultiCallInviteView multiCallInviteView, mqv mqvVar) {
        return multiCallInviteView.m75734p0(mqvVar);
    }

    @Override // p149l.rxl
    /* JADX INFO: renamed from: F */
    public void mo75692F() {
        super.mo75692F();
        T t = this.f47993d;
        t.getClass();
        f810.m119860g4((f810) t, null, null, 3, null);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [l.ho2, l.lh20] */
    @Override // p149l.rxl
    /* JADX INFO: renamed from: R */
    public void mo75693R(@NotNull Act act) {
        act.getClass();
        this.act = act;
        ViewPager2 viewPager2 = this.f48000k;
        viewPager2.setAdapter(getInvitePageAdapter());
        viewPager2.setUserInputEnabled(false);
        View view = this.f47996g;
        view.getClass();
        cxq.m109105c(view, new Function1() { // from class: l.m710
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallInviteView.m75731l0(this.f131785a, (View) obj);
            }
        });
        if (((f810) this.f47993d).getTabType() == 4) {
            this.f48000k.m4250j(0, false);
        } else if (((f810) this.f47993d).getTabType() == 3) {
            this.f48000k.m4250j(1, false);
        }
        boolean zM87488d = Intrinsics.m87488d("friends", ((f810) this.f47993d).m206027E2().mo149813j().liveMode);
        TabLayout tabLayout = this.f47999j;
        if (zM87488d) {
            xdl0.m208344M(tabLayout, false);
            return;
        }
        xdl0.m208344M(tabLayout, true);
        this.f47999j.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C12897a());
        new TabLayoutMediator(this.f47999j, this.f48000k, new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.n710
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                MultiCallInviteView.m75728i0(this.f137474a, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75736o0() {
        getInvitePageAdapter().m191903L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m75737q0();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m75737q0() {
        MultiCallRollAnimView multiCallRollAnimView = this.f47997h;
        multiCallRollAnimView.setUsers(getUserPicList());
        multiCallRollAnimView.setItemViewFunc(new w9j() { // from class: l.q710
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MultiCallInviteView.m75735r0(this.f152976a, (mqv) obj);
            }
        });
        multiCallRollAnimView.setDelay(2500);
        multiCallRollAnimView.requestDisallowInterceptTouchEvent(true);
        multiCallRollAnimView.m68832O();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m75738s0(boolean isTabSelected, TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        if (customView instanceof TextView) {
            TextView textView = (TextView) customView;
            textView.setTextColor(kvc0.m147352a(isTabSelected ? h1c0.f105330R : h1c0.f105322N));
            textView.setBackgroundResource(isTabSelected ? i3c0.f110893W : i3c0.f110939a1);
        }
    }

    public /* synthetic */ MultiCallInviteView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
