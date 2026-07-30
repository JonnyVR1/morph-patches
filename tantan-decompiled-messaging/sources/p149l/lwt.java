package p149l;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class lwt extends wkf0 {

    /* JADX INFO: renamed from: b */
    public byte f130302b = 3;

    /* JADX INFO: renamed from: c */
    public byte f130303c = -1;

    /* JADX INFO: renamed from: d */
    public String f130304d;

    /* JADX INFO: renamed from: e */
    public int f130305e;

    /* JADX INFO: renamed from: f */
    public int f130306f;

    /* JADX INFO: renamed from: g */
    public byte f130307g;

    /* JADX INFO: renamed from: h */
    public byte f130308h;

    @Override // p149l.wkf0
    /* JADX INFO: renamed from: a */
    public void mo152006a(Buffer buffer, lec0 lec0Var) throws EOFException {
        this.f130302b = buffer.readByte();
        m152014m(buffer.readByte());
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(buffer.readByteArray(8L));
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f130304d = String.valueOf(byteBufferWrap.order(byteOrder).getLong());
        this.f130305e = ByteBuffer.wrap(buffer.readByteArray(4L)).order(byteOrder).getInt();
        this.f130306f = ByteBuffer.wrap(buffer.readByteArray(2L)).order(byteOrder).getShort();
        this.f130307g = buffer.readByte();
        buffer.readByte();
        lec0Var.m149499m().mo216485a("decode header:" + toString());
    }

    @Override // p149l.wkf0
    /* JADX INFO: renamed from: b */
    public void mo152007b(Buffer buffer, lec0 lec0Var) throws IllegalArgumentException {
        lec0Var.m149499m().mo216485a("encode header:" + toString());
        byte b = this.f130303c;
        if (b == -1) {
            ig3.m135964a("message type is not define");
            return;
        }
        if (b != 1 && this.f130305e == 0) {
            ig3.m135964a("body length is null and is not ping type");
            return;
        }
        buffer.writeByte((int) this.f130302b);
        buffer.writeByte((int) this.f130303c);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        buffer.write(byteBufferWrap.order(byteOrder).putLong(Long.valueOf(this.f130304d).longValue()).array());
        buffer.write(ByteBuffer.wrap(new byte[4]).order(byteOrder).putInt(this.f130305e).array());
        buffer.write(ByteBuffer.wrap(new byte[4]).order(byteOrder).array());
    }

    @Override // p149l.wkf0
    /* JADX INFO: renamed from: c */
    public int mo152008c() {
        return this.f130305e;
    }

    @Override // p149l.wkf0
    /* JADX INFO: renamed from: d */
    public int mo152009d() {
        return 18;
    }

    @Override // p149l.wkf0
    /* JADX INFO: renamed from: i */
    public void mo152010i(String str) {
        super.mo152010i(str);
        if ("connect".equals(str)) {
            this.f130303c = (byte) 2;
            return;
        }
        if ("auth".equals(str)) {
            this.f130303c = (byte) 3;
            return;
        }
        if ("normal".equals(str)) {
            this.f130303c = (byte) 0;
        } else if ("ping".equals(str)) {
            this.f130303c = (byte) 1;
        } else if ("ack".equals(str)) {
            this.f130303c = (byte) 4;
        }
    }

    /* JADX INFO: renamed from: j */
    public byte m152011j() {
        return this.f130307g;
    }

    /* JADX INFO: renamed from: k */
    public boolean m152012k() {
        int i = this.f130306f;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: l */
    public void m152013l(int i) {
        this.f130305e = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m152014m(int i) {
        if (i == 2) {
            mo152010i("connect");
            return;
        }
        if (i == 3) {
            mo152010i("auth");
            return;
        }
        if (i == 0) {
            mo152010i("normal");
        } else if (i == 1) {
            mo152010i("ping");
        } else if (i == 4) {
            mo152010i("ack");
        }
    }

    /* JADX INFO: renamed from: n */
    public void m152015n(String str) {
        this.f130304d = str;
    }

    public String toString() {
        return "LiveSocketHeader{messageVersion=" + ((int) this.f130302b) + ", messageType=" + ((int) this.f130303c) + ", userId='" + this.f130304d + "', bodyLength=" + this.f130305e + ", statusCode=" + this.f130306f + ", decompressCode=" + ((int) this.f130307g) + ", extra=" + ((int) this.f130308h) + '}';
    }
}
