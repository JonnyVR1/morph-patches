package p153l;

import android.view.MotionEvent;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.tencent.qgame.animplayer.mask.MaskRender;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m88121d2 = {"Ll/a6x;", "Ll/wol;", "Ll/ap0;", GameIdentity.player, "<init>", "(Ll/ap0;)V", "Ll/jo0;", Constants.KEY_CONFIG, "", "e", "(Ll/jo0;)I", "", "f", "()V", "frameIndex", Constants.INAPP_DATA_TAG, "(I)V", "a", "onDestroy", "g", "Ll/ap0;", "h", "()Ll/ap0;", "Lcom/tencent/qgame/animplayer/mask/MaskRender;", "b", "Lcom/tencent/qgame/animplayer/mask/MaskRender;", "maskRender", "c", "Ll/jo0;", "animConfig", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class a6x implements wol {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ap0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public MaskRender maskRender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public jo0 animConfig;

    public a6x(@NotNull ap0 ap0Var) {
        ap0Var.getClass();
        this.player = ap0Var;
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: a */
    public void mo69861a() {
        m96345g();
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: b */
    public /* bridge */ boolean mo69862b(@NotNull MotionEvent motionEvent) {
        return super.mo69862b(motionEvent);
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: c */
    public /* bridge */ void mo69863c(int i) {
        super.mo69863c(i);
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: d */
    public void mo69864d(int frameIndex) {
        MaskRender maskRender;
        if (!this.player.getSupportMaskBoolean() || this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String() == null) {
            return;
        }
        jo0 jo0VarM150557b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        this.animConfig = jo0VarM150557b;
        if (jo0VarM150557b == null || (maskRender = this.maskRender) == null) {
            return;
        }
        maskRender.renderFrame(jo0VarM150557b);
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: e */
    public int mo69865e(@NotNull jo0 config) {
        config.getClass();
        return 0;
    }

    @Override // p153l.wol
    /* JADX INFO: renamed from: f */
    public void mo69866f() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.MaskAnimPlugin", "mask render init");
        if (this.player.getSupportMaskBoolean()) {
            MaskRender maskRender = new MaskRender(this);
            this.maskRender = maskRender;
            maskRender.initMaskShader(this.player.getMaskEdgeBlurBoolean());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m96345g() {
        c6x maskConfig;
        jo0 jo0Var = this.animConfig;
        if (jo0Var == null || (maskConfig = jo0Var.getMaskConfig()) == null) {
            return;
        }
        maskConfig.m108191e();
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ap0 getPlayer() {
        return this.player;
    }

    @Override // p153l.wol
    public void onDestroy() {
        m96345g();
    }
}
