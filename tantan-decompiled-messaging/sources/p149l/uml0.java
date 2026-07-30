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
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.map.IntlMapAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationItemView;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VList;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class uml0 implements s7m<mml0> {

    /* JADX INFO: renamed from: o */
    public static String f177263o;

    /* JADX INFO: renamed from: p */
    public static String f177264p;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f177265a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f177266b;

    /* JADX INFO: renamed from: c */
    public VText f177267c;

    /* JADX INFO: renamed from: d */
    public VImage f177268d;

    /* JADX INFO: renamed from: e */
    public VipLocationItemView f177269e;

    /* JADX INFO: renamed from: f */
    public VText f177270f;

    /* JADX INFO: renamed from: g */
    public VText f177271g;

    /* JADX INFO: renamed from: h */
    public VList f177272h;

    /* JADX INFO: renamed from: i */
    public VText f177273i;

    /* JADX INFO: renamed from: j */
    public Act f177274j;

    /* JADX INFO: renamed from: k */
    public mml0 f177275k;

    /* JADX INFO: renamed from: l */
    public oll0 f177276l;

    /* JADX INFO: renamed from: m */
    public boolean f177277m;

    /* JADX INFO: renamed from: n */
    public e30<MessageLocation> f177278n = new e30() { // from class: l.nml0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f139633a.m194391v((MessageLocation) obj);
        }
    };

    public uml0(Act act) {
        this.f177274j = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m194381n(View view) {
        this.f177274j.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m194382p(View view) {
        this.f177277m = true;
        int size = this.f177275k.m155471H0().data.size();
        Act act = this.f177274j;
        if (size >= 5) {
            lsi0.m151595y(act.string(R$string.f17620Bn));
            return;
        }
        wvv.m205767g(act);
        Act act2 = this.f177274j;
        act2.startActivityForResult(IntlMapAct.m35947g2(act2, 1, true), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m194383q(View view) {
        if (wvv.m205771k(this.f177274j, new d30() { // from class: l.tml0
            @Override // p149l.d30
            public final void call() {
                qib0.f154687E.m78868t();
            }
        }) && DoublePair.new_().equals(CoreModule.f17545c.f19639e0.m169527p9().getMomentRoamLatitudeAndLongitude())) {
            qib0.f154687E.m78871w(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m194384s(View view) {
        if (DoublePair.new_().equals(CoreModule.f17545c.f19639e0.m169527p9().getMomentRoamLatitudeAndLongitude())) {
            return;
        }
        this.f177275k.m155469F0(this.f177274j);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f177274j;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m194385j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m194385j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vml0.m198953b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m194386k(RoamedLocationData roamedLocationData) {
        this.f177276l.m164951B((ArrayList) roamedLocationData.data);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(mml0 mml0Var) {
        this.f177275k = mml0Var;
    }

    /* JADX INFO: renamed from: m */
    public boolean m194388m() {
        return this.f177277m;
    }

    /* JADX INFO: renamed from: r */
    public void m194389r() {
        this.f177265a.setTitle(R$string.f17650Cn);
        this.f177265a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150241a.m194381n(view);
            }
        });
        this.f177276l = new oll0(this, this.f177275k);
        this.f177272h.setCrashLogFlag("VipRoamLocationViewModel");
        this.f177272h.setAdapter((ListAdapter) this.f177276l);
        VText vText = this.f177267c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f177271g.setTypeface(typeface);
        m194392w(wvv.m205781u() || wvv.m205780t());
        this.f177269e.f37066b.setImageResource(x2c0.f189713Rq);
        this.f177273i.setOnClickListener(new View.OnClickListener() { // from class: l.qml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155320a.m194382p(view);
            }
        });
        if (TextUtils.isEmpty(f177263o) && TextUtils.isEmpty(f177264p)) {
            Region region = CoreModule.f17545c.f19639e0.m169527p9().location.region;
            f177263o = region.city;
            f177264p = region.district;
        }
        this.f177269e.f37067c.setText(TextUtils.isEmpty(f177264p) ? this.f177274j.string(R$string.f18010On) : f177264p);
        this.f177268d.setOnClickListener(new View.OnClickListener() { // from class: l.rml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160105a.m194383q(view);
            }
        });
        this.f177269e.setOnClickListener(new View.OnClickListener() { // from class: l.sml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165359a.m194384s(view);
            }
        });
        this.f177268d.setImageResource(x2c0.f189575Nc);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m194390u(MessageLocation messageLocation, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f177275k.m155471H0().data.remove(messageLocation);
        CoreModule.f17545c.f19657k0.f20089S.m121229A(this.f177275k.m155471H0());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m194391v(final MessageLocation messageLocation) {
        this.f177274j.dialog().m20535e0(vwb.m200324f0(this.f177274j.string(R$string.f18622j))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.oml0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f144667a.m194390u(messageLocation, dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: w */
    public void m194392w(boolean z) {
        xdl0.m208344M(this.f177270f, z);
    }

    /* JADX INFO: renamed from: x */
    public void m194393x(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        f177263o = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        f177264p = str2;
        this.f177269e.f37067c.setText(TextUtils.isEmpty(str2) ? this.f177274j.string(R$string.f18010On) : f177264p);
    }

    /* JADX INFO: renamed from: y */
    public void m194394y(j760<User, RoamedLocationData> j760Var) {
        boolean zEquals = DoublePair.new_().equals(j760Var.f116564a.getMomentRoamLatitudeAndLongitude());
        VipLocationItemView vipLocationItemView = this.f177269e;
        if (zEquals) {
            vipLocationItemView.f37068d.setImageDrawable(getAct().drawable(x2c0.f189153A));
        } else {
            vipLocationItemView.f37068d.setImageDrawable(getAct().drawable(x2c0.f190762z));
        }
        xdl0.m208345M0(this.f177271g, j760Var.f116565b.data.size() > 0);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
