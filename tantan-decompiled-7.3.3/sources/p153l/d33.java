package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class d33 extends pt2 {
    private int matrixHandler = 0;
    private int alphaHandler = 0;

    @Override // p153l.pt2
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // p153l.pt2
    public /* bridge */ /* synthetic */ void drawFrame(int[] iArr) {
        super.drawFrame(iArr);
    }

    @Override // p153l.pt2
    public String getSubFrameShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float alpha;void main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(color.rgb, color.a * alpha);\n}\n";
    }

    @Override // p153l.pt2
    public String getSubVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform mat4 trsMatrix;void main() {\n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = trsMatrix * position;\n}\n";
    }

    @Override // p153l.pt2
    public void initShaderHandles() {
        super.initShaderHandles();
        this.matrixHandler = GLES20.glGetUniformLocation(this.programHandle, "trsMatrix");
        this.alphaHandler = GLES20.glGetUniformLocation(this.programHandle, "alpha");
    }

    @Override // p153l.pt2
    public synchronized void passShaderValues(int[] iArr) {
        super.passShaderValues(iArr);
        GLES20.glUniformMatrix4fv(this.matrixHandler, 1, false, this.geometryAttrInfo.getMvpMatrix(), 0);
        GLES20.glUniform1f(this.alphaHandler, this.geometryAttrInfo.getAlphaValue());
    }

    @Override // p153l.pt2
    public /* bridge */ /* synthetic */ void setRenderSize(int i, int i2) {
        super.setRenderSize(i, i2);
    }

    public void updateGeomtryInfo(lim limVar) {
        if (limVar != null) {
            this.geometryAttrInfo = limVar;
        }
    }
}
