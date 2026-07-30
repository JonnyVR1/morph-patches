package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u0013J\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Ll/azu;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;", "Ll/dum;", "curInfo", "bottomView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;", "call", "", "X3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCall;)V", "Ll/gvn0;", "message", "S3", "(Ll/gvn0;)V", "V3", "()V", p7f.GPS_DIRECTION_TRUE, Constants.KEY_T, "", "currentMuteStatus", "R3", "(Z)V", "U3", "W3", "", "userId", "T3", "(Ljava/lang/String;)Z", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;", "getBottomView", "()Lcom/p1/mobile/putong/live/livingroom/virtual/room/LiveVirtualCallListBottomView;", "j", "Z", BLiveButtonType.mute, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class azu extends i6t<rwn0, LiveVirtualCallListBottomView> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final LiveVirtualCallListBottomView bottomView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean mute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azu(@NotNull dum<? extends rwn0> dumVar, @NotNull LiveVirtualCallListBottomView liveVirtualCallListBottomView) {
        super(dumVar);
        dumVar.getClass();
        liveVirtualCallListBottomView.getClass();
        this.bottomView = liveVirtualCallListBottomView;
        mo52715C(liveVirtualCallListBottomView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m101083J3(azu azuVar, BLiveVoiceCall bLiveVoiceCall) {
        bLiveVoiceCall.getClass();
        azuVar.m101092X3(bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m101084K3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m101085L3(azu azuVar, hrk0.C17564a c17564a) {
        azuVar.m101091V3();
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m101086M3(hrk0.C17564a c17564a) {
        c17564a.getClass();
        return Boolean.valueOf(c17564a.f111360b == 1);
    }

    /* JADX INFO: renamed from: N3 */
    public static Boolean m101087N3(azu azuVar, gvn0 gvn0Var) {
        String str = gvn0Var.m132564e().user;
        str.getClass();
        return Boolean.valueOf(azuVar.m101094T3(str));
    }

    /* JADX INFO: renamed from: O3 */
    public static Boolean m101088O3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m101089P3(azu azuVar, gvn0 gvn0Var) {
        gvn0Var.getClass();
        azuVar.m101090S3(gvn0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    private final void m101090S3(gvn0 message) {
        int iM132569j = message.m132569j();
        if (iM132569j == 6) {
            ((LiveVirtualCallListBottomView) this.viewModel).m78499i(((rwn0) m213810E2()).mo118373p(), this.mute, true);
        } else if (iM132569j == 9 || iM132569j == 12) {
            ((LiveVirtualCallListBottomView) this.viewModel).m78499i(((rwn0) m213810E2()).mo118373p(), this.mute, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    private final void m101091V3() {
        ((LiveVirtualCallListBottomView) this.viewModel).m78499i(((rwn0) m213810E2()).mo118373p(), this.mute, i9o0.m139145q(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    private final void m101092X3(BLiveVoiceCall call) {
        boolean z;
        if (((rwn0) m213810E2()).mo118373p()) {
            z = call.mutedByAnchor;
        } else {
            z = call.mutedByAnchor || call.mutedByUser;
        }
        this.mute = z;
        ((LiveVirtualCallListBottomView) this.viewModel).m78499i(((rwn0) m213810E2()).mo118373p(), this.mute, Intrinsics.m88377d("on-voice", call.state));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public final void m101093R3(boolean currentMuteStatus) {
        BLiveVoiceCall bLiveVoiceCallM183423Y2 = ((rwn0) m213810E2()).m183423Y2();
        if (bLiveVoiceCallM183423Y2 == null) {
            return;
        }
        if (bLiveVoiceCallM183423Y2.mutedByAnchor && !((rwn0) m213810E2()).mo118373p()) {
            o1j0.m165649w(R$string.f47856V);
        } else {
            if (bLiveVoiceCallM183423Y2.mutedByUser && ((rwn0) m213810E2()).mo118373p()) {
                return;
            }
            ydn0.m215263p(this, bLiveVoiceCallM183423Y2.f45333id, !currentMuteStatus, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        C22421c<T> c22421cDuringCreated = duringCreated(((rwn0) m213810E2()).m183413Q2());
        final Function1 function1 = new Function1() { // from class: l.uyu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return azu.m101086M3((hrk0.C17564a) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.vyu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return azu.m101088O3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.wyu
            @Override // p153l.y20
            public final void call(Object obj) {
                azu.m101085L3(this.f191706a, (hrk0.C17564a) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(((rwn0) m213810E2()).m168545q1().m98337x0());
        final Function1 function2 = new Function1() { // from class: l.xyu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return azu.m101087N3(this.f196785a, (gvn0) obj);
            }
        };
        c22421cDuringCreated2.filter(new qcj() { // from class: l.yyu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return azu.m101084K3(function2, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.zyu
            @Override // p153l.y20
            public final void call(Object obj) {
                azu.m101089P3(this.f206634a, (gvn0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final boolean m101094T3(String userId) {
        if (TextUtils.isEmpty(userId)) {
            return false;
        }
        return Intrinsics.m88377d(userId, zrv.f205799a.m207631D0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final void m101095U3() {
        m213811F2().MemberManagerEvent.showMemberManagerDialog().mo199273j(0);
        if (((rwn0) m213810E2()).mo118373p()) {
            v1n0.m199040r();
        } else {
            v1n0.m199041s();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m101096W3() {
        ydn0.m215261n(this);
        v1n0.m199032j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m183424Z2()).subscribe(dhw.m115829h(new y20() { // from class: l.tyu
            @Override // p153l.y20
            public final void call(Object obj) {
                azu.m101083J3(this.f176704a, (BLiveVoiceCall) obj);
            }
        }));
        m101091V3();
    }
}
