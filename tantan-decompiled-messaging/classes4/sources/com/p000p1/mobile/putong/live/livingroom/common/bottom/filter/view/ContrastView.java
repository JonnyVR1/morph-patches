package com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ContrastView extends VImage {

    /* JADX INFO: renamed from: d */
    public InterfaceC0314b f4643d;

    /* JADX INFO: renamed from: e */
    public boolean f4644e;

    /* JADX INFO: renamed from: f */
    public Handler f4645f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView$a */
    public class HandlerC0313a extends Handler {
        public HandlerC0313a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                ContrastView.this.f4644e = true;
                if (NullChecker.a(ContrastView.this.f4643d)) {
                    ContrastView.this.f4643d.mo5700a();
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            if (ContrastView.this.f4644e && NullChecker.a(ContrastView.this.f4643d)) {
                ContrastView.this.f4643d.mo5701b();
            }
            ContrastView.this.f4644e = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView$b */
    public interface InterfaceC0314b {
        /* JADX INFO: renamed from: a */
        void mo5700a();

        /* JADX INFO: renamed from: b */
        void mo5701b();
    }

    public ContrastView(Context context) {
        super(context);
        this.f4644e = false;
        m5699k();
    }

    /* JADX INFO: renamed from: k */
    private void m5699k() {
        this.f4645f = new HandlerC0313a(Looper.getMainLooper());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f4645f.removeMessages(2);
            this.f4645f.removeMessages(3);
            this.f4645f.sendEmptyMessage(2);
        } else if (action == 1) {
            this.f4645f.removeMessages(2);
            this.f4645f.removeMessages(3);
            this.f4645f.sendEmptyMessage(3);
        }
        return true;
    }

    public void setOnContrastListener(InterfaceC0314b interfaceC0314b) {
        this.f4643d = interfaceC0314b;
    }

    public ContrastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4644e = false;
        m5699k();
    }

    public ContrastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4644e = false;
        m5699k();
    }
}
