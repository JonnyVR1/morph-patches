package p001B;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p153l.jpg0;

/* JADX INFO: loaded from: classes.dex */
public final class Sudif extends BroadcastReceiver {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ jpg0 f211023Suddo;

    public Sudif(jpg0 jpg0Var) {
        this.f211023Suddo = jpg0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        jpg0 jpg0Var = this.f211023Suddo;
        jpg0.m146497a(context);
        if (jpg0Var.f122100a.size() <= 0) {
            return;
        }
        jpg0Var.f122100a.get(0).getClass();
        throw new ClassCastException();
    }
}
