package com.p000p1.mobile.putong.core.api;

import android.net.Uri;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0175o;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Evaluation;
import com.p1.mobile.putong.core.data.ThirdPartyInfo;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.utc0;
import l.v9j;
import l.w9j;
import l.x9j;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.mu5;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.o */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0175o extends ax6 {

    /* JADX INFO: renamed from: T */
    public static final String f4057T = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/personality-match/index.html?speed=true&_bid=1002724&#/report";

    /* JADX INFO: renamed from: U */
    public static final String f4058U = "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/personality-match/index.html?speed=true&_bid=1002724#/redirect";

    /* JADX INFO: renamed from: R */
    public String f4059R;

    /* JADX INFO: renamed from: S */
    public final hpd0 f4060S;

    public C0175o(C0158c c0158c) {
        super(c0158c);
        this.f4060S = new hpd0("know_myself_tab_indicator_" + CoreModule.m1850H().userId(), Boolean.TRUE);
        if (TextUtils.equals((CharSequence) mu5.f17252a.get(), "tantanapp")) {
            this.f4059R = "https://service.wzhxlx.com/wwyy/ceping/api/channel/login";
        } else {
            this.f4059R = "http://wwyy-test.wzhxlx.com/wwyy/ceping/api/channel/login";
        }
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m6269a3(String str, Act act, Pair pair) {
        int iIntValue = ((User) pair.second).onlineMatchLocked() ? ((Integer) ((j760) pair.first).a).intValue() : 100;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("quickChatProgress", iIntValue + "");
        act.startActivity(MkWebViewAct.d2(act, "懂我测试", builderBuildUpon.toString(), true, true, false, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m6273e3(Throwable th) {
    }

    /* JADX INFO: renamed from: k3 */
    public static int m6277k3(String str) {
        try {
            return Integer.parseInt(Uri.parse(str).getQueryParameter("money")) / 10;
        } catch (Exception e) {
            CrashHelper.c(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static String m6278l3(String str) {
        try {
            return Uri.parse(str).getQueryParameter("orderId");
        } catch (Exception e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static boolean m6279m3(User user) {
        return NullChecker.a(user) && NullChecker.a(user.settings) && NullChecker.a(user.settings.getUserCharacter()) && !TextUtils.isEmpty(user.settings.getUserCharacter().classification);
    }

    /* JADX INFO: renamed from: n3 */
    public static boolean m6280n3(User user) {
        return NullChecker.a(user) && NullChecker.a(user.settings) && NullChecker.a(user.settings.getUserCharacter()) && !user.settings.getUserCharacter().hideCharacter && !TextUtils.isEmpty(user.settings.getUserCharacter().classification);
    }

    /* JADX INFO: renamed from: r3 */
    public static void m6281r3(final Act act, @NotNull User user, final String str) {
        if (((DbObject) user).id.equals(CoreModule.m1850H().userId())) {
            act.startActivity(MkWebViewAct.d2(act, "懂我测试", str, true, true, false, (ResultReceiver) null));
        } else {
            if (user.onlineMatchLocked()) {
                act.duringCreated(mkd0.r(CoreModule.f1534c.f3631f0.m4978mo(((DbObject) user).id), CoreModule.f1534c.f3628e0.m21373Ka(((DbObject) user).id), new x9j() { // from class: l.uc9
                    public final Object call(Object obj, Object obj2) {
                        return new Pair((j760) obj, (User) obj2);
                    }
                })).take(1).subscribe(mkd0.H(new e30() { // from class: l.vc9
                    public final void call(Object obj) {
                        C0175o.m6269a3(str, act, (Pair) obj);
                    }
                }, new e30() { // from class: l.wc9
                    public final void call(Object obj) {
                        C0175o.m6273e3((Throwable) obj);
                    }
                }));
                return;
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("quickChatProgress", "100");
            act.startActivity(MkWebViewAct.d2(act, "懂我测试", builderBuildUpon.toString(), true, true, false, (ResultReceiver) null));
        }
    }

    /* JADX INFO: renamed from: s3 */
    public static String m6282s3(String str, String str2, boolean z, String str3) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (!TextUtils.isEmpty(str2)) {
            builderBuildUpon.appendQueryParameter("matchuserid", str2);
        }
        builderBuildUpon.appendQueryParameter("hideCharacter", z ? "true" : "false");
        builderBuildUpon.appendQueryParameter("test_showfrom", str3);
        return builderBuildUpon.toString();
    }

    /* JADX INFO: renamed from: i3 */
    public c<Evaluation> m6283i3(final long j, final String str) {
        return this.f8580Q.scheduled("evaluation_pay", 0, new v9j() { // from class: l.ad9
            public final Object call() {
                return this.f8218a.m6286p3(j, str);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public String m6284j3(ThirdPartyInfo thirdPartyInfo) {
        return this.f4059R + String.format("?channelId=%1$s&openId=%2$s&sign=%3$s&avatar=%4$s&nickName=%5$s", Integer.valueOf(thirdPartyInfo.channelId), thirdPartyInfo.openId, thirdPartyInfo.sign, thirdPartyInfo.avatar, thirdPartyInfo.nickName);
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Evaluation m6285o3(Envelope envelope) {
        this.f8580Q.f3559H0.m27536k5();
        return envelope.getModuleData(CoreData.class).evaluation;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ c m6286p3(long j, String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("evaluationId", j);
            jSONObject.put("consumeType", "coin");
            jSONObject.put("bizType", "evaluation");
            JSONObject jSONObject2 = new JSONObject();
            Uri uri = Uri.parse(str);
            for (String str2 : uri.getQueryParameterNames()) {
                jSONObject2.put(str2, uri.getQueryParameter(str2));
            }
            jSONObject.put("thirdPartyInfo", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return ia20.m16567a(new v9j() { // from class: l.bd9
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3298x0("/evaluation-pay")).m(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.cd9
            public final Object call(Object obj) {
                return this.f9595a.m6285o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public c<ThirdPartyInfo> m6287q3() {
        return this.f8580Q.scheduled("evaluation_sign", 0, new v9j() { // from class: l.xc9
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.yc9
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3298x0("/evaluation-sign")).b();
                    }
                }).map(new w9j() { // from class: l.zc9
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).thirdPartyInfo;
                    }
                });
            }
        });
    }
}
