package com.tencent.qgame.animplayer.mask;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a6x;
import p153l.c6x;
import p153l.gid;
import p153l.i6x;
import p153l.iuc0;
import p153l.jo0;
import p153l.mi80;
import p153l.q4m;
import p153l.u9l0;
import p153l.vqi0;
import p153l.w3k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006 "}, m88121d2 = {"Lcom/tencent/qgame/animplayer/mask/MaskRender;", "", "Ll/a6x;", "maskAnimPlugin", "<init>", "(Ll/a6x;)V", "", "edgeBlur", "", "initMaskShader", "(Z)V", "Ll/jo0;", Constants.KEY_CONFIG, "renderFrame", "(Ll/jo0;)V", "Ll/a6x;", "Ll/i6x;", "maskShader", "Ll/i6x;", "getMaskShader", "()Ll/i6x;", "setMaskShader", "(Ll/i6x;)V", "Ll/w3k;", "vertexArray", "Ll/w3k;", "getVertexArray", "()Ll/w3k;", "setVertexArray", "(Ll/w3k;)V", "maskArray", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class MaskRender {

    @NotNull
    private static final String TAG = "AnimPlayer.MaskRender";

    @NotNull
    private final a6x maskAnimPlugin;

    @NotNull
    private w3k maskArray;

    @Nullable
    private i6x maskShader;

    @NotNull
    private w3k vertexArray;

    public MaskRender(@NotNull a6x a6xVar) {
        a6xVar.getClass();
        this.maskAnimPlugin = a6xVar;
        this.vertexArray = new w3k();
        this.maskArray = new w3k();
    }

    @Nullable
    public final i6x getMaskShader() {
        return this.maskShader;
    }

    @NotNull
    public final w3k getVertexArray() {
        return this.vertexArray;
    }

    public final void initMaskShader(boolean edgeBlur) {
        this.maskShader = new i6x(edgeBlur);
        GLES20.glDisable(2929);
    }

    public final void renderFrame(@NotNull jo0 config) {
        q4m render;
        i6x i6xVar;
        c6x maskConfig;
        Bitmap alphaMaskBitmap;
        c6x maskConfig2;
        Pair<mi80, iuc0> pairM108190d;
        mi80 first;
        c6x maskConfig3;
        Pair<mi80, iuc0> pairM108190d2;
        iuc0 second;
        mi80 mi80Var;
        iuc0 iuc0Var;
        Pair<mi80, iuc0> pairM108188b;
        Pair<mi80, iuc0> pairM108188b2;
        config.getClass();
        gid decoder = this.maskAnimPlugin.getPlayer().getDecoder();
        if (decoder == null || (render = decoder.getRender()) == null || render.mo128148a() <= 0 || (i6xVar = this.maskShader) == null || (maskConfig = config.getMaskConfig()) == null) {
            return;
        }
        int maskTexId = maskConfig.getMaskTexId();
        c6x maskConfig4 = config.getMaskConfig();
        if (maskConfig4 == null || (alphaMaskBitmap = maskConfig4.getAlphaMaskBitmap()) == null || (maskConfig2 = config.getMaskConfig()) == null || (pairM108190d = maskConfig2.m108190d()) == null || (first = pairM108190d.getFirst()) == null || (maskConfig3 = config.getMaskConfig()) == null || (pairM108190d2 = maskConfig3.m108190d()) == null || (second = pairM108190d2.getSecond()) == null) {
            return;
        }
        c6x maskConfig5 = config.getMaskConfig();
        if (maskConfig5 == null || (pairM108188b2 = maskConfig5.m108188b()) == null || (mi80Var = pairM108188b2.getFirst()) == null) {
            mi80Var = new mi80(0, 0, config.getWidth(), config.getHeight());
        }
        c6x maskConfig6 = config.getMaskConfig();
        if (maskConfig6 == null || (pairM108188b = maskConfig6.m108188b()) == null || (iuc0Var = pairM108188b.getSecond()) == null) {
            iuc0Var = new iuc0(config.getWidth(), config.getHeight());
        }
        i6xVar.m138885d();
        this.vertexArray.m204769b(u9l0.INSTANCE.m195103a(iuc0Var.getW(), iuc0Var.getH(), mi80Var, this.vertexArray.getArray()));
        this.vertexArray.m204770c(i6xVar.getAPositionLocation());
        if (maskTexId <= 0 && !alphaMaskBitmap.isRecycled()) {
            c6x maskConfig7 = config.getMaskConfig();
            maskTexId = maskConfig7 != null ? maskConfig7.m108193g() : 0;
        }
        if (maskTexId > 0) {
            this.maskArray.m204769b(vqi0.INSTANCE.m202383a(second.getW(), second.getH(), first, this.maskArray.getArray()));
            this.maskArray.m204770c(i6xVar.getATextureMaskCoordinatesLocation());
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, maskTexId);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glUniform1i(i6xVar.getUTextureMaskUnitLocation(), 0);
            GLES20.glEnable(3042);
            GLES20.glBlendFuncSeparate(1, 770, 0, 770);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisable(3042);
        }
    }

    public final void setMaskShader(@Nullable i6x i6xVar) {
        this.maskShader = i6xVar;
    }

    public final void setVertexArray(@NotNull w3k w3kVar) {
        w3kVar.getClass();
        this.vertexArray = w3kVar;
    }
}
