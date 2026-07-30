package p149l;

import android.view.MotionEvent;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.live.base.vap.mix.C12468a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)¨\u0006-"}, m87232d2 = {"Ll/fp0;", "", "Ll/ep0;", GameIdentity.player, "<init>", "(Ll/ep0;)V", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "a", "()Lcom/p1/mobile/putong/live/base/vap/mix/a;", "Ll/no0;", Constants.KEY_CONFIG, "", "b", "(Ll/no0;)I", "", "h", "()V", "decodeIndex", "c", "(I)V", "f", RXScreenCaptureService.KEY_INDEX, "g", Constants.INAPP_DATA_TAG, "Landroid/view/MotionEvent;", "ev", "", "e", "(Landroid/view/MotionEvent;)Z", "Ll/ep0;", "getPlayer", "()Ll/ep0;", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "mixAnimPlugin", "Ll/b3x;", "Ll/b3x;", "maskAnimPlugin", "", "Ll/kml;", "Ljava/util/List;", "plugins", "I", "frameIndex", "frameDiffTimes", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class fp0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ep0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12468a mixAnimPlugin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final b3x maskAnimPlugin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<kml> plugins;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int frameIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int decodeIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int frameDiffTimes;

    public fp0(@NotNull ep0 ep0Var) {
        ep0Var.getClass();
        this.player = ep0Var;
        C12468a c12468a = new C12468a(ep0Var);
        this.mixAnimPlugin = c12468a;
        b3x b3xVar = new b3x(ep0Var);
        this.maskAnimPlugin = b3xVar;
        this.plugins = CollectionsKt.listOf((Object[]) new kml[]{c12468a, b3xVar});
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C12468a getMixAnimPlugin() {
        return this.mixAnimPlugin;
    }

    /* JADX INFO: renamed from: b */
    public final int m122546b(@NotNull no0 config) {
        config.getClass();
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimPluginManager", "onConfigCreate");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            int iMo68682e = ((kml) it.next()).mo68682e(config);
            if (iMo68682e != 0) {
                return iMo68682e;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m122547c(int decodeIndex) {
        C21588z0.INSTANCE.m216706a("AnimPlayer.AnimPluginManager", "onDecoding decodeIndex=" + decodeIndex);
        this.decodeIndex = decodeIndex;
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((kml) it.next()).mo68680c(decodeIndex);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m122548d() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimPluginManager", "onDestroy");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((kml) it.next()).onDestroy();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m122549e(@NotNull MotionEvent ev) {
        ev.getClass();
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            if (((kml) it.next()).mo68679b(ev)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m122550f() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimPluginManager", "onLoopStart");
        this.frameIndex = 0;
        this.decodeIndex = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m122551g() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimPluginManager", "onRelease");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((kml) it.next()).mo68678a();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m122552h() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimPluginManager", "onRenderCreate");
        this.frameIndex = 0;
        this.decodeIndex = 0;
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((kml) it.next()).mo68683f();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m122553i() {
        int i = this.decodeIndex;
        int i2 = this.frameIndex;
        if (i > i2 + 1 || this.frameDiffTimes >= 4) {
            C21588z0.INSTANCE.m216709d("AnimPlayer.AnimPluginManager", "jump frameIndex= " + i2 + ",decodeIndex=" + i + ",frameDiffTimes=" + this.frameDiffTimes);
            this.frameIndex = this.decodeIndex;
        }
        int i3 = this.decodeIndex;
        int i4 = this.frameIndex;
        if (i3 != i4) {
            this.frameDiffTimes++;
        } else {
            this.frameDiffTimes = 0;
        }
        C21588z0.INSTANCE.m216706a("AnimPlayer.AnimPluginManager", "onRendering frameIndex=" + i4);
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((kml) it.next()).mo68681d(this.frameIndex);
        }
        this.frameIndex++;
    }
}
