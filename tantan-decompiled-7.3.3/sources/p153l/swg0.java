package p153l;

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
public final class swg0 implements hog0 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ boolean f170962o = true;

    /* JADX INFO: renamed from: b */
    public final kug0 f170964b;

    /* JADX INFO: renamed from: e */
    public final wrg0 f170967e;

    /* JADX INFO: renamed from: f */
    public final int f170968f;

    /* JADX INFO: renamed from: n */
    public qmg0 f170976n;

    /* JADX INFO: renamed from: c */
    public volatile boolean f170965c = false;

    /* JADX INFO: renamed from: d */
    public int f170966d = 1;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f170969g = ByteBuffer.allocate(0);

    /* JADX INFO: renamed from: h */
    public irg0 f170970h = null;

    /* JADX INFO: renamed from: i */
    public String f170971i = null;

    /* JADX INFO: renamed from: j */
    public Integer f170972j = null;

    /* JADX INFO: renamed from: k */
    public Boolean f170973k = null;

    /* JADX INFO: renamed from: l */
    public long f170974l = System.currentTimeMillis();

    /* JADX INFO: renamed from: m */
    public final Object f170975m = new Object();

    /* JADX INFO: renamed from: a */
    public final LinkedBlockingQueue f170963a = new LinkedBlockingQueue();

    public swg0(kug0 kug0Var, wrg0 wrg0Var) {
        int i = 0;
        this.f170967e = null;
        new LinkedBlockingQueue();
        this.f170964b = kug0Var;
        this.f170968f = 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = wrg0Var.f190515c;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((ykg0) obj).getClass();
            arrayList.add(new ykg0());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = wrg0Var.f190517e;
        int size2 = arrayList4.size();
        while (i < size2) {
            Object obj2 = arrayList4.get(i);
            i++;
            ((dkg0) obj2).getClass();
            arrayList3.add(new dkg0());
        }
        this.f170967e = new wrg0(arrayList, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0042 A[Catch: all -> 0x001e, Sudfor -> 0x0035, TryCatch #2 {Sudfor -> 0x0035, blocks: (B:24:0x002f, B:30:0x003e, B:32:0x0042, B:36:0x004d, B:37:0x0051, B:38:0x0057, B:40:0x007b, B:41:0x0083, B:42:0x0085, B:43:0x008b, B:45:0x00b4, B:46:0x00b9, B:48:0x00bb, B:49:0x00c0, B:29:0x0039), top: B:74:0x002f, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0049  */
    /* JADX WARN: Code duplicated, block: B:35:0x004c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[Catch: all -> 0x001e, Sudfor -> 0x0035, TryCatch #2 {Sudfor -> 0x0035, blocks: (B:24:0x002f, B:30:0x003e, B:32:0x0042, B:36:0x004d, B:37:0x0051, B:38:0x0057, B:40:0x007b, B:41:0x0083, B:42:0x0085, B:43:0x008b, B:45:0x00b4, B:46:0x00b9, B:48:0x00bb, B:49:0x00c0, B:29:0x0039), top: B:74:0x002f, outer: #4 }] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m188317a(int i, String str, boolean z) {
        xqg0 xqg0Var;
        String str2;
        try {
            int i2 = this.f170966d;
            if (i2 == 4 || i2 == 5) {
                return;
            }
            if (i2 == 3) {
                if (i == 1006) {
                    if (!f170962o && z) {
                        throw new AssertionError();
                    }
                    this.f170966d = 4;
                    m188320d(i, str, false);
                    return;
                }
                this.f170967e.getClass();
                if (!z) {
                    try {
                        try {
                            this.f170964b.mo151527a(this, i, str);
                        } catch (RuntimeException e) {
                            this.f170964b.mo151529a(this, e);
                        }
                        if (this.f170966d == 3) {
                            xqg0Var = new xqg0();
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            xqg0Var.f195804i = str2;
                            CodingErrorAction codingErrorAction = rrg0.f164578a;
                            try {
                                byte[] bytes = str2.getBytes(StringUtil.__UTF8Alt);
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                                byteBufferAllocate.putInt(xqg0Var.f195803h);
                                byteBufferAllocate.position(2);
                                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bytes.length + 2);
                                byteBufferAllocate2.put(byteBufferAllocate);
                                byteBufferAllocate2.put(bytes);
                                byteBufferAllocate2.rewind();
                                xqg0Var.f152434c = byteBufferAllocate2;
                                xqg0Var.f195803h = i;
                                if (i == 1015) {
                                    xqg0Var.f195803h = 1005;
                                    xqg0Var.f195804i = "";
                                }
                                try {
                                    byte[] bytes2 = xqg0Var.f195804i.getBytes(StringUtil.__UTF8Alt);
                                    ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                                    byteBufferAllocate3.putInt(xqg0Var.f195803h);
                                    byteBufferAllocate3.position(2);
                                    ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(bytes2.length + 2);
                                    byteBufferAllocate4.put(byteBufferAllocate3);
                                    byteBufferAllocate4.put(bytes2);
                                    byteBufferAllocate4.rewind();
                                    xqg0Var.f152434c = byteBufferAllocate4;
                                    xqg0Var.mo122951a();
                                    m188319c(Collections.singletonList(xqg0Var));
                                } catch (UnsupportedEncodingException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } catch (UnsupportedEncodingException e3) {
                                throw new RuntimeException(e3);
                            }
                        }
                    } catch (Sudfor e4) {
                        this.f170964b.mo151529a(this, e4);
                        m188320d(1006, "generated frame is invalid", false);
                    }
                } else if (this.f170966d == 3) {
                    xqg0Var = new xqg0();
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    xqg0Var.f195804i = str2;
                    CodingErrorAction codingErrorAction2 = rrg0.f164578a;
                    byte[] bytes3 = str2.getBytes(StringUtil.__UTF8Alt);
                    ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(4);
                    byteBufferAllocate5.putInt(xqg0Var.f195803h);
                    byteBufferAllocate5.position(2);
                    ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(bytes3.length + 2);
                    byteBufferAllocate6.put(byteBufferAllocate5);
                    byteBufferAllocate6.put(bytes3);
                    byteBufferAllocate6.rewind();
                    xqg0Var.f152434c = byteBufferAllocate6;
                    xqg0Var.f195803h = i;
                    if (i == 1015) {
                        xqg0Var.f195803h = 1005;
                        xqg0Var.f195804i = "";
                    }
                    byte[] bytes4 = xqg0Var.f195804i.getBytes(StringUtil.__UTF8Alt);
                    ByteBuffer byteBufferAllocate7 = ByteBuffer.allocate(4);
                    byteBufferAllocate7.putInt(xqg0Var.f195803h);
                    byteBufferAllocate7.position(2);
                    ByteBuffer byteBufferAllocate8 = ByteBuffer.allocate(bytes4.length + 2);
                    byteBufferAllocate8.put(byteBufferAllocate7);
                    byteBufferAllocate8.put(bytes4);
                    byteBufferAllocate8.rewind();
                    xqg0Var.f152434c = byteBufferAllocate8;
                    xqg0Var.mo122951a();
                    m188319c(Collections.singletonList(xqg0Var));
                }
                m188320d(i, str, z);
            } else if (i == -3) {
                if (!f170962o && !z) {
                    throw new AssertionError();
                }
                m188320d(-3, str, true);
            } else if (i == 1002) {
                m188320d(i, str, z);
            } else {
                m188320d(-1, str, false);
            }
            this.f170966d = 4;
            this.f170969g = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX INFO: renamed from: b */
    public final void m188318b(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        boolean z = f170962o;
        if (!z && !byteBuffer.hasRemaining()) {
            aqg0.m99478a();
            return;
        }
        int i2 = this.f170966d;
        if (i2 == 1) {
            if (this.f170969g.capacity() == 0) {
                byteBuffer2 = byteBuffer;
            } else {
                if (this.f170969g.remaining() < byteBuffer.remaining()) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + this.f170969g.capacity());
                    this.f170969g.flip();
                    byteBufferAllocate.put(this.f170969g);
                    this.f170969g = byteBufferAllocate;
                }
                this.f170969g.put(byteBuffer);
                this.f170969g.flip();
                byteBuffer2 = this.f170969g;
            }
            byteBuffer2.mark();
            try {
                try {
                    int i3 = this.f170968f;
                    if (i3 == 2) {
                        wrg0 wrg0Var = this.f170967e;
                        wrg0Var.getClass();
                        Object objM168008b = wrg0Var.m168008b(byteBuffer2);
                        if (objM168008b instanceof xjg0) {
                            xjg0 xjg0Var = (xjg0) objM168008b;
                            if (this.f170967e.m207594c(xjg0Var) == 1) {
                                this.f170966d = 3;
                                try {
                                    this.f170964b.mo151532a((hog0) this, (cug0) xjg0Var);
                                } catch (RuntimeException e) {
                                    this.f170964b.mo151529a(this, e);
                                }
                                i = this.f170966d;
                                if (i != 4 && i != 5) {
                                    if (z && this.f170969g.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                                        aqg0.m99478a();
                                        return;
                                    } else if (byteBuffer.hasRemaining()) {
                                        m188322f(byteBuffer);
                                    } else if (this.f170969g.hasRemaining()) {
                                        m188322f(this.f170969g);
                                    }
                                }
                            } else {
                                m188317a(1002, "the handshake did finaly not match", false);
                            }
                        } else {
                            m188320d(1002, "wrong http function", false);
                        }
                    } else if (i3 == 1) {
                        wrg0 wrg0Var2 = this.f170967e;
                        wrg0Var2.f147755a = i3;
                        Object objM168008b2 = wrg0Var2.m168008b(byteBuffer2);
                        if (objM168008b2 instanceof gzg0) {
                            gzg0 gzg0Var = (gzg0) objM168008b2;
                            if (this.f170967e.m207595d(this.f170970h, gzg0Var) == 1) {
                                try {
                                    this.f170964b.m151535a(this, this.f170970h, gzg0Var);
                                    this.f170966d = 3;
                                    try {
                                        this.f170964b.mo151532a(this, gzg0Var);
                                    } catch (RuntimeException e2) {
                                        this.f170964b.mo151529a(this, e2);
                                    }
                                    i = this.f170966d;
                                    if (i != 4) {
                                        if (z) {
                                        }
                                        if (byteBuffer.hasRemaining()) {
                                            m188322f(byteBuffer);
                                        } else if (this.f170969g.hasRemaining()) {
                                            m188322f(this.f170969g);
                                        }
                                    }
                                } catch (Sudfor e3) {
                                    m188320d(e3.f211032Suddo, e3.getMessage(), false);
                                } catch (RuntimeException e4) {
                                    this.f170964b.mo151529a(this, e4);
                                    m188320d(-1, e4.getMessage(), false);
                                }
                            } else {
                                m188317a(1002, "draft " + this.f170967e + " refuses handshake", false);
                            }
                        } else {
                            m188320d(1002, "wrong http function", false);
                        }
                    }
                } catch (Sudnew e5) {
                    m188317a(e5.f211032Suddo, e5.getMessage(), false);
                }
            } catch (Sudif e6) {
                if (this.f170969g.capacity() == 0) {
                    byteBuffer2.reset();
                    int iCapacity = e6.f211033Suddo;
                    if (iCapacity == 0) {
                        iCapacity = byteBuffer2.capacity() + 16;
                    } else if (!f170962o && iCapacity < byteBuffer2.remaining()) {
                        aqg0.m99478a();
                        return;
                    }
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iCapacity);
                    this.f170969g = byteBufferAllocate2;
                    byteBufferAllocate2.put(byteBuffer);
                } else {
                    ByteBuffer byteBuffer3 = this.f170969g;
                    byteBuffer3.position(byteBuffer3.limit());
                    ByteBuffer byteBuffer4 = this.f170969g;
                    byteBuffer4.limit(byteBuffer4.capacity());
                }
            }
        } else if (i2 == 3) {
            m188322f(byteBuffer);
        }
        if (f170962o || this.f170966d == 4 || this.f170965c || !byteBuffer.hasRemaining()) {
            return;
        }
        aqg0.m99478a();
    }

    /* JADX INFO: renamed from: c */
    public final void m188319c(List list) {
        int i;
        String str;
        byte b;
        int i2 = 3;
        if (this.f170966d != 3) {
            throw new Sudcase();
        }
        if (list == null) {
            fig0.m125680a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ueg0 ueg0Var = (ueg0) it.next();
            wrg0 wrg0Var = this.f170967e;
            ykg0 ykg0Var = wrg0Var.f190514b;
            ByteBuffer byteBufferMo172324d = ueg0Var.mo172324d();
            int i3 = 0;
            boolean z = wrg0Var.f147755a == 1;
            if (byteBufferMo172324d.remaining() <= 125) {
                i = 1;
            } else {
                i = byteBufferMo172324d.remaining() <= 65535 ? 2 : 8;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferMo172324d.remaining() + (i > 1 ? i + 1 : i) + 1 + (z ? 4 : 0));
            phg0 phg0Var = (phg0) ueg0Var;
            int i4 = phg0Var.f152433b;
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
            byteBufferAllocate.put((byte) (b | ((byte) (phg0Var.f152432a ? -128 : 0))));
            long jRemaining = byteBufferMo172324d.remaining();
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
                azk0.m101074a("Size representation not supported/specified");
                return;
            } else {
                byteBufferAllocate.put((byte) ((z ? -128 : 0) | 127));
                byteBufferAllocate.put(bArr);
            }
            if (z) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(wrg0Var.f190521i.nextInt());
                byteBufferAllocate.put(byteBufferAllocate2.array());
                while (byteBufferMo172324d.hasRemaining()) {
                    byteBufferAllocate.put((byte) (byteBufferMo172324d.get() ^ byteBufferAllocate2.get(i3 % 4)));
                    i3++;
                }
            } else {
                byteBufferAllocate.put(byteBufferMo172324d);
                byteBufferMo172324d.flip();
            }
            if (!wrg0.f190513j && byteBufferAllocate.remaining() != 0) {
                throw new AssertionError(byteBufferAllocate.remaining());
            }
            byteBufferAllocate.flip();
            arrayList.add(byteBufferAllocate);
            i2 = 3;
        }
        m188323g(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m188320d(int i, String str, boolean z) {
        if (this.f170965c) {
            return;
        }
        this.f170972j = Integer.valueOf(i);
        this.f170971i = str;
        this.f170973k = Boolean.valueOf(z);
        this.f170965c = true;
        this.f170964b.mo151526a(this);
        try {
            this.f170964b.mo151536b(this, i, str, z);
        } catch (RuntimeException e) {
            this.f170964b.mo151529a(this, e);
        }
        wrg0 wrg0Var = this.f170967e;
        if (wrg0Var != null) {
            wrg0Var.f190520h = null;
            wrg0Var.f190514b = new ykg0();
            wrg0Var.f190516d = null;
        }
        this.f170970h = null;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m188321e(int i, String str, boolean z) {
        int i2 = this.f170966d;
        if (i2 == 5) {
            return;
        }
        if (i2 == 3 && i == 1006) {
            this.f170966d = 4;
        }
        try {
            this.f170964b.mo151528a(this, i, str, z);
        } catch (RuntimeException e) {
            this.f170964b.mo151529a(this, e);
        }
        wrg0 wrg0Var = this.f170967e;
        if (wrg0Var != null) {
            wrg0Var.f190520h = null;
            wrg0Var.f190514b = new ykg0();
            wrg0Var.f190516d = null;
        }
        this.f170970h = null;
        this.f170966d = 5;
    }

    /* JADX INFO: renamed from: f */
    public final void m188322f(ByteBuffer byteBuffer) {
        try {
            Iterator it = this.f170967e.m207598g(byteBuffer).iterator();
            while (it.hasNext()) {
                this.f170967e.m207597f(this, (ueg0) it.next());
            }
        } catch (Sudfor e) {
            this.f170964b.mo151529a(this, e);
            m188317a(e.f211032Suddo, e.getMessage(), false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m188323g(List list) {
        synchronized (this.f170975m) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f170963a.add((ByteBuffer) it.next());
                    this.f170964b.mo151526a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.hog0
    /* JADX INFO: renamed from: a */
    public final void mo136419a(ueg0 ueg0Var) {
        m188319c(Collections.singletonList(ueg0Var));
    }
}
