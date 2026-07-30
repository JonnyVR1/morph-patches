package p153l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant.C11447b;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class j41 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public f41 f118231a;

    /* JADX INFO: renamed from: b */
    public C11447b f118232b;

    /* JADX INFO: renamed from: c */
    public int f118233c = 0;

    public j41(f41 f41Var) {
        this.f118231a = f41Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m143379a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m143382d(List<AttitudeConfigs> list) {
        f41 f41Var = this.f118231a;
        this.f118232b = new C11447b(f41Var.f97030f, list, f41Var.f97032h, f41Var);
        this.f118231a.f97037m.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        this.f118231a.f97038n.setAdapter(this.f118232b);
        f41 f41Var2 = this.f118231a;
        f41Var2.f97037m.setupWithViewPager(f41Var2.f97038n);
        for (int i = 0; i < this.f118231a.f97037m.getTabCount(); i++) {
            if (NullChecker.m82487b(this.f118231a.f97037m.getTabAt(i))) {
                this.f118231a.f97037m.getTabAt(i).setCustomView(this.f118232b.m65185l(i));
            }
        }
        int i2 = 0;
        while (i2 < list.size()) {
            if (list.get(i2).f40063id == this.f118231a.f97032h.attitudeId) {
                this.f118231a.f97038n.m4187d(new C17868a());
                this.f118231a.f97038n.m4178T(i2, false);
            }
            i2++;
        }
        i2 = 0;
        this.f118231a.f97038n.m4187d(new C17868a());
        this.f118231a.f97038n.m4178T(i2, false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m143383e(Envelope envelope) {
        f41 f41Var = this.f118231a;
        if (f41Var == null || !f41Var.isShowing()) {
            return;
        }
        this.f118231a.m176562T();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m143384f(View view) {
        i4g0.m138520r("e_attitude_cancel", "p_position_user");
        f41 f41Var = this.f118231a;
        Act act = f41Var.f97030f;
        jka jkaVar = FeedModule.f39703d;
        Moment moment = f41Var.f97032h;
        act.duringCreated(jkaVar.m145517Fb(moment.owner, moment.f56859id, false, "p_position_user")).subscribe(psd0.m173597H(new y20() { // from class: l.h41
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107720a.m143383e((Envelope) obj);
            }
        }, new y20() { // from class: l.i41
            @Override // p153l.y20
            public final void call(Object obj) {
                j41.m143379a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public void m143385g() {
        m143382d(this.f118231a.f97033i);
        bnl0.m105509E0(this.f118231a.f97039o, new View.OnClickListener() { // from class: l.g41
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102053a.m143384f(view);
            }
        });
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        this.f118233c = tab.getPosition();
        if (NullChecker.m82486a(this.f118232b)) {
            this.f118232b.m65186m(this.f118233c, true);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.m82486a(this.f118232b)) {
            this.f118232b.m65186m(tab.getPosition(), false);
        }
    }

    /* JADX INFO: renamed from: l.j41$a */
    public class C17868a implements ViewPager.InterfaceC0718j {
        public C17868a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            j41 j41Var = j41.this;
            j41Var.f118231a.f97040p.setRealNestedScrollView(j41Var.f118232b.m65184k(i));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }
}
