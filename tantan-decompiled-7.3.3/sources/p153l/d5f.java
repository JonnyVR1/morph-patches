package p153l;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class d5f {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f85151a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f85152b;

    public d5f() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f85151a = byteArrayOutputStream;
        this.f85152b = new DataOutputStream(byteArrayOutputStream);
    }

    /* JADX INFO: renamed from: b */
    public static void m114296b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m114297a(EventMessage eventMessage) {
        this.f85151a.reset();
        try {
            m114296b(this.f85152b, eventMessage.schemeIdUri);
            String str = eventMessage.value;
            if (str == null) {
                str = "";
            }
            m114296b(this.f85152b, str);
            this.f85152b.writeLong(eventMessage.durationMs);
            this.f85152b.writeLong(eventMessage.f7962id);
            this.f85152b.write(eventMessage.messageData);
            this.f85152b.flush();
            return this.f85151a.toByteArray();
        } catch (IOException e) {
            iig0.m140070a(e);
            return null;
        }
    }
}
