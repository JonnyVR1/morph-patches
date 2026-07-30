package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class ipf0 extends AbstractC17477i4 {
    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n    vec2 uv = textureCoordinate;\n     uv.x = uv.x > 0.5 ? 1.0 - uv.x : uv.x;\n     vec4 color = texture2D(inputImageTexture0, uv);\n gl_FragColor = color;\n}\n";
    }
}
