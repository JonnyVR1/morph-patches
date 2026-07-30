package com.p051p1.mobile.putong.core.p058ui.messages.model.moment;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p153l.bnl0;
import p153l.g9c0;
import p153l.ga1;
import p153l.ibc0;
import p153l.ie80;
import p153l.pb1;
import p153l.q000;
import p153l.qa00;
import p153l.r1j0;
import p153l.uqb0;
import p153l.ye80;

/* JADX INFO: loaded from: classes4.dex */
public class MessageMomentExpandItemPlayView extends VRelative {

    /* JADX INFO: renamed from: s */
    public static final String f32890s = "MessageMomentExpandItemPlayView";

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemPlayView f32891d;

    /* JADX INFO: renamed from: e */
    public TextureView f32892e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32893f;

    /* JADX INFO: renamed from: g */
    public VImage f32894g;

    /* JADX INFO: renamed from: h */
    public VImage f32895h;

    /* JADX INFO: renamed from: i */
    public C8731d f32896i;

    /* JADX INFO: renamed from: j */
    public final Set<ie80.InterfaceC17710b> f32897j;

    /* JADX INFO: renamed from: k */
    public Surface f32898k;

    /* JADX INFO: renamed from: l */
    public Video f32899l;

    /* JADX INFO: renamed from: m */
    public boolean f32900m;

    /* JADX INFO: renamed from: n */
    public boolean f32901n;

    /* JADX INFO: renamed from: o */
    public ie80 f32902o;

    /* JADX INFO: renamed from: p */
    public Runnable f32903p;

    /* JADX INFO: renamed from: q */
    public View.OnClickListener f32904q;

