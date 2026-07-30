package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.basebuild.notice.VoiceEditNoticeDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/gdn0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/voice/basebuild/notice/VoiceEditNoticeDialog;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "", "currentNotice", "R3", "(Ljava/lang/String;)V", "text", "P3", "inputText", "O3", "Ll/moo0;", Careers.f39580it, "N3", "(Ll/moo0;)Ljava/lang/String;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gdn0 extends i6t<rwn0, VoiceEditNoticeDialog> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdn0(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        Act act = act();
        act.getClass();
        mo52715C(new VoiceEditNoticeDialog(act, null, 0, 6, null));
    }

    /* JADX INFO: renamed from: J3 */
    public static void m129928J3(gdn0 gdn0Var, String str, BLiveEnvelope bLiveEnvelope) {
        ((VoiceEditNoticeDialog) gdn0Var.viewModel).m78896r0();
        r1j0.m179419f(R$string.f48530zj);
        gdn0Var.m213811F2().VirtualRoomInfoEvent.updateRoomInfoDialogNotice().mo199273j(str);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m129929K3(gdn0 gdn0Var, vxj0 vxj0Var) {
        gdn0Var.m129935R3("");
    }

    /* JADX INFO: renamed from: L3 */
    public static void m129930L3(gdn0 gdn0Var, Throwable th) {
        ((VoiceEditNoticeDialog) gdn0Var.viewModel).m78896r0();
        if (!yvr.m217556b(51042, th)) {
            yvr.m217557c(th);
        } else {
            th.getClass();
            r1j0.m179420g(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static void m129931M3(gdn0 gdn0Var, moo0 moo0Var) {
        VoiceEditNoticeDialog voiceEditNoticeDialog = (VoiceEditNoticeDialog) gdn0Var.viewModel;
        moo0Var.getClass();
        voiceEditNoticeDialog.m78900w0(gdn0Var.m129932N3(moo0Var));
        VoiceEditNoticeDialog voiceEditNoticeDialog2 = (VoiceEditNoticeDialog) gdn0Var.viewModel;
        String str = moo0Var.getRoomInfo().voiceRoomProfile.announcementStatus;
        str.getClass();
        voiceEditNoticeDialog2.setConfirmBtnStatus(str);
    }

    /* JADX INFO: renamed from: N3 */
    public final String m129932N3(moo0 it) {
        String str = it.getRoomInfo().voiceRoomProfile.announcement;
        str.getClass();
        return (str.length() <= 0 || str.length() <= 1000) ? str : str.substring(0, 1000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m129933O3(@NotNull final String inputText) {
        inputText.getClass();
        j4p0 j4p0Var = j4p0.INSTANCE;
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(j4p0Var.m143446a(strM202194o, inputText)).subscribe(dhw.m115826e(new y20() { // from class: l.edn0
            @Override // p153l.y20
            public final void call(Object obj) {
                gdn0.m129928J3(this.f93558a, inputText, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.fdn0
            @Override // p153l.y20
            public final void call(Object obj) {
                gdn0.m129930L3(this.f98486a, (Throwable) obj);
            }
        }));
        keo0 keo0Var = keo0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        keo0Var.m149340b(strM202191k);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m129934P3(@NotNull String text) {
        text.getClass();
        ((VoiceEditNoticeDialog) this.viewModel).setCheckSuccessToCache(text);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m129935R3(@NotNull String currentNotice) {
        currentNotice.getClass();
        ((VoiceEditNoticeDialog) this.viewModel).m78899v0(currentNotice);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().TopNoticeEvent.openEditNoticeDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.cdn0
            @Override // p153l.y20
            public final void call(Object obj) {
                gdn0.m129929K3(this.f81246a, (vxj0) obj);
            }
        }));
        duringCreated(m213811F2().TopNoticeEvent.openEditNoticeDialog2().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.ddn0
            @Override // p153l.y20
            public final void call(Object obj) {
                gdn0.m129931M3(this.f87949a, (moo0) obj);
            }
        }));
    }
}
