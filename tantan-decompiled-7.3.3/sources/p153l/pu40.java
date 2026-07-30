package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class pu40 extends is10 {
    public pu40() {
        super(2);
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec4 color2 = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color1 = texture2D(inputImageTexture1,textureCoordinate);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = a;\n   gl_FragColor = outputColor;\n}\n";
    }
}
