package p003l;

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
import com.p000p1.mobile.putong.core.data.Active;
import com.p000p1.mobile.putong.core.data.FakeGoodLifeUserInfo;
import com.p000p1.mobile.putong.core.p001ui.growth.fakeexperience.act.FakeUploadPhotoAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.fake.FakeHoldFragment;
import com.p1.mobile.putong.core.newui.fake.b;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import l.bvv;
import l.cwf0;
import l.e51;
import l.eb2;
import l.f6c0;
import l.i0e;
import l.ikf0;
import l.j760;
import l.myf;
import l.qib0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gxf extends xwf {

    /* JADX INFO: renamed from: c */
    public VImage f4754c;

    /* JADX INFO: renamed from: d */
    public VImage f4755d;

    /* JADX INFO: renamed from: e */
    public TextView f4756e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4757f;

    /* JADX INFO: renamed from: g */
    public TextView f4758g;

    /* JADX INFO: renamed from: h */
    public ViewPager f4759h;

    /* JADX INFO: renamed from: i */
    public VPagerCircleIndicator f4760i;

    /* JADX INFO: renamed from: j */
    public VText f4761j;

    /* JADX INFO: renamed from: k */
    public NestedScrollView f4762k;

    /* JADX INFO: renamed from: l */
    public final int f4763l;

    /* JADX INFO: renamed from: m */
    public int f4764m;

    /* JADX INFO: renamed from: n */
    public Runnable f4765n;

    /* JADX INFO: renamed from: o */
    public long f4766o;

    /* JADX INFO: renamed from: p */
    public boolean f4767p;

    /* JADX INFO: renamed from: q */
    public boolean f4768q;

    /* JADX INFO: renamed from: r */
    public vwf f4769r;

    /* JADX INFO: renamed from: s */
    public String f4770s;

    /* JADX INFO: renamed from: t */
    public final ViewPager.j f4771t;

    public gxf(@NonNull Act act) {
        super(act);
        this.f4763l = 3000;
        this.f4764m = 0;
        this.f4766o = 0L;
        this.f4767p = false;
        this.f4768q = false;
        this.f4771t = new C3339b();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m6852A() {
        ViewPager viewPager = this.f4759h;
        if (viewPager != null) {
            this.f4764m++;
            viewPager.T(m6863s(), true);
            m6857F();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m6853B() {
        this.f4769r = new vwf().m10388c();
        m6862r();
        m6866v();
        m6868x();
        m6867w(m6865u(0));
        xdl0.E0(this.f4754c, new View.OnClickListener() { // from class: l.dxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4236a.m6869y(view);
            }
        });
        xdl0.E0(this.f4761j, new View.OnClickListener() { // from class: l.exf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4365a.m6870z(view);
            }
        });
        m6857F();
    }

    /* JADX INFO: renamed from: C */
    public void m6854C(boolean z, boolean z2, String str) {
        this.f4767p = z;
        this.f4768q = z2;
        this.f4770s = str;
    }

    /* JADX INFO: renamed from: D */
    public final void m6855D(String str, int i) {
        String string = this.f8582a.getResources().getString(R.string.y6, str, Integer.valueOf(i));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f8582a.getResources().getColor(w0c0.I));
        String strValueOf = String.valueOf(i);
        int iIndexOf = string.indexOf(strValueOf);
        spannableStringBuilder.setSpan(foregroundColorSpan, iIndexOf, strValueOf.length() + iIndexOf, 33);
        this.f4758g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: E */
    public final void m6856E() {
        Runnable runnable;
        if (this.f4766o != 0 && System.currentTimeMillis() - this.f4766o < 3000 && (runnable = this.f4765n) != null) {
            e51.J(runnable);
            this.f4765n = null;
        }
        this.f4766o = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: F */
    public final void m6857F() {
        if (this.f4765n == null) {
            this.f4765n = new Runnable() { // from class: l.fxf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4523a.m6852A();
                }
            };
        }
        e51.H(getContext(), this.f4765n, 3000L);
    }

    @Override // p003l.xwf
    /* JADX INFO: renamed from: c */
    public int mo6858c() {
        return 80;
    }

    @Override // p003l.xwf
    /* JADX INFO: renamed from: d */
    public float mo6859d() {
        if (hmb.m7033s1()) {
            return 0.8f;
        }
        if (this.f4768q) {
            return super.mo6859d();
        }
        return bvv.a() ? 0.96f : 0.98f;
    }

    @Override // p003l.xwf, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        Runnable runnable = this.f4765n;
        if (runnable != null) {
            e51.J(runnable);
            this.f4765n = null;
        }
    }

    @Override // p003l.xwf
    /* JADX INFO: renamed from: f */
    public void mo6860f() {
        this.f4754c = findViewById(u4c0.A1);
        this.f4755d = findViewById(u4c0.ce);
        this.f4756e = (TextView) findViewById(u4c0.ge);
        this.f4757f = findViewById(u4c0.O);
        this.f4758g = (TextView) findViewById(u4c0.lb);
        this.f4759h = findViewById(u4c0.nf);
        this.f4760i = findViewById(u4c0.of);
        this.f4761j = findViewById(u4c0.Y0);
        this.f4762k = findViewById(u4c0.O8);
        m10967g();
        m6853B();
    }

    @Override // p003l.xwf
    /* JADX INFO: renamed from: i */
    public int mo6861i() {
        return f6c0.g3;
    }

    /* JADX INFO: renamed from: r */
    public final void m6862r() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4759h.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4760i.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f4755d.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f4762k.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f4756e.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f4761j.getLayoutParams();
        if (this.f4768q) {
            layoutParams4.bottomMargin = 0;
        }
        if (r3g.m9077f()) {
            layoutParams.height = t100.d(260.0f);
            layoutParams.topMargin = t100.i;
            layoutParams2.topMargin = t100.k;
            int i = t100.C;
            layoutParams3.topMargin = i;
            layoutParams4.topMargin = t100.o;
            layoutParams5.topMargin = t100.j;
            layoutParams6.height = i;
            this.f4756e.setTextSize(1, 22.0f);
        } else if (hmb.m7030p1()) {
            layoutParams.height = t100.d(250.0f);
            layoutParams.topMargin = t100.h;
            int i2 = t100.j;
            layoutParams2.topMargin = i2;
            int i3 = t100.B;
            layoutParams3.topMargin = i3;
            layoutParams4.topMargin = i2;
            layoutParams5.topMargin = t100.f;
            layoutParams6.height = i3;
            this.f4756e.setTextSize(1, 20.0f);
        } else if (hmb.m7031q1()) {
            layoutParams.height = t100.d(240.0f);
            layoutParams.topMargin = t100.g;
            int i4 = t100.i;
            layoutParams2.topMargin = i4;
            int i5 = t100.A;
            layoutParams3.topMargin = i5;
            layoutParams4.topMargin = i4;
            layoutParams5.topMargin = t100.e;
            layoutParams6.height = i5;
            this.f4756e.setTextSize(1, 18.0f);
        } else {
            layoutParams.height = t100.d(310.0f);
            layoutParams.topMargin = t100.j;
            layoutParams2.topMargin = t100.o;
            layoutParams3.topMargin = t100.E;
            layoutParams4.topMargin = t100.q;
            layoutParams5.topMargin = t100.h;
            this.f4756e.setTextSize(1, 24.0f);
        }
        if (hmb.m7033s1()) {
            layoutParams.height = t100.d(((ikf0.i(xdl0.y0()) - 80.0f) * 558.0f) / 1190.0f);
        }
        this.f4759h.setLayoutParams(layoutParams);
        this.f4760i.setLayoutParams(layoutParams2);
        this.f4755d.setLayoutParams(layoutParams3);
        this.f4762k.setLayoutParams(layoutParams4);
        this.f4756e.setLayoutParams(layoutParams5);
    }

    /* JADX INFO: renamed from: s */
    public final int m6863s() {
        int i = this.f4764m;
        if (i >= 3 || i <= 0) {
            this.f4764m = 0;
        }
        return this.f4764m;
    }

    @Override // p003l.xwf, android.app.Dialog
    public void show() {
        cwf0 cwf0VarC = i0e.c(m6864t(), gxf.class.getName());
        this.f8583b = cwf0VarC;
        if (this.f4768q) {
            cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", Active.TYPE), vwb.Y("upload_photo_tip_show_from", this.f4770s)});
        } else {
            cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", Active.TYPE)});
        }
        if (lqa.m7789w()) {
            return;
        }
        super.show();
    }

    /* JADX INFO: renamed from: t */
    public String m6864t() {
        return this.f4768q ? "p_upload_photo_tips" : "p_guide_upload_photo";
    }

    /* JADX INFO: renamed from: u */
    public final FakeGoodLifeUserInfo m6865u(int i) {
        if (CoreModule.c.e0.Z7()) {
            boolean zIsFemale = CoreModule.c.e0.p9().isFemale();
            vwf vwfVar = this.f4769r;
            return zIsFemale ? vwfVar.f8081a.get(i) : vwfVar.f8083c.get(i);
        }
        boolean zIsFemale2 = CoreModule.c.e0.p9().isFemale();
        vwf vwfVar2 = this.f4769r;
        return zIsFemale2 ? vwfVar2.f8082b.get(i) : vwfVar2.f8084d.get(i);
    }

    /* JADX INFO: renamed from: v */
    public final void m6866v() {
        boolean z = this.f4768q;
        TextView textView = this.f4756e;
        if (z) {
            textView.setText(R.string.Qq);
            xdl0.M(this.f4761j, false);
        } else {
            textView.setText(R.string.z6);
        }
        this.f4756e.setTypeface(null, 1);
    }

    /* JADX INFO: renamed from: w */
    public final void m6867w(FakeGoodLifeUserInfo fakeGoodLifeUserInfo) {
        this.f4757f.setBackgroundResource(fakeGoodLifeUserInfo.avatar);
        m6855D(fakeGoodLifeUserInfo.name, fakeGoodLifeUserInfo.likeNum);
    }

    /* JADX INFO: renamed from: x */
    public final void m6868x() {
        this.f4759h.setAdapter(new C3340c());
        VPagerCircleIndicator vPagerCircleIndicator = this.f4760i;
        ViewPager viewPager = this.f4759h;
        vPagerCircleIndicator.c(viewPager, viewPager.getCurrentItem());
        this.f4759h.d(this.f4771t);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m6869y(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m6870z(View view) {
        zvf0.r("e_guide_upload_photo_button", m6864t());
        b bVarR = b.r();
        Act act = this.f8582a;
        bVarR.F(act, myf.E(act), new C3338a());
    }

    /* JADX INFO: renamed from: l.gxf$a */
    public class C3338a implements FakeHoldFragment.a {
        public C3338a() {
        }

        /* JADX INFO: renamed from: a */
        public void m6871a(ArrayList<Media> arrayList, String str) {
            Act act = gxf.this.f8582a;
            act.startActivity(FakeUploadPhotoAct.m3324Y1(act, arrayList));
            gxf.this.dismiss();
        }

        public void onError() {
        }
    }

    /* JADX INFO: renamed from: l.gxf$b */
    public class C3339b implements ViewPager.j {
        public C3339b() {
        }

        public void onPageSelected(int i) {
            gxf.this.m6856E();
            gxf.this.f4764m = i;
            gxf gxfVar = gxf.this;
            gxfVar.m6867w(gxfVar.m6865u(i));
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.gxf$c */
    public class C3340c extends eb2 {
        public C3340c() {
        }

        public int getCount() {
            return 3;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: p */
        public Object m6873p(ViewGroup viewGroup, int i) {
            VDraweeView vDraweeView = new VDraweeView(viewGroup.getContext());
            vDraweeView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            FakeGoodLifeUserInfo fakeGoodLifeUserInfoM6865u = gxf.this.m6865u(i);
            if (ikf0.i(xdl0.y0()) >= 600.0f) {
                qib0.G.L0(vDraweeView, fakeGoodLifeUserInfoM6865u.picBig);
            } else {
                vDraweeView.setImageResource(fakeGoodLifeUserInfoM6865u.picSmall);
            }
            viewGroup.addView((View) vDraweeView, new ViewGroup.LayoutParams(-1, -1));
            return vDraweeView;
        }

        /* JADX INFO: renamed from: o */
        public void m6872o(ViewGroup viewGroup, int i, Object obj) {
        }
    }
}
