package com.p046p1.mobile.putong.core.newui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.NewPictureView;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;
import p147v.VTexturePlayer;
import p149l.e30;
import p149l.fce;
import p149l.ffx;
import p149l.fyx;
import p149l.ikh0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o7m;
import p149l.q140;
import p149l.qib0;
import p149l.r3l0;
import p149l.r5l0;
import p149l.rhi;
import p149l.roj0;
import p149l.s5l0;
import p149l.t100;
import p149l.u4c0;
import p149l.w0c0;
import p149l.x1l0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xij0;
import p149l.yni;

/* JADX INFO: loaded from: classes11.dex */
public class NewPictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22583b, o7m {

    /* JADX INFO: renamed from: A */
    public C22392a<Boolean> f21222A;

    /* JADX INFO: renamed from: B */
    public boolean f21223B;

    /* JADX INFO: renamed from: C */
    public e30<Boolean> f21224C;

    /* JADX INFO: renamed from: D */
    public int f21225D;

    /* JADX INFO: renamed from: E */
    public float f21226E;

    /* JADX INFO: renamed from: F */
    public int f21227F;

    /* JADX INFO: renamed from: G */
    public float f21228G;

    /* JADX INFO: renamed from: a */
    public VDraweeView f21229a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f21230b;

    /* JADX INFO: renamed from: c */
    public ImageView f21231c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f21232d;

    /* JADX INFO: renamed from: e */
    public ImageView f21233e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f21234f;

    /* JADX INFO: renamed from: g */
    public VText f21235g;

    /* JADX INFO: renamed from: h */
    public VText f21236h;

    /* JADX INFO: renamed from: i */
    public VImage f21237i;

    /* JADX INFO: renamed from: j */
    public VText f21238j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f21239k;

    /* JADX INFO: renamed from: l */
    public VText f21240l;

    /* JADX INFO: renamed from: m */
    public VImage f21241m;

    /* JADX INFO: renamed from: n */
    public VTexturePlayer f21242n;

    /* JADX INFO: renamed from: o */
    public VTexturePlayer.InterfaceC22583b f21243o;

    /* JADX INFO: renamed from: p */
    public Media f21244p;

    /* JADX INFO: renamed from: q */
    public boolean f21245q;

    /* JADX INFO: renamed from: r */
    public boolean f21246r;

    /* JADX INFO: renamed from: s */
    public boolean f21247s;

    /* JADX INFO: renamed from: t */
    public String f21248t;

    /* JADX INFO: renamed from: u */
    public String f21249u;

    /* JADX INFO: renamed from: v */
    public long f21250v;

    /* JADX INFO: renamed from: w */
    public long f21251w;

    /* JADX INFO: renamed from: x */
    public float f21252x;

    /* JADX INFO: renamed from: y */
    public boolean f21253y;

    /* JADX INFO: renamed from: z */
    public C22392a<roj0> f21254z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.NewPictureView$a */
    public class C7836a implements VTexturePlayer.InterfaceC22584c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21255a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f21256b;

