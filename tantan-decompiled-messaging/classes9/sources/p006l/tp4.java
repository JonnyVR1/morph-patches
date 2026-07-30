package p006l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p004ui.verification.CertPrivilege;
import com.p000p1.mobile.putong.core.p004ui.verification.CertPrivilegeItemView;
import com.p1.mobile.android.app.Act;
import com.tantan.library.svga.SVGAnimationView;
import java.util.List;
import l.eb2;
import l.j760;
import l.m17;
import l.o7r;
import l.up4;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VLinear;
import v.VPager;
import v.VPagerCircleIndicator;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tp4 extends m17 {

    /* JADX INFO: renamed from: g */
    public VLinear f22213g;

    /* JADX INFO: renamed from: h */
    public View f22214h;

    /* JADX INFO: renamed from: i */
    public VPager f22215i;

    /* JADX INFO: renamed from: j */
    public VPagerCircleIndicator f22216j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f22217k;

    /* JADX INFO: renamed from: l */
    public final Act f22218l;

    /* JADX INFO: renamed from: m */
    public final int f22219m;

    /* JADX INFO: renamed from: n */
    public final List<CertPrivilege> f22220n;

    /* JADX INFO: renamed from: l.tp4$b */
    public static class C1319b extends eb2 {

        /* JADX INFO: renamed from: e */
        public final List<CertPrivilege> f22222e;

        public C1319b(List<CertPrivilege> list) {
            this.f22222e = list;
        }

        public int getCount() {
            return this.f22222e.size();
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: m */
        public void m24766m(Object obj) {
            super.m(obj);
            if (obj instanceof CertPrivilegeItemView) {
                ((CertPrivilegeItemView) obj).m9401R();
            }
        }

        /* JADX INFO: renamed from: o */
        public void m24767o(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            SVGAnimationView childAt = ((FrameLayout) view.findViewById(u4c0.f22687N1)).getChildAt(0);
            if (childAt instanceof SVGAnimationView) {
                childAt.stopAnimation(true);
            }
            viewGroup.removeView(view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.core.ui.verification.CertPrivilegeItemView, java.lang.Object] */
        /* JADX INFO: renamed from: p */
        public Object m24768p(ViewGroup viewGroup, int i) {
            ?? r0 = (CertPrivilegeItemView) o7r.a(viewGroup.getContext()).inflate(f6c0.f12132c1, viewGroup, false);
            r0.m9400Q(this.f22222e.get(i));
            viewGroup.addView(r0);
            return r0;
        }
    }

    public tp4(Act act, int i, List<CertPrivilege> list) {
        super(act);
        this.f22218l = act;
        this.f22219m = i;
        this.f22220n = list;
    }

    /* JADX INFO: renamed from: L */
    private void m24757L() {
        this.f22217k.setBackgroundResource(x2c0.f26394Wg);
    }

    /* JADX INFO: renamed from: M */
    private void m24758M() {
        setContentView(m24764K(LayoutInflater.from(this.f22218l), null));
        this.f22215i.setAdapter(new C1319b(this.f22220n));
        this.f22216j.setViewPager(this.f22215i);
        this.f22215i.setCurrentItem(this.f22219m);
        this.f22215i.d(new C1318a());
        this.f22216j.setCurrentItem(this.f22219m);
        xdl0.E0(this.f22217k, new View.OnClickListener() { // from class: l.sp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21556a.m24759N(view);
            }
        });
        zvf0.A("e_privilege_detail", m24761F(), new j760[]{vwb.Y("privilege_name", this.f22220n.get(this.f22219m).getTrackName())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m24759N(View view) {
        dismiss();
        qp4.m22312o(this.f22218l);
        zvf0.u("e_verification_avatar", m24761F(), new j760[]{vwb.Y("privilege_name", this.f22220n.get(this.f22215i.getCurrentItem()).getTrackName())});
    }

    /* JADX INFO: renamed from: C */
    public boolean m24760C() {
        return true;
    }

    /* JADX INFO: renamed from: F */
    public String m24761F() {
        return "p_privilege_pop";
    }

    /* JADX INFO: renamed from: G */
    public View m24762G() {
        return this.f22213g;
    }

    /* JADX INFO: renamed from: H */
    public boolean m24763H() {
        return true;
    }

    /* JADX INFO: renamed from: K */
    public View m24764K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return up4.b(this, layoutInflater, viewGroup);
    }

    public void onCreate(Bundle bundle) {
        A().p(new j760[]{j760.a("privilege_name", this.f22220n.get(this.f22219m).getTrackName())});
        super.onCreate(bundle);
        m24758M();
        if (upa.m25545z()) {
            m24757L();
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m24765z() {
        return true;
    }

    /* JADX INFO: renamed from: l.tp4$a */
    public class C1318a implements ViewPager.j {
        public C1318a() {
        }

        public void onPageSelected(int i) {
            zvf0.A("e_privilege_detail", tp4.this.m24761F(), new j760[]{vwb.Y("privilege_name", ((CertPrivilege) tp4.this.f22220n.get(i)).getTrackName())});
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
