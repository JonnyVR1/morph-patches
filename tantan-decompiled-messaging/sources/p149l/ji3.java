package p149l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.StickerBundle;
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
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000f"}, m87232d2 = {"Ll/ji3;", "", "<init>", "()V", "Lorg/json/JSONObject;", "jsonObject", "Landroid/os/Bundle;", "a", "(Lorg/json/JSONObject;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "Ll/ji3$h;", "Ljava/util/Map;", "SETTERS", "h", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ji3 {

    @NotNull
    public static final ji3 INSTANCE = new ji3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<Class<?>, InterfaceC17787h> SETTERS;

    /* JADX INFO: renamed from: l.ji3$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/ji3$a", "Ll/ji3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17780a implements InterfaceC17787h {
        @Override // p149l.ji3.InterfaceC17787h
        /* JADX INFO: renamed from: a */
        public void mo141617a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    /* JADX INFO: renamed from: l.ji3$b */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/ji3$b", "Ll/ji3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17781b implements InterfaceC17787h {
        @Override // p149l.ji3.InterfaceC17787h
        /* JADX INFO: renamed from: a */
        public void mo141617a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    /* JADX INFO: renamed from: l.ji3$c */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/ji3$c", "Ll/ji3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17782c implements InterfaceC17787h {
        @Override // p149l.ji3.InterfaceC17787h
        /* JADX INFO: renamed from: a */
        public void mo141617a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    /* JADX INFO: renamed from: l.ji3$d */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/ji3$d", "Ll/ji3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17783d implements InterfaceC17787h {
        @Override // p149l.ji3.InterfaceC17787h
        /* JADX INFO: renamed from: a */
        public void mo141617a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    /* JADX INFO: renamed from: l.ji3$e */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/ji3$e", "Ll/ji3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17784e implements InterfaceC17787h {
        @Override // p149l.ji3.InterfaceC17787h
        /* JADX INFO: renamed from: a */
        public void mo141617a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            bundle.putString(key, (String) value);
        }
    }

    /* JADX INFO: renamed from: l.ji3$f */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/ji3$f", "Ll/ji3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17785f implements InterfaceC17787h {
        @Override // p149l.ji3.InterfaceC17787h
        /* JADX INFO: renamed from: a */
        public void mo141617a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
            bundle.getClass();
            key.getClass();
            value.getClass();
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* JADX INFO: renamed from: l.ji3$g */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/ji3$g", "Ll/ji3$h;", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "", "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17786g implements InterfaceC17787h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.ji3.InterfaceC17787h
        /* JADX INFO: renamed from: a */
        public void mo141617a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException {
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
                    kg3.m145878a("Unexpected type in an array: ", obj.getClass());
                    return;
                }
                arrayList.add(obj);
            }
            bundle.putStringArrayList(key, arrayList);
        }
    }

    /* JADX INFO: renamed from: l.ji3$h */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/ji3$h;", "", "Landroid/os/Bundle;", StickerBundle.TYPE, "", Constants.KEY_KEY, "value", "", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC17787h {
        /* JADX INFO: renamed from: a */
        void mo141617a(@NotNull Bundle bundle, @NotNull String key, @NotNull Object value) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        SETTERS = map;
        map.put(Boolean.class, new C17780a());
        map.put(Integer.class, new C17781b());
        map.put(Long.class, new C17782c());
        map.put(Double.class, new C17783d());
        map.put(String.class, new C17784e());
        map.put(String[].class, new C17785f());
        map.put(JSONArray.class, new C17786g());
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Bundle m141616a(@NotNull JSONObject jsonObject) throws JSONException {
        jsonObject.getClass();
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m141616a((JSONObject) obj));
                } else {
                    InterfaceC17787h interfaceC17787h = SETTERS.get(obj.getClass());
                    if (interfaceC17787h == null) {
                        kg3.m145878a("Unsupported type: ", obj.getClass());
                        return null;
                    }
                    next.getClass();
                    interfaceC17787h.mo141617a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
