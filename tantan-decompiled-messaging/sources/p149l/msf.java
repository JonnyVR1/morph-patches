package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class msf extends lr2 {
    @Override // p149l.ccj
    public String getFragmentShader() {
        return " precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n void main() {\n     vec2 uv = textureCoordinate;\n     uv.x += iTime * 0.5;\n     gl_FragColor = texture2D(inputImageTexture0,fract(uv));\n }";
    }
}
