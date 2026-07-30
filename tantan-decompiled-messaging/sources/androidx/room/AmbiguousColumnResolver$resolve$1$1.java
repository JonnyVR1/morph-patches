package androidx.room;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import p149l.dk0;
import p149l.ek0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m87232d2 = {"", "startIndex", "endIndex", "", "Ll/ek0;", "resultColumnsSublist", "", "invoke", "(IILjava/util/List;)V", "<anonymous>"}, m87233k = 3, m87234mv = {1, 8, 0})
@SourceDebugExtension
final class AmbiguousColumnResolver$resolve$1$1 extends Lambda implements Function3<Integer, Integer, List<? extends ek0>, Unit> {
    final /* synthetic */ String[] $mapping;
    final /* synthetic */ int $mappingIndex;
    final /* synthetic */ List<List<dk0>> $mappingMatches;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AmbiguousColumnResolver$resolve$1$1(String[] strArr, List<? extends List<dk0>> list, int i) {
        super(3);
        this.$mapping = strArr;
        this.$mappingMatches = list;
        this.$mappingIndex = i;
    }

    public final void invoke(int i, int i2, @NotNull List<ek0> list) {
        Object next;
        list.getClass();
        String[] strArr = this.$mapping;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m87488d(str, ((ek0) next).getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String()));
            ek0 ek0Var = (ek0) next;
            if (ek0Var == null) {
                return;
            }
            arrayList.add(Integer.valueOf(ek0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()));
        }
        this.$mappingMatches.get(this.$mappingIndex).add(new dk0(new IntRange(i, i2 - 1), arrayList));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, List<? extends ek0> list) {
        invoke(num.intValue(), num2.intValue(), (List<ek0>) list);
        return Unit.INSTANCE;
    }
}
