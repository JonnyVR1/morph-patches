package p009l;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l.ceu;
import l.vdt;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class idv {

    /* JADX INFO: renamed from: c */
    public BLiveVideoQuality f14587c;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, BLiveAddStickerResult> f14585a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public a<BLiveMonetizationConfig> f14586b = a.b();

    /* JADX INFO: renamed from: d */
    public ceu f14588d = new ceu();

    /* JADX INFO: renamed from: e */
    public b<User> f14589e = b.b();

    @MainThread
    /* JADX INFO: renamed from: a */
    public void m16491a(User user) {
        this.f14588d.a(user, "scene_inner_live_room");
    }

    /* JADX INFO: renamed from: b */
    public void m16492b() {
        this.f14588d.b();
    }

    /* JADX INFO: renamed from: c */
    public void m16493c() {
        this.f14585a.clear();
    }

    /* JADX INFO: renamed from: d */
    public c<BLiveMonetizationConfig> m16494d() {
        if (this.f14586b.e() == null) {
            if (vdt.b(2)) {
                LivingNormalApiProvider.f7();
            } else {
                IntlLivingNormalApiProvider.requestBubble();
            }
        }
        return this.f14586b.asObservable();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public BLiveMonetizationConfig m16495e() {
        return (BLiveMonetizationConfig) this.f14586b.e();
    }

    /* JADX INFO: renamed from: f */
    public boolean m16496f() {
        BLiveVideoQuality bLiveVideoQualityM16500j = m16500j();
        if (bLiveVideoQualityM16500j == null) {
            return false;
        }
        return bLiveVideoQualityM16500j.downGrade;
    }

    /* JADX INFO: renamed from: g */
    public c<User> m16497g() {
        return this.f14589e.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public BLiveAddStickerResult m16498h(String str) {
        return this.f14585a.get(str);
    }

    /* JADX INFO: renamed from: i */
    public User m16499i(String str) {
        return this.f14588d.c(str);
    }

    /* JADX INFO: renamed from: j */
    public BLiveVideoQuality m16500j() {
        return this.f14587c;
    }

    /* JADX INFO: renamed from: k */
    public void m16501k(String str, BLiveAddStickerResult bLiveAddStickerResult) {
        this.f14585a.put(str, bLiveAddStickerResult);
    }

    @MainThread
    /* JADX INFO: renamed from: l */
    public void m16502l(List<User> list) {
        this.f14588d.d(list, "scene_inner_live_room");
    }

    /* JADX INFO: renamed from: m */
    public void m16503m(User user, boolean z) {
        this.f14588d.e(user);
        if (z) {
            this.f14589e.onNext(user);
        }
    }
}
