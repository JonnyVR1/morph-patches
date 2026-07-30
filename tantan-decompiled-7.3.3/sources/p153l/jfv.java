package p153l;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes10.dex */
public class jfv {

    /* JADX INFO: renamed from: c */
    public BLiveVideoQuality f120642c;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, BLiveAddStickerResult> f120640a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public C22507a<BLiveMonetizationConfig> f120641b = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public dgu f120643d = new dgu();

    /* JADX INFO: renamed from: e */
    public C22508b<User> f120644e = C22508b.m222767b();

    @MainThread
    /* JADX INFO: renamed from: a */
    public void m144714a(User user) {
        this.f120643d.m115752a(user, "scene_inner_live_room");
    }

    /* JADX INFO: renamed from: b */
    public void m144715b() {
        this.f120643d.m115753b();
    }

    /* JADX INFO: renamed from: c */
    public void m144716c() {
        this.f120640a.clear();
    }

    /* JADX INFO: renamed from: d */
    public C22421c<BLiveMonetizationConfig> m144717d() {
        if (this.f120641b.m222761e() == null) {
            if (wft.m206159b(2)) {
                LivingNormalApiProvider.m72640f7();
            } else {
                IntlLivingNormalApiProvider.requestBubble();
            }
        }
        return this.f120641b.asObservable();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public BLiveMonetizationConfig m144718e() {
        return this.f120641b.m222761e();
    }

    /* JADX INFO: renamed from: f */
    public boolean m144719f() {
        BLiveVideoQuality bLiveVideoQualityM144723j = m144723j();
        if (bLiveVideoQualityM144723j == null) {
            return false;
        }
        return bLiveVideoQualityM144723j.downGrade;
    }

    /* JADX INFO: renamed from: g */
    public C22421c<User> m144720g() {
        return this.f120644e.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public BLiveAddStickerResult m144721h(String str) {
        return this.f120640a.get(str);
    }

    /* JADX INFO: renamed from: i */
    public User m144722i(String str) {
        return this.f120643d.m115754c(str);
    }

    /* JADX INFO: renamed from: j */
    public BLiveVideoQuality m144723j() {
        return this.f120642c;
    }

    /* JADX INFO: renamed from: k */
    public void m144724k(String str, BLiveAddStickerResult bLiveAddStickerResult) {
        this.f120640a.put(str, bLiveAddStickerResult);
    }

    @MainThread
    /* JADX INFO: renamed from: l */
    public void m144725l(List<User> list) {
        this.f120643d.m115755d(list, "scene_inner_live_room");
    }

    /* JADX INFO: renamed from: m */
    public void m144726m(User user, boolean z) {
        this.f120643d.m115756e(user);
        if (z) {
            this.f120644e.onNext(user);
        }
    }
}
