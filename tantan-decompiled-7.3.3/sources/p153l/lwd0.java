package p153l;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

/* JADX INFO: loaded from: classes7.dex */
public class lwd0 {

    /* JADX INFO: renamed from: b */
    private static lwd0 f133806b = new lwd0();

    /* JADX INFO: renamed from: a */
    iwd0 f133807a = new iwd0(new jwd0(false, new C18470a()));

    /* JADX INFO: renamed from: l.lwd0$a */
    public class C18470a implements h5m {
        public C18470a() {
        }

        @Override // p153l.h5m
        /* JADX INFO: renamed from: b */
        public void mo19603b(JsonReader jsonReader, TypeToken<?> typeToken, String str, JsonToken jsonToken) {
            b7y.m102882c().m102888g("safejson:" + typeToken + jsonToken + str);
            b7y.m102882c().m102885d(typeToken.toString(), str);
        }
    }

    private lwd0() {
    }

    /* JADX INFO: renamed from: b */
    public static lwd0 m156040b() {
        return f133806b;
    }

    /* JADX INFO: renamed from: a */
    public <T> T m156041a(String str, Class<T> cls) throws Exception {
        return (T) this.f133807a.m142375e(str, cls);
    }

    /* JADX INFO: renamed from: c */
    public String m156042c(Object obj) throws Exception {
        return this.f133807a.m142376f(obj);
    }
}
