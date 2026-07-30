package com.p046p1.mobile.putong.feed.newui.camera.util;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import androidx.lifecycle.C0490t;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.camera.widget.C11189f;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p046p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
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
import p133rx.subjects.C22392a;
import p149l.f3c0;
import p149l.ixl;
import p149l.t95;
import p149l.tpd0;
import p149l.uqd0;

/* JADX INFO: loaded from: classes12.dex */
public class CameraEffectMgr {
    private static CameraEffectMgr INSTANCE = new CameraEffectMgr();

    /* JADX INFO: renamed from: L */
    public static Map<String, Float> f39483L = new HashMap();

    /* JADX INFO: renamed from: M */
    public static Map<String, Float> f39484M = new HashMap();

    /* JADX INFO: renamed from: N */
    public static Map<String, Float> f39485N = new HashMap();

    /* JADX INFO: renamed from: O */
    public static Map<String, Float> f39486O = new HashMap();

    /* JADX INFO: renamed from: a */
    public ixl f39498a;

    /* JADX INFO: renamed from: b */
    public MakeupSharedViewModel f39499b;

    /* JADX INFO: renamed from: c */
    public Set<Integer> f39500c = new HashSet();

    /* JADX INFO: renamed from: d */
    public List<MakeUpMenuView.MakeupCategory> f39501d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<FeedMakeupPageAdapter.MakeupItem> f39502e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<FeedMakeupPageAdapter.MakeupItem> f39503f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<FeedMakeupPageAdapter.MakeupItem> f39504g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<FeedMakeupPageAdapter.MakeupItem> f39505h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Map<String, List<FeedMakeupPageAdapter.MakeupItem>> f39506i = new ArrayMap();

    /* JADX INFO: renamed from: j */
    public C22392a<FeedMakeupPageAdapter.MakeupItem> f39507j = C22392a.m221512b();

    /* JADX INFO: renamed from: k */
    public List<C11189f.b> f39508k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public tpd0 f39509l = new tpd0("feed_makeup_beautyauto_index", 1);

    /* JADX INFO: renamed from: m */
    public tpd0 f39510m = new tpd0("feed_makeup_beautyface_index", 0);

    /* JADX INFO: renamed from: n */
    public tpd0 f39511n = new tpd0("feed_makeup_microplastic_index", 0);

    /* JADX INFO: renamed from: o */
    public tpd0 f39512o = new tpd0("feed_makeup_stylemakeup_index", 0);

    /* JADX INFO: renamed from: p */
    public tpd0 f39513p = new tpd0("feed_makeup_beautymakeup_index", 0);

    /* JADX INFO: renamed from: q */
    public uqd0 f39514q = new uqd0("feed_makeup_beauty_all", "");

    /* JADX INFO: renamed from: r */
    public Map<String, Float> f39515r = new HashMap();

    /* JADX INFO: renamed from: s */
    public uqd0 f39516s = new uqd0("feed_style_makeup_all", "");

    /* JADX INFO: renamed from: t */
    public Map<String, Intensity> f39517t = new HashMap();

    /* JADX INFO: renamed from: u */
    public uqd0 f39518u = new uqd0("feed_beauty_makeup_index", "");

    /* JADX INFO: renamed from: v */
    public Map<String, Integer> f39519v = new HashMap();

    /* JADX INFO: renamed from: w */
    public uqd0 f39520w = new uqd0("feed_beauty_makeup_cate_value", "");

    /* JADX INFO: renamed from: x */
    public Map<String, Float> f39521x = new HashMap();

    /* JADX INFO: renamed from: y */
    public uqd0 f39522y = new uqd0("feed_beauty_makeup_item_value", "");

    /* JADX INFO: renamed from: z */
    public Map<String, Float> f39523z = new HashMap();

    /* JADX INFO: renamed from: A */
    public Map<Integer, Object> f39487A = new HashMap();

    /* JADX INFO: renamed from: B */
    public Map<String, Integer> f39488B = new HashMap();

    /* JADX INFO: renamed from: C */
    public List<Object> f39489C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public Map<String, Float> f39490D = new HashMap();

    /* JADX INFO: renamed from: E */
    public uqd0 f39491E = new uqd0("feed_makeup_category_show_map", "");

