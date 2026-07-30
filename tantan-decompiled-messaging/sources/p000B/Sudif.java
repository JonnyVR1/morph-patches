package p000B;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p149l.bhg0;

/* JADX INFO: loaded from: classes.dex */
public final class Sudif extends BroadcastReceiver {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ bhg0 f210101Suddo;

    public Sudif(bhg0 bhg0Var) {
        this.f210101Suddo = bhg0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        bhg0 bhg0Var = this.f210101Suddo;
        bhg0.m101834a(context);
        if (bhg0Var.f75611a.size() <= 0) {
            return;
        }
        bhg0Var.f75611a.get(0).getClass();
        throw new ClassCastException();
    }
}
