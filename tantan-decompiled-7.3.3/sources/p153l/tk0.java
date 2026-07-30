package p153l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, m88121d2 = {"Ll/tk0;", "", "<init>", "()V", "Landroid/os/Bundle;", "root", "Lorg/json/JSONObject;", "c", "(Landroid/os/Bundle;)Lorg/json/JSONObject;", "b", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "a", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class tk0 {

    @NotNull
    public static final tk0 INSTANCE = new tk0();

    private tk0() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final JSONObject m191471a(@NotNull JSONObject root) {
        root.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_CLICKED_EVENT_NAME);
            jSONObject.put(Constants.KEY_EVT_DATA, root);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final JSONObject m191472b(@NotNull JSONObject root) {
        root.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.NOTIFICATION_VIEWED_EVENT_NAME);
            jSONObject.put(Constants.KEY_EVT_DATA, root);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final JSONObject m191473c(@NotNull Bundle root) throws JSONException {
        root.getClass();
        JSONObject jSONObject = new JSONObject();
        for (String str : root.keySet()) {
            Object obj = root.get(str);
            if (obj instanceof Bundle) {
                JSONObject jSONObjectM191473c = m191473c((Bundle) obj);
                Iterator<String> itKeys = jSONObjectM191473c.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM191473c.get(next));
                }
            } else {
                str.getClass();
                if (C15493d.m94374J(str, Constants.WZRK_PREFIX, false, 2, null)) {
                    jSONObject.put(str, root.get(str));
                }
            }
        }
        return jSONObject;
    }
}
