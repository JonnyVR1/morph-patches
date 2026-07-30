package androidx.lifecycle;

import p153l.ker;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    private final C0472a.a mInfo;
    private final Object mWrapped;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.mWrapped = obj;
        this.mInfo = C0472a.f2285c.m3014c(obj.getClass());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(ker kerVar, Lifecycle.Event event) {
        this.mInfo.m3018a(kerVar, event, this.mWrapped);
    }
}
