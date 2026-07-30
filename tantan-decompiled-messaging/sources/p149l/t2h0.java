package p149l;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes3.dex */
public class t2h0 {

    /* JADX INFO: renamed from: a */
    public SurfaceView f167470a;

    /* JADX INFO: renamed from: b */
    public Act f167471b;

    /* JADX INFO: renamed from: c */
    public boolean f167472c;

    /* JADX INFO: renamed from: d */
    public boolean f167473d;

    /* JADX INFO: renamed from: e */
    public int f167474e = 0;

    /* JADX INFO: renamed from: f */
    public anx f167475f;

    /* JADX INFO: renamed from: l.t2h0$b */
    public class C20100b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f167477a;

        public C20100b(float f) {
            this.f167477a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            outline.setRoundRect(new Rect(0, 0, rect.right - rect.left, rect.bottom - rect.top), this.f167477a);
        }
    }

    public t2h0(Act act, anx anxVar) {
        this.f167471b = act;
        this.f167475f = anxVar;
        SurfaceView surfaceView = new SurfaceView(act);
        this.f167470a = surfaceView;
        surfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        m186993l(xdl0.m208407w(16.0f));
    }

    /* JADX INFO: renamed from: i */
    public void m186990i() {
        this.f167470a.getHolder().addCallback(new SurfaceHolderCallbackC20099a());
    }

    /* JADX INFO: renamed from: j */
    public SurfaceView m186991j() {
        return this.f167470a;
    }

    /* JADX INFO: renamed from: k */
    public void m186992k(boolean z) {
        this.f167473d = z;
    }

    /* JADX INFO: renamed from: l */
    public void m186993l(float f) {
        this.f167470a.setOutlineProvider(new C20100b(f));
        this.f167470a.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: l.t2h0$a */
    public class SurfaceHolderCallbackC20099a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC20099a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (t2h0.this.f167473d && i3 > t2h0.this.f167474e) {
                t2h0.this.f167475f.m97833q();
                t2h0.this.f167475f.m97827k(t2h0.this.f167471b);
                t2h0.this.f167475f.m97829m(surfaceHolder, i2, i3);
                t2h0.this.f167473d = false;
            }
            t2h0.this.f167474e = i3;
            if (t2h0.this.f167472c) {
                return;
            }
            t2h0.this.f167475f.m97829m(surfaceHolder, i2, i3);
            t2h0.this.f167472c = true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }
}
