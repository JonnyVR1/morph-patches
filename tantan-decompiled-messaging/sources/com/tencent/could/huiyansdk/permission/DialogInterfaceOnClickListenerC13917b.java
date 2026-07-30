package com.tencent.could.huiyansdk.permission;

import android.content.DialogInterface;
import com.tencent.could.huiyansdk.fragments.C13891a;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.permission.b */
/* JADX INFO: loaded from: classes2.dex */
public class DialogInterfaceOnClickListenerC13917b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13918c f57474a;

    public DialogInterfaceOnClickListenerC13917b(C13918c c13918c) {
        this.f57474a = c13918c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f57474a.m82375a();
        ((C13891a) this.f57474a.f57476b).m82288a();
        this.f57474a.m82376b();
    }
}
