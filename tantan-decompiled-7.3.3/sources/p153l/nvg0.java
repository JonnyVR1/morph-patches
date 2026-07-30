package p153l;

import Suddo.Sudwhile;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class nvg0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final jeg0 f143799a;

    public nvg0(Looper looper, jeg0 jeg0Var) {
        super(looper);
        this.f143799a = jeg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0201  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ArrayList arrayList;
        Future future;
        boolean zMo192804c;
        Object[] objArr;
        Object objM207517b;
        ArrayList arrayList2;
        NetworkInfo activeNetworkInfo = null;
        ArrayList arrayList3 = null;
        int i = 0;
        switch (message.what) {
            case 1:
                this.f143799a.m144564b((wqg0) message.obj, true);
                break;
            case 2:
                wqg0 wqg0Var = (wqg0) message.obj;
                jeg0 jeg0Var = this.f143799a;
                jeg0Var.getClass();
                String str = wqg0Var.f190404e;
                teg0 teg0Var = (teg0) jeg0Var.f120489d.get(str);
                if (teg0Var != null) {
                    teg0Var.m190703c(wqg0Var);
                    if (teg0Var.f173829k == null && (((arrayList = teg0Var.f173830l) == null || arrayList.isEmpty()) && (future = teg0Var.f173832n) != null && future.cancel(false))) {
                        i = 1;
                    }
                    if (i != 0) {
                        jeg0Var.f120489d.remove(str);
                    }
                }
                if (jeg0Var.f120492g.contains(wqg0Var.f190405f)) {
                    jeg0Var.f120491f.remove(wqg0Var.m207517b());
                }
                break;
            case 3:
            case 8:
            default:
                feg0.f98665i.post(new rpg0(message));
                break;
            case 4:
                teg0 teg0Var2 = (teg0) message.obj;
                jeg0 jeg0Var2 = this.f143799a;
                jeg0Var2.getClass();
                if ((teg0Var2.f173826h & 2) == 0) {
                    jeg0Var2.f120495j.m111517c(teg0Var2.f173824f, teg0Var2.f173831m);
                }
                jeg0Var2.f120489d.remove(teg0Var2.f173824f);
                jeg0Var2.m144563a(teg0Var2);
                teg0Var2.f173820b.getClass();
                break;
            case 5:
                teg0 teg0Var3 = (teg0) message.obj;
                jeg0 jeg0Var3 = this.f143799a;
                jeg0Var3.getClass();
                Future future2 = teg0Var3.f173832n;
                if (future2 == null || !future2.isCancelled()) {
                    if (jeg0Var3.f120487b.isShutdown()) {
                        teg0Var3.f173820b.getClass();
                        jeg0Var3.f120489d.remove(teg0Var3.f173824f);
                        jeg0Var3.m144563a(teg0Var3);
                    } else {
                        if (jeg0Var3.f120498m) {
                            Context context = jeg0Var3.f120486a;
                            StringBuilder sb = yuq0.f201657a;
                            activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                        }
                        int i2 = teg0Var3.f173836r;
                        if (i2 > 0) {
                            teg0Var3.f173836r = i2 - 1;
                            zMo192804c = teg0Var3.f173828j.mo192804c(activeNetworkInfo);
                        } else {
                            zMo192804c = false;
                        }
                        if (zMo192804c) {
                            teg0Var3.f173820b.getClass();
                            if (teg0Var3.f173834p instanceof Sudwhile) {
                                teg0Var3.f173827i |= 1;
                            }
                            ang0 ang0Var = jeg0Var3.f120487b;
                            ang0Var.getClass();
                            tmg0 tmg0Var = new tmg0(teg0Var3);
                            ang0Var.execute(tmg0Var);
                            teg0Var3.f173832n = tmg0Var;
                        } else {
                            if (jeg0Var3.f120498m) {
                                uxg0 uxg0Var = teg0Var3.f173828j;
                                uxg0Var.getClass();
                                if (uxg0Var instanceof tvg0) {
                                    objArr = true;
                                } else {
                                    objArr = false;
                                }
                            } else {
                                objArr = false;
                            }
                            teg0Var3.f173820b.getClass();
                            jeg0Var3.f120489d.remove(teg0Var3.f173824f);
                            jeg0Var3.m144563a(teg0Var3);
                            if (objArr != false) {
                                wqg0 wqg0Var2 = teg0Var3.f173829k;
                                if (wqg0Var2 != null && (objM207517b = wqg0Var2.m207517b()) != null) {
                                    wqg0Var2.f190406g = true;
                                    jeg0Var3.f120490e.put(objM207517b, wqg0Var2);
                                }
                                ArrayList arrayList4 = teg0Var3.f173830l;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    while (i < size) {
                                        wqg0 wqg0Var3 = (wqg0) arrayList4.get(i);
                                        Object objM207517b2 = wqg0Var3.m207517b();
                                        if (objM207517b2 != null) {
                                            wqg0Var3.f190406g = true;
                                            jeg0Var3.f120490e.put(objM207517b2, wqg0Var3);
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                teg0 teg0Var4 = (teg0) message.obj;
                jeg0 jeg0Var4 = this.f143799a;
                jeg0Var4.getClass();
                teg0Var4.f173820b.getClass();
                jeg0Var4.f120489d.remove(teg0Var4.f173824f);
                jeg0Var4.m144563a(teg0Var4);
                break;
            case 7:
                jeg0 jeg0Var5 = this.f143799a;
                jeg0Var5.getClass();
                ArrayList arrayList5 = new ArrayList(jeg0Var5.f120497l);
                jeg0Var5.f120497l.clear();
                Handler handler = jeg0Var5.f120494i;
                handler.sendMessage(handler.obtainMessage(8, arrayList5));
                if (!arrayList5.isEmpty()) {
                    ((teg0) arrayList5.get(0)).f173820b.getClass();
                    break;
                }
                break;
            case 9:
                NetworkInfo networkInfo = (NetworkInfo) message.obj;
                jeg0 jeg0Var6 = this.f143799a;
                ang0 ang0Var2 = jeg0Var6.f120487b;
                if (ang0Var2 != null) {
                    ang0Var2.m98963b(networkInfo);
                }
                if (networkInfo != null && networkInfo.isConnected() && !jeg0Var6.f120490e.isEmpty()) {
                    Iterator it = jeg0Var6.f120490e.values().iterator();
                    while (it.hasNext()) {
                        wqg0 wqg0Var4 = (wqg0) it.next();
                        it.remove();
                        feg0 feg0Var = wqg0Var4.f190400a;
                        jeg0Var6.m144564b(wqg0Var4, false);
                    }
                    break;
                }
                break;
            case 10:
                this.f143799a.getClass();
                break;
            case 11:
                Object obj = message.obj;
                jeg0 jeg0Var7 = this.f143799a;
                if (jeg0Var7.f120492g.add(obj)) {
                    Iterator it2 = jeg0Var7.f120489d.values().iterator();
                    while (it2.hasNext()) {
                        teg0 teg0Var5 = (teg0) it2.next();
                        teg0Var5.f173820b.getClass();
                        wqg0 wqg0Var5 = teg0Var5.f173829k;
                        ArrayList arrayList6 = teg0Var5.f173830l;
                        Object[] objArr2 = (arrayList6 == null || arrayList6.isEmpty()) ? false : true;
                        if (wqg0Var5 != null || objArr2 != false) {
                            if (wqg0Var5 != null && wqg0Var5.f190405f.equals(obj)) {
                                teg0Var5.m190703c(wqg0Var5);
                                jeg0Var7.f120491f.put(wqg0Var5.m207517b(), wqg0Var5);
                            }
                            if (objArr2 != false) {
                                for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                                    wqg0 wqg0Var6 = (wqg0) arrayList6.get(size2);
                                    if (wqg0Var6.f190405f.equals(obj)) {
                                        teg0Var5.m190703c(wqg0Var6);
                                        jeg0Var7.f120491f.put(wqg0Var6.m207517b(), wqg0Var6);
                                    }
                                }
                            }
                            if (teg0Var5.f173829k == null && ((arrayList2 = teg0Var5.f173830l) == null || arrayList2.isEmpty())) {
                                Future future3 = teg0Var5.f173832n;
                                if (future3 != null && future3.cancel(false)) {
                                    it2.remove();
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 12:
                Object obj2 = message.obj;
                jeg0 jeg0Var8 = this.f143799a;
                if (jeg0Var8.f120492g.remove(obj2)) {
                    Iterator it3 = jeg0Var8.f120491f.values().iterator();
                    while (it3.hasNext()) {
                        wqg0 wqg0Var7 = (wqg0) it3.next();
                        if (wqg0Var7.f190405f.equals(obj2)) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(wqg0Var7);
                            it3.remove();
                        }
                    }
                    if (arrayList3 != null) {
                        Handler handler2 = jeg0Var8.f120494i;
                        handler2.sendMessage(handler2.obtainMessage(13, arrayList3));
                    }
                    break;
                }
                break;
        }
    }
}
