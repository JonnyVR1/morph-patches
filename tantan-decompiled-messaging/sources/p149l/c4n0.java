package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceEditNoticeDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/c4n0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceEditNoticeDialog;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "", "currentNotice", "R3", "(Ljava/lang/String;)V", "text", "P3", "inputText", "O3", "Ll/ifo0;", Careers.f38732it, "N3", "(Ll/ifo0;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class c4n0 extends h4t<nnn0, VoiceEditNoticeDialog> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4n0(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        Act act = act();
        act.getClass();
        mo51532C(new VoiceEditNoticeDialog(act, null, 0, 6, null));
    }

    /* JADX INFO: renamed from: J3 */
    public static void m105225J3(c4n0 c4n0Var, String str, BLiveEnvelope bLiveEnvelope) {
        ((VoiceEditNoticeDialog) c4n0Var.viewModel).m77713r0();
        osi0.m165782f(R$string.f47682zj);
        c4n0Var.m206028F2().VirtualRoomInfoEvent.updateRoomInfoDialogNotice().mo172463j(str);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m105226K3(c4n0 c4n0Var, soj0 soj0Var) {
        c4n0Var.m105232R3("");
    }

    /* JADX INFO: renamed from: L3 */
    public static void m105227L3(c4n0 c4n0Var, Throwable th) {
        ((VoiceEditNoticeDialog) c4n0Var.viewModel).m77713r0();
        if (!xtr.m211022b(51042, th)) {
            xtr.m211023c(th);
        } else {
            th.getClass();
            osi0.m165783g(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m105228M3(c4n0 c4n0Var, ifo0 ifo0Var) {
        VoiceEditNoticeDialog voiceEditNoticeDialog = (VoiceEditNoticeDialog) c4n0Var.viewModel;
        ifo0Var.getClass();
        voiceEditNoticeDialog.m77717w0(c4n0Var.m105229N3(ifo0Var));
        VoiceEditNoticeDialog voiceEditNoticeDialog2 = (VoiceEditNoticeDialog) c4n0Var.viewModel;
        String str = ifo0Var.getRoomInfo().voiceRoomProfile.announcementStatus;
        str.getClass();
        voiceEditNoticeDialog2.setConfirmBtnStatus(str);
    }

    /* JADX INFO: renamed from: N3 */
    public final String m105229N3(ifo0 it) {
        String str = it.getRoomInfo().voiceRoomProfile.announcement;
        str.getClass();
        return (str.length() <= 0 || str.length() <= 1000) ? str : str.substring(0, 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m105230O3(@NotNull final String inputText) {
        inputText.getClass();
        fvo0 fvo0Var = fvo0.INSTANCE;
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(fvo0Var.m123346a(strM149818o, inputText)).subscribe(ffw.m121194e(new e30() { // from class: l.a4n0
            @Override // p149l.e30
            public final void call(Object obj) {
                c4n0.m105225J3(this.f67548a, inputText, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.b4n0
            @Override // p149l.e30
            public final void call(Object obj) {
                c4n0.m105227L3(this.f73391a, (Throwable) obj);
            }
        }));
        g5o0 g5o0Var = g5o0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        g5o0Var.m124532b(strM149814k);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m105231P3(@NotNull String text) {
        text.getClass();
        ((VoiceEditNoticeDialog) this.viewModel).setCheckSuccessToCache(text);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m105232R3(@NotNull String currentNotice) {
        currentNotice.getClass();
        ((VoiceEditNoticeDialog) this.viewModel).m77716v0(currentNotice);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().TopNoticeEvent.openEditNoticeDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.y3n0
            @Override // p149l.e30
            public final void call(Object obj) {
                c4n0.m105226K3(this.f195831a, (soj0) obj);
            }
        }));
        duringCreated(m206028F2().TopNoticeEvent.openEditNoticeDialog2().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.z3n0
            @Override // p149l.e30
            public final void call(Object obj) {
                c4n0.m105228M3(this.f201383a, (ifo0) obj);
            }
        }));
    }
}
