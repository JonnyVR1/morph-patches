package p149l;

import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J#\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\nJ#\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\nR,\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, m87232d2 = {"Ll/woe;", "Ll/eql;", "<init>", "()V", "Landroid/util/Pair;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceInfo;", "Lcom/p1/mobile/putong/live/base/data/BLiveResourceCDN;", "pair", "", Constants.INAPP_DATA_TAG, "(Landroid/util/Pair;)V", "", "hidden", "e", "(Z)V", "h", "f", RXScreenCaptureService.KEY_INDEX, "Ll/hvj;", "g", "j", "Lrx/subjects/a;", "a", "Lrx/subjects/a;", "c", "()Lrx/subjects/a;", "resourceInfoObs", "", "b", "downloadTypeObs", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class woe implements eql {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C22392a<Pair<BLiveResourceInfo, BLiveResourceCDN>> resourceInfoObs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C22392a<Integer> downloadTypeObs;

    public woe() {
        C22392a<Pair<BLiveResourceInfo, BLiveResourceCDN>> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.resourceInfoObs = c22392aM221512b;
        C22392a<Integer> c22392aM221512b2 = C22392a.m221512b();
        c22392aM221512b2.getClass();
        this.downloadTypeObs = c22392aM221512b2;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C22392a<Integer> m204803b() {
        return this.downloadTypeObs;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C22392a<Pair<BLiveResourceInfo, BLiveResourceCDN>> m204804c() {
        return this.resourceInfoObs;
    }

    /* JADX INFO: renamed from: d */
    public void m204805d(@NotNull Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        pair.getClass();
        this.resourceInfoObs.onNext(pair);
        this.downloadTypeObs.onNext(1);
    }

    /* JADX INFO: renamed from: e */
    public void m204806e(boolean hidden) {
        this.downloadTypeObs.onNext(Integer.valueOf(hidden ? 1 : 2));
    }

    /* JADX INFO: renamed from: g */
    public void mo165353g(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
    }

    /* JADX INFO: renamed from: h */
    public void m204807h(boolean hidden) {
        this.downloadTypeObs.onNext(Integer.valueOf(hidden ? 1 : 3));
    }

    /* JADX INFO: renamed from: j */
    public void mo165355j(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        pair.getClass();
    }

    /* JADX INFO: renamed from: f */
    public void mo165352f() {
    }

    /* JADX INFO: renamed from: i */
    public void mo165354i() {
    }
}
