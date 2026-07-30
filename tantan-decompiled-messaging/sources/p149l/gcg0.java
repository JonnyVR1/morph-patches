package p149l;

import Sudthrow.Sudif;
import Sudthrow.Sudnew;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import org.eclipse.jetty.http.HttpVersions;

/* JADX INFO: loaded from: classes.dex */
public abstract class gcg0 {

    /* JADX INFO: renamed from: a */
    public int f102011a = 0;

    /* JADX INFO: renamed from: a */
    public static String m125498a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
                byteBufferAllocate = null;
                break;
            }
            byte b2 = byteBuffer.get();
            byteBufferAllocate.put(b2);
            if (b == 13 && b2 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                break;
            }
            b = b2;
        }
        if (byteBufferAllocate == null) {
            return null;
        }
        byte[] bArrArray = byteBufferAllocate.array();
        int iLimit = byteBufferAllocate.limit();
        CodingErrorAction codingErrorAction = jjg0.f118294a;
        try {
            return new String(bArrArray, 0, iLimit, "ASCII");
        } catch (UnsupportedEncodingException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final eog0 m125499b(ByteBuffer byteBuffer) throws Sudnew {
        eog0 eog0Var;
        int i = this.f102011a;
        String strM125498a = m125498a(byteBuffer);
        if (strM125498a == null) {
            throw new Sudif(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = strM125498a.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, 3);
        if (strArrSplit.length != 3) {
            throw new Sudnew();
        }
        if (i == 1) {
            if (!"101".equals(strArrSplit[1])) {
                throw new Sudnew("Invalid status code received: " + strArrSplit[1] + " Status line: " + strM125498a);
            }
            if (!HttpVersions.HTTP_1_1.equalsIgnoreCase(strArrSplit[0])) {
                throw new Sudnew("Invalid status line received: " + strArrSplit[0] + " Status line: " + strM125498a);
            }
            rfg0 rfg0Var = new rfg0();
            Short.parseShort(strArrSplit[1]);
            rfg0Var.f159148b = strArrSplit[2];
            eog0Var = rfg0Var;
        } else {
            if (!"GET".equalsIgnoreCase(strArrSplit[0])) {
                throw new Sudnew("Invalid request method received: " + strArrSplit[0] + " Status line: " + strM125498a);
            }
            if (!HttpVersions.HTTP_1_1.equalsIgnoreCase(strArrSplit[2])) {
                throw new Sudnew("Invalid status line received: " + strArrSplit[2] + " Status line: " + strM125498a);
            }
            ajg0 ajg0Var = new ajg0();
            String str = strArrSplit[1];
            if (str == null) {
                ig3.m135964a("http resource descriptor must not be null");
                return null;
            }
            ajg0Var.f70114b = str;
            eog0Var = ajg0Var;
        }
        String strM125498a2 = m125498a(byteBuffer);
        while (strM125498a2 != null && strM125498a2.length() > 0) {
            String[] strArrSplit2 = strM125498a2.split(":", 2);
            if (strArrSplit2.length != 2) {
                throw new Sudnew("not an http header");
            }
            if (eog0Var.f92442a.containsKey(strArrSplit2[0])) {
                eog0Var.f92442a.put(strArrSplit2[0], eog0Var.m117339a(strArrSplit2[0]) + "; " + strArrSplit2[1].replaceFirst("^ +", ""));
            } else {
                eog0Var.f92442a.put(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            }
            strM125498a2 = m125498a(byteBuffer);
        }
        if (strM125498a2 != null) {
            return eog0Var;
        }
        throw new Sudif();
    }
}
