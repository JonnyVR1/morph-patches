package p007l;

import android.text.TextUtils;
import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.l;
import com.google.protobuf.q;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class li60 {
    /* JADX INFO: renamed from: a */
    public static <T extends q> Any m9813a(T t) {
        String strSubstring = t.getClass().getPackage() != null ? t.getClass().getPackage().getName().substring(27) : "";
        StringBuilder sb = new StringBuilder("type.googleapis.com/");
        if (TextUtils.isEmpty(strSubstring)) {
            sb.append(t.getClass().getSimpleName());
        } else {
            sb.append(strSubstring);
            sb.append(".");
            sb.append(t.getClass().getSimpleName());
        }
        return Any.newBuilder().a(sb.toString()).b(t.toByteString()).build();
    }

    /* JADX INFO: renamed from: b */
    public static <T extends q> T m9814b(Class<T> cls, Any any) throws InvalidProtocolBufferException {
        return (T) l.a(cls).getParserForType().b(any.getValue());
    }
}
