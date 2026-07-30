package com.p051p1.mobile.putong.core.newui;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.NewPictureView;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;
import p151v.VTexturePlayer;
import p153l.adc0;
import p153l.asj0;
import p153l.bnl0;
import p153l.c7y;
import p153l.c9c0;
import p153l.cbl0;
import p153l.dbc0;
import p153l.dox;
import p153l.ea40;
import p153l.eam;
import p153l.jde;
import p153l.o1j0;
import p153l.oki;
import p153l.psd0;
import p153l.psh0;
import p153l.qa00;
import p153l.uqb0;
import p153l.uqi;
import p153l.uxj0;
import p153l.vel0;
import p153l.wcl0;
import p153l.wel0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class NewPictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22698b, eam {

    /* JADX INFO: renamed from: A */
    public C22507a<Boolean> f21964A;

    /* JADX INFO: renamed from: B */
    public boolean f21965B;

    /* JADX INFO: renamed from: C */
    public y20<Boolean> f21966C;

    /* JADX INFO: renamed from: D */
    public int f21967D;

    /* JADX INFO: renamed from: E */
    public float f21968E;

    /* JADX INFO: renamed from: F */
    public int f21969F;

    /* JADX INFO: renamed from: G */
    public float f21970G;

    /* JADX INFO: renamed from: a */
    public VDraweeView f21971a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f21972b;

    /* JADX INFO: renamed from: c */
    public ImageView f21973c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f21974d;

    /* JADX INFO: renamed from: e */
    public ImageView f21975e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f21976f;

    /* JADX INFO: renamed from: g */
    public VText f21977g;

    /* JADX INFO: renamed from: h */
    public VText f21978h;

    /* JADX INFO: renamed from: i */
    public VImage f21979i;

    /* JADX INFO: renamed from: j */
    public VText f21980j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f21981k;

    /* JADX INFO: renamed from: l */
    public VText f21982l;

    /* JADX INFO: renamed from: m */
    public VImage f21983m;

    /* JADX INFO: renamed from: n */
    public VTexturePlayer f21984n;

    /* JADX INFO: renamed from: o */
    public VTexturePlayer.InterfaceC22698b f21985o;

    /* JADX INFO: renamed from: p */
    public Media f21986p;

    /* JADX INFO: renamed from: q */
    public boolean f21987q;

    /* JADX INFO: renamed from: r */
    public boolean f21988r;

    /* JADX INFO: renamed from: s */
    public boolean f21989s;

    /* JADX INFO: renamed from: t */
    public String f21990t;

    /* JADX INFO: renamed from: u */
    public String f21991u;

    /* JADX INFO: renamed from: v */
    public long f21992v;

    /* JADX INFO: renamed from: w */
    public long f21993w;

    /* JADX INFO: renamed from: x */
    public float f21994x;

    /* JADX INFO: renamed from: y */
    public boolean f21995y;

    /* JADX INFO: renamed from: z */
    public C22507a<uxj0> f21996z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.NewPictureView$a */
    public class C7987a implements VTexturePlayer.InterfaceC22699c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f21997a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f21998b;

        public C7987a(String str, int i) {
            this.f21997a = str;
            this.f21998b = i;
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: O */
        public void mo37132O() {
            NewPictureView.this.f21992v = System.currentTimeMillis();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: a */
        public void mo37133a() {
            c7y.m108344c(NewPictureView.this.f21993w, System.currentTimeMillis(), this.f21997a, this.f21998b);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: b */
        public void mo37134b(int i, int i2) {
            c7y.m108346e(i, i2, !Network.isConnected(CoreModule.f18263b), this.f21997a, this.f21998b);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: c */
        public void mo37135c(long j) {
            if (NewPictureView.this.f21992v == -1 || !NullChecker.m82486a(NewPictureView.this.f21986p)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - NewPictureView.this.f21992v >= 200) {
                TrackMediaUploadUtil.m81493h0(jCurrentTimeMillis - NewPictureView.this.f21992v, NewPictureView.this.f21991u, this.f21997a);
                c7y.m108343b(NewPictureView.this.f21992v, jCurrentTimeMillis, this.f21997a, this.f21998b);
            }
            NewPictureView.this.f21992v = -1L;
        }
    }

    public NewPictureView(Context context) {
        super(context);
        this.f21990t = "";
        this.f21992v = -1L;
        this.f21993w = -1L;
        this.f21996z = C22507a.m222758b();
        this.f21964A = C22507a.m222759c(Boolean.FALSE);
        this.f21965B = false;
        this.f21966C = new y20() { // from class: l.y940
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198064a.m37117u((Boolean) obj);
            }
        };
        this.f21967D = adc0.f70524qa;
        this.f21968E = 0.2f;
        this.f21969F = 2000;
        this.f21970G = -1.0f;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m37107c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m37108e(Object obj) {
        if (Network.isConnected(CoreModule.f18263b)) {
            return;
        }
        o1j0.m165635i(R$string.f19605r4, true);
    }

    /* JADX INFO: renamed from: o */
    private Act m37116o() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m37117u(Boolean bool) {
        this.f21964A.onNext(bool);
        uqi.m197347n(TabName.Card);
    }

    @Override // p153l.eam
    /* JADX INFO: renamed from: b */
    public void mo37118b(boolean z) {
        if (z) {
            m37123q(true);
        } else {
            m37129x();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: d */
    public void mo37119d() {
        this.f21972b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m82486a(this.f21984n) && this.f21984n.getAlpha() != 0.0f) {
            this.f21984n.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m37122p(adc0.f70524qa);
        if (NullChecker.m82486a(this.f21985o)) {
            this.f21985o.mo37119d();
        }
    }

    public String getFrom() {
        return this.f21991u;
    }

    public Bitmap getPictureBitmap() {
        if (this.f21971a.getDrawable() instanceof BitmapDrawable) {
            return ((BitmapDrawable) this.f21971a.getDrawable()).getBitmap();
        }
        return null;
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: h */
    public void mo37120h() {
        m37122p(adc0.f69897F7);
        if (NullChecker.m82486a(this.f21985o)) {
            this.f21985o.mo37120h();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m37121n(View view) {
        ea40.m120007a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = this.f21967D;
        if (i == adc0.f70524qa) {
            m37131z();
        } else if (i == adc0.f70574t9) {
            m37129x();
        } else if (i == adc0.f69897F7) {
            m37129x();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onComplete() {
        boolean zM99935d0 = asj0.m99935d0();
        VTexturePlayer vTexturePlayer = this.f21984n;
        if (zM99935d0) {
            vTexturePlayer.m224557v();
            onPause();
            if (NullChecker.m82486a(this.f21985o)) {
                this.f21985o.onComplete();
            }
            m37131z();
            return;
        }
        vTexturePlayer.m224557v();
        this.f21972b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f21984n.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.da40
            @Override // java.lang.Runnable
            public final void run() {
                this.f85837a.m37127v();
            }
        }, 400L);
        if (NullChecker.m82486a(this.f21985o)) {
            this.f21985o.onComplete();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onError(int i, int i2) {
        CrashHelper.m82480d(new Throwable("NewPictureView play video error " + this.f21987q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
        if (NullChecker.m82486a(this.f21985o)) {
            this.f21985o.onError(i, i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37121n(this);
        this.f21972b.setOnClickListener(this);
        Drawable drawable = getResources().getDrawable(dbc0.f86267J2);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f21978h.setCompoundDrawables(drawable, null, null, null);
        this.f21978h.setBackgroundDrawable(jde.m144406b(m37116o().color(c9c0.f80332E1), qa00.m175859d(8.0f)));
        this.f21977g.setBackgroundDrawable(jde.m144406b(m37116o().color(c9c0.f80329D1), qa00.m175859d(8.0f)));
        this.f21980j.setBackgroundDrawable(jde.m144406b(m37116o().color(c9c0.f80326C1), qa00.m175859d(12.0f)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f21988r) {
            int iM173642a = psh0.m173642a(i, i2);
            super.onMeasure(iM173642a, iM173642a);
            return;
        }
        if (!this.f21995y || !NullChecker.m82486a(this.f21986p)) {
            if (this.f21994x <= 0.0f) {
                super.onMeasure(i, i2);
                return;
            }
            int iM117366d = dox.m117366d(i);
            super.onMeasure(dox.m117364b(iM117366d), dox.m117364b((int) (iM117366d / this.f21994x)));
            return;
        }
        int iM117366d2 = dox.m117366d(i);
        int iM117366d3 = dox.m117366d(i2);
        int i3 = (int) (((iM117366d2 * 1.0f) / this.f21986p.cover().size.width) * this.f21986p.cover().size.height);
        if (i3 <= iM117366d3) {
            super.onMeasure(dox.m117364b(iM117366d2), dox.m117364b(i3));
        } else {
            super.onMeasure(dox.m117364b((int) (((iM117366d3 * 1.0f) / this.f21986p.cover().size.height) * this.f21986p.cover().size.width)), dox.m117364b(iM117366d3));
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onPause() {
        this.f21984n.setVisibility(4);
        m37122p(adc0.f70524qa);
        if (NullChecker.m82486a(this.f21985o)) {
            this.f21985o.onPause();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onResume() {
        this.f21972b.animate().alpha(this.f21968E).setDuration(this.f21969F).start();
        m37122p(adc0.f70574t9);
        if (NullChecker.m82486a(this.f21985o)) {
            this.f21985o.onResume();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f21970G = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m37122p(int i) {
        this.f21967D = i;
        for (int i2 = 0; i2 < this.f21972b.getChildCount(); i2++) {
            int id = this.f21972b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f21972b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m37123q(boolean z) {
        m37124r(z);
        uqb0.f180374G.m98798o(this.f21971a);
        this.f21971a.setVisibility(0);
    }

    /* JADX INFO: renamed from: r */
    public void m37124r(boolean z) {
        this.f21989s = false;
        if (NullChecker.m82486a(this.f21984n)) {
            this.f21984n.m224544i(z);
            this.f21984n.animate().cancel();
            this.f21984n.setAlpha(0.0f);
            this.f21984n.setVisibility(4);
            removeView(this.f21984n);
            this.f21984n = null;
        }
        m37122p(adc0.f70524qa);
        this.f21972b.animate().cancel();
        this.f21972b.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: s */
    public final void m37125s() {
        if (this.f21984n == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f21984n = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f21984n.m224546k(true);
            this.f21984n.setId(adc0.f70240Zd);
            FrameLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            if (getMeasuredHeight() > 0) {
                this.f21984n.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f21984n.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f21984n, 1, layoutParamsGenerateDefaultLayoutParams, true);
        }
    }

    public void setAdjustAspectRateByPictureSize(boolean z) {
        this.f21995y = z;
    }

    public void setAspectRateFitWidth(float f) {
        this.f21994x = f;
    }

    public void setFrom(String str) {
        this.f21991u = str;
    }

    public void setPlayerListener(VTexturePlayer.InterfaceC22698b interfaceC22698b) {
        this.f21985o = interfaceC22698b;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        if (NullChecker.m82487b(this.f21972b) && this.f21972b.getVisibility() == 0 && f > 0.0f) {
            this.f21972b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        if (NullChecker.m82487b(this.f21972b) && this.f21972b.getVisibility() == 0 && f > 0.0f) {
            this.f21972b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    /* JADX INFO: renamed from: t */
    public final float m37126t(Video video) {
        Dimension dimension = video.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m37127v() {
        if (NullChecker.m82486a(this.f21984n)) {
            this.f21984n.m224557v();
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m37128w(String str, int i, Integer num) {
        c7y.m108345d(this.f21993w, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: x */
    public void m37129x() {
        this.f21989s = false;
        if (NullChecker.m82486a(this.f21984n)) {
            this.f21972b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f21984n.m224553r();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: y */
    public void mo37130y() {
        this.f21984n.setVisibility(0);
        if (this.f21984n.getAlpha() < 1.0f) {
            this.f21984n.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f21972b.animate().alpha(this.f21968E).setDuration(this.f21969F).setInterpolator(new LinearInterpolator()).start();
        m37122p(adc0.f70574t9);
        if (NullChecker.m82486a(this.f21985o)) {
            this.f21985o.mo37130y();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m37131z() {
        this.f21996z.onNext(uxj0.f181467a);
        this.f21989s = true;
        this.f21972b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f21986p;
        if (media instanceof Video) {
            Video videoMo225055clone = (Video) media;
            m37125s();
            if (videoMo225055clone.size == null && TEnum.equals(videoMo225055clone.status, "raw")) {
                videoMo225055clone = videoMo225055clone.mo225055clone();
                wel0 wel0Var = new wel0(new vel0(oki.m168038z(videoMo225055clone.url)), this.f21988r, false);
                videoMo225055clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                videoMo225055clone.size = new Dimension(wel0Var.m206021m());
                videoMo225055clone.duration = wel0Var.f188702b;
            }
            float fM37126t = m37126t(videoMo225055clone);
            final String square = this.f21988r ? videoMo225055clone.formatSquare() : videoMo225055clone.formatAspectRatio();
            boolean zM205822c = wcl0.m205822c();
            this.f21993w = System.currentTimeMillis();
            final int i = c7y.f80160a;
            this.f21984n.setIsInABGroup(zM205822c);
            this.f21984n.setNetErrorListener(new y20() { // from class: l.z940
                @Override // p153l.y20
                public final void call(Object obj) {
                    NewPictureView.m37108e(obj);
                }
            });
            this.f21984n.m224558w(null, C22421c.fromCallable(new Callable() { // from class: l.aa40
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(cbl0.m108642n().m108651u(square));
                }
            }).compose(psd0.m173592C()), videoMo225055clone.duration);
            this.f21984n.setOnBufferListener(new C7987a(square, i));
            this.f21984n.m224554s(Uri.parse(uqb0.m197266d0(square)), fM37126t, square, (zM205822c || !videoMo225055clone.url.startsWith("http") || Network.isConnected(CoreModule.f18263b)) ? false : true, R$string.f19605r4, R$string.f19714uk);
            cbl0.m108642n().m108649q(square).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.ba40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f75641a.m37128w(square, i, (Integer) obj);
                }
            }, new y20() { // from class: l.ca40
                @Override // p153l.y20
                public final void call(Object obj) {
                    NewPictureView.m37107c((Throwable) obj);
                }
            }));
        }
    }

    public NewPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21990t = "";
        this.f21992v = -1L;
        this.f21993w = -1L;
        this.f21996z = C22507a.m222758b();
        this.f21964A = C22507a.m222759c(Boolean.FALSE);
        this.f21965B = false;
        this.f21966C = new y20() { // from class: l.y940
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198064a.m37117u((Boolean) obj);
            }
        };
        this.f21967D = adc0.f70524qa;
        this.f21968E = 0.2f;
        this.f21969F = 2000;
        this.f21970G = -1.0f;
    }

    public NewPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21990t = "";
        this.f21992v = -1L;
        this.f21993w = -1L;
        this.f21996z = C22507a.m222758b();
        this.f21964A = C22507a.m222759c(Boolean.FALSE);
        this.f21965B = false;
        this.f21966C = new y20() { // from class: l.y940
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198064a.m37117u((Boolean) obj);
            }
        };
        this.f21967D = adc0.f70524qa;
        this.f21968E = 0.2f;
        this.f21969F = 2000;
        this.f21970G = -1.0f;
    }
}
