package androidx.room;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import p149l.dk0;
import p149l.lmr;

/* JADX INFO: renamed from: androidx.room.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, m87232d2 = {"Landroidx/room/a;", "", "", "Ll/dk0;", "matches", "", "coverageOffset", "overlaps", "<init>", "(Ljava/util/List;II)V", "other", "a", "(Landroidx/room/a;)I", "Ljava/util/List;", "getMatches", "()Ljava/util/List;", "b", "I", "getCoverageOffset", "()I", "c", "getOverlaps", "Companion", "room-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C0664a implements Comparable<C0664a> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C0664a f2980d = new C0664a(CollectionsKt.emptyList(), Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<dk0> matches;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int coverageOffset;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int overlaps;

    /* JADX INFO: renamed from: androidx.room.a$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Landroidx/room/a$a;", "", "<init>", "()V", "", "Ll/dk0;", "matches", "Landroidx/room/a;", "a", "(Ljava/util/List;)Landroidx/room/a;", "room-common"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0664a m3937a(@NotNull List<dk0> matches) {
            matches.getClass();
            List<dk0> list = matches;
            int i = 0;
            int last = 0;
            for (dk0 dk0Var : list) {
                last += ((dk0Var.getResultRange().getLast() - dk0Var.getResultRange().getFirst()) + 1) - dk0Var.m112156a().size();
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                lmr.m150601a();
                return null;
            }
            int first = ((dk0) it.next()).getResultRange().getFirst();
            while (it.hasNext()) {
                int first2 = ((dk0) it.next()).getResultRange().getFirst();
                if (first > first2) {
                    first = first2;
                }
            }
            Iterator<T> it2 = list.iterator();
            if (!it2.hasNext()) {
                lmr.m150601a();
                return null;
            }
            int last2 = ((dk0) it2.next()).getResultRange().getLast();
            while (it2.hasNext()) {
                int last3 = ((dk0) it2.next()).getResultRange().getLast();
                if (last2 < last3) {
                    last2 = last3;
                }
            }
            Iterable intRange = new IntRange(first, last2);
            if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                Iterator it3 = intRange.iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    int iNextInt = ((IntIterator) it3).nextInt();
                    Iterator<T> it4 = list.iterator();
                    int i3 = 0;
                    while (it4.hasNext()) {
                        if (((dk0) it4.next()).getResultRange().m87584i(iNextInt)) {
                            i3++;
                        }
                        if (i3 > 1) {
                            i2++;
                            if (i2 >= 0) {
                                break;
                            }
                            CollectionsKt.throwCountOverflow();
                            break;
                        }
                    }
                }
                i = i2;
            }
            return new C0664a(matches, last, i);
        }

        public Companion() {
        }
    }

    public C0664a(@NotNull List<dk0> list, int i, int i2) {
        list.getClass();
        this.matches = list;
        this.coverageOffset = i;
        this.overlaps = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull C0664a other) {
        other.getClass();
        int iM87489e = Intrinsics.m87489e(this.overlaps, other.overlaps);
        return iM87489e != 0 ? iM87489e : Intrinsics.m87489e(this.coverageOffset, other.coverageOffset);
    }
}
