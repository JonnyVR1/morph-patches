package com.p051p1.mobile.putong.feed.newui.camera.util;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import androidx.lifecycle.C0491t;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.camera.widget.C11352f;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p051p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
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
import p137rx.subjects.C22507a;
import p153l.b0m;
import p153l.lbc0;
import p153l.ua5;
import p153l.vxd0;
import p153l.wyd0;

/* JADX INFO: loaded from: classes13.dex */
public class CameraEffectMgr {
    private static CameraEffectMgr INSTANCE = new CameraEffectMgr();

    /* JADX INFO: renamed from: L */
    public static Map<String, Float> f40331L = new HashMap();

    /* JADX INFO: renamed from: M */
    public static Map<String, Float> f40332M = new HashMap();

    /* JADX INFO: renamed from: N */
    public static Map<String, Float> f40333N = new HashMap();

    /* JADX INFO: renamed from: O */
    public static Map<String, Float> f40334O = new HashMap();

    /* JADX INFO: renamed from: a */
    public b0m f40346a;

    /* JADX INFO: renamed from: b */
    public MakeupSharedViewModel f40347b;

    /* JADX INFO: renamed from: c */
    public Set<Integer> f40348c = new HashSet();

    /* JADX INFO: renamed from: d */
    public List<MakeUpMenuView.MakeupCategory> f40349d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<FeedMakeupPageAdapter.MakeupItem> f40350e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<FeedMakeupPageAdapter.MakeupItem> f40351f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<FeedMakeupPageAdapter.MakeupItem> f40352g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<FeedMakeupPageAdapter.MakeupItem> f40353h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Map<String, List<FeedMakeupPageAdapter.MakeupItem>> f40354i = new ArrayMap();

    /* JADX INFO: renamed from: j */
    public C22507a<FeedMakeupPageAdapter.MakeupItem> f40355j = C22507a.m222758b();

    /* JADX INFO: renamed from: k */
    public List<C11352f.b> f40356k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public vxd0 f40357l = new vxd0("feed_makeup_beautyauto_index", 1);

    /* JADX INFO: renamed from: m */
    public vxd0 f40358m = new vxd0("feed_makeup_beautyface_index", 0);

    /* JADX INFO: renamed from: n */
    public vxd0 f40359n = new vxd0("feed_makeup_microplastic_index", 0);

    /* JADX INFO: renamed from: o */
    public vxd0 f40360o = new vxd0("feed_makeup_stylemakeup_index", 0);

    /* JADX INFO: renamed from: p */
    public vxd0 f40361p = new vxd0("feed_makeup_beautymakeup_index", 0);

    /* JADX INFO: renamed from: q */
    public wyd0 f40362q = new wyd0("feed_makeup_beauty_all", "");

    /* JADX INFO: renamed from: r */
    public Map<String, Float> f40363r = new HashMap();

    /* JADX INFO: renamed from: s */
    public wyd0 f40364s = new wyd0("feed_style_makeup_all", "");

    /* JADX INFO: renamed from: t */
    public Map<String, Intensity> f40365t = new HashMap();

    /* JADX INFO: renamed from: u */
    public wyd0 f40366u = new wyd0("feed_beauty_makeup_index", "");

    /* JADX INFO: renamed from: v */
    public Map<String, Integer> f40367v = new HashMap();

    /* JADX INFO: renamed from: w */
    public wyd0 f40368w = new wyd0("feed_beauty_makeup_cate_value", "");

    /* JADX INFO: renamed from: x */
    public Map<String, Float> f40369x = new HashMap();

    /* JADX INFO: renamed from: y */
    public wyd0 f40370y = new wyd0("feed_beauty_makeup_item_value", "");

    /* JADX INFO: renamed from: z */
    public Map<String, Float> f40371z = new HashMap();

    /* JADX INFO: renamed from: A */
    public Map<Integer, Object> f40335A = new HashMap();

    /* JADX INFO: renamed from: B */
    public Map<String, Integer> f40336B = new HashMap();

    /* JADX INFO: renamed from: C */
    public List<Object> f40337C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public Map<String, Float> f40338D = new HashMap();

    /* JADX INFO: renamed from: E */
    public wyd0 f40339E = new wyd0("feed_makeup_category_show_map", "");

