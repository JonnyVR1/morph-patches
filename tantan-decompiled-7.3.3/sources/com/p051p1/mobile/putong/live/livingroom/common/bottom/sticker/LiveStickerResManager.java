package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerMetaDataItem;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveStickerResManager;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
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
import p137rx.C22421c;
import p137rx.Notification;
import p153l.byd0;
import p153l.fo0;
import p153l.gcg0;
import p153l.idu;
import p153l.jyb;
import p153l.niw;
import p153l.oki;
import p153l.pcj;
import p153l.qcj;
import p153l.qi20;
import p153l.rcj;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStickerResManager {

    /* JADX INFO: renamed from: e */
    public static LiveStickerResManager f49559e;

    /* JADX INFO: renamed from: a */
    public ExecutorService f49560a = idu.m139545b("live-sticker");

    /* JADX INFO: renamed from: b */
    public byd0 f49561b = new byd0("latest_sticker_template_version_code", -1L);

    /* JADX INFO: renamed from: c */
    public Map<String, BLiveStickerMetaDataItem> f49562c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public volatile ParseState f49563d = ParseState.ORIGIN;

    public enum ParseState {
        ORIGIN,
        PARSING,
        DONE
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m73516e(Boolean bool, uxj0 uxj0Var) {
        return bool;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Pair m73519h(BLiveStickerMetaDataItem bLiveStickerMetaDataItem, Boolean bool) {
        return new Pair(bLiveStickerMetaDataItem, bool);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m73522k(String str, gcg0 gcg0Var, DownloadTask downloadTask, File file) {
        gcg0Var.onNext(uxj0.f181467a);
        gcg0Var.onCompleted();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Pair m73525n(BLiveAddStickerResult bLiveAddStickerResult, Boolean bool) {
        return new Pair(bLiveAddStickerResult, bool);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Pair m73526o(BLiveAddStickerResult bLiveAddStickerResult, Boolean bool) {
        return new Pair(bLiveAddStickerResult, bool);
    }

    /* JADX INFO: renamed from: w */
    public static LiveStickerResManager m73530w() {
        if (f49559e == null) {
            synchronized (LiveStickerResManager.class) {
                try {
                    if (f49559e == null) {
                        f49559e = new LiveStickerResManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f49559e;
    }

    /* JADX INFO: renamed from: A */
    public boolean m73531A(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        if (bLiveStickerMetaDataItem == null) {
            return false;
        }
        return m73550y(bLiveStickerMetaDataItem.url) && (TextUtils.isEmpty(bLiveStickerMetaDataItem.animationUrl) || m73550y(bLiveStickerMetaDataItem.animationUrl));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m73532B(final String str, final String str2, final gcg0 gcg0Var) {
        if (!new File(str2).exists()) {
            C13274a.m80837u().m80848o(new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(str2).m80818j(new z20() { // from class: l.jau
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    LiveStickerResManager.m73522k(str, gcg0Var, (DownloadTask) obj, (File) obj2);
                }
            }).m80814f(new z20() { // from class: l.kau
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f124719a.m73533C(str2, gcg0Var, str, (DownloadTask) obj, (Throwable) obj2);
                }
            }).m80809a());
        } else {
            gcg0Var.onNext(uxj0.f181467a);
            gcg0Var.onCompleted();
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m73533C(String str, gcg0 gcg0Var, String str2, DownloadTask downloadTask, Throwable th) {
        m73545s(new File(str));
        gcg0Var.onError(th);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ uxj0 m73534D(long j, List list) throws Throwable {
        final JSONArray jSONArray = new JSONArray();
        jyb.m147537z(list, new y20() { // from class: l.tau
            @Override // p153l.y20
            public final void call(Object obj) {
                jSONArray.add(JSON.parseObject(((BLiveStickerMetaDataItem) obj).toJson()));
            }
        });
        File file = new File(m73548v(String.valueOf(j)));
        if (file.exists()) {
            m73545s(file);
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
                        CrashHelper.m82479c(e);
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                        this.f49561b.put(Long.valueOf(j));
                        return uxj0.f181467a;
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException e2) {
                                CrashHelper.m82479c(e2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    CrashHelper.m82479c(e3);
                }
            } catch (IOException e4) {
                e = e4;
            }
            this.f49561b.put(Long.valueOf(j));
            return uxj0.f181467a;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m73535E(gcg0 gcg0Var) throws Throwable {
        List<BLiveStickerMetaDataItem> list;
        try {
            String strM168010A = oki.m168010A(new File(m73548v(String.valueOf(this.f49561b.get()))));
            if (TextUtils.isEmpty(strM168010A) || (list = BLiveStickerMetaDataItem.JSON_ADAPTER.ARRAY_ADAPTER().parse(strM168010A, "")) == null) {
                return;
            }
            gcg0Var.onNext(list);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C22421c m73536F(final BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        String str = bLiveStickerMetaDataItem.url;
        C22421c c22421cJust = TextUtils.isEmpty(str) ? C22421c.just(Boolean.FALSE) : m73546t(str, m73548v(str)).materialize().map(new qcj() { // from class: l.dau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).m222545j());
            }
        });
        String str2 = bLiveStickerMetaDataItem.animationUrl;
        return C22421c.zip(c22421cJust, TextUtils.isEmpty(str2) ? C22421c.just(uxj0.f181467a) : m73546t(str2, m73548v(str2)).materialize().map(new qcj() { // from class: l.mau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }), new rcj() { // from class: l.nau
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return LiveStickerResManager.m73516e((Boolean) obj, (uxj0) obj2);
            }
        }).map(new qcj() { // from class: l.oau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveStickerResManager.m73519h(bLiveStickerMetaDataItem, (Boolean) obj);
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
    public final /* synthetic */ void m73537G() throws Throwable {
        IOException e;
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f49562c.keySet().iterator();
        while (it.hasNext()) {
            jSONArray.add(JSON.parseObject(this.f49562c.get(it.next()).toJson()));
        }
        File file = new File(m73548v("room_json"));
        ?? Exists = file.exists();
        if (Exists != 0) {
            m73545s(file);
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
                        CrashHelper.m82479c(e);
                        if (Exists != 0) {
                            Exists.close();
                        }
                    }
                } catch (IOException e3) {
                    CrashHelper.m82479c(e3);
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
                        CrashHelper.m82479c(e5);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m73538H(long j) {
        return j > this.f49561b.get().longValue() || !m73550y(String.valueOf(this.f49561b.get()));
    }

    /* JADX INFO: renamed from: I */
    public C22421c<List<BLiveStickerMetaDataItem>> m73539I() {
        return C22421c.create(new C22421c.a() { // from class: l.rau
            @Override // p153l.y20
            public final void call(Object obj) throws Throwable {
                this.f161945a.m73535E((gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public C22421c<Pair<BLiveAddStickerResult, Boolean>> m73540J(final BLiveAddStickerResult bLiveAddStickerResult) {
        String str = bLiveAddStickerResult.url;
        C22421c c22421cJust = TextUtils.isEmpty(str) ? C22421c.just(Boolean.FALSE) : m73546t(str, m73548v(str)).materialize().map(new qcj() { // from class: l.uau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).m222545j());
            }
        });
        String str2 = bLiveAddStickerResult.animationUrl;
        C22421c map = !TextUtils.isEmpty(str2) ? m73546t(str2, m73548v(str2)).materialize().map(new qcj() { // from class: l.eau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Notification) obj).m222545j());
            }
        }) : null;
        return map != null ? C22421c.zip(c22421cJust, map, new rcj() { // from class: l.fau
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue());
            }
        }).map(new qcj() { // from class: l.gau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveStickerResManager.m73526o(bLiveAddStickerResult, (Boolean) obj);
            }
        }).observeOn(fo0.m126432a()) : c22421cJust.map(new qcj() { // from class: l.hau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveStickerResManager.m73525n(bLiveAddStickerResult, (Boolean) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: K */
    public C22421c<Pair<BLiveStickerMetaDataItem, Boolean>> m73541K(BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(bLiveStickerMetaDataItem);
        return m73542L(arrayList);
    }

    /* JADX INFO: renamed from: L */
    public final C22421c<Pair<BLiveStickerMetaDataItem, Boolean>> m73542L(List<BLiveStickerMetaDataItem> list) {
        return C22421c.from(list).flatMap(new qcj() { // from class: l.lau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130735a.m73536F((BLiveStickerMetaDataItem) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: M */
    public void m73543M(String str, BLiveStickerMetaDataItem bLiveStickerMetaDataItem) {
        this.f49562c.put(str, bLiveStickerMetaDataItem);
    }

    /* JADX INFO: renamed from: N */
    public void m73544N() {
        this.f49560a.execute(new Runnable() { // from class: l.sau
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f167070a.m73537G();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final boolean m73545s(File file) {
        if (file == null) {
            return false;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final C22421c<uxj0> m73546t(final String str, final String str2) {
        return C22421c.create(new C22421c.a() { // from class: l.iau
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113618a.m73532B(str, str2, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22421c<uxj0> m73547u(final String str, final long j) {
        return qi20.m176659f(new pcj() { // from class: l.pau
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return uqb0.f180376H.auth().m209043q(str).m209032f().m209028b();
            }
        }, JsonAdapter.ARRAY_ADAPTER(BLiveStickerMetaDataItem.JSON_ADAPTER)).map(new qcj() { // from class: l.qau
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156425a.m73534D(j, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public String m73548v(String str) {
        return zrv.f205803e.getDir("sticker_path", 0).getAbsolutePath() + File.separator + niw.m163315e(str);
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public BLiveStickerMetaDataItem m73549x(String str) {
        return this.f49562c.get(str);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m73550y(String str) {
        return new File(m73548v(str)).exists();
    }

    /* JADX INFO: renamed from: z */
    public boolean m73551z(BLiveAddStickerResult bLiveAddStickerResult) {
        if (bLiveAddStickerResult == null) {
            return false;
        }
        return m73550y(bLiveAddStickerResult.url) && (TextUtils.isEmpty(bLiveAddStickerResult.animationUrl) || m73550y(bLiveAddStickerResult.animationUrl));
    }
}
