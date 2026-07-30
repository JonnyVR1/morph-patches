package p153l;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, m88121d2 = {"Ll/juj;", "", "<init>", "()V", "", "a", "Ll/jjs;", "giftModel", "", "position", "", "pageId", "b", "(Ll/jjs;ILjava/lang/String;)V", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "giftItemShowSet", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class juj {

    @NotNull
    public static final juj INSTANCE = new juj();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<Integer> giftItemShowSet = new HashSet<>();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m146987a() {
        giftItemShowSet.clear();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m146988b(@NotNull jjs giftModel, int position, @NotNull String pageId) {
        giftModel.getClass();
        pageId.getClass();
        int i = giftModel.m145122h().f45225id;
        HashSet<Integer> hashSet = giftItemShowSet;
        if (hashSet.contains(Integer.valueOf(i))) {
            return;
        }
        hashSet.add(Integer.valueOf(i));
        qzj.m178794k(giftModel, position, pageId);
    }
}
