package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import p137rx.subjects.C22507a;
import p153l.abb0;
import p153l.adc0;
import p153l.bkj0;
import p153l.d79;
import p153l.gsl0;
import p153l.jyb;
import p153l.kec0;
import p153l.o1j0;
import p153l.oql0;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.scj;
import p153l.uqb0;
import p153l.w1j0;
import p153l.x20;
import p153l.xxv;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class VipAct extends PutongAct implements w1j0 {

    /* JADX INFO: renamed from: c */
    public PurchaseType f37822c;

    /* JADX INFO: renamed from: d */
    public int f37823d;

    /* JADX INFO: renamed from: e */
    public boolean f37824e;

    /* JADX INFO: renamed from: f */
    public String f37825f;

    /* JADX INFO: renamed from: g */
    public String f37826g;

    /* JADX INFO: renamed from: h */
    public String f37827h;

    /* JADX INFO: renamed from: i */
    public C22507a<String> f37828i = C22507a.m222758b();

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ bkj0 m57416Y1(User user, Location location, RoamedLocationData roamedLocationData) {
        return new bkj0(user, location, roamedLocationData);
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m57419b2(Context context) {
        return m57420c2(context, oql0.m168817a("vip"));
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m57420c2(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        intent.putExtra("vip_selected_page", i);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m57421d2(Context context, PurchaseType purchaseType) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (purchaseType != null) {
            intent.putExtra("vip_selected_purchase_type", purchaseType.name());
        }
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m57422e2(Context context, String str) {
        Intent intentM57419b2 = m57419b2(context);
        intentM57419b2.putExtra("vip_selected_from", str);
        abb0.m96734a(str);
        return intentM57419b2;
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m57423g2(Context context, String str, int i) {
        Intent intentM57420c2 = m57420c2(context, i);
        intentM57420c2.putExtra("vip_selected_from", str);
        abb0.m96734a(str);
        return intentM57420c2;
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m57424h2(Context context, String str, int i, String str2) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("vip_selected_from", str);
        }
        intent.putExtra("vip_selected_page", i);
        intent.putExtra("vip_selected_page_link_uri", str2);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        abb0.m96734a(str);
        return intent;
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m57425i2(Context context, String str, int i, boolean z, String str2) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("vip_selected_from", str);
        }
        intent.putExtra("vip_selected_page", i);
        intent.putExtra("frag_args_section_select", z);
        intent.putExtra("frag_args_section_promotion", str2);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        abb0.m96734a(str);
        return intent;
    }

    /* JADX INFO: renamed from: k2 */
    public static Intent m57426k2(Context context, String str, PurchaseType purchaseType) {
        Intent intentM57421d2 = m57421d2(context, purchaseType);
        intentM57421d2.putExtra("vip_selected_from", str);
        abb0.m96734a(str);
        return intentM57421d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2555h0(adc0.f70037Nb) == null) {
            boolean zM114653L = d79.m114653L();
            PurchaseType purchaseType = this.f37822c;
            if (zM114653L) {
                if (purchaseType != null) {
                    fragmentManager().m2568m().m2812s(adc0.f70037Nb, IntlVipNewUiFrag.m57533P4(this.f37822c, this.f37827h)).mo2708i();
                } else {
                    fragmentManager().m2568m().m2812s(adc0.f70037Nb, IntlVipNewUiFrag.m57532O4(this.f37823d, this.f37827h)).mo2708i();
                }
            } else if (purchaseType != null) {
                fragmentManager().m2568m().m2812s(adc0.f70037Nb, VipNewUiFrag.m58680P4(this.f37822c, this.f37827h)).mo2708i();
            } else {
                fragmentManager().m2568m().m2812s(adc0.f70037Nb, VipNewUiFrag.m58679O4(this.f37823d, this.f37827h)).mo2708i();
            }
            fragmentManager().m2546e0();
            if (bundle != null || TextUtils.isEmpty(this.f37826g)) {
                return;
            }
            this.f37828i.m137019l(this.f37826g);
        }
    }

    @Override // p153l.w1j0
    /* JADX INFO: renamed from: G */
    public boolean mo37586G() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        return super.debugItems();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(kec0.f126073te, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.ynl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200892a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m57427l2(final DoublePair doublePair, String str, String str2, bkj0 bkj0Var) {
        DoublePair latitudeAndLongitude = ((User) bkj0Var.f77081a).getLatitudeAndLongitude();
        DoublePair doublePair2 = new DoublePair();
        doublePair2.first = ((Location) bkj0Var.f77082b).m80014u();
        doublePair2.second = ((Location) bkj0Var.f77082b).m80016x();
        RoamedLocationData roamedLocationData = (RoamedLocationData) bkj0Var.f77083c;
        boolean zM132072E0 = gsl0.m132072E0(doublePair, doublePair2);
        MessageLocation messageLocation = (MessageLocation) jyb.m147529r(roamedLocationData.data, new qcj() { // from class: l.bol0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(gsl0.m132072E0(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (zM132072E0) {
            o1j0.m165649w(R$string.f18775Ps);
            if (latitudeAndLongitude.equals(DoublePair.new_())) {
                return;
            }
            gsl0.m132071D0(act());
            return;
        }
        if (NullChecker.m82486a(messageLocation)) {
            o1j0.m165649w(R$string.f18745Os);
            gsl0.m132070C0(act(), messageLocation, null);
            return;
        }
        o1j0.m165649w(R$string.f18745Os);
        MessageLocation messageLocation2 = new MessageLocation();
        messageLocation2.coordinates = doublePair;
        messageLocation2.name = str;
        messageLocation2.address = str2;
        roamedLocationData.data.add(messageLocation2);
        CoreModule.f18264c.f20399k0.f20830R.m159273A(roamedLocationData);
        gsl0.m132070C0(act(), messageLocation2, null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 1 || i == 2) {
                final DoublePair doublePair = (DoublePair) intent.getSerializableExtra("map_location");
                if (doublePair.first == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && doublePair.second == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    doublePair.first = 1.0E-12d;
                }
                final String stringExtra = intent.getStringExtra("map_address");
                final String stringExtra2 = intent.getStringExtra("map_city");
                String stringExtra3 = intent.getStringExtra("map_name");
                xxv.m213579f();
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = stringExtra3;
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = stringExtra3;
                }
                this.act.duringCreated(psd0.m173626s(CoreModule.f18264c.f20381e0.m116596o9(), uqb0.f180370E.m80047p(), CoreModule.f18264c.f20399k0.f20830R.m159274k(), new scj() { // from class: l.znl0
                    @Override // p153l.scj
                    /* JADX INFO: renamed from: a */
                    public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                        return VipAct.m57416Y1((User) obj, (Location) obj2, (RoamedLocationData) obj3);
                    }
                })).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.aol0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f72474a.m57427l2(doublePair, stringExtra2, stringExtra, (bkj0) obj);
                    }
                }));
            } else if (i == 3) {
                if (intent.getBooleanExtra("locationChanged", false)) {
                    o1j0.m165649w(R$string.f18775Ps);
                } else {
                    o1j0.m165649w(R$string.f18745Os);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!jyb.m147479J(fragmentManager().m2590t0()) && (fragmentManager().m2590t0().get(0) instanceof VipNewUiFrag) && ((VipNewUiFrag) fragmentManager().m2590t0().get(0)).m58686o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return OMSDialogPositon.p_privileges_view;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("vip_selected_purchase_type");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                this.f37822c = PurchaseType.valueOf(stringExtra);
            } catch (IllegalArgumentException unused) {
                this.f37822c = null;
            }
        }
        this.f37823d = intent.getIntExtra("vip_selected_page", -1);
        this.f37826g = intent.getStringExtra("vip_selected_page_link_uri");
        this.f37827h = intent.getStringExtra("vip_selected_from");
        this.f37824e = intent.getBooleanExtra("frag_args_section_select", false);
        this.f37825f = intent.getStringExtra("frag_args_section_promotion");
        if (NullChecker.m82486a(this.f37827h)) {
            this.pageHelper.m152781p(pf60.m172085a("showfrom", this.f37827h), pf60.m172085a("privilege_showfrom", this.f37827h));
        }
        checkGradientColors();
        setSwipeBackEnable(false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
