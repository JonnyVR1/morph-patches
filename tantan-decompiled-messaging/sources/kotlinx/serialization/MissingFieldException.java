package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\rB\u0011\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "missingFields", "", "", "message", "cause", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "getMissingFields", "()Ljava/util/List;", "kotlinx-serialization-core"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class MissingFieldException extends SerializationException {

    @NotNull
    private final List<String> missingFields;

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(@NotNull List<String> list, @NotNull String str) {
        String str2;
        list.getClass();
        str.getClass();
        if (list.size() == 1) {
            str2 = "Field '" + list.get(0) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, str2, null);
    }

    @NotNull
    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull List<String> list, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        list.getClass();
        this.missingFields = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(@NotNull String str, @NotNull String str2) {
        this(CollectionsKt.listOf(str), "Field '" + str + "' is required for type with serial name '" + str2 + "', but it was missing", null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public MissingFieldException(@NotNull String str) {
        this(CollectionsKt.listOf(str), "Field '" + str + "' is required, but it was missing", null);
        str.getClass();
    }
}
