package p153l;

import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\r\u0010\u000f¨\u0006\u0014"}, m88121d2 = {"Ll/i6x;", "", "", "edgeBlurBoolean", "<init>", "(Z)V", "", Constants.INAPP_DATA_TAG, "()V", "", "a", "I", "program", "b", "c", "()I", "uTextureMaskUnitLocation", "aPositionLocation", "aTextureMaskCoordinatesLocation", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class i6x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int program;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int uTextureMaskUnitLocation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int aPositionLocation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int aTextureMaskCoordinatesLocation;

    public i6x(boolean z) {
        int iM118858c = z ? e0f0.INSTANCE.m118858c("attribute vec4 vPosition;\nattribute vec4 vTexCoordinateAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\n\nvoid main() {\n    v_TexCoordinateAlphaMask = vec2(vTexCoordinateAlphaMask.x, vTexCoordinateAlphaMask.y);\n    gl_Position = vPosition;\n}", "precision mediump float;\nuniform sampler2D uTextureAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\nmat3 weight = mat3(0.0625,0.125,0.0625,0.125,0.25,0.125,0.0625,0.125,0.0625);\n int coreSize=3;\nfloat texelOffset = .01;\n\nvoid main() {\n   float alphaResult = 0.;\n   for(int y = 0; y < coreSize; y++) {\n       for(int x = 0;x < coreSize; x++) {\n           alphaResult += texture2D(uTextureAlphaMask, vec2(v_TexCoordinateAlphaMask.x + (-1.0 + float(x)) * texelOffset,v_TexCoordinateAlphaMask.y + (-1.0 + float(y)) * texelOffset)).a * weight[x][y];\n       }\n    }\n    gl_FragColor = vec4(0, 0, 0, alphaResult);\n}") : e0f0.INSTANCE.m118858c("attribute vec4 vPosition;\nattribute vec4 vTexCoordinateAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\n\nvoid main() {\n    v_TexCoordinateAlphaMask = vec2(vTexCoordinateAlphaMask.x, vTexCoordinateAlphaMask.y);\n    gl_Position = vPosition;\n}", "precision mediump float;\nuniform sampler2D uTextureAlphaMask;\nvarying vec2 v_TexCoordinateAlphaMask;\n\nvoid main () {\n    vec4 alphaMaskColor = texture2D(uTextureAlphaMask, v_TexCoordinateAlphaMask);\n    gl_FragColor = vec4(0, 0, 0, alphaMaskColor.a);\n}");
        this.program = iM118858c;
        this.uTextureMaskUnitLocation = GLES20.glGetUniformLocation(iM118858c, "uTextureAlphaMask");
        this.aPositionLocation = GLES20.glGetAttribLocation(iM118858c, "vPosition");
        this.aTextureMaskCoordinatesLocation = GLES20.glGetAttribLocation(iM118858c, "vTexCoordinateAlphaMask");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAPositionLocation() {
        return this.aPositionLocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getATextureMaskCoordinatesLocation() {
        return this.aTextureMaskCoordinatesLocation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getUTextureMaskUnitLocation() {
        return this.uTextureMaskUnitLocation;
    }

    /* JADX INFO: renamed from: d */
    public final void m138885d() {
        GLES20.glUseProgram(this.program);
    }
}
