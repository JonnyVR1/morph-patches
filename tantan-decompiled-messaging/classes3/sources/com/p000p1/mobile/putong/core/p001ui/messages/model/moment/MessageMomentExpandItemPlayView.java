package com.p000p1.mobile.putong.core.p001ui.messages.model.moment;

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
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l.a1c0;
import l.c3c0;
import l.c680;
import l.ib1;
import l.osi0;
import l.qib0;
import l.s680;
import l.t100;
import l.trz;
import l.xdl0;
import l.z91;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageMomentExpandItemPlayView extends VRelative {

    /* JADX INFO: renamed from: s */
    public static final String f1933s = "MessageMomentExpandItemPlayView";

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemPlayView f1934d;

    /* JADX INFO: renamed from: e */
    public TextureView f1935e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1936f;

    /* JADX INFO: renamed from: g */
    public VImage f1937g;

    /* JADX INFO: renamed from: h */
    public VImage f1938h;

    /* JADX INFO: renamed from: i */
    public C0151d f1939i;

    /* JADX INFO: renamed from: j */
    public final Set<c680.b> f1940j;

    /* JADX INFO: renamed from: k */
    public Surface f1941k;

    /* JADX INFO: renamed from: l */
    public Video f1942l;

    /* JADX INFO: renamed from: m */
    public boolean f1943m;

    /* JADX INFO: renamed from: n */
    public boolean f1944n;

    /* JADX INFO: renamed from: o */
    public c680 f1945o;

    /* JADX INFO: renamed from: p */
    public Runnable f1946p;

    /* JADX INFO: renamed from: q */
    public View.OnClickListener f1947q;

    /* JADX INFO: renamed from: r */
    public final z91 f1948r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$a */
    public class TextureViewSurfaceTextureListenerC0148a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0148a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            MessageMomentExpandItemPlayView.this.f1941k = new Surface(surfaceTexture);
            MessageMomentExpandItemPlayView messageMomentExpandItemPlayView = MessageMomentExpandItemPlayView.this;
            messageMomentExpandItemPlayView.removeCallbacks(messageMomentExpandItemPlayView.f1946p);
            if (MessageMomentExpandItemPlayView.this.m2589V()) {
                MessageMomentExpandItemPlayView.this.m2592b0();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            MessageMomentExpandItemPlayView.this.m2594g0();
            MessageMomentExpandItemPlayView.this.f1941k = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.a(MessageMomentExpandItemPlayView.this.f1945o) && MessageMomentExpandItemPlayView.this.m2589V()) {
                MessageMomentExpandItemPlayView.this.f1945o.c();
                if (MessageMomentExpandItemPlayView.this.f1936f.getAlpha() == 1.0f || MessageMomentExpandItemPlayView.this.f1938h.getAlpha() == 1.0f) {
                    MessageMomentExpandItemPlayView.this.f1945o.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$b */
    public class C0149b implements z91 {
        public C0149b() {
        }

        /* JADX INFO: renamed from: b */
        public void m2596b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            MessageMomentExpandItemPlayView.this.m2590Z(true);
        }

        /* JADX INFO: renamed from: d */
        public void m2597d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                MessageMomentExpandItemPlayView.this.m2590Z(true);
            } else {
                ib1.b().g(str, audioBusinessType, z91Var);
            }
            MessageMomentExpandItemPlayView.this.m2583c0(false);
        }

        public void success() {
            MessageMomentExpandItemPlayView.this.m2583c0(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$c */
    public class C0150c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f1951a;

        public C0150c(float f) {
            this.f1951a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f1951a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$d */
    public class C0151d implements c680.a {
        public C0151d() {
        }

        /* JADX INFO: renamed from: a */
        public void m2598a(Exception exc) {
            MessageMomentExpandItemPlayView.this.m2594g0();
            Iterator it = MessageMomentExpandItemPlayView.this.f1940j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).a(exc);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m2599b(int i) {
            Iterator it = MessageMomentExpandItemPlayView.this.f1940j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).b(i);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m2600c() {
            if (MessageMomentExpandItemPlayView.this.f1938h.getAlpha() < 1.0f) {
                MessageMomentExpandItemPlayView.this.f1938h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemPlayView.this.f1940j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).c();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m2601d() {
            m2602e();
            Iterator it = MessageMomentExpandItemPlayView.this.f1940j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).d();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m2602e() {
            MessageMomentExpandItemPlayView.this.f1943m = false;
            MessageMomentExpandItemPlayView.this.f1938h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            MessageMomentExpandItemPlayView.this.f1936f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }

        /* JADX INFO: renamed from: f */
        public Video m2603f() {
            return MessageMomentExpandItemPlayView.this.f1942l;
        }

        /* JADX INFO: renamed from: g */
        public void m2604g() {
        }

        public Surface getSurface() {
            return MessageMomentExpandItemPlayView.this.f1941k;
        }

        public void onComplete() {
            Iterator it = MessageMomentExpandItemPlayView.this.f1940j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onComplete();
            }
            if (MessageMomentExpandItemPlayView.this.f1944n) {
                MessageMomentExpandItemPlayView.this.m2583c0(true);
            }
        }

        public void onPause() {
            MessageMomentExpandItemPlayView.this.f1943m = false;
            MessageMomentExpandItemPlayView.this.f1938h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            Iterator it = MessageMomentExpandItemPlayView.this.f1940j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onPause();
            }
        }

        public void onResume() {
            MessageMomentExpandItemPlayView.this.f1938h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (MessageMomentExpandItemPlayView.this.f1936f.getAlpha() > 0.0f) {
                MessageMomentExpandItemPlayView.this.f1936f.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemPlayView.this.f1940j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onResume();
            }
        }

        public void onStart() {
            Iterator it = MessageMomentExpandItemPlayView.this.f1940j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onStart();
            }
        }
    }

    public MessageMomentExpandItemPlayView(Context context) {
        super(context);
        this.f1939i = new C0151d();
        this.f1940j = new HashSet();
        this.f1947q = new View.OnClickListener() { // from class: l.qrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6681a.m2581X(view);
            }
        };
        this.f1948r = new C0149b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m2580W(View view) {
        if (!m2588T()) {
            m2590Z(true);
            return;
        }
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (NullChecker.a(audioBusinessTypeC) && audioBusinessTypeC.isHighLevelBusiness()) {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
        } else {
            m2590Z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m2581X(View view) {
        if (m2589V()) {
            m2591a0();
        } else {
            m2592b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m2582Y() {
        if (this.f1941k == null && NullChecker.a(this.f1939i)) {
            this.f1939i.m2601d();
            Iterator<c680.b> it = this.f1940j.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m2583c0(boolean z) {
        if (this.f1941k == null) {
            Runnable runnable = this.f1946p;
            if (runnable == null) {
                this.f1946p = new Runnable() { // from class: l.srz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7297a.m2582Y();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f1946p, 10000L);
        }
        if (NullChecker.a(this.f1945o) && NullChecker.a(this.f1942l)) {
            this.f1943m = true;
            if (NullChecker.a(this.f1941k)) {
                this.f1945o.d(this.f1939i, z);
            } else {
                this.f1939i.m2600c();
            }
        }
    }

    private void init() {
        this.f1945o = new s680();
        m2590Z(true);
        this.f1938h.setOnClickListener(this.f1947q);
        xdl0.E0(this.f1937g, new View.OnClickListener() { // from class: l.rrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7057a.m2580W(view);
            }
        });
        this.f1935e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0148a());
    }

    /* JADX INFO: renamed from: S */
    public final void m2587S(View view) {
        trz.a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public boolean m2588T() {
        c680 c680Var = this.f1945o;
        if (c680Var == null) {
            return false;
        }
        return c680Var.e();
    }

    /* JADX INFO: renamed from: V */
    public boolean m2589V() {
        return this.f1943m;
    }

    /* JADX INFO: renamed from: Z */
    public void m2590Z(boolean z) {
        c680 c680Var = this.f1945o;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
        this.f1937g.setImageResource(z ? c3c0.C3 : c3c0.F3);
    }

    /* JADX INFO: renamed from: a0 */
    public void m2591a0() {
        removeCallbacks(this.f1946p);
        this.f1943m = false;
        if (NullChecker.a(this.f1945o)) {
            this.f1945o.pause();
        }
        ib1.b().a(f1933s);
    }

    /* JADX INFO: renamed from: b0 */
    public void m2592b0() {
        ib1.b().f(f1933s, AudioBusinessType.NORMAL, this.f1948r);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e0 */
    public void m2593e0(Video video) {
        if (this.f1943m) {
            m2594g0();
        }
        this.f1942l = video;
        qib0.G.o(this.f1936f);
        Picture pictureCover = video.cover();
        if (NullChecker.a(pictureCover) && NullChecker.b(((Media) pictureCover).url)) {
            qib0.G.B0(this.f1936f, pictureCover.aspectRatioBiggest());
        } else {
            this.f1936f.setBackgroundColor(getResources().getColor(a1c0.a));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m2594g0() {
        removeCallbacks(this.f1946p);
        this.f1943m = false;
        if (NullChecker.a(this.f1945o)) {
            this.f1945o.stop();
        }
        ib1.b().a(f1933s);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: h0 */
    public void m2595h0(int i, int i2) {
        Dimension dimension;
        Video video = this.f1942l;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.b(picture) && NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.b(this.f1942l.size)) {
                    dimension = this.f1942l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
                    }
                } else {
                    dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
                }
            }
        } else if (NullChecker.b(this.f1942l.size)) {
            dimension = this.f1942l.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
            }
        } else {
            dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
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
        this.f1935e.setTransform(matrix);
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2587S(this);
        init();
    }

    public void setLoopMode(boolean z) {
        this.f1944n = z;
    }

    public void setRadius(float f) {
        if (NullChecker.b(this.f1935e)) {
            ViewOutlineProvider c0150c = new C0150c(f);
            this.f1935e.setOutlineProvider(c0150c);
            this.f1935e.setClipToOutline(true);
            this.f1936f.setOutlineProvider(c0150c);
            this.f1936f.setClipToOutline(true);
        }
    }

    public MessageMomentExpandItemPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1939i = new C0151d();
        this.f1940j = new HashSet();
        this.f1947q = new View.OnClickListener() { // from class: l.qrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6681a.m2581X(view);
            }
        };
        this.f1948r = new C0149b();
    }

    public MessageMomentExpandItemPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1939i = new C0151d();
        this.f1940j = new HashSet();
        this.f1947q = new View.OnClickListener() { // from class: l.qrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6681a.m2581X(view);
            }
        };
        this.f1948r = new C0149b();
    }
}
