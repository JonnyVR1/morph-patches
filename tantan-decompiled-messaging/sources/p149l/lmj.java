package p149l;

import com.p046p1.mobile.putong.data.LangModel;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class lmj {
    /* JADX INFO: renamed from: a */
    public static String m150590a(String str) {
        LangModel langModelM150591b = m150591b(str);
        return langModelM150591b != null ? langModelM150591b.getLocalName() : "";
    }

    /* JADX INFO: renamed from: b */
    public static LangModel m150591b(String str) {
        try {
            return LangModel.JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }
}
