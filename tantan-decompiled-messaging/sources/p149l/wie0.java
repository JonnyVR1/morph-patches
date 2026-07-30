package p149l;

import com.clevertap.android.sdk.Constants;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001b\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m87232d2 = {"Ll/wie0;", j6f.GPS_DIRECTION_TRUE, "", "Ljava/io/InputStream;", "input", "c", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.KEY_T, "Ljava/io/OutputStream;", "output", "", "b", "(Ljava/lang/Object;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "defaultValue", "datastore-core"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public interface wie0<T> {
    /* JADX INFO: renamed from: a */
    T mo136351a();

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo136352b(T t, @NotNull OutputStream outputStream, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo136353c(@NotNull InputStream inputStream, @NotNull Continuation<? super T> continuation);
}
