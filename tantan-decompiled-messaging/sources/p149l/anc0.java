package p149l;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class anc0 {

    /* JADX INFO: renamed from: a */
    private final String f70726a;

    /* JADX INFO: renamed from: b */
    private final boolean f70727b;

    /* JADX INFO: renamed from: c */
    private final boolean f70728c;

    /* JADX INFO: renamed from: d */
    private final TypeToken<?> f70729d;

    public anc0(String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        this.f70726a = str;
        this.f70729d = typeToken;
        this.f70727b = z;
        this.f70728c = z2;
    }

    /* JADX INFO: renamed from: a */
    public String m97746a() {
        return this.f70726a;
    }

    /* JADX INFO: renamed from: b */
    public TypeToken<?> m97747b() {
        return this.f70729d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m97748c() {
        return this.f70728c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m97749d() {
        return this.f70727b;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo18619e(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

    /* JADX INFO: renamed from: f */
    public abstract void mo18620f(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

    /* JADX INFO: renamed from: g */
    public abstract boolean mo18621g(Object obj) throws IllegalAccessException, IOException;
}
