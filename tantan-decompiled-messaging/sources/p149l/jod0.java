package p149l;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

/* JADX INFO: loaded from: classes7.dex */
public class jod0 {

    /* JADX INFO: renamed from: b */
    private static jod0 f118951b = new jod0();

    /* JADX INFO: renamed from: a */
    god0 f118952a = new god0(new hod0(false, new C17829a()));

    /* JADX INFO: renamed from: l.jod0$a */
    public class C17829a implements o2m {
        public C17829a() {
        }

        @Override // p149l.o2m
        /* JADX INFO: renamed from: b */
        public void mo18623b(JsonReader jsonReader, TypeToken<?> typeToken, String str, JsonToken jsonToken) {
            eyx.m118802c().m118808g("safejson:" + typeToken + jsonToken + str);
            eyx.m118802c().m118805d(typeToken.toString(), str);
        }
    }

    private jod0() {
    }

    /* JADX INFO: renamed from: b */
    public static jod0 m142454b() {
        return f118951b;
    }

    /* JADX INFO: renamed from: a */
    public <T> T m142455a(String str, Class<T> cls) throws Exception {
        return (T) this.f118952a.m127237e(str, cls);
    }

    /* JADX INFO: renamed from: c */
    public String m142456c(Object obj) throws Exception {
        return this.f118952a.m127238f(obj);
    }
}
