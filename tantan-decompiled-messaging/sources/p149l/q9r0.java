package p149l;

import com.google.android.gms.internal.ads.zzaft;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class q9r0 {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f153468a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f153469b;

    public q9r0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f153468a = byteArrayOutputStream;
        this.f153469b = new DataOutputStream(byteArrayOutputStream);
    }

    /* JADX INFO: renamed from: b */
    public static void m173671b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m173672a(zzaft zzaftVar) {
        this.f153468a.reset();
        try {
            m173671b(this.f153469b, zzaftVar.zza);
            String str = zzaftVar.zzb;
            if (str == null) {
                str = "";
            }
            m173671b(this.f153469b, str);
            this.f153469b.writeLong(zzaftVar.zzc);
            this.f153469b.writeLong(zzaftVar.zzd);
            this.f153469b.write(zzaftVar.zze);
            this.f153469b.flush();
            return this.f153468a.toByteArray();
        } catch (IOException e) {
            aag0.m95543a(e);
            return null;
        }
    }
}
