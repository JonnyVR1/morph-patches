package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveKtvPlayInfoStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010'\u001a\u00020\n2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020$¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\u0019\u0010-\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b-\u0010\u0019J\u001d\u0010.\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b.\u0010\u0015J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010\fJ\u0017\u00101\u001a\u00020\n2\u0006\u0010\u0006\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m88121d2 = {"Ll/s7m0;", "Ll/rwn0;", "D", "Ll/m1m0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/member/VirtualVoiceMembersView;", "Ll/dum;", BaseSei.INFO, "membersView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/member/VirtualVoiceMembersView;)V", "", Constants.KEY_T, "()V", "Ll/ado0;", "memberInfo", "X3", "(Ll/ado0;)V", "Ll/nsv;", "Ll/h64;", "livingUser", "U3", "(Ll/nsv;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;", "call", "N1", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;)V", "", "total", "W3", "(J)V", "user1", "user2", "call1", "call2", "", "on", "", "vEffectUrl", "hEffectUrl", "V3", "(Ll/nsv;Ll/nsv;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;ZLjava/lang/String;Ljava/lang/String;)V", "userId", "l4", "(Ljava/lang/String;)V", "o4", "k0", "V1", "n4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceKtvGameInfo;", "m4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceKtvGameInfo;)V", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceKtvGameInfo;", "gameInfo", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class s7m0<D extends rwn0> extends m1m0<D, VirtualVoiceMembersView> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceKtvGameInfo gameInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7m0(@NotNull dum<D> dumVar, @NotNull VirtualVoiceMembersView virtualVoiceMembersView) {
        super(dumVar);
        dumVar.getClass();
        virtualVoiceMembersView.getClass();
        mo52715C(virtualVoiceMembersView);
    }

    /* JADX INFO: renamed from: d4 */
    public static void m185014d4(s7m0 s7m0Var, BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.getClass();
        bLiveVoiceCall.playInfoStatus = BLiveKtvPlayInfoStatus.get("unknown_");
        ((VirtualVoiceMembersView) s7m0Var.viewModel).m78196v(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: e4 */
    public static Boolean m185015e4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f4 */
    public static void m185016f4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, s7m0 s7m0Var, BLiveVoiceCall bLiveVoiceCall) {
        boolean z;
        bLiveVoiceCall.getClass();
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = bLiveVoiceKtvGameInfo.nextPlayInfo;
        boolean z2 = true;
        if (bLiveVoiceKtvPlayInfo == null || !TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, bLiveVoiceCall.user)) {
            z = false;
        } else {
            BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo2 = bLiveVoiceKtvGameInfo.nextPlayInfo;
            bLiveVoiceKtvPlayInfo2.getClass();
            bLiveVoiceCall.playInfoStatus = bLiveVoiceKtvPlayInfo2.status;
            z = true;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo3 = bLiveVoiceKtvGameInfo.playInfo;
        if (bLiveVoiceKtvPlayInfo3 == null || !TextUtils.equals(bLiveVoiceKtvPlayInfo3.userId, bLiveVoiceCall.user)) {
            z2 = z;
        } else {
            BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo4 = bLiveVoiceKtvGameInfo.playInfo;
            bLiveVoiceKtvPlayInfo4.getClass();
            bLiveVoiceCall.playInfoStatus = bLiveVoiceKtvPlayInfo4.status;
        }
        if (!z2 && !TEnum.equals(bLiveVoiceCall.playInfoStatus, "unknown_")) {
            bLiveVoiceCall.playInfoStatus = BLiveKtvPlayInfoStatus.get("unknown_");
        }
        ((VirtualVoiceMembersView) s7m0Var.viewModel).m78196v(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: g4 */
    public static Boolean m185017g4(String str) {
        str.getClass();
        return Boolean.valueOf(!Intrinsics.m88377d(VirtualVoiceMotionType.ktv, str));
    }

    /* JADX INFO: renamed from: h4 */
    public static String m185018h4(BLiveVoice bLiveVoice) {
        bLiveVoice.getClass();
        return bLiveVoice.template;
    }

    /* JADX INFO: renamed from: i4 */
    public static String m185019i4(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j4 */
    public static void m185020j4(s7m0 s7m0Var, String str) {
        s7m0Var.m185024n4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m185021k4(s7m0 s7m0Var, BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        bLiveVoiceKtvGameInfo.getClass();
        s7m0Var.m185023m4(bLiveVoiceKtvGameInfo);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: N1 */
    public void mo156707N1(@NotNull BLiveVoiceCall call) {
        call.getClass();
        ((VirtualVoiceMembersView) this.viewModel).m78187N1(call);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: U3 */
    public void mo156710U3(@NotNull nsv<h64> livingUser) {
        livingUser.getClass();
        ((VirtualVoiceMembersView) this.viewModel).m78197w(livingUser);
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: V1 */
    public void mo162760V1(@NotNull nsv<h64> livingUser) {
        livingUser.getClass();
        ((VirtualVoiceMembersView) this.viewModel).m78186A(livingUser);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: V3 */
    public void mo156711V3(@Nullable nsv<h64> user1, @Nullable nsv<h64> user2, @Nullable BLiveVoiceCall call1, @Nullable BLiveVoiceCall call2, boolean on, @NotNull String vEffectUrl, @NotNull String hEffectUrl) {
        vEffectUrl.getClass();
        hEffectUrl.getClass();
        ado0 ado0VarM136879r = m213810E2().m183411P2().m136879r();
        VirtualVoiceMembersView virtualVoiceMembersView = (VirtualVoiceMembersView) this.viewModel;
        ado0VarM136879r.getClass();
        virtualVoiceMembersView.setData(ado0VarM136879r);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: W3 */
    public void mo156712W3(long total) {
        ((VirtualVoiceMembersView) this.viewModel).setMemberCount(total);
    }

    @Override // p153l.m1m0
    /* JADX INFO: renamed from: X3 */
    public void mo156713X3(@NotNull ado0 memberInfo) {
        memberInfo.getClass();
        BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = this.gameInfo;
        if (bLiveVoiceKtvGameInfo != null) {
            memberInfo.m97127W(bLiveVoiceKtvGameInfo);
        }
        ((VirtualVoiceMembersView) this.viewModel).setData(memberInfo);
    }

    @Override // p153l.oam
    /* JADX INFO: renamed from: k0 */
    public void mo162767k0(@Nullable BLiveVoiceCall call) {
        VirtualVoiceMembersView virtualVoiceMembersView = (VirtualVoiceMembersView) this.viewModel;
        call.getClass();
        virtualVoiceMembersView.m78199z(call);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m185022l4(@NotNull String userId) {
        String str;
        userId.getClass();
        if (m213810E2().m168532l0() == null) {
            return;
        }
        if (!Intrinsics.m88377d("guideGoCallUser", userId)) {
            ydn0.m215258k(this, m213810E2().m168532l0().f56859id, userId);
            return;
        }
        if (guk0.m132329h(m213810E2().m183423Y2()) || m213810E2().mo118373p()) {
            m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(0);
            str = "invite";
        } else {
            m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0());
            str = "apply";
        }
        String str2 = str;
        BLiveMember bLiveMemberM97111G = m213810E2().m183411P2().m136879r().m97111G(zrv.f205799a.m207631D0());
        if (bLiveMemberM97111G != null) {
            boolean zMo118373p = m213810E2().mo118373p();
            String str3 = m213810E2().m168532l0().f56859id;
            str3.getClass();
            String strM202191k = m213810E2().m202191k();
            strM202191k.getClass();
            boolean z = bLiveMemberM97111G.isManager;
            String str4 = m213810E2().mo183435j().template;
            str4.getClass();
            jkp0.m145873d(zMo118373p, str3, strM202191k, str2, z, str4);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m185023m4(final BLiveVoiceKtvGameInfo info) {
        this.gameInfo = info;
        jyb.m147537z(m213810E2().m183411P2().m136877p(), new y20() { // from class: l.r7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7m0.m185016f4(info, this, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final void m185024n4() {
        fhw.m125605a("[voice][ktv]", "resetCallKtvState");
        this.gameInfo = null;
        jyb.m147537z(m213810E2().m183411P2().m136877p(), new y20() { // from class: l.q7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7m0.m185014d4(this.f155972a, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final void m185025o4() {
        m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(0);
    }

    @Override // p153l.m1m0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().VoiceKtvEvent.changeCurrentKtvPlayInfo().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.k7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7m0.m185021k4(this.f124278a, (BLiveVoiceKtvGameInfo) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(m213810E2().m183409O2().m188658d());
        final Function1 function1 = new Function1() { // from class: l.l7m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s7m0.m185018h4((BLiveVoice) obj);
            }
        };
        C22421c c22421cDistinctUntilChanged = c22421cDuringCreated.map(new qcj() { // from class: l.m7m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return s7m0.m185019i4(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function2 = new Function1() { // from class: l.n7m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s7m0.m185017g4((String) obj);
            }
        };
        c22421cDistinctUntilChanged.filter(new qcj() { // from class: l.o7m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return s7m0.m185015e4(function2, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.p7m0
            @Override // p153l.y20
            public final void call(Object obj) {
                s7m0.m185020j4(this.f150950a, (String) obj);
            }
        }));
    }
}
