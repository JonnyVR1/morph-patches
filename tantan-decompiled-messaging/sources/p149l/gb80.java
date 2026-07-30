package p149l;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, m87232d2 = {"Ll/gb80;", "", "<init>", "()V", "", "a", "Ljava/util/ArrayList;", "Ll/fb80;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "listeners", "customview-poolingcontainer_release"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public final class gb80 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<fb80> listeners = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final void m125124a() {
        for (int lastIndex = CollectionsKt.getLastIndex(this.listeners); -1 < lastIndex; lastIndex--) {
            this.listeners.get(lastIndex).m120349a();
        }
    }
}
