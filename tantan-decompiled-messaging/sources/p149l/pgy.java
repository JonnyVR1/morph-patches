package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u00020\u0004:\u0001\rJ-\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH¦\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/pgy;", "K", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ll/ihy;", "", Constants.KEY_KEY, "Ll/fa5;", "value", "b", "(Ljava/lang/Object;Ll/fa5;)Ll/fa5;", "get", "(Ljava/lang/Object;)Ll/fa5;", "", "a", "(Ljava/lang/Object;)V", "Ll/ph80;", "predicate", "", Constants.INAPP_DATA_TAG, "(Ll/ph80;)I", "", "c", "(Ll/ph80;)Z", "contains", "(Ljava/lang/Object;)Z", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface pgy<K, V> extends ihy {

    /* JADX INFO: renamed from: l.pgy$a */
    @Metadata(m87231d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"Ll/pgy$a;", "", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface InterfaceC19209a {
    }

    /* JADX INFO: renamed from: a */
    void mo101591a(K key);

    @Nullable
    /* JADX INFO: renamed from: b */
    fa5<V> mo101592b(K key, @NotNull fa5<V> value);

    /* JADX INFO: renamed from: c */
    boolean mo101593c(@NotNull ph80<K> predicate);

    boolean contains(K key);

    /* JADX INFO: renamed from: d */
    int mo101594d(@NotNull ph80<K> predicate);

    @Nullable
    fa5<V> get(K key);
}
