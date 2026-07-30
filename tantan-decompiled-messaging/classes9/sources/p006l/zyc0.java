package p006l;

import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.data.ChatGiftInfo;
import com.p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p1.mobile.putong.core.data.CoreSendGiftBody;
import com.p1.mobile.putong.core.data.GreetSendGiftConfig;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.remote_config.RemoteConfigException;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.e30;
import l.ftj;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.uqd0;
import l.w9j;
import l.yij0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zyc0 extends ogl0 {

    /* JADX INFO: renamed from: b */
    public static uqd0 f29036b = new uqd0("gift_tips_guide_tracker_" + CoreModule.m1850H().userId(), "");

    /* JADX INFO: renamed from: c */
    public static zpd0 f29037c = new zpd0("gift_tios_guide_show_time_" + CoreModule.m1850H().userId(), 0L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m28855c0(w9j w9jVar, e30 e30Var, PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, Throwable th) {
        if (!((Boolean) w9jVar.call(th)).booleanValue()) {
            if (th instanceof TantanException.Client.TantanForbidden) {
                int i = ((TantanException.Client.TantanForbidden) th).code;
                if (i == 40301) {
                    lsi0.h(R$string.f2724mj);
                } else if (i == 40308) {
                    lsi0.y("对方被你拉黑，不能继续互动");
                } else if (i == 40309) {
                    lsi0.y("对方设置了隐私权限，不能继续互动");
                } else {
                    yij0.D(th);
                }
            } else {
                yij0.D(th);
            }
        }
        if (NullChecker.a(e30Var)) {
            ftj.e(putongAct.pageId(), coreSendGiftBody.recvUserID, false);
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m28857e0(e30 e30Var, PutongAct putongAct, CoreSendGiftBody coreSendGiftBody, roj0 roj0Var) {
        if (NullChecker.a(e30Var)) {
            ftj.e(putongAct.pageId(), coreSendGiftBody.recvUserID, true);
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m28858f0(RecyclerView recyclerView) {
        return recyclerView.computeHorizontalScrollExtent() < recyclerView.computeHorizontalScrollRange();
    }

    /* JADX INFO: renamed from: g0 */
    public static String m28859g0() {
        return "为你精心挑选了一个礼物";
    }

    /* JADX INFO: renamed from: h0 */
    public static ChatGiftInfoExtra m28860h0(Message message) {
        ChatGiftInfo chatGiftInfo;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData != null && (chatGiftInfo = messageAdditionalData.chatGiftInfo) != null) {
            try {
                return (ChatGiftInfoExtra) ChatGiftInfoExtra.JSON_ADAPTER.parse(chatGiftInfo.extra);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public static String m28861i0(boolean z) {
        try {
            GreetSendGiftConfig greetSendGiftConfig = (GreetSendGiftConfig) RemoteConfig.x().v("greet_send_gift_config", GreetSendGiftConfig.JSON_ADAPTER);
            if (NullChecker.a(greetSendGiftConfig)) {
                return z ? greetSendGiftConfig.maleRefusedGiftTips : greetSendGiftConfig.femaleRefusedGiftTips;
            }
            return "";
        } catch (RemoteConfigException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m28862j0() {
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public static void m28863k0(final PutongAct putongAct, final CoreSendGiftBody coreSendGiftBody, final e30<Boolean> e30Var, final w9j<Throwable, Boolean> w9jVar) {
        putongAct.duringCreated(CoreModule.f1534c.f3632f1.m14871k4(coreSendGiftBody).flatMap(new w9j() { // from class: l.wyc0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3631f0.m4580Fo();
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.xyc0
            public final void call(Object obj) {
                zyc0.m28857e0(e30Var, putongAct, coreSendGiftBody, (roj0) obj);
            }
        }, new e30() { // from class: l.yyc0
            public final void call(Object obj) {
                zyc0.m28855c0(w9jVar, e30Var, putongAct, coreSendGiftBody, (Throwable) obj);
            }
        }));
    }
}
