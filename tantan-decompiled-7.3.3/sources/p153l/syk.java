package p153l;

import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;

/* JADX INFO: loaded from: classes7.dex */
public interface syk {
    <T> HashCode hashObject(T t, Funnel<? super T> funnel);

    azk newHasher();
}
