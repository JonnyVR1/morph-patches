package com.p051p1.mobile.putong.core.p058ui.settings.filter.newui;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VLinear;
import p151v.VListCell;
import p153l.bnl0;
import p153l.jk40;
import p153l.mf40;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9049a extends mf40 {

    /* JADX INFO: renamed from: n */
    public NewUiHiddenNearByView f37103n;

    /* JADX INFO: renamed from: o */
    public View f37104o;

    /* JADX INFO: renamed from: p */
    public VListCell f37105p;

    /* JADX INFO: renamed from: q */
    public VListCell f37106q;

    /* JADX INFO: renamed from: r */
    public VListCell f37107r;

    /* JADX INFO: renamed from: s */
    public VListCell f37108s;

    /* JADX INFO: renamed from: t */
    public VLinear f37109t;

    /* JADX INFO: renamed from: u */
    public VListCell f37110u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.a$a */
    public class a implements HiddenNearByView.InterfaceC9020g {
        public a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView.InterfaceC9020g
        /* JADX INFO: renamed from: a */
        public void mo56573a(int i) {
            C9049a.this.f136604m.getSettingGroup().search.radius = Integer.valueOf(C9049a.this.f136604m.getRadiusAllowedMinimum().intValue() + Math.min(C9049a.this.f136604m.getRadiusAllowedMaximum().intValue() - C9049a.this.f136604m.getRadiusAllowedMinimum().intValue(), Math.max(0, i * 1000)));
        }
    }

    public C9049a(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m56739I(View view) {
        jk40.m145152a(this, view);
    }

    @Override // p153l.mf40
    /* JADX INFO: renamed from: e */
    public void mo56740e(View view) {
        this.f136600i = view;
        m56739I(view);
        this.f136592a = this.f37103n;
        this.f136593b = this.f37105p;
        this.f136594c = this.f37106q;
        this.f136595d = this.f37107r;
        this.f136596e = this.f37108s;
        this.f136598g = this.f37109t;
        this.f136597f = this.f37110u;
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            bnl0.m105524M(this.f37103n, true);
            bnl0.m105524M(this.f37104o, true);
            this.f37103n.m56570q();
            this.f37103n.setHiddenNearByViewListener(new a());
        }
        mo158126r();
    }
}
