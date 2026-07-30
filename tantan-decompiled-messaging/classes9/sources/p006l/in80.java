package p006l;

import android.view.View;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView;
import com.p1.mobile.android.app.Act;
import l.jn80;
import l.xdl0;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class in80 extends y640 {

    /* JADX INFO: renamed from: n */
    public HiddenNearByView f14572n;

    /* JADX INFO: renamed from: o */
    public VListCell f14573o;

    /* JADX INFO: renamed from: p */
    public VListCell f14574p;

    /* JADX INFO: renamed from: q */
    public VListCell f14575q;

    /* JADX INFO: renamed from: r */
    public VListCell f14576r;

    /* JADX INFO: renamed from: s */
    public VListCell f14577s;

    /* JADX INFO: renamed from: l.in80$a */
    public class C0847a implements HiddenNearByView.InterfaceC0293g {
        public C0847a() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView.InterfaceC0293g
        /* JADX INFO: renamed from: a */
        public void mo8763a(int i) {
            in80.this.f28055m.getSettingGroup().search.radius = Integer.valueOf(in80.this.f28055m.getRadiusAllowedMinimum().intValue() + Math.min(in80.this.f28055m.getRadiusAllowedMaximum().intValue() - in80.this.f28055m.getRadiusAllowedMinimum().intValue(), Math.max(0, i * AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)));
        }
    }

    public in80(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m16745I(View view) {
        jn80.a(this, view);
    }

    @Override // p006l.y640
    /* JADX INFO: renamed from: r */
    public void mo16746r() {
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            xdl0.M(this.f14572n, true);
            this.f14572n.m8760q();
            this.f14572n.setHiddenNearByViewListener(new C0847a());
        }
        super.mo16746r();
    }

    @Override // p006l.y640
    /* JADX INFO: renamed from: v */
    public void mo16747v(View view) {
        this.f28051i = view;
        m16745I(view);
        this.f28043a = this.f14572n;
        this.f28044b = this.f14576r;
        this.f28045c = this.f14574p;
        this.f28046d = this.f14573o;
        this.f28047e = this.f14575q;
        this.f28048f = this.f14577s;
        mo16746r();
    }
}
