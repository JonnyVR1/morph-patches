package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView;
import p147v.VListCell;

/* JADX INFO: loaded from: classes9.dex */
public class in80 extends y640 {

    /* JADX INFO: renamed from: n */
    public HiddenNearByView f113999n;

    /* JADX INFO: renamed from: o */
    public VListCell f114000o;

    /* JADX INFO: renamed from: p */
    public VListCell f114001p;

    /* JADX INFO: renamed from: q */
    public VListCell f114002q;

    /* JADX INFO: renamed from: r */
    public VListCell f114003r;

    /* JADX INFO: renamed from: s */
    public VListCell f114004s;

    /* JADX INFO: renamed from: l.in80$a */
    public class C17578a implements HiddenNearByView.InterfaceC8857g {
        public C17578a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView.InterfaceC8857g
        /* JADX INFO: renamed from: a */
        public void mo55390a(int i) {
            in80.this.f196521m.getSettingGroup().search.radius = Integer.valueOf(in80.this.f196521m.getRadiusAllowedMinimum().intValue() + Math.min(in80.this.f196521m.getRadiusAllowedMaximum().intValue() - in80.this.f196521m.getRadiusAllowedMinimum().intValue(), Math.max(0, i * 1000)));
        }
    }

    public in80(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m137125I(View view) {
        jn80.m142370a(this, view);
    }

    @Override // p149l.y640
    /* JADX INFO: renamed from: r */
    public void mo137126r() {
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            xdl0.m208344M(this.f113999n, true);
            this.f113999n.m55387q();
            this.f113999n.setHiddenNearByViewListener(new C17578a());
        }
        super.mo137126r();
    }

    @Override // p149l.y640
    /* JADX INFO: renamed from: v */
    public void mo137127v(View view) {
        this.f196517i = view;
        m137125I(view);
        this.f196509a = this.f113999n;
        this.f196510b = this.f114003r;
        this.f196511c = this.f114001p;
        this.f196512d = this.f114000o;
        this.f196513e = this.f114002q;
        this.f196514f = this.f114004s;
        mo137126r();
    }
}
