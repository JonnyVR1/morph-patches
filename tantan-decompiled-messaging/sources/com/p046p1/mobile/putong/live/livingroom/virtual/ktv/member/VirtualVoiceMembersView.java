package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberViewBindings;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.item.VirtualVoiceMemberItemView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
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
import p147v.VRecyclerView;
import p147v.VText;
import p149l.cxq;
import p149l.d1q;
import p149l.d30;
import p149l.e51;
import p149l.h1c0;
import p149l.i54;
import p149l.kvc0;
import p149l.mqv;
import p149l.nnn0;
import p149l.nzl0;
import p149l.oyl0;
import p149l.rbp0;
import p149l.sxj;
import p149l.t100;
import p149l.t6c0;
import p149l.uvr;
import p149l.vwb;
import p149l.w3o0;
import p149l.w9j;
import p149l.xdl0;
import p149l.y2o0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000bJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b \u0010\u0010J\u001b\u0010!\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b!\u0010\u0016J!\u0010&\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\u0017\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J!\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020,022\u0006\u00101\u001a\u00020\"¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020,2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020<2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010E\u001a\u0004\bK\u0010L¨\u0006N"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/member/VirtualVoiceMembersView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceMemberViewBindings;", "Ll/oyl0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "r", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;", "call", "N1", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;)V", ResourceDirection.f38808v, "Ll/mqv;", "Ll/i54;", "livingUser", "w", "(Ll/mqv;)V", "Ll/w3o0;", "memberInfo", "setData", "(Ll/w3o0;)V", "destroy", "", "totalMembers", "setMemberCount", "(J)V", BaseSei.f13932Z, "A", "", "userId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTagBubble;", "bubbleInfo", BaseSei.f13930X, "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceTagBubble;)V", "", "p", "()Z", "m", "", FirebaseAnalytics.Param.INDEX, "Landroid/view/View;", BLiveStormDanmakuGiftResourceType.f44446s, "(I)Landroid/view/View;", "userID", "Lkotlin/Pair;", "", "u", "(Ljava/lang/String;)Lkotlin/Pair;", "q", "(Ljava/lang/String;)I", "Lcom/p1/mobile/putong/live/livingroom/view/LiveScrollView;", "liveScrollView", "setSwallowTarget", "(Lcom/p1/mobile/putong/live/livingroom/view/LiveScrollView;)V", "Ll/nzl0;", "n", "(Ljava/lang/String;)Ll/nzl0;", "Lcom/p1/mobile/putong/live/base/data/BLiveMember;", "member", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/w3o0;Lcom/p1/mobile/putong/live/base/data/BLiveMember;)Ll/nzl0;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "f", "Lkotlin/Lazy;", "getMemberLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "memberLayoutManager", "Ll/y2o0;", "g", "getMemberAdapter", "()Ll/y2o0;", "memberAdapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class VirtualVoiceMembersView extends LiveVirtualVoiceMemberViewBindings<oyl0<?>> {

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
        this.memberLayoutManager = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.pzl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualVoiceMembersView.m76999i(context);
            }
        });
        this.memberAdapter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.qzl0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualVoiceMembersView.m77001k();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static Unit m76994b(VirtualVoiceMembersView virtualVoiceMembersView, View view) {
        view.getClass();
        oyl0 oyl0Var = (oyl0) virtualVoiceMembersView.f48132a;
        if (oyl0Var != null) {
            oyl0Var.m166684o4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m76995c(String str, d1q d1qVar) {
        d1qVar.getClass();
        return Boolean.valueOf(TextUtils.equals(((nzl0) d1qVar).f141240d.f135304a.f111520a, str));
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v5, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v8, types: [l.ho2] */
    /* JADX INFO: renamed from: e */
    public static void m76997e(final VirtualVoiceMembersView virtualVoiceMembersView, String str, BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        int i;
        int iM77009q = virtualVoiceMembersView.m77009q(str);
        int iFindFirstVisibleItemPosition = virtualVoiceMembersView.getMemberLayoutManager().findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = virtualVoiceMembersView.getMemberLayoutManager().findLastVisibleItemPosition();
        View viewM77011s = virtualVoiceMembersView.m77011s(iM77009q);
        if (viewM77011s == null || iFindFirstVisibleItemPosition > iM77009q || iM77009q > iFindLastVisibleItemPosition) {
            viewM77011s = virtualVoiceMembersView.f48136e;
        }
        View viewInflate = LayoutInflater.from(virtualVoiceMembersView.getContext()).inflate(t6c0.f168360ga, (ViewGroup) null);
        viewInflate.getClass();
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) viewInflate;
        bLiveVoiceTagBubble.getClass();
        String strM149818o = ((oyl0) virtualVoiceMembersView.f48132a).m206027E2().m149818o();
        strM149818o.getClass();
        String strM132140j0 = ((oyl0) virtualVoiceMembersView.f48132a).m206027E2().m132140j0();
        strM132140j0.getClass();
        String strM149814k = ((oyl0) virtualVoiceMembersView.f48132a).m206027E2().m149814k();
        strM149814k.getClass();
        sayHiBubbleView.m76648f(bLiveVoiceTagBubble, strM149818o, strM132140j0, strM149814k, new d30() { // from class: l.vzl0
            @Override // p149l.d30
            public final void call() {
                VirtualVoiceMembersView.m77002y(this.f183649a);
            }
        });
        sayHiBubbleView.getUser().setTextSize(12.0f);
        sayHiBubbleView.getContent().setTextSize(12.0f);
        C4345a c4345a = new C4345a(virtualVoiceMembersView.getContext());
        c4345a.m20847B(t100.f167254c).m20877s(sayHiBubbleView).m20874p(75).m20882x(-t100.f167263l).m20870k(kvc0.m147352a(h1c0.f105362e1)).m20875q(C4345a.f15680N).m20861b(7000L);
        if (Intrinsics.m87488d(viewM77011s, virtualVoiceMembersView.f48136e)) {
            c4345a.m20881w(t100.f167259h);
        } else if (iM77009q == iFindFirstVisibleItemPosition || iM77009q == (i = iFindFirstVisibleItemPosition + 1)) {
            c4345a.m20880v(t100.f167259h);
        } else if (iM77009q < i || iM77009q >= iFindLastVisibleItemPosition) {
            c4345a.m20881w(t100.f167259h);
        } else {
            Unit unit = Unit.INSTANCE;
        }
        C4348d.m20896l().m20909u(c4345a, viewM77011s, SayHiBubbleView.INSTANCE.m76650a());
    }

    /* JADX INFO: renamed from: f */
    public static void m76998f(VirtualVoiceMembersView virtualVoiceMembersView, BLiveMember bLiveMember, View view) {
        oyl0 oyl0Var = (oyl0) virtualVoiceMembersView.f48132a;
        if (oyl0Var != null) {
            String id = bLiveMember.getId();
            id.getClass();
            oyl0Var.m166681l4(id);
        }
    }

    private final y2o0 getMemberAdapter() {
        return (y2o0) this.memberAdapter.getValue();
    }

    private final LinearLayoutManager getMemberLayoutManager() {
        return (LinearLayoutManager) this.memberLayoutManager.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static LinearLayoutManager m76999i(Context context) {
        return new LinearLayoutManager(context, 0, false);
    }

    /* JADX INFO: renamed from: j */
    public static Boolean m77000j(String str, d1q d1qVar) {
        d1qVar.getClass();
        return Boolean.valueOf(TextUtils.equals(((nzl0) d1qVar).f141240d.f135304a.f111520a, str));
    }

    /* JADX INFO: renamed from: k */
    public static y2o0 m77001k() {
        y2o0 y2o0Var = new y2o0();
        y2o0Var.setHasStableIds(true);
        return y2o0Var;
    }

    /* JADX INFO: renamed from: y */
    public static final void m77002y(VirtualVoiceMembersView virtualVoiceMembersView) {
        virtualVoiceMembersView.m77006m();
    }

    /* JADX INFO: renamed from: A */
    public final void m77003A(@NotNull mqv<i54> livingUser) {
        livingUser.getClass();
        m77014w(livingUser);
    }

    /* JADX INFO: renamed from: N1 */
    public final void m77004N1(@NotNull BLiveVoiceCall call) {
        call.getClass();
        String str = call.user;
        str.getClass();
        nzl0 nzl0VarM77007n = m77007n(str);
        if (nzl0VarM77007n != null) {
            nzl0VarM77007n.m162075L(call);
            getMemberAdapter().m67361P(nzl0VarM77007n, new rbp0(call));
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberViewBindings, p149l.s7m
    public void destroy() {
        xdl0.m208344M(this.f48136e, false);
        getMemberAdapter().m67371Z(new ArrayList());
    }

    /* JADX INFO: renamed from: l */
    public final nzl0 m77005l(w3o0 memberInfo, final BLiveMember member) {
        nzl0 nzl0Var = new nzl0((oyl0) this.f48132a, member.getId(), memberInfo);
        nzl0Var.mo109662A(new View.OnClickListener() { // from class: l.rzl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualVoiceMembersView.m76998f(this.f161665a, member, view);
            }
        });
        return nzl0Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m77006m() {
        C4348d.m20896l().m20900k(SayHiBubbleView.INSTANCE.m76650a());
    }

    /* JADX INFO: renamed from: n */
    public final nzl0 m77007n(final String userId) {
        d1q d1qVar = (d1q) vwb.m200346r(getMemberAdapter().m67355J(), new w9j() { // from class: l.szl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceMembersView.m77000j(userId, (d1q) obj);
            }
        });
        if (d1qVar == null) {
            return null;
        }
        return (nzl0) d1qVar;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceMemberViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77010r();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m77008p() {
        return C4348d.m20896l().m20912x(SayHiBubbleView.INSTANCE.m76650a());
    }

    /* JADX INFO: renamed from: q */
    public final int m77009q(@Nullable final String userId) {
        List<d1q<?>> listM67355J = getMemberAdapter().m67355J();
        listM67355J.getClass();
        return vwb.m200293G(listM67355J, new w9j() { // from class: l.uzl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VirtualVoiceMembersView.m76995c(userId, (d1q) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m77010r() {
        VRecyclerView vRecyclerView = this.f48135d;
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(getMemberLayoutManager());
        RecyclerView.AbstractC0574l itemAnimator = vRecyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(0L);
            itemAnimator.setChangeDuration(0L);
            itemAnimator.setMoveDuration(0L);
            itemAnimator.setRemoveDuration(0L);
            if (itemAnimator instanceof AbstractC0616v) {
                ((AbstractC0616v) itemAnimator).setSupportsChangeAnimations(false);
            }
        }
        vRecyclerView.setAdapter(getMemberAdapter());
        VText vText = this.f48136e;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.ozl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VirtualVoiceMembersView.m76994b(this.f146484a, (View) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final View m77011s(int index) {
        if (index >= 0) {
            return this.f48135d.getChildAt(index);
        }
        return null;
    }

    public final void setData(@NotNull w3o0 memberInfo) {
        memberInfo.getClass();
        long jM201357J = memberInfo.m201357J();
        if (jM201357J > uvr.m196087d().m162676J1()) {
            VoiceChatInputView.f53019t = uvr.m196087d().m162674I1();
        } else {
            VoiceChatInputView.f53019t = 1000;
        }
        if (jM201357J > uvr.m196087d().m162678K1()) {
            CommonMaskAvatarView.setEnableMask(false);
            CommonMaskAvatarView.setEnableAnimMask(false);
        } else if (jM201357J < ((double) uvr.m196087d().m162678K1()) * 0.75d) {
            CommonMaskAvatarView.setEnableMask(true);
            CommonMaskAvatarView.setEnableAnimMask(true);
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveMember bLiveMember : memberInfo.m201355H()) {
            bLiveMember.getClass();
            arrayList.add(m77005l(memberInfo, bLiveMember));
        }
        getMemberAdapter().m67371Z(arrayList);
        xdl0.m208344M(this.f48136e, true);
        this.f48136e.setText(memberInfo.m201357J() + "人");
    }

    public final void setMemberCount(long totalMembers) {
        if (NullChecker.m81303a(this.f48136e)) {
            this.f48136e.setText(String.valueOf(totalMembers));
        }
    }

    public final void setSwallowTarget(@Nullable LiveScrollView liveScrollView) {
        this.f48134c.setSwallowTarget(liveScrollView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: u */
    public final Pair<int[], Integer> m77012u(@NotNull String userID) {
        userID.getClass();
        int childCount = this.f48135d.getChildCount();
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                View childAt = this.f48135d.getChildAt(i);
                if (childAt instanceof VirtualVoiceMemberItemView) {
                    VirtualVoiceMemberItemView virtualVoiceMemberItemView = (VirtualVoiceMemberItemView) childAt;
                    if (TextUtils.equals(virtualVoiceMemberItemView.getCallUser().f135304a.f111520a, userID)) {
                        return new Pair<>(sxj.m186441b(virtualVoiceMemberItemView.f48123f.getRealAvatarView()), Integer.valueOf(virtualVoiceMemberItemView.f48123f.getRealAvatarView().getWidth()));
                    }
                }
                if (i == childCount) {
                    break;
                }
                i++;
            }
        }
        T t = this.f48132a;
        return (t == 0 || ((nnn0) ((oyl0) t).m206027E2()).m160249P2().m102069r().m201350C(userID) == null) ? new Pair<>(new int[2], 0) : new Pair<>(sxj.m186441b(this.f48136e), Integer.valueOf(t100.m186890d(50.0f)));
    }

    /* JADX INFO: renamed from: v */
    public final void m77013v(@NotNull BLiveVoiceCall call) {
        call.getClass();
        String str = call.user;
        str.getClass();
        nzl0 nzl0VarM77007n = m77007n(str);
        if (nzl0VarM77007n != null) {
            nzl0VarM77007n.m162075L(call);
            getMemberAdapter().m67361P(nzl0VarM77007n, new rbp0(call));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m77014w(@NotNull mqv<i54> livingUser) {
        livingUser.getClass();
        String str = livingUser.f135304a.f111520a;
        str.getClass();
        nzl0 nzl0VarM77007n = m77007n(str);
        if (nzl0VarM77007n != null) {
            nzl0VarM77007n.m162077O(livingUser);
            getMemberAdapter().m67360O(nzl0VarM77007n);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m77015x(@Nullable final String userId, @Nullable final BLiveVoiceTagBubble bubbleInfo) {
        e51.m114743H(((oyl0) this.f48132a).act(), new Runnable() { // from class: l.tzl0
            @Override // java.lang.Runnable
            public final void run() {
                VirtualVoiceMembersView.m76997e(this.f172740a, userId, bubbleInfo);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: z */
    public final void m77016z(@NotNull BLiveVoiceCall call) {
        call.getClass();
        String str = call.user;
        str.getClass();
        nzl0 nzl0VarM77007n = m77007n(str);
        if (NullChecker.m81303a(nzl0VarM77007n)) {
            if (nzl0VarM77007n != null) {
                nzl0VarM77007n.m162075L(call);
            }
            getMemberAdapter().m67360O(nzl0VarM77007n);
        }
    }
}
