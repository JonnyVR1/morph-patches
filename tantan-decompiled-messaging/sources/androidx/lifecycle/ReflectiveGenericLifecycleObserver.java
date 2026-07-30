package androidx.lifecycle;

import p149l.jcr;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    private final C0471a.a mInfo;
    private final Object mWrapped;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.mWrapped = obj;
        this.mInfo = C0471a.f2285c.m3013c(obj.getClass());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(jcr jcrVar, Lifecycle.Event event) {
        this.mInfo.m3017a(jcrVar, event, this.mWrapped);
    }
}
