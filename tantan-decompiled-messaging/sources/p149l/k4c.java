package p149l;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class k4c extends mtv {
    public k4c(za80 za80Var) {
        super(g84.m124744k(), za80Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public static byte[] m144484g(String str) {
        rf80.m179111b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        if (m144485h(str.substring(0, iIndexOf))) {
            return Base64.decode(strSubstring, 0);
        }
        String strDecode = Uri.decode(strSubstring);
        rf80.m179116g(strDecode);
        return strDecode.getBytes();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public static boolean m144485h(String str) {
        if (!str.contains(Constants.PACKNAME_END)) {
            return false;
        }
        String[] strArrSplit = str.split(Constants.PACKNAME_END);
        return strArrSplit[strArrSplit.length - 1].equals("base64");
    }

    @Override // p149l.mtv
    /* JADX INFO: renamed from: d */
    public jze mo98619d(ImageRequest imageRequest) throws IOException {
        byte[] bArrM144484g = m144484g(imageRequest.m8585w().toString());
        return m156358c(new ByteArrayInputStream(bArrM144484g), bArrM144484g.length);
    }

    @Override // p149l.mtv
    /* JADX INFO: renamed from: f */
    public String mo98620f() {
        return "DataFetchProducer";
    }
}
