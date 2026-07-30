package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;
import p153l.s26;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class Registrar$FIIDInternalAdapter$$Lambda$0 implements s26 {
    static final s26 $instance = new Registrar$FIIDInternalAdapter$$Lambda$0();

    private Registrar$FIIDInternalAdapter$$Lambda$0() {
    }

    @Override // p153l.s26
    public Object then(Task task) {
        return ((InstanceIdResult) task.mo15427l()).getToken();
    }
}
