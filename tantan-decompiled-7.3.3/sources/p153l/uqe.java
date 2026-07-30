package p153l;

import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\nJ#\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\nJ+\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m88121d2 = {"Ll/uqe;", "Ll/qsl;", "<init>", "()V", "Landroid/util/Pair;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceInfo;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "pair", "", Constants.INAPP_DATA_TAG, "(Landroid/util/Pair;)V", "f", RXScreenCaptureService.KEY_INDEX, "", "hidden", "e", "(Z)V", "h", "Ll/xxj;", "g", "j", "", "roomType", "a", "(Landroid/util/Pair;Ljava/lang/String;)V", "Ll/aqe;", "Lkotlin/Lazy;", "c", "()Ll/aqe;", "currentDownloadPlan", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class uqe implements qsl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy currentDownloadPlan = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.tqe
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return uqe.m197320b();
        }
    });

    /* JADX INFO: renamed from: b */
    public static sqe m197320b() {
        return new sqe();
    }

    @Override // p153l.qsl
    /* JADX INFO: renamed from: a */
    public void mo122147a(@NotNull Pair<BLiveResourceInfo, xxj> pair, @NotNull String roomType) {
        pair.getClass();
        roomType.getClass();
        m197321c().mo122147a(pair, roomType);
    }

    /* JADX INFO: renamed from: c */
    public final aqe m197321c() {
        return (aqe) this.currentDownloadPlan.getValue();
    }

    /* JADX INFO: renamed from: d */
    public void m197322d(@NotNull Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        pair.getClass();
        m197321c().m99460d(pair);
    }

    /* JADX INFO: renamed from: e */
    public void m197323e(boolean hidden) {
        m197321c().m99461e(hidden);
    }

    /* JADX INFO: renamed from: f */
    public void m197324f() {
        m197321c().mo99462f();
    }

    /* JADX INFO: renamed from: g */
    public void m197325g(@NotNull Pair<BLiveResourceInfo, xxj> pair) {
        pair.getClass();
        m197321c().mo99463g(pair);
    }

    /* JADX INFO: renamed from: h */
    public void m197326h(boolean hidden) {
        m197321c().m99464h(hidden);
    }

    /* JADX INFO: renamed from: i */
    public void m197327i() {
        m197321c().mo99465i();
    }

    /* JADX INFO: renamed from: j */
    public void m197328j(@NotNull Pair<BLiveResourceInfo, xxj> pair) {
        pair.getClass();
        m197321c().mo99466j(pair);
    }
}
