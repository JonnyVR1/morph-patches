package com.tencent.liteav.muxer;

import android.content.Context;
import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p094d.C14188c;

/* JADX INFO: renamed from: com.tencent.liteav.muxer.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14282c implements InterfaceC14280a {

    /* JADX INFO: renamed from: a */
    private int f60248a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14280a f60249b;

    public C14282c(Context context, int i) {
        this.f60248a = 0;
        if (i == 0) {
            this.f60248a = 0;
            this.f60249b = new C14283d();
            TXCLog.m84152i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        } else if (i == 1) {
            this.f60248a = 1;
            this.f60249b = new C14281b();
            TXCLog.m84152i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
        } else if (m84822a(context)) {
            this.f60248a = 0;
            this.f60249b = new C14283d();
            TXCLog.m84152i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        } else {
            this.f60248a = 1;
            this.f60249b = new C14281b();
            TXCLog.m84152i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84822a(Context context) {
        C14188c.m84036a().m84062a(context);
        return C14188c.m84036a().m84067d() == 1;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: b */
    public int mo84809b() {
        return this.f60249b.mo84809b();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: c */
    public boolean mo84812c() {
        return this.f60249b.mo84812c();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: b */
    public void mo84811b(byte[] bArr, int i, int i2, long j, int i3) {
        this.f60249b.mo84811b(bArr, i, i2, j, i3);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: b */
    public void mo84810b(MediaFormat mediaFormat) {
        this.f60249b.mo84810b(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public void mo84806a(MediaFormat mediaFormat) {
        this.f60249b.mo84806a(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public void mo84807a(String str) {
        this.f60249b.mo84807a(str);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public void mo84808a(byte[] bArr, int i, int i2, long j, int i3) {
        this.f60249b.mo84808a(bArr, i, i2, j, i3);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public int mo84805a() {
        return this.f60249b.mo84805a();
    }
}
