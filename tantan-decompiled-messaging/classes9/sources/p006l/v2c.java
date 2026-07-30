package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.settings.SettingsItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.UIModeHelper;
import l.s7m;
import l.w2c;
import l.xdl0;
import l.xh0;
import l.yij0;
import v.VButton;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class v2c implements s7m<o2c> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f23933a;

    /* JADX INFO: renamed from: b */
    public SettingsItem f23934b;

    /* JADX INFO: renamed from: c */
    public SettingsItem f23935c;

    /* JADX INFO: renamed from: d */
    public SettingsItem f23936d;

    /* JADX INFO: renamed from: e */
    public Act f23937e;

    /* JADX INFO: renamed from: f */
    public o2c f23938f;

    /* JADX INFO: renamed from: l.v2c$a */
    public class ViewOnClickListenerC1368a implements View.OnClickListener {
        public ViewOnClickListenerC1368a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UIModeHelper.g(UIModeHelper.UIMode.DAY);
            v2c.this.f23937e.finish();
        }
    }

    /* JADX INFO: renamed from: l.v2c$b */
    public class ViewOnClickListenerC1369b implements View.OnClickListener {
        public ViewOnClickListenerC1369b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UIModeHelper.UIMode uIMode;
            if (yij0.u(v2c.this.f23934b)) {
                uIMode = UIModeHelper.UIMode.FOLLOW_SYSTEM;
            } else {
                uIMode = yij0.u(v2c.this.f23935c) ? UIModeHelper.UIMode.DAY : UIModeHelper.UIMode.NIGHT;
            }
            UIModeHelper.g(uIMode);
            v2c.this.f23937e.finish();
        }
    }

    public v2c(Act act) {
        this.f23937e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m25695l(View view) {
        this.f23937e.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m25696m(CompoundButton compoundButton, boolean z) {
        xdl0.M(this.f23935c, !z);
        xdl0.M(this.f23936d, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m25697n(View view) {
        boolean zT = yij0.T(this.f23934b);
        SettingsItem settingsItem = this.f23935c;
        if (zT) {
            yij0.t(settingsItem, false);
            yij0.t(this.f23936d, false);
        } else {
            yij0.t(settingsItem, true);
            yij0.t(this.f23936d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m25698p(View view) {
        yij0.t(this.f23935c, true);
        yij0.t(this.f23934b, false);
        yij0.t(this.f23936d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m25699q(View view) {
        yij0.t(this.f23936d, true);
        yij0.t(this.f23935c, false);
        yij0.t(this.f23934b, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m25700s(View view) {
        if (!yij0.u(this.f23935c)) {
            new xh0.a(this.f23937e).j("目前我们尚未完全适配深色模式，切换后可能会观感不佳，我们建议您保持普通模式").g(true).f("仍要切换").c(new ViewOnClickListenerC1369b()).r("暂不切换").o(new ViewOnClickListenerC1368a()).a().g();
        } else {
            UIModeHelper.g(UIModeHelper.UIMode.DAY);
            this.f23937e.finish();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25701C0() {
        return null;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25703j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m25703j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w2c.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m25702i1(o2c o2cVar) {
        this.f23938f = o2cVar;
    }

    /* JADX INFO: renamed from: r */
    public void m25705r() {
        this.f23933a.setTitle("深色模式");
        this.f23933a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.p2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18567a.m25695l(view);
            }
        });
        View view = (VButton) this.f23937e.inflater().inflate(f6c0.f12184f2, (ViewGroup) this.f23933a, false);
        this.f23933a.z(new View[]{view});
        this.f23934b.f5638d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.q2c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f19539a.m25696m(compoundButton, z);
            }
        });
        yij0.t(this.f23934b, UIModeHelper.a() == UIModeHelper.UIMode.FOLLOW_SYSTEM);
        yij0.t(this.f23935c, UIModeHelper.a() == UIModeHelper.UIMode.DAY);
        yij0.t(this.f23936d, UIModeHelper.a() == UIModeHelper.UIMode.NIGHT);
        this.f23934b.setOnClickListener(new View.OnClickListener() { // from class: l.r2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20270a.m25697n(view2);
            }
        });
        this.f23935c.setOnClickListener(new View.OnClickListener() { // from class: l.s2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20986a.m25698p(view2);
            }
        });
        this.f23936d.setOnClickListener(new View.OnClickListener() { // from class: l.t2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f21845a.m25699q(view2);
            }
        });
        xdl0.E0(view, new View.OnClickListener() { // from class: l.u2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22443a.m25700s(view2);
            }
        });
    }

    public void destroy() {
    }
}
