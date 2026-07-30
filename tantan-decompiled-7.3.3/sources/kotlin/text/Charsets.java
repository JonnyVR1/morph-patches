package kotlin.text;

import com.clevertap.android.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.apache.commons.codec.CharEncoding;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, m88121d2 = {"Lkotlin/text/Charsets;", "", "<init>", "()V", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "a", "UTF_16", "b", "UTF_16BE", "c", "UTF_16LE", Constants.INAPP_DATA_TAG, "US_ASCII", "e", "ISO_8859_1", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class Charsets {

    @NotNull
    public static final Charsets INSTANCE = new Charsets();

    @JvmField
    @NotNull
    public static final Charset UTF_8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Charset UTF_16;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Charset UTF_16BE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Charset UTF_16LE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Charset US_ASCII;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Charset ISO_8859_1;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        UTF_8 = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        charsetForName2.getClass();
        UTF_16 = charsetForName2;
        Charset charsetForName3 = Charset.forName(CharEncoding.UTF_16BE);
        charsetForName3.getClass();
        UTF_16BE = charsetForName3;
        Charset charsetForName4 = Charset.forName(CharEncoding.UTF_16LE);
        charsetForName4.getClass();
        UTF_16LE = charsetForName4;
        Charset charsetForName5 = Charset.forName(CharEncoding.US_ASCII);
        charsetForName5.getClass();
        US_ASCII = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        charsetForName6.getClass();
        ISO_8859_1 = charsetForName6;
    }

    private Charsets() {
    }
}
