package p153l;

import Sudthrow.Suddo;
import Sudthrow.Sudfor;
import Sudthrow.Sudint;
import Sudthrow.Sudtry;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes.dex */
public final class wrg0 extends okg0 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ boolean f190513j = true;

    /* JADX INFO: renamed from: c */
    public final ArrayList f190515c;

    /* JADX INFO: renamed from: d */
    public dkg0 f190516d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f190517e;

    /* JADX INFO: renamed from: f */
    public ueg0 f190518f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f190519g;

    /* JADX INFO: renamed from: h */
    public ByteBuffer f190520h;

    /* JADX INFO: renamed from: b */
    public ykg0 f190514b = new ykg0();

    /* JADX INFO: renamed from: i */
    public final Random f190521i = new Random();

    public wrg0(List list, List list2) {
        if (list == null || list2 == null) {
            fig0.m125680a();
            throw null;
        }
        this.f190515c = new ArrayList(list.size());
        this.f190517e = new ArrayList(list2.size());
        this.f190519g = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((ykg0) it.next()).getClass().equals(ykg0.class)) {
                z = true;
            }
        }
        this.f190515c.addAll(list);
        if (!z) {
            ArrayList arrayList = this.f190515c;
            arrayList.add(arrayList.size(), this.f190514b);
        }
        this.f190517e.addAll(list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final int m207594c(xjg0 xjg0Var) {
        int iIntValue;
        char c;
        char c2;
        boolean z;
        mwg0 mwg0Var = (mwg0) xjg0Var;
        String strM160551a = mwg0Var.m160551a("Sec-WebSocket-Version");
        if (strM160551a.length() > 0) {
            try {
                iIntValue = new Integer(strM160551a.trim()).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
        } else {
            iIntValue = -1;
        }
        if (iIntValue != 13) {
            return 2;
        }
        mwg0Var.m160551a("Sec-WebSocket-Extensions");
        Iterator it = this.f190515c.iterator();
        if (it.hasNext()) {
            ykg0 ykg0Var = (ykg0) it.next();
            ykg0Var.getClass();
            this.f190514b = ykg0Var;
            c = 1;
        } else {
            c = 2;
        }
        String strM160551a2 = mwg0Var.m160551a("Sec-WebSocket-Protocol");
        ArrayList arrayList = this.f190517e;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2 = 2;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            dkg0 dkg0Var = (dkg0) obj;
            dkg0Var.getClass();
            String[] strArrSplit = strM160551a2.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "").split(Constants.SEPARATOR_COMMA);
            int length = strArrSplit.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if ("".equals(strArrSplit[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                this.f190516d = dkg0Var;
                c2 = 1;
                break;
            }
        }
        return (c2 == 1 && c == 1) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final int m207595d(irg0 irg0Var, gzg0 gzg0Var) {
        char c;
        char c2;
        mwg0 mwg0Var = (mwg0) gzg0Var;
        if (!mwg0Var.m160551a("Upgrade").equalsIgnoreCase("websocket") || !mwg0Var.m160551a(HttpHeaders.CONNECTION).toLowerCase(Locale.ENGLISH).contains("upgrade") || !irg0Var.f139094a.containsKey("Sec-WebSocket-Key") || !mwg0Var.f139094a.containsKey("Sec-WebSocket-Accept")) {
            return 2;
        }
        try {
            if (!ikg0.m140290a(MessageDigest.getInstance("SHA1").digest((irg0Var.m160551a("Sec-WebSocket-Key").trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes())).equals(mwg0Var.m160551a("Sec-WebSocket-Accept"))) {
                return 2;
            }
            mwg0Var.m160551a("Sec-WebSocket-Extensions");
            Iterator it = this.f190515c.iterator();
            if (it.hasNext()) {
                ykg0 ykg0Var = (ykg0) it.next();
                ykg0Var.getClass();
                this.f190514b = ykg0Var;
                c = 1;
            } else {
                c = 2;
            }
            String strM160551a = mwg0Var.m160551a("Sec-WebSocket-Protocol");
            ArrayList arrayList = this.f190517e;
            int size = arrayList.size();
            int i = 0;
            loop0: while (true) {
                if (i >= size) {
                    c2 = 2;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                dkg0 dkg0Var = (dkg0) obj;
                dkg0Var.getClass();
                for (String str : strM160551a.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "").split(Constants.SEPARATOR_COMMA)) {
                    if ("".equals(str)) {
                        this.f190516d = dkg0Var;
                        c2 = 1;
                        break loop0;
                    }
                }
            }
            return (c2 == 1 && c == 1) ? 1 : 2;
        } catch (NoSuchAlgorithmException e) {
            xpg0.m212648a(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final ByteBuffer m207596e() throws Sudtry {
        ArrayList arrayList = this.f190519g;
        int size = arrayList.size();
        long jLimit = 0;
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jLimit += (long) ((ByteBuffer) obj).limit();
        }
        if (jLimit > 2147483647L) {
            throw new Sudtry();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) jLimit);
        ArrayList arrayList2 = this.f190519g;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            byteBufferAllocate.put((ByteBuffer) obj2);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wrg0.class == obj.getClass()) {
            wrg0 wrg0Var = (wrg0) obj;
            ykg0 ykg0Var = this.f190514b;
            ykg0 ykg0Var2 = wrg0Var.f190514b;
            if (ykg0Var == null ? ykg0Var2 != null : !ykg0Var.equals(ykg0Var2)) {
                return false;
            }
            dkg0 dkg0Var = this.f190516d;
            dkg0 dkg0Var2 = wrg0Var.f190516d;
            if (dkg0Var != null) {
                return dkg0Var.equals(dkg0Var2);
            }
            if (dkg0Var2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m207597f(swg0 swg0Var, ueg0 ueg0Var) throws Sudfor {
        int i;
        String str;
        phg0 phg0Var = (phg0) ueg0Var;
        int i2 = phg0Var.f152433b;
        if (i2 == 6) {
            if (ueg0Var instanceof xqg0) {
                xqg0 xqg0Var = (xqg0) ueg0Var;
                i = xqg0Var.f195803h;
                str = xqg0Var.f195804i;
            } else {
                i = 1005;
                str = "";
            }
            if (swg0Var.f170966d == 4) {
                swg0Var.m188321e(i, str, true);
                return;
            } else {
                swg0Var.m188317a(i, str, true);
                return;
            }
        }
        if (i2 == 4) {
            swg0Var.f170964b.m151533a(swg0Var, ueg0Var);
            return;
        }
        if (i2 == 5) {
            swg0Var.f170974l = System.currentTimeMillis();
            swg0Var.f170964b.m151537b(swg0Var, ueg0Var);
            return;
        }
        boolean z = phg0Var.f152432a;
        if (z && i2 != 1) {
            if (this.f190518f != null) {
                throw new Sudfor(1002, "Continuous frame sequence not completed.");
            }
            if (i2 == 2) {
                try {
                    swg0Var.f170964b.mo151530a(swg0Var, rrg0.m182785a(ueg0Var.mo172324d()));
                    return;
                } catch (RuntimeException e) {
                    swg0Var.f170964b.mo151529a(swg0Var, e);
                    return;
                }
            }
            if (i2 != 3) {
                throw new Sudfor(1002, "non control or continious frame expected");
            }
            try {
                swg0Var.f170964b.mo151531a(swg0Var, ueg0Var.mo172324d());
                return;
            } catch (RuntimeException e2) {
                swg0Var.f170964b.mo151529a(swg0Var, e2);
                return;
            }
        }
        if (i2 == 1) {
            ueg0 ueg0Var2 = this.f190518f;
            if (z) {
                if (ueg0Var2 == null) {
                    throw new Sudfor(1002, "Continuous frame sequence was not started.");
                }
                this.f190519g.add(ueg0Var.mo172324d());
                phg0 phg0Var2 = (phg0) this.f190518f;
                int i3 = phg0Var2.f152433b;
                if (i3 == 2) {
                    phg0Var2.mo172323b(m207596e());
                    ((phg0) this.f190518f).mo122951a();
                    try {
                        swg0Var.f170964b.mo151530a(swg0Var, rrg0.m182785a(this.f190518f.mo172324d()));
                    } catch (RuntimeException e3) {
                        swg0Var.f170964b.mo151529a(swg0Var, e3);
                    }
                } else if (i3 == 3) {
                    phg0Var2.mo172323b(m207596e());
                    ((phg0) this.f190518f).mo122951a();
                    try {
                        swg0Var.f170964b.mo151531a(swg0Var, this.f190518f.mo172324d());
                    } catch (RuntimeException e4) {
                        swg0Var.f170964b.mo151529a(swg0Var, e4);
                    }
                }
                this.f190518f = null;
                this.f190519g.clear();
            } else if (ueg0Var2 == null) {
                throw new Sudfor(1002, "Continuous frame sequence was not started.");
            }
        } else {
            if (this.f190518f != null) {
                throw new Sudfor(1002, "Previous continuous frame sequence not completed.");
            }
            this.f190518f = ueg0Var;
            this.f190519g.add(ueg0Var.mo172324d());
        }
        if (i2 == 2 && !rrg0.m182786b(ueg0Var.mo172324d())) {
            throw new Sudfor(1007);
        }
        if (i2 != 1 || this.f190518f == null) {
            return;
        }
        this.f190519g.add(ueg0Var.mo172324d());
    }

    /* JADX INFO: renamed from: g */
    public final List m207598g(ByteBuffer byteBuffer) throws Sudfor {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f190520h == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.f190520h.remaining();
                ByteBuffer byteBuffer2 = this.f190520h;
                if (iRemaining2 <= iRemaining) {
                    byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                    byteBuffer.position(byteBuffer.position() + iRemaining2);
                    linkedList.add(m207599h((ByteBuffer) this.f190520h.duplicate().position(0)));
                    this.f190520h = null;
                    break;
                }
                byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                byteBuffer.position(byteBuffer.position() + iRemaining);
                return Collections.EMPTY_LIST;
            } catch (Suddo e) {
                int i = e.f211031Suddo;
                if (i < 0) {
                    throw new Sudfor(1002, "Negative count");
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                if (!f190513j && byteBufferAllocate.limit() <= this.f190520h.limit()) {
                    aqg0.m99478a();
                    return null;
                }
                this.f190520h.rewind();
                byteBufferAllocate.put(this.f190520h);
                this.f190520h = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m207599h(byteBuffer));
            } catch (Suddo e2) {
                byteBuffer.reset();
                int i2 = e2.f211031Suddo;
                if (i2 < 0) {
                    throw new Sudfor(1002, "Negative count");
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
                this.f190520h = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: h */
    public final phg0 m207599h(ByteBuffer byteBuffer) throws Sudfor, Suddo {
        int i;
        phg0 qmg0Var;
        int iRemaining = byteBuffer.remaining();
        int i2 = 2;
        if (iRemaining < 2) {
            throw new Suddo(2);
        }
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & HttpTokens.SPACE) != 0;
        boolean z4 = (b & Tnaf.POW_2_WIDTH) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & (-128)) != 0;
        int iIntValue = (byte) (b2 & 127);
        byte b3 = (byte) (b & 15);
        if (b3 == 0) {
            i = 1;
        } else if (b3 == 1) {
            i = 2;
        } else if (b3 != 2) {
            switch (b3) {
                case 8:
                    i = 6;
                    break;
                case 9:
                    i = 4;
                    break;
                case 10:
                    i = 5;
                    break;
                default:
                    throw new Sudint("Unknown opcode " + ((int) b3));
            }
        } else {
            i = 3;
        }
        if (iIntValue < 0 || iIntValue > 125) {
            if (i == 4 || i == 5 || i == 6) {
                throw new Sudint("more than 125 octets");
            }
            if (iIntValue != 126) {
                i2 = 10;
                if (iRemaining < 10) {
                    throw new Suddo(10);
                }
                byte[] bArr = new byte[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    bArr[i3] = byteBuffer.get();
                }
                long jLongValue = new BigInteger(bArr).longValue();
                if (jLongValue > 2147483647L) {
                    throw new Sudtry();
                }
                iIntValue = (int) jLongValue;
            } else {
                if (iRemaining < 4) {
                    throw new Suddo(4);
                }
                iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i2 = 4;
            }
        }
        int i4 = i2 + (z5 ? 4 : 0) + iIntValue;
        if (iRemaining < i4) {
            throw new Suddo(i4);
        }
        if (iIntValue < 0) {
            throw new Sudfor(1002, "Negative count");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iIntValue);
        if (z5) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i5 = 0; i5 < iIntValue; i5++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr2[i5 % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBufferAllocate.limit() + byteBuffer.position());
        }
        switch (ngg0.f141815a[pxg0.m174221a(i)]) {
            case 1:
                qmg0Var = new qmg0();
                break;
            case 2:
                qmg0Var = new spg0();
                break;
            case 3:
                qmg0Var = new ovg0();
                break;
            case 4:
                qmg0Var = new mjg0();
                break;
            case 5:
                qmg0Var = new xqg0();
                break;
            case 6:
                qmg0Var = new png0();
                break;
            default:
                wg3.m206174a("Supplied opcode is invalid");
                return null;
        }
        qmg0Var.f152432a = z;
        qmg0Var.f152436e = z2;
        qmg0Var.f152437f = z3;
        qmg0Var.f152438g = z4;
        byteBufferAllocate.flip();
        qmg0Var.mo172323b(byteBufferAllocate);
        if (!qmg0Var.f152436e && !qmg0Var.f152437f && !qmg0Var.f152438g) {
            qmg0Var.mo122951a();
            return qmg0Var;
        }
        throw new Sudint("bad rsv RSV1: " + qmg0Var.f152436e + " RSV2: " + qmg0Var.f152437f + " RSV3: " + qmg0Var.f152438g);
    }

    public final int hashCode() {
        return ykg0.class.hashCode() * 31;
    }

    public final String toString() {
        String str = wrg0.class.getSimpleName() + " extension: " + ykg0.class.getSimpleName();
        dkg0 dkg0Var = this.f190516d;
        if (dkg0Var == null) {
            return str;
        }
        dkg0Var.getClass();
        return str.concat(" protocol: ");
    }
}
