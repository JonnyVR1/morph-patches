package p149l;

/* JADX INFO: loaded from: classes7.dex */
public class v5l0 extends ss2 {

    /* JADX INFO: renamed from: E */
    public String f180094E = "mediump";

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision " + this.f180094E + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n vec2 texOne = textureCoordinate;\n   vec4 color1 = texture2D(inputImageTexture0, vec2(texOne.x/2.0,texOne.y));\n   vec4 color2 = texture2D(inputImageTexture0,vec2(texOne.x/2.0 + 0.5,texOne.y));\ncolor2.a = color1.r; color2.rgb = color2.rgb * color1.r;    gl_FragColor = color2;\n}\n";
    }
}
