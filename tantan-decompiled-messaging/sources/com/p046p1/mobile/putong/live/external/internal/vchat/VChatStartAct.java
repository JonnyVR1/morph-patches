package com.p046p1.mobile.putong.live.external.internal.vchat;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p046p1.mobile.putong.live.external.R$string;
import java.util.ArrayList;
import p149l.a1l0;
import p149l.c35;
import p149l.d1l0;
import p149l.d30;
import p149l.dd2;
import p149l.dt0;
import p149l.e30;
import p149l.ed0;
import p149l.enk0;
import p149l.ffw;
import p149l.g2l0;
import p149l.hgt;
import p149l.i5j0;
import p149l.iuu;
import p149l.j760;
import p149l.k6e0;
import p149l.k7l0;
import p149l.lsi0;
import p149l.m2u;
import p149l.mj60;
import p149l.slk0;
import p149l.t320;
import p149l.t4l0;
import p149l.vet;
import p149l.wlu;
import p149l.yal0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class VChatStartAct extends PutongAct {
    /* JADX INFO: renamed from: c2 */
    public static void m69216c2(Act act) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "anchor");
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: d2 */
    public static void m69217d2(final Act act) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new enk0(true));
        arrayList.add(new ed0());
        arrayList.add(new t320(new d30() { // from class: l.xmk0
            @Override // p149l.d30
            public final void call() {
                m2u.m152716m(act);
            }
        }));
        arrayList.add(new mj60());
        arrayList.add(new k6e0(hgt.INSTANCE.m130911R()));
        arrayList.add(new a1l0());
        m69224p2(act, arrayList);
    }

    /* JADX INFO: renamed from: e2 */
    public static void m69218e2(Act act, wlu wluVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a1l0(true, wluVar));
        m69224p2(act, arrayList);
    }

    /* JADX INFO: renamed from: g2 */
    public static void m69219g2(Act act, String str, String str2, String str3) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "audience_recall");
        intent.putExtra("source", str2);
        intent.putExtra("userId", str);
        intent.putExtra("recallId", str3);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: h2 */
    public static void m69220h2(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "audience_normal");
        intent.putExtra("source", str2);
        intent.putExtra("roomId", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: i2 */
    public static void m69221i2(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "audience_user");
        intent.putExtra("source", str2);
        intent.putExtra("userId", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m69222k2() {
        m2u.m152716m(this.act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public /* synthetic */ void m69223m2(Throwable th) {
        m69226r2("normal", "reqLive", th, "");
        lsi0.m151578h(R$string.f44877O);
        dt0.m113504D(this.act);
    }

    /* JADX INFO: renamed from: p2 */
    public static void m69224p2(Act act, ArrayList<g2l0> arrayList) {
        c35.m104971a(act, arrayList);
    }

    /* JADX INFO: renamed from: q2 */
    public static void m69225q2(Act act, int i, String str) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "audience_coupons");
        intent.putExtra("source", str);
        intent.putExtra("coupons", i);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: r2 */
    public static void m69226r2(String str, String str2, Throwable th, String str3) {
        if (th != null) {
            str3 = th instanceof TantanException.Client.CoreService ? String.valueOf(((TantanException.Client.CoreService) th).code) : th.getMessage();
        }
        zvf0.m220371D("e_live_video_quickchat_enter_status", "p_live_video_quickchat_status", new j760("type", str), new j760("stage", str2), new j760("error", str3));
    }

    /* JADX INFO: renamed from: s2 */
    public static void m69227s2(String str, String str2) {
        zvf0.m220371D("e_live_video_quickchat_enter_status", "p_live_video_quickchat_status", new j760("type", str), new j760("stage", str2), new j760("error", "NA"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        if (TextUtils.equals(getIntent().getStringExtra("type"), "anchor")) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new enk0(true));
            arrayList.add(new ed0());
            arrayList.add(new t320(new d30() { // from class: l.ymk0
                @Override // p149l.d30
                public final void call() {
                    this.f199033a.m69222k2();
                }
            }));
            arrayList.add(new mj60());
            arrayList.add(new k6e0(hgt.INSTANCE.m130911R()));
            arrayList.add(new a1l0());
            m69224p2(this.act, arrayList);
            return;
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "audience_normal")) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new enk0(false));
            arrayList2.add(new i5j0("normal", true));
            arrayList2.add(new mj60());
            arrayList2.add(new k6e0(hgt.INSTANCE.m130912S()));
            arrayList2.add(new d1l0(getIntent().getStringExtra("roomId"), getIntent().getStringExtra("source")));
            m69224p2(this.act, arrayList2);
            return;
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "audience_user")) {
            m69227s2("normal", "start");
            iuu.m138448I(getIntent().getStringExtra("userId")).subscribe(ffw.m121194e(new e30() { // from class: l.zmk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203745a.m69228l2((BLiveVideoChatLive) obj);
                }
            }, new e30() { // from class: l.ank0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70744a.m69223m2((Throwable) obj);
                }
            }));
            return;
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "audience_coupons")) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new enk0(false));
            arrayList3.add(new i5j0("randomMatch", true));
            arrayList3.add(new k7l0(getIntent().getIntExtra("coupons", 0)));
            arrayList3.add(new mj60());
            arrayList3.add(new k6e0(hgt.INSTANCE.m130912S()));
            arrayList3.add(new yal0(getIntent().getStringExtra("source")));
            m69224p2(this.act, arrayList3);
            return;
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "audience_recall")) {
            m69227s2("fakeCall", "start");
            if (vet.m198237u(hgt.INSTANCE.m130912S())) {
                m69227s2("fakeCall", "sdkRes");
                iuu.m138448I(getIntent().getStringExtra("userId")).subscribe(ffw.m121194e(new e30() { // from class: l.bnk0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f76408a.m69229n2((BLiveVideoChatLive) obj);
                    }
                }, new e30() { // from class: l.cnk0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f81667a.m69230o2((Throwable) obj);
                    }
                }));
            } else {
                m69226r2("fakeCall", "sdkRes", null, "notReady");
                dt0.m113504D(this.act);
            }
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m69228l2(BLiveVideoChatLive bLiveVideoChatLive) {
        m69227s2("normal", "reqLive");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new enk0(false));
        arrayList.add(new i5j0("normal", false));
        arrayList.add(new mj60());
        arrayList.add(new k6e0(hgt.INSTANCE.m130912S()));
        arrayList.add(new d1l0(bLiveVideoChatLive.roomId, getIntent().getStringExtra("source")));
        m69224p2(this.act, arrayList);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m69229n2(BLiveVideoChatLive bLiveVideoChatLive) {
        m69227s2("fakeCall", "reqLive");
        m69226r2("fakeCall", "anchorBusy", null, slk0.m184828d(bLiveVideoChatLive).booleanValue() ? "NA" : bLiveVideoChatLive.status);
        if (!slk0.m184828d(bLiveVideoChatLive).booleanValue()) {
            dt0.m113504D(this.act);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new enk0(false).m117283k(true));
        arrayList.add(new i5j0("fakeCall", false));
        arrayList.add(new dd2(bLiveVideoChatLive.roomId));
        arrayList.add(new t4l0(bLiveVideoChatLive, getIntent().getStringExtra("source"), getIntent().getStringExtra("recallId")));
        m69224p2(this.act, arrayList);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m69230o2(Throwable th) {
        dt0.m113504D(this.act);
        m69226r2("fakeCall", "reqLive", th, "");
    }
}
