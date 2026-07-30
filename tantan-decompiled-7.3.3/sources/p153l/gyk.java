package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class gyk extends hs10 {
    public gyk() {
        super(2);
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   vec3 final = color1.rgb - color2.rgb + vec3(0.5,0.5,0.5);\n   gl_FragColor = vec4(final,1.0);\n}\n";
    }
}
