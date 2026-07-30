package p153l;

import com.p051p1.mobile.putong.core.data.Prediction;
import com.p051p1.mobile.putong.core.data.StructuredFormatting;

/* JADX INFO: loaded from: classes10.dex */
public class lxw {

    /* JADX INFO: renamed from: a */
    public String f134014a;

    /* JADX INFO: renamed from: b */
    public String f134015b;

    /* JADX INFO: renamed from: c */
    public String f134016c;

    public lxw(String str, String str2, String str3) {
        this.f134014a = str;
        this.f134015b = str2;
        this.f134016c = str3;
    }

    /* JADX INFO: renamed from: a */
    public static lxw m156250a(Prediction prediction) {
        StructuredFormatting structuredFormatting = prediction.structured_formatting;
        return new lxw(structuredFormatting.main_text, structuredFormatting.secondary_text, prediction.place_id);
    }

    /* JADX INFO: renamed from: b */
    public String m156251b() {
        return this.f134015b;
    }

    /* JADX INFO: renamed from: c */
    public String m156252c() {
        return this.f134016c;
    }

    /* JADX INFO: renamed from: d */
    public String m156253d() {
        return this.f134014a;
    }
}
