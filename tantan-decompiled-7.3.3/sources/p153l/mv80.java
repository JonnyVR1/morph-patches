package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView;
import p151v.VListCell;

/* JADX INFO: loaded from: classes12.dex */
public class mv80 extends mf40 {

    /* JADX INFO: renamed from: n */
    public HiddenNearByView f138878n;

    /* JADX INFO: renamed from: o */
    public VListCell f138879o;

    /* JADX INFO: renamed from: p */
    public VListCell f138880p;

    /* JADX INFO: renamed from: q */
    public VListCell f138881q;

    /* JADX INFO: renamed from: r */
    public VListCell f138882r;

    /* JADX INFO: renamed from: s */
    public VListCell f138883s;

    /* JADX INFO: renamed from: l.mv80$a */
    public class C18716a implements HiddenNearByView.InterfaceC9020g {
        public C18716a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView.InterfaceC9020g
        /* JADX INFO: renamed from: a */
        public void mo56573a(int i) {
            mv80.this.f136604m.getSettingGroup().search.radius = Integer.valueOf(mv80.this.f136604m.getRadiusAllowedMinimum().intValue() + Math.min(mv80.this.f136604m.getRadiusAllowedMaximum().intValue() - mv80.this.f136604m.getRadiusAllowedMinimum().intValue(), Math.max(0, i * 1000)));
        }
    }

    public mv80(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m160254I(View view) {
        nv80.m164863a(this, view);
    }

    @Override // p153l.mf40
    /* JADX INFO: renamed from: r */
    public void mo158126r() {
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            bnl0.m105524M(this.f138878n, true);
            this.f138878n.m56570q();
            this.f138878n.setHiddenNearByViewListener(new C18716a());
        }
        super.mo158126r();
    }

    @Override // p153l.mf40
    /* JADX INFO: renamed from: v */
    public void mo158129v(View view) {
        this.f136600i = view;
        m160254I(view);
        this.f136592a = this.f138878n;
        this.f136593b = this.f138882r;
        this.f136594c = this.f138880p;
        this.f136595d = this.f138879o;
        this.f136596e = this.f138881q;
        this.f136597f = this.f138883s;
        mo158126r();
    }
}
