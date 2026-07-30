package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import p153l.f1j0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ServerNameList {
    protected Vector serverNameList;

    public ServerNameList(Vector vector) {
        if (vector == null || vector.isEmpty()) {
            wg3.m206174a("'serverNameList' must not be null or empty");
            throw null;
        }
        this.serverNameList = vector;
    }

    public static ServerNameList parse(InputStream inputStream) throws IOException {
        int uint16 = TlsUtils.readUint16(inputStream);
        if (uint16 < 1) {
            f1j0.m123577a(50);
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(TlsUtils.readFully(uint16, inputStream));
        Vector vector = new Vector();
        while (byteArrayInputStream.available() > 0) {
            vector.addElement(ServerName.parse(byteArrayInputStream));
        }
        return new ServerNameList(vector);
    }

    public void encode(OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < this.serverNameList.size(); i++) {
            ((ServerName) this.serverNameList.elementAt(i)).encode(byteArrayOutputStream);
        }
        TlsUtils.checkUint16(byteArrayOutputStream.size());
        TlsUtils.writeUint16(byteArrayOutputStream.size(), outputStream);
        byteArrayOutputStream.writeTo(outputStream);
    }

    public Vector getServerNameList() {
        return this.serverNameList;
    }
}
