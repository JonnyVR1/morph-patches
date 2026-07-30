package p153l;

import Sudthrow.Sudif;
import Sudthrow.Sudnew;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import org.eclipse.jetty.http.HttpVersions;

/* JADX INFO: loaded from: classes.dex */
public abstract class okg0 {

    /* JADX INFO: renamed from: a */
    public int f147755a = 0;

    /* JADX INFO: renamed from: a */
    public static String m168007a(ByteBuffer byteBuffer) {
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
        CodingErrorAction codingErrorAction = rrg0.f164578a;
        try {
            return new String(bArrArray, 0, iLimit, "ASCII");
        } catch (UnsupportedEncodingException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final mwg0 m168008b(ByteBuffer byteBuffer) throws Sudnew {
        mwg0 mwg0Var;
        int i = this.f147755a;
        String strM168007a = m168007a(byteBuffer);
        if (strM168007a == null) {
            throw new Sudif(byteBuffer.capacity() + 128);
        }
        String[] strArrSplit = strM168007a.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, 3);
        if (strArrSplit.length != 3) {
            throw new Sudnew();
        }
        if (i == 1) {
            if (!"101".equals(strArrSplit[1])) {
                throw new Sudnew("Invalid status code received: " + strArrSplit[1] + " Status line: " + strM168007a);
            }
            if (!HttpVersions.HTTP_1_1.equalsIgnoreCase(strArrSplit[0])) {
                throw new Sudnew("Invalid status line received: " + strArrSplit[0] + " Status line: " + strM168007a);
            }
            zng0 zng0Var = new zng0();
            Short.parseShort(strArrSplit[1]);
            zng0Var.f205197b = strArrSplit[2];
            mwg0Var = zng0Var;
        } else {
            if (!"GET".equalsIgnoreCase(strArrSplit[0])) {
                throw new Sudnew("Invalid request method received: " + strArrSplit[0] + " Status line: " + strM168007a);
            }
            if (!HttpVersions.HTTP_1_1.equalsIgnoreCase(strArrSplit[2])) {
                throw new Sudnew("Invalid status line received: " + strArrSplit[2] + " Status line: " + strM168007a);
            }
            irg0 irg0Var = new irg0();
            String str = strArrSplit[1];
            if (str == null) {
                wg3.m206174a("http resource descriptor must not be null");
                return null;
            }
            irg0Var.f116559b = str;
            mwg0Var = irg0Var;
        }
        String strM168007a2 = m168007a(byteBuffer);
        while (strM168007a2 != null && strM168007a2.length() > 0) {
            String[] strArrSplit2 = strM168007a2.split(":", 2);
            if (strArrSplit2.length != 2) {
                throw new Sudnew("not an http header");
            }
            if (mwg0Var.f139094a.containsKey(strArrSplit2[0])) {
                mwg0Var.f139094a.put(strArrSplit2[0], mwg0Var.m160551a(strArrSplit2[0]) + "; " + strArrSplit2[1].replaceFirst("^ +", ""));
            } else {
                mwg0Var.f139094a.put(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
            }
            strM168007a2 = m168007a(byteBuffer);
        }
        if (strM168007a2 != null) {
            return mwg0Var;
        }
        throw new Sudif();
    }
}
