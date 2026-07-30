package com.p046p1.mobile.putong.core.p053ui.messages.model.moment;

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
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;
import p147v.VDraweeView;
import p147v.VRelative;
import p149l.a1c0;
import p149l.c680;
import p149l.ib1;
import p149l.orz;
import p149l.qib0;
import p149l.s680;
import p149l.t100;
import p149l.z91;

/* JADX INFO: loaded from: classes3.dex */
public class MessageMomentExpandItemLivePhotoView extends VRelative {

    /* JADX INFO: renamed from: r */
    public static final String f32017r = "MessageMomentExpandItemLivePhotoView";

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemLivePhotoView f32018d;

    /* JADX INFO: renamed from: e */
    public TextureView f32019e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32020f;

    /* JADX INFO: renamed from: g */
    public View f32021g;

    /* JADX INFO: renamed from: h */
    public View f32022h;

    /* JADX INFO: renamed from: i */
    public View f32023i;

    /* JADX INFO: renamed from: j */
    public C8563d f32024j;

    /* JADX INFO: renamed from: k */
    public final Set<c680.InterfaceC16084b> f32025k;

    /* JADX INFO: renamed from: l */
    public Surface f32026l;

    /* JADX INFO: renamed from: m */
    public Video f32027m;

    /* JADX INFO: renamed from: n */
    public boolean f32028n;

    /* JADX INFO: renamed from: o */
    public c680 f32029o;

    /* JADX INFO: renamed from: p */
    public Runnable f32030p;

