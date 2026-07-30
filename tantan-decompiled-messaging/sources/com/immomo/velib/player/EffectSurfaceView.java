package com.immomo.velib.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes7.dex */
public class EffectSurfaceView extends SurfaceView implements InterfaceC3989e {

    /* JADX INFO: renamed from: a */
    InterfaceC3988d f14143a;

    /* JADX INFO: renamed from: b */
    SurfaceHolder f14144b;

    /* JADX INFO: renamed from: c */
    int f14145c;

    /* JADX INFO: renamed from: d */
    int f14146d;

    /* JADX INFO: renamed from: e */
    boolean f14147e;

    /* JADX INFO: renamed from: f */
    InterfaceC3988d.a f14148f;

    /* JADX INFO: renamed from: g */
    SurfaceHolder.Callback f14149g;

    /* JADX INFO: renamed from: com.immomo.velib.player.EffectSurfaceView$a */
    public class SurfaceHolderCallbackC3977a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC3977a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            int i;
            EffectSurfaceView effectSurfaceView = EffectSurfaceView.this;
            effectSurfaceView.f14144b = surfaceHolder;
            if (effectSurfaceView.f14147e) {
                if (effectSurfaceView.f14143a != null) {
                    int i2 = effectSurfaceView.f14145c;
                    if (i2 != 0 && (i = effectSurfaceView.f14146d) != 0) {
                        surfaceHolder.setFixedSize(i2, i);
                    }
                    EffectSurfaceView effectSurfaceView2 = EffectSurfaceView.this;
                    effectSurfaceView2.f14143a.mo19574d(effectSurfaceView2);
                }
                EffectSurfaceView.this.f14147e = false;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            InterfaceC3988d.a aVar = EffectSurfaceView.this.f14148f;
            if (aVar != null) {
                aVar.mo19528a();
            }
            EffectSurfaceView.this.f14144b = null;
        }
    }

    public EffectSurfaceView(Context context) {
        super(context);
        this.f14147e = false;
        this.f14149g = new SurfaceHolderCallbackC3977a();
        m19520e();
    }

    /* JADX INFO: renamed from: e */
    private void m19520e() {
        setZOrderOnTop(true);
        getHolder().setFormat(-2);
        getHolder().addCallback(this.f14149g);
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    /* JADX INFO: renamed from: a */
    public void mo19521a(int i, int i2) {
        this.f14145c = i;
        this.f14146d = i2;
        SurfaceHolder surfaceHolder = this.f14144b;
        if (surfaceHolder != null) {
            surfaceHolder.setFixedSize(i, i2);
        }
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    /* JADX INFO: renamed from: b */
    public void mo19522b() {
        InterfaceC3988d interfaceC3988d = this.f14143a;
        if (interfaceC3988d == null) {
            return;
        }
        if (this.f14144b != null) {
            interfaceC3988d.mo19574d(this);
        } else {
            this.f14147e = true;
        }
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    /* JADX INFO: renamed from: c */
    public void mo19523c() {
        this.f14143a = null;
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    /* JADX INFO: renamed from: d */
    public void mo19524d(InterfaceC3988d interfaceC3988d) {
        this.f14143a = interfaceC3988d;
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    public void setOnBackgroundListener(InterfaceC3988d.a aVar) {
        this.f14148f = aVar;
    }

    public EffectSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14147e = false;
        this.f14149g = new SurfaceHolderCallbackC3977a();
        m19520e();
    }

    public EffectSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14147e = false;
        this.f14149g = new SurfaceHolderCallbackC3977a();
        m19520e();
    }
}
