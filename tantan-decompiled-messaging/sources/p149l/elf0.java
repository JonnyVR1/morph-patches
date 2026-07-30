package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class elf0 extends xj10 {
    public elf0() {
        super(2);
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n   gl_FragColor = color1 * (color2.a * (color1 / color1.a) + (2.0 * color2 * (1.0 - (color1 / color1.a)))) + color2 * (1.0 - color1.a) + color1 * (1.0 - color2.a);\n}\n";
    }
}
