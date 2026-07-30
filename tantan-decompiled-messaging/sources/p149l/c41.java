package p149l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant.C11284b;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class c41 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public y31 f79145a;

    /* JADX INFO: renamed from: b */
    public C11284b f79146b;

    /* JADX INFO: renamed from: c */
    public int f79147c = 0;

    public c41(y31 y31Var) {
        this.f79145a = y31Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m105192a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m105195d(List<AttitudeConfigs> list) {
        y31 y31Var = this.f79145a;
        this.f79146b = new C11284b(y31Var.f195727f, list, y31Var.f195729h, y31Var);
        this.f79145a.f195734m.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        this.f79145a.f195735n.setAdapter(this.f79146b);
        y31 y31Var2 = this.f79145a;
        y31Var2.f195734m.setupWithViewPager(y31Var2.f195735n);
        for (int i = 0; i < this.f79145a.f195734m.getTabCount(); i++) {
            if (NullChecker.m81304b(this.f79145a.f195734m.getTabAt(i))) {
                this.f79145a.f195734m.getTabAt(i).setCustomView(this.f79146b.m64002l(i));
            }
        }
        int i2 = 0;
        while (i2 < list.size()) {
            if (list.get(i2).f39215id == this.f79145a.f195729h.attitudeId) {
                this.f79145a.f195735n.m4185d(new C16064a());
                this.f79145a.f195735n.m4176T(i2, false);
            }
            i2++;
        }
        i2 = 0;
        this.f79145a.f195735n.m4185d(new C16064a());
        this.f79145a.f195735n.m4176T(i2, false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m105196e(Envelope envelope) {
        y31 y31Var = this.f79145a;
        if (y31Var == null || !y31Var.isShowing()) {
            return;
        }
        this.f79145a.m101651T();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m105197f(View view) {
        zvf0.m220396r("e_attitude_cancel", "p_position_user");
        y31 y31Var = this.f79145a;
        Act act = y31Var.f195727f;
        xia xiaVar = FeedModule.f38855d;
        Moment moment = y31Var.f195729h;
        act.duringCreated(xiaVar.m209276Fb(moment.owner, moment.f56011id, false, "p_position_user")).subscribe(mkd0.m154956H(new e30() { // from class: l.a41
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67433a.m105196e((Envelope) obj);
            }
        }, new e30() { // from class: l.b41
            @Override // p149l.e30
            public final void call(Object obj) {
                c41.m105192a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public void m105198g() {
        m105195d(this.f79145a.f195730i);
        xdl0.m208329E0(this.f79145a.f195736o, new View.OnClickListener() { // from class: l.z31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201298a.m105197f(view);
            }
        });
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        this.f79147c = tab.getPosition();
        if (NullChecker.m81303a(this.f79146b)) {
            this.f79146b.m64003m(this.f79147c, true);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.m81303a(this.f79146b)) {
            this.f79146b.m64003m(tab.getPosition(), false);
        }
    }

    /* JADX INFO: renamed from: l.c41$a */
    public class C16064a implements ViewPager.InterfaceC0716j {
        public C16064a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            c41 c41Var = c41.this;
            c41Var.f79145a.f195737p.setRealNestedScrollView(c41Var.f79146b.m64001k(i));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }
}
