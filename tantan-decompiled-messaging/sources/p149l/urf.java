package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class urf extends lr2 {
    @Override // p149l.ccj
    public String getFragmentShader() {
        return " precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n void main() {\n     highp vec2 uv = textureCoordinate;\n     highp vec4 color = texture2D(inputImageTexture0,fract(uv));\n     float strength = 50.0;\n     float x = (uv.x + 4.0 ) * (uv.y + 4.0 ) * (iTime * 10.0);\n     highp vec4 grain = vec4(mod((mod(x, 13.0) + 1.0) * (mod(x, 123.0) + 1.0), 0.01)-0.005) * strength;\n     gl_FragColor = color + grain;\n }\n";
    }
}
