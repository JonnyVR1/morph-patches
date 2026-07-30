package p149l;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class tzi<INFO> implements q26<INFO> {

    /* JADX INFO: renamed from: a */
    public final List<q26<? super INFO>> f172736a = new ArrayList(2);

    @Override // p149l.q26
    /* JADX INFO: renamed from: a */
    public synchronized void mo102385a(String str) {
        int size = this.f172736a.size();
        for (int i = 0; i < size; i++) {
            try {
                q26<? super INFO> q26Var = this.f172736a.get(i);
                if (q26Var != null) {
                    q26Var.mo102385a(str);
                }
            } catch (Exception e) {
                m191194i("InternalListener exception in onRelease", e);
            }
        }
    }

    @Override // p149l.q26
    /* JADX INFO: renamed from: b */
    public void mo48280b(String str, INFO info) {
        int size = this.f172736a.size();
        for (int i = 0; i < size; i++) {
            try {
                q26<? super INFO> q26Var = this.f172736a.get(i);
                if (q26Var != null) {
                    q26Var.mo48280b(str, info);
                }
            } catch (Exception e) {
                m191194i("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // p149l.q26
    /* JADX INFO: renamed from: c */
    public synchronized void mo116619c(String str, Object obj) {
        int size = this.f172736a.size();
        for (int i = 0; i < size; i++) {
            try {
                q26<? super INFO> q26Var = this.f172736a.get(i);
                if (q26Var != null) {
                    q26Var.mo116619c(str, obj);
                }
            } catch (Exception e) {
                m191194i("InternalListener exception in onSubmit", e);
            }
        }
    }

    @Override // p149l.q26
    /* JADX INFO: renamed from: d */
    public synchronized void mo48281d(String str, Throwable th) {
        int size = this.f172736a.size();
        for (int i = 0; i < size; i++) {
            try {
                q26<? super INFO> q26Var = this.f172736a.get(i);
                if (q26Var != null) {
                    q26Var.mo48281d(str, th);
                }
            } catch (Exception e) {
                m191194i("InternalListener exception in onFailure", e);
            }
        }
    }

    @Override // p149l.q26
    /* JADX INFO: renamed from: e */
    public synchronized void mo8234e(String str, INFO info, Animatable animatable) {
        int size = this.f172736a.size();
        for (int i = 0; i < size; i++) {
            try {
                q26<? super INFO> q26Var = this.f172736a.get(i);
                if (q26Var != null) {
                    q26Var.mo8234e(str, info, animatable);
                }
            } catch (Exception e) {
                m191194i("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    @Override // p149l.q26
    /* JADX INFO: renamed from: f */
    public void mo116620f(String str, Throwable th) {
        int size = this.f172736a.size();
        for (int i = 0; i < size; i++) {
            try {
                q26<? super INFO> q26Var = this.f172736a.get(i);
                if (q26Var != null) {
                    q26Var.mo116620f(str, th);
                }
            } catch (Exception e) {
                m191194i("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m191192g(q26<? super INFO> q26Var) {
        this.f172736a.add(q26Var);
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m191193h() {
        this.f172736a.clear();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m191194i(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }
}
