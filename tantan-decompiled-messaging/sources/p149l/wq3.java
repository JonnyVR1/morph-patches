package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Ll/wq3;", "", "", "from", "to", "<init>", "(II)V", "compare", "", "b", "(Ll/wq3;)Z", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "Companion", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class wq3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<Pattern> f187636c = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.vq3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return wq3.m205005a();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int from;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int to;

    public wq3(int i, int i2) {
        this.from = i;
        this.to = i2;
    }

    /* JADX INFO: renamed from: a */
    public static Pattern m205005a() {
        return Pattern.compile("[-/ ]");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final wq3 m205006c(int i) {
        return INSTANCE.m205010b(i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final wq3 m205007d(int i) {
        return INSTANCE.m205011c(i);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m205008b(@Nullable wq3 compare) {
        return compare != null && this.from <= compare.from && compare.to <= this.to;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m87488d(wq3.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        wq3 wq3Var = (wq3) other;
        return this.from == wq3Var.from && this.to == wq3Var.to;
    }

    public int hashCode() {
        return (this.from * 31) + this.to;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Companion companion = INSTANCE;
        return String.format(null, "%s-%s", Arrays.copyOf(new Object[]{companion.m205012d(this.from), companion.m205012d(this.to)}, 2));
    }

    /* JADX INFO: renamed from: l.wq3$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/wq3$a;", "", "<init>", "()V", "", "from", "Ll/wq3;", "b", "(I)Ll/wq3;", "to", "c", "n", "", Constants.INAPP_DATA_TAG, "(I)Ljava/lang/String;", "TO_END_OF_CONTENT", "I", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final wq3 m205010b(int from) {
            rf80.m179111b(Boolean.valueOf(from >= 0));
            return new wq3(from, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final wq3 m205011c(int to) {
            rf80.m179111b(Boolean.valueOf(to > 0));
            return new wq3(0, to);
        }

        /* JADX INFO: renamed from: d */
        public final String m205012d(int n) {
            return n == Integer.MAX_VALUE ? "" : String.valueOf(n);
        }

        public Companion() {
        }
    }
}
