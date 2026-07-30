package p006l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.VipLocationHistoryAct;
import com.p000p1.mobile.putong.core.p004ui.vip.VipLocationItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.map.IntlMapAct;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mb90;
import l.mjl0;
import l.o6j0;
import l.s7m;
import l.vwb;
import l.wvv;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VList;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ljl0 implements s7m<cjl0> {

    /* JADX INFO: renamed from: p */
    public static String f16454p;

    /* JADX INFO: renamed from: q */
    public static String f16455q;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f16456a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f16457b;

    /* JADX INFO: renamed from: c */
    public VText f16458c;

    /* JADX INFO: renamed from: d */
    public VImage f16459d;

    /* JADX INFO: renamed from: e */
    public VipLocationItemView f16460e;

    /* JADX INFO: renamed from: f */
    public VText f16461f;

    /* JADX INFO: renamed from: g */
    public VText f16462g;

    /* JADX INFO: renamed from: h */
    public VList f16463h;

    /* JADX INFO: renamed from: i */
    public VText f16464i;

    /* JADX INFO: renamed from: j */
    public VText f16465j;

    /* JADX INFO: renamed from: k */
    public cjl0 f16466k;

    /* JADX INFO: renamed from: l */
    public Act f16467l;

    /* JADX INFO: renamed from: m */
    public gil0 f16468m;

    /* JADX INFO: renamed from: n */
    public boolean f16469n;

    /* JADX INFO: renamed from: o */
    public e30<MessageLocation> f16470o = new e30() { // from class: l.djl0
        public final void call(Object obj) {
            this.f10432a.m18814x((MessageLocation) obj);
        }
    };

    public ljl0(Act act) {
        this.f16467l = act;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m18804e() {
        pvv.m21771c();
        qib0.f19778E.t();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m18808n(String str, Act act, String str2) {
        if (!nkp.m20155a() || mb90.b(PurchaseType.TYPE_ROAMING_PKG)) {
            return true;
        }
        if (TextUtils.equals("from_setting", str2)) {
            str = "p_settings_location,manyou";
        }
        if (TextUtils.equals(str2, "p_youthvip_page")) {
            c.Q0(act, "p_settings_location,manyou", Privilege.youth_roaming);
            return false;
        }
        c.J1(act, str, Privilege.vip_location);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m18809q(View view) {
        this.f16467l.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m18810s(View view) {
        this.f16469n = true;
        zvf0.u("e_manyou", this.f16467l.pageId(), new j760[]{j760.a("passport_entrance", "p_intl_tribe_view".equals(this.f16466k.m13509G0()) ? "tribe" : "settings")});
        o6j0.c("e_add_roam_location", ((VipLocationHistoryAct) this.f16467l).pageId(), new o6j0.a[0]);
        if (m18808n("p_home_location,manyou", this.f16467l, this.f16466k.m13509G0())) {
            int size = this.f16466k.m13510H0().data.size();
            Act act = this.f16467l;
            if (size >= 5) {
                lsi0.y(act.string(R$string.f1609Bn));
                return;
            }
            wvv.g(act);
            Act act2 = this.f16467l;
            act2.startActivityForResult(IntlMapAct.g2(act2, 1, true), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m18811u(View view) {
        o6j0.c("e_select_location_view_refresh", ((VipLocationHistoryAct) this.f16467l).pageId(), new o6j0.a[0]);
        if (wvv.k(this.f16467l, new d30() { // from class: l.kjl0
            public final void call() {
                ljl0.m18804e();
            }
        }) && DoublePair.new_().equals(CoreModule.f1534c.f3628e0.m21490p9().getLatitudeAndLongitude())) {
            pvv.m21771c();
            qib0.f19778E.w(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m18812v(View view) {
        if (wvv.h(this.f16467l) && !DoublePair.new_().equals(CoreModule.f1534c.f3628e0.m21490p9().getLatitudeAndLongitude())) {
            cjl0.m13475D0(this.f16467l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m18813w(MessageLocation messageLocation, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f16466k.m13510H0().data.remove(messageLocation);
        CoreModule.f1534c.f3646k0.f4077R.A(this.f16466k.m13510H0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m18814x(final MessageLocation messageLocation) {
        this.f16467l.dialog().e0(vwb.f0(new String[]{this.f16467l.string(R$string.f2611j)})).g0(new Dialog.g() { // from class: l.jjl0
            /* JADX INFO: renamed from: a */
            public final void m17491a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f15182a.m18813w(messageLocation, dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: A */
    public void m18815A() {
        xdl0.M(this.f16465j, true);
        xdl0.E0(this.f16465j, new View.OnClickListener() { // from class: l.ejl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11189a.m18825y(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m18816B(String str, String str2) {
        f16454p = str;
        f16455q = str2;
        this.f16460e.f6848c.setText(TextUtils.isEmpty(str2) ? this.f16467l.string(R$string.f1999On) : f16455q);
    }

    /* JADX INFO: renamed from: C */
    public void m18817C(j760<User, RoamedLocationData> j760Var) {
        boolean zEquals = DoublePair.new_().equals(((User) j760Var.a).getLatitudeAndLongitude());
        VipLocationItemView vipLocationItemView = this.f16460e;
        if (zEquals) {
            vipLocationItemView.f6849d.setImageDrawable(act().drawable(x2c0.f25689A));
        } else {
            vipLocationItemView.f6849d.setImageDrawable(act().drawable(x2c0.f27298z));
        }
        xdl0.M0(this.f16462g, ((RoamedLocationData) j760Var.b).data.size() > 0);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18818C0() {
        return this.f16467l;
    }

    @Nullable
    public Act act() {
        return this.f16467l;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m18820k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m18820k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mjl0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m18821l(RoamedLocationData roamedLocationData) {
        this.f16468m.m15811B((ArrayList) roamedLocationData.data);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m18819i1(cjl0 cjl0Var) {
        this.f16466k = cjl0Var;
    }

    /* JADX INFO: renamed from: p */
    public boolean m18823p() {
        return this.f16469n;
    }

    /* JADX INFO: renamed from: r */
    public void m18824r() {
        this.f16456a.setTitle(R$string.f1639Cn);
        this.f16456a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.fjl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12741a.m18809q(view);
            }
        });
        this.f16468m = new gil0(this, this.f16466k);
        this.f16463h.setCrashLogFlag("VipLocationHistoryViewModel");
        this.f16463h.setAdapter(this.f16468m);
        o6j0.h("e_select_location_view_refresh", ((VipLocationHistoryAct) this.f16467l).pageId(), new o6j0.a[0]);
        VText vText = this.f16458c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f16462g.setTypeface(typeface);
        m18826z(wvv.u() || wvv.t());
        this.f16460e.f6847b.setImageResource(x2c0.f26249Rq);
        this.f16464i.setOnClickListener(new View.OnClickListener() { // from class: l.gjl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13341a.m18810s(view);
            }
        });
        if (TextUtils.isEmpty(f16454p) && TextUtils.isEmpty(f16455q)) {
            Region region = CoreModule.f1534c.f3628e0.m21490p9().location.region;
            f16454p = region.city;
            f16455q = region.district;
        }
        this.f16460e.f6848c.setText(TextUtils.isEmpty(f16455q) ? this.f16467l.string(R$string.f1999On) : f16455q);
        this.f16459d.setOnClickListener(new View.OnClickListener() { // from class: l.hjl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13914a.m18811u(view);
            }
        });
        this.f16460e.setOnClickListener(new View.OnClickListener() { // from class: l.ijl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14525a.m18812v(view);
            }
        });
        this.f16459d.setImageResource(x2c0.f26111Nc);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m18825y(View view) {
        this.f16467l.startActivity(NewMainAct.J5(act(), NavigationIntent.get("cards"), NavigationCardIntent.get("cards")));
    }

    /* JADX INFO: renamed from: z */
    public void m18826z(boolean z) {
        xdl0.M(this.f16461f, z);
    }

    public void destroy() {
    }
}
