package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tmj0 extends rmj0 {
    protected static final String UNIFORM_TEXELHEIGHT = "texelHeightOffset";
    protected static final String UNIFORM_TEXELWIDTH = "texelWidthOffset";
    protected float texelHeight;
    private int texelHeightHandle;
    protected float texelWidth;
    private int texelWidthHandle;

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        this.texelWidth = 1.0f / getWidth();
        this.texelHeight = 1.0f / getHeight();
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.texelWidthHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXELWIDTH);
        this.texelHeightHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_TEXELHEIGHT);
    }

    @Override // p153l.wej
    public void passShaderValues() {
        if (getCurrentPass() == 1) {
            this.texelWidth = 1.0f / getWidth();
            this.texelHeight = 0.0f;
        } else {
            this.texelWidth = 0.0f;
            this.texelHeight = 1.0f / getHeight();
        }
        super.passShaderValues();
        GLES20.glUniform1f(this.texelWidthHandle, this.texelWidth);
        GLES20.glUniform1f(this.texelHeightHandle, this.texelHeight);
    }
}
