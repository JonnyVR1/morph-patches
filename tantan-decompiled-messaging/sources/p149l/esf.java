package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class esf extends lr2 {
    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n uniform highp vec2 iResolution;\n float rand(float id){\n     return fract(sin(id*400.) * 4375.5453);\n }\n highp vec2 blur(highp vec2 u) {\n     highp vec3 col = vec3(0.);\n     for (float i = 0.; i < 5.; ++i) {\n         float rad = i/5.*6.2831853072;\n         highp vec2 offset = vec2(cos(rad),sin(rad)) ;\n         offset *= rand(u.x+u.y);\n         u -= offset*0.015;\n     }\n     return u;\n }\n void main() {\n     highp vec2 uv = textureCoordinate;\n     float time = (0.5 - abs(mod(iTime, 1.) - 0.5) - 0.1) * 30.;\n     for (float i = 0.; i < time; ++i) {\n         uv = blur(uv);\n     }\n     gl_FragColor = texture2D(inputImageTexture0,fract(uv));\n }";
    }
}
