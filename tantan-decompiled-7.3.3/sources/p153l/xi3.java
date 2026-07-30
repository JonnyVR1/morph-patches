package p153l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000f"}, m88121d2 = {"Ll/xi3;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Landroid/os/Bundle;", "a", "(Lorg/json/JSONObject;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "Ll/xi3$h;", "Ljava/util/Map;", "SETTERS", "h", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class xi3 {

    @NotNull
    public static final xi3 INSTANCE = new xi3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<Class<?>, InterfaceC21346h> SETTERS;

    /* JADX INFO: renamed from: l.xi3$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/xi3$a", "Ll/xi3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21339a implements InterfaceC21346h {
        @Override // p153l.xi3.InterfaceC21346h
        /* JADX INFO: renamed from: a */
        public void mo211094a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    /* JADX INFO: renamed from: l.xi3$b */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/xi3$b", "Ll/xi3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21340b implements InterfaceC21346h {
        @Override // p153l.xi3.InterfaceC21346h
        /* JADX INFO: renamed from: a */
        public void mo211094a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    /* JADX INFO: renamed from: l.xi3$c */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/xi3$c", "Ll/xi3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21341c implements InterfaceC21346h {
        @Override // p153l.xi3.InterfaceC21346h
        /* JADX INFO: renamed from: a */
        public void mo211094a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    /* JADX INFO: renamed from: l.xi3$d */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/xi3$d", "Ll/xi3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21342d implements InterfaceC21346h {
        @Override // p153l.xi3.InterfaceC21346h
        /* JADX INFO: renamed from: a */
        public void mo211094a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    /* JADX INFO: renamed from: l.xi3$e */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/xi3$e", "Ll/xi3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21343e implements InterfaceC21346h {
        @Override // p153l.xi3.InterfaceC21346h
        /* JADX INFO: renamed from: a */
        public void mo211094a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putString(key, (String) value);
        }
    }

    /* JADX INFO: renamed from: l.xi3$f */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/xi3$f", "Ll/xi3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21344f implements InterfaceC21346h {
        @Override // p153l.xi3.InterfaceC21346h
        /* JADX INFO: renamed from: a */
        public void mo211094a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* JADX INFO: renamed from: l.xi3$g */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/xi3$g", "Ll/xi3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21345g implements InterfaceC21346h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.xi3.InterfaceC21346h
        /* JADX INFO: renamed from: a */
        public void mo211094a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            JSONArray jSONArray = (JSONArray) value;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(key, arrayList);
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (!(obj instanceof String)) {
                    yg3.m215829a("Unexpected type in an array: ", obj.getClass());
                    return;
                }
                arrayList.add(obj);
            }
            bundle.putStringArrayList(key, arrayList);
        }
    }

    /* JADX INFO: renamed from: l.xi3$h */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/xi3$h;", "", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC21346h {
        /* JADX INFO: renamed from: a */
        void mo211094a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        SETTERS = map;
        map.put(Boolean.class, new C21339a());
        map.put(Integer.class, new C21340b());
        map.put(Long.class, new C21341c());
        map.put(Double.class, new C21342d());
        map.put(String.class, new C21343e());
        map.put(String[].class, new C21344f());
        map.put(JSONArray.class, new C21345g());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bundle m211093a(@NotNull JSONObject jsonObject) throws JSONException {
        jsonObject.getClass();
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m211093a((JSONObject) obj));
                } else {
                    InterfaceC21346h interfaceC21346h = SETTERS.get(obj.getClass());
                    if (interfaceC21346h == null) {
                        yg3.m215829a("Unsupported type: ", obj.getClass());
                        return null;
                    }
                    next.getClass();
                    interfaceC21346h.mo211094a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
