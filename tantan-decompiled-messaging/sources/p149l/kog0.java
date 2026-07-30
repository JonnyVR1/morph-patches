package p149l;

import Sudthrow.Sudcase;
import Sudthrow.Sudfor;
import Sudthrow.Sudif;
import Sudthrow.Sudnew;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes.dex */
public final class kog0 implements zfg0 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ boolean f124000o = true;

    /* JADX INFO: renamed from: b */
    public final cmg0 f124002b;

    /* JADX INFO: renamed from: e */
    public final ojg0 f124005e;

    /* JADX INFO: renamed from: f */
    public final int f124006f;

    /* JADX INFO: renamed from: n */
    public ieg0 f124014n;

    /* JADX INFO: renamed from: c */
    public volatile boolean f124003c = false;

    /* JADX INFO: renamed from: d */
    public int f124004d = 1;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f124007g = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: h */
    public ajg0 f124008h = null;

    /* JADX INFO: renamed from: i */
    public String f124009i = null;

    /* JADX INFO: renamed from: j */
    public Integer f124010j = null;

    /* JADX INFO: renamed from: k */
    public Boolean f124011k = null;

    /* JADX INFO: renamed from: l */
    public long f124012l = System.currentTimeMillis();

    /* JADX INFO: renamed from: m */
    public final Object f124013m = new Object();

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue f124001a = new LinkedBlockingQueue();

    public kog0(cmg0 cmg0Var, ojg0 ojg0Var) {
        int i = 0;
        this.f124005e = null;
        new LinkedBlockingQueue();
        this.f124002b = cmg0Var;
        this.f124006f = 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = ojg0Var.f144278c;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((qcg0) obj).getClass();
            arrayList.add(new qcg0());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = ojg0Var.f144280e;
        int size2 = arrayList4.size();
        while (i < size2) {
            Object obj2 = arrayList4.get(i);
            i++;
            ((vbg0) obj2).getClass();
            arrayList3.add(new vbg0());
        }
        this.f124005e = new ojg0(arrayList, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0042 A[Catch: all -> 0x001e, Sudfor -> 0x0035, TryCatch #2 {Sudfor -> 0x0035, blocks: (B:24:0x002f, B:30:0x003e, B:32:0x0042, B:36:0x004d, B:37:0x0051, B:38:0x0057, B:40:0x007b, B:41:0x0083, B:42:0x0085, B:43:0x008b, B:45:0x00b4, B:46:0x00b9, B:48:0x00bb, B:49:0x00c0, B:29:0x0039), top: B:74:0x002f, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0049  */
    /* JADX WARN: Code duplicated, block: B:35:0x004c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[Catch: all -> 0x001e, Sudfor -> 0x0035, TryCatch #2 {Sudfor -> 0x0035, blocks: (B:24:0x002f, B:30:0x003e, B:32:0x0042, B:36:0x004d, B:37:0x0051, B:38:0x0057, B:40:0x007b, B:41:0x0083, B:42:0x0085, B:43:0x008b, B:45:0x00b4, B:46:0x00b9, B:48:0x00bb, B:49:0x00c0, B:29:0x0039), top: B:74:0x002f, outer: #4 }] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m146706a(int i, String str, boolean z) {
        pig0 pig0Var;
        String str2;
        try {
            int i2 = this.f124004d;
            if (i2 == 4 || i2 == 5) {
                return;
            }
            if (i2 == 3) {
                if (i == 1006) {
                    if (!f124000o && z) {
                        throw new AssertionError();
                    }
                    this.f124004d = 4;
                    m146710d(i, str, false);
                    return;
                }
                this.f124005e.getClass();
                if (!z) {
                    try {
                        try {
                            this.f124002b.mo107631a(this, i, str);
                        } catch (RuntimeException e) {
                            this.f124002b.mo107633a(this, e);
                        }
                        if (this.f124004d == 3) {
                            pig0Var = new pig0();
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            pig0Var.f149557i = str2;
                            CodingErrorAction codingErrorAction = jjg0.f118294a;
                            try {
                                byte[] bytes = str2.getBytes(StringUtil.__UTF8Alt);
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                                byteBufferAllocate.putInt(pig0Var.f149556h);
                                byteBufferAllocate.position(2);
                                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bytes.length + 2);
                                byteBufferAllocate2.put(byteBufferAllocate);
                                byteBufferAllocate2.put(bytes);
                                byteBufferAllocate2.rewind();
                                pig0Var.f106582c = byteBufferAllocate2;
                                pig0Var.f149556h = i;
                                if (i == 1015) {
                                    pig0Var.f149556h = 1005;
                                    pig0Var.f149557i = "";
                                }
                                try {
                                    byte[] bytes2 = pig0Var.f149557i.getBytes(StringUtil.__UTF8Alt);
                                    ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                                    byteBufferAllocate3.putInt(pig0Var.f149556h);
                                    byteBufferAllocate3.position(2);
                                    ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bytes2.length + 2);
                                    byteBufferAllocate4.put(byteBufferAllocate3);
                                    byteBufferAllocate4.put(bytes2);
                                    byteBufferAllocate4.rewind();
                                    pig0Var.f106582c = byteBufferAllocate4;
                                    pig0Var.mo127138a();
                                    m146709c(Collections.singletonList(pig0Var));
                                } catch (UnsupportedEncodingException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (UnsupportedEncodingException e3) {
                                throw new RuntimeException(e3);
                            }
                        }
                    } catch (Sudfor e4) {
                        this.f124002b.mo107633a(this, e4);
                        m146710d(1006, "generated frame is invalid", false);
                    }
                } else if (this.f124004d == 3) {
                    pig0Var = new pig0();
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    pig0Var.f149557i = str2;
                    CodingErrorAction codingErrorAction2 = jjg0.f118294a;
                    byte[] bytes3 = str2.getBytes(StringUtil.__UTF8Alt);
                    ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(4);
                    byteBufferAllocate5.putInt(pig0Var.f149556h);
                    byteBufferAllocate5.position(2);
                    ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(bytes3.length + 2);
                    byteBufferAllocate6.put(byteBufferAllocate5);
                    byteBufferAllocate6.put(bytes3);
                    byteBufferAllocate6.rewind();
                    pig0Var.f106582c = byteBufferAllocate6;
                    pig0Var.f149556h = i;
                    if (i == 1015) {
                        pig0Var.f149556h = 1005;
                        pig0Var.f149557i = "";
                    }
                    byte[] bytes4 = pig0Var.f149557i.getBytes(StringUtil.__UTF8Alt);
                    ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(4);
                    byteBufferAllocate7.putInt(pig0Var.f149556h);
                    byteBufferAllocate7.position(2);
                    ByteBuffer byteBufferAllocate8 = ByteBuffer.allocate(bytes4.length + 2);
                    byteBufferAllocate8.put(byteBufferAllocate7);
                    byteBufferAllocate8.put(bytes4);
                    byteBufferAllocate8.rewind();
                    pig0Var.f106582c = byteBufferAllocate8;
                    pig0Var.mo127138a();
                    m146709c(Collections.singletonList(pig0Var));
                }
                m146710d(i, str, z);
            } else if (i == -3) {
                if (!f124000o && !z) {
                    throw new AssertionError();
                }
                m146710d(-3, str, true);
            } else if (i == 1002) {
                m146710d(i, str, z);
            } else {
                m146710d(-1, str, false);
            }
            this.f124004d = 4;
            this.f124007g = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX INFO: renamed from: b */
    public final void m146708b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        boolean z = f124000o;
        if (!z && !byteBuffer.hasRemaining()) {
            shg0.m184191a();
            return;
        }
        int i2 = this.f124004d;
        if (i2 == 1) {
            if (this.f124007g.capacity() == 0) {
                byteBuffer2 = byteBuffer;
            } else {
                if (this.f124007g.remaining() < byteBuffer.remaining()) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + this.f124007g.capacity());
                    this.f124007g.flip();
                    byteBufferAllocate.put(this.f124007g);
                    this.f124007g = byteBufferAllocate;
                }
                this.f124007g.put(byteBuffer);
                this.f124007g.flip();
                byteBuffer2 = this.f124007g;
            }
            byteBuffer2.mark();
            try {
                try {
                    int i3 = this.f124006f;
                    if (i3 == 2) {
                        ojg0 ojg0Var = this.f124005e;
                        ojg0Var.getClass();
                        ulg0 ulg0VarM125499b = ojg0Var.m125499b(byteBuffer2);
                        if (ulg0VarM125499b instanceof pbg0) {
                            pbg0 pbg0Var = (pbg0) ulg0VarM125499b;
                            if (this.f124005e.m164643c(pbg0Var) == 1) {
                                this.f124004d = 3;
                                try {
                                    this.f124002b.mo107639a((zfg0) this, (ulg0) pbg0Var);
                                } catch (RuntimeException e) {
                                    this.f124002b.mo107633a(this, e);
                                }
                                i = this.f124004d;
                                if (i != 4 && i != 5) {
                                    if (z && this.f124007g.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                                        shg0.m184191a();
                                        return;
                                    } else if (byteBuffer.hasRemaining()) {
                                        m146712f(byteBuffer);
                                    } else if (this.f124007g.hasRemaining()) {
                                        m146712f(this.f124007g);
                                    }
                                }
                            } else {
                                m146706a(1002, "the handshake did finaly not match", false);
                            }
                        } else {
                            m146710d(1002, "wrong http function", false);
                        }
                    } else if (i3 == 1) {
                        ojg0 ojg0Var2 = this.f124005e;
                        ojg0Var2.f102011a = i3;
                        ulg0 ulg0VarM125499b2 = ojg0Var2.m125499b(byteBuffer2);
                        if (ulg0VarM125499b2 instanceof yqg0) {
                            yqg0 yqg0Var = (yqg0) ulg0VarM125499b2;
                            if (this.f124005e.m164644d(this.f124008h, yqg0Var) == 1) {
                                try {
                                    this.f124002b.m107638a(this, this.f124008h, yqg0Var);
                                    this.f124004d = 3;
                                    try {
                                        this.f124002b.mo107639a(this, yqg0Var);
                                    } catch (RuntimeException e2) {
                                        this.f124002b.mo107633a(this, e2);
                                    }
                                    i = this.f124004d;
                                    if (i != 4) {
                                        if (z) {
                                        }
                                        if (byteBuffer.hasRemaining()) {
                                            m146712f(byteBuffer);
                                        } else if (this.f124007g.hasRemaining()) {
                                            m146712f(this.f124007g);
                                        }
                                    }
                                } catch (Sudfor e3) {
                                    m146710d(e3.f210110Suddo, e3.getMessage(), false);
                                } catch (RuntimeException e4) {
                                    this.f124002b.mo107633a(this, e4);
                                    m146710d(-1, e4.getMessage(), false);
                                }
                            } else {
                                m146706a(1002, "draft " + this.f124005e + " refuses handshake", false);
                            }
                        } else {
                            m146710d(1002, "wrong http function", false);
                        }
                    }
                } catch (Sudnew e5) {
                    m146706a(e5.f210110Suddo, e5.getMessage(), false);
                }
            } catch (Sudif e6) {
                if (this.f124007g.capacity() == 0) {
                    byteBuffer2.reset();
                    int iCapacity = e6.f210111Suddo;
                    if (iCapacity == 0) {
                        iCapacity = byteBuffer2.capacity() + 16;
                    } else if (!f124000o && iCapacity < byteBuffer2.remaining()) {
                        shg0.m184191a();
                        return;
                    }
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iCapacity);
                    this.f124007g = byteBufferAllocate2;
                    byteBufferAllocate2.put(byteBuffer);
                } else {
                    ByteBuffer byteBuffer3 = this.f124007g;
                    byteBuffer3.position(byteBuffer3.limit());
                    ByteBuffer byteBuffer4 = this.f124007g;
                    byteBuffer4.limit(byteBuffer4.capacity());
                }
            }
        } else if (i2 == 3) {
            m146712f(byteBuffer);
        }
        if (f124000o || this.f124004d == 4 || this.f124003c || !byteBuffer.hasRemaining()) {
            return;
        }
        shg0.m184191a();
    }

    /* JADX INFO: renamed from: c */
    public final void m146709c(List list) {
        int i;
        String str;
        byte b;
        int i2 = 3;
        if (this.f124004d != 3) {
            throw new Sudcase();
        }
        if (list == null) {
            x9g0.m207497a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m6g0 m6g0Var = (m6g0) it.next();
            ojg0 ojg0Var = this.f124005e;
            qcg0 qcg0Var = ojg0Var.f144277b;
            ByteBuffer byteBufferMo130005d = m6g0Var.mo130005d();
            int i3 = 0;
            boolean z = ojg0Var.f102011a == 1;
            if (byteBufferMo130005d.remaining() <= 125) {
                i = 1;
            } else {
                i = byteBufferMo130005d.remaining() <= 65535 ? 2 : 8;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferMo130005d.remaining() + (i > 1 ? i + 1 : i) + 1 + (z ? 4 : 0));
            h9g0 h9g0Var = (h9g0) m6g0Var;
            int i4 = h9g0Var.f106581b;
            if (i4 == 1) {
                b = 0;
            } else if (i4 == 2) {
                b = 1;
            } else if (i4 == i2) {
                b = 2;
            } else if (i4 == 6) {
                b = 8;
            } else if (i4 == 4) {
                b = 9;
            } else {
                if (i4 != 5) {
                    switch (i4) {
                        case 1:
                            str = "CONTINUOUS";
                            break;
                        case 2:
                            str = "TEXT";
                            break;
                        case 3:
                            str = "BINARY";
                            break;
                        case 4:
                            str = "PING";
                            break;
                        case 5:
                            str = "PONG";
                            break;
                        case 6:
                            str = "CLOSING";
                            break;
                        default:
                            throw null;
                    }
                    throw new IllegalArgumentException("Don't know how to handle ".concat(str));
                }
                b = 10;
            }
            byteBufferAllocate.put((byte) (b | ((byte) (h9g0Var.f106580a ? -128 : 0))));
            long jRemaining = byteBufferMo130005d.remaining();
            byte[] bArr = new byte[i];
            int i5 = (i * 8) - 8;
            int i6 = 0;
            while (i6 < i) {
                long j = jRemaining;
                bArr[i6] = (byte) (j >>> (i5 - (i6 * 8)));
                i6++;
                jRemaining = j;
            }
            if (i == 1) {
                byteBufferAllocate.put((byte) (bArr[0] | (z ? (byte) -128 : (byte) 0)));
            } else if (i == 2) {
                byteBufferAllocate.put((byte) ((z ? -128 : 0) | 126));
                byteBufferAllocate.put(bArr);
            } else if (i != 8) {
                upk0.m194883a("Size representation not supported/specified");
                return;
            } else {
                byteBufferAllocate.put((byte) ((z ? -128 : 0) | 127));
                byteBufferAllocate.put(bArr);
            }
            if (z) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(ojg0Var.f144284i.nextInt());
                byteBufferAllocate.put(byteBufferAllocate2.array());
                while (byteBufferMo130005d.hasRemaining()) {
                    byteBufferAllocate.put((byte) (byteBufferMo130005d.get() ^ byteBufferAllocate2.get(i3 % 4)));
                    i3++;
                }
            } else {
                byteBufferAllocate.put(byteBufferMo130005d);
                byteBufferMo130005d.flip();
            }
            if (!ojg0.f144276j && byteBufferAllocate.remaining() != 0) {
                throw new AssertionError(byteBufferAllocate.remaining());
            }
            byteBufferAllocate.flip();
            arrayList.add(byteBufferAllocate);
            i2 = 3;
        }
        m146713g(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m146710d(int i, String str, boolean z) {
        if (this.f124003c) {
            return;
        }
        this.f124010j = Integer.valueOf(i);
        this.f124009i = str;
        this.f124011k = Boolean.valueOf(z);
        this.f124003c = true;
        this.f124002b.mo107630a(this);
        try {
            this.f124002b.mo107640b(this, i, str, z);
        } catch (RuntimeException e) {
            this.f124002b.mo107633a(this, e);
        }
        ojg0 ojg0Var = this.f124005e;
        if (ojg0Var != null) {
            ojg0Var.f144283h = null;
            ojg0Var.f144277b = new qcg0();
            ojg0Var.f144279d = null;
        }
        this.f124008h = null;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m146711e(int i, String str, boolean z) {
        int i2 = this.f124004d;
        if (i2 == 5) {
            return;
        }
        if (i2 == 3 && i == 1006) {
            this.f124004d = 4;
        }
        try {
            this.f124002b.mo107632a(this, i, str, z);
        } catch (RuntimeException e) {
            this.f124002b.mo107633a(this, e);
        }
        ojg0 ojg0Var = this.f124005e;
        if (ojg0Var != null) {
            ojg0Var.f144283h = null;
            ojg0Var.f144277b = new qcg0();
            ojg0Var.f144279d = null;
        }
        this.f124008h = null;
        this.f124004d = 5;
    }

    /* JADX INFO: renamed from: f */
    public final void m146712f(ByteBuffer byteBuffer) {
        try {
            Iterator it = this.f124005e.m164647g(byteBuffer).iterator();
            while (it.hasNext()) {
                this.f124005e.m164646f(this, (m6g0) it.next());
            }
        } catch (Sudfor e) {
            this.f124002b.mo107633a(this, e);
            m146706a(e.f210110Suddo, e.getMessage(), false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m146713g(List list) {
        synchronized (this.f124013m) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f124001a.add((ByteBuffer) it.next());
                    this.f124002b.mo107630a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.zfg0
    /* JADX INFO: renamed from: a */
    public final void mo146707a(m6g0 m6g0Var) {
        m146709c(Collections.singletonList(m6g0Var));
    }
}
