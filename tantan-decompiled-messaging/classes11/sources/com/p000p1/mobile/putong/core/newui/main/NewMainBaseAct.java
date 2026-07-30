package com.p000p1.mobile.putong.core.newui.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.main.NewMainBaseAct;
import com.p000p1.mobile.putong.location.AbstractC0465a;
import com.p000p1.mobile.putong.location.Location;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.safety.CrashTestActivity;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.LauncherAct;
import com.p1.mobile.putong.core.api.g0;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.map.IntlMapAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.Tag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import l.ak50;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.fpb0;
import l.j760;
import l.lsi0;
import l.m850;
import l.mkd0;
import l.mr4;
import l.qib0;
import l.rol;
import l.t100;
import l.u0f;
import l.vwb;
import l.w9j;
import l.wb2;
import l.xdl0;
import l.zrj0;
import l.zvf0;
import org.json.JSONObject;
import p009l.ag3;
import p009l.dyd;
import p009l.i0e;
import p009l.mgh0;
import p009l.t0g;
import p009l.y030;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class NewMainBaseAct<P extends y030> extends LauncherAct implements rol {

    /* JADX INFO: renamed from: l */
    public static boolean f3221l = true;

    /* JADX INFO: renamed from: h */
    public P f3223h;

    /* JADX INFO: renamed from: g */
    public Runnable f3222g = null;

    /* JADX INFO: renamed from: i */
    public String f3224i = "";

    /* JADX INFO: renamed from: j */
    public String f3225j = null;

    /* JADX INFO: renamed from: k */
    public boolean f3226k = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B3 */
    public /* synthetic */ void m3917B3() {
        i0e.m16063d(this).m16084F(new e30() { // from class: l.az20
            public final void call(Object obj) {
                mr4.c.put((String) obj);
            }
        }).m16089n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C3 */
    public /* synthetic */ void m3919C3() {
        i0e.m16063d(this).m16084F(new e30() { // from class: l.iy20
            public final void call(Object obj) {
                NewMainBaseAct.m3976l2((String) obj);
            }
        }).m16089n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D3 */
    public /* synthetic */ void m3921D3() {
        i0e.m16063d(this).m16084F(new e30() { // from class: l.wy20
            public final void call(Object obj) {
                NewMainBaseAct.m3963d3((String) obj);
            }
        }).m16089n().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E3 */
    public /* synthetic */ void m3923E3() {
        startActivity(new Intent((Context) this, (Class<?>) CrashTestActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public /* synthetic */ void m3925F3() {
        t0g.m22424b(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public /* synthetic */ void m3926G3() {
        c.o1(this, (e30) null, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS, "test");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public /* synthetic */ void m3928H3() {
        c.o1(this, (e30) null, PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, "test");
    }

    /* JADX INFO: renamed from: I2 */
    public static /* synthetic */ void m3929I2() {
        try {
            Thread.sleep(4000L);
        } catch (Exception unused) {
        }
        for (int i = 0; i < 1000000; i++) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public /* synthetic */ void m3930I3() {
        a.l0(((Act) this).act, CoreModule.c.e0.p9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public /* synthetic */ void m3931J3() {
        ((Act) this).act.newDialog().y0("闪聊剩余次数：" + a.b0()).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public /* synthetic */ void m3933K3() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.name = CoreModule.c.e0.p9().name;
        onlineMatchPushUser.userId = ((DbObject) CoreModule.c.e0.p9()).id;
        CoreModule.c.e0.p9().fp().profileMiddle().formatted();
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = "10";
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.dz20
            public final Object call(Object obj) {
                return NewMainBaseAct.m3957Z2((String) obj);
            }
        });
        a.n0(((Act) this).act, onlineMatchPushUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m3935L3() {
        OnlineMatchPushUser onlineMatchPushUser = new OnlineMatchPushUser();
        onlineMatchPushUser.user = CoreModule.c.e0.p9();
        onlineMatchPushUser.name = CoreModule.c.e0.p9().name;
        onlineMatchPushUser.userId = ((DbObject) CoreModule.c.e0.p9()).id;
        onlineMatchPushUser.avatarUrl = "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MlRQNldBSVFaM1ZRRFRPU01FSFdIS043Nk5RUTA0IiwidyI6MTk2MCwiaCI6MTk1OSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjYxNzE0NDg5Nzk1MzUzMzg2ODAsImFiIjowfQ.jpg?format=128x128";
        onlineMatchPushUser.action = "";
        onlineMatchPushUser.gender = "female";
        onlineMatchPushUser.age = "10";
        onlineMatchPushUser.distance = 100;
        onlineMatchPushUser.userTagList = vwb.R(new String[]{"唱各萨达多个", "喜欢广场舞", "喜欢哈哈哈"}, new w9j() { // from class: l.cz20
            public final Object call(Object obj) {
                return NewMainBaseAct.m3993v2((String) obj);
            }
        });
        fpb0.e(((Act) this).act, false, onlineMatchPushUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m3938N3() {
        ak50.O().H(((Act) this).act, "active_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m3939O3() {
        ak50.O().H(((Act) this).act, "passive_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m3942R3() {
        ak50.O().H(((Act) this).act, "overheat_protection");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m3944S3() {
        ak50.O().H(((Act) this).act, "use_up");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m3946T3() {
        ak50.O().H(((Act) this).act, "match_timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m3948U3() {
        ak50.O().J(((Act) this).act, "active_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m3950V3() {
        ak50.O().J(((Act) this).act, "passive_unmatch");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m3952W3() {
        ak50.O().J(((Act) this).act, "overheat_protection");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m3954X3() {
        ak50.O().J(((Act) this).act, "use_up");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m3956Y3() {
        ak50.O().J(((Act) this).act, "match_timeout");
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ Tag m3957Z2(String str) {
        return new Tag((String) null, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m3960b4() {
        i0e.m16063d(act()).m16087I("Change ip").m16082D(100).m16083E(1).m16086H("").m16084F(new e30() { // from class: l.bz20
            public final void call(Object obj) {
                m850.e = (String) obj;
            }
        }).m16089n().show();
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ void m3961c3() {
        while (true) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m3962c4() {
        startActivityForResult(new Intent((Context) this, (Class<?>) IntlMapAct.class), new com.p1.mobile.android.app.a.a() { // from class: l.yy20
            /* JADX INFO: renamed from: a */
            public final boolean m25551a(int i, int i2, Intent intent) {
                return NewMainBaseAct.m3994w2(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m3963d3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m3966f4(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.m) {
            removeCallbacks(this.f3222g);
            this.f3222g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m3968g4() {
        this.f3224i = ABManager.i();
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m3975k3(Bundle bundle) {
        wb2.d(true);
        CoreModule.c.D0.Y = false;
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m3976l2(String str) {
        u0f u0fVarC = qib0.i0.c(str);
        Objects.toString(u0fVarC == null ? "null" : u0fVarC.a);
        qib0.i0.a(u0fVarC);
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ void m3978m3() {
        int i = 1 / 0;
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m3979n2() {
        while (true) {
        }
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ void m3980n3() {
        e51.q(m3992u3(CoreModule.b));
        lsi0.r("copied device info to clipboard");
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ void m3984p3() {
        OnlineMatchMatchUser onlineMatchMatchUser = new OnlineMatchMatchUser();
        onlineMatchMatchUser.userId = CoreModule.H().userId();
        onlineMatchMatchUser.user = CoreModule.c.e0.p9();
        a.m0(onlineMatchMatchUser);
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ void m3988r3() {
        throw new IllegalStateException("crash test  from " + dyd.m13507a());
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: u3 */
    public static String m3992u3(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            String strM13510d = dyd.m13510d();
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            jSONObject.put("mac", macAddress);
            if (TextUtils.isEmpty(strM13510d)) {
                strM13510d = macAddress;
            }
            if (TextUtils.isEmpty(strM13510d)) {
                strM13510d = dyd.m13508b();
            }
            jSONObject.put("device_id", strM13510d);
            return jSONObject.toString();
        } catch (Exception e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ Tag m3993v2(String str) {
        return new Tag((String) null, str);
    }

    /* JADX INFO: renamed from: w2 */
    public static /* synthetic */ boolean m3994w2(int i, int i2, Intent intent) {
        DoublePair serializableExtra = intent.getSerializableExtra("map_location");
        AbstractC0465a.b bVar = new AbstractC0465a.b("debug_intl_live_blocking_location", null);
        Location location = new Location("tantan");
        location.m9120K(serializableExtra.first);
        location.m9122M(serializableExtra.second);
        bVar.put(location);
        return true;
    }

    /* JADX INFO: renamed from: y2 */
    public static /* synthetic */ void m3995y2() {
        int i = 1 / 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z3 */
    public /* synthetic */ void m3997z3() {
        zrj0.f.onNext((Object) null);
        i0e.m16063d(this).m16084F(new e30() { // from class: l.zy20
            public final void call(Object obj) {
                g0.Q = vwb.W((String) obj);
            }
        }).m16089n().show();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m3998M3(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(vwb.Y("Online Match Membership Pay", new d30() { // from class: l.oy20
            public final void call() {
                this.f18294a.m3926G3();
            }
        }));
        arrayList.add(vwb.Y("Online Match Numbers Pay", new d30() { // from class: l.py20
            public final void call() {
                this.f18964a.m3928H3();
            }
        }));
        arrayList.add(vwb.Y("Online Match Default Match", new d30() { // from class: l.qy20
            public final void call() {
                NewMainBaseAct.m3984p3();
            }
        }));
        arrayList.add(vwb.Y("Online Match Default Match Dlg", new d30() { // from class: l.ry20
            public final void call() {
                this.f20023a.m3930I3();
            }
        }));
        arrayList.add(vwb.Y("Online Match Left Times", new d30() { // from class: l.sy20
            public final void call() {
                this.f20496a.m3931J3();
            }
        }));
        arrayList.add(vwb.Y("Online Match Broadcast Match", new d30() { // from class: l.ty20
            public final void call() {
                this.f20913a.m3933K3();
            }
        }));
        arrayList.add(vwb.Y("Online tip  audio Match  ", new d30() { // from class: l.uy20
            public final void call() {
                this.f21368a.m3935L3();
            }
        }));
        ((Act) this).act.showDebugMenu(arrayList);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m3999Z3(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(vwb.Y("Online Match View Initiative", new d30() { // from class: l.xx20
            public final void call() {
                this.f22751a.m3938N3();
            }
        }));
        arrayList.add(vwb.Y("Online Match View Passivity", new d30() { // from class: l.yx20
            public final void call() {
                this.f23262a.m3939O3();
            }
        }));
        arrayList.add(vwb.Y("Online Match View Overheating", new d30() { // from class: l.zx20
            public final void call() {
                this.f24015a.m3942R3();
            }
        }));
        arrayList.add(vwb.Y("Online Match View NoTime", new d30() { // from class: l.ay20
            public final void call() {
                this.f9766a.m3944S3();
            }
        }));
        arrayList.add(vwb.Y("Online Match View Search Timeout", new d30() { // from class: l.cy20
            public final void call() {
                this.f10815a.m3946T3();
            }
        }));
        arrayList.add(vwb.Y("Online Match General Initiative", new d30() { // from class: l.dy20
            public final void call() {
                this.f12043a.m3948U3();
            }
        }));
        arrayList.add(vwb.Y("Online Match General Passivity", new d30() { // from class: l.ey20
            public final void call() {
                this.f12712a.m3950V3();
            }
        }));
        arrayList.add(vwb.Y("Online Match General Overheating", new d30() { // from class: l.fy20
            public final void call() {
                this.f13218a.m3952W3();
            }
        }));
        arrayList.add(vwb.Y("Online Match General NoTime", new d30() { // from class: l.gy20
            public final void call() {
                this.f13810a.m3954X3();
            }
        }));
        arrayList.add(vwb.Y("Online Match General Search Timeout", new d30() { // from class: l.hy20
            public final void call() {
                this.f14299a.m3956Y3();
            }
        }));
        ((Act) this).act.showDebugMenu(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m4000a4() {
        startActivityForResult(new Intent((Context) this, (Class<?>) IntlMapAct.class), 1092);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m4001d4(ArrayList arrayList) {
        arrayList.clear();
        ((Act) this).act.showDebugMenu(arrayList);
    }

    public ArrayList<j760<String, d30>> debugItems() {
        final ArrayList<j760<String, d30>> arrayListDebugItems = super/*com.p1.mobile.putong.app.PutongAct*/.debugItems();
        arrayListDebugItems.add(vwb.Y("分辨率", new d30() { // from class: l.fz20
            public final void call() {
                lsi0.y(String.format("screen height = %s, width = %s, dh = %s", Integer.valueOf(xdl0.w0()), Integer.valueOf(xdl0.y0()), Integer.valueOf((int) (xdl0.w0() / t100.c().density))));
            }
        }));
        arrayListDebugItems.add(vwb.Y("crash/anr the app/get device info", new d30() { // from class: l.mx20
            public final void call() {
                this.f17133a.m4007y3(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(vwb.Y("fake my app version for update api", new d30() { // from class: l.nx20
            public final void call() {
                this.f17756a.m3997z3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("set distributor ", new d30() { // from class: l.ox20
            public final void call() {
                this.f18279a.m3917B3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("set engine params", new d30() { // from class: l.px20
            public final void call() {
                this.f18947a.m3919C3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("engine example", new d30() { // from class: l.rx20
            public final void call() {
                this.f20016a.m3921D3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Make the app crash(main)", new d30() { // from class: l.sx20
            public final void call() {
                NewMainBaseAct.m3995y2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Make the app crash(thread)", new d30() { // from class: l.tx20
            public final void call() {
                new Thread(new Runnable() { // from class: l.vy20
                    @Override // java.lang.Runnable
                    public final void run() {
                        NewMainBaseAct.m3978m3();
                    }
                }).start();
            }
        }));
        arrayListDebugItems.add(vwb.Y("CrashTestActivity", new d30() { // from class: l.ux20
            public final void call() {
                this.f21359a.m3923E3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Block UI thread", new d30() { // from class: l.vx20
            public final void call() {
                NewMainBaseAct.m3929I2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Block UI thread for long", new d30() { // from class: l.gz20
            public final void call() {
                NewMainBaseAct.m3961c3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Change location", new d30() { // from class: l.hz20
            public final void call() {
                this.f14312a.m3925F3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("online Match debugItem", new d30() { // from class: l.iz20
            public final void call() {
                this.f14869a.m3998M3(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(vwb.Y("online Match Dlg", new d30() { // from class: l.gx20
            public final void call() {
                this.f13800a.m3999Z3(arrayListDebugItems);
            }
        }));
        arrayListDebugItems.add(vwb.Y("Pick city", new d30() { // from class: l.hx20
            public final void call() {
                this.f14274a.m4000a4();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Change ip for httpdns", new d30() { // from class: l.ix20
            public final void call() {
                this.f14847a.m3960b4();
            }
        }));
        arrayListDebugItems.add(vwb.Y("pull httpdns data", new d30() { // from class: l.jx20
            public final void call() {
                m850.i().e();
            }
        }));
        arrayListDebugItems.add(j760.a("Set the live blocking location(Int'l)", new d30() { // from class: l.kx20
            public final void call() {
                this.f15874a.m3962c4();
            }
        }));
        arrayListDebugItems.add(vwb.Y("mln", new d30() { // from class: l.lx20
            public final void call() {
                this.f16436a.m4001d4(arrayListDebugItems);
            }
        }));
        return arrayListDebugItems;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m4002e4() {
        act().hideInput();
        this.f3222g = null;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m4003h4() {
        if (!CoreModule.H().signedIn_() || TextUtils.equals(this.f3224i, this.f3225j)) {
            return;
        }
        String[] strArrSplit = this.f3224i.split(",");
        String[] strArrSplit2 = this.f3225j.split(",");
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
        String str = this.f3224i + "-----" + this.f3225j;
        zvf0.B("e_ab_modify", "", new j760[]{new j760("content", str)});
        du2.a("[putong-common][ab]", str);
    }

    /* JADX INFO: renamed from: i4 */
    public boolean m4004i4() {
        return this.f3226k;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        P p = (P) mo3911x3();
        this.f3223h = p;
        p.mo4538z1();
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.by20
            public final void call(Object obj) {
                NewMainBaseAct.m3975k3((Bundle) obj);
            }
        }, new d30() { // from class: l.my20
            public final void call() {
                wb2.d(false);
            }
        });
        this.f3223h.mo4435a0();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.xy20
            public final void call(Object obj) {
                this.f22803a.m3966f4((com.p1.mobile.android.app.c) obj);
            }
        }));
        qib0.r0(new Runnable() { // from class: l.ez20
            @Override // java.lang.Runnable
            public final void run() {
                this.f12731a.m3968g4();
            }
        }, true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || i == 33) {
            this.f3223h.m25143B1(i);
        } else {
            super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(Intent intent) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onNewIntent(intent);
        setIntent(intent);
        m4006w3();
        mgh0.m18455i(intent);
    }

    public void onResumeLifecycle() {
        super/*com.p1.mobile.putong.app.PutongAct*/.onResumeLifecycle();
        if (App.b) {
            postDelayed(new Runnable() { // from class: l.wx20
                @Override // java.lang.Runnable
                public final void run() {
                    Debug.stopMethodTracing();
                }
            }, 1000L);
        }
        if (App.c && f3221l) {
            f3221l = false;
            App.c = false;
        }
        this.f3223h.m25146D1();
    }

    public void onStopLifecycle() {
        super/*com.p1.mobile.putong.app.PutongAct*/.onStopLifecycle();
        if (this.f3225j == null) {
            this.f3225j = ABManager.i();
            e51.y(new Runnable() { // from class: l.qx20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19571a.m4003h4();
                }
            });
        }
    }

    public boolean showInput(View view, int i) {
        removeCallbacks(this.f3222g);
        this.f3222g = null;
        return super/*com.p1.mobile.android.app.Act*/.showInput(view, i);
    }

    /* JADX INFO: renamed from: t3 */
    public void m4005t3(TabName tabName, boolean z) {
        this.f3223h.mo4436a1(tabName, z);
    }

    public List<Object> trackedArgs() {
        String strM25150e1 = this.f3223h.m25150e1();
        ag3<Object> ag3Var = ag3.f9482b;
        return vwb.f0(new Object[]{"notification navigation", strM25150e1, ag3Var, "frag", mo3909v3(), ag3Var});
    }

    /* JADX INFO: renamed from: v3 */
    public abstract String mo3909v3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w3 */
    public void m4006w3() {
        if (this.f3222g == null) {
            this.f3222g = new Runnable() { // from class: l.fx20
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13189a.m4002e4();
                }
            };
        }
        postDelayed(this.f3222g, 500L);
        this.f3223h.m25151f1(getIntent());
    }

    /* JADX INFO: renamed from: x3 */
    public abstract P mo3911x3();

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ void m4007y3(ArrayList arrayList) {
        arrayList.clear();
        arrayList.add(vwb.Y("crash", new d30() { // from class: l.jy20
            public final void call() {
                NewMainBaseAct.m3988r3();
            }
        }));
        arrayList.add(vwb.Y("anr", new d30() { // from class: l.ky20
            public final void call() {
                NewMainBaseAct.m3979n2();
            }
        }));
        arrayList.add(vwb.Y("device info", new d30() { // from class: l.ly20
            public final void call() {
                NewMainBaseAct.m3980n3();
            }
        }));
        ((Act) this).act.showDebugMenu(arrayList);
    }
}
