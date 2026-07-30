package com.p046p1.mobile.putong.core.p053ui;

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
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p149l.a1c0;
import p149l.c680;
import p149l.i980;
import p149l.ib1;
import p149l.lsi0;
import p149l.o7r;
import p149l.osi0;
import p149l.qib0;
import p149l.xdl0;
import p149l.y4c0;
import p149l.z91;

/* JADX INFO: loaded from: classes6.dex */
public class PlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: A */
    public static final String f28107A = "PlayerView";

    /* JADX INFO: renamed from: a */
    public TextureView f28108a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28109b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f28110c;

    /* JADX INFO: renamed from: d */
    public VLinear f28111d;

    /* JADX INFO: renamed from: e */
    public VText f28112e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f28113f;

    /* JADX INFO: renamed from: g */
    public VText f28114g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f28115h;

    /* JADX INFO: renamed from: i */
    public ImageView f28116i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f28117j;

    /* JADX INFO: renamed from: k */
    public ImageView f28118k;

    /* JADX INFO: renamed from: l */
    public ImageView f28119l;

    /* JADX INFO: renamed from: m */
    public VText f28120m;

    /* JADX INFO: renamed from: n */
    public TextView f28121n;

    /* JADX INFO: renamed from: o */
    public C8273d f28122o;

    /* JADX INFO: renamed from: p */
    public final Set<c680.InterfaceC16084b> f28123p;

    /* JADX INFO: renamed from: q */
    public Surface f28124q;

    /* JADX INFO: renamed from: r */
    public Video f28125r;

    /* JADX INFO: renamed from: s */
    public boolean f28126s;

    /* JADX INFO: renamed from: t */
    public c680 f28127t;

    /* JADX INFO: renamed from: u */
    public boolean f28128u;

    /* JADX INFO: renamed from: v */
    public boolean f28129v;

    /* JADX INFO: renamed from: w */
    public boolean f28130w;

    /* JADX INFO: renamed from: x */
    public boolean f28131x;

    /* JADX INFO: renamed from: y */
    public final z91 f28132y;

    /* JADX INFO: renamed from: z */
    public Runnable f28133z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PlayerView$a */
    public class TextureViewSurfaceTextureListenerC8270a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC8270a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PlayerView.this.f28124q = new Surface(surfaceTexture);
            PlayerView playerView = PlayerView.this;
            playerView.removeCallbacks(playerView.f28133z);
            if (PlayerView.this.m44036C()) {
                PlayerView.this.m44042K();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PlayerView.this.m44045N();
            PlayerView.this.f28124q = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m81303a(PlayerView.this.f28127t) && PlayerView.this.m44036C()) {
                PlayerView.this.f28127t.mo105368c();
                if (PlayerView.this.f28109b.getAlpha() == 1.0f || PlayerView.this.f28115h.getAlpha() == 1.0f) {
                    PlayerView.this.f28127t.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PlayerView$b */
    public class C8271b implements z91 {
        public C8271b() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            PlayerView.this.m44045N();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
                return;
            }
            ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
            PlayerView playerView = PlayerView.this;
            playerView.m44040I(playerView.f28131x);
        }

        @Override // p149l.z91
        public void success() {
            PlayerView playerView = PlayerView.this;
            playerView.m44040I(playerView.f28131x);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PlayerView$c */
    public class C8272c extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f28136a;

        public C8272c(float f) {
            this.f28136a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f28136a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.PlayerView$d */
    public class C8273d implements c680.InterfaceC16083a {
        public C8273d() {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            PlayerView.this.m44045N();
            Iterator it = PlayerView.this.f28123p.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44050a(exc);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
            if (PlayerView.this.f28128u) {
                int max = (int) (((i / 1000.0f) / PlayerView.this.f28125r.duration) * PlayerView.this.f28110c.getMax());
                PlayerView.this.f28110c.setProgress(max);
                PlayerView.this.f28113f.setProgress(max);
                PlayerView playerView = PlayerView.this;
                playerView.f28112e.setText(playerView.m44013A(i));
            }
            Iterator it = PlayerView.this.f28123p.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44051b(i);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: c */
        public void mo44052c() {
            PlayerView.this.m44035y(y4c0.f196041S1);
            if (PlayerView.this.f28115h.getAlpha() < 1.0f) {
                PlayerView.this.f28115h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PlayerView.this.f28123p.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44052c();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            mo44054e();
            Iterator it = PlayerView.this.f28123p.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44053d();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: e */
        public void mo44054e() {
            PlayerView.this.f28126s = false;
            PlayerView.this.m44035y(y4c0.f196161k3);
            PlayerView.this.f28115h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PlayerView.this.f28109b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f28128u) {
                PlayerView.this.f28110c.setProgress(0);
                PlayerView.this.f28113f.setProgress(0);
                PlayerView.this.f28110c.setVisibility(8);
                PlayerView.this.f28111d.setVisibility(8);
            }
        }

        @Override // p149l.c680.InterfaceC16083a
        /* JADX INFO: renamed from: f */
        public Video mo44055f() {
            return PlayerView.this.f28125r;
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: g */
        public void mo44056g() {
        }

        @Override // p149l.c680.InterfaceC16083a
        public Surface getSurface() {
            return PlayerView.this.f28124q;
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onComplete() {
            if (PlayerView.this.f28129v) {
                PlayerView.this.m44043L(true);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onPause() {
            PlayerView.this.f28126s = false;
            PlayerView.this.m44035y(y4c0.f196161k3);
            PlayerView.this.f28115h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f28128u) {
                PlayerView.this.f28111d.setVisibility(0);
                PlayerView.this.f28110c.setVisibility(8);
            }
            Iterator it = PlayerView.this.f28123p.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onPause();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onResume() {
            PlayerView.this.m44035y(y4c0.f196054U2);
            PlayerView.this.f28115h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f28109b.getAlpha() > 0.0f) {
                PlayerView.this.f28109b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PlayerView.this.f28128u) {
                PlayerView.this.f28110c.setVisibility(0);
                PlayerView.this.f28111d.setVisibility(8);
            }
            Iterator it = PlayerView.this.f28123p.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onResume();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onStart() {
            Iterator it = PlayerView.this.f28123p.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onStart();
            }
        }
    }

    public PlayerView(@NonNull Context context) {
        super(context);
        this.f28122o = new C8273d();
        this.f28123p = new HashSet();
        this.f28132y = new C8271b();
        m44014B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public String m44013A(int i) {
        boolean z = (((int) this.f28125r.duration) / 60) / 60 > 0;
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
    private void m44014B() {
        m44046u(o7r.m163037a(getContext()), this);
        setOnClickListener(new View.OnClickListener() { // from class: l.w880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185167a.m44015E(view);
            }
        });
        this.f28115h.setOnClickListener(new View.OnClickListener() { // from class: l.z880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202110a.m44016F(view);
            }
        });
        this.f28108a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC8270a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m44015E(View view) {
        m44049z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m44016F(View view) {
        if (m44036C()) {
            m44041J();
        } else {
            m44042K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: w */
    private void m44034w() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f28125r) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81303a(picture) && NullChecker.m81303a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81303a(this.f28125r.size)) {
                    dimension = this.f28125r.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81303a(this.f28125r.size)) {
            dimension = this.f28125r.size;
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
        ViewGroup.LayoutParams layoutParams = this.f28109b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f28109b.post(new Runnable() { // from class: l.t880
            @Override // java.lang.Runnable
            public final void run() {
                this.f168808a.m44037D();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m44035y(int i) {
        for (int i2 = 0; i2 < this.f28115h.getChildCount(); i2++) {
            View childAt = this.f28115h.getChildAt(i2);
            if (this.f28130w) {
                xdl0.m208345M0(childAt, (i != childAt.getId() || i == y4c0.f196054U2 || i == y4c0.f196041S1) ? false : true);
            } else {
                xdl0.m208345M0(childAt, i == childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m44036C() {
        return this.f28126s;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m44037D() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m44038G() {
        if (this.f28124q == null && NullChecker.m81303a(this.f28122o)) {
            if (!this.f28130w) {
                lsi0.m151578h(R$string.f20746E5);
            }
            this.f28122o.mo44053d();
            Iterator<c680.InterfaceC16084b> it = this.f28123p.iterator();
            while (it.hasNext()) {
                it.next().mo44053d();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m44039H(boolean z) {
        c680 c680Var = this.f28127t;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
    }

    /* JADX INFO: renamed from: I */
    public final void m44040I(boolean z) {
        if (this.f28124q == null) {
            Runnable runnable = this.f28133z;
            if (runnable == null) {
                this.f28133z = new Runnable() { // from class: l.c980
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f79870a.m44038G();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f28133z, 10000L);
        }
        if (NullChecker.m81303a(this.f28127t) && NullChecker.m81303a(this.f28125r)) {
            this.f28126s = true;
            if (NullChecker.m81303a(this.f28124q)) {
                this.f28127t.mo105369d(this.f28122o, z);
            } else {
                this.f28122o.mo44052c();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m44041J() {
        ib1.m135233b().mo135237e(f28107A);
        removeCallbacks(this.f28133z);
        this.f28126s = false;
        if (NullChecker.m81303a(this.f28127t)) {
            this.f28127t.pause();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m44042K() {
        m44043L(false);
    }

    /* JADX INFO: renamed from: L */
    public void m44043L(boolean z) {
        this.f28131x = z;
        ib1.m135233b().mo135238f(f28107A, AudioBusinessType.NORMAL, this.f28132y);
    }

    /* JADX INFO: renamed from: M */
    public void m44044M(Video video, boolean z) {
        if (this.f28126s) {
            m44045N();
        }
        this.f28125r = video;
        qib0.f154691G.m184725o(this.f28109b);
        if (NullChecker.m81303a(video)) {
            if (this.f28128u) {
                this.f28112e.setText(m44013A(0));
                this.f28114g.setText(m44013A((int) (video.duration * 1000.0f)));
                this.f28110c.setProgress(0);
                this.f28113f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.m81303a(pictureCover) && NullChecker.m81303a(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        qib0.f154691G.m102312B0(this.f28109b, pictureCover.aspectRatioBiggest());
                    } else {
                        qib0.f154691G.m102363i0(this.f28109b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f28109b.setBackgroundColor(getResources().getColor(a1c0.f67145a));
                } else {
                    qib0.f154691G.m102363i0(this.f28109b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: N */
    public void m44045N() {
        ib1.m135233b().mo135237e(f28107A);
        removeCallbacks(this.f28133z);
        this.f28126s = false;
        if (NullChecker.m81303a(this.f28127t)) {
            this.f28127t.stop();
        }
    }

    public ImageView getVoiceView() {
        return this.f28119l;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m44034w();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m81303a(this.f28127t)) {
            this.f28127t.mo105371f(true);
        }
    }

    public void setLoopMode(boolean z) {
        this.f28129v = z;
    }

    public void setPlayer(c680 c680Var) {
        this.f28127t = c680Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f28128u = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m81303a(this.f28108a)) {
            C8272c c8272c = new C8272c(f);
            this.f28108a.setOutlineProvider(c8272c);
            this.f28108a.setClipToOutline(true);
            this.f28109b.setOutlineProvider(c8272c);
            this.f28109b.setClipToOutline(true);
        }
    }

    public void setReplayClick(View.OnClickListener onClickListener) {
        this.f28121n.setOnClickListener(onClickListener);
    }

    public void setReplayVisibility(int i) {
        this.f28121n.setVisibility(i);
    }

    public void setText(String str) {
        this.f28120m.setText(str);
    }

    public void setVideo(Video video) {
        m44044M(video, false);
    }

    /* JADX INFO: renamed from: u */
    public View m44046u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i980.m135047b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public void m44047v(c680.InterfaceC16084b interfaceC16084b) {
        this.f28123p.add(interfaceC16084b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: x */
    public void m44048x(int i, int i2) {
        Dimension dimension;
        Video video = this.f28125r;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81304b(this.f28125r.size)) {
                    dimension = this.f28125r.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81304b(this.f28125r.size)) {
            dimension = this.f28125r.size;
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
        ViewGroup.LayoutParams layoutParams = this.f28109b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f28109b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: z */
    public void m44049z() {
        this.f28115h.setVisibility(0);
        if (m44036C()) {
            m44041J();
        } else {
            m44042K();
        }
    }

    public PlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f28122o = new C8273d();
        this.f28123p = new HashSet();
        this.f28132y = new C8271b();
        m44014B();
    }
}
