package p149l;

import android.graphics.ColorSpace;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nH&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Ll/tim;", "", "Ll/jze;", "encodedImage", "Ljava/io/OutputStream;", "outputStream", "Ll/oed0;", "rotationOptions", "Ll/nvc0;", "resizeOptions", "Ll/egm;", "outputFormat", "", "quality", "Landroid/graphics/ColorSpace;", "colorSpace", "Ll/sim;", "a", "(Ll/jze;Ljava/io/OutputStream;Ll/oed0;Ll/nvc0;Ll/egm;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Ll/sim;", "", "b", "(Ll/jze;Ll/oed0;Ll/nvc0;)Z", "imageFormat", "c", "(Ll/egm;)Z", "", "getIdentifier", "()Ljava/lang/String;", "identifier", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface tim {
    @NotNull
    /* JADX INFO: renamed from: a */
    sim mo8460a(@NotNull jze encodedImage, @NotNull OutputStream outputStream, @Nullable oed0 rotationOptions, @Nullable nvc0 resizeOptions, @Nullable egm outputFormat, @Nullable Integer quality, @Nullable ColorSpace colorSpace) throws IOException;

    /* JADX INFO: renamed from: b */
    boolean mo8461b(@NotNull jze encodedImage, @Nullable oed0 rotationOptions, @Nullable nvc0 resizeOptions);

    /* JADX INFO: renamed from: c */
    boolean mo8462c(@NotNull egm imageFormat);

    @NotNull
    String getIdentifier();
}
