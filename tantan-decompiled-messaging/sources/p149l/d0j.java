package p149l;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d0j implements guc0 {

    /* JADX INFO: renamed from: a */
    public final List<guc0> f83189a;

    public d0j(Set<guc0> set) {
        this.f83189a = new ArrayList(set.size());
        for (guc0 guc0Var : set) {
            if (guc0Var != null) {
                this.f83189a.add(guc0Var);
            }
        }
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: a */
    public void mo109499a(String str, String str2) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109499a(str, str2);
            } catch (Exception e) {
                m109510l("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // p149l.guc0
    /* JADX INFO: renamed from: b */
    public void mo109500b(ImageRequest imageRequest, String str, boolean z) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109500b(imageRequest, str, z);
            } catch (Exception e) {
                m109510l("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: c */
    public void mo109501c(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109501c(str, str2, th, map);
            } catch (Exception e) {
                m109510l("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: d */
    public void mo109502d(String str, String str2, String str3) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109502d(str, str2, str3);
            } catch (Exception e) {
                m109510l("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // p149l.guc0
    /* JADX INFO: renamed from: e */
    public void mo109503e(ImageRequest imageRequest, Object obj, String str, boolean z) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109503e(imageRequest, obj, str, z);
            } catch (Exception e) {
                m109510l("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: f */
    public boolean mo109504f(String str) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            if (this.f83189a.get(i).mo109504f(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: g */
    public void mo109505g(String str, String str2, Map<String, String> map) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109505g(str, str2, map);
            } catch (Exception e) {
                m109510l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: h */
    public void mo109506h(String str, String str2, Map<String, String> map) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109506h(str, str2, map);
            } catch (Exception e) {
                m109510l("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // p149l.zc90
    /* JADX INFO: renamed from: i */
    public void mo109507i(String str, String str2, boolean z) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109507i(str, str2, z);
            } catch (Exception e) {
                m109510l("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // p149l.guc0
    /* JADX INFO: renamed from: j */
    public void mo109508j(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109508j(imageRequest, str, th, z);
            } catch (Exception e) {
                m109510l("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // p149l.guc0
    /* JADX INFO: renamed from: k */
    public void mo109509k(String str) {
        int size = this.f83189a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f83189a.get(i).mo109509k(str);
            } catch (Exception e) {
                m109510l("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m109510l(String str, Throwable th) {
        tsf.m190543i("ForwardingRequestListener", str, th);
    }

    public d0j(guc0... guc0VarArr) {
        this.f83189a = new ArrayList(guc0VarArr.length);
        for (guc0 guc0Var : guc0VarArr) {
            if (guc0Var != null) {
                this.f83189a.add(guc0Var);
            }
        }
    }
}
