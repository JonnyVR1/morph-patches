package p149l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p046p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.Priority;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class aqe implements eql {

    /* JADX INFO: renamed from: a */
    public final Map<String, BLiveEffect> f71145a;

    /* JADX INFO: renamed from: b */
    public final List<String> f71146b;

    /* JADX INFO: renamed from: c */
    public final qpe f71147c;

    /* JADX INFO: renamed from: l.aqe$a */
    public static class C15692a {

        /* JADX INFO: renamed from: a */
        public static aqe f71148a = new aqe();
    }

    public aqe() {
        this.f71145a = new ConcurrentHashMap();
        this.f71146b = new ArrayList();
        this.f71147c = new qpe();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Pair m98258b(HashMap map) {
        File file = new File(voe.m199164b(), "effect");
        if (file.exists()) {
            return Pair.create(map, file.listFiles());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ HashMap m98259c(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveEffect bLiveEffect = (BLiveEffect) it.next();
            map.put(bLiveEffect.f44359id, bLiveEffect);
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static aqe m98261i() {
        return C15692a.f71148a;
    }

    @Override // p149l.eql
    /* JADX INFO: renamed from: a */
    public void mo98262a(@NotNull Pair<BLiveResourceInfo, hvj> pair, String str) {
        this.f71147c.mo98262a(pair, str);
    }

    /* JADX INFO: renamed from: e */
    public void m98263e(@NonNull String str) {
        if (TextUtils.isEmpty(str) || this.f71146b.contains(str)) {
            return;
        }
        this.f71146b.add(str);
    }

    /* JADX INFO: renamed from: f */
    public void m98264f() {
        this.f71146b.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m98265g(BLiveResourceInfo bLiveResourceInfo) {
        wrj.m205255u("清理资源");
        if (vwb.m200296J(bLiveResourceInfo.liveResources)) {
            wrj.m205255u("清理资源列表为空");
        } else {
            C22306c.just(bLiveResourceInfo.liveResources).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.wpe
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return aqe.m98259c((List) obj);
                }
            }).map(new w9j() { // from class: l.xpe
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return aqe.m98258b((HashMap) obj);
                }
            }).filter(new w9j() { // from class: l.ype
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((Pair) obj));
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.zpe
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204244a.m98268k((Pair) obj);
                }
            }));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public BLiveEffect m98266h(String str) {
        return this.f71145a.get(str);
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public boolean m98267j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f71146b.contains(str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m98268k(Pair pair) {
        File[] fileArrListFiles;
        HashMap map = (HashMap) pair.first;
        for (File file : (File[]) pair.second) {
            if (map.containsKey(file.getName())) {
                BLiveEffect bLiveEffect = (BLiveEffect) map.get(file.getName());
                if (bLiveEffect != null) {
                    File fileM199164b = voe.m199164b();
                    StringBuilder sb = new StringBuilder("effect");
                    String str = File.separator;
                    sb.append(str);
                    sb.append(bLiveEffect.f44359id);
                    sb.append(str);
                    sb.append(bLiveEffect.hdType);
                    File file2 = new File(fileM199164b, sb.toString());
                    if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                        for (File file3 : fileArrListFiles) {
                            if (!v0t.m196511e(bLiveEffect.zip).equals(file3.getName())) {
                                this.f71146b.remove(bLiveEffect.f44359id);
                                wrj.m205255u("清理无效md5资源 : " + wet.m202924c(file3) + file3.getAbsolutePath());
                            }
                        }
                    }
                }
            } else {
                this.f71146b.remove(file.getName());
                wrj.m205255u("清理无效effect资源 : " + wet.m202924c(file) + file.getAbsolutePath());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m98269l(@NotNull BLiveEffect bLiveEffect) {
        m98271n(bLiveEffect, null, null, null);
    }

    /* JADX INFO: renamed from: m */
    public void m98270m(@NotNull BLiveEffect bLiveEffect, Priority priority) {
        m98271n(bLiveEffect, priority, null, null);
    }

    /* JADX INFO: renamed from: n */
    public void m98271n(BLiveEffect bLiveEffect, @Nullable Priority priority, @Nullable bwc0 bwc0Var, @Nullable h7e h7eVar) {
        if (bLiveEffect == null || TextUtils.isEmpty(bLiveEffect.f44359id)) {
            return;
        }
        this.f71145a.put(bLiveEffect.f44359id, bLiveEffect);
        if (bLiveEffect.isDownloadNow()) {
            if (TextUtils.isEmpty(bLiveEffect.type)) {
                wrj.m205255u("EffectManager loadEffect effect type empty id; " + bLiveEffect.f44359id);
                return;
            }
            if (priority == null) {
                priority = bLiveEffect.priority;
            }
            spe.m185365d(bLiveEffect.type).m152980a().m217251f(bLiveEffect.f44359id, bLiveEffect.hdType, bLiveEffect.zip, bLiveEffect.md5, priority, h7eVar, bwc0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m98272o(@NotNull List<BLiveEffect> list) {
        list.size();
        BLiveEffect bLiveEffectNew_ = BLiveEffect.new_();
        bLiveEffectNew_.f44359id = "1000001";
        bLiveEffectNew_.download = 0;
        bLiveEffectNew_.loadTypes.add("appStart");
        bLiveEffectNew_.loadTypes.add("voiceRoom");
        bLiveEffectNew_.downloadType = 1;
        bLiveEffectNew_.hdType = "HD";
        bLiveEffectNew_.type = "game";
        bLiveEffectNew_.priority = Priority.get("IMMEDIATE");
        bLiveEffectNew_.zip = "https://auto.tancdn.com/v1/raw/5e432fe7-ad11-4307-a428-9c046bfeaa4311.zip";
        bLiveEffectNew_.md5 = "9c5fb0eef628b45e249b38ccd0ec79c0";
        list.add(bLiveEffectNew_);
        for (BLiveEffect bLiveEffect : list) {
            int i = bLiveEffect.downloadType;
            m98269l(bLiveEffect);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m98273p(Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        this.f71147c.m175827d(pair);
    }

    /* JADX INFO: renamed from: q */
    public void m98274q(boolean z) {
        this.f71147c.m175828e(z);
    }

    /* JADX INFO: renamed from: r */
    public void m98275r() {
        this.f71147c.m175829f();
    }

    /* JADX INFO: renamed from: s */
    public void m98276s(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        this.f71147c.m175830g(pair);
    }

    /* JADX INFO: renamed from: t */
    public void m98277t(boolean z) {
        this.f71147c.m175831h(z);
    }

    /* JADX INFO: renamed from: u */
    public void m98278u() {
        this.f71147c.m175832i();
    }

    /* JADX INFO: renamed from: v */
    public void m98279v(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        this.f71147c.m175833j(pair);
    }

    /* JADX INFO: renamed from: w */
    public void m98280w(String str) {
        m98281x(str, null, null);
    }

    /* JADX INFO: renamed from: x */
    public void m98281x(String str, bwc0 bwc0Var, h7e h7eVar) {
        zfv.m218547a1(str, bwc0Var, h7eVar);
    }

    /* JADX INFO: renamed from: y */
    public void m98282y() {
        zfv.m218550b1("", "", BLiveType.get("app"));
    }

    /* JADX INFO: renamed from: z */
    public void m98283z(String str, String str2, BLiveType bLiveType) {
        zfv.m218550b1(str, str2, bLiveType);
    }
}
