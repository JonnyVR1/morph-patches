package com.p051p1.mobile.putong.core.p058ui.messages.model.moment;

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
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import p151v.VDraweeView;
import p151v.VRelative;
import p153l.g9c0;
import p153l.ga1;
import p153l.ie80;
import p153l.l000;
import p153l.pb1;
import p153l.qa00;
import p153l.uqb0;
import p153l.ye80;

/* JADX INFO: loaded from: classes4.dex */
public class MessageMomentExpandItemLivePhotoView extends VRelative {

    /* JADX INFO: renamed from: r */
    public static final String f32865r = "MessageMomentExpandItemLivePhotoView";

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemLivePhotoView f32866d;

    /* JADX INFO: renamed from: e */
    public TextureView f32867e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32868f;

    /* JADX INFO: renamed from: g */
    public View f32869g;

    /* JADX INFO: renamed from: h */
    public View f32870h;

    /* JADX INFO: renamed from: i */
    public View f32871i;

    /* JADX INFO: renamed from: j */
    public C8726d f32872j;

    /* JADX INFO: renamed from: k */
    public final Set<ie80.InterfaceC17710b> f32873k;

    /* JADX INFO: renamed from: l */
    public Surface f32874l;

    /* JADX INFO: renamed from: m */
    public Video f32875m;

    /* JADX INFO: renamed from: n */
    public boolean f32876n;

    /* JADX INFO: renamed from: o */
    public ie80 f32877o;

    /* JADX INFO: renamed from: p */
    public Runnable f32878p;

