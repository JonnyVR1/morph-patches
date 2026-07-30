package p153l;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class b5s0 extends x5s0 {
    public b5s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", fzr0Var, i, 24);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        if (this.f192519b.m102529q()) {
            m102628c();
            return;
        }
        synchronized (this.f192522e) {
            this.f192522e.m128322t0((String) this.f192523f.invoke(null, this.f192519b.m102517b()));
        }
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: b */
    public final Void mo102627b() throws Exception {
        if (this.f192519b.m102530r()) {
            super.mo102627b();
            return null;
        }
        if (this.f192519b.m102529q()) {
            m102628c();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m102628c() {
        AdvertisingIdClient advertisingIdClientM102522h = this.f192519b.m102522h();
        if (advertisingIdClientM102522h == null) {
            return;
        }
        try {
            AdvertisingIdClient.C2093a info = advertisingIdClientM102522h.getInfo();
            String strM12287a = info.m12287a();
            char[] cArr = e4s0.f92144a;
            if (strM12287a != null && strM12287a.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(strM12287a);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strM12287a = o0s0.m165547a(bArr, true);
            }
            if (strM12287a != null) {
                synchronized (this.f192522e) {
                    this.f192522e.m128322t0(strM12287a);
                    this.f192522e.m128320s0(info.m12288b());
                    this.f192522e.m128295W(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // p153l.x5s0, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        mo102627b();
        return null;
    }
}
