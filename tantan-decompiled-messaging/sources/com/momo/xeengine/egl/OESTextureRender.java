package com.momo.xeengine.egl;

/* JADX INFO: loaded from: classes8.dex */
public final class OESTextureRender extends BaseTextureRender {
    private static final String ps_type_0 = "#extension GL_OES_EGL_image_external : require\nprecision highp float;varying vec2 vTextureCo;uniform samplerExternalOES uTexture;void main() {    vec2 adjustedCo = vec2(vTextureCo.x, vTextureCo.y);    gl_FragColor = texture2D(uTexture, adjustedCo);}";
    private static final String ps_type_1 = "#extension GL_OES_EGL_image_external : require\nprecision highp float;varying vec2 vTextureCo;uniform mat4 uTextureMatrix;uniform samplerExternalOES uTexture;void main() {    float alphaPos = (uTextureMatrix * vec4(0.5, 1.0, 0.0, 1.0)).x;    vec2 alphaCood = vec2(vTextureCo.x * 0.5, vTextureCo.y);    vec2 colorCood = vec2(vTextureCo.x * 0.5 + alphaPos, vTextureCo.y);    vec3 rgb = texture2D(uTexture, colorCood).rgb;    float alpha = texture2D(uTexture, alphaCood).r;    gl_FragColor = vec4(rgb, alpha);}";
    private static final String ps_type_2 = "#extension GL_OES_EGL_image_external : require\nprecision highp float;varying vec2 vTextureCo;uniform mat4 uTextureMatrix;uniform samplerExternalOES uTexture;vec3 rgb2yuv_bt709(vec3 rgb) {   float y =  0.2126 * rgb.r + 0.7152 * rgb.g + 0.0722 * rgb.b;   float u = -0.1146 * rgb.r - 0.3854 * rgb.g + 0.5000 * rgb.b;   float v =  0.5000 * rgb.r - 0.4542 * rgb.g - 0.0458 * rgb.b;   return vec3(y, u, v);}vec3 yuv2rgb_bt709(vec3 yuv) {   float y = yuv.x, u = yuv.y, v = yuv.z;   float r = y + 1.5748 * v;   float g = y - 0.1873 * u - 0.4681 * v;   float b = y + 1.8556 * u;   return vec3(r, g, b);}void main() {    float alphaPos = (uTextureMatrix * vec4(0.5, 1.0, 0.0, 1.0)).x;    vec2 alphaCood = vec2(alphaPos - vTextureCo.x * 0.5, vTextureCo.y);    vec2 colorCood = vec2(vTextureCo.x * 0.5 + alphaPos, vTextureCo.y);    vec3 videoRGB = texture2D(uTexture, colorCood).rgb;    vec3 videoYUV = rgb2yuv_bt709(videoRGB).xzy;    vec3 rgb = yuv2rgb_bt709(videoYUV);    float alpha = texture2D(uTexture, alphaCood).r;    gl_FragColor = vec4(rgb, alpha);}";
    private static final String ps_type_3 = "#extension GL_OES_EGL_image_external : require\nprecision highp float;varying vec2 vTextureCo;uniform mat4 uTextureMatrix;uniform samplerExternalOES uTexture;void main() {    float colorWidth = (uTextureMatrix * vec4(1.0 / 3.0 * 2.0, 1, 0, 1)).x;    vec2 alphaCood = vec2(colorWidth + vTextureCo.x / 3.0, vTextureCo.y * 0.5);    vec2 colorCood = vec2(vTextureCo.x / 3.0 * 2.0, vTextureCo.y);    vec3 rgb = texture2D(uTexture, colorCood).rgb;    float alpha = texture2D(uTexture, alphaCood).r;    gl_FragColor = vec4(rgb, alpha);}";

    /* JADX INFO: renamed from: vs */
    private static final String f14572vs = "attribute vec4 aVertexCo;attribute vec2 aTextureCo;uniform mat4 uVertexMatrix;uniform mat4 uTextureMatrix;varying vec2 vTextureCo;void main(){    gl_Position = uVertexMatrix * aVertexCo;    vTextureCo = (uTextureMatrix * vec4(aTextureCo, 0.0, 1.0)).xy;}";

    public OESTextureRender(int i) {
        super(f14572vs, getPsShader(i));
        create();
    }

    private static String getPsShader(int i) {
        if (i == 1) {
            return ps_type_1;
        }
        if (i != 2) {
            return i != 3 ? ps_type_0 : ps_type_3;
        }
        return ps_type_2;
    }
}
