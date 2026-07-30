package p149l;

import android.content.SharedPreferences;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0003R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/qh80;", "", "<init>", "()V", "", "pathID", "predictedEvent", "", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "text", "b", "(Landroid/view/View;Ljava/lang/String;)Ljava/lang/String;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "c", "", "Ljava/util/Map;", "clickedViewPaths", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "shardPreferences", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class qh80 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static SharedPreferences shardPreferences;

    @NotNull
    public static final qh80 INSTANCE = new qh80();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, String> clickedViewPaths = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m174510a(@NotNull String pathID, @NotNull String predictedEvent) {
        if (lsb.m151554d(qh80.class)) {
            return;
        }
        try {
            pathID.getClass();
            predictedEvent.getClass();
            if (!initialized.get()) {
                INSTANCE.m174513c();
            }
            Map<String, String> map = clickedViewPaths;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = shardPreferences;
            if (sharedPreferences == null) {
                Intrinsics.m87502r("shardPreferences");
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", C1657e.m8847l0(MapsKt.toMap(map))).apply();
        } catch (Throwable th) {
            lsb.m151552b(th, qh80.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m174511b(@NotNull View view, @NotNull String text) {
        if (lsb.m151554d(qh80.class)) {
            return null;
        }
        try {
            view.getClass();
            text.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = ccl0.m106072j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return C1657e.m8812E0(jSONObject.toString());
        } catch (Throwable th) {
            lsb.m151552b(th, qh80.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m174512d(@NotNull String pathID) {
        if (lsb.m151554d(qh80.class)) {
            return null;
        }
        try {
            pathID.getClass();
            Map<String, String> map = clickedViewPaths;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, qh80.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m174513c() {
        String str = "";
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C1577c.m8047l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            sharedPreferences.getClass();
            shardPreferences = sharedPreferences;
            Map<String, String> map = clickedViewPaths;
            if (sharedPreferences == null) {
                Intrinsics.m87502r("shardPreferences");
                sharedPreferences = null;
            }
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(C1657e.m8840h0(str));
            atomicBoolean.set(true);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
