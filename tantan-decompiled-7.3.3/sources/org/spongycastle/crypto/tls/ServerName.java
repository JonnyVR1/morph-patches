package org.spongycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p153l.f1j0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public class ServerName {
    protected Object name;
    protected short nameType;

    public ServerName(short s, Object obj) {
        if (!isCorrectType(s, obj)) {
            wg3.m206174a("'name' is not an instance of the correct type");
            throw null;
        }
        this.nameType = s;
        this.name = obj;
    }

    public static boolean isCorrectType(short s, Object obj) {
        if (s == 0) {
            return obj instanceof String;
        }
        wg3.m206174a("'name' is an unsupported value");
        return false;
    }

    public static ServerName parse(InputStream inputStream) throws IOException {
        short uint8 = TlsUtils.readUint8(inputStream);
        if (uint8 != 0) {
            f1j0.m123577a(50);
            return null;
        }
        byte[] opaque16 = TlsUtils.readOpaque16(inputStream);
        if (opaque16.length >= 1) {
            return new ServerName(uint8, new String(opaque16, "ASCII"));
        }
        f1j0.m123577a(50);
        return null;
    }

    public void encode(OutputStream outputStream) throws IOException {
        TlsUtils.writeUint8(this.nameType, outputStream);
        if (this.nameType != 0) {
            f1j0.m123577a(80);
            return;
        }
        byte[] bytes = ((String) this.name).getBytes("ASCII");
        if (bytes.length >= 1) {
            TlsUtils.writeOpaque16(bytes, outputStream);
        } else {
            f1j0.m123577a(80);
        }
    }

    public String getHostName() {
        if (isCorrectType((short) 0, this.name)) {
            return (String) this.name;
        }
        wtq0.m207906a("'name' is not a HostName string");
        return null;
    }

    public Object getName() {
        return this.name;
    }

    public short getNameType() {
        return this.nameType;
    }
}
