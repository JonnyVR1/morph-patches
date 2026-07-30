package p153l;

import android.text.TextUtils;
import com.google.protobuf.Any;
import com.google.protobuf.C3437l;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes9.dex */
public class qq60 {
    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC3442q> Any m177480a(T t) {
        String strSubstring = t.getClass().getPackage() != null ? t.getClass().getPackage().getName().substring(27) : "";
        StringBuilder sb = new StringBuilder("type.googleapis.com/");
        if (TextUtils.isEmpty(strSubstring)) {
            sb.append(t.getClass().getSimpleName());
        } else {
            sb.append(strSubstring);
            sb.append(".");
            sb.append(t.getClass().getSimpleName());
        }
        return Any.newBuilder().m16939a(sb.toString()).m16940b(t.toByteString()).build();
    }

    /* JADX INFO: renamed from: b */
    public static <T extends InterfaceC3442q> T m177481b(Class<T> cls, Any any) throws InvalidProtocolBufferException {
        return (T) C3437l.m17261a(cls).getParserForType().mo17132b(any.getValue());
    }
}
