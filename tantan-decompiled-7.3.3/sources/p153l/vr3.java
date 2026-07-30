package p153l;

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
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/vr3;", "", "", "from", "to", "<init>", "(II)V", "compare", "", "b", "(Ll/vr3;)Z", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "Companion", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class vr3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Lazy<Pattern> f185427c = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.ur3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return vr3.m202464a();
        }
    });

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int from;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int to;

    public vr3(int i, int i2) {
        this.from = i;
        this.to = i2;
    }

    /* JADX INFO: renamed from: a */
    public static Pattern m202464a() {
        return Pattern.compile("[-/ ]");
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final vr3 m202465c(int i) {
        return INSTANCE.m202469b(i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final vr3 m202466d(int i) {
        return INSTANCE.m202470c(i);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m202467b(@Nullable vr3 compare) {
        return compare != null && this.from <= compare.from && compare.to <= this.to;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m88377d(vr3.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        vr3 vr3Var = (vr3) other;
        return this.from == vr3Var.from && this.to == vr3Var.to;
    }

    public int hashCode() {
        return (this.from * 31) + this.to;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Companion companion = INSTANCE;
        return String.format(null, "%s-%s", Arrays.copyOf(new Object[]{companion.m202471d(this.from), companion.m202471d(this.to)}, 2));
    }

    /* JADX INFO: renamed from: l.vr3$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/vr3$a;", "", "<init>", "()V", "", "from", "Ll/vr3;", "b", "(I)Ll/vr3;", "to", "c", "n", "", Constants.INAPP_DATA_TAG, "(I)Ljava/lang/String;", "TO_END_OF_CONTENT", "I", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final vr3 m202469b(int from) {
            wn80.m207177b(Boolean.valueOf(from >= 0));
            return new vr3(from, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final vr3 m202470c(int to) {
            wn80.m207177b(Boolean.valueOf(to > 0));
            return new vr3(0, to);
        }

        /* JADX INFO: renamed from: d */
        public final String m202471d(int n) {
            return n == Integer.MAX_VALUE ? "" : String.valueOf(n);
        }

        public Companion() {
        }
    }
}
