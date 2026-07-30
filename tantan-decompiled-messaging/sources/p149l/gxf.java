package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.FakeGoodLifeUserInfo;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.act.FakeUploadPhotoAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VPagerCircleIndicator;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gxf extends xwf {

    /* JADX INFO: renamed from: c */
    public VImage f104875c;

    /* JADX INFO: renamed from: d */
    public VImage f104876d;

    /* JADX INFO: renamed from: e */
    public TextView f104877e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f104878f;

    /* JADX INFO: renamed from: g */
    public TextView f104879g;

    /* JADX INFO: renamed from: h */
    public ViewPager f104880h;

    /* JADX INFO: renamed from: i */
    public VPagerCircleIndicator f104881i;

    /* JADX INFO: renamed from: j */
    public VText f104882j;

    /* JADX INFO: renamed from: k */
    public NestedScrollView f104883k;

    /* JADX INFO: renamed from: l */
    public final int f104884l;

    /* JADX INFO: renamed from: m */
    public int f104885m;

    /* JADX INFO: renamed from: n */
    public Runnable f104886n;

    /* JADX INFO: renamed from: o */
    public long f104887o;

    /* JADX INFO: renamed from: p */
    public boolean f104888p;

    /* JADX INFO: renamed from: q */
    public boolean f104889q;

    /* JADX INFO: renamed from: r */
    public vwf f104890r;

    /* JADX INFO: renamed from: s */
    public String f104891s;

    /* JADX INFO: renamed from: t */
    public final ViewPager.InterfaceC0716j f104892t;

    public gxf(@NonNull Act act) {
        super(act);
        this.f104884l = 3000;
        this.f104885m = 0;
        this.f104887o = 0L;
        this.f104888p = false;
        this.f104889q = false;
        this.f104892t = new C17196b();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m128573A() {
        ViewPager viewPager = this.f104880h;
        if (viewPager != null) {
            this.f104885m++;
            viewPager.m4176T(m128584s(), true);
            m128578F();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m128574B() {
        this.f104890r = new vwf().m200369c();
        m128583r();
        m128587v();
        m128589x();
        m128588w(m128586u(0));
        xdl0.m208329E0(this.f104875c, new View.OnClickListener() { // from class: l.dxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88280a.m128590y(view);
            }
        });
        xdl0.m208329E0(this.f104882j, new View.OnClickListener() { // from class: l.exf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93654a.m128591z(view);
            }
        });
        m128578F();
    }

    /* JADX INFO: renamed from: C */
    public void m128575C(boolean z, boolean z2, String str) {
        this.f104888p = z;
        this.f104889q = z2;
        this.f104891s = str;
    }

    /* JADX INFO: renamed from: D */
    public final void m128576D(String str, int i) {
        String string = this.f194731a.getResources().getString(R$string.f19085y6, str, Integer.valueOf(i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f194731a.getResources().getColor(w0c0.f183773I));
        String strValueOf = String.valueOf(i);
        int iIndexOf = string.indexOf(strValueOf);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strValueOf.length() + iIndexOf, 33);
        this.f104879g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: E */
    public final void m128577E() {
        Runnable runnable;
        if (this.f104887o != 0 && System.currentTimeMillis() - this.f104887o < 3000 && (runnable = this.f104886n) != null) {
            e51.m114745J(runnable);
            this.f104886n = null;
        }
        this.f104887o = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: F */
    public final void m128578F() {
        if (this.f104886n == null) {
            this.f104886n = new Runnable() { // from class: l.fxf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99761a.m128573A();
                }
            };
        }
        e51.m114743H(getContext(), this.f104886n, 3000L);
    }

    @Override // p149l.xwf
    /* JADX INFO: renamed from: c */
    public int mo128579c() {
        return 80;
    }

    @Override // p149l.xwf
    /* JADX INFO: renamed from: d */
    public float mo128580d() {
        if (hmb.m131714s1()) {
            return 0.8f;
        }
        if (this.f104889q) {
            return super.mo128580d();
        }
        return bvv.m104078a() ? 0.96f : 0.98f;
    }

    @Override // p149l.xwf, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        Runnable runnable = this.f104886n;
        if (runnable != null) {
            e51.m114745J(runnable);
            this.f104886n = null;
        }
    }

    @Override // p149l.xwf
    /* JADX INFO: renamed from: f */
    public void mo128581f() {
        this.f104875c = (VImage) findViewById(u4c0.f173718A1);
        this.f104876d = (VImage) findViewById(u4c0.f174200ce);
        this.f104877e = (TextView) findViewById(u4c0.f174268ge);
        this.f104878f = (VDraweeView) findViewById(u4c0.f173954O);
        this.f104879g = (TextView) findViewById(u4c0.f174349lb);
        this.f104880h = (ViewPager) findViewById(u4c0.f174387nf);
        this.f104881i = (VPagerCircleIndicator) findViewById(u4c0.f174404of);
        this.f104882j = (VText) findViewById(u4c0.f174120Y0);
        this.f104883k = (NestedScrollView) findViewById(u4c0.f173963O8);
        m211329g();
        m128574B();
    }

    @Override // p149l.xwf
    /* JADX INFO: renamed from: i */
    public int mo128582i() {
        return f6c0.f95788g3;
    }

    /* JADX INFO: renamed from: r */
    public final void m128583r() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f104880h.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f104881i.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f104876d.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f104883k.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f104877e.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f104882j.getLayoutParams();
        if (this.f104889q) {
            layoutParams4.bottomMargin = 0;
        }
        if (r3g.m177667f()) {
            layoutParams.height = t100.m186890d(260.0f);
            layoutParams.topMargin = t100.f167260i;
            layoutParams2.topMargin = t100.f167262k;
            int i = t100.f167228C;
            layoutParams3.topMargin = i;
            layoutParams4.topMargin = t100.f167266o;
            layoutParams5.topMargin = t100.f167261j;
            layoutParams6.height = i;
            this.f104877e.setTextSize(1, 22.0f);
        } else if (hmb.m131711p1()) {
            layoutParams.height = t100.m186890d(250.0f);
            layoutParams.topMargin = t100.f167259h;
            int i2 = t100.f167261j;
            layoutParams2.topMargin = i2;
            int i3 = t100.f167227B;
            layoutParams3.topMargin = i3;
            layoutParams4.topMargin = i2;
            layoutParams5.topMargin = t100.f167257f;
            layoutParams6.height = i3;
            this.f104877e.setTextSize(1, 20.0f);
        } else if (hmb.m131712q1()) {
            layoutParams.height = t100.m186890d(240.0f);
            layoutParams.topMargin = t100.f167258g;
            int i4 = t100.f167260i;
            layoutParams2.topMargin = i4;
            int i5 = t100.f167226A;
            layoutParams3.topMargin = i5;
            layoutParams4.topMargin = i4;
            layoutParams5.topMargin = t100.f167256e;
            layoutParams6.height = i5;
            this.f104877e.setTextSize(1, 18.0f);
        } else {
            layoutParams.height = t100.m186890d(310.0f);
            layoutParams.topMargin = t100.f167261j;
            layoutParams2.topMargin = t100.f167266o;
            layoutParams3.topMargin = t100.f167230E;
            layoutParams4.topMargin = t100.f167268q;
            layoutParams5.topMargin = t100.f167259h;
            this.f104877e.setTextSize(1, 24.0f);
        }
        if (hmb.m131714s1()) {
            layoutParams.height = t100.m186890d(((ikf0.m136795i(xdl0.m208412y0()) - 80.0f) * 558.0f) / 1190.0f);
        }
        this.f104880h.setLayoutParams(layoutParams);
        this.f104881i.setLayoutParams(layoutParams2);
        this.f104876d.setLayoutParams(layoutParams3);
        this.f104883k.setLayoutParams(layoutParams4);
        this.f104877e.setLayoutParams(layoutParams5);
    }

    /* JADX INFO: renamed from: s */
    public final int m128584s() {
        int i = this.f104885m;
        if (i >= 3 || i <= 0) {
            this.f104885m = 0;
        }
        return this.f104885m;
    }

    @Override // p149l.xwf, android.app.Dialog
    public void show() {
        cwf0 cwf0VarM133794c = i0e.m133794c(m128585t(), gxf.class.getName());
        this.f194732b = cwf0VarM133794c;
        if (this.f104889q) {
            cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE), vwb.m200311Y("upload_photo_tip_show_from", this.f104891s));
        } else {
            cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE));
        }
        if (lqa.m150985w()) {
            return;
        }
        super.show();
    }

    /* JADX INFO: renamed from: t */
    public String m128585t() {
        return this.f104889q ? "p_upload_photo_tips" : "p_guide_upload_photo";
    }

    /* JADX INFO: renamed from: u */
    public final FakeGoodLifeUserInfo m128586u(int i) {
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            boolean zIsFemale = CoreModule.f17545c.f19639e0.m169527p9().isFemale();
            vwf vwfVar = this.f104890r;
            return zIsFemale ? vwfVar.f183331a.get(i) : vwfVar.f183333c.get(i);
        }
        boolean zIsFemale2 = CoreModule.f17545c.f19639e0.m169527p9().isFemale();
        vwf vwfVar2 = this.f104890r;
        return zIsFemale2 ? vwfVar2.f183332b.get(i) : vwfVar2.f183334d.get(i);
    }

    /* JADX INFO: renamed from: v */
    public final void m128587v() {
        boolean z = this.f104889q;
        TextView textView = this.f104877e;
        if (z) {
            textView.setText(R$string.f18073Qq);
            xdl0.m208344M(this.f104882j, false);
        } else {
            textView.setText(R$string.f19115z6);
        }
        this.f104877e.setTypeface(null, 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m128588w(FakeGoodLifeUserInfo fakeGoodLifeUserInfo) {
        this.f104878f.setBackgroundResource(fakeGoodLifeUserInfo.avatar);
        m128576D(fakeGoodLifeUserInfo.name, fakeGoodLifeUserInfo.likeNum);
    }

    /* JADX INFO: renamed from: x */
    public final void m128589x() {
        this.f104880h.setAdapter(new C17197c());
        VPagerCircleIndicator vPagerCircleIndicator = this.f104881i;
        ViewPager viewPager = this.f104880h;
        vPagerCircleIndicator.m223143c(viewPager, viewPager.getCurrentItem());
        this.f104880h.m4185d(this.f104892t);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m128590y(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m128591z(View view) {
        zvf0.m220396r("e_guide_upload_photo_button", m128585t());
        C7846b c7846bM36420r = C7846b.m36420r();
        Act act = this.f194731a;
        c7846bM36420r.m36426F(act, myf.m157025E(act), new C17195a());
    }

    /* JADX INFO: renamed from: l.gxf$a */
    public class C17195a implements FakeHoldFragment.InterfaceC7844a {
        public C17195a() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
        /* JADX INFO: renamed from: a */
        public void mo36397a(ArrayList<Media> arrayList, String str) {
            Act act = gxf.this.f194731a;
            act.startActivity(FakeUploadPhotoAct.m45971Y1(act, arrayList));
            gxf.this.dismiss();
        }

        @Override // com.p046p1.mobile.putong.core.newui.fake.FakeHoldFragment.InterfaceC7844a
        public void onError() {
        }
    }

    /* JADX INFO: renamed from: l.gxf$b */
    public class C17196b implements ViewPager.InterfaceC0716j {
        public C17196b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            gxf.this.m128577E();
            gxf.this.f104885m = i;
            gxf gxfVar = gxf.this;
            gxfVar.m128588w(gxfVar.m128586u(i));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.gxf$c */
    public class C17197c extends eb2 {
        public C17197c() {
        }

        @Override // p149l.w660
        public int getCount() {
            return 3;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            VDraweeView vDraweeView = new VDraweeView(viewGroup.getContext());
            vDraweeView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            FakeGoodLifeUserInfo fakeGoodLifeUserInfoM128586u = gxf.this.m128586u(i);
            if (ikf0.m136795i(xdl0.m208412y0()) >= 600.0f) {
                qib0.f154691G.m102331L0(vDraweeView, fakeGoodLifeUserInfoM128586u.picBig);
            } else {
                vDraweeView.setImageResource(fakeGoodLifeUserInfoM128586u.picSmall);
            }
            viewGroup.addView(vDraweeView, new ViewGroup.LayoutParams(-1, -1));
            return vDraweeView;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        }
    }
}