    /* JADX INFO: renamed from: r */
    public final ga1 f32905r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$a */
    public class TextureViewSurfaceTextureListenerC8728a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC8728a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            MessageMomentExpandItemPlayView.this.f32898k = new Surface(surfaceTexture);
            MessageMomentExpandItemPlayView messageMomentExpandItemPlayView = MessageMomentExpandItemPlayView.this;
            messageMomentExpandItemPlayView.removeCallbacks(messageMomentExpandItemPlayView.f32903p);
            if (MessageMomentExpandItemPlayView.this.m50634V()) {
                MessageMomentExpandItemPlayView.this.m50637b0();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            MessageMomentExpandItemPlayView.this.m50639g0();
            MessageMomentExpandItemPlayView.this.f32898k = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m82486a(MessageMomentExpandItemPlayView.this.f32902o) && MessageMomentExpandItemPlayView.this.m50634V()) {
                MessageMomentExpandItemPlayView.this.f32902o.mo139593c();
                if (MessageMomentExpandItemPlayView.this.f32893f.getAlpha() == 1.0f || MessageMomentExpandItemPlayView.this.f32895h.getAlpha() == 1.0f) {
                    MessageMomentExpandItemPlayView.this.f32902o.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$b */
    public class C8729b implements ga1 {
        public C8729b() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            MessageMomentExpandItemPlayView.this.m50635Z(true);
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                MessageMomentExpandItemPlayView.this.m50635Z(true);
            } else {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
            }
            MessageMomentExpandItemPlayView.this.m50628c0(false);
        }

        @Override // p153l.ga1
        public void success() {
            MessageMomentExpandItemPlayView.this.m50628c0(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$c */
    public class C8730c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f32908a;

        public C8730c(float f) {
            this.f32908a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f32908a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$d */
    public class C8731d implements ie80.InterfaceC17709a {
        public C8731d() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            MessageMomentExpandItemPlayView.this.m50639g0();
            Iterator it = MessageMomentExpandItemPlayView.this.f32897j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45233a(exc);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
            Iterator it = MessageMomentExpandItemPlayView.this.f32897j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45234b(i);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: c */
        public void mo45235c() {
            if (MessageMomentExpandItemPlayView.this.f32895h.getAlpha() < 1.0f) {
                MessageMomentExpandItemPlayView.this.f32895h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemPlayView.this.f32897j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45235c();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            mo45237e();
            Iterator it = MessageMomentExpandItemPlayView.this.f32897j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45236d();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: e */
        public void mo45237e() {
            MessageMomentExpandItemPlayView.this.f32900m = false;
            MessageMomentExpandItemPlayView.this.f32895h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            MessageMomentExpandItemPlayView.this.f32893f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }

        @Override // p153l.ie80.InterfaceC17709a
        /* JADX INFO: renamed from: f */
        public Video mo45238f() {
            return MessageMomentExpandItemPlayView.this.f32899l;
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: g */
        public void mo45239g() {
        }

        @Override // p153l.ie80.InterfaceC17709a
        public Surface getSurface() {
            return MessageMomentExpandItemPlayView.this.f32898k;
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onComplete() {
            Iterator it = MessageMomentExpandItemPlayView.this.f32897j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onComplete();
            }
            if (MessageMomentExpandItemPlayView.this.f32901n) {
                MessageMomentExpandItemPlayView.this.m50628c0(true);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onPause() {
            MessageMomentExpandItemPlayView.this.f32900m = false;
            MessageMomentExpandItemPlayView.this.f32895h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            Iterator it = MessageMomentExpandItemPlayView.this.f32897j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onPause();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onResume() {
            MessageMomentExpandItemPlayView.this.f32895h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (MessageMomentExpandItemPlayView.this.f32893f.getAlpha() > 0.0f) {
                MessageMomentExpandItemPlayView.this.f32893f.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemPlayView.this.f32897j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onResume();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onStart() {
            Iterator it = MessageMomentExpandItemPlayView.this.f32897j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onStart();
            }
        }
    }

    public MessageMomentExpandItemPlayView(Context context) {
        super(context);
        this.f32896i = new C8731d();
        this.f32897j = new HashSet();
        this.f32904q = new View.OnClickListener() { // from class: l.n000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139580a.m50626X(view);
            }
        };
        this.f32905r = new C8729b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m50625W(View view) {
        if (!m50633T()) {
            m50635Z(true);
            return;
        }
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (NullChecker.m82486a(audioBusinessTypeMo171474c) && audioBusinessTypeMo171474c.isHighLevelBusiness()) {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
        } else {
            m50635Z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m50626X(View view) {
        if (m50634V()) {
            m50636a0();
        } else {
            m50637b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m50627Y() {
        if (this.f32898k == null && NullChecker.m82486a(this.f32896i)) {
            this.f32896i.mo45236d();
            Iterator<ie80.InterfaceC17710b> it = this.f32897j.iterator();
            while (it.hasNext()) {
                it.next().mo45236d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m50628c0(boolean z) {
        if (this.f32898k == null) {
            Runnable runnable = this.f32903p;
            if (runnable == null) {
                this.f32903p = new Runnable() { // from class: l.p000
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f149989a.m50627Y();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f32903p, 10000L);
        }
        if (NullChecker.m82486a(this.f32902o) && NullChecker.m82486a(this.f32899l)) {
            this.f32900m = true;
            if (NullChecker.m82486a(this.f32898k)) {
                this.f32902o.mo139594d(this.f32896i, z);
            } else {
                this.f32896i.mo45235c();
            }
        }
    }

    private void init() {
        this.f32902o = new ye80();
        m50635Z(true);
        this.f32895h.setOnClickListener(this.f32904q);
        bnl0.m105509E0(this.f32894g, new View.OnClickListener() { // from class: l.o000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144488a.m50625W(view);
            }
        });
        this.f32892e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC8728a());
    }

    /* JADX INFO: renamed from: S */
    public final void m50632S(View view) {
        q000.m174642a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public boolean m50633T() {
        ie80 ie80Var = this.f32902o;
        if (ie80Var == null) {
            return false;
        }
        return ie80Var.mo139595e();
    }

    /* JADX INFO: renamed from: V */
    public boolean m50634V() {
        return this.f32900m;
    }

    /* JADX INFO: renamed from: Z */
    public void m50635Z(boolean z) {
        ie80 ie80Var = this.f32902o;
        if (ie80Var == null) {
            return;
        }
        ie80Var.mute(z);
        this.f32894g.setImageResource(z ? ibc0.f113764C3 : ibc0.f113791F3);
    }

    /* JADX INFO: renamed from: a0 */
    public void m50636a0() {
        removeCallbacks(this.f32903p);
        this.f32900m = false;
        if (NullChecker.m82486a(this.f32902o)) {
            this.f32902o.pause();
        }
        pb1.m171472b().mo171473a(f32890s);
    }

    /* JADX INFO: renamed from: b0 */
    public void m50637b0() {
        pb1.m171472b().mo171477f(f32890s, AudioBusinessType.NORMAL, this.f32905r);
    }

    /* JADX INFO: renamed from: e0 */
    public void m50638e0(Video video) {
        if (this.f32900m) {
            m50639g0();
        }
        this.f32899l = video;
        uqb0.f180374G.m98798o(this.f32893f);
        Picture pictureCover = video.cover();
        if (NullChecker.m82486a(pictureCover) && NullChecker.m82487b(pictureCover.url)) {
            uqb0.f180374G.m127096B0(this.f32893f, pictureCover.aspectRatioBiggest());
        } else {
            this.f32893f.setBackgroundColor(getResources().getColor(g9c0.f102809a));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m50639g0() {
        removeCallbacks(this.f32903p);
        this.f32900m = false;
        if (NullChecker.m82486a(this.f32902o)) {
            this.f32902o.stop();
        }
        pb1.m171472b().mo171473a(f32890s);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: h0 */
    public void m50640h0(int i, int i2) {
        Dimension dimension;
        Video video = this.f32899l;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82487b(this.f32899l.size)) {
                    dimension = this.f32899l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
                    }
                } else {
                    dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
                }
            }
        } else if (NullChecker.m82487b(this.f32899l.size)) {
            dimension = this.f32899l.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
            }
        } else {
            dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
        }
        float f = i;
        float f2 = f / dimension.width;
        float f3 = i2;
        float f4 = f3 / dimension.height;
        Matrix matrix = new Matrix();
        float fMax = Math.max(f2, f4);
        float f5 = i / 2;
        float f6 = i2 / 2;
        matrix.preScale(dimension.width / f, dimension.height / f3, f5, f6);
        matrix.postScale(fMax, fMax, f5, f6);
        this.f32892e.setTransform(matrix);
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50632S(this);
        init();
    }

    public void setLoopMode(boolean z) {
        this.f32901n = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m82487b(this.f32892e)) {
            C8730c c8730c = new C8730c(f);
            this.f32892e.setOutlineProvider(c8730c);
            this.f32892e.setClipToOutline(true);
            this.f32893f.setOutlineProvider(c8730c);
            this.f32893f.setClipToOutline(true);
        }
    }

    public MessageMomentExpandItemPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32896i = new C8731d();
        this.f32897j = new HashSet();
        this.f32904q = new View.OnClickListener() { // from class: l.n000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139580a.m50626X(view);
            }
        };
        this.f32905r = new C8729b();
    }

    public MessageMomentExpandItemPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32896i = new C8731d();
        this.f32897j = new HashSet();
        this.f32904q = new View.OnClickListener() { // from class: l.n000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139580a.m50626X(view);
            }
        };
        this.f32905r = new C8729b();
    }
}
