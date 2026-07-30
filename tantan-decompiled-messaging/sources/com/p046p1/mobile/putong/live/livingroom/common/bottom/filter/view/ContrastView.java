package com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class ContrastView extends VImage {

    /* JADX INFO: renamed from: d */
    public InterfaceC12725b f48601d;

    /* JADX INFO: renamed from: e */
    public boolean f48602e;

    /* JADX INFO: renamed from: f */
    public Handler f48603f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView$a */
    public class HandlerC12724a extends Handler {
        public HandlerC12724a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                ContrastView.this.f48602e = true;
                if (NullChecker.m81303a(ContrastView.this.f48601d)) {
                    ContrastView.this.f48601d.mo72227a();
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            if (ContrastView.this.f48602e && NullChecker.m81303a(ContrastView.this.f48601d)) {
                ContrastView.this.f48601d.mo72228b();
            }
            ContrastView.this.f48602e = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView$b */
    public interface InterfaceC12725b {
        /* JADX INFO: renamed from: a */
        void mo72227a();

        /* JADX INFO: renamed from: b */
        void mo72228b();
    }

    public ContrastView(Context context) {
        super(context);
        this.f48602e = false;
        m72226k();
    }

    /* JADX INFO: renamed from: k */
    private void m72226k() {
        this.f48603f = new HandlerC12724a(Looper.getMainLooper());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f48603f.removeMessages(2);
            this.f48603f.removeMessages(3);
            this.f48603f.sendEmptyMessage(2);
        } else if (action == 1) {
            this.f48603f.removeMessages(2);
            this.f48603f.removeMessages(3);
            this.f48603f.sendEmptyMessage(3);
        }
        return true;
    }

    public void setOnContrastListener(InterfaceC12725b interfaceC12725b) {
        this.f48601d = interfaceC12725b;
    }

    public ContrastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48602e = false;
        m72226k();
    }

    public ContrastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48602e = false;
        m72226k();
    }
}
