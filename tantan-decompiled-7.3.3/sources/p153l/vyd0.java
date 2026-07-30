package p153l;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"", p7f.GPS_DIRECTION_TRUE, "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "(Ljava/util/Collection;)Ljava/util/ArrayList;", "savedstate_release"}, m88122k = 5, m88123mv = {2, 0, 0}, m88125xi = 48, m88126xs = "androidx/savedstate/SavedStateWriterKt")
public final /* synthetic */ class vyd0 {
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> ArrayList<T> m203990a(@NotNull Collection<?> collection) {
        collection.getClass();
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }
}
