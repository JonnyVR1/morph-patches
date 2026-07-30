package com.p046p1.mobile.putong.live.base.vap.mix;

import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.feed.data.Frame;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C21588z0;
import p149l.ahd;
import p149l.g1k;
import p149l.ga80;
import p149l.j3j;
import p149l.no0;
import p149l.p0l0;
import p149l.p300;
import p149l.tki0;
import p149l.vhi0;
import p149l.x1m;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.base.vap.mix.b */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 72\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00106\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010+\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/¨\u00068"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/mix/b;", "", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "mixAnimPlugin", "<init>", "(Lcom/p1/mobile/putong/live/base/vap/mix/a;)V", "", "b", "()V", "Ll/no0;", Constants.KEY_CONFIG, "Ll/j3j;", Frame.TYPE, "Lcom/p1/mobile/putong/live/base/vap/mix/Src;", "src", Constants.INAPP_DATA_TAG, "(Ll/no0;Ll/j3j;Lcom/p1/mobile/putong/live/base/vap/mix/Src;)V", "", "textureId", "c", "(I)V", "", "array", "fw", "fh", "sw", "sh", "Lcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;", "fitType", "a", "([FIIIILcom/p1/mobile/putong/live/base/vap/mix/Src$FitType;)[F", "color", "e", "(I)[F", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "Ll/p300;", "Ll/p300;", "getShader", "()Ll/p300;", "setShader", "(Ll/p300;)V", "shader", "Ll/g1k;", "Ll/g1k;", "getVertexArray", "()Ll/g1k;", "setVertexArray", "(Ll/g1k;)V", "vertexArray", "getSrcArray", "setSrcArray", "srcArray", "getMaskArray", "setMaskArray", "maskArray", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C12469b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12468a mixAnimPlugin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public p300 shader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public g1k vertexArray;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public g1k srcArray;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public g1k maskArray;

    public C12469b(@NotNull C12468a c12468a) {
        c12468a.getClass();
        this.mixAnimPlugin = c12468a;
        this.vertexArray = new g1k();
        this.srcArray = new g1k();
        this.maskArray = new g1k();
    }

    /* JADX INFO: renamed from: a */
    public final float[] m68696a(float[] array, int fw, int fh, int sw, int sh, Src.FitType fitType) {
        ga80 ga80Var;
        if (fitType != Src.FitType.CENTER_FULL) {
            return vhi0.INSTANCE.m198463a(fw, fh, new ga80(0, 0, fw, fh), array);
        }
        if (fw <= sw && fh <= sh) {
            return vhi0.INSTANCE.m198463a(sw, sh, new ga80((sw - fw) / 2, (sh - fh) / 2, fw, fh), array);
        }
        float f = (fw * 1.0f) / fh;
        float f2 = sw;
        float f3 = sh;
        if (f > (1.0f * f2) / f3) {
            int i = (int) (f2 / f);
            ga80Var = new ga80(0, (sh - i) / 2, sw, i);
        } else {
            int i2 = (int) (f3 * f);
            ga80Var = new ga80((sw - i2) / 2, 0, i2, sh);
        }
        return vhi0.INSTANCE.m198463a(sw, sh, ga80Var, array);
    }

    /* JADX INFO: renamed from: b */
    public final void m68697b() {
        HashMap<String, Src> mapM68703a;
        Collection<Src> collectionValues;
        this.shader = new p300();
        GLES20.glDisable(2929);
        C12471d srcMap = this.mixAnimPlugin.getSrcMap();
        if (srcMap == null || (mapM68703a = srcMap.m68703a()) == null || (collectionValues = mapM68703a.values()) == null) {
            return;
        }
        for (Src src : collectionValues) {
            C21588z0 c21588z0 = C21588z0.INSTANCE;
            c21588z0.m216709d("AnimPlayer.MixRender", "init srcId=" + src.getSrcId());
            src.m68665q(tki0.INSTANCE.m189481a(src.getBitmap()));
            p300 p300Var = this.shader;
            Integer numValueOf = p300Var != null ? Integer.valueOf(p300Var.getProgram()) : null;
            c21588z0.m216709d("AnimPlayer.MixRender", "textureProgram=" + numValueOf + ",textureId=" + src.getSrcTextureId());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m68698c(int textureId) {
        if (textureId != 0) {
            GLES20.glDeleteTextures(1, new int[]{textureId}, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m68699d(@NotNull no0 config, @NotNull j3j frame, @NotNull Src src) {
        x1m render;
        int iMo98370a;
        p300 p300Var;
        config.getClass();
        frame.getClass();
        src.getClass();
        ahd decoder = this.mixAnimPlugin.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getDecoder();
        if (decoder == null || (render = decoder.getRender()) == null || (iMo98370a = render.mo98370a()) <= 0 || (p300Var = this.shader) == null) {
            return;
        }
        p300Var.m167240i();
        this.vertexArray.m124084b(p0l0.INSTANCE.m166989a(config.getWidth(), config.getHeight(), frame.getFrame(), this.vertexArray.getArray()));
        this.vertexArray.m124085c(p300Var.getAPositionLocation());
        g1k g1kVar = this.srcArray;
        g1kVar.m124084b(m68696a(g1kVar.getArray(), frame.getFrame().getW(), frame.getFrame().getH(), src.getDrawWidth(), src.getDrawHeight(), src.getFitType()));
        this.srcArray.m124085c(p300Var.getATextureSrcCoordinatesLocation());
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, src.getSrcTextureId());
        GLES20.glUniform1i(p300Var.getUTextureSrcUnitLocation(), 0);
        g1k g1kVar2 = this.maskArray;
        vhi0 vhi0Var = vhi0.INSTANCE;
        g1kVar2.m124084b(vhi0Var.m198463a(config.getVideoWidth(), config.getVideoHeight(), frame.getMFrame(), this.maskArray.getArray()));
        if (frame.getMt() == 90) {
            g1k g1kVar3 = this.maskArray;
            g1kVar3.m124084b(vhi0Var.m198464b(g1kVar3.getArray()));
        }
        this.maskArray.m124085c(p300Var.getATextureMaskCoordinatesLocation());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(36197, iMo98370a);
        GLES20.glUniform1i(p300Var.getUTextureMaskUnitLocation(), 1);
        if (src.getSrcType() == Src.SrcType.TXT && this.mixAnimPlugin.getAutoTxtColorFill()) {
            GLES20.glUniform1i(p300Var.getUIsFillLocation(), 1);
            float[] fArrM68700e = m68700e(src.getColor());
            GLES20.glUniform4f(p300Var.getUColorLocation(), fArrM68700e[1], fArrM68700e[2], fArrM68700e[3], fArrM68700e[0]);
        } else {
            GLES20.glUniform1i(p300Var.getUIsFillLocation(), 0);
            GLES20.glUniform4f(p300Var.getUColorLocation(), 0.0f, 0.0f, 0.0f, 0.0f);
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisable(3042);
    }

    /* JADX INFO: renamed from: e */
    public final float[] m68700e(int color) {
        return new float[]{((color >>> 24) & 255) / 255.0f, ((color >>> 16) & 255) / 255.0f, ((color >>> 8) & 255) / 255.0f, (color & 255) / 255.0f};
    }
}