    /* JADX INFO: renamed from: F */
    public Map<String, Float> f40340F = new HashMap();

    /* JADX INFO: renamed from: G */
    public wyd0 f40341G = new wyd0("feed_real_effect_face_beauty", "");

    /* JADX INFO: renamed from: H */
    public HashMap<String, String> f40342H = new HashMap<>();

    /* JADX INFO: renamed from: I */
    public wyd0 f40343I = new wyd0("feed_real_effect_model_list", "");

    /* JADX INFO: renamed from: J */
    public Map<String, Float> f40344J = new HashMap();

    /* JADX INFO: renamed from: K */
    public wyd0 f40345K = new wyd0("feed_real_effect_intensity_list", "");

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
        f40331L.put("skin_smooth", Float.valueOf(0.33f));
        f40331L.put("skin_whitening", Float.valueOf(0.52f));
        Map<String, Float> map = f40331L;
        Float fValueOf = Float.valueOf(0.5f);
        map.put("skin_ruddy", fValueOf);
        f40331L.put(FaceBeautyID.BIG_EYE, Float.valueOf(0.25f));
        Map<String, Float> map2 = f40331L;
        Float fValueOf2 = Float.valueOf(0.4f);
        map2.put(FaceBeautyID.THIN_FACE, fValueOf2);
        Map<String, Float> map3 = f40331L;
        Float fValueOf3 = Float.valueOf(0.7f);
        map3.put("skin_sharpen", fValueOf3);
        f40331L.put(FaceBeautyID.NOSE_SIZE, Float.valueOf(0.3f));
        f40331L.put("eye_brighten", fValueOf2);
        f40331L.put("teeth_whiten", fValueOf2);
        f40332M.put("skin_smooth", fValueOf3);
        f40332M.put("skin_whitening", fValueOf2);
        f40332M.put("skin_ruddy", fValueOf);
        f40332M.put(FaceBeautyID.BIG_EYE, fValueOf2);
        f40332M.put(FaceBeautyID.THIN_FACE, fValueOf);
        f40332M.put("skin_sharpen", fValueOf);
        Map<String, Float> map4 = f40332M;
        Float fValueOf4 = Float.valueOf(0.0f);
        map4.put(FaceBeautyID.FACE_WIDTH, fValueOf4);
        f40332M.put(FaceBeautyID.JAW_SHAPE, fValueOf4);
        f40332M.put(FaceBeautyID.SHORTEN_FACE, fValueOf4);
        f40332M.put(FaceBeautyID.FOREHEAD, fValueOf4);
        f40332M.put(FaceBeautyID.CHIN_LENGTH, fValueOf4);
        f40332M.put(FaceBeautyID.CHEEKBONE_WIDTH, fValueOf4);
        f40332M.put(FaceBeautyID.JAW_WIDTH, fValueOf4);
        f40332M.put(FaceBeautyID.NOSE_WIDTH, fValueOf4);
        f40332M.put(FaceBeautyID.NOSE_SIZE, fValueOf4);
        f40332M.put(FaceBeautyID.NOSE_LIFT, fValueOf4);
        f40332M.put(FaceBeautyID.NOSE_RIDGE_WIDTH, fValueOf4);
        f40332M.put(FaceBeautyID.NOSE_TIP_SIZE, fValueOf4);
        f40332M.put(FaceBeautyID.EYE_TILT, fValueOf4);
        f40332M.put(FaceBeautyID.EYE_DISTANCE, fValueOf4);
        f40332M.put(FaceBeautyID.EYE_HEIGHT, fValueOf4);
        f40332M.put(FaceBeautyID.LIP_THICKNESS, fValueOf4);
        f40332M.put(FaceBeautyID.MOUTH_SIZE, fValueOf4);
        f40332M.put("remove_pouch", fValueOf4);
        f40332M.put("remove_nasolabial_floads", fValueOf4);
        f40332M.put("eye_brighten", fValueOf4);
        f40332M.put("teeth_whiten", fValueOf4);
        f40333N.put(ILightningRender.IMakeupLevel.MAKEUP_LIPS, fValueOf3);
        f40333N.put(ILightningRender.IMakeupLevel.MAKEUP_BLUSH, fValueOf2);
        f40333N.put(ILightningRender.IMakeupLevel.MAKEUP_EYES, Float.valueOf(0.6f));
        f40333N.put(ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, fValueOf);
        f40333N.put(ILightningRender.IMakeupLevel.MAKEUP_PUPIL, fValueOf2);
        f40333N.put(ILightningRender.IMakeupLevel.MAKEUP_FACIAL, fValueOf2);
        f40334O.put(ILightningRender.IMakeupLevel.MAKEUP_LUT, fValueOf);
        f40334O.put(ILightningRender.IMakeupLevel.MAKEUP_ALL, fValueOf3);
    }

    public CameraEffectMgr() {
        this.f40335A.put(4, this.f40337C);
    }

    /* JADX INFO: renamed from: B */
    public static float m62520B(String str) {
        Float f = f40333N.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: H */
    public static float m62521H(String str) {
        Float f;
        if (TextUtils.isEmpty(str) || (f = f40332M.get(str)) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: I */
    public static float m62522I(int i) {
        return new BigDecimal(i / 100.0f).setScale(2, 5).floatValue();
    }

    /* JADX INFO: renamed from: N */
    public static Intensity m62523N(String str, Map<String, Intensity> map) {
        if (TextUtils.isEmpty(str)) {
            return new Intensity(0.5f, 0.7f);
        }
        Intensity intensity = map.get(str);
        return intensity == null ? new Intensity(0.5f, 0.7f) : intensity;
    }

    /* JADX INFO: renamed from: V */
    public static CameraEffectMgr m62524V() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static String m62525Y(Object obj) {
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
                    ua5.m195158b(byteArrayOutputStream);
                    ua5.m195158b(objectOutputStream);
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
    public static Object m62526k0(String str) {
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
                    ua5.m195158b(byteArrayInputStream);
                    ua5.m195158b(objectInputStream);
                    return null;
                } catch (ClassNotFoundException unused2) {
                    ua5.m195158b(byteArrayInputStream);
                    ua5.m195158b(objectInputStream);
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
    public static float m62527s(int i) {
        return new BigDecimal(((i / 100.0f) * 2.0f) - 1.0f).setScale(2, 4).floatValue();
    }

    /* JADX INFO: renamed from: t */
    public static int m62528t(float f) {
        return (int) ((((f - (-1.0f)) / 2.0f) * 100.0f) + 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public static int m62529u(boolean z, float f) {
        return z ? m62528t(f) : (int) (f * 100.0f);
    }

    /* JADX INFO: renamed from: x */
    public static float m62530x(String str) {
        Float f = f40332M.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: z */
    public static float m62531z(String str, Map<String, Float> map) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        Float f = map.get(str);
        return f == null ? m62530x(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: A */
    public int m62532A() {
        return this.f40358m.get().intValue();
    }

    /* JADX INFO: renamed from: C */
    public float m62533C(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m62520B(str2);
        }
        Float f = this.f40371z.get(str);
        return f == null ? m62520B(str2) : f.floatValue();
    }

    /* JADX INFO: renamed from: D */
    public int m62534D(String str) {
        Integer num = this.f40367v.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: E */
    public int m62535E() {
        return this.f40361p.get().intValue();
    }

    /* JADX INFO: renamed from: F */
    public float m62536F(String str) {
        return m62531z(str, this.f40363r);
    }

    /* JADX INFO: renamed from: G */
    public float m62537G(String str) {
        Float f = this.f40338D.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: J */
    public List<MakeUpMenuView.MakeupCategory> m62538J() {
        return this.f40349d;
    }

    /* JADX INFO: renamed from: K */
    public float m62539K(String str) {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f40352g) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: L */
    public int m62540L() {
        return this.f40359n.get().intValue();
    }

    /* JADX INFO: renamed from: M */
    public List<FeedMakeupPageAdapter.MakeupItem> m62541M() {
        return this.f40353h;
    }

    /* JADX INFO: renamed from: O */
    public int m62542O() {
        return this.f40360o.get().intValue();
    }

    /* JADX INFO: renamed from: P */
    public Intensity m62543P(String str) {
        return m62523N(str, this.f40365t);
    }

    /* JADX INFO: renamed from: Q */
    public List<FeedMakeupPageAdapter.MakeupItem> m62544Q(MakeUpMenuView.MakeupCategory makeupCategory) {
        List<FeedMakeupPageAdapter.MakeupItem> list = this.f40354i.get(makeupCategory.f40065id);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: R */
    public boolean m62545R() {
        return this.f40367v.size() != 0;
    }

    /* JADX INFO: renamed from: S */
    public void m62546S() {
        String str = this.f40341G.get();
        Object objM62526k0 = m62526k0(str);
        if (objM62526k0 instanceof Map) {
            this.f40340F = (Map) objM62526k0;
        }
        Object objM62526k1 = m62526k0(this.f40343I.get());
        if (objM62526k1 instanceof HashMap) {
            this.f40342H = (HashMap) objM62526k1;
        }
        Object objM62526k2 = m62526k0(this.f40345K.get());
        if (objM62526k2 instanceof Map) {
            this.f40344J = (Map) objM62526k2;
        }
        Object objM62526k3 = m62526k0(this.f40362q.get());
        if (objM62526k3 instanceof Map) {
            this.f40363r = (Map) objM62526k3;
        }
        Object objM62526k4 = m62526k0(this.f40364s.get());
        if (objM62526k4 instanceof Map) {
            this.f40365t = (Map) objM62526k4;
        }
        Object objM62526k5 = m62526k0(this.f40366u.get());
        if (objM62526k5 instanceof Map) {
            this.f40367v = (Map) objM62526k5;
        }
        Object objM62526k6 = m62526k0(this.f40368w.get());
        if (objM62526k6 instanceof Map) {
            this.f40369x = (Map) objM62526k6;
        }
        Object objM62526k7 = m62526k0(this.f40370y.get());
        if (objM62526k7 instanceof Map) {
            this.f40371z = (Map) objM62526k7;
        }
        Object objM62526k8 = m62526k0(this.f40339E.get());
        if (objM62526k8 instanceof Map) {
            this.f40338D = (Map) objM62526k8;
        }
        if (TextUtils.isEmpty(str)) {
            this.f40340F.putAll(f40331L);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m62547T(b0m b0mVar) {
        this.f40346a = b0mVar;
    }

    /* JADX INFO: renamed from: U */
    public void m62548U(Act act) {
        this.f40347b = (MakeupSharedViewModel) new C0491t(act).m3074a(MakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: W */
    public void m62549W() {
        if (this.f40346a != null) {
            Map<String, Float> map = this.f40340F;
            if (map != null) {
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    this.f40346a.setFaceBeautyValue(entry.getKey(), entry.getValue().floatValue());
                }
            }
            HashMap<String, String> map2 = this.f40342H;
            if (map2 != null && map2.size() > 0) {
                for (String str : this.f40342H.values()) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f40346a.mo101324u(str);
                    }
                }
            }
            Map<String, Float> map3 = this.f40344J;
            if (map3 != null) {
                for (Map.Entry<String, Float> entry2 : map3.entrySet()) {
                    this.f40346a.mo101321o(entry2.getKey(), entry2.getValue().floatValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public MakeupSharedViewModel m62550X() {
        return this.f40347b;
    }

    /* JADX INFO: renamed from: Z */
    public void m62551Z() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f40351f) {
            makeupItem.all = m62521H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m62552a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.equals(this.f40342H.get(str))) {
            return;
        }
        this.f40342H.put(str, str2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m62553a0() {
        this.f40363r.putAll(f40332M);
    }

    /* JADX INFO: renamed from: b */
    public void m62554b() {
        this.f40367v.clear();
    }

    /* JADX INFO: renamed from: b0 */
    public void m62555b0() {
        for (List<FeedMakeupPageAdapter.MakeupItem> list : this.f40354i.values()) {
            if (list != null) {
                for (FeedMakeupPageAdapter.MakeupItem makeupItem : list) {
                    makeupItem.all = m62520B(makeupItem.type);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m62556c() {
        this.f40338D.clear();
    }

    /* JADX INFO: renamed from: c0 */
    public void m62557c0() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f40352g) {
            makeupItem.all = m62521H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m62558d() {
        this.f40344J.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public void m62559d0() {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f40353h) {
            makeupItem.all = 0.7f;
            makeupItem.lut = 0.5f;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m62560e() {
        this.f40342H.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m62561e0() {
        this.f40362q.put(m62525Y(this.f40363r));
        this.f40364s.put(m62525Y(this.f40365t));
        this.f40366u.put(m62525Y(this.f40367v));
        this.f40368w.put(m62525Y(this.f40369x));
        this.f40370y.put(m62525Y(this.f40371z));
        this.f40341G.put(m62525Y(this.f40340F));
        this.f40343I.put(m62525Y(this.f40342H));
        this.f40345K.put(m62525Y(this.f40344J));
        this.f40339E.put(m62525Y(this.f40338D));
    }

    /* JADX INFO: renamed from: f */
    public void m62562f() {
        this.f40360o.put(0);
    }

    /* JADX INFO: renamed from: f0 */
    public void m62563f0(int i) {
        this.f40357l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public void m62564g() {
        this.f40365t.clear();
    }

    /* JADX INFO: renamed from: g0 */
    public void m62565g0(int i) {
        this.f40358m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public List<C11352f.b> m62566h() {
        int i = 0;
        while (true) {
            List<C11352f.b> list = this.f40356k;
            if (i >= 5) {
                return list;
            }
            list.add(new C11352f.b(0.0f, 0.0f, false, false));
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m62567h0(int i) {
        this.f40361p.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public List<FeedMakeupPageAdapter.MakeupItem> m62568i(List<List<CameraBeautyMode>> list) {
        this.f40350e.clear();
        int size = list.size();
        if (size < 5) {
            return this.f40350e;
        }
        String[] strArr = {"无", "自然", "可爱", "女神", "净白"};
        int[] iArr = {lbc0.f131063j0, lbc0.f130927R, lbc0.f130913P, lbc0.f130920Q, lbc0.f130934S};
        int[] iArr2 = {lbc0.f131071k0, 0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            HashMap map = new HashMap();
            for (CameraBeautyMode cameraBeautyMode : list.get(i)) {
                map.put(cameraBeautyMode.type, Float.valueOf(cameraBeautyMode.value));
            }
            List<FeedMakeupPageAdapter.MakeupItem> list2 = this.f40350e;
            if (i == 0) {
                list2.add(new FeedMakeupPageAdapter.MakeupItem(strArr[i], "none", map, iArr[i], iArr2[i]));
            } else {
                list2.add(new FeedMakeupPageAdapter.MakeupItem(strArr[i], "local", map, iArr[i], iArr2[i]));
            }
        }
        return this.f40350e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m62569i0(int i) {
        this.f40359n.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j */
    public List<FeedMakeupPageAdapter.MakeupItem> m62570j() {
        ArrayList arrayList = new ArrayList();
        this.f40351f = arrayList;
        arrayList.add(new FeedMakeupPageAdapter.MakeupItem("磨皮", "skin_smooth", lbc0.f130854H, lbc0.f130862I, m62536F("skin_smooth")));
        this.f40351f.add(new FeedMakeupPageAdapter.MakeupItem("美白", "skin_whitening", lbc0.f130870J, lbc0.f130878K, m62536F("skin_whitening")));
        this.f40351f.add(new FeedMakeupPageAdapter.MakeupItem("红润", "skin_ruddy", lbc0.f130885L, lbc0.f130892M, m62536F("skin_ruddy")));
        this.f40351f.add(new FeedMakeupPageAdapter.MakeupItem("大眼", FaceBeautyID.BIG_EYE, lbc0.f130822D, lbc0.f130830E, m62536F(FaceBeautyID.BIG_EYE)));
        this.f40351f.add(new FeedMakeupPageAdapter.MakeupItem("瘦脸", FaceBeautyID.THIN_FACE, lbc0.f130899N, lbc0.f130906O, m62536F(FaceBeautyID.THIN_FACE)));
        this.f40351f.add(new FeedMakeupPageAdapter.MakeupItem("锐化", "skin_sharpen", lbc0.f130838F, lbc0.f130846G, m62536F("skin_sharpen")));
        return this.f40351f;
    }

    /* JADX INFO: renamed from: j0 */
    public void m62571j0(int i) {
        this.f40360o.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public final MakeUpMenuView.MakeupCategory m62572k(CameraCategory cameraCategory) {
        MakeUpMenuView.MakeupCategory makeupCategory;
        String str = cameraCategory.name;
        str.getClass();
        switch (str) {
            case "修容":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_FACIAL, lbc0.f130848G1, lbc0.f130856H1);
                break;
            case "口红":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_LIPS, lbc0.f130908O1, lbc0.f130915P1);
                break;
            case "眼妆":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_EYES, lbc0.f130894M1, lbc0.f130901N1);
                break;
            case "眉毛":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, lbc0.f130880K1, lbc0.f130887L1);
                break;
            case "美瞳":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_PUPIL, lbc0.f130864I1, lbc0.f130872J1);
                break;
            case "腮红":
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_BLUSH, lbc0.f130832E1, lbc0.f130840F1);
                break;
            default:
                makeupCategory = new MakeUpMenuView.MakeupCategory(cameraCategory, 1004);
                break;
        }
        makeupCategory.all = m62537G(makeupCategory.type);
        return makeupCategory;
    }

    /* JADX INFO: renamed from: l */
    public List<MakeUpMenuView.MakeupCategory> m62573l(List<CameraCategory> list) {
        this.f40349d.clear();
        this.f40349d.add(new MakeUpMenuView.MakeupCategory("一键美颜", 1000));
        this.f40349d.add(new MakeUpMenuView.MakeupCategory("美颜", 1001));
        this.f40349d.add(new MakeUpMenuView.MakeupCategory("微整形", 1002));
        MakeUpMenuView.MakeupCategory makeupCategory = new MakeUpMenuView.MakeupCategory("美妆", 1004);
        MakeUpMenuView.MakeupCategory makeupCategory2 = null;
        for (CameraCategory cameraCategory : list) {
            if ("风格妆".equals(cameraCategory.name)) {
                makeupCategory2 = new MakeUpMenuView.MakeupCategory(cameraCategory, 1003);
            } else {
                makeupCategory.subMenu.add(0, m62572k(cameraCategory));
            }
        }
        makeupCategory.subMenu.add(0, new MakeUpMenuView.MakeupCategory("原图", -1, lbc0.f131063j0, lbc0.f131071k0));
        if (makeupCategory2 != null) {
            this.f40349d.add(makeupCategory2);
        }
        this.f40349d.add(makeupCategory);
        return this.f40349d;
    }

    /* JADX INFO: renamed from: l0 */
    public void m62574l0(String str, float f) {
        this.f40369x.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: m */
    public final FeedMakeupPageAdapter.MakeupItem m62575m(CameraSticker cameraSticker, String str) {
        float fM62533C = m62533C(cameraSticker.modelFilePath, str);
        str.getClass();
        switch (str) {
            case "makeup_blush":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_BLUSH, fM62533C);
            case "makeup_pupil":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_PUPIL, fM62533C);
            case "makeup_facial":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_FACIAL, fM62533C);
            case "makeup_eyes":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_EYES, fM62533C);
            case "makeup_eyebrow":
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, fM62533C);
            default:
                return new FeedMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_LIPS, fM62533C);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m62576m0(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40367v.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public final FeedMakeupPageAdapter.MakeupItem m62577n(MakeUpMenuView.MakeupCategory makeupCategory) {
        FeedMakeupPageAdapter.MakeupItem makeupItem = new FeedMakeupPageAdapter.MakeupItem("无", "none", lbc0.f131063j0, lbc0.f131071k0, false);
        makeupItem.extra = makeupCategory.type;
        return makeupItem;
    }

    /* JADX INFO: renamed from: n0 */
    public void m62578n0(String str, Float f) {
        this.f40371z.put(str, f);
    }

    /* JADX INFO: renamed from: o */
    public List<FeedMakeupPageAdapter.MakeupItem> m62579o() {
        ArrayList arrayList = new ArrayList();
        this.f40352g = arrayList;
        arrayList.add(new FeedMakeupPageAdapter.MakeupItem("脸宽", FaceBeautyID.FACE_WIDTH, lbc0.f131137s2, lbc0.f131145t2, false));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("削脸", FaceBeautyID.JAW_SHAPE, lbc0.f131169w2, lbc0.f131177x2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("短脸", FaceBeautyID.SHORTEN_FACE, lbc0.f130937S2, lbc0.f130944T2, false));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("额头", FaceBeautyID.FOREHEAD, lbc0.f131153u2, lbc0.f131161v2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("下巴", FaceBeautyID.CHIN_LENGTH, lbc0.f131057i2, lbc0.f131065j2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("颧骨", FaceBeautyID.CHEEKBONE_WIDTH, lbc0.f131041g2, lbc0.f131049h2, false));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("下颌骨", FaceBeautyID.JAW_WIDTH, lbc0.f131185y2, lbc0.f131193z2, false));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("鼻子宽度", FaceBeautyID.NOSE_WIDTH, lbc0.f130909O2, lbc0.f130916P2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("鼻子大小", FaceBeautyID.NOSE_SIZE, lbc0.f130881K2, lbc0.f130888L2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("鼻高", FaceBeautyID.NOSE_LIFT, lbc0.f130849G2, lbc0.f130857H2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("鼻梁", FaceBeautyID.NOSE_RIDGE_WIDTH, lbc0.f130865I2, lbc0.f130873J2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("鼻尖", FaceBeautyID.NOSE_TIP_SIZE, lbc0.f130895M2, lbc0.f130902N2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("眼睛角度", FaceBeautyID.EYE_TILT, lbc0.f131121q2, lbc0.f131129r2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("眼距", FaceBeautyID.EYE_DISTANCE, lbc0.f131089m2, lbc0.f131097n2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("眼高", FaceBeautyID.EYE_HEIGHT, lbc0.f131105o2, lbc0.f131113p2, false));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("嘴唇厚度", FaceBeautyID.LIP_THICKNESS, lbc0.f130801A2, lbc0.f130809B2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("嘴唇大小", FaceBeautyID.MOUTH_SIZE, lbc0.f130817C2, lbc0.f130825D2, true));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("眼袋", "remove_pouch", lbc0.f130923Q2, lbc0.f130930R2, false));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("祛法令纹", "remove_nasolabial_floads", lbc0.f130833E2, lbc0.f130841F2, false));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("亮眼", "eye_brighten", lbc0.f131073k2, lbc0.f131081l2, false));
        this.f40352g.add(new FeedMakeupPageAdapter.MakeupItem("白牙", "teeth_whiten", lbc0.f130951U2, lbc0.f130958V2, false));
        return this.f40352g;
    }

    /* JADX INFO: renamed from: o0 */
    public void m62580o0(String str, float f) {
        this.f40363r.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: p */
    public List<FeedMakeupPageAdapter.MakeupItem> m62581p(List<CameraSticker> list) {
        this.f40353h.add(new FeedMakeupPageAdapter.MakeupItem("无", "none", lbc0.f131063j0, lbc0.f131071k0, false));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            FeedMakeupPageAdapter.MakeupItem makeupItem = new FeedMakeupPageAdapter.MakeupItem(it.next(), ILightningRender.IMakeupLevel.MAKEUP_ALL);
            Intensity intensityM62543P = m62543P(makeupItem.modelFilePath);
            makeupItem.lut = intensityM62543P.lut;
            makeupItem.all = intensityM62543P.all;
            this.f40353h.add(makeupItem);
        }
        return this.f40353h;
    }

    /* JADX INFO: renamed from: p0 */
    public void m62582p0(String str, float f) {
        this.f40338D.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: q */
    public List<FeedMakeupPageAdapter.MakeupItem> m62583q(MakeUpMenuView.MakeupCategory makeupCategory, List<CameraSticker> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m62577n(makeupCategory));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m62575m(it.next(), makeupCategory.type));
        }
        this.f40354i.put(makeupCategory.f40065id, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public void m62584q0(String str, float f) {
        this.f40340F.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: r */
    public void m62585r() {
        this.f40346a = null;
    }

    /* JADX INFO: renamed from: r0 */
    public void m62586r0(Map<String, Float> map) {
        if (map != null) {
            this.f40340F.clear();
            this.f40340F.putAll(map);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m62587s0(String str, float f) {
        this.f40344J.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: t0 */
    public void m62588t0(String str, float f, float f2) {
        this.f40365t.put(str, new Intensity(f, f2));
    }

    /* JADX INFO: renamed from: v */
    public List<FeedMakeupPageAdapter.MakeupItem> m62589v() {
        return this.f40350e;
    }

    /* JADX INFO: renamed from: w */
    public int m62590w() {
        return this.f40357l.get().intValue();
    }

    /* JADX INFO: renamed from: y */
    public float m62591y(String str) {
        for (FeedMakeupPageAdapter.MakeupItem makeupItem : this.f40351f) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }
}