    /* JADX INFO: renamed from: q */
    public final ga1 f32879q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$a */
    public class TextureViewSurfaceTextureListenerC8723a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC8723a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            MessageMomentExpandItemLivePhotoView.this.f32874l = new Surface(surfaceTexture);
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView = MessageMomentExpandItemLivePhotoView.this;
            messageMomentExpandItemLivePhotoView.removeCallbacks(messageMomentExpandItemLivePhotoView.f32878p);
            if (MessageMomentExpandItemLivePhotoView.this.m50605S()) {
                MessageMomentExpandItemLivePhotoView.this.m50609X();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (MessageMomentExpandItemLivePhotoView.this.f32876n) {
                MessageMomentExpandItemLivePhotoView.this.m50611a0();
            }
            MessageMomentExpandItemLivePhotoView.this.f32874l = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m82486a(MessageMomentExpandItemLivePhotoView.this.f32877o) && MessageMomentExpandItemLivePhotoView.this.m50605S()) {
                MessageMomentExpandItemLivePhotoView.this.f32877o.mo139593c();
                if (MessageMomentExpandItemLivePhotoView.this.f32868f.getAlpha() == 1.0f) {
                    MessageMomentExpandItemLivePhotoView.this.f32877o.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$b */
    public class C8724b implements ga1 {
        public C8724b() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            MessageMomentExpandItemLivePhotoView.this.m50607V(true);
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                MessageMomentExpandItemLivePhotoView.this.m50607V(true);
            } else {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
            }
            MessageMomentExpandItemLivePhotoView.this.m50599Y(false);
        }

        @Override // p153l.ga1
        public void success() {
            MessageMomentExpandItemLivePhotoView.this.m50599Y(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$c */
    public class C8725c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f32882a;

        public C8725c(float f) {
            this.f32882a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f32882a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$d */
    public class C8726d implements ie80.InterfaceC17709a {
        public C8726d() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            MessageMomentExpandItemLivePhotoView.this.m50611a0();
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32873k.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45233a(exc);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32873k.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45234b(i);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: c */
        public void mo45235c() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32873k.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45235c();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            mo45237e();
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32873k.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45236d();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: e */
        public void mo45237e() {
            MessageMomentExpandItemLivePhotoView.this.f32876n = false;
            MessageMomentExpandItemLivePhotoView.this.f32868f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }

        @Override // p153l.ie80.InterfaceC17709a
        /* JADX INFO: renamed from: f */
        public Video mo45238f() {
            return MessageMomentExpandItemLivePhotoView.this.f32875m;
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: g */
        public void mo45239g() {
        }

        @Override // p153l.ie80.InterfaceC17709a
        public Surface getSurface() {
            return MessageMomentExpandItemLivePhotoView.this.f32874l;
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onComplete() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32873k.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onComplete();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onPause() {
            MessageMomentExpandItemLivePhotoView.this.f32876n = false;
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32873k.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onPause();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onResume() {
            if (MessageMomentExpandItemLivePhotoView.this.f32868f.getAlpha() > 0.0f) {
                MessageMomentExpandItemLivePhotoView.this.f32868f.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32873k.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onResume();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onStart() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32873k.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onStart();
            }
        }
    }

    public MessageMomentExpandItemLivePhotoView(Context context) {
        super(context);
        this.f32872j = new C8726d();
        this.f32873k = new HashSet();
        this.f32879q = new C8724b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m50599Y(boolean z) {
        if (this.f32874l == null) {
            Runnable runnable = this.f32878p;
            if (runnable == null) {
                this.f32878p = new Runnable() { // from class: l.k000
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f123348a.m50606T();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f32878p, 10000L);
        }
        if (NullChecker.m82486a(this.f32877o) && NullChecker.m82486a(this.f32875m)) {
            this.f32876n = true;
            if (NullChecker.m82486a(this.f32874l)) {
                this.f32877o.mo139594d(this.f32872j, z);
            } else {
                this.f32872j.mo45235c();
            }
        }
    }

    private void init() {
        this.f32877o = new ye80();
        m50607V(m50604R());
        this.f32867e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC8723a());
    }

    /* JADX INFO: renamed from: Q */
    public final void m50603Q(View view) {
        l000.m152241a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m50604R() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("livephoto_function");
            if (!TextUtils.isEmpty(strM80485F)) {
                new JSONObject(strM80485F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public boolean m50605S() {
        return this.f32876n;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m50606T() {
        if (this.f32874l == null && NullChecker.m82486a(this.f32872j)) {
            this.f32872j.mo45236d();
            Iterator<ie80.InterfaceC17710b> it = this.f32873k.iterator();
            while (it.hasNext()) {
                it.next().mo45236d();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m50607V(boolean z) {
        ie80 ie80Var = this.f32877o;
        if (ie80Var == null) {
            return;
        }
        ie80Var.mute(z);
    }

    /* JADX INFO: renamed from: W */
    public void m50608W() {
        removeCallbacks(this.f32878p);
        this.f32876n = false;
        if (NullChecker.m82486a(this.f32877o)) {
            this.f32877o.pause();
        }
        pb1.m171472b().mo171473a(f32865r);
    }

    /* JADX INFO: renamed from: X */
    public void m50609X() {
        pb1.m171472b().mo171477f(f32865r, AudioBusinessType.NORMAL, this.f32879q);
    }

    /* JADX INFO: renamed from: Z */
    public void m50610Z(Video video) {
        if (this.f32876n) {
            m50611a0();
        }
        this.f32875m = video;
        uqb0.f180374G.m98798o(this.f32868f);
        Picture pictureCover = video.cover();
        if (NullChecker.m82486a(pictureCover) && NullChecker.m82487b(pictureCover.url)) {
            uqb0.f180374G.m127096B0(this.f32868f, pictureCover.aspectRatioBiggest());
        } else {
            this.f32868f.setBackgroundColor(getResources().getColor(g9c0.f102809a));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m50611a0() {
        removeCallbacks(this.f32878p);
        this.f32876n = false;
        if (NullChecker.m82486a(this.f32877o)) {
            this.f32877o.stop();
        }
        pb1.m171472b().mo171473a(f32865r);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: b0 */
    public void m50612b0(int i, int i2) {
        Dimension dimension;
        Video video = this.f32875m;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82487b(this.f32875m.size)) {
                    dimension = this.f32875m.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
                    }
                } else {
                    dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
                }
            }
        } else if (NullChecker.m82487b(this.f32875m.size)) {
            dimension = this.f32875m.size;
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
        this.f32867e.setTransform(matrix);
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50603Q(this);
        init();
    }

    public void setRadius(float f) {
        if (NullChecker.m82487b(this.f32867e)) {
            C8725c c8725c = new C8725c(f);
            this.f32867e.setOutlineProvider(c8725c);
            this.f32867e.setClipToOutline(true);
            this.f32868f.setOutlineProvider(c8725c);
            this.f32868f.setClipToOutline(true);
        }
    }

    public MessageMomentExpandItemLivePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32872j = new C8726d();
        this.f32873k = new HashSet();
        this.f32879q = new C8724b();
    }

    public MessageMomentExpandItemLivePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32872j = new C8726d();
        this.f32873k = new HashSet();
        this.f32879q = new C8724b();
    }
}
