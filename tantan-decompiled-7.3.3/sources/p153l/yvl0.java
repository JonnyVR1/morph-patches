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
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.map.IntlMapAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationItemView;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class yvl0 implements iam<qvl0> {

    /* JADX INFO: renamed from: o */
    public static String f201729o;

    /* JADX INFO: renamed from: p */
    public static String f201730p;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f201731a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f201732b;

    /* JADX INFO: renamed from: c */
    public VText f201733c;

    /* JADX INFO: renamed from: d */
    public VImage f201734d;

    /* JADX INFO: renamed from: e */
    public VipLocationItemView f201735e;

    /* JADX INFO: renamed from: f */
    public VText f201736f;

    /* JADX INFO: renamed from: g */
    public VText f201737g;

    /* JADX INFO: renamed from: h */
    public VList f201738h;

    /* JADX INFO: renamed from: i */
    public VText f201739i;

    /* JADX INFO: renamed from: j */
    public Act f201740j;

    /* JADX INFO: renamed from: k */
    public qvl0 f201741k;

    /* JADX INFO: renamed from: l */
    public sul0 f201742l;

    /* JADX INFO: renamed from: m */
    public boolean f201743m;

    /* JADX INFO: renamed from: n */
    public y20<MessageLocation> f201744n = new y20() { // from class: l.rvl0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f165032a.m217550v((MessageLocation) obj);
        }
    };

    public yvl0(Act act) {
        this.f201740j = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m217540n(View view) {
        this.f201740j.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m217541p(View view) {
        this.f201743m = true;
        int size = this.f201741k.m178351H0().data.size();
        Act act = this.f201740j;
        if (size >= 5) {
            o1j0.m165651y(act.string(R$string.f19010Xn));
            return;
        }
        xxv.m213580g(act);
        Act act2 = this.f201740j;
        act2.startActivityForResult(IntlMapAct.m36950h2(act2, 1, true), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m217542q(View view) {
        if (xxv.m213584k(this.f201740j, new x20() { // from class: l.xvl0
            @Override // p153l.x20
            public final void call() {
                uqb0.f180370E.m80051t();
            }
        }) && DoublePair.new_().equals(CoreModule.f18264c.f20381e0.m116600p9().getMomentRoamLatitudeAndLongitude())) {
            uqb0.f180370E.m80054w(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m217543s(View view) {
        if (DoublePair.new_().equals(CoreModule.f18264c.f20381e0.m116600p9().getMomentRoamLatitudeAndLongitude())) {
            return;
        }
        this.f201741k.m178349F0(this.f201740j);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f201740j;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m217544j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m217544j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zvl0.m221786b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m217545k(RoamedLocationData roamedLocationData) {
        this.f201742l.m188039B((ArrayList) roamedLocationData.data);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qvl0 qvl0Var) {
        this.f201741k = qvl0Var;
    }

    /* JADX INFO: renamed from: m */
    public boolean m217547m() {
        return this.f201743m;
    }

    /* JADX INFO: renamed from: r */
    public void m217548r() {
        this.f201731a.setTitle(R$string.f19040Yn);
        this.f201731a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176268a.m217540n(view);
            }
        });
        this.f201742l = new sul0(this, this.f201741k);
        this.f201738h.setCrashLogFlag("VipRoamLocationViewModel");
        this.f201738h.setAdapter((ListAdapter) this.f201742l);
        VText vText = this.f201733c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f201737g.setTypeface(typeface);
        m217551w(xxv.m213594u() || xxv.m213593t());
        this.f201735e.f37914b.setImageResource(dbc0.f86164Fr);
        this.f201739i.setOnClickListener(new View.OnClickListener() { // from class: l.uvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181156a.m217541p(view);
            }
        });
        if (TextUtils.isEmpty(f201729o) && TextUtils.isEmpty(f201730p)) {
            Region region = CoreModule.f18264c.f20381e0.m116600p9().location.region;
            f201729o = region.city;
            f201730p = region.district;
        }
        this.f201735e.f37915c.setText(TextUtils.isEmpty(f201730p) ? this.f201740j.string(R$string.f19439lo) : f201730p);
        this.f201734d.setOnClickListener(new View.OnClickListener() { // from class: l.vvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185943a.m217542q(view);
            }
        });
        this.f201735e.setOnClickListener(new View.OnClickListener() { // from class: l.wvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190971a.m217543s(view);
            }
        });
        this.f201734d.setImageResource(dbc0.f86437Oc);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m217549u(MessageLocation messageLocation, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f201741k.m178351H0().data.remove(messageLocation);
        CoreModule.f18264c.f20399k0.f20831S.m159273A(this.f201741k.m178351H0());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m217550v(final MessageLocation messageLocation) {
        this.f201740j.dialog().m21534e0(jyb.m147507f0(this.f201740j.string(R$string.f19352j))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.svl0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f170854a.m217549u(messageLocation, dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: w */
    public void m217551w(boolean z) {
        bnl0.m105524M(this.f201736f, z);
    }

    /* JADX INFO: renamed from: x */
    public void m217552x(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        f201729o = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        f201730p = str2;
        this.f201735e.f37915c.setText(TextUtils.isEmpty(str2) ? this.f201740j.string(R$string.f19439lo) : f201730p);
    }

    /* JADX INFO: renamed from: y */
    public void m217553y(pf60<User, RoamedLocationData> pf60Var) {
        boolean zEquals = DoublePair.new_().equals(pf60Var.f152156a.getMomentRoamLatitudeAndLongitude());
        VipLocationItemView vipLocationItemView = this.f201735e;
        if (zEquals) {
            vipLocationItemView.f37916d.setImageDrawable(getAct().drawable(dbc0.f86008B));
        } else {
            vipLocationItemView.f37916d.setImageDrawable(getAct().drawable(dbc0.f85976A));
        }
        bnl0.m105525M0(this.f201737g, pf60Var.f152157b.data.size() > 0);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
