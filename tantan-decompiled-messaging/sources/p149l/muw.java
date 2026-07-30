package p149l;

import com.p046p1.mobile.putong.core.data.Prediction;
import com.p046p1.mobile.putong.core.data.StructuredFormatting;

/* JADX INFO: loaded from: classes10.dex */
public class muw {

    /* JADX INFO: renamed from: a */
    public String f135847a;

    /* JADX INFO: renamed from: b */
    public String f135848b;

    /* JADX INFO: renamed from: c */
    public String f135849c;

    public muw(String str, String str2, String str3) {
        this.f135847a = str;
        this.f135848b = str2;
        this.f135849c = str3;
    }

    /* JADX INFO: renamed from: a */
    public static muw m156451a(Prediction prediction) {
        StructuredFormatting structuredFormatting = prediction.structured_formatting;
        return new muw(structuredFormatting.main_text, structuredFormatting.secondary_text, prediction.place_id);
    }

    /* JADX INFO: renamed from: b */
    public String m156452b() {
        return this.f135848b;
    }

    /* JADX INFO: renamed from: c */
    public String m156453c() {
        return this.f135849c;
    }

    /* JADX INFO: renamed from: d */
    public String m156454d() {
        return this.f135847a;
    }
}
