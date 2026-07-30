package com.p000p1.mobile.putong.account.p002ui.camera;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import androidx.lifecycle.t;
import com.p000p1.mobile.putong.account.data.CameraBeautyMode;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
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
import p006l.C1188qs;
import p006l.InterfaceC0898jp;
import p006l.v2c0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountCameraEffectMgr {
    private static AccountCameraEffectMgr INSTANCE = new AccountCameraEffectMgr();

    /* JADX INFO: renamed from: L */
    public static Map<String, Float> f605L = new HashMap();

    /* JADX INFO: renamed from: M */
    public static Map<String, Float> f606M = new HashMap();

    /* JADX INFO: renamed from: N */
    public static Map<String, Float> f607N = new HashMap();

    /* JADX INFO: renamed from: O */
    public static Map<String, Float> f608O = new HashMap();

    /* JADX INFO: renamed from: a */
    public InterfaceC0898jp f620a;

    /* JADX INFO: renamed from: b */
    public AccountMakeupSharedViewModel f621b;

    /* JADX INFO: renamed from: c */
    public Set<Integer> f622c = new HashSet();

    /* JADX INFO: renamed from: d */
    public List<AccountMakeUpMenuView.MakeupCategory> f623d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<AccountMakeupPageAdapter.MakeupItem> f624e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<AccountMakeupPageAdapter.MakeupItem> f625f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<AccountMakeupPageAdapter.MakeupItem> f626g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<AccountMakeupPageAdapter.MakeupItem> f627h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Map<String, List<AccountMakeupPageAdapter.MakeupItem>> f628i = new ArrayMap();

    /* JADX INFO: renamed from: j */
    public a<AccountMakeupPageAdapter.MakeupItem> f629j = a.b();

    /* JADX INFO: renamed from: k */
    public List<C1188qs.b> f630k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public tpd0 f631l = new tpd0("account_makeup_beautyauto_index", 1);

    /* JADX INFO: renamed from: m */
    public tpd0 f632m = new tpd0("account_makeup_beautyface_index", 0);

    /* JADX INFO: renamed from: n */
    public tpd0 f633n = new tpd0("account_makeup_microplastic_index", 0);

    /* JADX INFO: renamed from: o */
    public tpd0 f634o = new tpd0("account_makeup_stylemakeup_index", 0);

    /* JADX INFO: renamed from: p */
    public tpd0 f635p = new tpd0("account_makeup_beautymakeup_index", 0);

    /* JADX INFO: renamed from: q */
    public uqd0 f636q = new uqd0("account_makeup_beauty_all", "");

    /* JADX INFO: renamed from: r */
    public Map<String, Float> f637r = new HashMap();

    /* JADX INFO: renamed from: s */
    public uqd0 f638s = new uqd0("account_style_makeup_all", "");

    /* JADX INFO: renamed from: t */
    public Map<String, Intensity> f639t = new HashMap();

    /* JADX INFO: renamed from: u */
    public uqd0 f640u = new uqd0("account_beauty_makeup_index", "");

    /* JADX INFO: renamed from: v */
    public Map<String, Integer> f641v = new HashMap();

    /* JADX INFO: renamed from: w */
    public uqd0 f642w = new uqd0("account_beauty_makeup_cate_value", "");

    /* JADX INFO: renamed from: x */
    public Map<String, Float> f643x = new HashMap();

    /* JADX INFO: renamed from: y */
    public uqd0 f644y = new uqd0("account_beauty_makeup_item_value", "");

    /* JADX INFO: renamed from: z */
    public Map<String, Float> f645z = new HashMap();

    /* JADX INFO: renamed from: A */
    public Map<Integer, Object> f609A = new HashMap();

    /* JADX INFO: renamed from: B */
    public Map<String, Integer> f610B = new HashMap();

    /* JADX INFO: renamed from: C */
    public List<Object> f611C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public Map<String, Float> f612D = new HashMap();

    /* JADX INFO: renamed from: E */
    public uqd0 f613E = new uqd0("account_makeup_category_show_map", "");

    /* JADX INFO: renamed from: F */
    public Map<String, Float> f614F = new HashMap();

    /* JADX INFO: renamed from: G */
    public uqd0 f615G = new uqd0("account_real_effect_face_beauty", "");

    /* JADX INFO: renamed from: H */
    public HashMap<String, String> f616H = new HashMap<>();

    /* JADX INFO: renamed from: I */
    public uqd0 f617I = new uqd0("account_real_effect_model_list", "");

    /* JADX INFO: renamed from: J */
    public Map<String, Float> f618J = new HashMap();

    /* JADX INFO: renamed from: K */
    public uqd0 f619K = new uqd0("account_real_effect_intensity_list", "");

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
        f605L.put("skin_smooth", Float.valueOf(0.33f));
        f605L.put("skin_whitening", Float.valueOf(0.52f));
        Map<String, Float> map = f605L;
        Float fValueOf = Float.valueOf(0.5f);
        map.put("skin_ruddy", fValueOf);
        f605L.put("big_eye", Float.valueOf(0.25f));
        Map<String, Float> map2 = f605L;
        Float fValueOf2 = Float.valueOf(0.4f);
        map2.put("thin_face", fValueOf2);
        Map<String, Float> map3 = f605L;
        Float fValueOf3 = Float.valueOf(0.7f);
        map3.put("skin_sharpen", fValueOf3);
        f605L.put("nose_size", Float.valueOf(0.3f));
        f605L.put("eye_brighten", fValueOf2);
        f605L.put("teeth_whiten", fValueOf2);
        f606M.put("skin_smooth", fValueOf3);
        f606M.put("skin_whitening", fValueOf2);
        f606M.put("skin_ruddy", fValueOf);
        f606M.put("big_eye", fValueOf2);
        f606M.put("thin_face", fValueOf);
        f606M.put("skin_sharpen", fValueOf);
        Map<String, Float> map4 = f606M;
        Float fValueOf4 = Float.valueOf(0.0f);
        map4.put("face_width", fValueOf4);
        f606M.put("jaw_shape", fValueOf4);
        f606M.put("shorten_face", fValueOf4);
        f606M.put("forehead", fValueOf4);
        f606M.put("chin_length", fValueOf4);
        f606M.put("cheekbone_width", fValueOf4);
        f606M.put("jaw_width", fValueOf4);
        f606M.put("nose_width", fValueOf4);
        f606M.put("nose_size", fValueOf4);
        f606M.put("nose_lift", fValueOf4);
        f606M.put("nose_ridge_width", fValueOf4);
        f606M.put("nose_tip_size", fValueOf4);
        f606M.put("eye_tilt", fValueOf4);
        f606M.put("eye_distance", fValueOf4);
        f606M.put("eye_height", fValueOf4);
        f606M.put("lip_thickness", fValueOf4);
        f606M.put("mouth_size", fValueOf4);
        f606M.put("remove_pouch", fValueOf4);
        f606M.put("remove_nasolabial_floads", fValueOf4);
        f606M.put("eye_brighten", fValueOf4);
        f606M.put("teeth_whiten", fValueOf4);
        f607N.put("makeup_lips", fValueOf3);
        f607N.put("makeup_blush", fValueOf2);
        f607N.put("makeup_eyes", Float.valueOf(0.6f));
        f607N.put("makeup_eyebrow", fValueOf);
        f607N.put("makeup_pupil", fValueOf2);
        f607N.put("makeup_facial", fValueOf2);
        f608O.put("makeup_lut", fValueOf);
        f608O.put("makeup_all", fValueOf3);
    }

    public AccountCameraEffectMgr() {
        this.f609A.put(4, this.f611C);
    }

    /* JADX INFO: renamed from: B */
    public static float m593B(String str) {
        Float f = f607N.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: H */
    public static float m594H(String str) {
        Float f;
        if (TextUtils.isEmpty(str) || (f = f606M.get(str)) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: I */
    public static float m595I(int i) {
        return new BigDecimal(i / 100.0f).setScale(2, 5).floatValue();
    }

    /* JADX INFO: renamed from: N */
    public static Intensity m596N(String str, Map<String, Intensity> map) {
        if (TextUtils.isEmpty(str)) {
            return new Intensity(0.5f, 0.7f);
        }
        Intensity intensity = map.get(str);
        return intensity == null ? new Intensity(0.5f, 0.7f) : intensity;
    }

    /* JADX INFO: renamed from: V */
    public static AccountCameraEffectMgr m597V() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static String m598Y(Object obj) {
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
    public static Object m599k0(String str) {
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
    public static float m600s(int i) {
        return new BigDecimal(((i / 100.0f) * 2.0f) - 1.0f).setScale(2, 4).floatValue();
    }

    /* JADX INFO: renamed from: t */
    public static int m601t(float f) {
        return (int) ((((f - (-1.0f)) / 2.0f) * 100.0f) + 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public static int m602u(boolean z, float f) {
        return z ? m601t(f) : (int) (f * 100.0f);
    }

    /* JADX INFO: renamed from: x */
    public static float m603x(String str) {
        Float f = f606M.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: z */
    public static float m604z(String str, Map<String, Float> map) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        Float f = map.get(str);
        return f == null ? m603x(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: A */
    public int m605A() {
        return ((Integer) this.f632m.get()).intValue();
    }

    /* JADX INFO: renamed from: C */
    public float m606C(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m593B(str2);
        }
        Float f = this.f645z.get(str);
        return f == null ? m593B(str2) : f.floatValue();
    }

    /* JADX INFO: renamed from: D */
    public int m607D(String str) {
        Integer num = this.f641v.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: E */
    public int m608E() {
        return ((Integer) this.f635p.get()).intValue();
    }

    /* JADX INFO: renamed from: F */
    public float m609F(String str) {
        return m604z(str, this.f637r);
    }

    /* JADX INFO: renamed from: G */
    public float m610G(String str) {
        Float f = this.f612D.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: J */
    public List<AccountMakeUpMenuView.MakeupCategory> m611J() {
        return this.f623d;
    }

    /* JADX INFO: renamed from: K */
    public float m612K(String str) {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f626g) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: L */
    public int m613L() {
        return ((Integer) this.f633n.get()).intValue();
    }

    /* JADX INFO: renamed from: M */
    public List<AccountMakeupPageAdapter.MakeupItem> m614M() {
        return this.f627h;
    }

    /* JADX INFO: renamed from: O */
    public int m615O() {
        return ((Integer) this.f634o.get()).intValue();
    }

    /* JADX INFO: renamed from: P */
    public Intensity m616P(String str) {
        return m596N(str, this.f639t);
    }

    /* JADX INFO: renamed from: Q */
    public List<AccountMakeupPageAdapter.MakeupItem> m617Q(AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        List<AccountMakeupPageAdapter.MakeupItem> list = this.f628i.get(makeupCategory.f331id);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: R */
    public boolean m618R() {
        return this.f641v.size() != 0;
    }

    /* JADX INFO: renamed from: S */
    public void m619S() {
        String str = (String) this.f615G.get();
        Object objM599k0 = m599k0(str);
        if (objM599k0 instanceof Map) {
            this.f614F = (Map) objM599k0;
        }
        Object objM599k1 = m599k0((String) this.f617I.get());
        if (objM599k1 instanceof HashMap) {
            this.f616H = (HashMap) objM599k1;
        }
        Object objM599k2 = m599k0((String) this.f619K.get());
        if (objM599k2 instanceof Map) {
            this.f618J = (Map) objM599k2;
        }
        Object objM599k3 = m599k0((String) this.f636q.get());
        if (objM599k3 instanceof Map) {
            this.f637r = (Map) objM599k3;
        }
        Object objM599k4 = m599k0((String) this.f638s.get());
        if (objM599k4 instanceof Map) {
            this.f639t = (Map) objM599k4;
        }
        Object objM599k5 = m599k0((String) this.f640u.get());
        if (objM599k5 instanceof Map) {
            this.f641v = (Map) objM599k5;
        }
        Object objM599k6 = m599k0((String) this.f642w.get());
        if (objM599k6 instanceof Map) {
            this.f643x = (Map) objM599k6;
        }
        Object objM599k7 = m599k0((String) this.f644y.get());
        if (objM599k7 instanceof Map) {
            this.f645z = (Map) objM599k7;
        }
        Object objM599k8 = m599k0((String) this.f613E.get());
        if (objM599k8 instanceof Map) {
            this.f612D = (Map) objM599k8;
        }
        if (TextUtils.isEmpty(str)) {
            this.f614F.putAll(f605L);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m620T(InterfaceC0898jp interfaceC0898jp) {
        this.f620a = interfaceC0898jp;
    }

    /* JADX INFO: renamed from: U */
    public void m621U(Act act) {
        this.f621b = (AccountMakeupSharedViewModel) new t(act).a(AccountMakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: W */
    public void m622W() {
        if (this.f620a != null) {
            Map<String, Float> map = this.f614F;
            if (map != null) {
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    this.f620a.setFaceBeautyValue(entry.getKey(), entry.getValue().floatValue());
                }
            }
            HashMap<String, String> map2 = this.f616H;
            if (map2 != null && map2.size() > 0) {
                for (String str : this.f616H.values()) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f620a.mo17722u(str);
                    }
                }
            }
            Map<String, Float> map3 = this.f618J;
            if (map3 != null) {
                for (Map.Entry<String, Float> entry2 : map3.entrySet()) {
                    this.f620a.mo17719o(entry2.getKey(), entry2.getValue().floatValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public AccountMakeupSharedViewModel m623X() {
        return this.f621b;
    }

    /* JADX INFO: renamed from: Z */
    public void m624Z() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f625f) {
            makeupItem.all = m594H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m625a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.equals(this.f616H.get(str))) {
            return;
        }
        this.f616H.put(str, str2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m626a0() {
        this.f637r.putAll(f606M);
    }

    /* JADX INFO: renamed from: b */
    public void m627b() {
        this.f641v.clear();
    }

    /* JADX INFO: renamed from: b0 */
    public void m628b0() {
        for (List<AccountMakeupPageAdapter.MakeupItem> list : this.f628i.values()) {
            if (list != null) {
                for (AccountMakeupPageAdapter.MakeupItem makeupItem : list) {
                    makeupItem.all = m593B(makeupItem.type);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m629c() {
        this.f612D.clear();
    }

    /* JADX INFO: renamed from: c0 */
    public void m630c0() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f626g) {
            makeupItem.all = m594H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m631d() {
        this.f618J.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public void m632d0() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f627h) {
            makeupItem.all = 0.7f;
            makeupItem.lut = 0.5f;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m633e() {
        this.f616H.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m634e0() {
        this.f636q.put(m598Y(this.f637r));
        this.f638s.put(m598Y(this.f639t));
        this.f640u.put(m598Y(this.f641v));
        this.f642w.put(m598Y(this.f643x));
        this.f644y.put(m598Y(this.f645z));
        this.f615G.put(m598Y(this.f614F));
        this.f617I.put(m598Y(this.f616H));
        this.f619K.put(m598Y(this.f618J));
        this.f613E.put(m598Y(this.f612D));
    }

    /* JADX INFO: renamed from: f */
    public void m635f() {
        this.f634o.put(0);
    }

    /* JADX INFO: renamed from: f0 */
    public void m636f0(int i) {
        this.f631l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public void m637g() {
        this.f639t.clear();
    }

    /* JADX INFO: renamed from: g0 */
    public void m638g0(int i) {
        this.f632m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public List<C1188qs.b> m639h() {
        int i = 0;
        while (true) {
            List<C1188qs.b> list = this.f630k;
            if (i >= 5) {
                return list;
            }
            list.add(new C1188qs.b(0.0f, 0.0f, false, false));
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m640h0(int i) {
        this.f635p.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public List<AccountMakeupPageAdapter.MakeupItem> m641i(List<List<CameraBeautyMode>> list) {
        this.f624e.clear();
        int size = list.size();
        if (size < 5) {
            return this.f624e;
        }
        String[] strArr = {"无", "自然", "可爱", "女神", "净白"};
        int[] iArr = {v2c0.f23971K, v2c0.f23944B, v2c0.f24091z, v2c0.f23941A, v2c0.f23947C};
        int[] iArr2 = {v2c0.f23974L, 0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            HashMap map = new HashMap();
            for (CameraBeautyMode cameraBeautyMode : list.get(i)) {
                map.put(cameraBeautyMode.type, Float.valueOf(cameraBeautyMode.value));
            }
            List<AccountMakeupPageAdapter.MakeupItem> list2 = this.f624e;
            if (i == 0) {
                list2.add(new AccountMakeupPageAdapter.MakeupItem(strArr[i], AccountMakeupPageAdapter.MakeupItem.NONE, map, iArr[i], iArr2[i]));
            } else {
                list2.add(new AccountMakeupPageAdapter.MakeupItem(strArr[i], AccountMakeupPageAdapter.MakeupItem.LOCAL, map, iArr[i], iArr2[i]));
            }
        }
        return this.f624e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m642i0(int i) {
        this.f633n.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j */
    public List<AccountMakeupPageAdapter.MakeupItem> m643j() {
        ArrayList arrayList = new ArrayList();
        this.f625f = arrayList;
        arrayList.add(new AccountMakeupPageAdapter.MakeupItem("磨皮", "skin_smooth", v2c0.f24067r, v2c0.f24070s, m609F("skin_smooth")));
        this.f625f.add(new AccountMakeupPageAdapter.MakeupItem("美白", "skin_whitening", v2c0.f24073t, v2c0.f24076u, m609F("skin_whitening")));
        this.f625f.add(new AccountMakeupPageAdapter.MakeupItem("红润", "skin_ruddy", v2c0.f24079v, v2c0.f24082w, m609F("skin_ruddy")));
        this.f625f.add(new AccountMakeupPageAdapter.MakeupItem("大眼", "big_eye", v2c0.f24055n, v2c0.f24058o, m609F("big_eye")));
        this.f625f.add(new AccountMakeupPageAdapter.MakeupItem("瘦脸", "thin_face", v2c0.f24085x, v2c0.f24088y, m609F("thin_face")));
        this.f625f.add(new AccountMakeupPageAdapter.MakeupItem("锐化", "skin_sharpen", v2c0.f24061p, v2c0.f24064q, m609F("skin_sharpen")));
        return this.f625f;
    }

    /* JADX INFO: renamed from: j0 */
    public void m644j0(int i) {
        this.f634o.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public final AccountMakeUpMenuView.MakeupCategory m645k(CameraCategory cameraCategory) {
        AccountMakeUpMenuView.MakeupCategory makeupCategory;
        String str = cameraCategory.name;
        str.getClass();
        switch (str) {
            case "修容":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, "makeup_facial", v2c0.f24026d0, v2c0.f24029e0);
                break;
            case "口红":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, "makeup_lips", v2c0.f24050l0, v2c0.f24053m0);
                break;
            case "眼妆":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, "makeup_eyes", v2c0.f24044j0, v2c0.f24047k0);
                break;
            case "眉毛":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, "makeup_eyebrow", v2c0.f24038h0, v2c0.f24041i0);
                break;
            case "美瞳":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, "makeup_pupil", v2c0.f24032f0, v2c0.f24035g0);
                break;
            case "腮红":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, "makeup_blush", v2c0.f24020b0, v2c0.f24023c0);
                break;
            default:
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_ALL_MAKEUP);
                break;
        }
        makeupCategory.all = m610G(makeupCategory.type);
        return makeupCategory;
    }

    /* JADX INFO: renamed from: l */
    public List<AccountMakeUpMenuView.MakeupCategory> m646l(List<CameraCategory> list) {
        this.f623d.clear();
        this.f623d.add(new AccountMakeUpMenuView.MakeupCategory("一键美颜", AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO));
        this.f623d.add(new AccountMakeUpMenuView.MakeupCategory("美颜", AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYFACE));
        this.f623d.add(new AccountMakeUpMenuView.MakeupCategory("微整形", AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_MICROPLASTIC));
        AccountMakeUpMenuView.MakeupCategory makeupCategory = new AccountMakeUpMenuView.MakeupCategory("美妆", AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_ALL_MAKEUP);
        AccountMakeUpMenuView.MakeupCategory makeupCategory2 = null;
        for (CameraCategory cameraCategory : list) {
            if ("风格妆".equals(cameraCategory.name)) {
                makeupCategory2 = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_STYLE_MAKEUP);
            } else {
                makeupCategory.subMenu.add(0, m645k(cameraCategory));
            }
        }
        makeupCategory.subMenu.add(0, new AccountMakeUpMenuView.MakeupCategory("原图", -1, v2c0.f23971K, v2c0.f23974L));
        if (makeupCategory2 != null) {
            this.f623d.add(makeupCategory2);
        }
        this.f623d.add(makeupCategory);
        return this.f623d;
    }

    /* JADX INFO: renamed from: l0 */
    public void m647l0(String str, float f) {
        this.f643x.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: m */
    public final AccountMakeupPageAdapter.MakeupItem m648m(CameraSticker cameraSticker, String str) {
        float fM606C = m606C(cameraSticker.modelFilePath, str);
        str.getClass();
        switch (str) {
            case "makeup_blush":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_blush", fM606C);
            case "makeup_pupil":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_pupil", fM606C);
            case "makeup_facial":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_facial", fM606C);
            case "makeup_eyes":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_eyes", fM606C);
            case "makeup_eyebrow":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_eyebrow", fM606C);
            default:
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, "makeup_lips", fM606C);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m649m0(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f641v.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public final AccountMakeupPageAdapter.MakeupItem m650n(AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        AccountMakeupPageAdapter.MakeupItem makeupItem = new AccountMakeupPageAdapter.MakeupItem("无", AccountMakeupPageAdapter.MakeupItem.NONE, v2c0.f23971K, v2c0.f23974L, false);
        makeupItem.extra = makeupCategory.type;
        return makeupItem;
    }

    /* JADX INFO: renamed from: n0 */
    public void m651n0(String str, Float f) {
        this.f645z.put(str, f);
    }

    /* JADX INFO: renamed from: o */
    public List<AccountMakeupPageAdapter.MakeupItem> m652o() {
        ArrayList arrayList = new ArrayList();
        this.f626g = arrayList;
        arrayList.add(new AccountMakeupPageAdapter.MakeupItem("脸宽", "face_width", v2c0.f23945B0, v2c0.f23948C0, false));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("削脸", "jaw_shape", v2c0.f23957F0, v2c0.f23960G0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("短脸", "shorten_face", v2c0.f24021b1, v2c0.f24024c1, false));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("额头", "forehead", v2c0.f23951D0, v2c0.f23954E0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("下巴", "chin_length", v2c0.f24068r0, v2c0.f24071s0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("颧骨", "cheekbone_width", v2c0.f24062p0, v2c0.f24065q0, false));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("下颌骨", "jaw_width", v2c0.f23963H0, v2c0.f23966I0, false));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("鼻子宽度", "nose_width", v2c0.f24011X0, v2c0.f24013Y0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("鼻子大小", "nose_size", v2c0.f23999T0, v2c0.f24002U0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("鼻高", "nose_lift", v2c0.f23987P0, v2c0.f23990Q0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("鼻梁", "nose_ridge_width", v2c0.f23993R0, v2c0.f23996S0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("鼻尖", "nose_tip_size", v2c0.f24005V0, v2c0.f24008W0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("眼睛角度", "eye_tilt", v2c0.f24092z0, v2c0.f23942A0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("眼距", "eye_distance", v2c0.f24080v0, v2c0.f24083w0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("眼高", "eye_height", v2c0.f24086x0, v2c0.f24089y0, false));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("嘴唇厚度", "lip_thickness", v2c0.f23969J0, v2c0.f23972K0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("嘴唇大小", "mouth_size", v2c0.f23975L0, v2c0.f23978M0, true));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("眼袋", "remove_pouch", v2c0.f24015Z0, v2c0.f24018a1, false));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("祛法令纹", "remove_nasolabial_floads", v2c0.f23981N0, v2c0.f23984O0, false));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("亮眼", "eye_brighten", v2c0.f24074t0, v2c0.f24077u0, false));
        this.f626g.add(new AccountMakeupPageAdapter.MakeupItem("白牙", "teeth_whiten", v2c0.f24027d1, v2c0.f24030e1, false));
        return this.f626g;
    }

    /* JADX INFO: renamed from: o0 */
    public void m653o0(String str, float f) {
        this.f637r.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: p */
    public List<AccountMakeupPageAdapter.MakeupItem> m654p(List<CameraSticker> list) {
        this.f627h.add(new AccountMakeupPageAdapter.MakeupItem("无", AccountMakeupPageAdapter.MakeupItem.NONE, v2c0.f23971K, v2c0.f23974L, false));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            AccountMakeupPageAdapter.MakeupItem makeupItem = new AccountMakeupPageAdapter.MakeupItem(it.next(), "makeup_all");
            Intensity intensityM616P = m616P(makeupItem.modelFilePath);
            makeupItem.lut = intensityM616P.lut;
            makeupItem.all = intensityM616P.all;
            this.f627h.add(makeupItem);
        }
        return this.f627h;
    }

    /* JADX INFO: renamed from: p0 */
    public void m655p0(String str, float f) {
        this.f612D.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: q */
    public List<AccountMakeupPageAdapter.MakeupItem> m656q(AccountMakeUpMenuView.MakeupCategory makeupCategory, List<CameraSticker> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m650n(makeupCategory));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m648m(it.next(), makeupCategory.type));
        }
        this.f628i.put(makeupCategory.f331id, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public void m657q0(String str, float f) {
        this.f614F.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: r */
    public void m658r() {
        this.f620a = null;
    }

    /* JADX INFO: renamed from: r0 */
    public void m659r0(Map<String, Float> map) {
        if (map != null) {
            this.f614F.clear();
            this.f614F.putAll(map);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m660s0(String str, float f) {
        this.f618J.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: t0 */
    public void m661t0(String str, float f, float f2) {
        this.f639t.put(str, new Intensity(f, f2));
    }

    /* JADX INFO: renamed from: v */
    public List<AccountMakeupPageAdapter.MakeupItem> m662v() {
        return this.f624e;
    }

    /* JADX INFO: renamed from: w */
    public int m663w() {
        return ((Integer) this.f631l.get()).intValue();
    }

    /* JADX INFO: renamed from: y */
    public float m664y(String str) {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f625f) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }
}
