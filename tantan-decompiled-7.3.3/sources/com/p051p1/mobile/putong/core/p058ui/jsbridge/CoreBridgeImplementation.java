package com.p051p1.mobile.putong.core.p058ui.jsbridge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.ChatGroupSilence;
import com.p051p1.mobile.putong.core.data.ChatSendMessage;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.FreeTrialData;
import com.p051p1.mobile.putong.core.data.GroupSetting;
import com.p051p1.mobile.putong.core.data.GroupTab;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.NotificationCounter;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.greet.C8520a;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.greet.GreetAct;
import com.p051p1.mobile.putong.core.p058ui.jsbridge.CoreBridgeImplementation;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.core.p058ui.messages.C8687b;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.JailedGroupChat;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.p051p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.facertification.RxFacertification;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p153l.a30;
import p153l.aqq;
import p153l.aso;
import p153l.bkj0;
import p153l.bn50;
import p153l.bqq;
import p153l.cjj;
import p153l.ey6;
import p153l.fhw;
import p153l.fo0;
import p153l.ft5;
import p153l.gra;
import p153l.hqq;
import p153l.hso;
import p153l.hxf;
import p153l.i1y;
import p153l.iz40;
import p153l.jek;
import p153l.jxf;
import p153l.jyb;
import p153l.kcg0;
import p153l.kxf;
import p153l.l51;
import p153l.lf2;
import p153l.lkq;
import p153l.o1j0;
import p153l.oki;
import p153l.ovb0;
import p153l.pf60;
import p153l.pm6;
import p153l.pow;
import p153l.prp0;
import p153l.psd0;
import p153l.pzi0;
import p153l.q5l0;
import p153l.qcj;
import p153l.qtk;
import p153l.qv5;
import p153l.r47;
import p153l.rcj;
import p153l.sb8;
import p153l.sfj0;
import p153l.sim;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vg60;
import p153l.we60;
import p153l.wgb0;
import p153l.x20;
import p153l.xc00;
import p153l.xxv;
import p153l.y20;
import p153l.yti0;
import p153l.z20;

