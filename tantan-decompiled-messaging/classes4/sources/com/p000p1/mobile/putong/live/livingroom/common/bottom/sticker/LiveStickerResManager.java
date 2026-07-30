package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.download.a;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import l.e30;
import l.f30;
import l.hbu;
import l.ia20;
import l.jo0;
import l.ogw;
import l.qib0;
import l.rhi;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import l.ypv;
import l.z3g0;
import l.zpd0;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveStickerResManager {

    /* JADX INFO: renamed from: e */
    public static LiveStickerResManager f4753e;

    /* JADX INFO: renamed from: a */
    public ExecutorService f4754a = hbu.b("live-sticker");

    /* JADX INFO: renamed from: b */
    public zpd0 f4755b = new zpd0("latest_sticker_template_version_code", -1L);

    /* JADX INFO: renamed from: c */
    public Map<String, BLiveStickerMetaDataItem> f4756c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public volatile ParseState f4757d = ParseState.ORIGIN;

    public enum ParseState {
        ORIGIN,
        PARSING,
        DONE
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m5810e(Boolean bool, roj0 roj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Pair m5813h(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, Boolean bool) {
        return new Pair(bLiveStickerMetaDataItem, bool);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m5816k(String str, z3g0 z3g0Var, DownloadTask downloadTask, File file) {
        z3g0Var.onNext(roj0.a);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Pair m5819n(BLiveAddStickerResult bLiveAddStickerResult, Boolean bool) {
        return new Pair(bLiveAddStickerResult, bool);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Pair m5820o(BLiveAddStickerResult bLiveAddStickerResult, Boolean bool) {
        return new Pair(bLiveAddStickerResult, bool);
    }

    /* JADX INFO: renamed from: w */
    public static LiveStickerResManager m5824w() {
        if (f4753e == null) {
            synchronized (LiveStickerResManager.class) {
                try {
                    if (f4753e == null) {
                        f4753e = new LiveStickerResManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4753e;
    }

    /* JADX INFO: renamed from: A */
    public boolean m5825A(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        if (bLiveStickerMetaDataItem == null) {
            return false;
        }
        return m5844y(bLiveStickerMetaDataItem.url) && (TextUtils.isEmpty(bLiveStickerMetaDataItem.animationUrl) || m5844y(bLiveStickerMetaDataItem.animationUrl));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m5826B(final String str, final String str2, final z3g0 z3g0Var) {
        if (!new File(str2).exists()) {
            a.u().o(new DownloadTask.b(qib0.H.getDownloadHttp()).q(str).o(str2).j(new f30() { // from class: l.i8u
                public final void call(Object obj, Object obj2) {
                    LiveStickerResManager.m5816k(str, z3g0Var, (DownloadTask) obj, (File) obj2);
                }
            }).f(new f30() { // from class: l.j8u
                public final void call(Object obj, Object obj2) {
                    this.f13643a.m5827C(str2, z3g0Var, str, (DownloadTask) obj, (Throwable) obj2);
                }
            }).a());
        } else {
            z3g0Var.onNext(roj0.a);
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m5827C(String str, z3g0 z3g0Var, String str2, DownloadTask downloadTask, Throwable th) {
        m5839s(new File(str));
        z3g0Var.onError(th);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ roj0 m5828D(long j, List list) throws Throwable {
        final JSONArray jSONArray = new JSONArray();
        vwb.z(list, new e30() { // from class: l.s8u
            public final void call(Object obj) {
                jSONArray.add(JSON.parseObject(((BLiveStickerMetaDataItem) obj).toJson()));
            }
        });
        File file = new File(m5842v(String.valueOf(j)));
        if (file.exists()) {
            m5839s(file);
        }
        FileWriter fileWriter = null;
        try {
            try {
                try {
                    FileWriter fileWriter2 = new FileWriter(file);
                    try {
                        fileWriter2.write(jSONArray.toJSONString());
                        fileWriter2.flush();
                        fileWriter2.close();
                    } catch (IOException e) {
                        e = e;
                        fileWriter = fileWriter2;
                        CrashHelper.c(e);
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                        this.f4755b.put(Long.valueOf(j));
                        return roj0.a;
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException e2) {
                                CrashHelper.c(e2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    CrashHelper.c(e3);
                }
            } catch (IOException e4) {
                e = e4;
            }
            this.f4755b.put(Long.valueOf(j));
            return roj0.a;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m5829E(z3g0 z3g0Var) {
        List list;
        try {
            String strA = rhi.A(new File(m5842v(String.valueOf(this.f4755b.get()))));
            if (TextUtils.isEmpty(strA) || (list = (List) BLiveStickerMetaDataItem.JSON_ADAPTER.ARRAY_ADAPTER().parse(strA, "")) == null) {
                return;
            }
            z3g0Var.onNext(list);
        } catch (IOException e) {
            CrashHelper.c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ c m5830F(final BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        String str = bLiveStickerMetaDataItem.url;
        c cVarJust = TextUtils.isEmpty(str) ? c.just(Boolean.FALSE) : m5840t(str, m5842v(str)).materialize().map(new w9j() { // from class: l.c8u
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).j());
            }
        });
        String str2 = bLiveStickerMetaDataItem.animationUrl;
        return c.zip(cVarJust, TextUtils.isEmpty(str2) ? c.just(roj0.a) : m5840t(str2, m5842v(str2)).materialize().map(new w9j() { // from class: l.l8u
            public final Object call(Object obj) {
                return roj0.a;
            }
        }), new x9j() { // from class: l.m8u
            public final Object call(Object obj, Object obj2) {
                return LiveStickerResManager.m5810e((Boolean) obj, (roj0) obj2);
            }
        }).map(new w9j() { // from class: l.n8u
            public final Object call(Object obj) {
                return LiveStickerResManager.m5813h(bLiveStickerMetaDataItem, (Boolean) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Writer] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Writer] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.FileWriter, java.io.Writer] */
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m5831G() throws Throwable {
        IOException e;
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f4756c.keySet().iterator();
        while (it.hasNext()) {
            jSONArray.add(JSON.parseObject(this.f4756c.get(it.next()).toJson()));
        }
        File file = new File(m5842v("room_json"));
        ?? Exists = file.exists();
        if (Exists != 0) {
            m5839s(file);
        }
        try {
            try {
                try {
                    Exists = new FileWriter(file);
                    try {
                        Exists.write(jSONArray.toJSONString());
                        Exists.flush();
                        Exists.close();
                    } catch (IOException e2) {
                        e = e2;
                        CrashHelper.c(e);
                        if (Exists != 0) {
                            Exists.close();
                        }
                    }
                } catch (IOException e3) {
                    CrashHelper.c(e3);
                }
            } catch (IOException e4) {
                Exists = 0;
                e = e4;
            } catch (Throwable th) {
                Exists = 0;
                th = th;
                if (Exists != 0) {
                    try {
                        Exists.close();
                    } catch (IOException e5) {
                        CrashHelper.c(e5);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m5832H(long j) {
        return j > ((Long) this.f4755b.get()).longValue() || !m5844y(String.valueOf(this.f4755b.get()));
    }

    /* JADX INFO: renamed from: I */
    public c<List<BLiveStickerMetaDataItem>> m5833I() {
        return c.create(new c.a() { // from class: l.q8u
            public final void call(Object obj) {
                this.f17861a.m5829E((z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public c<Pair<BLiveAddStickerResult, Boolean>> m5834J(final BLiveAddStickerResult bLiveAddStickerResult) {
        String str = bLiveAddStickerResult.url;
        c cVarJust = TextUtils.isEmpty(str) ? c.just(Boolean.FALSE) : m5840t(str, m5842v(str)).materialize().map(new w9j() { // from class: l.t8u
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).j());
            }
        });
        String str2 = bLiveAddStickerResult.animationUrl;
        c map = !TextUtils.isEmpty(str2) ? m5840t(str2, m5842v(str2)).materialize().map(new w9j() { // from class: l.d8u
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).j());
            }
        }) : null;
        return map != null ? c.zip(cVarJust, map, new x9j() { // from class: l.e8u
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            }
        }).map(new w9j() { // from class: l.f8u
            public final Object call(Object obj) {
                return LiveStickerResManager.m5820o(bLiveAddStickerResult, (Boolean) obj);
            }
        }).observeOn(jo0.a()) : cVarJust.map(new w9j() { // from class: l.g8u
            public final Object call(Object obj) {
                return LiveStickerResManager.m5819n(bLiveAddStickerResult, (Boolean) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: K */
    public c<Pair<BLiveStickerMetaDataItem, Boolean>> m5835K(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bLiveStickerMetaDataItem);
        return m5836L(arrayList);
    }

    /* JADX INFO: renamed from: L */
    public final c<Pair<BLiveStickerMetaDataItem, Boolean>> m5836L(List<BLiveStickerMetaDataItem> list) {
        return c.from(list).flatMap(new w9j() { // from class: l.k8u
            public final Object call(Object obj) {
                return this.f14254a.m5830F((BLiveStickerMetaDataItem) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: M */
    public void m5837M(String str, BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        this.f4756c.put(str, bLiveStickerMetaDataItem);
    }

    /* JADX INFO: renamed from: N */
    public void m5838N() {
        this.f4754a.execute(new Runnable() { // from class: l.r8u
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f18415a.m5831G();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5839s(File file) {
        if (file == null) {
            return false;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final c<roj0> m5840t(final String str, final String str2) {
        return c.create(new c.a() { // from class: l.h8u
            public final void call(Object obj) {
                this.f11944a.m5826B(str, str2, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public c<roj0> m5841u(final String str, final long j) {
        return ia20.f(new v9j() { // from class: l.o8u
            public final Object call() {
                return qib0.H.auth().q(str).f().b();
            }
        }, JsonAdapter.ARRAY_ADAPTER(BLiveStickerMetaDataItem.JSON_ADAPTER)).map(new w9j() { // from class: l.p8u
            public final Object call(Object obj) {
                return this.f17067a.m5828D(j, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public String m5842v(String str) {
        return ypv.e.getDir("sticker_path", 0).getAbsolutePath() + File.separator + ogw.e(str);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public BLiveStickerMetaDataItem m5843x(String str) {
        return this.f4756c.get(str);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m5844y(String str) {
        return new File(m5842v(str)).exists();
    }

    /* JADX INFO: renamed from: z */
    public boolean m5845z(BLiveAddStickerResult bLiveAddStickerResult) {
        if (bLiveAddStickerResult == null) {
            return false;
        }
        return m5844y(bLiveAddStickerResult.url) && (TextUtils.isEmpty(bLiveAddStickerResult.animationUrl) || m5844y(bLiveAddStickerResult.animationUrl));
    }
}
