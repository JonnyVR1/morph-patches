package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberViewBindings;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.item.VirtualVoiceMemberItemView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.ado0;
import p153l.bnl0;
import p153l.cco0;
import p153l.czq;
import p153l.d3q;
import p153l.h64;
import p153l.i0k;
import p153l.jyb;
import p153l.l51;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.qa00;
import p153l.qcj;
import p153l.r8m0;
import p153l.rwn0;
import p153l.s7m0;
import p153l.vkp0;
import p153l.vxr;
import p153l.x20;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b \u0010\u0010J\u001b\u0010!\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b!\u0010\u0016J!\u0010&\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\u0017\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J!\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020,022\u0006\u00101\u001a\u00020\"¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020,2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020<2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010L¨\u0006N"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/member/VirtualVoiceMembersView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceMemberViewBindings;", "Ll/s7m0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "r", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;", "call", "N1", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;)V", ResourceDirection.f39656v, "Ll/nsv;", "Ll/h64;", "livingUser", "w", "(Ll/nsv;)V", "Ll/ado0;", "memberInfo", "setData", "(Ll/ado0;)V", "destroy", "", "totalMembers", "setMemberCount", "(J)V", BaseSei.f14626Z, "A", "", "userId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTagBubble;", "bubbleInfo", BaseSei.f14624X, "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTagBubble;)V", "", "p", "()Z", "m", "", FirebaseAnalytics.Param.INDEX, "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f45294s, "(I)Landroid/view/View;", "userID", "Lkotlin/Pair;", "", "u", "(Ljava/lang/String;)Lkotlin/Pair;", "q", "(Ljava/lang/String;)I", "Lcom/p1/mobile/putong/live/livingroom/view/LiveScrollView;", "liveScrollView", "setSwallowTarget", "(Lcom/p1/mobile/putong/live/livingroom/view/LiveScrollView;)V", "Ll/r8m0;", "n", "(Ljava/lang/String;)Ll/r8m0;", "Lcom/p1/mobile/putong/live/base/data/BLiveMember;", "member", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/ado0;Lcom/p1/mobile/putong/live/base/data/BLiveMember;)Ll/r8m0;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "f", "Lkotlin/Lazy;", "getMemberLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "memberLayoutManager", "Ll/cco0;", "g", "getMemberAdapter", "()Ll/cco0;", "memberAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class VirtualVoiceMembersView extends LiveVirtualVoiceMemberViewBindings<s7m0<?>> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy memberLayoutManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy memberAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualVoiceMembersView(@NotNull final Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.memberLayoutManager = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.t8m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualVoiceMembersView.m78182i(context);
            }
        });
        this.memberAdapter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.u8m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualVoiceMembersView.m78184k();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static Unit m78177b(VirtualVoiceMembersView virtualVoiceMembersView, View view) {
        view.getClass();
        s7m0 s7m0Var = (s7m0) virtualVoiceMembersView.f48980a;
        if (s7m0Var != null) {
            s7m0Var.m185025o4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m78178c(String str, d3q d3qVar) {
        d3qVar.getClass();
        return Boolean.valueOf(TextUtils.equals(((r8m0) d3qVar).f161722d.f143542a.f107997a, str));
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v8, types: [l.oo2] */
    /* JADX INFO: renamed from: e */
    public static void m78180e(final VirtualVoiceMembersView virtualVoiceMembersView, String str, BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        int i;
        int iM78192q = virtualVoiceMembersView.m78192q(str);
        int iFindFirstVisibleItemPosition = virtualVoiceMembersView.getMemberLayoutManager().findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = virtualVoiceMembersView.getMemberLayoutManager().findLastVisibleItemPosition();
        View viewM78194s = virtualVoiceMembersView.m78194s(iM78192q);
        if (viewM78194s == null || iFindFirstVisibleItemPosition > iM78192q || iM78192q > iFindLastVisibleItemPosition) {
            viewM78194s = virtualVoiceMembersView.f48984e;
        }
        View viewInflate = LayoutInflater.from(virtualVoiceMembersView.getContext()).inflate(yec0.f199092ga, (ViewGroup) null);
        viewInflate.getClass();
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) viewInflate;
        bLiveVoiceTagBubble.getClass();
        String strM202194o = ((s7m0) virtualVoiceMembersView.f48980a).m213810E2().m202194o();
        strM202194o.getClass();
        String strM168526j0 = ((s7m0) virtualVoiceMembersView.f48980a).m213810E2().m168526j0();
        strM168526j0.getClass();
        String strM202191k = ((s7m0) virtualVoiceMembersView.f48980a).m213810E2().m202191k();
        strM202191k.getClass();
        sayHiBubbleView.m77831f(bLiveVoiceTagBubble, strM202194o, strM168526j0, strM202191k, new x20() { // from class: l.z8m0
            @Override // p153l.x20
            public final void call() {
                VirtualVoiceMembersView.m78185y(this.f203400a);
            }
        });
        sayHiBubbleView.getUser().setTextSize(12.0f);
        sayHiBubbleView.getContent().setTextSize(12.0f);
        C4496a c4496a = new C4496a(virtualVoiceMembersView.getContext());
        c4496a.m21846B(qa00.f156316c).m21876s(sayHiBubbleView).m21873p(75).m21881x(-qa00.f156325l).m21869k(n3d0.m161277a(n9c0.f140823e1)).m21874q(C4496a.f16399N).m21860b(7000L);
        if (Intrinsics.m88377d(viewM78194s, virtualVoiceMembersView.f48984e)) {
            c4496a.m21880w(qa00.f156321h);
        } else if (iM78192q == iFindFirstVisibleItemPosition || iM78192q == (i = iFindFirstVisibleItemPosition + 1)) {
            c4496a.m21879v(qa00.f156321h);
        } else if (iM78192q < i || iM78192q >= iFindLastVisibleItemPosition) {
            c4496a.m21880w(qa00.f156321h);
        } else {
            Unit unit = Unit.INSTANCE;
        }
        C4499d.m21895l().m21908u(c4496a, viewM78194s, SayHiBubbleView.INSTANCE.m77833a());
    }

    /* JADX INFO: renamed from: f */
    public static void m78181f(VirtualVoiceMembersView virtualVoiceMembersView, BLiveMember bLiveMember, View view) {
        s7m0 s7m0Var = (s7m0) virtualVoiceMembersView.f48980a;
        if (s7m0Var != null) {
            String id = bLiveMember.getId();
            id.getClass();
            s7m0Var.m185022l4(id);
        }
    }

    private final cco0 getMemberAdapter() {
        return (cco0) this.memberAdapter.getValue();
    }

    private final LinearLayoutManager getMemberLayoutManager() {
        return (LinearLayoutManager) this.memberLayoutManager.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static LinearLayoutManager m78182i(Context context) {
        return new LinearLayoutManager(context, 0, false);
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m78183j(String str, d3q d3qVar) {
        d3qVar.getClass();
        return Boolean.valueOf(TextUtils.equals(((r8m0) d3qVar).f161722d.f143542a.f107997a, str));
    }

    /* JADX INFO: renamed from: k */
    public static cco0 m78184k() {
        cco0 cco0Var = new cco0();
        cco0Var.setHasStableIds(true);
        return cco0Var;
    }

    /* JADX INFO: renamed from: y */
    public static final void m78185y(VirtualVoiceMembersView virtualVoiceMembersView) {
        virtualVoiceMembersView.m78189m();
    }

    /* JADX INFO: renamed from: A */
    public final void m78186A(@NotNull nsv<h64> livingUser) {
        livingUser.getClass();
        m78197w(livingUser);
    }

    /* JADX INFO: renamed from: N1 */
    public final void m78187N1(@NotNull BLiveVoiceCall call) {
        call.getClass();
        String str = call.user;
        str.getClass();
        r8m0 r8m0VarM78190n = m78190n(str);
        if (r8m0VarM78190n != null) {
            r8m0VarM78190n.m180214L(call);
            getMemberAdapter().m68544P(r8m0VarM78190n, new vkp0(call));
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberViewBindings, p153l.iam
    public void destroy() {
        bnl0.m105524M(this.f48984e, false);
        getMemberAdapter().m68554Z(new ArrayList());
    }

    /* JADX INFO: renamed from: l */
    public final r8m0 m78188l(ado0 memberInfo, final BLiveMember member) {
        r8m0 r8m0Var = new r8m0((s7m0) this.f48980a, member.getId(), memberInfo);
        r8m0Var.mo113881A(new View.OnClickListener() { // from class: l.v8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualVoiceMembersView.m78181f(this.f182883a, member, view);
            }
        });
        return r8m0Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m78189m() {
        C4499d.m21895l().m21899k(SayHiBubbleView.INSTANCE.m77833a());
    }

    /* JADX INFO: renamed from: n */
    public final r8m0 m78190n(final String userId) {
        d3q d3qVar = (d3q) jyb.m147529r(getMemberAdapter().m68538J(), new qcj() { // from class: l.w8m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceMembersView.m78183j(userId, (d3q) obj);
            }
        });
        if (d3qVar == null) {
            return null;
        }
        return (r8m0) d3qVar;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78193r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m78191p() {
        return C4499d.m21895l().m21911x(SayHiBubbleView.INSTANCE.m77833a());
    }

    /* JADX INFO: renamed from: q */
    public final int m78192q(@Nullable final String userId) {
        List<d3q<?>> listM68538J = getMemberAdapter().m68538J();
        listM68538J.getClass();
        return jyb.m147476G(listM68538J, new qcj() { // from class: l.y8m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VirtualVoiceMembersView.m78178c(userId, (d3q) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m78193r() {
        VRecyclerView vRecyclerView = this.f48983d;
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(getMemberLayoutManager());
        RecyclerView.AbstractC0576l itemAnimator = vRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
            itemAnimator.setChangeDuration(0L);
            itemAnimator.setMoveDuration(0L);
            itemAnimator.setRemoveDuration(0L);
            if (itemAnimator instanceof AbstractC0618v) {
                ((AbstractC0618v) itemAnimator).setSupportsChangeAnimations(false);
            }
        }
        vRecyclerView.setAdapter(getMemberAdapter());
        VText vText = this.f48984e;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.s8m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceMembersView.m78177b(this.f166835a, (View) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final View m78194s(int index) {
        if (index >= 0) {
            return this.f48983d.getChildAt(index);
        }
        return null;
    }

    public final void setData(@NotNull ado0 memberInfo) {
        memberInfo.getClass();
        long jM97114J = memberInfo.m97114J();
        if (jM97114J > vxr.m203876d().m170983J1()) {
            VoiceChatInputView.f53867t = vxr.m203876d().m170981I1();
        } else {
            VoiceChatInputView.f53867t = 1000;
        }
        if (jM97114J > vxr.m203876d().m170985K1()) {
            CommonMaskAvatarView.setEnableMask(false);
            CommonMaskAvatarView.setEnableAnimMask(false);
        } else if (jM97114J < ((double) vxr.m203876d().m170985K1()) * 0.75d) {
            CommonMaskAvatarView.setEnableMask(true);
            CommonMaskAvatarView.setEnableAnimMask(true);
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveMember bLiveMember : memberInfo.m97112H()) {
            bLiveMember.getClass();
            arrayList.add(m78188l(memberInfo, bLiveMember));
        }
        getMemberAdapter().m68554Z(arrayList);
        bnl0.m105524M(this.f48984e, true);
        this.f48984e.setText(memberInfo.m97114J() + "人");
    }

    public final void setMemberCount(long totalMembers) {
        if (NullChecker.m82486a(this.f48984e)) {
            this.f48984e.setText(String.valueOf(totalMembers));
        }
    }

    public final void setSwallowTarget(@Nullable LiveScrollView liveScrollView) {
        this.f48982c.setSwallowTarget(liveScrollView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: u */
    public final Pair<int[], Integer> m78195u(@NotNull String userID) {
        userID.getClass();
        int childCount = this.f48983d.getChildCount();
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = this.f48983d.getChildAt(i);
                if (childAt instanceof VirtualVoiceMemberItemView) {
                    VirtualVoiceMemberItemView virtualVoiceMemberItemView = (VirtualVoiceMemberItemView) childAt;
                    if (TextUtils.equals(virtualVoiceMemberItemView.getCallUser().f143542a.f107997a, userID)) {
                        return new Pair<>(i0k.m137975b(virtualVoiceMemberItemView.f48971f.getRealAvatarView()), Integer.valueOf(virtualVoiceMemberItemView.f48971f.getRealAvatarView().getWidth()));
                    }
                }
                if (i == childCount) {
                    break;
                }
                i++;
            }
        }
        T t = this.f48980a;
        return (t == 0 || ((rwn0) ((s7m0) t).m213810E2()).m183411P2().m136879r().m97107C(userID) == null) ? new Pair<>(new int[2], 0) : new Pair<>(i0k.m137975b(this.f48984e), Integer.valueOf(qa00.m175859d(50.0f)));
    }

    /* JADX INFO: renamed from: v */
    public final void m78196v(@NotNull BLiveVoiceCall call) {
        call.getClass();
        String str = call.user;
        str.getClass();
        r8m0 r8m0VarM78190n = m78190n(str);
        if (r8m0VarM78190n != null) {
            r8m0VarM78190n.m180214L(call);
            getMemberAdapter().m68544P(r8m0VarM78190n, new vkp0(call));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m78197w(@NotNull nsv<h64> livingUser) {
        livingUser.getClass();
        String str = livingUser.f143542a.f107997a;
        str.getClass();
        r8m0 r8m0VarM78190n = m78190n(str);
        if (r8m0VarM78190n != null) {
            r8m0VarM78190n.m180216O(livingUser);
            getMemberAdapter().m68543O(r8m0VarM78190n);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m78198x(@Nullable final String userId, @Nullable final BLiveVoiceTagBubble bubbleInfo) {
        l51.m152888H(((s7m0) this.f48980a).act(), new Runnable() { // from class: l.x8m0
            @Override // java.lang.Runnable
            public final void run() {
                VirtualVoiceMembersView.m78180e(this.f192856a, userId, bubbleInfo);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: z */
    public final void m78199z(@NotNull BLiveVoiceCall call) {
        call.getClass();
        String str = call.user;
        str.getClass();
        r8m0 r8m0VarM78190n = m78190n(str);
        if (NullChecker.m82486a(r8m0VarM78190n)) {
            if (r8m0VarM78190n != null) {
                r8m0VarM78190n.m180214L(call);
            }
            getMemberAdapter().m68543O(r8m0VarM78190n);
        }
    }
}
