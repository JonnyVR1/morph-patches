package p149l;

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
public final class amg0 implements agg0 {

    /* JADX INFO: renamed from: a */
    public mcg0 f70600a;

    /* JADX INFO: renamed from: b */
    public ArrayList f70601b;

    /* JADX INFO: renamed from: c */
    public long f70602c;

    /* JADX INFO: renamed from: d */
    public x6g0 f70603d;

    /* JADX INFO: renamed from: e */
    public final v8g0 f70604e;

    /* JADX INFO: renamed from: f */
    public boolean f70605f;

    /* JADX INFO: renamed from: g */
    public boolean f70606g;

    /* JADX INFO: renamed from: h */
    public boolean f70607h;

    /* JADX INFO: renamed from: i */
    public boolean f70608i;

    /* JADX INFO: renamed from: j */
    public final SudStopwatch f70609j = new SudStopwatch();

    /* JADX INFO: renamed from: k */
    public final SudStopwatch f70610k = new SudStopwatch();

    /* JADX INFO: renamed from: l */
    public final SudStopwatch f70611l = new SudStopwatch();

    /* JADX INFO: renamed from: m */
    public final ArrayList f70612m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public int f70613n;

    /* JADX INFO: renamed from: o */
    public boolean f70614o;

    /* JADX INFO: renamed from: p */
    public long f70615p;

    /* JADX INFO: renamed from: q */
    public boolean f70616q;

    /* JADX INFO: renamed from: r */
    public boolean f70617r;

    /* JADX INFO: renamed from: s */
    public Object f70618s;

