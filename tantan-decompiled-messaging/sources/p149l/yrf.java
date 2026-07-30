package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class yrf extends lr2 {
    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n const int samples = 100;\n const float minBlur = -.0;\n const float maxBlur = .5;\n void main() {\n     vec2 uv = textureCoordinate;\n     uv = fract(uv * 2.0);\n     float t = fract(iTime * 4.0);\n     t *= step(1.5, mod(iTime, 2.0));\n     vec4 result = vec4(0.);\n     float timeQ = minBlur + t * (maxBlur - minBlur);\n     for (int i=0; i<=samples; i++) {\n         float q = float(i)/float(samples);\n         result += texture2D(inputImageTexture0, uv + (vec2(0.5)-uv)*q*timeQ)/float(samples);\n     }\n     gl_FragColor = result;\n     gl_FragColor.r = mix(texture2D(inputImageTexture0,fract(uv + vec2(0.02 * t, 0.0))).r, result.r, 0.6);\n     gl_FragColor.b = mix(texture2D(inputImageTexture0,fract(uv - vec2(0.01 * t))).b, result.b, 0.95);\n }";
    }
}
