package p149l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class th2 implements da5 {

    /* JADX INFO: renamed from: c */
    public static final Set<String> f170179c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: a */
    public Map<String, Object> f170180a = new HashMap();

    /* JADX INFO: renamed from: b */
    public ngm f170181b;

    @Override // p149l.da5
    /* JADX INFO: renamed from: G */
    public ngm mo110564G() {
        if (this.f170181b == null) {
            this.f170181b = new ogm(getWidth(), getHeight(), getSizeInBytes(), mo110565X(), getExtras());
        }
        return this.f170181b;
    }

    @Override // p149l.da5
    /* JADX INFO: renamed from: X */
    public mnb0 mo110565X() {
        return ykm.f198776d;
    }

    @Override // p149l.vvk
    /* JADX INFO: renamed from: b */
    public <E> void mo155861b(String str, E e) {
        if (f170179c.contains(str)) {
            this.f170180a.put(str, e);
        }
    }

    @Override // p149l.vvk
    /* JADX INFO: renamed from: d */
    public void mo155862d(Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        for (String str : f170179c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f170180a.put(str, obj);
            }
        }
    }

    @Override // p149l.da5
    /* JADX INFO: renamed from: f0 */
    public boolean mo110566f0() {
        return false;
    }

    @Override // p149l.xvk
    public Map<String, Object> getExtras() {
        return this.f170180a;
    }
}
