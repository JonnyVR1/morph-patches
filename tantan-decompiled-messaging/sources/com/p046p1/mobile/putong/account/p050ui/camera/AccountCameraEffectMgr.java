package com.p046p1.mobile.putong.account.p050ui.camera;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import androidx.lifecycle.C0490t;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.data.CameraBeautyMode;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.AccountMakeupPageAdapter;
import com.p046p1.mobile.putong.account.p050ui.camera.view.AccountMakeUpMenuView;
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
import p149l.C19563qs;
import p149l.InterfaceC17833jp;
import p149l.t95;
import p149l.tpd0;
import p149l.uqd0;
import p149l.v2c0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraEffectMgr {
    private static AccountCameraEffectMgr INSTANCE = new AccountCameraEffectMgr();

    /* JADX INFO: renamed from: L */
    public static Map<String, Float> f16616L = new HashMap();

    /* JADX INFO: renamed from: M */
    public static Map<String, Float> f16617M = new HashMap();

    /* JADX INFO: renamed from: N */
    public static Map<String, Float> f16618N = new HashMap();

    /* JADX INFO: renamed from: O */
    public static Map<String, Float> f16619O = new HashMap();

    /* JADX INFO: renamed from: a */
    public InterfaceC17833jp f16631a;

    /* JADX INFO: renamed from: b */
    public AccountMakeupSharedViewModel f16632b;

    /* JADX INFO: renamed from: c */
    public Set<Integer> f16633c = new HashSet();

    /* JADX INFO: renamed from: d */
    public List<AccountMakeUpMenuView.MakeupCategory> f16634d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<AccountMakeupPageAdapter.MakeupItem> f16635e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public List<AccountMakeupPageAdapter.MakeupItem> f16636f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public List<AccountMakeupPageAdapter.MakeupItem> f16637g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<AccountMakeupPageAdapter.MakeupItem> f16638h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Map<String, List<AccountMakeupPageAdapter.MakeupItem>> f16639i = new ArrayMap();

    /* JADX INFO: renamed from: j */
    public C22392a<AccountMakeupPageAdapter.MakeupItem> f16640j = C22392a.m221512b();

    /* JADX INFO: renamed from: k */
    public List<C19563qs.b> f16641k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public tpd0 f16642l = new tpd0("account_makeup_beautyauto_index", 1);

    /* JADX INFO: renamed from: m */
    public tpd0 f16643m = new tpd0("account_makeup_beautyface_index", 0);

    /* JADX INFO: renamed from: n */
    public tpd0 f16644n = new tpd0("account_makeup_microplastic_index", 0);

    /* JADX INFO: renamed from: o */
    public tpd0 f16645o = new tpd0("account_makeup_stylemakeup_index", 0);

    /* JADX INFO: renamed from: p */
    public tpd0 f16646p = new tpd0("account_makeup_beautymakeup_index", 0);

    /* JADX INFO: renamed from: q */
    public uqd0 f16647q = new uqd0("account_makeup_beauty_all", "");

    /* JADX INFO: renamed from: r */
    public Map<String, Float> f16648r = new HashMap();

    /* JADX INFO: renamed from: s */
    public uqd0 f16649s = new uqd0("account_style_makeup_all", "");

    /* JADX INFO: renamed from: t */
    public Map<String, Intensity> f16650t = new HashMap();

    /* JADX INFO: renamed from: u */
    public uqd0 f16651u = new uqd0("account_beauty_makeup_index", "");

    /* JADX INFO: renamed from: v */
    public Map<String, Integer> f16652v = new HashMap();

    /* JADX INFO: renamed from: w */
    public uqd0 f16653w = new uqd0("account_beauty_makeup_cate_value", "");

    /* JADX INFO: renamed from: x */
    public Map<String, Float> f16654x = new HashMap();

    /* JADX INFO: renamed from: y */
    public uqd0 f16655y = new uqd0("account_beauty_makeup_item_value", "");

    /* JADX INFO: renamed from: z */
    public Map<String, Float> f16656z = new HashMap();

    /* JADX INFO: renamed from: A */
    public Map<Integer, Object> f16620A = new HashMap();

    /* JADX INFO: renamed from: B */
    public Map<String, Integer> f16621B = new HashMap();

    /* JADX INFO: renamed from: C */
    public List<Object> f16622C = new ArrayList();

    /* JADX INFO: renamed from: D */
    public Map<String, Float> f16623D = new HashMap();

    /* JADX INFO: renamed from: E */
    public uqd0 f16624E = new uqd0("account_makeup_category_show_map", "");

    /* JADX INFO: renamed from: F */
    public Map<String, Float> f16625F = new HashMap();

    /* JADX INFO: renamed from: G */
    public uqd0 f16626G = new uqd0("account_real_effect_face_beauty", "");

    /* JADX INFO: renamed from: H */
    public HashMap<String, String> f16627H = new HashMap<>();

    /* JADX INFO: renamed from: I */
    public uqd0 f16628I = new uqd0("account_real_effect_model_list", "");

    /* JADX INFO: renamed from: J */
    public Map<String, Float> f16629J = new HashMap();

    /* JADX INFO: renamed from: K */
    public uqd0 f16630K = new uqd0("account_real_effect_intensity_list", "");

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
        f16616L.put("skin_smooth", Float.valueOf(0.33f));
        f16616L.put("skin_whitening", Float.valueOf(0.52f));
        Map<String, Float> map = f16616L;
        Float fValueOf = Float.valueOf(0.5f);
        map.put("skin_ruddy", fValueOf);
        f16616L.put(FaceBeautyID.BIG_EYE, Float.valueOf(0.25f));
        Map<String, Float> map2 = f16616L;
        Float fValueOf2 = Float.valueOf(0.4f);
        map2.put(FaceBeautyID.THIN_FACE, fValueOf2);
        Map<String, Float> map3 = f16616L;
        Float fValueOf3 = Float.valueOf(0.7f);
        map3.put("skin_sharpen", fValueOf3);
        f16616L.put(FaceBeautyID.NOSE_SIZE, Float.valueOf(0.3f));
        f16616L.put("eye_brighten", fValueOf2);
        f16616L.put("teeth_whiten", fValueOf2);
        f16617M.put("skin_smooth", fValueOf3);
        f16617M.put("skin_whitening", fValueOf2);
        f16617M.put("skin_ruddy", fValueOf);
        f16617M.put(FaceBeautyID.BIG_EYE, fValueOf2);
        f16617M.put(FaceBeautyID.THIN_FACE, fValueOf);
        f16617M.put("skin_sharpen", fValueOf);
        Map<String, Float> map4 = f16617M;
        Float fValueOf4 = Float.valueOf(0.0f);
        map4.put(FaceBeautyID.FACE_WIDTH, fValueOf4);
        f16617M.put(FaceBeautyID.JAW_SHAPE, fValueOf4);
        f16617M.put(FaceBeautyID.SHORTEN_FACE, fValueOf4);
        f16617M.put(FaceBeautyID.FOREHEAD, fValueOf4);
        f16617M.put(FaceBeautyID.CHIN_LENGTH, fValueOf4);
        f16617M.put(FaceBeautyID.CHEEKBONE_WIDTH, fValueOf4);
        f16617M.put(FaceBeautyID.JAW_WIDTH, fValueOf4);
        f16617M.put(FaceBeautyID.NOSE_WIDTH, fValueOf4);
        f16617M.put(FaceBeautyID.NOSE_SIZE, fValueOf4);
        f16617M.put(FaceBeautyID.NOSE_LIFT, fValueOf4);
        f16617M.put(FaceBeautyID.NOSE_RIDGE_WIDTH, fValueOf4);
        f16617M.put(FaceBeautyID.NOSE_TIP_SIZE, fValueOf4);
        f16617M.put(FaceBeautyID.EYE_TILT, fValueOf4);
        f16617M.put(FaceBeautyID.EYE_DISTANCE, fValueOf4);
        f16617M.put(FaceBeautyID.EYE_HEIGHT, fValueOf4);
        f16617M.put(FaceBeautyID.LIP_THICKNESS, fValueOf4);
        f16617M.put(FaceBeautyID.MOUTH_SIZE, fValueOf4);
        f16617M.put("remove_pouch", fValueOf4);
        f16617M.put("remove_nasolabial_floads", fValueOf4);
        f16617M.put("eye_brighten", fValueOf4);
        f16617M.put("teeth_whiten", fValueOf4);
        f16618N.put(ILightningRender.IMakeupLevel.MAKEUP_LIPS, fValueOf3);
        f16618N.put(ILightningRender.IMakeupLevel.MAKEUP_BLUSH, fValueOf2);
        f16618N.put(ILightningRender.IMakeupLevel.MAKEUP_EYES, Float.valueOf(0.6f));
        f16618N.put(ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, fValueOf);
        f16618N.put(ILightningRender.IMakeupLevel.MAKEUP_PUPIL, fValueOf2);
        f16618N.put(ILightningRender.IMakeupLevel.MAKEUP_FACIAL, fValueOf2);
        f16619O.put(ILightningRender.IMakeupLevel.MAKEUP_LUT, fValueOf);
        f16619O.put(ILightningRender.IMakeupLevel.MAKEUP_ALL, fValueOf3);
    }

    public AccountCameraEffectMgr() {
        this.f16620A.put(4, this.f16622C);
    }

    /* JADX INFO: renamed from: B */
    public static float m28694B(String str) {
        Float f = f16618N.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: H */
    public static float m28695H(String str) {
        Float f;
        if (TextUtils.isEmpty(str) || (f = f16617M.get(str)) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: I */
    public static float m28696I(int i) {
        return new BigDecimal(i / 100.0f).setScale(2, 5).floatValue();
    }

    /* JADX INFO: renamed from: N */
    public static Intensity m28697N(String str, Map<String, Intensity> map) {
        if (TextUtils.isEmpty(str)) {
            return new Intensity(0.5f, 0.7f);
        }
        Intensity intensity = map.get(str);
        return intensity == null ? new Intensity(0.5f, 0.7f) : intensity;
    }

    /* JADX INFO: renamed from: V */
    public static AccountCameraEffectMgr m28698V() {
        return INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static String m28699Y(Object obj) {
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
    public static Object m28700k0(String str) {
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
    public static float m28701s(int i) {
        return new BigDecimal(((i / 100.0f) * 2.0f) - 1.0f).setScale(2, 4).floatValue();
    }

    /* JADX INFO: renamed from: t */
    public static int m28702t(float f) {
        return (int) ((((f - (-1.0f)) / 2.0f) * 100.0f) + 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public static int m28703u(boolean z, float f) {
        return z ? m28702t(f) : (int) (f * 100.0f);
    }

    /* JADX INFO: renamed from: x */
    public static float m28704x(String str) {
        Float f = f16617M.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: z */
    public static float m28705z(String str, Map<String, Float> map) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        Float f = map.get(str);
        return f == null ? m28704x(str) : f.floatValue();
    }

    /* JADX INFO: renamed from: A */
    public int m28706A() {
        return this.f16643m.get().intValue();
    }

    /* JADX INFO: renamed from: C */
    public float m28707C(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return m28694B(str2);
        }
        Float f = this.f16656z.get(str);
        return f == null ? m28694B(str2) : f.floatValue();
    }

    /* JADX INFO: renamed from: D */
    public int m28708D(String str) {
        Integer num = this.f16652v.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: E */
    public int m28709E() {
        return this.f16646p.get().intValue();
    }

    /* JADX INFO: renamed from: F */
    public float m28710F(String str) {
        return m28705z(str, this.f16648r);
    }

    /* JADX INFO: renamed from: G */
    public float m28711G(String str) {
        Float f = this.f16623D.get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: J */
    public List<AccountMakeUpMenuView.MakeupCategory> m28712J() {
        return this.f16634d;
    }

    /* JADX INFO: renamed from: K */
    public float m28713K(String str) {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f16637g) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: L */
    public int m28714L() {
        return this.f16644n.get().intValue();
    }

    /* JADX INFO: renamed from: M */
    public List<AccountMakeupPageAdapter.MakeupItem> m28715M() {
        return this.f16638h;
    }

    /* JADX INFO: renamed from: O */
    public int m28716O() {
        return this.f16645o.get().intValue();
    }

    /* JADX INFO: renamed from: P */
    public Intensity m28717P(String str) {
        return m28697N(str, this.f16650t);
    }

    /* JADX INFO: renamed from: Q */
    public List<AccountMakeupPageAdapter.MakeupItem> m28718Q(AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        List<AccountMakeupPageAdapter.MakeupItem> list = this.f16639i.get(makeupCategory.f16342id);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: R */
    public boolean m28719R() {
        return this.f16652v.size() != 0;
    }

    /* JADX INFO: renamed from: S */
    public void m28720S() {
        String str = this.f16626G.get();
        Object objM28700k0 = m28700k0(str);
        if (objM28700k0 instanceof Map) {
            this.f16625F = (Map) objM28700k0;
        }
        Object objM28700k1 = m28700k0(this.f16628I.get());
        if (objM28700k1 instanceof HashMap) {
            this.f16627H = (HashMap) objM28700k1;
        }
        Object objM28700k2 = m28700k0(this.f16630K.get());
        if (objM28700k2 instanceof Map) {
            this.f16629J = (Map) objM28700k2;
        }
        Object objM28700k3 = m28700k0(this.f16647q.get());
        if (objM28700k3 instanceof Map) {
            this.f16648r = (Map) objM28700k3;
        }
        Object objM28700k4 = m28700k0(this.f16649s.get());
        if (objM28700k4 instanceof Map) {
            this.f16650t = (Map) objM28700k4;
        }
        Object objM28700k5 = m28700k0(this.f16651u.get());
        if (objM28700k5 instanceof Map) {
            this.f16652v = (Map) objM28700k5;
        }
        Object objM28700k6 = m28700k0(this.f16653w.get());
        if (objM28700k6 instanceof Map) {
            this.f16654x = (Map) objM28700k6;
        }
        Object objM28700k7 = m28700k0(this.f16655y.get());
        if (objM28700k7 instanceof Map) {
            this.f16656z = (Map) objM28700k7;
        }
        Object objM28700k8 = m28700k0(this.f16624E.get());
        if (objM28700k8 instanceof Map) {
            this.f16623D = (Map) objM28700k8;
        }
        if (TextUtils.isEmpty(str)) {
            this.f16625F.putAll(f16616L);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m28721T(InterfaceC17833jp interfaceC17833jp) {
        this.f16631a = interfaceC17833jp;
    }

    /* JADX INFO: renamed from: U */
    public void m28722U(Act act) {
        this.f16632b = (AccountMakeupSharedViewModel) new C0490t(act).m3073a(AccountMakeupSharedViewModel.class);
    }

    /* JADX INFO: renamed from: W */
    public void m28723W() {
        if (this.f16631a != null) {
            Map<String, Float> map = this.f16625F;
            if (map != null) {
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    this.f16631a.setFaceBeautyValue(entry.getKey(), entry.getValue().floatValue());
                }
            }
            HashMap<String, String> map2 = this.f16627H;
            if (map2 != null && map2.size() > 0) {
                for (String str : this.f16627H.values()) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f16631a.mo142553u(str);
                    }
                }
            }
            Map<String, Float> map3 = this.f16629J;
            if (map3 != null) {
                for (Map.Entry<String, Float> entry2 : map3.entrySet()) {
                    this.f16631a.mo142550o(entry2.getKey(), entry2.getValue().floatValue());
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public AccountMakeupSharedViewModel m28724X() {
        return this.f16632b;
    }

    /* JADX INFO: renamed from: Z */
    public void m28725Z() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f16636f) {
            makeupItem.all = m28695H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m28726a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.equals(this.f16627H.get(str))) {
            return;
        }
        this.f16627H.put(str, str2);
    }

    /* JADX INFO: renamed from: a0 */
    public void m28727a0() {
        this.f16648r.putAll(f16617M);
    }

    /* JADX INFO: renamed from: b */
    public void m28728b() {
        this.f16652v.clear();
    }

    /* JADX INFO: renamed from: b0 */
    public void m28729b0() {
        for (List<AccountMakeupPageAdapter.MakeupItem> list : this.f16639i.values()) {
            if (list != null) {
                for (AccountMakeupPageAdapter.MakeupItem makeupItem : list) {
                    makeupItem.all = m28694B(makeupItem.type);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m28730c() {
        this.f16623D.clear();
    }

    /* JADX INFO: renamed from: c0 */
    public void m28731c0() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f16637g) {
            makeupItem.all = m28695H(makeupItem.type);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m28732d() {
        this.f16629J.clear();
    }

    /* JADX INFO: renamed from: d0 */
    public void m28733d0() {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f16638h) {
            makeupItem.all = 0.7f;
            makeupItem.lut = 0.5f;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m28734e() {
        this.f16627H.clear();
    }

    /* JADX INFO: renamed from: e0 */
    public void m28735e0() {
        this.f16647q.put(m28699Y(this.f16648r));
        this.f16649s.put(m28699Y(this.f16650t));
        this.f16651u.put(m28699Y(this.f16652v));
        this.f16653w.put(m28699Y(this.f16654x));
        this.f16655y.put(m28699Y(this.f16656z));
        this.f16626G.put(m28699Y(this.f16625F));
        this.f16628I.put(m28699Y(this.f16627H));
        this.f16630K.put(m28699Y(this.f16629J));
        this.f16624E.put(m28699Y(this.f16623D));
    }

    /* JADX INFO: renamed from: f */
    public void m28736f() {
        this.f16645o.put(0);
    }

    /* JADX INFO: renamed from: f0 */
    public void m28737f0(int i) {
        this.f16642l.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public void m28738g() {
        this.f16650t.clear();
    }

    /* JADX INFO: renamed from: g0 */
    public void m28739g0(int i) {
        this.f16643m.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public List<C19563qs.b> m28740h() {
        int i = 0;
        while (true) {
            List<C19563qs.b> list = this.f16641k;
            if (i >= 5) {
                return list;
            }
            list.add(new C19563qs.b(0.0f, 0.0f, false, false));
            i++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m28741h0(int i) {
        this.f16646p.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public List<AccountMakeupPageAdapter.MakeupItem> m28742i(List<List<CameraBeautyMode>> list) {
        this.f16635e.clear();
        int size = list.size();
        if (size < 5) {
            return this.f16635e;
        }
        String[] strArr = {"无", "自然", "可爱", "女神", "净白"};
        int[] iArr = {v2c0.f179407K, v2c0.f179380B, v2c0.f179527z, v2c0.f179377A, v2c0.f179383C};
        int[] iArr2 = {v2c0.f179410L, 0, 0, 0, 0};
        for (int i = 0; i < size; i++) {
            HashMap map = new HashMap();
            for (CameraBeautyMode cameraBeautyMode : list.get(i)) {
                map.put(cameraBeautyMode.type, Float.valueOf(cameraBeautyMode.value));
            }
            List<AccountMakeupPageAdapter.MakeupItem> list2 = this.f16635e;
            if (i == 0) {
                list2.add(new AccountMakeupPageAdapter.MakeupItem(strArr[i], "none", map, iArr[i], iArr2[i]));
            } else {
                list2.add(new AccountMakeupPageAdapter.MakeupItem(strArr[i], "local", map, iArr[i], iArr2[i]));
            }
        }
        return this.f16635e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m28743i0(int i) {
        this.f16644n.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j */
    public List<AccountMakeupPageAdapter.MakeupItem> m28744j() {
        ArrayList arrayList = new ArrayList();
        this.f16636f = arrayList;
        arrayList.add(new AccountMakeupPageAdapter.MakeupItem("磨皮", "skin_smooth", v2c0.f179503r, v2c0.f179506s, m28710F("skin_smooth")));
        this.f16636f.add(new AccountMakeupPageAdapter.MakeupItem("美白", "skin_whitening", v2c0.f179509t, v2c0.f179512u, m28710F("skin_whitening")));
        this.f16636f.add(new AccountMakeupPageAdapter.MakeupItem("红润", "skin_ruddy", v2c0.f179515v, v2c0.f179518w, m28710F("skin_ruddy")));
        this.f16636f.add(new AccountMakeupPageAdapter.MakeupItem("大眼", FaceBeautyID.BIG_EYE, v2c0.f179491n, v2c0.f179494o, m28710F(FaceBeautyID.BIG_EYE)));
        this.f16636f.add(new AccountMakeupPageAdapter.MakeupItem("瘦脸", FaceBeautyID.THIN_FACE, v2c0.f179521x, v2c0.f179524y, m28710F(FaceBeautyID.THIN_FACE)));
        this.f16636f.add(new AccountMakeupPageAdapter.MakeupItem("锐化", "skin_sharpen", v2c0.f179497p, v2c0.f179500q, m28710F("skin_sharpen")));
        return this.f16636f;
    }

    /* JADX INFO: renamed from: j0 */
    public void m28745j0(int i) {
        this.f16645o.put(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public final AccountMakeUpMenuView.MakeupCategory m28746k(CameraCategory cameraCategory) {
        AccountMakeUpMenuView.MakeupCategory makeupCategory;
        String str = cameraCategory.name;
        str.getClass();
        switch (str) {
            case "修容":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_FACIAL, v2c0.f179462d0, v2c0.f179465e0);
                break;
            case "口红":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_LIPS, v2c0.f179486l0, v2c0.f179489m0);
                break;
            case "眼妆":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_EYES, v2c0.f179480j0, v2c0.f179483k0);
                break;
            case "眉毛":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, v2c0.f179474h0, v2c0.f179477i0);
                break;
            case "美瞳":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_PUPIL, v2c0.f179468f0, v2c0.f179471g0);
                break;
            case "腮红":
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, ILightningRender.IMakeupLevel.MAKEUP_BLUSH, v2c0.f179456b0, v2c0.f179459c0);
                break;
            default:
                makeupCategory = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, 1004);
                break;
        }
        makeupCategory.all = m28711G(makeupCategory.type);
        return makeupCategory;
    }

    /* JADX INFO: renamed from: l */
    public List<AccountMakeUpMenuView.MakeupCategory> m28747l(List<CameraCategory> list) {
        this.f16634d.clear();
        this.f16634d.add(new AccountMakeUpMenuView.MakeupCategory("一键美颜", 1000));
        this.f16634d.add(new AccountMakeUpMenuView.MakeupCategory("美颜", 1001));
        this.f16634d.add(new AccountMakeUpMenuView.MakeupCategory("微整形", 1002));
        AccountMakeUpMenuView.MakeupCategory makeupCategory = new AccountMakeUpMenuView.MakeupCategory("美妆", 1004);
        AccountMakeUpMenuView.MakeupCategory makeupCategory2 = null;
        for (CameraCategory cameraCategory : list) {
            if ("风格妆".equals(cameraCategory.name)) {
                makeupCategory2 = new AccountMakeUpMenuView.MakeupCategory(cameraCategory, 1003);
            } else {
                makeupCategory.subMenu.add(0, m28746k(cameraCategory));
            }
        }
        makeupCategory.subMenu.add(0, new AccountMakeUpMenuView.MakeupCategory("原图", -1, v2c0.f179407K, v2c0.f179410L));
        if (makeupCategory2 != null) {
            this.f16634d.add(makeupCategory2);
        }
        this.f16634d.add(makeupCategory);
        return this.f16634d;
    }

    /* JADX INFO: renamed from: l0 */
    public void m28748l0(String str, float f) {
        this.f16654x.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: m */
    public final AccountMakeupPageAdapter.MakeupItem m28749m(CameraSticker cameraSticker, String str) {
        float fM28707C = m28707C(cameraSticker.modelFilePath, str);
        str.getClass();
        switch (str) {
            case "makeup_blush":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_BLUSH, fM28707C);
            case "makeup_pupil":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_PUPIL, fM28707C);
            case "makeup_facial":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_FACIAL, fM28707C);
            case "makeup_eyes":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_EYES, fM28707C);
            case "makeup_eyebrow":
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_EYEBROW, fM28707C);
            default:
                return new AccountMakeupPageAdapter.MakeupItem(cameraSticker, ILightningRender.IMakeupLevel.MAKEUP_LIPS, fM28707C);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m28750m0(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f16652v.put(str, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    public final AccountMakeupPageAdapter.MakeupItem m28751n(AccountMakeUpMenuView.MakeupCategory makeupCategory) {
        AccountMakeupPageAdapter.MakeupItem makeupItem = new AccountMakeupPageAdapter.MakeupItem("无", "none", v2c0.f179407K, v2c0.f179410L, false);
        makeupItem.extra = makeupCategory.type;
        return makeupItem;
    }

    /* JADX INFO: renamed from: n0 */
    public void m28752n0(String str, Float f) {
        this.f16656z.put(str, f);
    }

    /* JADX INFO: renamed from: o */
    public List<AccountMakeupPageAdapter.MakeupItem> m28753o() {
        ArrayList arrayList = new ArrayList();
        this.f16637g = arrayList;
        arrayList.add(new AccountMakeupPageAdapter.MakeupItem("脸宽", FaceBeautyID.FACE_WIDTH, v2c0.f179381B0, v2c0.f179384C0, false));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("削脸", FaceBeautyID.JAW_SHAPE, v2c0.f179393F0, v2c0.f179396G0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("短脸", FaceBeautyID.SHORTEN_FACE, v2c0.f179457b1, v2c0.f179460c1, false));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("额头", FaceBeautyID.FOREHEAD, v2c0.f179387D0, v2c0.f179390E0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("下巴", FaceBeautyID.CHIN_LENGTH, v2c0.f179504r0, v2c0.f179507s0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("颧骨", FaceBeautyID.CHEEKBONE_WIDTH, v2c0.f179498p0, v2c0.f179501q0, false));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("下颌骨", FaceBeautyID.JAW_WIDTH, v2c0.f179399H0, v2c0.f179402I0, false));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("鼻子宽度", FaceBeautyID.NOSE_WIDTH, v2c0.f179447X0, v2c0.f179449Y0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("鼻子大小", FaceBeautyID.NOSE_SIZE, v2c0.f179435T0, v2c0.f179438U0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("鼻高", FaceBeautyID.NOSE_LIFT, v2c0.f179423P0, v2c0.f179426Q0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("鼻梁", FaceBeautyID.NOSE_RIDGE_WIDTH, v2c0.f179429R0, v2c0.f179432S0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("鼻尖", FaceBeautyID.NOSE_TIP_SIZE, v2c0.f179441V0, v2c0.f179444W0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("眼睛角度", FaceBeautyID.EYE_TILT, v2c0.f179528z0, v2c0.f179378A0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("眼距", FaceBeautyID.EYE_DISTANCE, v2c0.f179516v0, v2c0.f179519w0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("眼高", FaceBeautyID.EYE_HEIGHT, v2c0.f179522x0, v2c0.f179525y0, false));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("嘴唇厚度", FaceBeautyID.LIP_THICKNESS, v2c0.f179405J0, v2c0.f179408K0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("嘴唇大小", FaceBeautyID.MOUTH_SIZE, v2c0.f179411L0, v2c0.f179414M0, true));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("眼袋", "remove_pouch", v2c0.f179451Z0, v2c0.f179454a1, false));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("祛法令纹", "remove_nasolabial_floads", v2c0.f179417N0, v2c0.f179420O0, false));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("亮眼", "eye_brighten", v2c0.f179510t0, v2c0.f179513u0, false));
        this.f16637g.add(new AccountMakeupPageAdapter.MakeupItem("白牙", "teeth_whiten", v2c0.f179463d1, v2c0.f179466e1, false));
        return this.f16637g;
    }

    /* JADX INFO: renamed from: o0 */
    public void m28754o0(String str, float f) {
        this.f16648r.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: p */
    public List<AccountMakeupPageAdapter.MakeupItem> m28755p(List<CameraSticker> list) {
        this.f16638h.add(new AccountMakeupPageAdapter.MakeupItem("无", "none", v2c0.f179407K, v2c0.f179410L, false));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            AccountMakeupPageAdapter.MakeupItem makeupItem = new AccountMakeupPageAdapter.MakeupItem(it.next(), ILightningRender.IMakeupLevel.MAKEUP_ALL);
            Intensity intensityM28717P = m28717P(makeupItem.modelFilePath);
            makeupItem.lut = intensityM28717P.lut;
            makeupItem.all = intensityM28717P.all;
            this.f16638h.add(makeupItem);
        }
        return this.f16638h;
    }

    /* JADX INFO: renamed from: p0 */
    public void m28756p0(String str, float f) {
        this.f16623D.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: q */
    public List<AccountMakeupPageAdapter.MakeupItem> m28757q(AccountMakeUpMenuView.MakeupCategory makeupCategory, List<CameraSticker> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m28751n(makeupCategory));
        Iterator<CameraSticker> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m28749m(it.next(), makeupCategory.type));
        }
        this.f16639i.put(makeupCategory.f16342id, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: q0 */
    public void m28758q0(String str, float f) {
        this.f16625F.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: r */
    public void m28759r() {
        this.f16631a = null;
    }

    /* JADX INFO: renamed from: r0 */
    public void m28760r0(Map<String, Float> map) {
        if (map != null) {
            this.f16625F.clear();
            this.f16625F.putAll(map);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m28761s0(String str, float f) {
        this.f16629J.put(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: t0 */
    public void m28762t0(String str, float f, float f2) {
        this.f16650t.put(str, new Intensity(f, f2));
    }

    /* JADX INFO: renamed from: v */
    public List<AccountMakeupPageAdapter.MakeupItem> m28763v() {
        return this.f16635e;
    }

    /* JADX INFO: renamed from: w */
    public int m28764w() {
        return this.f16642l.get().intValue();
    }

    /* JADX INFO: renamed from: y */
    public float m28765y(String str) {
        for (AccountMakeupPageAdapter.MakeupItem makeupItem : this.f16636f) {
            if (str.equals(makeupItem.type)) {
                return makeupItem.all;
            }
        }
        return 0.0f;
    }
}
