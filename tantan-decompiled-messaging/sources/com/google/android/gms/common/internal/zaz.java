package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;
import p149l.s050;

/* JADX INFO: loaded from: classes6.dex */
public final class zaz extends RemoteCreator {
    private static final zaz zaa = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        zaz zazVar = zaa;
        try {
            return (View) s050.m181847P2(((zam) zazVar.getRemoteCreatorInstance(context)).zae(s050.m181848Y2(context), new zax(1, i, i2, null)));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof zam ? (zam) iInterfaceQueryLocalInterface : new zam(iBinder);
    }
}
