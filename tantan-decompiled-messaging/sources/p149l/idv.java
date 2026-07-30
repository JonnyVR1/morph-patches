package p149l;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class idv {

    /* JADX INFO: renamed from: c */
    public BLiveVideoQuality f112691c;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, BLiveAddStickerResult> f112689a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public C22392a<BLiveMonetizationConfig> f112690b = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public ceu f112692d = new ceu();

    /* JADX INFO: renamed from: e */
    public C22393b<User> f112693e = C22393b.m221521b();

    @MainThread
    /* JADX INFO: renamed from: a */
    public void m135629a(User user) {
        this.f112692d.m106349a(user, "scene_inner_live_room");
    }

    /* JADX INFO: renamed from: b */
    public void m135630b() {
        this.f112692d.m106350b();
    }

    /* JADX INFO: renamed from: c */
    public void m135631c() {
        this.f112689a.clear();
    }

    /* JADX INFO: renamed from: d */
    public C22306c<BLiveMonetizationConfig> m135632d() {
        if (this.f112690b.m221515e() == null) {
            if (vdt.m198092b(2)) {
                LivingNormalApiProvider.m71457f7();
            } else {
                IntlLivingNormalApiProvider.requestBubble();
            }
        }
        return this.f112690b.asObservable();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public BLiveMonetizationConfig m135633e() {
        return this.f112690b.m221515e();
    }

    /* JADX INFO: renamed from: f */
    public boolean m135634f() {
        BLiveVideoQuality bLiveVideoQualityM135638j = m135638j();
        if (bLiveVideoQualityM135638j == null) {
            return false;
        }
        return bLiveVideoQualityM135638j.downGrade;
    }

    /* JADX INFO: renamed from: g */
    public C22306c<User> m135635g() {
        return this.f112693e.asObservable();
    }

    /* JADX INFO: renamed from: h */
    public BLiveAddStickerResult m135636h(String str) {
        return this.f112689a.get(str);
    }

    /* JADX INFO: renamed from: i */
    public User m135637i(String str) {
        return this.f112692d.m106351c(str);
    }

    /* JADX INFO: renamed from: j */
    public BLiveVideoQuality m135638j() {
        return this.f112691c;
    }

    /* JADX INFO: renamed from: k */
    public void m135639k(String str, BLiveAddStickerResult bLiveAddStickerResult) {
        this.f112689a.put(str, bLiveAddStickerResult);
    }

    @MainThread
    /* JADX INFO: renamed from: l */
    public void m135640l(List<User> list) {
        this.f112692d.m106352d(list, "scene_inner_live_room");
    }

    /* JADX INFO: renamed from: m */
    public void m135641m(User user, boolean z) {
        this.f112692d.m106353e(user);
        if (z) {
            this.f112693e.onNext(user);
        }
    }
}
