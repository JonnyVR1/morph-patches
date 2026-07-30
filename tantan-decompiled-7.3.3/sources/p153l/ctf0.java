package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class ctf0 extends kt2 {

    /* JADX INFO: renamed from: D */
    private int f83690D;

    /* JADX INFO: renamed from: E */
    private int f83691E;

    /* JADX INFO: renamed from: F */
    private int f83692F;

    /* JADX INFO: renamed from: G */
    private int f83693G;

    /* JADX INFO: renamed from: H */
    private int f83694H = 1;

    /* JADX INFO: renamed from: O */
    public void m112465O(boolean z) {
        this.f83694H = z ? 1 : 0;
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate;\n\nvarying vec2 topTextureCoordinate;\nvarying vec2 topLeftTextureCoordinate;\nvarying vec2 topRightTextureCoordinate;\n\nvarying vec2 bottomTextureCoordinate;\nvarying vec2 bottomLeftTextureCoordinate;\nvarying vec2 bottomRightTextureCoordinate;\n\nuniform float threshold;\n\nuniform float texelWidth;\nuniform float texelHeight;\n\nuniform int sobelEnabled;\nfloat stepWidth = 1.0;\n\nfloat intensity(in vec4 color){\n    return sign(sqrt((color.x*color.x)+(color.y*color.y)+(color.z*color.z))-threshold);\n}\n\nvec4 sobel(vec2 center){\n    // get samples around pixel\n    float tleft = intensity(texture2D( inputImageTexture0, clamp(vec2(0.0), vec2(1.0), topLeftTextureCoordinate)));\n    float left = intensity(texture2D( inputImageTexture0,  clamp(vec2(0.0), vec2(1.0), leftTextureCoordinate)));\n    float bleft = intensity(texture2D( inputImageTexture0,  clamp(vec2(0.0), vec2(1.0), bottomLeftTextureCoordinate)));\n    float top = intensity(texture2D( inputImageTexture0,  clamp(vec2(0.0), vec2(1.0), topTextureCoordinate)));\n    float bottom = intensity(texture2D( inputImageTexture0,  clamp(vec2(0.0), vec2(1.0), bottomTextureCoordinate)));\n    float tright = intensity(texture2D( inputImageTexture0,  clamp(vec2(0.0), vec2(1.0), topRightTextureCoordinate)));\n    float right = intensity(texture2D( inputImageTexture0,  clamp(vec2(0.0), vec2(1.0), rightTextureCoordinate)));\n    float bright = intensity(texture2D( inputImageTexture0,  clamp(vec2(0.0), vec2(1.0), bottomRightTextureCoordinate)));\n    \n    // Sobel masks (see http://en.wikipedia.org/wiki/Sobel_operator)\n    //        1 0 -1     -1 -2 -1\n    //    X = 2 0 -2  Y = 0  0  0\n    //        1 0 -1      1  2  1\n    \n    // You could also use Scharr operator:\n    //        3 0 -3        3 10   3\n    //    X = 10 0 -10  Y = 0  0   0\n    //        3 0 -3        -3 -10 -3\n    \n    float x = 1.0*tleft + 2.0*left + 1.0*bleft - 1.0*tright - 2.0*right - 1.0*bright;\n    float y = -1.0*tleft - 2.0*top - 1.0*tright + 1.0*bleft + 2.0 * bottom + 1.0*bright;\n    //float x = 3.0*tleft + 10.0*left + 3.0*bleft - 3.0*tright - 10.0*right - 3.0*bright;\n    //float y = -3.0*tleft - 10.0*top - 3.0*tright + 3.0*bleft + 10.0 * bottom + 3.0*bright;\n    \n    float color = sqrt((x*x) + (y*y));\n    return vec4(color,color,color,1.0);\n}\n\nvoid main(){\n      vec4 colorSobel = sobel(textureCoordinate);\n      gl_FragColor = mix(vec4(0.0, 0.0, 0.0, 1.0), colorSobel, float(sobelEnabled));\n}";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\n\nuniform float texelWidth;\nuniform float texelHeight;\n\nvarying vec2 leftTextureCoordinate;\nvarying vec2 rightTextureCoordinate;\n\nvarying vec2 topTextureCoordinate;\nvarying vec2 topLeftTextureCoordinate;\nvarying vec2 topRightTextureCoordinate;\n\nvarying vec2 bottomTextureCoordinate;\nvarying vec2 bottomLeftTextureCoordinate;\nvarying vec2 bottomRightTextureCoordinate;\n\nvoid main() {\n   textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n\n   vec2 widthStep = vec2(texelWidth, 0.0);\n   vec2 heightStep = vec2(0.0, texelHeight);\n   vec2 widthHeightStep = vec2(texelWidth, texelHeight);\n   vec2 widthNegativeHeightStep = vec2(texelWidth, -texelHeight);\n\n   leftTextureCoordinate = inputTextureCoordinate.xy - widthStep;\n   rightTextureCoordinate = inputTextureCoordinate.xy + widthStep;\n   \n   topTextureCoordinate = inputTextureCoordinate.xy - heightStep;\n   topLeftTextureCoordinate = inputTextureCoordinate.xy - widthHeightStep;\n   topRightTextureCoordinate = inputTextureCoordinate.xy + widthNegativeHeightStep;\n   \n   bottomTextureCoordinate = inputTextureCoordinate.xy + heightStep;\n   bottomLeftTextureCoordinate = inputTextureCoordinate.xy - widthNegativeHeightStep;\n   bottomRightTextureCoordinate = inputTextureCoordinate.xy + widthHeightStep;\n}";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
        this.f83690D = GLES20.glGetUniformLocation(this.f193943d, "threshold");
        this.f83691E = GLES20.glGetUniformLocation(this.f193943d, "texelWidth");
        this.f83692F = GLES20.glGetUniformLocation(this.f193943d, "texelHeight");
        this.f83693G = GLES20.glGetUniformLocation(this.f193943d, "sobelEnabled");
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        GLES20.glUniform1f(this.f83690D, 0.8f);
        GLES20.glUniform1f(this.f83691E, 1.0f / m210702r());
        GLES20.glUniform1f(this.f83692F, 1.0f / m210701n());
        GLES20.glUniform1i(this.f83693G, this.f83694H);
    }
}
