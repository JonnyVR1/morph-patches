package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
final class zaac implements OnCompleteListener {
    final /* synthetic */ sei0 zaa;
    final /* synthetic */ zaad zab;

    public zaac(zaad zaadVar, sei0 sei0Var) {
        this.zab = zaadVar;
        this.zaa = sei0Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.zab.zab.remove(this.zaa);
    }
}
