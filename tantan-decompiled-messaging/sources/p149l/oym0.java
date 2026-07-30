package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, m87232d2 = {"Ll/oym0;", "Ll/h4t;", "Ll/nnn0;", "Ll/uym0;", "Ll/jfo0;", BaseSei.INFO, "<init>", "(Ll/jfo0;)V", "", "R3", "()V", Constants.KEY_T, "S3", "P3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class oym0 extends h4t<nnn0, uym0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oym0(@NotNull jfo0 jfo0Var) {
        super(jfo0Var);
        jfo0Var.getClass();
        mo51532C(new uym0());
    }

    /* JADX INFO: renamed from: J3 */
    public static void m166685J3(Throwable th) {
        hym0 hym0Var = hym0.INSTANCE;
        th.getClass();
        hym0Var.m133616a(th);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m166686K3(oym0 oym0Var, VoiceChatGroupInfo voiceChatGroupInfo) {
        ((uym0) oym0Var.viewModel).m196339z();
        lsi0.m151593w(R$string.f46982Tf);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m166687L3(oym0 oym0Var, VoiceChatGroupInfo voiceChatGroupInfo) {
        uym0 uym0Var = (uym0) oym0Var.viewModel;
        voiceChatGroupInfo.getClass();
        uym0Var.m196324G(voiceChatGroupInfo);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m166688M3(oym0 oym0Var, BLiveEnvelope bLiveEnvelope) {
        ((uym0) oym0Var.viewModel).m196323E(true);
        ((uym0) oym0Var.viewModel).m196321B();
    }

    /* JADX INFO: renamed from: N3 */
    public static void m166689N3(oym0 oym0Var, Boolean bool) {
        oym0Var.m166691R3();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m166690O3(Throwable th) {
        hym0 hym0Var = hym0.INSTANCE;
        th.getClass();
        hym0Var.m133616a(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    private final void m166691R3() {
        xwm0 xwm0Var = xwm0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(xwm0Var.m211355p(strM149814k)).subscribe(ffw.m121197h(new e30() { // from class: l.jym0
            @Override // p149l.e30
            public final void call(Object obj) {
                oym0.m166687L3(this.f120317a, (VoiceChatGroupInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final void m166692P3() {
        xwm0 xwm0Var = xwm0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(xwm0Var.m211356q(strM149814k)).subscribe(ffw.m121194e(new e30() { // from class: l.kym0
            @Override // p149l.e30
            public final void call(Object obj) {
                oym0.m166686K3(this.f125319a, (VoiceChatGroupInfo) obj);
            }
        }, new e30() { // from class: l.lym0
            @Override // p149l.e30
            public final void call(Object obj) {
                oym0.m166685J3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m166693S3() {
        xwm0 xwm0Var = xwm0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(xwm0Var.m211353n(strM149814k)).subscribe(ffw.m121194e(new e30() { // from class: l.mym0
            @Override // p149l.e30
            public final void call(Object obj) {
                oym0.m166688M3(this.f136320a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.nym0
            @Override // p149l.e30
            public final void call(Object obj) {
                oym0.m166690O3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().LiveVoiceChatGroupEvent.openChatGroupContentDialog(), new e30() { // from class: l.iym0
            @Override // p149l.e30
            public final void call(Object obj) {
                oym0.m166689N3(this.f115467a, (Boolean) obj);
            }
        });
    }
}
