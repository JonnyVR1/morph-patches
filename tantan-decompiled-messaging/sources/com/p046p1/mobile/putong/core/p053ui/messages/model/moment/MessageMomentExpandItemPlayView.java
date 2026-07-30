package com.p046p1.mobile.putong.core.p053ui.messages.model.moment;

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
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p149l.a1c0;
import p149l.c3c0;
import p149l.c680;
import p149l.ib1;
import p149l.osi0;
import p149l.qib0;
import p149l.s680;
import p149l.t100;
import p149l.trz;
import p149l.xdl0;
import p149l.z91;

/* JADX INFO: loaded from: classes3.dex */
public class MessageMomentExpandItemPlayView extends VRelative {

    /* JADX INFO: renamed from: s */
    public static final String f32042s = "MessageMomentExpandItemPlayView";

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemPlayView f32043d;

    /* JADX INFO: renamed from: e */
    public TextureView f32044e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32045f;

    /* JADX INFO: renamed from: g */
    public VImage f32046g;

    /* JADX INFO: renamed from: h */
    public VImage f32047h;

    /* JADX INFO: renamed from: i */
    public C8568d f32048i;

    /* JADX INFO: renamed from: j */
    public final Set<c680.InterfaceC16084b> f32049j;

    /* JADX INFO: renamed from: k */
    public Surface f32050k;

    /* JADX INFO: renamed from: l */
    public Video f32051l;

    /* JADX INFO: renamed from: m */
    public boolean f32052m;

    /* JADX INFO: renamed from: n */
    public boolean f32053n;

    /* JADX INFO: renamed from: o */
    public c680 f32054o;

    /* JADX INFO: renamed from: p */
    public Runnable f32055p;

    /* JADX INFO: renamed from: q */
    public View.OnClickListener f32056q;

