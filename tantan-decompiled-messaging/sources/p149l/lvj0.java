package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/lvj0;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.KEY_KEY, "b", "()Lkotlin/jvm/functions/Function1;", "c", "()Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class lvj0 {

    @NotNull
    public static final lvj0 INSTANCE = new lvj0();

    private lvj0() {
    }

    /* JADX INFO: renamed from: a */
    public static String m151898a(String str) {
        UUID uuidNameUUIDFromBytes;
        String string;
        str.getClass();
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            uuidNameUUIDFromBytes = UUID.nameUUIDFromBytes(bytes);
        } catch (InternalError unused) {
            String.valueOf(str.hashCode());
            uuidNameUUIDFromBytes = null;
        }
        return (uuidNameUUIDFromBytes == null || (string = uuidNameUUIDFromBytes.toString()) == null) ? String.valueOf(str.hashCode()) : string;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function1<String, String> m151899b() {
        return new Function1() { // from class: l.kvj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lvj0.m151898a((String) obj);
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m151900c() {
        Function1<String, String> function1M151899b = m151899b();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        strValueOf.getClass();
        return function1M151899b.invoke(strValueOf);
    }
}
