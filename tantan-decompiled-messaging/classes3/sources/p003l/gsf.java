package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gsf extends lr2 {
    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform float iTime;\n const float PI = 3.1415927;\n highp vec4 rgbShift(highp vec2 uv) {\n     float amount = 0.01;\n     float t = sin(iTime * 0.28) + cos(iTime * 0.52);\n     t *= PI;\n     highp vec2 d = vec2(amount * cos(t), amount * sin(t));\n     float r = texture2D(inputImageTexture0,fract(uv - d)).r;\n     float g = texture2D(inputImageTexture0,fract(uv + 0.0)).g;\n     float b = texture2D(inputImageTexture0,fract(uv + d)).b;\n     return vec4(r,g,b,1.0);\n }\n void main() {\n     highp vec2 uv = textureCoordinate;\n     float line = 0.42;\n     uv.y += line;\n     uv.y = mix(uv.y - 0.1, uv.y + 0.1, step(1.0, uv.y));\n     float a = abs(textureCoordinate.y - 1.0 + line);\n     a = smoothstep(0.002, 0.010, a);\n     gl_FragColor = mix(vec4(vec3(0.0), 1.0), rgbShift(uv), a);\n }";
    }
}
