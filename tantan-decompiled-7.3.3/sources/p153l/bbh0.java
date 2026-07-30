package p153l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes3.dex */
public class bbh0 {

    /* JADX INFO: renamed from: a */
    public SurfaceView f75948a;

    /* JADX INFO: renamed from: b */
    public Act f75949b;

    /* JADX INFO: renamed from: c */
    public boolean f75950c;

    /* JADX INFO: renamed from: d */
    public boolean f75951d;

    /* JADX INFO: renamed from: e */
    public int f75952e = 0;

    /* JADX INFO: renamed from: f */
    public xvx f75953f;

    /* JADX INFO: renamed from: l.bbh0$b */
    public class C15963b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f75955a;

        public C15963b(float f) {
            this.f75955a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f75955a);
        }
    }

    public bbh0(Act act, xvx xvxVar) {
        this.f75949b = act;
        this.f75953f = xvxVar;
        SurfaceView surfaceView = new SurfaceView(act);
        this.f75948a = surfaceView;
        surfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        m103283l(bnl0.m105587w(16.0f));
    }

    /* JADX INFO: renamed from: i */
    public void m103280i() {
        this.f75948a.getHolder().addCallback(new SurfaceHolderCallbackC15962a());
    }

    /* JADX INFO: renamed from: j */
    public SurfaceView m103281j() {
        return this.f75948a;
    }

    /* JADX INFO: renamed from: k */
    public void m103282k(boolean z) {
        this.f75951d = z;
    }

    /* JADX INFO: renamed from: l */
    public void m103283l(float f) {
        this.f75948a.setOutlineProvider(new C15963b(f));
        this.f75948a.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: l.bbh0$a */
    public class SurfaceHolderCallbackC15962a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC15962a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (bbh0.this.f75951d && i3 > bbh0.this.f75952e) {
                bbh0.this.f75953f.m213278q();
                bbh0.this.f75953f.m213272k(bbh0.this.f75949b);
                bbh0.this.f75953f.m213274m(surfaceHolder, i2, i3);
                bbh0.this.f75951d = false;
            }
            bbh0.this.f75952e = i3;
            if (bbh0.this.f75950c) {
                return;
            }
            bbh0.this.f75953f.m213274m(surfaceHolder, i2, i3);
            bbh0.this.f75950c = true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }
}
