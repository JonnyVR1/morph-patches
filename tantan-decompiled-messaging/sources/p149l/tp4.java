package p149l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.verification.CertPrivilege;
import com.p046p1.mobile.putong.core.p053ui.verification.CertPrivilegeItemView;
import com.tantan.library.svga.SVGAnimationView;
import java.util.List;
import p147v.VLinear;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes9.dex */
public class tp4 extends m17 {

    /* JADX INFO: renamed from: g */
    public VLinear f171432g;

    /* JADX INFO: renamed from: h */
    public View f171433h;

    /* JADX INFO: renamed from: i */
    public VPager f171434i;

    /* JADX INFO: renamed from: j */
    public VPagerCircleIndicator f171435j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f171436k;

    /* JADX INFO: renamed from: l */
    public final Act f171437l;

    /* JADX INFO: renamed from: m */
    public final int f171438m;

    /* JADX INFO: renamed from: n */
    public final List<CertPrivilege> f171439n;

    /* JADX INFO: renamed from: l.tp4$b */
    public static class C20234b extends eb2 {

        /* JADX INFO: renamed from: e */
        public final List<CertPrivilege> f171441e;

        public C20234b(List<CertPrivilege> list) {
            this.f171441e = list;
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f171441e.size();
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: m */
        public void mo43284m(Object obj) {
            super.mo43284m(obj);
            if (obj instanceof CertPrivilegeItemView) {
                ((CertPrivilegeItemView) obj).m55983R();
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            View childAt = ((FrameLayout) view.findViewById(u4c0.f173939N1)).getChildAt(0);
            if (childAt instanceof SVGAnimationView) {
                ((SVGAnimationView) childAt).stopAnimation(true);
            }
            viewGroup.removeView(view);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            CertPrivilegeItemView certPrivilegeItemView = (CertPrivilegeItemView) o7r.m163037a(viewGroup.getContext()).inflate(f6c0.f95718c1, viewGroup, false);
            certPrivilegeItemView.m55982Q(this.f171441e.get(i));
            viewGroup.addView(certPrivilegeItemView);
            return certPrivilegeItemView;
        }
    }

    public tp4(Act act, int i, List<CertPrivilege> list) {
        super(act);
        this.f171437l = act;
        this.f171438m = i;
        this.f171439n = list;
    }

    /* JADX INFO: renamed from: L */
    private void m189960L() {
        this.f171436k.setBackgroundResource(x2c0.f189858Wg);
    }

    /* JADX INFO: renamed from: M */
    private void m189961M() {
        setContentView(m189963K(LayoutInflater.from(this.f171437l), null));
        this.f171434i.setAdapter(new C20234b(this.f171439n));
        this.f171435j.setViewPager(this.f171434i);
        this.f171434i.setCurrentItem(this.f171438m);
        this.f171434i.m4185d(new C20233a());
        this.f171435j.setCurrentItem(this.f171438m);
        xdl0.m208329E0(this.f171436k, new View.OnClickListener() { // from class: l.sp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165748a.m189962N(view);
            }
        });
        zvf0.m220368A("e_privilege_detail", mo121174F(), vwb.m200311Y("privilege_name", this.f171439n.get(this.f171438m).getTrackName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m189962N(View view) {
        dismiss();
        qp4.m175809o(this.f171437l);
        zvf0.m220399u("e_verification_avatar", mo121174F(), vwb.m200311Y("privilege_name", this.f171439n.get(this.f171434i.getCurrentItem()).getTrackName()));
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: C */
    public boolean mo121173C() {
        return true;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: F */
    public String mo121174F() {
        return "p_privilege_pop";
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: G */
    public View mo121175G() {
        return this.f171432g;
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: H */
    public boolean mo121176H() {
        return true;
    }

    /* JADX INFO: renamed from: K */
    public View m189963K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return up4.m194604b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.m17, com.google.android.material.bottomsheet.BottomSheetDialog, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m152580A().m109040p(j760.m140076a("privilege_name", this.f171439n.get(this.f171438m).getTrackName()));
        super.onCreate(bundle);
        m189961M();
        if (upa.m194847z()) {
            m189960L();
        }
    }

    @Override // p149l.m17
    /* JADX INFO: renamed from: z */
    public boolean mo121181z() {
        return true;
    }

    /* JADX INFO: renamed from: l.tp4$a */
    public class C20233a implements ViewPager.InterfaceC0716j {
        public C20233a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            zvf0.m220368A("e_privilege_detail", tp4.this.mo121174F(), vwb.m200311Y("privilege_name", ((CertPrivilege) tp4.this.f171439n.get(i)).getTrackName()));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
