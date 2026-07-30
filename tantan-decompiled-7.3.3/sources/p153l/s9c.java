package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Channel;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public class s9c {

    /* JADX INFO: renamed from: a */
    public static Map<String, Integer> f166924a;

    static {
        HashMap map = new HashMap();
        f166924a = map;
        map.put("Connect to developer's machine", 2485);
        f166924a.put("disable DebugTools", 1043);
        f166924a.put("start DebugTools", 1044);
        f166924a.put("Debug Toast Switch is:true", 387);
        f166924a.put("Debug Toast Switch is:false", 387);
        f166924a.put("statistics_qr_scan", 382);
        f166924a.put("guess page", 342);
        f166924a.put("leakcanary is open = true", 350);
        f166924a.put("leakcanary is open = false", 350);
        f166924a.put("make first user like me", Integer.valueOf(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256));
        f166924a.put("Pick city", 113);
        f166924a.put("show user id", 113);
        f166924a.put("online Match debugItem", 61);
        f166924a.put("Online Match Broadcast Match", 54);
        f166924a.put("show guide", 47);
        f166924a.put("显示划卡引导动画", 45);
        f166924a.put("Intl change MCC", 45);
        f166924a.put("GPSku", 41);
        f166924a.put("DIALOGS AT HOME", 34);
        f166924a.put("收到闪聊匹配2成功", 37);
        f166924a.put("clear SavedValue", 30);
        f166924a.put("特殊卡片样式", 28);
        f166924a.put("make first user superlike me", 26);
        f166924a.put("webAB entrance is open = true", 31);
        f166924a.put("webAB entrance is open = false", 31);
        f166924a.put("Change Unstable Server", 23);
        f166924a.put("show purchase result notify", 20);
        f166924a.put("Change location 19 guess alert", 18);
        f166924a.put("show giving boost guide", 14);
        f166924a.put("qr_scan", 13);
        f166924a.put("Toggle facebookAppId", 13);
        f166924a.put("sku流程优化", 13);
        f166924a.put("device info", 12);
        f166924a.put("首页切换动画DebugItem", 11);
        f166924a.put("探探认证气泡", 9);
        f166924a.put("Start SignUpProfileImageAct", 8);
        f166924a.put("clear baidu location cache", 7);
        f166924a.put("show switcher anim pop", 7);
        f166924a.put("GPSku业务vip查询", 7);
        f166924a.put("block db transaction posting for 10 secs", 6);
        f166924a.put("beatles logs", 6);
        f166924a.put("插件化的Debug开关", 5);
        f166924a.put("x5速度", 5);
        f166924a.put("32-gp renew subs data toast", 5);
        f166924a.put("show location tips", 4);
        f166924a.put("8-vip expired dialog", 4);
        f166924a.put("还原速度", 4);
        f166924a.put("crash/anr the app/get device info", 4);
        f166924a.put("show app store guide status", 4);
        f166924a.put("match user with inputed id", 4);
        f166924a.put("Online Match Default Match", 4);
        f166924a.put("clear init file cache", 4);
        f166924a.put("12-vip alert 4", 4);
        f166924a.put("show mask", 3);
        f166924a.put("finish the activity", 3);
        f166924a.put("4-first right swipe", 2);
        f166924a.put("Sign out in 5 seconds", 2);
        f166924a.put("Open Instagram like Media picker", 2);
        f166924a.put("mediapicker", 2);
        f166924a.put("15-fake alert", 2);
        f166924a.put("6-first undo", 2);
        f166924a.put("Change ip for httpdns", 2);
        f166924a.put("tantan star rank", 2);
        f166924a.put("show switcher anim chat", 2);
        f166924a.put("7-see expired dialog", 2);
        f166924a.put("3-first left swipe", 2);
        f166924a.put("收到Push喜欢debugItems", 2);
        f166924a.put("收到Push喜欢 newMaleUserLike.received", 2);
        f166924a.put("show android id", 2);
        f166924a.put("5-first superlike swipe", 1);
        f166924a.put("33-gp miss match toast", 1);
        f166924a.put("detect bt java", 1);
        f166924a.put("show pop board mask", 1);
        f166924a.put("QuickChatDebugItems", 1);
        f166924a.put("debug multiple user debugItems", 1);
        f166924a.put(Channel.fake, 1);
        f166924a.put("tt coin debugItems", 1);
        f166924a.put("展示顶部弹窗", 1);
        f166924a.put("tantan appstore rank guide", 1);
        f166924a.put("9-out of superlike", 1);
        f166924a.put("13-only buy superlike alert", 1);
        f166924a.put("Online Match Membership Pay", 1);
        f166924a.put("show ab messages", 1);
        f166924a.put("monitor", 1);
        f166924a.put("sign out then finish and clear java and native cache", 1);
        f166924a.put("35-gp pay failed dlg", 1);
        f166924a.put("fake my app version for update api", 1);
        f166924a.put("Make the app crash", 1);
        f166924a.put("good2Fake", 1);
        f166924a.put("tt coin confirm dialog - superLike", 1);
        f166924a.put("show toast top!!!!!", 1);
        f166924a.put("anr", 1);
        f166924a.put("show sl success toast", 1);
        f166924a.put("16-school navigate dialog", 1);
        f166924a.put("show alert toast in 5 secs", 1);
        f166924a.put("shortcut badger show", 1);
        f166924a.put("17-school approval failed", 1);
        f166924a.put("good2fake dialog", 1);
        f166924a.put("31-gp renew subs failed 1 set distributor", 1);
        f166924a.put("pull httpdns data", 1);
        f166924a.put("提交覆盖率报告", 1000);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m185171a(String str, String str2) {
        return m185172b(str2) - m185172b(str);
    }

    /* JADX INFO: renamed from: b */
    public static int m185172b(String str) {
        if (TextUtils.isEmpty(str) || !NullChecker.m82486a(f166924a.get(str.trim()))) {
            return 0;
        }
        return f166924a.get(str.trim()).intValue();
    }

    /* JADX INFO: renamed from: c */
    public static void m185173c(List<String> list) {
        Collections.sort(list, new Comparator() { // from class: l.r9c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return s9c.m185171a((String) obj, (String) obj2);
            }
        });
    }
}
