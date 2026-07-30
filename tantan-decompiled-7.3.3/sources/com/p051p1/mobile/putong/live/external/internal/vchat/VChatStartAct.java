package com.p051p1.mobile.putong.live.external.internal.vchat;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatLive;
import com.p051p1.mobile.putong.live.external.R$string;
import java.util.ArrayList;
import p153l.ad0;
import p153l.bc20;
import p153l.ckl0;
import p153l.d45;
import p153l.dhw;
import p153l.fal0;
import p153l.i4g0;
import p153l.ial0;
import p153l.iit;
import p153l.it0;
import p153l.jwu;
import p153l.kd2;
import p153l.kwk0;
import p153l.lbl0;
import p153l.mej0;
import p153l.n4u;
import p153l.o1j0;
import p153l.ogl0;
import p153l.pee0;
import p153l.pf60;
import p153l.rr60;
import p153l.wgt;
import p153l.x20;
import p153l.xdl0;
import p153l.xnu;
import p153l.y20;
import p153l.yuk0;

/* JADX INFO: loaded from: classes9.dex */
public class VChatStartAct extends PutongAct {
    /* JADX INFO: renamed from: d2 */
    public static void m70399d2(Act act) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "anchor");
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: e2 */
    public static void m70400e2(final Act act) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kwk0(true));
        arrayList.add(new ad0());
        arrayList.add(new bc20(new x20() { // from class: l.dwk0
            @Override // p153l.x20
            public final void call() {
                n4u.m161601m(act);
            }
        }));
        arrayList.add(new rr60());
        arrayList.add(new pee0(iit.INSTANCE.m140132R()));
        arrayList.add(new fal0());
        m70407q2(act, arrayList);
    }

    /* JADX INFO: renamed from: g2 */
    public static void m70401g2(Act act, xnu xnuVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fal0(true, xnuVar));
        m70407q2(act, arrayList);
    }

    /* JADX INFO: renamed from: h2 */
    public static void m70402h2(Act act, String str, String str2, String str3) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "audience_recall");
        intent.putExtra("source", str2);
        intent.putExtra("userId", str);
        intent.putExtra("recallId", str3);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: i2 */
    public static void m70403i2(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "audience_normal");
        intent.putExtra("source", str2);
        intent.putExtra("roomId", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: k2 */
    public static void m70404k2(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "audience_user");
        intent.putExtra("source", str2);
        intent.putExtra("userId", str);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public /* synthetic */ void m70405l2() {
        n4u.m161601m(this.act);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public /* synthetic */ void m70406n2(Throwable th) {
        m70409s2("normal", "reqLive", th, "");
        o1j0.m165634h(R$string.f45725O);
        it0.m142010D(this.act);
    }

    /* JADX INFO: renamed from: q2 */
    public static void m70407q2(Act act, ArrayList<lbl0> arrayList) {
        d45.m114108a(act, arrayList);
    }

    /* JADX INFO: renamed from: r2 */
    public static void m70408r2(Act act, int i, String str) {
        Intent intent = new Intent(act, (Class<?>) VChatStartAct.class);
        intent.putExtra("type", "audience_coupons");
        intent.putExtra("source", str);
        intent.putExtra("coupons", i);
        act.startActivity(intent);
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: s2 */
    public static void m70409s2(String str, String str2, Throwable th, String str3) {
        if (th != null) {
            str3 = th instanceof TantanException.Client.CoreService ? String.valueOf(((TantanException.Client.CoreService) th).code) : th.getMessage();
        }
        i4g0.m138495D("e_live_video_quickchat_enter_status", "p_live_video_quickchat_status", new pf60("type", str), new pf60("stage", str2), new pf60("error", str3));
    }

    /* JADX INFO: renamed from: u2 */
    public static void m70410u2(String str, String str2) {
        i4g0.m138495D("e_live_video_quickchat_enter_status", "p_live_video_quickchat_status", new pf60("type", str), new pf60("stage", str2), new pf60("error", "NA"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        if (TextUtils.equals(getIntent().getStringExtra("type"), "anchor")) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new kwk0(true));
            arrayList.add(new ad0());
            arrayList.add(new bc20(new x20() { // from class: l.ewk0
                @Override // p153l.x20
                public final void call() {
                    this.f96173a.m70405l2();
                }
            }));
            arrayList.add(new rr60());
            arrayList.add(new pee0(iit.INSTANCE.m140132R()));
            arrayList.add(new fal0());
            m70407q2(this.act, arrayList);
            return;
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "audience_normal")) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new kwk0(false));
            arrayList2.add(new mej0("normal", true));
            arrayList2.add(new rr60());
            arrayList2.add(new pee0(iit.INSTANCE.m140133S()));
            arrayList2.add(new ial0(getIntent().getStringExtra("roomId"), getIntent().getStringExtra("source")));
            m70407q2(this.act, arrayList2);
            return;
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "audience_user")) {
            m70410u2("normal", "start");
            jwu.m147234I(getIntent().getStringExtra("userId")).subscribe(dhw.m115826e(new y20() { // from class: l.fwk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101181a.m70411m2((BLiveVideoChatLive) obj);
                }
            }, new y20() { // from class: l.gwk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106852a.m70406n2((Throwable) obj);
                }
            }));
            return;
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "audience_coupons")) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new kwk0(false));
            arrayList3.add(new mej0("randomMatch", true));
            arrayList3.add(new ogl0(getIntent().getIntExtra("coupons", 0)));
            arrayList3.add(new rr60());
            arrayList3.add(new pee0(iit.INSTANCE.m140133S()));
            arrayList3.add(new ckl0(getIntent().getStringExtra("source")));
            m70407q2(this.act, arrayList3);
            return;
        }
        if (TextUtils.equals(getIntent().getStringExtra("type"), "audience_recall")) {
            m70410u2("fakeCall", "start");
            if (wgt.m206254u(iit.INSTANCE.m140133S())) {
                m70410u2("fakeCall", "sdkRes");
                jwu.m147234I(getIntent().getStringExtra("userId")).subscribe(dhw.m115826e(new y20() { // from class: l.hwk0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f111898a.m70412o2((BLiveVideoChatLive) obj);
                    }
                }, new y20() { // from class: l.iwk0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f117279a.m70413p2((Throwable) obj);
                    }
                }));
            } else {
                m70409s2("fakeCall", "sdkRes", null, "notReady");
                it0.m142010D(this.act);
            }
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m70411m2(BLiveVideoChatLive bLiveVideoChatLive) {
        m70410u2("normal", "reqLive");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kwk0(false));
        arrayList.add(new mej0("normal", false));
        arrayList.add(new rr60());
        arrayList.add(new pee0(iit.INSTANCE.m140133S()));
        arrayList.add(new ial0(bLiveVideoChatLive.roomId, getIntent().getStringExtra("source")));
        m70407q2(this.act, arrayList);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m70412o2(BLiveVideoChatLive bLiveVideoChatLive) {
        m70410u2("fakeCall", "reqLive");
        m70409s2("fakeCall", "anchorBusy", null, yuk0.m217438d(bLiveVideoChatLive).booleanValue() ? "NA" : bLiveVideoChatLive.status);
        if (!yuk0.m217438d(bLiveVideoChatLive).booleanValue()) {
            it0.m142010D(this.act);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kwk0(false).m151701k(true));
        arrayList.add(new mej0("fakeCall", false));
        arrayList.add(new kd2(bLiveVideoChatLive.roomId));
        arrayList.add(new xdl0(bLiveVideoChatLive, getIntent().getStringExtra("source"), getIntent().getStringExtra("recallId")));
        m70407q2(this.act, arrayList);
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m70413p2(Throwable th) {
        it0.m142010D(this.act);
        m70409s2("fakeCall", "reqLive", th, "");
    }
}
