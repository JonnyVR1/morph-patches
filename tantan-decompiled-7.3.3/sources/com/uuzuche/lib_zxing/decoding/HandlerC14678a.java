package com.uuzuche.lib_zxing.decoding;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ReaderException;
import com.uuzuche.lib_zxing.activity.CaptureFragment;
import java.util.Hashtable;
import p153l.bs10;
import p153l.cy2;
import p153l.jol;
import p153l.pdc0;
import p153l.r5d0;
import p153l.vc80;
import p153l.x94;

/* JADX INFO: renamed from: com.uuzuche.lib_zxing.decoding.a */
/* JADX INFO: loaded from: classes2.dex */
final class HandlerC14678a extends Handler {

    /* JADX INFO: renamed from: a */
    private final CaptureFragment f61717a;

    /* JADX INFO: renamed from: b */
    private final bs10 f61718b;

    public HandlerC14678a(CaptureFragment captureFragment, Hashtable<DecodeHintType, Object> hashtable) {
        bs10 bs10Var = new bs10();
        this.f61718b = bs10Var;
        bs10Var.m106195d(hashtable);
        this.f61717a = captureFragment;
    }

    /* JADX INFO: renamed from: a */
    private void m85874a(byte[] bArr, int i, int i2) {
        r5d0 r5d0VarM106194c;
        System.currentTimeMillis();
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        vc80 vc80VarM209765a = x94.m209763c().m209765a(bArr2, i2, i);
        try {
            r5d0VarM106194c = this.f61718b.m106194c(new cy2(new jol(vc80VarM209765a)));
            this.f61718b.reset();
        } catch (ReaderException unused) {
            this.f61718b.reset();
            r5d0VarM106194c = null;
        } catch (Throwable th) {
            this.f61718b.reset();
            throw th;
        }
        if (r5d0VarM106194c == null) {
            Message.obtain(this.f61717a.m85868W3(), pdc0.f151733c).sendToTarget();
            return;
        }
        System.currentTimeMillis();
        r5d0VarM106194c.toString();
        Message messageObtain = Message.obtain(this.f61717a.m85868W3(), pdc0.f151734d, r5d0VarM106194c);
        Bundle bundle = new Bundle();
        bundle.putParcelable("barcode_bitmap", vc80VarM209765a.m200794g());
        messageObtain.setData(bundle);
        messageObtain.sendToTarget();
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == pdc0.f151732b) {
            m85874a((byte[]) message.obj, message.arg1, message.arg2);
        } else if (i == pdc0.f151738h) {
            Looper.myLooper().quit();
        }
    }
}
