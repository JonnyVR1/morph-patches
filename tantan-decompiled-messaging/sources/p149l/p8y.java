package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VFrame;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class p8y extends LiveMenuDialogHolder<ocy> {

    /* JADX INFO: renamed from: k */
    public VFrame f147646k;

    /* JADX INFO: renamed from: l */
    public HourBoardDialogTopAnimView f147647l;

    /* JADX INFO: renamed from: m */
    public TabLayout f147648m;

    /* JADX INFO: renamed from: n */
    public ImageView f147649n;

    /* JADX INFO: renamed from: o */
    public VPager f147650o;

    /* JADX INFO: renamed from: p */
    public gcy f147651p;

    public p8y(Act act, ocy ocyVar) {
        super(t6c0.f168155Q3, act, ocyVar, j2g0.m139458e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m167835K(View view) {
        ((ocy) this.f47757b).m129316v3(ddv.f85676z, t100.m186890d(497.0f), 4100);
    }

    /* JADX INFO: renamed from: O */
    private void m167836O(List<hcy> list) {
        this.f147651p.m125527q(list);
        if (this.f147651p.getCount() <= 1) {
            this.f147648m.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f147646k.getContext();
    }

    /* JADX INFO: renamed from: H */
    public final void m167837H(View view) {
        q8y.m173580a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final void m167839L() {
        if (this.f147651p != null) {
            return;
        }
        gcy gcyVar = new gcy(null);
        this.f147651p = gcyVar;
        this.f147650o.setAdapter(gcyVar);
        this.f147650o.m4185d(new C19157a());
    }

    /* JADX INFO: renamed from: M */
    public final void m167840M(boolean z) {
        HourBoardDialogTopAnimView hourBoardDialogTopAnimView = this.f147647l;
        if (!z) {
            hourBoardDialogTopAnimView.m74817F0(false);
        } else {
            hourBoardDialogTopAnimView.m74817F0(true);
            this.f147647l.m74821l0(false);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m167841N(int i) {
        m71834E();
        this.f147650o.setCurrentItem(i);
    }

    @Override // p149l.s7m
    public Act act() {
        return ((ocy) this.f47757b).act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo71835l() {
        m167836O(((ocy) this.f47757b).m163638b4());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m167837H(view);
        m71831A(80);
        m71844z(LiveDialogEnum.MEMBER);
        boolean zM195802b7 = ypv.m215672k().m195802b7();
        this.f147650o.setScrollble(zM195802b7);
        this.f147648m.setupWithViewPager(this.f147650o);
        this.f147648m.setTabIndicatorFullWidth(!zM195802b7);
        xdl0.m208325C0(this.f147646k, t100.m186890d(zM195802b7 ? 564.0f : 487.0f));
        this.f147647l.m74820k0();
        m167839L();
        xdl0.m208329E0(this.f147649n, new View.OnClickListener() { // from class: l.o8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f142683a.m167835K(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        if (NullChecker.m81303a(this.f147647l)) {
            this.f147647l.m74819j0();
        }
    }

    /* JADX INFO: renamed from: l.p8y$a */
    public class C19157a implements ViewPager.InterfaceC0716j {
        public C19157a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            ((ocy) p8y.this.f47757b).m163641g4(i);
            xdl0.m208344M(p8y.this.f147649n, i != 0 && uvr.m196087d().m162719u0() && uvr.m196087d().m162715s0() && !ypv.m215672k().m195802b7());
            p8y.this.m167840M(i == 2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ocy ocyVar) {
    }
}
