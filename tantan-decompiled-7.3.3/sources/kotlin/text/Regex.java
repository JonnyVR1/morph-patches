package kotlin.text;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.data.Options;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nvc0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00060\u0001j\u0002`\u0002:\u000245B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0005\u0010\u000fJ\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0004J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001dH\u0007J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001dH\u0007J\u0016\u0010$\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\bJ\"\u0010$\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180'J\u0016\u0010(\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\bJ\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0*2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u001dJ \u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u001f2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010+\u001a\u00020\u001dH\u0007J\b\u0010-\u001a\u00020\bH\u0016J\u0006\u0010.\u001a\u00020\u0004J\b\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u0002022\u0006\u0010\u0017\u001a\u000203H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00066"}, m88121d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "nativePattern", "Ljava/util/regex/Pattern;", "<init>", "(Ljava/util/regex/Pattern;)V", "pattern", "", "(Ljava/lang/String;)V", Option.TYPE, "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", Options.TYPE, "", "(Ljava/lang/String;Ljava/util/Set;)V", "getPattern", "()Ljava/lang/String;", "_options", "getOptions", "()Ljava/util/Set;", "matches", "", "input", "", "containsMatchIn", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matchAt", FirebaseAnalytics.Param.INDEX, "matchesAt", "replace", "replacement", "transform", "Lkotlin/Function1;", "replaceFirst", "split", "", Constants.KEY_LIMIT, "splitToSequence", "toString", "toPattern", "writeReplace", "", "readObject", "", "Ljava/io/ObjectInputStream;", "Serialized", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class Regex implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Set<? extends RegexOption> _options;

    @NotNull
    private final Pattern nativePattern;

    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lkotlin/text/Regex$Companion;", "", "<init>", "()V", "", "literal", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "flags", "b", "(I)I", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final int m94266b(int flags) {
            return (flags & 2) != 0 ? flags | 64 : flags;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final String m94267c(@NotNull String literal) {
            literal.getClass();
            String strQuote = Pattern.quote(literal);
            strQuote.getClass();
            return strQuote;
        }

        private Companion() {
        }
    }

    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m88121d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "<init>", "(Ljava/lang/String;I)V", "getPattern", "()Ljava/lang/String;", "getFlags", "()I", "readResolve", "", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        private final int flags;

        @NotNull
        private final String pattern;

        public Serialized(@NotNull String str, int i) {
            str.getClass();
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            patternCompile.getClass();
            return new Regex(patternCompile);
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2 */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C154882 extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {
        public static final C154882 INSTANCE = new C154882();

        public C154882() {
            super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MatchResult invoke(MatchResult matchResult) {
            matchResult.getClass();
            return matchResult.next();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1 */
    @Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m88121d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlin.text.Regex$splitToSequence$1", m88263f = "Regex.kt", m88264l = {280, 288, 292}, m88265m = "invokeSuspend", m88266v = 2)
    public static final class C154891 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154891(CharSequence charSequence, int i, Continuation<? super C154891> continuation) {
            super(2, continuation);
            this.$input = charSequence;
            this.$limit = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C154891 c154891 = Regex.this.new C154891(this.$input, this.$limit, continuation);
            c154891.L$0 = obj;
            return c154891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C154891) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0074  */
        /* JADX WARN: Code duplicated, block: B:24:0x007f  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
        
            if (r0.mo94149c(r4, r10) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
        
            if (r0.mo94149c(r2, r10) == r1) goto L35;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0074 -> B:22:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            Matcher matcher;
            int i2;
            String string;
            int i3;
            int iEnd;
            int i4;
            SequenceScope sequenceScope = (SequenceScope) this.L$0;
            Object objM198688e = uyp.m198688e();
            int i5 = this.label;
            if (i5 == 0) {
                ResultKt.m88128b(obj);
                Matcher matcher2 = Regex.this.nativePattern.matcher(this.$input);
                if (this.$limit == 1 || !matcher2.find()) {
                    String string2 = this.$input.toString();
                    this.L$0 = SpillingKt.m88273a(sequenceScope);
                    this.L$1 = SpillingKt.m88273a(matcher2);
                    this.label = 1;
                } else {
                    i = 0;
                    matcher = matcher2;
                    i2 = 0;
                    string = this.$input.subSequence(i, matcher.start()).toString();
                    this.L$0 = sequenceScope;
                    this.L$1 = matcher;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.label = 2;
                    if (sequenceScope.mo94149c(string, this) != objM198688e) {
                        i3 = i2;
                        iEnd = matcher.end();
                        i4 = i3 + 1;
                        if (i4 == this.$limit - 1) {
                        }
                        CharSequence charSequence = this.$input;
                        String string3 = charSequence.subSequence(iEnd, charSequence.length()).toString();
                        this.L$0 = SpillingKt.m88273a(sequenceScope);
                        this.L$1 = SpillingKt.m88273a(matcher);
                        this.I$0 = iEnd;
                        this.I$1 = i4;
                        this.label = 3;
                    }
                }
                return objM198688e;
            }
            if (i5 != 1) {
                if (i5 == 2) {
                    i3 = this.I$1;
                    matcher = (Matcher) this.L$1;
                    ResultKt.m88128b(obj);
                    iEnd = matcher.end();
                    i4 = i3 + 1;
                    if (i4 == this.$limit - 1 && matcher.find()) {
                        i = iEnd;
                        i2 = i4;
                        string = this.$input.subSequence(i, matcher.start()).toString();
                        this.L$0 = sequenceScope;
                        this.L$1 = matcher;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.label = 2;
                        if (sequenceScope.mo94149c(string, this) != objM198688e) {
                            i3 = i2;
                            iEnd = matcher.end();
                            i4 = i3 + 1;
                            if (i4 == this.$limit - 1) {
                            }
                            CharSequence charSequence2 = this.$input;
                            String string4 = charSequence2.subSequence(iEnd, charSequence2.length()).toString();
                            this.L$0 = SpillingKt.m88273a(sequenceScope);
                            this.L$1 = SpillingKt.m88273a(matcher);
                            this.I$0 = iEnd;
                            this.I$1 = i4;
                            this.label = 3;
                        }
                    } else {
                        CharSequence charSequence3 = this.$input;
                        String string5 = charSequence3.subSequence(iEnd, charSequence3.length()).toString();
                        this.L$0 = SpillingKt.m88273a(sequenceScope);
                        this.L$1 = SpillingKt.m88273a(matcher);
                        this.I$0 = iEnd;
                        this.I$1 = i4;
                        this.label = 3;
                    }
                    return objM198688e;
                }
                if (i5 != 3) {
                    wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ResultKt.m88128b(obj);
                return Unit.INSTANCE;
            }
            ResultKt.m88128b(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str, @NotNull Set<? extends RegexOption> set) {
        str.getClass();
        set.getClass();
        Pattern patternCompile = Pattern.compile(str, INSTANCE.m94266b(RegexKt.m94278j(set)));
        patternCompile.getClass();
        this(patternCompile);
    }

    /* JADX INFO: renamed from: a */
    public static MatchResult m94264a(Regex regex, CharSequence charSequence, int i) {
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ Sequence findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ Sequence splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        strPattern.getClass();
        return new Serialized(strPattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@NotNull CharSequence input) {
        input.getClass();
        return this.nativePattern.matcher(input).find();
    }

    @Nullable
    public final MatchResult find(@NotNull CharSequence input, int startIndex) {
        input.getClass();
        Matcher matcher = this.nativePattern.matcher(input);
        matcher.getClass();
        return RegexKt.m94274f(matcher, startIndex, input);
    }

    @NotNull
    public final Sequence<MatchResult> findAll(@NotNull final CharSequence input, final int startIndex) {
        input.getClass();
        if (startIndex >= 0 && startIndex <= input.length()) {
            return SequencesKt__SequencesKt.m94167p(new Function0() { // from class: l.ovc0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Regex.m94264a(this.f149253a, input, startIndex);
                }
            }, C154882.INSTANCE);
        }
        nvc0.m164869a("Start index out of bounds: ", startIndex, ", input length: ", input.length());
        return null;
    }

    @NotNull
    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        final int iFlags = this.nativePattern.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        enumSetAllOf.getClass();
        CollectionsKt.retainAll(enumSetAllOf, new Function1<RegexOption, Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(RegexOption regexOption) {
                RegexOption regexOption2 = regexOption;
                return Boolean.valueOf((iFlags & regexOption2.getMask()) == regexOption2.getValue());
            }
        });
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        setUnmodifiableSet.getClass();
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @NotNull
    public final String getPattern() {
        String strPattern = this.nativePattern.pattern();
        strPattern.getClass();
        return strPattern;
    }

    @SinceKotlin
    @WasExperimental
    @Nullable
    public final MatchResult matchAt(@NotNull CharSequence input, int index) {
        input.getClass();
        Matcher matcherRegion = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        if (matcherRegion.lookingAt()) {
            return new MatcherMatchResult(matcherRegion, input);
        }
        return null;
    }

    @Nullable
    public final MatchResult matchEntire(@NotNull CharSequence input) {
        input.getClass();
        Matcher matcher = this.nativePattern.matcher(input);
        matcher.getClass();
        return RegexKt.m94275g(matcher, input);
    }

    public final boolean matches(@NotNull CharSequence input) {
        input.getClass();
        return this.nativePattern.matcher(input).matches();
    }

    @SinceKotlin
    @WasExperimental
    public final boolean matchesAt(@NotNull CharSequence input, int index) {
        input.getClass();
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt();
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull Function1<? super MatchResult, ? extends CharSequence> transform) {
        input.getClass();
        transform.getClass();
        int iIntValue = 0;
        MatchResult matchResultFind$default = find$default(this, input, 0, 2, null);
        if (matchResultFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, iIntValue, matchResultFind$default.getRange().m88476l().intValue());
            sb.append(transform.invoke(matchResultFind$default));
            iIntValue = matchResultFind$default.getRange().m88475j().intValue() + 1;
            matchResultFind$default = matchResultFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultFind$default != null);
        if (iIntValue < length) {
            sb.append(input, iIntValue, length);
        }
        return sb.toString();
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence input, @NotNull String replacement) {
        input.getClass();
        replacement.getClass();
        String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        strReplaceFirst.getClass();
        return strReplaceFirst;
    }

    @NotNull
    public final List<String> split(@NotNull CharSequence input, int limit) {
        input.getClass();
        StringsKt__StringsKt.m94283A0(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return CollectionsKt.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(limit > 0 ? C15274a.m88489e(limit, 10) : 10);
        int i = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i >= 0 && arrayList.size() == i) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    @SinceKotlin
    @NotNull
    public final Sequence<String> splitToSequence(@NotNull CharSequence input, int limit) {
        input.getClass();
        StringsKt__StringsKt.m94283A0(limit);
        return SequencesKt__SequenceBuilderKt.m94153b(new C154891(input, limit, null));
    }

    @NotNull
    /* JADX INFO: renamed from: toPattern, reason: from getter */
    public final Pattern getNativePattern() {
        return this.nativePattern;
    }

    @NotNull
    public String toString() {
        String string = this.nativePattern.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str, @NotNull RegexOption regexOption) {
        str.getClass();
        regexOption.getClass();
        Pattern patternCompile = Pattern.compile(str, INSTANCE.m94266b(regexOption.getValue()));
        patternCompile.getClass();
        this(patternCompile);
    }

    @PublishedApi
    public Regex(@NotNull Pattern pattern) {
        pattern.getClass();
        this.nativePattern = pattern;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        input.getClass();
        replacement.getClass();
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        strReplaceAll.getClass();
        return strReplaceAll;
    }
}
