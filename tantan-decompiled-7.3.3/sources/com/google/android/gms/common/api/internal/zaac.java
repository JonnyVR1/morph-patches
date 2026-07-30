package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
final class zaac implements OnCompleteListener {
    final /* synthetic */ sni0 zaa;
    final /* synthetic */ zaad zab;

    public zaac(zaad zaadVar, sni0 sni0Var) {
        this.zab = zaadVar;
        this.zaa = sni0Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        this.zab.zab.remove(this.zaa);
    }
}