    /* JADX INFO: renamed from: F */
    public Map<String, Float> f39492F = new HashMap();

    /* JADX INFO: renamed from: G */
    public uqd0 f39493G = new uqd0("feed_real_effect_face_beauty", "");

    /* JADX INFO: renamed from: H */
    public HashMap<String, String> f39494H = new HashMap<>();

    /* JADX INFO: renamed from: I */
    public uqd0 f39495I = new uqd0("feed_real_effect_model_list", "");

    /* JADX INFO: renamed from: J */
    public Map<String, Float> f39496J = new HashMap();

    /* JADX INFO: renamed from: K */
    public uqd0 f39497K = new uqd0("feed_real_effect_intensity_list", "");

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
        f39483L.put("skin_smooth", Float.valueOf(0.33f));
        f39483L.put("skin_whitening", Float.valueOf(0.52f));
        Map<String, Float> map = f39483L;
        Float fValueOf = Float.valueOf(0.5f);
        map.put("skin_ruddy", fValueOf);
        f39483L.put(FaceBeautyID.BIG_EYE, Float.valueOf(0.25f));
        Map<String, Float> map2 = f39483L;
        Float fValueOf2 = Float.valueOf(0.4f);
        map2.put(FaceBeautyID.THIN_FACE, fValueOf2);
        Map<String, Float> map3 = f39483L;
        Float fValueOf3 = Float.valueOf(0.7f);
        map3.put("skin_sharpen", fValueOf3);
        f39483L.put(FaceBeautyID.NOSE_SIZE, Float.valueOf(0.3f));
        f39483L.put("eye_brighten", fValueOf2);
        f39483L.put("teeth_whiten", fValueOf2);
        f39484M.put("skin_smooth", fValueOf3);
        f39484M.put("skin_whitening", fValueOf2);
        f39484M.put("skin_ruddy", fValueOf);
        f39484M.put(FaceBeautyID.BIG_EYE, fValueOf2);
        f39484M.put(FaceBeautyID.THIN_FACE, fValueOf);
        f39484M.put("skin_sharpen", fValueOf);
        Map<String, Float> map4 = f39484M;
        Float fValueOf4 = Float.valueOf(0.0f);
        map4.put(FaceBeautyID.FACE_WIDTH, fValueOf4);
        f39484M.put(FaceBeautyID.JAW_SHAPE, fValueOf4);
        f39484M.put(FaceBeautyID.SHORTEN_FACE, fValueOf4);
        f39484M.put(FaceBeautyID.FOREHEAD, fValueOf4);
        f39484M.put(FaceBeautyID.CHIN_LENGTH, fValueOf4);
        f39484M.put(FaceBeautyID.CHEEKBONE_WIDTH, fValueOf4);
        f39484M.put(FaceBeautyID.JAW_WIDTH, fValueOf4);
        f39484M.put(FaceBeautyID.NOSE_WIDTH, fValueOf4);
        f39484M.put(FaceBeautyID.NOSE_SIZE, fValueOf4);
        f39484M.put(FaceBeautyID.NOSE_LIFT, fValueOf4);
        f39484M.put(FaceBeautyID.NOSE_RIDGE_WIDTH, fValueOf4);
        f39484M.put(FaceBeautyID.NOSE_TIP_SIZE, fValueOf4);
        f39484M.put(FaceBeautyID.EYE_TILT, fValueOf4);
        f39484M.put(FaceBeautyID.EYE_DISTANCE, fValueOf4);
        f39484M.put(FaceBeautyID.EYE_HEIGHT, fValueOf4);
        f39484M.put(FaceBeautyID.LIP_THICKNESS, fValueOf4);
        f39484M.put(FaceBeautyID.MOUTH_SIZE, fValueOf4);
        f39484M.put("remove_pouch", fValueOf4);
        f39484M.put("remove_nasolabial_floads", fValueOf4);
        f39484M.put("eye_brighten", fValueOf4);
        f39484M.put("teeth_whiten", fValueOf4);
        f39485N.put(ILightningRender.IMakeupLevel.MAKEUP_LIPS, fValueOf3);
        f39485N.put(ILightningRender.IMakeupLevel.MAKEUP_BLUSH, fValueOf2);
        f39485N.put(ILightningRender.IMakeupLevel.MAKEUP_EYES, Float.valueOf(0.6f));
        f39485N.put(ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, fValueOf);
        f39485N.put(ILightningRender.IMakeupLevel.MAKEUP_PUPIL, fValueOf2);
        f39485N.put(ILightningRender.IMakeupLevel.MAKEUP_FACIAL, fValueOf2);
        f39486O.put(ILightningRender.IMakeupLevel.MAKEUP_LUT, fValueOf);
        f39486O.put(ILightningRender.IMakeupLevel.MAKEUP_ALL, fValueOf3);
    }

    public CameraEffectMgr() {
        this.f39487A.put(4, this.f39489C);
    }

    /* JADX INFO: renamed from: B */
    public static float m61336B(String str) {
        Float f = f39485N.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: H */
    public static float m61337H(String str) {
        Float f;
        if (TextUtils.isEmpty(str) || (f = f39484M.get(str)) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: I */
    public static float m61338I(int i) {
        return new BigDecimal(i / 100.0f).setScale(2, 5).floatValue();
    }

    /* JADX INFO: renamed from: N */
    public static Intensity m61339N(String str, Map<String, Intensity> map) {
        if (TextUtils.isEmpty(str)) {
            return new Intensity(0.5f, 0.7f);
        }
        Intensity intensity = map.get(str);
        return intensity == null ? new Intensity(0.5f, 0.7f) : intensity;
    }

    /* JADX INFO: renamed from: V */
    public static CameraEffectMgr m61340V() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static String m61341Y(Object obj) {
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
                    t95.m187604b(byteArrayOutputStream);
                    t95.m187604b(objectOutputStream);
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
    public static Object m61342k0(String str) {
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
                    t95.m187604b(byteArrayInputStream);
                    t95.m187604b(objectInputStream);
                    return null;
                } catch (ClassNotFoundException unused2) {
                    t95.m187604b(byteArrayInputStream);
                    t95.m187604b(objectInputStream);
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
    public static float m61343s(int i) {
        return new BigDecimal(((i / 100.0f) * 2.0f) - 1.0f).setScale(2, 4).floatValue();
    }

    /* JADX INFO: renamed from: t */
    public static int m61344t(float f) {
        return (int) ((((f - (-1.0f)) / 2.0f) * 100.0f) + 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public static int m61345u(boolean z, float f) {
        return z ? m61344t(f) : (int) (f * 100.0f);
    }

    /* JADX INFO: renamed from: x */
    public static float m61346x(String str) {
        Float f = f39484M.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: z */
    public static float m61347z(String str, Map<String, Float> map) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        Float f = map.get(str);
        return f == null ? m61346x(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: A */
    public int m61348A() {
        return this.f39510m.get().intValue();
    }

    /* JADX INFO: renamed from: C */
    public float m61349C(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m61336B(str2);
        }
        Float f = this.f39523z.get(str);
        return f == null ? m61336B(str2) : f.floatValue();
    }

    /* JADX INFO: renamed from: D */
    public int m61350D(String str) {
        Integer num = this.f39519v.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: E */
    public int m61351E() {
        return this.f39513p.get().intValue();
    }

    /* JADX INFO: renamed from: F */
    public float m61352F(String str) {
        return m61347z(str, this.f39515r);
    }

    /* JADX INFO: renamed from: G */
    public float m61353G(String str) {
        Float f = this.f39490D.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: J */
    public List<MakeUpMenuView.MakeupCategory> m61354J() {
        return this.f39501d;
    }

    /* JADX INFO: renamed from: K */
    public float m61355K(String str) {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f39504g) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: L */
    public int m61356L() {
        return this.f39511n.get().intValue();
    }

    /* JADX INFO: renamed from: M */
    public List<FeedMakeupPageAdapter.MakeupItem> m61357M() {
        return this.f39505h;
    }

    /* JADX INFO: renamed from: O */
    public int m61358O() {
        return this.f39512o.get().intValue();
    }

    /* JADX INFO: renamed from: P */
    public Intensity m61359P(String str) {
        return m61339N(str, this.f39517t);
    }

    /* JADX INFO: renamed from: Q */
    public List<FeedMakeupPageAdapter.MakeupItem> m61360Q(MakeUpMenuView.MakeupCategory makeupCategory) {
        List<FeedMakeupPageAdapter.MakeupItem> list = this.f39506i.get(makeupCategory.f39217id);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: R */
    public boolean m61361R() {
        return this.f39519v.size() != 0;
    }

    /* JADX INFO: renamed from: S */
    public void m61362S() {
        String str = this.f39493G.get();
        Object objM61342k0 = m61342k0(str);
        if (objM61342k0 instanceof Map) {
            this.f39492F = (Map) objM61342k0;
        }
        Object objM61342k1 = m61342k0(this.f39495I.get());
        if (objM61342k1 instanceof HashMap) {
            this.f39494H = (HashMap) objM61342k1;
        }
        Object objM61342k2 = m61342k0(this.f39497K.get());
        if (objM61342k2 instanceof Map) {
            this.f39496J = (Map) objM61342k2;
        }
        Object objM61342k3 = m61342k0(this.f39514q.get());
        if (objM61342k3 instanceof Map) {
            this.f39515r = (Map) objM61342k3;
        }
        Object objM61342k4 = m61342k0(this.f39516s.get());
        if (objM61342k4 instanceof Map) {
            this.f39517t = (Map) objM61342k4;
        }
        Object objM61342k5 = m61342k0(this.f39518u.get());
        if (objM61342k5 instanceof Map) {
            this.f39519v = (Map) objM61342k5;
        }
        Object objM61342k6 = m61342k0(this.f39520w.get());
        if (objM61342k6 instanceof Map) {
            this.f39521x = (Map) objM61342k6;
        }
        Object objM61342k7 = m61342k0(this.f39522y.get());
        if (objM61342k7 instanceof Map) {
            this.f39523z = (Map) objM61342k7;
        }
        Object objM61342k8 = m61342k0(this.f39491E.get());
        if (objM61342k8 instanceof Map) {
            this.f39490D = (Map) objM61342k8;
        }
        if (TextUtils.isEmpty(str)) {
            this.f39492F.putAll(f39483L);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m61363T(ixl ixlVar) {
        this.f39498a = ixlVar;
    }

    /* JADX INFO: renamed from: U */
    public void m61364U(Act act) {
        this.f39499b = (MakeupSharedViewModel) new C0490t(act).m3073a(MakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: W */
    public void m61365W() {
        if (this.f39498a != null) {
            Map<String, Float> map = this.f39492F;
            if (map != null) {
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    this.f39498a.setFaceBeautyValue(entry.getKey(), entry.getValue().floatValue());
                }
            }
            HashMap<String, String> map2 = this.f39494H;
            if (map2 != null && map2.size() > 0) {
                for (String str : this.f39494H.values()) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f39498a.mo138869u(str);
                    }
                }
            }
            Map<String, Float> map3 = this.f39496J;
            if (map3 != null) {
                for (Map.Entry<String, Float> entry2 : map3.entrySet()) {
                    this.f39498a.mo138866o(entry2.getKey(), entry2.getValue().floatValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public MakeupSharedViewModel m61366X() {
        return this.f39499b;
    }

    /* JADX INFO: renamed from: Z */
    public void m61367Z() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f39503f) {
            makeupItem.all = m61337H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m61368a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.equals(this.f39494H.get(str))) {
            return;
        }
        this.f39494H.put(str, str2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m61369a0() {
        this.f39515r.putAll(f39484M);
    }

    /* JADX INFO: renamed from: b */
    public void m61370b() {
        this.f39519v.clear();
    }

    /* JADX INFO: renamed from: b0 */
    public void m61371b0() {
        for (List<FeedMakeupPageAdapter.MakeupItem> list : this.f39506i.values()) {
            if (list != null) {
                for (FeedMakeupPageAdapter.MakeupItem makeupItem : list) {
                    makeupItem.all = m61336B(makeupItem.type);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m61372c() {
        this.f39490D.clear();
    }

    /* JADX INFO: renamed from: c0 */
    public void m61373c0() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f39504g) {
            makeupItem.all = m61337H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m61374d() {
        this.f39496J.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public void m61375d0() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f39505h) {
            makeupItem.all = 0.7f;
            makeupItem.lut = 0.5f;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m61376e() {
        this.f39494H.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m61377e0() {
        this.f39514q.put(m61341Y(this.f39515r));
        this.f39516s.put(m61341Y(this.f39517t));
        this.f39518u.put(m61341Y(this.f39519v));
        this.f39520w.put(m61341Y(this.f39521x));
        this.f39522y.put(m61341Y(this.f39523z));
        this.f39493G.put(m61341Y(this.f39492F));
        this.f39495I.put(m61341Y(this.f39494H));
        this.f39497K.put(m61341Y(this.f39496J));
        this.f39491E.put(m61341Y(this.f39490D));
    }

    /* JADX INFO: renamed from: f */
    public void m61378f() {
        this.f39512o.put(0);
    }

    /* JADX INFO: renamed from: f0 */
    public void m61379f0(int i) {
        this.f39509l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public void m61380g() {
        this.f39517t.clear();
    }

    /* JADX INFO: renamed from: g0 */
    public void m61381g0(int i) {
        this.f39510m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public List<C11189f.b> m61382h() {
        int i = 0;
        while (true) {
            List<C11189f.b> list = this.f39508k;
            if (i >= 5) {
                return list;
            }
            list.add(new C11189f.b(0.0f, 0.0f, false, false));
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m61383h0(int i) {
        this.f39513p.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public List<FeedMakeupPageAdapter.MakeupItem> m61384i(List<List<CameraBeautyMode>> list) {
        this.f39502e.clear();
        int size = list.size();
        if (size < 5) {
            return this.f39502e;
        }
        String[] strArr = {"无", "自然", "可爱", "女神", "净白"};
        int[] iArr = {f3c0.f94545j0, f3c0.f94409R, f3c0.f94395P, f3c0.f94402Q, f3c0.f94416S};
        int[] iArr2 = {f3c0.f94553k0, 0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            HashMap map = new HashMap();
            for (CameraBeautyMode cameraBeautyMode : list.get(i)) {
                map.put(cameraBeautyMode.type, Float.valueOf(cameraBeautyMode.value));
            }
            List<FeedMakeupPageAdapter.MakeupItem> list2 = this.f39502e;
            if (i == 0) {
                list2.add(new FeedMakeupPageAdapter.MakeupItem(strArr[i], "none", map, iArr[i], iArr2[i]));
            } else {
                list2.add(new FeedMakeupPageAdapter.MakeupItem(strArr[i], "local", map, iArr[i], iArr2[i]));
            }
        }
        return this.f39502e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m61385i0(int i) {
        this.f39511n.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j */
    public List<FeedMakeupPageAdapter.MakeupItem> m61386j() {
        ArrayList arrayList = new ArrayList();
        this.f39503f = arrayList;
        arrayList.add(new FeedMakeupPageAdapter.MakeupItem("磨皮", "skin_smooth", f3c0.f94336H, f3c0.f94344I, m61352F("skin_smooth")));
        this.f39503f.add(new FeedMakeupPageAdapter.MakeupItem("美白", "skin_whitening", f3c0.f94352J, f3c0.f94360K, m61352F("skin_whitening")));
        this.f39503f.add(new FeedMakeupPageAdapter.MakeupItem("红润", "skin_ruddy", f3c0.f94367L, f3c0.f94374M, m61352F("skin_ruddy")));
        this.f39503f.add(new FeedMakeupPageAdapter.MakeupItem("大眼", FaceBeautyID.BIG_EYE, f3c0.f94304D, f3c0.f94312E, m61352F(FaceBeautyID.BIG_EYE)));
        this.f39503f.add(new FeedMakeupPageAdapter.MakeupItem("瘦脸", FaceBeautyID.THIN_FACE, f3c0.f94381N, f3c0.f94388O, m61352F(FaceBeautyID.THIN_FACE)));
        this.f39503f.add(new FeedMakeupPageAdapter.MakeupItem("锐化", "skin_sharpen", f3c0.f94320F, f3c0.f94328G, m61352F("skin_sharpen")));
        return this.f39503f;
    }

    /* JADX INFO: renamed from: j0 */
    public void m61387j0(int i) {
        this.f39512o.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public final MakeUpMenuView.MakeupCategory m61388k(CameraCategory cameraCategory) {
        MakeUpMenuView.MakeupCategory makeupCategory;
        String str = cameraCategory.name;
        str.getClass();
        switch (str) {
            case "修容":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_FACIAL, f3c0.f94330G1, f3c0.f94338H1);
                break;
            case "口红":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_LIPS, f3c0.f94390O1, f3c0.f94397P1);
                break;
            case "眼妆":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_EYES, f3c0.f94376M1, f3c0.f94383N1);
                break;
            case "眉毛":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, f3c0.f94362K1, f3c0.f94369L1);
                break;
            case "美瞳":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_PUPIL, f3c0.f94346I1, f3c0.f94354J1);
                break;
            case "腮红":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_BLUSH, f3c0.f94314E1, f3c0.f94322F1);
                break;
            default:
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, 1004);
                break;
        }
        makeupCategory.all = m61353G(makeupCategory.type);
        return makeupCategory;
    }

    /* JADX INFO: renamed from: l */
    public List<MakeUpMenuView.MakeupCategory> m61389l(List<CameraCategory> list) {
        this.f39501d.clear();
        this.f39501d.add(new MakeUpMenuView.MakeupCategory("一键美颜", 1000));
        this.f39501d.add(new MakeUpMenuView.MakeupCategory("美颜", 1001));
        this.f39501d.add(new MakeUpMenuView.MakeupCategory("微整形", 1002));
        MakeUpMenuView.MakeupCategory makeupCategory = new MakeUpMenuView.MakeupCategory("美妆", 1004);
        MakeUpMenuView.MakeupCategory makeupCategory2 = null;
        for (CameraCategory cameraCategory : list) {
            if ("风格妆".equals(cameraCategory.name)) {
                makeupCategory2 = new MakeUpMenuView.MakeupCategory(cameraCategory, 1003);
            } else {
                makeupCategory.subMenu.add(0, m61388k(cameraCategory));
            }
        }
        makeupCategory.subMenu.add(0, new MakeUpMenuView.MakeupCategory("原图", -1, f3c0.f94545j0, f3c0.f94553k0));
        if (makeupCategory2 != null) {
            this.f39501d.add(makeupCategory2);
        }
        this.f39501d.add(makeupCategory);
        return this.f39501d;
    }

    /* JADX INFO: renamed from: l0 */
    public void m61390l0(String str, float f) {
        this.f39521x.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: m */
    public final FeedMakeupPageAdapter.MakeupItem m61391m(CameraSticker cameraSticker, String str) {
        float fM61349C = m61349C(cameraSticker.modelFilePath, str);
        str.getClass();
        switch (str) {
            case "makeup_blush":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_BLUSH, fM61349C);
            case "makeup_pupil":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_PUPIL, fM61349C);
            case "makeup_facial":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_FACIAL, fM61349C);
            case "makeup_eyes":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_EYES, fM61349C);
            case "makeup_eyebrow":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, fM61349C);
            default:
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_LIPS, fM61349C);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m61392m0(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f39519v.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public final FeedMakeupPageAdapter.MakeupItem m61393n(MakeUpMenuView.MakeupCategory makeupCategory) {
        FeedMakeupPageAdapter.MakeupItem makeupItem = new FeedMakeupPageAdapter.MakeupItem("无", "none", f3c0.f94545j0, f3c0.f94553k0, false);
        makeupItem.extra = makeupCategory.type;
        return makeupItem;
    }

    /* JADX INFO: renamed from: n0 */
    public void m61394n0(String str, Float f) {
        this.f39523z.put(str, f);
    }

    /* JADX INFO: renamed from: o */
    public List<FeedMakeupPageAdapter.MakeupItem> m61395o() {
        ArrayList arrayList = new ArrayList();
        this.f39504g = arrayList;
        arrayList.add(new FeedMakeupPageAdapter.MakeupItem("脸宽", FaceBeautyID.FACE_WIDTH, f3c0.f94619s2, f3c0.f94627t2, false));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("削脸", FaceBeautyID.JAW_SHAPE, f3c0.f94651w2, f3c0.f94659x2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("短脸", FaceBeautyID.SHORTEN_FACE, f3c0.f94419S2, f3c0.f94426T2, false));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("额头", FaceBeautyID.FOREHEAD, f3c0.f94635u2, f3c0.f94643v2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("下巴", FaceBeautyID.CHIN_LENGTH, f3c0.f94539i2, f3c0.f94547j2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("颧骨", FaceBeautyID.CHEEKBONE_WIDTH, f3c0.f94523g2, f3c0.f94531h2, false));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("下颌骨", FaceBeautyID.JAW_WIDTH, f3c0.f94667y2, f3c0.f94675z2, false));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("鼻子宽度", FaceBeautyID.NOSE_WIDTH, f3c0.f94391O2, f3c0.f94398P2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("鼻子大小", FaceBeautyID.NOSE_SIZE, f3c0.f94363K2, f3c0.f94370L2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("鼻高", FaceBeautyID.NOSE_LIFT, f3c0.f94331G2, f3c0.f94339H2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("鼻梁", FaceBeautyID.NOSE_RIDGE_WIDTH, f3c0.f94347I2, f3c0.f94355J2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("鼻尖", FaceBeautyID.NOSE_TIP_SIZE, f3c0.f94377M2, f3c0.f94384N2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("眼睛角度", FaceBeautyID.EYE_TILT, f3c0.f94603q2, f3c0.f94611r2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("眼距", FaceBeautyID.EYE_DISTANCE, f3c0.f94571m2, f3c0.f94579n2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("眼高", FaceBeautyID.EYE_HEIGHT, f3c0.f94587o2, f3c0.f94595p2, false));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("嘴唇厚度", FaceBeautyID.LIP_THICKNESS, f3c0.f94283A2, f3c0.f94291B2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("嘴唇大小", FaceBeautyID.MOUTH_SIZE, f3c0.f94299C2, f3c0.f94307D2, true));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("眼袋", "remove_pouch", f3c0.f94405Q2, f3c0.f94412R2, false));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("祛法令纹", "remove_nasolabial_floads", f3c0.f94315E2, f3c0.f94323F2, false));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("亮眼", "eye_brighten", f3c0.f94555k2, f3c0.f94563l2, false));
        this.f39504g.add(new FeedMakeupPageAdapter.MakeupItem("白牙", "teeth_whiten", f3c0.f94433U2, f3c0.f94440V2, false));
        return this.f39504g;
    }

    /* JADX INFO: renamed from: o0 */
    public void m61396o0(String str, float f) {
        this.f39515r.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: p */
    public List<FeedMakeupPageAdapter.MakeupItem> m61397p(List<CameraSticker> list) {
        this.f39505h.add(new FeedMakeupPageAdapter.MakeupItem("无", "none", f3c0.f94545j0, f3c0.f94553k0, false));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            FeedMakeupPageAdapter.MakeupItem makeupItem = new FeedMakeupPageAdapter.MakeupItem(it.next(), ILightningRender.IMakeupLevel.MAKEUP_ALL);
            Intensity intensityM61359P = m61359P(makeupItem.modelFilePath);
            makeupItem.lut = intensityM61359P.lut;
            makeupItem.all = intensityM61359P.all;
            this.f39505h.add(makeupItem);
        }
        return this.f39505h;
    }

    /* JADX INFO: renamed from: p0 */
    public void m61398p0(String str, float f) {
        this.f39490D.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: q */
    public List<FeedMakeupPageAdapter.MakeupItem> m61399q(MakeUpMenuView.MakeupCategory makeupCategory, List<CameraSticker> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m61393n(makeupCategory));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m61391m(it.next(), makeupCategory.type));
        }
        this.f39506i.put(makeupCategory.f39217id, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public void m61400q0(String str, float f) {
        this.f39492F.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: r */
    public void m61401r() {
        this.f39498a = null;
    }

    /* JADX INFO: renamed from: r0 */
    public void m61402r0(Map<String, Float> map) {
        if (map != null) {
            this.f39492F.clear();
            this.f39492F.putAll(map);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m61403s0(String str, float f) {
        this.f39496J.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: t0 */
    public void m61404t0(String str, float f, float f2) {
        this.f39517t.put(str, new Intensity(f, f2));
    }

    /* JADX INFO: renamed from: v */
    public List<FeedMakeupPageAdapter.MakeupItem> m61405v() {
        return this.f39502e;
    }

    /* JADX INFO: renamed from: w */
    public int m61406w() {
        return this.f39509l.get().intValue();
    }

    /* JADX INFO: renamed from: y */
    public float m61407y(String str) {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f39503f) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }
}
