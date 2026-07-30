package com.p000p1.mobile.putong.core.p004ui.settings.filter.newui;

import android.view.View;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import l.vb40;
import l.xdl0;
import p006l.y640;
import v.VLinear;
import v.VListCell;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0322a extends y640 {

    /* JADX INFO: renamed from: n */
    public NewUiHiddenNearByView f6036n;

    /* JADX INFO: renamed from: o */
    public View f6037o;

    /* JADX INFO: renamed from: p */
    public VListCell f6038p;

    /* JADX INFO: renamed from: q */
    public VListCell f6039q;

    /* JADX INFO: renamed from: r */
    public VListCell f6040r;

    /* JADX INFO: renamed from: s */
    public VListCell f6041s;

    /* JADX INFO: renamed from: t */
    public VLinear f6042t;

    /* JADX INFO: renamed from: u */
    public VListCell f6043u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.a$a */
    public class a implements HiddenNearByView.InterfaceC0293g {
        public a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView.InterfaceC0293g
        /* JADX INFO: renamed from: a */
        public void mo8763a(int i) {
            C0322a.this.f28055m.getSettingGroup().search.radius = Integer.valueOf(C0322a.this.f28055m.getRadiusAllowedMinimum().intValue() + Math.min(C0322a.this.f28055m.getRadiusAllowedMaximum().intValue() - C0322a.this.f28055m.getRadiusAllowedMinimum().intValue(), Math.max(0, i * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)));
        }
    }

    public C0322a(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m8949I(View view) {
        vb40.a(this, view);
    }

    @Override // p006l.y640
    /* JADX INFO: renamed from: e */
    public void mo8950e(View view) {
        this.f28051i = view;
        m8949I(view);
        this.f28043a = this.f6036n;
        this.f28044b = this.f6038p;
        this.f28045c = this.f6039q;
        this.f28046d = this.f6040r;
        this.f28047e = this.f6041s;
        this.f28049g = this.f6042t;
        this.f28048f = this.f6043u;
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            xdl0.M(this.f6036n, true);
            xdl0.M(this.f6037o, true);
            this.f6036n.m8760q();
            this.f6036n.setHiddenNearByViewListener(new a());
        }
        mo16746r();
    }
}
