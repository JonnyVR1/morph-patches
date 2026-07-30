package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.ArrayList;
import p133rx.subjects.C22392a;
import p149l.cjl0;
import p149l.d30;
import p149l.e30;
import p149l.f6c0;
import p149l.j760;
import p149l.khl0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.tsi0;
import p149l.u4c0;
import p149l.u59;
import p149l.vwb;
import p149l.w2b0;
import p149l.w9j;
import p149l.wvv;
import p149l.xaj0;
import p149l.y9j;

/* JADX INFO: loaded from: classes9.dex */
public class VipAct extends PutongAct implements tsi0 {

    /* JADX INFO: renamed from: c */
    public PurchaseType f36974c;

    /* JADX INFO: renamed from: d */
    public int f36975d;

    /* JADX INFO: renamed from: e */
    public boolean f36976e;

    /* JADX INFO: renamed from: f */
    public String f36977f;

    /* JADX INFO: renamed from: g */
    public String f36978g;

    /* JADX INFO: renamed from: h */
    public String f36979h;

    /* JADX INFO: renamed from: i */
    public C22392a<String> f36980i = C22392a.m221512b();

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ xaj0 m56233X1(User user, Location location, RoamedLocationData roamedLocationData) {
        return new xaj0(user, location, roamedLocationData);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m56236a2(Context context) {
        return m56237b2(context, khl0.m145975a("vip"));
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m56237b2(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        intent.putExtra("vip_selected_page", i);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m56238c2(Context context, PurchaseType purchaseType) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (purchaseType != null) {
            intent.putExtra("vip_selected_purchase_type", purchaseType.name());
        }
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m56239d2(Context context, String str) {
        Intent intentM56236a2 = m56236a2(context);
        intentM56236a2.putExtra("vip_selected_from", str);
        w2b0.m201087a(str);
        return intentM56236a2;
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m56240e2(Context context, String str, int i) {
        Intent intentM56237b2 = m56237b2(context, i);
        intentM56237b2.putExtra("vip_selected_from", str);
        w2b0.m201087a(str);
        return intentM56237b2;
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m56241g2(Context context, String str, int i, String str2) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("vip_selected_from", str);
        }
        intent.putExtra("vip_selected_page", i);
        intent.putExtra("vip_selected_page_link_uri", str2);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        w2b0.m201087a(str);
        return intent;
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m56242h2(Context context, String str, int i, boolean z, String str2) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("vip_selected_from", str);
        }
        intent.putExtra("vip_selected_page", i);
        intent.putExtra("frag_args_section_select", z);
        intent.putExtra("frag_args_section_promotion", str2);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        w2b0.m201087a(str);
        return intent;
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m56243i2(Context context, String str, PurchaseType purchaseType) {
        Intent intentM56238c2 = m56238c2(context, purchaseType);
        intentM56238c2.putExtra("vip_selected_from", str);
        w2b0.m201087a(str);
        return intentM56238c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2554h0(u4c0.f173915Lb) == null) {
            boolean zM191802K = u59.m191802K();
            PurchaseType purchaseType = this.f36974c;
            if (zM191802K) {
                if (purchaseType != null) {
                    fragmentManager().m2567m().m2811s(u4c0.f173915Lb, IntlVipNewUiFrag.m56350P4(this.f36974c, this.f36979h)).mo2707i();
                } else {
                    fragmentManager().m2567m().m2811s(u4c0.f173915Lb, IntlVipNewUiFrag.m56349O4(this.f36975d, this.f36979h)).mo2707i();
                }
            } else if (purchaseType != null) {
                fragmentManager().m2567m().m2811s(u4c0.f173915Lb, VipNewUiFrag.m57497P4(this.f36974c, this.f36979h)).mo2707i();
            } else {
                fragmentManager().m2567m().m2811s(u4c0.f173915Lb, VipNewUiFrag.m57496O4(this.f36975d, this.f36979h)).mo2707i();
            }
            fragmentManager().m2545e0();
            if (bundle != null || TextUtils.isEmpty(this.f36978g)) {
                return;
            }
            this.f36980i.m132487l(this.f36978g);
        }
    }

    @Override // p149l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo36583F() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        return super.debugItems();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(f6c0.f95900me, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.uel0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176048a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m56244k2(final DoublePair doublePair, String str, String str2, xaj0 xaj0Var) {
        DoublePair latitudeAndLongitude = ((User) xaj0Var.f191751a).getLatitudeAndLongitude();
        DoublePair doublePair2 = new DoublePair();
        doublePair2.first = ((Location) xaj0Var.f191752b).m78831u();
        doublePair2.second = ((Location) xaj0Var.f191752b).m78833x();
        RoamedLocationData roamedLocationData = (RoamedLocationData) xaj0Var.f191753c;
        boolean zM107181E0 = cjl0.m107181E0(doublePair, doublePair2);
        MessageLocation messageLocation = (MessageLocation) vwb.m200346r(roamedLocationData.data, new w9j() { // from class: l.xel0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(cjl0.m107181E0(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (zM107181E0) {
            lsi0.m151593w(R$string.f18957ts);
            if (latitudeAndLongitude.equals(DoublePair.new_())) {
                return;
            }
            cjl0.m107180D0(act());
            return;
        }
        if (NullChecker.m81303a(messageLocation)) {
            lsi0.m151593w(R$string.f18927ss);
            cjl0.m107179C0(act(), messageLocation, null);
            return;
        }
        lsi0.m151593w(R$string.f18927ss);
        MessageLocation messageLocation2 = new MessageLocation();
        messageLocation2.coordinates = doublePair;
        messageLocation2.name = str;
        messageLocation2.address = str2;
        roamedLocationData.data.add(messageLocation2);
        CoreModule.f17545c.f19657k0.f20088R.m121229A(roamedLocationData);
        cjl0.m107179C0(act(), messageLocation2, null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
                wvv.m205766f();
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = stringExtra3;
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = stringExtra3;
                }
                this.act.duringCreated(mkd0.m154985s(CoreModule.f17545c.f19639e0.m169523o9(), qib0.f154687E.m78864p(), CoreModule.f17545c.f19657k0.f20088R.m121230k(), new y9j() { // from class: l.vel0
                    @Override // p149l.y9j
                    /* JADX INFO: renamed from: a */
                    public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                        return VipAct.m56233X1((User) obj, (Location) obj2, (RoamedLocationData) obj3);
                    }
                })).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.wel0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f185949a.m56244k2(doublePair, stringExtra2, stringExtra, (xaj0) obj);
                    }
                }));
            } else if (i == 3) {
                if (intent.getBooleanExtra("locationChanged", false)) {
                    lsi0.m151593w(R$string.f18957ts);
                } else {
                    lsi0.m151593w(R$string.f18927ss);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!vwb.m200296J(fragmentManager().m2589t0()) && (fragmentManager().m2589t0().get(0) instanceof VipNewUiFrag) && ((VipNewUiFrag) fragmentManager().m2589t0().get(0)).m57503o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return OMSDialogPositon.p_privileges_view;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("vip_selected_purchase_type");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                this.f36974c = PurchaseType.valueOf(stringExtra);
            } catch (IllegalArgumentException unused) {
                this.f36974c = null;
            }
        }
        this.f36975d = intent.getIntExtra("vip_selected_page", -1);
        this.f36978g = intent.getStringExtra("vip_selected_page_link_uri");
        this.f36979h = intent.getStringExtra("vip_selected_from");
        this.f36976e = intent.getBooleanExtra("frag_args_section_select", false);
        this.f36977f = intent.getStringExtra("frag_args_section_promotion");
        if (NullChecker.m81303a(this.f36979h)) {
            this.pageHelper.m109040p(j760.m140076a("showfrom", this.f36979h), j760.m140076a("privilege_showfrom", this.f36979h));
        }
        checkGradientColors();
        setSwipeBackEnable(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