/* JADX INFO: loaded from: classes3.dex */
public class CoreBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: d */
    public boolean f30760d;

    /* JADX INFO: renamed from: e */
    public boolean f30761e;

    /* JADX INFO: renamed from: f */
    public String f30762f;

    /* JADX INFO: renamed from: g */
    public C8557h f30763g;

    /* JADX INFO: renamed from: a */
    public final ft5 f30757a = new ft5();

    /* JADX INFO: renamed from: b */
    @Nullable
    public kcg0 f30758b = null;

    /* JADX INFO: renamed from: c */
    public boolean f30759c = false;

    /* JADX INFO: renamed from: h */
    public long[] f30764h = {0, 300};

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$a */
    public class C8550a implements bn50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Merchandise f30765a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f30766b;

        public C8550a(Merchandise merchandise, String str) {
            this.f30765a = merchandise;
            this.f30766b = str;
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            CoreModule.f18264c.f20346S0.m35189v3().m137019l(new bkj0<>(1, -1, this.f30766b));
            o1j0.m165634h(R$string.f19042Yp);
        }

        @Override // p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            CoreModule.f18264c.f20346S0.m35189v3().m137019l(new bkj0<>(0, Integer.valueOf(this.f30765a.quantity), this.f30766b));
            o1j0.m165649w(R$string.f18617Kl);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$b */
    public class RunnableC8551b implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f30768a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ aqq f30769b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f30770c;

        public RunnableC8551b(aqq aqqVar, String str) {
            this.f30769b = aqqVar;
            this.f30770c = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m47738a(String str, aqq aqqVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            sfj0.m185596c("e_invitefriends_share_button_again", "p_invitefriends", new sfj0.C20032a[0]);
            aqqVar.mo99544d().mo97003a(str);
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog.C4460e c4460eM21503F = this.f30769b.mo99543c().dialog().m21506G0("再次分享，解锁更多特权").m21503F("分享到多个群可以快速解锁");
            final String str = this.f30770c;
            final aqq aqqVar = this.f30769b;
            Dialog dialogM21566z = c4460eM21503F.m21559v0("继续分享", new Runnable() { // from class: l.i87
                @Override // java.lang.Runnable
                public final void run() {
                    CoreBridgeImplementation.RunnableC8551b.m47738a(str, aqqVar);
                }
            }).m21542m0("稍后再说").m21566z();
            this.f30768a = dialogM21566z;
            dialogM21566z.show();
            sfj0.m185601h("e_invitefriends_share_button_again", "p_invitefriends", new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$c */
    public class C8552c implements TTFacertificationClient.InterfaceC10893a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f30772a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f30773b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ hqq f30774c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f30775d;

        public C8552c(PutongAct putongAct, String str, hqq hqqVar, String str2) {
            this.f30772a = putongAct;
            this.f30773b = str;
            this.f30774c = hqqVar;
            this.f30775d = str2;
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: a */
        public void mo47739a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            StringBuilder sb = new StringBuilder("onPrepareSDKError：");
            sb.append(preDetectException == null ? "null" : preDetectException.getMessage());
            fhw.m125605a("[core][LiveVerify]", sb.toString());
            jxf jxfVar = preDetectException.prepareResult;
            if (!verificationToken.isTencentProvider() || hxf.m137590k(this.f30772a, jxfVar.f123025c, this.f30773b, 2)) {
                return;
            }
            q5l0.m175471P(this.f30772a, jxfVar.f123025c);
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: b */
        public void mo47740b(VerificationToken verificationToken) {
            fhw.m125605a("[core][LiveVerify]", "onGetVerificationTokenSuccess：" + verificationToken.toString());
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: c */
        public void mo47741c(VerificationToken verificationToken, jxf jxfVar) {
            fhw.m125605a("[core][LiveVerify]", "onPrepareSDKSuccess：" + jxfVar.toString());
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: d */
        public void mo47742d(Throwable th) {
            StringBuilder sb = new StringBuilder("onGetVerificationTokenError:");
            sb.append(th == null ? "null" : th.getMessage());
            fhw.m125605a("[core][LiveVerify]", sb.toString());
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: e */
        public void mo47743e(VerificationToken verificationToken) {
            fhw.m125605a("[core][LiveVerify]", "doNotNeedCamera");
            this.f30772a.setResult(-1);
            this.f30772a.m68056e2();
            this.f30774c.mo97003a(this.f30775d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$d */
    public class C8553d implements MediaRecorderFrag.InterfaceC8367a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aqq f30777a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f30778b;

        public C8553d(aqq aqqVar, String str) {
            this.f30777a = aqqVar;
            this.f30778b = str;
        }

        @Override // com.p051p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag.InterfaceC8367a
        /* JADX INFO: renamed from: a */
        public void mo44259a() {
            this.f30777a.mo99544d().mo97004b(this.f30778b, "UpdateAvatarFinish", "1");
        }

        @Override // com.p051p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag.InterfaceC8367a
        public void onCancel() {
            this.f30777a.mo99544d().mo97004b(this.f30778b, "UpdateAvatarFinish", "0");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$e */
    public class C8554e extends pow {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ StringBuilder f30780e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f30781f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ WebView f30782g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8554e(Act act, PurchaseType purchaseType, StringBuilder sb, String str, WebView webView) {
            super(act, purchaseType);
            this.f30780e = sb;
            this.f30781f = str;
            this.f30782g = webView;
        }

        @Override // p153l.pow, p153l.bn50
        /* JADX INFO: renamed from: a */
        public void mo31848a() {
            o1j0.m165634h(R$string.f18955Vs);
            StringBuilder sb = this.f30780e;
            sb.append("javascript:");
            sb.append(this.f30781f);
            sb.append("('");
            sb.append(User.ID_TEAM_ACCOUNT);
            sb.append("')");
            CoreBridgeImplementation.this.m47706V1(this.f30782g, this.f30780e.toString());
        }

        @Override // p153l.pow, p153l.bn50
        /* JADX INFO: renamed from: b */
        public void mo47745b() {
            super.mo47745b();
        }

        @Override // p153l.pow, p153l.bn50
        /* JADX INFO: renamed from: c */
        public void mo31849c() {
            super.mo31849c();
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.j87
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20396j0.m31587G4();
                }
            }, 200L);
            StringBuilder sb = this.f30780e;
            sb.append("javascript:");
            sb.append(this.f30781f);
            sb.append("('");
            sb.append("0");
            sb.append("')");
            CoreBridgeImplementation.this.m47706V1(this.f30782g, this.f30780e.toString());
            CoreModule.f18264c.f20396j0.f20036g0 = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$f */
    public class C8555f implements qcj<List<String>, uxj0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xc00 f30784a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f30785b;

        public C8555f(xc00 xc00Var, String str) {
            this.f30784a = xc00Var;
            this.f30785b = str;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public uxj0 call(List<String> list) {
            String strSubstring;
            if (jyb.m147479J(list)) {
                strSubstring = WeJson.EMPTY_ARR;
            } else {
                String strQuote = JSONObject.quote(new JSONArray((Collection) list).toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            }
            this.f30784a.mo99544d().mo97004b(this.f30785b, strSubstring);
            return uxj0.f181467a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$g */
    public class C8556g implements qcj<uxj0, List<String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f30787a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f30788b;

        public C8556g(String str, int i) {
            this.f30787a = str;
            this.f30788b = i;
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call(uxj0 uxj0Var) {
            List<Message> listM189478n0 = CoreModule.f18272k.f115535c.m189478n0(this.f30787a, this.f30788b);
            ArrayList arrayList = new ArrayList();
            if (!jyb.m147479J(listM189478n0)) {
                Iterator<Message> it = listM189478n0.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f56859id);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$h */
    public class C8557h implements C4468a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final bqq f30790a;

        public C8557h(bqq bqqVar) {
            this.f30790a = bqqVar;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i2 == -1) {
                if (i == 1017) {
                    CoreBridgeImplementation coreBridgeImplementation = CoreBridgeImplementation.this;
                    coreBridgeImplementation.m47697M2(this.f30790a, intent, coreBridgeImplementation.f30762f);
                } else {
                    CoreBridgeImplementation coreBridgeImplementation2 = CoreBridgeImplementation.this;
                    if (i == 1015) {
                        coreBridgeImplementation2.m47696L2(this.f30790a, intent, coreBridgeImplementation2.f30762f, i);
                    } else {
                        coreBridgeImplementation2.m47695K2(this.f30790a, intent, coreBridgeImplementation2.f30762f, i);
                    }
                }
            }
            CoreBridgeImplementation.this.m47703S2(this.f30790a);
            return false;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ void m47539A1(bqq bqqVar, Throwable th) {
        bqqVar.mo99543c().progressDismiss();
        o1j0.m165621C(com.p051p1.mobile.putong.common.R$string.f18040F);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22421c m47540B(OMSThemeInfo oMSThemeInfo) {
        if (NullChecker.m82486a(oMSThemeInfo)) {
            return CoreModule.f18264c.f20405m0.m32026M5();
        }
        o1j0.m165636j("网络不给力，稍后再试吧");
        return null;
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m47548D1(final aqq aqqVar) {
        if (jek.m144576h(aqqVar.mo99543c())) {
            aqqVar.mo99543c().progress("", true);
            aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20387g0.m32829N6()).subscribe(psd0.m173597H(new y20() { // from class: l.t77
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBridgeImplementation.m47644m0(aqqVar, (List) obj);
                }
            }, new y20() { // from class: l.u77
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBridgeImplementation.m47553F0(aqqVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m47553F0(aqq aqqVar, Throwable th) {
        aqqVar.mo99543c().progressDismiss();
        ey6.m123174b(th);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m47555G(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m47559H0(aqq aqqVar, String str, Throwable th) {
        CoreModule.f18264c.f20384f0.f20650W0.put(Boolean.TRUE);
        aqqVar.mo99544d().mo97004b(str, "FillInfoFinish", "0");
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ String m47567K(List list, uxj0 uxj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m47570L(aqq aqqVar, String str, String str2, Conversation conversation) {
        if (!NullChecker.m82486a(conversation)) {
            aqqVar.mo99544d().mo97004b(str, "syncActionStatus", "0");
        } else {
            aqqVar.mo99544d().mo97004b(str, "syncActionStatus", "1");
            aqqVar.mo99543c().startActivity(MessagesAct.m50127l2(aqqVar.mo99543c(), str2, true, false, -1));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ int m47571L0(Map map, ChatGroup chatGroup, ChatGroup chatGroup2) {
        Conversation conversation = (Conversation) map.get(chatGroup.f56859id);
        Conversation conversation2 = (Conversation) map.get(chatGroup2.f56859id);
        return (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation2)) ? Double.compare(conversation2.latestTime, conversation.latestTime) : Double.compare(chatGroup2.createdTime, chatGroup.createdTime);
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ void m47572L1(aqq aqqVar) {
        aqqVar.mo99543c().startActivity(NewMainAct.m40697M5(aqqVar.mo99543c(), NavigationIntent.get("profile")));
        we60.m205991a(aqqVar.mo99543c(), CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m47577N0(xc00 xc00Var, String str, vg60 vg60Var) {
        if (!NullChecker.m82486a(vg60Var)) {
            xc00Var.mo99544d().mo97004b(str, "0");
        } else {
            xc00Var.mo99544d().mo97004b(str, jyb.m147479J(vg60Var.f184001a) ? "0" : "1");
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m47582P(aqq aqqVar, String str) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            aqqVar.mo99544d().mo97004b(str, "nums", String.valueOf(userM116600p9.pictures.size()));
        } else {
            aqqVar.mo99544d().mo97004b(str, "nums", String.valueOf(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ String m47586Q0(bkj0 bkj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chatGroup", new JSONObject(((ChatGroup) bkj0Var.f77081a).toJson()));
            jSONObject2.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize((List) bkj0Var.f77082b)));
            if (NullChecker.m82486a(bkj0Var.f77083c)) {
                jSONObject2.put("muted", ((Conversation) bkj0Var.f77083c).muted);
            }
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m47595T0(aqq aqqVar, String str, Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            aqqVar.mo99543c().startActivity(MessagesAct.m50127l2(aqqVar.mo99543c(), str, true, false, -1));
        } else {
            C8523d.m47075a(aqqVar.mo99543c(), new C8523d.a(str, "from_h5_suggest_user"));
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m47601W(aqq aqqVar) {
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        if (counterM32487o3 == null || counterM32487o3.likersLimit.remaining <= 0) {
            CoreModule.m30933P().m143405a().mo34537l1(aqqVar.mo99543c(), "p_special_card,deeplink,click");
        } else {
            aqqVar.mo99543c().startActivity(new Intent(aqqVar.mo99543c(), (Class<?>) LikersAct.class));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m47602W0(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var.mo99543c() instanceof MkWebViewAct) {
            MkWebViewAct mkWebViewAct = (MkWebViewAct) xc00Var.mo99543c();
            ResultReceiver resultReceiverM81425l2 = mkWebViewAct.m81425l2();
            if (NullChecker.m82486a(resultReceiverM81425l2)) {
                Bundle bundle = new Bundle();
                bundle.putString(Reason.TYPE, jSONObject.optString(Reason.TYPE));
                resultReceiverM81425l2.send(-1, bundle);
            } else {
                mkWebViewAct.setResult(-1);
            }
            mkWebViewAct.m68056e2();
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m47605Y(aqq aqqVar, String str) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (!userM116600p9.isBanned()) {
                aqqVar.mo99544d().mo97004b(str, "0");
            } else {
                aqqVar.mo99544d().mo97004b(str, "1");
                o1j0.m165649w(R$string.f18349C1);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m47614c0(Throwable th) {
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m47618d1(final aqq aqqVar, final String str, PurchaseType purchaseType, Act act, String str2) {
        if (CoreModule.m30930K().mo31838xf()) {
            act.duringCreated(CoreModule.f18264c.f20315I0.m144056M3()).subscribe(psd0.m173596G(new y20() { // from class: l.i47
                @Override // p153l.y20
                public final void call(Object obj) {
                    aqqVar.mo99544d().mo97004b(str, String.valueOf(((IntlCurrencyDiamond) obj).available));
                }
            }));
        } else {
            act.duringCreated(CoreModule.f18264c.f20312H0.m155437a5()).subscribe(psd0.m173596G(new y20() { // from class: l.k47
                @Override // p153l.y20
                public final void call(Object obj) {
                    aqqVar.mo99544d().mo97004b(str, String.valueOf(((Coin) obj).available));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m47620e0(aqq aqqVar, String str, Conversation conversation) {
        if (NullChecker.m82486a(conversation)) {
            aqqVar.mo99544d().mo97004b(str, "syncActionStatus", "false");
        } else {
            aqqVar.mo99544d().mo97004b(str, "syncActionStatus", "true");
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m47622f(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0086 A[EDGE_INSN: B:16:0x0086->B:17:0x0087 BREAK  A[LOOP:0: B:9:0x0040->B:26:0x0040]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m47623f0(JSONObject jSONObject, final xc00 xc00Var) {
        ovb0 ovb0Var;
        final String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("user_id");
        if (!Act.globalLifeCycle_().isEmpty() && !Act.globalLifeCycle_().values().isEmpty()) {
            ArrayList<Act.C4450r> next = Act.globalLifeCycle_().values().iterator().next();
            if (!jyb.m147479J(next)) {
                Iterator<Act.C4450r> it = next.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ovb0Var = null;
                        break;
                    }
                    Activity activity = it.next().f16062a.get();
                    if (NullChecker.m82486a(activity) && (activity instanceof GreetAct)) {
                        C8520a c8520aM46767e2 = ((GreetAct) activity).m46767e2();
                        ovb0Var = new ovb0(c8520aM46767e2.m47043R0(), Double.valueOf(c8520aM46767e2.m47042Q0()), Long.valueOf(c8520aM46767e2.m47041P0()), Boolean.valueOf(c8520aM46767e2.m47048Y0()));
                        break;
                    }
                }
            } else {
                ovb0Var = null;
                break;
            }
        } else {
            ovb0Var = null;
            break;
        }
        if (NullChecker.m82486a(ovb0Var)) {
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20420r0.m35161z5((String) ovb0Var.f149248a, ((Double) ovb0Var.f149249b).doubleValue(), ((Long) ovb0Var.f149250c).longValue(), ((Boolean) ovb0Var.f149251d).booleanValue())).subscribe(psd0.m173597H(new y20() { // from class: l.q37
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBridgeImplementation.m47577N0(xc00Var, strOptString, (vg60) obj);
                }
            }, new y20() { // from class: l.r37
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00Var.mo99544d().mo97004b(strOptString, "0");
                }
            }));
        } else {
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m33670Hg(strOptString2)).subscribe(psd0.m173597H(new y20() { // from class: l.s37
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00Var.mo99544d().mo97004b(strOptString, ((Boolean) obj).booleanValue() ? "1" : "0");
                }
            }, new y20() { // from class: l.t37
                @Override // p153l.y20
                public final void call(Object obj) {
                    xc00Var.mo99544d().mo97004b(strOptString, "0");
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m47629h0(aqq aqqVar, String str, Envelope envelope) {
        CoreModule.f18264c.f20384f0.f20650W0.put(Boolean.FALSE);
        aqqVar.mo99544d().mo97004b(str, "FillInfoFinish", "1");
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m47632i0(Throwable th) {
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m47633i1(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m47634j(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ String m47638k0(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m47639k1(bqq bqqVar, Throwable th) {
        bqqVar.mo99543c().progressDismiss();
        o1j0.m165621C(com.p051p1.mobile.putong.common.R$string.f18040F);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m47642l1(aqq aqqVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("avatar_url", CoreModule.f18264c.f20384f0.f20638S0.get());
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, CoreModule.f18264c.f20384f0.f20641T0.get());
            if (!jyb.m147479J(gra.m131665c1())) {
                JsonArray jsonArray = new JsonArray();
                Iterator<String> it = gra.m131665c1().iterator();
                while (it.hasNext()) {
                    jsonArray.add(it.next());
                }
                jSONObject.put("self_intro_tags_1", jsonArray);
            }
            if (!jyb.m147479J(gra.m131670d1())) {
                JsonArray jsonArray2 = new JsonArray();
                Iterator<String> it2 = gra.m131670d1().iterator();
                while (it2.hasNext()) {
                    jsonArray2.add(it2.next());
                }
                jSONObject.put("self_intro_tags_2", jsonArray2);
            }
            if (!jyb.m147479J(gra.m131620R0())) {
                JsonArray jsonArray3 = new JsonArray();
                Iterator<String> it3 = gra.m131620R0().iterator();
                while (it3.hasNext()) {
                    jsonArray3.add(it3.next());
                }
                jSONObject.put("other_tags", jsonArray3);
            }
            if (!TextUtils.isEmpty(CoreModule.f18264c.f20384f0.f20674e1.get())) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Oauth2AccessToken.KEY_UID, CoreModule.f18264c.f20384f0.f20674e1.get());
                jSONObject2.put(AuthenticationTokenClaims.JSON_KEY_NAME, CoreModule.f18264c.f20384f0.f20662a1.get());
                jSONObject2.put("avatar", CoreModule.f18264c.f20384f0.f20665b1.get());
                jSONObject2.put(SeeTextDynamicParam.age, CoreModule.f18264c.f20384f0.f20668c1.get());
                jSONObject2.put("hideAge", CoreModule.f18264c.f20384f0.f20671d1.get());
                jSONObject.put("userInfo", jSONObject2);
            }
            String strQuote = JSONObject.quote(jSONObject.toString());
            aqqVar.mo99544d().mo97004b(str, "syncActionStatus", strQuote.substring(1, strQuote.length() - 1));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m47644m0(aqq aqqVar, List list) {
        aqqVar.mo99543c().progressDismiss();
        if (GroupCreateCategoryAct.m37542b2(list)) {
            aqqVar.mo99543c().startActivity(GroupCreateTypeAct.m37551a2(aqqVar.mo99543c(), list));
        } else {
            o1j0.m165649w(R$string.f18473G1);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m47646n(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m47649o(OpenSdkCodeAuth openSdkCodeAuth) {
        JSONObject jSONObject = new JSONObject();
        if (!NullChecker.m82486a(openSdkCodeAuth) || TextUtils.isEmpty(openSdkCodeAuth.code)) {
            return "";
        }
        try {
            jSONObject.put("code", openSdkCodeAuth.code);
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m47659r0(Throwable th) {
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m47660r1(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m47668u0(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m47670v(GroupSetting groupSetting) {
        String strQuote = JSONObject.quote(groupSetting.toJson());
        return strQuote.substring(1, strQuote.length() - 1);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m47673w(NotificationCounter notificationCounter) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("notificationCounters", new JSONArray(NotificationCounter.JSON_ADAPTER.ARRAY_ADAPTER().serialize(jyb.m147507f0(notificationCounter))));
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m47674w0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m47676x(final Map map, aqq aqqVar, String str, pf60 pf60Var) {
        map.clear();
        if (jyb.m147479J((Collection) pf60Var.f152157b)) {
            aqqVar.mo99544d().mo97004b(str, WeJson.EMPTY_ARR);
            return;
        }
        if (!jyb.m147479J((Collection) pf60Var.f152156a)) {
            for (Conversation conversation : (List) pf60Var.f152156a) {
                if (TEnum.equals(conversation.status, "default")) {
                    map.put(conversation.otherUser, conversation);
                }
            }
        }
        ArrayList arrayListM147522n = jyb.m147522n(new ArrayList((Collection) pf60Var.f152157b), new qcj() { // from class: l.u37
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(map.containsKey(((ChatGroup) obj).f56859id));
            }
        });
        Collections.sort(arrayListM147522n, new Comparator() { // from class: l.v37
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CoreBridgeImplementation.m47571L0(map, (ChatGroup) obj, (ChatGroup) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = arrayListM147522n.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(((ChatGroup) it.next()).toJson()));
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONArray.toString());
            aqqVar.mo99544d().mo97004b(str, strQuote.substring(1, strQuote.length() - 1));
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ String m47677x0(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("groupTabs", new JSONArray(GroupTab.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m47685A2(aqq aqqVar, String str, String str2, String str3, RxFacertification.C10892b c10892b) {
        m47694J2(aqqVar.mo99543c(), aqqVar.mo99544d(), str, str2, str3, c10892b.f39692c, "liveVerify", c10892b);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m47686B2(aqq aqqVar, String str, Throwable th) {
        this.f30759c = false;
        aqqVar.mo99543c().progressDismiss();
        aqqVar.mo99544d().mo97004b(str, th instanceof TantanException.Client.CoreService ? String.valueOf(((TantanException.Client.CoreService) th).code) : "");
        fhw.m125605a("[core][LiveVerify]", "TTFacertificationClient.getInstance().startDetect error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m47687C2(final aqq aqqVar, final String str, final String str2, final String str3, final String str4) {
        if (this.f30759c) {
            return;
        }
        this.f30759c = true;
        psd0.m173633z(this.f30758b);
        aqqVar.mo99543c().progress(R$string.f18632L5);
        final String strUserId = uqb0.f180397c0.userId();
        final TTFacertificationClient.InterfaceC10893a interfaceC10893aM47709Y1 = m47709Y1(aqqVar.mo99543c(), aqqVar.mo99544d(), str, "liveVerify", aqqVar.mo99543c().string(R$string.f19262g0));
        kcg0 kcg0VarSubscribe = aqqVar.mo99543c().duringCreated(SharedLibraryLoader.m82637k().m82647r("facertification")).take(1).flatMap(new qcj() { // from class: l.x77
            @Override // p153l.qcj
            public final Object call(Object obj) {
                aqq aqqVar2 = aqqVar;
                String str5 = strUserId;
                String str6 = str2;
                return TTFacertificationClient.m61385p().m61389A(aqqVar2.mo99543c(), str5, VerificationTokenRequestParam.builder().setIdName(str6).setIdNumber(str3).useNewLiveTemplate(ixf.m142515c(aqqVar2.mo99543c(), true), false, "aliyun", "3").build(), new wq8(), interfaceC10893aM47709Y1, "liveVerify");
            }
        }).subscribe(psd0.m173600K(new y20() { // from class: l.y77
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197743a.m47685A2(aqqVar, str, str4, strUserId, (RxFacertification.C10892b) obj);
            }
        }, new y20() { // from class: l.z77
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203220a.m47686B2(aqqVar, str4, (Throwable) obj);
            }
        }, false));
        this.f30758b = kcg0VarSubscribe;
        this.f30757a.m127297a(kcg0VarSubscribe);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m47688D2(xc00 xc00Var, String str, String str2, String str3, RxFacertification.C10892b c10892b) {
        m47694J2(xc00Var.mo99543c(), xc00Var.mo99544d(), str, str2, str3, c10892b.f39692c, "liveVerify", c10892b);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m47689E2(xc00 xc00Var, String str, Throwable th) {
        this.f30759c = false;
        xc00Var.mo99543c().progressDismiss();
        xc00Var.mo99544d().mo97004b(str, th instanceof TantanException.Client.CoreService ? String.valueOf(((TantanException.Client.CoreService) th).code) : "");
        fhw.m125605a("[core][LiveVerify]", "TTFacertificationClient.getInstance().startDetect error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m47690F2(final xc00 xc00Var, final String str, final String str2, final String str3, final String str4) {
        if (this.f30759c) {
            return;
        }
        this.f30759c = true;
        psd0.m173633z(this.f30758b);
        xc00Var.mo99543c().progress(R$string.f18632L5);
        final String strUserId = uqb0.f180397c0.userId();
        final TTFacertificationClient.InterfaceC10893a interfaceC10893aM47709Y1 = m47709Y1(xc00Var.mo99543c(), xc00Var.mo99544d(), str, "liveVerify", xc00Var.mo99543c().string(R$string.f19262g0));
        kcg0 kcg0VarSubscribe = xc00Var.mo99543c().duringCreated(SharedLibraryLoader.m82637k().m82647r("facertification")).take(1).flatMap(new qcj() { // from class: l.k37
            @Override // p153l.qcj
            public final Object call(Object obj) {
                xc00 xc00Var2 = xc00Var;
                String str5 = strUserId;
                String str6 = str2;
                return TTFacertificationClient.m61385p().m61389A(xc00Var2.mo99543c(), str5, VerificationTokenRequestParam.builder().setIdName(str6).setIdNumber(str3).useNewLiveTemplate(ixf.m142515c(xc00Var2.mo99543c(), true), false, "aliyun", "3").build(), new wq8(), interfaceC10893aM47709Y1, "liveVerify");
            }
        }).subscribe(psd0.m173600K(new y20() { // from class: l.l37
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129846a.m47688D2(xc00Var, str, str4, strUserId, (RxFacertification.C10892b) obj);
            }
        }, new y20() { // from class: l.m37
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134646a.m47689E2(xc00Var, str4, (Throwable) obj);
            }
        }, false));
        this.f30758b = kcg0VarSubscribe;
        this.f30757a.m127297a(kcg0VarSubscribe);
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m47691G2(aqq aqqVar, String str) {
        MediaRecorderFrag mediaRecorderFrag = new MediaRecorderFrag();
        mediaRecorderFrag.m44256m4(new C8553d(aqqVar, str));
        if (NullChecker.m82486a(aqqVar.mo99543c())) {
            PutongAct putongActMo99543c = aqqVar.mo99543c();
            if (putongActMo99543c.isFinishing() || putongActMo99543c.isDestroyed()) {
                return;
            }
            mediaRecorderFrag.show(aqqVar.mo99543c().getSupportFragmentManager(), "update_avatar");
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m47692H2(bqq bqqVar, String str, Picture picture, int i, Picture picture2) {
        bqqVar.mo99543c().progressDismiss();
        m47699O2(bqqVar, jyb.m147507f0(picture2), str, "file://" + oki.m168038z(picture.url), null, i);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m47693I2(JSONObject jSONObject, xc00 xc00Var) {
        this.f30762f = jSONObject.optString("success");
        String strOptString = jSONObject.optString("conversation_id");
        String strOptString2 = jSONObject.optString("message_ids");
        int iOptInt = jSONObject.optInt("max_limit", 100);
        this.f30763g = new C8557h(xc00Var);
        xc00Var.mo99543c().registerOnActivityResultListener(this.f30763g);
        xc00Var.mo99543c().startActivityForResult(MessagesAct.m50125i2(xc00Var.mo99543c(), strOptString, true, strOptString2, iOptInt), 1017);
    }

    /* JADX INFO: renamed from: J2 */
    public final void m47694J2(final PutongAct putongAct, @NonNull final hqq hqqVar, @Nullable final String str, @Nullable final String str2, String str3, VerificationTokenRequestParam verificationTokenRequestParam, final String str4, final RxFacertification.C10892b c10892b) {
        final kxf kxfVar = c10892b.f39690a;
        fhw.m125605a("[core][LiveVerify]", "startDetect finish:" + kxfVar.toString());
        final VerificationToken verificationToken = c10892b.f39691b;
        if (!verificationToken.isTencentProvider() || kxfVar.f129195h) {
            final boolean zEquals = TextUtils.equals(kxfVar.f129189b, "2006");
            putongAct.duringCreated(zEquals ? TTFacertificationClient.m61383n(str3) : TTFacertificationClient.m61387v(str3, verificationTokenRequestParam.identity.provider, verificationToken.certifyId)).subscribe(psd0.m173597H(new y20() { // from class: l.g47
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102143a.m47729r2(putongAct, zEquals, hqqVar, str, str2, c10892b, kxfVar, verificationToken, str4, (Envelope) obj);
                }
            }, new y20() { // from class: l.h47
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107759a.m47730s2(putongAct, hqqVar, str2, c10892b, (Throwable) obj);
                }
            }));
        } else {
            this.f30759c = false;
            putongAct.progressDismiss();
            hxf.m137592m(kxfVar, verificationToken, putongAct, str4, 2);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m47695K2(@NonNull final bqq bqqVar, Intent intent, final String str, final int i) {
        final List list = (List) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
        if (jyb.m147479J(list)) {
            m47699O2(bqqVar, null, str, "", "cancel", i);
        } else {
            bqqVar.mo99543c().progress(com.p051p1.mobile.putong.common.R$string.f18108W);
            new i1y(list, false).flatMap(new qcj() { // from class: l.o47
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uqb0.f180397c0.mo105309l3(list);
                }
            }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.p47
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150506a.m47731t2(bqqVar, str, i, (List) obj);
                }
            }, new y20() { // from class: l.q47
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBridgeImplementation.m47539A1(bqqVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L2 */
    public final void m47696L2(@NonNull bqq bqqVar, Intent intent, String str, int i) {
        List list = (List) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
        if (jyb.m147479J(list)) {
            m47699O2(bqqVar, null, str, "", "cancel", i);
            return;
        }
        Media media = (Media) list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            sim simVar = new sim(oki.m168038z(picture.url));
            picture.mediaType = simVar.f168842c;
            picture.size = new Dimension(simVar.f168843d);
            m47704T2(bqqVar, picture, str, i);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m47697M2(bqq bqqVar, Intent intent, String str) {
        String strSubstring;
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("message_picked");
        if (jyb.m147479J(stringArrayListExtra)) {
            strSubstring = WeJson.EMPTY_ARR;
        } else {
            String strQuote = JSONObject.quote(new JSONArray((Collection) stringArrayListExtra).toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        }
        bqqVar.mo99544d().mo97004b(str, strSubstring);
    }

    /* JADX INFO: renamed from: N2, reason: merged with bridge method [inline-methods] */
    public final void m47734w2(@NonNull aqq aqqVar, String str, String str2) {
        Conversation conversationM33859Xe;
        if (User.isTeamAccount(str) || (conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str)) == null || TEnum.equals(conversationM33859Xe.status, "dismissed")) {
            return;
        }
        if (gra.m131637V1() && pm6.m172913a(conversationM33859Xe)) {
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(conversationM33859Xe.otherUser);
            if (NullChecker.m82486a(chatGroupM32923s6) && NullChecker.m82486a(chatGroupM32923s6.punishment) && NullChecker.m82486a(chatGroupM32923s6.punishment.sendMessage)) {
                ChatSendMessage chatSendMessage = chatGroupM32923s6.punishment.sendMessage;
                if (chatSendMessage.active && pzi0.m174454o() < chatSendMessage.until) {
                    return;
                }
            }
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9.state) && NullChecker.m82486a(userM116600p9.state.jailedBusiness) && NullChecker.m82486a(userM116600p9.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = userM116600p9.state.jailedBusiness.groupChat;
                if (jailedGroupChat.active && jailedGroupChat.expireTime > pzi0.m174454o()) {
                    return;
                }
            }
            ChatGroupMember chatGroupMemberM32858W8 = CoreModule.f18264c.f20387g0.m32858W8(conversationM33859Xe.otherUser, CoreModule.m30929H().userId());
            if (NullChecker.m82486a(chatGroupMemberM32858W8) && NullChecker.m82486a(chatGroupMemberM32858W8.silence)) {
                ChatGroupSilence chatGroupSilence = chatGroupMemberM32858W8.silence;
                if (chatGroupSilence.enable && pzi0.m174454o() < chatGroupSilence.until) {
                    return;
                }
            }
        }
        if (!pm6.m172913a(conversationM33859Xe)) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
            if (NullChecker.m82486a(userM116503Pa) && userM116503Pa.unilateralBlock()) {
                return;
            }
        }
        Vibrator vibrator = (Vibrator) aqqVar.mo99543c().getSystemService("vibrator");
        if (NullChecker.m82486a(vibrator)) {
            int i = Build.VERSION.SDK_INT;
            long[] jArr = this.f30764h;
            if (i >= 26) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1));
            } else {
                vibrator.vibrate(jArr, -1);
            }
        }
        if (C8687b.m50237f(str2)) {
            CoreModule.f18264c.f20373b1.m209843j3();
            CoreModule.f18264c.f20384f0.m33602Bp(str, CoreModule.m30929H().userId(), str2);
        }
    }

    /* JADX INFO: renamed from: O2 */
    public final void m47699O2(@NonNull bqq bqqVar, List<Picture> list, String str, String str2, String str3, int i) {
        String strSubstring;
        try {
            if (jyb.m147479J(list)) {
                strSubstring = WeJson.EMPTY_ARR;
            } else {
                String strQuote = JSONObject.quote(new JSONArray(Converter.RAW_PICTURE_TO_PICTURE.ARRAY_ADAPTER().serialize(list)).toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            }
            if (i == 1015) {
                bqqVar.mo99544d().mo97004b(str, str2, strSubstring, str3);
            } else {
                bqqVar.mo99544d().mo97004b(str, strSubstring, str3);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m47700P2(@NonNull final aqq aqqVar, String str, String str2, final String str3) {
        if (!NullChecker.m82486a(str) || str.isEmpty()) {
            return;
        }
        OMSThemeInfo oMSThemeInfoM217325a = yti0.m217322b().m217325a();
        if (NullChecker.m82486a(oMSThemeInfoM217325a) || !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = oMSThemeInfoM217325a.f39644id;
            }
            aqqVar.mo99543c().duringCreated((C22421c) CoreModule.f18264c.f20444z0.m195164d3(str2, true, str), false).flatMap(new qcj() { // from class: l.j47
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreBridgeImplementation.m47540B((OMSThemeInfo) obj);
                }
            }).filter(new r47()).subscribe(psd0.m173597H(new y20() { // from class: l.s47
                @Override // p153l.y20
                public final void call(Object obj) {
                    aqqVar.mo99544d().mo97003a(str3);
                }
            }, new y20() { // from class: l.t47
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBridgeImplementation.m47614c0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m47701Q2(bqq bqqVar, String str, String... strArr) {
        if (bqqVar instanceof xc00) {
            ((xc00) bqqVar).m210086f(str, strArr);
        } else {
            bqqVar.mo99544d().mo97004b(str, strArr);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public final void m47702R2(final bqq bqqVar, String str, String str2, String str3, String str4, final String str5, final String str6, String str7, String str8) {
        Link link = new Link();
        link.href = str;
        ArrayList<LinkChannel> arrayListM81140X = ShareHelper.m81140X(str5);
        List<String> listM81135S = ShareHelper.m81135S(bqqVar.mo99543c(), arrayListM81140X);
        if (TextUtils.isEmpty(str7)) {
            str7 = "adtp";
        }
        if (jyb.m147479J(listM81135S)) {
            o1j0.m165651y("未安装");
            m47701Q2(bqqVar, str7, "", "error");
        } else {
            final String str9 = str7;
            qtk.m178015b1(bqqVar.mo99543c(), str8, link, str2, str3, str4, arrayListM81140X, new z20() { // from class: l.q67
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f155785a.m47735x2(str6, bqqVar, (String) obj, (String) obj2);
                }
            }, new a30() { // from class: l.r67
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f161450a.m47736y2(str5, bqqVar, str9, (String) obj, (String) obj2, (Throwable) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S2 */
    public final void m47703S2(bqq bqqVar) {
        if (this.f30763g != null) {
            bqqVar.mo99543c().unregisterOnActivityResultListener(this.f30763g);
        }
        this.f30763g = null;
    }

    /* JADX INFO: renamed from: T2 */
    public final void m47704T2(@NonNull final bqq bqqVar, final Picture picture, final String str, final int i) {
        bqqVar.mo99543c().progress(com.p051p1.mobile.putong.common.R$string.f18108W);
        new i1y(jyb.m147507f0(picture), false).flatMap(new qcj() { // from class: l.l47
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180397c0.mo105298Y1(picture);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.m47
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134767a.m47692H2(bqqVar, str, picture, i, (Picture) obj);
            }
        }, new y20() { // from class: l.n47
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBridgeImplementation.m47639k1(bqqVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public final String m47705U1(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final void m47706V1(final WebView webView, final String str) {
        if (NullChecker.m82486a(webView)) {
            l51.m152893M(new Runnable() { // from class: l.z67
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final User m47707W1(boolean z, String str) {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        if (z) {
            userMo225055clone.description = str;
        }
        userMo225055clone.profile.extensions.profileCompletion.briefIntroduction = jyb.m147500c(Collections.EMPTY_LIST, str);
        return userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116600p9());
    }

    /* JADX INFO: renamed from: X1 */
    public final User m47708X1() {
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        userMo225055clone.profile.extensions.profileCompletion.progress = jyb.m147500c(Collections.EMPTY_LIST, "finished");
        return userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116600p9());
    }

    @NonNull
    /* JADX INFO: renamed from: Y1 */
    public final TTFacertificationClient.InterfaceC10893a m47709Y1(PutongAct putongAct, @NonNull hqq hqqVar, @Nullable String str, String str2, String str3) {
        return new C8552c(putongAct, str2, hqqVar, str);
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m47710Z1(@NonNull bqq bqqVar, String str) {
        if (TextUtils.equals(qv5.m178249c(), "tantanapp")) {
            bqqVar.mo99544d().mo97004b(str, "1");
        } else {
            bqqVar.mo99544d().mo97004b(str, "0");
        }
    }

    @Override // p153l.lf2
    /* JADX INFO: renamed from: a */
    public synchronized void mo47711a() {
        super.mo47711a();
        this.f30757a.m127299c();
        this.f30759c = false;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m47712a2(aqq aqqVar, String str) {
        PurchaseType purchaseType;
        PutongAct putongActMo99543c = aqqVar.mo99543c();
        WebViewX webViewXMo99541a = aqqVar.mo99541a();
        if (!NullChecker.m82486a(putongActMo99543c) || !NullChecker.m82486a(webViewXMo99541a)) {
            o1j0.m165634h(R$string.f18955Vs);
            return;
        }
        FreeTrialData freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4();
        if (CoreModule.f18264c.f20396j0.m31577B4()) {
            purchaseType = PurchaseType.TYPE_GET_VIP;
        } else if (CoreModule.f18264c.f20396j0.m31575A4()) {
            purchaseType = PurchaseType.TYPE_GET_LIKERS;
        } else {
            purchaseType = CoreModule.f18264c.f20396j0.m31646y4() ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : null;
        }
        PurchaseType purchaseType2 = purchaseType;
        StringBuilder sb = new StringBuilder();
        if (purchaseType2 != null) {
            hso hsoVar = new hso(putongActMo99543c, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            hsoVar.m137011t(new C8554e(putongActMo99543c, purchaseType2, sb, str, webViewXMo99541a));
            hsoVar.m137007p(aso.m99953h(putongActMo99543c, putongActMo99543c.iap().m103295i()), true, freeTrialDataM31579C4.skuId);
        } else {
            o1j0.m165649w(R$string.f19458mc);
            sb.append("javascript:");
            sb.append(str);
            sb.append("('-1')");
            m47706V1(webViewXMo99541a, sb.toString());
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m47713b2(String str) {
        if (this.f30761e) {
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(str);
            if (!NullChecker.m82486a(chatGroupM32923s6) || TextUtils.isEmpty(chatGroupM32923s6.localConId)) {
                return;
            }
            CoreModule.f18264c.f20384f0.m34213zj(chatGroupM32923s6.localConId);
        }
    }

    @lkq(key = "buyFreeTrial")
    public void buyFreeTrial(final aqq aqqVar, final String str) {
        l51.m152893M(new Runnable() { // from class: l.o67
            @Override // java.lang.Runnable
            public final void run() {
                this.f145143a.m47712a2(aqqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m47714c2(aqq aqqVar, String str, String str2) {
        this.f30761e = true;
        aqqVar.mo99544d().mo97004b(str, str2);
    }

    @lkq(isMkBridge = true, key = "checkHasChatMessage", nameSpace = "tantan")
    public void checkHasChatMessage(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        xc00Var.mo99543c().post(new Runnable() { // from class: l.t67
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m47623f0(jSONObject, xc00Var);
            }
        });
    }

    @lkq(isMkBridge = true, key = "commitSuccess", nameSpace = "tantan")
    public void commitSuccess(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        xc00Var.mo99543c().post(new Runnable() { // from class: l.o77
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m47602W0(xc00Var, jSONObject);
            }
        });
    }

    @lkq(key = "createGroupToH5")
    public void createGroupToH5(@NonNull final aqq aqqVar) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.n67
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m47548D1(aqqVar);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m47715d2(final aqq aqqVar, final String str, String[] strArr, final String str2) {
        if (!this.f30760d) {
            aqqVar.mo99543c().creates(new y20() { // from class: l.g87
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBridgeImplementation.m47674w0((Bundle) obj);
                }
            }, new x20() { // from class: l.s27
                @Override // p153l.x20
                public final void call() {
                    this.f165865a.m47713b2(str);
                }
            });
            this.f30760d = true;
        }
        List<String> listAsList = Arrays.asList(strArr);
        final ArrayList arrayList = new ArrayList();
        aqqVar.mo99543c().duringCreated((C22421c) CoreModule.f18264c.f20387g0.m32837P8(str, listAsList, new y20() { // from class: l.t27
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.addAll((List) obj);
            }
        }).map(new qcj() { // from class: l.u27
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m47567K(arrayList, (uxj0) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.v27
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182077a.m47714c2(aqqVar, str2, (String) obj);
            }
        }, new y20() { // from class: l.w27
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
    }

    @lkq(key = "deleteGroupMember")
    public void deleteGroupMember(@NonNull final aqq aqqVar, final String str, final String[] strArr, final String str2) {
        l51.m152893M(new Runnable() { // from class: l.j77
            @Override // java.lang.Runnable
            public final void run() {
                this.f118647a.m47715d2(aqqVar, str, strArr, str2);
            }
        });
    }

    @lkq(key = "dialogJumpRecharge")
    public void dialogJumpRecharge(@NonNull final aqq aqqVar, final String str, final String str2) {
        l51.m152887G(new Runnable() { // from class: l.y57
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                new fe5.C16962e(aqqVar2.mo99543c()).m125281j(wci0.m205820a(PurchaseType.TYPE_INTL_TTT_COIN)).m125274c(0).m125275d(str).m125278g(new a30() { // from class: l.v77
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        CoreBridgeImplementation.m47618d1(aqqVar2, str, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m125283l();
            }
        });
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m47716e2(final aqq aqqVar, final String str) {
        User userM47708X1 = m47708X1();
        if (NullChecker.m82486a(userM47708X1)) {
            aqqVar.mo99543c().duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116620u9(userM47708X1).flatMap(new qcj() { // from class: l.c87
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20384f0.m34156up();
                }
            })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.d87
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBridgeImplementation.m47629h0(aqqVar, str, (Envelope) obj);
                }
            }, new y20() { // from class: l.e87
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreBridgeImplementation.m47559H0(aqqVar, str, (Throwable) obj);
                }
            }));
        } else {
            CoreModule.f18264c.f20384f0.f20650W0.put(Boolean.TRUE);
            aqqVar.mo99544d().mo97004b(str, "FillInfoFinish", "0");
        }
        CoreModule.f18264c.f20384f0.f20656Y0.put(Boolean.TRUE);
    }

    @lkq(key = "enrichProfileParams")
    public void enrichProfileParams(@NonNull final aqq aqqVar, final String str) {
        l51.m152887G(new Runnable() { // from class: l.v47
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m47642l1(aqqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m47717f2(aqq aqqVar) {
        this.f30763g = new C8557h(aqqVar);
        aqqVar.mo99543c().registerOnActivityResultListener(this.f30763g);
        aqqVar.mo99543c().startActivityForResult(MediaPickerAct.m48970k2(aqqVar.mo99543c(), 1, false, false, true, null, MediaPickerAct.f31471D, false, false, CoreModule.f18264c.f20381e0.m116600p9().gender, "", false), 1015);
    }

    @lkq(key = "fetchUserSuccess")
    public void fetchUserSuccess(@NonNull aqq aqqVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(Oauth2AccessToken.KEY_UID)) {
                String string = jSONObject.getString(Oauth2AccessToken.KEY_UID);
                if (!TextUtils.isEmpty(string)) {
                    CoreModule.f18264c.f20384f0.f20674e1.put(string);
                }
            }
            if (jSONObject.has(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                String string2 = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
                if (!TextUtils.isEmpty(string2)) {
                    CoreModule.f18264c.f20384f0.f20662a1.put(string2);
                }
            }
            if (jSONObject.has("avatar")) {
                String string3 = jSONObject.getString("avatar");
                if (!TextUtils.isEmpty(string3)) {
                    CoreModule.f18264c.f20384f0.f20665b1.put(string3);
                }
            }
            if (jSONObject.has(SeeTextDynamicParam.age)) {
                String string4 = jSONObject.getString(SeeTextDynamicParam.age);
                if (!TextUtils.isEmpty(string4)) {
                    CoreModule.f18264c.f20384f0.f20668c1.put(string4);
                }
            }
            if (jSONObject.has("hideAge")) {
                CoreModule.f18264c.f20384f0.f20671d1.put(Boolean.valueOf(jSONObject.getBoolean("hideAge")));
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m47718g2(JSONObject jSONObject, xc00 xc00Var) {
        int iOptInt = jSONObject.optInt(Constants.KEY_LIMIT);
        this.f30762f = jSONObject.optString("success");
        this.f30763g = new C8557h(xc00Var);
        xc00Var.mo99543c().registerOnActivityResultListener(this.f30763g);
        xc00Var.mo99543c().startActivityForResult(MediaPickerAct.m48965d2(xc00Var.mo99543c(), Math.max(iOptInt, 1), false, false, false), 1016);
    }

    @lkq(key = "getAnonymityAvatarById")
    public void getAnonymityAvatarById(@NonNull aqq aqqVar, String str, boolean z, String str2) {
        aqqVar.mo99544d().mo97004b(str2, jek.m144580l(str, z));
    }

    @lkq(key = "getBusinessCodeAuth")
    public void getBusinessCodeAuth(@NonNull final aqq aqqVar, final String str) {
        final PutongAct putongActMo99543c = aqqVar.mo99543c();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.s67
            @Override // java.lang.Runnable
            public final void run() {
                putongActMo99543c.duringCreated((C22421c) CoreModule.f18264c.f20336P0.m114714e3(c7d0.m108301j0() ? "1000002" : "1000003", "code", "user_mobile,user_profile", "", "").map(new qcj() { // from class: l.q77
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m47649o((OpenSdkCodeAuth) obj);
                    }
                })).subscribe(psd0.m173597H(new y20() { // from class: l.r77
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aqqVar.mo99544d().mo97004b(str, (String) obj);
                    }
                }, new y20() { // from class: l.s77
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m47632i0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @lkq(key = "getFreeTrialInfo")
    public void getFreeTrialInfo(aqq aqqVar, String str) {
        FreeTrialData freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4();
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m82486a(freeTrialDataM31579C4)) {
                jSONObject.put("promotionType", freeTrialDataM31579C4.promotionType);
                jSONObject.put(StudentVerRejectedReason.startTime, freeTrialDataM31579C4.startTime * 1000);
                jSONObject.put("endTime", freeTrialDataM31579C4.endTime * 1000);
                jSONObject.put("titleText", freeTrialDataM31579C4.titleText);
                jSONObject.put("skuId", freeTrialDataM31579C4.skuId);
                jSONObject.put("serverTime", pzi0.m174454o());
            }
            m47706V1(aqqVar.mo99541a(), "javascript:" + str + "('" + jSONObject.toString() + "')");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    @lkq(key = "getGpCoinSku")
    public String getGpCoinSku(@NonNull aqq aqqVar) {
        return new JSONArray((Collection) jyb.m147486Q(cjj.f82167b.m222761e(), new qcj() { // from class: l.e67
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Merchandise) obj).toJson();
            }
        })).toString();
    }

    @lkq(key = "getGroupConversionId")
    public void getGroupConversionId(@NonNull final aqq aqqVar, String str, final String str2) {
        aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m33619Dg(str)).filter(new sb8()).subscribe(psd0.m173596G(new y20() { // from class: l.a57
            @Override // p153l.y20
            public final void call(Object obj) {
                aqqVar.mo99544d().mo97004b(str2, ((Conversation) obj).f56859id);
            }
        }));
    }

    @lkq(key = "getGroupDescriptionInfo")
    public void getGroupDescriptionInfo(@NonNull final aqq aqqVar, final String str) {
        C22421c.create(new C22421c.a() { // from class: l.d67
            @Override // p153l.y20
            public final void call(Object obj) {
                ((gcg0) obj).m137019l(CoreModule.f18264c.f20387g0.m32803E6());
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.f67
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m47670v((GroupSetting) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.g67
            @Override // p153l.y20
            public final void call(Object obj) {
                aqqVar.mo99544d().mo97004b(str, (String) obj);
            }
        }));
    }

    @lkq(key = "getGroupMember")
    public void getGroupMember(@NonNull final aqq aqqVar, final String str, final String str2) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.y37
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                aqqVar2.mo99543c().duringCreated((C22421c) CoreModule.f18264c.f20387g0.m32856W6(str).map(new qcj() { // from class: l.w37
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m47638k0((List) obj);
                    }
                })).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.x37
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aqqVar2.mo99544d().mo97004b(str, (String) obj);
                    }
                }));
            }
        });
    }

    @lkq(key = "getGroupSettingInfo")
    public void getGroupSettingInfo(@NonNull final aqq aqqVar, final String str, final String str2) {
        aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20387g0.m32861X8(str)).subscribe(psd0.m173597H(new y20() { // from class: l.f57
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBridgeImplementation.m47660r1((uxj0) obj);
            }
        }, new y20() { // from class: l.g57
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBridgeImplementation.m47633i1((Throwable) obj);
            }
        }));
        aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20387g0.m32840Q8(str)).subscribe(psd0.m173597H(new y20() { // from class: l.h57
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBridgeImplementation.m47555G((uxj0) obj);
            }
        }, new y20() { // from class: l.j57
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBridgeImplementation.m47622f((Throwable) obj);
            }
        }));
        aqqVar.mo99543c().post(new Runnable() { // from class: l.k57
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                String str3 = str;
                aqqVar2.mo99543c().duringCreated(psd0.m173626s(CoreModule.f18264c.f20387g0.m32911o6(str3).filter(new ui7()).distinctUntilChanged(), CoreModule.f18264c.f20387g0.m32862Y6(str3).filter(new qcj() { // from class: l.b37
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        DbLinks dbLinks = (DbLinks) obj;
                        return Boolean.valueOf(NullChecker.m82486a(dbLinks) && TextUtils.isEmpty(dbLinks.links.next));
                    }
                }).flatMap(new qcj() { // from class: l.d37
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreModule.f18264c.f20387g0.m32856W6(str3);
                    }
                }), CoreModule.f18264c.f20384f0.m33619Dg(str3), new scj() { // from class: l.e37
                    @Override // p153l.scj
                    /* JADX INFO: renamed from: a */
                    public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                        return bkj0.m104818a((ChatGroup) obj, (List) obj2, (Conversation) obj3);
                    }
                }).map(new qcj() { // from class: l.f37
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m47586Q0((bkj0) obj);
                    }
                })).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.g37
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aqqVar2.mo99544d().mo97004b(str, (String) obj);
                    }
                }, new y20() { // from class: l.h37
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m47659r0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @lkq(key = "getInternetStatus")
    public void getInternetStatus(@NonNull aqq aqqVar, String str) {
        if (ConnectivityReceiver.m82467g()) {
            aqqVar.mo99544d().mo97004b(str, "0");
        } else {
            aqqVar.mo99544d().mo97004b(str, "1");
        }
    }

    @lkq(key = "getCurrencyType", uiThread = true)
    public void getIntlCurrencyType(aqq aqqVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currencyType", uqb0.f180369D0);
            String strQuote = JSONObject.quote(jSONObject.toString());
            aqqVar.mo99544d().mo97004b(str, strQuote.substring(1, strQuote.length() - 1));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    @lkq(key = "getJoinGroupInfo")
    public void getJoinGroupInfo(@NonNull final aqq aqqVar, final String str) {
        final HashMap map = new HashMap();
        aqqVar.mo99543c().duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m34128sn(), CoreModule.f18264c.f20387g0.m32815I6(), new rcj() { // from class: l.l77
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a(((vg60) obj).f184001a, (List) obj2);
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.w77
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBridgeImplementation.m47676x(map, aqqVar, str, (pf60) obj);
            }
        }));
    }

    @lkq(key = "getNetworkEnv")
    public void getNetworkEnv(@NonNull aqq aqqVar, String str) {
        m47710Z1(aqqVar, str);
    }

    @lkq(key = "getNetworkTantanDevEnv")
    public void getNetworkTantanDevEnv(@NonNull aqq aqqVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tantan-dev-env", uqb0.f180427z.get());
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        aqqVar.mo99544d().mo97004b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    @lkq(key = "getNoticeNumber")
    public void getNoticeNumber(@NonNull final aqq aqqVar, final String str) {
        CoreModule.f18264c.f20387g0.m32852U8();
        aqqVar.mo99543c().duringCreated((C22421c) CoreModule.f18264c.f20387g0.m32814H8().observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.w47
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m47673w((NotificationCounter) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.y47
            @Override // p153l.y20
            public final void call(Object obj) {
                aqqVar.mo99544d().mo97004b(str, (String) obj);
            }
        }, new y20() { // from class: l.z47
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
    }

    @lkq(key = "getNotificationState")
    public String getNotificationState(@NonNull aqq aqqVar) {
        return NotificationCheckerCommon.m80403a().toString();
    }

    @lkq(key = "getTabData")
    public void getTabData(@NonNull final aqq aqqVar, final String str) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.a67
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                aqqVar2.mo99543c().duringCreated((C22421c) CoreModule.f18264c.f20387g0.m32883f7().map(new qcj() { // from class: l.a87
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m47677x0((List) obj);
                    }
                })).subscribe(psd0.m173596G(new y20() { // from class: l.b87
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aqqVar2.mo99544d().mo97004b(str, (String) obj);
                    }
                }));
            }
        });
    }

    @lkq(key = "getUserAvatarNum")
    public void getUserAvatarNum(@NonNull final aqq aqqVar, final String str) {
        l51.m152887G(new Runnable() { // from class: l.p67
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m47582P(aqqVar, str);
            }
        });
    }

    @lkq(key = "getUserIsBanedToAddGroup")
    public void getUserIsBanedToAddGroup(@NonNull final aqq aqqVar, final String str) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.w57
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m47605Y(aqqVar, str);
            }
        });
    }

    @lkq(key = "getWeChatShareInviteUrl")
    public void getWeChatShareInviteUrl(@NonNull final aqq aqqVar, final String str, final String str2) {
        l51.m152887G(new Runnable() { // from class: l.r57
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                aqqVar.mo99544d().mo97004b(str2, jek.m144586r(str3));
            }
        });
    }

    @lkq(key = "goGroupChat")
    public void goGroupChat(@NonNull final aqq aqqVar, final String str) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.u57
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                aqqVar2.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m33619Dg(str)).filter(new sb8()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.o37
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aqq aqqVar3 = aqqVar2;
                        aqqVar3.mo99543c().startActivity(MessagesAct.m50126k2(aqqVar3.mo99543c(), ((Conversation) obj).f56859id, false, false));
                    }
                }));
            }
        });
    }

    @lkq(key = "guideFillInfoFinish")
    public void guideFillInfoFinish(@NonNull final aqq aqqVar, final String str) {
        l51.m152887G(new Runnable() { // from class: l.x57
            @Override // java.lang.Runnable
            public final void run() {
                this.f192458a.m47716e2(aqqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m47719h2(String str, aqq aqqVar, List list) {
        PurchaseType purchaseType;
        if (list == null || list.size() <= 0) {
            o1j0.m165634h(R$string.f18955Vs);
            return;
        }
        Merchandise merchandise = (Merchandise) list.get(0);
        if (CoreModule.m30930K().mo31838xf()) {
            purchaseType = PurchaseType.TYPE_INTL_DIAMOND;
        } else {
            purchaseType = TextUtils.equals(str, "wallet") ? PurchaseType.TYPE_INTL_TTT_COIN : PurchaseType.TYPE_INTL_TTT_LIVE_COIN;
        }
        hso hsoVar = new hso(aqqVar.mo99543c(), purchaseType);
        hsoVar.m137011t(new C8550a(merchandise, str));
        hsoVar.m137007p(aso.m99953h(aqqVar.mo99543c(), aqqVar.mo99543c() != null ? aqqVar.mo99543c().iap().m103295i() : null), merchandise.autoRenewable(), merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    @lkq(key = "h5PayAgain")
    public void h5PayAgain(@NonNull aqq aqqVar) {
        aqqVar.mo99543c().m68056e2();
    }

    @lkq(key = "h5PayCallBack")
    public void h5PayCallBack(@NonNull aqq aqqVar, int i, int i2, String str) {
        CoreModule.f18264c.f20346S0.m35189v3().m137019l(new bkj0<>(Integer.valueOf(i), Integer.valueOf(i2), str));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m47720i2(aqq aqqVar, String str, uxj0 uxj0Var) {
        aqqVar.mo99544d().mo97004b(str, m47705U1("0"));
    }

    @lkq(key = "ifUserVerified")
    public void ifUserVerified(@NonNull final aqq aqqVar, final String str) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.s57
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                aqqVar2.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.b47
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        User user = (User) obj;
                        aqqVar2.mo99544d().mo97004b(str, (user.isBanned() || !user.isIdCardVerified()) ? "1" : "0");
                    }
                }, new y20() { // from class: l.c47
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m47668u0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @lkq(key = "imagePickerPhoto")
    public void imagePickerPhoto(@NonNull final aqq aqqVar, String str) {
        this.f30762f = str;
        aqqVar.mo99543c().post(new Runnable() { // from class: l.m67
            @Override // java.lang.Runnable
            public final void run() {
                this.f134973a.m47717f2(aqqVar);
            }
        });
    }

    @lkq(isMkBridge = true, key = "imagesPickerMulti", nameSpace = "tantan")
    public void imagesPickerMulti(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        xc00Var.mo99543c().post(new Runnable() { // from class: l.n57
            @Override // java.lang.Runnable
            public final void run() {
                this.f140311a.m47718g2(jSONObject, xc00Var);
            }
        });
    }

    @lkq(key = "inviteFriendCompletion")
    public void inviteFriendCompletion(@NonNull aqq aqqVar, String str) {
        aqqVar.mo99543c().post(new RunnableC8551b(aqqVar, str));
    }

    @lkq(key = "invokeGpCoinPay")
    public void invokeGpCoinPay(@NonNull final aqq aqqVar, String str, final String str2) {
        ProductCategory productCategory;
        if (CoreModule.m30930K().mo31838xf()) {
            productCategory = ProductCategory.get(ProductCategory.tttDiamond);
        } else {
            productCategory = TextUtils.equals(str2, "wallet") ? ProductCategory.get(ProductCategory.tttCoin) : ProductCategory.get(ProductCategory.tttLiveCoin);
        }
        CoreModule.f18264c.f20396j0.m31578B5(productCategory, str).compose(psd0.m173607R()).subscribe(psd0.m173597H(new y20() { // from class: l.h87
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108208a.m47719h2(str2, aqqVar, (List) obj);
            }
        }, new y20() { // from class: l.c37
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f18955Vs);
            }
        }));
    }

    @lkq(isMkBridge = true, key = "isOpenLocationPermission", nameSpace = "tantan")
    public void isOpenLocationPermission(@NonNull aqq aqqVar, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        if (xxv.m213590q()) {
            aqqVar.mo99544d().mo97004b(strOptString, "true");
        } else {
            aqqVar.mo99544d().mo97004b(strOptString, "false");
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m47721j2(aqq aqqVar, String str, Throwable th) {
        aqqVar.mo99544d().mo97004b(str, m47705U1("1"));
    }

    @lkq(key = "jumpNotificationSettings")
    public void jumpNotificationSettings(@NonNull aqq aqqVar) {
        iz40.m142756A();
    }

    @lkq(key = "jumpToEditProfileAct")
    public void jumpToEditProfileAct(@NonNull final aqq aqqVar, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(str, ReminderAction.photo)) {
            l51.m152893M(new Runnable() { // from class: l.i57
                @Override // java.lang.Runnable
                public final void run() {
                    CoreBridgeImplementation.m47572L1(aqqVar);
                }
            });
        } else {
            l51.m152893M(new Runnable() { // from class: l.t57
                @Override // java.lang.Runnable
                public final void run() {
                    aqq aqqVar2 = aqqVar;
                    aqqVar2.mo99543c().startActivity(CoreModule.m30930K().mo31843yp(aqqVar2.mo99543c(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, str));
                }
            });
        }
    }

    @lkq(key = "jumpToLauncher")
    public void jumpToLauncher(@NonNull aqq aqqVar) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        aqqVar.mo99543c().startActivity(intent);
    }

    @lkq(key = "jumpToProfileAct")
    public void jumpToProfileAct(@NonNull final aqq aqqVar, final String str) {
        aqqVar.mo99543c().duringCreated(CoreModule.m30930K().userObsById(str)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.c57
            @Override // p153l.y20
            public final void call(Object obj) {
                aqq aqqVar2 = aqqVar;
                aqqVar2.mo99543c().startActivity(CoreModule.m30930K().startProfileAct(aqqVar2.mo99543c(), str, "from_questions_answers", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false));
            }
        }));
    }

    @lkq(key = "jumpToPush")
    public void jumpToPush(@NonNull aqq aqqVar) {
        iz40.m142756A();
    }

    @lkq(key = "jumpToSeeOrBuySee")
    public void jumpToSeeOrBuySee(@NonNull final aqq aqqVar) {
        l51.m152893M(new Runnable() { // from class: l.u47
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m47601W(aqqVar);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m47722k2(aqq aqqVar, String str, uxj0 uxj0Var) {
        aqqVar.mo99544d().mo97004b(str, m47705U1("0"));
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m47723l2(aqq aqqVar, String str, Throwable th) {
        aqqVar.mo99544d().mo97004b(str, m47705U1("1"));
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m47724m2(aqq aqqVar, String str, uxj0 uxj0Var) {
        aqqVar.mo99544d().mo97004b(str, m47705U1("0"));
    }

    @lkq(key = "modifyGroupInfo")
    public void modifyGroupInfo(@NonNull final aqq aqqVar, String str, String str2, String str3, final String str4) {
        List<Picture> list;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20387g0.m32828M8(str, jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME))).subscribe(psd0.m173597H(new y20() { // from class: l.c77
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f80088a.m47720i2(aqqVar, str4, (uxj0) obj);
                    }
                }, new y20() { // from class: l.d77
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f85459a.m47721j2(aqqVar, str4, (Throwable) obj);
                    }
                }));
                return;
            }
            if (jSONObject.has("description")) {
                aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20387g0.m32825L8(str, jSONObject.getString("description"))).subscribe(psd0.m173597H(new y20() { // from class: l.e77
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f92408a.m47722k2(aqqVar, str4, (uxj0) obj);
                    }
                }, new y20() { // from class: l.f77
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f97487a.m47723l2(aqqVar, str4, (Throwable) obj);
                    }
                }));
                return;
            }
            if (jSONObject.has("avatar")) {
                try {
                    list = Converter.RAW_PICTURE_TO_PICTURE.ARRAY_ADAPTER().parse(jSONObject.getJSONArray("avatar").toString());
                } catch (IOException e) {
                    CrashHelper.m82479c(e);
                    list = null;
                }
                if (jyb.m147479J(list)) {
                    aqqVar.mo99544d().mo97004b(str4, m47705U1("1"));
                } else {
                    aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20387g0.m32822K8(str, list)).subscribe(psd0.m173597H(new y20() { // from class: l.g77
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f102515a.m47724m2(aqqVar, str4, (uxj0) obj);
                        }
                    }, new y20() { // from class: l.h77
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f108094a.m47725n2(aqqVar, str4, (Throwable) obj);
                        }
                    }));
                }
            }
        } catch (JSONException e2) {
            CrashHelper.m82479c(e2);
        }
    }

    @lkq(key = "modifyGroupNickname")
    public void modifyGroupNickname(@NonNull final aqq aqqVar, final String str, final String str2, String str3, final String str4) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.k77
            @Override // java.lang.Runnable
            public final void run() {
                this.f124241a.m47728q2(str2, aqqVar, str, str4);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m47725n2(aqq aqqVar, String str, Throwable th) {
        aqqVar.mo99544d().mo97004b(str, m47705U1("1"));
    }

    @lkq(key = "needStartGreetAct")
    public void needStartGreetAct(@NonNull final aqq aqqVar, final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            aqqVar.mo99544d().mo97004b(str2, "syncActionStatus", "true");
        } else {
            l51.m152887G(new Runnable() { // from class: l.m57
                @Override // java.lang.Runnable
                public final void run() {
                    aqq aqqVar2 = aqqVar;
                    String str3 = str;
                    String str4 = str2;
                    aqqVar2.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m33823Ue(str3)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.x27
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            CoreBridgeImplementation.m47620e0(aqqVar2, str4, (Conversation) obj);
                        }
                    }, new y20() { // from class: l.y27
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            aqqVar2.mo99544d().mo97004b(str4, "syncActionStatus", "true");
                        }
                    }));
                }
            });
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m47726o2(aqq aqqVar, String str, uxj0 uxj0Var) {
        aqqVar.mo99543c().progressDismiss();
        aqqVar.mo99544d().mo97004b(str, m47705U1("0"));
    }

    @lkq(isMkBridge = true, key = "chatAssistantProfileQuestionDlgClose", nameSpace = "tantan_usercenter", uiThread = true)
    public void onChatAssistantProfileDlgClose(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        final boolean zOptBoolean = jSONObject.optBoolean("add", false);
        l51.m152893M(new Runnable() { // from class: l.z57
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20353U1.f98891S.m137019l(Boolean.valueOf(zOptBoolean));
            }
        });
    }

    @lkq(key = "openGroupMemberProfile")
    public void openGroupMemberProfile(@NonNull aqq aqqVar, String str, boolean z) {
        aqqVar.mo99543c().startActivity(jek.m144573e(aqqVar.mo99543c(), str, z ? "chat_group_anonymity" : "chat_group"));
    }

    @lkq(key = "openNativeDialog")
    public void openNativeDialog(@NonNull final aqq aqqVar, final String str) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.v57
            @Override // java.lang.Runnable
            public final void run() {
                brq.m106160b(aqqVar.mo99543c(), str);
            }
        });
    }

    @lkq(key = "openOfflineWebview")
    public void openOfflineWebview(@NonNull aqq aqqVar, String str) {
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("pageId");
        if (TextUtils.isEmpty(queryParameter)) {
            aqqVar.mo99543c().startActivity(WebViewAct.m81347a2(aqqVar.mo99543c(), "", str));
            return;
        }
        String strM173531j = prp0.m173528i().m173531j(aqqVar.mo99543c(), queryParameter);
        int iIndexOf = str.indexOf("?");
        String strSubstring = iIndexOf >= 0 ? str.substring(iIndexOf + 1) : "";
        if (!TextUtils.isEmpty(strSubstring)) {
            strM173531j = strM173531j + "?" + strSubstring;
        }
        Intent intentM81348b2 = WebViewAct.m81348b2(aqqVar.mo99543c(), "", strM173531j, true);
        if (TextUtils.equals(uri.getQueryParameter("hideNavigationBar"), "1")) {
            intentM81348b2.putExtra("hideNavigationBar", true);
        }
        aqqVar.mo99543c().startActivity(intentM81348b2);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m47727p2(aqq aqqVar, String str, Throwable th) {
        aqqVar.mo99543c().progressDismiss();
        aqqVar.mo99544d().mo97004b(str, m47705U1("1"));
        ey6.m123174b(th);
    }

    @lkq(key = FirebaseAnalytics.Event.PURCHASE)
    public void purchase(@NonNull final aqq aqqVar, final String str, final String str2, final String str3) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.p57
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                uwk.m198386e(aqqVar2.mo99543c(), aqqVar2.mo99541a(), str, str2, str3, "");
            }
        });
    }

    @lkq(key = "purchaseWithTracker")
    public void purchaseWithTracker(@NonNull final aqq aqqVar, final String str, final String str2, final String str3, final String str4) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.y67
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                uwk.m198386e(aqqVar2.mo99543c(), aqqVar2.mo99541a(), str, str2, str3, str4);
            }
        });
    }

    @lkq(key = "pushState")
    public boolean pushState(@NonNull aqq aqqVar) {
        return NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m47728q2(String str, final aqq aqqVar, String str2, final String str3) {
        if (uqb0.f180394Z.m95954K(str) || uqb0.f180394Z.m95959P(str)) {
            o1j0.m165649w(R$string.f19726v1);
        } else {
            aqqVar.mo99543c().progress("");
            aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20387g0.m32831N8(str2, str, true)).subscribe(psd0.m173597H(new y20() { // from class: l.i37
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112695a.m47726o2(aqqVar, str3, (uxj0) obj);
                }
            }, new y20() { // from class: l.j37
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118159a.m47727p2(aqqVar, str3, (Throwable) obj);
                }
            }));
        }
    }

    @lkq(key = "queryOrderId")
    public String queryOrderId(@NonNull aqq aqqVar, String str) {
        return CoreModule.f18264c.f20346S0.m35184A3(str);
    }

    @lkq(key = "quitCurrentGroup")
    public void quiteCurrentGroup(@NonNull final aqq aqqVar, final String str, final String str2) {
        aqqVar.mo99543c().duringCreated(psd0.m173625r(CoreModule.f18264c.f20387g0.m32911o6(str), CoreModule.f18264c.f20384f0.m33619Dg(str), new rcj() { // from class: l.i67
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a((ChatGroup) obj, (Conversation) obj2);
            }
        }).flatMap(new qcj() { // from class: l.j67
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return CoreModule.f18264c.f20387g0.m32935w6(str, NullChecker.m82486a(pf60Var.f152157b) ? ((Conversation) pf60Var.f152157b).f56859id : ((ChatGroup) pf60Var.f152156a).localConId);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.k67
            @Override // p153l.y20
            public final void call(Object obj) {
                aqqVar.mo99544d().mo97004b(str2, "0");
            }
        }, new y20() { // from class: l.l67
            @Override // p153l.y20
            public final void call(Object obj) {
                aqqVar.mo99544d().mo97004b(str2, "1");
            }
        }));
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m47729r2(PutongAct putongAct, boolean z, hqq hqqVar, String str, String str2, RxFacertification.C10892b c10892b, kxf kxfVar, VerificationToken verificationToken, String str3, Envelope envelope) {
        fhw.m125605a("[core][LiveVerify]", "patchLiveVerificationResult:" + envelope.toString());
        this.f30759c = false;
        putongAct.progressDismiss();
        if (z) {
            if (uqb0.f180397c0.mo105288I(envelope)) {
                hqqVar.mo97003a(str);
                return;
            } else {
                hqqVar.mo97004b(str2, c10892b.f39690a.f129189b);
                return;
            }
        }
        if (!TextUtils.equals(kxfVar.f129189b, com.tencent.connect.common.Constants.DEFAULT_UIN)) {
            q5l0.m175463H(putongAct, kxfVar, verificationToken, str3);
            return;
        }
        kxf kxfVar2 = c10892b.f39690a;
        if (kxfVar2.f129195h) {
            hqqVar.mo97003a(str);
        } else {
            hqqVar.mo97004b(str2, kxfVar2.f129189b);
        }
    }

    @lkq(key = "refreshBoostStatus")
    public void refreshBoostStatus(@NonNull aqq aqqVar) {
        CoreModule.f18264c.f20318J0.m156781V3();
    }

    @lkq(key = "refreshPrivileges")
    public void refreshPrivileges(@NonNull aqq aqqVar) {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20381e0.m116470H9();
        CoreModule.f18264c.f20381e0.m116527W9(uqb0.f180396b0.f170324a.userId());
    }

    @lkq(key = "refreshUserCounters")
    public void refreshUserCounters(@NonNull aqq aqqVar) {
        CoreModule.f18264c.f20381e0.m116470H9();
        CoreModule.f18264c.f20381e0.m116527W9(uqb0.f180396b0.f170324a.userId());
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m47730s2(PutongAct putongAct, hqq hqqVar, String str, RxFacertification.C10892b c10892b, Throwable th) {
        StringBuilder sb = new StringBuilder("patchLiveVerificationResult error:");
        sb.append(th == null ? "null" : th.getMessage());
        fhw.m125605a("[core][LiveVerify]", sb.toString());
        this.f30759c = false;
        putongAct.progressDismiss();
        hqqVar.mo97004b(str, c10892b.f39690a.f129189b);
        o1j0.m165651y(putongAct.string(R$string.f18406Dr));
    }

    @lkq(key = "saveDescription")
    public void saveDescription(@NonNull final aqq aqqVar, final String str, final String str2) {
        l51.m152887G(new Runnable() { // from class: l.e57
            @Override // java.lang.Runnable
            public final void run() {
                this.f92192a.m47732u2(aqqVar, str2, str);
            }
        });
    }

    @lkq(key = "saveLastConversation")
    public void saveLastConversation(@NonNull aqq aqqVar, String str) {
        CoreModule.f18264c.f20384f0.f20635R0.put(str);
    }

    @lkq(key = "savePayOrderId")
    public void savePayOrderId(@NonNull aqq aqqVar, String str, String str2) {
        CoreModule.f18264c.f20346S0.m35186r3(str, str2);
    }

    @lkq(isMkBridge = true, key = "selectChatMessages", nameSpace = "tantan")
    public void selectChatMessages(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        xc00Var.mo99543c().post(new Runnable() { // from class: l.b77
            @Override // java.lang.Runnable
            public final void run() {
                this.f75256a.m47733v2(jSONObject, xc00Var);
            }
        });
    }

    @lkq(key = "sendTickleMessage")
    public void sendTickleMessage(@NonNull final aqq aqqVar, final String str, final String str2) {
        l51.m152887G(new Runnable() { // from class: l.c67
            @Override // java.lang.Runnable
            public final void run() {
                this.f79942a.m47734w2(aqqVar, str, str2);
            }
        });
    }

    @lkq(key = "setShowThemeCard")
    public void setShowThemeCard(@NonNull aqq aqqVar, String str, String str2) {
        m47700P2(aqqVar, str, null, str2);
    }

    @lkq(isMkBridge = true, key = "shareFriends", nameSpace = "tantan_share")
    public void shareFriends(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("type");
        final int iOptInt = jSONObject.optInt("friendLimit");
        final String strOptString2 = jSONObject.optString("title");
        final String strOptString3 = jSONObject.optString("subtitle");
        final String strOptString4 = jSONObject.optString("btnText");
        final String strOptString5 = jSONObject.optString("limitText");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("messageData");
        final String strOptString6 = jSONObject.optString("source", "");
        final String strOptString7 = jSONObject.optString("callback");
        final String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.h67
            @Override // java.lang.Runnable
            public final void run() {
                xc00 xc00Var2 = xc00Var;
                CoreDlg.m46200Q1(xc00Var2.mo99543c(), strOptString, strOptString2, strOptString3, iOptInt, strOptString4, strOptString5, string, strOptString6, new z20() { // from class: l.f47
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        xc00Var2.mo99544d().mo97004b(str, (String) obj, (String) obj2);
                    }
                });
            }
        });
    }

    @lkq(isMkBridge = true, key = "shareNew", nameSpace = "tantan", uiThread = true)
    public void shareNew(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.b67
            @Override // java.lang.Runnable
            public final void run() {
                this.f75138a.m47737z2(jSONObject, xc00Var);
            }
        });
    }

    @lkq(isMkBridge = true, key = "showLocationAuthguide", nameSpace = "tantan")
    public void showLocationAuthguide(@NonNull final aqq aqqVar, JSONObject jSONObject) {
        l51.m152887G(new Runnable() { // from class: l.p77
            @Override // java.lang.Runnable
            public final void run() {
                xxv.m213581h(aqqVar.mo99543c());
            }
        });
    }

    @lkq(key = "showNativeVerified")
    public void showNativeVerified(@NonNull final aqq aqqVar) {
        aqqVar.mo99543c().post(new Runnable() { // from class: l.l57
            @Override // java.lang.Runnable
            public final void run() {
                jek.m144589u(aqqVar.mo99543c());
            }
        });
    }

    @lkq(key = "showSvipGift")
    public String showSvipGift(@NonNull aqq aqqVar) {
        boolean zM206189a = wgb0.m206189a();
        wgb0.m206192d(0);
        return String.valueOf(zM206189a);
    }

    @lkq(isMkBridge = true, key = "startAliyunLiveVerify", nameSpace = "tantan_live")
    public void startAliyunLiveVerify(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
        final String strOptString2 = jSONObject.optString("idCardNum");
        final String strOptString3 = jSONObject.optString("success");
        final String strOptString4 = jSONObject.optString("fail");
        l51.m152893M(new Runnable() { // from class: l.d57
            @Override // java.lang.Runnable
            public final void run() {
                this.f85131a.m47690F2(xc00Var, strOptString3, strOptString, strOptString2, strOptString4);
            }
        });
    }

    @lkq(key = "startGreetAct")
    public void startGreetAct(@NonNull final aqq aqqVar, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.i77
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                String str2 = str;
                aqqVar2.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m33823Ue(str2)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.z37
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m47595T0(aqqVar2, str2, (Conversation) obj);
                    }
                }, new y20() { // from class: l.a47
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8523d.m47075a(aqqVar2.mo99543c(), new C8523d.a(str2, "from_h5_suggest_user"));
                    }
                }));
            }
        });
    }

    @lkq(key = "startMessagesAct")
    public void startMessagesAct(@NonNull aqq aqqVar, String str) {
        aqqVar.mo99543c().startActivity(MessagesAct.m50127l2(aqqVar.mo99543c(), str, true, false, 22));
    }

    @lkq(key = "switchDisturb")
    public void switchDisturb(@NonNull final aqq aqqVar, String str, boolean z, final String str2) {
        aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20387g0.m32811G8(str, z)).subscribe(psd0.m173597H(new y20() { // from class: l.m77
            @Override // p153l.y20
            public final void call(Object obj) {
                aqqVar.mo99544d().mo97004b(str2, "0");
            }
        }, new y20() { // from class: l.n77
            @Override // p153l.y20
            public final void call(Object obj) {
                aqqVar.mo99544d().mo97004b(str2, "1");
            }
        }));
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m47731t2(bqq bqqVar, String str, int i, List list) {
        bqqVar.mo99543c().progressDismiss();
        m47699O2(bqqVar, list, str, "", null, i);
    }

    @lkq(key = "toConversation")
    public void toConversation(@NonNull final aqq aqqVar, final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            aqqVar.mo99544d().mo97004b(str2, "syncActionStatus", "0");
        } else {
            l51.m152887G(new Runnable() { // from class: l.b57
                @Override // java.lang.Runnable
                public final void run() {
                    aqq aqqVar2 = aqqVar;
                    String str3 = str;
                    String str4 = str2;
                    aqqVar2.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m33823Ue(str3)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.z27
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            CoreBridgeImplementation.m47570L(aqqVar2, str4, str3, (Conversation) obj);
                        }
                    }, new y20() { // from class: l.a37
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            aqqVar2.mo99544d().mo97004b(str4, "syncActionStatus", "0");
                        }
                    }));
                }
            });
        }
    }

    @lkq(key = "triggerEndRemark")
    public void triggerEndRemark(@NonNull aqq aqqVar) {
        CoreModule.f18264c.f20384f0.f20653X0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m47732u2(final aqq aqqVar, final String str, String str2) {
        User userM47707W1;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            if (TextUtils.isEmpty(userM116600p9.description)) {
                aqqVar.mo99544d().mo97004b(str, "shouldSave", "1");
                userM47707W1 = m47707W1(true, str2);
            } else {
                aqqVar.mo99544d().mo97004b(str, "shouldSave", "0");
                userM47707W1 = m47707W1(false, str2);
            }
            if (NullChecker.m82486a(userM47707W1)) {
                aqqVar.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116620u9(userM47707W1)).subscribe(psd0.m173597H(new y20() { // from class: l.d47
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aqqVar.mo99544d().mo97004b(str, "SaveDescription", "1");
                    }
                }, new y20() { // from class: l.e47
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        aqqVar.mo99544d().mo97004b(str, "SaveDescription", "0");
                    }
                }));
            } else {
                aqqVar.mo99544d().mo97004b(str, "SaveDescription", "0");
            }
        }
    }

    @lkq(key = "updateAvatar")
    public void updateAvatar(@NonNull final aqq aqqVar, final String str) {
        l51.m152887G(new Runnable() { // from class: l.a77
            @Override // java.lang.Runnable
            public final void run() {
                this.f68795a.m47691G2(aqqVar, str);
            }
        });
    }

    @lkq(key = "userAccessoryText")
    public void userAccessoryText(@NonNull aqq aqqVar, String str) {
        CoreModule.f18264c.f20384f0.f20644U0.put(str);
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m47733v2(JSONObject jSONObject, xc00 xc00Var) {
        this.f30762f = jSONObject.optString("success");
        String strOptString = jSONObject.optString("user_id");
        String strOptString2 = jSONObject.optString("message_ids");
        int iOptInt = jSONObject.optInt("max_limit");
        this.f30763g = new C8557h(xc00Var);
        xc00Var.mo99543c().registerOnActivityResultListener(this.f30763g);
        xc00Var.mo99543c().startActivityForResult(MessagesAct.m50125i2(xc00Var.mo99543c(), strOptString, true, strOptString2, iOptInt), 1017);
    }

    @lkq(isMkBridge = true, key = "v2GetRecentlyNumMessage", nameSpace = "tantan")
    public void v2GetRecentlyNumMessage(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("conversation_id");
        int iOptInt = jSONObject.optInt("num");
        if (TextUtils.isEmpty(strOptString2)) {
            return;
        }
        xc00Var.mo99543c().duringCreated(C22421c.create(new C22421c.a() { // from class: l.v67
            @Override // p153l.y20
            public final void call(Object obj) {
                ((gcg0) obj).m137019l(uxj0.f181467a);
            }
        }).observeOn(Schedulers.m222739io()).map(new C8556g(strOptString2, iOptInt)).observeOn(fo0.m126432a()).map(new C8555f(xc00Var, strOptString))).subscribe(psd0.m173597H(new y20() { // from class: l.w67
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBridgeImplementation.m47634j((uxj0) obj);
            }
        }, new y20() { // from class: l.x67
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreBridgeImplementation.m47646n((Throwable) obj);
            }
        }));
    }

    @lkq(isMkBridge = true, key = "v2SelectChatMessages", nameSpace = "tantan")
    public void v2SelectChatMessages(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152886F(xc00Var.mo99543c(), new Runnable() { // from class: l.o57
            @Override // java.lang.Runnable
            public final void run() {
                this.f145036a.m47693I2(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m47735x2(String str, bqq bqqVar, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        m47701Q2(bqqVar, str, str2, str3);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m47736y2(String str, bqq bqqVar, String str2, String str3, String str4, Throwable th) {
        ShareHelper.m81144b0(ShareHelper.m81140X(str), th);
        m47701Q2(bqqVar, str2, str3, str4);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m47737z2(JSONObject jSONObject, xc00 xc00Var) {
        m47702R2(xc00Var, jSONObject.optString("url"), jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("imgUrl"), jSONObject.optString("channel"), jSONObject.optString("from"), jSONObject.optString("successHandler"), jSONObject.optString("errorHandler"));
    }

    @lkq(key = "setShowThemeCard")
    public void setShowThemeCard(@NonNull aqq aqqVar, String str, String str2, String str3) {
        m47700P2(aqqVar, str, str3, str2);
    }

    @lkq(key = "shareNew", uiThread = true)
    public void shareNew(@NonNull aqq aqqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        m47702R2(aqqVar, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @lkq(key = "showLocationAuthguide")
    public void showLocationAuthguide(@NonNull final aqq aqqVar) {
        l51.m152887G(new Runnable() { // from class: l.x47
            @Override // java.lang.Runnable
            public final void run() {
                xxv.m213581h(aqqVar.mo99543c());
            }
        });
    }

    @lkq(key = "addRecommendationsWidget")
    public void addRecommendationsWidget(@NonNull aqq aqqVar) {
    }

    @lkq(key = "jumpTantanxDownload")
    public void jumpTantanxDownload(@NonNull aqq aqqVar) {
    }

    @lkq(key = "openBDPrivilege")
    public void openBDPrivilege(@NonNull aqq aqqVar) {
    }

    @lkq(key = "startAliyunLiveVerify")
    public void startAliyunLiveVerify(@NonNull final aqq aqqVar, @NonNull final String str, @NonNull final String str2, @Nullable final String str3, @Nullable final String str4) {
        l51.m152893M(new Runnable() { // from class: l.q57
            @Override // java.lang.Runnable
            public final void run() {
                this.f155669a.m47687C2(aqqVar, str3, str, str2, str4);
            }
        });
    }

    @lkq(key = "isOpenLocationPermission")
    public void isOpenLocationPermission(@NonNull aqq aqqVar, String str) {
        if (xxv.m213590q()) {
            aqqVar.mo99544d().mo97004b(str, "true");
        } else {
            aqqVar.mo99544d().mo97004b(str, "false");
        }
    }

    @lkq(key = "privateMatchSettingsIntroFinished")
    public void privateMatchSettingsIntroFinished(@NonNull aqq aqqVar, boolean z) {
    }

    @lkq(key = "shareFriends")
    public void shareFriends(@NonNull final aqq aqqVar, final String str, final int i, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8) {
        l51.m152886F(aqqVar.mo99543c(), new Runnable() { // from class: l.n37
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                CoreDlg.m46200Q1(aqqVar2.mo99543c(), str, str2, str3, i, str4, str5, str6, str7, new z20() { // from class: l.f87
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        aqqVar2.mo99544d().mo97004b(str, (String) obj, (String) obj2);
                    }
                });
            }
        });
    }

    @lkq(key = "shareFriends")
    public void shareFriends(@NonNull final aqq aqqVar, final String str, final int i, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        l51.m152887G(new Runnable() { // from class: l.u67
            @Override // java.lang.Runnable
            public final void run() {
                aqq aqqVar2 = aqqVar;
                CoreDlg.m46203R1(aqqVar2.mo99543c(), str, str2, str3, i, str4, str5, str6, new z20() { // from class: l.p37
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        aqqVar2.mo99544d().mo97004b(str, (String) obj, (String) obj2);
                    }
                });
            }
        });
    }
}
