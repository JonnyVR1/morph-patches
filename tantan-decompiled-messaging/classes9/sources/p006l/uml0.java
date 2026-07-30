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
import com.p000p1.mobile.putong.core.p004ui.vip.VipLocationItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.map.IntlMapAct;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.MessageLocation;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.s7m;
import l.vml0;
import l.vwb;
import l.wvv;
import l.xdl0;
import v.VImage;
import v.VList;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uml0 implements s7m<mml0> {

    /* JADX INFO: renamed from: o */
    public static String f23644o;

    /* JADX INFO: renamed from: p */
    public static String f23645p;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f23646a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f23647b;

    /* JADX INFO: renamed from: c */
    public VText f23648c;

    /* JADX INFO: renamed from: d */
    public VImage f23649d;

    /* JADX INFO: renamed from: e */
    public VipLocationItemView f23650e;

    /* JADX INFO: renamed from: f */
    public VText f23651f;

    /* JADX INFO: renamed from: g */
    public VText f23652g;

    /* JADX INFO: renamed from: h */
    public VList f23653h;

    /* JADX INFO: renamed from: i */
    public VText f23654i;

    /* JADX INFO: renamed from: j */
    public Act f23655j;

    /* JADX INFO: renamed from: k */
    public mml0 f23656k;

    /* JADX INFO: renamed from: l */
    public oll0 f23657l;

    /* JADX INFO: renamed from: m */
    public boolean f23658m;

    /* JADX INFO: renamed from: n */
    public e30<MessageLocation> f23659n = new e30() { // from class: l.nml0
        public final void call(Object obj) {
            this.f17749a.m25293v((MessageLocation) obj);
        }
    };

    public uml0(Act act) {
        this.f23655j = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m25281n(View view) {
        this.f23655j.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m25282p(View view) {
        this.f23658m = true;
        int size = this.f23656k.m19425H0().data.size();
        Act act = this.f23655j;
        if (size >= 5) {
            lsi0.y(act.string(R$string.f1609Bn));
            return;
        }
        wvv.g(act);
        Act act2 = this.f23655j;
        act2.startActivityForResult(IntlMapAct.g2(act2, 1, true), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m25283q(View view) {
        if (wvv.k(this.f23655j, new d30() { // from class: l.tml0
            public final void call() {
                qib0.f19778E.t();
            }
        }) && DoublePair.new_().equals(CoreModule.f1534c.f3628e0.m21490p9().getMomentRoamLatitudeAndLongitude())) {
            qib0.f19778E.w(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m25284s(View view) {
        if (DoublePair.new_().equals(CoreModule.f1534c.f3628e0.m21490p9().getMomentRoamLatitudeAndLongitude())) {
            return;
        }
        this.f23656k.m19423F0(this.f23655j);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25285C0() {
        return this.f23655j;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25287j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m25287j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vml0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public void m25288k(RoamedLocationData roamedLocationData) {
        this.f23657l.m20697B((ArrayList) roamedLocationData.data);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m25286i1(mml0 mml0Var) {
        this.f23656k = mml0Var;
    }

    /* JADX INFO: renamed from: m */
    public boolean m25290m() {
        return this.f23658m;
    }

    /* JADX INFO: renamed from: r */
    public void m25291r() {
        this.f23646a.setTitle(R$string.f1639Cn);
        this.f23646a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19210a.m25281n(view);
            }
        });
        this.f23657l = new oll0(this, this.f23656k);
        this.f23653h.setCrashLogFlag("VipRoamLocationViewModel");
        this.f23653h.setAdapter(this.f23657l);
        VText vText = this.f23648c;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f23652g.setTypeface(typeface);
        m25294w(wvv.u() || wvv.t());
        this.f23650e.f6847b.setImageResource(x2c0.f26249Rq);
        this.f23654i.setOnClickListener(new View.OnClickListener() { // from class: l.qml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19915a.m25282p(view);
            }
        });
        if (TextUtils.isEmpty(f23644o) && TextUtils.isEmpty(f23645p)) {
            Region region = CoreModule.f1534c.f3628e0.m21490p9().location.region;
            f23644o = region.city;
            f23645p = region.district;
        }
        this.f23650e.f6848c.setText(TextUtils.isEmpty(f23645p) ? this.f23655j.string(R$string.f1999On) : f23645p);
        this.f23649d.setOnClickListener(new View.OnClickListener() { // from class: l.rml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20635a.m25283q(view);
            }
        });
        this.f23650e.setOnClickListener(new View.OnClickListener() { // from class: l.sml0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21430a.m25284s(view);
            }
        });
        this.f23649d.setImageResource(x2c0.f26111Nc);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m25292u(MessageLocation messageLocation, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f23656k.m19425H0().data.remove(messageLocation);
        CoreModule.f1534c.f3646k0.f4078S.A(this.f23656k.m19425H0());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m25293v(final MessageLocation messageLocation) {
        this.f23655j.dialog().e0(vwb.f0(new String[]{this.f23655j.string(R$string.f2611j)})).g0(new Dialog.g() { // from class: l.oml0
            /* JADX INFO: renamed from: a */
            public final void m20711a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f18284a.m25292u(messageLocation, dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: w */
    public void m25294w(boolean z) {
        xdl0.M(this.f23651f, z);
    }

    /* JADX INFO: renamed from: x */
    public void m25295x(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        f23644o = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        f23645p = str2;
        this.f23650e.f6848c.setText(TextUtils.isEmpty(str2) ? this.f23655j.string(R$string.f1999On) : f23645p);
    }

    /* JADX INFO: renamed from: y */
    public void m25296y(j760<User, RoamedLocationData> j760Var) {
        boolean zEquals = DoublePair.new_().equals(((User) j760Var.a).getMomentRoamLatitudeAndLongitude());
        VipLocationItemView vipLocationItemView = this.f23650e;
        if (zEquals) {
            vipLocationItemView.f6849d.setImageDrawable(act().drawable(x2c0.f25689A));
        } else {
            vipLocationItemView.f6849d.setImageDrawable(act().drawable(x2c0.f27298z));
        }
        xdl0.M0(this.f23652g, ((RoamedLocationData) j760Var.b).data.size() > 0);
    }

    public void destroy() {
    }
}
