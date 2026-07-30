package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.messages.view.AiTranslateView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.dmy;
import l.e51;
import l.hpd0;
import l.j760;
import l.j7z;
import l.jwz;
import l.mbh0;
import l.mcz;
import l.mgh0;
import l.mkd0;
import l.mqi0;
import l.ncz;
import l.o6j0;
import l.ouz;
import l.qtm;
import l.roj0;
import l.rol;
import l.s7m;
import l.t940;
import l.uly;
import l.ura;
import l.vqd0;
import l.vrz;
import l.vwb;
import l.w940;
import l.wmz;
import l.x7c0;
import l.y19;
import l.zvf0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.i18n.TextBundle;
import p003l.AbstractC0438n2;
import p003l.bpz;
import p003l.d30;
import p003l.e30;
import p003l.emy;
import p003l.fcz;
import p003l.guy;
import p003l.i6z;
import p003l.iny;
import p003l.kny;
import p003l.ksz;
import p003l.lwz;
import p003l.m250;
import p003l.ml6;
import p003l.muy;
import p003l.o7z;
import p003l.oxz;
import p003l.quz;
import p003l.r9m;
import p003l.ruy;
import p003l.tqz;
import p003l.uaq;
import p003l.uwl;
import p003l.w9j;
import p003l.xsy;
import p003l.y5z;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessagesAct extends PutongAct implements rol, uwl, uaq {

    /* JADX INFO: renamed from: r */
    public static vqd0 f1526r = new vqd0("sent_foul_words_users_set_" + CoreModule.H().userId(), new HashSet());

    /* JADX INFO: renamed from: s */
    public static hpd0 f1527s = new hpd0("enter_as_send_alert", Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public Conversation f1528c = null;

    /* JADX INFO: renamed from: d */
    public boolean f1529d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1530e = false;

    /* JADX INFO: renamed from: f */
    public fcz f1531f;

    /* JADX INFO: renamed from: g */
    public tqz f1532g;

    /* JADX INFO: renamed from: h */
    public uly f1533h;

    /* JADX INFO: renamed from: i */
    public xsy f1534i;

    /* JADX INFO: renamed from: j */
    public guy f1535j;

    /* JADX INFO: renamed from: k */
    public y5z f1536k;

    /* JADX INFO: renamed from: l */
    public AbstractC0438n2 f1537l;

    /* JADX INFO: renamed from: m */
    public jwz f1538m;

    /* JADX INFO: renamed from: n */
    public t940 f1539n;

    /* JADX INFO: renamed from: o */
    public w940 f1540o;

    /* JADX INFO: renamed from: p */
    public ouz f1541p;

    /* JADX INFO: renamed from: q */
    public vrz f1542q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.MessagesAct$a */
    public class C0099a implements mbh0 {
        public C0099a() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m2074D0(boolean z, float f, int i) {
        }

        /* JADX INFO: renamed from: E0 */
        public void m2075E0() {
        }

        /* JADX INFO: renamed from: O */
        public void m2076O() {
            if (r9m.m7149r().m7156q(mqi0.o())) {
                r9m.m7149r().m7154E(true);
            }
        }

        /* JADX INFO: renamed from: Z */
        public void m2077Z() {
        }
    }

    /* JADX INFO: renamed from: M2 */
    public static Intent m2024M2(Context context, String str, boolean z, boolean z2, int i, String str2, boolean z3) {
        Intent intentM2039n2 = m2039n2(context, str, z, z2, null, i);
        intentM2039n2.putExtra("move_by_message_id", str2);
        intentM2039n2.putExtra("ai_from_tag", z3 ? "chat_cell" : "");
        return intentM2039n2;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: e2 */
    public static Intent m2032e2(Context context, String str, int i, j760<String, String>... j760VarArr) {
        Intent intentM2039n2 = m2039n2(context, str, true, false, null, i);
        for (j760<String, String> j760Var : j760VarArr) {
            intentM2039n2.putExtra((String) j760Var.a, (String) j760Var.b);
        }
        return intentM2039n2;
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m2033g2(Context context, String str, boolean z, int i, String str2, String str3) {
        return m2042q2(context, str, z, false, false, false, null, i, str2, false, "", -1, str3);
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m2034h2(Context context, String str, boolean z, String str2, int i) {
        return m2042q2(context, str, false, false, false, false, null, -1, null, z, str2, i, "");
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m2035i2(Context context, String str, boolean z, boolean z2) {
        return m2039n2(context, str, z, z2, null, -1);
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m2036k2(Context context, String str, boolean z, boolean z2, int i) {
        return m2039n2(context, str, z, z2, null, i);
    }

    /* JADX INFO: renamed from: l2 */
    public static Intent m2037l2(Context context, String str, boolean z, boolean z2, int i, String str2) {
        Intent intentM2039n2 = m2039n2(context, str, z, z2, null, i);
        intentM2039n2.putExtra("presetMsg", str2);
        return intentM2039n2;
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m2038m2(Context context, String str, boolean z, boolean z2, int i, boolean z3) {
        Intent intentM2039n2 = m2039n2(context, str, z, z2, null, i);
        intentM2039n2.putExtra("media_keyboard", z3);
        return intentM2039n2;
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m2039n2(Context context, String str, boolean z, boolean z2, Intent intent, int i) {
        return m2040o2(context, str, z, z2, false, false, intent, i);
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m2040o2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i) {
        return m2042q2(context, str, z, z2, z3, z4, intent, i, null, false, "", -1, "");
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m2041p2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i, String str2) {
        return m2042q2(context, str, z, z2, z3, z4, intent, i, str2, false, "", -1, "");
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q2 */
    public static Intent m2042q2(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, Intent intent, int i, String str2, boolean z5, String str3, int i2, String str4) {
        Intent intent2 = new Intent(context, (Class<?>) MessagesAct.class);
        intent2.putExtra("conversationId", str);
        intent2.putExtra("userId", str);
        intent2.putExtra("FROM", i);
        intent2.putExtra("keyboardUp", z);
        intent2.putExtra("showGiftRain", z4);
        intent2.putExtra("isFromMatchReply", z3);
        if (NullChecker.a(intent)) {
            e51.p(intent2, intent);
        }
        if (z2) {
            intent2.addFlags(268435456);
            intent2.addFlags(PKIFailureInfo.signerNotTrusted);
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
            CrashHelper.c(new IllegalStateException("MessagesAct: convId = " + str + " intent = " + intent2 + " data = " + intent2.getExtras().toString()));
        }
        m2045y2(i);
        return intent2;
    }

    /* JADX INFO: renamed from: r2 */
    public static String m2043r2(Act.r rVar) {
        if (!NullChecker.a(rVar)) {
            return null;
        }
        Object obj = (Activity) rVar.a.get();
        if (!(obj instanceof MessagesAct)) {
            return null;
        }
        fcz<? extends DbObject, ?> fczVarMo2066l = ((MessagesAct) obj).mo2066l();
        if (NullChecker.a(fczVarMo2066l)) {
            return fczVarMo2066l.m4295r3();
        }
        return null;
    }

    /* JADX INFO: renamed from: s2 */
    public static void m2044s2(Intent intent, String str) {
        intent.putExtra("sub_from", str);
    }

    /* JADX INFO: renamed from: y2 */
    public static void m2045y2(int i) {
        if (CoreModule.P().a().k4() && i == 29) {
            CoreModule.P().a().Ta(true);
        }
    }

    @Override // p003l.uwl
    /* JADX INFO: renamed from: A0 */
    public xsy mo2046A0() {
        return this.f1534i;
    }

    /* JADX INFO: renamed from: A2 */
    public final void m2047A2(muy muyVar, s7m s7mVar) {
        muyVar.C(s7mVar);
        muyVar.m6498f0(this);
        muyVar.Z();
    }

    /* JADX INFO: renamed from: B2 */
    public boolean m2048B2() {
        return this.f1536k.m8906F0();
    }

    /* JADX INFO: renamed from: C2 */
    public boolean m2049C2() {
        return false;
    }

    /* JADX INFO: renamed from: D2 */
    public boolean m2050D2() {
        return this.f1529d;
    }

    @Override // p003l.uwl
    /* JADX INFO: renamed from: E */
    public uly mo2051E() {
        return this.f1533h;
    }

    /* JADX INFO: renamed from: F2 */
    public final /* synthetic */ boolean m2053F2(final String str, int i, int i2, Intent intent) {
        if (CoreModule.P().i().l0() || CoreModule.P().i().J()) {
            CoreModule.P().i().N1(act(), new d30() { // from class: l.b000
                @Override // p003l.d30
                public final void call() {
                    this.f2331a.m2052E2(str);
                }
            }, true);
        }
        return true;
    }

    /* JADX INFO: renamed from: H2 */
    public final /* synthetic */ void m2054H2(final String str) {
        act().startActivityForResult(CoreModule.P().i().M3(act(), "from_message"), new a.a() { // from class: l.xzz
            /* JADX INFO: renamed from: a */
            public final boolean m8875a(int i, int i2, Intent intent) {
                return this.f8885a.m2053F2(str, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m2056K2(User user) {
        this.f1532g.m7872B1();
        this.f1535j.m4763E1();
        CoreModule.c.f0.Fo();
        CoreModule.c.e0.W9(this.f1531f.m4295r3());
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m2057L2(PurchaseType purchaseType) {
        this.f1532g.m7872B1();
        this.f1535j.m4763E1();
        CoreModule.c.f0.Fo();
        CoreModule.c.e0.W9(this.f1531f.m4295r3());
    }

    /* JADX INFO: renamed from: N2 */
    public void m2058N2(String str, String str2, boolean z) {
        wmz wmzVar = this.f1531f;
        if (wmzVar instanceof wmz) {
            wmzVar.xg(str, str2, z);
        }
    }

    /* JADX INFO: renamed from: Q2 */
    public void m2059Q2(Message message) {
        if (NullChecker.a(message)) {
            List list = message.media;
            if (!NullChecker.a(list) || list.size() <= 0) {
                m2060R2(TextBundle.TEXT_ENTRY, message.cid);
                return;
            }
            if (list.get(0) instanceof Picture) {
                m2060R2("picture", message.cid);
                return;
            }
            boolean z = list.get(0) instanceof Video;
            String str = message.cid;
            if (z) {
                m2060R2("video", str);
            } else {
                m2060R2(TextBundle.TEXT_ENTRY, str);
            }
        }
    }

    /* JADX INFO: renamed from: R2 */
    public void m2060R2(String str, String str2) {
        m2061S2(str, str2, false);
    }

    /* JADX INFO: renamed from: S2 */
    public void m2061S2(final String str, String str2, boolean z) {
        if ((CoreModule.P().i().z(str2) || z) && !CoreModule.P().i().l0() && !CoreModule.P().i().J()) {
            CoreModule.P().i().N1(act(), new d30() { // from class: l.vzz
                @Override // p003l.d30
                public final void call() {
                    this.f8475a.m2054H2(str);
                }
            }, false);
        } else if (CoreModule.P().i().l0()) {
            CoreModule.P().i().N1(act(), new d30() { // from class: l.wzz
                @Override // p003l.d30
                public final void call() {
                    this.f8727a.m2055I2(str);
                }
            }, true);
        } else {
            m2055I2(str);
        }
    }

    /* JADX INFO: renamed from: T2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m2055I2(String str) {
        if (!str.isEmpty()) {
            zvf0.u("e_secret_message", pageId(), new j760[]{vwb.Y("other_user_id", this.f1531f.m4295r3()), vwb.Y("message_type", str)});
        }
        CoreModule.P().i().i6(act(), "p_chat_view,e_secret_message,click", Privilege.vip_message_block_gp);
        duringCreated(CoreModule.P().i().U2()).subscribe((m250) mkd0.G(new e30() { // from class: l.yzz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9184a.m2057L2((PurchaseType) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().filter(new w9j() { // from class: l.zzz
            @Override // p003l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf(user != null && user.isVIP());
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.a000
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2069a.m2056K2((User) obj);
            }
        }));
    }

    @Override // p003l.uwl
    /* JADX INFO: renamed from: c0 */
    public y5z mo2063c0() {
        return this.f1536k;
    }

    public void checkGradientColors() {
        super.checkGradientColors();
    }

    /* JADX INFO: renamed from: d2 */
    public void m2064d2() {
        if (NullChecker.a(this.f1535j)) {
            this.f1535j.m4800Y();
            this.f1535j.m4756A1();
        }
    }

    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.addAll(this.f1531f.m4204Z2());
        return arrayListDebugItems;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (CoreModule.P().i().M4()) {
            mo2065j0().k0(motionEvent);
        }
        if (mo2046A0().m8826m1(motionEvent)) {
            return true;
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish() {
        int i;
        if (NullChecker.a(this.f1537l)) {
            this.f1537l.mo5103e();
        }
        if (ruy.m7381g().m7386h(CoreModule.c.e0.p9())) {
            ruy.m7381g().f7084a.put("");
        }
        m8106r0();
        if (CoreModule.N().ko()) {
            CoreModule.c.f0.W1.onNext(roj0.a);
        }
        if (CoreModule.P().i().n5() && NullChecker.a(this.f1531f) && (7 == (i = this.f1531f.f3544d) || 31 == i)) {
            setResult(-1);
        }
        if (ura.e().d().w()) {
            qtm.f(this.f1531f.f3543c);
        }
        fcz fczVar = this.f1531f;
        if (fczVar != null) {
            fczVar.m4329y6();
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1532g.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        oxz.m6784b();
        m8106r0();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("conversationId");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = intent.getStringExtra("userId");
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f1528c = CoreModule.c.f0.Xe(stringExtra);
        }
        if (NullChecker.a(this.f1528c)) {
            this.f1530e = this.f1528c.unreadMessages > 0;
        }
        this.f1529d = intent.getBooleanExtra("is_pick_message", false);
        if (ml6.m6410b(this.f1528c, stringExtra)) {
            this.f1531f = new j7z(this, this.f1528c);
            this.f1532g = new o7z(this);
        } else {
            if (this.f1528c == null && TextUtils.equals((CharSequence) CoreModule.c.f0.J0.get(), stringExtra) && !TextUtils.isEmpty(stringExtra)) {
                this.f1531f = new mcz(this, (Conversation) null, stringExtra);
            } else if (this.f1528c == null && this.f1529d) {
                ncz nczVar = new ncz(this, (Conversation) null, stringExtra);
                this.f1531f = nczVar;
                nczVar.m4219b7(true);
            } else {
                this.f1531f = new wmz(this, this.f1528c);
            }
            this.f1532g = new bpz(this);
        }
        int intExtra = intent.getIntExtra("push_type", 0);
        m2047A2(this.f1531f, this.f1532g);
        this.f1534i = new xsy(this);
        this.f1535j = new guy(this);
        if (intExtra > 0 && CoreModule.P().i().h1()) {
            this.f1535j.m4781O1(intExtra);
        }
        m2047A2(this.f1534i, this.f1535j);
        this.f1539n = new t940(this);
        w940 w940Var = new w940(this);
        this.f1540o = w940Var;
        m2047A2(this.f1539n, w940Var);
        this.f1536k = new y5z(this);
        i6z i6zVar = new i6z(this);
        this.f1537l = i6zVar;
        m2047A2(this.f1536k, i6zVar);
        this.f1538m = new jwz(this);
        m2047A2(this.f1538m, new lwz(this));
        this.f1541p = new ouz(this);
        m2047A2(this.f1541p, new quz(this));
        if (ml6.m6409a(this.f1528c)) {
            this.f1533h = new dmy(this);
            m2047A2(this.f1533h, new emy(this));
        } else {
            this.f1533h = new iny(this);
            m2047A2(this.f1533h, new kny(this));
        }
        if (CoreModule.P().i().M4()) {
            this.f1542q = new vrz(this);
            m2047A2(this.f1542q, new ksz(this));
        }
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        fcz fczVar = this.f1531f;
        if (fczVar == null || TextUtils.isEmpty(fczVar.m4295r3())) {
            finish();
            return;
        }
        this.f1533h.a0();
        this.f1531f.m4209a0();
        this.f1534i.m8809a0();
        this.f1536k.m8919a0();
        this.f1538m.a0();
        this.f1541p.a0();
    }

    public boolean isAnonymousMode() {
        return true;
    }

    @Override // p003l.uwl
    /* JADX INFO: renamed from: j0 */
    public vrz mo2065j0() {
        return this.f1542q;
    }

    @Override // p003l.uwl
    /* JADX INFO: renamed from: l */
    public fcz<? extends DbObject, ?> mo2066l() {
        return this.f1531f;
    }

    @Override // p003l.uwl
    /* JADX INFO: renamed from: m0 */
    public ouz mo2067m0() {
        return this.f1541p;
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f1531f.m4248h6(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (this.f1531f.m4258j6()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f1532g.mo3059E1(menu);
    }

    public void onDestroyLifecycle() {
        AiTranslateView.Z();
        super.onDestroyLifecycle();
    }

    public void onHomePressed() {
        finish();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        if (NullChecker.a(this.f1531f)) {
            this.f1531f.m4263k6(i, menu);
        }
        return super/*androidx.appcompat.app.AppCompatActivity*/.onMenuOpened(i, menu);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mgh0.i(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f1531f.m4268l6(menuItem) || super/*com.p1.mobile.android.app.Act*/.onOptionsItemSelected(menuItem);
    }

    public void onPickImagesResult(List<Media> list) {
        this.f1531f.m4273m6(list);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f1531f.m4283o6(menu) || super.onPrepareOptionsMenu(menu);
    }

    public void onRecordVideoResult(String str) {
        this.f1531f.m4293q6(str);
    }

    public void onResumeLifecycle() {
        oxz.m6785c();
        super.onResumeLifecycle();
    }

    public void onStopLifecycle() {
        super.onStopLifecycle();
    }

    public void onTakePictureResult(String str) {
        this.f1531f.m4298r6(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        this.f1532g.m7876F1(z);
    }

    public String pageId() {
        return this.f1531f.pageId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        if (TextUtils.isEmpty(this.f1531f.m4250i3()) || TextUtils.isEmpty(this.f1531f.m4295r3())) {
            finish();
            return;
        }
        if (NullChecker.a(this.f1528c) && !this.f1528c.isOtherStatusInvalid() && this.f1528c.isFakeOneSideConv() && this.f1528c.mm <= 0 && !CoreModule.c.e0.na().isSVIP()) {
            finish();
            return;
        }
        C0107b.m2150d();
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.a.h("moments_user_id", this.f1531f.m4295r3()));
        String stringExtra = getIntent().getStringExtra("ai_from_tag");
        if (CoreModule.N().n7() && !TextUtils.isEmpty(stringExtra)) {
            arrayList.add(o6j0.a.h("ai_from", stringExtra));
        }
        fcz fczVar = this.f1531f;
        User userM4318w3 = fczVar.m4318w3(fczVar.m4295r3());
        if (NullChecker.a(userM4318w3)) {
            String strRelativeTimeForTrack = "";
            if (!userM4318w3.location.isHideUpdateTime() && !CoreModule.c.E0.x3(userM4318w3) && (userM4318w3.isMe() || User.isMatched(userM4318w3) || mqi0.o() - userM4318w3.location.updatedTime <= 1.728E8d)) {
                strRelativeTimeForTrack = userM4318w3.relativeTimeForTrack();
            }
            arrayList.add(o6j0.a.h("lastactivity_time", strRelativeTimeForTrack));
        }
        if (this.f1531f.m4231e4()) {
            arrayList.add(o6j0.a.h("groupchat_id", this.f1531f.m4295r3()));
            ChatGroup chatGroupS6 = CoreModule.c.g0.s6(this.f1531f.m4295r3());
            arrayList.add(o6j0.a.h("is_anonymou_group", NullChecker.a(chatGroupS6) ? TEnum.equals(chatGroupS6.groupType, "anonymous") : false ? "1" : "0"));
        }
        if (CoreModule.P().i().c()) {
            Conversation conversationXe = CoreModule.c.f0.Xe(this.f1531f.m4250i3());
            arrayList.add(o6j0.a.i("is_quickchatbell", NullChecker.a(conversationXe) && conversationXe.property.quickchat.bell));
        }
        arrayList.add(o6j0.a.i("is_from_specialguest_type", false));
        arrayList.add(o6j0.a.h("unlocked_highest_heat_level", this.f1531f.m4330z3()));
        arrayList.add(o6j0.a.h("is_tbd", "0"));
        if (NullChecker.a(this.f1528c) && this.f1528c.isQuickChatConv() && CoreModule.c.e0.na().isFakeUser()) {
            arrayList.add(o6j0.a.h("fake_quickchat_type", CoreModule.P().i().j5(this.f1528c) ? "fake_voicechat" : "fake_onlinechat"));
        }
        o6j0.a[] aVarArr = new o6j0.a[arrayList.size()];
        arrayList.toArray(aVarArr);
        ((PutongAct) this).pageHelper.o(o6j0.b(aVarArr));
        super.preCreateView(bundle);
        if (y19.M()) {
            addSwipeBackListener(new C0099a());
        }
    }

    public void setTheme() {
        super.setTheme();
        setTheme(m2071v2());
    }

    public boolean shouldBlockOnCreate(Bundle bundle) {
        return super.shouldBlockOnCreate(bundle);
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    public void showDebugMenu() {
        super/*com.p1.mobile.android.app.Act*/.showDebugMenu();
    }

    @Override // p003l.uwl
    /* JADX INFO: renamed from: t0 */
    public jwz mo2068t0() {
        return this.f1538m;
    }

    public List<Object> trackedArgs() {
        return this.f1531f.m4284o7();
    }

    @Nullable
    /* JADX INFO: renamed from: u2 */
    public Conversation m2069u2() {
        return this.f1528c;
    }

    @Override // p003l.uwl
    /* JADX INFO: renamed from: v0 */
    public t940 mo2070v0() {
        return this.f1539n;
    }

    /* JADX INFO: renamed from: v2 */
    public final int m2071v2() {
        return ura.e().d().I4() ? x7c0.j : x7c0.i;
    }

    /* JADX INFO: renamed from: w2 */
    public tqz m2072w2() {
        return this.f1532g;
    }

    /* JADX INFO: renamed from: z2 */
    public boolean m2073z2() {
        return this.f1530e;
    }

    public void onPickImagesResult(List<Media> list, int i) {
        this.f1531f.m4278n6(list, i);
    }
}
