package p149l;

import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ChatGiftInfo;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p046p1.mobile.putong.core.data.GreetSendGiftConfig;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class zyc0 extends ogl0 {

    /* JADX INFO: renamed from: b */
    public static uqd0 f205672b = new uqd0("gift_tips_guide_tracker_" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static zpd0 f205673c = new zpd0("gift_tios_guide_show_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m220911c0(w9j w9jVar, e30 e30Var, PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, Throwable th) {
        if (!((Boolean) w9jVar.call(th)).booleanValue()) {
            if (th instanceof TantanException.Client.TantanForbidden) {
                int i = ((TantanException.Client.TantanForbidden) th).code;
                if (i == 40301) {
                    lsi0.m151578h(R$string.f18735mj);
                } else if (i == 40308) {
                    lsi0.m151595y("对方被你拉黑，不能继续互动");
                } else if (i == 40309) {
                    lsi0.m151595y("对方设置了隐私权限，不能继续互动");
                } else {
                    yij0.m214926D(th);
                }
            } else {
                yij0.m214926D(th);
            }
        }
        if (NullChecker.m81303a(e30Var)) {
            ftj.m123060e(putongAct.pageId(), coreSendGiftBody.recvUserID, false);
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m220913e0(e30 e30Var, PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, roj0 roj0Var) {
        if (NullChecker.m81303a(e30Var)) {
            ftj.m123060e(putongAct.pageId(), coreSendGiftBody.recvUserID, true);
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m220914f0(RecyclerView recyclerView) {
        return recyclerView.computeHorizontalScrollExtent() < recyclerView.computeHorizontalScrollRange();
    }

    /* JADX INFO: renamed from: g0 */
    public static String m220915g0() {
        return "为你精心挑选了一个礼物";
    }

    /* JADX INFO: renamed from: h0 */
    public static ChatGiftInfoExtra m220916h0(Message message) {
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
    public static String m220917i0(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.m79298x().m79333v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            if (NullChecker.m81303a(greetSendGiftConfig)) {
                return z ? greetSendGiftConfig.maleRefusedGiftTips : greetSendGiftConfig.femaleRefusedGiftTips;
            }
            return "";
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m220918j0() {
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m220919k0(final PutongAct putongAct, final CoreSendGiftBody coreSendGiftBody, final e30<Boolean> e30Var, final w9j<Throwable, Boolean> w9jVar) {
        putongAct.duringCreated((C22306c) CoreModule.f17545c.f19643f1.m118073k4(coreSendGiftBody).flatMap(new w9j() { // from class: l.wyc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.xyc0
            @Override // p149l.e30
            public final void call(Object obj) {
                zyc0.m220913e0(e30Var, putongAct, coreSendGiftBody, (roj0) obj);
            }
        }, new e30() { // from class: l.yyc0
            @Override // p149l.e30
            public final void call(Object obj) {
                zyc0.m220911c0(w9jVar, e30Var, putongAct, coreSendGiftBody, (Throwable) obj);
            }
        }));
    }
}
