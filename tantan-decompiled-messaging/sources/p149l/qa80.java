package p149l;

import com.p046p1.mobile.putong.core.data.GuideBoostMode;
import com.p046p1.mobile.putong.core.data.Item;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/qa80;", j6f.GPS_DIRECTION_TRUE, "", "", "size", "get", "(I)Ljava/lang/Object;", Item.TYPE, "", "put", "(Ljava/lang/Object;)V", "a", "(Ljava/lang/Object;)I", GuideBoostMode.pop, "()Ljava/lang/Object;", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface qa80<T> {
    /* JADX INFO: renamed from: a */
    int mo134041a(T item);

    @Nullable
    T get(int size);

    @Nullable
    T pop();

    void put(T item);
}