        public C7836a(String str, int i) {
            this.f21255a = str;
            this.f21256b = i;
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: O */
        public void mo36129O() {
            NewPictureView.this.f21250v = System.currentTimeMillis();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: a */
        public void mo36130a() {
            fyx.m123809c(NewPictureView.this.f21251w, System.currentTimeMillis(), this.f21255a, this.f21256b);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: b */
        public void mo36131b(int i, int i2) {
            fyx.m123811e(i, i2, !Network.isConnected(CoreModule.f17544b), this.f21255a, this.f21256b);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: c */
        public void mo36132c(long j) {
            if (NewPictureView.this.f21250v == -1 || !NullChecker.m81303a(NewPictureView.this.f21244p)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - NewPictureView.this.f21250v >= 200) {
                TrackMediaUploadUtil.m80310h0(jCurrentTimeMillis - NewPictureView.this.f21250v, NewPictureView.this.f21249u, this.f21255a);
                fyx.m123808b(NewPictureView.this.f21250v, jCurrentTimeMillis, this.f21255a, this.f21256b);
            }
            NewPictureView.this.f21250v = -1L;
        }
    }

    public NewPictureView(Context context) {
        super(context);
        this.f21248t = "";
        this.f21250v = -1L;
        this.f21251w = -1L;
        this.f21254z = C22392a.m221512b();
        this.f21222A = C22392a.m221513c(Boolean.FALSE);
        this.f21223B = false;
        this.f21224C = new e30() { // from class: l.k140
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120538a.m36114u((Boolean) obj);
            }
        };
        this.f21225D = u4c0.f174399oa;
        this.f21226E = 0.2f;
        this.f21227F = 2000;
        this.f21228G = -1.0f;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m36104c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m36105e(Object obj) {
        if (Network.isConnected(CoreModule.f17544b)) {
            return;
        }
        lsi0.m151579i(R$string.f18813p4, true);
    }

    /* JADX INFO: renamed from: o */
    private Act m36113o() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m36114u(Boolean bool) {
        this.f21222A.onNext(bool);
        yni.m215425n(TabName.Card);
    }

    @Override // p149l.o7m
    /* JADX INFO: renamed from: b */
    public void mo36115b(boolean z) {
        if (z) {
            m36120q(true);
        } else {
            m36126x();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: d */
    public void mo36116d() {
        this.f21230b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m81303a(this.f21242n) && this.f21242n.getAlpha() != 0.0f) {
            this.f21242n.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m36119p(u4c0.f174399oa);
        if (NullChecker.m81303a(this.f21243o)) {
            this.f21243o.mo36116d();
        }
    }

    public String getFrom() {
        return this.f21249u;
    }

    public Bitmap getPictureBitmap() {
        if (this.f21229a.getDrawable() instanceof BitmapDrawable) {
            return ((BitmapDrawable) this.f21229a.getDrawable()).getBitmap();
        }
        return null;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: h */
    public void mo36117h() {
        m36119p(u4c0.f173775D7);
        if (NullChecker.m81303a(this.f21243o)) {
            this.f21243o.mo36117h();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m36118n(View view) {
        q140.m172372a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = this.f21225D;
        if (i == u4c0.f174399oa) {
            m36128z();
        } else if (i == u4c0.f174449r9) {
            m36126x();
        } else if (i == u4c0.f173775D7) {
            m36126x();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onComplete() {
        boolean zM209661d0 = xij0.m209661d0();
        VTexturePlayer vTexturePlayer = this.f21242n;
        if (zM209661d0) {
            vTexturePlayer.m223311v();
            onPause();
            if (NullChecker.m81303a(this.f21243o)) {
                this.f21243o.onComplete();
            }
            m36128z();
            return;
        }
        vTexturePlayer.m223311v();
        this.f21230b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f21242n.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.p140
            @Override // java.lang.Runnable
            public final void run() {
                this.f146650a.m36124v();
            }
        }, 400L);
        if (NullChecker.m81303a(this.f21243o)) {
            this.f21243o.onComplete();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onError(int i, int i2) {
        CrashHelper.m81297d(new Throwable("NewPictureView play video error " + this.f21245q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
        if (NullChecker.m81303a(this.f21243o)) {
            this.f21243o.onError(i, i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36118n(this);
        this.f21230b.setOnClickListener(this);
        Drawable drawable = getResources().getDrawable(x2c0.f189410I2);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f21236h.setCompoundDrawables(drawable, null, null, null);
        this.f21236h.setBackgroundDrawable(fce.m120425b(m36113o().color(w0c0.f183760D1), t100.m186890d(8.0f)));
        this.f21235g.setBackgroundDrawable(fce.m120425b(m36113o().color(w0c0.f183757C1), t100.m186890d(8.0f)));
        this.f21238j.setBackgroundDrawable(fce.m120425b(m36113o().color(w0c0.f183754B1), t100.m186890d(12.0f)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f21246r) {
            int iM136799a = ikh0.m136799a(i, i2);
            super.onMeasure(iM136799a, iM136799a);
            return;
        }
        if (!this.f21253y || !NullChecker.m81303a(this.f21244p)) {
            if (this.f21252x <= 0.0f) {
                super.onMeasure(i, i2);
                return;
            }
            int iM121201d = ffx.m121201d(i);
            super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b((int) (iM121201d / this.f21252x)));
            return;
        }
        int iM121201d2 = ffx.m121201d(i);
        int iM121201d3 = ffx.m121201d(i2);
        int i3 = (int) (((iM121201d2 * 1.0f) / this.f21244p.cover().size.width) * this.f21244p.cover().size.height);
        if (i3 <= iM121201d3) {
            super.onMeasure(ffx.m121199b(iM121201d2), ffx.m121199b(i3));
        } else {
            super.onMeasure(ffx.m121199b((int) (((iM121201d3 * 1.0f) / this.f21244p.cover().size.height) * this.f21244p.cover().size.width)), ffx.m121199b(iM121201d3));
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onPause() {
        this.f21242n.setVisibility(4);
        m36119p(u4c0.f174399oa);
        if (NullChecker.m81303a(this.f21243o)) {
            this.f21243o.onPause();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onResume() {
        this.f21230b.animate().alpha(this.f21226E).setDuration(this.f21227F).start();
        m36119p(u4c0.f174449r9);
        if (NullChecker.m81303a(this.f21243o)) {
            this.f21243o.onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f21228G = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m36119p(int i) {
        this.f21225D = i;
        for (int i2 = 0; i2 < this.f21230b.getChildCount(); i2++) {
            int id = this.f21230b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f21230b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m36120q(boolean z) {
        m36121r(z);
        qib0.f154691G.m184725o(this.f21229a);
        this.f21229a.setVisibility(0);
    }

    /* JADX INFO: renamed from: r */
    public void m36121r(boolean z) {
        this.f21247s = false;
        if (NullChecker.m81303a(this.f21242n)) {
            this.f21242n.m223298i(z);
            this.f21242n.animate().cancel();
            this.f21242n.setAlpha(0.0f);
            this.f21242n.setVisibility(4);
            removeView(this.f21242n);
            this.f21242n = null;
        }
        m36119p(u4c0.f174399oa);
        this.f21230b.animate().cancel();
        this.f21230b.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: s */
    public final void m36122s() {
        if (this.f21242n == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f21242n = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f21242n.m223300k(true);
            this.f21242n.setId(u4c0.f174101Wd);
            FrameLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            if (getMeasuredHeight() > 0) {
                this.f21242n.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f21242n.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f21242n, 1, layoutParamsGenerateDefaultLayoutParams, true);
        }
    }

    public void setAdjustAspectRateByPictureSize(boolean z) {
        this.f21253y = z;
    }

    public void setAspectRateFitWidth(float f) {
        this.f21252x = f;
    }

    public void setFrom(String str) {
        this.f21249u = str;
    }

    public void setPlayerListener(VTexturePlayer.InterfaceC22583b interfaceC22583b) {
        this.f21243o = interfaceC22583b;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        if (NullChecker.m81304b(this.f21230b) && this.f21230b.getVisibility() == 0 && f > 0.0f) {
            this.f21230b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        if (NullChecker.m81304b(this.f21230b) && this.f21230b.getVisibility() == 0 && f > 0.0f) {
            this.f21230b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    /* JADX INFO: renamed from: t */
    public final float m36123t(Video video) {
        Dimension dimension = video.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m36124v() {
        if (NullChecker.m81303a(this.f21242n)) {
            this.f21242n.m223311v();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m36125w(String str, int i, Integer num) {
        fyx.m123810d(this.f21251w, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: x */
    public void m36126x() {
        this.f21247s = false;
        if (NullChecker.m81303a(this.f21242n)) {
            this.f21230b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f21242n.m223307r();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: y */
    public void mo36127y() {
        this.f21242n.setVisibility(0);
        if (this.f21242n.getAlpha() < 1.0f) {
            this.f21242n.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f21230b.animate().alpha(this.f21226E).setDuration(this.f21227F).setInterpolator(new LinearInterpolator()).start();
        m36119p(u4c0.f174449r9);
        if (NullChecker.m81303a(this.f21243o)) {
            this.f21243o.mo36127y();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m36128z() {
        this.f21254z.onNext(roj0.f160388a);
        this.f21247s = true;
        this.f21230b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f21244p;
        if (media instanceof Video) {
            Video videoMo223809clone = (Video) media;
            m36122s();
            if (videoMo223809clone.size == null && TEnum.equals(videoMo223809clone.status, "raw")) {
                videoMo223809clone = videoMo223809clone.mo223809clone();
                s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(videoMo223809clone.url)), this.f21246r, false);
                videoMo223809clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                videoMo223809clone.size = new Dimension(s5l0Var.m182364m());
                videoMo223809clone.duration = s5l0Var.f162561b;
            }
            float fM36123t = m36123t(videoMo223809clone);
            final String square = this.f21246r ? videoMo223809clone.formatSquare() : videoMo223809clone.formatAspectRatio();
            boolean zM177674c = r3l0.m177674c();
            this.f21251w = System.currentTimeMillis();
            final int i = fyx.f99914a;
            this.f21242n.setIsInABGroup(zM177674c);
            this.f21242n.setNetErrorListener(new e30() { // from class: l.l140
                @Override // p149l.e30
                public final void call(Object obj) {
                    NewPictureView.m36105e(obj);
                }
            });
            this.f21242n.m223312w(null, C22306c.fromCallable(new Callable() { // from class: l.m140
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(x1l0.m206744n().m206753u(square));
                }
            }).compose(mkd0.m154951C()), videoMo223809clone.duration);
            this.f21242n.setOnBufferListener(new C7836a(square, i));
            this.f21242n.m223308s(Uri.parse(qib0.m174812d0(square)), fM36123t, square, (zM177674c || !videoMo223809clone.url.startsWith("http") || Network.isConnected(CoreModule.f17544b)) ? false : true, R$string.f18813p4, R$string.f18306Yj);
            x1l0.m206744n().m206751q(square).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.n140
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136611a.m36125w(square, i, (Integer) obj);
                }
            }, new e30() { // from class: l.o140
                @Override // p149l.e30
                public final void call(Object obj) {
                    NewPictureView.m36104c((Throwable) obj);
                }
            }));
        }
    }

    public NewPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21248t = "";
        this.f21250v = -1L;
        this.f21251w = -1L;
        this.f21254z = C22392a.m221512b();
        this.f21222A = C22392a.m221513c(Boolean.FALSE);
        this.f21223B = false;
        this.f21224C = new e30() { // from class: l.k140
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120538a.m36114u((Boolean) obj);
            }
        };
        this.f21225D = u4c0.f174399oa;
        this.f21226E = 0.2f;
        this.f21227F = 2000;
        this.f21228G = -1.0f;
    }

    public NewPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21248t = "";
        this.f21250v = -1L;
        this.f21251w = -1L;
        this.f21254z = C22392a.m221512b();
        this.f21222A = C22392a.m221513c(Boolean.FALSE);
        this.f21223B = false;
        this.f21224C = new e30() { // from class: l.k140
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120538a.m36114u((Boolean) obj);
            }
        };
        this.f21225D = u4c0.f174399oa;
        this.f21226E = 0.2f;
        this.f21227F = 2000;
        this.f21228G = -1.0f;
    }
}
