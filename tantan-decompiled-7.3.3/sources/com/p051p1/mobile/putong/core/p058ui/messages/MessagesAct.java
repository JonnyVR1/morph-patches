package com.p051p1.mobile.putong.core.p058ui.messages;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.messages.view.AiTranslateView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p153l.AbstractC18764n2;
import p153l.avy;
import p153l.bvy;
import p153l.cgc0;
import p153l.clz;
import p153l.crl;
import p153l.d3z;
import p153l.ffz;
import p153l.fwy;
import p153l.g500;
import p153l.ggz;
import p153l.gta;
import p153l.h100;
import p153l.h39;
import p153l.hcm;
import p153l.hi40;
import p153l.hwy;
import p153l.i4g0;
import p153l.i500;
import p153l.iam;
import p153l.j3z;
import p153l.jlz;
import p153l.jxd0;
import p153l.jyb;
import p153l.ki40;
import p153l.klz;
import p153l.l300;
import p153l.l51;
import p153l.l600;
import p153l.lgz;
import p153l.mzl;
import p153l.n300;
import p153l.o3z;
import p153l.pf60;
import p153l.pm6;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qzz;
import p153l.ruy;
import p153l.rvm;
import p153l.s000;
import p153l.sfj0;
import p153l.toh0;
import p153l.tvz;
import p153l.u1z;
import p153l.ucq;
import p153l.ujh0;
import p153l.uxj0;
import p153l.vez;
import p153l.x20;
import p153l.xyd0;
import p153l.y20;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class MessagesAct extends PutongAct implements crl, mzl, ucq {

    /* JADX INFO: renamed from: r */
    public static xyd0 f32483r = new xyd0("sent_foul_words_users_set_" + CoreModule.m30929H().userId(), new HashSet());

    /* JADX INFO: renamed from: s */
    public static jxd0 f32484s = new jxd0("enter_as_send_alert", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public Conversation f32485c = null;

    /* JADX INFO: renamed from: d */
    public boolean f32486d = false;

    /* JADX INFO: renamed from: e */
    public boolean f32487e = false;

    /* JADX INFO: renamed from: f */
    public clz f32488f;

    /* JADX INFO: renamed from: g */
    public qzz f32489g;

    /* JADX INFO: renamed from: h */
    public ruy f32490h;

    /* JADX INFO: renamed from: i */
    public u1z f32491i;

    /* JADX INFO: renamed from: j */
    public d3z f32492j;

    /* JADX INFO: renamed from: k */
    public vez f32493k;

    /* JADX INFO: renamed from: l */
    public AbstractC18764n2 f32494l;

    /* JADX INFO: renamed from: m */
    public g500 f32495m;

    /* JADX INFO: renamed from: n */
    public hi40 f32496n;

    /* JADX INFO: renamed from: o */
    public ki40 f32497o;

    /* JADX INFO: renamed from: p */
    public l300 f32498p;

    /* JADX INFO: renamed from: q */
    public s000 f32499q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MessagesAct$a */
    public class C8679a implements ujh0 {
        public C8679a() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            if (hcm.m134472r().m134479q(pzi0.m174454o())) {
                hcm.m134472r().m134477E(true);
            }
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
        }
    }

    /* JADX INFO: renamed from: N2 */
    public static Intent m50115N2(Context context, String str, boolean z, boolean z2, int i, String str2, boolean z3) {
        Intent intentM50130o2 = m50130o2(context, str, z, z2, null, i);
        intentM50130o2.putExtra("move_by_message_id", str2);
        intentM50130o2.putExtra("ai_from_tag", z3 ? "chat_cell" : "");
        return intentM50130o2;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: g2 */
    public static Intent m50123g2(Context context, String str, int i, pf60<String, String>... pf60VarArr) {
        Intent intentM50130o2 = m50130o2(context, str, true, false, null, i);
        for (pf60<String, String> pf60Var : pf60VarArr) {
            intentM50130o2.putExtra(pf60Var.f152156a, pf60Var.f152157b);
        }
        return intentM50130o2;
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m50124h2(Context context, String str, boolean z, int i, String str2, String str3) {
        return m50133r2(context, str, z, false, false, false, null, i, str2, false, "", -1, str3);
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m50125i2(Context context, String str, boolean z, String str2, int i) {
        return m50133r2(context, str, false, false, false, false, null, -1, null, z, str2, i, "");
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m50126k2(Context context, String str, boolean z, boolean z2) {
        return m50130o2(context, str, z, z2, null, -1);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m50127l2(Context context, String str, boolean z, boolean z2, int i) {
        return m50130o2(context, str, z, z2, null, i);
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m50128m2(Context context, String str, boolean z, boolean z2, int i, String str2) {
        Intent intentM50130o2 = m50130o2(context, str, z, z2, null, i);
        intentM50130o2.putExtra("presetMsg", str2);
        return intentM50130o2;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m50129n2(Context context, String str, boolean z, boolean z2, int i, boolean z3) {
        Intent intentM50130o2 = m50130o2(context, str, z, z2, null, i);
        intentM50130o2.putExtra("media_keyboard", z3);
        return intentM50130o2;
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m50130o2(Context context, String str, boolean z, boolean z2, Intent intent, int i) {
        return m50131p2(context, str, z, z2, false, false, intent, i);
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m50131p2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return m50133r2(context, str, z, z2, z3, z4, intent, i, null, false, "", -1, "");
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m50132q2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i, String str2) {
        return m50133r2(context, str, z, z2, z3, z4, intent, i, str2, false, "", -1, "");
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r2 */
    public static Intent m50133r2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i, String str2, boolean z5, String str3, int i2, String str4) {
        Intent intent2 = new Intent(context, (Class<?>) MessagesAct.class);
        intent2.putExtra("conversationId", str);
        intent2.putExtra("userId", str);
        intent2.putExtra("FROM", i);
        intent2.putExtra("keyboardUp", z);
        intent2.putExtra("showGiftRain", z4);
        intent2.putExtra("isFromMatchReply", z3);
        if (NullChecker.m82486a(intent)) {
            l51.m152910p(intent2, intent);
        }
        if (z2) {
            intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent2.addFlags(524288);
        }
        if (!TextUtils.isEmpty(str2)) {
            intent2.putExtra("autoSendMessage", str2);
        }
        intent2.putExtra("is_pick_message", z5);
        intent2.putExtra("picked_messages", str3);
        intent2.putExtra("max_limit", i2);
        if (!TextUtils.isEmpty(str4)) {
            intent2.putExtra("appendMsg", str4);
        }
        if (TextUtils.isEmpty(str)) {
            CrashHelper.m82479c(new IllegalStateException("MessagesAct: convId = " + str + " intent = " + intent2 + " data = " + intent2.getExtras().toString()));
        }
        m50136z2(i);
        return intent2;
    }

    /* JADX INFO: renamed from: s2 */
    public static String m50134s2(Act.C4450r c4450r) {
        if (!NullChecker.m82486a(c4450r)) {
            return null;
        }
        Activity activity = c4450r.f16062a.get();
        if (!(activity instanceof MessagesAct)) {
            return null;
        }
        clz<? extends DbObject, ?> clzVarMo50158l = ((MessagesAct) activity).mo50158l();
        if (NullChecker.m82486a(clzVarMo50158l)) {
            return clzVarMo50158l.mo111034r3();
        }
        return null;
    }

    /* JADX INFO: renamed from: u2 */
    public static void m50135u2(Intent intent, String str) {
        intent.putExtra("sub_from", str);
    }

    /* JADX INFO: renamed from: z2 */
    public static void m50136z2(int i) {
        if (CoreModule.m30933P().m143405a().mo34533k4() && i == 29) {
            CoreModule.m30933P().m143405a().mo34417Ta(true);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public boolean m50137A2() {
        return this.f32487e;
    }

    @Override // p153l.mzl
    /* JADX INFO: renamed from: B0 */
    public u1z mo50138B0() {
        return this.f32491i;
    }

    /* JADX INFO: renamed from: B2 */
    public final void m50139B2(j3z j3zVar, iam iamVar) {
        j3zVar.mo52715C(iamVar);
        j3zVar.m143373f0(this);
        j3zVar.mo40472Z();
    }

    /* JADX INFO: renamed from: C2 */
    public boolean m50140C2() {
        return this.f32493k.m201097F0();
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m50141D2() {
        return false;
    }

    /* JADX INFO: renamed from: E2 */
    public boolean m50142E2() {
        return this.f32486d;
    }

    @Override // p153l.mzl
    /* JADX INFO: renamed from: F */
    public ruy mo50143F() {
        return this.f32490h;
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ boolean m50145H2(final String str, int i, int i2, Intent intent) {
        if (CoreModule.m30933P().m143412i().mo180496l0() || CoreModule.m30933P().m143412i().mo180339J()) {
            CoreModule.m30933P().m143412i().mo180366N1(act(), new x20() { // from class: l.y800
                @Override // p153l.x20
                public final void call() {
                    this.f197932a.m50144F2(str);
                }
            }, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m50146I2(final String str) {
        act().startActivityForResult(CoreModule.m30933P().m143412i().mo180361M3(act(), "from_message"), new C4468a.a() { // from class: l.u800
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f177961a.m50145H2(str, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m50148L2(User user) {
        this.f32489g.m178888B1();
        this.f32492j.m113958E1();
        CoreModule.f18264c.f20384f0.m33653Fo();
        CoreModule.f18264c.f20381e0.m116527W9(this.f32488f.mo111034r3());
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m50149M2(PurchaseType purchaseType) {
        this.f32489g.m178888B1();
        this.f32492j.m113958E1();
        CoreModule.f18264c.f20384f0.m33653Fo();
        CoreModule.f18264c.f20381e0.m116527W9(this.f32488f.mo111034r3());
    }

    /* JADX INFO: renamed from: Q2 */
    public void m50150Q2(String str, String str2, boolean z) {
        clz clzVar = this.f32488f;
        if (clzVar instanceof tvz) {
            ((tvz) clzVar).m193327xg(str, str2, z);
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void m50151R2(Message message) {
        if (NullChecker.m82486a(message)) {
            List<Media> list = message.media;
            if (!NullChecker.m82486a(list) || list.size() <= 0) {
                m50152S2("text", message.cid);
                return;
            }
            if (list.get(0) instanceof Picture) {
                m50152S2("picture", message.cid);
                return;
            }
            boolean z = list.get(0) instanceof Video;
            String str = message.cid;
            if (z) {
                m50152S2("video", str);
            } else {
                m50152S2("text", str);
            }
        }
    }

    /* JADX INFO: renamed from: S2 */
    public void m50152S2(String str, String str2) {
        m50153T2(str, str2, false);
    }

    /* JADX INFO: renamed from: T2 */
    public void m50153T2(final String str, String str2, boolean z) {
        if ((CoreModule.m30933P().m143412i().mo180570z(str2) || z) && !CoreModule.m30933P().m143412i().mo180496l0() && !CoreModule.m30933P().m143412i().mo180339J()) {
            CoreModule.m30933P().m143412i().mo180366N1(act(), new x20() { // from class: l.s800
                @Override // p153l.x20
                public final void call() {
                    this.f166734a.m50146I2(str);
                }
            }, false);
        } else if (CoreModule.m30933P().m143412i().mo180496l0()) {
            CoreModule.m30933P().m143412i().mo180366N1(act(), new x20() { // from class: l.t800
                @Override // p153l.x20
                public final void call() {
                    this.f172485a.m50147K2(str);
                }
            }, true);
        } else {
            m50147K2(str);
        }
    }

    /* JADX INFO: renamed from: U2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m50147K2(String str) {
        if (!str.isEmpty()) {
            i4g0.m138523u("e_secret_message", pageId(), jyb.m147494Y("other_user_id", this.f32488f.mo111034r3()), jyb.m147494Y(Constants.MessagePayloadKeys.MESSAGE_TYPE, str));
        }
        CoreModule.m30933P().m143412i().mo34524i6(act(), "p_chat_view,e_secret_message,click", Privilege.vip_message_block_gp);
        duringCreated(CoreModule.m30933P().m143412i().mo180405U2()).subscribe(psd0.m173596G(new y20() { // from class: l.v800
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182842a.m50149M2((PurchaseType) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().filter(new qcj() { // from class: l.w800
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(user != null && user.isVIP());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.x800
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192774a.m50148L2((User) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
    }

    @Override // p153l.mzl
    /* JADX INFO: renamed from: d0 */
    public vez mo50155d0() {
        return this.f32493k;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.addAll(this.f32488f.mo110944Z2());
        return arrayListDebugItems;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (CoreModule.m30933P().m143412i().mo180362M4()) {
            mo50157k0().m183871k0(motionEvent);
        }
        if (mo50138B0().m194205m1(motionEvent)) {
            return true;
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e2 */
    public void m50156e2() {
        if (NullChecker.m82486a(this.f32492j)) {
            this.f32492j.m113995Y();
            this.f32492j.m113952A1();
        }
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        int i;
        if (NullChecker.m82486a(this.f32494l)) {
            this.f32494l.mo125461e();
        }
        if (o3z.m165898g().m165903h(CoreModule.f18264c.f20381e0.m116600p9())) {
            o3z.m165898g().f144869a.put("");
        }
        m195422s0();
        if (CoreModule.m30932N().mo61549ko()) {
            CoreModule.f18264c.f20384f0.f20651W1.m137019l(uxj0.f181467a);
        }
        if (CoreModule.m30933P().m143412i().mo180509n5() && NullChecker.m82486a(this.f32488f) && (7 == (i = this.f32488f.f82475d) || 31 == i)) {
            setResult(-1);
        }
        if (gta.m132210e().m132214d().mo34943w()) {
            rvm.m183278f(this.f32488f.f82474c);
        }
        clz clzVar = this.f32488f;
        if (clzVar != null) {
            clzVar.mo111068y6();
        }
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f32489g.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        l600.m153046b();
        m195422s0();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("conversationId");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = intent.getStringExtra("userId");
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f32485c = CoreModule.f18264c.f20384f0.m33859Xe(stringExtra);
        }
        if (NullChecker.m82486a(this.f32485c)) {
            this.f32487e = this.f32485c.unreadMessages > 0;
        }
        this.f32486d = intent.getBooleanExtra("is_pick_message", false);
        if (pm6.m172914b(this.f32485c, stringExtra)) {
            this.f32488f = new ggz(this, this.f32485c);
            this.f32489g = new lgz(this);
        } else {
            if (this.f32485c == null && TextUtils.equals(CoreModule.f18264c.f20384f0.f20610J0.get(), stringExtra) && !TextUtils.isEmpty(stringExtra)) {
                this.f32488f = new jlz(this, null, stringExtra);
            } else if (this.f32485c == null && this.f32486d) {
                klz klzVar = new klz(this, null, stringExtra);
                this.f32488f = klzVar;
                klzVar.mo110958b7(true);
            } else {
                this.f32488f = new tvz(this, this.f32485c);
            }
            this.f32489g = new yxz(this);
        }
        int intExtra = intent.getIntExtra("push_type", 0);
        m50139B2(this.f32488f, this.f32489g);
        this.f32491i = new u1z(this);
        this.f32492j = new d3z(this);
        if (intExtra > 0 && CoreModule.m30933P().m143412i().mo180477h1()) {
            this.f32492j.m113976O1(intExtra);
        }
        m50139B2(this.f32491i, this.f32492j);
        this.f32496n = new hi40(this);
        ki40 ki40Var = new ki40(this);
        this.f32497o = ki40Var;
        m50139B2(this.f32496n, ki40Var);
        this.f32493k = new vez(this);
        ffz ffzVar = new ffz(this);
        this.f32494l = ffzVar;
        m50139B2(this.f32493k, ffzVar);
        this.f32495m = new g500(this);
        m50139B2(this.f32495m, new i500(this));
        this.f32498p = new l300(this);
        m50139B2(this.f32498p, new n300(this));
        if (pm6.m172913a(this.f32485c)) {
            this.f32490h = new avy(this);
            m50139B2(this.f32490h, new bvy(this));
        } else {
            this.f32490h = new fwy(this);
            m50139B2(this.f32490h, new hwy(this));
        }
        if (CoreModule.m30933P().m143412i().mo180362M4()) {
            this.f32499q = new s000(this);
            m50139B2(this.f32499q, new h100(this));
        }
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        clz clzVar = this.f32488f;
        if (clzVar == null || TextUtils.isEmpty(clzVar.mo111034r3())) {
            m68056e2();
            return;
        }
        this.f32490h.mo40473a0();
        this.f32488f.mo40473a0();
        this.f32491i.mo40473a0();
        this.f32493k.mo40473a0();
        this.f32495m.mo40473a0();
        this.f32498p.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return true;
    }

    @Override // p153l.mzl
    /* JADX INFO: renamed from: k0 */
    public s000 mo50157k0() {
        return this.f32499q;
    }

    @Override // p153l.mzl
    /* JADX INFO: renamed from: l */
    public clz<? extends DbObject, ?> mo50158l() {
        return this.f32488f;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // p153l.mzl
    /* JADX INFO: renamed from: o0 */
    public l300 mo50159o0() {
        return this.f32498p;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f32488f.m110987h6(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f32488f.m110997j6()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f32489g.mo154146E1(menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        AiTranslateView.m50953Z();
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        m68056e2();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        if (NullChecker.m82486a(this.f32488f)) {
            this.f32488f.mo111002k6(i, menu);
        }
        return super.onMenuOpened(i, menu);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        toh0.m192049i(intent);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f32488f.mo111007l6(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f32488f.m111012m6(list);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f32488f.m111022o6(menu) || super.onPrepareOptionsMenu(menu);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onRecordVideoResult(String str) {
        this.f32488f.m111032q6(str);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        l600.m153047c();
        super.onResumeLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        this.f32488f.m111037r6(str);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f32489g.m178891F1(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return this.f32488f.pageId();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (TextUtils.isEmpty(this.f32488f.m110989i3()) || TextUtils.isEmpty(this.f32488f.mo111034r3())) {
            m68056e2();
            return;
        }
        if (NullChecker.m82486a(this.f32485c) && !this.f32485c.isOtherStatusInvalid() && this.f32485c.isFakeOneSideConv() && this.f32485c.f21116mm <= 0 && !CoreModule.f18264c.f20381e0.m116593na().isSVIP()) {
            m68056e2();
            return;
        }
        C8687b.m50235d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(sfj0.C20032a.m185615h("moments_user_id", this.f32488f.mo111034r3()));
        String stringExtra = getIntent().getStringExtra("ai_from_tag");
        if (CoreModule.m30932N().mo61558n7() && !TextUtils.isEmpty(stringExtra)) {
            arrayList.add(sfj0.C20032a.m185615h("ai_from", stringExtra));
        }
        clz clzVar = this.f32488f;
        User userM111057w3 = clzVar.m111057w3(clzVar.mo111034r3());
        if (NullChecker.m82486a(userM111057w3)) {
            String strRelativeTimeForTrack = "";
            if (!userM111057w3.location.isHideUpdateTime() && !CoreModule.f18264c.f20303E0.m141089x3(userM111057w3) && (userM111057w3.isMe() || User.isMatched(userM111057w3) || pzi0.m174454o() - userM111057w3.location.updatedTime <= 1.728E8d)) {
                strRelativeTimeForTrack = userM111057w3.relativeTimeForTrack();
            }
            arrayList.add(sfj0.C20032a.m185615h("lastactivity_time", strRelativeTimeForTrack));
        }
        if (this.f32488f.mo110970e4()) {
            arrayList.add(sfj0.C20032a.m185615h("groupchat_id", this.f32488f.mo111034r3()));
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(this.f32488f.mo111034r3());
            arrayList.add(sfj0.C20032a.m185615h("is_anonymou_group", NullChecker.m82486a(chatGroupM32923s6) ? TEnum.equals(chatGroupM32923s6.groupType, "anonymous") : false ? "1" : "0"));
        }
        if (CoreModule.m30933P().m143412i().mo180446c()) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(this.f32488f.m110989i3());
            arrayList.add(sfj0.C20032a.m185616i("is_quickchatbell", NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.property.quickchat.bell));
        }
        arrayList.add(sfj0.C20032a.m185616i("is_from_specialguest_type", false));
        arrayList.add(sfj0.C20032a.m185615h("unlocked_highest_heat_level", this.f32488f.mo111069z3()));
        arrayList.add(sfj0.C20032a.m185615h("is_tbd", "0"));
        if (NullChecker.m82486a(this.f32485c) && this.f32485c.isQuickChatConv() && CoreModule.f18264c.f20381e0.m116593na().isFakeUser()) {
            arrayList.add(sfj0.C20032a.m185615h("fake_quickchat_type", CoreModule.m30933P().m143412i().mo180490j5(this.f32485c) ? "fake_voicechat" : "fake_onlinechat"));
        }
        sfj0.C20032a[] c20032aArr = new sfj0.C20032a[arrayList.size()];
        arrayList.toArray(c20032aArr);
        this.pageHelper.m152780o(sfj0.m185595b(c20032aArr));
        super.preCreateView(bundle);
        if (h39.m133424M()) {
            addSwipeBackListener(new C8679a());
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        setTheme(m50162w2());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super.shouldBlockOnCreate(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void showDebugMenu() {
        super.showDebugMenu();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f32488f.m111023o7();
    }

    @Override // p153l.mzl
    /* JADX INFO: renamed from: u0 */
    public g500 mo50160u0() {
        return this.f32495m;
    }

    @Nullable
    /* JADX INFO: renamed from: v2 */
    public Conversation m50161v2() {
        return this.f32485c;
    }

    /* JADX INFO: renamed from: w2 */
    public final int m50162w2() {
        return gta.m132210e().m132214d().mo34702I4() ? cgc0.f81654j : cgc0.f81653i;
    }

    @Override // p153l.mzl
    /* JADX INFO: renamed from: x0 */
    public hi40 mo50163x0() {
        return this.f32496n;
    }

    /* JADX INFO: renamed from: y2 */
    public qzz m50164y2() {
        return this.f32489g;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        this.f32488f.m111017n6(list, i);
    }
}
