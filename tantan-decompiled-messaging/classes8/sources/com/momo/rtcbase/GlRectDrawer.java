package com.momo.rtcbase;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class GlRectDrawer extends GlGenericDrawer {
    private static final String FRAGMENT_SHADER = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private ShaderCallbacks() {
        }

        @Override // com.momo.rtcbase.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
        }

        @Override // com.momo.rtcbase.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
        }
    }

    public GlRectDrawer() {
        super(FRAGMENT_SHADER, new ShaderCallbacks());
    }

    @Override // com.momo.rtcbase.GlGenericDrawer, com.momo.rtcbase.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawOes(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.momo.rtcbase.GlGenericDrawer, com.momo.rtcbase.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        super.drawRgb(i, fArr, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.momo.rtcbase.GlGenericDrawer, com.momo.rtcbase.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super.drawYuv(iArr, fArr, i, i2, i3, i4, i5, i6);
    }

    @Override // com.momo.rtcbase.GlGenericDrawer, com.momo.rtcbase.RendererCommon.GlDrawer
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
