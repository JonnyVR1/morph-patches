package p149l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/zpi0;", "", "<init>", "()V", "", "width", "height", "Ll/nvc0;", "resizeOptions", "", "b", "(IILl/nvc0;)Z", "Ll/jze;", "encodedImage", "c", "(Ll/jze;Ll/nvc0;)Z", "size", "a", "(I)I", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class zpi0 {

    @NotNull
    public static final zpi0 INSTANCE = new zpi0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m219673a(int size) {
        return (int) (size * 1.3333334f);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m219674b(int width, int height, @Nullable nvc0 resizeOptions) {
        if (resizeOptions == null) {
            return ((float) m219673a(width)) >= 2048.0f && m219673a(height) >= 2048;
        }
        return m219673a(width) >= resizeOptions.width && m219673a(height) >= resizeOptions.height;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m219675c(@Nullable jze encodedImage, @Nullable nvc0 resizeOptions) {
        if (encodedImage == null) {
            return false;
        }
        int iM143907U = encodedImage.m143907U();
        return (iM143907U == 90 || iM143907U == 270) ? m219674b(encodedImage.getHeight(), encodedImage.getWidth(), resizeOptions) : m219674b(encodedImage.getWidth(), encodedImage.getHeight(), resizeOptions);
    }
}
