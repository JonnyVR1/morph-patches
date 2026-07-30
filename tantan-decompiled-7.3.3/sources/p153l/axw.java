package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.p046mm.mmfile.Nullable;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class axw {
    /* JADX INFO: renamed from: a */
    public static <T> HashMap m100853a(T t, @Nullable JsonAdapter<T> jsonAdapter) {
        if (jsonAdapter == null) {
            return null;
        }
        String strSerialize = jsonAdapter.serialize(t);
        if (TextUtils.isEmpty(strSerialize)) {
            return null;
        }
        return (HashMap) new Gson().fromJson(strSerialize, (Class) HashMap.class);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m100854b(@Nullable Map<Object, Object> map, JsonAdapter<T> jsonAdapter) {
        if (map != null && !map.isEmpty()) {
            try {
                return jsonAdapter.parse(JSON.toJSONString(map));
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                e.printStackTrace();
            }
        }
        return null;
    }
}
