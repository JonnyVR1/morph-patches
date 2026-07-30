package p153l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ai2 implements db5 {

    /* JADX INFO: renamed from: c */
    public static final Set<String> f71442c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: a */
    public Map<String, Object> f71443a = new HashMap();

    /* JADX INFO: renamed from: b */
    public qim f71444b;

    @Override // p153l.db5
    /* JADX INFO: renamed from: G */
    public qim mo97947G() {
        if (this.f71444b == null) {
            this.f71444b = new rim(getWidth(), getHeight(), getSizeInBytes(), mo97948Y(), getExtras());
        }
        return this.f71444b;
    }

    @Override // p153l.db5
    /* JADX INFO: renamed from: Y */
    public qvb0 mo97948Y() {
        return anm.f72363d;
    }

    @Override // p153l.lyk
    /* JADX INFO: renamed from: b */
    public <E> void mo97949b(String str, E e) {
        if (f71442c.contains(str)) {
            this.f71443a.put(str, e);
        }
    }

    @Override // p153l.lyk
    /* JADX INFO: renamed from: d */
    public void mo97950d(Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        for (String str : f71442c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f71443a.put(str, obj);
            }
        }
    }

    @Override // p153l.db5
    /* JADX INFO: renamed from: g0 */
    public boolean mo97951g0() {
        return false;
    }

    @Override // p153l.nyk, p153l.lyk
    public Map<String, Object> getExtras() {
        return this.f71443a;
    }
}
