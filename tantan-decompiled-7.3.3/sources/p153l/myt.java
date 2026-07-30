package p153l;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
public class myt extends ftf0 {

    /* JADX INFO: renamed from: b */
    public byte f139433b = 3;

    /* JADX INFO: renamed from: c */
    public byte f139434c = -1;

    /* JADX INFO: renamed from: d */
    public String f139435d;

    /* JADX INFO: renamed from: e */
    public int f139436e;

    /* JADX INFO: renamed from: f */
    public int f139437f;

    /* JADX INFO: renamed from: g */
    public byte f139438g;

    /* JADX INFO: renamed from: h */
    public byte f139439h;

    @Override // p153l.ftf0
    /* JADX INFO: renamed from: a */
    public void mo127313a(Buffer buffer, smc0 smc0Var) throws EOFException {
        this.f139433b = buffer.readByte();
        m160808m(buffer.readByte());
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(buffer.readByteArray(8L));
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f139435d = String.valueOf(byteBufferWrap.order(byteOrder).getLong());
        this.f139436e = ByteBuffer.wrap(buffer.readByteArray(4L)).order(byteOrder).getInt();
        this.f139437f = ByteBuffer.wrap(buffer.readByteArray(2L)).order(byteOrder).getShort();
        this.f139438g = buffer.readByte();
        buffer.readByte();
        smc0Var.m186795m().mo204126a("decode header:" + toString());
    }

    @Override // p153l.ftf0
    /* JADX INFO: renamed from: b */
    public void mo127314b(Buffer buffer, smc0 smc0Var) throws IllegalArgumentException {
        smc0Var.m186795m().mo204126a("encode header:" + toString());
        byte b = this.f139434c;
        if (b == -1) {
            wg3.m206174a("message type is not define");
            return;
        }
        if (b != 1 && this.f139436e == 0) {
            wg3.m206174a("body length is null and is not ping type");
            return;
        }
        buffer.writeByte((int) this.f139433b);
        buffer.writeByte((int) this.f139434c);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[8]);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        buffer.write(byteBufferWrap.order(byteOrder).putLong(Long.valueOf(this.f139435d).longValue()).array());
        buffer.write(ByteBuffer.wrap(new byte[4]).order(byteOrder).putInt(this.f139436e).array());
        buffer.write(ByteBuffer.wrap(new byte[4]).order(byteOrder).array());
    }

    @Override // p153l.ftf0
    /* JADX INFO: renamed from: c */
    public int mo127315c() {
        return this.f139436e;
    }

    @Override // p153l.ftf0
    /* JADX INFO: renamed from: d */
    public int mo127316d() {
        return 18;
    }

    @Override // p153l.ftf0
    /* JADX INFO: renamed from: i */
    public void mo127321i(String str) {
        super.mo127321i(str);
        if ("connect".equals(str)) {
            this.f139434c = (byte) 2;
            return;
        }
        if ("auth".equals(str)) {
            this.f139434c = (byte) 3;
            return;
        }
        if ("normal".equals(str)) {
            this.f139434c = (byte) 0;
        } else if ("ping".equals(str)) {
            this.f139434c = (byte) 1;
        } else if ("ack".equals(str)) {
            this.f139434c = (byte) 4;
        }
    }

    /* JADX INFO: renamed from: j */
    public byte m160805j() {
        return this.f139438g;
    }

    /* JADX INFO: renamed from: k */
    public boolean m160806k() {
        int i = this.f139437f;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: l */
    public void m160807l(int i) {
        this.f139436e = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m160808m(int i) {
        if (i == 2) {
            mo127321i("connect");
            return;
        }
        if (i == 3) {
            mo127321i("auth");
            return;
        }
        if (i == 0) {
            mo127321i("normal");
        } else if (i == 1) {
            mo127321i("ping");
        } else if (i == 4) {
            mo127321i("ack");
        }
    }

    /* JADX INFO: renamed from: n */
    public void m160809n(String str) {
        this.f139435d = str;
    }

    public String toString() {
        return "LiveSocketHeader{messageVersion=" + ((int) this.f139433b) + ", messageType=" + ((int) this.f139434c) + ", userId='" + this.f139435d + "', bodyLength=" + this.f139436e + ", statusCode=" + this.f139437f + ", decompressCode=" + ((int) this.f139438g) + ", extra=" + ((int) this.f139439h) + '}';
    }
}