    public amg0(v8g0 v8g0Var) {
        this.f70604e = v8g0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m97554a() {
        x6g0 x6g0Var = this.f70603d;
        if (x6g0Var != null) {
            synchronized (x6g0Var) {
                if (x6g0Var.f191240e) {
                    x6g0Var.f191240e = false;
                    x6g0Var.f191239d.removeCallbacks(x6g0Var.f191242g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m97555b(int i) {
        ymg0 ymg0Var;
        jfg0 jfg0Var;
        mcg0 mcg0Var = this.f70600a;
        if (mcg0Var == null) {
            return;
        }
        asg0 asg0Var = mlg0.f134430e;
        int i2 = 1;
        if ((asg0Var == null || (ymg0Var = asg0Var.f71451c) == null || (jfg0Var = ymg0Var.f199010l) == null) ? true : jfg0Var.f117657a) {
            hmg0 hmg0Var = new hmg0();
            hmg0Var.f108424a = mlg0.f134432g;
            hmg0Var.f108425b = this.f70615p;
            hmg0Var.f108426c = mcg0Var.f133113c;
            hmg0Var.f108427d = this.f70614o;
            lmg0.f128795a.execute(new zjg0(hmg0Var));
        }
        this.f70600a.f133125o = Long.valueOf(this.f70609j.getElapsedTimeInMillis());
        this.f70600a.f133126p = Integer.valueOf(this.f70613n);
        this.f70600a.f133127q = Long.valueOf(this.f70611l.getElapsedTimeInMillis());
        mcg0 mcg0Var2 = this.f70600a;
        String str = deg0.f85793e;
        int i3 = c9g0.f79931a.f85794a;
        if (i3 == 3 || (i3 != 2 && i3 == 1 && this.f70617r)) {
            i2 = 0;
        }
        mcg0Var2.f133128r = Integer.valueOf(i2);
        File filesDir = Utils.getApp().getFilesDir();
        this.f70600a.f133129s = Long.valueOf(filesDir.getTotalSpace());
        this.f70600a.f133130t = Long.valueOf(filesDir.getUsableSpace());
        m97557d(this.f70600a);
        if (i == 80) {
            mcg0 mcg0Var3 = this.f70600a;
            mcg0Var3.f133115e = -10303;
            mcg0Var3.f133123m = -10303;
            this.f70600a.f133116f = "引擎加载超时";
        } else {
            if (i < 85 || i >= 100) {
                return;
            }
            mcg0 mcg0Var4 = this.f70600a;
            mcg0Var4.f133115e = -10304;
            mcg0Var4.f133123m = -10304;
            this.f70600a.f133116f = "游戏加载超时";
        }
        mcg0 mcg0Var5 = this.f70600a;
        mcg0Var5.f133111a = "loadGameTimeout";
        mcg0Var5.f133112b = xlg0.m209888a("loadGameTimeout");
        mcg0 mcg0Var6 = this.f70600a;
        JSONArray jSONArrayM97560g = m97560g();
        if (jSONArrayM97560g != null) {
            mcg0Var6.f133120j.put("loadGame", jSONArrayM97560g);
        } else {
            mcg0Var6.getClass();
        }
        xlg0.m209889b(this.f70600a);
        mcg0 mcg0Var7 = this.f70600a;
        mcg0Var7.f133111a = "loadGameFinished";
        mcg0Var7.f133112b = xlg0.m209888a("loadGameFinished");
        mcg0 mcg0Var8 = this.f70600a;
        mcg0Var8.getClass();
        mcg0Var8.f133113c = yog0.m215499b(UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: c */
    public final void m97556c(String str, int i, JSONObject jSONObject) {
        if (this.f70601b == null) {
            return;
        }
        try {
            this.f70610k.stop();
            long elapsedTimeInMillis = this.f70610k.getElapsedTimeInMillis();
            long jNanoTime = System.nanoTime() / 1000000;
            lcg0 lcg0Var = new lcg0();
            lcg0Var.f127408a = str;
            lcg0Var.f127409b = i;
            lcg0Var.f127410c = jSONObject;
            lcg0Var.f127411d = (jNanoTime - this.f70602c) - elapsedTimeInMillis;
            lcg0Var.f127412e = elapsedTimeInMillis;
            this.f70601b.add(lcg0Var);
            this.f70602c = jNanoTime;
            this.f70610k.reset();
            StringBuilder sb = new StringBuilder("putStatsEvent:");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("step", lcg0Var.f127408a);
            jSONObject2.put("percent", lcg0Var.f127409b);
            jSONObject2.put("extra", lcg0Var.f127410c);
            jSONObject2.put("cost_time", lcg0Var.f127411d);
            jSONObject2.put("pause_cost_time", lcg0Var.f127412e);
            sb.append(jSONObject2);
            LogUtils.file("LoadGameStatsManager", sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m97557d(mcg0 mcg0Var) {
        int i = 0;
        if (this.f70612m.size() != 0 && mcg0Var != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f70612m;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                tjg0 tjg0Var = (tjg0) obj;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        tjg0 tjg0Var2 = (tjg0) it.next();
                        if (tjg0Var2.f170720a.equals(tjg0Var.f170720a)) {
                            if (tjg0Var.f170721b <= tjg0Var2.f170721b) {
                                break;
                            } else {
                                it.remove();
                            }
                        }
                    }
                    arrayList.add(tjg0Var);
                    break;
                }
            }
            this.f70612m.clear();
            this.f70612m.addAll(arrayList);
        }
        if (this.f70612m.size() == 0 || mcg0Var == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList3 = this.f70612m;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            tjg0 tjg0Var3 = (tjg0) obj2;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AuthenticationTokenClaims.JSON_KEY_NAME, tjg0Var3.f170720a);
                jSONObject.put("mg_timestamp", tjg0Var3.f170721b);
                jSONObject.put("app_timestamp", tjg0Var3.f170722c);
                jSONObject.put("cost_time", tjg0Var3.f170723d);
                jSONArray.put(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        mcg0Var.f133120j.put("local_info_transfer", jSONArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r0.f85797d == r5.f70618s) goto L21;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m97558e(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.f70605f
            if (r0 == 0) goto Lb5
            boolean r0 = r5.f70608i
            if (r0 != 0) goto Lb5
            boolean r0 = r5.f70607h
            if (r0 == 0) goto Le
            goto Lb5
        Le:
            boolean r0 = r5.f70616q
            if (r0 == 0) goto L96
            boolean r0 = r5.f70606g
            if (r0 == 0) goto L18
            goto L96
        L18:
            boolean r0 = r5.f70617r
            if (r0 == 0) goto L1d
            goto L2c
        L1d:
            java.lang.String r0 = p149l.deg0.f85793e
            l.deg0 r0 = p149l.c9g0.f79931a
            int r1 = r0.f85794a
            r2 = 3
            if (r1 != r2) goto L96
            android.app.Activity r0 = r0.f85797d
            java.lang.Object r1 = r5.f70618s
            if (r0 != r1) goto L96
        L2c:
            java.lang.String r0 = "LoadGameStatsManager"
            java.lang.String r1 = "onLoadGameStateChanged 停止算暂停时间 游戏正常run"
            tech.sud.logger.LogUtils.file(r0, r1)
            tech.sud.base.utils.SudStopwatch r0 = r5.f70609j
            r0.stop()
            tech.sud.base.utils.SudStopwatch r0 = r5.f70610k
            r0.stop()
            tech.sud.base.utils.SudStopwatch r0 = r5.f70611l
            r0.start()
            l.x6g0 r0 = r5.f70603d
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = 0
            if (r6 == 0) goto L66
            if (r0 != 0) goto L60
            l.asg0 r6 = p149l.mlg0.f134430e
            if (r6 == 0) goto L55
            l.ymg0 r6 = r6.f71451c
            if (r6 == 0) goto L55
            int r3 = r6.f199008j
        L55:
            long r3 = (long) r3
            long r3 = r3 * r1
            l.x6g0 r6 = new l.x6g0
            l.v8g0 r0 = r5.f70604e
            r6.<init>(r3, r0)
            r5.f70603d = r6
        L60:
            l.x6g0 r5 = r5.f70603d
            r5.m207175b()
            return
        L66:
            if (r0 != 0) goto L80
            l.asg0 r6 = p149l.mlg0.f134430e
            if (r6 == 0) goto L72
            l.ymg0 r6 = r6.f71451c
            if (r6 == 0) goto L72
            int r3 = r6.f199008j
        L72:
            long r3 = (long) r3
            long r3 = r3 * r1
            l.x6g0 r6 = new l.x6g0
            l.v8g0 r0 = r5.f70604e
            r6.<init>(r3, r0)
            r5.f70603d = r6
            r6.m207175b()
        L80:
            l.x6g0 r5 = r5.f70603d
            if (r5 == 0) goto Lb5
            monitor-enter(r5)
            boolean r6 = r5.f191240e     // Catch: java.lang.Throwable -> L93
            if (r6 == 0) goto L8b
            monitor-exit(r5)
            return
        L8b:
            r6 = 1
            r5.f191240e = r6     // Catch: java.lang.Throwable -> L93
            r5.m207174a()     // Catch: java.lang.Throwable -> L93
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L93
            return
        L93:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L96:
            java.lang.String r0 = "LoadGameStatsManager"
            java.lang.String r1 = "onLoadGameStateChanged 开始算暂停时间"
            tech.sud.logger.LogUtils.file(r0, r1)
            tech.sud.base.utils.SudStopwatch r0 = r5.f70609j
            r0.start()
            tech.sud.base.utils.SudStopwatch r0 = r5.f70610k
            r0.start()
            tech.sud.base.utils.SudStopwatch r0 = r5.f70611l
            r0.stop()
            if (r6 == 0) goto Lb2
            r5.m97554a()
            return
        Lb2:
            r5.m97559f()
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.amg0.m97558e(boolean):void");
    }

    /* JADX INFO: renamed from: f */
    public final void m97559f() {
        x6g0 x6g0Var = this.f70603d;
        if (x6g0Var != null) {
            synchronized (x6g0Var) {
                if (x6g0Var.f191240e) {
                    x6g0Var.f191240e = false;
                    x6g0Var.f191239d.removeCallbacks(x6g0Var.f191242g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final JSONArray m97560g() {
        if (this.f70601b == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f70601b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            lcg0 lcg0Var = (lcg0) obj;
            try {
                lcg0Var.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("step", lcg0Var.f127408a);
                jSONObject.put("percent", lcg0Var.f127409b);
                jSONObject.put("extra", lcg0Var.f127410c);
                jSONObject.put("cost_time", lcg0Var.f127411d);
                jSONObject.put("pause_cost_time", lcg0Var.f127412e);
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
    public final void m97561h() {
        int i;
        mcg0 mcg0Var = this.f70600a;
        if (mcg0Var == null) {
            return;
        }
        mcg0Var.f133125o = Long.valueOf(this.f70609j.getElapsedTimeInMillis());
        this.f70600a.f133126p = Integer.valueOf(this.f70613n);
        this.f70600a.f133127q = Long.valueOf(this.f70611l.getElapsedTimeInMillis());
        mcg0 mcg0Var2 = this.f70600a;
        String str = deg0.f85793e;
        int i2 = c9g0.f79931a.f85794a;
        if (i2 == 3) {
            i = 0;
        } else {
            i = 1;
            if (i2 != 2 && i2 == 1 && this.f70617r) {
                i = 0;
            }
        }
        mcg0Var2.f133128r = Integer.valueOf(i);
        File filesDir = Utils.getApp().getFilesDir();
        this.f70600a.f133129s = Long.valueOf(filesDir.getTotalSpace());
        this.f70600a.f133130t = Long.valueOf(filesDir.getUsableSpace());
        m97557d(this.f70600a);
        if (!"loadGameFinished".equals(this.f70600a.f133111a)) {
            mcg0 mcg0Var3 = this.f70600a;
            mcg0Var3.f133111a = "loadGameFinished";
            mcg0Var3.f133112b = xlg0.m209888a("loadGameFinished");
            mcg0 mcg0Var4 = this.f70600a;
            mcg0Var4.getClass();
            mcg0Var4.f133113c = yog0.m215499b(UUID.randomUUID().toString());
        }
        mcg0 mcg0Var5 = this.f70600a;
        JSONArray jSONArrayM97560g = m97560g();
        if (jSONArrayM97560g != null) {
            mcg0Var5.f133120j.put("loadGame", jSONArrayM97560g);
        } else {
            mcg0Var5.getClass();
        }
        xlg0.m209889b(this.f70600a);
        this.f70600a = null;
        this.f70601b = null;
    }
}
