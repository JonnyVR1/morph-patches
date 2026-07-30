package p153l;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.immomo.moment.util.DateSerializer;
import com.immomo.moment.util.json.IntSerializer;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class vrq {

    /* JADX INFO: renamed from: b */
    private static vrq f185509b = new vrq();

    /* JADX INFO: renamed from: a */
    private Gson f185510a;

    private vrq() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Integer.TYPE, new IntSerializer());
        gsonBuilder.registerTypeAdapter(Integer.class, new IntSerializer());
        gsonBuilder.registerTypeAdapter(Date.class, new DateSerializer());
        gsonBuilder.serializeNulls();
        this.f185510a = gsonBuilder.create();
    }

    /* JADX INFO: renamed from: b */
    public static vrq m202514b() {
        return f185509b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <T> T m202515a(String str, Class<T> cls) throws JsonSyntaxException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return cls.equals(String.class) ? str : (T) this.f185510a.fromJson(str, (Class) cls);
    }

    /* JADX INFO: renamed from: c */
    public String m202516c(String str) throws JsonSyntaxException {
        return kki.m150102e(str);
    }

    /* JADX INFO: renamed from: d */
    public String m202517d(Object obj) {
        return this.f185510a.toJson(obj);
    }
}
