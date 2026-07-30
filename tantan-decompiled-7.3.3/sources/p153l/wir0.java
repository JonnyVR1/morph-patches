package p153l;

import com.google.android.gms.internal.ads.zzaft;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wir0 {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f189381a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f189382b;

    public wir0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f189381a = byteArrayOutputStream;
        this.f189382b = new DataOutputStream(byteArrayOutputStream);
    }

    /* JADX INFO: renamed from: b */
    public static void m206596b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m206597a(zzaft zzaftVar) {
        this.f189381a.reset();
        try {
            m206596b(this.f189382b, zzaftVar.zza);
            String str = zzaftVar.zzb;
            if (str == null) {
                str = "";
            }
            m206596b(this.f189382b, str);
            this.f189382b.writeLong(zzaftVar.zzc);
            this.f189382b.writeLong(zzaftVar.zzd);
            this.f189382b.write(zzaftVar.zze);
            this.f189382b.flush();
            return this.f189381a.toByteArray();
        } catch (IOException e) {
            iig0.m140070a(e);
            return null;
        }
    }
}
