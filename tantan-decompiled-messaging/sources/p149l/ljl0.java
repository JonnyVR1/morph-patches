package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.map.IntlMapAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationHistoryAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class ljl0 implements s7m<cjl0> {

    /* JADX INFO: renamed from: p */
    public static String f128340p;

    /* JADX INFO: renamed from: q */
    public static String f128341q;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f128342a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f128343b;

    /* JADX INFO: renamed from: c */
    public VText f128344c;

    /* JADX INFO: renamed from: d */
    public VImage f128345d;

    /* JADX INFO: renamed from: e */
    public VipLocationItemView f128346e;

    /* JADX INFO: renamed from: f */
    public VText f128347f;

    /* JADX INFO: renamed from: g */
    public VText f128348g;

    /* JADX INFO: renamed from: h */
    public VList f128349h;

    /* JADX INFO: renamed from: i */
    public VText f128350i;

    /* JADX INFO: renamed from: j */
    public VText f128351j;

    /* JADX INFO: renamed from: k */
    public cjl0 f128352k;

    /* JADX INFO: renamed from: l */
    public Act f128353l;

    /* JADX INFO: renamed from: m */
    public gil0 f128354m;

    /* JADX INFO: renamed from: n */
    public boolean f128355n;

    /* JADX INFO: renamed from: o */
    public e30<MessageLocation> f128356o = new e30() { // from class: l.djl0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f86559a.m150000x((MessageLocation) obj);
        }
    };

    public ljl0(Act act) {
        this.f128353l = act;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m149990e() {
        pvv.m171693c();
        qib0.f154687E.m78868t();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m149994n(String str, Act act, String str2) {
        if (!nkp.m159982a() || mb90.m153866b(PurchaseType.TYPE_ROAMING_PKG)) {
            return true;
        }
        if (TextUtils.equals("from_setting", str2)) {
            str = "p_settings_location,manyou";
        }
        if (TextUtils.equals(str2, "p_youthvip_page")) {
            C8764c.m53422Q0(act, "p_settings_location,manyou", Privilege.youth_roaming);
            return false;
        }
        C8764c.m53403J1(act, str, Privilege.vip_location);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m149995q(View view) {
        this.f128353l.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m149996s(View view) {
        this.f128355n = true;
        zvf0.m220399u("e_manyou", this.f128353l.pageId(), j760.m140076a("passport_entrance", "p_intl_tribe_view".equals(this.f128352k.m107214G0()) ? "tribe" : Settings.TYPE));
        o6j0.m162859c("e_add_roam_location", ((VipLocationHistoryAct) this.f128353l).pageId(), new o6j0.C18854a[0]);
        if (m149994n("p_home_location,manyou", this.f128353l, this.f128352k.m107214G0())) {
            int size = this.f128352k.m107215H0().data.size();
            Act act = this.f128353l;
            if (size >= 5) {
                lsi0.m151595y(act.string(R$string.f17620Bn));
                return;
            }
            wvv.m205767g(act);
            Act act2 = this.f128353l;
            act2.startActivityForResult(IntlMapAct.m35947g2(act2, 1, true), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m149997u(View view) {
        o6j0.m162859c("e_select_location_view_refresh", ((VipLocationHistoryAct) this.f128353l).pageId(), new o6j0.C18854a[0]);
        if (wvv.m205771k(this.f128353l, new d30() { // from class: l.kjl0
            @Override // p149l.d30
            public final void call() {
                ljl0.m149990e();
            }
        }) && DoublePair.new_().equals(CoreModule.f17545c.f19639e0.m169527p9().getLatitudeAndLongitude())) {
            pvv.m171693c();
            qib0.f154687E.m78871w(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m149998v(View view) {
        if (wvv.m205768h(this.f128353l) && !DoublePair.new_().equals(CoreModule.f17545c.f19639e0.m169527p9().getLatitudeAndLongitude())) {
            cjl0.m107180D0(this.f128353l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m149999w(MessageLocation messageLocation, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f128352k.m107215H0().data.remove(messageLocation);
        CoreModule.f17545c.f19657k0.f20088R.m121229A(this.f128352k.m107215H0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m150000x(final MessageLocation messageLocation) {
        this.f128353l.dialog().m20535e0(vwb.m200324f0(this.f128353l.string(R$string.f18622j))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.jjl0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f118300a.m149999w(messageLocation, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: A */
    public void m150001A() {
        xdl0.m208344M(this.f128351j, true);
        xdl0.m208329E0(this.f128351j, new View.OnClickListener() { // from class: l.ejl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91765a.m150009y(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m150002B(String str, String str2) {
        f128340p = str;
        f128341q = str2;
        this.f128346e.f37067c.setText(TextUtils.isEmpty(str2) ? this.f128353l.string(R$string.f18010On) : f128341q);
    }

    /* JADX INFO: renamed from: C */
    public void m150003C(j760<User, RoamedLocationData> j760Var) {
        boolean zEquals = DoublePair.new_().equals(j760Var.f116564a.getLatitudeAndLongitude());
        VipLocationItemView vipLocationItemView = this.f128346e;
        if (zEquals) {
            vipLocationItemView.f37068d.setImageDrawable(getAct().drawable(x2c0.f189153A));
        } else {
            vipLocationItemView.f37068d.setImageDrawable(getAct().drawable(x2c0.f190762z));
        }
        xdl0.m208345M0(this.f128348g, j760Var.f116565b.data.size() > 0);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128353l;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f128353l;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m150004k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m150004k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mjl0.m154898b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m150005l(RoamedLocationData roamedLocationData) {
        this.f128354m.m126361B((ArrayList) roamedLocationData.data);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cjl0 cjl0Var) {
        this.f128352k = cjl0Var;
    }

    /* JADX INFO: renamed from: p */
    public boolean m150007p() {
        return this.f128355n;
    }

    /* JADX INFO: renamed from: r */
    public void m150008r() {
        this.f128342a.setTitle(R$string.f17650Cn);
        this.f128342a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.fjl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97797a.m149995q(view);
            }
        });
        this.f128354m = new gil0(this, this.f128352k);
        this.f128349h.setCrashLogFlag("VipLocationHistoryViewModel");
        this.f128349h.setAdapter((ListAdapter) this.f128354m);
        o6j0.m162864h("e_select_location_view_refresh", ((VipLocationHistoryAct) this.f128353l).pageId(), new o6j0.C18854a[0]);
        VText vText = this.f128344c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f128348g.setTypeface(typeface);
        m150010z(wvv.m205781u() || wvv.m205780t());
        this.f128346e.f37066b.setImageResource(x2c0.f189713Rq);
        this.f128350i.setOnClickListener(new View.OnClickListener() { // from class: l.gjl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103087a.m149996s(view);
            }
        });
        if (TextUtils.isEmpty(f128340p) && TextUtils.isEmpty(f128341q)) {
            Region region = CoreModule.f17545c.f19639e0.m169527p9().location.region;
            f128340p = region.city;
            f128341q = region.district;
        }
        this.f128346e.f37067c.setText(TextUtils.isEmpty(f128341q) ? this.f128353l.string(R$string.f18010On) : f128341q);
        this.f128345d.setOnClickListener(new View.OnClickListener() { // from class: l.hjl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108093a.m149997u(view);
            }
        });
        this.f128346e.setOnClickListener(new View.OnClickListener() { // from class: l.ijl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113575a.m149998v(view);
            }
        });
        this.f128345d.setImageResource(x2c0.f189575Nc);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m150009y(View view) {
        this.f128353l.startActivity(NewMainAct.m39687J5(getAct(), NavigationIntent.get("cards"), NavigationCardIntent.get("cards")));
    }

    /* JADX INFO: renamed from: z */
    public void m150010z(boolean z) {
        xdl0.m208344M(this.f128347f, z);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
