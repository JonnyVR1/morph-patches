package p149l;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {j6f.GPS_DIRECTION_TRUE, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "Lkotlin/Function1;", "", "transform", "", "a", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/text/StringsKt")
public class l0g0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static <T> void m148098a(@NotNull Appendable appendable, T t, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        appendable.getClass();
        if (function1 != null) {
            appendable.append(function1.invoke(t));
            return;
        }
        if (t == 0 ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }
}
