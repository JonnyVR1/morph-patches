package p149l;

import android.opengl.GLES20;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/xre0;", "", "<init>", "()V", "", "vertexSource", "fragmentSource", "", "c", "(Ljava/lang/String;Ljava/lang/String;)I", "shaderType", "shaderSource", "a", "(ILjava/lang/String;)I", "vertexShaderHandle", "fragmentShaderHandle", "b", "(II)I", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xre0 {

    @NotNull
    public static final xre0 INSTANCE = new xre0();

    /* JADX INFO: renamed from: a */
    public final int m210673a(int shaderType, String shaderSource) {
        int iGlCreateShader = GLES20.glCreateShader(shaderType);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, shaderSource);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                C21588z0.INSTANCE.m216707b("AnimPlayer.ShaderUtil", "Error compiling shader: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                iGlCreateShader = 0;
            }
        }
        if (iGlCreateShader != 0) {
            return iGlCreateShader;
        }
        upk0.m194883a("Error creating shader.");
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m210674b(int vertexShaderHandle, int fragmentShaderHandle) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, vertexShaderHandle);
            GLES20.glAttachShader(iGlCreateProgram, fragmentShaderHandle);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                C21588z0.INSTANCE.m216707b("AnimPlayer.ShaderUtil", "Error compiling program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                iGlCreateProgram = 0;
            }
        }
        if (iGlCreateProgram != 0) {
            return iGlCreateProgram;
        }
        upk0.m194883a("Error creating program.");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m210675c(@NotNull String vertexSource, @NotNull String fragmentSource) {
        vertexSource.getClass();
        fragmentSource.getClass();
        return m210674b(m210673a(35633, vertexSource), m210673a(35632, fragmentSource));
    }
}
