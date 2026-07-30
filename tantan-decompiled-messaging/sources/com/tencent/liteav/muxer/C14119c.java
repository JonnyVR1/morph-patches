package com.tencent.liteav.muxer;

import android.content.Context;
import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p089d.C14025c;

/* JADX INFO: renamed from: com.tencent.liteav.muxer.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14119c implements InterfaceC14117a {

    /* JADX INFO: renamed from: a */
    private int f59400a;

    /* JADX INFO: renamed from: b */
    private InterfaceC14117a f59401b;

    public C14119c(Context context, int i) {
        this.f59400a = 0;
        if (i == 0) {
            this.f59400a = 0;
            this.f59401b = new C14120d();
            TXCLog.m82969i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        } else if (i == 1) {
            this.f59400a = 1;
            this.f59401b = new C14118b();
            TXCLog.m82969i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
        } else if (m83639a(context)) {
            this.f59400a = 0;
            this.f59401b = new C14120d();
            TXCLog.m82969i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        } else {
            this.f59400a = 1;
            this.f59401b = new C14118b();
            TXCLog.m82969i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83639a(Context context) {
        C14025c.m82853a().m82879a(context);
        return C14025c.m82853a().m82884d() == 1;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: b */
    public int mo83626b() {
        return this.f59401b.mo83626b();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: c */
    public boolean mo83629c() {
        return this.f59401b.mo83629c();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: b */
    public void mo83628b(byte[] bArr, int i, int i2, long j, int i3) {
        this.f59401b.mo83628b(bArr, i, i2, j, i3);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: b */
    public void mo83627b(MediaFormat mediaFormat) {
        this.f59401b.mo83627b(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public void mo83623a(MediaFormat mediaFormat) {
        this.f59401b.mo83623a(mediaFormat);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public void mo83624a(String str) {
        this.f59401b.mo83624a(str);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public void mo83625a(byte[] bArr, int i, int i2, long j, int i3) {
        this.f59401b.mo83625a(bArr, i, i2, j, i3);
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public int mo83622a() {
        return this.f59401b.mo83622a();
    }
}
