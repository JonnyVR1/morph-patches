package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class jsf extends lr2 {
    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n \n uniform highp float iTime;\n \n void main() {\n     highp vec2 uv = textureCoordinate;\n     float amount = 0.0;\n     amount = (1.0 + sin(iTime*6.0)) * 0.5;\n     amount *= 1.0 + sin(iTime*16.0) * 0.5;\n     amount *= 1.0 + sin(iTime*19.0) * 0.5;\n     amount *= 1.0 + sin(iTime*27.0) * 0.5;\n     amount = pow(amount, 3.0);\n     amount *= 0.05; highp vec3 col;\n     highp vec4 colorR = texture2D(inputImageTexture0,fract(vec2(uv.x+amount, uv.y)));\n     highp vec4 colorG = texture2D(inputImageTexture0,fract(uv));\n     highp vec4 colorB = texture2D(inputImageTexture0,fract(vec2(uv.x-amount, uv.y)));\n     col.r = colorR.r; col.g = colorG.g; col.b = colorB.b;\n     col *= (1.0 - amount * 0.5);\n     gl_FragColor = vec4(col, (colorR.a + colorG.a + colorB.a) / 3.0);\n }";
    }
}
