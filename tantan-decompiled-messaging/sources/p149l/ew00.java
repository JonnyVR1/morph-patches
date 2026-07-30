package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer;

/* JADX INFO: loaded from: classes4.dex */
public class ew00 {

    /* JADX INFO: renamed from: a */
    public ViewGroup f93405a;

    /* JADX INFO: renamed from: b */
    public TextureView f93406b;

    /* JADX INFO: renamed from: c */
    public boolean f93407c;

    /* JADX INFO: renamed from: e */
    public int f93409e;

    /* JADX INFO: renamed from: f */
    public int f93410f;

    /* JADX INFO: renamed from: g */
    public boolean f93411g;

    /* JADX INFO: renamed from: h */
    public Surface f93412h;

    /* JADX INFO: renamed from: i */
    public int f93413i = -1;

    /* JADX INFO: renamed from: j */
    public h30<Boolean, Integer, Integer, Integer> f93414j = null;

    /* JADX INFO: renamed from: k */
    public Runnable f93415k = new RunnableC16694b();

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserver.OnGlobalLayoutListener f93408d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.dw00
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f88133a.m118352o();
        }
    };

    /* JADX INFO: renamed from: l.ew00$b */
    public class RunnableC16694b implements Runnable {
        public RunnableC16694b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ew00 ew00Var = ew00.this;
            if (ew00Var.f93409e == 0 || ew00Var.f93410f == 0) {
                return;
            }
            boolean zM118353p = ew00Var.m118353p();
            if (ew00.this.f93414j != null) {
                ew00.this.f93414j.mo105798b(Boolean.valueOf(zM118353p), Integer.valueOf(ew00.this.f93413i), Integer.valueOf(ew00.this.f93409e), Integer.valueOf(ew00.this.f93410f));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m118344h(@NonNull Context context, @NonNull Window window) {
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
    public final void m118345g() {
        e51.m114745J(this.f93415k);
        e51.m114743H(App.f15369e, this.f93415k, 2000L);
        gkh0.m126627j(u0t.f172944c, "first CTYP: " + this.f93413i + ", size = " + this.f93409e + " x " + this.f93410f);
    }

    /* JADX INFO: renamed from: i */
    public void m118346i() {
        ViewGroup viewGroup = this.f93405a;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f93405a.removeAllViews();
    }

    /* JADX INFO: renamed from: j */
    public void m118347j() {
        if (this.f93405a != null) {
            m118346i();
            this.f93405a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f93408d);
            this.f93405a = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m118348k() {
        this.f93406b = null;
    }

    /* JADX INFO: renamed from: l */
    public float m118349l() {
        int i;
        int i2 = this.f93410f;
        if (i2 == 0 || (i = this.f93409e) == 0) {
            return 0.0f;
        }
        return i / i2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m118350m() {
        ViewGroup viewGroup = this.f93405a;
        return viewGroup != null && viewGroup.getChildCount() > 0;
    }

    /* JADX INFO: renamed from: n */
    public void m118351n(Context context, v9j<TTLivePlayer> v9jVar) {
        m118346i();
        TextureView textureView = new TextureView(context);
        this.f93406b = textureView;
        ViewGroup viewGroup = this.f93405a;
        if (viewGroup != null) {
            int i = xdl0.f192403e;
            viewGroup.addView(textureView, new FrameLayout.LayoutParams(i, i));
        }
        this.f93406b.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC16693a(v9jVar));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m118352o() {
        m118362y(false);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m118353p() {
        float f = (this.f93409e * 1.0f) / this.f93410f;
        int i = this.f93413i;
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
    public void m118354q(Context context, ViewGroup viewGroup, v9j<TTLivePlayer> v9jVar) {
        m118346i();
        m118348k();
        this.f93405a = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f93408d);
        m118351n(context, v9jVar);
        m118361x(true);
    }

    /* JADX INFO: renamed from: r */
    public void m118355r() {
        this.f93413i = -1;
        e51.m114745J(this.f93415k);
        m118347j();
        this.f93410f = 0;
        this.f93409e = 0;
        this.f93412h = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m118356s(View view) {
        ViewGroup.LayoutParams layoutParams = this.f93405a.getLayoutParams();
        int iM208410x0 = xdl0.m208410x0(view.getContext()) - (this.f93407c ? xdl0.m208336I(view.getContext()) : 0);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(uep0.m193329p(), iM208410x0);
        }
        layoutParams.width = uep0.m193329p();
        layoutParams.height = iM208410x0;
        this.f93405a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: t */
    public void m118357t(int i) {
        this.f93413i = i;
        m118345g();
    }

    /* JADX INFO: renamed from: u */
    public void m118358u(boolean z) {
        this.f93411g = z;
    }

    /* JADX INFO: renamed from: v */
    public void m118359v(ViewGroup viewGroup) {
        if (this.f93405a != null) {
            return;
        }
        this.f93405a = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f93408d);
        m118346i();
        TextureView textureView = this.f93406b;
        if (textureView != null) {
            ViewGroup viewGroup2 = this.f93405a;
            int i = xdl0.f192403e;
            viewGroup2.addView(textureView, 0, new FrameLayout.LayoutParams(i, i));
        }
        m118362y(true);
    }

    /* JADX INFO: renamed from: w */
    public void m118360w(h30<Boolean, Integer, Integer, Integer> h30Var) {
        this.f93414j = h30Var;
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
    public void m118361x(boolean z) {
        int iM193329p;
        int iM193329p2;
        int i;
        FrameLayout.LayoutParams layoutParams;
        ViewGroup viewGroup = this.f93405a;
        if (viewGroup == null || this.f93406b == null || this.f93409e <= 0 || this.f93410f <= 0) {
            return;
        }
        int i2 = viewGroup.getLayoutParams().width;
        int i3 = this.f93405a.getLayoutParams().height;
        float f = this.f93409e / this.f93410f;
        float f2 = i2;
        float f3 = i3;
        float f4 = f2 / f3;
        if (Math.abs(f - f4) >= 1.0E-6d) {
            if (f > f4 || f4 > 0.8f) {
                iM193329p = (int) (f3 * f);
            } else {
                iM193329p2 = (int) (f2 / f);
                iM193329p = i2;
            }
            i = this.f93413i;
            if (i != 3 || i == 100) {
                iM193329p = uep0.m193329p();
                iM193329p2 = uep0.m193329p();
                if (this.f93411g) {
                    iM193329p = i2;
                    iM193329p2 = i3;
                }
            }
            if (z && iM193329p == i2 && iM193329p2 == i3) {
                return;
            }
            layoutParams = (FrameLayout.LayoutParams) this.f93406b.getLayoutParams();
            layoutParams.width = iM193329p;
            layoutParams.height = iM193329p2;
            layoutParams.topMargin = 0;
            layoutParams.gravity = 17;
            if (iM193329p / iM193329p2 > 1.0f) {
                layoutParams.width = i2;
                layoutParams.height = (int) (i2 / f);
                if (this.f93411g) {
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.topMargin = eat.m115436a(false);
                    layoutParams.gravity = 8388611;
                    if (this.f93413i == 0) {
                        layoutParams.topMargin = t100.m186890d(185.0f);
                    }
                }
            }
            if (this.f93413i == 3) {
                layoutParams.topMargin = s410.m182205a(false);
                layoutParams.gravity = 8388611;
            }
            if (this.f93411g) {
                layoutParams.topMargin = 0;
            }
            this.f93406b.setLayoutParams(layoutParams);
            gkh0.m126627j(u0t.f172944c, "player textureView:oldWH:" + i2 + ":" + i3 + ":params" + layoutParams.width + ":" + layoutParams.height + ":" + layoutParams.topMargin + ":" + f + ":" + f4);
        }
        iM193329p = i2;
        iM193329p2 = i3;
        i = this.f93413i;
        if (i != 3) {
            iM193329p = uep0.m193329p();
            iM193329p2 = uep0.m193329p();
            if (this.f93411g) {
                iM193329p = i2;
                iM193329p2 = i3;
            }
        } else {
            iM193329p = uep0.m193329p();
            iM193329p2 = uep0.m193329p();
            if (this.f93411g) {
                iM193329p = i2;
                iM193329p2 = i3;
            }
        }
        if (z) {
        }
        layoutParams = (FrameLayout.LayoutParams) this.f93406b.getLayoutParams();
        layoutParams.width = iM193329p;
        layoutParams.height = iM193329p2;
        layoutParams.topMargin = 0;
        layoutParams.gravity = 17;
        if (iM193329p / iM193329p2 > 1.0f) {
            layoutParams.width = i2;
            layoutParams.height = (int) (i2 / f);
            if (this.f93411g) {
                layoutParams.topMargin = 0;
            } else {
                layoutParams.topMargin = eat.m115436a(false);
                layoutParams.gravity = 8388611;
                if (this.f93413i == 0) {
                    layoutParams.topMargin = t100.m186890d(185.0f);
                }
            }
        }
        if (this.f93413i == 3) {
            layoutParams.topMargin = s410.m182205a(false);
            layoutParams.gravity = 8388611;
        }
        if (this.f93411g) {
            layoutParams.topMargin = 0;
        }
        this.f93406b.setLayoutParams(layoutParams);
        gkh0.m126627j(u0t.f172944c, "player textureView:oldWH:" + i2 + ":" + i3 + ":params" + layoutParams.width + ":" + layoutParams.height + ":" + layoutParams.topMargin + ":" + f + ":" + f4);
    }

    /* JADX INFO: renamed from: y */
    public final void m118362y(boolean z) {
        ViewGroup viewGroup = this.f93405a;
        if (viewGroup == null || !(viewGroup.getContext() instanceof Act)) {
            m118361x(z);
            return;
        }
        boolean zM118344h = m118344h(this.f93405a.getContext(), ((Act) this.f93405a.getContext()).getWindow());
        if (zM118344h != this.f93407c || z) {
            this.f93407c = zM118344h;
            m118356s(this.f93405a);
            m118361x(true);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m118363z(int i, int i2) {
        this.f93409e = i;
        this.f93410f = i2;
        m118345g();
    }

    /* JADX INFO: renamed from: l.ew00$a */
    public class TextureViewSurfaceTextureListenerC16693a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v9j f93416a;

        public TextureViewSurfaceTextureListenerC16693a(v9j v9jVar) {
            this.f93416a = v9jVar;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ew00.this.f93412h = new Surface(surfaceTexture);
            v9j v9jVar = this.f93416a;
            if (v9jVar == null || v9jVar.call() == null) {
                return;
            }
            if (i > 0 && i2 > 0) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
            ((TTLivePlayer) this.f93416a.call()).mo68518d(ew00.this.f93412h);
            gkh0.m126627j(u0t.f172944c, "onSurfaceTextureAvailable:" + i + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (ew00.this.f93412h == null) {
                return false;
            }
            ew00.this.f93412h.release();
            ew00.this.f93412h = null;
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
