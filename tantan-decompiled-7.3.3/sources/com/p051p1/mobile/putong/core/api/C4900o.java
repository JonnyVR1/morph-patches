package com.p051p1.mobile.putong.core.api;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4900o;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Evaluation;
import com.p051p1.mobile.putong.core.data.ThirdPartyInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.de9;
import p153l.dy6;
import p153l.jxd0;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.qi20;
import p153l.qv5;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.o */
/* JADX INFO: loaded from: classes9.dex */
public class C4900o extends dy6 {

    /* JADX INFO: renamed from: T */
    public static final String f20810T = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/personality-match/index.html?speed=true&_bid=1002724&#/report";

    /* JADX INFO: renamed from: U */
    public static final String f20811U = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/personality-match/index.html?speed=true&_bid=1002724#/redirect";

    /* JADX INFO: renamed from: R */
    public String f20812R;

    /* JADX INFO: renamed from: S */
    public final jxd0 f20813S;

    public C4900o(C4883c c4883c) {
        super(c4883c);
        this.f20813S = new jxd0("know_myself_tab_indicator_" + CoreModule.m30929H().userId(), Boolean.TRUE);
        if (TextUtils.equals(qv5.f159697a.get(), "tantanapp")) {
            this.f20812R = "https://service.wzhxlx.com/wwyy/ceping/api/channel/login";
        } else {
            this.f20812R = "http://wwyy-test.wzhxlx.com/wwyy/ceping/api/channel/login";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m35335a3(String str, Act act, Pair pair) {
        int iIntValue = ((User) pair.second).onlineMatchLocked() ? ((Integer) ((pf60) pair.first).f152156a).intValue() : 100;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("quickChatProgress", iIntValue + "");
        act.startActivity(MkWebViewAct.m81422e2(act, "懂我测试", builderBuildUpon.toString(), true, true, false, null));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m35339e3(Throwable th) {
    }

    /* JADX INFO: renamed from: k3 */
    public static int m35343k3(String str) {
        try {
            return Integer.parseInt(Uri.parse(str).getQueryParameter("money")) / 10;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static String m35344l3(String str) {
        try {
            return Uri.parse(str).getQueryParameter("orderId");
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static boolean m35345m3(User user) {
        return NullChecker.m82486a(user) && NullChecker.m82486a(user.settings) && NullChecker.m82486a(user.settings.getUserCharacter()) && !TextUtils.isEmpty(user.settings.getUserCharacter().classification);
    }

    /* JADX INFO: renamed from: n3 */
    public static boolean m35346n3(User user) {
        return NullChecker.m82486a(user) && NullChecker.m82486a(user.settings) && NullChecker.m82486a(user.settings.getUserCharacter()) && !user.settings.getUserCharacter().hideCharacter && !TextUtils.isEmpty(user.settings.getUserCharacter().classification);
    }

    /* JADX INFO: renamed from: r3 */
    public static void m35347r3(final Act act, @NotNull User user, final String str) {
        if (user.f56859id.equals(CoreModule.m30929H().userId())) {
            act.startActivity(MkWebViewAct.m81422e2(act, "懂我测试", str, true, true, false, null));
        } else {
            if (user.onlineMatchLocked()) {
                act.duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m34051mo(user.f56859id), CoreModule.f18264c.f20381e0.m116483Ka(user.f56859id), new de9())).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.ee9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C4900o.m35335a3(str, act, (Pair) obj);
                    }
                }, new y20() { // from class: l.fe9
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C4900o.m35339e3((Throwable) obj);
                    }
                }));
                return;
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("quickChatProgress", "100");
            act.startActivity(MkWebViewAct.m81422e2(act, "懂我测试", builderBuildUpon.toString(), true, true, false, null));
        }
    }

    /* JADX INFO: renamed from: s3 */
    public static String m35348s3(String str, String str2, boolean z, String str3) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (!TextUtils.isEmpty(str2)) {
            builderBuildUpon.appendQueryParameter("matchuserid", str2);
        }
        builderBuildUpon.appendQueryParameter("hideCharacter", z ? "true" : "false");
        builderBuildUpon.appendQueryParameter("test_showfrom", str3);
        return builderBuildUpon.toString();
    }

    /* JADX INFO: renamed from: i3 */
    public C22421c<Evaluation> m35349i3(final long j, final String str) {
        return this.f91137Q.scheduled("evaluation_pay", 0, new pcj() { // from class: l.je9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f120408a.m35352p3(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public String m35350j3(ThirdPartyInfo thirdPartyInfo) {
        return this.f20812R + String.format("?channelId=%1$s&openId=%2$s&sign=%3$s&avatar=%4$s&nickName=%5$s", Integer.valueOf(thirdPartyInfo.channelId), thirdPartyInfo.openId, thirdPartyInfo.sign, thirdPartyInfo.avatar, thirdPartyInfo.nickName);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Evaluation m35351o3(Envelope envelope) {
        this.f91137Q.f20312H0.m155449k5();
        return ((CoreData) envelope.getModuleData(CoreData.class)).evaluation;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22421c m35352p3(long j, String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("evaluationId", j);
            jSONObject.put("consumeType", "coin");
            jSONObject.put("bizType", Evaluation.TYPE);
            JSONObject jSONObject2 = new JSONObject();
            Uri uri = Uri.parse(str);
            for (String str2 : uri.getQueryParameterNames()) {
                jSONObject2.put(str2, uri.getQueryParameter(str2));
            }
            jSONObject.put("thirdPartyInfo", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return qi20.m176654a(new pcj() { // from class: l.ke9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32371x0("/evaluation-pay")).m209039m(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.le9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131721a.m35351o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22421c<ThirdPartyInfo> m35353q3() {
        return this.f91137Q.scheduled("evaluation_sign", 0, new pcj() { // from class: l.ge9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.he9
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32371x0("/evaluation-sign")).m209028b();
                    }
                }).map(new qcj() { // from class: l.ie9
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).thirdPartyInfo;
                    }
                });
            }
        });
    }
}
