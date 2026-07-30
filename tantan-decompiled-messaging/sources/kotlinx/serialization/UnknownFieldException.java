package kotlinx.serialization;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, m87232d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "message", "", "<init>", "(Ljava/lang/String;)V", FirebaseAnalytics.Param.INDEX, "", "(I)V", "kotlinx-serialization-core"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@PublishedApi
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        this("An unknown field for index " + i);
    }

    public UnknownFieldException(@Nullable String str) {
        super(str);
    }
}
