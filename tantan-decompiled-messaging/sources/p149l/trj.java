package p149l;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Ll/trj;", "", "<init>", "()V", "", "a", "Ll/ihs;", "giftModel", "", "position", "", "pageId", "b", "(Ll/ihs;ILjava/lang/String;)V", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "giftItemShowSet", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class trj {

    @NotNull
    public static final trj INSTANCE = new trj();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<Integer> giftItemShowSet = new HashSet<>();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m190420a() {
        giftItemShowSet.clear();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m190421b(@NotNull ihs giftModel, int position, @NotNull String pageId) {
        giftModel.getClass();
        pageId.getClass();
        int i = giftModel.m136283h().f44377id;
        HashSet<Integer> hashSet = giftItemShowSet;
        if (hashSet.contains(Integer.valueOf(i))) {
            return;
        }
        hashSet.add(Integer.valueOf(i));
        axj.m99437k(giftModel, position, pageId);
    }
}
