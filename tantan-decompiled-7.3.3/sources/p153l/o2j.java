package p153l;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o2j<INFO> implements v36<INFO> {

    /* JADX INFO: renamed from: a */
    public final List<v36<? super INFO>> f144744a = new ArrayList(2);

    @Override // p153l.v36
    /* JADX INFO: renamed from: a */
    public synchronized void mo98800a(String str) {
        int size = this.f144744a.size();
        for (int i = 0; i < size; i++) {
            try {
                v36<? super INFO> v36Var = this.f144744a.get(i);
                if (v36Var != null) {
                    v36Var.mo98800a(str);
                }
            } catch (Exception e) {
                m165727i("InternalListener exception in onRelease", e);
            }
        }
    }

    @Override // p153l.v36
    /* JADX INFO: renamed from: b */
    public void mo49463b(String str, INFO info) {
        int size = this.f144744a.size();
        for (int i = 0; i < size; i++) {
            try {
                v36<? super INFO> v36Var = this.f144744a.get(i);
                if (v36Var != null) {
                    v36Var.mo49463b(str, info);
                }
            } catch (Exception e) {
                m165727i("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // p153l.v36
    /* JADX INFO: renamed from: c */
    public synchronized void mo98801c(String str, Object obj) {
        int size = this.f144744a.size();
        for (int i = 0; i < size; i++) {
            try {
                v36<? super INFO> v36Var = this.f144744a.get(i);
                if (v36Var != null) {
                    v36Var.mo98801c(str, obj);
                }
            } catch (Exception e) {
                m165727i("InternalListener exception in onSubmit", e);
            }
        }
    }

    @Override // p153l.v36
    /* JADX INFO: renamed from: d */
    public synchronized void mo49464d(String str, Throwable th) {
        int size = this.f144744a.size();
        for (int i = 0; i < size; i++) {
            try {
                v36<? super INFO> v36Var = this.f144744a.get(i);
                if (v36Var != null) {
                    v36Var.mo49464d(str, th);
                }
            } catch (Exception e) {
                m165727i("InternalListener exception in onFailure", e);
            }
        }
    }

    @Override // p153l.v36
    /* JADX INFO: renamed from: e */
    public synchronized void mo8288e(String str, INFO info, Animatable animatable) {
        int size = this.f144744a.size();
        for (int i = 0; i < size; i++) {
            try {
                v36<? super INFO> v36Var = this.f144744a.get(i);
                if (v36Var != null) {
                    v36Var.mo8288e(str, info, animatable);
                }
            } catch (Exception e) {
                m165727i("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    @Override // p153l.v36
    /* JADX INFO: renamed from: f */
    public void mo98802f(String str, Throwable th) {
        int size = this.f144744a.size();
        for (int i = 0; i < size; i++) {
            try {
                v36<? super INFO> v36Var = this.f144744a.get(i);
                if (v36Var != null) {
                    v36Var.mo98802f(str, th);
                }
            } catch (Exception e) {
                m165727i("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m165725g(v36<? super INFO> v36Var) {
        this.f144744a.add(v36Var);
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m165726h() {
        this.f144744a.clear();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m165727i(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }
}
