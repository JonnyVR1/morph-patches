package p153l;

import com.facebook.AuthenticationTokenClaims;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.base.utils.SudStopwatch;
import tech.sud.base.utils.Utils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class iug0 implements iog0 {

    /* JADX INFO: renamed from: a */
    public ukg0 f116930a;

    /* JADX INFO: renamed from: b */
    public ArrayList f116931b;

    /* JADX INFO: renamed from: c */
    public long f116932c;

    /* JADX INFO: renamed from: d */
    public ffg0 f116933d;

    /* JADX INFO: renamed from: e */
    public final dhg0 f116934e;

    /* JADX INFO: renamed from: f */
    public boolean f116935f;

    /* JADX INFO: renamed from: g */
    public boolean f116936g;

    /* JADX INFO: renamed from: h */
    public boolean f116937h;

    /* JADX INFO: renamed from: i */
    public boolean f116938i;

    /* JADX INFO: renamed from: j */
    public final SudStopwatch f116939j = new SudStopwatch();

    /* JADX INFO: renamed from: k */
    public final SudStopwatch f116940k = new SudStopwatch();

    /* JADX INFO: renamed from: l */
    public final SudStopwatch f116941l = new SudStopwatch();

    /* JADX INFO: renamed from: m */
    public final ArrayList f116942m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public int f116943n;

    /* JADX INFO: renamed from: o */
    public boolean f116944o;

    /* JADX INFO: renamed from: p */
    public long f116945p;

    /* JADX INFO: renamed from: q */
    public boolean f116946q;

    /* JADX INFO: renamed from: r */
    public boolean f116947r;

    /* JADX INFO: renamed from: s */
    public Object f116948s;

    public iug0(dhg0 dhg0Var) {
        this.f116934e = dhg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m142189a() {
        ffg0 ffg0Var = this.f116933d;
        if (ffg0Var != null) {
            synchronized (ffg0Var) {
                if (ffg0Var.f98769e) {
                    ffg0Var.f98769e = false;
                    ffg0Var.f98768d.removeCallbacks(ffg0Var.f98771g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m142190b(int i) {
        gvg0 gvg0Var;
        rng0 rng0Var;
        ukg0 ukg0Var = this.f116930a;
        if (ukg0Var == null) {
            return;
        }
        i0h0 i0h0Var = utg0.f180950e;
        int i2 = 1;
        if ((i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null || (rng0Var = gvg0Var.f106641l) == null) ? true : rng0Var.f164039a) {
            pug0 pug0Var = new pug0();
            pug0Var.f154185a = utg0.f180952g;
            pug0Var.f154186b = this.f116945p;
            pug0Var.f154187c = ukg0Var.f179394c;
            pug0Var.f154188d = this.f116944o;
            tug0.f176192a.execute(new hsg0(pug0Var));
        }
        this.f116930a.f179406o = Long.valueOf(this.f116939j.getElapsedTimeInMillis());
        this.f116930a.f179407p = Integer.valueOf(this.f116943n);
        this.f116930a.f179408q = Long.valueOf(this.f116941l.getElapsedTimeInMillis());
        ukg0 ukg0Var2 = this.f116930a;
        String str = lmg0.f132690e;
        int i3 = khg0.f126870a.f132691a;
        if (i3 == 3 || (i3 != 2 && i3 == 1 && this.f116947r)) {
            i2 = 0;
        }
        ukg0Var2.f179409r = Integer.valueOf(i2);
        File filesDir = Utils.getApp().getFilesDir();
        this.f116930a.f179410s = Long.valueOf(filesDir.getTotalSpace());
        this.f116930a.f179411t = Long.valueOf(filesDir.getUsableSpace());
        m142192d(this.f116930a);
        if (i == 80) {
            ukg0 ukg0Var3 = this.f116930a;
            ukg0Var3.f179396e = -10303;
            ukg0Var3.f179404m = -10303;
            this.f116930a.f179397f = "引擎加载超时";
        } else {
            if (i < 85 || i >= 100) {
                return;
            }
            ukg0 ukg0Var4 = this.f116930a;
            ukg0Var4.f179396e = -10304;
            ukg0Var4.f179404m = -10304;
            this.f116930a.f179397f = "游戏加载超时";
        }
        ukg0 ukg0Var5 = this.f116930a;
        ukg0Var5.f179392a = "loadGameTimeout";
        ukg0Var5.f179393b = fug0.m127462a("loadGameTimeout");
        ukg0 ukg0Var6 = this.f116930a;
        JSONArray jSONArrayM142195g = m142195g();
        if (jSONArrayM142195g != null) {
            ukg0Var6.f179401j.put("loadGame", jSONArrayM142195g);
        } else {
            ukg0Var6.getClass();
        }
        fug0.m127463b(this.f116930a);
        ukg0 ukg0Var7 = this.f116930a;
        ukg0Var7.f179392a = "loadGameFinished";
        ukg0Var7.f179393b = fug0.m127462a("loadGameFinished");
        ukg0 ukg0Var8 = this.f116930a;
        ukg0Var8.getClass();
        ukg0Var8.f179394c = gxg0.m132863b(UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: c */
    public final void m142191c(String str, int i, JSONObject jSONObject) {
        if (this.f116931b == null) {
            return;
        }
        try {
            this.f116940k.stop();
            long elapsedTimeInMillis = this.f116940k.getElapsedTimeInMillis();
            long jNanoTime = System.nanoTime() / 1000000;
            tkg0 tkg0Var = new tkg0();
            tkg0Var.f174708a = str;
            tkg0Var.f174709b = i;
            tkg0Var.f174710c = jSONObject;
            tkg0Var.f174711d = (jNanoTime - this.f116932c) - elapsedTimeInMillis;
            tkg0Var.f174712e = elapsedTimeInMillis;
            this.f116931b.add(tkg0Var);
            this.f116932c = jNanoTime;
            this.f116940k.reset();
            StringBuilder sb = new StringBuilder("putStatsEvent:");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("step", tkg0Var.f174708a);
            jSONObject2.put("percent", tkg0Var.f174709b);
            jSONObject2.put("extra", tkg0Var.f174710c);
            jSONObject2.put("cost_time", tkg0Var.f174711d);
            jSONObject2.put("pause_cost_time", tkg0Var.f174712e);
            sb.append(jSONObject2);
            LogUtils.file("LoadGameStatsManager", sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m142192d(ukg0 ukg0Var) {
        int i = 0;
        if (this.f116942m.size() != 0 && ukg0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f116942m;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                bsg0 bsg0Var = (bsg0) obj;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        bsg0 bsg0Var2 = (bsg0) it.next();
                        if (bsg0Var2.f78154a.equals(bsg0Var.f78154a)) {
                            if (bsg0Var.f78155b <= bsg0Var2.f78155b) {
                                break;
                            } else {
                                it.remove();
                            }
                        }
                    }
                    arrayList.add(bsg0Var);
                    break;
                }
            }
            this.f116942m.clear();
            this.f116942m.addAll(arrayList);
        }
        if (this.f116942m.size() == 0 || ukg0Var == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList3 = this.f116942m;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            bsg0 bsg0Var3 = (bsg0) obj2;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, bsg0Var3.f78154a);
                jSONObject.put("mg_timestamp", bsg0Var3.f78155b);
                jSONObject.put("app_timestamp", bsg0Var3.f78156c);
                jSONObject.put("cost_time", bsg0Var3.f78157d);
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ukg0Var.f179401j.put("local_info_transfer", jSONArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r0.f132694d == r5.f116948s) goto L21;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m142193e(boolean z) {
        gvg0 gvg0Var;
        gvg0 gvg0Var2;
        if (!this.f116935f || this.f116938i || this.f116937h) {
            return;
        }
        if (this.f116946q && !this.f116936g) {
            if (!this.f116947r) {
                String str = lmg0.f132690e;
                lmg0 lmg0Var = khg0.f126870a;
                if (lmg0Var.f132691a == 3) {
                }
            }
            LogUtils.file("LoadGameStatsManager", "onLoadGameStateChanged 停止算暂停时间 游戏正常run");
            this.f116939j.stop();
            this.f116940k.stop();
            this.f116941l.start();
            ffg0 ffg0Var = this.f116933d;
            int i = 0;
            if (z) {
                if (ffg0Var == null) {
                    i0h0 i0h0Var = utg0.f180950e;
                    if (i0h0Var != null && (gvg0Var2 = i0h0Var.f112370c) != null) {
                        i = gvg0Var2.f106639j;
                    }
                    this.f116933d = new ffg0(((long) i) * 1000, this.f116934e);
                }
                this.f116933d.m125372b();
                return;
            }
            if (ffg0Var == null) {
                i0h0 i0h0Var2 = utg0.f180950e;
                if (i0h0Var2 != null && (gvg0Var = i0h0Var2.f112370c) != null) {
                    i = gvg0Var.f106639j;
                }
                ffg0 ffg0Var2 = new ffg0(((long) i) * 1000, this.f116934e);
                this.f116933d = ffg0Var2;
                ffg0Var2.m125372b();
            }
            ffg0 ffg0Var3 = this.f116933d;
            if (ffg0Var3 != null) {
                synchronized (ffg0Var3) {
                    if (ffg0Var3.f98769e) {
                        return;
                    }
                    ffg0Var3.f98769e = true;
                    ffg0Var3.m125371a();
                    return;
                }
            }
            return;
        }
        LogUtils.file("LoadGameStatsManager", "onLoadGameStateChanged 开始算暂停时间");
        this.f116939j.start();
        this.f116940k.start();
        this.f116941l.stop();
        if (z) {
            m142189a();
        } else {
            m142194f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m142194f() {
        ffg0 ffg0Var = this.f116933d;
        if (ffg0Var != null) {
            synchronized (ffg0Var) {
                if (ffg0Var.f98769e) {
                    ffg0Var.f98769e = false;
                    ffg0Var.f98768d.removeCallbacks(ffg0Var.f98771g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final JSONArray m142195g() {
        if (this.f116931b == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f116931b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tkg0 tkg0Var = (tkg0) obj;
            try {
                tkg0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("step", tkg0Var.f174708a);
                jSONObject.put("percent", tkg0Var.f174709b);
                jSONObject.put("extra", tkg0Var.f174710c);
                jSONObject.put("cost_time", tkg0Var.f174711d);
                jSONObject.put("pause_cost_time", tkg0Var.f174712e);
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
                LogUtils.file("LoadGameStatsManager", "getStepsJSONArray fail:" + LogUtils.getErrorInfo(e));
            }
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX INFO: renamed from: h */
    public final void m142196h() {
        int i;
        ukg0 ukg0Var = this.f116930a;
        if (ukg0Var == null) {
            return;
        }
        ukg0Var.f179406o = Long.valueOf(this.f116939j.getElapsedTimeInMillis());
        this.f116930a.f179407p = Integer.valueOf(this.f116943n);
        this.f116930a.f179408q = Long.valueOf(this.f116941l.getElapsedTimeInMillis());
        ukg0 ukg0Var2 = this.f116930a;
        String str = lmg0.f132690e;
        int i2 = khg0.f126870a.f132691a;
        if (i2 == 3) {
            i = 0;
        } else {
            i = 1;
            if (i2 != 2 && i2 == 1 && this.f116947r) {
                i = 0;
            }
        }
        ukg0Var2.f179409r = Integer.valueOf(i);
        File filesDir = Utils.getApp().getFilesDir();
        this.f116930a.f179410s = Long.valueOf(filesDir.getTotalSpace());
        this.f116930a.f179411t = Long.valueOf(filesDir.getUsableSpace());
        m142192d(this.f116930a);
        if (!"loadGameFinished".equals(this.f116930a.f179392a)) {
            ukg0 ukg0Var3 = this.f116930a;
            ukg0Var3.f179392a = "loadGameFinished";
            ukg0Var3.f179393b = fug0.m127462a("loadGameFinished");
            ukg0 ukg0Var4 = this.f116930a;
            ukg0Var4.getClass();
            ukg0Var4.f179394c = gxg0.m132863b(UUID.randomUUID().toString());
        }
        ukg0 ukg0Var5 = this.f116930a;
        JSONArray jSONArrayM142195g = m142195g();
        if (jSONArrayM142195g != null) {
            ukg0Var5.f179401j.put("loadGame", jSONArrayM142195g);
        } else {
            ukg0Var5.getClass();
        }
        fug0.m127463b(this.f116930a);
        this.f116930a = null;
        this.f116931b = null;
    }
}
