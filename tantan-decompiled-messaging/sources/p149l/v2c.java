package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.UIModeHelper;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsItem;
import p147v.VButton;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class v2c implements s7m<o2c> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f179369a;

    /* JADX INFO: renamed from: b */
    public SettingsItem f179370b;

    /* JADX INFO: renamed from: c */
    public SettingsItem f179371c;

    /* JADX INFO: renamed from: d */
    public SettingsItem f179372d;

    /* JADX INFO: renamed from: e */
    public Act f179373e;

    /* JADX INFO: renamed from: f */
    public o2c f179374f;

    /* JADX INFO: renamed from: l.v2c$a */
    public class ViewOnClickListenerC20566a implements View.OnClickListener {
        public ViewOnClickListenerC20566a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UIModeHelper.m20823g(UIModeHelper.UIMode.DAY);
            v2c.this.f179373e.m66873d2();
        }
    }

    /* JADX INFO: renamed from: l.v2c$b */
    public class ViewOnClickListenerC20567b implements View.OnClickListener {
        public ViewOnClickListenerC20567b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UIModeHelper.UIMode uIMode;
            if (yij0.m214965u(v2c.this.f179370b)) {
                uIMode = UIModeHelper.UIMode.FOLLOW_SYSTEM;
            } else {
                uIMode = yij0.m214965u(v2c.this.f179371c) ? UIModeHelper.UIMode.DAY : UIModeHelper.UIMode.NIGHT;
            }
            UIModeHelper.m20823g(uIMode);
            v2c.this.f179373e.m66873d2();
        }
    }

    public v2c(Act act) {
        this.f179373e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m196763l(View view) {
        this.f179373e.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m196764m(CompoundButton compoundButton, boolean z) {
        xdl0.m208344M(this.f179371c, !z);
        xdl0.m208344M(this.f179372d, !z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m196765n(View view) {
        boolean zM214942T = yij0.m214942T(this.f179370b);
        SettingsItem settingsItem = this.f179371c;
        if (zM214942T) {
            yij0.m214964t(settingsItem, false);
            yij0.m214964t(this.f179372d, false);
        } else {
            yij0.m214964t(settingsItem, true);
            yij0.m214964t(this.f179372d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m196766p(View view) {
        yij0.m214964t(this.f179371c, true);
        yij0.m214964t(this.f179370b, false);
        yij0.m214964t(this.f179372d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m196767q(View view) {
        yij0.m214964t(this.f179372d, true);
        yij0.m214964t(this.f179371c, false);
        yij0.m214964t(this.f179370b, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m196768s(View view) {
        if (!yij0.m214965u(this.f179371c)) {
            new xh0.C21150a(this.f179373e).m208731j("目前我们尚未完全适配深色模式，切换后可能会观感不佳，我们建议您保持普通模式").m208728g(true).m208727f("仍要切换").m208724c(new ViewOnClickListenerC20567b()).m208739r("暂不切换").m208736o(new ViewOnClickListenerC20566a()).m208722a().m208721g();
        } else {
            UIModeHelper.m20823g(UIModeHelper.UIMode.DAY);
            this.f179373e.m66873d2();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m196769j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m196769j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w2c.m201091b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(o2c o2cVar) {
        this.f179374f = o2cVar;
    }

    /* JADX INFO: renamed from: r */
    public void m196771r() {
        this.f179369a.setTitle("深色模式");
        this.f179369a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.p2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146831a.m196763l(view);
            }
        });
        VButton vButton = (VButton) this.f179373e.inflater().inflate(f6c0.f95770f2, (ViewGroup) this.f179369a, false);
        this.f179369a.m223589z(vButton);
        this.f179370b.f35857d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.q2c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f152216a.m196764m(compoundButton, z);
            }
        });
        yij0.m214964t(this.f179370b, UIModeHelper.m20817a() == UIModeHelper.UIMode.FOLLOW_SYSTEM);
        yij0.m214964t(this.f179371c, UIModeHelper.m20817a() == UIModeHelper.UIMode.DAY);
        yij0.m214964t(this.f179372d, UIModeHelper.m20817a() == UIModeHelper.UIMode.NIGHT);
        this.f179370b.setOnClickListener(new View.OnClickListener() { // from class: l.r2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157396a.m196765n(view);
            }
        });
        this.f179371c.setOnClickListener(new View.OnClickListener() { // from class: l.s2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161971a.m196766p(view);
            }
        });
        this.f179372d.setOnClickListener(new View.OnClickListener() { // from class: l.t2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167457a.m196767q(view);
            }
        });
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.u2c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173099a.m196768s(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
