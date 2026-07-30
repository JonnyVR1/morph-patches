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
import p149l.j5c0;
import p149l.oxc0;
import p149l.sel0;
import p149l.y84;

/* JADX INFO: loaded from: classes2.dex */
public final class CaptureActivityHandler extends Handler {

    /* JADX INFO: renamed from: a */
    private final CaptureFragment f60867a;

    /* JADX INFO: renamed from: b */
    private final C14531b f60868b;

    /* JADX INFO: renamed from: c */
    private State f60869c;

    public enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public CaptureActivityHandler(CaptureFragment captureFragment, Vector<BarcodeFormat> vector, String str, ViewfinderView viewfinderView) {
        this.f60867a = captureFragment;
        C14531b c14531b = new C14531b(captureFragment, vector, str, new sel0(viewfinderView));
        this.f60868b = c14531b;
        c14531b.start();
        this.f60869c = State.SUCCESS;
        y84.m213344c().m213359p();
        m84701b();
    }

    /* JADX INFO: renamed from: b */
    private void m84701b() {
        if (this.f60869c == State.SUCCESS) {
            this.f60869c = State.PREVIEW;
            y84.m213344c().m213357n(this.f60868b.m84704a(), j5c0.f116286b);
            y84.m213344c().m213356m(this, j5c0.f116285a);
            this.f60867a.m84696V3();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84702a() {
        this.f60869c = State.DONE;
        y84.m213344c().m213360q();
        Message.obtain(this.f60868b.m84704a(), j5c0.f116292h).sendToTarget();
        try {
            this.f60868b.join();
        } catch (InterruptedException unused) {
        }
        removeMessages(j5c0.f116288d);
        removeMessages(j5c0.f116287c);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == j5c0.f116285a) {
            if (this.f60869c == State.PREVIEW) {
                y84.m213344c().m213356m(this, j5c0.f116285a);
                return;
            }
            return;
        }
        if (i == j5c0.f116293i) {
            m84701b();
            return;
        }
        if (i == j5c0.f116288d) {
            this.f60869c = State.SUCCESS;
            Bundle data = message.getData();
            this.f60867a.m84698X3((oxc0) message.obj, data == null ? null : (Bitmap) data.getParcelable("barcode_bitmap"));
        } else if (i == j5c0.f116287c) {
            this.f60869c = State.PREVIEW;
            y84.m213344c().m213357n(this.f60868b.m84704a(), j5c0.f116286b);
        } else if (i == j5c0.f116294j) {
            this.f60867a.getActivity().setResult(-1, (Intent) message.obj);
            this.f60867a.getActivity().finish();
        } else if (i == j5c0.f116290f) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String) message.obj));
            intent.addFlags(524288);
            this.f60867a.getActivity().startActivity(intent);
        }
    }
}
