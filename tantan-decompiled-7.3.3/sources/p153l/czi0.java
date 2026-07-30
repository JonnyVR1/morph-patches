package p153l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/czi0;", "", "<init>", "()V", "", "width", "height", "Ll/q3d0;", "resizeOptions", "", "b", "(IILl/q3d0;)Z", "Ll/n0f;", "encodedImage", "c", "(Ll/n0f;Ll/q3d0;)Z", "size", "a", "(I)I", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class czi0 {

    @NotNull
    public static final czi0 INSTANCE = new czi0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m113341a(int size) {
        return (int) (size * 1.3333334f);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m113342b(int width, int height, @Nullable q3d0 resizeOptions) {
        if (resizeOptions == null) {
            return ((float) m113341a(width)) >= 2048.0f && m113341a(height) >= 2048;
        }
        return m113341a(width) >= resizeOptions.width && m113341a(height) >= resizeOptions.height;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m113343c(@Nullable n0f encodedImage, @Nullable q3d0 resizeOptions) {
        if (encodedImage == null) {
            return false;
        }
        int iM160970V = encodedImage.m160970V();
        return (iM160970V == 90 || iM160970V == 270) ? m113342b(encodedImage.getHeight(), encodedImage.getWidth(), resizeOptions) : m113342b(encodedImage.getWidth(), encodedImage.getHeight(), resizeOptions);
    }
}
