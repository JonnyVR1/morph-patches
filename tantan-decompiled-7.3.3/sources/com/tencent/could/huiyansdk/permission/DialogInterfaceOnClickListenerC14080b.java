package com.tencent.could.huiyansdk.permission;

import android.content.DialogInterface;
import com.tencent.could.huiyansdk.fragments.C14054a;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.permission.b */
/* JADX INFO: loaded from: classes12.dex */
public class DialogInterfaceOnClickListenerC14080b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14081c f58322a;

    public DialogInterfaceOnClickListenerC14080b(C14081c c14081c) {
        this.f58322a = c14081c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f58322a.m83558a();
        ((C14054a) this.f58322a.f58324b).m83471a();
        this.f58322a.m83559b();
    }
}
