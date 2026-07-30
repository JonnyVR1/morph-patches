package com.p051p1.mobile.putong.core.p058ui.jsbridge;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreInnerPush;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.AiPictureConfig;
import com.p051p1.mobile.putong.core.data.ChatMMAndUserInfo;
import com.p051p1.mobile.putong.core.data.ChatMMUserInfo;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.data.ReportFrom;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookUnMatchAct;
import com.p051p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.jsbridge.TantanCoreBridge;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopFragAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSThemeInfo;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.UnlockConversationType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.math.p135ec.Tnaf;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VListCell;
import p153l.bkj0;
import p153l.c9c0;
import p153l.ecj;
import p153l.fo0;
import p153l.h39;
import p153l.i4g0;
import p153l.iz40;
import p153l.jyb;
import p153l.l4g0;
import p153l.l51;
import p153l.o1j0;
import p153l.ovb0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.qu2;
import p153l.r47;
import p153l.rgr;
import p153l.rv4;
import p153l.s7a;
import p153l.ua5;
import p153l.uqb0;
import p153l.uxj0;
import p153l.v4j0;
import p153l.vg60;
import p153l.w1e;
import p153l.w20;
import p153l.w30;
import p153l.wc00;
import p153l.we60;
import p153l.xc00;
import p153l.xg0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class TantanCoreBridge extends wc00 {

    /* JADX INFO: renamed from: h */
    public static C22508b<CoreInnerPush.C4867a> f30792h = C22508b.m222767b();

    /* JADX INFO: renamed from: i */
    public static C22508b<ovb0<String, Integer, Integer, Integer>> f30793i = C22508b.m222767b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$a */
    public class C8559a implements qcj<Conversation, bkj0<Conversation, User, User>> {
        public C8559a() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bkj0<Conversation, User, User> call(Conversation conversation) {
            if (!NullChecker.m82486a(conversation)) {
                return null;
            }
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(conversation.otherUser);
            if (NullChecker.m82486a(userM116593na) && NullChecker.m82486a(userM116597oa)) {
                return new bkj0<>(conversation, userM116593na, userM116597oa);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$b */
    public class DialogInterfaceOnDismissListenerC8560b implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f30795a;

        public DialogInterfaceOnDismissListenerC8560b(l4g0 l4g0Var) {
            this.f30795a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f30795a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$c */
    public class C8561c implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f30797a;

        public C8561c(PutongAct putongAct) {
            this.f30797a = putongAct;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            PutongAct putongAct = this.f30797a;
            putongAct.startActivity(NewMainAct.m40697M5(putongAct, NavigationIntent.get(NavigationIntent.menu)));
            this.f30797a.m68056e2();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$d */
    public class C8562d implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f30799a;

        public C8562d(PutongAct putongAct) {
            this.f30799a = putongAct;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            PutongAct putongAct = this.f30799a;
            putongAct.startActivity(NewMainAct.m40697M5(putongAct, NavigationIntent.get(NavigationIntent.menu)));
            this.f30799a.m68056e2();
            return false;
        }
    }

    public TantanCoreBridge(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m47748K(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m47750M(Throwable th) {
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ C22421c m47753P(String str, String str2, final File file) {
        Message messageNew_ = Message.new_();
        messageNew_.value = "送你一张魔法照，我最喜欢这张" + str + "风格的你！";
        messageNew_.messageType = MessageType.get("text");
        return CoreModule.f18264c.f20384f0.m33652Fn(str2, messageNew_, null, false, false).flatMap(new qcj() { // from class: l.tbi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just(file);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m47754Q(PutongAct putongAct, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        C8927c.m54692z0(putongAct, str, Privilege.letter, PurchaseType.TYPE_GET_VIP, null, 0);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ Pair m47755R(Conversation conversation) {
        return new Pair(conversation, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m47756S(xc00 xc00Var, String str, vg60 vg60Var) {
        if (NullChecker.m82486a(vg60Var)) {
            try {
                xc00Var.mo99544d().mo97004b(str, String.valueOf(vg60Var.f184001a.size()));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ C22421c m47757T(Conversation conversation) {
        return conversation == null ? CoreModule.f18264c.f20384f0.m33653Fo() : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m47758U(w30[] w30VarArr, View view) {
        i4g0.m138520r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        if (NullChecker.m82486a(w30VarArr[0])) {
            w30VarArr[0].m204614b();
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m47760W(xc00 xc00Var) {
        xc00Var.mo99543c().startActivity(NewMainAct.m40697M5(xc00Var.mo99543c(), NavigationIntent.get("profile")));
        we60.m205991a(xc00Var.mo99543c(), CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m47761X(JSONObject jSONObject, final xc00 xc00Var) {
        String strOptString = jSONObject.optString("questionnaires");
        String strOptString2 = jSONObject.optString("answers");
        String strOptString3 = jSONObject.optString("identifier");
        final String strOptString4 = jSONObject.optString("successFn");
        if (TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        xc00Var.mo99543c().duringCreated((C22421c) CoreModule.f18264c.f20444z0.m195164d3(strOptString3, true, strOptString), false).flatMap(new qcj() { // from class: l.vbi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TantanCoreBridge.m47772i0((OMSThemeInfo) obj);
            }
        }).filter(new r47()).subscribe(psd0.m173597H(new y20() { // from class: l.wbi0
            @Override // p153l.y20
            public final void call(Object obj) {
                xc00Var.mo99544d().mo97003a(strOptString4);
            }
        }, new y20() { // from class: l.xbi0
            @Override // p153l.y20
            public final void call(Object obj) {
                TantanCoreBridge.m47750M((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ boolean m47763Z(xc00 xc00Var, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        xc00Var.mo99541a().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m47764a0(Throwable th) {
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m47765b0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m47771h0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ C22421c m47772i0(OMSThemeInfo oMSThemeInfo) {
        if (NullChecker.m82486a(oMSThemeInfo)) {
            return CoreModule.f18264c.f20405m0.m32026M5();
        }
        o1j0.m165636j("网络不给力，稍后再试吧");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m47774k0(JSONObject jSONObject, xc00 xc00Var, List list) {
        JSONArray jSONArray = new JSONArray();
        if (!jyb.m147479J(list)) {
            int size = list.size() <= 3 ? list.size() : 3;
            for (int i = 0; i < size; i++) {
                if (NullChecker.m82486a((Conversation) list.get(i))) {
                    jSONArray.put(((Conversation) list.get(i)).otherUser);
                }
            }
        }
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        xc00Var.mo99544d().mo97004b(strOptString, jSONArray.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m47776m0(final xc00 xc00Var, String str) {
        CoreModule.f18264c.f20384f0.m33653Fo();
        xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(str).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.aci0
            @Override // p153l.y20
            public final void call(Object obj) {
                cfx.m109657a(xc00Var.mo99543c(), (User) obj);
            }
        }, new y20() { // from class: l.bci0
            @Override // p153l.y20
            public final void call(Object obj) {
                TantanCoreBridge.m47748K((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ C22421c m47779p0(File file) {
        return file == null ? C22421c.create(new C22421c.a() { // from class: l.dci0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((gcg0) obj).onError(null);
            }
        }) : C22421c.just(file);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m47781r0(PutongAct putongAct, User user) {
        if (NullChecker.m82486a(user)) {
            rgr.m181477n(putongAct, user, true, false, false, "logout_ab", null, new y20() { // from class: l.qbi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TantanCoreBridge.m47784u0((Relationship) obj);
                }
            }, new y20() { // from class: l.sbi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TantanCoreBridge.m47771h0((Throwable) obj);
                }
            }, "p_delete_account_chat_block", null, null, null);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m47784u0(Relationship relationship) {
    }

    /* JADX INFO: renamed from: B0 */
    public final void m47787B0(xc00 xc00Var, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "false");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        m47833x0(xc00Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: C0 */
    public void m47788C0(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("callback");
        AiPictureConfig aiPictureConfigM133443g = h39.m133443g();
        if (aiPictureConfigM133443g == null) {
            m47787B0(xc00Var, strOptString);
        } else {
            m47826o1(xc00Var, strOptString, aiPictureConfigM133443g.timeout);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m47789D0(final xc00 xc00Var, final JSONObject jSONObject) {
        if (xc00Var == null || jSONObject == null) {
            return;
        }
        try {
            xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m34056ng()).subscribe(psd0.m173597H(new y20() { // from class: l.fbi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TantanCoreBridge.m47774k0(jSONObject, xc00Var, (List) obj);
                }
            }, new y20() { // from class: l.hbi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TantanCoreBridge.m47765b0((Throwable) obj);
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m47790E0(final xc00 xc00Var, final JSONObject jSONObject) {
        try {
            l51.m152893M(new Runnable() { // from class: l.wai0
                @Override // java.lang.Runnable
                public final void run() {
                    xc00Var.mo99544d().mo97004b(jSONObject.optString("callback"), gra.m131778z() ? "1" : "0");
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final void m47791F0(xc00 xc00Var, JSONObject jSONObject) {
        String str;
        try {
            if (!jyb.m147479J(CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded)) {
                Iterator<CoreSuggested.UserInfo> it = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    CoreSuggested.UserInfo next = it.next();
                    User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(next.f20214id);
                    if (NullChecker.m82486a(userM116597oa) && userM116597oa.settings.userShareTip().booleanValue()) {
                        str = next.f20214id;
                        break;
                    }
                }
            } else {
                str = "";
                break;
            }
            String strOptString = jSONObject.optString("callback");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            xc00Var.mo99544d().mo97004b(strOptString, TextUtils.isEmpty(str) ? "" : str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m47792G0(final xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || xc00Var.mo99543c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("callback");
        final String strOptString2 = jSONObject.optString("current_session_id");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return;
        }
        this.f188308d.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33823Ue(strOptString2).take(1).map(new C8559a())).subscribe(psd0.m173596G(new y20() { // from class: l.dbi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87674a.m47802Q0(xc00Var, strOptString, strOptString2, (bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m47793H0() {
        PutongAct putongAct = this.f188308d;
        putongAct.startActivity(ConversationAddressBookUnMatchAct.m42894a2(putongAct));
    }

    /* JADX INFO: renamed from: I0 */
    public final void m47794I0() {
        PutongAct putongAct = this.f188308d;
        putongAct.startActivity(ConversationSearchAct.m43562c2(putongAct, -qa00.m175859d(53.5f), "", ConversationSearchAct.f26695o, new ArrayList(), new ArrayList()));
    }

    /* JADX INFO: renamed from: J0 */
    public final void m47795J0() {
        l51.m152886F(this.f188308d, new Runnable() { // from class: l.ebi0
            @Override // java.lang.Runnable
            public final void run() {
                v4j0.m199704b();
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public final void m47796K0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.zai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f203571a.m47804S0(xc00Var, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public void m47797L0(@NonNull final xc00 xc00Var, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            final String strOptString = jSONObject.optString("inputType");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (TextUtils.equals(strOptString, ReminderAction.photo)) {
                l51.m152893M(new Runnable() { // from class: l.rbi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TantanCoreBridge.m47760W(xc00Var);
                    }
                });
            } else {
                l51.m152893M(new Runnable() { // from class: l.cci0
                    @Override // java.lang.Runnable
                    public final void run() {
                        xc00 xc00Var2 = xc00Var;
                        xc00Var2.mo99543c().startActivity(CoreModule.m30930K().mo31843yp(xc00Var2.mo99543c(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, strOptString));
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m47798M0(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null) {
            return;
        }
        xc00Var.mo99543c().startActivity(ProfileLoopFragAct.m52832Z1(xc00Var.mo99543c(), LoopInputType.GAME_CP));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m47799N0(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || xc00Var.mo99543c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("profile_user_id");
        final String strOptString2 = jSONObject.optString("purchaseShowFrom");
        final String strOptString3 = jSONObject.optString("channel", "");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f188308d.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33823Ue(strOptString).flatMap(new qcj() { // from class: l.xai0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TantanCoreBridge.m47757T((Conversation) obj);
            }
        })).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.yai0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198208a.m47805T0(strOptString, strOptString2, strOptString3, (uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O0 */
    public final void m47800O0(final xc00 xc00Var, JSONObject jSONObject) {
        final String str;
        final String strOptString = jSONObject.optString("userId");
        String strOptString2 = jSONObject.optString("from");
        if (TextUtils.equals(strOptString2, "pet")) {
            str = "form_my_pet";
        } else {
            str = TextUtils.equals(strOptString2, "share_profile") ? "share_profile" : "from_questions_answers";
        }
        xc00Var.mo99543c().duringCreated(CoreModule.m30930K().userObsById(strOptString)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.eci0
            @Override // p153l.y20
            public final void call(Object obj) {
                xc00 xc00Var2 = xc00Var;
                xc00Var2.mo99543c().startActivity(CoreModule.m30930K().startProfileAct(xc00Var2.mo99543c(), strOptString, str, false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false));
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public void m47801P0(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        iz40.m142756A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m47802Q0(xc00 xc00Var, String str, String str2, bkj0 bkj0Var) {
        if (!NullChecker.m82486a(bkj0Var)) {
            m47787B0(xc00Var, str);
            CrashHelper.m82479c(new NullPointerException("local conversation disappearance userId = " + str2));
            return;
        }
        Conversation conversation = (Conversation) bkj0Var.f77081a;
        User user = (User) bkj0Var.f77082b;
        User user2 = (User) bkj0Var.f77083c;
        if (!NullChecker.m82486a(conversation.additional) || !NullChecker.m82486a(conversation.additional.chatMM) || jyb.m147479J(user.pictures) || jyb.m147479J(user2.pictures)) {
            m47787B0(xc00Var, str);
            return;
        }
        ChatMMAndUserInfo chatMMAndUserInfoNew_ = ChatMMAndUserInfo.new_();
        chatMMAndUserInfoNew_.chatMM = conversation.additional.chatMM;
        ChatMMUserInfo chatMMUserInfo = chatMMAndUserInfoNew_.userInformation;
        chatMMUserInfo.userId = user.f56859id;
        chatMMUserInfo.userPicture = user.m61308fp().profile128().formatted();
        ChatMMUserInfo chatMMUserInfo2 = chatMMAndUserInfoNew_.userInformation;
        chatMMUserInfo2.otherUserId = user2.f56859id;
        chatMMUserInfo2.otherUserPicture = user2.m61308fp().profile128().formatted();
        m47827p1(xc00Var, str, chatMMAndUserInfoNew_.toJson());
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m47803R0(xc00 xc00Var, JSONObject jSONObject, w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (TextUtils.equals(c22660a.f210081a.toString(), CoreModule.f18263b.getResources().getString(R$string.f19600r))) {
            m47822k1(xc00Var, jSONObject);
        }
        if (NullChecker.m82486a(w30VarArr[0])) {
            w30VarArr[0].m204614b();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m47804S0(final xc00 xc00Var, final JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreModule.f18263b.getResources().getString(R$string.f19600r));
        int[] iArr = {c9c0.f80351L};
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_profile_more_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        w30.C21001b c21001b = new w30.C21001b(m177460c());
        c21001b.m204668T(new DialogInterfaceOnDismissListenerC8560b(l4g0VarM204399c)).m204657I(CoreModule.f18263b.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.ybi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TantanCoreBridge.m47758U(w30VarArr, view);
            }
        }).m204665Q(arrayList).m204666R(new int[]{0}, iArr).m204670V(new w30.InterfaceC21003d() { // from class: l.zbi0
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f203671a.m47803R0(xc00Var, jSONObject, w30VarArr, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        final w30[] w30VarArr = {w30VarM204654F};
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m47805T0(String str, String str2, String str3, uxj0 uxj0Var) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20384f0.m34219zp(str))) {
            PutongAct putongAct = this.f188308d;
            putongAct.startActivity(MessagesAct.m50126k2(putongAct, str, false, false));
            return;
        }
        C8523d.a aVar = new C8523d.a(str, "from_core_bridge");
        if (!TextUtils.isEmpty(str2)) {
            aVar.m47101o(str2);
        }
        if (s7a.m184997z() && TextUtils.equals("seekPartnerNum", str3)) {
            aVar.m47090d().channel = Channel.get("seekPartnerNum");
            aVar.m47098l("from_find_partner");
            C8523d.m47078d(this.f188308d, aVar);
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.m47090d().channel = Channel.get(str3);
        }
        C8523d.m47075a(this.f188308d, aVar);
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ File m47806U0(xc00 xc00Var, String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        if (bitmap == null) {
            m47787B0(xc00Var, str);
            return null;
        }
        File fileM120381O = ecj.m120381O("jpg");
        try {
            fileOutputStream = new FileOutputStream(fileM120381O);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                ua5.m195158b(fileOutputStream);
                return fileM120381O;
            } catch (Exception unused) {
                ua5.m195158b(fileOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                ua5.m195158b(fileOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ C22421c m47807V0(String str, String str2, xc00 xc00Var, String str3, String str4, File file) {
        Message messageM210871b = xg0.m210871b(file, str, str2);
        if (messageM210871b == null) {
            m47787B0(xc00Var, str3);
        }
        return CoreModule.f18264c.f20384f0.m33652Fn(str4, messageM210871b, null, false, false).flatMap(new qcj() { // from class: l.ubi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        });
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m47808W0(PutongAct putongAct, xc00 xc00Var, String str, String str2, uxj0 uxj0Var) {
        if (w20.m204491f(putongAct)) {
            putongAct.progressDismiss();
        }
        m47827p1(xc00Var, str, null);
        xg0.f194124b.m137019l(str2);
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m47809X0(PutongAct putongAct, xc00 xc00Var, String str, Throwable th) {
        if (w20.m204491f(putongAct)) {
            putongAct.progressDismiss();
        }
        m47787B0(xc00Var, str);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m47810Y0() {
        CoreModule.m30933P().m143405a().mo34537l1(this.f188308d, "p_receive_pick,unlock");
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m47811Z0(String str, Pair pair) {
        if (NullChecker.m82486a(pair.first)) {
            if (TEnum.equals(((Conversation) pair.first).status, "deleted")) {
                return;
            }
            PutongAct putongAct = this.f188308d;
            putongAct.startActivity(MessagesAct.m50126k2(putongAct, str, false, false));
            return;
        }
        CoreModule.f18264c.f20384f0.m33905ap(str);
        CrashHelper.m82479c(new NullPointerException("local conversation disappearance userId = " + str));
    }

    /* JADX INFO: renamed from: a1 */
    public final void m47812a1(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("otherId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreModule.f18264c.f20405m0.m32009H8(jyb.m147507f0(strOptString));
    }

    /* JADX INFO: renamed from: b1 */
    public final void m47813b1(final xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("otherId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.vai0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m47776m0(xc00Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: d1 */
    public void m47815d1(xc00 xc00Var, JSONObject jSONObject) {
        qu2.m178105E(Collections.singletonList(new Date()), MessageType.feedback, 0L, null);
    }

    /* JADX INFO: renamed from: e1 */
    public final void m47816e1() {
        l51.m152886F(this.f188308d, new Runnable() { // from class: l.abi0
            @Override // java.lang.Runnable
            public final void run() {
                v4j0.m199709g();
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m47817f1(xc00 xc00Var, JSONObject jSONObject) {
        if (jSONObject.has("featureID")) {
            int iOptInt = jSONObject.optInt("featureID");
            Intent intent = new Intent();
            intent.putExtra("featureID", iOptInt);
            xc00Var.mo99543c().setResult(-1, intent);
        }
        xc00Var.mo99543c().m68056e2();
    }

    /* JADX INFO: renamed from: g1 */
    public final void m47818g1() {
        v4j0.m199711i(true);
    }

    /* JADX INFO: renamed from: h1 */
    public void m47819h1(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        try {
            boolean z = NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed;
            xc00Var.mo99544d().mo97004b(jSONObject.optString("success"), z ? "true" : "false");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m47820i1(final xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || jSONObject == null || xc00Var.mo99541a() == null) {
            return;
        }
        xc00Var.mo99541a().setOnTouchListener(new View.OnTouchListener() { // from class: l.gbi0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TantanCoreBridge.m47763Z(xc00Var, view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: j1 */
    public void m47821j1(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20381e0.m116470H9();
        CoreModule.f18264c.f20381e0.m116527W9(uqb0.f180396b0.f170324a.userId());
    }

    /* JADX INFO: renamed from: k1 */
    public final void m47822k1(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || xc00Var.mo99543c() == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("receive_report_user_id");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
        profileMenuBuildParam.reportFrom = ReportFrom.IDENTIFY_FAKE;
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        putongActMo99543c.startActivity(ReportAct.m55812c2(putongActMo99543c, strOptString, false, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge.3
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    putongActMo99543c.m68056e2();
                }
            }
        }, profileMenuBuildParam));
    }

    /* JADX INFO: renamed from: l1 */
    public void m47823l1(final xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("userId");
        final String strOptString2 = jSONObject.optString("picture");
        final String strOptString3 = jSONObject.optString("callback");
        final String strOptString4 = jSONObject.optString("taskId");
        final String strOptString5 = jSONObject.optString("styleName");
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        putongActMo99543c.progress(R$string.f18632L5);
        putongActMo99543c.duringCreated(uqb0.f180374G.m127100E(strOptString2).map(new qcj() { // from class: l.jbi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f119935a.m47806U0(xc00Var, strOptString3, (Bitmap) obj);
            }
        }).flatMap(new qcj() { // from class: l.kbi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TantanCoreBridge.m47779p0((File) obj);
            }
        }).filter(new qcj() { // from class: l.lbi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((File) obj));
            }
        }).flatMap(new qcj() { // from class: l.mbi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TantanCoreBridge.m47753P(strOptString5, strOptString, (File) obj);
            }
        }).flatMap(new qcj() { // from class: l.nbi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141227a.m47807V0(strOptString2, strOptString4, xc00Var, strOptString3, strOptString, (File) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.obi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146587a.m47808W0(putongActMo99543c, xc00Var, strOptString3, strOptString, (uxj0) obj);
            }
        }, new y20() { // from class: l.pbi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151386a.m47809X0(putongActMo99543c, xc00Var, strOptString3, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public void m47824m1(@NonNull final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.fci0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m47761X(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public final void m47825n1() {
        l51.m152887G(new Runnable() { // from class: l.ibi0
            @Override // java.lang.Runnable
            public final void run() {
                this.f114220a.m47810Y0();
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public final void m47826o1(xc00 xc00Var, String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
            jSONObject.put("data", i);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        m47833x0(xc00Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: p1 */
    public final void m47827p1(xc00 xc00Var, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("data", new JSONObject(str2));
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        m47833x0(xc00Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m47828q1(JSONObject jSONObject) {
        final String strOptString = jSONObject.optString(Oauth2AccessToken.KEY_UID);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f188308d.duringCreated(CoreModule.f18264c.f20384f0.m33823Ue(strOptString).map(new qcj() { // from class: l.bbi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TantanCoreBridge.m47755R((Conversation) obj);
            }
        }).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.cbi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80824a.m47811Z0(strOptString, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public void m47829r1(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("purchaseShowFrom");
        final PutongAct putongActMo99543c = xc00Var.mo99543c();
        l51.m152893M(new Runnable() { // from class: l.jci0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m47754Q(putongActMo99543c, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    public final void m47830s1(final xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || xc00Var.mo99543c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        xc00Var.mo99543c().duringCreated(CoreModule.f18264c.f20384f0.m34167vn().take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.hci0
            @Override // p153l.y20
            public final void call(Object obj) {
                TantanCoreBridge.m47756S(xc00Var, strOptString, (vg60) obj);
            }
        }, new y20() { // from class: l.ici0
            @Override // p153l.y20
            public final void call(Object obj) {
                TantanCoreBridge.m47764a0((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        byte b = -1;
        switch (str2.hashCode()) {
            case -1994740279:
                if (str2.equals("goNativeDeleteMatchedPage")) {
                    b = 0;
                }
                break;
            case -1898807187:
                if (str2.equals("recommendedUsers")) {
                    b = 1;
                }
                break;
            case -1840945087:
                if (str2.equals("getAiPictureTimeout")) {
                    b = 2;
                }
                break;
            case -1715542826:
                if (str2.equals("goNativeSearchPage")) {
                    b = 3;
                }
                break;
            case -1598376264:
                if (str2.equals("editFakeAvatar")) {
                    b = 4;
                }
                break;
            case -1582146392:
                if (str2.equals("jumpToGameCp")) {
                    b = 5;
                }
                break;
            case -1348689555:
                if (str2.equals("toSVIPDialog")) {
                    b = 6;
                }
                break;
            case -1226477314:
                if (str2.equals("dailyReportJumpWebview")) {
                    b = 7;
                }
                break;
            case -1188185916:
                if (str2.equals("openChatHeatFeature")) {
                    b = 8;
                }
                break;
            case -1092881540:
                if (str2.equals("jumpToEditProfileAct")) {
                    b = 9;
                }
                break;
            case -919655170:
                if (str2.equals("showSeeDialog")) {
                    b = 10;
                }
                break;
            case -813025857:
                if (str2.equals("monitorContent")) {
                    b = 11;
                }
                break;
            case -779713129:
                if (str2.equals("pushState")) {
                    b = 12;
                }
                break;
            case -763446343:
                if (str2.equals("nothingUserCanPick")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case -555548157:
                if (str2.equals("jumpToPush")) {
                    b = 14;
                }
                break;
            case -529439106:
                if (str2.equals("matchSuccess")) {
                    b = 15;
                }
                break;
            case -519959089:
                if (str2.equals("getShareUserId")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case -454624785:
                if (str2.equals("totalDismissedMatchCount")) {
                    b = 17;
                }
                break;
            case -360640738:
                if (str2.equals("clockinShown")) {
                    b = 18;
                }
                break;
            case -352731028:
                if (str2.equals("likeSuccess")) {
                    b = 19;
                }
                break;
            case -327467797:
                if (str2.equals("getSparkPartnerData")) {
                    b = 20;
                }
                break;
            case -271417248:
                if (str2.equals("requestDisallowAndroidTouchEvent")) {
                    b = 21;
                }
                break;
            case -55032476:
                if (str2.equals("toNativeMessagePage")) {
                    b = 22;
                }
                break;
            case 80586289:
                if (str2.equals("jumToReport")) {
                    b = 23;
                }
                break;
            case 146489036:
                if (str2.equals("hasUserCanPick")) {
                    b = 24;
                }
                break;
            case 322637475:
                if (str2.equals("getSelectedNewUI")) {
                    b = 25;
                }
                break;
            case 523864749:
                if (str2.equals("knockWoodenFishSound")) {
                    b = 26;
                }
                break;
            case 570583197:
                if (str2.equals("addRecommendationsWidget")) {
                    b = 27;
                }
                break;
            case 689715326:
                if (str2.equals("pickedCardInfo")) {
                    b = 28;
                }
                break;
            case 721276090:
                if (str2.equals("setShowThemeCard")) {
                    b = 29;
                }
                break;
            case 1056588091:
                if (str2.equals("jumpToGreetOrChat")) {
                    b = 30;
                }
                break;
            case 1190881874:
                if (str2.equals("jumpToProfileAct")) {
                    b = 31;
                }
                break;
            case 1236319578:
                if (str2.equals("monitor")) {
                    b = HttpTokens.SPACE;
                }
                break;
            case 1784854297:
                if (str2.equals("sendAiPictureMessage")) {
                    b = 33;
                }
                break;
            case 1811855645:
                if (str2.equals("refreshPrivileges")) {
                    b = 34;
                }
                break;
        }
        switch (b) {
            case 0:
                m47793H0();
                return true;
            case 1:
                m47789D0(xc00Var, jSONObject);
                return true;
            case 2:
                m47788C0(xc00Var, jSONObject);
                return true;
            case 3:
                m47794I0();
                return true;
            case 4:
                m47786A0(xc00Var, jSONObject);
                return true;
            case 5:
                m47798M0(xc00Var, jSONObject);
                return true;
            case 6:
                m47829r1(xc00Var, jSONObject);
                return true;
            case 7:
                m47835z0(xc00Var, jSONObject);
                return true;
            case 8:
                m47817f1(xc00Var, jSONObject);
                return true;
            case 9:
                m47797L0(xc00Var, jSONObject);
                return true;
            case 10:
                m47825n1();
                return true;
            case 11:
                m47815d1(xc00Var, jSONObject);
                return true;
            case 12:
                m47819h1(xc00Var, jSONObject);
                return true;
            case 13:
                m47816e1();
                return true;
            case 14:
                m47801P0(xc00Var, jSONObject);
                return true;
            case 15:
                m47813b1(xc00Var, jSONObject);
                return true;
            case 16:
                m47791F0(xc00Var, jSONObject);
                return true;
            case 17:
                m47830s1(xc00Var, jSONObject);
                return true;
            case 18:
                m47834y0(jSONObject);
                return true;
            case 19:
                m47812a1(xc00Var, jSONObject);
                return true;
            case 20:
                m47792G0(xc00Var, jSONObject);
                return true;
            case 21:
                m47820i1(xc00Var, jSONObject);
                return true;
            case 22:
                m47828q1(jSONObject);
                return true;
            case 23:
                m47796K0(xc00Var, jSONObject);
                return true;
            case 24:
                m47795J0();
                return true;
            case 25:
                m47790E0(xc00Var, jSONObject);
                return true;
            case 26:
                ((Vibrator) CoreModule.f18263b.getSystemService("vibrator")).vibrate(50L);
                rv4.m183258h();
                return true;
            case 27:
                m47832w0(xc00Var);
                return true;
            case 28:
                m47818g1();
                return true;
            case 29:
                m47824m1(xc00Var, jSONObject);
                return true;
            case 30:
                m47799N0(xc00Var, jSONObject);
                return true;
            case 31:
                m47800O0(xc00Var, jSONObject);
                return true;
            case 32:
                m47814c1(xc00Var, jSONObject);
                return true;
            case 33:
                m47823l1(xc00Var, jSONObject);
                return true;
            case 34:
                m47821j1(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m47833x0(xc00 xc00Var, String str, JSONObject jSONObject) {
        if (NullChecker.m82486a(jSONObject) && NullChecker.m82486a(str)) {
            String strQuote = JSONObject.quote(jSONObject.toString());
            if (strQuote.length() < 1) {
                return;
            }
            xc00Var.mo99544d().mo97004b(str, strQuote.substring(1, strQuote.length() - 1));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m47834y0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("shownNum");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            CoreModule.f18264c.f20381e0.f89035G2.put(strOptString);
            CoreModule.f18264c.f20381e0.f89042H2.put(Long.valueOf(pzi0.m174454o()));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m47835z0(xc00 xc00Var, JSONObject jSONObject) {
        if (xc00Var == null || jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("userId");
            final PutongAct putongActMo99543c = xc00Var.mo99543c();
            if (putongActMo99543c == null) {
                return;
            }
            if (TextUtils.equals("match", strOptString) && !TextUtils.isEmpty(strOptString2)) {
                putongActMo99543c.startActivityForResult(MessagesAct.m50126k2(putongActMo99543c, strOptString2, false, false), new C8561c(putongActMo99543c));
                return;
            }
            if (TextUtils.equals("see", strOptString) && !TextUtils.isEmpty(strOptString2)) {
                putongActMo99543c.duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(strOptString2)).take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.gci0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        TantanCoreBridge.m47781r0(putongActMo99543c, (User) obj);
                    }
                }));
                return;
            }
            if (TextUtils.equals(UnlockConversationType.quick_chat, strOptString)) {
                putongActMo99543c.startActivityForResult(DropDownAct.m55629a2(putongActMo99543c), new C8562d(putongActMo99543c));
            } else if (TextUtils.equals("none", strOptString)) {
                putongActMo99543c.startActivity(NewMainAct.m40697M5(putongActMo99543c, NavigationIntent.get("cards")));
                putongActMo99543c.m68056e2();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m47832w0(@NonNull xc00 xc00Var) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m47786A0(xc00 xc00Var, JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: c1 */
    public void m47814c1(xc00 xc00Var, JSONObject jSONObject) {
    }
}