    /* JADX INFO: renamed from: r */
    public final z91 f32057r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$a */
    public class TextureViewSurfaceTextureListenerC8565a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC8565a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            MessageMomentExpandItemPlayView.this.f32050k = new Surface(surfaceTexture);
            MessageMomentExpandItemPlayView messageMomentExpandItemPlayView = MessageMomentExpandItemPlayView.this;
            messageMomentExpandItemPlayView.removeCallbacks(messageMomentExpandItemPlayView.f32055p);
            if (MessageMomentExpandItemPlayView.this.m49451V()) {
                MessageMomentExpandItemPlayView.this.m49454b0();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            MessageMomentExpandItemPlayView.this.m49456g0();
            MessageMomentExpandItemPlayView.this.f32050k = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m81303a(MessageMomentExpandItemPlayView.this.f32054o) && MessageMomentExpandItemPlayView.this.m49451V()) {
                MessageMomentExpandItemPlayView.this.f32054o.mo105368c();
                if (MessageMomentExpandItemPlayView.this.f32045f.getAlpha() == 1.0f || MessageMomentExpandItemPlayView.this.f32047h.getAlpha() == 1.0f) {
                    MessageMomentExpandItemPlayView.this.f32054o.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$b */
    public class C8566b implements z91 {
        public C8566b() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            MessageMomentExpandItemPlayView.this.m49452Z(true);
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                MessageMomentExpandItemPlayView.this.m49452Z(true);
            } else {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
            }
            MessageMomentExpandItemPlayView.this.m49445c0(false);
        }

        @Override // p149l.z91
        public void success() {
            MessageMomentExpandItemPlayView.this.m49445c0(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$c */
    public class C8567c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f32060a;

        public C8567c(float f) {
            this.f32060a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f32060a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPlayView$d */
    public class C8568d implements c680.InterfaceC16083a {
        public C8568d() {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            MessageMomentExpandItemPlayView.this.m49456g0();
            Iterator it = MessageMomentExpandItemPlayView.this.f32049j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44050a(exc);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
            Iterator it = MessageMomentExpandItemPlayView.this.f32049j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44051b(i);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: c */
        public void mo44052c() {
            if (MessageMomentExpandItemPlayView.this.f32047h.getAlpha() < 1.0f) {
                MessageMomentExpandItemPlayView.this.f32047h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemPlayView.this.f32049j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44052c();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            mo44054e();
            Iterator it = MessageMomentExpandItemPlayView.this.f32049j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44053d();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: e */
        public void mo44054e() {
            MessageMomentExpandItemPlayView.this.f32052m = false;
            MessageMomentExpandItemPlayView.this.f32047h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            MessageMomentExpandItemPlayView.this.f32045f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }

        @Override // p149l.c680.InterfaceC16083a
        /* JADX INFO: renamed from: f */
        public Video mo44055f() {
            return MessageMomentExpandItemPlayView.this.f32051l;
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: g */
        public void mo44056g() {
        }

        @Override // p149l.c680.InterfaceC16083a
        public Surface getSurface() {
            return MessageMomentExpandItemPlayView.this.f32050k;
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onComplete() {
            Iterator it = MessageMomentExpandItemPlayView.this.f32049j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onComplete();
            }
            if (MessageMomentExpandItemPlayView.this.f32053n) {
                MessageMomentExpandItemPlayView.this.m49445c0(true);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onPause() {
            MessageMomentExpandItemPlayView.this.f32052m = false;
            MessageMomentExpandItemPlayView.this.f32047h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            Iterator it = MessageMomentExpandItemPlayView.this.f32049j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onPause();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onResume() {
            MessageMomentExpandItemPlayView.this.f32047h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (MessageMomentExpandItemPlayView.this.f32045f.getAlpha() > 0.0f) {
                MessageMomentExpandItemPlayView.this.f32045f.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = MessageMomentExpandItemPlayView.this.f32049j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onResume();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onStart() {
            Iterator it = MessageMomentExpandItemPlayView.this.f32049j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onStart();
            }
        }
    }

    public MessageMomentExpandItemPlayView(Context context) {
        super(context);
        this.f32048i = new C8568d();
        this.f32049j = new HashSet();
        this.f32056q = new View.OnClickListener() { // from class: l.qrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156074a.m49443X(view);
            }
        };
        this.f32057r = new C8566b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m49442W(View view) {
        if (!m49450T()) {
            m49452Z(true);
            return;
        }
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (NullChecker.m81303a(audioBusinessTypeMo135235c) && audioBusinessTypeMo135235c.isHighLevelBusiness()) {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
        } else {
            m49452Z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m49443X(View view) {
        if (m49451V()) {
            m49453a0();
        } else {
            m49454b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m49444Y() {
        if (this.f32050k == null && NullChecker.m81303a(this.f32048i)) {
            this.f32048i.mo44053d();
            Iterator<c680.InterfaceC16084b> it = this.f32049j.iterator();
            while (it.hasNext()) {
                it.next().mo44053d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public void m49445c0(boolean z) {
        if (this.f32050k == null) {
            Runnable runnable = this.f32055p;
            if (runnable == null) {
                this.f32055p = new Runnable() { // from class: l.srz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f166152a.m49444Y();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f32055p, 10000L);
        }
        if (NullChecker.m81303a(this.f32054o) && NullChecker.m81303a(this.f32051l)) {
            this.f32052m = true;
            if (NullChecker.m81303a(this.f32050k)) {
                this.f32054o.mo105369d(this.f32048i, z);
            } else {
                this.f32048i.mo44052c();
            }
        }
    }

    private void init() {
        this.f32054o = new s680();
        m49452Z(true);
        this.f32047h.setOnClickListener(this.f32056q);
        xdl0.m208329E0(this.f32046g, new View.OnClickListener() { // from class: l.rrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160798a.m49442W(view);
            }
        });
        this.f32044e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC8565a());
    }

    /* JADX INFO: renamed from: S */
    public final void m49449S(View view) {
        trz.m190467a(this, view);
    }

    /* JADX INFO: renamed from: T */
    public boolean m49450T() {
        c680 c680Var = this.f32054o;
        if (c680Var == null) {
            return false;
        }
        return c680Var.mo105370e();
    }

    /* JADX INFO: renamed from: V */
    public boolean m49451V() {
        return this.f32052m;
    }

    /* JADX INFO: renamed from: Z */
    public void m49452Z(boolean z) {
        c680 c680Var = this.f32054o;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
        this.f32046g.setImageResource(z ? c3c0.f78489C3 : c3c0.f78516F3);
    }

    /* JADX INFO: renamed from: a0 */
    public void m49453a0() {
        removeCallbacks(this.f32055p);
        this.f32052m = false;
        if (NullChecker.m81303a(this.f32054o)) {
            this.f32054o.pause();
        }
        ib1.m135233b().mo135234a(f32042s);
    }

    /* JADX INFO: renamed from: b0 */
    public void m49454b0() {
        ib1.m135233b().mo135238f(f32042s, AudioBusinessType.NORMAL, this.f32057r);
    }

    /* JADX INFO: renamed from: e0 */
    public void m49455e0(Video video) {
        if (this.f32052m) {
            m49456g0();
        }
        this.f32051l = video;
        qib0.f154691G.m184725o(this.f32045f);
        Picture pictureCover = video.cover();
        if (NullChecker.m81303a(pictureCover) && NullChecker.m81304b(pictureCover.url)) {
            qib0.f154691G.m102312B0(this.f32045f, pictureCover.aspectRatioBiggest());
        } else {
            this.f32045f.setBackgroundColor(getResources().getColor(a1c0.f67145a));
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m49456g0() {
        removeCallbacks(this.f32055p);
        this.f32052m = false;
        if (NullChecker.m81303a(this.f32054o)) {
            this.f32054o.stop();
        }
        ib1.m135233b().mo135234a(f32042s);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: h0 */
    public void m49457h0(int i, int i2) {
        Dimension dimension;
        Video video = this.f32051l;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81304b(this.f32051l.size)) {
                    dimension = this.f32051l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
                    }
                } else {
                    dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
                }
            }
        } else if (NullChecker.m81304b(this.f32051l.size)) {
            dimension = this.f32051l.size;
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
        this.f32044e.setTransform(matrix);
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49449S(this);
        init();
    }

    public void setLoopMode(boolean z) {
        this.f32053n = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m81304b(this.f32044e)) {
            C8567c c8567c = new C8567c(f);
            this.f32044e.setOutlineProvider(c8567c);
            this.f32044e.setClipToOutline(true);
            this.f32045f.setOutlineProvider(c8567c);
            this.f32045f.setClipToOutline(true);
        }
    }

    public MessageMomentExpandItemPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32048i = new C8568d();
        this.f32049j = new HashSet();
        this.f32056q = new View.OnClickListener() { // from class: l.qrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156074a.m49443X(view);
            }
        };
        this.f32057r = new C8566b();
    }

    public MessageMomentExpandItemPlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32048i = new C8568d();
        this.f32049j = new HashSet();
        this.f32056q = new View.OnClickListener() { // from class: l.qrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156074a.m49443X(view);
            }
        };
        this.f32057r = new C8566b();
    }
}
