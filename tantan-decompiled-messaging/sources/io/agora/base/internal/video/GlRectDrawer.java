package io.agora.base.internal.video;

/* JADX INFO: loaded from: classes2.dex */
public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private ShaderCallbacks() {
        }

        @Override // io.agora.base.internal.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // io.agora.base.internal.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }
    }

    public GlRectDrawer() {
        super(FRAGMENT_SHADER, new ShaderCallbacks());
    }
}
