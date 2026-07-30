package p153l;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fvc0 {

    /* JADX INFO: renamed from: a */
    private final String f101004a;

    /* JADX INFO: renamed from: b */
    private final boolean f101005b;

    /* JADX INFO: renamed from: c */
    private final boolean f101006c;

    /* JADX INFO: renamed from: d */
    private final TypeToken<?> f101007d;

    public fvc0(String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        this.f101004a = str;
        this.f101007d = typeToken;
        this.f101005b = z;
        this.f101006c = z2;
    }

    /* JADX INFO: renamed from: a */
    public String m127604a() {
        return this.f101004a;
    }

    /* JADX INFO: renamed from: b */
    public TypeToken<?> m127605b() {
        return this.f101007d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m127606c() {
        return this.f101006c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m127607d() {
        return this.f101005b;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo19599e(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

    /* JADX INFO: renamed from: f */
    public abstract void mo19600f(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

    /* JADX INFO: renamed from: g */
    public abstract boolean mo19601g(Object obj) throws IllegalAccessException, IOException;
}
