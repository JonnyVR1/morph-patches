package p003l;

import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0007\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll/f4k;", "", "<init>", "()V", "", "productId", "Lkotlin/Triple;", "a", "(Ljava/lang/String;)Lkotlin/Triple;", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class f4k {

    @NotNull
    public static final f4k INSTANCE = new f4k();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Triple<String, String, String> m6388a(@Nullable String productId) {
        List listSplit$default = productId != null ? StringsKt.split$default(productId, new String[]{":"}, false, 0, 6, (Object) null) : null;
        return new Triple<>(listSplit$default != null ? (String) CollectionsKt.getOrNull(listSplit$default, 0) : null, listSplit$default != null ? (String) CollectionsKt.getOrNull(listSplit$default, 1) : null, listSplit$default != null ? (String) CollectionsKt.getOrNull(listSplit$default, 2) : null);
    }
}
