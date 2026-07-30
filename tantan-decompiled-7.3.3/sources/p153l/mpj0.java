package p153l;

import android.content.Context;
import com.hellogroup.common.p035ui.ResCache;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Landroid/content/Context;", "", "value", "", "a", "(Landroid/content/Context;F)I", "px", "b", "(Landroid/content/Context;I)F", "HelloFoundation_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class mpj0 {
    /* JADX INFO: renamed from: a */
    public static final int m159369a(@NotNull Context context, float f) {
        context.getClass();
        return (int) (f * ResCache.INSTANCE.m17572a().density);
    }

    /* JADX INFO: renamed from: b */
    public static final float m159370b(@NotNull Context context, int i) {
        context.getClass();
        return i / ResCache.INSTANCE.m17572a().density;
    }
}
