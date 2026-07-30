package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.VipAct;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.tsi0;
import l.vwb;
import l.w2b0;
import l.w9j;
import l.wvv;
import l.xaj0;
import l.y9j;
import p006l.cjl0;
import p006l.f6c0;
import p006l.khl0;
import p006l.qib0;
import p006l.u4c0;
import p006l.u59;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipAct extends PutongAct implements tsi0 {

    /* JADX INFO: renamed from: c */
    public PurchaseType f6755c;

    /* JADX INFO: renamed from: d */
    public int f6756d;

    /* JADX INFO: renamed from: e */
    public boolean f6757e;

    /* JADX INFO: renamed from: f */
    public String f6758f;

    /* JADX INFO: renamed from: g */
    public String f6759g;

    /* JADX INFO: renamed from: h */
    public String f6760h;

    /* JADX INFO: renamed from: i */
    public a<String> f6761i = a.b();

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ xaj0 m9666X1(User user, Location location, RoamedLocationData roamedLocationData) {
        return new xaj0(user, location, roamedLocationData);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m9669a2(Context context) {
        return m9670b2(context, khl0.m18123a("vip"));
    }

    /* JADX INFO: renamed from: b2 */
    public static Intent m9670b2(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        intent.putExtra("vip_selected_page", i);
        intent.addFlags(67108864);
        return intent;
    }

    /* JADX INFO: renamed from: c2 */
    public static Intent m9671c2(Context context, PurchaseType purchaseType) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (purchaseType != null) {
            intent.putExtra("vip_selected_purchase_type", purchaseType.name());
        }
        intent.addFlags(67108864);
        return intent;
    }

    /* JADX INFO: renamed from: d2 */
    public static Intent m9672d2(Context context, String str) {
        Intent intentM9669a2 = m9669a2(context);
        intentM9669a2.putExtra("vip_selected_from", str);
        w2b0.a(str);
        return intentM9669a2;
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m9673e2(Context context, String str, int i) {
        Intent intentM9670b2 = m9670b2(context, i);
        intentM9670b2.putExtra("vip_selected_from", str);
        w2b0.a(str);
        return intentM9670b2;
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m9674g2(Context context, String str, int i, String str2) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("vip_selected_from", str);
        }
        intent.putExtra("vip_selected_page", i);
        intent.putExtra("vip_selected_page_link_uri", str2);
        intent.addFlags(67108864);
        w2b0.a(str);
        return intent;
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m9675h2(Context context, String str, int i, boolean z, String str2) {
        Intent intent = new Intent(context, (Class<?>) VipAct.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("vip_selected_from", str);
        }
        intent.putExtra("vip_selected_page", i);
        intent.putExtra("frag_args_section_select", z);
        intent.putExtra("frag_args_section_promotion", str2);
        intent.addFlags(67108864);
        w2b0.a(str);
        return intent;
    }

    /* JADX INFO: renamed from: i2 */
    public static Intent m9676i2(Context context, String str, PurchaseType purchaseType) {
        Intent intentM9671c2 = m9671c2(context, purchaseType);
        intentM9671c2.putExtra("vip_selected_from", str);
        w2b0.a(str);
        return intentM9671c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().h0(u4c0.f22663Lb) == null) {
            boolean zM24973K = u59.m24973K();
            PurchaseType purchaseType = this.f6755c;
            if (zM24973K) {
                if (purchaseType != null) {
                    fragmentManager().m().s(u4c0.f22663Lb, IntlVipNewUiFrag.m9787P4(this.f6755c, this.f6760h)).i();
                } else {
                    fragmentManager().m().s(u4c0.f22663Lb, IntlVipNewUiFrag.m9786O4(this.f6756d, this.f6760h)).i();
                }
            } else if (purchaseType != null) {
                fragmentManager().m().s(u4c0.f22663Lb, VipNewUiFrag.m10988P4(this.f6755c, this.f6760h)).i();
            } else {
                fragmentManager().m().s(u4c0.f22663Lb, VipNewUiFrag.m10987O4(this.f6756d, this.f6760h)).i();
            }
            fragmentManager().e0();
            if (bundle != null || TextUtils.isEmpty(this.f6759g)) {
                return;
            }
            this.f6761i.onNext(this.f6759g);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m9677F() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public ArrayList<j760<String, d30>> debugItems() {
        return super.debugItems();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean disableAutoPV() {
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(f6c0.f12314me, (ViewGroup) null);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.uel0
            public final void call(Object obj) {
                this.f23515a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m9678k2(final DoublePair doublePair, String str, String str2, xaj0 xaj0Var) {
        DoublePair latitudeAndLongitude = ((User) xaj0Var.a).getLatitudeAndLongitude();
        DoublePair doublePair2 = new DoublePair();
        doublePair2.first = ((Location) xaj0Var.b).u();
        doublePair2.second = ((Location) xaj0Var.b).x();
        RoamedLocationData roamedLocationData = (RoamedLocationData) xaj0Var.c;
        boolean zM13476E0 = cjl0.m13476E0(doublePair, doublePair2);
        MessageLocation messageLocation = (MessageLocation) vwb.r(roamedLocationData.data, new w9j() { // from class: l.xel0
            public final Object call(Object obj) {
                return Boolean.valueOf(cjl0.m13476E0(((MessageLocation) obj).coordinates, doublePair));
            }
        });
        if (zM13476E0) {
            lsi0.w(R$string.f2946ts);
            if (latitudeAndLongitude.equals(DoublePair.new_())) {
                return;
            }
            cjl0.m13475D0(act());
            return;
        }
        if (NullChecker.a(messageLocation)) {
            lsi0.w(R$string.f2916ss);
            cjl0.m13474C0(act(), messageLocation, null);
            return;
        }
        lsi0.w(R$string.f2916ss);
        MessageLocation messageLocation2 = new MessageLocation();
        messageLocation2.coordinates = doublePair;
        messageLocation2.name = str;
        messageLocation2.address = str2;
        roamedLocationData.data.add(messageLocation2);
        CoreModule.f1534c.f3646k0.f4077R.A(roamedLocationData);
        cjl0.m13474C0(act(), messageLocation2, null);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 1 || i == 2) {
                final DoublePair serializableExtra = intent.getSerializableExtra("map_location");
                if (serializableExtra.first == 0.0d && serializableExtra.second == 0.0d) {
                    serializableExtra.first = 1.0E-12d;
                }
                final String stringExtra = intent.getStringExtra("map_address");
                final String stringExtra2 = intent.getStringExtra("map_city");
                String stringExtra3 = intent.getStringExtra("map_name");
                wvv.f();
                if (TextUtils.isEmpty(stringExtra2)) {
                    stringExtra2 = stringExtra3;
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    stringExtra = stringExtra3;
                }
                ((Act) this).act.duringCreated(mkd0.s(CoreModule.f1534c.f3628e0.m21486o9(), qib0.f19778E.p(), CoreModule.f1534c.f3646k0.f4077R.k(), new y9j() { // from class: l.vel0
                    /* JADX INFO: renamed from: a */
                    public final Object m25809a(Object obj, Object obj2, Object obj3) {
                        return VipAct.m9666X1((User) obj, (Location) obj2, (RoamedLocationData) obj3);
                    }
                })).take(1).subscribe(mkd0.G(new e30() { // from class: l.wel0
                    public final void call(Object obj) {
                        this.f25124a.m9678k2(serializableExtra, stringExtra2, stringExtra, (xaj0) obj);
                    }
                }));
            } else if (i == 3) {
                if (intent.getBooleanExtra("locationChanged", false)) {
                    lsi0.w(R$string.f2946ts);
                } else {
                    lsi0.w(R$string.f2916ss);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!vwb.J(fragmentManager().t0()) && (fragmentManager().t0().get(0) instanceof VipNewUiFrag) && ((VipNewUiFrag) fragmentManager().t0().get(0)).m10995o()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_privileges_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("vip_selected_purchase_type");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                this.f6755c = PurchaseType.valueOf(stringExtra);
            } catch (IllegalArgumentException unused) {
                this.f6755c = null;
            }
        }
        this.f6756d = intent.getIntExtra("vip_selected_page", -1);
        this.f6759g = intent.getStringExtra("vip_selected_page_link_uri");
        this.f6760h = intent.getStringExtra("vip_selected_from");
        this.f6757e = intent.getBooleanExtra("frag_args_section_select", false);
        this.f6758f = intent.getStringExtra("frag_args_section_promotion");
        if (NullChecker.a(this.f6760h)) {
            this.pageHelper.p(new j760[]{j760.a("showfrom", this.f6760h), j760.a("privilege_showfrom", this.f6760h)});
        }
        checkGradientColors();
        setSwipeBackEnable(false);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
