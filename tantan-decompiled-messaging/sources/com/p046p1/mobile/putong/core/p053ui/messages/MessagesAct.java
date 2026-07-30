package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.messages.view.AiTranslateView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p149l.AbstractC18604n2;
import p149l.bpz;
import p149l.d30;
import p149l.dmy;
import p149l.e30;
import p149l.e51;
import p149l.emy;
import p149l.fcz;
import p149l.guy;
import p149l.hpd0;
import p149l.i6z;
import p149l.iny;
import p149l.j760;
import p149l.j7z;
import p149l.jwz;
import p149l.kny;
import p149l.ksz;
import p149l.lwz;
import p149l.mbh0;
import p149l.mcz;
import p149l.mgh0;
import p149l.mkd0;
import p149l.ml6;
import p149l.mqi0;
import p149l.muy;
import p149l.ncz;
import p149l.o6j0;
import p149l.o7z;
import p149l.ouz;
import p149l.oxz;
import p149l.qtm;
import p149l.quz;
import p149l.r9m;
import p149l.roj0;
import p149l.rol;
import p149l.ruy;
import p149l.s7m;
import p149l.t940;
import p149l.tqz;
import p149l.uaq;
import p149l.uly;
import p149l.ura;
import p149l.uwl;
import p149l.vqd0;
import p149l.vrz;
import p149l.vwb;
import p149l.w940;
import p149l.w9j;
import p149l.wmz;
import p149l.x7c0;
import p149l.xsy;
import p149l.y19;
import p149l.y5z;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MessagesAct extends PutongAct implements rol, uwl, uaq {

    /* JADX INFO: renamed from: r */
    public static vqd0 f31635r = new vqd0("sent_foul_words_users_set_" + CoreModule.m29931H().userId(), new HashSet());

    /* JADX INFO: renamed from: s */
    public static hpd0 f31636s = new hpd0("enter_as_send_alert", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public Conversation f31637c = null;

    /* JADX INFO: renamed from: d */
    public boolean f31638d = false;

    /* JADX INFO: renamed from: e */
    public boolean f31639e = false;

    /* JADX INFO: renamed from: f */
    public fcz f31640f;

    /* JADX INFO: renamed from: g */
    public tqz f31641g;

    /* JADX INFO: renamed from: h */
    public uly f31642h;

    /* JADX INFO: renamed from: i */
    public xsy f31643i;

    /* JADX INFO: renamed from: j */
    public guy f31644j;

    /* JADX INFO: renamed from: k */
    public y5z f31645k;

    /* JADX INFO: renamed from: l */
    public AbstractC18604n2 f31646l;

    /* JADX INFO: renamed from: m */
    public jwz f31647m;

    /* JADX INFO: renamed from: n */
    public t940 f31648n;

    /* JADX INFO: renamed from: o */
    public w940 f31649o;

    /* JADX INFO: renamed from: p */
    public ouz f31650p;

    /* JADX INFO: renamed from: q */
    public vrz f31651q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MessagesAct$a */
    public class C8516a implements mbh0 {
        public C8516a() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            if (r9m.m178395r().m178402q(mqi0.m155944o())) {
                r9m.m178395r().m178400E(true);
            }
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
        }
    }

    /* JADX INFO: renamed from: M2 */
    public static Intent m48932M2(Context context, String str, boolean z, boolean z2, int i, String str2, boolean z3) {
        Intent intentM48947n2 = m48947n2(context, str, z, z2, null, i);
        intentM48947n2.putExtra("move_by_message_id", str2);
        intentM48947n2.putExtra("ai_from_tag", z3 ? "chat_cell" : "");
        return intentM48947n2;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: e2 */
    public static Intent m48940e2(Context context, String str, int i, j760<String, String>... j760VarArr) {
        Intent intentM48947n2 = m48947n2(context, str, true, false, null, i);
        for (j760<String, String> j760Var : j760VarArr) {
            intentM48947n2.putExtra(j760Var.f116564a, j760Var.f116565b);
        }
        return intentM48947n2;
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m48941g2(Context context, String str, boolean z, int i, String str2, String str3) {
        return m48950q2(context, str, z, false, false, false, null, i, str2, false, "", -1, str3);
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m48942h2(Context context, String str, boolean z, String str2, int i) {
        return m48950q2(context, str, false, false, false, false, null, -1, null, z, str2, i, "");
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m48943i2(Context context, String str, boolean z, boolean z2) {
        return m48947n2(context, str, z, z2, null, -1);
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m48944k2(Context context, String str, boolean z, boolean z2, int i) {
        return m48947n2(context, str, z, z2, null, i);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m48945l2(Context context, String str, boolean z, boolean z2, int i, String str2) {
        Intent intentM48947n2 = m48947n2(context, str, z, z2, null, i);
        intentM48947n2.putExtra("presetMsg", str2);
        return intentM48947n2;
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m48946m2(Context context, String str, boolean z, boolean z2, int i, boolean z3) {
        Intent intentM48947n2 = m48947n2(context, str, z, z2, null, i);
        intentM48947n2.putExtra("media_keyboard", z3);
        return intentM48947n2;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m48947n2(Context context, String str, boolean z, boolean z2, Intent intent, int i) {
        return m48948o2(context, str, z, z2, false, false, intent, i);
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m48948o2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return m48950q2(context, str, z, z2, z3, z4, intent, i, null, false, "", -1, "");
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m48949p2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i, String str2) {
        return m48950q2(context, str, z, z2, z3, z4, intent, i, str2, false, "", -1, "");
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q2 */
    public static Intent m48950q2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i, String str2, boolean z5, String str3, int i2, String str4) {
        Intent intent2 = new Intent(context, (Class<?>) MessagesAct.class);
        intent2.putExtra("conversationId", str);
        intent2.putExtra("userId", str);
        intent2.putExtra("FROM", i);
        intent2.putExtra("keyboardUp", z);
        intent2.putExtra("showGiftRain", z4);
        intent2.putExtra("isFromMatchReply", z3);
        if (NullChecker.m81303a(intent)) {
            e51.m114765p(intent2, intent);
        }
        if (z2) {
            intent2.addFlags(268435456);
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
            CrashHelper.m81296c(new IllegalStateException("MessagesAct: convId = " + str + " intent = " + intent2 + " data = " + intent2.getExtras().toString()));
        }
        m48953y2(i);
        return intent2;
    }

    /* JADX INFO: renamed from: r2 */
    public static String m48951r2(Act.C4299r c4299r) {
        if (!NullChecker.m81303a(c4299r)) {
            return null;
        }
        Activity activity = c4299r.f15343a.get();
        if (!(activity instanceof MessagesAct)) {
            return null;
        }
        fcz<? extends DbObject, ?> fczVarMo48974l = ((MessagesAct) activity).mo48974l();
        if (NullChecker.m81303a(fczVarMo48974l)) {
            return fczVarMo48974l.mo120828r3();
        }
        return null;
    }

    /* JADX INFO: renamed from: s2 */
    public static void m48952s2(Intent intent, String str) {
        intent.putExtra("sub_from", str);
    }

    /* JADX INFO: renamed from: y2 */
    public static void m48953y2(int i) {
        if (CoreModule.m29935P().m94651a().mo33530k4() && i == 29) {
            CoreModule.m29935P().m94651a().mo33414Ta(true);
        }
    }

    @Override // p149l.uwl
    /* JADX INFO: renamed from: A0 */
    public xsy mo48954A0() {
        return this.f31643i;
    }

    /* JADX INFO: renamed from: A2 */
    public final void m48955A2(muy muyVar, s7m s7mVar) {
        muyVar.mo51532C(s7mVar);
        muyVar.m156456f0(this);
        muyVar.mo39469Z();
    }

    /* JADX INFO: renamed from: B2 */
    public boolean m48956B2() {
        return this.f31645k.m213052F0();
    }

    /* JADX INFO: renamed from: C2 */
    public boolean m48957C2() {
        return false;
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m48958D2() {
        return this.f31638d;
    }

    @Override // p149l.uwl
    /* JADX INFO: renamed from: E */
    public uly mo48959E() {
        return this.f31642h;
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ boolean m48961F2(final String str, int i, int i2, Intent intent) {
        if (CoreModule.m29935P().m94658i().mo158404l0() || CoreModule.m29935P().m94658i().mo158247J()) {
            CoreModule.m29935P().m94658i().mo158274N1(act(), new d30() { // from class: l.b000
                @Override // p149l.d30
                public final void call() {
                    this.f72398a.m48960E2(str);
                }
            }, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m48962H2(final String str) {
        act().startActivityForResult(CoreModule.m29935P().m94658i().mo158269M3(act(), "from_message"), new C4317a.a() { // from class: l.xzz
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f195235a.m48961F2(str, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m48964K2(User user) {
        this.f31641g.m190248B1();
        this.f31644j.m128130E1();
        CoreModule.f17545c.f19642f0.m32650Fo();
        CoreModule.f17545c.f19639e0.m169454W9(this.f31640f.mo120828r3());
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m48965L2(PurchaseType purchaseType) {
        this.f31641g.m190248B1();
        this.f31644j.m128130E1();
        CoreModule.f17545c.f19642f0.m32650Fo();
        CoreModule.f17545c.f19639e0.m169454W9(this.f31640f.mo120828r3());
    }

    /* JADX INFO: renamed from: N2 */
    public void m48966N2(String str, String str2, boolean z) {
        fcz fczVar = this.f31640f;
        if (fczVar instanceof wmz) {
            ((wmz) fczVar).m204539xg(str, str2, z);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m48967Q2(Message message) {
        if (NullChecker.m81303a(message)) {
            List<Media> list = message.media;
            if (!NullChecker.m81303a(list) || list.size() <= 0) {
                m48968R2("text", message.cid);
                return;
            }
            if (list.get(0) instanceof Picture) {
                m48968R2("picture", message.cid);
                return;
            }
            boolean z = list.get(0) instanceof Video;
            String str = message.cid;
            if (z) {
                m48968R2("video", str);
            } else {
                m48968R2("text", str);
            }
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void m48968R2(String str, String str2) {
        m48969S2(str, str2, false);
    }

    /* JADX INFO: renamed from: S2 */
    public void m48969S2(final String str, String str2, boolean z) {
        if ((CoreModule.m29935P().m94658i().mo158478z(str2) || z) && !CoreModule.m29935P().m94658i().mo158404l0() && !CoreModule.m29935P().m94658i().mo158247J()) {
            CoreModule.m29935P().m94658i().mo158274N1(act(), new d30() { // from class: l.vzz
                @Override // p149l.d30
                public final void call() {
                    this.f183694a.m48962H2(str);
                }
            }, false);
        } else if (CoreModule.m29935P().m94658i().mo158404l0()) {
            CoreModule.m29935P().m94658i().mo158274N1(act(), new d30() { // from class: l.wzz
                @Override // p149l.d30
                public final void call() {
                    this.f188774a.m48963I2(str);
                }
            }, true);
        } else {
            m48963I2(str);
        }
    }

    /* JADX INFO: renamed from: T2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m48963I2(String str) {
        if (!str.isEmpty()) {
            zvf0.m220399u("e_secret_message", pageId(), vwb.m200311Y("other_user_id", this.f31640f.mo120828r3()), vwb.m200311Y(Constants.MessagePayloadKeys.MESSAGE_TYPE, str));
        }
        CoreModule.m29935P().m94658i().mo33521i6(act(), "p_chat_view,e_secret_message,click", Privilege.vip_message_block_gp);
        duringCreated(CoreModule.m29935P().m94658i().mo158313U2()).subscribe(mkd0.m154955G(new e30() { // from class: l.yzz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200923a.m48965L2((PurchaseType) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().filter(new w9j() { // from class: l.zzz
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(user != null && user.isVIP());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.a000
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67000a.m48964K2((User) obj);
            }
        }));
    }

    @Override // p149l.uwl
    /* JADX INFO: renamed from: c0 */
    public y5z mo48971c0() {
        return this.f31645k;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
    }

    /* JADX INFO: renamed from: d2 */
    public void m48972d2() {
        if (NullChecker.m81303a(this.f31644j)) {
            this.f31644j.m128167Y();
            this.f31644j.m128124A1();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.addAll(this.f31640f.mo120738Z2());
        return arrayListDebugItems;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (CoreModule.m29935P().m94658i().mo158270M4()) {
            mo48973j0().m199793k0(motionEvent);
        }
        if (mo48954A0().m210927m1(motionEvent)) {
            return true;
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        int i;
        if (NullChecker.m81303a(this.f31646l)) {
            this.f31646l.mo134706e();
        }
        if (ruy.m181215g().m181220h(CoreModule.f17545c.f19639e0.m169527p9())) {
            ruy.m181215g().f161150a.put("");
        }
        m192796r0();
        if (CoreModule.m29934N().mo60365ko()) {
            CoreModule.f17545c.f19642f0.f19909W1.m132487l(roj0.f160388a);
        }
        if (CoreModule.m29935P().m94658i().mo158417n5() && NullChecker.m81303a(this.f31640f) && (7 == (i = this.f31640f.f96912d) || 31 == i)) {
            setResult(-1);
        }
        if (ura.m195053e().m195057d().mo33940w()) {
            qtm.m176469f(this.f31640f.f96911c);
        }
        fcz fczVar = this.f31640f;
        if (fczVar != null) {
            fczVar.mo120862y6();
        }
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31641g.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        oxz.m166601b();
        m192796r0();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("conversationId");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = intent.getStringExtra("userId");
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f31637c = CoreModule.f17545c.f19642f0.m32856Xe(stringExtra);
        }
        if (NullChecker.m81303a(this.f31637c)) {
            this.f31639e = this.f31637c.unreadMessages > 0;
        }
        this.f31638d = intent.getBooleanExtra("is_pick_message", false);
        if (ml6.m155117b(this.f31637c, stringExtra)) {
            this.f31640f = new j7z(this, this.f31637c);
            this.f31641g = new o7z(this);
        } else {
            if (this.f31637c == null && TextUtils.equals(CoreModule.f17545c.f19642f0.f19868J0.get(), stringExtra) && !TextUtils.isEmpty(stringExtra)) {
                this.f31640f = new mcz(this, null, stringExtra);
            } else if (this.f31637c == null && this.f31638d) {
                ncz nczVar = new ncz(this, null, stringExtra);
                this.f31640f = nczVar;
                nczVar.mo120752b7(true);
            } else {
                this.f31640f = new wmz(this, this.f31637c);
            }
            this.f31641g = new bpz(this);
        }
        int intExtra = intent.getIntExtra("push_type", 0);
        m48955A2(this.f31640f, this.f31641g);
        this.f31643i = new xsy(this);
        this.f31644j = new guy(this);
        if (intExtra > 0 && CoreModule.m29935P().m94658i().mo158385h1()) {
            this.f31644j.m128148O1(intExtra);
        }
        m48955A2(this.f31643i, this.f31644j);
        this.f31648n = new t940(this);
        w940 w940Var = new w940(this);
        this.f31649o = w940Var;
        m48955A2(this.f31648n, w940Var);
        this.f31645k = new y5z(this);
        i6z i6zVar = new i6z(this);
        this.f31646l = i6zVar;
        m48955A2(this.f31645k, i6zVar);
        this.f31647m = new jwz(this);
        m48955A2(this.f31647m, new lwz(this));
        this.f31650p = new ouz(this);
        m48955A2(this.f31650p, new quz(this));
        if (ml6.m155116a(this.f31637c)) {
            this.f31642h = new dmy(this);
            m48955A2(this.f31642h, new emy(this));
        } else {
            this.f31642h = new iny(this);
            m48955A2(this.f31642h, new kny(this));
        }
        if (CoreModule.m29935P().m94658i().mo158270M4()) {
            this.f31651q = new vrz(this);
            m48955A2(this.f31651q, new ksz(this));
        }
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        fcz fczVar = this.f31640f;
        if (fczVar == null || TextUtils.isEmpty(fczVar.mo120828r3())) {
            m66873d2();
            return;
        }
        this.f31642h.mo39470a0();
        this.f31640f.mo39470a0();
        this.f31643i.mo39470a0();
        this.f31645k.mo39470a0();
        this.f31647m.mo39470a0();
        this.f31650p.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return true;
    }

    @Override // p149l.uwl
    /* JADX INFO: renamed from: j0 */
    public vrz mo48973j0() {
        return this.f31651q;
    }

    @Override // p149l.uwl
    /* JADX INFO: renamed from: l */
    public fcz<? extends DbObject, ?> mo48974l() {
        return this.f31640f;
    }

    @Override // p149l.uwl
    /* JADX INFO: renamed from: m0 */
    public ouz mo48975m0() {
        return this.f31650p;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f31640f.m120781h6(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f31640f.m120791j6()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f31641g.mo103179E1(menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        AiTranslateView.m49770Z();
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        m66873d2();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        if (NullChecker.m81303a(this.f31640f)) {
            this.f31640f.mo120796k6(i, menu);
        }
        return super.onMenuOpened(i, menu);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mgh0.m154553i(intent);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f31640f.mo120801l6(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        this.f31640f.m120806m6(list);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f31640f.m120816o6(menu) || super.onPrepareOptionsMenu(menu);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onRecordVideoResult(String str) {
        this.f31640f.m120826q6(str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        oxz.m166602c();
        super.onResumeLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onTakePictureResult(String str) {
        this.f31640f.m120831r6(str);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f31641g.m190251F1(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return this.f31640f.pageId();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        if (TextUtils.isEmpty(this.f31640f.m120783i3()) || TextUtils.isEmpty(this.f31640f.mo120828r3())) {
            m66873d2();
            return;
        }
        if (NullChecker.m81303a(this.f31637c) && !this.f31637c.isOtherStatusInvalid() && this.f31637c.isFakeOneSideConv() && this.f31637c.f20374mm <= 0 && !CoreModule.f17545c.f19639e0.m169520na().isSVIP()) {
            m66873d2();
            return;
        }
        C8524b.m49052d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.C18854a.m162878h("moments_user_id", this.f31640f.mo120828r3()));
        String stringExtra = getIntent().getStringExtra("ai_from_tag");
        if (CoreModule.m29934N().mo60374n7() && !TextUtils.isEmpty(stringExtra)) {
            arrayList.add(o6j0.C18854a.m162878h("ai_from", stringExtra));
        }
        fcz fczVar = this.f31640f;
        User userM120851w3 = fczVar.m120851w3(fczVar.mo120828r3());
        if (NullChecker.m81303a(userM120851w3)) {
            String strRelativeTimeForTrack = "";
            if (!userM120851w3.location.isHideUpdateTime() && !CoreModule.f17545c.f19561E0.m203801x3(userM120851w3) && (userM120851w3.isMe() || User.isMatched(userM120851w3) || mqi0.m155944o() - userM120851w3.location.updatedTime <= 1.728E8d)) {
                strRelativeTimeForTrack = userM120851w3.relativeTimeForTrack();
            }
            arrayList.add(o6j0.C18854a.m162878h("lastactivity_time", strRelativeTimeForTrack));
        }
        if (this.f31640f.mo120764e4()) {
            arrayList.add(o6j0.C18854a.m162878h("groupchat_id", this.f31640f.mo120828r3()));
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(this.f31640f.mo120828r3());
            arrayList.add(o6j0.C18854a.m162878h("is_anonymou_group", NullChecker.m81303a(chatGroupM31920s6) ? TEnum.equals(chatGroupM31920s6.groupType, "anonymous") : false ? "1" : "0"));
        }
        if (CoreModule.m29935P().m94658i().mo158354c()) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(this.f31640f.m120783i3());
            arrayList.add(o6j0.C18854a.m162879i("is_quickchatbell", NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.property.quickchat.bell));
        }
        arrayList.add(o6j0.C18854a.m162879i("is_from_specialguest_type", false));
        arrayList.add(o6j0.C18854a.m162878h("unlocked_highest_heat_level", this.f31640f.mo120863z3()));
        arrayList.add(o6j0.C18854a.m162878h("is_tbd", "0"));
        if (NullChecker.m81303a(this.f31637c) && this.f31637c.isQuickChatConv() && CoreModule.f17545c.f19639e0.m169520na().isFakeUser()) {
            arrayList.add(o6j0.C18854a.m162878h("fake_quickchat_type", CoreModule.m29935P().m94658i().mo158398j5(this.f31637c) ? "fake_voicechat" : "fake_onlinechat"));
        }
        o6j0.C18854a[] c18854aArr = new o6j0.C18854a[arrayList.size()];
        arrayList.toArray(c18854aArr);
        this.pageHelper.m109039o(o6j0.m162858b(c18854aArr));
        super.preCreateView(bundle);
        if (y19.m212153M()) {
            addSwipeBackListener(new C8516a());
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        setTheme(m48979v2());
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super.shouldBlockOnCreate(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void showDebugMenu() {
        super.showDebugMenu();
    }

    @Override // p149l.uwl
    /* JADX INFO: renamed from: t0 */
    public jwz mo48976t0() {
        return this.f31647m;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return this.f31640f.m120817o7();
    }

    @Nullable
    /* JADX INFO: renamed from: u2 */
    public Conversation m48977u2() {
        return this.f31637c;
    }

    @Override // p149l.uwl
    /* JADX INFO: renamed from: v0 */
    public t940 mo48978v0() {
        return this.f31648n;
    }

    /* JADX INFO: renamed from: v2 */
    public final int m48979v2() {
        return ura.m195053e().m195057d().mo33699I4() ? x7c0.f191341j : x7c0.f191340i;
    }

    /* JADX INFO: renamed from: w2 */
    public tqz m48980w2() {
        return this.f31641g;
    }

    /* JADX INFO: renamed from: z2 */
    public boolean m48981z2() {
        return this.f31639e;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        this.f31640f.m120811n6(list, i);
    }
}
