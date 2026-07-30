package p149l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class pwf0 {

    /* JADX INFO: renamed from: a */
    private Map<String, Float> f151566a;

    /* JADX INFO: renamed from: b */
    private final Set<String> f151567b;

    public pwf0() {
        HashMap map = new HashMap();
        this.f151566a = map;
        Float fValueOf = Float.valueOf(0.0f);
        map.put("beauty_bigEyeValue", fValueOf);
        this.f151566a.put("beauty_thinFaceValue", fValueOf);
        this.f151566a.put("beauty_skinSmoothingValue", fValueOf);
        this.f151566a.put("beauty_skinWhitenValue", fValueOf);
        this.f151566a.put("beauty_skinRuddyValue", fValueOf);
        this.f151566a.put("beauty_skinSharpenValue", fValueOf);
        this.f151566a.put("beauty_eyeBrightenValue", fValueOf);
        this.f151566a.put("beauty_teethWhtienValue", fValueOf);
        this.f151566a.put("beauty_removePouchValue", fValueOf);
        this.f151566a.put("beauty_nasolabiaFoldslValue", fValueOf);
        HashSet hashSet = new HashSet();
        this.f151567b = hashSet;
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
    public float m171749a(String str) {
        Float f = this.f151566a.get(av2.m99113a(str));
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: renamed from: b */
    public void m171750b(tl10 tl10Var) {
        for (String str : this.f151566a.keySet()) {
            Float f = this.f151566a.get(str);
            tl10Var.setFaceBeautyValue(str, f == null ? 0.0f : f.floatValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public void m171751c(String str, float f) {
        String strM99113a = av2.m99113a(str);
        if (this.f151567b.contains(strM99113a)) {
            this.f151566a.put(strM99113a, Float.valueOf(f));
        }
    }
}
