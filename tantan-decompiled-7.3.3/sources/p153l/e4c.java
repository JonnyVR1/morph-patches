package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.UIModeHelper;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsItem;
import p151v.VButton;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class e4c implements iam<x3c> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f92080a;

    /* JADX INFO: renamed from: b */
    public SettingsItem f92081b;

    /* JADX INFO: renamed from: c */
    public SettingsItem f92082c;

    /* JADX INFO: renamed from: d */
    public SettingsItem f92083d;

    /* JADX INFO: renamed from: e */
    public Act f92084e;

    /* JADX INFO: renamed from: f */
    public x3c f92085f;

    /* JADX INFO: renamed from: l.e4c$a */
    public class ViewOnClickListenerC16708a implements View.OnClickListener {
        public ViewOnClickListenerC16708a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UIModeHelper.m21822g(UIModeHelper.UIMode.DAY);
            e4c.this.f92084e.m68056e2();
        }
    }

    /* JADX INFO: renamed from: l.e4c$b */
    public class ViewOnClickListenerC16709b implements View.OnClickListener {
        public ViewOnClickListenerC16709b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UIModeHelper.UIMode uIMode;
            if (bsj0.m106285u(e4c.this.f92081b)) {
                uIMode = UIModeHelper.UIMode.FOLLOW_SYSTEM;
            } else {
                uIMode = bsj0.m106285u(e4c.this.f92082c) ? UIModeHelper.UIMode.DAY : UIModeHelper.UIMode.NIGHT;
            }
            UIModeHelper.m21822g(uIMode);
            e4c.this.f92084e.m68056e2();
        }
    }

    public e4c(Act act) {
        this.f92084e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m119401l(View view) {
        this.f92084e.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m119402m(CompoundButton compoundButton, boolean z) {
        bnl0.m105524M(this.f92082c, !z);
        bnl0.m105524M(this.f92083d, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m119403n(View view) {
        boolean zM106262T = bsj0.m106262T(this.f92081b);
        SettingsItem settingsItem = this.f92082c;
        if (zM106262T) {
            bsj0.m106284t(settingsItem, false);
            bsj0.m106284t(this.f92083d, false);
        } else {
            bsj0.m106284t(settingsItem, true);
            bsj0.m106284t(this.f92083d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m119404p(View view) {
        bsj0.m106284t(this.f92082c, true);
        bsj0.m106284t(this.f92081b, false);
        bsj0.m106284t(this.f92083d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m119405q(View view) {
        bsj0.m106284t(this.f92083d, true);
        bsj0.m106284t(this.f92082c, false);
        bsj0.m106284t(this.f92081b, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m119406s(View view) {
        if (!bsj0.m106285u(this.f92082c)) {
            new th0.C20312a(this.f92084e).m191151j("目前我们尚未完全适配深色模式，切换后可能会观感不佳，我们建议您保持普通模式").m191148g(true).m191147f("仍要切换").m191144c(new ViewOnClickListenerC16709b()).m191159r("暂不切换").m191156o(new ViewOnClickListenerC16708a()).m191142a().m191141g();
        } else {
            UIModeHelper.m21822g(UIModeHelper.UIMode.DAY);
            this.f92084e.m68056e2();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m119407j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m119407j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f4c.m123977b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x3c x3cVar) {
        this.f92085f = x3cVar;
    }

    /* JADX INFO: renamed from: r */
    public void m119409r() {
        this.f92080a.setTitle("深色模式");
        this.f92080a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.y3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197340a.m119401l(view);
            }
        });
        VButton vButton = (VButton) this.f92084e.inflater().inflate(kec0.f125824f2, (ViewGroup) this.f92080a, false);
        this.f92080a.m224835z(vButton);
        this.f92081b.f36705d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.z3c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f202817a.m119402m(compoundButton, z);
            }
        });
        bsj0.m106284t(this.f92081b, UIModeHelper.m21816a() == UIModeHelper.UIMode.FOLLOW_SYSTEM);
        bsj0.m106284t(this.f92082c, UIModeHelper.m21816a() == UIModeHelper.UIMode.DAY);
        bsj0.m106284t(this.f92083d, UIModeHelper.m21816a() == UIModeHelper.UIMode.NIGHT);
        this.f92081b.setOnClickListener(new View.OnClickListener() { // from class: l.a4c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68372a.m119403n(view);
            }
        });
        this.f92082c.setOnClickListener(new View.OnClickListener() { // from class: l.b4c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74892a.m119404p(view);
            }
        });
        this.f92083d.setOnClickListener(new View.OnClickListener() { // from class: l.c4c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79688a.m119405q(view);
            }
        });
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.d4c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85027a.m119406s(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
