package p002l;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l.ig3;
import okio.Buffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lwt extends wkf0 {

    /* JADX INFO: renamed from: b */
    public byte f15100b = 3;

    /* JADX INFO: renamed from: c */
    public byte f15101c = -1;

    /* JADX INFO: renamed from: d */
    public String f15102d;

    /* JADX INFO: renamed from: e */
    public int f15103e;

    /* JADX INFO: renamed from: f */
    public int f15104f;

    /* JADX INFO: renamed from: g */
    public byte f15105g;

    /* JADX INFO: renamed from: h */
    public byte f15106h;

    @Override // p002l.wkf0
    /* JADX INFO: renamed from: a */
    public void mo17495a(Buffer buffer, lec0 lec0Var) throws EOFException {
        this.f15100b = buffer.readByte();
        m17503m(buffer.readByte());
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(buffer.readByteArray(8L));
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f15102d = String.valueOf(byteBufferWrap.order(byteOrder).getLong());
        this.f15103e = ByteBuffer.wrap(buffer.readByteArray(4L)).order(byteOrder).getInt();
        this.f15104f = ByteBuffer.wrap(buffer.readByteArray(2L)).order(byteOrder).getShort();
        this.f15105g = buffer.readByte();
        buffer.readByte();
        lec0Var.m17157m().mo26978a("decode header:" + toString());
    }

    @Override // p002l.wkf0
    /* JADX INFO: renamed from: b */
    public void mo17496b(Buffer buffer, lec0 lec0Var) throws IllegalArgumentException {
        lec0Var.m17157m().mo26978a("encode header:" + toString());
        byte b = this.f15101c;
        if (b == -1) {
            ig3.a("message type is not define");
            return;
        }
        if (b != 1 && this.f15103e == 0) {
            ig3.a("body length is null and is not ping type");
            return;
        }
        buffer.writeByte(this.f15100b);
        buffer.writeByte(this.f15101c);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        buffer.write(byteBufferWrap.order(byteOrder).putLong(Long.valueOf(this.f15102d).longValue()).array());
        buffer.write(ByteBuffer.wrap(new byte[4]).order(byteOrder).putInt(this.f15103e).array());
        buffer.write(ByteBuffer.wrap(new byte[4]).order(byteOrder).array());
    }

    @Override // p002l.wkf0
    /* JADX INFO: renamed from: c */
    public int mo17497c() {
        return this.f15103e;
    }

    @Override // p002l.wkf0
    /* JADX INFO: renamed from: d */
    public int mo17498d() {
        return 18;
    }

    @Override // p002l.wkf0
    /* JADX INFO: renamed from: i */
    public void mo17499i(String str) {
        super.mo17499i(str);
        if ("connect".equals(str)) {
            this.f15101c = (byte) 2;
            return;
        }
        if ("auth".equals(str)) {
            this.f15101c = (byte) 3;
            return;
        }
        if ("normal".equals(str)) {
            this.f15101c = (byte) 0;
        } else if ("ping".equals(str)) {
            this.f15101c = (byte) 1;
        } else if ("ack".equals(str)) {
            this.f15101c = (byte) 4;
        }
    }

    /* JADX INFO: renamed from: j */
    public byte m17500j() {
        return this.f15105g;
    }

    /* JADX INFO: renamed from: k */
    public boolean m17501k() {
        int i = this.f15104f;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: l */
    public void m17502l(int i) {
        this.f15103e = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m17503m(int i) {
        if (i == 2) {
            mo17499i("connect");
            return;
        }
        if (i == 3) {
            mo17499i("auth");
            return;
        }
        if (i == 0) {
            mo17499i("normal");
        } else if (i == 1) {
            mo17499i("ping");
        } else if (i == 4) {
            mo17499i("ack");
        }
    }

    /* JADX INFO: renamed from: n */
    public void m17504n(String str) {
        this.f15102d = str;
    }

    public String toString() {
        return "LiveSocketHeader{messageVersion=" + ((int) this.f15100b) + ", messageType=" + ((int) this.f15101c) + ", userId='" + this.f15102d + "', bodyLength=" + this.f15103e + ", statusCode=" + this.f15104f + ", decompressCode=" + ((int) this.f15105g) + ", extra=" + ((int) this.f15106h) + '}';
    }
}
