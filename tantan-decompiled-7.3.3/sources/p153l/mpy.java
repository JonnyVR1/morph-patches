package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u00020\u0004:\u0001\rJ-\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH¦\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/mpy;", "K", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ll/fqy;", "", Constants.KEY_KEY, "Ll/fb5;", "value", "b", "(Ljava/lang/Object;Ll/fb5;)Ll/fb5;", "get", "(Ljava/lang/Object;)Ll/fb5;", "", "a", "(Ljava/lang/Object;)V", "Ll/up80;", "predicate", "", Constants.INAPP_DATA_TAG, "(Ll/up80;)I", "", "c", "(Ll/up80;)Z", "contains", "(Ljava/lang/Object;)Z", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface mpy<K, V> extends fqy {

    /* JADX INFO: renamed from: l.mpy$a */
    @Metadata(m88120d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m88121d2 = {"Ll/mpy$a;", "", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface InterfaceC18667a {
    }

    /* JADX INFO: renamed from: a */
    void mo137755a(K key);

    @Nullable
    /* JADX INFO: renamed from: b */
    fb5<V> mo137756b(K key, @NotNull fb5<V> value);

    /* JADX INFO: renamed from: c */
    boolean mo137757c(@NotNull up80<K> predicate);

    boolean contains(K key);

    /* JADX INFO: renamed from: d */
    int mo137758d(@NotNull up80<K> predicate);

    @Nullable
    fb5<V> get(K key);
}
