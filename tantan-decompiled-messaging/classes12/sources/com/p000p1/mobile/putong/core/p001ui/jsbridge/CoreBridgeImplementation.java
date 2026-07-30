package com.p000p1.mobile.putong.core.p001ui.jsbridge;

import android.app.Activity;
import android.content.Context;
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
import com.google.gson.JsonArray;
import com.p000p1.mobile.putong.core.p001ui.jsbridge.CoreBridgeImplementation;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.DbLinks;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.JailedGroupChat;
import com.p000p1.mobile.putong.data.Link;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.data.OMSThemeInfo;
import com.p000p1.mobile.putong.data.OpenSdkCodeAuth;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.SeeTextDynamicParam;
import com.p000p1.mobile.putong.data.SignupStage;
import com.p000p1.mobile.putong.data.StudentVerRejectedReason;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.VerificationToken;
import com.p000p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.facertification.RxFacertification;
import com.p000p1.mobile.putong.facertification.TTFacertificationClient;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.ChatGroupSilence;
import com.p1.mobile.putong.core.data.ChatSendMessage;
import com.p1.mobile.putong.core.data.Coin;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.FreeTrialData;
import com.p1.mobile.putong.core.data.GroupSetting;
import com.p1.mobile.putong.core.data.GroupTab;
import com.p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.NotificationCounter;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.newui.group.GroupCreateCategoryAct;
import com.p1.mobile.putong.core.newui.group.GroupCreateTypeAct;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.profile.dialog.MediaRecorderFrag;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.greet.GreetAct;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.b;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
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
import l.aqo;
import l.ark;
import l.boq;
import l.bpq;
import l.bs5;
import l.bx6;
import l.c4g0;
import l.coq;
import l.d30;
import l.e30;
import l.e51;
import l.ef2;
import l.euk;
import l.f30;
import l.f400;
import l.fd5;
import l.g30;
import l.hfw;
import l.hoq;
import l.hqo;
import l.igj;
import l.j760;
import l.jo0;
import l.knb0;
import l.kwk0;
import l.lip0;
import l.liq;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.ml6;
import l.mqi0;
import l.mu5;
import l.n4i0;
import l.o6j0;
import l.o96;
import l.oa8;
import l.pgm;
import l.q660;
import l.q860;
import l.qh7;
import l.qib0;
import l.qlw;
import l.rhi;
import l.roj0;
import l.rp8;
import l.s8b0;
import l.tbk;
import l.tvf;
import l.ue50;
import l.upa;
import l.uq40;
import l.uvf;
import l.vvf;
import l.vwb;
import l.w9j;
import l.wvf;
import l.wvv;
import l.x9j;
import l.xaj0;
import l.y9j;
import l.yki0;
import l.z3g0;
import l.zyc0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.n37;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CoreBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: d */
    public boolean f21d;

    /* JADX INFO: renamed from: e */
    public boolean f22e;

    /* JADX INFO: renamed from: f */
    public String f23f;

    /* JADX INFO: renamed from: g */
    public C0007h f24g;

    /* JADX INFO: renamed from: a */
    public final bs5 f18a = new bs5();

    /* JADX INFO: renamed from: b */
    @Nullable
    public c4g0 f19b = null;

    /* JADX INFO: renamed from: c */
    public boolean f20c = false;

    /* JADX INFO: renamed from: h */
    public long[] f25h = {0, 300};

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$a */
    public class C0000a implements ue50 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Merchandise f26a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f27b;

        public C0000a(Merchandise merchandise, String str) {
            this.f26a = merchandise;
            this.f27b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m219a() {
            CoreModule.c.S0.v3().onNext(new xaj0(1, -1, this.f27b));
            lsi0.h(R.string.Dp);
        }

        /* JADX INFO: renamed from: c */
        public void m220c() {
            CoreModule.c.S0.v3().onNext(new xaj0(0, Integer.valueOf(this.f26a.quantity), this.f27b));
            lsi0.w(R.string.ol);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$b */
    public class RunnableC0001b implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f29a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boq f30b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f31c;

        public RunnableC0001b(boq boqVar, String str) {
            this.f30b = boqVar;
            this.f31c = str;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m221a(String str, boq boqVar) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            o6j0.c("e_invitefriends_share_button_again", "p_invitefriends", new o6j0.a[0]);
            boqVar.d().a(str);
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog.e eVarF = this.f30b.c().dialog().G0("再次分享，解锁更多特权").F("分享到多个群可以快速解锁");
            final String str = this.f31c;
            final boq boqVar = this.f30b;
            Dialog dialogZ = eVarF.v0("继续分享", new Runnable() { // from class: l.e77
                @Override // java.lang.Runnable
                public final void run() {
                    CoreBridgeImplementation.RunnableC0001b.m221a(str, boqVar);
                }
            }).m0("稍后再说").z();
            this.f29a = dialogZ;
            dialogZ.show();
            o6j0.h("e_invitefriends_share_button_again", "p_invitefriends", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$c */
    public class C0002c implements TTFacertificationClient.InterfaceC1574a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f33a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f34b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ hoq f35c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f36d;

        public C0002c(PutongAct putongAct, String str, hoq hoqVar, String str2) {
            this.f33a = putongAct;
            this.f34b = str;
            this.f35c = hoqVar;
            this.f36d = str2;
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: a */
        public void mo222a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            StringBuilder sb = new StringBuilder("onPrepareSDKError：");
            sb.append(preDetectException == null ? "null" : preDetectException.getMessage());
            hfw.a("[core][LiveVerify]", sb.toString());
            vvf vvfVar = preDetectException.prepareResult;
            if (!verificationToken.isTencentProvider() || tvf.k(this.f33a, vvfVar.c, this.f34b, 2)) {
                return;
            }
            kwk0.P(this.f33a, vvfVar.c);
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: b */
        public void mo223b(VerificationToken verificationToken) {
            hfw.a("[core][LiveVerify]", "onGetVerificationTokenSuccess：" + verificationToken.toString());
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: c */
        public void mo224c(VerificationToken verificationToken, vvf vvfVar) {
            hfw.a("[core][LiveVerify]", "onPrepareSDKSuccess：" + vvfVar.toString());
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: d */
        public void mo225d(Throwable th) {
            StringBuilder sb = new StringBuilder("onGetVerificationTokenError:");
            sb.append(th == null ? "null" : th.getMessage());
            hfw.a("[core][LiveVerify]", sb.toString());
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: e */
        public void mo226e(VerificationToken verificationToken) {
            hfw.a("[core][LiveVerify]", "doNotNeedCamera");
            this.f33a.setResult(-1);
            this.f33a.finish();
            this.f35c.a(this.f36d);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$d */
    public class C0003d implements MediaRecorderFrag.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boq f38a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f39b;

        public C0003d(boq boqVar, String str) {
            this.f38a = boqVar;
            this.f39b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m227a() {
            this.f38a.d().b(this.f39b, new String[]{"UpdateAvatarFinish", "1"});
        }

        public void onCancel() {
            this.f38a.d().b(this.f39b, new String[]{"UpdateAvatarFinish", "0"});
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$e */
    public class C0004e extends qlw {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ StringBuilder f41e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f42f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ WebView f43g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0004e(Act act, PurchaseType purchaseType, StringBuilder sb, String str, WebView webView) {
            super(act, purchaseType);
            this.f41e = sb;
            this.f42f = str;
            this.f43g = webView;
        }

        /* JADX INFO: renamed from: a */
        public void m229a() {
            lsi0.h(R.string.zs);
            StringBuilder sb = this.f41e;
            sb.append("javascript:");
            sb.append(this.f42f);
            sb.append("('");
            sb.append(User.ID_TEAM_ACCOUNT);
            sb.append("')");
            CoreBridgeImplementation.this.m187V1(this.f43g, this.f41e.toString());
        }

        /* JADX INFO: renamed from: b */
        public void m230b() {
            super.b();
        }

        /* JADX INFO: renamed from: c */
        public void m231c() {
            super.c();
            e51.H(CoreModule.b, new Runnable() { // from class: l.f77
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.j0.G4();
                }
            }, 200L);
            StringBuilder sb = this.f41e;
            sb.append("javascript:");
            sb.append(this.f42f);
            sb.append("('");
            sb.append("0");
            sb.append("')");
            CoreBridgeImplementation.this.m187V1(this.f43g, this.f41e.toString());
            CoreModule.c.j0.g0 = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$f */
    public class C0005f implements w9j<List<String>, roj0> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f400 f45a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f46b;

        public C0005f(f400 f400Var, String str) {
            this.f45a = f400Var;
            this.f46b = str;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public roj0 call(List<String> list) {
            String strSubstring;
            if (vwb.J(list)) {
                strSubstring = "[]";
            } else {
                String strQuote = JSONObject.quote(new JSONArray((Collection) list).toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            }
            this.f45a.d().b(this.f46b, new String[]{strSubstring});
            return roj0.a;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$g */
    public class C0006g implements w9j<roj0, List<String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f48a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f49b;

        public C0006g(String str, int i) {
            this.f48a = str;
            this.f49b = i;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<String> call(roj0 roj0Var) {
            List listN0 = CoreModule.k.c.n0(this.f48a, this.f49b);
            ArrayList arrayList = new ArrayList();
            if (!vwb.J(listN0)) {
                Iterator it = listN0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DbObject) ((Message) it.next())).id);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.CoreBridgeImplementation$h */
    public class C0007h implements a.a {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final coq f51a;

        public C0007h(coq coqVar) {
            this.f51a = coqVar;
        }

        /* JADX INFO: renamed from: a */
        public boolean m234a(int i, int i2, Intent intent) {
            if (i2 == -1) {
                if (i == 1017) {
                    CoreBridgeImplementation coreBridgeImplementation = CoreBridgeImplementation.this;
                    coreBridgeImplementation.m178M2(this.f51a, intent, coreBridgeImplementation.f23f);
                } else {
                    CoreBridgeImplementation coreBridgeImplementation2 = CoreBridgeImplementation.this;
                    if (i == 1015) {
                        coreBridgeImplementation2.m177L2(this.f51a, intent, coreBridgeImplementation2.f23f, i);
                    } else {
                        coreBridgeImplementation2.m176K2(this.f51a, intent, coreBridgeImplementation2.f23f, i);
                    }
                }
            }
            CoreBridgeImplementation.this.m184S2(this.f51a);
            return false;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static /* synthetic */ void m20A1(coq coqVar, Throwable th) {
        coqVar.c().progressDismiss();
        lsi0.C(com.p1.mobile.putong.common.R.string.F);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ c m21B(OMSThemeInfo oMSThemeInfo) {
        if (NullChecker.a(oMSThemeInfo)) {
            return CoreModule.c.m0.M5();
        }
        lsi0.j("网络不给力，稍后再试吧");
        return null;
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m29D1(final boq boqVar) {
        if (tbk.h(boqVar.c())) {
            boqVar.c().progress("", true);
            boqVar.c().duringCreated(CoreModule.c.g0.N6()).subscribe(mkd0.H(new e30() { // from class: l.p67
                public final void call(Object obj) {
                    CoreBridgeImplementation.m125m0(boqVar, (List) obj);
                }
            }, new e30() { // from class: l.q67
                public final void call(Object obj) {
                    CoreBridgeImplementation.m34F0(boqVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m34F0(boq boqVar, Throwable th) {
        boqVar.c().progressDismiss();
        bx6.b(th);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m36G(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m40H0(boq boqVar, String str, Throwable th) {
        CoreModule.c.f0.W0.put(Boolean.TRUE);
        boqVar.d().b(str, new String[]{"FillInfoFinish", "0"});
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ String m48K(List list, roj0 roj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
            jSONObject.put(Data.TYPE, jSONObject2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m51L(boq boqVar, String str, String str2, Conversation conversation) {
        if (!NullChecker.a(conversation)) {
            boqVar.d().b(str, new String[]{"syncActionStatus", "0"});
        } else {
            boqVar.d().b(str, new String[]{"syncActionStatus", "1"});
            boqVar.c().startActivity(MessagesAct.k2(boqVar.c(), str2, true, false, -1));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ int m52L0(Map map, ChatGroup chatGroup, ChatGroup chatGroup2) {
        Conversation conversation = (Conversation) map.get(((DbObject) chatGroup).id);
        Conversation conversation2 = (Conversation) map.get(((DbObject) chatGroup2).id);
        return (NullChecker.a(conversation) && NullChecker.a(conversation2)) ? Double.compare(conversation2.latestTime, conversation.latestTime) : Double.compare(chatGroup2.createdTime, chatGroup.createdTime);
    }

    /* JADX INFO: renamed from: L1 */
    public static /* synthetic */ void m53L1(boq boqVar) {
        boqVar.c().startActivity(NewMainAct.I5(boqVar.c(), NavigationIntent.get("profile")));
        q660.a(boqVar.c(), "from_card_upload_photo");
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m58N0(f400 f400Var, String str, q860 q860Var) {
        if (!NullChecker.a(q860Var)) {
            f400Var.d().b(str, new String[]{"0"});
        } else {
            f400Var.d().b(str, new String[]{vwb.J(q860Var.a) ? "0" : "1"});
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m63P(boq boqVar, String str) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            boqVar.d().b(str, new String[]{"nums", String.valueOf(userP9.pictures.size())});
        } else {
            boqVar.d().b(str, new String[]{"nums", String.valueOf(0)});
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ String m67Q0(xaj0 xaj0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("chatGroup", new JSONObject(((ChatGroup) xaj0Var.a).toJson()));
            jSONObject2.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize((List) xaj0Var.b)));
            if (NullChecker.a(xaj0Var.c)) {
                jSONObject2.put("muted", ((Conversation) xaj0Var.c).muted);
            }
            jSONObject.put(Data.TYPE, jSONObject2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m76T0(boq boqVar, String str, Conversation conversation) {
        if (NullChecker.a(conversation)) {
            boqVar.c().startActivity(MessagesAct.k2(boqVar.c(), str, true, false, -1));
        } else {
            d.a(boqVar.c(), new d.a(str, "from_h5_suggest_user"));
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m82W(boq boqVar) {
        Counter counterO3 = CoreModule.c.o3();
        if (counterO3 == null || counterO3.likersLimit.remaining <= 0) {
            CoreModule.P().a().l1(boqVar.c(), "p_special_card,deeplink,click");
        } else {
            boqVar.c().startActivity(new Intent((Context) boqVar.c(), (Class<?>) LikersAct.class));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m83W0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var.c() instanceof MkWebViewAct) {
            MkWebViewAct mkWebViewActC = f400Var.c();
            ResultReceiver resultReceiverK2 = mkWebViewActC.k2();
            if (NullChecker.a(resultReceiverK2)) {
                Bundle bundle = new Bundle();
                bundle.putString("reason", jSONObject.optString("reason"));
                resultReceiverK2.send(-1, bundle);
            } else {
                mkWebViewActC.setResult(-1);
            }
            mkWebViewActC.finish();
        }
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m86Y(boq boqVar, String str) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            if (!userP9.isBanned()) {
                boqVar.d().b(str, new String[]{"0"});
            } else {
                boqVar.d().b(str, new String[]{"1"});
                lsi0.w(R.string.C1);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m95c0(Throwable th) {
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m99d1(final boq boqVar, final String str, PurchaseType purchaseType, Act act, String str2) {
        if (CoreModule.K().xf()) {
            act.duringCreated(CoreModule.c.I0.M3()).subscribe(mkd0.G(new e30() { // from class: l.e37
                public final void call(Object obj) {
                    boqVar.d().b(str, new String[]{String.valueOf(((IntlCurrencyDiamond) obj).available)});
                }
            }));
        } else {
            act.duringCreated(CoreModule.c.H0.a5()).subscribe(mkd0.G(new e30() { // from class: l.g37
                public final void call(Object obj) {
                    boqVar.d().b(str, new String[]{String.valueOf(((Coin) obj).available)});
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m101e0(boq boqVar, String str, Conversation conversation) {
        if (NullChecker.a(conversation)) {
            boqVar.d().b(str, new String[]{"syncActionStatus", "false"});
        } else {
            boqVar.d().b(str, new String[]{"syncActionStatus", "true"});
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m103f(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0086 A[EDGE_INSN: B:16:0x0086->B:17:0x0087 BREAK  A[LOOP:0: B:9:0x0040->B:26:0x0040]] */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m104f0(JSONObject jSONObject, final f400 f400Var) {
        knb0 knb0Var;
        final String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("user_id");
        if (!Act.globalLifeCycle_().isEmpty() && !Act.globalLifeCycle_().values().isEmpty()) {
            List list = (List) Act.globalLifeCycle_().values().iterator().next();
            if (!vwb.J(list)) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        knb0Var = null;
                        break;
                    }
                    GreetAct greetAct = (Activity) ((Act.r) it.next()).a.get();
                    if (NullChecker.a(greetAct) && (greetAct instanceof GreetAct)) {
                        com.p1.mobile.putong.core.ui.greet.a aVarD2 = greetAct.d2();
                        knb0Var = new knb0(aVarD2.R0(), Double.valueOf(aVarD2.Q0()), Long.valueOf(aVarD2.P0()), Boolean.valueOf(aVarD2.Y0()));
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
        if (NullChecker.a(knb0Var)) {
            f400Var.c().duringCreated(CoreModule.c.r0.z5((String) knb0Var.a, ((Double) knb0Var.b).doubleValue(), ((Long) knb0Var.c).longValue(), ((Boolean) knb0Var.d).booleanValue())).subscribe(mkd0.H(new e30() { // from class: l.m27
                public final void call(Object obj) {
                    CoreBridgeImplementation.m58N0(f400Var, strOptString, (q860) obj);
                }
            }, new e30() { // from class: l.n27
                public final void call(Object obj) {
                    f400Var.d().b(strOptString, new String[]{"0"});
                }
            }));
        } else {
            f400Var.c().duringCreated(CoreModule.c.f0.Hg(strOptString2)).subscribe(mkd0.H(new e30() { // from class: l.o27
                public final void call(Object obj) {
                    f400Var.d().b(strOptString, new String[]{((Boolean) obj).booleanValue() ? "1" : "0"});
                }
            }, new e30() { // from class: l.p27
                public final void call(Object obj) {
                    f400Var.d().b(strOptString, new String[]{"0"});
                }
            }));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m110h0(boq boqVar, String str, Envelope envelope) {
        CoreModule.c.f0.W0.put(Boolean.FALSE);
        boqVar.d().b(str, new String[]{"FillInfoFinish", "1"});
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m113i0(Throwable th) {
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m114i1(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m115j(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ String m119k0(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("chatGroupMembers", new JSONArray(ChatGroupMember.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ void m120k1(coq coqVar, Throwable th) {
        coqVar.c().progressDismiss();
        lsi0.C(com.p1.mobile.putong.common.R.string.F);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m123l1(boq boqVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("avatar_url", CoreModule.c.f0.S0.get());
            jSONObject.put("name", CoreModule.c.f0.T0.get());
            if (!vwb.J(upa.c1())) {
                JsonArray jsonArray = new JsonArray();
                Iterator it = upa.c1().iterator();
                while (it.hasNext()) {
                    jsonArray.add((String) it.next());
                }
                jSONObject.put("self_intro_tags_1", jsonArray);
            }
            if (!vwb.J(upa.d1())) {
                JsonArray jsonArray2 = new JsonArray();
                Iterator it2 = upa.d1().iterator();
                while (it2.hasNext()) {
                    jsonArray2.add((String) it2.next());
                }
                jSONObject.put("self_intro_tags_2", jsonArray2);
            }
            if (!vwb.J(upa.R0())) {
                JsonArray jsonArray3 = new JsonArray();
                Iterator it3 = upa.R0().iterator();
                while (it3.hasNext()) {
                    jsonArray3.add((String) it3.next());
                }
                jSONObject.put("other_tags", jsonArray3);
            }
            if (!TextUtils.isEmpty((CharSequence) CoreModule.c.f0.e1.get())) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("uid", CoreModule.c.f0.e1.get());
                jSONObject2.put("name", CoreModule.c.f0.a1.get());
                jSONObject2.put("avatar", CoreModule.c.f0.b1.get());
                jSONObject2.put(SeeTextDynamicParam.age, CoreModule.c.f0.c1.get());
                jSONObject2.put("hideAge", CoreModule.c.f0.d1.get());
                jSONObject.put("userInfo", jSONObject2);
            }
            String strQuote = JSONObject.quote(jSONObject.toString());
            boqVar.d().b(str, new String[]{"syncActionStatus", strQuote.substring(1, strQuote.length() - 1)});
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m125m0(boq boqVar, List list) {
        boqVar.c().progressDismiss();
        if (GroupCreateCategoryAct.a2(list)) {
            boqVar.c().startActivity(GroupCreateTypeAct.Z1(boqVar.c(), list));
        } else {
            lsi0.w(R.string.G1);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m127n(Throwable th) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m130o(OpenSdkCodeAuth openSdkCodeAuth) {
        JSONObject jSONObject = new JSONObject();
        if (!NullChecker.a(openSdkCodeAuth) || TextUtils.isEmpty(openSdkCodeAuth.code)) {
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
    public static /* synthetic */ void m140r0(Throwable th) {
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m141r1(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m149u0(Throwable th) {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m151v(GroupSetting groupSetting) {
        String strQuote = JSONObject.quote(groupSetting.toJson());
        return strQuote.substring(1, strQuote.length() - 1);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ String m154w(NotificationCounter notificationCounter) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("notificationCounters", new JSONArray(NotificationCounter.JSON_ADAPTER.ARRAY_ADAPTER().serialize(vwb.f0(new NotificationCounter[]{notificationCounter}))));
            jSONObject.put(Data.TYPE, jSONObject2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m155w0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m157x(final Map map, boq boqVar, String str, j760 j760Var) {
        map.clear();
        if (vwb.J((Collection) j760Var.b)) {
            boqVar.d().b(str, new String[]{"[]"});
            return;
        }
        if (!vwb.J((Collection) j760Var.a)) {
            for (Conversation conversation : (List) j760Var.a) {
                if (TEnum.equals(conversation.status, "default")) {
                    map.put(conversation.otherUser, conversation);
                }
            }
        }
        ArrayList arrayListN = vwb.n(new ArrayList((Collection) j760Var.b), new w9j() { // from class: l.q27
            public final Object call(Object obj) {
                return Boolean.valueOf(map.containsKey(((DbObject) ((ChatGroup) obj)).id));
            }
        });
        Collections.sort(arrayListN, new Comparator() { // from class: l.r27
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CoreBridgeImplementation.m52L0(map, (ChatGroup) obj, (ChatGroup) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = arrayListN.iterator();
            while (it.hasNext()) {
                jSONArray.put(new JSONObject(((ChatGroup) it.next()).toJson()));
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONArray.toString());
            boqVar.d().b(str, new String[]{strQuote.substring(1, strQuote.length() - 1)});
        } catch (Exception e2) {
            CrashHelper.c(e2);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ String m158x0(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("groupTabs", new JSONArray(GroupTab.JSON_ADAPTER.ARRAY_ADAPTER().serialize(list)));
            jSONObject.put(Data.TYPE, jSONObject2);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final /* synthetic */ void m166A2(boq boqVar, String str, String str2, String str3, RxFacertification.C1573b c1573b) {
        m175J2(boqVar.c(), boqVar.d(), str, str2, str3, c1573b.f305c, "liveVerify", c1573b);
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m167B2(boq boqVar, String str, Throwable th) {
        this.f20c = false;
        boqVar.c().progressDismiss();
        boqVar.d().b(str, new String[]{th instanceof TantanException.Client.CoreService ? String.valueOf(((TantanException.Client.CoreService) th).code) : ""});
        hfw.a("[core][LiveVerify]", "TTFacertificationClient.getInstance().startDetect error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: C2 */
    public final /* synthetic */ void m168C2(final boq boqVar, final String str, final String str2, final String str3, final String str4) {
        if (this.f20c) {
            return;
        }
        this.f20c = true;
        mkd0.z(this.f19b);
        boqVar.c().progress(R.string.J5);
        final String strUserId = qib0.c0.userId();
        final TTFacertificationClient.InterfaceC1574a interfaceC1574aM190Y1 = m190Y1(boqVar.c(), boqVar.d(), str, "liveVerify", boqVar.c().string(R.string.g0));
        c4g0 c4g0VarSubscribe = boqVar.c().duringCreated(SharedLibraryLoader.k().r("facertification")).take(1).flatMap(new w9j() { // from class: l.t67
            public final Object call(Object obj) {
                boq boqVar2 = boqVar;
                String str5 = strUserId;
                String str6 = str2;
                return TTFacertificationClient.m1119p().m1123A(boqVar2.c(), str5, VerificationTokenRequestParam.builder().setIdName(str6).setIdNumber(str3).useNewLiveTemplate(uvf.c(boqVar2.c(), true), false, "aliyun", "3").build(), new rp8(), interfaceC1574aM190Y1, "liveVerify");
            }
        }).subscribe(mkd0.K(new e30() { // from class: l.u67
            public final void call(Object obj) {
                this.f13555a.m166A2(boqVar, str, str4, strUserId, (RxFacertification.C1573b) obj);
            }
        }, new e30() { // from class: l.v67
            public final void call(Object obj) {
                this.f14073a.m167B2(boqVar, str4, (Throwable) obj);
            }
        }, false));
        this.f19b = c4g0VarSubscribe;
        this.f18a.a(c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m169D2(f400 f400Var, String str, String str2, String str3, RxFacertification.C1573b c1573b) {
        m175J2(f400Var.c(), f400Var.d(), str, str2, str3, c1573b.f305c, "liveVerify", c1573b);
    }

    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m170E2(f400 f400Var, String str, Throwable th) {
        this.f20c = false;
        f400Var.c().progressDismiss();
        f400Var.d().b(str, new String[]{th instanceof TantanException.Client.CoreService ? String.valueOf(((TantanException.Client.CoreService) th).code) : ""});
        hfw.a("[core][LiveVerify]", "TTFacertificationClient.getInstance().startDetect error:" + th.getMessage());
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ void m171F2(final f400 f400Var, final String str, final String str2, final String str3, final String str4) {
        if (this.f20c) {
            return;
        }
        this.f20c = true;
        mkd0.z(this.f19b);
        f400Var.c().progress(R.string.J5);
        final String strUserId = qib0.c0.userId();
        final TTFacertificationClient.InterfaceC1574a interfaceC1574aM190Y1 = m190Y1(f400Var.c(), f400Var.d(), str, "liveVerify", f400Var.c().string(R.string.g0));
        c4g0 c4g0VarSubscribe = f400Var.c().duringCreated(SharedLibraryLoader.k().r("facertification")).take(1).flatMap(new w9j() { // from class: l.g27
            public final Object call(Object obj) {
                f400 f400Var2 = f400Var;
                String str5 = strUserId;
                String str6 = str2;
                return TTFacertificationClient.m1119p().m1123A(f400Var2.c(), str5, VerificationTokenRequestParam.builder().setIdName(str6).setIdNumber(str3).useNewLiveTemplate(uvf.c(f400Var2.c(), true), false, "aliyun", "3").build(), new rp8(), interfaceC1574aM190Y1, "liveVerify");
            }
        }).subscribe(mkd0.K(new e30() { // from class: l.h27
            public final void call(Object obj) {
                this.f8559a.m169D2(f400Var, str, str4, strUserId, (RxFacertification.C1573b) obj);
            }
        }, new e30() { // from class: l.i27
            public final void call(Object obj) {
                this.f8870a.m170E2(f400Var, str4, (Throwable) obj);
            }
        }, false));
        this.f19b = c4g0VarSubscribe;
        this.f18a.a(c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: G2 */
    public final /* synthetic */ void m172G2(boq boqVar, String str) {
        MediaRecorderFrag mediaRecorderFrag = new MediaRecorderFrag();
        mediaRecorderFrag.m4(new C0003d(boqVar, str));
        if (NullChecker.a(boqVar.c())) {
            PutongAct putongActC = boqVar.c();
            if (putongActC.isFinishing() || putongActC.isDestroyed()) {
                return;
            }
            mediaRecorderFrag.show(boqVar.c().getSupportFragmentManager(), "update_avatar");
        }
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m173H2(coq coqVar, String str, Picture picture, int i, Picture picture2) {
        coqVar.c().progressDismiss();
        m180O2(coqVar, vwb.f0(new Picture[]{picture2}), str, "file://" + rhi.z(picture.url), null, i);
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m174I2(JSONObject jSONObject, f400 f400Var) {
        this.f23f = jSONObject.optString("success");
        String strOptString = jSONObject.optString("conversation_id");
        String strOptString2 = jSONObject.optString("message_ids");
        int iOptInt = jSONObject.optInt("max_limit", 100);
        this.f24g = new C0007h(f400Var);
        f400Var.c().registerOnActivityResultListener(this.f24g);
        f400Var.c().startActivityForResult(MessagesAct.h2(f400Var.c(), strOptString, true, strOptString2, iOptInt), 1017);
    }

    /* JADX INFO: renamed from: J2 */
    public final void m175J2(final PutongAct putongAct, @NonNull final hoq hoqVar, @Nullable final String str, @Nullable final String str2, String str3, VerificationTokenRequestParam verificationTokenRequestParam, final String str4, final RxFacertification.C1573b c1573b) {
        final wvf wvfVar = c1573b.f303a;
        hfw.a("[core][LiveVerify]", "startDetect finish:" + wvfVar.toString());
        final VerificationToken verificationToken = c1573b.f304b;
        if (!verificationToken.isTencentProvider() || wvfVar.h) {
            final boolean zEquals = TextUtils.equals(wvfVar.b, "2006");
            putongAct.duringCreated(zEquals ? TTFacertificationClient.m1117n(str3) : TTFacertificationClient.m1121v(str3, verificationTokenRequestParam.identity.provider, verificationToken.certifyId)).subscribe(mkd0.H(new e30() { // from class: l.c37
                public final void call(Object obj) {
                    this.f6497a.m210r2(putongAct, zEquals, hoqVar, str, str2, c1573b, wvfVar, verificationToken, str4, (Envelope) obj);
                }
            }, new e30() { // from class: l.d37
                public final void call(Object obj) {
                    this.f6788a.m211s2(putongAct, hoqVar, str2, c1573b, (Throwable) obj);
                }
            }));
        } else {
            this.f20c = false;
            putongAct.progressDismiss();
            tvf.m(wvfVar, verificationToken, putongAct, str4, 2);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m176K2(@NonNull final coq coqVar, Intent intent, final String str, final int i) {
        final List list = (List) intent.getSerializableExtra(MediaPickerBaseAct.h);
        if (vwb.J(list)) {
            m180O2(coqVar, null, str, "", "cancel", i);
        } else {
            coqVar.c().progress(com.p1.mobile.putong.common.R.string.W);
            new lsx(list, false).flatMap(new w9j() { // from class: l.k37
                public final Object call(Object obj) {
                    return qib0.c0.l3(list);
                }
            }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.l37
                public final void call(Object obj) {
                    this.f9858a.m212t2(coqVar, str, i, (List) obj);
                }
            }, new e30() { // from class: l.m37
                public final void call(Object obj) {
                    CoreBridgeImplementation.m20A1(coqVar, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L2 */
    public final void m177L2(@NonNull coq coqVar, Intent intent, String str, int i) {
        List list = (List) intent.getSerializableExtra(MediaPickerBaseAct.h);
        if (vwb.J(list)) {
            m180O2(coqVar, null, str, "", "cancel", i);
            return;
        }
        Media media = (Media) list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            pgm pgmVar = new pgm(rhi.z(picture.url));
            picture.mediaType = pgmVar.c;
            picture.size = new Dimension(pgmVar.d);
            m185T2(coqVar, picture, str, i);
        }
    }

    /* JADX INFO: renamed from: M2 */
    public final void m178M2(coq coqVar, Intent intent, String str) {
        String strSubstring;
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("message_picked");
        if (vwb.J(stringArrayListExtra)) {
            strSubstring = "[]";
        } else {
            String strQuote = JSONObject.quote(new JSONArray((Collection) stringArrayListExtra).toString());
            strSubstring = strQuote.substring(1, strQuote.length() - 1);
        }
        coqVar.d().b(str, new String[]{strSubstring});
    }

    /* JADX INFO: renamed from: N2, reason: merged with bridge method [inline-methods] */
    public final void m215w2(@NonNull boq boqVar, String str, String str2) {
        Conversation conversationXe;
        if (User.isTeamAccount(str) || (conversationXe = CoreModule.c.f0.Xe(str)) == null || TEnum.equals(conversationXe.status, "dismissed")) {
            return;
        }
        if (upa.V1() && ml6.a(conversationXe)) {
            ChatGroup chatGroupS6 = CoreModule.c.g0.s6(conversationXe.otherUser);
            if (NullChecker.a(chatGroupS6) && NullChecker.a(chatGroupS6.punishment) && NullChecker.a(chatGroupS6.punishment.sendMessage)) {
                ChatSendMessage chatSendMessage = chatGroupS6.punishment.sendMessage;
                if (chatSendMessage.active && mqi0.o() < chatSendMessage.until) {
                    return;
                }
            }
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9.state) && NullChecker.a(userP9.state.jailedBusiness) && NullChecker.a(userP9.state.jailedBusiness.groupChat)) {
                JailedGroupChat jailedGroupChat = userP9.state.jailedBusiness.groupChat;
                if (jailedGroupChat.active && jailedGroupChat.expireTime > mqi0.o()) {
                    return;
                }
            }
            ChatGroupMember chatGroupMemberW8 = CoreModule.c.g0.W8(conversationXe.otherUser, CoreModule.H().userId());
            if (NullChecker.a(chatGroupMemberW8) && NullChecker.a(chatGroupMemberW8.silence)) {
                ChatGroupSilence chatGroupSilence = chatGroupMemberW8.silence;
                if (chatGroupSilence.enable && mqi0.o() < chatGroupSilence.until) {
                    return;
                }
            }
        }
        if (!ml6.a(conversationXe)) {
            User userPa = CoreModule.c.e0.Pa(str);
            if (NullChecker.a(userPa) && userPa.unilateralBlock()) {
                return;
            }
        }
        Vibrator vibrator = (Vibrator) boqVar.c().getSystemService("vibrator");
        if (NullChecker.a(vibrator)) {
            int i = Build.VERSION.SDK_INT;
            long[] jArr = this.f25h;
            if (i >= 26) {
                o96.a(vibrator, VibrationEffect.createWaveform(jArr, -1));
            } else {
                vibrator.vibrate(jArr, -1);
            }
        }
        if (b.f(str2)) {
            CoreModule.c.b1.j3();
            CoreModule.c.f0.Bp(str, CoreModule.H().userId(), str2);
        }
    }

    /* JADX INFO: renamed from: O2 */
    public final void m180O2(@NonNull coq coqVar, List<Picture> list, String str, String str2, String str3, int i) {
        String strSubstring;
        try {
            if (vwb.J(list)) {
                strSubstring = "[]";
            } else {
                String strQuote = JSONObject.quote(new JSONArray(Converter.RAW_PICTURE_TO_PICTURE.ARRAY_ADAPTER().serialize(list)).toString());
                strSubstring = strQuote.substring(1, strQuote.length() - 1);
            }
            if (i == 1015) {
                coqVar.d().b(str, new String[]{str2, strSubstring, str3});
            } else {
                coqVar.d().b(str, new String[]{strSubstring, str3});
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: P2 */
    public final void m181P2(@NonNull final boq boqVar, String str, String str2, final String str3) {
        if (!NullChecker.a(str) || str.isEmpty()) {
            return;
        }
        OMSThemeInfo oMSThemeInfoA = yki0.b().a();
        if (NullChecker.a(oMSThemeInfoA) || !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = oMSThemeInfoA.f257id;
            }
            boqVar.c().duringCreated(CoreModule.c.z0.d3(str2, true, str), false).flatMap(new w9j() { // from class: l.f37
                public final Object call(Object obj) {
                    return CoreBridgeImplementation.m21B((OMSThemeInfo) obj);
                }
            }).filter(new n37()).subscribe(mkd0.H(new e30() { // from class: l.o37
                public final void call(Object obj) {
                    boqVar.d().a(str3);
                }
            }, new e30() { // from class: l.p37
                public final void call(Object obj) {
                    CoreBridgeImplementation.m95c0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m182Q2(coq coqVar, String str, String... strArr) {
        if (coqVar instanceof f400) {
            ((f400) coqVar).f(str, strArr);
        } else {
            coqVar.d().b(str, strArr);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public final void m183R2(final coq coqVar, String str, String str2, String str3, String str4, final String str5, final String str6, String str7, String str8) {
        Link link = new Link();
        link.href = str;
        ArrayList arrayListX = ShareHelper.X(str5);
        List listS = ShareHelper.S(coqVar.c(), arrayListX);
        if (TextUtils.isEmpty(str7)) {
            str7 = "adtp";
        }
        if (vwb.J(listS)) {
            lsi0.y("未安装");
            m182Q2(coqVar, str7, "", "error");
        } else {
            final String str9 = str7;
            ark.b1(coqVar.c(), str8, link, str2, str3, str4, arrayListX, new f30() { // from class: l.m57
                public final void call(Object obj, Object obj2) {
                    this.f10232a.m216x2(str6, coqVar, (String) obj, (String) obj2);
                }
            }, new g30() { // from class: l.n57
                /* JADX INFO: renamed from: a */
                public final void m12095a(Object obj, Object obj2, Object obj3) {
                    this.f10665a.m217y2(str5, coqVar, str9, (String) obj, (String) obj2, (Throwable) obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S2 */
    public final void m184S2(coq coqVar) {
        if (this.f24g != null) {
            coqVar.c().unregisterOnActivityResultListener(this.f24g);
        }
        this.f24g = null;
    }

    /* JADX INFO: renamed from: T2 */
    public final void m185T2(@NonNull final coq coqVar, final Picture picture, final String str, final int i) {
        coqVar.c().progress(com.p1.mobile.putong.common.R.string.W);
        new lsx(vwb.f0(new Media[]{picture}), false).flatMap(new w9j() { // from class: l.h37
            public final Object call(Object obj) {
                return qib0.c0.Y1(picture);
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.i37
            public final void call(Object obj) {
                this.f8878a.m173H2(coqVar, str, picture, i, (Picture) obj);
            }
        }, new e30() { // from class: l.j37
            public final void call(Object obj) {
                CoreBridgeImplementation.m120k1(coqVar, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public final String m186U1(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        try {
            String strQuote = JSONObject.quote(jSONObject.toString());
            return strQuote.substring(1, strQuote.length() - 1);
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return "";
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final void m187V1(final WebView webView, final String str) {
        if (NullChecker.a(webView)) {
            e51.M(new Runnable() { // from class: l.v57
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final User m188W1(boolean z, String str) {
        User userM19150clone = CoreModule.c.e0.p9().m19150clone();
        if (z) {
            userM19150clone.description = str;
        }
        userM19150clone.profile.extensions.profileCompletion.briefIntroduction = vwb.c(Collections.EMPTY_LIST, str);
        return userM19150clone.subtract(CoreModule.c.e0.p9());
    }

    /* JADX INFO: renamed from: X1 */
    public final User m189X1() {
        User userM19150clone = CoreModule.c.e0.p9().m19150clone();
        userM19150clone.profile.extensions.profileCompletion.progress = vwb.c(Collections.EMPTY_LIST, SignupStage.finished);
        return userM19150clone.subtract(CoreModule.c.e0.p9());
    }

    @NonNull
    /* JADX INFO: renamed from: Y1 */
    public final TTFacertificationClient.InterfaceC1574a m190Y1(PutongAct putongAct, @NonNull hoq hoqVar, @Nullable String str, String str2, String str3) {
        return new C0002c(putongAct, str2, hoqVar, str);
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m191Z1(@NonNull coq coqVar, String str) {
        if (TextUtils.equals(mu5.c(), "tantanapp")) {
            coqVar.d().b(str, new String[]{"1"});
        } else {
            coqVar.d().b(str, new String[]{"0"});
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m192a() {
        super.a();
        this.f18a.c();
        this.f20c = false;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m193a2(boq boqVar, String str) {
        PurchaseType purchaseType;
        PutongAct putongActC = boqVar.c();
        WebViewX webViewXE = boqVar.e();
        if (!NullChecker.a(putongActC) || !NullChecker.a(webViewXE)) {
            lsi0.h(R.string.zs);
            return;
        }
        FreeTrialData freeTrialDataC4 = CoreModule.c.j0.C4();
        if (CoreModule.c.j0.B4()) {
            purchaseType = PurchaseType.TYPE_GET_VIP;
        } else if (CoreModule.c.j0.A4()) {
            purchaseType = PurchaseType.TYPE_GET_LIKERS;
        } else {
            purchaseType = CoreModule.c.j0.y4() ? PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE : null;
        }
        PurchaseType purchaseType2 = purchaseType;
        StringBuilder sb = new StringBuilder();
        if (purchaseType2 != null) {
            hqo hqoVar = new hqo(putongActC, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            hqoVar.t(new C0004e(putongActC, purchaseType2, sb, str, webViewXE));
            hqoVar.p(aqo.h(putongActC, putongActC.iap().m11610i()), true, freeTrialDataC4.skuId);
        } else {
            lsi0.w(R.string.Xb);
            sb.append("javascript:");
            sb.append(str);
            sb.append("('-1')");
            m187V1(webViewXE, sb.toString());
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m194b2(String str) {
        if (this.f22e) {
            ChatGroup chatGroupS6 = CoreModule.c.g0.s6(str);
            if (!NullChecker.a(chatGroupS6) || TextUtils.isEmpty(chatGroupS6.localConId)) {
                return;
            }
            CoreModule.c.f0.dn(chatGroupS6.localConId);
        }
    }

    @liq(key = "buyFreeTrial")
    public void buyFreeTrial(final boq boqVar, final String str) {
        e51.M(new Runnable() { // from class: l.k57
            @Override // java.lang.Runnable
            public final void run() {
                this.f9613a.m193a2(boqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m195c2(boq boqVar, String str, String str2) {
        this.f22e = true;
        boqVar.d().b(str, new String[]{str2});
    }

    @liq(isMkBridge = true, key = "checkHasChatMessage", nameSpace = "tantan")
    public void checkHasChatMessage(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        f400Var.c().post(new Runnable() { // from class: l.p57
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m104f0(jSONObject, f400Var);
            }
        });
    }

    @liq(isMkBridge = true, key = "commitSuccess", nameSpace = "tantan")
    public void commitSuccess(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        f400Var.c().post(new Runnable() { // from class: l.k67
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m83W0(f400Var, jSONObject);
            }
        });
    }

    @liq(key = "createGroupToH5")
    public void createGroupToH5(@NonNull final boq boqVar) {
        boqVar.c().post(new Runnable() { // from class: l.j57
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m29D1(boqVar);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m196d2(final boq boqVar, final String str, String[] strArr, final String str2) {
        if (!this.f21d) {
            boqVar.c().creates(new e30() { // from class: l.c77
                public final void call(Object obj) {
                    CoreBridgeImplementation.m155w0((Bundle) obj);
                }
            }, new d30() { // from class: l.o17
                public final void call() {
                    this.f10969a.m194b2(str);
                }
            });
            this.f21d = true;
        }
        List listAsList = Arrays.asList(strArr);
        final ArrayList arrayList = new ArrayList();
        boqVar.c().duringCreated(CoreModule.c.g0.P8(str, listAsList, new e30() { // from class: l.p17
            public final void call(Object obj) {
                arrayList.addAll((List) obj);
            }
        }).map(new w9j() { // from class: l.q17
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m48K(arrayList, (roj0) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.r17
            public final void call(Object obj) {
                this.f12449a.m195c2(boqVar, str2, (String) obj);
            }
        }, new e30() { // from class: l.s17
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
    }

    @liq(key = "deleteGroupMember")
    public void deleteGroupMember(@NonNull final boq boqVar, final String str, final String[] strArr, final String str2) {
        e51.M(new Runnable() { // from class: l.f67
            @Override // java.lang.Runnable
            public final void run() {
                this.f7993a.m196d2(boqVar, str, strArr, str2);
            }
        });
    }

    @liq(key = "dialogJumpRecharge")
    public void dialogJumpRecharge(@NonNull final boq boqVar, final String str, final String str2) {
        e51.G(new Runnable() { // from class: l.u47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                new fd5.e(boqVar2.c()).j(n4i0.a(PurchaseType.TYPE_INTL_TTT_COIN)).c(0).d(str).g(new g30() { // from class: l.r67
                    /* JADX INFO: renamed from: a */
                    public final void m13834a(Object obj, Object obj2, Object obj3) {
                        CoreBridgeImplementation.m99d1(boqVar2, str, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).l();
            }
        });
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m197e2(final boq boqVar, final String str) {
        User userM189X1 = m189X1();
        if (NullChecker.a(userM189X1)) {
            boqVar.c().duringCreated(CoreModule.c.e0.u9(userM189X1).flatMap(new w9j() { // from class: l.y67
                public final Object call(Object obj) {
                    return CoreModule.c.f0.up();
                }
            })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.z67
                public final void call(Object obj) {
                    CoreBridgeImplementation.m110h0(boqVar, str, (Envelope) obj);
                }
            }, new e30() { // from class: l.a77
                public final void call(Object obj) {
                    CoreBridgeImplementation.m40H0(boqVar, str, (Throwable) obj);
                }
            }));
        } else {
            CoreModule.c.f0.W0.put(Boolean.TRUE);
            boqVar.d().b(str, new String[]{"FillInfoFinish", "0"});
        }
        CoreModule.c.f0.Y0.put(Boolean.TRUE);
    }

    @liq(key = "enrichProfileParams")
    public void enrichProfileParams(@NonNull final boq boqVar, final String str) {
        e51.G(new Runnable() { // from class: l.r37
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m123l1(boqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m198f2(boq boqVar) {
        this.f24g = new C0007h(boqVar);
        boqVar.c().registerOnActivityResultListener(this.f24g);
        boqVar.c().startActivityForResult(MediaPickerAct.i2(boqVar.c(), 1, false, false, true, (String) null, MediaPickerAct.D, false, false, CoreModule.c.e0.p9().gender, "", false), 1015);
    }

    @liq(key = "fetchUserSuccess")
    public void fetchUserSuccess(@NonNull boq boqVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("uid")) {
                String string = jSONObject.getString("uid");
                if (!TextUtils.isEmpty(string)) {
                    CoreModule.c.f0.e1.put(string);
                }
            }
            if (jSONObject.has("name")) {
                String string2 = jSONObject.getString("name");
                if (!TextUtils.isEmpty(string2)) {
                    CoreModule.c.f0.a1.put(string2);
                }
            }
            if (jSONObject.has("avatar")) {
                String string3 = jSONObject.getString("avatar");
                if (!TextUtils.isEmpty(string3)) {
                    CoreModule.c.f0.b1.put(string3);
                }
            }
            if (jSONObject.has(SeeTextDynamicParam.age)) {
                String string4 = jSONObject.getString(SeeTextDynamicParam.age);
                if (!TextUtils.isEmpty(string4)) {
                    CoreModule.c.f0.c1.put(string4);
                }
            }
            if (jSONObject.has("hideAge")) {
                CoreModule.c.f0.d1.put(Boolean.valueOf(jSONObject.getBoolean("hideAge")));
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m199g2(JSONObject jSONObject, f400 f400Var) {
        int iOptInt = jSONObject.optInt("limit");
        this.f23f = jSONObject.optString("success");
        this.f24g = new C0007h(f400Var);
        f400Var.c().registerOnActivityResultListener(this.f24g);
        f400Var.c().startActivityForResult(MediaPickerAct.c2(f400Var.c(), Math.max(iOptInt, 1), false, false, false), 1016);
    }

    @liq(key = "getAnonymityAvatarById")
    public void getAnonymityAvatarById(@NonNull boq boqVar, String str, boolean z, String str2) {
        boqVar.d().b(str2, new String[]{tbk.l(str, z)});
    }

    @liq(key = "getBusinessCodeAuth")
    public void getBusinessCodeAuth(@NonNull final boq boqVar, final String str) {
        final PutongAct putongActC = boqVar.c();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.M(new Runnable() { // from class: l.o57
            @Override // java.lang.Runnable
            public final void run() {
                putongActC.duringCreated(CoreModule.c.P0.e3(zyc0.j0() ? "1000002" : "1000003", "code", "user_mobile,user_profile", "", "").map(new w9j() { // from class: l.m67
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m130o((OpenSdkCodeAuth) obj);
                    }
                })).subscribe(mkd0.H(new e30() { // from class: l.n67
                    public final void call(Object obj) {
                        boqVar.d().b(str, new String[]{(String) obj});
                    }
                }, new e30() { // from class: l.o67
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m113i0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "getFreeTrialInfo")
    public void getFreeTrialInfo(boq boqVar, String str) {
        FreeTrialData freeTrialDataC4 = CoreModule.c.j0.C4();
        JSONObject jSONObject = new JSONObject();
        try {
            if (NullChecker.a(freeTrialDataC4)) {
                jSONObject.put("promotionType", freeTrialDataC4.promotionType);
                jSONObject.put(StudentVerRejectedReason.startTime, freeTrialDataC4.startTime * 1000);
                jSONObject.put("endTime", freeTrialDataC4.endTime * 1000);
                jSONObject.put("titleText", freeTrialDataC4.titleText);
                jSONObject.put("skuId", freeTrialDataC4.skuId);
                jSONObject.put("serverTime", mqi0.o());
            }
            m187V1(boqVar.e(), "javascript:" + str + "('" + jSONObject.toString() + "')");
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
    }

    @liq(key = "getGpCoinSku")
    public String getGpCoinSku(@NonNull boq boqVar) {
        return new JSONArray((Collection) vwb.Q((List) igj.b.e(), new w9j() { // from class: l.a57
            public final Object call(Object obj) {
                return ((Merchandise) obj).toJson();
            }
        })).toString();
    }

    @liq(key = "getGroupConversionId")
    public void getGroupConversionId(@NonNull final boq boqVar, String str, final String str2) {
        boqVar.c().duringCreated(CoreModule.c.f0.Dg(str)).filter(new oa8()).subscribe(mkd0.G(new e30() { // from class: l.w37
            public final void call(Object obj) {
                boqVar.d().b(str2, new String[]{((DbObject) ((Conversation) obj)).id});
            }
        }));
    }

    @liq(key = "getGroupDescriptionInfo")
    public void getGroupDescriptionInfo(@NonNull final boq boqVar, final String str) {
        c.create(new c.a() { // from class: l.z47
            public final void call(Object obj) {
                ((z3g0) obj).onNext(CoreModule.c.g0.E6());
            }
        }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.b57
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m151v((GroupSetting) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.c57
            public final void call(Object obj) {
                boqVar.d().b(str, new String[]{(String) obj});
            }
        }));
    }

    @liq(key = "getGroupMember")
    public void getGroupMember(@NonNull final boq boqVar, final String str, final String str2) {
        boqVar.c().post(new Runnable() { // from class: l.u27
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                boqVar2.c().duringCreated(CoreModule.c.g0.W6(str).map(new w9j() { // from class: l.s27
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m119k0((List) obj);
                    }
                })).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.t27
                    public final void call(Object obj) {
                        boqVar2.d().b(str, new String[]{(String) obj});
                    }
                }));
            }
        });
    }

    @liq(key = "getGroupSettingInfo")
    public void getGroupSettingInfo(@NonNull final boq boqVar, final String str, final String str2) {
        boqVar.c().duringCreated(CoreModule.c.g0.X8(str)).subscribe(mkd0.H(new e30() { // from class: l.b47
            public final void call(Object obj) {
                CoreBridgeImplementation.m141r1((roj0) obj);
            }
        }, new e30() { // from class: l.c47
            public final void call(Object obj) {
                CoreBridgeImplementation.m114i1((Throwable) obj);
            }
        }));
        boqVar.c().duringCreated(CoreModule.c.g0.Q8(str)).subscribe(mkd0.H(new e30() { // from class: l.d47
            public final void call(Object obj) {
                CoreBridgeImplementation.m36G((roj0) obj);
            }
        }, new e30() { // from class: l.f47
            public final void call(Object obj) {
                CoreBridgeImplementation.m103f((Throwable) obj);
            }
        }));
        boqVar.c().post(new Runnable() { // from class: l.g47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                String str3 = str;
                boqVar2.c().duringCreated(mkd0.s(CoreModule.c.g0.o6(str3).filter(new qh7()).distinctUntilChanged(), CoreModule.c.g0.Y6(str3).filter(new w9j() { // from class: l.x17
                    public final Object call(Object obj) {
                        DbLinks dbLinks = (DbLinks) obj;
                        return Boolean.valueOf(NullChecker.a(dbLinks) && TextUtils.isEmpty(dbLinks.links.next));
                    }
                }).flatMap(new w9j() { // from class: l.z17
                    public final Object call(Object obj) {
                        return CoreModule.c.g0.W6(str3);
                    }
                }), CoreModule.c.f0.Dg(str3), new y9j() { // from class: l.a27
                    /* JADX INFO: renamed from: a */
                    public final Object m8398a(Object obj, Object obj2, Object obj3) {
                        return xaj0.a((ChatGroup) obj, (List) obj2, (Conversation) obj3);
                    }
                }).map(new w9j() { // from class: l.b27
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m67Q0((xaj0) obj);
                    }
                })).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.c27
                    public final void call(Object obj) {
                        boqVar2.d().b(str, new String[]{(String) obj});
                    }
                }, new e30() { // from class: l.d27
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m140r0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "getInternetStatus")
    public void getInternetStatus(@NonNull boq boqVar, String str) {
        if (ConnectivityReceiver.g()) {
            boqVar.d().b(str, new String[]{"0"});
        } else {
            boqVar.d().b(str, new String[]{"1"});
        }
    }

    @liq(key = "getCurrencyType", uiThread = true)
    public void getIntlCurrencyType(boq boqVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currencyType", qib0.D0);
            String strQuote = JSONObject.quote(jSONObject.toString());
            boqVar.d().b(str, new String[]{strQuote.substring(1, strQuote.length() - 1)});
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    @liq(key = "getJoinGroupInfo")
    public void getJoinGroupInfo(@NonNull final boq boqVar, final String str) {
        final HashMap map = new HashMap();
        boqVar.c().duringCreated(mkd0.r(CoreModule.c.f0.sn(), CoreModule.c.g0.I6(), new x9j() { // from class: l.h67
            public final Object call(Object obj, Object obj2) {
                return j760.a(((q860) obj).a, (List) obj2);
            }
        })).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.s67
            public final void call(Object obj) {
                CoreBridgeImplementation.m157x(map, boqVar, str, (j760) obj);
            }
        }));
    }

    @liq(key = "getNetworkEnv")
    public void getNetworkEnv(@NonNull boq boqVar, String str) {
        m191Z1(boqVar, str);
    }

    @liq(key = "getNetworkTantanDevEnv")
    public void getNetworkTantanDevEnv(@NonNull boq boqVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tantan-dev-env", qib0.z.get());
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
        boqVar.d().b(str, new String[]{jSONObject.toString().replace("\"", "\\\"")});
    }

    @liq(key = "getNoticeNumber")
    public void getNoticeNumber(@NonNull final boq boqVar, final String str) {
        CoreModule.c.g0.U8();
        boqVar.c().duringCreated(CoreModule.c.g0.H8().observeOn(Schedulers.io()).map(new w9j() { // from class: l.s37
            public final Object call(Object obj) {
                return CoreBridgeImplementation.m154w((NotificationCounter) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.u37
            public final void call(Object obj) {
                boqVar.d().b(str, new String[]{(String) obj});
            }
        }, new e30() { // from class: l.v37
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
    }

    @liq(key = "getNotificationState")
    public String getNotificationState(@NonNull boq boqVar) {
        return NotificationCheckerCommon.a().toString();
    }

    @liq(key = "getTabData")
    public void getTabData(@NonNull final boq boqVar, final String str) {
        boqVar.c().post(new Runnable() { // from class: l.w47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                boqVar2.c().duringCreated(CoreModule.c.g0.f7().map(new w9j() { // from class: l.w67
                    public final Object call(Object obj) {
                        return CoreBridgeImplementation.m158x0((List) obj);
                    }
                })).subscribe(mkd0.G(new e30() { // from class: l.x67
                    public final void call(Object obj) {
                        boqVar2.d().b(str, new String[]{(String) obj});
                    }
                }));
            }
        });
    }

    @liq(key = "getUserAvatarNum")
    public void getUserAvatarNum(@NonNull final boq boqVar, final String str) {
        e51.G(new Runnable() { // from class: l.l57
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m63P(boqVar, str);
            }
        });
    }

    @liq(key = "getUserIsBanedToAddGroup")
    public void getUserIsBanedToAddGroup(@NonNull final boq boqVar, final String str) {
        boqVar.c().post(new Runnable() { // from class: l.s47
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m86Y(boqVar, str);
            }
        });
    }

    @liq(key = "getWeChatShareInviteUrl")
    public void getWeChatShareInviteUrl(@NonNull final boq boqVar, final String str, final String str2) {
        e51.G(new Runnable() { // from class: l.n47
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                boqVar.d().b(str2, new String[]{tbk.r(str3)});
            }
        });
    }

    @liq(key = "goGroupChat")
    public void goGroupChat(@NonNull final boq boqVar, final String str) {
        boqVar.c().post(new Runnable() { // from class: l.q47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                boqVar2.c().duringCreated(CoreModule.c.f0.Dg(str)).filter(new oa8()).take(1).subscribe(mkd0.G(new e30() { // from class: l.k27
                    public final void call(Object obj) {
                        boq boqVar3 = boqVar2;
                        boqVar3.c().startActivity(MessagesAct.i2(boqVar3.c(), ((DbObject) ((Conversation) obj)).id, false, false));
                    }
                }));
            }
        });
    }

    @liq(key = "guideFillInfoFinish")
    public void guideFillInfoFinish(@NonNull final boq boqVar, final String str) {
        e51.G(new Runnable() { // from class: l.t47
            @Override // java.lang.Runnable
            public final void run() {
                this.f13187a.m197e2(boqVar, str);
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m200h2(String str, boq boqVar, List list) {
        PurchaseType purchaseType;
        if (list == null || list.size() <= 0) {
            lsi0.h(R.string.zs);
            return;
        }
        Merchandise merchandise = (Merchandise) list.get(0);
        if (CoreModule.K().xf()) {
            purchaseType = PurchaseType.TYPE_INTL_DIAMOND;
        } else {
            purchaseType = TextUtils.equals(str, "wallet") ? PurchaseType.TYPE_INTL_TTT_COIN : PurchaseType.TYPE_INTL_TTT_LIVE_COIN;
        }
        hqo hqoVar = new hqo(boqVar.c(), purchaseType);
        hqoVar.t(new C0000a(merchandise, str));
        hqoVar.p(aqo.h(boqVar.c(), boqVar.c() != null ? boqVar.c().iap().m11610i() : null), merchandise.autoRenewable(), merchandise.defaultStockKeepUnit.affiliateProducts.getProductId());
    }

    @liq(key = "h5PayAgain")
    public void h5PayAgain(@NonNull boq boqVar) {
        boqVar.c().finish();
    }

    @liq(key = "h5PayCallBack")
    public void h5PayCallBack(@NonNull boq boqVar, int i, int i2, String str) {
        CoreModule.c.S0.v3().onNext(new xaj0(Integer.valueOf(i), Integer.valueOf(i2), str));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m201i2(boq boqVar, String str, roj0 roj0Var) {
        boqVar.d().b(str, new String[]{m186U1("0")});
    }

    @liq(key = "ifUserVerified")
    public void ifUserVerified(@NonNull final boq boqVar, final String str) {
        boqVar.c().post(new Runnable() { // from class: l.o47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                boqVar2.c().duringCreated(CoreModule.c.e0.o9()).take(1).subscribe(mkd0.H(new e30() { // from class: l.x27
                    public final void call(Object obj) {
                        User user = (User) obj;
                        boqVar2.d().b(str, new String[]{(user.isBanned() || !user.isIdCardVerified()) ? "1" : "0"});
                    }
                }, new e30() { // from class: l.y27
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m149u0((Throwable) obj);
                    }
                }));
            }
        });
    }

    @liq(key = "imagePickerPhoto")
    public void imagePickerPhoto(@NonNull final boq boqVar, String str) {
        this.f23f = str;
        boqVar.c().post(new Runnable() { // from class: l.i57
            @Override // java.lang.Runnable
            public final void run() {
                this.f8903a.m198f2(boqVar);
            }
        });
    }

    @liq(isMkBridge = true, key = "imagesPickerMulti", nameSpace = "tantan")
    public void imagesPickerMulti(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        f400Var.c().post(new Runnable() { // from class: l.j47
            @Override // java.lang.Runnable
            public final void run() {
                this.f9219a.m199g2(jSONObject, f400Var);
            }
        });
    }

    @liq(key = "inviteFriendCompletion")
    public void inviteFriendCompletion(@NonNull boq boqVar, String str) {
        boqVar.c().post(new RunnableC0001b(boqVar, str));
    }

    @liq(key = "invokeGpCoinPay")
    public void invokeGpCoinPay(@NonNull final boq boqVar, String str, final String str2) {
        ProductCategory productCategory;
        if (CoreModule.K().xf()) {
            productCategory = ProductCategory.get("tttDiamond");
        } else {
            productCategory = TextUtils.equals(str2, "wallet") ? ProductCategory.get("tttCoin") : ProductCategory.get("tttLiveCoin");
        }
        CoreModule.c.j0.B5(productCategory, str).compose(mkd0.R()).subscribe(mkd0.H(new e30() { // from class: l.d77
            public final void call(Object obj) {
                this.f6855a.m200h2(str2, boqVar, (List) obj);
            }
        }, new e30() { // from class: l.y17
            public final void call(Object obj) {
                lsi0.h(R.string.zs);
            }
        }));
    }

    @liq(isMkBridge = true, key = "isOpenLocationPermission", nameSpace = "tantan")
    public void isOpenLocationPermission(@NonNull boq boqVar, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("callback");
        if (wvv.q()) {
            boqVar.d().b(strOptString, new String[]{"true"});
        } else {
            boqVar.d().b(strOptString, new String[]{"false"});
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m202j2(boq boqVar, String str, Throwable th) {
        boqVar.d().b(str, new String[]{m186U1("1")});
    }

    @liq(key = "jumpNotificationSettings")
    public void jumpNotificationSettings(@NonNull boq boqVar) {
        uq40.A();
    }

    @liq(key = "jumpToEditProfileAct")
    public void jumpToEditProfileAct(@NonNull final boq boqVar, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals(str, "photo")) {
            e51.M(new Runnable() { // from class: l.e47
                @Override // java.lang.Runnable
                public final void run() {
                    CoreBridgeImplementation.m53L1(boqVar);
                }
            });
        } else {
            e51.M(new Runnable() { // from class: l.p47
                @Override // java.lang.Runnable
                public final void run() {
                    boq boqVar2 = boqVar;
                    boqVar2.c().startActivity(CoreModule.K().yp(boqVar2.c(), ((DbObject) CoreModule.c.e0.p9()).id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, str));
                }
            });
        }
    }

    @liq(key = "jumpToLauncher")
    public void jumpToLauncher(@NonNull boq boqVar) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.addFlags(270532608);
        boqVar.c().startActivity(intent);
    }

    @liq(key = "jumpToProfileAct")
    public void jumpToProfileAct(@NonNull final boq boqVar, final String str) {
        boqVar.c().duringCreated(CoreModule.K().userObsById(str)).take(1).subscribe(mkd0.G(new e30() { // from class: l.y37
            public final void call(Object obj) {
                boq boqVar2 = boqVar;
                boqVar2.c().startActivity(CoreModule.K().startProfileAct(boqVar2.c(), str, "from_questions_answers", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false));
            }
        }));
    }

    @liq(key = "jumpToPush")
    public void jumpToPush(@NonNull boq boqVar) {
        uq40.A();
    }

    @liq(key = "jumpToSeeOrBuySee")
    public void jumpToSeeOrBuySee(@NonNull final boq boqVar) {
        e51.M(new Runnable() { // from class: l.q37
            @Override // java.lang.Runnable
            public final void run() {
                CoreBridgeImplementation.m82W(boqVar);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m203k2(boq boqVar, String str, roj0 roj0Var) {
        boqVar.d().b(str, new String[]{m186U1("0")});
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m204l2(boq boqVar, String str, Throwable th) {
        boqVar.d().b(str, new String[]{m186U1("1")});
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m205m2(boq boqVar, String str, roj0 roj0Var) {
        boqVar.d().b(str, new String[]{m186U1("0")});
    }

    @liq(key = "modifyGroupInfo")
    public void modifyGroupInfo(@NonNull final boq boqVar, String str, String str2, String str3, final String str4) {
        List list;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("name")) {
                boqVar.c().duringCreated(CoreModule.c.g0.M8(str, jSONObject.getString("name"))).subscribe(mkd0.H(new e30() { // from class: l.y57
                    public final void call(Object obj) {
                        this.f15260a.m201i2(boqVar, str4, (roj0) obj);
                    }
                }, new e30() { // from class: l.z57
                    public final void call(Object obj) {
                        this.f15594a.m202j2(boqVar, str4, (Throwable) obj);
                    }
                }));
                return;
            }
            if (jSONObject.has("description")) {
                boqVar.c().duringCreated(CoreModule.c.g0.L8(str, jSONObject.getString("description"))).subscribe(mkd0.H(new e30() { // from class: l.a67
                    public final void call(Object obj) {
                        this.f5589a.m203k2(boqVar, str4, (roj0) obj);
                    }
                }, new e30() { // from class: l.b67
                    public final void call(Object obj) {
                        this.f6115a.m204l2(boqVar, str4, (Throwable) obj);
                    }
                }));
                return;
            }
            if (jSONObject.has("avatar")) {
                try {
                    list = (List) Converter.RAW_PICTURE_TO_PICTURE.ARRAY_ADAPTER().parse(jSONObject.getJSONArray("avatar").toString());
                } catch (IOException e) {
                    CrashHelper.c(e);
                    list = null;
                }
                if (vwb.J(list)) {
                    boqVar.d().b(str4, new String[]{m186U1("1")});
                } else {
                    boqVar.c().duringCreated(CoreModule.c.g0.K8(str, list)).subscribe(mkd0.H(new e30() { // from class: l.c67
                        public final void call(Object obj) {
                            this.f6546a.m205m2(boqVar, str4, (roj0) obj);
                        }
                    }, new e30() { // from class: l.d67
                        public final void call(Object obj) {
                            this.f6839a.m206n2(boqVar, str4, (Throwable) obj);
                        }
                    }));
                }
            }
        } catch (JSONException e2) {
            CrashHelper.c(e2);
        }
    }

    @liq(key = "modifyGroupNickname")
    public void modifyGroupNickname(@NonNull final boq boqVar, final String str, final String str2, String str3, final String str4) {
        boqVar.c().post(new Runnable() { // from class: l.g67
            @Override // java.lang.Runnable
            public final void run() {
                this.f8364a.m209q2(str2, boqVar, str, str4);
            }
        });
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m206n2(boq boqVar, String str, Throwable th) {
        boqVar.d().b(str, new String[]{m186U1("1")});
    }

    @liq(key = "needStartGreetAct")
    public void needStartGreetAct(@NonNull final boq boqVar, final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            boqVar.d().b(str2, new String[]{"syncActionStatus", "true"});
        } else {
            e51.G(new Runnable() { // from class: l.i47
                @Override // java.lang.Runnable
                public final void run() {
                    boq boqVar2 = boqVar;
                    String str3 = str;
                    String str4 = str2;
                    boqVar2.c().duringCreated(CoreModule.c.f0.Ue(str3)).take(1).subscribe(mkd0.H(new e30() { // from class: l.t17
                        public final void call(Object obj) {
                            CoreBridgeImplementation.m101e0(boqVar2, str4, (Conversation) obj);
                        }
                    }, new e30() { // from class: l.u17
                        public final void call(Object obj) {
                            boqVar2.d().b(str4, new String[]{"syncActionStatus", "true"});
                        }
                    }));
                }
            });
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m207o2(boq boqVar, String str, roj0 roj0Var) {
        boqVar.c().progressDismiss();
        boqVar.d().b(str, new String[]{m186U1("0")});
    }

    @liq(isMkBridge = true, key = "chatAssistantProfileQuestionDlgClose", nameSpace = "tantan_usercenter", uiThread = true)
    public void onChatAssistantProfileDlgClose(@NonNull f400 f400Var, JSONObject jSONObject) {
        final boolean zOptBoolean = jSONObject.optBoolean("add", false);
        e51.M(new Runnable() { // from class: l.v47
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U1.S.onNext(Boolean.valueOf(zOptBoolean));
            }
        });
    }

    @liq(key = "openGroupMemberProfile")
    public void openGroupMemberProfile(@NonNull boq boqVar, String str, boolean z) {
        boqVar.c().startActivity(tbk.e(boqVar.c(), str, z ? "chat_group_anonymity" : "chat_group"));
    }

    @liq(key = "openNativeDialog")
    public void openNativeDialog(@NonNull final boq boqVar, final String str) {
        boqVar.c().post(new Runnable() { // from class: l.r47
            @Override // java.lang.Runnable
            public final void run() {
                bpq.b(boqVar.c(), str);
            }
        });
    }

    @liq(key = "openOfflineWebview")
    public void openOfflineWebview(@NonNull boq boqVar, String str) {
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter("pageId");
        if (TextUtils.isEmpty(queryParameter)) {
            boqVar.c().startActivity(WebViewAct.Z1(boqVar.c(), "", str));
            return;
        }
        String strJ = lip0.i().j(boqVar.c(), queryParameter);
        int iIndexOf = str.indexOf("?");
        String strSubstring = iIndexOf >= 0 ? str.substring(iIndexOf + 1) : "";
        if (!TextUtils.isEmpty(strSubstring)) {
            strJ = strJ + "?" + strSubstring;
        }
        Intent intentA2 = WebViewAct.a2(boqVar.c(), "", strJ, true);
        if (TextUtils.equals(uri.getQueryParameter("hideNavigationBar"), "1")) {
            intentA2.putExtra("hideNavigationBar", true);
        }
        boqVar.c().startActivity(intentA2);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m208p2(boq boqVar, String str, Throwable th) {
        boqVar.c().progressDismiss();
        boqVar.d().b(str, new String[]{m186U1("1")});
        bx6.b(th);
    }

    @liq(key = "purchase")
    public void purchase(@NonNull final boq boqVar, final String str, final String str2, final String str3) {
        boqVar.c().post(new Runnable() { // from class: l.l47
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                euk.e(boqVar2.c(), boqVar2.e(), str, str2, str3, "");
            }
        });
    }

    @liq(key = "purchaseWithTracker")
    public void purchaseWithTracker(@NonNull final boq boqVar, final String str, final String str2, final String str3, final String str4) {
        boqVar.c().post(new Runnable() { // from class: l.u57
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                euk.e(boqVar2.c(), boqVar2.e(), str, str2, str3, str4);
            }
        });
    }

    @liq(key = "pushState")
    public boolean pushState(@NonNull boq boqVar) {
        return NotificationCheckerCommon.a() == NotificationCheckerCommon.State.closed;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m209q2(String str, final boq boqVar, String str2, final String str3) {
        if (qib0.Z.K(str) || qib0.Z.P(str)) {
            lsi0.w(R.string.v1);
        } else {
            boqVar.c().progress("");
            boqVar.c().duringCreated(CoreModule.c.g0.N8(str2, str, true)).subscribe(mkd0.H(new e30() { // from class: l.e27
                public final void call(Object obj) {
                    this.f7172a.m207o2(boqVar, str3, (roj0) obj);
                }
            }, new e30() { // from class: l.f27
                public final void call(Object obj) {
                    this.f7521a.m208p2(boqVar, str3, (Throwable) obj);
                }
            }));
        }
    }

    @liq(key = "queryOrderId")
    public String queryOrderId(@NonNull boq boqVar, String str) {
        return CoreModule.c.S0.A3(str);
    }

    @liq(key = "quitCurrentGroup")
    public void quiteCurrentGroup(@NonNull final boq boqVar, final String str, final String str2) {
        boqVar.c().duringCreated(mkd0.r(CoreModule.c.g0.o6(str), CoreModule.c.f0.Dg(str), new x9j() { // from class: l.e57
            public final Object call(Object obj, Object obj2) {
                return j760.a((ChatGroup) obj, (Conversation) obj2);
            }
        }).flatMap(new w9j() { // from class: l.f57
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return CoreModule.c.g0.w6(str, NullChecker.a(j760Var.b) ? ((DbObject) ((Conversation) j760Var.b)).id : ((ChatGroup) j760Var.a).localConId);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.g57
            public final void call(Object obj) {
                boqVar.d().b(str2, new String[]{"0"});
            }
        }, new e30() { // from class: l.h57
            public final void call(Object obj) {
                boqVar.d().b(str2, new String[]{"1"});
            }
        }));
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m210r2(PutongAct putongAct, boolean z, hoq hoqVar, String str, String str2, RxFacertification.C1573b c1573b, wvf wvfVar, VerificationToken verificationToken, String str3, Envelope envelope) {
        hfw.a("[core][LiveVerify]", "patchLiveVerificationResult:" + envelope.toString());
        this.f20c = false;
        putongAct.progressDismiss();
        if (z) {
            if (qib0.c0.I(envelope)) {
                hoqVar.a(str);
                return;
            } else {
                hoqVar.b(str2, new String[]{c1573b.f303a.b});
                return;
            }
        }
        if (!TextUtils.equals(wvfVar.b, "1000")) {
            kwk0.H(putongAct, wvfVar, verificationToken, str3);
            return;
        }
        wvf wvfVar2 = c1573b.f303a;
        if (wvfVar2.h) {
            hoqVar.a(str);
        } else {
            hoqVar.b(str2, new String[]{wvfVar2.b});
        }
    }

    @liq(key = "refreshBoostStatus")
    public void refreshBoostStatus(@NonNull boq boqVar) {
        CoreModule.c.J0.V3();
    }

    @liq(key = "refreshPrivileges")
    public void refreshPrivileges(@NonNull boq boqVar) {
        CoreModule.c.C0.u4();
        CoreModule.c.e0.H9();
        CoreModule.c.e0.W9(qib0.b0.a.userId());
    }

    @liq(key = "refreshUserCounters")
    public void refreshUserCounters(@NonNull boq boqVar) {
        CoreModule.c.e0.H9();
        CoreModule.c.e0.W9(qib0.b0.a.userId());
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m211s2(PutongAct putongAct, hoq hoqVar, String str, RxFacertification.C1573b c1573b, Throwable th) {
        StringBuilder sb = new StringBuilder("patchLiveVerificationResult error:");
        sb.append(th == null ? "null" : th.getMessage());
        hfw.a("[core][LiveVerify]", sb.toString());
        this.f20c = false;
        putongAct.progressDismiss();
        hoqVar.b(str, new String[]{c1573b.f303a.b});
        lsi0.y(putongAct.string(R.string.hr));
    }

    @liq(key = "saveDescription")
    public void saveDescription(@NonNull final boq boqVar, final String str, final String str2) {
        e51.G(new Runnable() { // from class: l.a47
            @Override // java.lang.Runnable
            public final void run() {
                this.f5572a.m213u2(boqVar, str2, str);
            }
        });
    }

    @liq(key = "saveLastConversation")
    public void saveLastConversation(@NonNull boq boqVar, String str) {
        CoreModule.c.f0.R0.put(str);
    }

    @liq(key = "savePayOrderId")
    public void savePayOrderId(@NonNull boq boqVar, String str, String str2) {
        CoreModule.c.S0.r3(str, str2);
    }

    @liq(isMkBridge = true, key = "selectChatMessages", nameSpace = "tantan")
    public void selectChatMessages(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        f400Var.c().post(new Runnable() { // from class: l.x57
            @Override // java.lang.Runnable
            public final void run() {
                this.f14772a.m214v2(jSONObject, f400Var);
            }
        });
    }

    @liq(key = "sendTickleMessage")
    public void sendTickleMessage(@NonNull final boq boqVar, final String str, final String str2) {
        e51.G(new Runnable() { // from class: l.y47
            @Override // java.lang.Runnable
            public final void run() {
                this.f15248a.m215w2(boqVar, str, str2);
            }
        });
    }

    @liq(key = "setShowThemeCard")
    public void setShowThemeCard(@NonNull boq boqVar, String str, String str2) {
        m181P2(boqVar, str, null, str2);
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
        e51.F(f400Var.c(), new Runnable() { // from class: l.d57
            @Override // java.lang.Runnable
            public final void run() {
                f400 f400Var2 = f400Var;
                CoreDlg.Q1(f400Var2.c(), strOptString, strOptString2, strOptString3, iOptInt, strOptString4, strOptString5, string, strOptString6, new f30() { // from class: l.b37
                    public final void call(Object obj, Object obj2) {
                        f400Var2.d().b(str, new String[]{(String) obj, (String) obj2});
                    }
                });
            }
        });
    }

    @liq(isMkBridge = true, key = "shareNew", nameSpace = "tantan", uiThread = true)
    public void shareNew(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.x47
            @Override // java.lang.Runnable
            public final void run() {
                this.f14762a.m218z2(jSONObject, f400Var);
            }
        });
    }

    @liq(isMkBridge = true, key = "showLocationAuthguide", nameSpace = "tantan")
    public void showLocationAuthguide(@NonNull final boq boqVar, JSONObject jSONObject) {
        e51.G(new Runnable() { // from class: l.l67
            @Override // java.lang.Runnable
            public final void run() {
                wvv.h(boqVar.c());
            }
        });
    }

    @liq(key = "showNativeVerified")
    public void showNativeVerified(@NonNull final boq boqVar) {
        boqVar.c().post(new Runnable() { // from class: l.h47
            @Override // java.lang.Runnable
            public final void run() {
                tbk.u(boqVar.c());
            }
        });
    }

    @liq(key = "showSvipGift")
    public String showSvipGift(@NonNull boq boqVar) {
        boolean zA = s8b0.a();
        s8b0.d(0);
        return String.valueOf(zA);
    }

    @liq(isMkBridge = true, key = "startAliyunLiveVerify", nameSpace = "tantan_live")
    public void startAliyunLiveVerify(@NonNull final f400 f400Var, JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("name");
        final String strOptString2 = jSONObject.optString("idCardNum");
        final String strOptString3 = jSONObject.optString("success");
        final String strOptString4 = jSONObject.optString("fail");
        e51.M(new Runnable() { // from class: l.z37
            @Override // java.lang.Runnable
            public final void run() {
                this.f15567a.m171F2(f400Var, strOptString3, strOptString, strOptString2, strOptString4);
            }
        });
    }

    @liq(key = "startGreetAct")
    public void startGreetAct(@NonNull final boq boqVar, final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.G(new Runnable() { // from class: l.e67
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                String str2 = str;
                boqVar2.c().duringCreated(CoreModule.c.f0.Ue(str2)).take(1).subscribe(mkd0.H(new e30() { // from class: l.v27
                    public final void call(Object obj) {
                        CoreBridgeImplementation.m76T0(boqVar2, str2, (Conversation) obj);
                    }
                }, new e30() { // from class: l.w27
                    public final void call(Object obj) {
                        d.a(boqVar2.c(), new d.a(str2, "from_h5_suggest_user"));
                    }
                }));
            }
        });
    }

    @liq(key = "startMessagesAct")
    public void startMessagesAct(@NonNull boq boqVar, String str) {
        boqVar.c().startActivity(MessagesAct.k2(boqVar.c(), str, true, false, 22));
    }

    @liq(key = "switchDisturb")
    public void switchDisturb(@NonNull final boq boqVar, String str, boolean z, final String str2) {
        boqVar.c().duringCreated(CoreModule.c.g0.G8(str, z)).subscribe(mkd0.H(new e30() { // from class: l.i67
            public final void call(Object obj) {
                boqVar.d().b(str2, new String[]{"0"});
            }
        }, new e30() { // from class: l.j67
            public final void call(Object obj) {
                boqVar.d().b(str2, new String[]{"1"});
            }
        }));
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m212t2(coq coqVar, String str, int i, List list) {
        coqVar.c().progressDismiss();
        m180O2(coqVar, list, str, "", null, i);
    }

    @liq(key = "toConversation")
    public void toConversation(@NonNull final boq boqVar, final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            boqVar.d().b(str2, new String[]{"syncActionStatus", "0"});
        } else {
            e51.G(new Runnable() { // from class: l.x37
                @Override // java.lang.Runnable
                public final void run() {
                    boq boqVar2 = boqVar;
                    String str3 = str;
                    String str4 = str2;
                    boqVar2.c().duringCreated(CoreModule.c.f0.Ue(str3)).take(1).subscribe(mkd0.H(new e30() { // from class: l.v17
                        public final void call(Object obj) {
                            CoreBridgeImplementation.m51L(boqVar2, str4, str3, (Conversation) obj);
                        }
                    }, new e30() { // from class: l.w17
                        public final void call(Object obj) {
                            boqVar2.d().b(str4, new String[]{"syncActionStatus", "0"});
                        }
                    }));
                }
            });
        }
    }

    @liq(key = "triggerEndRemark")
    public void triggerEndRemark(@NonNull boq boqVar) {
        CoreModule.c.f0.X0.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m213u2(final boq boqVar, final String str, String str2) {
        User userM188W1;
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            if (TextUtils.isEmpty(userP9.description)) {
                boqVar.d().b(str, new String[]{"shouldSave", "1"});
                userM188W1 = m188W1(true, str2);
            } else {
                boqVar.d().b(str, new String[]{"shouldSave", "0"});
                userM188W1 = m188W1(false, str2);
            }
            if (NullChecker.a(userM188W1)) {
                boqVar.c().duringCreated(CoreModule.c.e0.u9(userM188W1)).subscribe(mkd0.H(new e30() { // from class: l.z27
                    public final void call(Object obj) {
                        boqVar.d().b(str, new String[]{"SaveDescription", "1"});
                    }
                }, new e30() { // from class: l.a37
                    public final void call(Object obj) {
                        boqVar.d().b(str, new String[]{"SaveDescription", "0"});
                    }
                }));
            } else {
                boqVar.d().b(str, new String[]{"SaveDescription", "0"});
            }
        }
    }

    @liq(key = "updateAvatar")
    public void updateAvatar(@NonNull final boq boqVar, final String str) {
        e51.G(new Runnable() { // from class: l.w57
            @Override // java.lang.Runnable
            public final void run() {
                this.f14406a.m172G2(boqVar, str);
            }
        });
    }

    @liq(key = "userAccessoryText")
    public void userAccessoryText(@NonNull boq boqVar, String str) {
        CoreModule.c.f0.U0.put(str);
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m214v2(JSONObject jSONObject, f400 f400Var) {
        this.f23f = jSONObject.optString("success");
        String strOptString = jSONObject.optString("user_id");
        String strOptString2 = jSONObject.optString("message_ids");
        int iOptInt = jSONObject.optInt("max_limit");
        this.f24g = new C0007h(f400Var);
        f400Var.c().registerOnActivityResultListener(this.f24g);
        f400Var.c().startActivityForResult(MessagesAct.h2(f400Var.c(), strOptString, true, strOptString2, iOptInt), 1017);
    }

    @liq(isMkBridge = true, key = "v2GetRecentlyNumMessage", nameSpace = "tantan")
    public void v2GetRecentlyNumMessage(@NonNull f400 f400Var, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("success");
        String strOptString2 = jSONObject.optString("conversation_id");
        int iOptInt = jSONObject.optInt("num");
        if (TextUtils.isEmpty(strOptString2)) {
            return;
        }
        f400Var.c().duringCreated(c.create(new c.a() { // from class: l.r57
            public final void call(Object obj) {
                ((z3g0) obj).onNext(roj0.a);
            }
        }).observeOn(Schedulers.io()).map(new C0006g(strOptString2, iOptInt)).observeOn(jo0.a()).map(new C0005f(f400Var, strOptString))).subscribe(mkd0.H(new e30() { // from class: l.s57
            public final void call(Object obj) {
                CoreBridgeImplementation.m115j((roj0) obj);
            }
        }, new e30() { // from class: l.t57
            public final void call(Object obj) {
                CoreBridgeImplementation.m127n((Throwable) obj);
            }
        }));
    }

    @liq(isMkBridge = true, key = "v2SelectChatMessages", nameSpace = "tantan")
    public void v2SelectChatMessages(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.F(f400Var.c(), new Runnable() { // from class: l.k47
            @Override // java.lang.Runnable
            public final void run() {
                this.f9597a.m174I2(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public final /* synthetic */ void m216x2(String str, coq coqVar, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = "adtp";
        }
        m182Q2(coqVar, str, str2, str3);
    }

    /* JADX INFO: renamed from: y2 */
    public final /* synthetic */ void m217y2(String str, coq coqVar, String str2, String str3, String str4, Throwable th) {
        ShareHelper.b0(ShareHelper.X(str), th);
        m182Q2(coqVar, str2, str3, str4);
    }

    /* JADX INFO: renamed from: z2 */
    public final /* synthetic */ void m218z2(JSONObject jSONObject, f400 f400Var) {
        m183R2(f400Var, jSONObject.optString("url"), jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("imgUrl"), jSONObject.optString("channel"), jSONObject.optString("from"), jSONObject.optString("successHandler"), jSONObject.optString("errorHandler"));
    }

    @liq(key = "setShowThemeCard")
    public void setShowThemeCard(@NonNull boq boqVar, String str, String str2, String str3) {
        m181P2(boqVar, str, str3, str2);
    }

    @liq(key = "shareNew", uiThread = true)
    public void shareNew(@NonNull boq boqVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        m183R2(boqVar, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @liq(key = "showLocationAuthguide")
    public void showLocationAuthguide(@NonNull final boq boqVar) {
        e51.G(new Runnable() { // from class: l.t37
            @Override // java.lang.Runnable
            public final void run() {
                wvv.h(boqVar.c());
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
        e51.M(new Runnable() { // from class: l.m47
            @Override // java.lang.Runnable
            public final void run() {
                this.f10213a.m168C2(boqVar, str3, str, str2, str4);
            }
        });
    }

    @liq(key = "isOpenLocationPermission")
    public void isOpenLocationPermission(@NonNull boq boqVar, String str) {
        if (wvv.q()) {
            boqVar.d().b(str, new String[]{"true"});
        } else {
            boqVar.d().b(str, new String[]{"false"});
        }
    }

    @liq(key = "privateMatchSettingsIntroFinished")
    public void privateMatchSettingsIntroFinished(@NonNull boq boqVar, boolean z) {
    }

    @liq(key = "shareFriends")
    public void shareFriends(@NonNull final boq boqVar, final String str, final int i, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8) {
        e51.F(boqVar.c(), new Runnable() { // from class: l.j27
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                CoreDlg.Q1(boqVar2.c(), str, str2, str3, i, str4, str5, str6, str7, new f30() { // from class: l.b77
                    public final void call(Object obj, Object obj2) {
                        boqVar2.d().b(str, new String[]{(String) obj, (String) obj2});
                    }
                });
            }
        });
    }

    @liq(key = "shareFriends")
    public void shareFriends(@NonNull final boq boqVar, final String str, final int i, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7) {
        e51.G(new Runnable() { // from class: l.q57
            @Override // java.lang.Runnable
            public final void run() {
                boq boqVar2 = boqVar;
                CoreDlg.R1(boqVar2.c(), str, str2, str3, i, str4, str5, str6, new f30() { // from class: l.l27
                    public final void call(Object obj, Object obj2) {
                        boqVar2.d().b(str, new String[]{(String) obj, (String) obj2});
                    }
                });
            }
        });
    }
}
