package p153l;

import com.facebook.common.internal.ImmutableSet;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class dr2 implements yk90 {

    /* JADX INFO: renamed from: n */
    public static final Set<String> f90338n = ImmutableSet.m8208of((Object[]) new String[]{"id", "uri_source"});

    /* JADX INFO: renamed from: o */
    public static final Object f90339o = new Object();

    /* JADX INFO: renamed from: a */
    public final ImageRequest f90340a;

    /* JADX INFO: renamed from: b */
    public final String f90341b;

    /* JADX INFO: renamed from: c */
    public final String f90342c;

    /* JADX INFO: renamed from: d */
    public final cl90 f90343d;

    /* JADX INFO: renamed from: e */
    public final Object f90344e;

    /* JADX INFO: renamed from: f */
    public final ImageRequest.RequestLevel f90345f;

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> f90346g;

    /* JADX INFO: renamed from: h */
    public boolean f90347h;

    /* JADX INFO: renamed from: i */
    public Priority f90348i;

    /* JADX INFO: renamed from: j */
    public boolean f90349j;

    /* JADX INFO: renamed from: k */
    public boolean f90350k;

    /* JADX INFO: renamed from: l */
    public final List<zk90> f90351l;

    /* JADX INFO: renamed from: m */
    public final tjm f90352m;

    public dr2(ImageRequest imageRequest, String str, String str2, Map<String, ?> map, cl90 cl90Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, tjm tjmVar) {
        this.f90340a = imageRequest;
        this.f90341b = str;
        HashMap map2 = new HashMap();
        this.f90346g = map2;
        map2.put("id", str);
        map2.put("uri_source", imageRequest == null ? "null-request" : imageRequest.m8639w());
        mo97950d(map);
        this.f90342c = str2;
        this.f90343d = cl90Var;
        this.f90344e = obj == null ? f90339o : obj;
        this.f90345f = requestLevel;
        this.f90347h = z;
        this.f90348i = priority;
        this.f90349j = z2;
        this.f90350k = false;
        this.f90351l = new ArrayList();
        this.f90352m = tjmVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m117660a(List<zk90> list) {
        if (list == null) {
            return;
        }
        Iterator<zk90> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo8551b();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m117661c(List<zk90> list) {
        if (list == null) {
            return;
        }
        Iterator<zk90> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo8584a();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m117662f(List<zk90> list) {
        if (list == null) {
            return;
        }
        Iterator<zk90> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo118261c();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m117663g(List<zk90> list) {
        if (list == null) {
            return;
        }
        Iterator<zk90> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo118262d();
        }
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: B */
    public void mo117664B(String str) {
        mo117679u(str, "default");
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: F */
    public synchronized boolean mo117665F() {
        return this.f90349j;
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: H */
    public synchronized boolean mo117666H() {
        return this.f90347h;
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: I */
    public ImageRequest.RequestLevel mo117667I() {
        return this.f90345f;
    }

    @Override // p153l.lyk
    /* JADX INFO: renamed from: b */
    public void mo97949b(String str, Object obj) {
        if (f90338n.contains(str)) {
            return;
        }
        this.f90346g.put(str, obj);
    }

    @Override // p153l.lyk
    /* JADX INFO: renamed from: d */
    public void mo97950d(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            mo97949b(entry.getKey(), entry.getValue());
        }
    }

    @Override // p153l.lyk
    /* JADX INFO: renamed from: e */
    public <T> T mo117668e(String str) {
        return (T) this.f90346g.get(str);
    }

    @Override // p153l.lyk
    public Map<String, Object> getExtras() {
        return this.f90346g;
    }

    @Override // p153l.yk90
    public String getId() {
        return this.f90341b;
    }

    @Override // p153l.yk90
    public synchronized Priority getPriority() {
        return this.f90348i;
    }

    /* JADX INFO: renamed from: h */
    public void m117669h() {
        m117660a(m117670i());
    }

    /* JADX INFO: renamed from: i */
    public synchronized List<zk90> m117670i() {
        if (this.f90350k) {
            return null;
        }
        this.f90350k = true;
        return new ArrayList(this.f90351l);
    }

    /* JADX INFO: renamed from: j */
    public synchronized List<zk90> m117671j(boolean z) {
        if (z == this.f90349j) {
            return null;
        }
        this.f90349j = z;
        return new ArrayList(this.f90351l);
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: k */
    public Object mo117672k() {
        return this.f90344e;
    }

    /* JADX INFO: renamed from: l */
    public synchronized List<zk90> m117673l(boolean z) {
        if (z == this.f90347h) {
            return null;
        }
        this.f90347h = z;
        return new ArrayList(this.f90351l);
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: m */
    public tjm mo117674m() {
        return this.f90352m;
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: n */
    public cl90 mo117675n() {
        return this.f90343d;
    }

    /* JADX INFO: renamed from: o */
    public synchronized List<zk90> m117676o(Priority priority) {
        if (priority == this.f90348i) {
            return null;
        }
        this.f90348i = priority;
        return new ArrayList(this.f90351l);
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: q */
    public void mo117677q(zk90 zk90Var) {
        boolean z;
        synchronized (this) {
            this.f90351l.add(zk90Var);
            z = this.f90350k;
        }
        if (z) {
            zk90Var.mo8551b();
        }
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: t */
    public ImageRequest mo117678t() {
        return this.f90340a;
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: u */
    public void mo117679u(String str, String str2) {
        this.f90346g.put("origin", str);
        this.f90346g.put("origin_sub", str2);
    }

    @Override // p153l.yk90
    /* JADX INFO: renamed from: v */
    public String mo117680v() {
        return this.f90342c;
    }

    public dr2(ImageRequest imageRequest, String str, cl90 cl90Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, tjm tjmVar) {
        this(imageRequest, str, null, null, cl90Var, obj, requestLevel, z, z2, priority, tjmVar);
    }
}
