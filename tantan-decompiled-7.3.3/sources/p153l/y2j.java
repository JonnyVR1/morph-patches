package p153l;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class y2j implements j2d0 {

    /* JADX INFO: renamed from: a */
    public final List<j2d0> f197262a;

    public y2j(Set<j2d0> set) {
        this.f197262a = new ArrayList(set.size());
        for (j2d0 j2d0Var : set) {
            if (j2d0Var != null) {
                this.f197262a.add(j2d0Var);
            }
        }
    }

    @Override // p153l.dl90
    /* JADX INFO: renamed from: a */
    public void mo116739a(String str, String str2) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo116739a(str, str2);
            } catch (Exception e) {
                m214090l("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // p153l.j2d0
    /* JADX INFO: renamed from: b */
    public void mo143211b(ImageRequest imageRequest, String str, boolean z) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo143211b(imageRequest, str, z);
            } catch (Exception e) {
                m214090l("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // p153l.dl90
    /* JADX INFO: renamed from: c */
    public void mo116740c(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo116740c(str, str2, th, map);
            } catch (Exception e) {
                m214090l("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // p153l.dl90
    /* JADX INFO: renamed from: d */
    public void mo116741d(String str, String str2, String str3) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo116741d(str, str2, str3);
            } catch (Exception e) {
                m214090l("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // p153l.j2d0
    /* JADX INFO: renamed from: e */
    public void mo143212e(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo143212e(imageRequest, obj, str, z);
            } catch (Exception e) {
                m214090l("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // p153l.dl90
    /* JADX INFO: renamed from: f */
    public boolean mo116742f(String str) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            if (this.f197262a.get(i).mo116742f(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p153l.dl90
    /* JADX INFO: renamed from: g */
    public void mo116743g(String str, String str2, Map<String, String> map) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo116743g(str, str2, map);
            } catch (Exception e) {
                m214090l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // p153l.dl90
    /* JADX INFO: renamed from: h */
    public void mo116744h(String str, String str2, Map<String, String> map) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo116744h(str, str2, map);
            } catch (Exception e) {
                m214090l("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // p153l.dl90
    /* JADX INFO: renamed from: i */
    public void mo116745i(String str, String str2, boolean z) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo116745i(str, str2, z);
            } catch (Exception e) {
                m214090l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // p153l.j2d0
    /* JADX INFO: renamed from: j */
    public void mo143213j(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo143213j(imageRequest, str, th, z);
            } catch (Exception e) {
                m214090l("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // p153l.j2d0
    /* JADX INFO: renamed from: k */
    public void mo143214k(String str) {
        int size = this.f197262a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f197262a.get(i).mo143214k(str);
            } catch (Exception e) {
                m214090l("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m214090l(String str, Throwable th) {
        huf.m137181i("ForwardingRequestListener", str, th);
    }

    public y2j(j2d0... j2d0VarArr) {
        this.f197262a = new ArrayList(j2d0VarArr.length);
        for (j2d0 j2d0Var : j2d0VarArr) {
            if (j2d0Var != null) {
                this.f197262a.add(j2d0Var);
            }
        }
    }
}
