package kotlin.text;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0004\u0019\u001a\u001b\u0018B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m87232d2 = {"Lkotlin/text/HexFormat;", "", "", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat;", HttpHeaderValues.BYTES, "Lkotlin/text/HexFormat$NumberHexFormat;", "number", "<init>", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "b", "()Z", "Lkotlin/text/HexFormat$BytesHexFormat;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "c", "Lkotlin/text/HexFormat$NumberHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "Companion", "BytesHexFormat", "NumberHexFormat", "Builder", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@WasExperimental
public final class HexFormat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final HexFormat f66590d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final HexFormat f66591e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean upperCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BytesHexFormat bytes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final NumberHexFormat number;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m87232d2 = {"Lkotlin/text/HexFormat$Builder;", "", "<init>", "()V", "", "a", "Z", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "upperCase", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean upperCase = HexFormat.INSTANCE.m93351a().getUpperCase();

        @PublishedApi
        public Builder() {
        }
    }

    @Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 (2\u00020\u0001:\u0002)(B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\"\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010'\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006*"}, m87232d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "I", "g", "()I", "f", "c", "Ljava/lang/String;", "h", Constants.INAPP_DATA_TAG, "e", "", "Z", "getNoLineAndGroupSeparator$kotlin_stdlib", "()Z", "noLineAndGroupSeparator", "getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib", "shortByteSeparatorNoPrefixAndSuffix", RXScreenCaptureService.KEY_INDEX, "getIgnoreCase$kotlin_stdlib", "ignoreCase", "Companion", "Builder", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class BytesHexFormat {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: j */
        @NotNull
        public static final BytesHexFormat f66596j = new BytesHexFormat(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int bytesPerLine;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int bytesPerGroup;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String groupSeparator;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String byteSeparator;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final String bytePrefix;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final String byteSuffix;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final boolean noLineAndGroupSeparator;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public final boolean shortByteSeparatorNoPrefixAndSuffix;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final boolean ignoreCase;

        @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R*\u0010 \u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R*\u0010$\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u0006%"}, m87232d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "<init>", "()V", "", "value", "a", "I", "getBytesPerLine", "()I", "setBytesPerLine", "(I)V", "bytesPerLine", "b", "getBytesPerGroup", "setBytesPerGroup", "bytesPerGroup", "", "c", "Ljava/lang/String;", "getGroupSeparator", "()Ljava/lang/String;", "setGroupSeparator", "(Ljava/lang/String;)V", "groupSeparator", Constants.INAPP_DATA_TAG, "getByteSeparator", "setByteSeparator", "byteSeparator", "e", "getBytePrefix", "setBytePrefix", "bytePrefix", "f", "getByteSuffix", "setByteSuffix", "byteSuffix", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            public int bytesPerLine;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public int bytesPerGroup;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public String groupSeparator;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public String byteSeparator;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @NotNull
            public String bytePrefix;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @NotNull
            public String byteSuffix;

            public Builder() {
                Companion companion = BytesHexFormat.INSTANCE;
                this.bytesPerLine = companion.m93350a().getBytesPerLine();
                this.bytesPerGroup = companion.m93350a().getBytesPerGroup();
                this.groupSeparator = companion.m93350a().getGroupSeparator();
                this.byteSeparator = companion.m93350a().getByteSeparator();
                this.bytePrefix = companion.m93350a().getBytePrefix();
                this.byteSuffix = companion.m93350a().getByteSuffix();
            }
        }

        @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat$BytesHexFormat;", LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default, "Lkotlin/text/HexFormat$BytesHexFormat;", "a", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final BytesHexFormat m93350a() {
                return BytesHexFormat.f66596j;
            }

            private Companion() {
            }
        }

        public BytesHexFormat(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.bytesPerLine = i;
            this.bytesPerGroup = i2;
            this.groupSeparator = str;
            this.byteSeparator = str2;
            this.bytePrefix = str3;
            this.byteSuffix = str4;
            this.noLineAndGroupSeparator = i == Integer.MAX_VALUE && i2 == Integer.MAX_VALUE;
            this.shortByteSeparatorNoPrefixAndSuffix = str3.length() == 0 && str4.length() == 0 && str2.length() <= 1;
            this.ignoreCase = HexFormatKt.m93360b(str) || HexFormatKt.m93360b(str2) || HexFormatKt.m93360b(str3) || HexFormatKt.m93360b(str4);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final StringBuilder m93343b(@NotNull StringBuilder sb, @NotNull String indent) {
            sb.getClass();
            indent.getClass();
            sb.append(indent);
            sb.append("bytesPerLine = ");
            sb.append(this.bytesPerLine);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append('\n');
            sb.append(indent);
            sb.append("bytesPerGroup = ");
            sb.append(this.bytesPerGroup);
            sb.append(Constants.SEPARATOR_COMMA);
            sb.append('\n');
            sb.append(indent);
            sb.append("groupSeparator = \"");
            sb.append(this.groupSeparator);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSeparator = \"");
            sb.append(this.byteSeparator);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("bytePrefix = \"");
            sb.append(this.bytePrefix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("byteSuffix = \"");
            sb.append(this.byteSuffix);
            sb.append("\"");
            return sb;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(\n");
            m93343b(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lkotlin/text/HexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat;", LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default, "Lkotlin/text/HexFormat;", "a", "()Lkotlin/text/HexFormat;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final HexFormat m93351a() {
            return HexFormat.f66590d;
        }

        private Companion() {
        }
    }

    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 &2\u00020\u0001:\u0002'&B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00060\rj\u0002`\u000e2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001cR\u001a\u0010 \u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\"\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b!\u0010\u001aR\u001a\u0010%\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006("}, m87232d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "", RequestParameters.PREFIX, "suffix", "", "removeLeadingZeros", "", "minLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "f", "c", "Z", "e", "()Z", "I", "()I", "getMinLength$annotations", "()V", "isDigitsOnly$kotlin_stdlib", "isDigitsOnly", "isDigitsOnlyAndNoPadding$kotlin_stdlib", "isDigitsOnlyAndNoPadding", "g", "getIgnoreCase$kotlin_stdlib", "ignoreCase", "Companion", "Builder", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class NumberHexFormat {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h */
        @NotNull
        public static final NumberHexFormat f66612h = new NumberHexFormat("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String prefix;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String suffix;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final boolean removeLeadingZeros;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int minLength;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final boolean isDigitsOnly;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final boolean isDigitsOnlyAndNoPadding;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public final boolean ignoreCase;

        @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00198\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, m87232d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "<init>", "()V", "", "value", "a", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", RequestParameters.PREFIX, "b", "getSuffix", "setSuffix", "suffix", "", "c", "Z", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "removeLeadingZeros", "", Constants.INAPP_DATA_TAG, "I", "getMinLength", "()I", "setMinLength", "(I)V", "getMinLength$annotations", "minLength", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        @SourceDebugExtension
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public String prefix;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public String suffix;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            public boolean removeLeadingZeros;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public int minLength;

            public Builder() {
                Companion companion = NumberHexFormat.INSTANCE;
                this.prefix = companion.m93358a().getPrefix();
                this.suffix = companion.m93358a().getSuffix();
                this.removeLeadingZeros = companion.m93358a().getRemoveLeadingZeros();
                this.minLength = companion.m93358a().getMinLength();
            }
        }

        @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "<init>", "()V", "Lkotlin/text/HexFormat$NumberHexFormat;", LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default, "Lkotlin/text/HexFormat$NumberHexFormat;", "a", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final NumberHexFormat m93358a() {
                return NumberHexFormat.f66612h;
            }

            private Companion() {
            }
        }

        public NumberHexFormat(@NotNull String str, @NotNull String str2, boolean z, int i) {
            str.getClass();
            str2.getClass();
            this.prefix = str;
            this.suffix = str2;
            this.removeLeadingZeros = z;
            this.minLength = i;
            boolean z2 = str.length() == 0 && str2.length() == 0;
            this.isDigitsOnly = z2;
            this.isDigitsOnlyAndNoPadding = z2 && i == 1;
            this.ignoreCase = HexFormatKt.m93360b(str) || HexFormatKt.m93360b(str2);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final StringBuilder m93353b(@NotNull StringBuilder sb, @NotNull String indent) {
            sb.getClass();
            indent.getClass();
            sb.append(indent);
            sb.append("prefix = \"");
            sb.append(this.prefix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("suffix = \"");
            sb.append(this.suffix);
            sb.append("\",");
            sb.append('\n');
            sb.append(indent);
            sb.append("removeLeadingZeros = ");
            sb.append(this.removeLeadingZeros);
            sb.append(',');
            sb.append('\n');
            sb.append(indent);
            sb.append("minLength = ");
            sb.append(this.minLength);
            return sb;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getMinLength() {
            return this.minLength;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSuffix() {
            return this.suffix;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(\n");
            m93353b(sb, "    ").append('\n');
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.INSTANCE;
        BytesHexFormat bytesHexFormatM93350a = companion.m93350a();
        NumberHexFormat.Companion companion2 = NumberHexFormat.INSTANCE;
        f66590d = new HexFormat(false, bytesHexFormatM93350a, companion2.m93358a());
        f66591e = new HexFormat(true, companion.m93350a(), companion2.m93358a());
    }

    public HexFormat(boolean z, @NotNull BytesHexFormat bytesHexFormat, @NotNull NumberHexFormat numberHexFormat) {
        bytesHexFormat.getClass();
        numberHexFormat.getClass();
        this.upperCase = z;
        this.bytes = bytesHexFormat;
        this.number = numberHexFormat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getUpperCase() {
        return this.upperCase;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.upperCase);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.bytes.m93343b(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.number.m93353b(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
