package com.p046p1.mobile.putong.core.p053ui.settings.filter.newui;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VLinear;
import p147v.VListCell;
import p149l.vb40;
import p149l.xdl0;
import p149l.y640;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8886a extends y640 {

    /* JADX INFO: renamed from: n */
    public NewUiHiddenNearByView f36255n;

    /* JADX INFO: renamed from: o */
    public View f36256o;

    /* JADX INFO: renamed from: p */
    public VListCell f36257p;

    /* JADX INFO: renamed from: q */
    public VListCell f36258q;

    /* JADX INFO: renamed from: r */
    public VListCell f36259r;

    /* JADX INFO: renamed from: s */
    public VListCell f36260s;

    /* JADX INFO: renamed from: t */
    public VLinear f36261t;

    /* JADX INFO: renamed from: u */
    public VListCell f36262u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.filter.newui.a$a */
    public class a implements HiddenNearByView.InterfaceC8857g {
        public a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView.InterfaceC8857g
        /* JADX INFO: renamed from: a */
        public void mo55390a(int i) {
            C8886a.this.f196521m.getSettingGroup().search.radius = Integer.valueOf(C8886a.this.f196521m.getRadiusAllowedMinimum().intValue() + Math.min(C8886a.this.f196521m.getRadiusAllowedMaximum().intValue() - C8886a.this.f196521m.getRadiusAllowedMinimum().intValue(), Math.max(0, i * 1000)));
        }
    }

    public C8886a(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m55556I(View view) {
        vb40.m197682a(this, view);
    }

    @Override // p149l.y640
    /* JADX INFO: renamed from: e */
    public void mo55557e(View view) {
        this.f196517i = view;
        m55556I(view);
        this.f196509a = this.f36255n;
        this.f196510b = this.f36257p;
        this.f196511c = this.f36258q;
        this.f196512d = this.f36259r;
        this.f196513e = this.f36260s;
        this.f196515g = this.f36261t;
        this.f196514f = this.f36262u;
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            xdl0.m208344M(this.f36255n, true);
            xdl0.m208344M(this.f36256o, true);
            this.f36255n.m55387q();
            this.f36255n.setHiddenNearByViewListener(new a());
        }
        mo137126r();
    }
}
