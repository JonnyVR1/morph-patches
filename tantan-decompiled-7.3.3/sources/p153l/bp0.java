package p153l;

import android.view.MotionEvent;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.live.base.vap.mix.C12631a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)¨\u0006-"}, m88121d2 = {"Ll/bp0;", "", "Ll/ap0;", GameIdentity.player, "<init>", "(Ll/ap0;)V", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "a", "()Lcom/p1/mobile/putong/live/base/vap/mix/a;", "Ll/jo0;", Constants.KEY_CONFIG, "", "b", "(Ll/jo0;)I", "", "h", "()V", "decodeIndex", "c", "(I)V", "f", RXScreenCaptureService.KEY_INDEX, "g", Constants.INAPP_DATA_TAG, "Landroid/view/MotionEvent;", "ev", "", "e", "(Landroid/view/MotionEvent;)Z", "Ll/ap0;", "getPlayer", "()Ll/ap0;", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "mixAnimPlugin", "Ll/a6x;", "Ll/a6x;", "maskAnimPlugin", "", "Ll/wol;", "Ljava/util/List;", "plugins", "I", "frameIndex", "frameDiffTimes", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class bp0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ap0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12631a mixAnimPlugin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final a6x maskAnimPlugin;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<wol> plugins;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int frameIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int decodeIndex;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int frameDiffTimes;

    public bp0(@NotNull ap0 ap0Var) {
        ap0Var.getClass();
        this.player = ap0Var;
        C12631a c12631a = new C12631a(ap0Var);
        this.mixAnimPlugin = c12631a;
        a6x a6xVar = new a6x(ap0Var);
        this.maskAnimPlugin = a6xVar;
        this.plugins = CollectionsKt.listOf((Object[]) new wol[]{c12631a, a6xVar});
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C12631a getMixAnimPlugin() {
        return this.mixAnimPlugin;
    }

    /* JADX INFO: renamed from: b */
    public final int m105759b(@NotNull jo0 config) {
        config.getClass();
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimPluginManager", "onConfigCreate");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            int iMo69865e = ((wol) it.next()).mo69865e(config);
            if (iMo69865e != 0) {
                return iMo69865e;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m105760c(int decodeIndex) {
        C21726z0.INSTANCE.m218092a("AnimPlayer.AnimPluginManager", "onDecoding decodeIndex=" + decodeIndex);
        this.decodeIndex = decodeIndex;
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((wol) it.next()).mo69863c(decodeIndex);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m105761d() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimPluginManager", "onDestroy");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((wol) it.next()).onDestroy();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m105762e(@NotNull MotionEvent ev) {
        ev.getClass();
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            if (((wol) it.next()).mo69862b(ev)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m105763f() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimPluginManager", "onLoopStart");
        this.frameIndex = 0;
        this.decodeIndex = 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m105764g() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimPluginManager", "onRelease");
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((wol) it.next()).mo69861a();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m105765h() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimPluginManager", "onRenderCreate");
        this.frameIndex = 0;
        this.decodeIndex = 0;
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((wol) it.next()).mo69866f();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m105766i() {
        int i = this.decodeIndex;
        int i2 = this.frameIndex;
        if (i > i2 + 1 || this.frameDiffTimes >= 4) {
            C21726z0.INSTANCE.m218095d("AnimPlayer.AnimPluginManager", "jump frameIndex= " + i2 + ",decodeIndex=" + i + ",frameDiffTimes=" + this.frameDiffTimes);
            this.frameIndex = this.decodeIndex;
        }
        int i3 = this.decodeIndex;
        int i4 = this.frameIndex;
        if (i3 != i4) {
            this.frameDiffTimes++;
        } else {
            this.frameDiffTimes = 0;
        }
        C21726z0.INSTANCE.m218092a("AnimPlayer.AnimPluginManager", "onRendering frameIndex=" + i4);
        Iterator<T> it = this.plugins.iterator();
        while (it.hasNext()) {
            ((wol) it.next()).mo69864d(this.frameIndex);
        }
        this.frameIndex++;
    }
}
