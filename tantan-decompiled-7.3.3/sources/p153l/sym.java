package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.appevents.p027ml.ModelManager;
import com.facebook.internal.C1678c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m88121d2 = {"Ll/sym;", "", "<init>", "()V", "", "a", "", "", "parameters", "c", "(Ljava/util/Map;)V", "input", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "textFeature", "b", "(Ljava/lang/String;)Ljava/lang/String;", "Z", "enabled", "isSampleEnabled", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class sym {

    @NotNull
    public static final sym INSTANCE = new sym();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isSampleEnabled;

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m188573a() {
        if (ztb.m221490d(sym.class)) {
            return;
        }
        try {
            enabled = true;
            isSampleEnabled = C1678c.m8820d("FBSDKFeatureIntegritySample", C1600c.m8102m(), false);
        } catch (Throwable th) {
            ztb.m221488b(th, sym.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m188574c(@NotNull Map<String, String> parameters) {
        if (ztb.m221490d(sym.class)) {
            return;
        }
        try {
            parameters.getClass();
            if (!enabled || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> list = CollectionsKt.toList(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : list) {
                    String str2 = parameters.get(str);
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str3 = str2;
                    sym symVar = INSTANCE;
                    if (symVar.m188576d(str) || symVar.m188576d(str3)) {
                        parameters.remove(str);
                        if (!isSampleEnabled) {
                            str3 = "";
                        }
                        jSONObject.put(str, str3);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    string.getClass();
                    parameters.put("_onDeviceParams", string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, sym.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m188575b(String textFeature) {
        String str;
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String[] strArrM7995n = ModelManager.m7995n(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{textFeature});
            return (strArrM7995n == null || (str = strArrM7995n[0]) == null) ? "none" : str;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m188576d(String input) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            return !Intrinsics.m88377d("none", m188575b(input));
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }
}
