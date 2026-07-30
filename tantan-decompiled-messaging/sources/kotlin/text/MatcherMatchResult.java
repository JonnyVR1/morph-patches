package kotlin.text;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "next", "()Lkotlin/text/MatchResult;", "a", "Ljava/util/regex/Matcher;", "b", "Ljava/lang/CharSequence;", "Lkotlin/text/MatchGroupCollection;", "c", "Lkotlin/text/MatchGroupCollection;", "()Lkotlin/text/MatchGroupCollection;", "groups", "", "", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "groupValues_", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "range", "()Ljava/util/List;", "groupValues", "Ljava/util/regex/MatchResult;", "e", "()Ljava/util/regex/MatchResult;", "matchResult", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MatcherMatchResult implements MatchResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Matcher matcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CharSequence input;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final MatchGroupCollection groups;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public List<String> groupValues_;

    public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.matcher = matcher;
        this.input = charSequence;
        this.groups = new MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* JADX INFO: renamed from: a */
    public /* bridge */ MatchResult.Destructured mo93362a() {
        return MatchResult.DefaultImpls.m93365a(this);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public MatchGroupCollection getGroups() {
        return this.groups;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<String> mo93364c() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                /* JADX INFO: renamed from: c */
                public /* bridge */ int m93369c(String str) {
                    return super.indexOf(str);
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return contains((String) obj);
                    }
                    return false;
                }

                /* JADX INFO: renamed from: f */
                public /* bridge */ int m93370f(String str) {
                    return super.lastIndexOf(str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public String get(int index) {
                    String strGroup = this.f66631a.m93368e().group(index);
                    return strGroup == null ? "" : strGroup;
                }

                @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
                /* JADX INFO: renamed from: getSize */
                public int get_size() {
                    return this.f66631a.m93368e().groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return m93369c((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return m93370f((String) obj);
                    }
                    return -1;
                }

                public /* bridge */ boolean contains(String str) {
                    return super.contains((Object) str);
                }
            };
        }
        List<String> list = this.groupValues_;
        list.getClass();
        return list;
    }

    /* JADX INFO: renamed from: e */
    public final java.util.regex.MatchResult m93368e() {
        return this.matcher;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public IntRange getRange() {
        return RegexKt.m93385h(m93368e());
    }

    @Override // kotlin.text.MatchResult
    @Nullable
    public MatchResult next() {
        int iEnd = m93368e().end() + (m93368e().end() == m93368e().start() ? 1 : 0);
        if (iEnd > this.input.length()) {
            return null;
        }
        Matcher matcher = this.matcher.pattern().matcher(this.input);
        matcher.getClass();
        return RegexKt.m93383f(matcher, iEnd, this.input);
    }
}
