package p009l;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ll/o400;", "", "<init>", "()V", "Lorg/json/JSONObject;", "input", "", "", "output", "parent", "", "a", "(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/String;)V", "key", "", "index", "c", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "text", "", "d", "(Ljava/lang/CharSequence;)Z", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o400 {

    @NotNull
    public static final o400 INSTANCE = new o400();

    /* JADX INFO: renamed from: a */
    public final void m19607a(@NotNull JSONObject input, @NotNull Map<String, String> output, @Nullable String parent) {
        input.getClass();
        output.getClass();
        Iterator<String> itKeys = input.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = input.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof JSONObject) {
                    next.getClass();
                    m19607a((JSONObject) objOpt, output, m19609c(parent, next, -1));
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Object objOpt2 = jSONArray.opt(i);
                        if (objOpt2 != null) {
                            if (objOpt2 instanceof JSONObject) {
                                next.getClass();
                                m19607a((JSONObject) objOpt2, output, m19609c(parent, next, i));
                            } else {
                                next.getClass();
                                output.put(m19608b(parent, next) + "[" + i + "]", objOpt2.toString());
                            }
                        }
                    }
                } else {
                    next.getClass();
                    output.put(m19608b(parent, next), objOpt.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m19608b(String parent, String key) {
        if (m19610d(parent)) {
            return key;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        parent.getClass();
        return String.format(parent, Arrays.copyOf(new Object[]{key}, 1));
    }

    /* JADX INFO: renamed from: c */
    public final String m19609c(String parent, String key, int index) {
        String str;
        if (index >= 0) {
            str = "[" + index + "][%s]";
        } else {
            str = "[%s]";
        }
        if (!m19610d(parent)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            parent.getClass();
            return String.format(parent, Arrays.copyOf(new Object[]{key}, 1)).concat(str);
        }
        return key + str;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19610d(CharSequence text) {
        return text == null || text.length() == 0;
    }
}
