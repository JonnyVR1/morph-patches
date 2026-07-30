package com.p000p1.mobile.putong.core.p001ui.jsbridge;

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
import com.p000p1.mobile.putong.core.p001ui.jsbridge.TantanCoreBridge;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.LikeExtraData;
import com.p000p1.mobile.putong.data.MomentNotifyBlockType;
import com.p000p1.mobile.putong.data.NavigationIntent;
import com.p000p1.mobile.putong.data.OMSThemeInfo;
import com.p000p1.mobile.putong.data.Pet;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.UnlockConversationType;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreInnerPush;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.AiPictureConfig;
import com.p1.mobile.putong.core.data.ChatMMAndUserInfo;
import com.p1.mobile.putong.core.data.ChatMMUserInfo;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.ReportFrom;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookUnMatchAct;
import com.p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopFragAct;
import com.p1.mobile.putong.core.ui.quickaudio.DropDownAct;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l.au2;
import l.bh0;
import l.c30;
import l.c40;
import l.cwf0;
import l.dcx;
import l.e30;
import l.e400;
import l.e51;
import l.f400;
import l.g6a;
import l.i0e;
import l.jo0;
import l.k9j;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.q660;
import l.q860;
import l.qer;
import l.qib0;
import l.roj0;
import l.rvi0;
import l.su4;
import l.t100;
import l.t95;
import l.upa;
import l.uq40;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x9j;
import l.xaj0;
import l.y19;
import l.ytj0;
import l.z3g0;
import l.zvf0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007l.n37;
import rx.c;
import rx.subjects.b;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TantanCoreBridge extends e400 {

    /* JADX INFO: renamed from: h */
    public static b<CoreInnerPush.a> f53h = b.b();

    /* JADX INFO: renamed from: i */
    public static b<knb0<String, Integer, Integer, Integer>> f54i = b.b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$a */
    public class C0009a implements w9j<Conversation, xaj0<Conversation, User, User>> {
        public C0009a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xaj0<Conversation, User, User> call(Conversation conversation) {
            if (!NullChecker.a(conversation)) {
                return null;
            }
            User userNa = CoreModule.c.e0.na();
            User userOa = CoreModule.c.e0.oa(conversation.otherUser);
            if (NullChecker.a(userNa) && NullChecker.a(userOa)) {
                return new xaj0<>(conversation, userNa, userOa);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$b */
    public class DialogInterfaceOnDismissListenerC0010b implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f56a;

        public DialogInterfaceOnDismissListenerC0010b(cwf0 cwf0Var) {
            this.f56a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f56a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$c */
    public class C0011c implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f58a;

        public C0011c(PutongAct putongAct) {
            this.f58a = putongAct;
        }

        /* JADX INFO: renamed from: a */
        public boolean m324a(int i, int i2, Intent intent) {
            PutongAct putongAct = this.f58a;
            putongAct.startActivity(NewMainAct.I5(putongAct, NavigationIntent.get(NavigationIntent.menu)));
            this.f58a.finish();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge$d */
    public class C0012d implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PutongAct f60a;

        public C0012d(PutongAct putongAct) {
            this.f60a = putongAct;
        }

        /* JADX INFO: renamed from: a */
        public boolean m325a(int i, int i2, Intent intent) {
            PutongAct putongAct = this.f60a;
            putongAct.startActivity(NewMainAct.I5(putongAct, NavigationIntent.get(NavigationIntent.menu)));
            this.f60a.finish();
            return false;
        }
    }

    public TantanCoreBridge(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m235C(Throwable th) {
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m237E(Throwable th) {
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ c m240H(String str, String str2, final File file) {
        Message messageNew_ = Message.new_();
        messageNew_.value = "送你一张魔法照，我最喜欢这张" + str + "风格的你！";
        messageNew_.messageType = MessageType.get("text");
        return CoreModule.c.f0.Fn(str2, messageNew_, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.k3i0
            public final Object call(Object obj) {
                return c.just(file);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m241I(PutongAct putongAct, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        com.p1.mobile.putong.core.ui.purchase.c.z0(putongAct, str, Privilege.letter, PurchaseType.TYPE_GET_VIP, (e30) null, 0);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ Pair m242J(Conversation conversation) {
        return new Pair(conversation, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m243K(f400 f400Var, String str, q860 q860Var) {
        if (NullChecker.a(q860Var)) {
            try {
                f400Var.d().b(str, new String[]{String.valueOf(q860Var.a.size())});
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ c m244L(Conversation conversation) {
        return conversation == null ? CoreModule.c.f0.Fo() : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m245M(c40[] c40VarArr, View view) {
        zvf0.r("e_user_profile_more_popup_cancel", "p_user_profile_more_popup");
        if (NullChecker.a(c40VarArr[0])) {
            c40VarArr[0].b();
        }
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m247O(f400 f400Var) {
        f400Var.c().startActivity(NewMainAct.I5(f400Var.c(), NavigationIntent.get("profile")));
        q660.a(f400Var.c(), "from_card_upload_photo");
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m248P(JSONObject jSONObject, final f400 f400Var) {
        String strOptString = jSONObject.optString("questionnaires");
        String strOptString2 = jSONObject.optString("answers");
        String strOptString3 = jSONObject.optString("identifier");
        final String strOptString4 = jSONObject.optString("successFn");
        if (TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
            return;
        }
        f400Var.c().duringCreated(CoreModule.c.z0.d3(strOptString3, true, strOptString), false).flatMap(new w9j() { // from class: l.m3i0
            public final Object call(Object obj) {
                return TantanCoreBridge.m259a0((OMSThemeInfo) obj);
            }
        }).filter(new n37()).subscribe(mkd0.H(new e30() { // from class: l.n3i0
            public final void call(Object obj) {
                f400Var.d().a(strOptString4);
            }
        }, new e30() { // from class: l.o3i0
            public final void call(Object obj) {
                TantanCoreBridge.m237E((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ boolean m250R(f400 f400Var, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        f400Var.e().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m251S(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m252T(Throwable th) {
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m258Z(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ c m259a0(OMSThemeInfo oMSThemeInfo) {
        if (NullChecker.a(oMSThemeInfo)) {
            return CoreModule.c.m0.M5();
        }
        lsi0.j("网络不给力，稍后再试吧");
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m261c0(JSONObject jSONObject, f400 f400Var, List list) {
        JSONArray jSONArray = new JSONArray();
        if (!vwb.J(list)) {
            int size = list.size() <= 3 ? list.size() : 3;
            for (int i = 0; i < size; i++) {
                if (NullChecker.a((Conversation) list.get(i))) {
                    jSONArray.put(((Conversation) list.get(i)).otherUser);
                }
            }
        }
        String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        f400Var.d().b(strOptString, new String[]{jSONArray.toString().replace("\"", "\\\"")});
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m263e0(final f400 f400Var, String str) {
        CoreModule.c.f0.Fo();
        f400Var.c().duringCreated(CoreModule.c.e0.Ka(str).take(1)).subscribe(mkd0.H(new e30() { // from class: l.r3i0
            public final void call(Object obj) {
                dcx.a(f400Var.c(), (User) obj);
            }
        }, new e30() { // from class: l.s3i0
            public final void call(Object obj) {
                TantanCoreBridge.m235C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ c m266h0(File file) {
        return file == null ? c.create(new c.a() { // from class: l.u3i0
            public final void call(Object obj) {
                ((z3g0) obj).onError((Throwable) null);
            }
        }) : c.just(file);
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m268j0(PutongAct putongAct, User user) {
        if (NullChecker.a(user)) {
            qer.n(putongAct, user, true, false, false, "logout_ab", (x9j) null, new e30() { // from class: l.h3i0
                public final void call(Object obj) {
                    TantanCoreBridge.m271m0((Relationship) obj);
                }
            }, new e30() { // from class: l.j3i0
                public final void call(Object obj) {
                    TantanCoreBridge.m258Z((Throwable) obj);
                }
            }, "p_delete_account_chat_block", (LikeExtraData) null, (String) null, (String) null);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m271m0(Relationship relationship) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m273A0() {
        PutongAct putongAct = ((e400) this).d;
        putongAct.startActivity(ConversationSearchAct.b2(putongAct, -t100.d(53.5f), "", ConversationSearchAct.o, new ArrayList(), new ArrayList()));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m274B0() {
        e51.F(((e400) this).d, new Runnable() { // from class: l.v2i0
            @Override // java.lang.Runnable
            public final void run() {
                rvi0.b();
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final void m275C0(final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.q2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12055a.m283K0(f400Var, jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public void m276D0(@NonNull final f400 f400Var, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            final String strOptString = jSONObject.optString("inputType");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            if (TextUtils.equals(strOptString, "photo")) {
                e51.M(new Runnable() { // from class: l.i3i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TantanCoreBridge.m247O(f400Var);
                    }
                });
            } else {
                e51.M(new Runnable() { // from class: l.t3i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f400 f400Var2 = f400Var;
                        f400Var2.c().startActivity(CoreModule.K().yp(f400Var2.c(), ((DbObject) CoreModule.c.e0.p9()).id, "from_questions_answers", false, true, false, RelationshipStatus.get("unknown_"), 273, false, true, false, strOptString));
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m277E0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null) {
            return;
        }
        f400Var.c().startActivity(ProfileLoopFragAct.Y1(f400Var.c(), LoopInputType.GAME_CP));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m278F0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("profile_user_id");
        final String strOptString2 = jSONObject.optString("purchaseShowFrom");
        final String strOptString3 = jSONObject.optString("channel", "");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        ((e400) this).d.duringCreated(CoreModule.c.f0.Ue(strOptString).flatMap(new w9j() { // from class: l.o2i0
            public final Object call(Object obj) {
                return TantanCoreBridge.m244L((Conversation) obj);
            }
        })).take(1).subscribe(mkd0.G(new e30() { // from class: l.p2i0
            public final void call(Object obj) {
                this.f11673a.m284L0(strOptString, strOptString2, strOptString3, (roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G0 */
    public final void m279G0(final f400 f400Var, JSONObject jSONObject) {
        final String str;
        final String strOptString = jSONObject.optString("userId");
        String strOptString2 = jSONObject.optString("from");
        if (TextUtils.equals(strOptString2, Pet.TYPE)) {
            str = "form_my_pet";
        } else {
            str = TextUtils.equals(strOptString2, "share_profile") ? "share_profile" : "from_questions_answers";
        }
        f400Var.c().duringCreated(CoreModule.K().userObsById(strOptString)).take(1).subscribe(mkd0.G(new e30() { // from class: l.v3i0
            public final void call(Object obj) {
                f400 f400Var2 = f400Var;
                f400Var2.c().startActivity(CoreModule.K().startProfileAct(f400Var2.c(), strOptString, str, false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false));
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public void m280H0(@NonNull f400 f400Var, JSONObject jSONObject) {
        uq40.A();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m281I0(f400 f400Var, String str, String str2, xaj0 xaj0Var) {
        if (!NullChecker.a(xaj0Var)) {
            m316t0(f400Var, str);
            CrashHelper.c(new NullPointerException("local conversation disappearance userId = " + str2));
            return;
        }
        Conversation conversation = (Conversation) xaj0Var.a;
        User user = (User) xaj0Var.b;
        User user2 = (User) xaj0Var.c;
        if (!NullChecker.a(conversation.additional) || !NullChecker.a(conversation.additional.chatMM) || vwb.J(user.pictures) || vwb.J(user2.pictures)) {
            m316t0(f400Var, str);
            return;
        }
        ChatMMAndUserInfo chatMMAndUserInfoNew_ = ChatMMAndUserInfo.new_();
        chatMMAndUserInfoNew_.chatMM = conversation.additional.chatMM;
        ChatMMUserInfo chatMMUserInfo = chatMMAndUserInfoNew_.userInformation;
        chatMMUserInfo.userId = ((DbObject) user).id;
        chatMMUserInfo.userPicture = user.m1042fp().profile128().formatted();
        ChatMMUserInfo chatMMUserInfo2 = chatMMAndUserInfoNew_.userInformation;
        chatMMUserInfo2.otherUserId = ((DbObject) user2).id;
        chatMMUserInfo2.otherUserPicture = user2.m1042fp().profile128().formatted();
        m306h1(f400Var, str, chatMMAndUserInfoNew_.toJson());
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m282J0(f400 f400Var, JSONObject jSONObject, c40[] c40VarArr, VListCell vListCell, VListCell.a aVar, int i) {
        if (TextUtils.equals(aVar.a.toString(), CoreModule.b.getResources().getString(R.string.r))) {
            m301c1(f400Var, jSONObject);
        }
        if (NullChecker.a(c40VarArr[0])) {
            c40VarArr[0].b();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m283K0(final f400 f400Var, final JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CoreModule.b.getResources().getString(R.string.r));
        int[] iArr = {w0c0.L};
        cwf0 cwf0VarC = i0e.c("p_user_profile_more_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        c40.b bVar = new c40.b(a());
        bVar.T(new DialogInterfaceOnDismissListenerC0010b(cwf0VarC)).I(CoreModule.b.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.p3i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TantanCoreBridge.m245M(c40VarArr, view);
            }
        }).Q(arrayList).R(new int[]{0}, iArr).V(new c40.d() { // from class: l.q3i0
            /* JADX INFO: renamed from: a */
            public final void m13373a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f12069a.m282J0(f400Var, jSONObject, c40VarArr, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        final c40[] c40VarArr = {c40VarF};
        c40VarF.f();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m284L0(String str, String str2, String str3, roj0 roj0Var) {
        if (NullChecker.a(CoreModule.c.f0.zp(str))) {
            PutongAct putongAct = ((e400) this).d;
            putongAct.startActivity(MessagesAct.i2(putongAct, str, false, false));
            return;
        }
        d.a aVar = new d.a(str, "from_core_bridge");
        if (!TextUtils.isEmpty(str2)) {
            aVar.o(str2);
        }
        if (g6a.z() && TextUtils.equals(Channel.seekPartnerNum, str3)) {
            aVar.d().channel = Channel.get(Channel.seekPartnerNum);
            aVar.l("from_find_partner");
            d.d(((e400) this).d, aVar);
            return;
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.d().channel = Channel.get(str3);
        }
        d.a(((e400) this).d, aVar);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ File m285M0(f400 f400Var, String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        if (bitmap == null) {
            m316t0(f400Var, str);
            return null;
        }
        File fileO = k9j.O("jpg");
        try {
            fileOutputStream = new FileOutputStream(fileO);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                t95.b(fileOutputStream);
                return fileO;
            } catch (Exception unused) {
                t95.b(fileOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                t95.b(fileOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ c m286N0(String str, String str2, f400 f400Var, String str3, String str4, File file) {
        Message messageB = bh0.b(file, str, str2);
        if (messageB == null) {
            m316t0(f400Var, str3);
        }
        return CoreModule.c.f0.Fn(str4, messageB, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.l3i0
            public final Object call(Object obj) {
                return CoreModule.c.f0.Fo();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m287O0(PutongAct putongAct, f400 f400Var, String str, String str2, roj0 roj0Var) {
        if (c30.f(putongAct)) {
            putongAct.progressDismiss();
        }
        m306h1(f400Var, str, null);
        bh0.b.onNext(str2);
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m288P0(PutongAct putongAct, f400 f400Var, String str, Throwable th) {
        if (c30.f(putongAct)) {
            putongAct.progressDismiss();
        }
        m316t0(f400Var, str);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m289Q0() {
        CoreModule.P().a().l1(((e400) this).d, "p_receive_pick,unlock");
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m290R0(String str, Pair pair) {
        if (NullChecker.a(pair.first)) {
            if (TEnum.equals(((Conversation) pair.first).status, "deleted")) {
                return;
            }
            PutongAct putongAct = ((e400) this).d;
            putongAct.startActivity(MessagesAct.i2(putongAct, str, false, false));
            return;
        }
        CoreModule.c.f0.ap(str);
        CrashHelper.c(new NullPointerException("local conversation disappearance userId = " + str));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m291S0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("otherId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreModule.c.m0.H8(vwb.f0(new String[]{strOptString}));
    }

    /* JADX INFO: renamed from: T0 */
    public final void m292T0(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("otherId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        e51.M(new Runnable() { // from class: l.m2i0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m263e0(f400Var, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: V0 */
    public void m294V0(f400 f400Var, JSONObject jSONObject) {
        au2.E(Collections.singletonList(new Date()), "feedback", 0L, (ytj0) null);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m295W0() {
        e51.F(((e400) this).d, new Runnable() { // from class: l.r2i0
            @Override // java.lang.Runnable
            public final void run() {
                rvi0.g();
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public final void m296X0(f400 f400Var, JSONObject jSONObject) {
        if (jSONObject.has("featureID")) {
            int iOptInt = jSONObject.optInt("featureID");
            Intent intent = new Intent();
            intent.putExtra("featureID", iOptInt);
            f400Var.c().setResult(-1, intent);
        }
        f400Var.c().finish();
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m297Y0() {
        rvi0.i(true);
    }

    /* JADX INFO: renamed from: Z0 */
    public void m298Z0(@NonNull f400 f400Var, JSONObject jSONObject) {
        try {
            boolean z = NotificationCheckerCommon.a() == NotificationCheckerCommon.State.closed;
            f400Var.d().b(jSONObject.optString("success"), new String[]{z ? "true" : "false"});
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m299a1(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null || f400Var.e() == null) {
            return;
        }
        f400Var.e().setOnTouchListener(new View.OnTouchListener() { // from class: l.x2i0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TantanCoreBridge.m250R(f400Var, view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public void m300b1(@NonNull f400 f400Var, JSONObject jSONObject) {
        CoreModule.c.C0.u4();
        CoreModule.c.e0.H9();
        CoreModule.c.e0.W9(qib0.b0.a.userId());
    }

    /* JADX INFO: renamed from: c1 */
    public final void m301c1(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.c() == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("receive_report_user_id");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        CoreDlg.ProfileMenuBuildParam profileMenuBuildParam = new CoreDlg.ProfileMenuBuildParam();
        profileMenuBuildParam.reportFrom = ReportFrom.IDENTIFY_FAKE;
        final PutongAct putongActC = f400Var.c();
        putongActC.startActivity(ReportAct.b2(putongActC, strOptString, false, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.jsbridge.TantanCoreBridge.3
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    putongActC.finish();
                }
            }
        }, profileMenuBuildParam));
    }

    /* JADX INFO: renamed from: d1 */
    public void m302d1(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("userId");
        final String strOptString2 = jSONObject.optString("picture");
        final String strOptString3 = jSONObject.optString("callback");
        final String strOptString4 = jSONObject.optString("taskId");
        final String strOptString5 = jSONObject.optString("styleName");
        final PutongAct putongActC = f400Var.c();
        putongActC.progress(R.string.J5);
        putongActC.duringCreated(qib0.G.E(strOptString2).map(new w9j() { // from class: l.a3i0
            public final Object call(Object obj) {
                return this.f5566a.m285M0(f400Var, strOptString3, (Bitmap) obj);
            }
        }).flatMap(new w9j() { // from class: l.b3i0
            public final Object call(Object obj) {
                return TantanCoreBridge.m266h0((File) obj);
            }
        }).filter(new w9j() { // from class: l.c3i0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((File) obj));
            }
        }).flatMap(new w9j() { // from class: l.d3i0
            public final Object call(Object obj) {
                return TantanCoreBridge.m240H(strOptString5, strOptString, (File) obj);
            }
        }).flatMap(new w9j() { // from class: l.e3i0
            public final Object call(Object obj) {
                return this.f7194a.m286N0(strOptString2, strOptString4, f400Var, strOptString3, strOptString, (File) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.f3i0
            public final void call(Object obj) {
                this.f7966a.m287O0(putongActC, f400Var, strOptString3, strOptString, (roj0) obj);
            }
        }, new e30() { // from class: l.g3i0
            public final void call(Object obj) {
                this.f8339a.m288P0(putongActC, f400Var, strOptString3, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public void m303e1(@NonNull final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.w3i0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m248P(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final void m304f1() {
        e51.G(new Runnable() { // from class: l.z2i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15564a.m289Q0();
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final void m305g1(f400 f400Var, String str, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
            jSONObject.put(Data.TYPE, i);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        m312p0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m306h1(f400 f400Var, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "true");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(Data.TYPE, new JSONObject(str2));
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        m312p0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m307i1(JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("uid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        ((e400) this).d.duringCreated(CoreModule.c.f0.Ue(strOptString).map(new w9j() { // from class: l.s2i0
            public final Object call(Object obj) {
                return TantanCoreBridge.m242J((Conversation) obj);
            }
        }).take(1)).subscribe(mkd0.G(new e30() { // from class: l.t2i0
            public final void call(Object obj) {
                this.f13165a.m290R0(strOptString, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public void m308j1(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("purchaseShowFrom");
        final PutongAct putongActC = f400Var.c();
        e51.M(new Runnable() { // from class: l.a4i0
            @Override // java.lang.Runnable
            public final void run() {
                TantanCoreBridge.m241I(putongActC, strOptString);
            }
        });
    }

    /* JADX INFO: renamed from: k1 */
    public final void m309k1(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("callback");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        f400Var.c().duringCreated(CoreModule.c.f0.vn().take(1)).subscribe(mkd0.H(new e30() { // from class: l.y3i0
            public final void call(Object obj) {
                TantanCoreBridge.m243K(f400Var, strOptString, (q860) obj);
            }
        }, new e30() { // from class: l.z3i0
            public final void call(Object obj) {
                TantanCoreBridge.m251S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public boolean m310n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "goNativeDeleteMatchedPage":
                m322z0();
                return true;
            case "recommendedUsers":
                m318v0(f400Var, jSONObject);
                return true;
            case "getAiPictureTimeout":
                m317u0(f400Var, jSONObject);
                return true;
            case "goNativeSearchPage":
                m273A0();
                return true;
            case "editFakeAvatar":
                m315s0(f400Var, jSONObject);
                return true;
            case "jumpToGameCp":
                m277E0(f400Var, jSONObject);
                return true;
            case "toSVIPDialog":
                m308j1(f400Var, jSONObject);
                return true;
            case "dailyReportJumpWebview":
                m314r0(f400Var, jSONObject);
                return true;
            case "openChatHeatFeature":
                m296X0(f400Var, jSONObject);
                return true;
            case "jumpToEditProfileAct":
                m276D0(f400Var, jSONObject);
                return true;
            case "showSeeDialog":
                m304f1();
                return true;
            case "monitorContent":
                m294V0(f400Var, jSONObject);
                return true;
            case "pushState":
                m298Z0(f400Var, jSONObject);
                return true;
            case "nothingUserCanPick":
                m295W0();
                return true;
            case "jumpToPush":
                m280H0(f400Var, jSONObject);
                return true;
            case "matchSuccess":
                m292T0(f400Var, jSONObject);
                return true;
            case "getShareUserId":
                m320x0(f400Var, jSONObject);
                return true;
            case "totalDismissedMatchCount":
                m309k1(f400Var, jSONObject);
                return true;
            case "clockinShown":
                m313q0(jSONObject);
                return true;
            case "likeSuccess":
                m291S0(f400Var, jSONObject);
                return true;
            case "getSparkPartnerData":
                m321y0(f400Var, jSONObject);
                return true;
            case "requestDisallowAndroidTouchEvent":
                m299a1(f400Var, jSONObject);
                return true;
            case "toNativeMessagePage":
                m307i1(jSONObject);
                return true;
            case "jumToReport":
                m275C0(f400Var, jSONObject);
                return true;
            case "hasUserCanPick":
                m274B0();
                return true;
            case "getSelectedNewUI":
                m319w0(f400Var, jSONObject);
                return true;
            case "knockWoodenFishSound":
                ((Vibrator) CoreModule.b.getSystemService("vibrator")).vibrate(50L);
                su4.h();
                return true;
            case "addRecommendationsWidget":
                m311o0(f400Var);
                return true;
            case "pickedCardInfo":
                m297Y0();
                return true;
            case "setShowThemeCard":
                m303e1(f400Var, jSONObject);
                return true;
            case "jumpToGreetOrChat":
                m278F0(f400Var, jSONObject);
                return true;
            case "jumpToProfileAct":
                m279G0(f400Var, jSONObject);
                return true;
            case "monitor":
                m293U0(f400Var, jSONObject);
                return true;
            case "sendAiPictureMessage":
                m302d1(f400Var, jSONObject);
                return true;
            case "refreshPrivileges":
                m300b1(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m312p0(f400 f400Var, String str, JSONObject jSONObject) {
        if (NullChecker.a(jSONObject) && NullChecker.a(str)) {
            String strQuote = JSONObject.quote(jSONObject.toString());
            if (strQuote.length() < 1) {
                return;
            }
            f400Var.d().b(str, new String[]{strQuote.substring(1, strQuote.length() - 1)});
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m313q0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("shownNum");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            CoreModule.c.e0.G2.put(strOptString);
            CoreModule.c.e0.H2.put(Long.valueOf(mqi0.o()));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m314r0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("type");
            String strOptString2 = jSONObject.optString("userId");
            final PutongAct putongActC = f400Var.c();
            if (putongActC == null) {
                return;
            }
            if (TextUtils.equals(MomentNotifyBlockType.match, strOptString) && !TextUtils.isEmpty(strOptString2)) {
                putongActC.startActivityForResult(MessagesAct.i2(putongActC, strOptString2, false, false), new C0011c(putongActC));
                return;
            }
            if (TextUtils.equals("see", strOptString) && !TextUtils.isEmpty(strOptString2)) {
                putongActC.duringCreated(CoreModule.c.e0.Ka(strOptString2)).take(1).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.x3i0
                    public final void call(Object obj) {
                        TantanCoreBridge.m268j0(putongActC, (User) obj);
                    }
                }));
                return;
            }
            if (TextUtils.equals(UnlockConversationType.quick_chat, strOptString)) {
                putongActC.startActivityForResult(DropDownAct.Z1(putongActC), new C0012d(putongActC));
            } else if (TextUtils.equals(FeedMakeupPageAdapter.MakeupItem.NONE, strOptString)) {
                putongActC.startActivity(NewMainAct.I5(putongActC, NavigationIntent.get("cards")));
                putongActC.finish();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m316t0(f400 f400Var, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", "false");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        m312p0(f400Var, str, jSONObject);
    }

    /* JADX INFO: renamed from: u0 */
    public void m317u0(f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("callback");
        AiPictureConfig aiPictureConfigG = y19.g();
        if (aiPictureConfigG == null) {
            m316t0(f400Var, strOptString);
        } else {
            m305g1(f400Var, strOptString, aiPictureConfigG.timeout);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m318v0(final f400 f400Var, final JSONObject jSONObject) {
        if (f400Var == null || jSONObject == null) {
            return;
        }
        try {
            f400Var.c().duringCreated(CoreModule.c.f0.ng()).subscribe(mkd0.H(new e30() { // from class: l.w2i0
                public final void call(Object obj) {
                    TantanCoreBridge.m261c0(jSONObject, f400Var, (List) obj);
                }
            }, new e30() { // from class: l.y2i0
                public final void call(Object obj) {
                    TantanCoreBridge.m252T((Throwable) obj);
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m319w0(final f400 f400Var, final JSONObject jSONObject) {
        try {
            e51.M(new Runnable() { // from class: l.n2i0
                @Override // java.lang.Runnable
                public final void run() {
                    f400Var.d().b(jSONObject.optString("callback"), new String[]{upa.z() ? "1" : "0"});
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m320x0(f400 f400Var, JSONObject jSONObject) {
        String str;
        try {
            if (!vwb.J(((PartialListOpt) CoreModule.c.m0.a0.e()).loaded)) {
                Iterator it = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) it.next();
                    User userOa = CoreModule.c.e0.oa(userInfo.id);
                    if (NullChecker.a(userOa) && userOa.settings.userShareTip().booleanValue()) {
                        str = userInfo.id;
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
            f400Var.d().b(strOptString, new String[]{TextUtils.isEmpty(str) ? "" : str});
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m321y0(final f400 f400Var, JSONObject jSONObject) {
        if (f400Var == null || f400Var.c() == null || jSONObject == null) {
            return;
        }
        final String strOptString = jSONObject.optString("callback");
        final String strOptString2 = jSONObject.optString("current_session_id");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return;
        }
        ((e400) this).d.duringCreated(CoreModule.c.f0.Ue(strOptString2).take(1).map(new C0009a())).subscribe(mkd0.G(new e30() { // from class: l.u2i0
            public final void call(Object obj) {
                this.f13509a.m281I0(f400Var, strOptString, strOptString2, (xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m322z0() {
        PutongAct putongAct = ((e400) this).d;
        putongAct.startActivity(ConversationAddressBookUnMatchAct.Z1(putongAct));
    }

    /* JADX INFO: renamed from: o0 */
    public void m311o0(@NonNull f400 f400Var) {
    }

    /* JADX INFO: renamed from: U0 */
    public void m293U0(f400 f400Var, JSONObject jSONObject) {
    }

    /* JADX INFO: renamed from: s0 */
    public final void m315s0(f400 f400Var, JSONObject jSONObject) {
    }
}
