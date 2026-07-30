package p003l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.p1.mobile.android.app.Act;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class t2h0 {

    /* JADX INFO: renamed from: a */
    public SurfaceView f7396a;

    /* JADX INFO: renamed from: b */
    public Act f7397b;

    /* JADX INFO: renamed from: c */
    public boolean f7398c;

    /* JADX INFO: renamed from: d */
    public boolean f7399d;

    /* JADX INFO: renamed from: e */
    public int f7400e = 0;

    /* JADX INFO: renamed from: f */
    public anx f7401f;

    /* JADX INFO: renamed from: l.t2h0$b */
    public class C0545b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f7403a;

        public C0545b(float f) {
            this.f7403a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f7403a);
        }
    }

    public t2h0(Act act, anx anxVar) {
        this.f7397b = act;
        this.f7401f = anxVar;
        SurfaceView surfaceView = new SurfaceView(act);
        this.f7396a = surfaceView;
        surfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        m7702l(xdl0.w(16.0f));
    }

    /* JADX INFO: renamed from: i */
    public void m7699i() {
        this.f7396a.getHolder().addCallback(new SurfaceHolderCallbackC0544a());
    }

    /* JADX INFO: renamed from: j */
    public SurfaceView m7700j() {
        return this.f7396a;
    }

    /* JADX INFO: renamed from: k */
    public void m7701k(boolean z) {
        this.f7399d = z;
    }

    /* JADX INFO: renamed from: l */
    public void m7702l(float f) {
        this.f7396a.setOutlineProvider(new C0545b(f));
        this.f7396a.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: l.t2h0$a */
    public class SurfaceHolderCallbackC0544a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC0544a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (t2h0.this.f7399d && i3 > t2h0.this.f7400e) {
                t2h0.this.f7401f.m2902q();
                t2h0.this.f7401f.m2896k(t2h0.this.f7397b);
                t2h0.this.f7401f.m2898m(surfaceHolder, i2, i3);
                t2h0.this.f7399d = false;
            }
            t2h0.this.f7400e = i3;
            if (t2h0.this.f7398c) {
                return;
            }
            t2h0.this.f7401f.m2898m(surfaceHolder, i2, i3);
            t2h0.this.f7398c = true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }
}
