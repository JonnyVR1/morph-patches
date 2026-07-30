package p153l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.FakeGoodLifeUserInfo;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.act.FakeUploadPhotoAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VPagerCircleIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class uyf extends lyf {

    /* JADX INFO: renamed from: c */
    public VImage f181572c;

    /* JADX INFO: renamed from: d */
    public VImage f181573d;

    /* JADX INFO: renamed from: e */
    public TextView f181574e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f181575f;

    /* JADX INFO: renamed from: g */
    public TextView f181576g;

    /* JADX INFO: renamed from: h */
    public ViewPager f181577h;

    /* JADX INFO: renamed from: i */
    public VPagerCircleIndicator f181578i;

    /* JADX INFO: renamed from: j */
    public VText f181579j;

    /* JADX INFO: renamed from: k */
    public NestedScrollView f181580k;

    /* JADX INFO: renamed from: l */
    public final int f181581l;

    /* JADX INFO: renamed from: m */
    public int f181582m;

    /* JADX INFO: renamed from: n */
    public Runnable f181583n;

    /* JADX INFO: renamed from: o */
    public long f181584o;

    /* JADX INFO: renamed from: p */
    public boolean f181585p;

    /* JADX INFO: renamed from: q */
    public boolean f181586q;

    /* JADX INFO: renamed from: r */
    public jyf f181587r;

    /* JADX INFO: renamed from: s */
    public String f181588s;

    /* JADX INFO: renamed from: t */
    public final ViewPager.InterfaceC0718j f181589t;

    public uyf(@NonNull Act act) {
        super(act);
        this.f181581l = 3000;
        this.f181582m = 0;
        this.f181584o = 0L;
        this.f181585p = false;
        this.f181586q = false;
        this.f181589t = new C20699b();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m198609A() {
        ViewPager viewPager = this.f181577h;
        if (viewPager != null) {
            this.f181582m++;
            viewPager.m4178T(m198616s(), true);
            m198614F();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m198610B() {
        this.f181587r = new jyf().m147542c();
        m198615r();
        m198619v();
        m198621x();
        m198620w(m198618u(0));
        bnl0.m105509E0(this.f181572c, new View.OnClickListener() { // from class: l.ryf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165429a.m198622y(view);
            }
        });
        bnl0.m105509E0(this.f181579j, new View.OnClickListener() { // from class: l.syf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171235a.m198623z(view);
            }
        });
        m198614F();
    }

    /* JADX INFO: renamed from: C */
    public void m198611C(boolean z, boolean z2, String str) {
        this.f181585p = z;
        this.f181586q = z2;
        this.f181588s = str;
    }

    /* JADX INFO: renamed from: D */
    public final void m198612D(String str, int i) {
        String string = this.f134054a.getResources().getString(R$string.f18292A6, str, Integer.valueOf(i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f134054a.getResources().getColor(c9c0.f80342I));
        String strValueOf = String.valueOf(i);
        int iIndexOf = string.indexOf(strValueOf);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strValueOf.length() + iIndexOf, 33);
        this.f181576g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: E */
    public final void m198613E() {
        Runnable runnable;
        if (this.f181584o != 0 && System.currentTimeMillis() - this.f181584o < 3000 && (runnable = this.f181583n) != null) {
            l51.m152890J(runnable);
            this.f181583n = null;
        }
        this.f181584o = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: F */
    public final void m198614F() {
        if (this.f181583n == null) {
            this.f181583n = new Runnable() { // from class: l.tyf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176671a.m198609A();
                }
            };
        }
        l51.m152888H(getContext(), this.f181583n, 3000L);
    }

    @Override // p153l.lyf
    /* JADX INFO: renamed from: c */
    public int mo156273c() {
        return 80;
    }

    @Override // p153l.lyf
    /* JADX INFO: renamed from: d */
    public float mo156274d() {
        if (vnb.m201959s1()) {
            return 0.8f;
        }
        if (this.f181586q) {
            return super.mo156274d();
        }
        return cxv.m113069a() ? 0.96f : 0.98f;
    }

    @Override // p153l.lyf, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        Runnable runnable = this.f181583n;
        if (runnable != null) {
            l51.m152890J(runnable);
            this.f181583n = null;
        }
    }

    @Override // p153l.lyf
    /* JADX INFO: renamed from: f */
    public void mo156276f() {
        this.f181572c = (VImage) findViewById(adc0.f69806A1);
        this.f181573d = (VImage) findViewById(adc0.f70342fe);
        this.f181574e = (TextView) findViewById(adc0.f70409je);
        this.f181575f = (VDraweeView) findViewById(adc0.f70042O);
        this.f181576g = (TextView) findViewById(adc0.f70474nb);
        this.f181577h = (ViewPager) findViewById(adc0.f70529qf);
        this.f181578i = (VPagerCircleIndicator) findViewById(adc0.f70546rf);
        this.f181579j = (VText) findViewById(adc0.f70211Y0);
        this.f181580k = (NestedScrollView) findViewById(adc0.f70085Q8);
        m156277g();
        m198610B();
    }

    @Override // p153l.lyf
    /* JADX INFO: renamed from: i */
    public int mo156279i() {
        return kec0.f125842g3;
    }

    /* JADX INFO: renamed from: r */
    public final void m198615r() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f181577h.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f181578i.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f181573d.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f181580k.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f181574e.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f181579j.getLayoutParams();
        if (this.f181586q) {
            layoutParams4.bottomMargin = 0;
        }
        if (f5g.m124128f()) {
            layoutParams.height = qa00.m175859d(260.0f);
            layoutParams.topMargin = qa00.f156322i;
            layoutParams2.topMargin = qa00.f156324k;
            int i = qa00.f156290C;
            layoutParams3.topMargin = i;
            layoutParams4.topMargin = qa00.f156328o;
            layoutParams5.topMargin = qa00.f156323j;
            layoutParams6.height = i;
            this.f181574e.setTextSize(1, 22.0f);
        } else if (vnb.m201956p1()) {
            layoutParams.height = qa00.m175859d(250.0f);
            layoutParams.topMargin = qa00.f156321h;
            int i2 = qa00.f156323j;
            layoutParams2.topMargin = i2;
            int i3 = qa00.f156289B;
            layoutParams3.topMargin = i3;
            layoutParams4.topMargin = i2;
            layoutParams5.topMargin = qa00.f156319f;
            layoutParams6.height = i3;
            this.f181574e.setTextSize(1, 20.0f);
        } else if (vnb.m201957q1()) {
            layoutParams.height = qa00.m175859d(240.0f);
            layoutParams.topMargin = qa00.f156320g;
            int i4 = qa00.f156322i;
            layoutParams2.topMargin = i4;
            int i5 = qa00.f156288A;
            layoutParams3.topMargin = i5;
            layoutParams4.topMargin = i4;
            layoutParams5.topMargin = qa00.f156318e;
            layoutParams6.height = i5;
            this.f181574e.setTextSize(1, 18.0f);
        } else {
            layoutParams.height = qa00.m175859d(310.0f);
            layoutParams.topMargin = qa00.f156323j;
            layoutParams2.topMargin = qa00.f156328o;
            layoutParams3.topMargin = qa00.f156292E;
            layoutParams4.topMargin = qa00.f156330q;
            layoutParams5.topMargin = qa00.f156321h;
            this.f181574e.setTextSize(1, 24.0f);
        }
        if (vnb.m201959s1()) {
            layoutParams.height = qa00.m175859d(((rsf0.m182965i(bnl0.m105592y0()) - 80.0f) * 558.0f) / 1190.0f);
        }
        this.f181577h.setLayoutParams(layoutParams);
        this.f181578i.setLayoutParams(layoutParams2);
        this.f181573d.setLayoutParams(layoutParams3);
        this.f181580k.setLayoutParams(layoutParams4);
        this.f181574e.setLayoutParams(layoutParams5);
    }

    /* JADX INFO: renamed from: s */
    public final int m198616s() {
        int i = this.f181582m;
        if (i >= 3 || i <= 0) {
            this.f181582m = 0;
        }
        return this.f181582m;
    }

    @Override // p153l.lyf, android.app.Dialog
    public void show() {
        l4g0 l4g0VarM204399c = w1e.m204399c(m198617t(), uyf.class.getName());
        this.f134055b = l4g0VarM204399c;
        if (this.f181586q) {
            l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE), jyb.m147494Y("upload_photo_tip_show_from", this.f181588s));
        } else {
            l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE));
        }
        if (xra.m212804w()) {
            return;
        }
        super.show();
    }

    /* JADX INFO: renamed from: t */
    public String m198617t() {
        return this.f181586q ? "p_upload_photo_tips" : "p_guide_upload_photo";
    }

    /* JADX INFO: renamed from: u */
    public final FakeGoodLifeUserInfo m198618u(int i) {
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            boolean zIsFemale = CoreModule.f18264c.f20381e0.m116600p9().isFemale();
            jyf jyfVar = this.f181587r;
            return zIsFemale ? jyfVar.f123131a.get(i) : jyfVar.f123133c.get(i);
        }
        boolean zIsFemale2 = CoreModule.f18264c.f20381e0.m116600p9().isFemale();
        jyf jyfVar2 = this.f181587r;
        return zIsFemale2 ? jyfVar2.f123132b.get(i) : jyfVar2.f123134d.get(i);
    }

    /* JADX INFO: renamed from: v */
    public final void m198619v() {
        boolean z = this.f181586q;
        TextView textView = this.f181574e;
        if (z) {
            textView.setText(R$string.f19442lr);
            bnl0.m105524M(this.f181579j, false);
        } else {
            textView.setText(R$string.f18323B6);
        }
        this.f181574e.setTypeface(null, 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m198620w(FakeGoodLifeUserInfo fakeGoodLifeUserInfo) {
        this.f181575f.setBackgroundResource(fakeGoodLifeUserInfo.avatar);
        m198612D(fakeGoodLifeUserInfo.name, fakeGoodLifeUserInfo.likeNum);
    }

    /* JADX INFO: renamed from: x */
    public final void m198621x() {
        this.f181577h.setAdapter(new C20700c());
        VPagerCircleIndicator vPagerCircleIndicator = this.f181578i;
        ViewPager viewPager = this.f181577h;
        vPagerCircleIndicator.m224389c(viewPager, viewPager.getCurrentItem());
        this.f181577h.m4187d(this.f181589t);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m198622y(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m198623z(View view) {
        i4g0.m138520r("e_guide_upload_photo_button", m198617t());
        C7997b c7997bM37423r = C7997b.m37423r();
        Act act = this.f134054a;
        c7997bM37423r.m37429F(act, a0g.m95349E(act), new C20698a());
    }

    /* JADX INFO: renamed from: l.uyf$a */
    public class C20698a implements FakeHoldFragment.InterfaceC7995a {
        public C20698a() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
        /* JADX INFO: renamed from: a */
        public void mo37400a(ArrayList<Media> arrayList, String str) {
            Act act = uyf.this.f134054a;
            act.startActivity(FakeUploadPhotoAct.m47154Z1(act, arrayList));
            uyf.this.dismiss();
        }

        @Override // com.p051p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7995a
        public void onError() {
        }
    }

    /* JADX INFO: renamed from: l.uyf$b */
    public class C20699b implements ViewPager.InterfaceC0718j {
        public C20699b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            uyf.this.m198613E();
            uyf.this.f181582m = i;
            uyf uyfVar = uyf.this;
            uyfVar.m198620w(uyfVar.m198618u(i));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.uyf$c */
    public class C20700c extends lb2 {
        public C20700c() {
        }

        @Override // p153l.cf60
        public int getCount() {
            return 3;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            VDraweeView vDraweeView = new VDraweeView(viewGroup.getContext());
            vDraweeView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            FakeGoodLifeUserInfo fakeGoodLifeUserInfoM198618u = uyf.this.m198618u(i);
            if (rsf0.m182965i(bnl0.m105592y0()) >= 600.0f) {
                uqb0.f180374G.m127115L0(vDraweeView, fakeGoodLifeUserInfoM198618u.picBig);
            } else {
                vDraweeView.setImageResource(fakeGoodLifeUserInfoM198618u.picSmall);
            }
            viewGroup.addView(vDraweeView, new ViewGroup.LayoutParams(-1, -1));
            return vDraweeView;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        }
    }
}
