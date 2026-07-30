package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class vsf extends bs2 {
    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture0;\n uniform highp float iTime;\n float c_textureSize = 512.0;\n void main() {\n     highp vec2 uv = textureCoordinate;\n     highp vec3 tex = texture2D(inputImageTexture0,fract(uv)).xyz;\n     float bounds = .5;\n     gl_FragColor = vec4(uv.x < bounds ? clamp(dot(tex, tex), 0., 1.) : (tex.x + tex.y + tex.z) / 3.);\n }";
    }
}
