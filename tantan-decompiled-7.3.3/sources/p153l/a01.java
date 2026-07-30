package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d¨\u0006 "}, m88121d2 = {"Ll/a01;", "", "", "accountId", "Lcom/clevertap/android/sdk/Logger;", "logger", "Ll/uzd;", "deviceInfo", "<init>", "(Ljava/lang/String;Lcom/clevertap/android/sdk/Logger;Ll/uzd;)V", "Landroid/content/Context;", "context", "newKey", "oldKey", "Landroid/content/SharedPreferences;", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences;", "Lorg/json/JSONObject;", "a", "(Landroid/content/Context;)Lorg/json/JSONObject;", "arp", "", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lorg/json/JSONObject;)V", "Ljava/lang/String;", "b", "Lcom/clevertap/android/sdk/Logger;", "c", "Ll/uzd;", "()Ljava/lang/String;", "newNamespaceARPKey", "namespaceARPKey", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class a01 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final uzd deviceInfo;

    public a01(@NotNull String str, @NotNull Logger logger, @NotNull uzd uzdVar) {
        str.getClass();
        logger.getClass();
        uzdVar.getClass();
        this.accountId = str;
        this.logger = logger;
        this.deviceInfo = uzdVar;
    }

    /* JADX INFO: renamed from: b */
    private final String m95288b() {
        String str = this.accountId;
        if (str == null) {
            return null;
        }
        this.logger.verbose(str, "Old ARP Key = ARP:".concat(str));
        return "ARP:".concat(str);
    }

    /* JADX INFO: renamed from: c */
    private final String m95289c() {
        String str = this.accountId;
        if (str == null) {
            return null;
        }
        this.logger.verbose(str, "New ARP Key = ARP:" + str + ':' + this.deviceInfo.m198762E());
        return "ARP:" + str + ':' + this.deviceInfo.m198762E();
    }

    /* JADX INFO: renamed from: e */
    private final SharedPreferences m95290e(Context context, String newKey, String oldKey) {
        SharedPreferences sharedPreferencesM199854h = v5g0.m199854h(context, oldKey);
        SharedPreferences sharedPreferencesM199854h2 = v5g0.m199854h(context, newKey);
        SharedPreferences.Editor editorEdit = sharedPreferencesM199854h2.edit();
        Map<String, ?> all = sharedPreferencesM199854h.getAll();
        all.getClass();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            value.getClass();
            if (value instanceof Number) {
                editorEdit.putInt(key, ((Number) value).intValue());
            } else if (value instanceof String) {
                String str = (String) value;
                if (str.length() < 100) {
                    editorEdit.putString(key, str);
                } else {
                    this.logger.verbose(this.accountId, "ARP update for key " + key + " rejected (string value too long)");
                    Unit unit = Unit.INSTANCE;
                }
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            } else {
                this.logger.verbose(this.accountId, "ARP update for key " + key + " rejected (invalid data type)");
                Unit unit2 = Unit.INSTANCE;
            }
        }
        this.logger.verbose(this.accountId, "Completed ARP update for namespace key: " + newKey);
        editorEdit.getClass();
        v5g0.m199858l(editorEdit);
        SharedPreferences.Editor editorEdit2 = sharedPreferencesM199854h.edit();
        editorEdit2.clear();
        editorEdit2.apply();
        return sharedPreferencesM199854h2;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final JSONObject m95291a(@NotNull Context context) {
        context.getClass();
        try {
            String strM95289c = m95289c();
            if (strM95289c == null) {
                return null;
            }
            SharedPreferences sharedPreferencesM199854h = v5g0.m199854h(context, strM95289c);
            Map<String, ?> all = sharedPreferencesM199854h.getAll();
            all.getClass();
            if (all.isEmpty()) {
                sharedPreferencesM199854h = m95290e(context, strM95289c, m95288b());
            }
            Map<String, ?> all2 = sharedPreferencesM199854h.getAll();
            Iterator<Map.Entry<String, ?>> it = all2.entrySet().iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                value.getClass();
                if ((value instanceof Number) && ((Number) value).intValue() == -1) {
                    it.remove();
                }
            }
            JSONObject jSONObject = new JSONObject(all2);
            this.logger.verbose(this.accountId, "Fetched ARP for namespace key: " + strM95289c + " values: " + all2);
            return jSONObject;
        } catch (Exception e) {
            this.logger.verbose(this.accountId, "Failed to construct ARP object", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m95292d(@NotNull Context context, @NotNull JSONObject arp) {
        String strM95289c;
        context.getClass();
        arp.getClass();
        if (arp.length() == 0 || (strM95289c = m95289c()) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = v5g0.m199854h(context, strM95289c).edit();
        Iterator<String> itKeys = arp.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = arp.get(next);
                if (obj instanceof Number) {
                    editorEdit.putInt(next, ((Number) obj).intValue());
                } else if (obj instanceof String) {
                    if (((String) obj).length() < 100) {
                        editorEdit.putString(next, (String) obj);
                    } else {
                        this.logger.verbose(this.accountId, "ARP update for key " + next + " rejected (string value too long)");
                        Unit unit = Unit.INSTANCE;
                    }
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                } else {
                    this.logger.verbose(this.accountId, "ARP update for key " + next + " rejected (invalid data type)");
                    Unit unit2 = Unit.INSTANCE;
                }
            } catch (Exception unused) {
            }
        }
        this.logger.verbose(this.accountId, "Stored ARP for namespace key: " + strM95289c + " values: " + arp);
        editorEdit.getClass();
        v5g0.m199858l(editorEdit);
    }
}
