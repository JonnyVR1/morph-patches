package com.uuzuche.lib_zxing.decoding;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ReaderException;
import com.uuzuche.lib_zxing.activity.CaptureFragment;
import java.util.Hashtable;
import p149l.j5c0;
import p149l.nx2;
import p149l.oxc0;
import p149l.p480;
import p149l.rj10;
import p149l.xll;
import p149l.y84;

/* JADX INFO: renamed from: com.uuzuche.lib_zxing.decoding.a */
/* JADX INFO: loaded from: classes2.dex */
final class HandlerC14530a extends Handler {

    /* JADX INFO: renamed from: a */
    private final CaptureFragment f60870a;

    /* JADX INFO: renamed from: b */
    private final rj10 f60871b;

    public HandlerC14530a(CaptureFragment captureFragment, Hashtable<DecodeHintType, Object> hashtable) {
        rj10 rj10Var = new rj10();
        this.f60871b = rj10Var;
        rj10Var.m179542d(hashtable);
        this.f60870a = captureFragment;
    }

    /* JADX INFO: renamed from: a */
    private void m84703a(byte[] bArr, int i, int i2) {
        oxc0 oxc0VarM179541c;
        System.currentTimeMillis();
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        p480 p480VarM213346a = y84.m213344c().m213346a(bArr2, i2, i);
        try {
            oxc0VarM179541c = this.f60871b.m179541c(new nx2(new xll(p480VarM213346a)));
            this.f60871b.reset();
        } catch (ReaderException unused) {
            this.f60871b.reset();
            oxc0VarM179541c = null;
        } catch (Throwable th) {
            this.f60871b.reset();
            throw th;
        }
        if (oxc0VarM179541c == null) {
            Message.obtain(this.f60870a.m84697W3(), j5c0.f116287c).sendToTarget();
            return;
        }
        System.currentTimeMillis();
        oxc0VarM179541c.toString();
        Message messageObtain = Message.obtain(this.f60870a.m84697W3(), j5c0.f116288d, oxc0VarM179541c);
        Bundle bundle = new Bundle();
        bundle.putParcelable("barcode_bitmap", p480VarM213346a.m167375g());
        messageObtain.setData(bundle);
        messageObtain.sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == j5c0.f116286b) {
            m84703a((byte[]) message.obj, message.arg1, message.arg2);
        } else if (i == j5c0.f116292h) {
            Looper.myLooper().quit();
        }
    }
}
