package p149l;

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
public class mq2 implements uc90 {

    /* JADX INFO: renamed from: n */
    public static final Set<String> f135147n = ImmutableSet.m8154of((Object[]) new String[]{"id", "uri_source"});

    /* JADX INFO: renamed from: o */
    public static final Object f135148o = new Object();

    /* JADX INFO: renamed from: a */
    public final ImageRequest f135149a;

    /* JADX INFO: renamed from: b */
    public final String f135150b;

    /* JADX INFO: renamed from: c */
    public final String f135151c;

    /* JADX INFO: renamed from: d */
    public final yc90 f135152d;

    /* JADX INFO: renamed from: e */
    public final Object f135153e;

    /* JADX INFO: renamed from: f */
    public final ImageRequest.RequestLevel f135154f;

    /* JADX INFO: renamed from: g */
    public final Map<String, Object> f135155g;

    /* JADX INFO: renamed from: h */
    public boolean f135156h;

    /* JADX INFO: renamed from: i */
    public Priority f135157i;

    /* JADX INFO: renamed from: j */
    public boolean f135158j;

    /* JADX INFO: renamed from: k */
    public boolean f135159k;

    /* JADX INFO: renamed from: l */
    public final List<vc90> f135160l;

    /* JADX INFO: renamed from: m */
    public final qhm f135161m;

    public mq2(ImageRequest imageRequest, String str, String str2, Map<String, ?> map, yc90 yc90Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, qhm qhmVar) {
        this.f135149a = imageRequest;
        this.f135150b = str;
        HashMap map2 = new HashMap();
        this.f135155g = map2;
        map2.put("id", str);
        map2.put("uri_source", imageRequest == null ? "null-request" : imageRequest.m8585w());
        mo155862d(map);
        this.f135151c = str2;
        this.f135152d = yc90Var;
        this.f135153e = obj == null ? f135148o : obj;
        this.f135154f = requestLevel;
        this.f135156h = z;
        this.f135157i = priority;
        this.f135158j = z2;
        this.f135159k = false;
        this.f135160l = new ArrayList();
        this.f135161m = qhmVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m155853a(List<vc90> list) {
        if (list == null) {
            return;
        }
        Iterator<vc90> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo8497b();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m155854c(List<vc90> list) {
        if (list == null) {
            return;
        }
        Iterator<vc90> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo8530a();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m155855f(List<vc90> list) {
        if (list == null) {
            return;
        }
        Iterator<vc90> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo160552c();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m155856g(List<vc90> list) {
        if (list == null) {
            return;
        }
        Iterator<vc90> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo160553d();
        }
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: B */
    public void mo155857B(String str) {
        mo155874u(str, "default");
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: F */
    public synchronized boolean mo155858F() {
        return this.f135158j;
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: H */
    public synchronized boolean mo155859H() {
        return this.f135156h;
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: I */
    public ImageRequest.RequestLevel mo155860I() {
        return this.f135154f;
    }

    @Override // p149l.vvk
    /* JADX INFO: renamed from: b */
    public void mo155861b(String str, Object obj) {
        if (f135147n.contains(str)) {
            return;
        }
        this.f135155g.put(str, obj);
    }

    @Override // p149l.vvk
    /* JADX INFO: renamed from: d */
    public void mo155862d(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            mo155861b(entry.getKey(), entry.getValue());
        }
    }

    @Override // p149l.vvk
    /* JADX INFO: renamed from: e */
    public <T> T mo155863e(String str) {
        return (T) this.f135155g.get(str);
    }

    @Override // p149l.vvk
    public Map<String, Object> getExtras() {
        return this.f135155g;
    }

    @Override // p149l.uc90
    public String getId() {
        return this.f135150b;
    }

    @Override // p149l.uc90
    public synchronized Priority getPriority() {
        return this.f135157i;
    }

    /* JADX INFO: renamed from: h */
    public void m155864h() {
        m155853a(m155865i());
    }

    /* JADX INFO: renamed from: i */
    public synchronized List<vc90> m155865i() {
        if (this.f135159k) {
            return null;
        }
        this.f135159k = true;
        return new ArrayList(this.f135160l);
    }

    /* JADX INFO: renamed from: j */
    public synchronized List<vc90> m155866j(boolean z) {
        if (z == this.f135158j) {
            return null;
        }
        this.f135158j = z;
        return new ArrayList(this.f135160l);
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: k */
    public Object mo155867k() {
        return this.f135153e;
    }

    /* JADX INFO: renamed from: l */
    public synchronized List<vc90> m155868l(boolean z) {
        if (z == this.f135156h) {
            return null;
        }
        this.f135156h = z;
        return new ArrayList(this.f135160l);
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: m */
    public qhm mo155869m() {
        return this.f135161m;
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: n */
    public yc90 mo155870n() {
        return this.f135152d;
    }

    /* JADX INFO: renamed from: o */
    public synchronized List<vc90> m155871o(Priority priority) {
        if (priority == this.f135157i) {
            return null;
        }
        this.f135157i = priority;
        return new ArrayList(this.f135160l);
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: q */
    public void mo155872q(vc90 vc90Var) {
        boolean z;
        synchronized (this) {
            this.f135160l.add(vc90Var);
            z = this.f135159k;
        }
        if (z) {
            vc90Var.mo8497b();
        }
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: t */
    public ImageRequest mo155873t() {
        return this.f135149a;
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: u */
    public void mo155874u(String str, String str2) {
        this.f135155g.put("origin", str);
        this.f135155g.put("origin_sub", str2);
    }

    @Override // p149l.uc90
    /* JADX INFO: renamed from: v */
    public String mo155875v() {
        return this.f135151c;
    }

    public mq2(ImageRequest imageRequest, String str, yc90 yc90Var, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority, qhm qhmVar) {
        this(imageRequest, str, null, null, yc90Var, obj, requestLevel, z, z2, priority, qhmVar);
    }
}
