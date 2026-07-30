package com.p046p1.mobile.putong.core.api;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4749o;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Evaluation;
import com.p046p1.mobile.putong.core.data.ThirdPartyInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.ax6;
import p149l.e30;
import p149l.hpd0;
import p149l.ia20;
import p149l.j760;
import p149l.mkd0;
import p149l.mu5;
import p149l.uc9;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.o */
/* JADX INFO: loaded from: classes9.dex */
public class C4749o extends ax6 {

    /* JADX INFO: renamed from: T */
    public static final String f20068T = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/personality-match/index.html?speed=true&_bid=1002724&#/report";

    /* JADX INFO: renamed from: U */
    public static final String f20069U = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/personality-match/index.html?speed=true&_bid=1002724#/redirect";

    /* JADX INFO: renamed from: R */
    public String f20070R;

    /* JADX INFO: renamed from: S */
    public final hpd0 f20071S;

    public C4749o(C4732c c4732c) {
        super(c4732c);
        this.f20071S = new hpd0("know_myself_tab_indicator_" + CoreModule.m29931H().userId(), Boolean.TRUE);
        if (TextUtils.equals(mu5.f135733a.get(), "tantanapp")) {
            this.f20070R = "https://service.wzhxlx.com/wwyy/ceping/api/channel/login";
        } else {
            this.f20070R = "http://wwyy-test.wzhxlx.com/wwyy/ceping/api/channel/login";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m34332a3(String str, Act act, Pair pair) {
        int iIntValue = ((User) pair.second).onlineMatchLocked() ? ((Integer) ((j760) pair.first).f116564a).intValue() : 100;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("quickChatProgress", iIntValue + "");
        act.startActivity(MkWebViewAct.m80239d2(act, "懂我测试", builderBuildUpon.toString(), true, true, false, null));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m34336e3(Throwable th) {
    }

    /* JADX INFO: renamed from: k3 */
    public static int m34340k3(String str) {
        try {
            return Integer.parseInt(Uri.parse(str).getQueryParameter("money")) / 10;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static String m34341l3(String str) {
        try {
            return Uri.parse(str).getQueryParameter("orderId");
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static boolean m34342m3(User user) {
        return NullChecker.m81303a(user) && NullChecker.m81303a(user.settings) && NullChecker.m81303a(user.settings.getUserCharacter()) && !TextUtils.isEmpty(user.settings.getUserCharacter().classification);
    }

    /* JADX INFO: renamed from: n3 */
    public static boolean m34343n3(User user) {
        return NullChecker.m81303a(user) && NullChecker.m81303a(user.settings) && NullChecker.m81303a(user.settings.getUserCharacter()) && !user.settings.getUserCharacter().hideCharacter && !TextUtils.isEmpty(user.settings.getUserCharacter().classification);
    }

    /* JADX INFO: renamed from: r3 */
    public static void m34344r3(final Act act, @NotNull User user, final String str) {
        if (user.f56011id.equals(CoreModule.m29931H().userId())) {
            act.startActivity(MkWebViewAct.m80239d2(act, "懂我测试", str, true, true, false, null));
        } else {
            if (user.onlineMatchLocked()) {
                act.duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m33048mo(user.f56011id), CoreModule.f17545c.f19639e0.m169410Ka(user.f56011id), new uc9())).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.vc9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C4749o.m34332a3(str, act, (Pair) obj);
                    }
                }, new e30() { // from class: l.wc9
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C4749o.m34336e3((Throwable) obj);
                    }
                }));
                return;
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("quickChatProgress", "100");
            act.startActivity(MkWebViewAct.m80239d2(act, "懂我测试", builderBuildUpon.toString(), true, true, false, null));
        }
    }

    /* JADX INFO: renamed from: s3 */
    public static String m34345s3(String str, String str2, boolean z, String str3) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (!TextUtils.isEmpty(str2)) {
            builderBuildUpon.appendQueryParameter("matchuserid", str2);
        }
        builderBuildUpon.appendQueryParameter("hideCharacter", z ? "true" : "false");
        builderBuildUpon.appendQueryParameter("test_showfrom", str3);
        return builderBuildUpon.toString();
    }

    /* JADX INFO: renamed from: i3 */
    public C22306c<Evaluation> m34346i3(final long j, final String str) {
        return this.f72126Q.scheduled("evaluation_pay", 0, new v9j() { // from class: l.ad9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f68917a.m34349p3(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public String m34347j3(ThirdPartyInfo thirdPartyInfo) {
        return this.f20070R + String.format("?channelId=%1$s&openId=%2$s&sign=%3$s&avatar=%4$s&nickName=%5$s", Integer.valueOf(thirdPartyInfo.channelId), thirdPartyInfo.openId, thirdPartyInfo.sign, thirdPartyInfo.avatar, thirdPartyInfo.nickName);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Evaluation m34348o3(Envelope envelope) {
        this.f72126Q.f19570H0.m210361k5();
        return ((CoreData) envelope.getModuleData(CoreData.class)).evaluation;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22306c m34349p3(long j, String str) {
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
            CrashHelper.m81296c(e);
        }
        return ia20.m135117a(new v9j() { // from class: l.bd9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31368x0("/evaluation-pay")).m185894m(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.cd9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80355a.m34348o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22306c<ThirdPartyInfo> m34350q3() {
        return this.f72126Q.scheduled("evaluation_sign", 0, new v9j() { // from class: l.xc9
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.yc9
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31368x0("/evaluation-sign")).m185883b();
                    }
                }).map(new w9j() { // from class: l.zc9
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).thirdPartyInfo;
                    }
                });
            }
        });
    }
}
