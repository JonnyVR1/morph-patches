package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, m87232d2 = {"Ll/qaq0;", "", "Ll/paq0;", "workTag", "", Constants.INAPP_DATA_TAG, "(Ll/paq0;)V", "", "id", "a", "(Ljava/lang/String;)V", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "", "tags", "b", "(Ljava/lang/String;Ljava/util/Set;)V", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public interface qaq0 {
    /* JADX INFO: renamed from: a */
    void mo173770a(@NotNull String id);

    /* JADX INFO: renamed from: b */
    default void m173771b(@NotNull String id, @NotNull Set<String> tags) {
        id.getClass();
        tags.getClass();
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            mo173773d(new paq0((String) it.next(), id));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    List<String> mo173772c(@NotNull String id);

    /* JADX INFO: renamed from: d */
    void mo173773d(@NotNull paq0 workTag);
}