    /* JADX INFO: renamed from: q */
    public final z91 f32031q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$a */
    public class TextureViewSurfaceTextureListenerC8560a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC8560a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            MessageMomentExpandItemLivePhotoView.this.f32026l = new Surface(surfaceTexture);
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView = MessageMomentExpandItemLivePhotoView.this;
            messageMomentExpandItemLivePhotoView.removeCallbacks(messageMomentExpandItemLivePhotoView.f32030p);
            if (MessageMomentExpandItemLivePhotoView.this.m49422S()) {
                MessageMomentExpandItemLivePhotoView.this.m49426X();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (MessageMomentExpandItemLivePhotoView.this.f32028n) {
                MessageMomentExpandItemLivePhotoView.this.m49428a0();
            }
            MessageMomentExpandItemLivePhotoView.this.f32026l = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m81303a(MessageMomentExpandItemLivePhotoView.this.f32029o) && MessageMomentExpandItemLivePhotoView.this.m49422S()) {
                MessageMomentExpandItemLivePhotoView.this.f32029o.mo105368c();
                if (MessageMomentExpandItemLivePhotoView.this.f32020f.getAlpha() == 1.0f) {
                    MessageMomentExpandItemLivePhotoView.this.f32029o.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$b */
    public class C8561b implements z91 {
        public C8561b() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            MessageMomentExpandItemLivePhotoView.this.m49424V(true);
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                MessageMomentExpandItemLivePhotoView.this.m49424V(true);
            } else {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
            }
            MessageMomentExpandItemLivePhotoView.this.m49416Y(false);
        }

        @Override // p149l.z91
        public void success() {
            MessageMomentExpandItemLivePhotoView.this.m49416Y(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$c */
    public class C8562c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f32034a;

        public C8562c(float f) {
            this.f32034a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f32034a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemLivePhotoView$d */
    public class C8563d implements c680.InterfaceC16083a {
        public C8563d() {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            MessageMomentExpandItemLivePhotoView.this.m49428a0();
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32025k.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44050a(exc);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32025k.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44051b(i);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: c */
        public void mo44052c() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32025k.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44052c();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            mo44054e();
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32025k.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44053d();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: e */
        public void mo44054e() {
            MessageMomentExpandItemLivePhotoView.this.f32028n = false;
            MessageMomentExpandItemLivePhotoView.this.f32020f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }

        @Override // p149l.c680.InterfaceC16083a
        /* JADX INFO: renamed from: f */
        public Video mo44055f() {
            return MessageMomentExpandItemLivePhotoView.this.f32027m;
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: g */
        public void mo44056g() {
        }

        @Override // p149l.c680.InterfaceC16083a
        public Surface getSurface() {
            return MessageMomentExpandItemLivePhotoView.this.f32026l;
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onComplete() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32025k.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onComplete();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onPause() {
            MessageMomentExpandItemLivePhotoView.this.f32028n = false;
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32025k.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onPause();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onResume() {
            if (MessageMomentExpandItemLivePhotoView.this.f32020f.getAlpha() > 0.0f) {
                MessageMomentExpandItemLivePhotoView.this.f32020f.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32025k.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onResume();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onStart() {
            Iterator it = MessageMomentExpandItemLivePhotoView.this.f32025k.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onStart();
            }
        }
    }

    public MessageMomentExpandItemLivePhotoView(Context context) {
        super(context);
        this.f32024j = new C8563d();
        this.f32025k = new HashSet();
        this.f32031q = new C8561b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m49416Y(boolean z) {
        if (this.f32026l == null) {
            Runnable runnable = this.f32030p;
            if (runnable == null) {
                this.f32030p = new Runnable() { // from class: l.nrz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f140231a.m49423T();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f32030p, 10000L);
        }
        if (NullChecker.m81303a(this.f32029o) && NullChecker.m81303a(this.f32027m)) {
            this.f32028n = true;
            if (NullChecker.m81303a(this.f32026l)) {
                this.f32029o.mo105369d(this.f32024j, z);
            } else {
                this.f32024j.mo44052c();
            }
        }
    }

    private void init() {
        this.f32029o = new s680();
        m49424V(m49421R());
        this.f32019e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC8560a());
    }

    /* JADX INFO: renamed from: Q */
    public final void m49420Q(View view) {
        orz.m165683a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m49421R() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("livephoto_function");
            if (!TextUtils.isEmpty(strM79302F)) {
                new JSONObject(strM79302F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public boolean m49422S() {
        return this.f32028n;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m49423T() {
        if (this.f32026l == null && NullChecker.m81303a(this.f32024j)) {
            this.f32024j.mo44053d();
            Iterator<c680.InterfaceC16084b> it = this.f32025k.iterator();
            while (it.hasNext()) {
                it.next().mo44053d();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m49424V(boolean z) {
        c680 c680Var = this.f32029o;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
    }

    /* JADX INFO: renamed from: W */
    public void m49425W() {
        removeCallbacks(this.f32030p);
        this.f32028n = false;
        if (NullChecker.m81303a(this.f32029o)) {
            this.f32029o.pause();
        }
        ib1.m135233b().mo135234a(f32017r);
    }

    /* JADX INFO: renamed from: X */
    public void m49426X() {
        ib1.m135233b().mo135238f(f32017r, AudioBusinessType.NORMAL, this.f32031q);
    }

    /* JADX INFO: renamed from: Z */
    public void m49427Z(Video video) {
        if (this.f32028n) {
            m49428a0();
        }
        this.f32027m = video;
        qib0.f154691G.m184725o(this.f32020f);
        Picture pictureCover = video.cover();
        if (NullChecker.m81303a(pictureCover) && NullChecker.m81304b(pictureCover.url)) {
            qib0.f154691G.m102312B0(this.f32020f, pictureCover.aspectRatioBiggest());
        } else {
            this.f32020f.setBackgroundColor(getResources().getColor(a1c0.f67145a));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m49428a0() {
        removeCallbacks(this.f32030p);
        this.f32028n = false;
        if (NullChecker.m81303a(this.f32029o)) {
            this.f32029o.stop();
        }
        ib1.m135233b().mo135234a(f32017r);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: b0 */
    public void m49429b0(int i, int i2) {
        Dimension dimension;
        Video video = this.f32027m;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81304b(this.f32027m.size)) {
                    dimension = this.f32027m.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
                    }
                } else {
                    dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
                }
            }
        } else if (NullChecker.m81304b(this.f32027m.size)) {
            dimension = this.f32027m.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
            }
        } else {
            dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
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
        this.f32019e.setTransform(matrix);
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49420Q(this);
        init();
    }

    public void setRadius(float f) {
        if (NullChecker.m81304b(this.f32019e)) {
            C8562c c8562c = new C8562c(f);
            this.f32019e.setOutlineProvider(c8562c);
            this.f32019e.setClipToOutline(true);
            this.f32020f.setOutlineProvider(c8562c);
            this.f32020f.setClipToOutline(true);
        }
    }

    public MessageMomentExpandItemLivePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32024j = new C8563d();
        this.f32025k = new HashSet();
        this.f32031q = new C8561b();
    }

    public MessageMomentExpandItemLivePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32024j = new C8563d();
        this.f32025k = new HashSet();
        this.f32031q = new C8561b();
    }
}
