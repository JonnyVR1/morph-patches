package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveKtvPlayInfoStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010'\u001a\u00020\n2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010!\u001a\u0004\u0018\u00010\u00162\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0014¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020$¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010\fJ\u0019\u0010-\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b-\u0010\u0019J\u001d\u0010.\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b.\u0010\u0015J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010\fJ\u0017\u00101\u001a\u00020\n2\u0006\u0010\u0006\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, m87232d2 = {"Ll/oyl0;", "Ll/nnn0;", "D", "Ll/isl0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/member/VirtualVoiceMembersView;", "Ll/bsm;", BaseSei.INFO, "membersView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/member/VirtualVoiceMembersView;)V", "", Constants.KEY_T, "()V", "Ll/w3o0;", "memberInfo", "X3", "(Ll/w3o0;)V", "Ll/mqv;", "Ll/i54;", "livingUser", "U3", "(Ll/mqv;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;", "call", "N1", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;)V", "", "total", "W3", "(J)V", "user1", "user2", "call1", "call2", "", "on", "", "vEffectUrl", "hEffectUrl", "V3", "(Ll/mqv;Ll/mqv;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;ZLjava/lang/String;Ljava/lang/String;)V", "userId", "l4", "(Ljava/lang/String;)V", "o4", "k0", "V1", "n4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceKtvGameInfo;", "m4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceKtvGameInfo;)V", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceKtvGameInfo;", "gameInfo", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class oyl0<D extends nnn0> extends isl0<D, VirtualVoiceMembersView> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceKtvGameInfo gameInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyl0(@NotNull bsm<D> bsmVar, @NotNull VirtualVoiceMembersView virtualVoiceMembersView) {
        super(bsmVar);
        bsmVar.getClass();
        virtualVoiceMembersView.getClass();
        mo51532C(virtualVoiceMembersView);
    }

    /* JADX INFO: renamed from: d4 */
    public static void m166673d4(oyl0 oyl0Var, BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.getClass();
        bLiveVoiceCall.playInfoStatus = BLiveKtvPlayInfoStatus.get("unknown_");
        ((VirtualVoiceMembersView) oyl0Var.viewModel).m77013v(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: e4 */
    public static Boolean m166674e4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f4 */
    public static void m166675f4(BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo, oyl0 oyl0Var, BLiveVoiceCall bLiveVoiceCall) {
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
        ((VirtualVoiceMembersView) oyl0Var.viewModel).m77013v(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: g4 */
    public static Boolean m166676g4(String str) {
        str.getClass();
        return Boolean.valueOf(!Intrinsics.m87488d(VirtualVoiceMotionType.ktv, str));
    }

    /* JADX INFO: renamed from: h4 */
    public static String m166677h4(BLiveVoice bLiveVoice) {
        bLiveVoice.getClass();
        return bLiveVoice.template;
    }

    /* JADX INFO: renamed from: i4 */
    public static String m166678i4(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j4 */
    public static void m166679j4(oyl0 oyl0Var, String str) {
        oyl0Var.m166683n4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m166680k4(oyl0 oyl0Var, BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo) {
        bLiveVoiceKtvGameInfo.getClass();
        oyl0Var.m166682m4(bLiveVoiceKtvGameInfo);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: N1 */
    public void mo138047N1(@NotNull BLiveVoiceCall call) {
        call.getClass();
        ((VirtualVoiceMembersView) this.viewModel).m77004N1(call);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: U3 */
    public void mo138051U3(@NotNull mqv<i54> livingUser) {
        livingUser.getClass();
        ((VirtualVoiceMembersView) this.viewModel).m77014w(livingUser);
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: V1 */
    public void mo139728V1(@NotNull mqv<i54> livingUser) {
        livingUser.getClass();
        ((VirtualVoiceMembersView) this.viewModel).m77003A(livingUser);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: V3 */
    public void mo138052V3(@Nullable mqv<i54> user1, @Nullable mqv<i54> user2, @Nullable BLiveVoiceCall call1, @Nullable BLiveVoiceCall call2, boolean on, @NotNull String vEffectUrl, @NotNull String hEffectUrl) {
        vEffectUrl.getClass();
        hEffectUrl.getClass();
        w3o0 w3o0VarM102069r = m206027E2().m160249P2().m102069r();
        VirtualVoiceMembersView virtualVoiceMembersView = (VirtualVoiceMembersView) this.viewModel;
        w3o0VarM102069r.getClass();
        virtualVoiceMembersView.setData(w3o0VarM102069r);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: W3 */
    public void mo138053W3(long total) {
        ((VirtualVoiceMembersView) this.viewModel).setMemberCount(total);
    }

    @Override // p149l.isl0
    /* JADX INFO: renamed from: X3 */
    public void mo138054X3(@NotNull w3o0 memberInfo) {
        memberInfo.getClass();
        BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfo = this.gameInfo;
        if (bLiveVoiceKtvGameInfo != null) {
            memberInfo.m201370W(bLiveVoiceKtvGameInfo);
        }
        ((VirtualVoiceMembersView) this.viewModel).setData(memberInfo);
    }

    @Override // p149l.y7m
    /* JADX INFO: renamed from: k0 */
    public void mo139738k0(@Nullable BLiveVoiceCall call) {
        VirtualVoiceMembersView virtualVoiceMembersView = (VirtualVoiceMembersView) this.viewModel;
        call.getClass();
        virtualVoiceMembersView.m77016z(call);
    }

    /* JADX INFO: renamed from: l4 */
    public final void m166681l4(@NotNull String userId) {
        String str;
        userId.getClass();
        if (m206027E2().m132146l0() == null) {
            return;
        }
        if (!Intrinsics.m87488d("guideGoCallUser", userId)) {
            u4n0.m191752k(this, m206027E2().m132146l0().f56011id, userId);
            return;
        }
        if (alk0.m97309h(m206027E2().m160261Y2()) || m206027E2().mo97490p()) {
            m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(0);
            str = "invite";
        } else {
            m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0());
            str = "apply";
        }
        String str2 = str;
        BLiveMember bLiveMemberM201354G = m206027E2().m160249P2().m102069r().m201354G(ypv.f199493a.m199309D0());
        if (bLiveMemberM201354G != null) {
            boolean zMo97490p = m206027E2().mo97490p();
            String str3 = m206027E2().m132146l0().f56011id;
            str3.getClass();
            String strM149814k = m206027E2().m149814k();
            strM149814k.getClass();
            boolean z = bLiveMemberM201354G.isManager;
            String str4 = m206027E2().mo149813j().template;
            str4.getClass();
            fbp0.m120388d(zMo97490p, str3, strM149814k, str2, z, str4);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final void m166682m4(final BLiveVoiceKtvGameInfo info) {
        this.gameInfo = info;
        vwb.m200354z(m206027E2().m160249P2().m102067p(), new e30() { // from class: l.nyl0
            @Override // p149l.e30
            public final void call(Object obj) {
                oyl0.m166675f4(info, this, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final void m166683n4() {
        hfw.m130790a("[voice][ktv]", "resetCallKtvState");
        this.gameInfo = null;
        vwb.m200354z(m206027E2().m160249P2().m102067p(), new e30() { // from class: l.myl0
            @Override // p149l.e30
            public final void call(Object obj) {
                oyl0.m166673d4(this.f136319a, (BLiveVoiceCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    public final void m166684o4() {
        m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(0);
    }

    @Override // p149l.isl0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().VoiceKtvEvent.changeCurrentKtvPlayInfo().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.gyl0
            @Override // p149l.e30
            public final void call(Object obj) {
                oyl0.m166680k4(this.f105022a, (BLiveVoiceKtvGameInfo) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(m206027E2().m160247O2().m165466d());
        final Function1 function1 = new Function1() { // from class: l.hyl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oyl0.m166677h4((BLiveVoice) obj);
            }
        };
        C22306c c22306cDistinctUntilChanged = c22306cDuringCreated.map(new w9j() { // from class: l.iyl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oyl0.m166678i4(function1, obj);
            }
        }).distinctUntilChanged();
        final Function1 function2 = new Function1() { // from class: l.jyl0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return oyl0.m166676g4((String) obj);
            }
        };
        c22306cDistinctUntilChanged.filter(new w9j() { // from class: l.kyl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oyl0.m166674e4(function2, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.lyl0
            @Override // p149l.e30
            public final void call(Object obj) {
                oyl0.m166679j4(this.f130583a, (String) obj);
            }
        }));
    }
}
