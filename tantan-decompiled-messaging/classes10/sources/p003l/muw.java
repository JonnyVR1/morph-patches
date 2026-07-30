package p003l;

import com.p000p1.mobile.putong.core.data.Prediction;
import com.p000p1.mobile.putong.core.data.StructuredFormatting;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class muw {

    /* JADX INFO: renamed from: a */
    public String f6431a;

    /* JADX INFO: renamed from: b */
    public String f6432b;

    /* JADX INFO: renamed from: c */
    public String f6433c;

    public muw(String str, String str2, String str3) {
        this.f6431a = str;
        this.f6432b = str2;
        this.f6433c = str3;
    }

    /* JADX INFO: renamed from: a */
    public static muw m8268a(Prediction prediction) {
        StructuredFormatting structuredFormatting = prediction.structured_formatting;
        return new muw(structuredFormatting.main_text, structuredFormatting.secondary_text, prediction.place_id);
    }

    /* JADX INFO: renamed from: b */
    public String m8269b() {
        return this.f6432b;
    }

    /* JADX INFO: renamed from: c */
    public String m8270c() {
        return this.f6433c;
    }

    /* JADX INFO: renamed from: d */
    public String m8271d() {
        return this.f6431a;
    }
}
