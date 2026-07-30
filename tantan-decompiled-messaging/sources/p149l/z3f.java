package p149l;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z3f {

    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream f201341a;

    /* JADX INFO: renamed from: b */
    public final DataOutputStream f201342b;

    public z3f() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f201341a = byteArrayOutputStream;
        this.f201342b = new DataOutputStream(byteArrayOutputStream);
    }

    /* JADX INFO: renamed from: b */
    public static void m217030b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m217031a(EventMessage eventMessage) {
        this.f201341a.reset();
        try {
            m217030b(this.f201342b, eventMessage.schemeIdUri);
            String str = eventMessage.value;
            if (str == null) {
                str = "";
            }
            m217030b(this.f201342b, str);
            this.f201342b.writeLong(eventMessage.durationMs);
            this.f201342b.writeLong(eventMessage.f7925id);
            this.f201342b.write(eventMessage.messageData);
            this.f201342b.flush();
            return this.f201341a.toByteArray();
        } catch (IOException e) {
            aag0.m95543a(e);
            return null;
        }
    }
}
