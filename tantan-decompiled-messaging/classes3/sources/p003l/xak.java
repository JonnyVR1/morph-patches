package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xak extends ts2 {
    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvec3 W = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   float grey =  dot(color.rgb, W);\n   gl_FragColor = vec4(grey, grey, grey, color.a);}\n";
    }
}
