package p007l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.AttitudeConfigs;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant.C2128b;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.l5j0;
import l.mkd0;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class c41 implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public y31 f6523a;

    /* JADX INFO: renamed from: b */
    public C2128b f6524b;

    /* JADX INFO: renamed from: c */
    public int f6525c = 0;

    public c41(y31 y31Var) {
        this.f6523a = y31Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9094a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public final void m9097d(List<AttitudeConfigs> list) {
        y31 y31Var = this.f6523a;
        this.f6524b = new C2128b(y31Var.f15211f, list, y31Var.f15213h, y31Var);
        this.f6523a.f15218m.addOnTabSelectedListener(this);
        this.f6523a.f15219n.setAdapter(this.f6524b);
        y31 y31Var2 = this.f6523a;
        y31Var2.f15218m.setupWithViewPager(y31Var2.f15219n);
        for (int i = 0; i < this.f6523a.f15218m.getTabCount(); i++) {
            if (NullChecker.b(this.f6523a.f15218m.getTabAt(i))) {
                this.f6523a.f15218m.getTabAt(i).setCustomView(this.f6524b.m5045l(i));
            }
        }
        int i2 = 0;
        while (i2 < list.size()) {
            if (list.get(i2).f676id == this.f6523a.f15213h.attitudeId) {
                this.f6523a.f15219n.d(new C2349a());
                this.f6523a.f15219n.T(i2, false);
            }
            i2++;
        }
        i2 = 0;
        this.f6523a.f15219n.d(new C2349a());
        this.f6523a.f15219n.T(i2, false);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m9098e(Envelope envelope) {
        l5j0 l5j0Var = this.f6523a;
        if (l5j0Var == null || !l5j0Var.isShowing()) {
            return;
        }
        this.f6523a.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m9099f(View view) {
        zvf0.r("e_attitude_cancel", "p_position_user");
        y31 y31Var = this.f6523a;
        Act act = y31Var.f15211f;
        xia xiaVar = FeedModule.f316d;
        Moment moment = y31Var.f15213h;
        act.duringCreated(xiaVar.m16457Fb(moment.owner, ((DbObject) moment).id, false, "p_position_user")).subscribe(mkd0.H(new e30() { // from class: l.a41
            public final void call(Object obj) {
                this.f5570a.m9098e((Envelope) obj);
            }
        }, new e30() { // from class: l.b41
            public final void call(Object obj) {
                c41.m9094a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public void m9100g() {
        m9097d(this.f6523a.f15214i);
        xdl0.E0(this.f6523a.f15220o, new View.OnClickListener() { // from class: l.z31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15565a.m9099f(view);
            }
        });
    }

    public void onTabSelected(TabLayout.Tab tab) {
        this.f6525c = tab.getPosition();
        if (NullChecker.a(this.f6524b)) {
            this.f6524b.m5046m(this.f6525c, true);
        }
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        if (NullChecker.a(this.f6524b)) {
            this.f6524b.m5046m(tab.getPosition(), false);
        }
    }

    /* JADX INFO: renamed from: l.c41$a */
    public class C2349a implements ViewPager.j {
        public C2349a() {
        }

        public void onPageSelected(int i) {
            c41 c41Var = c41.this;
            c41Var.f6523a.f15221p.setRealNestedScrollView(c41Var.f6524b.m5044k(i));
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }
}
