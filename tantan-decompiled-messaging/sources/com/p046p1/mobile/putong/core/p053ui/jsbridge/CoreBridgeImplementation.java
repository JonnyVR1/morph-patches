package com.p046p1.mobile.putong.core.p053ui.jsbridge;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.ChatGroupSilence;
import com.p046p1.mobile.putong.core.data.ChatSendMessage;
import com.p046p1.mobile.putong.core.data.Coin;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.FreeTrialData;
import com.p046p1.mobile.putong.core.data.GroupSetting;
import com.p046p1.mobile.putong.core.data.GroupTab;
import com.p046p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.NotificationCounter;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.greet.C8357a;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetAct;
import com.p046p1.mobile.putong.core.p053ui.jsbridge.CoreBridgeImplementation;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.core.p053ui.messages.C8524b;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.JailedGroupChat;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.p046p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.StudentVerRejectedReason;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.facertification.RxFacertification;
import com.p046p1.mobile.putong.facertification.TTFacertificationClient;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
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
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p149l.aqo;
import p149l.ark;
import p149l.boq;
import p149l.bs5;
import p149l.bx6;
import p149l.c4g0;
import p149l.coq;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.ef2;
import p149l.f30;
import p149l.f400;
import p149l.g30;
import p149l.hfw;
import p149l.hoq;
import p149l.hqo;
import p149l.igj;
import p149l.j760;
import p149l.jo0;
import p149l.knb0;
import p149l.kwk0;
import p149l.lip0;
import p149l.liq;
import p149l.lsi0;
import p149l.lsx;
import p149l.mkd0;
import p149l.ml6;
import p149l.mqi0;
import p149l.mu5;
import p149l.n37;
import p149l.o6j0;
import p149l.oa8;
import p149l.pgm;
import p149l.q660;
import p149l.q860;
import p149l.qib0;
import p149l.qlw;
import p149l.rhi;
import p149l.roj0;
import p149l.s8b0;
import p149l.tbk;
import p149l.tvf;
import p149l.ue50;
import p149l.upa;
import p149l.uq40;
import p149l.vvf;
import p149l.vwb;
import p149l.w9j;
import p149l.wvf;
import p149l.wvv;
import p149l.x9j;
import p149l.xaj0;
import p149l.yki0;

