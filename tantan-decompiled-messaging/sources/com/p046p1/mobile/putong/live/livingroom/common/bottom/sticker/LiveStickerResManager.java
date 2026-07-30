package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
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
import p133rx.C22306c;
import p133rx.Notification;
import p149l.e30;
import p149l.f30;
import p149l.hbu;
import p149l.ia20;
import p149l.jo0;
import p149l.ogw;
import p149l.qib0;
import p149l.rhi;
import p149l.roj0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.ypv;
import p149l.z3g0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerResManager {

    /* JADX INFO: renamed from: e */
    public static LiveStickerResManager f48711e;

    /* JADX INFO: renamed from: a */
    public ExecutorService f48712a = hbu.m130336b("live-sticker");

    /* JADX INFO: renamed from: b */
    public zpd0 f48713b = new zpd0("latest_sticker_template_version_code", -1L);

    /* JADX INFO: renamed from: c */
    public Map<String, BLiveStickerMetaDataItem> f48714c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public volatile ParseState f48715d = ParseState.ORIGIN;

    public enum ParseState {
        ORIGIN,
        PARSING,
        DONE
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m72333e(Boolean bool, roj0 roj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Pair m72336h(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, Boolean bool) {
        return new Pair(bLiveStickerMetaDataItem, bool);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m72339k(String str, z3g0 z3g0Var, DownloadTask downloadTask, File file) {
        z3g0Var.onNext(roj0.f160388a);
        z3g0Var.onCompleted();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Pair m72342n(BLiveAddStickerResult bLiveAddStickerResult, Boolean bool) {
        return new Pair(bLiveAddStickerResult, bool);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Pair m72343o(BLiveAddStickerResult bLiveAddStickerResult, Boolean bool) {
        return new Pair(bLiveAddStickerResult, bool);
    }

    /* JADX INFO: renamed from: w */
    public static LiveStickerResManager m72347w() {
        if (f48711e == null) {
            synchronized (LiveStickerResManager.class) {
                try {
                    if (f48711e == null) {
                        f48711e = new LiveStickerResManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f48711e;
    }

    /* JADX INFO: renamed from: A */
    public boolean m72348A(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        if (bLiveStickerMetaDataItem == null) {
            return false;
        }
        return m72367y(bLiveStickerMetaDataItem.url) && (TextUtils.isEmpty(bLiveStickerMetaDataItem.animationUrl) || m72367y(bLiveStickerMetaDataItem.animationUrl));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m72349B(final String str, final String str2, final z3g0 z3g0Var) {
        if (!new File(str2).exists()) {
            C13111a.m79654u().m79665o(new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(str2).m79635j(new f30() { // from class: l.i8u
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    LiveStickerResManager.m72339k(str, z3g0Var, (DownloadTask) obj, (File) obj2);
                }
            }).m79631f(new f30() { // from class: l.j8u
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f116804a.m72350C(str2, z3g0Var, str, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m79626a());
        } else {
            z3g0Var.onNext(roj0.f160388a);
            z3g0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m72350C(String str, z3g0 z3g0Var, String str2, DownloadTask downloadTask, Throwable th) {
        m72362s(new File(str));
        z3g0Var.onError(th);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ roj0 m72351D(long j, List list) throws Throwable {
        final JSONArray jSONArray = new JSONArray();
        vwb.m200354z(list, new e30() { // from class: l.s8u
            @Override // p149l.e30
            public final void call(Object obj) {
                jSONArray.add(JSON.parseObject(((BLiveStickerMetaDataItem) obj).toJson()));
            }
        });
        File file = new File(m72365v(String.valueOf(j)));
        if (file.exists()) {
            m72362s(file);
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
                        CrashHelper.m81296c(e);
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                        this.f48713b.put(Long.valueOf(j));
                        return roj0.f160388a;
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException e2) {
                                CrashHelper.m81296c(e2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    CrashHelper.m81296c(e3);
                }
            } catch (IOException e4) {
                e = e4;
            }
            this.f48713b.put(Long.valueOf(j));
            return roj0.f160388a;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m72352E(z3g0 z3g0Var) throws Throwable {
        List<BLiveStickerMetaDataItem> list;
        try {
            String strM179354A = rhi.m179354A(new File(m72365v(String.valueOf(this.f48713b.get()))));
            if (TextUtils.isEmpty(strM179354A) || (list = BLiveStickerMetaDataItem.JSON_ADAPTER.ARRAY_ADAPTER().parse(strM179354A, "")) == null) {
                return;
            }
            z3g0Var.onNext(list);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C22306c m72353F(final BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        String str = bLiveStickerMetaDataItem.url;
        C22306c c22306cJust = TextUtils.isEmpty(str) ? C22306c.just(Boolean.FALSE) : m72363t(str, m72365v(str)).materialize().map(new w9j() { // from class: l.c8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).m221299j());
            }
        });
        String str2 = bLiveStickerMetaDataItem.animationUrl;
        return C22306c.zip(c22306cJust, TextUtils.isEmpty(str2) ? C22306c.just(roj0.f160388a) : m72363t(str2, m72365v(str2)).materialize().map(new w9j() { // from class: l.l8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }), new x9j() { // from class: l.m8u
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return LiveStickerResManager.m72333e((Boolean) obj, (roj0) obj2);
            }
        }).map(new w9j() { // from class: l.n8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveStickerResManager.m72336h(bLiveStickerMetaDataItem, (Boolean) obj);
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
    public final /* synthetic */ void m72354G() throws Throwable {
        IOException e;
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f48714c.keySet().iterator();
        while (it.hasNext()) {
            jSONArray.add(JSON.parseObject(this.f48714c.get(it.next()).toJson()));
        }
        File file = new File(m72365v("room_json"));
        ?? Exists = file.exists();
        if (Exists != 0) {
            m72362s(file);
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
                        CrashHelper.m81296c(e);
                        if (Exists != 0) {
                            Exists.close();
                        }
                    }
                } catch (IOException e3) {
                    CrashHelper.m81296c(e3);
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
                        CrashHelper.m81296c(e5);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m72355H(long j) {
        return j > this.f48713b.get().longValue() || !m72367y(String.valueOf(this.f48713b.get()));
    }

    /* JADX INFO: renamed from: I */
    public C22306c<List<BLiveStickerMetaDataItem>> m72356I() {
        return C22306c.create(new C22306c.a() { // from class: l.q8u
            @Override // p149l.e30
            public final void call(Object obj) throws Throwable {
                this.f153337a.m72352E((z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public C22306c<Pair<BLiveAddStickerResult, Boolean>> m72357J(final BLiveAddStickerResult bLiveAddStickerResult) {
        String str = bLiveAddStickerResult.url;
        C22306c c22306cJust = TextUtils.isEmpty(str) ? C22306c.just(Boolean.FALSE) : m72363t(str, m72365v(str)).materialize().map(new w9j() { // from class: l.t8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).m221299j());
            }
        });
        String str2 = bLiveAddStickerResult.animationUrl;
        C22306c map = !TextUtils.isEmpty(str2) ? m72363t(str2, m72365v(str2)).materialize().map(new w9j() { // from class: l.d8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).m221299j());
            }
        }) : null;
        return map != null ? C22306c.zip(c22306cJust, map, new x9j() { // from class: l.e8u
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            }
        }).map(new w9j() { // from class: l.f8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveStickerResManager.m72343o(bLiveAddStickerResult, (Boolean) obj);
            }
        }).observeOn(jo0.m142408a()) : c22306cJust.map(new w9j() { // from class: l.g8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveStickerResManager.m72342n(bLiveAddStickerResult, (Boolean) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: K */
    public C22306c<Pair<BLiveStickerMetaDataItem, Boolean>> m72358K(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bLiveStickerMetaDataItem);
        return m72359L(arrayList);
    }

    /* JADX INFO: renamed from: L */
    public final C22306c<Pair<BLiveStickerMetaDataItem, Boolean>> m72359L(List<BLiveStickerMetaDataItem> list) {
        return C22306c.from(list).flatMap(new w9j() { // from class: l.k8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f121863a.m72353F((BLiveStickerMetaDataItem) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: M */
    public void m72360M(String str, BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        this.f48714c.put(str, bLiveStickerMetaDataItem);
    }

    /* JADX INFO: renamed from: N */
    public void m72361N() {
        this.f48712a.execute(new Runnable() { // from class: l.r8u
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f158254a.m72354G();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final boolean m72362s(File file) {
        if (file == null) {
            return false;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final C22306c<roj0> m72363t(final String str, final String str2) {
        return C22306c.create(new C22306c.a() { // from class: l.h8u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106471a.m72349B(str, str2, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22306c<roj0> m72364u(final String str, final long j) {
        return ia20.m135122f(new v9j() { // from class: l.o8u
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return qib0.f154693H.auth().m185898q(str).m185887f().m185883b();
            }
        }, JsonAdapter.ARRAY_ADAPTER(BLiveStickerMetaDataItem.JSON_ADAPTER)).map(new w9j() { // from class: l.p8u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f147635a.m72351D(j, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public String m72365v(String str) {
        return ypv.f199497e.getDir("sticker_path", 0).getAbsolutePath() + File.separator + ogw.m164284e(str);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public BLiveStickerMetaDataItem m72366x(String str) {
        return this.f48714c.get(str);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m72367y(String str) {
        return new File(m72365v(str)).exists();
    }

    /* JADX INFO: renamed from: z */
    public boolean m72368z(BLiveAddStickerResult bLiveAddStickerResult) {
        if (bLiveAddStickerResult == null) {
            return false;
        }
        return m72367y(bLiveAddStickerResult.url) && (TextUtils.isEmpty(bLiveAddStickerResult.animationUrl) || m72367y(bLiveAddStickerResult.animationUrl));
    }
}
