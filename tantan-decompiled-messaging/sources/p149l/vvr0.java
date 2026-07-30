package p149l;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class vvr0 extends rwr0 {
    public vvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", zpr0Var, i, 24);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        if (this.f161368b.m200113q()) {
            m200207c();
            return;
        }
        synchronized (this.f161371e) {
            this.f161371e.m219787t0((String) this.f161372f.invoke(null, this.f161368b.m200101b()));
        }
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: b */
    public final Void mo181444b() throws Exception {
        if (this.f161368b.m200114r()) {
            super.mo181444b();
            return null;
        }
        if (this.f161368b.m200113q()) {
            m200207c();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m200207c() {
        AdvertisingIdClient advertisingIdClientM200106h = this.f161368b.m200106h();
        if (advertisingIdClientM200106h == null) {
            return;
        }
        try {
            AdvertisingIdClient.C2070a info = advertisingIdClientM200106h.getInfo();
            String strM12233a = info.m12233a();
            char[] cArr = yur0.f200119a;
            if (strM12233a != null && strM12233a.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(strM12233a);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strM12233a = irr0.m137915a(bArr, true);
            }
            if (strM12233a != null) {
                synchronized (this.f161371e) {
                    this.f161371e.m219787t0(strM12233a);
                    this.f161371e.m219785s0(info.m12234b());
                    this.f161371e.m219760W(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // p149l.rwr0, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        mo181444b();
        return null;
    }
}
