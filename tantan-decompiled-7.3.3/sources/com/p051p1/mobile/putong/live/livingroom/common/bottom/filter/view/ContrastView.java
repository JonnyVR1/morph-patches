package com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class ContrastView extends VImage {

    /* JADX INFO: renamed from: d */
    public InterfaceC12888b f49449d;

    /* JADX INFO: renamed from: e */
    public boolean f49450e;

    /* JADX INFO: renamed from: f */
    public Handler f49451f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView$a */
    public class HandlerC12887a extends Handler {
        public HandlerC12887a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                ContrastView.this.f49450e = true;
                if (NullChecker.m82486a(ContrastView.this.f49449d)) {
                    ContrastView.this.f49449d.mo73410a();
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            if (ContrastView.this.f49450e && NullChecker.m82486a(ContrastView.this.f49449d)) {
                ContrastView.this.f49449d.mo73411b();
            }
            ContrastView.this.f49450e = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView$b */
    public interface InterfaceC12888b {
        /* JADX INFO: renamed from: a */
        void mo73410a();

        /* JADX INFO: renamed from: b */
        void mo73411b();
    }

    public ContrastView(Context context) {
        super(context);
        this.f49450e = false;
        m73409k();
    }

    /* JADX INFO: renamed from: k */
    private void m73409k() {
        this.f49451f = new HandlerC12887a(Looper.getMainLooper());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f49451f.removeMessages(2);
            this.f49451f.removeMessages(3);
            this.f49451f.sendEmptyMessage(2);
        } else if (action == 1) {
            this.f49451f.removeMessages(2);
            this.f49451f.removeMessages(3);
            this.f49451f.sendEmptyMessage(3);
        }
        return true;
    }

    public void setOnContrastListener(InterfaceC12888b interfaceC12888b) {
        this.f49449d = interfaceC12888b;
    }

    public ContrastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49450e = false;
        m73409k();
    }

    public ContrastView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49450e = false;
        m73409k();
    }
}
