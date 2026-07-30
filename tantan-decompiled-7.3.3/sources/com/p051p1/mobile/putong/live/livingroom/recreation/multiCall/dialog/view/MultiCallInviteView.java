package com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.view.RollItemView;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveMultiCallInviteViewBindings;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView;
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
import p153l.azh0;
import p153l.bnl0;
import p153l.czq;
import p153l.ef10;
import p153l.jr10;
import p153l.k0m;
import p153l.mdd0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.pg10;
import p153l.qcj;
import p153l.txq;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&RE\u0010-\u001a,\u0012(\u0012&\u0012\f\u0012\n )*\u0004\u0018\u00010\u000b0\u000b )*\u0012\u0012\f\u0012\n )*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\n0\n0(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010,¨\u0006."}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteView;", "Ll/k0m;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveMultiCallInviteViewBindings;", "Ll/pg10;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/nsv;", "Ll/mdd0;", "user", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", "p0", "(Ll/nsv;)Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallFriendsRollUserView;", "", "F", "()V", "o0", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "R", "(Lcom/p1/mobile/android/app/Act;)V", "onAttachedToWindow", "", "isTabSelected", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "s0", "(ZLcom/google/android/material/tabs/TabLayout$Tab;)V", "q0", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/android/app/Act;", "Ll/ef10;", "m", "Lkotlin/Lazy;", "getInvitePageAdapter", "()Ll/ef10;", "invitePageAdapter", "", "kotlin.jvm.PlatformType", "n", "getUserPicList", "()Ljava/util/List;", "userPicList", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MultiCallInviteView extends LiveMultiCallInviteViewBindings<pg10> implements k0m {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public Act act;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy invitePageAdapter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy userPicList;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallInviteView$a", "Ll/azh0;", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "onTabSelected", "(Lcom/google/android/material/tabs/TabLayout$Tab;)V", "onTabUnselected", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13060a extends azh0 {
        public C13060a() {
        }

        @Override // p153l.azh0, com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getClass();
            MultiCallInviteView.this.m76921s0(true, tab);
            MultiCallInviteView.this.f48848k.m4252j(tab.getPosition(), false);
        }

        @Override // p153l.azh0, com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getClass();
            super.onTabUnselected(tab);
            MultiCallInviteView.this.m76921s0(false, tab);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCallInviteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.invitePageAdapter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.yf10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallInviteView.m76915m0(this.f199439a);
            }
        });
        this.userPicList = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.zf10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiCallInviteView.m76913k0();
            }
        });
    }

    private final ef10 getInvitePageAdapter() {
        return (ef10) this.invitePageAdapter.getValue();
    }

    private final List<nsv<mdd0>> getUserPicList() {
        return (List) this.userPicList.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m76911i0(MultiCallInviteView multiCallInviteView, TabLayout.Tab tab, int i) {
        tab.getClass();
        TextView textView = new TextView(multiCallInviteView.getContext());
        textView.setPadding(txq.m193530c(13), txq.m193530c(7), txq.m193530c(13), txq.m193530c(7));
        textView.setGravity(17);
        textView.setText(multiCallInviteView.getInvitePageAdapter().m120582J(i));
        tab.setCustomView(textView);
    }

    /* JADX INFO: renamed from: k0 */
    public static List m76913k0() {
        return CollectionsKt.listOf((Object[]) new nsv[]{nsv.m164636f(new mdd0(obc0.f146159Q3, null, 2, null)), nsv.m164636f(new mdd0(obc0.f146170R3, null, 2, null)), nsv.m164636f(new mdd0(obc0.f146181S3, null, 2, null)), nsv.m164636f(new mdd0(obc0.f146159Q3, null, 2, null))});
    }

    /* JADX INFO: renamed from: l0 */
    public static Unit m76914l0(MultiCallInviteView multiCallInviteView, View view) {
        view.getClass();
        jr10.INSTANCE.m146667i();
        ((pg10) multiCallInviteView.f48841d).m172198d4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static ef10 m76915m0(MultiCallInviteView multiCallInviteView) {
        Act act = multiCallInviteView.act;
        if (act == null) {
            Intrinsics.m88391r(SocialConstants.PARAM_ACT);
            act = null;
        }
        T t = multiCallInviteView.f48841d;
        t.getClass();
        return new ef10(act, (pg10) t);
    }

    /* JADX INFO: renamed from: p0 */
    private final MultiCallFriendsRollUserView m76917p0(nsv<mdd0> user) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(yec0.f199138k4, (ViewGroup) null);
        if ((viewInflate instanceof MultiCallFriendsRollUserView) && user != null) {
            MultiCallFriendsRollUserView multiCallFriendsRollUserView = (MultiCallFriendsRollUserView) viewInflate;
            multiCallFriendsRollUserView.setViewPadding(txq.m193530c(3));
            multiCallFriendsRollUserView.mo70019a(user);
        }
        viewInflate.getClass();
        return (MultiCallFriendsRollUserView) viewInflate;
    }

    /* JADX INFO: renamed from: r0 */
    public static final RollItemView m76918r0(MultiCallInviteView multiCallInviteView, nsv nsvVar) {
        return multiCallInviteView.m76917p0(nsvVar);
    }

    @Override // p153l.k0m
    /* JADX INFO: renamed from: F */
    public void mo76875F() {
        super.mo76875F();
        T t = this.f48841d;
        t.getClass();
        pg10.m172192g4((pg10) t, null, null, 3, null);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [l.oo2, l.vp20] */
    @Override // p153l.k0m
    /* JADX INFO: renamed from: R */
    public void mo76876R(@NotNull Act act) {
        act.getClass();
        this.act = act;
        ViewPager2 viewPager2 = this.f48848k;
        viewPager2.setAdapter(getInvitePageAdapter());
        viewPager2.setUserInputEnabled(false);
        View view = this.f48844g;
        view.getClass();
        czq.m113347c(view, new Function1() { // from class: l.wf10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiCallInviteView.m76914l0(this.f188739a, (View) obj);
            }
        });
        if (((pg10) this.f48841d).getTabType() == 4) {
            this.f48848k.m4252j(0, false);
        } else if (((pg10) this.f48841d).getTabType() == 3) {
            this.f48848k.m4252j(1, false);
        }
        boolean zM88377d = Intrinsics.m88377d("friends", ((pg10) this.f48841d).m213810E2().mo183435j().liveMode);
        TabLayout tabLayout = this.f48847j;
        if (zM88377d) {
            bnl0.m105524M(tabLayout, false);
            return;
        }
        bnl0.m105524M(tabLayout, true);
        this.f48847j.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C13060a());
        new TabLayoutMediator(this.f48847j, this.f48848k, new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.xf10
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                MultiCallInviteView.m76911i0(this.f193996a, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m76919o0() {
        getInvitePageAdapter().m120584L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m76920q0();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m76920q0() {
        MultiCallRollAnimView multiCallRollAnimView = this.f48845h;
        multiCallRollAnimView.setUsers(getUserPicList());
        multiCallRollAnimView.setItemViewFunc(new qcj() { // from class: l.ag10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MultiCallInviteView.m76918r0(this.f71077a, (nsv) obj);
            }
        });
        multiCallRollAnimView.setDelay(2500);
        multiCallRollAnimView.requestDisallowInterceptTouchEvent(true);
        multiCallRollAnimView.m70015O();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m76921s0(boolean isTabSelected, TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        if (customView instanceof TextView) {
            TextView textView = (TextView) customView;
            textView.setTextColor(n3d0.m161277a(isTabSelected ? n9c0.f140791R : n9c0.f140783N));
            textView.setBackgroundResource(isTabSelected ? obc0.f146221W : obc0.f146267a1);
        }
    }

    public /* synthetic */ MultiCallInviteView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
