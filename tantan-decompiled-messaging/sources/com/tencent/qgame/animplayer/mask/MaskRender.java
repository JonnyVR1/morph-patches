package com.tencent.qgame.animplayer.mask;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ahd;
import p149l.b3x;
import p149l.bmc0;
import p149l.d3x;
import p149l.g1k;
import p149l.ga80;
import p149l.j3x;
import p149l.no0;
import p149l.p0l0;
import p149l.vhi0;
import p149l.x1m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006 "}, m87232d2 = {"Lcom/tencent/qgame/animplayer/mask/MaskRender;", "", "Ll/b3x;", "maskAnimPlugin", "<init>", "(Ll/b3x;)V", "", "edgeBlur", "", "initMaskShader", "(Z)V", "Ll/no0;", Constants.KEY_CONFIG, "renderFrame", "(Ll/no0;)V", "Ll/b3x;", "Ll/j3x;", "maskShader", "Ll/j3x;", "getMaskShader", "()Ll/j3x;", "setMaskShader", "(Ll/j3x;)V", "Ll/g1k;", "vertexArray", "Ll/g1k;", "getVertexArray", "()Ll/g1k;", "setVertexArray", "(Ll/g1k;)V", "maskArray", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MaskRender {

    @NotNull
    private static final String TAG = "AnimPlayer.MaskRender";

    @NotNull
    private final b3x maskAnimPlugin;

    @NotNull
    private g1k maskArray;

    @Nullable
    private j3x maskShader;

    @NotNull
    private g1k vertexArray;

    public MaskRender(@NotNull b3x b3xVar) {
        b3xVar.getClass();
        this.maskAnimPlugin = b3xVar;
        this.vertexArray = new g1k();
        this.maskArray = new g1k();
    }

    @Nullable
    public final j3x getMaskShader() {
        return this.maskShader;
    }

    @NotNull
    public final g1k getVertexArray() {
        return this.vertexArray;
    }

    public final void initMaskShader(boolean edgeBlur) {
        this.maskShader = new j3x(edgeBlur);
        GLES20.glDisable(2929);
    }

    public final void renderFrame(@NotNull no0 config) {
        x1m render;
        j3x j3xVar;
        d3x maskConfig;
        Bitmap alphaMaskBitmap;
        d3x maskConfig2;
        Pair<ga80, bmc0> pairM109963d;
        ga80 first;
        d3x maskConfig3;
        Pair<ga80, bmc0> pairM109963d2;
        bmc0 second;
        ga80 ga80Var;
        bmc0 bmc0Var;
        Pair<ga80, bmc0> pairM109961b;
        Pair<ga80, bmc0> pairM109961b2;
        config.getClass();
        ahd decoder = this.maskAnimPlugin.getPlayer().getDecoder();
        if (decoder == null || (render = decoder.getRender()) == null || render.mo98370a() <= 0 || (j3xVar = this.maskShader) == null || (maskConfig = config.getMaskConfig()) == null) {
            return;
        }
        int maskTexId = maskConfig.getMaskTexId();
        d3x maskConfig4 = config.getMaskConfig();
        if (maskConfig4 == null || (alphaMaskBitmap = maskConfig4.getAlphaMaskBitmap()) == null || (maskConfig2 = config.getMaskConfig()) == null || (pairM109963d = maskConfig2.m109963d()) == null || (first = pairM109963d.getFirst()) == null || (maskConfig3 = config.getMaskConfig()) == null || (pairM109963d2 = maskConfig3.m109963d()) == null || (second = pairM109963d2.getSecond()) == null) {
            return;
        }
        d3x maskConfig5 = config.getMaskConfig();
        if (maskConfig5 == null || (pairM109961b2 = maskConfig5.m109961b()) == null || (ga80Var = pairM109961b2.getFirst()) == null) {
            ga80Var = new ga80(0, 0, config.getWidth(), config.getHeight());
        }
        d3x maskConfig6 = config.getMaskConfig();
        if (maskConfig6 == null || (pairM109961b = maskConfig6.m109961b()) == null || (bmc0Var = pairM109961b.getSecond()) == null) {
            bmc0Var = new bmc0(config.getWidth(), config.getHeight());
        }
        j3xVar.m139600d();
        this.vertexArray.m124084b(p0l0.INSTANCE.m166989a(bmc0Var.getW(), bmc0Var.getH(), ga80Var, this.vertexArray.getArray()));
        this.vertexArray.m124085c(j3xVar.getAPositionLocation());
        if (maskTexId <= 0 && !alphaMaskBitmap.isRecycled()) {
            d3x maskConfig7 = config.getMaskConfig();
            maskTexId = maskConfig7 != null ? maskConfig7.m109966g() : 0;
        }
        if (maskTexId > 0) {
            this.maskArray.m124084b(vhi0.INSTANCE.m198463a(second.getW(), second.getH(), first, this.maskArray.getArray()));
            this.maskArray.m124085c(j3xVar.getATextureMaskCoordinatesLocation());
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, maskTexId);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glUniform1i(j3xVar.getUTextureMaskUnitLocation(), 0);
            GLES20.glEnable(3042);
            GLES20.glBlendFuncSeparate(1, 770, 0, 770);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisable(3042);
        }
    }

    public final void setMaskShader(@Nullable j3x j3xVar) {
        this.maskShader = j3xVar;
    }

    public final void setVertexArray(@NotNull g1k g1kVar) {
        g1kVar.getClass();
        this.vertexArray = g1kVar;
    }
}
