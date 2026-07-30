package Suddo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import p153l.jeg0;
import p153l.nvg0;
import p153l.yuq0;

/* JADX INFO: loaded from: classes.dex */
public final class Sudvoid extends BroadcastReceiver {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final jeg0 f211029Suddo;

    public Sudvoid(jeg0 jeg0Var) {
        this.f211029Suddo = jeg0Var;
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
                jeg0 jeg0Var = this.f211029Suddo;
                boolean booleanExtra = intent.getBooleanExtra("state", false);
                nvg0 nvg0Var = jeg0Var.f120493h;
                nvg0Var.sendMessage(nvg0Var.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                return;
            }
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            StringBuilder sb = yuq0.f201657a;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            jeg0 jeg0Var2 = this.f211029Suddo;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            nvg0 nvg0Var2 = jeg0Var2.f120493h;
            nvg0Var2.sendMessage(nvg0Var2.obtainMessage(9, activeNetworkInfo));
        }
    }
}
