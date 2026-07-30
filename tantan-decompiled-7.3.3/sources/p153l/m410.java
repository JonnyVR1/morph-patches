package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.live.base.mmsdk.player.TTLivePlayer;

/* JADX INFO: loaded from: classes4.dex */
public class m410 {

    /* JADX INFO: renamed from: a */
    public ViewGroup f134729a;

    /* JADX INFO: renamed from: b */
    public TextureView f134730b;

    /* JADX INFO: renamed from: c */
    public boolean f134731c;

    /* JADX INFO: renamed from: e */
    public int f134733e;

    /* JADX INFO: renamed from: f */
    public int f134734f;

    /* JADX INFO: renamed from: g */
    public boolean f134735g;

    /* JADX INFO: renamed from: h */
    public Surface f134736h;

    /* JADX INFO: renamed from: i */
    public int f134737i = -1;

    /* JADX INFO: renamed from: j */
    public b30<Boolean, Integer, Integer, Integer> f134738j = null;

    /* JADX INFO: renamed from: k */
    public Runnable f134739k = new RunnableC18536b();

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserver.OnGlobalLayoutListener f134732d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.l410
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            this.f129926a.m156966o();
        }
    };

    /* JADX INFO: renamed from: l.m410$b */
    public class RunnableC18536b implements Runnable {
        public RunnableC18536b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m410 m410Var = m410.this;
            if (m410Var.f134733e == 0 || m410Var.f134734f == 0) {
                return;
            }
            boolean zM156967p = m410Var.m156967p();
            if (m410.this.f134738j != null) {
                m410.this.f134738j.mo102266b(Boolean.valueOf(zM156967p), Integer.valueOf(m410.this.f134737i), Integer.valueOf(m410.this.f134733e), Integer.valueOf(m410.this.f134734f));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m156958h(@NonNull Context context, @NonNull Window window) {
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
    public final void m156959g() {
        l51.m152890J(this.f134739k);
        l51.m152888H(App.f16088e, this.f134739k, 2000L);
        nsh0.m164608j(v2t.f182113c, "first CTYP: " + this.f134737i + ", size = " + this.f134733e + " x " + this.f134734f);
    }

    /* JADX INFO: renamed from: i */
    public void m156960i() {
        ViewGroup viewGroup = this.f134729a;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f134729a.removeAllViews();
    }

    /* JADX INFO: renamed from: j */
    public void m156961j() {
        if (this.f134729a != null) {
            m156960i();
            this.f134729a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f134732d);
            this.f134729a = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m156962k() {
        this.f134730b = null;
    }

    /* JADX INFO: renamed from: l */
    public float m156963l() {
        int i;
        int i2 = this.f134734f;
        if (i2 == 0 || (i = this.f134733e) == 0) {
            return 0.0f;
        }
        return i / i2;
    }

    /* JADX INFO: renamed from: m */
    public boolean m156964m() {
        ViewGroup viewGroup = this.f134729a;
        return viewGroup != null && viewGroup.getChildCount() > 0;
    }

    /* JADX INFO: renamed from: n */
    public void m156965n(Context context, pcj<TTLivePlayer> pcjVar) {
        m156960i();
        TextureView textureView = new TextureView(context);
        this.f134730b = textureView;
        ViewGroup viewGroup = this.f134729a;
        if (viewGroup != null) {
            int i = bnl0.f77544e;
            viewGroup.addView(textureView, new FrameLayout.LayoutParams(i, i));
        }
        this.f134730b.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC18535a(pcjVar));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m156966o() {
        m156976y(false);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m156967p() {
        float f = (this.f134733e * 1.0f) / this.f134734f;
        int i = this.f134737i;
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
    public void m156968q(Context context, ViewGroup viewGroup, pcj<TTLivePlayer> pcjVar) {
        m156960i();
        m156962k();
        this.f134729a = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f134732d);
        m156965n(context, pcjVar);
        m156975x(true);
    }

    /* JADX INFO: renamed from: r */
    public void m156969r() {
        this.f134737i = -1;
        l51.m152890J(this.f134739k);
        m156961j();
        this.f134734f = 0;
        this.f134733e = 0;
        this.f134736h = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m156970s(View view) {
        ViewGroup.LayoutParams layoutParams = this.f134729a.getLayoutParams();
        int iM105590x0 = bnl0.m105590x0(view.getContext()) - (this.f134731c ? bnl0.m105516I(view.getContext()) : 0);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(ynp0.m216939p(), iM105590x0);
        }
        layoutParams.width = ynp0.m216939p();
        layoutParams.height = iM105590x0;
        this.f134729a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: t */
    public void m156971t(int i) {
        this.f134737i = i;
        m156959g();
    }

    /* JADX INFO: renamed from: u */
    public void m156972u(boolean z) {
        this.f134735g = z;
    }

    /* JADX INFO: renamed from: v */
    public void m156973v(ViewGroup viewGroup) {
        if (this.f134729a != null) {
            return;
        }
        this.f134729a = viewGroup;
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(this.f134732d);
        m156960i();
        TextureView textureView = this.f134730b;
        if (textureView != null) {
            ViewGroup viewGroup2 = this.f134729a;
            int i = bnl0.f77544e;
            viewGroup2.addView(textureView, 0, new FrameLayout.LayoutParams(i, i));
        }
        m156976y(true);
    }

    /* JADX INFO: renamed from: w */
    public void m156974w(b30<Boolean, Integer, Integer, Integer> b30Var) {
        this.f134738j = b30Var;
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
    public void m156975x(boolean z) {
        int iM216939p;
        int iM216939p2;
        int i;
        FrameLayout.LayoutParams layoutParams;
        ViewGroup viewGroup = this.f134729a;
        if (viewGroup == null || this.f134730b == null || this.f134733e <= 0 || this.f134734f <= 0) {
            return;
        }
        int i2 = viewGroup.getLayoutParams().width;
        int i3 = this.f134729a.getLayoutParams().height;
        float f = this.f134733e / this.f134734f;
        float f2 = i2;
        float f3 = i3;
        float f4 = f2 / f3;
        if (Math.abs(f - f4) >= 1.0E-6d) {
            if (f > f4 || f4 > 0.8f) {
                iM216939p = (int) (f3 * f);
            } else {
                iM216939p2 = (int) (f2 / f);
                iM216939p = i2;
            }
            i = this.f134737i;
            if (i != 3 || i == 100) {
                iM216939p = ynp0.m216939p();
                iM216939p2 = ynp0.m216939p();
                if (this.f134735g) {
                    iM216939p = i2;
                    iM216939p2 = i3;
                }
            }
            if (z && iM216939p == i2 && iM216939p2 == i3) {
                return;
            }
            layoutParams = (FrameLayout.LayoutParams) this.f134730b.getLayoutParams();
            layoutParams.width = iM216939p;
            layoutParams.height = iM216939p2;
            layoutParams.topMargin = 0;
            layoutParams.gravity = 17;
            if (iM216939p / iM216939p2 > 1.0f) {
                layoutParams.width = i2;
                layoutParams.height = (int) (i2 / f);
                if (this.f134735g) {
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.topMargin = fct.m125051a(false);
                    layoutParams.gravity = 8388611;
                    if (this.f134737i == 0) {
                        layoutParams.topMargin = qa00.m175859d(185.0f);
                    }
                }
            }
            if (this.f134737i == 3) {
                layoutParams.topMargin = cd10.m109086a(false);
                layoutParams.gravity = 8388611;
            }
            if (this.f134735g) {
                layoutParams.topMargin = 0;
            }
            this.f134730b.setLayoutParams(layoutParams);
            nsh0.m164608j(v2t.f182113c, "player textureView:oldWH:" + i2 + ":" + i3 + ":params" + layoutParams.width + ":" + layoutParams.height + ":" + layoutParams.topMargin + ":" + f + ":" + f4);
        }
        iM216939p = i2;
        iM216939p2 = i3;
        i = this.f134737i;
        if (i != 3) {
            iM216939p = ynp0.m216939p();
            iM216939p2 = ynp0.m216939p();
            if (this.f134735g) {
                iM216939p = i2;
                iM216939p2 = i3;
            }
        } else {
            iM216939p = ynp0.m216939p();
            iM216939p2 = ynp0.m216939p();
            if (this.f134735g) {
                iM216939p = i2;
                iM216939p2 = i3;
            }
        }
        if (z) {
        }
        layoutParams = (FrameLayout.LayoutParams) this.f134730b.getLayoutParams();
        layoutParams.width = iM216939p;
        layoutParams.height = iM216939p2;
        layoutParams.topMargin = 0;
        layoutParams.gravity = 17;
        if (iM216939p / iM216939p2 > 1.0f) {
            layoutParams.width = i2;
            layoutParams.height = (int) (i2 / f);
            if (this.f134735g) {
                layoutParams.topMargin = 0;
            } else {
                layoutParams.topMargin = fct.m125051a(false);
                layoutParams.gravity = 8388611;
                if (this.f134737i == 0) {
                    layoutParams.topMargin = qa00.m175859d(185.0f);
                }
            }
        }
        if (this.f134737i == 3) {
            layoutParams.topMargin = cd10.m109086a(false);
            layoutParams.gravity = 8388611;
        }
        if (this.f134735g) {
            layoutParams.topMargin = 0;
        }
        this.f134730b.setLayoutParams(layoutParams);
        nsh0.m164608j(v2t.f182113c, "player textureView:oldWH:" + i2 + ":" + i3 + ":params" + layoutParams.width + ":" + layoutParams.height + ":" + layoutParams.topMargin + ":" + f + ":" + f4);
    }

    /* JADX INFO: renamed from: y */
    public final void m156976y(boolean z) {
        ViewGroup viewGroup = this.f134729a;
        if (viewGroup == null || !(viewGroup.getContext() instanceof Act)) {
            m156975x(z);
            return;
        }
        boolean zM156958h = m156958h(this.f134729a.getContext(), ((Act) this.f134729a.getContext()).getWindow());
        if (zM156958h != this.f134731c || z) {
            this.f134731c = zM156958h;
            m156970s(this.f134729a);
            m156975x(true);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m156977z(int i, int i2) {
        this.f134733e = i;
        this.f134734f = i2;
        m156959g();
    }

    /* JADX INFO: renamed from: l.m410$a */
    public class TextureViewSurfaceTextureListenerC18535a implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pcj f134740a;

        public TextureViewSurfaceTextureListenerC18535a(pcj pcjVar) {
            this.f134740a = pcjVar;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            m410.this.f134736h = new Surface(surfaceTexture);
            pcj pcjVar = this.f134740a;
            if (pcjVar == null || pcjVar.call() == null) {
                return;
            }
            if (i > 0 && i2 > 0) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
            ((TTLivePlayer) this.f134740a.call()).mo69701d(m410.this.f134736h);
            nsh0.m164608j(v2t.f182113c, "onSurfaceTextureAvailable:" + i + i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (m410.this.f134736h == null) {
                return false;
            }
            m410.this.f134736h.release();
            m410.this.f134736h = null;
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
