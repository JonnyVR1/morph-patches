package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Ll/zwu;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;", "Ll/bsm;", "curInfo", "bottomView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;", "call", "", "X3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;)V", "Ll/cmn0;", "message", "S3", "(Ll/cmn0;)V", "V3", "()V", j6f.GPS_DIRECTION_TRUE, Constants.KEY_T, "", "currentMuteStatus", "R3", "(Z)V", "U3", "W3", "", "userId", "T3", "(Ljava/lang/String;)Z", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;", "getBottomView", "()Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;", "j", "Z", BLiveButtonType.mute, "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class zwu extends h4t<nnn0, LiveVirtualCallListBottomView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final LiveVirtualCallListBottomView bottomView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean mute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwu(@NotNull bsm<? extends nnn0> bsmVar, @NotNull LiveVirtualCallListBottomView liveVirtualCallListBottomView) {
        super(bsmVar);
        bsmVar.getClass();
        liveVirtualCallListBottomView.getClass();
        this.bottomView = liveVirtualCallListBottomView;
        mo51532C(liveVirtualCallListBottomView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m220687J3(zwu zwuVar, BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.getClass();
        zwuVar.m220696X3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m220688K3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m220689L3(zwu zwuVar, bik0.C15867a c15867a) {
        zwuVar.m220695V3();
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m220690M3(bik0.C15867a c15867a) {
        c15867a.getClass();
        return Boolean.valueOf(c15867a.f75773b == 1);
    }

    /* JADX INFO: renamed from: N3 */
    public static Boolean m220691N3(zwu zwuVar, cmn0 cmn0Var) {
        String str = cmn0Var.m107677e().user;
        str.getClass();
        return Boolean.valueOf(zwuVar.m220698T3(str));
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m220692O3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m220693P3(zwu zwuVar, cmn0 cmn0Var) {
        cmn0Var.getClass();
        zwuVar.m220694S3(cmn0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    private final void m220694S3(cmn0 message) {
        int iM107682j = message.m107682j();
        if (iM107682j == 6) {
            ((LiveVirtualCallListBottomView) this.viewModel).m77316i(((nnn0) m206027E2()).mo97490p(), this.mute, true);
        } else if (iM107682j == 9 || iM107682j == 12) {
            ((LiveVirtualCallListBottomView) this.viewModel).m77316i(((nnn0) m206027E2()).mo97490p(), this.mute, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    private final void m220695V3() {
        ((LiveVirtualCallListBottomView) this.viewModel).m77316i(((nnn0) m206027E2()).mo97490p(), this.mute, e0o0.m114330q(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    private final void m220696X3(BLiveVoiceCall call) {
        boolean z;
        if (((nnn0) m206027E2()).mo97490p()) {
            z = call.mutedByAnchor;
        } else {
            z = call.mutedByAnchor || call.mutedByUser;
        }
        this.mute = z;
        ((LiveVirtualCallListBottomView) this.viewModel).m77316i(((nnn0) m206027E2()).mo97490p(), this.mute, Intrinsics.m87488d("on-voice", call.state));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final void m220697R3(boolean currentMuteStatus) {
        BLiveVoiceCall bLiveVoiceCallM160261Y2 = ((nnn0) m206027E2()).m160261Y2();
        if (bLiveVoiceCallM160261Y2 == null) {
            return;
        }
        if (bLiveVoiceCallM160261Y2.mutedByAnchor && !((nnn0) m206027E2()).mo97490p()) {
            lsi0.m151593w(R$string.f47008V);
        } else {
            if (bLiveVoiceCallM160261Y2.mutedByUser && ((nnn0) m206027E2()).mo97490p()) {
                return;
            }
            u4n0.m191757p(this, bLiveVoiceCallM160261Y2.f44485id, !currentMuteStatus, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        C22306c<T> c22306cDuringCreated = duringCreated(((nnn0) m206027E2()).m160251Q2());
        final Function1 function1 = new Function1() { // from class: l.twu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zwu.m220690M3((bik0.C15867a) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.uwu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zwu.m220692O3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.vwu
            @Override // p149l.e30
            public final void call(Object obj) {
                zwu.m220689L3(this.f183374a, (bik0.C15867a) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated2 = duringCreated(((nnn0) m206027E2()).m132160q1().m189155x0());
        final Function1 function2 = new Function1() { // from class: l.wwu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zwu.m220691N3(this.f188408a, (cmn0) obj);
            }
        };
        c22306cDuringCreated2.filter(new w9j() { // from class: l.xwu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zwu.m220688K3(function2, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ywu
            @Override // p149l.e30
            public final void call(Object obj) {
                zwu.m220693P3(this.f200546a, (cmn0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final boolean m220698T3(String userId) {
        if (TextUtils.isEmpty(userId)) {
            return false;
        }
        return Intrinsics.m87488d(userId, ypv.f199493a.m199309D0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final void m220699U3() {
        m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(0);
        if (((nnn0) m206027E2()).mo97490p()) {
            rsm0.m180710r();
        } else {
            rsm0.m180711s();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m220700W3() {
        u4n0.m191755n(this);
        rsm0.m180702j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m160262Z2()).subscribe(ffw.m121197h(new e30() { // from class: l.swu
            @Override // p149l.e30
            public final void call(Object obj) {
                zwu.m220687J3(this.f166723a, (BLiveVoiceCall) obj);
            }
        }));
        m220695V3();
    }
}
