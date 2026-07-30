package p153l;

import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ChatGiftInfo;
import com.p051p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p051p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p051p1.mobile.putong.core.data.GreetSendGiftConfig;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class c7d0 extends spl0 {

    /* JADX INFO: renamed from: b */
    public static wyd0 f80104b = new wyd0("gift_tips_guide_tracker_" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static byd0 f80105c = new byd0("gift_tios_guide_show_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m108294c0(qcj qcjVar, y20 y20Var, PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, Throwable th) {
        if (!((Boolean) qcjVar.call(th)).booleanValue()) {
            if (th instanceof TantanException.Client.TantanForbidden) {
                int i = ((TantanException.Client.TantanForbidden) th).code;
                if (i == 40301) {
                    o1j0.m165634h(R$string.f18553Ij);
                } else if (i == 40308) {
                    o1j0.m165651y("对方被你拉黑，不能继续互动");
                } else if (i == 40309) {
                    o1j0.m165651y("对方设置了隐私权限，不能继续互动");
                } else {
                    bsj0.m106246D(th);
                }
            } else {
                bsj0.m106246D(th);
            }
        }
        if (NullChecker.m82486a(y20Var)) {
            vvj.m203017e(putongAct.pageId(), coreSendGiftBody.recvUserID, false);
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m108296e0(y20 y20Var, PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, uxj0 uxj0Var) {
        if (NullChecker.m82486a(y20Var)) {
            vvj.m203017e(putongAct.pageId(), coreSendGiftBody.recvUserID, true);
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m108297f0(RecyclerView recyclerView) {
        return recyclerView.computeHorizontalScrollExtent() < recyclerView.computeHorizontalScrollRange();
    }

    /* JADX INFO: renamed from: g0 */
    public static String m108298g0() {
        return "为你精心挑选了一个礼物";
    }

    /* JADX INFO: renamed from: h0 */
    public static ChatGiftInfoExtra m108299h0(Message message) {
        ChatGiftInfo chatGiftInfo;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData != null && (chatGiftInfo = messageAdditionalData.chatGiftInfo) != null) {
            try {
                return ChatGiftInfoExtra.JSON_ADAPTER.parse(chatGiftInfo.extra);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public static String m108300i0(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.m80481x().m80516v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            if (NullChecker.m82486a(greetSendGiftConfig)) {
                return z ? greetSendGiftConfig.maleRefusedGiftTips : greetSendGiftConfig.femaleRefusedGiftTips;
            }
            return "";
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m108301j0() {
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m108302k0(final PutongAct putongAct, final CoreSendGiftBody coreSendGiftBody, final y20<Boolean> y20Var, final qcj<Throwable, Boolean> qcjVar) {
        putongAct.duringCreated((C22421c) CoreModule.f18264c.f20385f1.m155911k4(coreSendGiftBody).flatMap(new qcj() { // from class: l.z6d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.a7d0
            @Override // p153l.y20
            public final void call(Object obj) {
                c7d0.m108296e0(y20Var, putongAct, coreSendGiftBody, (uxj0) obj);
            }
        }, new y20() { // from class: l.b7d0
            @Override // p153l.y20
            public final void call(Object obj) {
                c7d0.m108294c0(qcjVar, y20Var, putongAct, coreSendGiftBody, (Throwable) obj);
            }
        }));
    }
}