/* JADX INFO: loaded from: classes12.dex */
public class CoreBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: d */
    public boolean f29912d;

    /* JADX INFO: renamed from: e */
    public boolean f29913e;

    /* JADX INFO: renamed from: f */
    public String f29914f;

    /* JADX INFO: renamed from: g */
    public C8394h f29915g;

    /* JADX INFO: renamed from: a */
    public final bs5 f29909a = new bs5();

    /* JADX INFO: renamed from: b */
    @Nullable
    public c4g0 f29910b = null;

    /* JADX INFO: renamed from: c */
    public boolean f29911c = false;

    /* JADX INFO: renamed from: h */
    public long[] f29916h = {0, 300};

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$a */
    public class C8387a implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Merchandise f29917a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f29918b;

        public C8387a(Merchandise merchandise, String str) {
            this.f29917a = merchandise;
            this.f29918b = str;
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            CoreModule.f17545c.f19604S0.m34186v3().m132487l(new xaj0<>(1, -1, this.f29918b));
            lsi0.m151578h(R$string.f17682Dp);
        }

        @Override // p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            CoreModule.f17545c.f19604S0.m34186v3().m132487l(new xaj0<>(0, Integer.valueOf(this.f29917a.quantity), this.f29918b));
            lsi0.m151593w(R$string.f18799ol);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$b */
    public class RunnableC8388b implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f29920a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boq f29921b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f29922c;

        public RunnableC8388b(boq boqVar, String str) {
            this.f29921b = boqVar;
            this.f29922c = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m46555a(String str, boq boqVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            o6j0.m162859c("e_invitefriends_share_button_again", "p_invitefriends", new o6j0.C18854a[0]);
            boqVar.mo102962d().mo127284a(str);
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog.C4309e c4309eM20504F = this.f29921b.mo102961c().dialog().m20507G0("再次分享，解锁更多特权").m20504F("分享到多个群可以快速解锁");
            final String str = this.f29922c;
            final boq boqVar = this.f29921b;
            Dialog dialogM20567z = c4309eM20504F.m20560v0("继续分享", new Runnable() { // from class: l.e77
                @Override // java.lang.Runnable
                public final void run() {
                    CoreBridgeImplementation.RunnableC8388b.m46555a(str, boqVar);
                }
            }).m20543m0("稍后再说").m20567z();
            this.f29920a = dialogM20567z;
            dialogM20567z.show();
            o6j0.m162864h("e_invitefriends_share_button_again", "p_invitefriends", new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$c */
    public class C8389c implements TTFacertificationClient.InterfaceC10730a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f29924a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f29925b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ hoq f29926c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f29927d;

        public C8389c(PutongAct putongAct, String str, hoq hoqVar, String str2) {
            this.f29924a = putongAct;
            this.f29925b = str;
            this.f29926c = hoqVar;
            this.f29927d = str2;
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: a */
        public void mo46556a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            StringBuilder sb = new StringBuilder("onPrepareSDKError：");
            sb.append(preDetectException == null ? "null" : preDetectException.getMessage());
            hfw.m130790a("[core][LiveVerify]", sb.toString());
            vvf vvfVar = preDetectException.prepareResult;
            if (!verificationToken.isTencentProvider() || tvf.m190733k(this.f29924a, vvfVar.f183221c, this.f29925b, 2)) {
                return;
            }
            kwk0.m147565P(this.f29924a, vvfVar.f183221c);
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: b */
        public void mo46557b(VerificationToken verificationToken) {
            hfw.m130790a("[core][LiveVerify]", "onGetVerificationTokenSuccess：" + verificationToken.toString());
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: c */
        public void mo46558c(VerificationToken verificationToken, vvf vvfVar) {
            hfw.m130790a("[core][LiveVerify]", "onPrepareSDKSuccess：" + vvfVar.toString());
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: d */
        public void mo46559d(Throwable th) {
            StringBuilder sb = new StringBuilder("onGetVerificationTokenError:");
            sb.append(th == null ? "null" : th.getMessage());
            hfw.m130790a("[core][LiveVerify]", sb.toString());
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: e */
        public void mo46560e(VerificationToken verificationToken) {
            hfw.m130790a("[core][LiveVerify]", "doNotNeedCamera");
            this.f29924a.setResult(-1);
            this.f29924a.m66873d2();
            this.f29926c.mo127284a(this.f29927d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$d */
    public class C8390d implements MediaRecorderFrag.InterfaceC8216a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f29929a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f29930b;

        public C8390d(boq boqVar, String str) {
            this.f29929a = boqVar;
            this.f29930b = str;
        }

        @Override // com.p046p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag.InterfaceC8216a
        /* JADX INFO: renamed from: a */
        public void mo43248a() {
            this.f29929a.mo102962d().mo127285b(this.f29930b, "UpdateAvatarFinish", "1");
        }

        @Override // com.p046p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag.InterfaceC8216a
        public void onCancel() {
            this.f29929a.mo102962d().mo127285b(this.f29930b, "UpdateAvatarFinish", "0");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$e */
    public class C8391e extends qlw {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ StringBuilder f29932e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f29933f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ WebView f29934g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8391e(Act act, PurchaseType purchaseType, StringBuilder sb, String str, WebView webView) {
            super(act, purchaseType);
            this.f29932e = sb;
            this.f29933f = str;
            this.f29934g = webView;
        }

        @Override // p149l.qlw, p149l.ue50
        /* JADX INFO: renamed from: a */
        public void mo30845a() {
            lsi0.m151578h(R$string.f19137zs);
            StringBuilder sb = this.f29932e;
            sb.append("javascript:");
            sb.append(this.f29933f);
            sb.append("('");
            sb.append(User.ID_TEAM_ACCOUNT);
            sb.append("')");
            CoreBridgeImplementation.this.m46523V1(this.f29934g, this.f29932e.toString());
        }

        @Override // p149l.qlw, p149l.ue50
        /* JADX INFO: renamed from: b */
        public void mo46562b() {
            super.mo46562b();
        }

        @Override // p149l.qlw, p149l.ue50
        /* JADX INFO: renamed from: c */
        public void mo30846c() {
            super.mo30846c();
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.f77
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19654j0.m30584G4();
                }
            }, 200L);
            StringBuilder sb = this.f29932e;
            sb.append("javascript:");
            sb.append(this.f29933f);
            sb.append("('");
            sb.append("0");
            sb.append("')");
            CoreBridgeImplementation.this.m46523V1(this.f29934g, this.f29932e.toString());
            CoreModule.f17545c.f19654j0.f19294g0 = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$f */
    public class C8392f implements w9j<List<String>, roj0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f29936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f29937b;

        public C8392f(f400 f400Var, String str) {
            this.f29936a = f400Var;
            this.f29937b = str;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roj0 call(List<String> list) {
            String strSubstring;
            if (vwb.m200296J(list)) {
                strSubstring = WeJson.EMPTY_ARR;
            } else {
                String strQuote = JSONObject.quote(new JSONArray((Collection) list).toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            }
            this.f29936a.mo102962d().mo127285b(this.f29937b, strSubstring);
            return roj0.f160388a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$g */
    public class C8393g implements w9j<roj0, List<String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f29939a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f29940b;

        public C8393g(String str, int i) {
            this.f29939a = str;
            this.f29940b = i;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call(roj0 roj0Var) {
            List<Message> listM206082n0 = CoreModule.f17553k.f91940c.m206082n0(this.f29939a, this.f29940b);
            ArrayList arrayList = new ArrayList();
            if (!vwb.m200296J(listM206082n0)) {
                Iterator<Message> it = listM206082n0.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f56011id);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$h */
    public class C8394h implements C4317a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final coq f29942a;

        public C8394h(coq coqVar) {
            this.f29942a = coqVar;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i2 == -1) {
                if (i == 1017) {
                    CoreBridgeImplementation coreBridgeImplementation = CoreBridgeImplementation.this;
                    coreBridgeImplementation.m46514M2(this.f29942a, intent, coreBridgeImplementation.f29914f);
                } else {
                    CoreBridgeImplementation coreBridgeImplementation2 = CoreBridgeImplementation.this;
                    if (i == 1015) {
                        coreBridgeImplementation2.m46513L2(this.f29942a, intent, coreBridgeImplementation2.f29914f, i);
                    } else {
                        coreBridgeImplementation2.m46512K2(this.f29942a, intent, coreBridgeImplementation2.f29914f, i);
                    }
                }
            }
            CoreBridgeImplementation.this.m46520S2(this.f29942a);
            return false;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ void m46356A1(coq coqVar, Throwable th) {
        coqVar.mo102961c().progressDismiss();
        lsi0.m151565C(com.p046p1.mobile.putong.common.R$string.f17321F);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22306c m46357B(OMSThemeInfo oMSThemeInfo) {
        if (NullChecker.m81303a(oMSThemeInfo)) {
            return CoreModule.f17545c.f19663m0.m31023M5();
        }
        lsi0.m151580j("网络不给力，稍后再试吧");
        return null;
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m46365D1(final boq boqVar) {
        if (tbk.m187861h(boqVar.mo102961c())) {
            boqVar.mo102961c().progress("", true);
            boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19645g0.m31826N6()).subscribe(mkd0.m154956H(new e30() { // from class: l.p67
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBridgeImplementation.m46461m0(boqVar, (List) obj);
                }
            }, new e30() { // from class: l.q67
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBridgeImplementation.m46370F0(boqVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m46370F0(boq boqVar, Throwable th) {
        boqVar.mo102961c().progressDismiss();
        bx6.m104283b(th);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m46372G(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m46376H0(boq boqVar, String str, Throwable th) {
        CoreModule.f17545c.f19642f0.f19908W0.put(Boolean.TRUE);
        boqVar.mo102962d().mo127285b(str, "FillInfoFinish", "0");
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ String m46384K(List list, roj0 roj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m46387L(boq boqVar, String str, String str2, Conversation conversation) {
        if (!NullChecker.m81303a(conversation)) {
            boqVar.mo102962d().mo127285b(str, "syncActionStatus", "0");
        } else {
            boqVar.mo102962d().mo127285b(str, "syncActionStatus", "1");
            boqVar.mo102961c().startActivity(MessagesAct.m48944k2(boqVar.mo102961c(), str2, true, false, -1));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ int m46388L0(Map map, ChatGroup chatGroup, ChatGroup chatGroup2) {
        Conversation conversation = (Conversation) map.get(chatGroup.f56011id);
        Conversation conversation2 = (Conversation) map.get(chatGroup2.f56011id);
        return (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation2)) ? Double.compare(conversation2.latestTime, conversation.latestTime) : Double.compare(chatGroup2.createdTime, chatGroup.createdTime);
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ void m46389L1(boq boqVar) {
        boqVar.mo102961c().startActivity(NewMainAct.m39685I5(boqVar.mo102961c(), NavigationIntent.get("profile")));
        q660.m173125a(boqVar.mo102961c(), CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m46394N0(f400 f400Var, String str, q860 q860Var) {
        if (!NullChecker.m81303a(q860Var)) {
            f400Var.mo102962d().mo127285b(str, "0");
        } else {
            f400Var.mo102962d().mo127285b(str, vwb.m200296J(q860Var.f153135a) ? "0" : "1");
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m46399P(boq boqVar, String str) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            boqVar.mo102962d().mo127285b(str, "nums", String.valueOf(userM169527p9.pictures.size()));
        } else {
            boqVar.mo102962d().mo127285b(str, "nums", String.valueOf(0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ String m46403Q0(xaj0 xaj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chatGroup", new JSONObject(((ChatGroup) xaj0Var.f191751a).toJson()));
            jSONObject2.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize((List) xaj0Var.f191752b)));
            if (NullChecker.m81303a(xaj0Var.f191753c)) {
                jSONObject2.put("muted", ((Conversation) xaj0Var.f191753c).muted);
            }
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m46412T0(boq boqVar, String str, Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            boqVar.mo102961c().startActivity(MessagesAct.m48944k2(boqVar.mo102961c(), str, true, false, -1));
        } else {
            C8360d.m45892a(boqVar.mo102961c(), new C8360d.a(str, "from_h5_suggest_user"));
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m46418W(boq boqVar) {
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        if (counterM31484o3 == null || counterM31484o3.likersLimit.remaining <= 0) {
            CoreModule.m29935P().m94651a().mo33534l1(boqVar.mo102961c(), "p_special_card,deeplink,click");
        } else {
            boqVar.mo102961c().startActivity(new Intent(boqVar.mo102961c(), (Class<?>) LikersAct.class));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m46419W0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var.mo102961c() instanceof MkWebViewAct) {
            MkWebViewAct mkWebViewAct = (MkWebViewAct) f400Var.mo102961c();
            ResultReceiver resultReceiverM80242k2 = mkWebViewAct.m80242k2();
            if (NullChecker.m81303a(resultReceiverM80242k2)) {
                Bundle bundle = new Bundle();
                bundle.putString(Reason.TYPE, jSONObject.optString(Reason.TYPE));
                resultReceiverM80242k2.send(-1, bundle);
            } else {
                mkWebViewAct.setResult(-1);
            }
            mkWebViewAct.m66873d2();
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m46422Y(boq boqVar, String str) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (!userM169527p9.isBanned()) {
                boqVar.mo102962d().mo127285b(str, "0");
            } else {
                boqVar.mo102962d().mo127285b(str, "1");
                lsi0.m151593w(R$string.f17628C1);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m46431c0(Throwable th) {
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m46435d1(final boq boqVar, final String str, PurchaseType purchaseType, Act act, String str2) {
        if (CoreModule.m29932K().mo30835xf()) {
            act.duringCreated(CoreModule.f17545c.f19573I0.m140259M3()).subscribe(mkd0.m154955G(new e30() { // from class: l.e37
                @Override // p149l.e30
                public final void call(Object obj) {
                    boqVar.mo102962d().mo127285b(str, String.valueOf(((IntlCurrencyDiamond) obj).available));
                }
            }));
        } else {
            act.duringCreated(CoreModule.f17545c.f19570H0.m210349a5()).subscribe(mkd0.m154955G(new e30() { // from class: l.g37
                @Override // p149l.e30
                public final void call(Object obj) {
                    boqVar.mo102962d().mo127285b(str, String.valueOf(((Coin) obj).available));
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m46437e0(boq boqVar, String str, Conversation conversation) {
        if (NullChecker.m81303a(conversation)) {
            boqVar.mo102962d().mo127285b(str, "syncActionStatus", "false");
        } else {
            boqVar.mo102962d().mo127285b(str, "syncActionStatus", "true");
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m46439f(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0086 A[EDGE_INSN: B:16:0x0086->B:17:0x0087 BREAK  A[LOOP:0: B:9:0x0040->B:26:0x0040]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m46440f0(JSONObject jSONObject, final f400 f400Var) {
        knb0 knb0Var;
        final String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("user_id");
        if (!Act.globalLifeCycle_().isEmpty() && !Act.globalLifeCycle_().values().isEmpty()) {
            ArrayList<Act.C4299r> next = Act.globalLifeCycle_().values().iterator().next();
            if (!vwb.m200296J(next)) {
                Iterator<Act.C4299r> it = next.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        knb0Var = null;
                        break;
                    }
                    Activity activity = it.next().f15343a.get();
                    if (NullChecker.m81303a(activity) && (activity instanceof GreetAct)) {
                        C8357a c8357aM45584d2 = ((GreetAct) activity).m45584d2();
                        knb0Var = new knb0(c8357aM45584d2.m45860R0(), Double.valueOf(c8357aM45584d2.m45859Q0()), Long.valueOf(c8357aM45584d2.m45858P0()), Boolean.valueOf(c8357aM45584d2.m45865Y0()));
                        break;
                    }
                }
            } else {
                knb0Var = null;
                break;
            }
        } else {
            knb0Var = null;
            break;
        }
        if (NullChecker.m81303a(knb0Var)) {
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19678r0.m34158z5((String) knb0Var.f123873a, ((Double) knb0Var.f123874b).doubleValue(), ((Long) knb0Var.f123875c).longValue(), ((Boolean) knb0Var.f123876d).booleanValue())).subscribe(mkd0.m154956H(new e30() { // from class: l.m27
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBridgeImplementation.m46394N0(f400Var, strOptString, (q860) obj);
                }
            }, new e30() { // from class: l.n27
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400Var.mo102962d().mo127285b(strOptString, "0");
                }
            }));
        } else {
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m32667Hg(strOptString2)).subscribe(mkd0.m154956H(new e30() { // from class: l.o27
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400Var.mo102962d().mo127285b(strOptString, ((Boolean) obj).booleanValue() ? "1" : "0");
                }
            }, new e30() { // from class: l.p27
                @Override // p149l.e30
                public final void call(Object obj) {
                    f400Var.mo102962d().mo127285b(strOptString, "0");
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m46446h0(boq boqVar, String str, Envelope envelope) {
        CoreModule.f17545c.f19642f0.f19908W0.put(Boolean.FALSE);
        boqVar.mo102962d().mo127285b(str, "FillInfoFinish", "1");
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m46449i0(Throwable th) {
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m46450i1(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m46451j(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ String m46455k0(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m46456k1(coq coqVar, Throwable th) {
        coqVar.mo102961c().progressDismiss();
        lsi0.m151565C(com.p046p1.mobile.putong.common.R$string.f17321F);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m46459l1(boq boqVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("avatar_url", CoreModule.f17545c.f19642f0.f19896S0.get());
            jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, CoreModule.f17545c.f19642f0.f19899T0.get());
            if (!vwb.m200296J(upa.m194734c1())) {
                JsonArray jsonArray = new JsonArray();
                Iterator<String> it = upa.m194734c1().iterator();
                while (it.hasNext()) {
                    jsonArray.add(it.next());
                }
                jSONObject.put("self_intro_tags_1", jsonArray);
            }
            if (!vwb.m200296J(upa.m194739d1())) {
                JsonArray jsonArray2 = new JsonArray();
                Iterator<String> it2 = upa.m194739d1().iterator();
                while (it2.hasNext()) {
                    jsonArray2.add(it2.next());
                }
                jSONObject.put("self_intro_tags_2", jsonArray2);
            }
            if (!vwb.m200296J(upa.m194689R0())) {
                JsonArray jsonArray3 = new JsonArray();
                Iterator<String> it3 = upa.m194689R0().iterator();
                while (it3.hasNext()) {
                    jsonArray3.add(it3.next());
                }
                jSONObject.put("other_tags", jsonArray3);
            }
            if (!TextUtils.isEmpty(CoreModule.f17545c.f19642f0.f19932e1.get())) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Oauth2AccessToken.KEY_UID, CoreModule.f17545c.f19642f0.f19932e1.get());
                jSONObject2.put(AuthenticationTokenClaims.JSON_KEY_NAME, CoreModule.f17545c.f19642f0.f19920a1.get());
                jSONObject2.put("avatar", CoreModule.f17545c.f19642f0.f19923b1.get());
                jSONObject2.put(SeeTextDynamicParam.age, CoreModule.f17545c.f19642f0.f19926c1.get());
                jSONObject2.put("hideAge", CoreModule.f17545c.f19642f0.f19929d1.get());
                jSONObject.put("userInfo", jSONObject2);
            }
            String strQuote = JSONObject.quote(jSONObject.toString());
            boqVar.mo102962d().mo127285b(str, "syncActionStatus", strQuote.substring(1, strQuote.length() - 1));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m46461m0(boq boqVar, List list) {
        boqVar.mo102961c().progressDismiss();
        if (GroupCreateCategoryAct.m36539a2(list)) {
            boqVar.mo102961c().startActivity(GroupCreateTypeAct.m36548Z1(boqVar.mo102961c(), list));
        } else {
            lsi0.m151593w(R$string.f17748G1);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m46463n(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m46466o(OpenSdkCodeAuth openSdkCodeAuth) {
        JSONObject jSONObject = new JSONObject();
        if (!NullChecker.m81303a(openSdkCodeAuth) || TextUtils.isEmpty(openSdkCodeAuth.code)) {
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
    public static /* synthetic */ void m46476r0(Throwable th) {
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m46477r1(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m46485u0(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m46487v(GroupSetting groupSetting) {
        String strQuote = JSONObject.quote(groupSetting.toJson());
        return strQuote.substring(1, strQuote.length() - 1);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m46490w(NotificationCounter notificationCounter) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("notificationCounters", new JSONArray(NotificationCounter.JSON_ADAPTER.ARRAY_ADAPTER().serialize(vwb.m200324f0(notificationCounter))));
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m46491w0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m46493x(final Map map, boq boqVar, String str, j760 j760Var) {
        map.clear();
        if (vwb.m200296J((Collection) j760Var.f116565b)) {
            boqVar.mo102962d().mo127285b(str, WeJson.EMPTY_ARR);
            return;
        }
        if (!vwb.m200296J((Collection) j760Var.f116564a)) {
            for (Conversation conversation : (List) j760Var.f116564a) {
                if (TEnum.equals(conversation.status, "default")) {
                    map.put(conversation.otherUser, conversation);
                }
            }
        }
        ArrayList arrayListM200339n = vwb.m200339n(new ArrayList((Collection) j760Var.f116565b), new w9j() { // from class: l.q27
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(map.containsKey(((ChatGroup) obj).f56011id));
            }
        });
        Collections.sort(arrayListM200339n, new Comparator() { // from class: l.r27
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CoreBridgeImplementation.m46388L0(map, (ChatGroup) obj, (ChatGroup) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = arrayListM200339n.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(((ChatGroup) it.next()).toJson()));
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONArray.toString());
            boqVar.mo102962d().mo127285b(str, strQuote.substring(1, strQuote.length() - 1));
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ String m46494x0(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("groupTabs", new JSONArray(GroupTab.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
            jSONObject.put("data", jSONObject2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m46502A2(boq boqVar, String str, String str2, String str3, RxFacertification.C10729b c10729b) {
        m46511J2(boqVar.mo102961c(), boqVar.mo102962d(), str, str2, str3, c10729b.f38844c, "liveVerify", c10729b);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m46503B2(boq boqVar, String str, Throwable th) {
        this.f29911c = false;
        boqVar.mo102961c().progressDismiss();
        boqVar.mo102962d().mo127285b(str, th instanceof TantanException.Client.CoreService ? String.valueOf(((TantanException.Client.CoreService) th).code) : "");
        hfw.m130790a("[core][LiveVerify]", "TTFacertificationClient.getInstance().startDetect error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m46504C2(final boq boqVar, final String str, final String str2, final String str3, final String str4) {
        if (this.f29911c) {
            return;
        }
        this.f29911c = true;
        mkd0.m154992z(this.f29910b);
        boqVar.mo102961c().progress(R$string.f17842J5);
        final String strUserId = qib0.f154714c0.userId();
        final TTFacertificationClient.InterfaceC10730a interfaceC10730aM46526Y1 = m46526Y1(boqVar.mo102961c(), boqVar.mo102962d(), str, "liveVerify", boqVar.mo102961c().string(R$string.f18532g0));
        c4g0 c4g0VarSubscribe = boqVar.mo102961c().duringCreated(SharedLibraryLoader.m81454k().m81464r("facertification")).take(1).flatMap(new w9j() { // from class: l.t67
            @Override // p149l.w9j
            public final Object call(Object obj) {
                boq boqVar2 = boqVar;
                String str5 = strUserId;
                String str6 = str2;
                return TTFacertificationClient.m60201p().m60205A(boqVar2.mo102961c(), str5, VerificationTokenRequestParam.builder().setIdName(str6).setIdNumber(str3).useNewLiveTemplate(uvf.m196075c(boqVar2.mo102961c(), true), false, "aliyun", "3").build(), new rp8(), interfaceC10730aM46526Y1, "liveVerify");
            }
        }).subscribe(mkd0.m154959K(new e30() { // from class: l.u67
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174809a.m46502A2(boqVar, str, str4, strUserId, (RxFacertification.C10729b) obj);
            }
        }, new e30() { // from class: l.v67
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180161a.m46503B2(boqVar, str4, (Throwable) obj);
            }
        }, false));
        this.f29910b = c4g0VarSubscribe;
        this.f29909a.m103655a(c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m46505D2(f400 f400Var, String str, String str2, String str3, RxFacertification.C10729b c10729b) {
        m46511J2(f400Var.mo102961c(), f400Var.mo102962d(), str, str2, str3, c10729b.f38844c, "liveVerify", c10729b);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m46506E2(f400 f400Var, String str, Throwable th) {
        this.f29911c = false;
        f400Var.mo102961c().progressDismiss();
        f400Var.mo102962d().mo127285b(str, th instanceof TantanException.Client.CoreService ? String.valueOf(((TantanException.Client.CoreService) th).code) : "");
        hfw.m130790a("[core][LiveVerify]", "TTFacertificationClient.getInstance().startDetect error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m46507F2(final f400 f400Var, final String str, final String str2, final String str3, final String str4) {
        if (this.f29911c) {
            return;
        }
        this.f29911c = true;
        mkd0.m154992z(this.f29910b);
        f400Var.mo102961c().progress(R$string.f17842J5);
        final String strUserId = qib0.f154714c0.userId();
        final TTFacertificationClient.InterfaceC10730a interfaceC10730aM46526Y1 = m46526Y1(f400Var.mo102961c(), f400Var.mo102962d(), str, "liveVerify", f400Var.mo102961c().string(R$string.f18532g0));
        c4g0 c4g0VarSubscribe = f400Var.mo102961c().duringCreated(SharedLibraryLoader.m81454k().m81464r("facertification")).take(1).flatMap(new w9j() { // from class: l.g27
            @Override // p149l.w9j
            public final Object call(Object obj) {
                f400 f400Var2 = f400Var;
                String str5 = strUserId;
                String str6 = str2;
                return TTFacertificationClient.m60201p().m60205A(f400Var2.mo102961c(), str5, VerificationTokenRequestParam.builder().setIdName(str6).setIdNumber(str3).useNewLiveTemplate(uvf.m196075c(f400Var2.mo102961c(), true), false, "aliyun", "3").build(), new rp8(), interfaceC10730aM46526Y1, "liveVerify");
            }
        }).subscribe(mkd0.m154959K(new e30() { // from class: l.h27
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105493a.m46505D2(f400Var, str, str4, strUserId, (RxFacertification.C10729b) obj);
            }
        }, new e30() { // from class: l.i27
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110538a.m46506E2(f400Var, str4, (Throwable) obj);
            }
        }, false));
        this.f29910b = c4g0VarSubscribe;
        this.f29909a.m103655a(c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m46508G2(boq boqVar, String str) {
        MediaRecorderFrag mediaRecorderFrag = new MediaRecorderFrag();
        mediaRecorderFrag.m43245m4(new C8390d(boqVar, str));
        if (NullChecker.m81303a(boqVar.mo102961c())) {
            PutongAct putongActMo102961c = boqVar.mo102961c();
            if (putongActMo102961c.isFinishing() || putongActMo102961c.isDestroyed()) {
                return;
            }
            mediaRecorderFrag.show(boqVar.mo102961c().getSupportFragmentManager(), "update_avatar");
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m46509H2(coq coqVar, String str, Picture picture, int i, Picture picture2) {
        coqVar.mo102961c().progressDismiss();
        m46516O2(coqVar, vwb.m200324f0(picture2), str, "file://" + rhi.m179382z(picture.url), null, i);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m46510I2(JSONObject jSONObject, f400 f400Var) {
        this.f29914f = jSONObject.optString("success");
        String strOptString = jSONObject.optString("conversation_id");
        String strOptString2 = jSONObject.optString("message_ids");
        int iOptInt = jSONObject.optInt("max_limit", 100);
        this.f29915g = new C8394h(f400Var);
        f400Var.mo102961c().registerOnActivityResultListener(this.f29915g);
        f400Var.mo102961c().startActivityForResult(MessagesAct.m48942h2(f400Var.mo102961c(), strOptString, true, strOptString2, iOptInt), 1017);
    }

    /* JADX INFO: renamed from: J2 */
    public final void m46511J2(final PutongAct putongAct, @NonNull final hoq hoqVar, @Nullable final String str, @Nullable final String str2, String str3, VerificationTokenRequestParam verificationTokenRequestParam, final String str4, final RxFacertification.C10729b c10729b) {
        final wvf wvfVar = c10729b.f38842a;
        hfw.m130790a("[core][LiveVerify]", "startDetect finish:" + wvfVar.toString());
        final VerificationToken verificationToken = c10729b.f38843b;
        if (!verificationToken.isTencentProvider() || wvfVar.f188243h) {
            final boolean zEquals = TextUtils.equals(wvfVar.f188237b, "2006");
            putongAct.duringCreated(zEquals ? TTFacertificationClient.m60199n(str3) : TTFacertificationClient.m60203v(str3, verificationTokenRequestParam.identity.provider, verificationToken.certifyId)).subscribe(mkd0.m154956H(new e30() { // from class: l.c37
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f78439a.m46546r2(putongAct, zEquals, hoqVar, str, str2, c10729b, wvfVar, verificationToken, str4, (Envelope) obj);
                }
            }, new e30() { // from class: l.d37
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f83468a.m46547s2(putongAct, hoqVar, str2, c10729b, (Throwable) obj);
                }
            }));
        } else {
            this.f29911c = false;
            putongAct.progressDismiss();
            tvf.m190735m(wvfVar, verificationToken, putongAct, str4, 2);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m46512K2(@NonNull final coq coqVar, Intent intent, final String str, final int i) {
        final List list = (List) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
        if (vwb.m200296J(list)) {
            m46516O2(coqVar, null, str, "", "cancel", i);
        } else {
            coqVar.mo102961c().progress(com.p046p1.mobile.putong.common.R$string.f17389W);
            new lsx(list, false).flatMap(new w9j() { // from class: l.k37
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return qib0.f154714c0.mo97520l3(list);
                }
            }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.l37
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125846a.m46548t2(coqVar, str, i, (List) obj);
                }
            }, new e30() { // from class: l.m37
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBridgeImplementation.m46356A1(coqVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L2 */
    public final void m46513L2(@NonNull coq coqVar, Intent intent, String str, int i) {
        List list = (List) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
        if (vwb.m200296J(list)) {
            m46516O2(coqVar, null, str, "", "cancel", i);
            return;
        }
        Media media = (Media) list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            pgm pgmVar = new pgm(rhi.m179382z(picture.url));
            picture.mediaType = pgmVar.f148729c;
            picture.size = new Dimension(pgmVar.f148730d);
            m46521T2(coqVar, picture, str, i);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m46514M2(coq coqVar, Intent intent, String str) {
        String strSubstring;
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("message_picked");
        if (vwb.m200296J(stringArrayListExtra)) {
            strSubstring = WeJson.EMPTY_ARR;
        } else {
            String strQuote = JSONObject.quote(new JSONArray((Collection) stringArrayListExtra).toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        }
        coqVar.mo102962d().mo127285b(str, strSubstring);
    }

    /* JADX INFO: renamed from: N2, reason: merged with bridge method [inline-methods] */
    public final void m46551w2(@NonNull boq boqVar, String str, String str2) {
        Conversation conversationM32856Xe;
        if (User.isTeamAccount(str) || (conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str)) == null || TEnum.equals(conversationM32856Xe.status, "dismissed")) {
            return;
        }
        if (upa.m194706V1() && ml6.m155116a(conversationM32856Xe)) {
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(conversationM32856Xe.otherUser);
            if (NullChecker.m81303a(chatGroupM31920s6) && NullChecker.m81303a(chatGroupM31920s6.punishment) && NullChecker.m81303a(chatGroupM31920s6.punishment.sendMessage)) {
                ChatSendMessage chatSendMessage = chatGroupM31920s6.punishment.sendMessage;
                if (chatSendMessage.active && mqi0.m155944o() < chatSendMessage.until) {
                    return;
                }
            }
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9.state) && NullChecker.m81303a(userM169527p9.state.jailedBusiness) && NullChecker.m81303a(userM169527p9.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = userM169527p9.state.jailedBusiness.groupChat;
                if (jailedGroupChat.active && jailedGroupChat.expireTime > mqi0.m155944o()) {
                    return;
                }
            }
            ChatGroupMember chatGroupMemberM31855W8 = CoreModule.f17545c.f19645g0.m31855W8(conversationM32856Xe.otherUser, CoreModule.m29931H().userId());
            if (NullChecker.m81303a(chatGroupMemberM31855W8) && NullChecker.m81303a(chatGroupMemberM31855W8.silence)) {
                ChatGroupSilence chatGroupSilence = chatGroupMemberM31855W8.silence;
                if (chatGroupSilence.enable && mqi0.m155944o() < chatGroupSilence.until) {
                    return;
                }
            }
        }
        if (!ml6.m155116a(conversationM32856Xe)) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
            if (NullChecker.m81303a(userM169430Pa) && userM169430Pa.unilateralBlock()) {
                return;
            }
        }
        Vibrator vibrator = (Vibrator) boqVar.mo102961c().getSystemService("vibrator");
        if (NullChecker.m81303a(vibrator)) {
            int i = Build.VERSION.SDK_INT;
            long[] jArr = this.f29916h;
            if (i >= 26) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, -1));
            } else {
                vibrator.vibrate(jArr, -1);
            }
        }
        if (C8524b.m49054f(str2)) {
            CoreModule.f17545c.f19631b1.m145040j3();
            CoreModule.f17545c.f19642f0.m32599Bp(str, CoreModule.m29931H().userId(), str2);
        }
    }

    /* JADX INFO: renamed from: O2 */
    public final void m46516O2(@NonNull coq coqVar, List<Picture> list, String str, String str2, String str3, int i) {
        String strSubstring;
        try {
            if (vwb.m200296J(list)) {
                strSubstring = WeJson.EMPTY_ARR;
            } else {
                String strQuote = JSONObject.quote(new JSONArray(Converter.RAW_PICTURE_TO_PICTURE.ARRAY_ADAPTER().serialize(list)).toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            }
            if (i == 1015) {
                coqVar.mo102962d().mo127285b(str, str2, strSubstring, str3);
            } else {
                coqVar.mo102962d().mo127285b(str, strSubstring, str3);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m46517P2(@NonNull final boq boqVar, String str, String str2, final String str3) {
        if (!NullChecker.m81303a(str) || str.isEmpty()) {
            return;
        }
        OMSThemeInfo oMSThemeInfoM215130a = yki0.m215127b().m215130a();
        if (NullChecker.m81303a(oMSThemeInfoM215130a) || !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = oMSThemeInfoM215130a.f38796id;
            }
            boqVar.mo102961c().duringCreated((C22306c) CoreModule.f17545c.f19702z0.m129990d3(str2, true, str), false).flatMap(new w9j() { // from class: l.f37
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreBridgeImplementation.m46357B((OMSThemeInfo) obj);
                }
            }).filter(new n37()).subscribe(mkd0.m154956H(new e30() { // from class: l.o37
                @Override // p149l.e30
                public final void call(Object obj) {
                    boqVar.mo102962d().mo127284a(str3);
                }
            }, new e30() { // from class: l.p37
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBridgeImplementation.m46431c0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m46518Q2(coq coqVar, String str, String... strArr) {
        if (coqVar instanceof f400) {
            ((f400) coqVar).m119269f(str, strArr);
        } else {
            coqVar.mo102962d().mo127285b(str, strArr);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public final void m46519R2(final coq coqVar, String str, String str2, String str3, String str4, final String str5, final String str6, String str7, String str8) {
        Link link = new Link();
        link.href = str;
        ArrayList<LinkChannel> arrayListM79957X = ShareHelper.m79957X(str5);
        List<String> listM79952S = ShareHelper.m79952S(coqVar.mo102961c(), arrayListM79957X);
        if (TextUtils.isEmpty(str7)) {
            str7 = "adtp";
        }
        if (vwb.m200296J(listM79952S)) {
            lsi0.m151595y("未安装");
            m46518Q2(coqVar, str7, "", "error");
        } else {
            final String str9 = str7;
            ark.m98465b1(coqVar.mo102961c(), str8, link, str2, str3, str4, arrayListM79957X, new f30() { // from class: l.m57
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f131369a.m46552x2(str6, coqVar, (String) obj, (String) obj2);
                }
            }, new g30() { // from class: l.n57
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f137188a.m46553y2(str5, coqVar, str9, (String) obj, (String) obj2, (Throwable) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S2 */
    public final void m46520S2(coq coqVar) {
        if (this.f29915g != null) {
            coqVar.mo102961c().unregisterOnActivityResultListener(this.f29915g);
        }
        this.f29915g = null;
    }

    /* JADX INFO: renamed from: T2 */
    public final void m46521T2(@NonNull final coq coqVar, final Picture picture, final String str, final int i) {
        coqVar.mo102961c().progress(com.p046p1.mobile.putong.common.R$string.f17389W);
        new lsx(vwb.m200324f0(picture), false).flatMap(new w9j() { // from class: l.h37
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154714c0.mo97509Y1(picture);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.i37
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110617a.m46509H2(coqVar, str, picture, i, (Picture) obj);
            }
        }, new e30() { // from class: l.j37
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBridgeImplementation.m46456k1(coqVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public final String m46522U1(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final void m46523V1(final WebView webView, final String str) {
        if (NullChecker.m81303a(webView)) {
            e51.m114748M(new Runnable() { // from class: l.v57
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final User m46524W1(boolean z, String str) {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        if (z) {
            userMo223809clone.description = str;
        }
        userMo223809clone.profile.extensions.profileCompletion.briefIntroduction = vwb.m200317c(Collections.EMPTY_LIST, str);
        return userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169527p9());
    }

    /* JADX INFO: renamed from: X1 */
    public final User m46525X1() {
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        userMo223809clone.profile.extensions.profileCompletion.progress = vwb.m200317c(Collections.EMPTY_LIST, "finished");
        return userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169527p9());
    }

    @NonNull
    /* JADX INFO: renamed from: Y1 */
    public final TTFacertificationClient.InterfaceC10730a m46526Y1(PutongAct putongAct, @NonNull hoq hoqVar, @Nullable String str, String str2, String str3) {
        return new C8389c(putongAct, str2, hoqVar, str);
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m46527Z1(@NonNull coq coqVar, String str) {
        if (TextUtils.equals(mu5.m156378c(), "tantanapp")) {
            coqVar.mo102962d().mo127285b(str, "1");
        } else {
            coqVar.mo102962d().mo127285b(str, "0");
        }
    }

    @Override // p149l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo46528a() {
        super.mo46528a();
        this.f29909a.m103657c();
        this.f29911c = false;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m46529a2(boq boqVar, String str) {
        PurchaseType purchaseType;
        PutongAct putongActMo102961c = boqVar.mo102961c();
        WebViewX webViewXMo102959a = boqVar.mo102959a();
        if (!NullChecker.m81303a(putongActMo102961c) || !NullChecker.m81303a(webViewXMo102959a)) {
            lsi0.m151578h(R$string.f19137zs);
            return;
        }
        FreeTrialData freeTrialDataM30576C4 = CoreModule.f17545c.f19654j0.m30576C4();
        if (CoreModule.f17545c.f19654j0.m30574B4()) {
            purchaseType = PurchaseType.TYPE_GET_VIP;
        } else if (CoreModule.f17545c.f19654j0.m30572A4()) {
            purchaseType = PurchaseType.TYPE_GET_LIKERS;
        } else {
            purchaseType = CoreModule.f17545c.f19654j0.m30643y4() ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : null;
        }
        PurchaseType purchaseType2 = purchaseType;
        StringBuilder sb = new StringBuilder();
        if (purchaseType2 != null) {
            hqo hqoVar = new hqo(putongActMo102961c, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            hqoVar.m132479t(new C8391e(putongActMo102961c, purchaseType2, sb, str, webViewXMo102959a));
            hqoVar.m132475p(aqo.m98316h(putongActMo102961c, putongActMo102961c.iap().m148933i()), true, freeTrialDataM30576C4.skuId);
        } else {
            lsi0.m151593w(R$string.f18268Xb);
            sb.append("javascript:");
            sb.append(str);
            sb.append("('-1')");
            m46523V1(webViewXMo102959a, sb.toString());
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m46530b2(String str) {
        if (this.f29913e) {
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(str);
            if (!NullChecker.m81303a(chatGroupM31920s6) || TextUtils.isEmpty(chatGroupM31920s6.localConId)) {
                return;
            }
            CoreModule.f17545c.f19642f0.m33210zj(chatGroupM31920s6.localConId);
        }
    }

    @liq(key = "buyFreeTrial")
    public void buyFreeTrial(final boq boqVar, final String str) {
        e51.m114748M(new Runnable() { // from class: l.k57
            @Override // java.lang.Runnable
            public final void run() {
                this.f121148a.m46529a2(boqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m46531c2(boq boqVar, String str, String str2) {
        this.f29913e = true;
        boqVar.mo102962d().mo127285b(str, str2);
    }

    @liq(isMkBridge = true, key = "checkHasChatMessage", nameSpace = "tantan")
    public void checkHasChatMessage(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        f400Var.mo102961c().post(new Runnable() { // from class: l.p57
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m46440f0(jSONObject, f400Var);
            }
        });
    }

    @liq(isMkBridge = true, key = "commitSuccess", nameSpace = "tantan")
    public void commitSuccess(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        f400Var.mo102961c().post(new Runnable() { // from class: l.k67
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m46419W0(f400Var, jSONObject);
            }
        });
    }

    @liq(key = "createGroupToH5")
    public void createGroupToH5(@NonNull final boq boqVar) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.j57
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m46365D1(boqVar);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m46532d2(final boq boqVar, final String str, String[] strArr, final String str2) {
        if (!this.f29912d) {
            boqVar.mo102961c().creates(new e30() { // from class: l.c77
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBridgeImplementation.m46491w0((Bundle) obj);
                }
            }, new d30() { // from class: l.o17
                @Override // p149l.d30
                public final void call() {
                    this.f141408a.m46530b2(str);
                }
            });
            this.f29912d = true;
        }
        List<String> listAsList = Arrays.asList(strArr);
        final ArrayList arrayList = new ArrayList();
        boqVar.mo102961c().duringCreated((C22306c) CoreModule.f17545c.f19645g0.m31834P8(str, listAsList, new e30() { // from class: l.p17
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.addAll((List) obj);
            }
        }).map(new w9j() { // from class: l.q17
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m46384K(arrayList, (roj0) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.r17
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157240a.m46531c2(boqVar, str2, (String) obj);
            }
        }, new e30() { // from class: l.s17
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
    }

    @liq(key = "deleteGroupMember")
    public void deleteGroupMember(@NonNull final boq boqVar, final String str, final String[] strArr, final String str2) {
        e51.m114748M(new Runnable() { // from class: l.f67
            @Override // java.lang.Runnable
            public final void run() {
                this.f95232a.m46532d2(boqVar, str, strArr, str2);
            }
        });
    }

    @liq(key = "dialogJumpRecharge")
    public void dialogJumpRecharge(@NonNull final boq boqVar, final String str, final String str2) {
        e51.m114742G(new Runnable() { // from class: l.u47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                new fd5.C16808e(boqVar2.mo102961c()).m120958j(n4i0.m157865a(PurchaseType.TYPE_INTL_TTT_COIN)).m120951c(0).m120952d(str).m120955g(new g30() { // from class: l.r67
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        CoreBridgeImplementation.m46435d1(boqVar2, str, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m120960l();
            }
        });
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m46533e2(final boq boqVar, final String str) {
        User userM46525X1 = m46525X1();
        if (NullChecker.m81303a(userM46525X1)) {
            boqVar.mo102961c().duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169547u9(userM46525X1).flatMap(new w9j() { // from class: l.y67
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19642f0.m33153up();
                }
            })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.z67
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBridgeImplementation.m46446h0(boqVar, str, (Envelope) obj);
                }
            }, new e30() { // from class: l.a77
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreBridgeImplementation.m46376H0(boqVar, str, (Throwable) obj);
                }
            }));
        } else {
            CoreModule.f17545c.f19642f0.f19908W0.put(Boolean.TRUE);
            boqVar.mo102962d().mo127285b(str, "FillInfoFinish", "0");
        }
        CoreModule.f17545c.f19642f0.f19914Y0.put(Boolean.TRUE);
    }

    @liq(key = "enrichProfileParams")
    public void enrichProfileParams(@NonNull final boq boqVar, final String str) {
        e51.m114742G(new Runnable() { // from class: l.r37
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m46459l1(boqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m46534f2(boq boqVar) {
        this.f29915g = new C8394h(boqVar);
        boqVar.mo102961c().registerOnActivityResultListener(this.f29915g);
        boqVar.mo102961c().startActivityForResult(MediaPickerAct.m47787i2(boqVar.mo102961c(), 1, false, false, true, null, MediaPickerAct.f30623D, false, false, CoreModule.f17545c.f19639e0.m169527p9().gender, "", false), 1015);
    }

    @liq(key = "fetchUserSuccess")
    public void fetchUserSuccess(@NonNull boq boqVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(Oauth2AccessToken.KEY_UID)) {
                String string = jSONObject.getString(Oauth2AccessToken.KEY_UID);
                if (!TextUtils.isEmpty(string)) {
                    CoreModule.f17545c.f19642f0.f19932e1.put(string);
                }
            }
            if (jSONObject.has(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                String string2 = jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME);
                if (!TextUtils.isEmpty(string2)) {
                    CoreModule.f17545c.f19642f0.f19920a1.put(string2);
                }
            }
            if (jSONObject.has("avatar")) {
                String string3 = jSONObject.getString("avatar");
                if (!TextUtils.isEmpty(string3)) {
                    CoreModule.f17545c.f19642f0.f19923b1.put(string3);
                }
            }
            if (jSONObject.has(SeeTextDynamicParam.age)) {
                String string4 = jSONObject.getString(SeeTextDynamicParam.age);
                if (!TextUtils.isEmpty(string4)) {
                    CoreModule.f17545c.f19642f0.f19926c1.put(string4);
                }
            }
            if (jSONObject.has("hideAge")) {
                CoreModule.f17545c.f19642f0.f19929d1.put(Boolean.valueOf(jSONObject.getBoolean("hideAge")));
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m46535g2(JSONObject jSONObject, f400 f400Var) {
        int iOptInt = jSONObject.optInt(Constants.KEY_LIMIT);
        this.f29914f = jSONObject.optString("success");
        this.f29915g = new C8394h(f400Var);
        f400Var.mo102961c().registerOnActivityResultListener(this.f29915g);
        f400Var.mo102961c().startActivityForResult(MediaPickerAct.m47782c2(f400Var.mo102961c(), Math.max(iOptInt, 1), false, false, false), 1016);
    }

    @liq(key = "getAnonymityAvatarById")
    public void getAnonymityAvatarById(@NonNull boq boqVar, String str, boolean z, String str2) {
        boqVar.mo102962d().mo127285b(str2, tbk.m187865l(str, z));
    }

    @liq(key = "getBusinessCodeAuth")
    public void getBusinessCodeAuth(@NonNull final boq boqVar, final String str) {
        final PutongAct putongActMo102961c = boqVar.mo102961c();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.o57
            @Override // java.lang.Runnable
            public final void run() {
                putongActMo102961c.duringCreated((C22306c) CoreModule.f17545c.f19594P0.m177886e3(zyc0.m220918j0() ? "1000002" : "1000003", "code", "user_mobile,user_profile", "", "").map(new w9j() { // from class: l.m67
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m46466o((OpenSdkCodeAuth) obj);
                    }
                })).subscribe(mkd0.m154956H(new e30() { // from class: l.n67
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        boqVar.mo102962d().mo127285b(str, (String) obj);
                    }
                }, new e30() { // from class: l.o67
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m46449i0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "getFreeTrialInfo")
    public void getFreeTrialInfo(boq boqVar, String str) {
        FreeTrialData freeTrialDataM30576C4 = CoreModule.f17545c.f19654j0.m30576C4();
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.m81303a(freeTrialDataM30576C4)) {
                jSONObject.put("promotionType", freeTrialDataM30576C4.promotionType);
                jSONObject.put(StudentVerRejectedReason.startTime, freeTrialDataM30576C4.startTime * 1000);
                jSONObject.put("endTime", freeTrialDataM30576C4.endTime * 1000);
                jSONObject.put("titleText", freeTrialDataM30576C4.titleText);
                jSONObject.put("skuId", freeTrialDataM30576C4.skuId);
                jSONObject.put("serverTime", mqi0.m155944o());
            }
            m46523V1(boqVar.mo102959a(), "javascript:" + str + "('" + jSONObject.toString() + "')");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    @liq(key = "getGpCoinSku")
    public String getGpCoinSku(@NonNull boq boqVar) {
        return new JSONArray((Collection) vwb.m200303Q(igj.f113124b.m221515e(), new w9j() { // from class: l.a57
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Merchandise) obj).toJson();
            }
        })).toString();
    }

    @liq(key = "getGroupConversionId")
    public void getGroupConversionId(@NonNull final boq boqVar, String str, final String str2) {
        boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m32616Dg(str)).filter(new oa8()).subscribe(mkd0.m154955G(new e30() { // from class: l.w37
            @Override // p149l.e30
            public final void call(Object obj) {
                boqVar.mo102962d().mo127285b(str2, ((Conversation) obj).f56011id);
            }
        }));
    }

    @liq(key = "getGroupDescriptionInfo")
    public void getGroupDescriptionInfo(@NonNull final boq boqVar, final String str) {
        C22306c.create(new C22306c.a() { // from class: l.z47
            @Override // p149l.e30
            public final void call(Object obj) {
                ((z3g0) obj).m132487l(CoreModule.f17545c.f19645g0.m31800E6());
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.b57
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m46487v((GroupSetting) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.c57
            @Override // p149l.e30
            public final void call(Object obj) {
                boqVar.mo102962d().mo127285b(str, (String) obj);
            }
        }));
    }

    @liq(key = "getGroupMember")
    public void getGroupMember(@NonNull final boq boqVar, final String str, final String str2) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.u27
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                boqVar2.mo102961c().duringCreated((C22306c) CoreModule.f17545c.f19645g0.m31853W6(str).map(new w9j() { // from class: l.s27
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m46455k0((List) obj);
                    }
                })).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.t27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        boqVar2.mo102962d().mo127285b(str, (String) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "getGroupSettingInfo")
    public void getGroupSettingInfo(@NonNull final boq boqVar, final String str, final String str2) {
        boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19645g0.m31858X8(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.b47
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBridgeImplementation.m46477r1((roj0) obj);
            }
        }, new e30() { // from class: l.c47
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBridgeImplementation.m46450i1((Throwable) obj);
            }
        }));
        boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19645g0.m31837Q8(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.d47
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBridgeImplementation.m46372G((roj0) obj);
            }
        }, new e30() { // from class: l.f47
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBridgeImplementation.m46439f((Throwable) obj);
            }
        }));
        boqVar.mo102961c().post(new Runnable() { // from class: l.g47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                String str3 = str;
                boqVar2.mo102961c().duringCreated(mkd0.m154985s(CoreModule.f17545c.f19645g0.m31908o6(str3).filter(new qh7()).distinctUntilChanged(), CoreModule.f17545c.f19645g0.m31859Y6(str3).filter(new w9j() { // from class: l.x17
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        DbLinks dbLinks = (DbLinks) obj;
                        return Boolean.valueOf(NullChecker.m81303a(dbLinks) && TextUtils.isEmpty(dbLinks.links.next));
                    }
                }).flatMap(new w9j() { // from class: l.z17
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreModule.f17545c.f19645g0.m31853W6(str3);
                    }
                }), CoreModule.f17545c.f19642f0.m32616Dg(str3), new y9j() { // from class: l.a27
                    @Override // p149l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                        return xaj0.m207578a((ChatGroup) obj, (List) obj2, (Conversation) obj3);
                    }
                }).map(new w9j() { // from class: l.b27
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m46403Q0((xaj0) obj);
                    }
                })).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.c27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        boqVar2.mo102962d().mo127285b(str, (String) obj);
                    }
                }, new e30() { // from class: l.d27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m46476r0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "getInternetStatus")
    public void getInternetStatus(@NonNull boq boqVar, String str) {
        if (ConnectivityReceiver.m81284g()) {
            boqVar.mo102962d().mo127285b(str, "0");
        } else {
            boqVar.mo102962d().mo127285b(str, "1");
        }
    }

    @liq(key = "getCurrencyType", uiThread = true)
    public void getIntlCurrencyType(boq boqVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currencyType", qib0.f154686D0);
            String strQuote = JSONObject.quote(jSONObject.toString());
            boqVar.mo102962d().mo127285b(str, strQuote.substring(1, strQuote.length() - 1));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    @liq(key = "getJoinGroupInfo")
    public void getJoinGroupInfo(@NonNull final boq boqVar, final String str) {
        final HashMap map = new HashMap();
        boqVar.mo102961c().duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m33125sn(), CoreModule.f17545c.f19645g0.m31812I6(), new x9j() { // from class: l.h67
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a(((q860) obj).f153135a, (List) obj2);
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.s67
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBridgeImplementation.m46493x(map, boqVar, str, (j760) obj);
            }
        }));
    }

    @liq(key = "getNetworkEnv")
    public void getNetworkEnv(@NonNull boq boqVar, String str) {
        m46527Z1(boqVar, str);
    }

    @liq(key = "getNetworkTantanDevEnv")
    public void getNetworkTantanDevEnv(@NonNull boq boqVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tantan-dev-env", qib0.f154744z.get());
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        boqVar.mo102962d().mo127285b(str, jSONObject.toString().replace("\"", "\\\""));
    }

    @liq(key = "getNoticeNumber")
    public void getNoticeNumber(@NonNull final boq boqVar, final String str) {
        CoreModule.f17545c.f19645g0.m31849U8();
        boqVar.mo102961c().duringCreated((C22306c) CoreModule.f17545c.f19645g0.m31811H8().observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.s37
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m46490w((NotificationCounter) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.u37
            @Override // p149l.e30
            public final void call(Object obj) {
                boqVar.mo102962d().mo127285b(str, (String) obj);
            }
        }, new e30() { // from class: l.v37
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
    }

    @liq(key = "getNotificationState")
    public String getNotificationState(@NonNull boq boqVar) {
        return NotificationCheckerCommon.m79220a().toString();
    }

    @liq(key = "getTabData")
    public void getTabData(@NonNull final boq boqVar, final String str) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.w47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                boqVar2.mo102961c().duringCreated((C22306c) CoreModule.f17545c.f19645g0.m31880f7().map(new w9j() { // from class: l.w67
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m46494x0((List) obj);
                    }
                })).subscribe(mkd0.m154955G(new e30() { // from class: l.x67
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        boqVar2.mo102962d().mo127285b(str, (String) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "getUserAvatarNum")
    public void getUserAvatarNum(@NonNull final boq boqVar, final String str) {
        e51.m114742G(new Runnable() { // from class: l.l57
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m46399P(boqVar, str);
            }
        });
    }

    @liq(key = "getUserIsBanedToAddGroup")
    public void getUserIsBanedToAddGroup(@NonNull final boq boqVar, final String str) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.s47
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m46422Y(boqVar, str);
            }
        });
    }

    @liq(key = "getWeChatShareInviteUrl")
    public void getWeChatShareInviteUrl(@NonNull final boq boqVar, final String str, final String str2) {
        e51.m114742G(new Runnable() { // from class: l.n47
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                boqVar.mo102962d().mo127285b(str2, tbk.m187871r(str3));
            }
        });
    }

    @liq(key = "goGroupChat")
    public void goGroupChat(@NonNull final boq boqVar, final String str) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.q47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                boqVar2.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m32616Dg(str)).filter(new oa8()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.k27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        boq boqVar3 = boqVar2;
                        boqVar3.mo102961c().startActivity(MessagesAct.m48943i2(boqVar3.mo102961c(), ((Conversation) obj).f56011id, false, false));
                    }
                }));
            }
        });
    }

    @liq(key = "guideFillInfoFinish")
    public void guideFillInfoFinish(@NonNull final boq boqVar, final String str) {
        e51.m114742G(new Runnable() { // from class: l.t47
            @Override // java.lang.Runnable
            public final void run() {
                this.f167691a.m46533e2(boqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m46536h2(String str, boq boqVar, List list) {
        PurchaseType purchaseType;
        if (list == null || list.size() <= 0) {
            lsi0.m151578h(R$string.f19137zs);
            return;
        }
        Merchandise merchandise = (Merchandise) list.get(0);
        if (CoreModule.m29932K().mo30835xf()) {
            purchaseType = PurchaseType.TYPE_INTL_DIAMOND;
        } else {
            purchaseType = TextUtils.equals(str, "wallet") ? PurchaseType.TYPE_INTL_TTT_COIN : PurchaseType.TYPE_INTL_TTT_LIVE_COIN;
        }
        hqo hqoVar = new hqo(boqVar.mo102961c(), purchaseType);
        hqoVar.m132479t(new C8387a(merchandise, str));
        hqoVar.m132475p(aqo.m98316h(boqVar.mo102961c(), boqVar.mo102961c() != null ? boqVar.mo102961c().iap().m148933i() : null), merchandise.autoRenewable(), merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    @liq(key = "h5PayAgain")
    public void h5PayAgain(@NonNull boq boqVar) {
        boqVar.mo102961c().m66873d2();
    }

    @liq(key = "h5PayCallBack")
    public void h5PayCallBack(@NonNull boq boqVar, int i, int i2, String str) {
        CoreModule.f17545c.f19604S0.m34186v3().m132487l(new xaj0<>(Integer.valueOf(i), Integer.valueOf(i2), str));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m46537i2(boq boqVar, String str, roj0 roj0Var) {
        boqVar.mo102962d().mo127285b(str, m46522U1("0"));
    }

    @liq(key = "ifUserVerified")
    public void ifUserVerified(@NonNull final boq boqVar, final String str) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.o47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                boqVar2.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.x27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        User user = (User) obj;
                        boqVar2.mo102962d().mo127285b(str, (user.isBanned() || !user.isIdCardVerified()) ? "1" : "0");
                    }
                }, new e30() { // from class: l.y27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m46485u0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "imagePickerPhoto")
    public void imagePickerPhoto(@NonNull final boq boqVar, String str) {
        this.f29914f = str;
        boqVar.mo102961c().post(new Runnable() { // from class: l.i57
            @Override // java.lang.Runnable
            public final void run() {
                this.f111530a.m46534f2(boqVar);
            }
        });
    }

    @liq(isMkBridge = true, key = "imagesPickerMulti", nameSpace = "tantan")
    public void imagesPickerMulti(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        f400Var.mo102961c().post(new Runnable() { // from class: l.j47
            @Override // java.lang.Runnable
            public final void run() {
                this.f116143a.m46535g2(jSONObject, f400Var);
            }
        });
    }

    @liq(key = "inviteFriendCompletion")
    public void inviteFriendCompletion(@NonNull boq boqVar, String str) {
        boqVar.mo102961c().post(new RunnableC8388b(boqVar, str));
    }

    @liq(key = "invokeGpCoinPay")
    public void invokeGpCoinPay(@NonNull final boq boqVar, String str, final String str2) {
        ProductCategory productCategory;
        if (CoreModule.m29932K().mo30835xf()) {
            productCategory = ProductCategory.get(ProductCategory.tttDiamond);
        } else {
            productCategory = TextUtils.equals(str2, "wallet") ? ProductCategory.get(ProductCategory.tttCoin) : ProductCategory.get(ProductCategory.tttLiveCoin);
        }
        CoreModule.f17545c.f19654j0.m30575B5(productCategory, str).compose(mkd0.m154966R()).subscribe(mkd0.m154956H(new e30() { // from class: l.d77
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84707a.m46536h2(str2, boqVar, (List) obj);
            }
        }, new e30() { // from class: l.y17
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f19137zs);
            }
        }));
    }

    @liq(isMkBridge = true, key = "isOpenLocationPermission", nameSpace = "tantan")
    public void isOpenLocationPermission(@NonNull boq boqVar, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        if (wvv.m205777q()) {
            boqVar.mo102962d().mo127285b(strOptString, "true");
        } else {
            boqVar.mo102962d().mo127285b(strOptString, "false");
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m46538j2(boq boqVar, String str, Throwable th) {
        boqVar.mo102962d().mo127285b(str, m46522U1("1"));
    }

    @liq(key = "jumpNotificationSettings")
    public void jumpNotificationSettings(@NonNull boq boqVar) {
        uq40.m194951A();
    }

    @liq(key = "jumpToEditProfileAct")
    public void jumpToEditProfileAct(@NonNull final boq boqVar, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(str, ReminderAction.photo)) {
            e51.m114748M(new Runnable() { // from class: l.e47
                @Override // java.lang.Runnable
                public final void run() {
                    CoreBridgeImplementation.m46389L1(boqVar);
                }
            });
        } else {
            e51.m114748M(new Runnable() { // from class: l.p47
                @Override // java.lang.Runnable
                public final void run() {
                    boq boqVar2 = boqVar;
                    boqVar2.mo102961c().startActivity(CoreModule.m29932K().mo30840yp(boqVar2.mo102961c(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, str));
                }
            });
        }
    }

    @liq(key = "jumpToLauncher")
    public void jumpToLauncher(@NonNull boq boqVar) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        boqVar.mo102961c().startActivity(intent);
    }

    @liq(key = "jumpToProfileAct")
    public void jumpToProfileAct(@NonNull final boq boqVar, final String str) {
        boqVar.mo102961c().duringCreated(CoreModule.m29932K().userObsById(str)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.y37
            @Override // p149l.e30
            public final void call(Object obj) {
                boq boqVar2 = boqVar;
                boqVar2.mo102961c().startActivity(CoreModule.m29932K().startProfileAct(boqVar2.mo102961c(), str, "from_questions_answers", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false));
            }
        }));
    }

    @liq(key = "jumpToPush")
    public void jumpToPush(@NonNull boq boqVar) {
        uq40.m194951A();
    }

    @liq(key = "jumpToSeeOrBuySee")
    public void jumpToSeeOrBuySee(@NonNull final boq boqVar) {
        e51.m114748M(new Runnable() { // from class: l.q37
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m46418W(boqVar);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m46539k2(boq boqVar, String str, roj0 roj0Var) {
        boqVar.mo102962d().mo127285b(str, m46522U1("0"));
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m46540l2(boq boqVar, String str, Throwable th) {
        boqVar.mo102962d().mo127285b(str, m46522U1("1"));
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m46541m2(boq boqVar, String str, roj0 roj0Var) {
        boqVar.mo102962d().mo127285b(str, m46522U1("0"));
    }

    @liq(key = "modifyGroupInfo")
    public void modifyGroupInfo(@NonNull final boq boqVar, String str, String str2, String str3, final String str4) {
        List<Picture> list;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19645g0.m31825M8(str, jSONObject.getString(AuthenticationTokenClaims.JSON_KEY_NAME))).subscribe(mkd0.m154956H(new e30() { // from class: l.y57
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f196385a.m46537i2(boqVar, str4, (roj0) obj);
                    }
                }, new e30() { // from class: l.z57
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f201758a.m46538j2(boqVar, str4, (Throwable) obj);
                    }
                }));
                return;
            }
            if (jSONObject.has("description")) {
                boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19645g0.m31822L8(str, jSONObject.getString("description"))).subscribe(mkd0.m154956H(new e30() { // from class: l.a67
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f67743a.m46539k2(boqVar, str4, (roj0) obj);
                    }
                }, new e30() { // from class: l.b67
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f73751a.m46540l2(boqVar, str4, (Throwable) obj);
                    }
                }));
                return;
            }
            if (jSONObject.has("avatar")) {
                try {
                    list = Converter.RAW_PICTURE_TO_PICTURE.ARRAY_ADAPTER().parse(jSONObject.getJSONArray("avatar").toString());
                } catch (IOException e) {
                    CrashHelper.m81296c(e);
                    list = null;
                }
                if (vwb.m200296J(list)) {
                    boqVar.mo102962d().mo127285b(str4, m46522U1("1"));
                } else {
                    boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19645g0.m31819K8(str, list)).subscribe(mkd0.m154956H(new e30() { // from class: l.c67
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f79442a.m46541m2(boqVar, str4, (roj0) obj);
                        }
                    }, new e30() { // from class: l.d67
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f84590a.m46542n2(boqVar, str4, (Throwable) obj);
                        }
                    }));
                }
            }
        } catch (JSONException e2) {
            CrashHelper.m81296c(e2);
        }
    }

    @liq(key = "modifyGroupNickname")
    public void modifyGroupNickname(@NonNull final boq boqVar, final String str, final String str2, String str3, final String str4) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.g67
            @Override // java.lang.Runnable
            public final void run() {
                this.f101231a.m46545q2(str2, boqVar, str, str4);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m46542n2(boq boqVar, String str, Throwable th) {
        boqVar.mo102962d().mo127285b(str, m46522U1("1"));
    }

    @liq(key = "needStartGreetAct")
    public void needStartGreetAct(@NonNull final boq boqVar, final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            boqVar.mo102962d().mo127285b(str2, "syncActionStatus", "true");
        } else {
            e51.m114742G(new Runnable() { // from class: l.i47
                @Override // java.lang.Runnable
                public final void run() {
                    boq boqVar2 = boqVar;
                    String str3 = str;
                    String str4 = str2;
                    boqVar2.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m32820Ue(str3)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.t17
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            CoreBridgeImplementation.m46437e0(boqVar2, str4, (Conversation) obj);
                        }
                    }, new e30() { // from class: l.u17
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            boqVar2.mo102962d().mo127285b(str4, "syncActionStatus", "true");
                        }
                    }));
                }
            });
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m46543o2(boq boqVar, String str, roj0 roj0Var) {
        boqVar.mo102961c().progressDismiss();
        boqVar.mo102962d().mo127285b(str, m46522U1("0"));
    }

    @liq(isMkBridge = true, key = "chatAssistantProfileQuestionDlgClose", nameSpace = "tantan_usercenter", uiThread = true)
    public void onChatAssistantProfileDlgClose(@NonNull f400 f400Var, JSONObject jSONObject) {
        final boolean zOptBoolean = jSONObject.optBoolean("add", false);
        e51.m114748M(new Runnable() { // from class: l.v47
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19611U1.f75278S.m132487l(Boolean.valueOf(zOptBoolean));
            }
        });
    }

    @liq(key = "openGroupMemberProfile")
    public void openGroupMemberProfile(@NonNull boq boqVar, String str, boolean z) {
        boqVar.mo102961c().startActivity(tbk.m187858e(boqVar.mo102961c(), str, z ? "chat_group_anonymity" : "chat_group"));
    }

    @liq(key = "openNativeDialog")
    public void openNativeDialog(@NonNull final boq boqVar, final String str) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.r47
            @Override // java.lang.Runnable
            public final void run() {
                bpq.m103085b(boqVar.mo102961c(), str);
            }
        });
    }

    @liq(key = "openOfflineWebview")
    public void openOfflineWebview(@NonNull boq boqVar, String str) {
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("pageId");
        if (TextUtils.isEmpty(queryParameter)) {
            boqVar.mo102961c().startActivity(WebViewAct.m80164Z1(boqVar.mo102961c(), "", str));
            return;
        }
        String strM149930j = lip0.m149927i().m149930j(boqVar.mo102961c(), queryParameter);
        int iIndexOf = str.indexOf("?");
        String strSubstring = iIndexOf >= 0 ? str.substring(iIndexOf + 1) : "";
        if (!TextUtils.isEmpty(strSubstring)) {
            strM149930j = strM149930j + "?" + strSubstring;
        }
        Intent intentM80165a2 = WebViewAct.m80165a2(boqVar.mo102961c(), "", strM149930j, true);
        if (TextUtils.equals(uri.getQueryParameter("hideNavigationBar"), "1")) {
            intentM80165a2.putExtra("hideNavigationBar", true);
        }
        boqVar.mo102961c().startActivity(intentM80165a2);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m46544p2(boq boqVar, String str, Throwable th) {
        boqVar.mo102961c().progressDismiss();
        boqVar.mo102962d().mo127285b(str, m46522U1("1"));
        bx6.m104283b(th);
    }

    @liq(key = FirebaseAnalytics.Event.PURCHASE)
    public void purchase(@NonNull final boq boqVar, final String str, final String str2, final String str3) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.l47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                euk.m118173e(boqVar2.mo102961c(), boqVar2.mo102959a(), str, str2, str3, "");
            }
        });
    }

    @liq(key = "purchaseWithTracker")
    public void purchaseWithTracker(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.u57
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                euk.m118173e(boqVar2.mo102961c(), boqVar2.mo102959a(), str, str2, str3, str4);
            }
        });
    }

    @liq(key = "pushState")
    public boolean pushState(@NonNull boq boqVar) {
        return NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m46545q2(String str, final boq boqVar, String str2, final String str3) {
        if (qib0.f154711Z.m119125K(str) || qib0.f154711Z.m119130P(str)) {
            lsi0.m151593w(R$string.f18990v1);
        } else {
            boqVar.mo102961c().progress("");
            boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19645g0.m31828N8(str2, str, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.e27
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f88891a.m46543o2(boqVar, str3, (roj0) obj);
                }
            }, new e30() { // from class: l.f27
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94154a.m46544p2(boqVar, str3, (Throwable) obj);
                }
            }));
        }
    }

    @liq(key = "queryOrderId")
    public String queryOrderId(@NonNull boq boqVar, String str) {
        return CoreModule.f17545c.f19604S0.m34181A3(str);
    }

    @liq(key = "quitCurrentGroup")
    public void quiteCurrentGroup(@NonNull final boq boqVar, final String str, final String str2) {
        boqVar.mo102961c().duringCreated(mkd0.m154984r(CoreModule.f17545c.f19645g0.m31908o6(str), CoreModule.f17545c.f19642f0.m32616Dg(str), new x9j() { // from class: l.e57
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a((ChatGroup) obj, (Conversation) obj2);
            }
        }).flatMap(new w9j() { // from class: l.f57
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return CoreModule.f17545c.f19645g0.m31932w6(str, NullChecker.m81303a(j760Var.f116565b) ? ((Conversation) j760Var.f116565b).f56011id : ((ChatGroup) j760Var.f116564a).localConId);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.g57
            @Override // p149l.e30
            public final void call(Object obj) {
                boqVar.mo102962d().mo127285b(str2, "0");
            }
        }, new e30() { // from class: l.h57
            @Override // p149l.e30
            public final void call(Object obj) {
                boqVar.mo102962d().mo127285b(str2, "1");
            }
        }));
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m46546r2(PutongAct putongAct, boolean z, hoq hoqVar, String str, String str2, RxFacertification.C10729b c10729b, wvf wvfVar, VerificationToken verificationToken, String str3, Envelope envelope) {
        hfw.m130790a("[core][LiveVerify]", "patchLiveVerificationResult:" + envelope.toString());
        this.f29911c = false;
        putongAct.progressDismiss();
        if (z) {
            if (qib0.f154714c0.mo97499I(envelope)) {
                hoqVar.mo127284a(str);
                return;
            } else {
                hoqVar.mo127285b(str2, c10729b.f38842a.f188237b);
                return;
            }
        }
        if (!TextUtils.equals(wvfVar.f188237b, com.tencent.connect.common.Constants.DEFAULT_UIN)) {
            kwk0.m147557H(putongAct, wvfVar, verificationToken, str3);
            return;
        }
        wvf wvfVar2 = c10729b.f38842a;
        if (wvfVar2.f188243h) {
            hoqVar.mo127284a(str);
        } else {
            hoqVar.mo127285b(str2, wvfVar2.f188237b);
        }
    }

    @liq(key = "refreshBoostStatus")
    public void refreshBoostStatus(@NonNull boq boqVar) {
        CoreModule.f17545c.f19576J0.m139269V3();
    }

    @liq(key = "refreshPrivileges")
    public void refreshPrivileges(@NonNull boq boqVar) {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19639e0.m169397H9();
        CoreModule.f17545c.f19639e0.m169454W9(qib0.f154713b0.f139230a.userId());
    }

    @liq(key = "refreshUserCounters")
    public void refreshUserCounters(@NonNull boq boqVar) {
        CoreModule.f17545c.f19639e0.m169397H9();
        CoreModule.f17545c.f19639e0.m169454W9(qib0.f154713b0.f139230a.userId());
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m46547s2(PutongAct putongAct, hoq hoqVar, String str, RxFacertification.C10729b c10729b, Throwable th) {
        StringBuilder sb = new StringBuilder("patchLiveVerificationResult error:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.m130790a("[core][LiveVerify]", sb.toString());
        this.f29911c = false;
        putongAct.progressDismiss();
        hoqVar.mo127285b(str, c10729b.f38842a.f188237b);
        lsi0.m151595y(putongAct.string(R$string.f18590hr));
    }

    @liq(key = "saveDescription")
    public void saveDescription(@NonNull final boq boqVar, final String str, final String str2) {
        e51.m114742G(new Runnable() { // from class: l.a47
            @Override // java.lang.Runnable
            public final void run() {
                this.f67475a.m46549u2(boqVar, str2, str);
            }
        });
    }

    @liq(key = "saveLastConversation")
    public void saveLastConversation(@NonNull boq boqVar, String str) {
        CoreModule.f17545c.f19642f0.f19893R0.put(str);
    }

    @liq(key = "savePayOrderId")
    public void savePayOrderId(@NonNull boq boqVar, String str, String str2) {
        CoreModule.f17545c.f19604S0.m34183r3(str, str2);
    }

    @liq(isMkBridge = true, key = "selectChatMessages", nameSpace = "tantan")
    public void selectChatMessages(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        f400Var.mo102961c().post(new Runnable() { // from class: l.x57
            @Override // java.lang.Runnable
            public final void run() {
                this.f191093a.m46550v2(jSONObject, f400Var);
            }
        });
    }

    @liq(key = "sendTickleMessage")
    public void sendTickleMessage(@NonNull final boq boqVar, final String str, final String str2) {
        e51.m114742G(new Runnable() { // from class: l.y47
            @Override // java.lang.Runnable
            public final void run() {
                this.f195913a.m46551w2(boqVar, str, str2);
            }
        });
    }

    @liq(key = "setShowThemeCard")
    public void setShowThemeCard(@NonNull boq boqVar, String str, String str2) {
        m46517P2(boqVar, str, null, str2);
    }

    @liq(isMkBridge = true, key = "shareFriends", nameSpace = "tantan_share")
    public void shareFriends(@NonNull final f400 f400Var, JSONObject jSONObject) {
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
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.d57
            @Override // java.lang.Runnable
            public final void run() {
                f400 f400Var2 = f400Var;
                CoreDlg.m45017Q1(f400Var2.mo102961c(), strOptString, strOptString2, strOptString3, iOptInt, strOptString4, strOptString5, string, strOptString6, new f30() { // from class: l.b37
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        f400Var2.mo102962d().mo127285b(str, (String) obj, (String) obj2);
                    }
                });
            }
        });
    }

    @liq(isMkBridge = true, key = "shareNew", nameSpace = "tantan", uiThread = true)
    public void shareNew(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.x47
            @Override // java.lang.Runnable
            public final void run() {
                this.f190943a.m46554z2(jSONObject, f400Var);
            }
        });
    }

    @liq(isMkBridge = true, key = "showLocationAuthguide", nameSpace = "tantan")
    public void showLocationAuthguide(@NonNull final boq boqVar, JSONObject jSONObject) {
        e51.m114742G(new Runnable() { // from class: l.l67
            @Override // java.lang.Runnable
            public final void run() {
                wvv.m205768h(boqVar.mo102961c());
            }
        });
    }

    @liq(key = "showNativeVerified")
    public void showNativeVerified(@NonNull final boq boqVar) {
        boqVar.mo102961c().post(new Runnable() { // from class: l.h47
            @Override // java.lang.Runnable
            public final void run() {
                tbk.m187874u(boqVar.mo102961c());
            }
        });
    }

    @liq(key = "showSvipGift")
    public String showSvipGift(@NonNull boq boqVar) {
        boolean zM182580a = s8b0.m182580a();
        s8b0.m182583d(0);
        return String.valueOf(zM182580a);
    }

    @liq(isMkBridge = true, key = "startAliyunLiveVerify", nameSpace = "tantan_live")
    public void startAliyunLiveVerify(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
        final String strOptString2 = jSONObject.optString("idCardNum");
        final String strOptString3 = jSONObject.optString("success");
        final String strOptString4 = jSONObject.optString("fail");
        e51.m114748M(new Runnable() { // from class: l.z37
            @Override // java.lang.Runnable
            public final void run() {
                this.f201312a.m46507F2(f400Var, strOptString3, strOptString, strOptString2, strOptString4);
            }
        });
    }

    @liq(key = "startGreetAct")
    public void startGreetAct(@NonNull final boq boqVar, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.e67
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                String str2 = str;
                boqVar2.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m32820Ue(str2)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.v27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m46412T0(boqVar2, str2, (Conversation) obj);
                    }
                }, new e30() { // from class: l.w27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8360d.m45892a(boqVar2.mo102961c(), new C8360d.a(str2, "from_h5_suggest_user"));
                    }
                }));
            }
        });
    }

    @liq(key = "startMessagesAct")
    public void startMessagesAct(@NonNull boq boqVar, String str) {
        boqVar.mo102961c().startActivity(MessagesAct.m48944k2(boqVar.mo102961c(), str, true, false, 22));
    }

    @liq(key = "switchDisturb")
    public void switchDisturb(@NonNull final boq boqVar, String str, boolean z, final String str2) {
        boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19645g0.m31808G8(str, z)).subscribe(mkd0.m154956H(new e30() { // from class: l.i67
            @Override // p149l.e30
            public final void call(Object obj) {
                boqVar.mo102962d().mo127285b(str2, "0");
            }
        }, new e30() { // from class: l.j67
            @Override // p149l.e30
            public final void call(Object obj) {
                boqVar.mo102962d().mo127285b(str2, "1");
            }
        }));
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m46548t2(coq coqVar, String str, int i, List list) {
        coqVar.mo102961c().progressDismiss();
        m46516O2(coqVar, list, str, "", null, i);
    }

    @liq(key = "toConversation")
    public void toConversation(@NonNull final boq boqVar, final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            boqVar.mo102962d().mo127285b(str2, "syncActionStatus", "0");
        } else {
            e51.m114742G(new Runnable() { // from class: l.x37
                @Override // java.lang.Runnable
                public final void run() {
                    boq boqVar2 = boqVar;
                    String str3 = str;
                    String str4 = str2;
                    boqVar2.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m32820Ue(str3)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.v17
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            CoreBridgeImplementation.m46387L(boqVar2, str4, str3, (Conversation) obj);
                        }
                    }, new e30() { // from class: l.w17
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            boqVar2.mo102962d().mo127285b(str4, "syncActionStatus", "0");
                        }
                    }));
                }
            });
        }
    }

    @liq(key = "triggerEndRemark")
    public void triggerEndRemark(@NonNull boq boqVar) {
        CoreModule.f17545c.f19642f0.f19911X0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m46549u2(final boq boqVar, final String str, String str2) {
        User userM46524W1;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            if (TextUtils.isEmpty(userM169527p9.description)) {
                boqVar.mo102962d().mo127285b(str, "shouldSave", "1");
                userM46524W1 = m46524W1(true, str2);
            } else {
                boqVar.mo102962d().mo127285b(str, "shouldSave", "0");
                userM46524W1 = m46524W1(false, str2);
            }
            if (NullChecker.m81303a(userM46524W1)) {
                boqVar.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169547u9(userM46524W1)).subscribe(mkd0.m154956H(new e30() { // from class: l.z27
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        boqVar.mo102962d().mo127285b(str, "SaveDescription", "1");
                    }
                }, new e30() { // from class: l.a37
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        boqVar.mo102962d().mo127285b(str, "SaveDescription", "0");
                    }
                }));
            } else {
                boqVar.mo102962d().mo127285b(str, "SaveDescription", "0");
            }
        }
    }

    @liq(key = "updateAvatar")
    public void updateAvatar(@NonNull final boq boqVar, final String str) {
        e51.m114742G(new Runnable() { // from class: l.w57
            @Override // java.lang.Runnable
            public final void run() {
                this.f184646a.m46508G2(boqVar, str);
            }
        });
    }

    @liq(key = "userAccessoryText")
    public void userAccessoryText(@NonNull boq boqVar, String str) {
        CoreModule.f17545c.f19642f0.f19902U0.put(str);
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m46550v2(JSONObject jSONObject, f400 f400Var) {
        this.f29914f = jSONObject.optString("success");
        String strOptString = jSONObject.optString("user_id");
        String strOptString2 = jSONObject.optString("message_ids");
        int iOptInt = jSONObject.optInt("max_limit");
        this.f29915g = new C8394h(f400Var);
        f400Var.mo102961c().registerOnActivityResultListener(this.f29915g);
        f400Var.mo102961c().startActivityForResult(MessagesAct.m48942h2(f400Var.mo102961c(), strOptString, true, strOptString2, iOptInt), 1017);
    }

    @liq(isMkBridge = true, key = "v2GetRecentlyNumMessage", nameSpace = "tantan")
    public void v2GetRecentlyNumMessage(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("conversation_id");
        int iOptInt = jSONObject.optInt("num");
        if (TextUtils.isEmpty(strOptString2)) {
            return;
        }
        f400Var.mo102961c().duringCreated(C22306c.create(new C22306c.a() { // from class: l.r57
            @Override // p149l.e30
            public final void call(Object obj) {
                ((z3g0) obj).m132487l(roj0.f160388a);
            }
        }).observeOn(Schedulers.m221493io()).map(new C8393g(strOptString2, iOptInt)).observeOn(jo0.m142408a()).map(new C8392f(f400Var, strOptString))).subscribe(mkd0.m154956H(new e30() { // from class: l.s57
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBridgeImplementation.m46451j((roj0) obj);
            }
        }, new e30() { // from class: l.t57
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreBridgeImplementation.m46463n((Throwable) obj);
            }
        }));
    }

    @liq(isMkBridge = true, key = "v2SelectChatMessages", nameSpace = "tantan")
    public void v2SelectChatMessages(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114741F(f400Var.mo102961c(), new Runnable() { // from class: l.k47
            @Override // java.lang.Runnable
            public final void run() {
                this.f120949a.m46510I2(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m46552x2(String str, coq coqVar, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        m46518Q2(coqVar, str, str2, str3);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m46553y2(String str, coq coqVar, String str2, String str3, String str4, Throwable th) {
        ShareHelper.m79961b0(ShareHelper.m79957X(str), th);
        m46518Q2(coqVar, str2, str3, str4);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m46554z2(JSONObject jSONObject, f400 f400Var) {
        m46519R2(f400Var, jSONObject.optString("url"), jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("imgUrl"), jSONObject.optString("channel"), jSONObject.optString("from"), jSONObject.optString("successHandler"), jSONObject.optString("errorHandler"));
    }

    @liq(key = "setShowThemeCard")
    public void setShowThemeCard(@NonNull boq boqVar, String str, String str2, String str3) {
        m46517P2(boqVar, str, str3, str2);
    }

    @liq(key = "shareNew", uiThread = true)
    public void shareNew(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        m46519R2(boqVar, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @liq(key = "showLocationAuthguide")
    public void showLocationAuthguide(@NonNull final boq boqVar) {
        e51.m114742G(new Runnable() { // from class: l.t37
            @Override // java.lang.Runnable
            public final void run() {
                wvv.m205768h(boqVar.mo102961c());
            }
        });
    }

    @liq(key = "addRecommendationsWidget")
    public void addRecommendationsWidget(@NonNull boq boqVar) {
    }

    @liq(key = "jumpTantanxDownload")
    public void jumpTantanxDownload(@NonNull boq boqVar) {
    }

    @liq(key = "openBDPrivilege")
    public void openBDPrivilege(@NonNull boq boqVar) {
    }

    @liq(key = "startAliyunLiveVerify")
    public void startAliyunLiveVerify(@NonNull final boq boqVar, @NonNull final String str, @NonNull final String str2, @Nullable final String str3, @Nullable final String str4) {
        e51.m114748M(new Runnable() { // from class: l.m47
            @Override // java.lang.Runnable
            public final void run() {
                this.f131251a.m46504C2(boqVar, str3, str, str2, str4);
            }
        });
    }

    @liq(key = "isOpenLocationPermission")
    public void isOpenLocationPermission(@NonNull boq boqVar, String str) {
        if (wvv.m205777q()) {
            boqVar.mo102962d().mo127285b(str, "true");
        } else {
            boqVar.mo102962d().mo127285b(str, "false");
        }
    }

    @liq(key = "privateMatchSettingsIntroFinished")
    public void privateMatchSettingsIntroFinished(@NonNull boq boqVar, boolean z) {
    }

    @liq(key = "shareFriends")
    public void shareFriends(@NonNull final boq boqVar, final String str, final int i, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8) {
        e51.m114741F(boqVar.mo102961c(), new Runnable() { // from class: l.j27
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                CoreDlg.m45017Q1(boqVar2.mo102961c(), str, str2, str3, i, str4, str5, str6, str7, new f30() { // from class: l.b77
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        boqVar2.mo102962d().mo127285b(str, (String) obj, (String) obj2);
                    }
                });
            }
        });
    }

    @liq(key = "shareFriends")
    public void shareFriends(@NonNull final boq boqVar, final String str, final int i, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        e51.m114742G(new Runnable() { // from class: l.q57
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                CoreDlg.m45020R1(boqVar2.mo102961c(), str, str2, str3, i, str4, str5, str6, new f30() { // from class: l.l27
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        boqVar2.mo102962d().mo127285b(str, (String) obj, (String) obj2);
                    }
                });
            }
        });
    }
}
