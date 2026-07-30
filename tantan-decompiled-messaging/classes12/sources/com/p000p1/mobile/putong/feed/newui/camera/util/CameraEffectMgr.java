package com.p000p1.mobile.putong.feed.newui.camera.util;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import androidx.lifecycle.t;
import com.p000p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.camera.widget.C2033f;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
import com.p1.mobile.android.app.Act;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.t95;
import l.tpd0;
import l.uqd0;
import p007l.f3c0;
import p007l.ixl;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CameraEffectMgr {
    private static CameraEffectMgr INSTANCE = new CameraEffectMgr();

    /* JADX INFO: renamed from: L */
    public static Map<String, Float> f944L = new HashMap();

    /* JADX INFO: renamed from: M */
    public static Map<String, Float> f945M = new HashMap();

    /* JADX INFO: renamed from: N */
    public static Map<String, Float> f946N = new HashMap();

    /* JADX INFO: renamed from: O */
    public static Map<String, Float> f947O = new HashMap();

    /* JADX INFO: renamed from: a */
    public ixl f959a;

    /* JADX INFO: renamed from: b */
    public MakeupSharedViewModel f960b;

    /* JADX INFO: renamed from: c */
    public Set<Integer> f961c = new HashSet();

    /* JADX INFO: renamed from: d */
    public List<MakeUpMenuView.MakeupCategory> f962d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<FeedMakeupPageAdapter.MakeupItem> f963e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<FeedMakeupPageAdapter.MakeupItem> f964f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<FeedMakeupPageAdapter.MakeupItem> f965g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<FeedMakeupPageAdapter.MakeupItem> f966h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Map<String, List<FeedMakeupPageAdapter.MakeupItem>> f967i = new ArrayMap();

    /* JADX INFO: renamed from: j */
    public a<FeedMakeupPageAdapter.MakeupItem> f968j = a.b();

    /* JADX INFO: renamed from: k */
    public List<C2033f.b> f969k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public tpd0 f970l = new tpd0("feed_makeup_beautyauto_index", 1);

    /* JADX INFO: renamed from: m */
    public tpd0 f971m = new tpd0("feed_makeup_beautyface_index", 0);

    /* JADX INFO: renamed from: n */
    public tpd0 f972n = new tpd0("feed_makeup_microplastic_index", 0);

    /* JADX INFO: renamed from: o */
    public tpd0 f973o = new tpd0("feed_makeup_stylemakeup_index", 0);

    /* JADX INFO: renamed from: p */
    public tpd0 f974p = new tpd0("feed_makeup_beautymakeup_index", 0);

    /* JADX INFO: renamed from: q */
    public uqd0 f975q = new uqd0("feed_makeup_beauty_all", "");

    /* JADX INFO: renamed from: r */
    public Map<String, Float> f976r = new HashMap();

    /* JADX INFO: renamed from: s */
    public uqd0 f977s = new uqd0("feed_style_makeup_all", "");

    /* JADX INFO: renamed from: t */
    public Map<String, Intensity> f978t = new HashMap();

    /* JADX INFO: renamed from: u */
    public uqd0 f979u = new uqd0("feed_beauty_makeup_index", "");

    /* JADX INFO: renamed from: v */
    public Map<String, Integer> f980v = new HashMap();

    /* JADX INFO: renamed from: w */
    public uqd0 f981w = new uqd0("feed_beauty_makeup_cate_value", "");

    /* JADX INFO: renamed from: x */
    public Map<String, Float> f982x = new HashMap();

    /* JADX INFO: renamed from: y */
    public uqd0 f983y = new uqd0("feed_beauty_makeup_item_value", "");

    /* JADX INFO: renamed from: z */
    public Map<String, Float> f984z = new HashMap();

    /* JADX INFO: renamed from: A */
    public Map<Integer, Object> f948A = new HashMap();

    /* JADX INFO: renamed from: B */
    public Map<String, Integer> f949B = new HashMap();

    /* JADX INFO: renamed from: C */
    public List<Object> f950C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public Map<String, Float> f951D = new HashMap();

    /* JADX INFO: renamed from: E */
    public uqd0 f952E = new uqd0("feed_makeup_category_show_map", "");

    /* JADX INFO: renamed from: F */
    public Map<String, Float> f953F = new HashMap();

    /* JADX INFO: renamed from: G */
    public uqd0 f954G = new uqd0("feed_real_effect_face_beauty", "");

    /* JADX INFO: renamed from: H */
    public HashMap<String, String> f955H = new HashMap<>();

    /* JADX INFO: renamed from: I */
    public uqd0 f956I = new uqd0("feed_real_effect_model_list", "");

    /* JADX INFO: renamed from: J */
    public Map<String, Float> f957J = new HashMap();

    /* JADX INFO: renamed from: K */
    public uqd0 f958K = new uqd0("feed_real_effect_intensity_list", "");

    public static class Intensity implements Serializable {
        public float all;
        public float lut;

        public Intensity(float f, float f2) {
            this.lut = f;
            this.all = f2;
        }

        public String toString() {
            return "Intensity{lut=" + this.lut + ", all=" + this.all + '}';
        }
    }

    static {
        f944L.put("skin_smooth", Float.valueOf(0.33f));
        f944L.put("skin_whitening", Float.valueOf(0.52f));
        Map<String, Float> map = f944L;
        Float fValueOf = Float.valueOf(0.5f);
        map.put("skin_ruddy", fValueOf);
        f944L.put("big_eye", Float.valueOf(0.25f));
        Map<String, Float> map2 = f944L;
        Float fValueOf2 = Float.valueOf(0.4f);
        map2.put("thin_face", fValueOf2);
        Map<String, Float> map3 = f944L;
        Float fValueOf3 = Float.valueOf(0.7f);
        map3.put("skin_sharpen", fValueOf3);
        f944L.put("nose_size", Float.valueOf(0.3f));
        f944L.put("eye_brighten", fValueOf2);
        f944L.put("teeth_whiten", fValueOf2);
        f945M.put("skin_smooth", fValueOf3);
        f945M.put("skin_whitening", fValueOf2);
        f945M.put("skin_ruddy", fValueOf);
        f945M.put("big_eye", fValueOf2);
        f945M.put("thin_face", fValueOf);
        f945M.put("skin_sharpen", fValueOf);
        Map<String, Float> map4 = f945M;
        Float fValueOf4 = Float.valueOf(0.0f);
        map4.put("face_width", fValueOf4);
        f945M.put("jaw_shape", fValueOf4);
        f945M.put("shorten_face", fValueOf4);
        f945M.put("forehead", fValueOf4);
        f945M.put("chin_length", fValueOf4);
        f945M.put("cheekbone_width", fValueOf4);
        f945M.put("jaw_width", fValueOf4);
        f945M.put("nose_width", fValueOf4);
        f945M.put("nose_size", fValueOf4);
        f945M.put("nose_lift", fValueOf4);
        f945M.put("nose_ridge_width", fValueOf4);
        f945M.put("nose_tip_size", fValueOf4);
        f945M.put("eye_tilt", fValueOf4);
        f945M.put("eye_distance", fValueOf4);
        f945M.put("eye_height", fValueOf4);
        f945M.put("lip_thickness", fValueOf4);
        f945M.put("mouth_size", fValueOf4);
        f945M.put("remove_pouch", fValueOf4);
        f945M.put("remove_nasolabial_floads", fValueOf4);
        f945M.put("eye_brighten", fValueOf4);
        f945M.put("teeth_whiten", fValueOf4);
        f946N.put("makeup_lips", fValueOf3);
        f946N.put("makeup_blush", fValueOf2);
        f946N.put("makeup_eyes", Float.valueOf(0.6f));
        f946N.put("makeup_eyebrow", fValueOf);
        f946N.put("makeup_pupil", fValueOf2);
        f946N.put("makeup_facial", fValueOf2);
        f947O.put("makeup_lut", fValueOf);
        f947O.put("makeup_all", fValueOf3);
    }

    public CameraEffectMgr() {
        this.f948A.put(4, this.f950C);
    }

    /* JADX INFO: renamed from: B */
    public static float m2285B(String str) {
        Float f = f946N.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: H */
    public static float m2286H(String str) {
        Float f;
        if (TextUtils.isEmpty(str) || (f = f945M.get(str)) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: I */
    public static float m2287I(int i) {
        return new BigDecimal(i / 100.0f).setScale(2, 5).floatValue();
    }

    /* JADX INFO: renamed from: N */
    public static Intensity m2288N(String str, Map<String, Intensity> map) {
        if (TextUtils.isEmpty(str)) {
            return new Intensity(0.5f, 0.7f);
        }
        Intensity intensity = map.get(str);
        return intensity == null ? new Intensity(0.5f, 0.7f) : intensity;
    }

    /* JADX INFO: renamed from: V */
    public static CameraEffectMgr m2289V() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static String m2290Y(Object obj) {
        ObjectOutputStream objectOutputStream;
        if (obj == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream2);
                try {
                    objectOutputStream.writeObject(obj);
                    byteArrayOutputStream2.close();
                    objectOutputStream.close();
                    return new String(Base64.encode(byteArrayOutputStream2.toByteArray(), 0));
                } catch (IOException unused) {
                    byteArrayOutputStream = byteArrayOutputStream2;
                    t95.b(byteArrayOutputStream);
                    t95.b(objectOutputStream);
                    return "";
                }
            } catch (IOException unused2) {
                objectOutputStream = null;
            }
        } catch (IOException unused3) {
            objectOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static Object m2291k0(String str) {
        ObjectInputStream objectInputStream;
        ByteArrayInputStream byteArrayInputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.getBytes(StandardCharsets.UTF_8), 0));
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    byteArrayInputStream.close();
                    objectInputStream.close();
                    return object;
                } catch (IOException unused) {
                    t95.b(byteArrayInputStream);
                    t95.b(objectInputStream);
                    return null;
                } catch (ClassNotFoundException unused2) {
                    t95.b(byteArrayInputStream);
                    t95.b(objectInputStream);
                    return null;
                }
            } catch (IOException unused3) {
                objectInputStream = null;
            } catch (ClassNotFoundException unused4) {
                objectInputStream = null;
            }
        } catch (IOException unused5) {
            objectInputStream = null;
            byteArrayInputStream = null;
        } catch (ClassNotFoundException unused6) {
            objectInputStream = null;
            byteArrayInputStream = null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static float m2292s(int i) {
        return new BigDecimal(((i / 100.0f) * 2.0f) - 1.0f).setScale(2, 4).floatValue();
    }

    /* JADX INFO: renamed from: t */
    public static int m2293t(float f) {
        return (int) ((((f - (-1.0f)) / 2.0f) * 100.0f) + 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public static int m2294u(boolean z, float f) {
        return z ? m2293t(f) : (int) (f * 100.0f);
    }

    /* JADX INFO: renamed from: x */
    public static float m2295x(String str) {
        Float f = f945M.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: z */
    public static float m2296z(String str, Map<String, Float> map) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        Float f = map.get(str);
        return f == null ? m2295x(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: A */
    public int m2297A() {
        return ((Integer) this.f971m.get()).intValue();
    }

    /* JADX INFO: renamed from: C */
    public float m2298C(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m2285B(str2);
        }
        Float f = this.f984z.get(str);
        return f == null ? m2285B(str2) : f.floatValue();
    }

    /* JADX INFO: renamed from: D */
    public int m2299D(String str) {
        Integer num = this.f980v.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: E */
    public int m2300E() {
        return ((Integer) this.f974p.get()).intValue();
    }

    /* JADX INFO: renamed from: F */
    public float m2301F(String str) {
        return m2296z(str, this.f976r);
    }

    /* JADX INFO: renamed from: G */
    public float m2302G(String str) {
        Float f = this.f951D.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: J */
    public List<MakeUpMenuView.MakeupCategory> m2303J() {
        return this.f962d;
    }

    /* JADX INFO: renamed from: K */
    public float m2304K(String str) {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f965g) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: L */
    public int m2305L() {
        return ((Integer) this.f972n.get()).intValue();
    }

    /* JADX INFO: renamed from: M */
    public List<FeedMakeupPageAdapter.MakeupItem> m2306M() {
        return this.f966h;
    }

    /* JADX INFO: renamed from: O */
    public int m2307O() {
        return ((Integer) this.f973o.get()).intValue();
    }

    /* JADX INFO: renamed from: P */
    public Intensity m2308P(String str) {
        return m2288N(str, this.f978t);
    }

    /* JADX INFO: renamed from: Q */
    public List<FeedMakeupPageAdapter.MakeupItem> m2309Q(MakeUpMenuView.MakeupCategory makeupCategory) {
        List<FeedMakeupPageAdapter.MakeupItem> list = this.f967i.get(makeupCategory.f678id);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: R */
    public boolean m2310R() {
        return this.f980v.size() != 0;
    }

    /* JADX INFO: renamed from: S */
    public void m2311S() {
        String str = (String) this.f954G.get();
        Object objM2291k0 = m2291k0(str);
        if (objM2291k0 instanceof Map) {
            this.f953F = (Map) objM2291k0;
        }
        Object objM2291k1 = m2291k0((String) this.f956I.get());
        if (objM2291k1 instanceof HashMap) {
            this.f955H = (HashMap) objM2291k1;
        }
        Object objM2291k2 = m2291k0((String) this.f958K.get());
        if (objM2291k2 instanceof Map) {
            this.f957J = (Map) objM2291k2;
        }
        Object objM2291k3 = m2291k0((String) this.f975q.get());
        if (objM2291k3 instanceof Map) {
            this.f976r = (Map) objM2291k3;
        }
        Object objM2291k4 = m2291k0((String) this.f977s.get());
        if (objM2291k4 instanceof Map) {
            this.f978t = (Map) objM2291k4;
        }
        Object objM2291k5 = m2291k0((String) this.f979u.get());
        if (objM2291k5 instanceof Map) {
            this.f980v = (Map) objM2291k5;
        }
        Object objM2291k6 = m2291k0((String) this.f981w.get());
        if (objM2291k6 instanceof Map) {
            this.f982x = (Map) objM2291k6;
        }
        Object objM2291k7 = m2291k0((String) this.f983y.get());
        if (objM2291k7 instanceof Map) {
            this.f984z = (Map) objM2291k7;
        }
        Object objM2291k8 = m2291k0((String) this.f952E.get());
        if (objM2291k8 instanceof Map) {
            this.f951D = (Map) objM2291k8;
        }
        if (TextUtils.isEmpty(str)) {
            this.f953F.putAll(f944L);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m2312T(ixl ixlVar) {
        this.f959a = ixlVar;
    }

    /* JADX INFO: renamed from: U */
    public void m2313U(Act act) {
        this.f960b = (MakeupSharedViewModel) new t(act).a(MakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: W */
    public void m2314W() {
        if (this.f959a != null) {
            Map<String, Float> map = this.f953F;
            if (map != null) {
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    this.f959a.setFaceBeautyValue(entry.getKey(), entry.getValue().floatValue());
                }
            }
            HashMap<String, String> map2 = this.f955H;
            if (map2 != null && map2.size() > 0) {
                for (String str : this.f955H.values()) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f959a.mo11055u(str);
                    }
                }
            }
            Map<String, Float> map3 = this.f957J;
            if (map3 != null) {
                for (Map.Entry<String, Float> entry2 : map3.entrySet()) {
                    this.f959a.mo11052o(entry2.getKey(), entry2.getValue().floatValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public MakeupSharedViewModel m2315X() {
        return this.f960b;
    }

    /* JADX INFO: renamed from: Z */
    public void m2316Z() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f964f) {
            makeupItem.all = m2286H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2317a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.equals(this.f955H.get(str))) {
            return;
        }
        this.f955H.put(str, str2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m2318a0() {
        this.f976r.putAll(f945M);
    }

    /* JADX INFO: renamed from: b */
    public void m2319b() {
        this.f980v.clear();
    }

    /* JADX INFO: renamed from: b0 */
    public void m2320b0() {
        for (List<FeedMakeupPageAdapter.MakeupItem> list : this.f967i.values()) {
            if (list != null) {
                for (FeedMakeupPageAdapter.MakeupItem makeupItem : list) {
                    makeupItem.all = m2285B(makeupItem.type);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2321c() {
        this.f951D.clear();
    }

    /* JADX INFO: renamed from: c0 */
    public void m2322c0() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f965g) {
            makeupItem.all = m2286H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2323d() {
        this.f957J.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public void m2324d0() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f966h) {
            makeupItem.all = 0.7f;
            makeupItem.lut = 0.5f;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2325e() {
        this.f955H.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m2326e0() {
        this.f975q.put(m2290Y(this.f976r));
        this.f977s.put(m2290Y(this.f978t));
        this.f979u.put(m2290Y(this.f980v));
        this.f981w.put(m2290Y(this.f982x));
        this.f983y.put(m2290Y(this.f984z));
        this.f954G.put(m2290Y(this.f953F));
        this.f956I.put(m2290Y(this.f955H));
        this.f958K.put(m2290Y(this.f957J));
        this.f952E.put(m2290Y(this.f951D));
    }

    /* JADX INFO: renamed from: f */
    public void m2327f() {
        this.f973o.put(0);
    }

    /* JADX INFO: renamed from: f0 */
    public void m2328f0(int i) {
        this.f970l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public void m2329g() {
        this.f978t.clear();
    }

    /* JADX INFO: renamed from: g0 */
    public void m2330g0(int i) {
        this.f971m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public List<C2033f.b> m2331h() {
        int i = 0;
        while (true) {
            List<C2033f.b> list = this.f969k;
            if (i >= 5) {
                return list;
            }
            list.add(new C2033f.b(0.0f, 0.0f, false, false));
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m2332h0(int i) {
        this.f974p.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public List<FeedMakeupPageAdapter.MakeupItem> m2333i(List<List<CameraBeautyMode>> list) {
        this.f963e.clear();
        int size = list.size();
        if (size < 5) {
            return this.f963e;
        }
        String[] strArr = {"无", "自然", "可爱", "女神", "净白"};
        int[] iArr = {f3c0.f7828j0, f3c0.f7692R, f3c0.f7678P, f3c0.f7685Q, f3c0.f7699S};
        int[] iArr2 = {f3c0.f7836k0, 0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            HashMap map = new HashMap();
            for (CameraBeautyMode cameraBeautyMode : list.get(i)) {
                map.put(cameraBeautyMode.type, Float.valueOf(cameraBeautyMode.value));
            }
            List<FeedMakeupPageAdapter.MakeupItem> list2 = this.f963e;
            if (i == 0) {
                list2.add(new FeedMakeupPageAdapter.MakeupItem(strArr[i], FeedMakeupPageAdapter.MakeupItem.NONE, map, iArr[i], iArr2[i]));
            } else {
                list2.add(new FeedMakeupPageAdapter.MakeupItem(strArr[i], "local", map, iArr[i], iArr2[i]));
            }
        }
        return this.f963e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m2334i0(int i) {
        this.f972n.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j */
    public List<FeedMakeupPageAdapter.MakeupItem> m2335j() {
        ArrayList arrayList = new ArrayList();
        this.f964f = arrayList;
        arrayList.add(new FeedMakeupPageAdapter.MakeupItem("磨皮", "skin_smooth", f3c0.f7619H, f3c0.f7627I, m2301F("skin_smooth")));
        this.f964f.add(new FeedMakeupPageAdapter.MakeupItem("美白", "skin_whitening", f3c0.f7635J, f3c0.f7643K, m2301F("skin_whitening")));
        this.f964f.add(new FeedMakeupPageAdapter.MakeupItem("红润", "skin_ruddy", f3c0.f7650L, f3c0.f7657M, m2301F("skin_ruddy")));
        this.f964f.add(new FeedMakeupPageAdapter.MakeupItem("大眼", "big_eye", f3c0.f7587D, f3c0.f7595E, m2301F("big_eye")));
        this.f964f.add(new FeedMakeupPageAdapter.MakeupItem("瘦脸", "thin_face", f3c0.f7664N, f3c0.f7671O, m2301F("thin_face")));
        this.f964f.add(new FeedMakeupPageAdapter.MakeupItem("锐化", "skin_sharpen", f3c0.f7603F, f3c0.f7611G, m2301F("skin_sharpen")));
        return this.f964f;
    }

    /* JADX INFO: renamed from: j0 */
    public void m2336j0(int i) {
        this.f973o.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public final MakeUpMenuView.MakeupCategory m2337k(CameraCategory cameraCategory) {
        MakeUpMenuView.MakeupCategory makeupCategory;
        String str = cameraCategory.name;
        str.getClass();
        switch (str) {
            case "修容":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, "makeup_facial", f3c0.f7613G1, f3c0.f7621H1);
                break;
            case "口红":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, "makeup_lips", f3c0.f7673O1, f3c0.f7680P1);
                break;
            case "眼妆":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, "makeup_eyes", f3c0.f7659M1, f3c0.f7666N1);
                break;
            case "眉毛":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, "makeup_eyebrow", f3c0.f7645K1, f3c0.f7652L1);
                break;
            case "美瞳":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, "makeup_pupil", f3c0.f7629I1, f3c0.f7637J1);
                break;
            case "腮红":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, "makeup_blush", f3c0.f7597E1, f3c0.f7605F1);
                break;
            default:
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, 1004);
                break;
        }
        makeupCategory.all = m2302G(makeupCategory.type);
        return makeupCategory;
    }

    /* JADX INFO: renamed from: l */
    public List<MakeUpMenuView.MakeupCategory> m2338l(List<CameraCategory> list) {
        this.f962d.clear();
        this.f962d.add(new MakeUpMenuView.MakeupCategory("一键美颜", MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO));
        this.f962d.add(new MakeUpMenuView.MakeupCategory("美颜", 1001));
        this.f962d.add(new MakeUpMenuView.MakeupCategory("微整形", 1002));
        MakeUpMenuView.MakeupCategory makeupCategory = new MakeUpMenuView.MakeupCategory("美妆", 1004);
        MakeUpMenuView.MakeupCategory makeupCategory2 = null;
        for (CameraCategory cameraCategory : list) {
            if ("风格妆".equals(cameraCategory.name)) {
                makeupCategory2 = new MakeUpMenuView.MakeupCategory(cameraCategory, 1003);
            } else {
                makeupCategory.subMenu.add(0, m2337k(cameraCategory));
            }
        }
        makeupCategory.subMenu.add(0, new MakeUpMenuView.MakeupCategory("原图", -1, f3c0.f7828j0, f3c0.f7836k0));
        if (makeupCategory2 != null) {
            this.f962d.add(makeupCategory2);
        }
        this.f962d.add(makeupCategory);
        return this.f962d;
    }

    /* JADX INFO: renamed from: l0 */
    public void m2339l0(String str, float f) {
        this.f982x.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: m */
    public final FeedMakeupPageAdapter.MakeupItem m2340m(CameraSticker cameraSticker, String str) {
        float fM2298C = m2298C(cameraSticker.modelFilePath, str);
        str.getClass();
        switch (str) {
            case "makeup_blush":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_blush", fM2298C);
            case "makeup_pupil":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_pupil", fM2298C);
            case "makeup_facial":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_facial", fM2298C);
            case "makeup_eyes":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_eyes", fM2298C);
            case "makeup_eyebrow":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_eyebrow", fM2298C);
            default:
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_lips", fM2298C);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m2341m0(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f980v.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public final FeedMakeupPageAdapter.MakeupItem m2342n(MakeUpMenuView.MakeupCategory makeupCategory) {
        FeedMakeupPageAdapter.MakeupItem makeupItem = new FeedMakeupPageAdapter.MakeupItem("无", FeedMakeupPageAdapter.MakeupItem.NONE, f3c0.f7828j0, f3c0.f7836k0, false);
        makeupItem.extra = makeupCategory.type;
        return makeupItem;
    }

    /* JADX INFO: renamed from: n0 */
    public void m2343n0(String str, Float f) {
        this.f984z.put(str, f);
    }

    /* JADX INFO: renamed from: o */
    public List<FeedMakeupPageAdapter.MakeupItem> m2344o() {
        ArrayList arrayList = new ArrayList();
        this.f965g = arrayList;
        arrayList.add(new FeedMakeupPageAdapter.MakeupItem("脸宽", "face_width", f3c0.f7902s2, f3c0.f7910t2, false));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("削脸", "jaw_shape", f3c0.f7934w2, f3c0.f7942x2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("短脸", "shorten_face", f3c0.f7702S2, f3c0.f7709T2, false));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("额头", "forehead", f3c0.f7918u2, f3c0.f7926v2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("下巴", "chin_length", f3c0.f7822i2, f3c0.f7830j2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("颧骨", "cheekbone_width", f3c0.f7806g2, f3c0.f7814h2, false));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("下颌骨", "jaw_width", f3c0.f7950y2, f3c0.f7958z2, false));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("鼻子宽度", "nose_width", f3c0.f7674O2, f3c0.f7681P2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("鼻子大小", "nose_size", f3c0.f7646K2, f3c0.f7653L2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("鼻高", "nose_lift", f3c0.f7614G2, f3c0.f7622H2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("鼻梁", "nose_ridge_width", f3c0.f7630I2, f3c0.f7638J2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("鼻尖", "nose_tip_size", f3c0.f7660M2, f3c0.f7667N2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("眼睛角度", "eye_tilt", f3c0.f7886q2, f3c0.f7894r2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("眼距", "eye_distance", f3c0.f7854m2, f3c0.f7862n2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("眼高", "eye_height", f3c0.f7870o2, f3c0.f7878p2, false));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("嘴唇厚度", "lip_thickness", f3c0.f7566A2, f3c0.f7574B2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("嘴唇大小", "mouth_size", f3c0.f7582C2, f3c0.f7590D2, true));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("眼袋", "remove_pouch", f3c0.f7688Q2, f3c0.f7695R2, false));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("祛法令纹", "remove_nasolabial_floads", f3c0.f7598E2, f3c0.f7606F2, false));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("亮眼", "eye_brighten", f3c0.f7838k2, f3c0.f7846l2, false));
        this.f965g.add(new FeedMakeupPageAdapter.MakeupItem("白牙", "teeth_whiten", f3c0.f7716U2, f3c0.f7723V2, false));
        return this.f965g;
    }

    /* JADX INFO: renamed from: o0 */
    public void m2345o0(String str, float f) {
        this.f976r.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: p */
    public List<FeedMakeupPageAdapter.MakeupItem> m2346p(List<CameraSticker> list) {
        this.f966h.add(new FeedMakeupPageAdapter.MakeupItem("无", FeedMakeupPageAdapter.MakeupItem.NONE, f3c0.f7828j0, f3c0.f7836k0, false));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            FeedMakeupPageAdapter.MakeupItem makeupItem = new FeedMakeupPageAdapter.MakeupItem(it.next(), "makeup_all");
            Intensity intensityM2308P = m2308P(makeupItem.modelFilePath);
            makeupItem.lut = intensityM2308P.lut;
            makeupItem.all = intensityM2308P.all;
            this.f966h.add(makeupItem);
        }
        return this.f966h;
    }

    /* JADX INFO: renamed from: p0 */
    public void m2347p0(String str, float f) {
        this.f951D.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: q */
    public List<FeedMakeupPageAdapter.MakeupItem> m2348q(MakeUpMenuView.MakeupCategory makeupCategory, List<CameraSticker> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m2342n(makeupCategory));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m2340m(it.next(), makeupCategory.type));
        }
        this.f967i.put(makeupCategory.f678id, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public void m2349q0(String str, float f) {
        this.f953F.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: r */
    public void m2350r() {
        this.f959a = null;
    }

    /* JADX INFO: renamed from: r0 */
    public void m2351r0(Map<String, Float> map) {
        if (map != null) {
            this.f953F.clear();
            this.f953F.putAll(map);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m2352s0(String str, float f) {
        this.f957J.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: t0 */
    public void m2353t0(String str, float f, float f2) {
        this.f978t.put(str, new Intensity(f, f2));
    }

    /* JADX INFO: renamed from: v */
    public List<FeedMakeupPageAdapter.MakeupItem> m2354v() {
        return this.f963e;
    }

    /* JADX INFO: renamed from: w */
    public int m2355w() {
        return ((Integer) this.f970l.get()).intValue();
    }

    /* JADX INFO: renamed from: y */
    public float m2356y(String str) {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f964f) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }
}
