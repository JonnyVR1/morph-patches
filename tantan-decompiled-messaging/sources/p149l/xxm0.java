package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nR\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, m87232d2 = {"Ll/xxm0;", "Ll/h4t;", "Ll/nnn0;", "Ll/cym0;", "Ll/qqn0;", BaseSei.INFO, "<init>", "(Ll/qqn0;)V", "", Constants.KEY_T, "()V", "", "applyId", AuthenticationTokenClaims.JSON_KEY_NAME, "", "from", "O3", "(Ljava/lang/String;Ljava/lang/String;I)V", "P3", RXScreenCaptureService.KEY_INDEX, "I", "getAGREE_FROM_CHAT", "()I", "AGREE_FROM_CHAT", "j", "R3", "AGREE_FROM_ITEM", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class xxm0 extends h4t<nnn0, cym0> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int AGREE_FROM_CHAT;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int AGREE_FROM_ITEM;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxm0(@NotNull qqn0 qqn0Var) {
        super(qqn0Var);
        qqn0Var.getClass();
        this.AGREE_FROM_ITEM = 1;
        mo51532C(new cym0());
    }

    /* JADX INFO: renamed from: J3 */
    public static void m211512J3(xxm0 xxm0Var, LiveMessage.ExtInfo extInfo) {
        if (extInfo != null) {
            String str = extInfo.voiceChatApplyId;
            str.getClass();
            String str2 = extInfo.voiceChatApplyUserName;
            str2.getClass();
            xxm0Var.m211517O3(str, str2, xxm0Var.AGREE_FROM_CHAT);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static void m211513K3(xxm0 xxm0Var, Boolean bool) {
        xxm0Var.m211518P3();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m211514L3(xxm0 xxm0Var, VoiceChatGroupInfo voiceChatGroupInfo) {
        cym0 cym0Var = (cym0) xxm0Var.viewModel;
        voiceChatGroupInfo.getClass();
        cym0Var.m109353z(voiceChatGroupInfo);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m211515M3(Throwable th) {
        hym0 hym0Var = hym0.INSTANCE;
        th.getClass();
        hym0Var.m133616a(th);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m211516N3(String str, xxm0 xxm0Var, String str2, int i, BLiveVoiceChatGroup bLiveVoiceChatGroup) {
        lsi0.m151595y(w8u.m202218u(R$string.f47003Uf, str));
        xxm0Var.m206028F2().LiveVoiceChatGroupEvent.dismissApproveSpanEvent().mo172463j(str2);
        if (i != xxm0Var.AGREE_FROM_ITEM || ((cym0) xxm0Var.viewModel).getCom.p1.mobile.putong.data.OMSTemplateType.dialog java.lang.String() == null) {
            return;
        }
        cym0 cym0Var = (cym0) xxm0Var.viewModel;
        bLiveVoiceChatGroup.getClass();
        cym0Var.m109350v(str2, bLiveVoiceChatGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m211517O3(@NotNull final String applyId, @NotNull final String name, final int from) {
        applyId.getClass();
        name.getClass();
        xwm0 xwm0Var = xwm0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(xwm0Var.m211357r(strM149814k, applyId, "approve")).subscribe(ffw.m121194e(new e30() { // from class: l.vxm0
            @Override // p149l.e30
            public final void call(Object obj) {
                xxm0.m211516N3(name, this, applyId, from, (BLiveVoiceChatGroup) obj);
            }
        }, new e30() { // from class: l.wxm0
            @Override // p149l.e30
            public final void call(Object obj) {
                xxm0.m211515M3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final void m211518P3() {
        xwm0 xwm0Var = xwm0.INSTANCE;
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(xwm0Var.m211355p(strM149814k)).subscribe(ffw.m121197h(new e30() { // from class: l.uxm0
            @Override // p149l.e30
            public final void call(Object obj) {
                xxm0.m211514L3(this.f178749a, (VoiceChatGroupInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3, reason: from getter */
    public final int getAGREE_FROM_ITEM() {
        return this.AGREE_FROM_ITEM;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().LiveVoiceChatGroupEvent.openChatGroupContentDialog(), new e30() { // from class: l.sxm0
            @Override // p149l.e30
            public final void call(Object obj) {
                xxm0.m211513K3(this.f166810a, (Boolean) obj);
            }
        });
        m129304h3(m206028F2().LiveVoiceChatGroupEvent.approveChatGroupApply(), new e30() { // from class: l.txm0
            @Override // p149l.e30
            public final void call(Object obj) {
                xxm0.m211512J3(this.f172514a, (LiveMessage.ExtInfo) obj);
            }
        });
    }
}
