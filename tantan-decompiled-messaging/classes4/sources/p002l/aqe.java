package p002l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p1.mobile.putong.live.base.data.BLiveType;
import com.p1.mobile.putong.live.base.data.Priority;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l.e30;
import l.ffw;
import l.mkd0;
import l.v0t;
import l.vwb;
import l.w9j;
import l.wet;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class aqe implements eql {

    /* JADX INFO: renamed from: a */
    public final Map<String, BLiveEffect> f7862a;

    /* JADX INFO: renamed from: b */
    public final List<String> f7863b;

    /* JADX INFO: renamed from: c */
    public final qpe f7864c;

    /* JADX INFO: renamed from: l.aqe$a */
    public static class C0495a {

        /* JADX INFO: renamed from: a */
        public static aqe f7865a = new aqe();
    }

    public aqe() {
        this.f7862a = new ConcurrentHashMap();
        this.f7863b = new ArrayList();
        this.f7864c = new qpe();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Pair m10036b(HashMap map) {
        File file = new File(voe.m24084b(), "effect");
        if (file.exists()) {
            return Pair.create(map, file.listFiles());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ HashMap m10037c(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveEffect bLiveEffect = (BLiveEffect) it.next();
            map.put(bLiveEffect.id, bLiveEffect);
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static aqe m10039i() {
        return C0495a.f7865a;
    }

    @Override // p002l.eql
    /* JADX INFO: renamed from: a */
    public void mo10040a(@NotNull Pair<BLiveResourceInfo, hvj> pair, String str) {
        this.f7864c.mo10040a(pair, str);
    }

    /* JADX INFO: renamed from: e */
    public void m10041e(@NonNull String str) {
        if (TextUtils.isEmpty(str) || this.f7863b.contains(str)) {
            return;
        }
        this.f7863b.add(str);
    }

    /* JADX INFO: renamed from: f */
    public void m10042f() {
        this.f7863b.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m10043g(BLiveResourceInfo bLiveResourceInfo) {
        wrj.m25427u("清理资源");
        if (vwb.J(bLiveResourceInfo.liveResources)) {
            wrj.m25427u("清理资源列表为空");
        } else {
            c.just(bLiveResourceInfo.liveResources).compose(mkd0.Q()).map(new w9j() { // from class: l.wpe
                public final Object call(Object obj) {
                    return aqe.m10037c((List) obj);
                }
            }).map(new w9j() { // from class: l.xpe
                public final Object call(Object obj) {
                    return aqe.m10036b((HashMap) obj);
                }
            }).filter(new w9j() { // from class: l.ype
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((Pair) obj));
                }
            }).subscribe(ffw.d(new e30() { // from class: l.zpe
                public final void call(Object obj) {
                    this.f23561a.m10046k((Pair) obj);
                }
            }));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public BLiveEffect m10044h(String str) {
        return this.f7862a.get(str);
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public boolean m10045j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f7863b.contains(str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m10046k(Pair pair) {
        File[] fileArrListFiles;
        HashMap map = (HashMap) pair.first;
        for (File file : (File[]) pair.second) {
            if (map.containsKey(file.getName())) {
                BLiveEffect bLiveEffect = (BLiveEffect) map.get(file.getName());
                if (bLiveEffect != null) {
                    File fileM24084b = voe.m24084b();
                    StringBuilder sb = new StringBuilder("effect");
                    String str = File.separator;
                    sb.append(str);
                    sb.append(bLiveEffect.id);
                    sb.append(str);
                    sb.append(bLiveEffect.hdType);
                    File file2 = new File(fileM24084b, sb.toString());
                    if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                        for (File file3 : fileArrListFiles) {
                            if (!v0t.e(bLiveEffect.zip).equals(file3.getName())) {
                                this.f7863b.remove(bLiveEffect.id);
                                wrj.m25427u("清理无效md5资源 : " + wet.c(file3) + file3.getAbsolutePath());
                            }
                        }
                    }
                }
            } else {
                this.f7863b.remove(file.getName());
                wrj.m25427u("清理无效effect资源 : " + wet.c(file) + file.getAbsolutePath());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m10047l(@NotNull BLiveEffect bLiveEffect) {
        m10049n(bLiveEffect, null, null, null);
    }

    /* JADX INFO: renamed from: m */
    public void m10048m(@NotNull BLiveEffect bLiveEffect, Priority priority) {
        m10049n(bLiveEffect, priority, null, null);
    }

    /* JADX INFO: renamed from: n */
    public void m10049n(BLiveEffect bLiveEffect, @Nullable Priority priority, @Nullable bwc0 bwc0Var, @Nullable h7e h7eVar) {
        if (bLiveEffect == null || TextUtils.isEmpty(bLiveEffect.id)) {
            return;
        }
        this.f7862a.put(bLiveEffect.id, bLiveEffect);
        if (bLiveEffect.isDownloadNow()) {
            if (TextUtils.isEmpty(bLiveEffect.type)) {
                wrj.m25427u("EffectManager loadEffect effect type empty id; " + bLiveEffect.id);
                return;
            }
            if (priority == null) {
                priority = bLiveEffect.priority;
            }
            spe.m22604d(bLiveEffect.type).m17693a().m27083f(bLiveEffect.id, bLiveEffect.hdType, bLiveEffect.zip, bLiveEffect.md5, priority, h7eVar, bwc0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m10050o(@NotNull List<BLiveEffect> list) {
        list.size();
        BLiveEffect bLiveEffectNew_ = BLiveEffect.new_();
        bLiveEffectNew_.id = "1000001";
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
            m10047l(bLiveEffect);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m10051p(Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        this.f7864c.m21496d(pair);
    }

    /* JADX INFO: renamed from: q */
    public void m10052q(boolean z) {
        this.f7864c.m21497e(z);
    }

    /* JADX INFO: renamed from: r */
    public void m10053r() {
        this.f7864c.m21498f();
    }

    /* JADX INFO: renamed from: s */
    public void m10054s(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        this.f7864c.m21499g(pair);
    }

    /* JADX INFO: renamed from: t */
    public void m10055t(boolean z) {
        this.f7864c.m21500h(z);
    }

    /* JADX INFO: renamed from: u */
    public void m10056u() {
        this.f7864c.m21501i();
    }

    /* JADX INFO: renamed from: v */
    public void m10057v(@NotNull Pair<BLiveResourceInfo, hvj> pair) {
        this.f7864c.m21502j(pair);
    }

    /* JADX INFO: renamed from: w */
    public void m10058w(String str) {
        m10059x(str, null, null);
    }

    /* JADX INFO: renamed from: x */
    public void m10059x(String str, bwc0 bwc0Var, h7e h7eVar) {
        zfv.m27250a1(str, bwc0Var, h7eVar);
    }

    /* JADX INFO: renamed from: y */
    public void m10060y() {
        zfv.m27253b1("", "", BLiveType.get("app"));
    }

    /* JADX INFO: renamed from: z */
    public void m10061z(String str, String str2, BLiveType bLiveType) {
        zfv.m27253b1(str, str2, bLiveType);
    }
}
