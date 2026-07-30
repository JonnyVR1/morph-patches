package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    public DERGenerator(OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z;
        this._tagNo = i;
    }

    private void writeLength(OutputStream outputStream, int i) throws IOException {
        if (i <= 127) {
            outputStream.write((byte) i);
            return;
        }
        int i2 = 1;
        int i3 = i;
        while (true) {
            i3 >>>= 8;
            if (i3 == 0) {
                break;
            } else {
                i2++;
            }
        }
        outputStream.write((byte) (i2 | 128));
        for (int i4 = (i2 - 1) * 8; i4 >= 0; i4 -= 8) {
            outputStream.write((byte) (i >> i4));
        }
    }

    public void writeDEREncoded(int i, byte[] bArr) throws IOException {
        if (!this._tagged) {
            writeDEREncoded(this._out, i, bArr);
            return;
        }
        int i2 = this._tagNo;
        int i3 = i2 | 128;
        if (this._isExplicit) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeDEREncoded(byteArrayOutputStream, i, bArr);
            writeDEREncoded(this._out, i2 | 160, byteArrayOutputStream.toByteArray());
            return;
        }
        int i4 = i & 32;
        OutputStream outputStream = this._out;
        if (i4 != 0) {
            writeDEREncoded(outputStream, i2 | 160, bArr);
        } else {
            writeDEREncoded(outputStream, i3, bArr);
        }
    }

    public DERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    public void writeDEREncoded(OutputStream outputStream, int i, byte[] bArr) throws IOException {
        outputStream.write(i);
        writeLength(outputStream, bArr.length);
        outputStream.write(bArr);
    }
}
