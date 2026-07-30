package Suddo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p149l.b6g0;
import p149l.fng0;
import p149l.slq0;

/* JADX INFO: loaded from: classes.dex */
public final class Sudvoid extends BroadcastReceiver {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final b6g0 f210107Suddo;

    public Sudvoid(b6g0 b6g0Var) {
        this.f210107Suddo = b6g0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
            if (intent.hasExtra("state")) {
                b6g0 b6g0Var = this.f210107Suddo;
                boolean booleanExtra = intent.getBooleanExtra("state", false);
                fng0 fng0Var = b6g0Var.f73813h;
                fng0Var.sendMessage(fng0Var.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                return;
            }
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            StringBuilder sb = slq0.f165256a;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            b6g0 b6g0Var2 = this.f210107Suddo;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            fng0 fng0Var2 = b6g0Var2.f73813h;
            fng0Var2.sendMessage(fng0Var2.obtainMessage(9, activeNetworkInfo));
        }
    }
}
