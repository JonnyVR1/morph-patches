package p153l;

import com.p051p1.mobile.putong.data.LangModel;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class bpj {
    /* JADX INFO: renamed from: a */
    public static String m105844a(String str) {
        LangModel langModelM105845b = m105845b(str);
        return langModelM105845b != null ? langModelM105845b.getLocalName() : "";
    }

    /* JADX INFO: renamed from: b */
    public static LangModel m105845b(String str) {
        try {
            return LangModel.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }
}
