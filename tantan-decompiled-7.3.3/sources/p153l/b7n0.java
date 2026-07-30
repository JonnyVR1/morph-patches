package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nR\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, m88121d2 = {"Ll/b7n0;", "Ll/i6t;", "Ll/rwn0;", "Ll/g7n0;", "Ll/uzn0;", BaseSei.INFO, "<init>", "(Ll/uzn0;)V", "", Constants.KEY_T, "()V", "", "applyId", AuthenticationTokenClaims.JSON_KEY_NAME, "", "from", "O3", "(Ljava/lang/String;Ljava/lang/String;I)V", "P3", RXScreenCaptureService.KEY_INDEX, "I", "getAGREE_FROM_CHAT", "()I", "AGREE_FROM_CHAT", "j", "R3", "AGREE_FROM_ITEM", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class b7n0 extends i6t<rwn0, g7n0> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int AGREE_FROM_CHAT;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int AGREE_FROM_ITEM;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7n0(@NotNull uzn0 uzn0Var) {
        super(uzn0Var);
        uzn0Var.getClass();
        this.AGREE_FROM_ITEM = 1;
        mo52715C(new g7n0());
    }

    /* JADX INFO: renamed from: J3 */
    public static void m102849J3(b7n0 b7n0Var, LiveMessage.ExtInfo extInfo) {
        if (extInfo != null) {
            String str = extInfo.voiceChatApplyId;
            str.getClass();
            String str2 = extInfo.voiceChatApplyUserName;
            str2.getClass();
            b7n0Var.m102854O3(str, str2, b7n0Var.AGREE_FROM_CHAT);
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static void m102850K3(b7n0 b7n0Var, Boolean bool) {
        b7n0Var.m102855P3();
    }

    /* JADX INFO: renamed from: L3 */
    public static void m102851L3(b7n0 b7n0Var, VoiceChatGroupInfo voiceChatGroupInfo) {
        g7n0 g7n0Var = (g7n0) b7n0Var.viewModel;
        voiceChatGroupInfo.getClass();
        g7n0Var.m129363z(voiceChatGroupInfo);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m102852M3(Throwable th) {
        l7n0 l7n0Var = l7n0.INSTANCE;
        th.getClass();
        l7n0Var.m153146a(th);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m102853N3(String str, b7n0 b7n0Var, String str2, int i, BLiveVoiceChatGroup bLiveVoiceChatGroup) {
        o1j0.m165651y(xau.m209911u(R$string.f47851Uf, str));
        b7n0Var.m213811F2().LiveVoiceChatGroupEvent.dismissApproveSpanEvent().mo199273j(str2);
        if (i != b7n0Var.AGREE_FROM_ITEM || ((g7n0) b7n0Var.viewModel).getCom.p1.mobile.putong.data.OMSTemplateType.dialog java.lang.String() == null) {
            return;
        }
        g7n0 g7n0Var = (g7n0) b7n0Var.viewModel;
        bLiveVoiceChatGroup.getClass();
        g7n0Var.m129360v(str2, bLiveVoiceChatGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final void m102854O3(@NotNull final String applyId, @NotNull final String name, final int from) {
        applyId.getClass();
        name.getClass();
        b6n0 b6n0Var = b6n0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(b6n0Var.m102790r(strM202191k, applyId, "approve")).subscribe(dhw.m115826e(new y20() { // from class: l.z6n0
            @Override // p153l.y20
            public final void call(Object obj) {
                b7n0.m102853N3(name, this, applyId, from, (BLiveVoiceChatGroup) obj);
            }
        }, new y20() { // from class: l.a7n0
            @Override // p153l.y20
            public final void call(Object obj) {
                b7n0.m102852M3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final void m102855P3() {
        b6n0 b6n0Var = b6n0.INSTANCE;
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(b6n0Var.m102788p(strM202191k)).subscribe(dhw.m115829h(new y20() { // from class: l.y6n0
            @Override // p153l.y20
            public final void call(Object obj) {
                b7n0.m102851L3(this.f197698a, (VoiceChatGroupInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R3, reason: from getter */
    public final int getAGREE_FROM_ITEM() {
        return this.AGREE_FROM_ITEM;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().LiveVoiceChatGroupEvent.openChatGroupContentDialog(), new y20() { // from class: l.w6n0
            @Override // p153l.y20
            public final void call(Object obj) {
                b7n0.m102850K3(this.f187637a, (Boolean) obj);
            }
        });
        m138863h3(m213811F2().LiveVoiceChatGroupEvent.approveChatGroupApply(), new y20() { // from class: l.x6n0
            @Override // p153l.y20
            public final void call(Object obj) {
                b7n0.m102849J3(this.f192602a, (LiveMessage.ExtInfo) obj);
            }
        });
    }
}
