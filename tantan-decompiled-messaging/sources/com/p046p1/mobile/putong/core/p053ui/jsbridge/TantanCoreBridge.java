package com.p046p1.mobile.putong.core.p053ui.jsbridge;

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
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreInnerPush;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.AiPictureConfig;
import com.p046p1.mobile.putong.core.data.ChatMMAndUserInfo;
import com.p046p1.mobile.putong.core.data.ChatMMUserInfo;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.data.ReportFrom;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookUnMatchAct;
import com.p046p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.jsbridge.TantanCoreBridge;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopFragAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSThemeInfo;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.UnlockConversationType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
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
import org.spongycastle.math.p131ec.Tnaf;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VListCell;
import p149l.au2;
import p149l.bh0;
import p149l.c30;
import p149l.c40;
import p149l.cwf0;
import p149l.e30;
import p149l.e400;
import p149l.e51;
import p149l.f400;
import p149l.g6a;
import p149l.i0e;
import p149l.jo0;
import p149l.k9j;
import p149l.knb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n37;
import p149l.q660;
import p149l.q860;
import p149l.qer;
import p149l.qib0;
import p149l.roj0;
import p149l.rvi0;
import p149l.su4;
import p149l.t100;
import p149l.t95;
import p149l.uq40;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.xaj0;
import p149l.y19;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class TantanCoreBridge extends e400 {

    /* JADX INFO: renamed from: h */
    public static C22393b<CoreInnerPush.C4716a> f29944h = C22393b.m221521b();

    /* JADX INFO: renamed from: i */
    public static C22393b<knb0<String, Integer, Integer, Integer>> f29945i = C22393b.m221521b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$a */
    public class C8396a implements w9j<Conversation, xaj0<Conversation, User, User>> {
        public C8396a() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xaj0<Conversation, User, User> call(Conversation conversation) {
            if (!NullChecker.m81303a(conversation)) {
                return null;
            }
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(conversation.otherUser);
            if (NullChecker.m81303a(userM169520na) && NullChecker.m81303a(userM169524oa)) {
                return new xaj0<>(conversation, userM169520na, userM169524oa);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$b */
    public class DialogInterfaceOnDismissListenerC8397b implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f29947a;

        public DialogInterfaceOnDismissListenerC8397b(cwf0 cwf0Var) {
            this.f29947a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f29947a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$c */
    public class C8398c implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f29949a;

        public C8398c(PutongAct putongAct) {
            this.f29949a = putongAct;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            PutongAct putongAct = this.f29949a;
            putongAct.startActivity(NewMainAct.m39685I5(putongAct, NavigationIntent.get(NavigationIntent.menu)));
            this.f29949a.m66873d2();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$d */
    public class C8399d implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f29951a;

        public C8399d(PutongAct putongAct) {
            this.f29951a = putongAct;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            PutongAct putongAct = this.f29951a;
            putongAct.startActivity(NewMainAct.m39685I5(putongAct, NavigationIntent.get(NavigationIntent.menu)));
            this.f29951a.m66873d2();
            return false;
        }
    }

    public TantanCoreBridge(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m46565C(Throwable th) {
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m46567E(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ C22306c m46570H(String str, String str2, final File file) {
        Message messageNew_ = Message.new_();
        messageNew_.value = "送你一张魔法照，我最喜欢这张" + str + "风格的你！";
        messageNew_.messageType = MessageType.get("text");
        return CoreModule.f17545c.f19642f0.m32649Fn(str2, messageNew_, null, false, false).flatMap(new w9j() { // from class: l.k3i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just(file);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m46571I(PutongAct putongAct, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        C8764c.m53509z0(putongAct, str, Privilege.letter, PurchaseType.TYPE_GET_VIP, null, 0);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Pair m46572J(Conversation conversation) {
        return new Pair(conversation, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m46573K(f400 f400Var, String str, q860 q860Var) {
        if (NullChecker.m81303a(q860Var)) {
            try {
                f400Var.mo102962d().mo127285b(str, String.valueOf(q860Var.f153135a.size()));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ C22306c m46574L(Conversation conversation) {
        return conversation == null ? CoreModule.f17545c.f19642f0.m32650Fo() : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m46575M(c40[] c40VarArr, View view) {
        zvf0.m220396r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        if (NullChecker.m81303a(c40VarArr[0])) {
            c40VarArr[0].m105113b();
        }
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m46577O(f400 f400Var) {
        f400Var.mo102961c().startActivity(NewMainAct.m39685I5(f400Var.mo102961c(), NavigationIntent.get("profile")));
        q660.m173125a(f400Var.mo102961c(), CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m46578P(JSONObject jSONObject, final f400 f400Var) {
        String strOptString = jSONObject.optString("questionnaires");
        String strOptString2 = jSONObject.optString("answers");
        String strOptString3 = jSONObject.optString("identifier");
        final String strOptString4 = jSONObject.optString("successFn");
        if (TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        f400Var.mo102961c().duringCreated((C22306c) CoreModule.f17545c.f19702z0.m129990d3(strOptString3, true, strOptString), false).flatMap(new w9j() { // from class: l.m3i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TantanCoreBridge.m46589a0((OMSThemeInfo) obj);
            }
        }).filter(new n37()).subscribe(mkd0.m154956H(new e30() { // from class: l.n3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                f400Var.mo102962d().mo127284a(strOptString4);
            }
        }, new e30() { // from class: l.o3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                TantanCoreBridge.m46567E((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ boolean m46580R(f400 f400Var, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        f400Var.mo102959a().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m46581S(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m46582T(Throwable th) {
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m46588Z(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ C22306c m46589a0(OMSThemeInfo oMSThemeInfo) {
        if (NullChecker.m81303a(oMSThemeInfo)) {
            return CoreModule.f17545c.f19663m0.m31023M5();
        }
        lsi0.m151580j("网络不给力，稍后再试吧");
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m46591c0(JSONObject jSONObject, f400 f400Var, List list) {
        JSONArray jSONArray = new JSONArray();
        if (!vwb.m200296J(list)) {
            int size = list.size() <= 3 ? list.size() : 3;
            for (int i = 0; i < size; i++) {
                if (NullChecker.m81303a((Conversation) list.get(i))) {
                    jSONArray.put(((Conversation) list.get(i)).otherUser);
                }
            }
        }
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        f400Var.mo102962d().mo127285b(strOptString, jSONArray.toString().replace("\"", "\\\""));
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m46593e0(final f400 f400Var, String str) {
        CoreModule.f17545c.f19642f0.m32650Fo();
        f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(str).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.r3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                dcx.m110886a(f400Var.mo102961c(), (User) obj);
            }
        }, new e30() { // from class: l.s3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                TantanCoreBridge.m46565C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ C22306c m46596h0(File file) {
        return file == null ? C22306c.create(new C22306c.a() { // from class: l.u3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((z3g0) obj).onError(null);
            }
        }) : C22306c.just(file);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m46598j0(PutongAct putongAct, User user) {
        if (NullChecker.m81303a(user)) {
            qer.m174243n(putongAct, user, true, false, false, "logout_ab", null, new e30() { // from class: l.h3i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TantanCoreBridge.m46601m0((Relationship) obj);
                }
            }, new e30() { // from class: l.j3i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TantanCoreBridge.m46588Z((Throwable) obj);
                }
            }, "p_delete_account_chat_block", null, null, null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m46601m0(Relationship relationship) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m46603A0() {
        PutongAct putongAct = this.f89239d;
        putongAct.startActivity(ConversationSearchAct.m42551b2(putongAct, -t100.m186890d(53.5f), "", ConversationSearchAct.f25953o, new ArrayList(), new ArrayList()));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m46604B0() {
        e51.m114741F(this.f89239d, new Runnable() { // from class: l.v2i0
            @Override // java.lang.Runnable
            public final void run() {
                rvi0.m181291b();
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m46605C0(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.q2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f152275a.m46613K0(f400Var, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m46606D0(@NonNull final f400 f400Var, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            final String strOptString = jSONObject.optString("inputType");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (TextUtils.equals(strOptString, ReminderAction.photo)) {
                e51.m114748M(new Runnable() { // from class: l.i3i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TantanCoreBridge.m46577O(f400Var);
                    }
                });
            } else {
                e51.m114748M(new Runnable() { // from class: l.t3i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f400 f400Var2 = f400Var;
                        f400Var2.mo102961c().startActivity(CoreModule.m29932K().mo30840yp(f400Var2.mo102961c(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, strOptString));
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m46607E0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null) {
            return;
        }
        f400Var.mo102961c().startActivity(ProfileLoopFragAct.m51649Y1(f400Var.mo102961c(), LoopInputType.GAME_CP));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m46608F0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.mo102961c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("profile_user_id");
        final String strOptString2 = jSONObject.optString("purchaseShowFrom");
        final String strOptString3 = jSONObject.optString("channel", "");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f89239d.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32820Ue(strOptString).flatMap(new w9j() { // from class: l.o2i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TantanCoreBridge.m46574L((Conversation) obj);
            }
        })).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.p2i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146860a.m46614L0(strOptString, strOptString2, strOptString3, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m46609G0(final f400 f400Var, JSONObject jSONObject) {
        final String str;
        final String strOptString = jSONObject.optString("userId");
        String strOptString2 = jSONObject.optString("from");
        if (TextUtils.equals(strOptString2, "pet")) {
            str = "form_my_pet";
        } else {
            str = TextUtils.equals(strOptString2, "share_profile") ? "share_profile" : "from_questions_answers";
        }
        f400Var.mo102961c().duringCreated(CoreModule.m29932K().userObsById(strOptString)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.v3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                f400 f400Var2 = f400Var;
                f400Var2.mo102961c().startActivity(CoreModule.m29932K().startProfileAct(f400Var2.mo102961c(), strOptString, str, false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false));
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public void m46610H0(@NonNull f400 f400Var, JSONObject jSONObject) {
        uq40.m194951A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m46611I0(f400 f400Var, String str, String str2, xaj0 xaj0Var) {
        if (!NullChecker.m81303a(xaj0Var)) {
            m46646t0(f400Var, str);
            CrashHelper.m81296c(new NullPointerException("local conversation disappearance userId = " + str2));
            return;
        }
        Conversation conversation = (Conversation) xaj0Var.f191751a;
        User user = (User) xaj0Var.f191752b;
        User user2 = (User) xaj0Var.f191753c;
        if (!NullChecker.m81303a(conversation.additional) || !NullChecker.m81303a(conversation.additional.chatMM) || vwb.m200296J(user.pictures) || vwb.m200296J(user2.pictures)) {
            m46646t0(f400Var, str);
            return;
        }
        ChatMMAndUserInfo chatMMAndUserInfoNew_ = ChatMMAndUserInfo.new_();
        chatMMAndUserInfoNew_.chatMM = conversation.additional.chatMM;
        ChatMMUserInfo chatMMUserInfo = chatMMAndUserInfoNew_.userInformation;
        chatMMUserInfo.userId = user.f56011id;
        chatMMUserInfo.userPicture = user.m60124fp().profile128().formatted();
        ChatMMUserInfo chatMMUserInfo2 = chatMMAndUserInfoNew_.userInformation;
        chatMMUserInfo2.otherUserId = user2.f56011id;
        chatMMUserInfo2.otherUserPicture = user2.m60124fp().profile128().formatted();
        m46636h1(f400Var, str, chatMMAndUserInfoNew_.toJson());
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m46612J0(f400 f400Var, JSONObject jSONObject, c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (TextUtils.equals(c22545a.f209159a.toString(), CoreModule.f17544b.getResources().getString(R$string.f18868r))) {
            m46631c1(f400Var, jSONObject);
        }
        if (NullChecker.m81303a(c40VarArr[0])) {
            c40VarArr[0].m105113b();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m46613K0(final f400 f400Var, final JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreModule.f17544b.getResources().getString(R$string.f18868r));
        int[] iArr = {w0c0.f183782L};
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_profile_more_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        c40.C16057b c16057b = new c40.C16057b(m122322a());
        c16057b.m105167T(new DialogInterfaceOnDismissListenerC8397b(cwf0VarM133794c)).m105156I(CoreModule.f17544b.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.p3i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TantanCoreBridge.m46575M(c40VarArr, view);
            }
        }).m105164Q(arrayList).m105165R(new int[]{0}, iArr).m105169V(new c40.InterfaceC16059d() { // from class: l.q3i0
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f152468a.m46612J0(f400Var, jSONObject, c40VarArr, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        final c40[] c40VarArr = {c40VarM105153F};
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m46614L0(String str, String str2, String str3, roj0 roj0Var) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19642f0.m33216zp(str))) {
            PutongAct putongAct = this.f89239d;
            putongAct.startActivity(MessagesAct.m48943i2(putongAct, str, false, false));
            return;
        }
        C8360d.a aVar = new C8360d.a(str, "from_core_bridge");
        if (!TextUtils.isEmpty(str2)) {
            aVar.m45918o(str2);
        }
        if (g6a.m124577z() && TextUtils.equals("seekPartnerNum", str3)) {
            aVar.m45907d().channel = Channel.get("seekPartnerNum");
            aVar.m45915l("from_find_partner");
            C8360d.m45895d(this.f89239d, aVar);
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.m45907d().channel = Channel.get(str3);
        }
        C8360d.m45892a(this.f89239d, aVar);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ File m46615M0(f400 f400Var, String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        if (bitmap == null) {
            m46646t0(f400Var, str);
            return null;
        }
        File fileM145083O = k9j.m145083O("jpg");
        try {
            fileOutputStream = new FileOutputStream(fileM145083O);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                t95.m187604b(fileOutputStream);
                return fileM145083O;
            } catch (Exception unused) {
                t95.m187604b(fileOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                t95.m187604b(fileOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ C22306c m46616N0(String str, String str2, f400 f400Var, String str3, String str4, File file) {
        Message messageM101752b = bh0.m101752b(file, str, str2);
        if (messageM101752b == null) {
            m46646t0(f400Var, str3);
        }
        return CoreModule.f17545c.f19642f0.m32649Fn(str4, messageM101752b, null, false, false).flatMap(new w9j() { // from class: l.l3i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m46617O0(PutongAct putongAct, f400 f400Var, String str, String str2, roj0 roj0Var) {
        if (c30.m104964f(putongAct)) {
            putongAct.progressDismiss();
        }
        m46636h1(f400Var, str, null);
        bh0.f75544b.m132487l(str2);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m46618P0(PutongAct putongAct, f400 f400Var, String str, Throwable th) {
        if (c30.m104964f(putongAct)) {
            putongAct.progressDismiss();
        }
        m46646t0(f400Var, str);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m46619Q0() {
        CoreModule.m29935P().m94651a().mo33534l1(this.f89239d, "p_receive_pick,unlock");
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m46620R0(String str, Pair pair) {
        if (NullChecker.m81303a(pair.first)) {
            if (TEnum.equals(((Conversation) pair.first).status, "deleted")) {
                return;
            }
            PutongAct putongAct = this.f89239d;
            putongAct.startActivity(MessagesAct.m48943i2(putongAct, str, false, false));
            return;
        }
        CoreModule.f17545c.f19642f0.m32902ap(str);
        CrashHelper.m81296c(new NullPointerException("local conversation disappearance userId = " + str));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m46621S0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("otherId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreModule.f17545c.f19663m0.m31006H8(vwb.m200324f0(strOptString));
    }

    /* JADX INFO: renamed from: T0 */
    public final void m46622T0(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("otherId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.m2i0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m46593e0(f400Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m46624V0(f400 f400Var, JSONObject jSONObject) {
        au2.m98912E(Collections.singletonList(new Date()), MessageType.feedback, 0L, null);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m46625W0() {
        e51.m114741F(this.f89239d, new Runnable() { // from class: l.r2i0
            @Override // java.lang.Runnable
            public final void run() {
                rvi0.m181296g();
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public final void m46626X0(f400 f400Var, JSONObject jSONObject) {
        if (jSONObject.has("featureID")) {
            int iOptInt = jSONObject.optInt("featureID");
            Intent intent = new Intent();
            intent.putExtra("featureID", iOptInt);
            f400Var.mo102961c().setResult(-1, intent);
        }
        f400Var.mo102961c().m66873d2();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m46627Y0() {
        rvi0.m181298i(true);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m46628Z0(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            boolean z = NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed;
            f400Var.mo102962d().mo127285b(jSONObject.optString("success"), z ? "true" : "false");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m46629a1(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null || f400Var.mo102959a() == null) {
            return;
        }
        f400Var.mo102959a().setOnTouchListener(new View.OnTouchListener() { // from class: l.x2i0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TantanCoreBridge.m46580R(f400Var, view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m46630b1(@NonNull f400 f400Var, JSONObject jSONObject) {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19639e0.m169397H9();
        CoreModule.f17545c.f19639e0.m169454W9(qib0.f154713b0.f139230a.userId());
    }

    /* JADX INFO: renamed from: c1 */
    public final void m46631c1(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.mo102961c() == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("receive_report_user_id");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
        profileMenuBuildParam.reportFrom = ReportFrom.IDENTIFY_FAKE;
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        putongActMo102961c.startActivity(ReportAct.m54629b2(putongActMo102961c, strOptString, false, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge.3
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    putongActMo102961c.m66873d2();
                }
            }
        }, profileMenuBuildParam));
    }

    /* JADX INFO: renamed from: d1 */
    public void m46632d1(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("userId");
        final String strOptString2 = jSONObject.optString("picture");
        final String strOptString3 = jSONObject.optString("callback");
        final String strOptString4 = jSONObject.optString("taskId");
        final String strOptString5 = jSONObject.optString("styleName");
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        putongActMo102961c.progress(R$string.f17842J5);
        putongActMo102961c.duringCreated(qib0.f154691G.m102316E(strOptString2).map(new w9j() { // from class: l.a3i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67369a.m46615M0(f400Var, strOptString3, (Bitmap) obj);
            }
        }).flatMap(new w9j() { // from class: l.b3i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TantanCoreBridge.m46596h0((File) obj);
            }
        }).filter(new w9j() { // from class: l.c3i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((File) obj));
            }
        }).flatMap(new w9j() { // from class: l.d3i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TantanCoreBridge.m46570H(strOptString5, strOptString, (File) obj);
            }
        }).flatMap(new w9j() { // from class: l.e3i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f89185a.m46616N0(strOptString2, strOptString4, f400Var, strOptString3, strOptString, (File) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.f3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94688a.m46617O0(putongActMo102961c, f400Var, strOptString3, strOptString, (roj0) obj);
            }
        }, new e30() { // from class: l.g3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100475a.m46618P0(putongActMo102961c, f400Var, strOptString3, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public void m46633e1(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.w3i0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m46578P(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m46634f1() {
        e51.m114742G(new Runnable() { // from class: l.z2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f201236a.m46619Q0();
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m46635g1(f400 f400Var, String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
            jSONObject.put("data", i);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        m46642p0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m46636h1(f400 f400Var, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("data", new JSONObject(str2));
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        m46642p0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m46637i1(JSONObject jSONObject) {
        final String strOptString = jSONObject.optString(Oauth2AccessToken.KEY_UID);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f89239d.duringCreated(CoreModule.f17545c.f19642f0.m32820Ue(strOptString).map(new w9j() { // from class: l.s2i0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TantanCoreBridge.m46572J((Conversation) obj);
            }
        }).take(1)).subscribe(mkd0.m154955G(new e30() { // from class: l.t2i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167480a.m46620R0(strOptString, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public void m46638j1(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("purchaseShowFrom");
        final PutongAct putongActMo102961c = f400Var.mo102961c();
        e51.m114748M(new Runnable() { // from class: l.a4i0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m46571I(putongActMo102961c, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: k1 */
    public final void m46639k1(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.mo102961c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m33164vn().take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.y3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                TantanCoreBridge.m46573K(f400Var, strOptString, (q860) obj);
            }
        }, new e30() { // from class: l.z3i0
            @Override // p149l.e30
            public final void call(Object obj) {
                TantanCoreBridge.m46581S((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
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
                m46652z0();
                return true;
            case 1:
                m46648v0(f400Var, jSONObject);
                return true;
            case 2:
                m46647u0(f400Var, jSONObject);
                return true;
            case 3:
                m46603A0();
                return true;
            case 4:
                m46645s0(f400Var, jSONObject);
                return true;
            case 5:
                m46607E0(f400Var, jSONObject);
                return true;
            case 6:
                m46638j1(f400Var, jSONObject);
                return true;
            case 7:
                m46644r0(f400Var, jSONObject);
                return true;
            case 8:
                m46626X0(f400Var, jSONObject);
                return true;
            case 9:
                m46606D0(f400Var, jSONObject);
                return true;
            case 10:
                m46634f1();
                return true;
            case 11:
                m46624V0(f400Var, jSONObject);
                return true;
            case 12:
                m46628Z0(f400Var, jSONObject);
                return true;
            case 13:
                m46625W0();
                return true;
            case 14:
                m46610H0(f400Var, jSONObject);
                return true;
            case 15:
                m46622T0(f400Var, jSONObject);
                return true;
            case 16:
                m46650x0(f400Var, jSONObject);
                return true;
            case 17:
                m46639k1(f400Var, jSONObject);
                return true;
            case 18:
                m46643q0(jSONObject);
                return true;
            case 19:
                m46621S0(f400Var, jSONObject);
                return true;
            case 20:
                m46651y0(f400Var, jSONObject);
                return true;
            case 21:
                m46629a1(f400Var, jSONObject);
                return true;
            case 22:
                m46637i1(jSONObject);
                return true;
            case 23:
                m46605C0(f400Var, jSONObject);
                return true;
            case 24:
                m46604B0();
                return true;
            case 25:
                m46649w0(f400Var, jSONObject);
                return true;
            case 26:
                ((Vibrator) CoreModule.f17544b.getSystemService("vibrator")).vibrate(50L);
                su4.m185998h();
                return true;
            case 27:
                m46641o0(f400Var);
                return true;
            case 28:
                m46627Y0();
                return true;
            case 29:
                m46633e1(f400Var, jSONObject);
                return true;
            case 30:
                m46608F0(f400Var, jSONObject);
                return true;
            case 31:
                m46609G0(f400Var, jSONObject);
                return true;
            case 32:
                m46623U0(f400Var, jSONObject);
                return true;
            case 33:
                m46632d1(f400Var, jSONObject);
                return true;
            case 34:
                m46630b1(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m46642p0(f400 f400Var, String str, JSONObject jSONObject) {
        if (NullChecker.m81303a(jSONObject) && NullChecker.m81303a(str)) {
            String strQuote = JSONObject.quote(jSONObject.toString());
            if (strQuote.length() < 1) {
                return;
            }
            f400Var.mo102962d().mo127285b(str, strQuote.substring(1, strQuote.length() - 1));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m46643q0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("shownNum");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            CoreModule.f17545c.f19639e0.f149178G2.put(strOptString);
            CoreModule.f17545c.f19639e0.f149185H2.put(Long.valueOf(mqi0.m155944o()));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m46644r0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("userId");
            final PutongAct putongActMo102961c = f400Var.mo102961c();
            if (putongActMo102961c == null) {
                return;
            }
            if (TextUtils.equals("match", strOptString) && !TextUtils.isEmpty(strOptString2)) {
                putongActMo102961c.startActivityForResult(MessagesAct.m48943i2(putongActMo102961c, strOptString2, false, false), new C8398c(putongActMo102961c));
                return;
            }
            if (TextUtils.equals("see", strOptString) && !TextUtils.isEmpty(strOptString2)) {
                putongActMo102961c.duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(strOptString2)).take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.x3i0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        TantanCoreBridge.m46598j0(putongActMo102961c, (User) obj);
                    }
                }));
                return;
            }
            if (TextUtils.equals(UnlockConversationType.quick_chat, strOptString)) {
                putongActMo102961c.startActivityForResult(DropDownAct.m54446Z1(putongActMo102961c), new C8399d(putongActMo102961c));
            } else if (TextUtils.equals("none", strOptString)) {
                putongActMo102961c.startActivity(NewMainAct.m39685I5(putongActMo102961c, NavigationIntent.get("cards")));
                putongActMo102961c.m66873d2();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m46646t0(f400 f400Var, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "false");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        m46642p0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: u0 */
    public void m46647u0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("callback");
        AiPictureConfig aiPictureConfigM212172g = y19.m212172g();
        if (aiPictureConfigM212172g == null) {
            m46646t0(f400Var, strOptString);
        } else {
            m46635g1(f400Var, strOptString, aiPictureConfigM212172g.timeout);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m46648v0(final f400 f400Var, final JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        try {
            f400Var.mo102961c().duringCreated(CoreModule.f17545c.f19642f0.m33053ng()).subscribe(mkd0.m154956H(new e30() { // from class: l.w2i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TantanCoreBridge.m46591c0(jSONObject, f400Var, (List) obj);
                }
            }, new e30() { // from class: l.y2i0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TantanCoreBridge.m46582T((Throwable) obj);
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m46649w0(final f400 f400Var, final JSONObject jSONObject) {
        try {
            e51.m114748M(new Runnable() { // from class: l.n2i0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.mo102962d().mo127285b(jSONObject.optString("callback"), upa.m194847z() ? "1" : "0");
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m46650x0(f400 f400Var, JSONObject jSONObject) {
        String str;
        try {
            if (!vwb.m200296J(CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded)) {
                Iterator<CoreSuggested.UserInfo> it = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    CoreSuggested.UserInfo next = it.next();
                    User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(next.f19472id);
                    if (NullChecker.m81303a(userM169524oa) && userM169524oa.settings.userShareTip().booleanValue()) {
                        str = next.f19472id;
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
            f400Var.mo102962d().mo127285b(strOptString, TextUtils.isEmpty(str) ? "" : str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m46651y0(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.mo102961c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("callback");
        final String strOptString2 = jSONObject.optString("current_session_id");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return;
        }
        this.f89239d.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32820Ue(strOptString2).take(1).map(new C8396a())).subscribe(mkd0.m154955G(new e30() { // from class: l.u2i0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173490a.m46611I0(f400Var, strOptString, strOptString2, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m46652z0() {
        PutongAct putongAct = this.f89239d;
        putongAct.startActivity(ConversationAddressBookUnMatchAct.m41883Z1(putongAct));
    }

    /* JADX INFO: renamed from: o0 */
    public void m46641o0(@NonNull f400 f400Var) {
    }

    /* JADX INFO: renamed from: U0 */
    public void m46623U0(f400 f400Var, JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: s0 */
    public final void m46645s0(f400 f400Var, JSONObject jSONObject) {
    }
}
