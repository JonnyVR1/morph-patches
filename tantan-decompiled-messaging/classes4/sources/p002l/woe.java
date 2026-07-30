package p002l;

import android.util.Pair;
import com.p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p1.mobile.putong.live.base.data.BLiveResourceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J#\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\nJ#\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\nR,\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Ll/woe;", "Ll/eql;", "<init>", "()V", "Landroid/util/Pair;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceInfo;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "pair", "", "d", "(Landroid/util/Pair;)V", "", "hidden", "e", "(Z)V", "h", "f", "i", "Ll/hvj;", "g", "j", "Lrx/subjects/a;", "a", "Lrx/subjects/a;", "c", "()Lrx/subjects/a;", "resourceInfoObs", "", "b", "downloadTypeObs", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class woe implements eql {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final a<Pair<BLiveResourceInfo, BLiveResourceCDN>> resourceInfoObs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a<Integer> downloadTypeObs;

    public woe() {
        a<Pair<BLiveResourceInfo, BLiveResourceCDN>> aVarB = a.b();
        aVarB.getClass();
        this.resourceInfoObs = aVarB;
        a<Integer> aVarB2 = a.b();
        aVarB2.getClass();
        this.downloadTypeObs = aVarB2;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final a<Integer> m25267b() {
        return this.downloadTypeObs;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final a<Pair<BLiveResourceInfo, BLiveResourceCDN>> m25268c() {
        return this.resourceInfoObs;
    }

    /* JADX INFO: renamed from: d */
    public void m25269d(@NotNull Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        pair.getClass();
        this.resourceInfoObs.onNext(pair);
        this.downloadTypeObs.onNext(1);
    }

    /* JADX INFO: renamed from: e */
    public void m25270e(boolean hidden) {
        this.downloadTypeObs.onNext(Integer.valueOf(hidden ? 1 : 2));
    }

    /* JADX INFO: renamed from: g */
    public void mo19670g(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
    }

    /* JADX INFO: renamed from: h */
    public void m25271h(boolean hidden) {
        this.downloadTypeObs.onNext(Integer.valueOf(hidden ? 1 : 3));
    }

    /* JADX INFO: renamed from: j */
    public void mo19672j(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
    }

    /* JADX INFO: renamed from: f */
    public void mo19669f() {
    }

    /* JADX INFO: renamed from: i */
    public void mo19671i() {
    }
}
