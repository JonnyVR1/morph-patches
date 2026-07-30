package com.uuzuche.lib_zxing.decoding;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.BarcodeFormat;
import com.uuzuche.lib_zxing.activity.CaptureFragment;
import com.uuzuche.lib_zxing.view.ViewfinderView;
import java.util.Vector;
import p153l.pdc0;
import p153l.r5d0;
import p153l.wnl0;
import p153l.x94;

/* JADX INFO: loaded from: classes2.dex */
public final class CaptureActivityHandler extends Handler {

    /* JADX INFO: renamed from: a */
    private final CaptureFragment f61714a;

    /* JADX INFO: renamed from: b */
    private final C14679b f61715b;

    /* JADX INFO: renamed from: c */
    private State f61716c;

    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureActivityHandler(CaptureFragment captureFragment, Vector<BarcodeFormat> vector, String str, ViewfinderView viewfinderView) {
        this.f61714a = captureFragment;
        C14679b c14679b = new C14679b(captureFragment, vector, str, new wnl0(viewfinderView));
        this.f61715b = c14679b;
        c14679b.start();
        this.f61716c = State.SUCCESS;
        x94.m209763c().m209778p();
        m85872b();
    }

    /* JADX INFO: renamed from: b */
    private void m85872b() {
        if (this.f61716c == State.SUCCESS) {
            this.f61716c = State.PREVIEW;
            x94.m209763c().m209776n(this.f61715b.m85875a(), pdc0.f151732b);
            x94.m209763c().m209775m(this, pdc0.f151731a);
            this.f61714a.m85867V3();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85873a() {
        this.f61716c = State.DONE;
        x94.m209763c().m209779q();
        Message.obtain(this.f61715b.m85875a(), pdc0.f151738h).sendToTarget();
        try {
            this.f61715b.join();
        } catch (InterruptedException unused) {
        }
        removeMessages(pdc0.f151734d);
        removeMessages(pdc0.f151733c);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == pdc0.f151731a) {
            if (this.f61716c == State.PREVIEW) {
                x94.m209763c().m209775m(this, pdc0.f151731a);
                return;
            }
            return;
        }
        if (i == pdc0.f151739i) {
            m85872b();
            return;
        }
        if (i == pdc0.f151734d) {
            this.f61716c = State.SUCCESS;
            Bundle data = message.getData();
            this.f61714a.m85869X3((r5d0) message.obj, data == null ? null : (Bitmap) data.getParcelable("barcode_bitmap"));
        } else if (i == pdc0.f151733c) {
            this.f61716c = State.PREVIEW;
            x94.m209763c().m209776n(this.f61715b.m85875a(), pdc0.f151732b);
        } else if (i == pdc0.f151740j) {
            this.f61714a.getActivity().setResult(-1, (Intent) message.obj);
            this.f61714a.getActivity().finish();
        } else if (i == pdc0.f151736f) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj));
            intent.addFlags(524288);
            this.f61714a.getActivity().startActivity(intent);
        }
    }
}
