package p149l;

import android.view.MotionEvent;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.tencent.qgame.animplayer.mask.MaskRender;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m87232d2 = {"Ll/b3x;", "Ll/kml;", "Ll/ep0;", GameIdentity.player, "<init>", "(Ll/ep0;)V", "Ll/no0;", Constants.KEY_CONFIG, "", "e", "(Ll/no0;)I", "", "f", "()V", "frameIndex", Constants.INAPP_DATA_TAG, "(I)V", "a", "onDestroy", "g", "Ll/ep0;", "h", "()Ll/ep0;", "Lcom/tencent/qgame/animplayer/mask/MaskRender;", "b", "Lcom/tencent/qgame/animplayer/mask/MaskRender;", "maskRender", "c", "Ll/no0;", "animConfig", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class b3x implements kml {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ep0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public MaskRender maskRender;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public no0 animConfig;

    public b3x(@NotNull ep0 ep0Var) {
        ep0Var.getClass();
        this.player = ep0Var;
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: a */
    public void mo68678a() {
        m100115g();
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: b */
    public /* bridge */ boolean mo68679b(@NotNull MotionEvent motionEvent) {
        return super.mo68679b(motionEvent);
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: c */
    public /* bridge */ void mo68680c(int i) {
        super.mo68680c(i);
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: d */
    public void mo68681d(int frameIndex) {
        MaskRender maskRender;
        if (!this.player.getSupportMaskBoolean() || this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String() == null) {
            return;
        }
        no0 no0VarM165246b = this.player.getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        this.animConfig = no0VarM165246b;
        if (no0VarM165246b == null || (maskRender = this.maskRender) == null) {
            return;
        }
        maskRender.renderFrame(no0VarM165246b);
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: e */
    public int mo68682e(@NotNull no0 config) {
        config.getClass();
        return 0;
    }

    @Override // p149l.kml
    /* JADX INFO: renamed from: f */
    public void mo68683f() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.MaskAnimPlugin", "mask render init");
        if (this.player.getSupportMaskBoolean()) {
            MaskRender maskRender = new MaskRender(this);
            this.maskRender = maskRender;
            maskRender.initMaskShader(this.player.getMaskEdgeBlurBoolean());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m100115g() {
        d3x maskConfig;
        no0 no0Var = this.animConfig;
        if (no0Var == null || (maskConfig = no0Var.getMaskConfig()) == null) {
            return;
        }
        maskConfig.m109964e();
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ep0 getPlayer() {
        return this.player;
    }

    @Override // p149l.kml
    public void onDestroy() {
        m100115g();
    }
}
