package com.p051p1.mobile.putong.account.p055ui.camera;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import androidx.lifecycle.C0491t;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.data.CameraBeautyMode;
import com.p051p1.mobile.putong.account.data.CameraCategory;
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.AccountMakeupPageAdapter;
import com.p051p1.mobile.putong.account.p055ui.camera.view.AccountMakeUpMenuView;
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
import p153l.C18249ks;
import p153l.InterfaceC16801ep;
import p153l.bbc0;
import p153l.ua5;
import p153l.vxd0;
import p153l.wyd0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraEffectMgr {
    private static AccountCameraEffectMgr INSTANCE = new AccountCameraEffectMgr();

    /* JADX INFO: renamed from: L */
    public static Map<String, Float> f17335L = new HashMap();

    /* JADX INFO: renamed from: M */
    public static Map<String, Float> f17336M = new HashMap();

    /* JADX INFO: renamed from: N */
    public static Map<String, Float> f17337N = new HashMap();

    /* JADX INFO: renamed from: O */
    public static Map<String, Float> f17338O = new HashMap();

    /* JADX INFO: renamed from: a */
    public InterfaceC16801ep f17350a;

    /* JADX INFO: renamed from: b */
    public AccountMakeupSharedViewModel f17351b;

    /* JADX INFO: renamed from: c */
    public Set<Integer> f17352c = new HashSet();

    /* JADX INFO: renamed from: d */
    public List<AccountMakeUpMenuView.MakeupCategory> f17353d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<AccountMakeupPageAdapter.MakeupItem> f17354e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<AccountMakeupPageAdapter.MakeupItem> f17355f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<AccountMakeupPageAdapter.MakeupItem> f17356g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<AccountMakeupPageAdapter.MakeupItem> f17357h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Map<String, List<AccountMakeupPageAdapter.MakeupItem>> f17358i = new ArrayMap();

    /* JADX INFO: renamed from: j */
    public C22507a<AccountMakeupPageAdapter.MakeupItem> f17359j = C22507a.m222758b();

    /* JADX INFO: renamed from: k */
    public List<C18249ks.b> f17360k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public vxd0 f17361l = new vxd0("account_makeup_beautyauto_index", 1);

    /* JADX INFO: renamed from: m */
    public vxd0 f17362m = new vxd0("account_makeup_beautyface_index", 0);

    /* JADX INFO: renamed from: n */
    public vxd0 f17363n = new vxd0("account_makeup_microplastic_index", 0);

    /* JADX INFO: renamed from: o */
    public vxd0 f17364o = new vxd0("account_makeup_stylemakeup_index", 0);

    /* JADX INFO: renamed from: p */
    public vxd0 f17365p = new vxd0("account_makeup_beautymakeup_index", 0);

    /* JADX INFO: renamed from: q */
    public wyd0 f17366q = new wyd0("account_makeup_beauty_all", "");

    /* JADX INFO: renamed from: r */
    public Map<String, Float> f17367r = new HashMap();

    /* JADX INFO: renamed from: s */
    public wyd0 f17368s = new wyd0("account_style_makeup_all", "");

    /* JADX INFO: renamed from: t */
    public Map<String, Intensity> f17369t = new HashMap();

    /* JADX INFO: renamed from: u */
    public wyd0 f17370u = new wyd0("account_beauty_makeup_index", "");

    /* JADX INFO: renamed from: v */
    public Map<String, Integer> f17371v = new HashMap();

    /* JADX INFO: renamed from: w */
    public wyd0 f17372w = new wyd0("account_beauty_makeup_cate_value", "");

    /* JADX INFO: renamed from: x */
    public Map<String, Float> f17373x = new HashMap();

    /* JADX INFO: renamed from: y */
    public wyd0 f17374y = new wyd0("account_beauty_makeup_item_value", "");

    /* JADX INFO: renamed from: z */
    public Map<String, Float> f17375z = new HashMap();

    /* JADX INFO: renamed from: A */
    public Map<Integer, Object> f17339A = new HashMap();

    /* JADX INFO: renamed from: B */
    public Map<String, Integer> f17340B = new HashMap();

    /* JADX INFO: renamed from: C */
    public List<Object> f17341C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public Map<String, Float> f17342D = new HashMap();

    /* JADX INFO: renamed from: E */
    public wyd0 f17343E = new wyd0("account_makeup_category_show_map", "");

    /* JADX INFO: renamed from: F */
    public Map<String, Float> f17344F = new HashMap();

    /* JADX INFO: renamed from: G */
    public wyd0 f17345G = new wyd0("account_real_effect_face_beauty", "");

    /* JADX INFO: renamed from: H */
    public HashMap<String, String> f17346H = new HashMap<>();

    /* JADX INFO: renamed from: I */
    public wyd0 f17347I = new wyd0("account_real_effect_model_list", "");

    /* JADX INFO: renamed from: J */
    public Map<String, Float> f17348J = new HashMap();

    /* JADX INFO: renamed from: K */
    public wyd0 f17349K = new wyd0("account_real_effect_intensity_list", "");

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
        f17335L.put("skin_smooth", Float.valueOf(0.33f));
        f17335L.put("skin_whitening", Float.valueOf(0.52f));
        Map<String, Float> map = f17335L;
        Float fValueOf = Float.valueOf(0.5f);
        map.put("skin_ruddy", fValueOf);
        f17335L.put(FaceBeautyID.BIG_EYE, Float.valueOf(0.25f));
        Map<String, Float> map2 = f17335L;
        Float fValueOf2 = Float.valueOf(0.4f);
        map2.put(FaceBeautyID.THIN_FACE, fValueOf2);
        Map<String, Float> map3 = f17335L;
        Float fValueOf3 = Float.valueOf(0.7f);
        map3.put("skin_sharpen", fValueOf3);
        f17335L.put(FaceBeautyID.NOSE_SIZE, Float.valueOf(0.3f));
        f17335L.put("eye_brighten", fValueOf2);
        f17335L.put("teeth_whiten", fValueOf2);
        f17336M.put("skin_smooth", fValueOf3);
        f17336M.put("skin_whitening", fValueOf2);
        f17336M.put("skin_ruddy", fValueOf);
        f17336M.put(FaceBeautyID.BIG_EYE, fValueOf2);
        f17336M.put(FaceBeautyID.THIN_FACE, fValueOf);
        f17336M.put("skin_sharpen", fValueOf);
        Map<String, Float> map4 = f17336M;
        Float fValueOf4 = Float.valueOf(0.0f);
        map4.put(FaceBeautyID.FACE_WIDTH, fValueOf4);
        f17336M.put(FaceBeautyID.JAW_SHAPE, fValueOf4);
        f17336M.put(FaceBeautyID.SHORTEN_FACE, fValueOf4);
        f17336M.put(FaceBeautyID.FOREHEAD, fValueOf4);
        f17336M.put(FaceBeautyID.CHIN_LENGTH, fValueOf4);
        f17336M.put(FaceBeautyID.CHEEKBONE_WIDTH, fValueOf4);
        f17336M.put(FaceBeautyID.JAW_WIDTH, fValueOf4);
        f17336M.put(FaceBeautyID.NOSE_WIDTH, fValueOf4);
        f17336M.put(FaceBeautyID.NOSE_SIZE, fValueOf4);
        f17336M.put(FaceBeautyID.NOSE_LIFT, fValueOf4);
        f17336M.put(FaceBeautyID.NOSE_RIDGE_WIDTH, fValueOf4);
        f17336M.put(FaceBeautyID.NOSE_TIP_SIZE, fValueOf4);
        f17336M.put(FaceBeautyID.EYE_TILT, fValueOf4);
        f17336M.put(FaceBeautyID.EYE_DISTANCE, fValueOf4);
        f17336M.put(FaceBeautyID.EYE_HEIGHT, fValueOf4);
        f17336M.put(FaceBeautyID.LIP_THICKNESS, fValueOf4);
        f17336M.put(FaceBeautyID.MOUTH_SIZE, fValueOf4);
        f17336M.put("remove_pouch", fValueOf4);
        f17336M.put("remove_nasolabial_floads", fValueOf4);
        f17336M.put("eye_brighten", fValueOf4);
        f17336M.put("teeth_whiten", fValueOf4);
        f17337N.put(ILightningRender.IMakeupLevel.MAKEUP_LIPS, fValueOf3);
        f17337N.put(ILightningRender.IMakeupLevel.MAKEUP_BLUSH, fValueOf2);
        f17337N.put(ILightningRender.IMakeupLevel.MAKEUP_EYES, Float.valueOf(0.6f));
        f17337N.put(ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, fValueOf);
        f17337N.put(ILightningRender.IMakeupLevel.MAKEUP_PUPIL, fValueOf2);
        f17337N.put(ILightningRender.IMakeupLevel.MAKEUP_FACIAL, fValueOf2);
        f17338O.put(ILightningRender.IMakeupLevel.MAKEUP_LUT, fValueOf);
        f17338O.put(ILightningRender.IMakeupLevel.MAKEUP_ALL, fValueOf3);
    }

    public AccountCameraEffectMgr() {
        this.f17339A.put(4, this.f17341C);
    }

    /* JADX INFO: renamed from: B */
    public static float m29693B(String str) {
        Float f = f17337N.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: H */
    public static float m29694H(String str) {
        Float f;
        if (TextUtils.isEmpty(str) || (f = f17336M.get(str)) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: I */
    public static float m29695I(int i) {
        return new BigDecimal(i / 100.0f).setScale(2, 5).floatValue();
    }

    /* JADX INFO: renamed from: N */
    public static Intensity m29696N(String str, Map<String, Intensity> map) {
        if (TextUtils.isEmpty(str)) {
            return new Intensity(0.5f, 0.7f);
        }
        Intensity intensity = map.get(str);
        return intensity == null ? new Intensity(0.5f, 0.7f) : intensity;
    }

    /* JADX INFO: renamed from: V */
    public static AccountCameraEffectMgr m29697V() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static String m29698Y(Object obj) {
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
    public static Object m29699k0(String str) {
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
    public static float m29700s(int i) {
        return new BigDecimal(((i / 100.0f) * 2.0f) - 1.0f).setScale(2, 4).floatValue();
    }

    /* JADX INFO: renamed from: t */
    public static int m29701t(float f) {
        return (int) ((((f - (-1.0f)) / 2.0f) * 100.0f) + 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public static int m29702u(boolean z, float f) {
        return z ? m29701t(f) : (int) (f * 100.0f);
    }

    /* JADX INFO: renamed from: x */
    public static float m29703x(String str) {
        Float f = f17336M.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: z */
    public static float m29704z(String str, Map<String, Float> map) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        Float f = map.get(str);
        return f == null ? m29703x(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: A */
    public int m29705A() {
        return this.f17362m.get().intValue();
    }

    /* JADX INFO: renamed from: C */
    public float m29706C(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m29693B(str2);
        }
        Float f = this.f17375z.get(str);
        return f == null ? m29693B(str2) : f.floatValue();
    }

    /* JADX INFO: renamed from: D */
    public int m29707D(String str) {
        Integer num = this.f17371v.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: E */
    public int m29708E() {
        return this.f17365p.get().intValue();
    }

    /* JADX INFO: renamed from: F */
    public float m29709F(String str) {
        return m29704z(str, this.f17367r);
    }

    /* JADX INFO: renamed from: G */
    public float m29710G(String str) {
        Float f = this.f17342D.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: J */
    public List<AccountMakeUpMenuView.MakeupCategory> m29711J() {
        return this.f17353d;
    }

    /* JADX INFO: renamed from: K */
    public float m29712K(String str) {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f17356g) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: L */
    public int m29713L() {
        return this.f17363n.get().intValue();
    }

    /* JADX INFO: renamed from: M */
    public List<AccountMakeupPageAdapter.MakeupItem> m29714M() {
        return this.f17357h;
    }

    /* JADX INFO: renamed from: O */
    public int m29715O() {
        return this.f17364o.get().intValue();
    }

    /* JADX INFO: renamed from: P */
    public Intensity m29716P(String str) {
        return m29696N(str, this.f17369t);
    }

    /* JADX INFO: renamed from: Q */
    public List<AccountMakeupPageAdapter.MakeupItem> m29717Q(AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        List<AccountMakeupPageAdapter.MakeupItem> list = this.f17358i.get(makeupCategory.f17061id);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: R */
    public boolean m29718R() {
        return this.f17371v.size() != 0;
    }

    /* JADX INFO: renamed from: S */
    public void m29719S() {
        String str = this.f17345G.get();
        Object objM29699k0 = m29699k0(str);
        if (objM29699k0 instanceof Map) {
            this.f17344F = (Map) objM29699k0;
        }
        Object objM29699k1 = m29699k0(this.f17347I.get());
        if (objM29699k1 instanceof HashMap) {
            this.f17346H = (HashMap) objM29699k1;
        }
        Object objM29699k2 = m29699k0(this.f17349K.get());
        if (objM29699k2 instanceof Map) {
            this.f17348J = (Map) objM29699k2;
        }
        Object objM29699k3 = m29699k0(this.f17366q.get());
        if (objM29699k3 instanceof Map) {
            this.f17367r = (Map) objM29699k3;
        }
        Object objM29699k4 = m29699k0(this.f17368s.get());
        if (objM29699k4 instanceof Map) {
            this.f17369t = (Map) objM29699k4;
        }
        Object objM29699k5 = m29699k0(this.f17370u.get());
        if (objM29699k5 instanceof Map) {
            this.f17371v = (Map) objM29699k5;
        }
        Object objM29699k6 = m29699k0(this.f17372w.get());
        if (objM29699k6 instanceof Map) {
            this.f17373x = (Map) objM29699k6;
        }
        Object objM29699k7 = m29699k0(this.f17374y.get());
        if (objM29699k7 instanceof Map) {
            this.f17375z = (Map) objM29699k7;
        }
        Object objM29699k8 = m29699k0(this.f17343E.get());
        if (objM29699k8 instanceof Map) {
            this.f17342D = (Map) objM29699k8;
        }
        if (TextUtils.isEmpty(str)) {
            this.f17344F.putAll(f17335L);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m29720T(InterfaceC16801ep interfaceC16801ep) {
        this.f17350a = interfaceC16801ep;
    }

    /* JADX INFO: renamed from: U */
    public void m29721U(Act act) {
        this.f17351b = (AccountMakeupSharedViewModel) new C0491t(act).m3074a(AccountMakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: W */
    public void m29722W() {
        if (this.f17350a != null) {
            Map<String, Float> map = this.f17344F;
            if (map != null) {
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    this.f17350a.setFaceBeautyValue(entry.getKey(), entry.getValue().floatValue());
                }
            }
            HashMap<String, String> map2 = this.f17346H;
            if (map2 != null && map2.size() > 0) {
                for (String str : this.f17346H.values()) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f17350a.mo117646u(str);
                    }
                }
            }
            Map<String, Float> map3 = this.f17348J;
            if (map3 != null) {
                for (Map.Entry<String, Float> entry2 : map3.entrySet()) {
                    this.f17350a.mo117641o(entry2.getKey(), entry2.getValue().floatValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public AccountMakeupSharedViewModel m29723X() {
        return this.f17351b;
    }

    /* JADX INFO: renamed from: Z */
    public void m29724Z() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f17355f) {
            makeupItem.all = m29694H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m29725a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.equals(this.f17346H.get(str))) {
            return;
        }
        this.f17346H.put(str, str2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m29726a0() {
        this.f17367r.putAll(f17336M);
    }

    /* JADX INFO: renamed from: b */
    public void m29727b() {
        this.f17371v.clear();
    }

    /* JADX INFO: renamed from: b0 */
    public void m29728b0() {
        for (List<AccountMakeupPageAdapter.MakeupItem> list : this.f17358i.values()) {
            if (list != null) {
                for (AccountMakeupPageAdapter.MakeupItem makeupItem : list) {
                    makeupItem.all = m29693B(makeupItem.type);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m29729c() {
        this.f17342D.clear();
    }

    /* JADX INFO: renamed from: c0 */
    public void m29730c0() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f17356g) {
            makeupItem.all = m29694H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m29731d() {
        this.f17348J.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public void m29732d0() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f17357h) {
            makeupItem.all = 0.7f;
            makeupItem.lut = 0.5f;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m29733e() {
        this.f17346H.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m29734e0() {
        this.f17366q.put(m29698Y(this.f17367r));
        this.f17368s.put(m29698Y(this.f17369t));
        this.f17370u.put(m29698Y(this.f17371v));
        this.f17372w.put(m29698Y(this.f17373x));
        this.f17374y.put(m29698Y(this.f17375z));
        this.f17345G.put(m29698Y(this.f17344F));
        this.f17347I.put(m29698Y(this.f17346H));
        this.f17349K.put(m29698Y(this.f17348J));
        this.f17343E.put(m29698Y(this.f17342D));
    }

    /* JADX INFO: renamed from: f */
    public void m29735f() {
        this.f17364o.put(0);
    }

    /* JADX INFO: renamed from: f0 */
    public void m29736f0(int i) {
        this.f17361l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public void m29737g() {
        this.f17369t.clear();
    }

    /* JADX INFO: renamed from: g0 */
    public void m29738g0(int i) {
        this.f17362m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public List<C18249ks.b> m29739h() {
        int i = 0;
        while (true) {
            List<C18249ks.b> list = this.f17360k;
            if (i >= 5) {
                return list;
            }
            list.add(new C18249ks.b(0.0f, 0.0f, false, false));
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m29740h0(int i) {
        this.f17365p.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public List<AccountMakeupPageAdapter.MakeupItem> m29741i(List<List<CameraBeautyMode>> list) {
        this.f17354e.clear();
        int size = list.size();
        if (size < 5) {
            return this.f17354e;
        }
        String[] strArr = {"无", "自然", "可爱", "女神", "净白"};
        int[] iArr = {bbc0.f75813K, bbc0.f75786B, bbc0.f75933z, bbc0.f75783A, bbc0.f75789C};
        int[] iArr2 = {bbc0.f75816L, 0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            HashMap map = new HashMap();
            for (CameraBeautyMode cameraBeautyMode : list.get(i)) {
                map.put(cameraBeautyMode.type, Float.valueOf(cameraBeautyMode.value));
            }
            List<AccountMakeupPageAdapter.MakeupItem> list2 = this.f17354e;
            if (i == 0) {
                list2.add(new AccountMakeupPageAdapter.MakeupItem(strArr[i], "none", map, iArr[i], iArr2[i]));
            } else {
                list2.add(new AccountMakeupPageAdapter.MakeupItem(strArr[i], "local", map, iArr[i], iArr2[i]));
            }
        }
        return this.f17354e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m29742i0(int i) {
        this.f17363n.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j */
    public List<AccountMakeupPageAdapter.MakeupItem> m29743j() {
        ArrayList arrayList = new ArrayList();
        this.f17355f = arrayList;
        arrayList.add(new AccountMakeupPageAdapter.MakeupItem("磨皮", "skin_smooth", bbc0.f75909r, bbc0.f75912s, m29709F("skin_smooth")));
        this.f17355f.add(new AccountMakeupPageAdapter.MakeupItem("美白", "skin_whitening", bbc0.f75915t, bbc0.f75918u, m29709F("skin_whitening")));
        this.f17355f.add(new AccountMakeupPageAdapter.MakeupItem("红润", "skin_ruddy", bbc0.f75921v, bbc0.f75924w, m29709F("skin_ruddy")));
        this.f17355f.add(new AccountMakeupPageAdapter.MakeupItem("大眼", FaceBeautyID.BIG_EYE, bbc0.f75897n, bbc0.f75900o, m29709F(FaceBeautyID.BIG_EYE)));
        this.f17355f.add(new AccountMakeupPageAdapter.MakeupItem("瘦脸", FaceBeautyID.THIN_FACE, bbc0.f75927x, bbc0.f75930y, m29709F(FaceBeautyID.THIN_FACE)));
        this.f17355f.add(new AccountMakeupPageAdapter.MakeupItem("锐化", "skin_sharpen", bbc0.f75903p, bbc0.f75906q, m29709F("skin_sharpen")));
        return this.f17355f;
    }

    /* JADX INFO: renamed from: j0 */
    public void m29744j0(int i) {
        this.f17364o.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public final AccountMakeUpMenuView.MakeupCategory m29745k(CameraCategory cameraCategory) {
        AccountMakeUpMenuView.MakeupCategory makeupCategory;
        String str = cameraCategory.name;
        str.getClass();
        switch (str) {
            case "修容":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_FACIAL, bbc0.f75868d0, bbc0.f75871e0);
                break;
            case "口红":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_LIPS, bbc0.f75892l0, bbc0.f75895m0);
                break;
            case "眼妆":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_EYES, bbc0.f75886j0, bbc0.f75889k0);
                break;
            case "眉毛":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, bbc0.f75880h0, bbc0.f75883i0);
                break;
            case "美瞳":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_PUPIL, bbc0.f75874f0, bbc0.f75877g0);
                break;
            case "腮红":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_BLUSH, bbc0.f75862b0, bbc0.f75865c0);
                break;
            default:
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, 1004);
                break;
        }
        makeupCategory.all = m29710G(makeupCategory.type);
        return makeupCategory;
    }

    /* JADX INFO: renamed from: l */
    public List<AccountMakeUpMenuView.MakeupCategory> m29746l(List<CameraCategory> list) {
        this.f17353d.clear();
        this.f17353d.add(new AccountMakeUpMenuView.MakeupCategory("一键美颜", 1000));
        this.f17353d.add(new AccountMakeUpMenuView.MakeupCategory("美颜", 1001));
        this.f17353d.add(new AccountMakeUpMenuView.MakeupCategory("微整形", 1002));
        AccountMakeUpMenuView.MakeupCategory makeupCategory = new AccountMakeUpMenuView.MakeupCategory("美妆", 1004);
        AccountMakeUpMenuView.MakeupCategory makeupCategory2 = null;
        for (CameraCategory cameraCategory : list) {
            if ("风格妆".equals(cameraCategory.name)) {
                makeupCategory2 = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, 1003);
            } else {
                makeupCategory.subMenu.add(0, m29745k(cameraCategory));
            }
        }
        makeupCategory.subMenu.add(0, new AccountMakeUpMenuView.MakeupCategory("原图", -1, bbc0.f75813K, bbc0.f75816L));
        if (makeupCategory2 != null) {
            this.f17353d.add(makeupCategory2);
        }
        this.f17353d.add(makeupCategory);
        return this.f17353d;
    }

    /* JADX INFO: renamed from: l0 */
    public void m29747l0(String str, float f) {
        this.f17373x.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: m */
    public final AccountMakeupPageAdapter.MakeupItem m29748m(CameraSticker cameraSticker, String str) {
        float fM29706C = m29706C(cameraSticker.modelFilePath, str);
        str.getClass();
        switch (str) {
            case "makeup_blush":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_BLUSH, fM29706C);
            case "makeup_pupil":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_PUPIL, fM29706C);
            case "makeup_facial":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_FACIAL, fM29706C);
            case "makeup_eyes":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_EYES, fM29706C);
            case "makeup_eyebrow":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, fM29706C);
            default:
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_LIPS, fM29706C);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m29749m0(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17371v.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public final AccountMakeupPageAdapter.MakeupItem m29750n(AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        AccountMakeupPageAdapter.MakeupItem makeupItem = new AccountMakeupPageAdapter.MakeupItem("无", "none", bbc0.f75813K, bbc0.f75816L, false);
        makeupItem.extra = makeupCategory.type;
        return makeupItem;
    }

    /* JADX INFO: renamed from: n0 */
    public void m29751n0(String str, Float f) {
        this.f17375z.put(str, f);
    }

    /* JADX INFO: renamed from: o */
    public List<AccountMakeupPageAdapter.MakeupItem> m29752o() {
        ArrayList arrayList = new ArrayList();
        this.f17356g = arrayList;
        arrayList.add(new AccountMakeupPageAdapter.MakeupItem("脸宽", FaceBeautyID.FACE_WIDTH, bbc0.f75787B0, bbc0.f75790C0, false));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("削脸", FaceBeautyID.JAW_SHAPE, bbc0.f75799F0, bbc0.f75802G0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("短脸", FaceBeautyID.SHORTEN_FACE, bbc0.f75863b1, bbc0.f75866c1, false));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("额头", FaceBeautyID.FOREHEAD, bbc0.f75793D0, bbc0.f75796E0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("下巴", FaceBeautyID.CHIN_LENGTH, bbc0.f75910r0, bbc0.f75913s0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("颧骨", FaceBeautyID.CHEEKBONE_WIDTH, bbc0.f75904p0, bbc0.f75907q0, false));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("下颌骨", FaceBeautyID.JAW_WIDTH, bbc0.f75805H0, bbc0.f75808I0, false));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("鼻子宽度", FaceBeautyID.NOSE_WIDTH, bbc0.f75853X0, bbc0.f75855Y0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("鼻子大小", FaceBeautyID.NOSE_SIZE, bbc0.f75841T0, bbc0.f75844U0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("鼻高", FaceBeautyID.NOSE_LIFT, bbc0.f75829P0, bbc0.f75832Q0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("鼻梁", FaceBeautyID.NOSE_RIDGE_WIDTH, bbc0.f75835R0, bbc0.f75838S0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("鼻尖", FaceBeautyID.NOSE_TIP_SIZE, bbc0.f75847V0, bbc0.f75850W0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("眼睛角度", FaceBeautyID.EYE_TILT, bbc0.f75934z0, bbc0.f75784A0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("眼距", FaceBeautyID.EYE_DISTANCE, bbc0.f75922v0, bbc0.f75925w0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("眼高", FaceBeautyID.EYE_HEIGHT, bbc0.f75928x0, bbc0.f75931y0, false));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("嘴唇厚度", FaceBeautyID.LIP_THICKNESS, bbc0.f75811J0, bbc0.f75814K0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("嘴唇大小", FaceBeautyID.MOUTH_SIZE, bbc0.f75817L0, bbc0.f75820M0, true));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("眼袋", "remove_pouch", bbc0.f75857Z0, bbc0.f75860a1, false));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("祛法令纹", "remove_nasolabial_floads", bbc0.f75823N0, bbc0.f75826O0, false));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("亮眼", "eye_brighten", bbc0.f75916t0, bbc0.f75919u0, false));
        this.f17356g.add(new AccountMakeupPageAdapter.MakeupItem("白牙", "teeth_whiten", bbc0.f75869d1, bbc0.f75872e1, false));
        return this.f17356g;
    }

    /* JADX INFO: renamed from: o0 */
    public void m29753o0(String str, float f) {
        this.f17367r.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: p */
    public List<AccountMakeupPageAdapter.MakeupItem> m29754p(List<CameraSticker> list) {
        this.f17357h.add(new AccountMakeupPageAdapter.MakeupItem("无", "none", bbc0.f75813K, bbc0.f75816L, false));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            AccountMakeupPageAdapter.MakeupItem makeupItem = new AccountMakeupPageAdapter.MakeupItem(it.next(), ILightningRender.IMakeupLevel.MAKEUP_ALL);
            Intensity intensityM29716P = m29716P(makeupItem.modelFilePath);
            makeupItem.lut = intensityM29716P.lut;
            makeupItem.all = intensityM29716P.all;
            this.f17357h.add(makeupItem);
        }
        return this.f17357h;
    }

    /* JADX INFO: renamed from: p0 */
    public void m29755p0(String str, float f) {
        this.f17342D.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: q */
    public List<AccountMakeupPageAdapter.MakeupItem> m29756q(AccountMakeUpMenuView.MakeupCategory makeupCategory, List<CameraSticker> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m29750n(makeupCategory));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m29748m(it.next(), makeupCategory.type));
        }
        this.f17358i.put(makeupCategory.f17061id, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public void m29757q0(String str, float f) {
        this.f17344F.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: r */
    public void m29758r() {
        this.f17350a = null;
    }

    /* JADX INFO: renamed from: r0 */
    public void m29759r0(Map<String, Float> map) {
        if (map != null) {
            this.f17344F.clear();
            this.f17344F.putAll(map);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m29760s0(String str, float f) {
        this.f17348J.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: t0 */
    public void m29761t0(String str, float f, float f2) {
        this.f17369t.put(str, new Intensity(f, f2));
    }

    /* JADX INFO: renamed from: v */
    public List<AccountMakeupPageAdapter.MakeupItem> m29762v() {
        return this.f17354e;
    }

    /* JADX INFO: renamed from: w */
    public int m29763w() {
        return this.f17361l.get().intValue();
    }

    /* JADX INFO: renamed from: y */
    public float m29764y(String str) {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f17355f) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }
}
