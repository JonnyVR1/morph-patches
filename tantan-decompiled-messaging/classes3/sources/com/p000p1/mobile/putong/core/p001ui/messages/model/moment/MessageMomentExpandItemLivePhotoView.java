package com.p000p1.mobile.putong.core.p001ui.messages.model.moment;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
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
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l.a1c0;
import l.c680;
import l.ib1;
import l.orz;
import l.qib0;
import l.s680;
import l.t100;
import l.z91;
import org.json.JSONObject;
import p028v.VDraweeView;
import p028v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageMomentExpandItemLivePhotoView extends VRelative {

    /* JADX INFO: renamed from: r */
    public static final String f1908r = "MessageMomentExpandItemLivePhotoView";

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemLivePhotoView f1909d;

    /* JADX INFO: renamed from: e */
    public TextureView f1910e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1911f;

    /* JADX INFO: renamed from: g */
    public View f1912g;

    /* JADX INFO: renamed from: h */
    public View f1913h;

    /* JADX INFO: renamed from: i */
    public View f1914i;

    /* JADX INFO: renamed from: j */
    public C0146d f1915j;

    /* JADX INFO: renamed from: k */
    public final Set<c680.b> f1916k;

    /* JADX INFO: renamed from: l */
    public Surface f1917l;

    /* JADX INFO: renamed from: m */
    public Video f1918m;

    /* JADX INFO: renamed from: n */
    public boolean f1919n;

    /* JADX INFO: renamed from: o */
    public c680 f1920o;

    /* JADX INFO: renamed from: p */
    public Runnable f1921p;

    /* JADX INFO: renamed from: q */
    public final z91 f1922q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$a */
    public class TextureViewSurfaceTextureListenerC0143a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0143a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            MessageMomentExpandItemLivePhotoView.this.f1917l = new Surface(surfaceTexture);
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView = MessageMomentExpandItemLivePhotoView.this;
            messageMomentExpandItemLivePhotoView.removeCallbacks(messageMomentExpandItemLivePhotoView.f1921p);
            if (MessageMomentExpandItemLivePhotoView.this.m2551S()) {
                MessageMomentExpandItemLivePhotoView.this.m2555X();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (MessageMomentExpandItemLivePhotoView.this.f1919n) {
                MessageMomentExpandItemLivePhotoView.this.m2557a0();
            }
            MessageMomentExpandItemLivePhotoView.this.f1917l = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.a(MessageMomentExpandItemLivePhotoView.this.f1920o) && MessageMomentExpandItemLivePhotoView.this.m2551S()) {
                MessageMomentExpandItemLivePhotoView.this.f1920o.c();
                if (MessageMomentExpandItemLivePhotoView.this.f1911f.getAlpha() == 1.0f) {
                    MessageMomentExpandItemLivePhotoView.this.f1920o.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$b */
    public class C0144b implements z91 {
        public C0144b() {
        }

        /* JADX INFO: renamed from: b */
        public void m2559b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            MessageMomentExpandItemLivePhotoView.this.m2553V(true);
        }

        /* JADX INFO: renamed from: d */
        public void m2560d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                MessageMomentExpandItemLivePhotoView.this.m2553V(true);
            } else {
                ib1.b().g(str, audioBusinessType, z91Var);
            }
            MessageMomentExpandItemLivePhotoView.this.m2545Y(false);
        }

        public void success() {
            MessageMomentExpandItemLivePhotoView.this.m2545Y(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$c */
    public class C0145c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f1925a;

        public C0145c(float f) {
            this.f1925a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f1925a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$d */
    public class C0146d implements c680.a {
        public C0146d() {
        }

        /* JADX INFO: renamed from: a */
        public void m2561a(Exception exc) {
            MessageMomentExpandItemLivePhotoView.this.m2557a0();
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f1916k.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).a(exc);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m2562b(int i) {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f1916k.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).b(i);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m2563c() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f1916k.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).c();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m2564d() {
            m2565e();
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f1916k.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).d();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m2565e() {
            MessageMomentExpandItemLivePhotoView.this.f1919n = false;
            MessageMomentExpandItemLivePhotoView.this.f1911f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }

        /* JADX INFO: renamed from: f */
        public Video m2566f() {
            return MessageMomentExpandItemLivePhotoView.this.f1918m;
        }

        /* JADX INFO: renamed from: g */
        public void m2567g() {
        }

        public Surface getSurface() {
            return MessageMomentExpandItemLivePhotoView.this.f1917l;
        }

        public void onComplete() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f1916k.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onComplete();
            }
        }

        public void onPause() {
            MessageMomentExpandItemLivePhotoView.this.f1919n = false;
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f1916k.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onPause();
            }
        }

        public void onResume() {
            if (MessageMomentExpandItemLivePhotoView.this.f1911f.getAlpha() > 0.0f) {
                MessageMomentExpandItemLivePhotoView.this.f1911f.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f1916k.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onResume();
            }
        }

        public void onStart() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f1916k.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onStart();
            }
        }
    }

    public MessageMomentExpandItemLivePhotoView(Context context) {
        super(context);
        this.f1915j = new C0146d();
        this.f1916k = new HashSet();
        this.f1922q = new C0144b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m2545Y(boolean z) {
        if (this.f1917l == null) {
            Runnable runnable = this.f1921p;
            if (runnable == null) {
                this.f1921p = new Runnable() { // from class: l.nrz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5959a.m2552T();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f1921p, 10000L);
        }
        if (NullChecker.a(this.f1920o) && NullChecker.a(this.f1918m)) {
            this.f1919n = true;
            if (NullChecker.a(this.f1917l)) {
                this.f1920o.d(this.f1915j, z);
            } else {
                this.f1915j.m2563c();
            }
        }
    }

    private void init() {
        this.f1920o = new s680();
        m2553V(m2550R());
        this.f1910e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0143a());
    }

    /* JADX INFO: renamed from: Q */
    public final void m2549Q(View view) {
        orz.a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m2550R() {
        try {
            String strF = RemoteConfig.x().F("livephoto_function");
            if (!TextUtils.isEmpty(strF)) {
                new JSONObject(strF);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public boolean m2551S() {
        return this.f1919n;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m2552T() {
        if (this.f1917l == null && NullChecker.a(this.f1915j)) {
            this.f1915j.m2564d();
            Iterator<c680.b> it = this.f1916k.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m2553V(boolean z) {
        c680 c680Var = this.f1920o;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
    }

    /* JADX INFO: renamed from: W */
    public void m2554W() {
        removeCallbacks(this.f1921p);
        this.f1919n = false;
        if (NullChecker.a(this.f1920o)) {
            this.f1920o.pause();
        }
        ib1.b().a(f1908r);
    }

    /* JADX INFO: renamed from: X */
    public void m2555X() {
        ib1.b().f(f1908r, AudioBusinessType.NORMAL, this.f1922q);
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
    /* JADX INFO: renamed from: Z */
    public void m2556Z(Video video) {
        if (this.f1919n) {
            m2557a0();
        }
        this.f1918m = video;
        qib0.G.o(this.f1911f);
        Picture pictureCover = video.cover();
        if (NullChecker.a(pictureCover) && NullChecker.b(((Media) pictureCover).url)) {
            qib0.G.B0(this.f1911f, pictureCover.aspectRatioBiggest());
        } else {
            this.f1911f.setBackgroundColor(getResources().getColor(a1c0.a));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m2557a0() {
        removeCallbacks(this.f1921p);
        this.f1919n = false;
        if (NullChecker.a(this.f1920o)) {
            this.f1920o.stop();
        }
        ib1.b().a(f1908r);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: b0 */
    public void m2558b0(int i, int i2) {
        Dimension dimension;
        Video video = this.f1918m;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.b(picture) && NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.b(this.f1918m.size)) {
                    dimension = this.f1918m.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
                    }
                } else {
                    dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
                }
            }
        } else if (NullChecker.b(this.f1918m.size)) {
            dimension = this.f1918m.size;
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
        this.f1910e.setTransform(matrix);
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2549Q(this);
        init();
    }

    public void setRadius(float f) {
        if (NullChecker.b(this.f1910e)) {
            ViewOutlineProvider c0145c = new C0145c(f);
            this.f1910e.setOutlineProvider(c0145c);
            this.f1910e.setClipToOutline(true);
            this.f1911f.setOutlineProvider(c0145c);
            this.f1911f.setClipToOutline(true);
        }
    }

    public MessageMomentExpandItemLivePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1915j = new C0146d();
        this.f1916k = new HashSet();
        this.f1922q = new C0144b();
    }

    public MessageMomentExpandItemLivePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1915j = new C0146d();
        this.f1916k = new HashSet();
        this.f1922q = new C0144b();
    }
}
