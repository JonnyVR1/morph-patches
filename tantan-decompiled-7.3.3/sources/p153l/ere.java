package p153l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceCDN;
import com.p051p1.mobile.putong.live.base.data.BLiveResourceInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.Priority;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class ere implements qsl {

    /* JADX INFO: renamed from: a */
    public final Map<String, BLiveEffect> f95466a;

    /* JADX INFO: renamed from: b */
    public final List<String> f95467b;

    /* JADX INFO: renamed from: c */
    public final uqe f95468c;

    /* JADX INFO: renamed from: l.ere$a */
    public static class C16809a {

        /* JADX INFO: renamed from: a */
        public static ere f95469a = new ere();
    }

    public ere() {
        this.f95466a = new ConcurrentHashMap();
        this.f95467b = new ArrayList();
        this.f95468c = new uqe();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Pair m122143b(HashMap map) {
        File file = new File(zpe.m220835b(), "effect");
        if (file.exists()) {
            return Pair.create(map, file.listFiles());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ HashMap m122144c(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveEffect bLiveEffect = (BLiveEffect) it.next();
            map.put(bLiveEffect.f45207id, bLiveEffect);
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static ere m122146i() {
        return C16809a.f95469a;
    }

    @Override // p153l.qsl
    /* JADX INFO: renamed from: a */
    public void mo122147a(@NotNull Pair<BLiveResourceInfo, xxj> pair, String str) {
        this.f95468c.mo122147a(pair, str);
    }

    /* JADX INFO: renamed from: e */
    public void m122148e(@NonNull String str) {
        if (TextUtils.isEmpty(str) || this.f95467b.contains(str)) {
            return;
        }
        this.f95467b.add(str);
    }

    /* JADX INFO: renamed from: f */
    public void m122149f() {
        this.f95467b.clear();
    }

    /* JADX INFO: renamed from: g */
    public void m122150g(BLiveResourceInfo bLiveResourceInfo) {
        muj.m160219u("清理资源");
        if (jyb.m147479J(bLiveResourceInfo.liveResources)) {
            muj.m160219u("清理资源列表为空");
        } else {
            C22421c.just(bLiveResourceInfo.liveResources).compose(psd0.m173606Q()).map(new qcj() { // from class: l.are
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ere.m122144c((List) obj);
                }
            }).map(new qcj() { // from class: l.bre
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ere.m122143b((HashMap) obj);
                }
            }).filter(new qcj() { // from class: l.cre
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((Pair) obj));
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.dre
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90382a.m122153k((Pair) obj);
                }
            }));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public BLiveEffect m122151h(String str) {
        return this.f95466a.get(str);
    }

    @MainThread
    /* JADX INFO: renamed from: j */
    public boolean m122152j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f95467b.contains(str);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m122153k(Pair pair) {
        File[] fileArrListFiles;
        HashMap map = (HashMap) pair.first;
        for (File file : (File[]) pair.second) {
            if (map.containsKey(file.getName())) {
                BLiveEffect bLiveEffect = (BLiveEffect) map.get(file.getName());
                if (bLiveEffect != null) {
                    File fileM220835b = zpe.m220835b();
                    StringBuilder sb = new StringBuilder("effect");
                    String str = File.separator;
                    sb.append(str);
                    sb.append(bLiveEffect.f45207id);
                    sb.append(str);
                    sb.append(bLiveEffect.hdType);
                    File file2 = new File(fileM220835b, sb.toString());
                    if (file2.exists() && (fileArrListFiles = file2.listFiles()) != null) {
                        for (File file3 : fileArrListFiles) {
                            if (!w2t.m204590e(bLiveEffect.zip).equals(file3.getName())) {
                                this.f95467b.remove(bLiveEffect.f45207id);
                                muj.m160219u("清理无效md5资源 : " + xgt.m210939c(file3) + file3.getAbsolutePath());
                            }
                        }
                    }
                }
            } else {
                this.f95467b.remove(file.getName());
                muj.m160219u("清理无效effect资源 : " + xgt.m210939c(file) + file.getAbsolutePath());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m122154l(@NotNull BLiveEffect bLiveEffect) {
        m122156n(bLiveEffect, null, null, null);
    }

    /* JADX INFO: renamed from: m */
    public void m122155m(@NotNull BLiveEffect bLiveEffect, Priority priority) {
        m122156n(bLiveEffect, priority, null, null);
    }

    /* JADX INFO: renamed from: n */
    public void m122156n(BLiveEffect bLiveEffect, @Nullable Priority priority, @Nullable e4d0 e4d0Var, @Nullable w8e w8eVar) {
        if (bLiveEffect == null || TextUtils.isEmpty(bLiveEffect.f45207id)) {
            return;
        }
        this.f95466a.put(bLiveEffect.f45207id, bLiveEffect);
        if (bLiveEffect.isDownloadNow()) {
            if (TextUtils.isEmpty(bLiveEffect.type)) {
                muj.m160219u("EffectManager loadEffect effect type empty id; " + bLiveEffect.f45207id);
                return;
            }
            if (priority == null) {
                priority = bLiveEffect.priority;
            }
            wqe.m207509d(bLiveEffect.type).m152742a().m204911f(bLiveEffect.f45207id, bLiveEffect.hdType, bLiveEffect.zip, bLiveEffect.md5, priority, w8eVar, e4d0Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m122157o(@NotNull List<BLiveEffect> list) {
        list.size();
        BLiveEffect bLiveEffectNew_ = BLiveEffect.new_();
        bLiveEffectNew_.f45207id = "1000001";
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
            m122154l(bLiveEffect);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m122158p(Pair<BLiveResourceInfo, BLiveResourceCDN> pair) {
        this.f95468c.m197322d(pair);
    }

    /* JADX INFO: renamed from: q */
    public void m122159q(boolean z) {
        this.f95468c.m197323e(z);
    }

    /* JADX INFO: renamed from: r */
    public void m122160r() {
        this.f95468c.m197324f();
    }

    /* JADX INFO: renamed from: s */
    public void m122161s(@NotNull Pair<BLiveResourceInfo, xxj> pair) {
        this.f95468c.m197325g(pair);
    }

    /* JADX INFO: renamed from: t */
    public void m122162t(boolean z) {
        this.f95468c.m197326h(z);
    }

    /* JADX INFO: renamed from: u */
    public void m122163u() {
        this.f95468c.m197327i();
    }

    /* JADX INFO: renamed from: v */
    public void m122164v(@NotNull Pair<BLiveResourceInfo, xxj> pair) {
        this.f95468c.m197328j(pair);
    }

    /* JADX INFO: renamed from: w */
    public void m122165w(String str) {
        m122166x(str, null, null);
    }

    /* JADX INFO: renamed from: x */
    public void m122166x(String str, e4d0 e4d0Var, w8e w8eVar) {
        aiv.m98081a1(str, e4d0Var, w8eVar);
    }

    /* JADX INFO: renamed from: y */
    public void m122167y() {
        aiv.m98084b1("", "", BLiveType.get("app"));
    }

    /* JADX INFO: renamed from: z */
    public void m122168z(String str, String str2, BLiveType bLiveType) {
        aiv.m98084b1(str, str2, bLiveType);
    }
}
