package p153l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.verification.CertPrivilege;
import com.p051p1.mobile.putong.core.p058ui.verification.CertPrivilegeItemView;
import com.tantan.library.svga.SVGAnimationView;
import java.util.List;
import p151v.VLinear;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes12.dex */
public class sq4 extends q27 {

    /* JADX INFO: renamed from: g */
    public VLinear f170134g;

    /* JADX INFO: renamed from: h */
    public View f170135h;

    /* JADX INFO: renamed from: i */
    public VPager f170136i;

    /* JADX INFO: renamed from: j */
    public VPagerCircleIndicator f170137j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f170138k;

    /* JADX INFO: renamed from: l */
    public final Act f170139l;

    /* JADX INFO: renamed from: m */
    public final int f170140m;

    /* JADX INFO: renamed from: n */
    public final List<CertPrivilege> f170141n;

    /* JADX INFO: renamed from: l.sq4$b */
    public static class C20133b extends lb2 {

        /* JADX INFO: renamed from: e */
        public final List<CertPrivilege> f170143e;

        public C20133b(List<CertPrivilege> list) {
            this.f170143e = list;
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f170143e.size();
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: m */
        public void mo44299m(Object obj) {
            super.mo44299m(obj);
            if (obj instanceof CertPrivilegeItemView) {
                ((CertPrivilegeItemView) obj).m57166R();
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            View childAt = ((FrameLayout) view.findViewById(adc0.f70027N1)).getChildAt(0);
            if (childAt instanceof SVGAnimationView) {
                ((SVGAnimationView) childAt).stopAnimation(true);
            }
            viewGroup.removeView(view);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            CertPrivilegeItemView certPrivilegeItemView = (CertPrivilegeItemView) p9r.m171370a(viewGroup.getContext()).inflate(kec0.f125772c1, viewGroup, false);
            certPrivilegeItemView.m57165Q(this.f170143e.get(i));
            viewGroup.addView(certPrivilegeItemView);
            return certPrivilegeItemView;
        }
    }

    public sq4(Act act, int i, List<CertPrivilege> list) {
        super(act);
        this.f170139l = act;
        this.f170140m = i;
        this.f170141n = list;
    }

    /* JADX INFO: renamed from: L */
    private void m187508L() {
        this.f170138k.setBackgroundResource(dbc0.f86314Kh);
    }

    /* JADX INFO: renamed from: M */
    private void m187509M() {
        setContentView(m187511K(LayoutInflater.from(this.f170139l), null));
        this.f170136i.setAdapter(new C20133b(this.f170141n));
        this.f170137j.setViewPager(this.f170136i);
        this.f170136i.setCurrentItem(this.f170140m);
        this.f170136i.m4187d(new C20132a());
        this.f170137j.setCurrentItem(this.f170140m);
        bnl0.m105509E0(this.f170138k, new View.OnClickListener() { // from class: l.rq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164429a.m187510N(view);
            }
        });
        i4g0.m138492A("e_privilege_detail", mo125592F(), jyb.m147494Y("privilege_name", this.f170141n.get(this.f170140m).getTrackName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m187510N(View view) {
        dismiss();
        pq4.m173307o(this.f170139l);
        i4g0.m138523u("e_verification_avatar", mo125592F(), jyb.m147494Y("privilege_name", this.f170141n.get(this.f170136i.getCurrentItem()).getTrackName()));
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: C */
    public boolean mo125591C() {
        return true;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: F */
    public String mo125592F() {
        return "p_privilege_pop";
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: G */
    public View mo125593G() {
        return this.f170134g;
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: H */
    public boolean mo125594H() {
        return true;
    }

    /* JADX INFO: renamed from: K */
    public View m187511K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tq4.m192233b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.q27, com.google.android.material.bottomsheet.BottomSheetDialog, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m175015A().m152781p(pf60.m172085a("privilege_name", this.f170141n.get(this.f170140m).getTrackName()));
        super.onCreate(bundle);
        m187509M();
        if (gra.m131778z()) {
            m187508L();
        }
    }

    @Override // p153l.q27
    /* JADX INFO: renamed from: z */
    public boolean mo125599z() {
        return true;
    }

    /* JADX INFO: renamed from: l.sq4$a */
    public class C20132a implements ViewPager.InterfaceC0718j {
        public C20132a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            i4g0.m138492A("e_privilege_detail", sq4.this.mo125592F(), jyb.m147494Y("privilege_name", ((CertPrivilege) sq4.this.f170141n.get(i)).getTrackName()));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
