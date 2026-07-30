package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;
import p149l.n16;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class Registrar$FIIDInternalAdapter$$Lambda$0 implements n16 {
    static final n16 $instance = new Registrar$FIIDInternalAdapter$$Lambda$0();

    private Registrar$FIIDInternalAdapter$$Lambda$0() {
    }

    @Override // p149l.n16
    public Object then(Task task) {
        return ((InstanceIdResult) task.mo15373l()).getToken();
    }
}
