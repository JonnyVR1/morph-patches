package p002l;

import android.util.Pair;
import com.p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p1.mobile.putong.live.base.data.BLiveResourceInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\nJ#\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\nJ+\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ll/qpe;", "Ll/eql;", "<init>", "()V", "Landroid/util/Pair;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceInfo;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "pair", "", "d", "(Landroid/util/Pair;)V", "f", "i", "", "hidden", "e", "(Z)V", "h", "Ll/hvj;", "g", "j", "", "roomType", "a", "(Landroid/util/Pair;Ljava/lang/String;)V", "Ll/woe;", "Lkotlin/Lazy;", "c", "()Ll/woe;", "currentDownloadPlan", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qpe implements eql {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy currentDownloadPlan = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.ppe
        public final Object invoke() {
            return qpe.m21494b();
        }
    });

    /* JADX INFO: renamed from: b */
    public static ope m21494b() {
        return new ope();
    }

    @Override // p002l.eql
    /* JADX INFO: renamed from: a */
    public void mo10040a(@NotNull Pair<BLiveResourceInfo, hvj> pair, @NotNull String roomType) {
        pair.getClass();
        roomType.getClass();
        m21495c().mo10040a(pair, roomType);
    }

    /* JADX INFO: renamed from: c */
    public final woe m21495c() {
        return (woe) this.currentDownloadPlan.getValue();
    }

    /* JADX INFO: renamed from: d */
    public void m21496d(@NotNull Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        pair.getClass();
        m21495c().m25269d(pair);
    }

    /* JADX INFO: renamed from: e */
    public void m21497e(boolean hidden) {
        m21495c().m25270e(hidden);
    }

    /* JADX INFO: renamed from: f */
    public void m21498f() {
        m21495c().mo19669f();
    }

    /* JADX INFO: renamed from: g */
    public void m21499g(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
        m21495c().mo19670g(pair);
    }

    /* JADX INFO: renamed from: h */
    public void m21500h(boolean hidden) {
        m21495c().m25271h(hidden);
    }

    /* JADX INFO: renamed from: i */
    public void m21501i() {
        m21495c().mo19671i();
    }

    /* JADX INFO: renamed from: j */
    public void m21502j(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
        m21495c().mo19672j(pair);
    }
}
