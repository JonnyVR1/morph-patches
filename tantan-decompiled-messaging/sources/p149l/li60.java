package p149l;

import android.text.TextUtils;
import com.google.protobuf.Any;
import com.google.protobuf.C3414l;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes8.dex */
public class li60 {
    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC3419q> Any m149878a(T t) {
        String strSubstring = t.getClass().getPackage() != null ? t.getClass().getPackage().getName().substring(27) : "";
        StringBuilder sb = new StringBuilder("type.googleapis.com/");
        if (TextUtils.isEmpty(strSubstring)) {
            sb.append(t.getClass().getSimpleName());
        } else {
            sb.append(strSubstring);
            sb.append(".");
            sb.append(t.getClass().getSimpleName());
        }
        return Any.newBuilder().m16884a(sb.toString()).m16885b(t.toByteString()).build();
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC3419q> T m149879b(Class<T> cls, Any any) throws InvalidProtocolBufferException {
        return (T) C3414l.m17206a(cls).getParserForType().mo17077b(any.getValue());
    }
}
