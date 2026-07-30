package kotlin.text;

import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.ranges.IntRange;
import p153l.yri;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0013\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"", "Ll/yri;", "", "j", "(Ljava/lang/Iterable;)I", "Ljava/util/regex/Matcher;", "from", "", "input", "Lkotlin/text/MatchResult;", "f", "(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lkotlin/text/MatchResult;", "g", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "Ljava/util/regex/MatchResult;", "Lkotlin/ranges/IntRange;", "h", "(Ljava/util/regex/MatchResult;)Lkotlin/ranges/IntRange;", "groupIndex", RXScreenCaptureService.KEY_INDEX, "(Ljava/util/regex/MatchResult;I)Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class RegexKt {
    /* JADX INFO: renamed from: f */
    public static final MatchResult m94274f(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final MatchResult m94275g(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final IntRange m94276h(java.util.regex.MatchResult matchResult) {
        return C15274a.m88496l(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: renamed from: i */
    public static final IntRange m94277i(java.util.regex.MatchResult matchResult, int i) {
        return C15274a.m88496l(matchResult.start(i), matchResult.end(i));
    }

    /* JADX INFO: renamed from: j */
    public static final int m94278j(Iterable<? extends yri> iterable) {
        Iterator<? extends yri> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
