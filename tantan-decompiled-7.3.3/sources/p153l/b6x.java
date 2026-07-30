package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class b6x extends jt2 {
    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main() {\n   vec4 final = texture2D(inputImageTexture0,textureCoordinate);\n     float ba = 0.0;\n     lowp vec4 hardLightColor = vec4(vec3(final.b), 1.0);\n     for (int i =0; i < 3; i++)\n     {\n         if (hardLightColor.b < 0.5) {\n             ba = hardLightColor.b  * hardLightColor.b * 2.;\n         } else {\n             ba = 1. - (1. - hardLightColor.b) * (1. - hardLightColor.b) * 2.;\n         }\n         hardLightColor = vec4(vec3(ba), 1.0);\n     }\n     \n     float k = 255.0 / (164.0 - 75.0);\n     hardLightColor.r = (hardLightColor.r - 75.0 / 255.0) * k;\n     hardLightColor.g = (hardLightColor.g - 75.0 / 255.0) * k;\n     hardLightColor.b = (hardLightColor.b - 75.0 / 255.0) * k;\n     \n     gl_FragColor = hardLightColor;\n}\n";
    }
}
