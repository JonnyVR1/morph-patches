package p153l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Target;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0003J!\u0010 \u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001d¢\u0006\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b,\u0010-R\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b/\u0010-R\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b1\u0010-¨\u00063"}, m88121d2 = {"Ll/ifj;", "", "<init>", "()V", "", "array", "Ljava/nio/FloatBuffer;", "g", "([F)Ljava/nio/FloatBuffer;", "", "f", "()I", "width", "height", "outputTex", "e", "(III)I", "texture", "", Constants.INAPP_DATA_TAG, "(I)V", Target.TYPE, FirebaseAnalytics.Param.LEVEL, "Landroid/graphics/Bitmap;", "bitmap", "border", RXScreenCaptureService.KEY_INDEX, "(IILandroid/graphics/Bitmap;I)V", "b", "", "vertexSource", "fragmentSource", "c", "(Ljava/lang/String;Ljava/lang/String;)I", "shaderType", "source", "h", "(ILjava/lang/String;)I", "op", "a", "(Ljava/lang/String;)V", "[F", "VERTEX_COORDS", "TEXTURE_NO_ROTATION", "getTEXTURE_ROTATED_90", "()[F", "TEXTURE_ROTATED_90", "getTEXTURE_ROTATED_180", "TEXTURE_ROTATED_180", "getTEXTURE_ROTATED_270", "TEXTURE_ROTATED_270", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ifj {

    @NotNull
    public static final ifj INSTANCE = new ifj();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final float[] VERTEX_COORDS = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final float[] TEXTURE_NO_ROTATION = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final float[] TEXTURE_ROTATED_90 = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final float[] TEXTURE_ROTATED_180 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final float[] TEXTURE_ROTATED_270 = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final void m139730a(@NotNull String op) {
        op.getClass();
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String str = op + ": glError 0x" + Integer.toHexString(iGlGetError);
        bok0.m105698b(str, null, 2, null);
        azk0.m101074a(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m139731b() {
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public final int m139732c(@Nullable String vertexSource, @Nullable String fragmentSource) {
        int iM139737h;
        int iM139737h2 = m139737h(35633, vertexSource);
        if (iM139737h2 == 0 || (iM139737h = m139737h(35632, fragmentSource)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m139730a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            bok0.m105698b("Could not create program", null, 2, null);
        }
        GLES20.glAttachShader(iGlCreateProgram, iM139737h2);
        m139730a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM139737h);
        m139730a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        bok0.m105698b("Could not link program: ", null, 2, null);
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
        strGlGetProgramInfoLog.getClass();
        bok0.m105698b(strGlGetProgramInfoLog, null, 2, null);
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m139733d(int texture) {
        GLES20.glDeleteTextures(1, new int[]{texture}, 0);
    }

    /* JADX INFO: renamed from: e */
    public final int m139734e(int width, int height, int outputTex) {
        GLES20.glBindTexture(3553, outputTex);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, outputTex, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        return iArr[0];
    }

    /* JADX INFO: renamed from: f */
    public final int m139735f() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        return iArr[0];
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final FloatBuffer m139736g(@NotNull float[] array) {
        array.getClass();
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(array.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(array);
        floatBufferPut.position(0);
        return floatBufferPut;
    }

    /* JADX INFO: renamed from: h */
    public final int m139737h(int shaderType, @Nullable String source) {
        int iGlCreateShader = GLES20.glCreateShader(shaderType);
        m139730a("glCreateShader type=" + shaderType);
        GLES20.glShaderSource(iGlCreateShader, source);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        bok0.m105698b("Could not compile shader " + shaderType + ":, src: " + source, null, 2, null);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(strGlGetShaderInfoLog);
        bok0.m105698b(sb.toString(), null, 2, null);
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m139738i(int target, int level, @NotNull Bitmap bitmap, int border) {
        bitmap.getClass();
        GLUtils.texImage2D(target, level, bitmap, border);
    }
}
