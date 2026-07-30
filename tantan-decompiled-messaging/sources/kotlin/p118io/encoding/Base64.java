package kotlin.p118io.encoding;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.eclipse.jetty.http.HttpTokens;
import org.jetbrains.annotations.NotNull;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0017\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012¨\u0006\u001e"}, m87232d2 = {"Lkotlin/io/encoding/Base64;", "", "", "isUrlSafe", "isMimeScheme", "", "mimeLineLength", "Lkotlin/io/encoding/Base64$PaddingOption;", "paddingOption", "<init>", "(ZZILkotlin/io/encoding/Base64$PaddingOption;)V", "a", "Z", "isUrlSafe$kotlin_stdlib", "()Z", "b", "isMimeScheme$kotlin_stdlib", "c", "I", "getMimeLineLength$kotlin_stdlib", "()I", Constants.INAPP_DATA_TAG, "Lkotlin/io/encoding/Base64$PaddingOption;", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "e", "mimeGroupsPerLine", "f", "PaddingOption", LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default, "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@WasExperimental
public class Base64 {

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final byte[] f63490g = {HttpTokens.CARRIAGE_RETURN, 10};

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Base64 f63491h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Base64 f63492i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Base64 f63493j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isUrlSafe;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isMimeScheme;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int mimeLineLength;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PaddingOption paddingOption;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int mimeGroupsPerLine;

    @SinceKotlin
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m87232d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum PaddingOption {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<PaddingOption> getEntries() {
            return $ENTRIES;
        }
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        f63491h = new Base64(true, false, -1, paddingOption);
        f63492i = new Base64(false, true, 76, paddingOption);
        f63493j = new Base64(false, true, 64, paddingOption);
    }

    public Base64(boolean z, boolean z2, int i, PaddingOption paddingOption) {
        this.isUrlSafe = z;
        this.isMimeScheme = z2;
        this.mimeLineLength = i;
        this.paddingOption = paddingOption;
        if (z && z2) {
            ig3.m135964a("Failed requirement.");
            throw null;
        }
        this.mimeGroupsPerLine = i / 4;
    }

    public /* synthetic */ Base64(boolean z, boolean z2, int i, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, paddingOption);
    }
}
