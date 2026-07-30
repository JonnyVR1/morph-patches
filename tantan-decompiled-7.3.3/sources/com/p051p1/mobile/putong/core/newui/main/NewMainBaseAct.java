package com.p051p1.mobile.putong.core.newui.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.LauncherAct;
import com.p051p1.mobile.putong.core.api.C4892g0;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.map.IntlMapAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainBaseAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchPushUser;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.location.AbstractC13226a;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.safety.CrashTestActivity;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p153l.crl;
import p153l.d1k0;
import p153l.dc2;
import p153l.gs50;
import p153l.h2g;
import p153l.i4g0;
import p153l.jxb0;
import p153l.jyb;
import p153l.k930;
import p153l.l51;
import p153l.o1j0;
import p153l.og3;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.qzd;
import p153l.toh0;
import p153l.tu2;
import p153l.uqb0;
import p153l.w1e;
import p153l.x20;
import p153l.y1f;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public abstract class NewMainBaseAct<P extends k930> extends LauncherAct implements crl {

    /* JADX INFO: renamed from: l */
    public static boolean f25185l = true;

    /* JADX INFO: renamed from: h */
    public P f25187h;

    /* JADX INFO: renamed from: g */
    public Runnable f25186g = null;

    /* JADX INFO: renamed from: i */
    public String f25188i = "";

    /* JADX INFO: renamed from: j */
    public String f25189j = null;

    /* JADX INFO: renamed from: k */
    public boolean f25190k = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public /* synthetic */ void m40848C3() {
        d1k0.f84698f.m137019l(null);
        w1e.m204400d(this).m204421F(new y20() { // from class: l.l730
            @Override // p153l.y20
            public final void call(Object obj) {
                C4892g0.f20744Q = jyb.m147492W((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public /* synthetic */ void m40850D3() {
        w1e.m204400d(this).m204421F(new y20() { // from class: l.m730
            @Override // p153l.y20
            public final void call(Object obj) {
                ls4.f133391c.put((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public /* synthetic */ void m40852E3() {
        w1e.m204400d(this).m204421F(new y20() { // from class: l.u630
            @Override // p153l.y20
            public final void call(Object obj) {
                NewMainBaseAct.m40906m2((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public /* synthetic */ void m40854F3() {
        w1e.m204400d(this).m204421F(new y20() { // from class: l.i730
            @Override // p153l.y20
            public final void call(Object obj) {
                NewMainBaseAct.m40895f3((String) obj);
            }
        }).m204426n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public /* synthetic */ void m40855G3() {
        startActivity(new Intent(this, (Class<?>) CrashTestActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public /* synthetic */ void m40857H3() {
        h2g.m133391b(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public /* synthetic */ void m40859I3() {
        C8927c.m54662o1(this, null, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS, "test");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public /* synthetic */ void m40860J3() {
        C8927c.m54662o1(this, null, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, "test");
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m40861K2() {
        try {
            Thread.sleep(4000L);
        } catch (Exception unused) {
        }
        for (int i = 0; i < 1000000; i++) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m40862K3() {
        C8772a.m51449l0(this.act, CoreModule.f18264c.f20381e0.m116600p9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m40864L3() {
        this.act.newDialog().m146056y0("闪聊剩余次数：" + C8772a.m51429b0()).m146049r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public /* synthetic */ void m40866M3() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = CoreModule.f18264c.f20381e0.m116600p9().name;
        onlineMatchPushUser.userId = CoreModule.f18264c.f20381e0.m116600p9().f56859id;
        CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = jyb.m147487R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new qcj() { // from class: l.p730
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewMainBaseAct.m40889b3((String) obj);
            }
        });
        C8772a.m51453n0(this.act, onlineMatchPushUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m40868N3() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.user = CoreModule.f18264c.f20381e0.m116600p9();
        onlineMatchPushUser.name = CoreModule.f18264c.f20381e0.m116600p9().name;
        onlineMatchPushUser.userId = CoreModule.f18264c.f20381e0.m116600p9().f56859id;
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = jyb.m147487R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new qcj() { // from class: l.o730
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewMainBaseAct.m40924w2((String) obj);
            }
        });
        jxb0.m147338e(this.act, false, onlineMatchPushUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m40871R3() {
        gs50.m131966O().m131993H(this.act, "active_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m40873S3() {
        gs50.m131966O().m131993H(this.act, "passive_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m40875T3() {
        gs50.m131966O().m131993H(this.act, "overheat_protection");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m40877U3() {
        gs50.m131966O().m131993H(this.act, "use_up");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m40879V3() {
        gs50.m131966O().m131993H(this.act, "match_timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m40881W3() {
        gs50.m131966O().m131995J(this.act, "active_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m40883X3() {
        gs50.m131966O().m131995J(this.act, "passive_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m40884Y3() {
        gs50.m131966O().m131995J(this.act, "overheat_protection");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m40886Z3() {
        gs50.m131966O().m131995J(this.act, "use_up");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m40888a4() {
        gs50.m131966O().m131995J(this.act, "match_timeout");
    }

    /* JADX INFO: renamed from: b3 */
    public static /* synthetic */ Tag m40889b3(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m40892d4() {
        w1e.m204400d(act()).m204424I("Change ip").m204419D(100).m204420E(1).m204423H("").m204421F(new y20() { // from class: l.n730
            @Override // p153l.y20
            public final void call(Object obj) {
                tg50.f174038e = (String) obj;
            }
        }).m204426n().show();
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m40893e3() {
        while (true) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m40894e4() {
        startActivityForResult(new Intent(this, (Class<?>) IntlMapAct.class), new C4468a.a() { // from class: l.k730
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return NewMainBaseAct.m40926y2(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public static /* synthetic */ void m40895f3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m40898h4(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            removeCallbacks(this.f25186g);
            this.f25186g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m40901i4() {
        this.f25188i = ABManager.m30347i();
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m40906m2(String str) {
        y1f y1fVarM218284c = uqb0.f180403i0.m218284c(str);
        Objects.toString(y1fVarM218284c == null ? "null" : y1fVarM218284c.f197094a);
        uqb0.f180403i0.m218282a(y1fVarM218284c);
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ void m40909n3(Bundle bundle) {
        dc2.m115212d(true);
        CoreModule.f18264c.f20300D0.f20876Y = false;
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m40910o2() {
        while (true) {
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ void m40911o3() {
        int i = 1 / 0;
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m40913p3() {
        l51.m152911q(m40925w3(CoreModule.f18263b));
        o1j0.m165644r("copied device info to clipboard");
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m40917r3() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.m30929H().userId();
        onlineMatchMatchUser.user = CoreModule.f18264c.f20381e0.m116600p9();
        C8772a.m51451m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: t3 */
    public static /* synthetic */ void m40920t3() {
        throw new IllegalStateException("crash test  from " + qzd.m178768a());
    }

    /* JADX INFO: renamed from: w2 */
    public static /* synthetic */ Tag m40924w2(String str) {
        return new Tag(null, str);
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: w3 */
    public static String m40925w3(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            String strM178771d = qzd.m178771d();
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            jSONObject.put("mac", macAddress);
            if (TextUtils.isEmpty(strM178771d)) {
                strM178771d = macAddress;
            }
            if (TextUtils.isEmpty(strM178771d)) {
                strM178771d = qzd.m178769b();
            }
            jSONObject.put("device_id", strM178771d);
            return jSONObject.toString();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ boolean m40926y2(int i, int i2, Intent intent) {
        DoublePair doublePair = (DoublePair) intent.getSerializableExtra("map_location");
        AbstractC13226a.b bVar = new AbstractC13226a.b("debug_intl_live_blocking_location", null);
        Location location = new Location("tantan");
        location.m80008K(doublePair.first);
        location.m80010M(doublePair.second);
        bVar.put(location);
        return true;
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m40927z2() {
        int i = 1 / 0;
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m40928B3(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("crash", new x20() { // from class: l.v630
            @Override // p153l.x20
            public final void call() {
                NewMainBaseAct.m40920t3();
            }
        }));
        arrayList.add(jyb.m147494Y("anr", new x20() { // from class: l.w630
            @Override // p153l.x20
            public final void call() {
                NewMainBaseAct.m40910o2();
            }
        }));
        arrayList.add(jyb.m147494Y("device info", new x20() { // from class: l.x630
            @Override // p153l.x20
            public final void call() {
                NewMainBaseAct.m40913p3();
            }
        }));
        this.act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m40929O3(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("Online Match Membership Pay", new x20() { // from class: l.a730
            @Override // p153l.x20
            public final void call() {
                this.f68786a.m40859I3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match Numbers Pay", new x20() { // from class: l.b730
            @Override // p153l.x20
            public final void call() {
                this.f75251a.m40860J3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match Default Match", new x20() { // from class: l.c730
            @Override // p153l.x20
            public final void call() {
                NewMainBaseAct.m40917r3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match Default Match Dlg", new x20() { // from class: l.d730
            @Override // p153l.x20
            public final void call() {
                this.f85446a.m40862K3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match Left Times", new x20() { // from class: l.e730
            @Override // p153l.x20
            public final void call() {
                this.f92400a.m40864L3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match Broadcast Match", new x20() { // from class: l.f730
            @Override // p153l.x20
            public final void call() {
                this.f97479a.m40866M3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online tip  audio Match  ", new x20() { // from class: l.g730
            @Override // p153l.x20
            public final void call() {
                this.f102506a.m40868N3();
            }
        }));
        this.act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m40930b4(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(jyb.m147494Y("Online Match View Initiative", new x20() { // from class: l.j630
            @Override // p153l.x20
            public final void call() {
                this.f118515a.m40871R3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match View Passivity", new x20() { // from class: l.k630
            @Override // p153l.x20
            public final void call() {
                this.f124153a.m40873S3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match View Overheating", new x20() { // from class: l.l630
            @Override // p153l.x20
            public final void call() {
                this.f130225a.m40875T3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match View NoTime", new x20() { // from class: l.m630
            @Override // p153l.x20
            public final void call() {
                this.f134965a.m40877U3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match View Search Timeout", new x20() { // from class: l.o630
            @Override // p153l.x20
            public final void call() {
                this.f145138a.m40879V3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match General Initiative", new x20() { // from class: l.p630
            @Override // p153l.x20
            public final void call() {
                this.f150733a.m40881W3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match General Passivity", new x20() { // from class: l.q630
            @Override // p153l.x20
            public final void call() {
                this.f155780a.m40883X3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match General Overheating", new x20() { // from class: l.r630
            @Override // p153l.x20
            public final void call() {
                this.f161442a.m40884Y3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match General NoTime", new x20() { // from class: l.s630
            @Override // p153l.x20
            public final void call() {
                this.f166535a.m40886Z3();
            }
        }));
        arrayList.add(jyb.m147494Y("Online Match General Search Timeout", new x20() { // from class: l.t630
            @Override // p153l.x20
            public final void call() {
                this.f172287a.m40888a4();
            }
        }));
        this.act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m40931c4() {
        startActivityForResult(new Intent(this, (Class<?>) IntlMapAct.class), 1092);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        final ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(jyb.m147494Y("分辨率", new x20() { // from class: l.r730
            @Override // p153l.x20
            public final void call() {
                o1j0.m165651y(String.format("screen height = %s, width = %s, dh = %s", Integer.valueOf(bnl0.m105588w0()), Integer.valueOf(bnl0.m105592y0()), Integer.valueOf((int) (bnl0.m105588w0() / qa00.m175858c().density))));
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("crash/anr the app/get device info", new x20() { // from class: l.y530
            @Override // p153l.x20
            public final void call() {
                this.f197532a.m40928B3(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("fake my app version for update api", new x20() { // from class: l.z530
            @Override // p153l.x20
            public final void call() {
                this.f203003a.m40848C3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("set distributor ", new x20() { // from class: l.a630
            @Override // p153l.x20
            public final void call() {
                this.f68663a.m40850D3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("set engine params", new x20() { // from class: l.b630
            @Override // p153l.x20
            public final void call() {
                this.f75129a.m40852E3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("engine example", new x20() { // from class: l.d630
            @Override // p153l.x20
            public final void call() {
                this.f85252a.m40854F3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Make the app crash(main)", new x20() { // from class: l.e630
            @Override // p153l.x20
            public final void call() {
                NewMainBaseAct.m40927z2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Make the app crash(thread)", new x20() { // from class: l.f630
            @Override // p153l.x20
            public final void call() {
                new Thread(new Runnable() { // from class: l.h730
                    @Override // java.lang.Runnable
                    public final void run() {
                        NewMainBaseAct.m40911o3();
                    }
                }).start();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("CrashTestActivity", new x20() { // from class: l.g630
            @Override // p153l.x20
            public final void call() {
                this.f102375a.m40855G3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Block UI thread", new x20() { // from class: l.h630
            @Override // p153l.x20
            public final void call() {
                NewMainBaseAct.m40861K2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Block UI thread for long", new x20() { // from class: l.s730
            @Override // p153l.x20
            public final void call() {
                NewMainBaseAct.m40893e3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Change location", new x20() { // from class: l.t730
            @Override // p153l.x20
            public final void call() {
                this.f172392a.m40857H3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("online Match debugItem", new x20() { // from class: l.u730
            @Override // p153l.x20
            public final void call() {
                this.f177876a.m40929O3(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("online Match Dlg", new x20() { // from class: l.s530
            @Override // p153l.x20
            public final void call() {
                this.f166310a.m40930b4(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Pick city", new x20() { // from class: l.t530
            @Override // p153l.x20
            public final void call() {
                this.f172171a.m40931c4();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Change ip for httpdns", new x20() { // from class: l.u530
            @Override // p153l.x20
            public final void call() {
                this.f177577a.m40892d4();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("pull httpdns data", new x20() { // from class: l.v530
            @Override // p153l.x20
            public final void call() {
                tg50.m191018g().m191020e();
            }
        }));
        arrayListDebugItems.add(pf60.m172085a("Set the live blocking location(Int'l)", new x20() { // from class: l.w530
            @Override // p153l.x20
            public final void call() {
                this.f187477a.m40894e4();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y(SchemeKey.mln, new x20() { // from class: l.x530
            @Override // p153l.x20
            public final void call() {
                this.f192452a.m40932f4(arrayListDebugItems);
            }
        }));
        return arrayListDebugItems;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m40932f4(ArrayList arrayList) {
        arrayList.clear();
        this.act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m40933g4() {
        act().hideInput();
        this.f25186g = null;
    }

    @Override // com.p051p1.mobile.putong.core.LauncherAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        P p = (P) mo40844z3();
        this.f25187h = p;
        p.mo41464z1();
    }

    @Override // com.p051p1.mobile.putong.core.LauncherAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.n630
            @Override // p153l.y20
            public final void call(Object obj) {
                NewMainBaseAct.m40909n3((Bundle) obj);
            }
        }, new x20() { // from class: l.y630
            @Override // p153l.x20
            public final void call() {
                dc2.m115212d(false);
            }
        });
        this.f25187h.mo40473a0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.j730
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118626a.m40898h4((C4470c) obj);
            }
        }));
        uqb0.m197283r0(new Runnable() { // from class: l.q730
            @Override // java.lang.Runnable
            public final void run() {
                this.f155935a.m40901i4();
            }
        }, true);
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m40934j4() {
        if (!CoreModule.m30929H().signedIn_() || TextUtils.equals(this.f25188i, this.f25189j)) {
            return;
        }
        String[] strArrSplit = this.f25188i.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        String[] strArrSplit2 = this.f25189j.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        Comparator comparator = new Comparator() { // from class: l.z630
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((String) obj).compareTo((String) obj2);
            }
        };
        Arrays.sort(strArrSplit, comparator);
        Arrays.sort(strArrSplit2, comparator);
        if (Arrays.equals(strArrSplit, strArrSplit2)) {
            return;
        }
        String str = this.f25188i + "-----" + this.f25189j;
        i4g0.m138493B("e_ab_modify", "", new pf60("content", str));
        tu2.m192703a("[putong-common][ab]", str);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m40935k4() {
        return this.f25190k;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 33) {
            this.f25187h.m148840B1(i);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m40937y3();
        toh0.m192049i(intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        if (App.f16085b) {
            postDelayed(new Runnable() { // from class: l.i630
                @Override // java.lang.Runnable
                public final void run() {
                    Debug.stopMethodTracing();
                }
            }, 1000L);
        }
        if (App.f16086c && f25185l) {
            f25185l = false;
            App.f16086c = false;
        }
        this.f25187h.m148842D1();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
        if (this.f25189j == null) {
            this.f25189j = ABManager.m30347i();
            l51.m152919y(new Runnable() { // from class: l.c630
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79928a.m40934j4();
                }
            });
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public boolean showInput(View view, int i) {
        removeCallbacks(this.f25186g);
        this.f25186g = null;
        return super.showInput(view, i);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        String strM148846e1 = this.f25187h.m148846e1();
        og3<Object> og3Var = og3.f147187b;
        return jyb.m147507f0("notification navigation", strM148846e1, og3Var, "frag", mo40841x3(), og3Var);
    }

    /* JADX INFO: renamed from: v3 */
    public void m40936v3(TabName tabName, boolean z) {
        this.f25187h.mo41360a1(tabName, z);
    }

    /* JADX INFO: renamed from: x3 */
    public abstract String mo40841x3();

    /* JADX INFO: renamed from: y3 */
    public void m40937y3() {
        if (this.f25186g == null) {
            this.f25186g = new Runnable() { // from class: l.r530
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161286a.m40933g4();
                }
            };
        }
        postDelayed(this.f25186g, 500L);
        this.f25187h.m148847f1(getIntent());
    }

    /* JADX INFO: renamed from: z3 */
    public abstract P mo40844z3();
}
