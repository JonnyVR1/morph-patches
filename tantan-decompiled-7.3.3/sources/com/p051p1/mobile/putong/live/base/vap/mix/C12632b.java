package com.p051p1.mobile.putong.live.base.vap.mix;

import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.feed.data.Frame;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C21726z0;
import p153l.e6j;
import p153l.gid;
import p153l.jo0;
import p153l.mc00;
import p153l.mi80;
import p153l.q4m;
import p153l.tti0;
import p153l.u9l0;
import p153l.vqi0;
import p153l.w3k;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.vap.mix.b */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 72\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00106\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010+\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/¨\u00068"}, m88121d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/b;", "", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "mixAnimPlugin", "<init>", "(Lcom/p1/mobile/putong/live/base/vap/mix/a;)V", "", "b", "()V", "Ll/jo0;", Constants.KEY_CONFIG, "Ll/e6j;", Frame.TYPE, "Lcom/p1/mobile/putong/live/base/vap/mix/Src;", "src", Constants.INAPP_DATA_TAG, "(Ll/jo0;Ll/e6j;Lcom/p1/mobile/putong/live/base/vap/mix/Src;)V", "", "textureId", "c", "(I)V", "", "array", "fw", "fh", "sw", "sh", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;", "fitType", "a", "([FIIIILcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;)[F", "color", "e", "(I)[F", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "Ll/mc00;", "Ll/mc00;", "getShader", "()Ll/mc00;", "setShader", "(Ll/mc00;)V", "shader", "Ll/w3k;", "Ll/w3k;", "getVertexArray", "()Ll/w3k;", "setVertexArray", "(Ll/w3k;)V", "vertexArray", "getSrcArray", "setSrcArray", "srcArray", "getMaskArray", "setMaskArray", "maskArray", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C12632b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12631a mixAnimPlugin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public mc00 shader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public w3k vertexArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public w3k srcArray;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public w3k maskArray;

    public C12632b(@NotNull C12631a c12631a) {
        c12631a.getClass();
        this.mixAnimPlugin = c12631a;
        this.vertexArray = new w3k();
        this.srcArray = new w3k();
        this.maskArray = new w3k();
    }

    /* JADX INFO: renamed from: a */
    public final float[] m69879a(float[] array, int fw, int fh, int sw, int sh, Src.FitType fitType) {
        mi80 mi80Var;
        if (fitType != Src.FitType.CENTER_FULL) {
            return vqi0.INSTANCE.m202383a(fw, fh, new mi80(0, 0, fw, fh), array);
        }
        if (fw <= sw && fh <= sh) {
            return vqi0.INSTANCE.m202383a(sw, sh, new mi80((sw - fw) / 2, (sh - fh) / 2, fw, fh), array);
        }
        float f = (fw * 1.0f) / fh;
        float f2 = sw;
        float f3 = sh;
        if (f > (1.0f * f2) / f3) {
            int i = (int) (f2 / f);
            mi80Var = new mi80(0, (sh - i) / 2, sw, i);
        } else {
            int i2 = (int) (f3 * f);
            mi80Var = new mi80((sw - i2) / 2, 0, i2, sh);
        }
        return vqi0.INSTANCE.m202383a(sw, sh, mi80Var, array);
    }

    /* JADX INFO: renamed from: b */
    public final void m69880b() {
        HashMap<String, Src> mapM69886a;
        Collection<Src> collectionValues;
        this.shader = new mc00();
        GLES20.glDisable(2929);
        C12634d srcMap = this.mixAnimPlugin.getSrcMap();
        if (srcMap == null || (mapM69886a = srcMap.m69886a()) == null || (collectionValues = mapM69886a.values()) == null) {
            return;
        }
        for (Src src : collectionValues) {
            C21726z0 c21726z0 = C21726z0.INSTANCE;
            c21726z0.m218095d("AnimPlayer.MixRender", "init srcId=" + src.getSrcId());
            src.m69848q(tti0.INSTANCE.m192670a(src.getBitmap()));
            mc00 mc00Var = this.shader;
            Integer numValueOf = mc00Var != null ? Integer.valueOf(mc00Var.getProgram()) : null;
            c21726z0.m218095d("AnimPlayer.MixRender", "textureProgram=" + numValueOf + ",textureId=" + src.getSrcTextureId());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m69881c(int textureId) {
        if (textureId != 0) {
            GLES20.glDeleteTextures(1, new int[]{textureId}, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m69882d(@NotNull jo0 config, @NotNull e6j frame, @NotNull Src src) {
        q4m render;
        int iMo128148a;
        mc00 mc00Var;
        config.getClass();
        frame.getClass();
        src.getClass();
        gid decoder = this.mixAnimPlugin.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getDecoder();
        if (decoder == null || (render = decoder.getRender()) == null || (iMo128148a = render.mo128148a()) <= 0 || (mc00Var = this.shader) == null) {
            return;
        }
        mc00Var.m157908i();
        this.vertexArray.m204769b(u9l0.INSTANCE.m195103a(config.getWidth(), config.getHeight(), frame.getFrame(), this.vertexArray.getArray()));
        this.vertexArray.m204770c(mc00Var.getAPositionLocation());
        w3k w3kVar = this.srcArray;
        w3kVar.m204769b(m69879a(w3kVar.getArray(), frame.getFrame().getW(), frame.getFrame().getH(), src.getDrawWidth(), src.getDrawHeight(), src.getFitType()));
        this.srcArray.m204770c(mc00Var.getATextureSrcCoordinatesLocation());
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, src.getSrcTextureId());
        GLES20.glUniform1i(mc00Var.getUTextureSrcUnitLocation(), 0);
        w3k w3kVar2 = this.maskArray;
        vqi0 vqi0Var = vqi0.INSTANCE;
        w3kVar2.m204769b(vqi0Var.m202383a(config.getVideoWidth(), config.getVideoHeight(), frame.getMFrame(), this.maskArray.getArray()));
        if (frame.getMt() == 90) {
            w3k w3kVar3 = this.maskArray;
            w3kVar3.m204769b(vqi0Var.m202384b(w3kVar3.getArray()));
        }
        this.maskArray.m204770c(mc00Var.getATextureMaskCoordinatesLocation());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(36197, iMo128148a);
        GLES20.glUniform1i(mc00Var.getUTextureMaskUnitLocation(), 1);
        if (src.getSrcType() == Src.SrcType.TXT && this.mixAnimPlugin.getAutoTxtColorFill()) {
            GLES20.glUniform1i(mc00Var.getUIsFillLocation(), 1);
            float[] fArrM69883e = m69883e(src.getColor());
            GLES20.glUniform4f(mc00Var.getUColorLocation(), fArrM69883e[1], fArrM69883e[2], fArrM69883e[3], fArrM69883e[0]);
        } else {
            GLES20.glUniform1i(mc00Var.getUIsFillLocation(), 0);
            GLES20.glUniform4f(mc00Var.getUColorLocation(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisable(3042);
    }

    /* JADX INFO: renamed from: e */
    public final float[] m69883e(int color) {
        return new float[]{((color >>> 24) & 255) / 255.0f, ((color >>> 16) & 255) / 255.0f, ((color >>> 8) & 255) / 255.0f, (color & 255) / 255.0f};
    }
}
