package p153l;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class s5c extends nvv {
    public s5c(fj80 fj80Var) {
        super(f94.m124626k(), fj80Var);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public static byte[] m184652g(String str) {
        wn80.m207177b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int iIndexOf = str.indexOf(44);
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        if (m184653h(str.substring(0, iIndexOf))) {
            return Base64.decode(strSubstring, 0);
        }
        String strDecode = Uri.decode(strSubstring);
        wn80.m207182g(strDecode);
        return strDecode.getBytes();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public static boolean m184653h(String str) {
        if (!str.contains(Constants.PACKNAME_END)) {
            return false;
        }
        String[] strArrSplit = str.split(Constants.PACKNAME_END);
        return strArrSplit[strArrSplit.length - 1].equals("base64");
    }

    @Override // p153l.nvv
    /* JADX INFO: renamed from: d */
    public n0f mo100405d(ImageRequest imageRequest) throws IOException {
        byte[] bArrM184652g = m184652g(imageRequest.m8639w().toString());
        return m164928c(new ByteArrayInputStream(bArrM184652g), bArrM184652g.length);
    }

    @Override // p153l.nvv
    /* JADX INFO: renamed from: f */
    public String mo100406f() {
        return "DataFetchProducer";
    }
}
