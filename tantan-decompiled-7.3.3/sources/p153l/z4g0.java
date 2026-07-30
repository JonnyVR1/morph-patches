package p153l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class z4g0 {

    /* JADX INFO: renamed from: a */
    private Map<String, Float> f202953a;

    /* JADX INFO: renamed from: b */
    private final Set<String> f202954b;

    public z4g0() {
        HashMap map = new HashMap();
        this.f202953a = map;
        Float fValueOf = Float.valueOf(0.0f);
        map.put("beauty_bigEyeValue", fValueOf);
        this.f202953a.put("beauty_thinFaceValue", fValueOf);
        this.f202953a.put("beauty_skinSmoothingValue", fValueOf);
        this.f202953a.put("beauty_skinWhitenValue", fValueOf);
        this.f202953a.put("beauty_skinRuddyValue", fValueOf);
        this.f202953a.put("beauty_skinSharpenValue", fValueOf);
        this.f202953a.put("beauty_eyeBrightenValue", fValueOf);
        this.f202953a.put("beauty_teethWhtienValue", fValueOf);
        this.f202953a.put("beauty_removePouchValue", fValueOf);
        this.f202953a.put("beauty_nasolabiaFoldslValue", fValueOf);
        HashSet hashSet = new HashSet();
        this.f202954b = hashSet;
        hashSet.add("beauty_bigEyeValue");
        hashSet.add("beauty_thinFaceValue");
        hashSet.add("beauty_skinSmoothingValue");
        hashSet.add("beauty_skinWhitenValue");
        hashSet.add("beauty_skinRuddyValue");
        hashSet.add("beauty_skinSharpenValue");
        hashSet.add("beauty_eyeBrightenValue");
        hashSet.add("beauty_teethWhtienValue");
        hashSet.add("beauty_removePouchValue");
        hashSet.add("beauty_nasolabiaFoldslValue");
    }

    /* JADX INFO: renamed from: a */
    public float m218590a(String str) {
        Float f = this.f202953a.get(qv2.m178246a(str));
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: b */
    public void m218591b(du10 du10Var) {
        for (String str : this.f202953a.keySet()) {
            Float f = this.f202953a.get(str);
            du10Var.setFaceBeautyValue(str, f == null ? 0.0f : f.floatValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m218592c(String str, float f) {
        String strM178246a = qv2.m178246a(str);
        if (this.f202954b.contains(strM178246a)) {
            this.f202953a.put(strM178246a, Float.valueOf(f));
        }
    }
}
