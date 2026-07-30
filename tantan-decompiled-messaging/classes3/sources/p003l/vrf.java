package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vrf extends lr2 {
    @Override // p003l.ccj
    public String getFragmentShader() {
        return "varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n void main() {\n     highp vec2 uv = textureCoordinate;\n     highp float t = mod(iTime/0.5,1.0);\n     if (t < 0.2) {\n         t = t / 0.2;\n         uv.x += (0.5-uv.x)*(t*0.1);\n         uv.y += (0.5-uv.y)*(t*0.1);\n     } else if (t < 0.6) {\n         t = (t - 0.2) / 0.4;\n         uv.x += (0.5-uv.x)*(0.1 + t*-0.075);\n         uv.y += (0.5-uv.y)*(0.1 + t*-0.075);\n     } else {\n         t = (t - 0.6) / 0.4;\n         uv.x += (0.5-uv.x)*(0.025 + t*-0.025);\n         uv.y += (0.5-uv.y)*(0.025 + t*-0.025);\n     }\n     gl_FragColor = texture2D(inputImageTexture0,fract(uv));\n }";
    }
}
