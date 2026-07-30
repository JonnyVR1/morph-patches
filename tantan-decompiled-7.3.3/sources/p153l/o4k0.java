package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/o4k0;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.KEY_KEY, "b", "()Lkotlin/jvm/functions/Function1;", "c", "()Ljava/lang/String;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class o4k0 {

    @NotNull
    public static final o4k0 INSTANCE = new o4k0();

    private o4k0() {
    }

    /* JADX INFO: renamed from: a */
    public static String m166025a(String str) {
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
    public final Function1<String, String> m166026b() {
        return new Function1() { // from class: l.n4k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o4k0.m166025a((String) obj);
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m166027c() {
        Function1<String, String> function1M166026b = m166026b();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        strValueOf.getClass();
        return function1M166026b.invoke(strValueOf);
    }
}
