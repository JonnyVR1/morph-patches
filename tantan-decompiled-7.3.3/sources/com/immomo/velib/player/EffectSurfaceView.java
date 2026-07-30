package com.immomo.velib.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: loaded from: classes7.dex */
public class EffectSurfaceView extends SurfaceView implements InterfaceC4140e {

    /* JADX INFO: renamed from: a */
    InterfaceC4139d f14862a;

    /* JADX INFO: renamed from: b */
    SurfaceHolder f14863b;

    /* JADX INFO: renamed from: c */
    int f14864c;

    /* JADX INFO: renamed from: d */
    int f14865d;

    /* JADX INFO: renamed from: e */
    boolean f14866e;

    /* JADX INFO: renamed from: f */
    InterfaceC4139d.a f14867f;

    /* JADX INFO: renamed from: g */
    SurfaceHolder.Callback f14868g;

    /* JADX INFO: renamed from: com.immomo.velib.player.EffectSurfaceView$a */
    public class SurfaceHolderCallbackC4128a implements SurfaceHolder.Callback {
        public SurfaceHolderCallbackC4128a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            int i;
            EffectSurfaceView effectSurfaceView = EffectSurfaceView.this;
            effectSurfaceView.f14863b = surfaceHolder;
            if (effectSurfaceView.f14866e) {
                if (effectSurfaceView.f14862a != null) {
                    int i2 = effectSurfaceView.f14864c;
                    if (i2 != 0 && (i = effectSurfaceView.f14865d) != 0) {
                        surfaceHolder.setFixedSize(i2, i);
                    }
                    EffectSurfaceView effectSurfaceView2 = EffectSurfaceView.this;
                    effectSurfaceView2.f14862a.mo20573d(effectSurfaceView2);
                }
                EffectSurfaceView.this.f14866e = false;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            InterfaceC4139d.a aVar = EffectSurfaceView.this.f14867f;
            if (aVar != null) {
                aVar.mo20527a();
            }
            EffectSurfaceView.this.f14863b = null;
        }
    }

    public EffectSurfaceView(Context context) {
        super(context);
        this.f14866e = false;
        this.f14868g = new SurfaceHolderCallbackC4128a();
        m20519e();
    }

    /* JADX INFO: renamed from: e */
    private void m20519e() {
        setZOrderOnTop(true);
        getHolder().setFormat(-2);
        getHolder().addCallback(this.f14868g);
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    /* JADX INFO: renamed from: a */
    public void mo20520a(int i, int i2) {
        this.f14864c = i;
        this.f14865d = i2;
        SurfaceHolder surfaceHolder = this.f14863b;
        if (surfaceHolder != null) {
            surfaceHolder.setFixedSize(i, i2);
        }
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    /* JADX INFO: renamed from: b */
    public void mo20521b() {
        InterfaceC4139d interfaceC4139d = this.f14862a;
        if (interfaceC4139d == null) {
            return;
        }
        if (this.f14863b != null) {
            interfaceC4139d.mo20573d(this);
        } else {
            this.f14866e = true;
        }
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    /* JADX INFO: renamed from: c */
    public void mo20522c() {
        this.f14862a = null;
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    /* JADX INFO: renamed from: d */
    public void mo20523d(InterfaceC4139d interfaceC4139d) {
        this.f14862a = interfaceC4139d;
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    public void setOnBackgroundListener(InterfaceC4139d.a aVar) {
        this.f14867f = aVar;
    }

    public EffectSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14866e = false;
        this.f14868g = new SurfaceHolderCallbackC4128a();
        m20519e();
    }

    public EffectSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14866e = false;
        this.f14868g = new SurfaceHolderCallbackC4128a();
        m20519e();
    }
}
