package p149l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleUser;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010\u0016J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u000bJ\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u000bJ\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010 J\u0017\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u001dH\u0016¢\u0006\u0004\b.\u0010 J\u0017\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010 J\u0015\u00102\u001a\u00020\t2\u0006\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u0010J\u0017\u00103\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b3\u0010\u0016J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u0010\u000bJ\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u000bJ\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\u000f\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u000f\u00108\u001a\u00020\u001dH\u0016¢\u0006\u0004\b8\u00109¨\u0006:"}, m87232d2 = {"Ll/g9p0;", "Ll/x6s;", "Ll/nnn0;", "Ll/j8p0;", "Ll/s7p0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "A4", "()V", "w4", "", "userId", "B4", "(Ljava/lang/String;)V", "q4", Constants.KEY_T, "Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;", "roomInfo", "d1", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraData;)V", "v4", "F", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;", "userInfo", "B1", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceVirtualRoomSettleUser;)V", "", "isPersonal", "g2", "(Z)V", "isFreeSettle", "J1", "i0", "(Ljava/lang/String;)Z", "d0", "currentRoomInfo", "u4", "R", "z4", "y4", "b", "Q", "open", "E0", "checked", "y0", "type", "x4", "t4", "r4", "p4", "o4", "h1", "h2", "()Z", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class g9p0 extends x6s<nnn0, j8p0> implements s7p0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9p0(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: B4 */
    private final void m124785B4(String userId) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(7011).showShadow().userId(userId).setSource("settleUserList").setFromIdentity(bqq.m103386a(this, mo96662j3(), userId, 7011)).setTo(bqq.m103389d(this, mo96662j3(), userId, 7011)).setScene("settleUserList").trackFrom("settleUserList").build());
    }

    /* JADX INFO: renamed from: S3 */
    public static void m124786S3(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public static void m124787T3(g9p0 g9p0Var, boolean z, BLiveExtraResponse bLiveExtraResponse) {
        ((j8p0) g9p0Var.viewModel).m140331z0(z);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m124789V3(g9p0 g9p0Var, String str) {
        g9p0Var.m124829w4();
    }

    /* JADX INFO: renamed from: W3 */
    public static Unit m124790W3(g9p0 g9p0Var, View view) {
        view.getClass();
        ((j8p0) g9p0Var.viewModel).mo71838p();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static void m124791X3(g9p0 g9p0Var, boolean z, roj0 roj0Var) {
        ((j8p0) g9p0Var.viewModel).m140304K0(z);
    }

    /* JADX INFO: renamed from: Y3 */
    public static void m124792Y3(g9p0 g9p0Var, View view) {
        g9p0Var.m124824q4();
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m124793Z3(g9p0 g9p0Var, LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        g9p0Var.m124829w4();
    }

    /* JADX INFO: renamed from: a4 */
    public static void m124794a4(g9p0 g9p0Var, String str, ArrayList arrayList) {
        ((j8p0) g9p0Var.viewModel).m140302I0(str);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m124795b4(g9p0 g9p0Var, String str) {
        g9p0Var.m124829w4();
    }

    /* JADX INFO: renamed from: c4 */
    public static void m124796c4(g9p0 g9p0Var, boolean z, BLiveExtraResponse bLiveExtraResponse) {
        ((j8p0) g9p0Var.viewModel).m140330y0(z);
    }

    /* JADX INFO: renamed from: d4 */
    public static void m124797d4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public static Boolean m124798e4(C4319c c4319c) {
        return Boolean.valueOf(Intrinsics.m87488d(c4319c, C4319c.f15548i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public static void m124799f4(g9p0 g9p0Var, roj0 roj0Var) {
        ((nnn0) g9p0Var.m206027E2()).mo149817n().freeCall = false;
        ((j8p0) g9p0Var.viewModel).m140301H0(false);
    }

    /* JADX INFO: renamed from: g4 */
    public static Boolean m124800g4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h4 */
    public static void m124801h4(g9p0 g9p0Var, BLiveExtraResponse bLiveExtraResponse) {
        j8p0 j8p0Var = (j8p0) g9p0Var.viewModel;
        BLiveExtraData bLiveExtraData = bLiveExtraResponse.data;
        bLiveExtraData.getClass();
        j8p0Var.m140329p0(bLiveExtraData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public static void m124802i4(final g9p0 g9p0Var, View view) {
        g9p0Var.duringCreated(VoiceRoomApiProvider.openFreeCall(((nnn0) g9p0Var.m206027E2()).m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.x8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124808s4(this.f191536a, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public static void m124803j4(g9p0 g9p0Var, soj0 soj0Var) {
        g9p0Var.m124809A4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m124804k4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: l4 */
    public static void m124805l4(g9p0 g9p0Var) {
        g9p0Var.m124809A4();
    }

    /* JADX INFO: renamed from: m4 */
    public static void m124806m4(g9p0 g9p0Var, C4319c c4319c) {
        g9p0Var.m124829w4();
    }

    /* JADX INFO: renamed from: n4 */
    public static void m124807n4(g9p0 g9p0Var, String str) {
        j8p0 j8p0Var = (j8p0) g9p0Var.viewModel;
        str.getClass();
        j8p0Var.m140303J0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public static final void m124808s4(g9p0 g9p0Var, roj0 roj0Var) {
        ((nnn0) g9p0Var.m206027E2()).mo149817n().freeCall = true;
        ((j8p0) g9p0Var.viewModel).m140301H0(true);
    }

    /* JADX INFO: renamed from: A4 */
    public final void m124809A4() {
        if (this.viewModel == 0) {
            Act act = this.f188513f;
            act.getClass();
            j8p0 j8p0Var = new j8p0(act, this);
            this.viewModel = j8p0Var;
            j8p0Var.mo21065i1(this);
        }
        ((j8p0) this.viewModel).m71834E();
        m124829w4();
        pul0.m171464v(this);
        cxq.m109105c(((j8p0) this.viewModel).m140323j0(), new Function1() { // from class: l.f9p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g9p0.m124790W3(this.f96516a, (View) obj);
            }
        });
    }

    @Override // p149l.s7p0
    /* JADX INFO: renamed from: B1 */
    public void mo124810B1(@NotNull BLiveVoiceVirtualRoomSettleUser userInfo) {
        userInfo.getClass();
        String str = userInfo.userId;
        str.getClass();
        m124785B4(str);
    }

    @Override // p149l.s7p0
    /* JADX INFO: renamed from: E0 */
    public void mo124811E0(boolean open) {
        if (open) {
            new xh0.C21150a(this.f188513f).m208740s("设置上麦免审").m208730i(R$string.f46617Cg).m208737p(h1c0.f105394p0).m208739r("确认").m208736o(new View.OnClickListener() { // from class: l.o8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g9p0.m124802i4(this.f142663a, view);
                }
            }).m208725d(h1c0.f105343X0).m208727f("取消").m208722a().m208721g();
            return;
        }
        bsm<? extends T> bsmVar = this.f188512e;
        bsmVar.getClass();
        if (btl0.m103862b(bsmVar)) {
            new xh0.C21150a(act()).m208731j("关闭后，将会影响游戏参与人数，请谨慎关闭").m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.p8p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g9p0.m124792Y3(this.f147625a, view);
                }
            }).m208726e(R$string.f46842N1).m208722a().m208721g();
        } else {
            m124824q4();
        }
    }

    @Override // p149l.s7p0
    /* JADX INFO: renamed from: F */
    public void mo124812F(@NotNull BLiveExtraData roomInfo) {
        roomInfo.getClass();
        m206028F2().MemberManagerEvent.showMemberManagerDialogWithOnePage().mo172463j(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.s7p0
    /* JADX INFO: renamed from: J1 */
    public void mo124813J1(final boolean isFreeSettle) {
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.setVirtualRoomFreeSettle(strM149818o, isFreeSettle)).subscribe(ffw.m121194e(new e30() { // from class: l.q8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124796c4(this.f153207a, isFreeSettle, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.r8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124797d4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.s7p0
    /* JADX INFO: renamed from: Q */
    public void mo124814Q(boolean b) {
        ((hdv) ypv.m215673l(fld0.f98150e)).f107303i.put(Boolean.valueOf(b));
    }

    @Override // p149l.s7p0
    /* JADX INFO: renamed from: R */
    public void mo124815R() {
        m206028F2().VirtualRoomInfoEvent.showVoiceRoomLevelDetail().m172467p();
    }

    @Override // p149l.s7p0
    /* JADX INFO: renamed from: d0 */
    public boolean mo124816d0(@NotNull String userId) {
        userId.getClass();
        return e0o0.m114324j(this, userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.s7p0
    /* JADX INFO: renamed from: d1 */
    public void mo124817d1(@NotNull BLiveExtraData roomInfo) {
        roomInfo.getClass();
        ifo0 ifo0Var = new ifo0("title", roomInfo);
        if (((nnn0) m206027E2()).mo97490p() || e0o0.m114322h(this)) {
            if (BLiveVoiceRoomProfile.isStatePending(roomInfo.voiceRoomProfile.titleStatus)) {
                lsi0.m151595y("资料正在审核中");
            } else {
                m206028F2().VoiceTopicEvent.showVoiceVirtualEditTitleDialog().mo172463j(ifo0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.s7p0
    /* JADX INFO: renamed from: g2 */
    public void mo124818g2(final boolean isPersonal) {
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.setVirtualRoomPersonal(strM149818o, isPersonal)).subscribe(ffw.m121194e(new e30() { // from class: l.s8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124787T3(this.f163096a, isPersonal, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.t8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124804k4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.s7p0
    /* JADX INFO: renamed from: h1 */
    public void mo124819h1() {
        zvf0.m220399u("e_audio_member_invite_settle_button", "p_audio_room_profile", new j760("anchorId", ((nnn0) m206027E2()).m132140j0()), new j760("roomId", ((nnn0) m206027E2()).m149818o()));
        m206028F2().VoiceVirtualLiveEvent.openSharePanelDialogWithScene().mo172463j("inviteSettle");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.s7p0
    /* JADX INFO: renamed from: h2 */
    public boolean mo124820h2() {
        return Intrinsics.m87488d("virtualAvatar", ((nnn0) m206027E2()).mo149813j().liveMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.s7p0
    /* JADX INFO: renamed from: i0 */
    public boolean mo124821i0(@NotNull String userId) {
        userId.getClass();
        return Intrinsics.m87488d(userId, ((nnn0) m206027E2()).m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: o4 */
    public final void m124822o4() {
        pul0.m171463u(this);
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7012).m206701e("tantanapp://voice-live/room/settleGuide").m206699c());
    }

    /* JADX INFO: renamed from: p4 */
    public final void m124823p4() {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7012).m206701e("tantanapp://voice-live/room/cancelenrollmen").m206699c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final void m124824q4() {
        duringCreated(VoiceRoomApiProvider.closeFreeCall(((nnn0) m206027E2()).m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.u8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124799f4(this.f175150a, (roj0) obj);
            }
        }, new e30() { // from class: l.w8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124786S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public final void m124825r4() {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7012).m206701e("tantanapp://voice-live/room/deleteroom").m206699c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().VirtualRoomInfoEvent.showVirtualRoomInfoDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.k8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124803j4(this.f121846a, (soj0) obj);
            }
        }));
        duringCreated(m206028F2().VirtualRoomInfoEvent.updateRoomInfoDialogTitle().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.v8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124789V3(this.f180565a, (String) obj);
            }
        }));
        duringCreated(m206028F2().VirtualRoomInfoEvent.updateRoomInfoDialogNotice().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.y8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124795b4(this.f196860a, (String) obj);
            }
        }));
        m129304h3(m206028F2().VirtualRoomInfoEvent.updateRoomCategory(), new e30() { // from class: l.z8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124807n4(this.f202192a, (String) obj);
            }
        });
        duringCreated(((nnn0) m206027E2()).m132160q1().m189073T0()).subscribe(ffw.m121197h(new e30() { // from class: l.a9p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124793Z3(this.f68195a, (LongLinkVirtualVoice.VoiceSettleMessage) obj);
            }
        }));
        C22306c<C4319c> c22306cLifecycle = lifecycle();
        final Function1 function1 = new Function1() { // from class: l.b9p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g9p0.m124798e4((C4319c) obj);
            }
        };
        c22306cLifecycle.filter(new w9j() { // from class: l.c9p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return g9p0.m124800g4(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.d9p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124806m4(this.f85139a, (C4319c) obj);
            }
        }));
        if (!((nnn0) m206027E2()).mo121371M2() || e0o0.m114318d(this)) {
            return;
        }
        e51.m114743H(m206029H2().getContext(), new Runnable() { // from class: l.e9p0
            @Override // java.lang.Runnable
            public final void run() {
                g9p0.m124805l4(this.f90117a);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: t4 */
    public void m124826t4(@NotNull BLiveExtraData roomInfo) {
        roomInfo.getClass();
        m206028F2().VirtualRoomInfoEvent.showVoiceCategoryDialog().m172467p();
    }

    /* JADX INFO: renamed from: u4 */
    public void m124827u4(@NotNull BLiveExtraData currentRoomInfo) {
        currentRoomInfo.getClass();
        m206028F2().VirtualRoomInfoEvent.showVoiceRoomHeatDialog().mo172463j(currentRoomInfo.voiceRoomProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public void m124828v4(@NotNull BLiveExtraData roomInfo) {
        roomInfo.getClass();
        ifo0 ifo0Var = new ifo0("notice", roomInfo);
        if (!((nnn0) m206027E2()).mo97490p() && !e0o0.m114322h(this)) {
            m206028F2().VirtualRoomInfoEvent.showVirtualNoticePreviewDialog().mo172463j(ifo0Var);
        } else if (BLiveVoiceRoomProfile.isStatePending(roomInfo.voiceRoomProfile.announcementStatus)) {
            lsi0.m151595y("资料正在审核中");
        } else {
            m206028F2().TopNoticeEvent.openEditNoticeDialog2().mo172463j(ifo0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final void m124829w4() {
        V v2 = this.viewModel;
        if (v2 == 0 || !((j8p0) v2).isShowing()) {
            return;
        }
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(strM149818o)).subscribe(ffw.m121197h(new e30() { // from class: l.l8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124801h4(this.f126849a, (BLiveExtraResponse) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final void m124830x4(@NotNull final String type) {
        type.getClass();
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.messageReminds(strM149818o, type)).subscribe(ffw.m121197h(new e30() { // from class: l.m8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124794a4(this.f132602a, type, (ArrayList) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.s7p0
    /* JADX INFO: renamed from: y0 */
    public void mo124831y0(final boolean checked) {
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.setTopChat(strM149818o, checked)).subscribe(ffw.m121197h(new e30() { // from class: l.n8p0
            @Override // p149l.e30
            public final void call(Object obj) {
                g9p0.m124791X3(this.f137668a, checked, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public final void m124832y4() {
        ypv.f199493a.m199353j0(this.f188513f);
    }

    /* JADX INFO: renamed from: z4 */
    public final void m124833z4() {
        m206028F2().VoiceVirtualLiveEvent.showChangeBgDialog().m172467p();
    }
}
