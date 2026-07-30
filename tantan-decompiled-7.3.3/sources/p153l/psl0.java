package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.map.IntlMapAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationHistoryAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationItemView;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class psl0 implements iam<gsl0> {

    /* JADX INFO: renamed from: p */
    public static String f153928p;

    /* JADX INFO: renamed from: q */
    public static String f153929q;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f153930a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f153931b;

    /* JADX INFO: renamed from: c */
    public VText f153932c;

    /* JADX INFO: renamed from: d */
    public VImage f153933d;

    /* JADX INFO: renamed from: e */
    public VipLocationItemView f153934e;

    /* JADX INFO: renamed from: f */
    public VText f153935f;

    /* JADX INFO: renamed from: g */
    public VText f153936g;

    /* JADX INFO: renamed from: h */
    public VList f153937h;

    /* JADX INFO: renamed from: i */
    public VText f153938i;

    /* JADX INFO: renamed from: j */
    public VText f153939j;

    /* JADX INFO: renamed from: k */
    public gsl0 f153940k;

    /* JADX INFO: renamed from: l */
    public Act f153941l;

    /* JADX INFO: renamed from: m */
    public krl0 f153942m;

    /* JADX INFO: renamed from: n */
    public boolean f153943n;

    /* JADX INFO: renamed from: o */
    public y20<MessageLocation> f153944o = new y20() { // from class: l.hsl0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f111456a.m173674x((MessageLocation) obj);
        }
    };

    public psl0(Act act) {
        this.f153941l = act;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m173664e() {
        qxv.m178618c();
        uqb0.f180370E.m80051t();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m173668n(String str, Act act, String str2) {
        if (!nmp.m163832a() || qj90.m176830b(PurchaseType.TYPE_ROAMING_PKG)) {
            return true;
        }
        if (TextUtils.equals("from_setting", str2)) {
            str = "p_settings_location,manyou";
        }
        if (TextUtils.equals(str2, "p_youthvip_page")) {
            C8927c.m54605Q0(act, "p_settings_location,manyou", Privilege.youth_roaming);
            return false;
        }
        C8927c.m54586J1(act, str, Privilege.vip_location);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m173669q(View view) {
        this.f153941l.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m173670s(View view) {
        this.f153943n = true;
        i4g0.m138523u("e_manyou", this.f153941l.pageId(), pf60.m172085a("passport_entrance", "p_intl_tribe_view".equals(this.f153940k.m132105G0()) ? "tribe" : Settings.TYPE));
        sfj0.m185596c("e_add_roam_location", ((VipLocationHistoryAct) this.f153941l).pageId(), new sfj0.C20032a[0]);
        if (m173668n("p_home_location,manyou", this.f153941l, this.f153940k.m132105G0())) {
            int size = this.f153940k.m132106H0().data.size();
            Act act = this.f153941l;
            if (size >= 5) {
                o1j0.m165651y(act.string(R$string.f19010Xn));
                return;
            }
            xxv.m213580g(act);
            Act act2 = this.f153941l;
            act2.startActivityForResult(IntlMapAct.m36950h2(act2, 1, true), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m173671u(View view) {
        sfj0.m185596c("e_select_location_view_refresh", ((VipLocationHistoryAct) this.f153941l).pageId(), new sfj0.C20032a[0]);
        if (xxv.m213584k(this.f153941l, new x20() { // from class: l.osl0
            @Override // p153l.x20
            public final void call() {
                psl0.m173664e();
            }
        }) && DoublePair.new_().equals(CoreModule.f18264c.f20381e0.m116600p9().getLatitudeAndLongitude())) {
            qxv.m178618c();
            uqb0.f180370E.m80054w(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m173672v(View view) {
        if (xxv.m213581h(this.f153941l) && !DoublePair.new_().equals(CoreModule.f18264c.f20381e0.m116600p9().getLatitudeAndLongitude())) {
            gsl0.m132071D0(this.f153941l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m173673w(MessageLocation messageLocation, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f153940k.m132106H0().data.remove(messageLocation);
        CoreModule.f18264c.f20399k0.f20830R.m159273A(this.f153940k.m132106H0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m173674x(final MessageLocation messageLocation) {
        this.f153941l.dialog().m21534e0(jyb.m147507f0(this.f153941l.string(R$string.f19352j))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.nsl0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f143512a.m173673w(messageLocation, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: A */
    public void m173675A() {
        bnl0.m105524M(this.f153939j, true);
        bnl0.m105509E0(this.f153939j, new View.OnClickListener() { // from class: l.isl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116682a.m173683y(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m173676B(String str, String str2) {
        f153928p = str;
        f153929q = str2;
        this.f153934e.f37915c.setText(TextUtils.isEmpty(str2) ? this.f153941l.string(R$string.f19439lo) : f153929q);
    }

    /* JADX INFO: renamed from: C */
    public void m173677C(pf60<User, RoamedLocationData> pf60Var) {
        boolean zEquals = DoublePair.new_().equals(pf60Var.f152156a.getLatitudeAndLongitude());
        VipLocationItemView vipLocationItemView = this.f153934e;
        if (zEquals) {
            vipLocationItemView.f37916d.setImageDrawable(getAct().drawable(dbc0.f86008B));
        } else {
            vipLocationItemView.f37916d.setImageDrawable(getAct().drawable(dbc0.f85976A));
        }
        bnl0.m105525M0(this.f153936g, pf60Var.f152157b.data.size() > 0);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f153941l;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f153941l;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m173678k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m173678k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qsl0.m177813b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m173679l(RoamedLocationData roamedLocationData) {
        this.f153942m.m151100B((ArrayList) roamedLocationData.data);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gsl0 gsl0Var) {
        this.f153940k = gsl0Var;
    }

    /* JADX INFO: renamed from: p */
    public boolean m173681p() {
        return this.f153943n;
    }

    /* JADX INFO: renamed from: r */
    public void m173682r() {
        this.f153930a.setTitle(R$string.f19040Yn);
        this.f153930a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.jsl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122476a.m173669q(view);
            }
        });
        this.f153942m = new krl0(this, this.f153940k);
        this.f153937h.setCrashLogFlag("VipLocationHistoryViewModel");
        this.f153937h.setAdapter((ListAdapter) this.f153942m);
        sfj0.m185601h("e_select_location_view_refresh", ((VipLocationHistoryAct) this.f153941l).pageId(), new sfj0.C20032a[0]);
        VText vText = this.f153932c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f153936g.setTypeface(typeface);
        m173684z(xxv.m213594u() || xxv.m213593t());
        this.f153934e.f37914b.setImageResource(dbc0.f86164Fr);
        this.f153938i.setOnClickListener(new View.OnClickListener() { // from class: l.ksl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128583a.m173670s(view);
            }
        });
        if (TextUtils.isEmpty(f153928p) && TextUtils.isEmpty(f153929q)) {
            Region region = CoreModule.f18264c.f20381e0.m116600p9().location.region;
            f153928p = region.city;
            f153929q = region.district;
        }
        this.f153934e.f37915c.setText(TextUtils.isEmpty(f153929q) ? this.f153941l.string(R$string.f19439lo) : f153929q);
        this.f153933d.setOnClickListener(new View.OnClickListener() { // from class: l.lsl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133434a.m173671u(view);
            }
        });
        this.f153934e.setOnClickListener(new View.OnClickListener() { // from class: l.msl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138496a.m173672v(view);
            }
        });
        this.f153933d.setImageResource(dbc0.f86437Oc);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m173683y(View view) {
        this.f153941l.startActivity(NewMainAct.m40699N5(getAct(), NavigationIntent.get("cards"), NavigationCardIntent.get("cards")));
    }

    /* JADX INFO: renamed from: z */
    public void m173684z(boolean z) {
        bnl0.m105524M(this.f153935f, z);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
