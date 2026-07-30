package com.p051p1.mobile.putong.core.p058ui;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.g9c0;
import p153l.ga1;
import p153l.ie80;
import p153l.o1j0;
import p153l.oh80;
import p153l.p9r;
import p153l.pb1;
import p153l.r1j0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes6.dex */
public class PlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public static final String f28955A = "PlayerView";

    /* JADX INFO: renamed from: a */
    public TextureView f28956a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28957b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f28958c;

    /* JADX INFO: renamed from: d */
    public VLinear f28959d;

    /* JADX INFO: renamed from: e */
    public VText f28960e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f28961f;

    /* JADX INFO: renamed from: g */
    public VText f28962g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f28963h;

    /* JADX INFO: renamed from: i */
    public ImageView f28964i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f28965j;

    /* JADX INFO: renamed from: k */
    public ImageView f28966k;

    /* JADX INFO: renamed from: l */
    public ImageView f28967l;

    /* JADX INFO: renamed from: m */
    public VText f28968m;

    /* JADX INFO: renamed from: n */
    public TextView f28969n;

    /* JADX INFO: renamed from: o */
    public C8436d f28970o;

    /* JADX INFO: renamed from: p */
    public final Set<ie80.InterfaceC17710b> f28971p;

    /* JADX INFO: renamed from: q */
    public Surface f28972q;

    /* JADX INFO: renamed from: r */
    public Video f28973r;

    /* JADX INFO: renamed from: s */
    public boolean f28974s;

    /* JADX INFO: renamed from: t */
    public ie80 f28975t;

    /* JADX INFO: renamed from: u */
    public boolean f28976u;

    /* JADX INFO: renamed from: v */
    public boolean f28977v;

    /* JADX INFO: renamed from: w */
    public boolean f28978w;

    /* JADX INFO: renamed from: x */
    public boolean f28979x;

    /* JADX INFO: renamed from: y */
    public final ga1 f28980y;

    /* JADX INFO: renamed from: z */
    public Runnable f28981z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PlayerView$a */
    public class TextureViewSurfaceTextureListenerC8433a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC8433a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PlayerView.this.f28972q = new Surface(surfaceTexture);
            PlayerView playerView = PlayerView.this;
            playerView.removeCallbacks(playerView.f28981z);
            if (PlayerView.this.m45219C()) {
                PlayerView.this.m45225K();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PlayerView.this.m45228N();
            PlayerView.this.f28972q = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m82486a(PlayerView.this.f28975t) && PlayerView.this.m45219C()) {
                PlayerView.this.f28975t.mo139593c();
                if (PlayerView.this.f28957b.getAlpha() == 1.0f || PlayerView.this.f28963h.getAlpha() == 1.0f) {
                    PlayerView.this.f28975t.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PlayerView$b */
    public class C8434b implements ga1 {
        public C8434b() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            PlayerView.this.m45228N();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
                return;
            }
            pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
            PlayerView playerView = PlayerView.this;
            playerView.m45223I(playerView.f28979x);
        }

        @Override // p153l.ga1
        public void success() {
            PlayerView playerView = PlayerView.this;
            playerView.m45223I(playerView.f28979x);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PlayerView$c */
    public class C8435c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f28984a;

        public C8435c(float f) {
            this.f28984a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f28984a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PlayerView$d */
    public class C8436d implements ie80.InterfaceC17709a {
        public C8436d() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            PlayerView.this.m45228N();
            Iterator it = PlayerView.this.f28971p.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45233a(exc);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
            if (PlayerView.this.f28976u) {
                int max = (int) (((i / 1000.0f) / PlayerView.this.f28973r.duration) * PlayerView.this.f28958c.getMax());
                PlayerView.this.f28958c.setProgress(max);
                PlayerView.this.f28961f.setProgress(max);
                PlayerView playerView = PlayerView.this;
                playerView.f28960e.setText(playerView.m45196A(i));
            }
            Iterator it = PlayerView.this.f28971p.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45234b(i);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: c */
        public void mo45235c() {
            PlayerView.this.m45218y(edc0.f93276S1);
            if (PlayerView.this.f28963h.getAlpha() < 1.0f) {
                PlayerView.this.f28963h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PlayerView.this.f28971p.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45235c();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            mo45237e();
            Iterator it = PlayerView.this.f28971p.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45236d();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: e */
        public void mo45237e() {
            PlayerView.this.f28974s = false;
            PlayerView.this.m45218y(edc0.f93396k3);
            PlayerView.this.f28963h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PlayerView.this.f28957b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f28976u) {
                PlayerView.this.f28958c.setProgress(0);
                PlayerView.this.f28961f.setProgress(0);
                PlayerView.this.f28958c.setVisibility(8);
                PlayerView.this.f28959d.setVisibility(8);
            }
        }

        @Override // p153l.ie80.InterfaceC17709a
        /* JADX INFO: renamed from: f */
        public Video mo45238f() {
            return PlayerView.this.f28973r;
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: g */
        public void mo45239g() {
        }

        @Override // p153l.ie80.InterfaceC17709a
        public Surface getSurface() {
            return PlayerView.this.f28972q;
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onComplete() {
            if (PlayerView.this.f28977v) {
                PlayerView.this.m45226L(true);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onPause() {
            PlayerView.this.f28974s = false;
            PlayerView.this.m45218y(edc0.f93396k3);
            PlayerView.this.f28963h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f28976u) {
                PlayerView.this.f28959d.setVisibility(0);
                PlayerView.this.f28958c.setVisibility(8);
            }
            Iterator it = PlayerView.this.f28971p.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onPause();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onResume() {
            PlayerView.this.m45218y(edc0.f93289U2);
            PlayerView.this.f28963h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f28957b.getAlpha() > 0.0f) {
                PlayerView.this.f28957b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PlayerView.this.f28976u) {
                PlayerView.this.f28958c.setVisibility(0);
                PlayerView.this.f28959d.setVisibility(8);
            }
            Iterator it = PlayerView.this.f28971p.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onResume();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onStart() {
            Iterator it = PlayerView.this.f28971p.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onStart();
            }
        }
    }

    public PlayerView(@NonNull Context context) {
        super(context);
        this.f28970o = new C8436d();
        this.f28971p = new HashSet();
        this.f28980y = new C8434b();
        m45197B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public String m45196A(int i) {
        boolean z = (((int) this.f28973r.duration) / 60) / 60 > 0;
        DecimalFormat decimalFormat = new DecimalFormat("00");
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 % 60;
        int i6 = i4 / 60;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(i6);
            sb.append(':');
        }
        sb.append(z ? decimalFormat.format(i5) : String.valueOf(i5));
        sb.append(':');
        sb.append(decimalFormat.format(i3));
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    private void m45197B() {
        m45229u(p9r.m171370a(getContext()), this);
        setOnClickListener(new View.OnClickListener() { // from class: l.ch80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81771a.m45198E(view);
            }
        });
        this.f28963h.setOnClickListener(new View.OnClickListener() { // from class: l.fh80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99019a.m45199F(view);
            }
        });
        this.f28956a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC8433a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m45198E(View view) {
        m45232z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m45199F(View view) {
        if (m45219C()) {
            m45224J();
        } else {
            m45225K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: w */
    private void m45217w() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f28973r) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82486a(picture) && NullChecker.m82486a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82486a(this.f28973r.size)) {
                    dimension = this.f28973r.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82486a(this.f28973r.size)) {
            dimension = this.f28973r.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        float f2 = width;
        float f3 = height;
        if (f2 / f3 > f) {
            width = (int) (f3 * f);
        } else {
            height = (int) (f2 / f);
        }
        ViewGroup.LayoutParams layoutParams = this.f28957b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f28957b.post(new Runnable() { // from class: l.zg80
            @Override // java.lang.Runnable
            public final void run() {
                this.f204278a.m45220D();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m45218y(int i) {
        for (int i2 = 0; i2 < this.f28963h.getChildCount(); i2++) {
            View childAt = this.f28963h.getChildAt(i2);
            if (this.f28978w) {
                bnl0.m105525M0(childAt, (i != childAt.getId() || i == edc0.f93289U2 || i == edc0.f93276S1) ? false : true);
            } else {
                bnl0.m105525M0(childAt, i == childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m45219C() {
        return this.f28974s;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m45220D() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m45221G() {
        if (this.f28972q == null && NullChecker.m82486a(this.f28970o)) {
            if (!this.f28978w) {
                o1j0.m165634h(R$string.f21488E5);
            }
            this.f28970o.mo45236d();
            Iterator<ie80.InterfaceC17710b> it = this.f28971p.iterator();
            while (it.hasNext()) {
                it.next().mo45236d();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m45222H(boolean z) {
        ie80 ie80Var = this.f28975t;
        if (ie80Var == null) {
            return;
        }
        ie80Var.mute(z);
    }

    /* JADX INFO: renamed from: I */
    public final void m45223I(boolean z) {
        if (this.f28972q == null) {
            Runnable runnable = this.f28981z;
            if (runnable == null) {
                this.f28981z = new Runnable() { // from class: l.ih80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f114877a.m45221G();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f28981z, 10000L);
        }
        if (NullChecker.m82486a(this.f28975t) && NullChecker.m82486a(this.f28973r)) {
            this.f28974s = true;
            if (NullChecker.m82486a(this.f28972q)) {
                this.f28975t.mo139594d(this.f28970o, z);
            } else {
                this.f28970o.mo45235c();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m45224J() {
        pb1.m171472b().mo171476e(f28955A);
        removeCallbacks(this.f28981z);
        this.f28974s = false;
        if (NullChecker.m82486a(this.f28975t)) {
            this.f28975t.pause();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m45225K() {
        m45226L(false);
    }

    /* JADX INFO: renamed from: L */
    public void m45226L(boolean z) {
        this.f28979x = z;
        pb1.m171472b().mo171477f(f28955A, AudioBusinessType.NORMAL, this.f28980y);
    }

    /* JADX INFO: renamed from: M */
    public void m45227M(Video video, boolean z) {
        if (this.f28974s) {
            m45228N();
        }
        this.f28973r = video;
        uqb0.f180374G.m98798o(this.f28957b);
        if (NullChecker.m82486a(video)) {
            if (this.f28976u) {
                this.f28960e.setText(m45196A(0));
                this.f28962g.setText(m45196A((int) (video.duration * 1000.0f)));
                this.f28958c.setProgress(0);
                this.f28961f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.m82486a(pictureCover) && NullChecker.m82486a(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        uqb0.f180374G.m127096B0(this.f28957b, pictureCover.aspectRatioBiggest());
                    } else {
                        uqb0.f180374G.m127146i0(this.f28957b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f28957b.setBackgroundColor(getResources().getColor(g9c0.f102809a));
                } else {
                    uqb0.f180374G.m127146i0(this.f28957b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: N */
    public void m45228N() {
        pb1.m171472b().mo171476e(f28955A);
        removeCallbacks(this.f28981z);
        this.f28974s = false;
        if (NullChecker.m82486a(this.f28975t)) {
            this.f28975t.stop();
        }
    }

    public ImageView getVoiceView() {
        return this.f28967l;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m45217w();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m82486a(this.f28975t)) {
            this.f28975t.mo139596f(true);
        }
    }

    public void setLoopMode(boolean z) {
        this.f28977v = z;
    }

    public void setPlayer(ie80 ie80Var) {
        this.f28975t = ie80Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f28976u = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m82486a(this.f28956a)) {
            C8435c c8435c = new C8435c(f);
            this.f28956a.setOutlineProvider(c8435c);
            this.f28956a.setClipToOutline(true);
            this.f28957b.setOutlineProvider(c8435c);
            this.f28957b.setClipToOutline(true);
        }
    }

    public void setReplayClick(View.OnClickListener onClickListener) {
        this.f28969n.setOnClickListener(onClickListener);
    }

    public void setReplayVisibility(int i) {
        this.f28969n.setVisibility(i);
    }

    public void setText(String str) {
        this.f28968m.setText(str);
    }

    public void setVideo(Video video) {
        m45227M(video, false);
    }

    /* JADX INFO: renamed from: u */
    public View m45229u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oh80.m167693b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public void m45230v(ie80.InterfaceC17710b interfaceC17710b) {
        this.f28971p.add(interfaceC17710b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: x */
    public void m45231x(int i, int i2) {
        Dimension dimension;
        Video video = this.f28973r;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82487b(this.f28973r.size)) {
                    dimension = this.f28973r.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82487b(this.f28973r.size)) {
            dimension = this.f28973r.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 > f) {
            i = (int) (f3 * f);
        } else {
            i2 = (int) (f2 / f);
        }
        ViewGroup.LayoutParams layoutParams = this.f28957b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f28957b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    public void m45232z() {
        this.f28963h.setVisibility(0);
        if (m45219C()) {
            m45224J();
        } else {
            m45225K();
        }
    }

    public PlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f28970o = new C8436d();
        this.f28971p = new HashSet();
        this.f28980y = new C8434b();
        m45197B();
    }
}
