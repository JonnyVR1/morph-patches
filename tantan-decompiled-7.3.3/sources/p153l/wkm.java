package p153l;

import android.graphics.ColorSpace;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JQ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nH&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/wkm;", "", "Ll/n0f;", "encodedImage", "Ljava/io/OutputStream;", "outputStream", "Ll/qmd0;", "rotationOptions", "Ll/q3d0;", "resizeOptions", "Ll/him;", "outputFormat", "", "quality", "Landroid/graphics/ColorSpace;", "colorSpace", "Ll/vkm;", "a", "(Ll/n0f;Ljava/io/OutputStream;Ll/qmd0;Ll/q3d0;Ll/him;Ljava/lang/Integer;Landroid/graphics/ColorSpace;)Ll/vkm;", "", "b", "(Ll/n0f;Ll/qmd0;Ll/q3d0;)Z", "imageFormat", "c", "(Ll/him;)Z", "", "getIdentifier", "()Ljava/lang/String;", "identifier", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface wkm {
    @NotNull
    /* JADX INFO: renamed from: a */
    vkm mo8514a(@NotNull n0f encodedImage, @NotNull OutputStream outputStream, @Nullable qmd0 rotationOptions, @Nullable q3d0 resizeOptions, @Nullable him outputFormat, @Nullable Integer quality, @Nullable ColorSpace colorSpace) throws IOException;

    /* JADX INFO: renamed from: b */
    boolean mo8515b(@NotNull n0f encodedImage, @Nullable qmd0 rotationOptions, @Nullable q3d0 resizeOptions);

    /* JADX INFO: renamed from: c */
    boolean mo8516c(@NotNull him imageFormat);

    @NotNull
    String getIdentifier();
}
