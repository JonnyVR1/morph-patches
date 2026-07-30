package p149l;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.immomo.moment.util.DateSerializer;
import com.immomo.moment.util.json.IntSerializer;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class upq {

    /* JADX INFO: renamed from: b */
    private static upq f177655b = new upq();

    /* JADX INFO: renamed from: a */
    private Gson f177656a;

    private upq() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Integer.TYPE, new IntSerializer());
        gsonBuilder.registerTypeAdapter(Integer.class, new IntSerializer());
        gsonBuilder.registerTypeAdapter(Date.class, new DateSerializer());
        gsonBuilder.serializeNulls();
        this.f177656a = gsonBuilder.create();
    }

    /* JADX INFO: renamed from: b */
    public static upq m194907b() {
        return f177655b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T> T m194908a(String str, Class<T> cls) throws JsonSyntaxException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return cls.equals(String.class) ? str : (T) this.f177656a.fromJson(str, (Class) cls);
    }

    /* JADX INFO: renamed from: c */
    public String m194909c(String str) throws JsonSyntaxException {
        return nhi.m159405e(str);
    }

    /* JADX INFO: renamed from: d */
    public String m194910d(Object obj) {
        return this.f177656a.toJson(obj);
    }
}
