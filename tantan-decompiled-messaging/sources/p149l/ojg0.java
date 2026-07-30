package p149l;

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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes.dex */
public final class ojg0 extends gcg0 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ boolean f144276j = true;

    /* JADX INFO: renamed from: c */
    public final ArrayList f144278c;

    /* JADX INFO: renamed from: d */
    public vbg0 f144279d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f144280e;

    /* JADX INFO: renamed from: f */
    public m6g0 f144281f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f144282g;

    /* JADX INFO: renamed from: h */
    public ByteBuffer f144283h;

    /* JADX INFO: renamed from: b */
    public qcg0 f144277b = new qcg0();

    /* JADX INFO: renamed from: i */
    public final Random f144284i = new Random();

    public ojg0(List list, List list2) {
        if (list == null || list2 == null) {
            x9g0.m207497a();
            throw null;
        }
        this.f144278c = new ArrayList(list.size());
        this.f144280e = new ArrayList(list2.size());
        this.f144282g = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((qcg0) it.next()).getClass().equals(qcg0.class)) {
                z = true;
            }
        }
        this.f144278c.addAll(list);
        if (!z) {
            ArrayList arrayList = this.f144278c;
            arrayList.add(arrayList.size(), this.f144277b);
        }
        this.f144280e.addAll(list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final int m164643c(pbg0 pbg0Var) {
        int iIntValue;
        char c;
        char c2;
        boolean z;
        eog0 eog0Var = (eog0) pbg0Var;
        String strM117339a = eog0Var.m117339a("Sec-WebSocket-Version");
        if (strM117339a.length() > 0) {
            try {
                iIntValue = new Integer(strM117339a.trim()).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
        } else {
            iIntValue = -1;
        }
        if (iIntValue != 13) {
            return 2;
        }
        eog0Var.m117339a("Sec-WebSocket-Extensions");
        Iterator it = this.f144278c.iterator();
        if (it.hasNext()) {
            qcg0 qcg0Var = (qcg0) it.next();
            qcg0Var.getClass();
            this.f144277b = qcg0Var;
            c = 1;
        } else {
            c = 2;
        }
        String strM117339a2 = eog0Var.m117339a("Sec-WebSocket-Protocol");
        ArrayList arrayList = this.f144280e;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2 = 2;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            vbg0 vbg0Var = (vbg0) obj;
            vbg0Var.getClass();
            String[] strArrSplit = strM117339a2.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "").split(Constants.SEPARATOR_COMMA);
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
                this.f144279d = vbg0Var;
                c2 = 1;
                break;
            }
        }
        return (c2 == 1 && c == 1) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final int m164644d(ajg0 ajg0Var, yqg0 yqg0Var) {
        char c;
        char c2;
        eog0 eog0Var = (eog0) yqg0Var;
        if (!eog0Var.m117339a("Upgrade").equalsIgnoreCase("websocket") || !eog0Var.m117339a("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade") || !ajg0Var.f92442a.containsKey("Sec-WebSocket-Key") || !eog0Var.f92442a.containsKey("Sec-WebSocket-Accept")) {
            return 2;
        }
        try {
            if (!acg0.m95722a(MessageDigest.getInstance("SHA1").digest((ajg0Var.m117339a("Sec-WebSocket-Key").trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes())).equals(eog0Var.m117339a("Sec-WebSocket-Accept"))) {
                return 2;
            }
            eog0Var.m117339a("Sec-WebSocket-Extensions");
            Iterator it = this.f144278c.iterator();
            if (it.hasNext()) {
                qcg0 qcg0Var = (qcg0) it.next();
                qcg0Var.getClass();
                this.f144277b = qcg0Var;
                c = 1;
            } else {
                c = 2;
            }
            String strM117339a = eog0Var.m117339a("Sec-WebSocket-Protocol");
            ArrayList arrayList = this.f144280e;
            int size = arrayList.size();
            int i = 0;
            loop0: while (true) {
                if (i >= size) {
                    c2 = 2;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                vbg0 vbg0Var = (vbg0) obj;
                vbg0Var.getClass();
                for (String str : strM117339a.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "").split(Constants.SEPARATOR_COMMA)) {
                    if ("".equals(str)) {
                        this.f144279d = vbg0Var;
                        c2 = 1;
                        break loop0;
                    }
                }
            }
            return (c2 == 1 && c == 1) ? 1 : 2;
        } catch (NoSuchAlgorithmException e) {
            phg0.m168968a(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public final ByteBuffer m164645e() throws Sudtry {
        ArrayList arrayList = this.f144282g;
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
        ArrayList arrayList2 = this.f144282g;
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
        if (obj != null && ojg0.class == obj.getClass()) {
            ojg0 ojg0Var = (ojg0) obj;
            qcg0 qcg0Var = this.f144277b;
            qcg0 qcg0Var2 = ojg0Var.f144277b;
            if (qcg0Var == null ? qcg0Var2 != null : !qcg0Var.equals(qcg0Var2)) {
                return false;
            }
            vbg0 vbg0Var = this.f144279d;
            vbg0 vbg0Var2 = ojg0Var.f144279d;
            if (vbg0Var != null) {
                return vbg0Var.equals(vbg0Var2);
            }
            if (vbg0Var2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m164646f(kog0 kog0Var, m6g0 m6g0Var) throws Sudfor {
        int i;
        String str;
        h9g0 h9g0Var = (h9g0) m6g0Var;
        int i2 = h9g0Var.f106581b;
        if (i2 == 6) {
            if (m6g0Var instanceof pig0) {
                pig0 pig0Var = (pig0) m6g0Var;
                i = pig0Var.f149556h;
                str = pig0Var.f149557i;
            } else {
                i = 1005;
                str = "";
            }
            if (kog0Var.f124004d == 4) {
                kog0Var.m146711e(i, str, true);
                return;
            } else {
                kog0Var.m146706a(i, str, true);
                return;
            }
        }
        if (i2 == 4) {
            kog0Var.f124002b.m107636a(kog0Var, m6g0Var);
            return;
        }
        if (i2 == 5) {
            kog0Var.f124012l = System.currentTimeMillis();
            kog0Var.f124002b.m107641b(kog0Var, m6g0Var);
            return;
        }
        boolean z = h9g0Var.f106580a;
        if (z && i2 != 1) {
            if (this.f144281f != null) {
                throw new Sudfor(1002, "Continuous frame sequence not completed.");
            }
            if (i2 == 2) {
                try {
                    kog0Var.f124002b.mo107634a(kog0Var, jjg0.m141802a(m6g0Var.mo130005d()));
                    return;
                } catch (RuntimeException e) {
                    kog0Var.f124002b.mo107633a(kog0Var, e);
                    return;
                }
            }
            if (i2 != 3) {
                throw new Sudfor(1002, "non control or continious frame expected");
            }
            try {
                kog0Var.f124002b.mo107635a(kog0Var, m6g0Var.mo130005d());
                return;
            } catch (RuntimeException e2) {
                kog0Var.f124002b.mo107633a(kog0Var, e2);
                return;
            }
        }
        if (i2 == 1) {
            m6g0 m6g0Var2 = this.f144281f;
            if (z) {
                if (m6g0Var2 == null) {
                    throw new Sudfor(1002, "Continuous frame sequence was not started.");
                }
                this.f144282g.add(m6g0Var.mo130005d());
                h9g0 h9g0Var2 = (h9g0) this.f144281f;
                int i3 = h9g0Var2.f106581b;
                if (i3 == 2) {
                    h9g0Var2.mo130004b(m164645e());
                    ((h9g0) this.f144281f).mo127138a();
                    try {
                        kog0Var.f124002b.mo107634a(kog0Var, jjg0.m141802a(this.f144281f.mo130005d()));
                    } catch (RuntimeException e3) {
                        kog0Var.f124002b.mo107633a(kog0Var, e3);
                    }
                } else if (i3 == 3) {
                    h9g0Var2.mo130004b(m164645e());
                    ((h9g0) this.f144281f).mo127138a();
                    try {
                        kog0Var.f124002b.mo107635a(kog0Var, this.f144281f.mo130005d());
                    } catch (RuntimeException e4) {
                        kog0Var.f124002b.mo107633a(kog0Var, e4);
                    }
                }
                this.f144281f = null;
                this.f144282g.clear();
            } else if (m6g0Var2 == null) {
                throw new Sudfor(1002, "Continuous frame sequence was not started.");
            }
        } else {
            if (this.f144281f != null) {
                throw new Sudfor(1002, "Previous continuous frame sequence not completed.");
            }
            this.f144281f = m6g0Var;
            this.f144282g.add(m6g0Var.mo130005d());
        }
        if (i2 == 2 && !jjg0.m141803b(m6g0Var.mo130005d())) {
            throw new Sudfor(1007);
        }
        if (i2 != 1 || this.f144281f == null) {
            return;
        }
        this.f144282g.add(m6g0Var.mo130005d());
    }

    /* JADX INFO: renamed from: g */
    public final List m164647g(ByteBuffer byteBuffer) throws Sudfor {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.f144283h == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.f144283h.remaining();
                ByteBuffer byteBuffer2 = this.f144283h;
                if (iRemaining2 <= iRemaining) {
                    byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                    byteBuffer.position(byteBuffer.position() + iRemaining2);
                    linkedList.add(m164648h((ByteBuffer) this.f144283h.duplicate().position(0)));
                    this.f144283h = null;
                    break;
                }
                byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                byteBuffer.position(byteBuffer.position() + iRemaining);
                return Collections.EMPTY_LIST;
            } catch (Suddo e) {
                int i = e.f210109Suddo;
                if (i < 0) {
                    throw new Sudfor(1002, "Negative count");
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                if (!f144276j && byteBufferAllocate.limit() <= this.f144283h.limit()) {
                    shg0.m184191a();
                    return null;
                }
                this.f144283h.rewind();
                byteBufferAllocate.put(this.f144283h);
                this.f144283h = byteBufferAllocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m164648h(byteBuffer));
            } catch (Suddo e2) {
                byteBuffer.reset();
                int i2 = e2.f210109Suddo;
                if (i2 < 0) {
                    throw new Sudfor(1002, "Negative count");
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
                this.f144283h = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: h */
    public final h9g0 m164648h(ByteBuffer byteBuffer) throws Sudfor, Suddo {
        int i;
        h9g0 ieg0Var;
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
        switch (f8g0.f96373a[hpg0.m132337a(i)]) {
            case 1:
                ieg0Var = new ieg0();
                break;
            case 2:
                ieg0Var = new khg0();
                break;
            case 3:
                ieg0Var = new gng0();
                break;
            case 4:
                ieg0Var = new ebg0();
                break;
            case 5:
                ieg0Var = new pig0();
                break;
            case 6:
                ieg0Var = new hfg0();
                break;
            default:
                ig3.m135964a("Supplied opcode is invalid");
                return null;
        }
        ieg0Var.f106580a = z;
        ieg0Var.f106584e = z2;
        ieg0Var.f106585f = z3;
        ieg0Var.f106586g = z4;
        byteBufferAllocate.flip();
        ieg0Var.mo130004b(byteBufferAllocate);
        if (!ieg0Var.f106584e && !ieg0Var.f106585f && !ieg0Var.f106586g) {
            ieg0Var.mo127138a();
            return ieg0Var;
        }
        throw new Sudint("bad rsv RSV1: " + ieg0Var.f106584e + " RSV2: " + ieg0Var.f106585f + " RSV3: " + ieg0Var.f106586g);
    }

    public final int hashCode() {
        return qcg0.class.hashCode() * 31;
    }

    public final String toString() {
        String str = ojg0.class.getSimpleName() + " extension: " + qcg0.class.getSimpleName();
        vbg0 vbg0Var = this.f144279d;
        if (vbg0Var == null) {
            return str;
        }
        vbg0Var.getClass();
        return str.concat(" protocol: ");
    }
}
