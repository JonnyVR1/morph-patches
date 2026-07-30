package p002l;

import android.R;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer;
import l.e51;
import l.eat;
import l.gkh0;
import l.h30;
import l.s410;
import l.t100;
import l.u0t;
import l.uep0;
import l.v9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ew00 {

    /* JADX INFO: renamed from: a */
    public ViewGroup f9989a;

    /* JADX INFO: renamed from: b */
    public TextureView f9990b;

    /* JADX INFO: renamed from: c */
    public boolean f9991c;

    /* JADX INFO: renamed from: e */
    public int f9993e;

    /* JADX INFO: renamed from: f */
    public int f9994f;

    /* JADX INFO: renamed from: g */
    public boolean f9995g;

    /* JADX INFO: renamed from: h */
    public Surface f9996h;

    /* JADX INFO: renamed from: i */
    public int f9997i = -1;

    /* JADX INFO: renamed from: j */
    public h30<Boolean, Integer, Integer, Integer> f9998j = null;

    /* JADX INFO: renamed from: k */
    public Runnable f9999k = new RunnableC0551b();

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserver.OnGlobalLayoutListener f9992d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.dw00
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f9458a.m12736o();
        }
    };

    /* JADX INFO: renamed from: l.ew00$b */
    public class RunnableC0551b implements Runnable {
        public RunnableC0551b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ew00 ew00Var = ew00.this;
            if (ew00Var.f9993e == 0 || ew00Var.f9994f == 0) {
                return;
            }
            boolean zM12737p = ew00Var.m12737p();
            if (ew00.this.f9998j != null) {
                ew00.this.f9998j.b(Boolean.valueOf(zM12737p), Integer.valueOf(ew00.this.f9997i), Integer.valueOf(ew00.this.f9993e), Integer.valueOf(ew00.this.f9994f));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m12728h(@NonNull Context context, @NonNull Window window) {
        Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        View decorView = window.getDecorView();
        if (2 == context.getResources().getConfiguration().orientation) {
            return point.x != decorView.findViewById(R.id.content).getWidth();
        }
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        return rect.bottom != point.y;
    }

    /* JADX INFO: renamed from: g */
    public final void m12729g() {
        e51.J(this.f9999k);
        e51.H(App.e, this.f9999k, 2000L);
        gkh0.j(u0t.c, "first CTYP: " + this.f9997i + ", size = " + this.f9993e + " x " + this.f9994f);
    }

    /* JADX INFO: renamed from: i */
    public void m12730i() {
        ViewGroup viewGroup = this.f9989a;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f9989a.removeAllViews();
    }

    /* JADX INFO: renamed from: j */
    public void m12731j() {
        if (this.f9989a != null) {
            m12730i();
            this.f9989a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f9992d);
            this.f9989a = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m12732k() {
        this.f9990b = null;
    }

    /* JADX INFO: renamed from: l */
    public float m12733l() {
        int i;
        int i2 = this.f9994f;
        if (i2 == 0 || (i = this.f9993e) == 0) {
            return 0.0f;
        }
        return i / i2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m12734m() {
        ViewGroup viewGroup = this.f9989a;
        return viewGroup != null && viewGroup.getChildCount() > 0;
    }

    /* JADX INFO: renamed from: n */
    public void m12735n(Context context, v9j<TTLivePlayer> v9jVar) {
        m12730i();
        TextureView textureView = new TextureView(context);
        this.f9990b = textureView;
        ViewGroup viewGroup = this.f9989a;
        if (viewGroup != null) {
            int i = xdl0.e;
            viewGroup.addView(textureView, new FrameLayout.LayoutParams(i, i));
        }
        this.f9990b.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0550a(v9jVar));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m12736o() {
        m12746y(false);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m12737p() {
        float f = (this.f9993e * 1.0f) / this.f9994f;
        int i = this.f9997i;
        if (i == 0) {
            return f < 1.0f;
        }
        if (i == 1) {
            return f > 1.0f;
        }
        if (i == 2) {
            return f > 1.0f || f < 1.0f;
        }
        return i != 3 || f == 1.0f;
    }

    /* JADX INFO: renamed from: q */
    public void m12738q(Context context, ViewGroup viewGroup, v9j<TTLivePlayer> v9jVar) {
        m12730i();
        m12732k();
        this.f9989a = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f9992d);
        m12735n(context, v9jVar);
        m12745x(true);
    }

    /* JADX INFO: renamed from: r */
    public void m12739r() {
        this.f9997i = -1;
        e51.J(this.f9999k);
        m12731j();
        this.f9994f = 0;
        this.f9993e = 0;
        this.f9996h = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m12740s(View view) {
        ViewGroup.LayoutParams layoutParams = this.f9989a.getLayoutParams();
        int iX0 = xdl0.x0(view.getContext()) - (this.f9991c ? xdl0.I(view.getContext()) : 0);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(uep0.p(), iX0);
        }
        layoutParams.width = uep0.p();
        layoutParams.height = iX0;
        this.f9989a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: t */
    public void m12741t(int i) {
        this.f9997i = i;
        m12729g();
    }

    /* JADX INFO: renamed from: u */
    public void m12742u(boolean z) {
        this.f9995g = z;
    }

    /* JADX INFO: renamed from: v */
    public void m12743v(ViewGroup viewGroup) {
        if (this.f9989a != null) {
            return;
        }
        this.f9989a = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f9992d);
        m12730i();
        TextureView textureView = this.f9990b;
        if (textureView != null) {
            ViewGroup viewGroup2 = this.f9989a;
            int i = xdl0.e;
            viewGroup2.addView(textureView, 0, new FrameLayout.LayoutParams(i, i));
        }
        m12746y(true);
    }

    /* JADX INFO: renamed from: w */
    public void m12744w(h30<Boolean, Integer, Integer, Integer> h30Var) {
        this.f9998j = h30Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX INFO: renamed from: x */
    public void m12745x(boolean z) {
        int iP;
        int iP2;
        int i;
        FrameLayout.LayoutParams layoutParams;
        ViewGroup viewGroup = this.f9989a;
        if (viewGroup == null || this.f9990b == null || this.f9993e <= 0 || this.f9994f <= 0) {
            return;
        }
        int i2 = viewGroup.getLayoutParams().width;
        int i3 = this.f9989a.getLayoutParams().height;
        float f = this.f9993e / this.f9994f;
        float f2 = i2;
        float f3 = i3;
        float f4 = f2 / f3;
        if (Math.abs(f - f4) >= 1.0E-6d) {
            if (f > f4 || f4 > 0.8f) {
                iP = (int) (f3 * f);
            } else {
                iP2 = (int) (f2 / f);
                iP = i2;
            }
            i = this.f9997i;
            if (i != 3 || i == 100) {
                iP = uep0.p();
                iP2 = uep0.p();
                if (this.f9995g) {
                    iP = i2;
                    iP2 = i3;
                }
            }
            if (z && iP == i2 && iP2 == i3) {
                return;
            }
            layoutParams = (FrameLayout.LayoutParams) this.f9990b.getLayoutParams();
            layoutParams.width = iP;
            layoutParams.height = iP2;
            layoutParams.topMargin = 0;
            layoutParams.gravity = 17;
            if (iP / iP2 > 1.0f) {
                layoutParams.width = i2;
                layoutParams.height = (int) (i2 / f);
                if (this.f9995g) {
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.topMargin = eat.a(false);
                    layoutParams.gravity = 8388611;
                    if (this.f9997i == 0) {
                        layoutParams.topMargin = t100.d(185.0f);
                    }
                }
            }
            if (this.f9997i == 3) {
                layoutParams.topMargin = s410.a(false);
                layoutParams.gravity = 8388611;
            }
            if (this.f9995g) {
                layoutParams.topMargin = 0;
            }
            this.f9990b.setLayoutParams(layoutParams);
            gkh0.j(u0t.c, "player textureView:oldWH:" + i2 + ":" + i3 + ":params" + layoutParams.width + ":" + layoutParams.height + ":" + layoutParams.topMargin + ":" + f + ":" + f4);
        }
        iP = i2;
        iP2 = i3;
        i = this.f9997i;
        if (i != 3) {
            iP = uep0.p();
            iP2 = uep0.p();
            if (this.f9995g) {
                iP = i2;
                iP2 = i3;
            }
        } else {
            iP = uep0.p();
            iP2 = uep0.p();
            if (this.f9995g) {
                iP = i2;
                iP2 = i3;
            }
        }
        if (z) {
        }
        layoutParams = (FrameLayout.LayoutParams) this.f9990b.getLayoutParams();
        layoutParams.width = iP;
        layoutParams.height = iP2;
        layoutParams.topMargin = 0;
        layoutParams.gravity = 17;
        if (iP / iP2 > 1.0f) {
            layoutParams.width = i2;
            layoutParams.height = (int) (i2 / f);
            if (this.f9995g) {
                layoutParams.topMargin = 0;
            } else {
                layoutParams.topMargin = eat.a(false);
                layoutParams.gravity = 8388611;
                if (this.f9997i == 0) {
                    layoutParams.topMargin = t100.d(185.0f);
                }
            }
        }
        if (this.f9997i == 3) {
            layoutParams.topMargin = s410.a(false);
            layoutParams.gravity = 8388611;
        }
        if (this.f9995g) {
            layoutParams.topMargin = 0;
        }
        this.f9990b.setLayoutParams(layoutParams);
        gkh0.j(u0t.c, "player textureView:oldWH:" + i2 + ":" + i3 + ":params" + layoutParams.width + ":" + layoutParams.height + ":" + layoutParams.topMargin + ":" + f + ":" + f4);
    }

    /* JADX INFO: renamed from: y */
    public final void m12746y(boolean z) {
        ViewGroup viewGroup = this.f9989a;
        if (viewGroup == null || !(viewGroup.getContext() instanceof Act)) {
            m12745x(z);
            return;
        }
        boolean zM12728h = m12728h(this.f9989a.getContext(), this.f9989a.getContext().getWindow());
        if (zM12728h != this.f9991c || z) {
            this.f9991c = zM12728h;
            m12740s(this.f9989a);
            m12745x(true);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m12747z(int i, int i2) {
        this.f9993e = i;
        this.f9994f = i2;
        m12729g();
    }

    /* JADX INFO: renamed from: l.ew00$a */
    public class TextureViewSurfaceTextureListenerC0550a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v9j f10000a;

        public TextureViewSurfaceTextureListenerC0550a(v9j v9jVar) {
            this.f10000a = v9jVar;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ew00.this.f9996h = new Surface(surfaceTexture);
            v9j v9jVar = this.f10000a;
            if (v9jVar == null || v9jVar.call() == null) {
                return;
            }
            if (i > 0 && i2 > 0) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
            ((TTLivePlayer) this.f10000a.call()).d(ew00.this.f9996h);
            gkh0.j(u0t.c, "onSurfaceTextureAvailable:" + i + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (ew00.this.f9996h == null) {
                return false;
            }
            ew00.this.f9996h.release();
            ew00.this.f9996h = null;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                return;
            }
            surfaceTexture.setDefaultBufferSize(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
