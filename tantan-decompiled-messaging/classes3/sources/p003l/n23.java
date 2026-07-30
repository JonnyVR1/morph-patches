package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class n23 extends zs2 {
    private int matrixHandler = 0;
    private int alphaHandler = 0;

    @Override // p003l.zs2
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // p003l.zs2
    public /* bridge */ /* synthetic */ void drawFrame(int[] iArr) {
        super.drawFrame(iArr);
    }

    @Override // p003l.zs2
    public String getSubFrameShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float alpha;void main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(color.rgb, color.a * alpha);\n}\n";
    }

    @Override // p003l.zs2
    public String getSubVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform mat4 trsMatrix;void main() {\n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = trsMatrix * position;\n}\n";
    }

    @Override // p003l.zs2
    public void initShaderHandles() {
        super.initShaderHandles();
        this.matrixHandler = GLES20.glGetUniformLocation(this.programHandle, "trsMatrix");
        this.alphaHandler = GLES20.glGetUniformLocation(this.programHandle, "alpha");
    }

    @Override // p003l.zs2
    public synchronized void passShaderValues(int[] iArr) {
        super.passShaderValues(iArr);
        GLES20.glUniformMatrix4fv(this.matrixHandler, 1, false, this.geometryAttrInfo.getMvpMatrix(), 0);
        GLES20.glUniform1f(this.alphaHandler, this.geometryAttrInfo.getAlphaValue());
    }

    @Override // p003l.zs2
    public /* bridge */ /* synthetic */ void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
    }

    public void updateGeomtryInfo(igm igmVar) {
        if (igmVar != null) {
            this.geometryAttrInfo = igmVar;
        }
    }
}
