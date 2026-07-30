package com.p046p1.mobile.putong.core.newui.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.LauncherAct;
import com.p046p1.mobile.putong.core.api.C4741g0;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.map.IntlMapAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainBaseAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchPushUser;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.location.AbstractC13063a;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.safety.CrashTestActivity;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p149l.ag3;
import p149l.ak50;
import p149l.d30;
import p149l.du2;
import p149l.dyd;
import p149l.e30;
import p149l.e51;
import p149l.fpb0;
import p149l.i0e;
import p149l.j760;
import p149l.lsi0;
import p149l.mgh0;
import p149l.mkd0;
import p149l.qib0;
import p149l.rol;
import p149l.t0g;
import p149l.u0f;
import p149l.vwb;
import p149l.w9j;
import p149l.wb2;
import p149l.y030;
import p149l.zrj0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class NewMainBaseAct<P extends y030> extends LauncherAct implements rol {

    /* JADX INFO: renamed from: l */
    public static boolean f24443l = true;

    /* JADX INFO: renamed from: h */
    public P f24445h;

    /* JADX INFO: renamed from: g */
    public Runnable f24444g = null;

    /* JADX INFO: renamed from: i */
    public String f24446i = "";

    /* JADX INFO: renamed from: j */
    public String f24447j = null;

    /* JADX INFO: renamed from: k */
    public boolean f24448k = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public /* synthetic */ void m39840B3() {
        i0e.m133795d(this).m133816F(new e30() { // from class: l.az20
            @Override // p149l.e30
            public final void call(Object obj) {
                mr4.f135331c.put((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public /* synthetic */ void m39842C3() {
        i0e.m133795d(this).m133816F(new e30() { // from class: l.iy20
            @Override // p149l.e30
            public final void call(Object obj) {
                NewMainBaseAct.m39899l2((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public /* synthetic */ void m39844D3() {
        i0e.m133795d(this).m133816F(new e30() { // from class: l.wy20
            @Override // p149l.e30
            public final void call(Object obj) {
                NewMainBaseAct.m39886d3((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public /* synthetic */ void m39846E3() {
        startActivity(new Intent(this, (Class<?>) CrashTestActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public /* synthetic */ void m39848F3() {
        t0g.m186859b(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public /* synthetic */ void m39849G3() {
        C8764c.m53479o1(this, null, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS, "test");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public /* synthetic */ void m39851H3() {
        C8764c.m53479o1(this, null, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, "test");
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ void m39852I2() {
        try {
            Thread.sleep(4000L);
        } catch (Exception unused) {
        }
        for (int i = 0; i < 1000000; i++) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public /* synthetic */ void m39853I3() {
        C8609a.m50266l0(this.act, CoreModule.f17545c.f19639e0.m169527p9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public /* synthetic */ void m39854J3() {
        this.act.newDialog().m110996y0("闪聊剩余次数：" + C8609a.m50246b0()).m110989r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m39856K3() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = CoreModule.f17545c.f19639e0.m169527p9().name;
        onlineMatchPushUser.userId = CoreModule.f17545c.f19639e0.m169527p9().f56011id;
        CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.m200304R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.dz20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewMainBaseAct.m39880Z2((String) obj);
            }
        });
        C8609a.m50270n0(this.act, onlineMatchPushUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m39858L3() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.user = CoreModule.f17545c.f19639e0.m169527p9();
        onlineMatchPushUser.name = CoreModule.f17545c.f19639e0.m169527p9().name;
        onlineMatchPushUser.userId = CoreModule.f17545c.f19639e0.m169527p9().f56011id;
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = Constants.VIA_REPORT_TYPE_SHARE_TO_QQ;
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.m200304R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.cz20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewMainBaseAct.m39916v2((String) obj);
            }
        });
        fpb0.m122588e(this.act, false, onlineMatchPushUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m39861N3() {
        ak50.m97109O().m97136H(this.act, "active_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m39862O3() {
        ak50.m97109O().m97136H(this.act, "passive_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m39865R3() {
        ak50.m97109O().m97136H(this.act, "overheat_protection");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m39867S3() {
        ak50.m97109O().m97136H(this.act, "use_up");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m39869T3() {
        ak50.m97109O().m97136H(this.act, "match_timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m39871U3() {
        ak50.m97109O().m97138J(this.act, "active_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m39873V3() {
        ak50.m97109O().m97138J(this.act, "passive_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m39875W3() {
        ak50.m97109O().m97138J(this.act, "overheat_protection");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m39877X3() {
        ak50.m97109O().m97138J(this.act, "use_up");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m39879Y3() {
        ak50.m97109O().m97138J(this.act, "match_timeout");
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ Tag m39880Z2(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m39883b4() {
        i0e.m133795d(act()).m133819I("Change ip").m133814D(100).m133815E(1).m133818H("").m133816F(new e30() { // from class: l.bz20
            @Override // p149l.e30
            public final void call(Object obj) {
                m850.f132521e = (String) obj;
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m39884c3() {
        while (true) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m39885c4() {
        startActivityForResult(new Intent(this, (Class<?>) IntlMapAct.class), new C4317a.a() { // from class: l.yy20
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return NewMainBaseAct.m39917w2(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m39886d3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m39889f4(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            removeCallbacks(this.f24444g);
            this.f24444g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m39891g4() {
        this.f24446i = ABManager.m29349i();
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m39898k3(Bundle bundle) {
        wb2.m202501d(true);
        CoreModule.f17545c.f19558D0.f20134Y = false;
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m39899l2(String str) {
        u0f u0fVarM196495c = qib0.f154720i0.m196495c(str);
        Objects.toString(u0fVarM196495c == null ? "null" : u0fVarM196495c.f172902a);
        qib0.f154720i0.m196493a(u0fVarM196495c);
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ void m39901m3() {
        int i = 1 / 0;
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m39902n2() {
        while (true) {
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ void m39903n3() {
        e51.m114766q(m39915u3(CoreModule.f17544b));
        lsi0.m151588r("copied device info to clipboard");
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m39907p3() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.m29931H().userId();
        onlineMatchMatchUser.user = CoreModule.f17545c.f19639e0.m169527p9();
        C8609a.m50268m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m39911r3() {
        throw new IllegalStateException("crash test  from " + dyd.m114055a());
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: u3 */
    public static String m39915u3(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            String strM114058d = dyd.m114058d();
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            jSONObject.put("mac", macAddress);
            if (TextUtils.isEmpty(strM114058d)) {
                strM114058d = macAddress;
            }
            if (TextUtils.isEmpty(strM114058d)) {
                strM114058d = dyd.m114056b();
            }
            jSONObject.put("device_id", strM114058d);
            return jSONObject.toString();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ Tag m39916v2(String str) {
        return new Tag(null, str);
    }

    /* JADX INFO: renamed from: w2 */
    public static /* synthetic */ boolean m39917w2(int i, int i2, Intent intent) {
        DoublePair doublePair = (DoublePair) intent.getSerializableExtra("map_location");
        AbstractC13063a.b bVar = new AbstractC13063a.b("debug_intl_live_blocking_location", null);
        Location location = new Location("tantan");
        location.m78825K(doublePair.first);
        location.m78827M(doublePair.second);
        bVar.put(location);
        return true;
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m39918y2() {
        int i = 1 / 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3 */
    public /* synthetic */ void m39920z3() {
        zrj0.f204524f.m132487l(null);
        i0e.m133795d(this).m133816F(new e30() { // from class: l.zy20
            @Override // p149l.e30
            public final void call(Object obj) {
                C4741g0.f20002Q = vwb.m200309W((String) obj);
            }
        }).m133821n().show();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m39921M3(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("Online Match Membership Pay", new d30() { // from class: l.oy20
            @Override // p149l.d30
            public final void call() {
                this.f146275a.m39849G3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match Numbers Pay", new d30() { // from class: l.py20
            @Override // p149l.d30
            public final void call() {
                this.f151777a.m39851H3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match Default Match", new d30() { // from class: l.qy20
            @Override // p149l.d30
            public final void call() {
                NewMainBaseAct.m39907p3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match Default Match Dlg", new d30() { // from class: l.ry20
            @Override // p149l.d30
            public final void call() {
                this.f161532a.m39853I3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match Left Times", new d30() { // from class: l.sy20
            @Override // p149l.d30
            public final void call() {
                this.f166883a.m39854J3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match Broadcast Match", new d30() { // from class: l.ty20
            @Override // p149l.d30
            public final void call() {
                this.f172558a.m39856K3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online tip  audio Match  ", new d30() { // from class: l.uy20
            @Override // p149l.d30
            public final void call() {
                this.f178822a.m39858L3();
            }
        }));
        this.act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m39922Z3(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("Online Match View Initiative", new d30() { // from class: l.xx20
            @Override // p149l.d30
            public final void call() {
                this.f194807a.m39861N3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match View Passivity", new d30() { // from class: l.yx20
            @Override // p149l.d30
            public final void call() {
                this.f200562a.m39862O3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match View Overheating", new d30() { // from class: l.zx20
            @Override // p149l.d30
            public final void call() {
                this.f205372a.m39865R3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match View NoTime", new d30() { // from class: l.ay20
            @Override // p149l.d30
            public final void call() {
                this.f72248a.m39867S3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match View Search Timeout", new d30() { // from class: l.cy20
            @Override // p149l.d30
            public final void call() {
                this.f82918a.m39869T3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match General Initiative", new d30() { // from class: l.dy20
            @Override // p149l.d30
            public final void call() {
                this.f88343a.m39871U3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match General Passivity", new d30() { // from class: l.ey20
            @Override // p149l.d30
            public final void call() {
                this.f93718a.m39873V3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match General Overheating", new d30() { // from class: l.fy20
            @Override // p149l.d30
            public final void call() {
                this.f99826a.m39875W3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match General NoTime", new d30() { // from class: l.gy20
            @Override // p149l.d30
            public final void call() {
                this.f104962a.m39877X3();
            }
        }));
        arrayList.add(vwb.m200311Y("Online Match General Search Timeout", new d30() { // from class: l.hy20
            @Override // p149l.d30
            public final void call() {
                this.f110025a.m39879Y3();
            }
        }));
        this.act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m39923a4() {
        startActivityForResult(new Intent(this, (Class<?>) IntlMapAct.class), 1092);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m39924d4(ArrayList arrayList) {
        arrayList.clear();
        this.act.showDebugMenu(arrayList);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        final ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.m200311Y("分辨率", new d30() { // from class: l.fz20
            @Override // p149l.d30
            public final void call() {
                lsi0.m151595y(String.format("screen height = %s, width = %s, dh = %s", Integer.valueOf(xdl0.m208408w0()), Integer.valueOf(xdl0.m208412y0()), Integer.valueOf((int) (xdl0.m208408w0() / t100.m186889c().density))));
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("crash/anr the app/get device info", new d30() { // from class: l.mx20
            @Override // p149l.d30
            public final void call() {
                this.f136118a.m39930y3(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("fake my app version for update api", new d30() { // from class: l.nx20
            @Override // p149l.d30
            public final void call() {
                this.f140993a.m39920z3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("set distributor ", new d30() { // from class: l.ox20
            @Override // p149l.d30
            public final void call() {
                this.f146112a.m39840B3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("set engine params", new d30() { // from class: l.px20
            @Override // p149l.d30
            public final void call() {
                this.f151638a.m39842C3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("engine example", new d30() { // from class: l.rx20
            @Override // p149l.d30
            public final void call() {
                this.f161394a.m39844D3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Make the app crash(main)", new d30() { // from class: l.sx20
            @Override // p149l.d30
            public final void call() {
                NewMainBaseAct.m39918y2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Make the app crash(thread)", new d30() { // from class: l.tx20
            @Override // p149l.d30
            public final void call() {
                new Thread(new Runnable() { // from class: l.vy20
                    @Override // java.lang.Runnable
                    public final void run() {
                        NewMainBaseAct.m39901m3();
                    }
                }).start();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("CrashTestActivity", new d30() { // from class: l.ux20
            @Override // p149l.d30
            public final void call() {
                this.f178698a.m39846E3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Block UI thread", new d30() { // from class: l.vx20
            @Override // p149l.d30
            public final void call() {
                NewMainBaseAct.m39852I2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Block UI thread for long", new d30() { // from class: l.gz20
            @Override // p149l.d30
            public final void call() {
                NewMainBaseAct.m39884c3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Change location", new d30() { // from class: l.hz20
            @Override // p149l.d30
            public final void call() {
                this.f110164a.m39848F3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("online Match debugItem", new d30() { // from class: l.iz20
            @Override // p149l.d30
            public final void call() {
                this.f115526a.m39921M3(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("online Match Dlg", new d30() { // from class: l.gx20
            @Override // p149l.d30
            public final void call() {
                this.f104823a.m39922Z3(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Pick city", new d30() { // from class: l.hx20
            @Override // p149l.d30
            public final void call() {
                this.f109825a.m39923a4();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Change ip for httpdns", new d30() { // from class: l.ix20
            @Override // p149l.d30
            public final void call() {
                this.f115320a.m39883b4();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("pull httpdns data", new d30() { // from class: l.jx20
            @Override // p149l.d30
            public final void call() {
                m850.m153455i().m153457e();
            }
        }));
        arrayListDebugItems.add(j760.m140076a("Set the live blocking location(Int'l)", new d30() { // from class: l.kx20
            @Override // p149l.d30
            public final void call() {
                this.f125054a.m39885c4();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y(SchemeKey.mln, new d30() { // from class: l.lx20
            @Override // p149l.d30
            public final void call() {
                this.f130333a.m39924d4(arrayListDebugItems);
            }
        }));
        return arrayListDebugItems;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m39925e4() {
        act().hideInput();
        this.f24444g = null;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m39926h4() {
        if (!CoreModule.m29931H().signedIn_() || TextUtils.equals(this.f24446i, this.f24447j)) {
            return;
        }
        String[] strArrSplit = this.f24446i.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        String[] strArrSplit2 = this.f24447j.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        Comparator comparator = new Comparator() { // from class: l.ny20
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
        String str = this.f24446i + "-----" + this.f24447j;
        zvf0.m220369B("e_ab_modify", "", new j760("content", str));
        du2.m113670a("[putong-common][ab]", str);
    }

    /* JADX INFO: renamed from: i4 */
    public boolean m39927i4() {
        return this.f24448k;
    }

    @Override // com.p046p1.mobile.putong.core.LauncherAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        P p = (P) mo39835x3();
        this.f24445h = p;
        p.mo40454z1();
    }

    @Override // com.p046p1.mobile.putong.core.LauncherAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.by20
            @Override // p149l.e30
            public final void call(Object obj) {
                NewMainBaseAct.m39898k3((Bundle) obj);
            }
        }, new d30() { // from class: l.my20
            @Override // p149l.d30
            public final void call() {
                wb2.m202501d(false);
            }
        });
        this.f24445h.mo39470a0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xy20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195019a.m39889f4((C4319c) obj);
            }
        }));
        qib0.m174829r0(new Runnable() { // from class: l.ez20
            @Override // java.lang.Runnable
            public final void run() {
                this.f93840a.m39891g4();
            }
        }, true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 33) {
            this.f24445h.m212080B1(i);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m39929w3();
        mgh0.m154553i(intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        if (App.f15366b) {
            postDelayed(new Runnable() { // from class: l.wx20
                @Override // java.lang.Runnable
                public final void run() {
                    Debug.stopMethodTracing();
                }
            }, 1000L);
        }
        if (App.f15367c && f24443l) {
            f24443l = false;
            App.f15367c = false;
        }
        this.f24445h.m212082D1();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onStopLifecycle() {
        super.onStopLifecycle();
        if (this.f24447j == null) {
            this.f24447j = ABManager.m29349i();
            e51.m114774y(new Runnable() { // from class: l.qx20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156804a.m39926h4();
                }
            });
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public boolean showInput(View view, int i) {
        removeCallbacks(this.f24444g);
        this.f24444g = null;
        return super.showInput(view, i);
    }

    /* JADX INFO: renamed from: t3 */
    public void m39928t3(TabName tabName, boolean z) {
        this.f24445h.mo40352a1(tabName, z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        String strM212086e1 = this.f24445h.m212086e1();
        ag3<Object> ag3Var = ag3.f69253b;
        return vwb.m200324f0("notification navigation", strM212086e1, ag3Var, "frag", mo39833v3(), ag3Var);
    }

    /* JADX INFO: renamed from: v3 */
    public abstract String mo39833v3();

    /* JADX INFO: renamed from: w3 */
    public void m39929w3() {
        if (this.f24444g == null) {
            this.f24444g = new Runnable() { // from class: l.fx20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99720a.m39925e4();
                }
            };
        }
        postDelayed(this.f24444g, 500L);
        this.f24445h.m212087f1(getIntent());
    }

    /* JADX INFO: renamed from: x3 */
    public abstract P mo39835x3();

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m39930y3(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(vwb.m200311Y("crash", new d30() { // from class: l.jy20
            @Override // p149l.d30
            public final void call() {
                NewMainBaseAct.m39911r3();
            }
        }));
        arrayList.add(vwb.m200311Y("anr", new d30() { // from class: l.ky20
            @Override // p149l.d30
            public final void call() {
                NewMainBaseAct.m39902n2();
            }
        }));
        arrayList.add(vwb.m200311Y("device info", new d30() { // from class: l.ly20
            @Override // p149l.d30
            public final void call() {
                NewMainBaseAct.m39903n3();
            }
        }));
        this.act.showDebugMenu(arrayList);
    }
}
