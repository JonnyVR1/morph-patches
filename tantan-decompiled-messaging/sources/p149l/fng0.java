package p149l;

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
public final class fng0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final b6g0 f98417a;

    public fng0(Looper looper, b6g0 b6g0Var) {
        super(looper);
        this.f98417a = b6g0Var;
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
        boolean zMo150689c;
        Object[] objArr;
        Object objM164511b;
        ArrayList arrayList2;
        NetworkInfo activeNetworkInfo = null;
        ArrayList arrayList3 = null;
        int i = 0;
        switch (message.what) {
            case 1:
                this.f98417a.m100404b((oig0) message.obj, true);
                break;
            case 2:
                oig0 oig0Var = (oig0) message.obj;
                b6g0 b6g0Var = this.f98417a;
                b6g0Var.getClass();
                String str = oig0Var.f144118e;
                l6g0 l6g0Var = (l6g0) b6g0Var.f73809d.get(str);
                if (l6g0Var != null) {
                    l6g0Var.m148733c(oig0Var);
                    if (l6g0Var.f126631k == null && (((arrayList = l6g0Var.f126632l) == null || arrayList.isEmpty()) && (future = l6g0Var.f126634n) != null && future.cancel(false))) {
                        i = 1;
                    }
                    if (i != 0) {
                        b6g0Var.f73809d.remove(str);
                    }
                }
                if (b6g0Var.f73812g.contains(oig0Var.f144119f)) {
                    b6g0Var.f73811f.remove(oig0Var.m164511b());
                }
                break;
            case 3:
            case 8:
            default:
                x5g0.f191136i.post(new jhg0(message));
                break;
            case 4:
                l6g0 l6g0Var2 = (l6g0) message.obj;
                b6g0 b6g0Var2 = this.f98417a;
                b6g0Var2.getClass();
                if ((l6g0Var2.f126628h & 2) == 0) {
                    b6g0Var2.f73815j.m193254c(l6g0Var2.f126626f, l6g0Var2.f126633m);
                }
                b6g0Var2.f73809d.remove(l6g0Var2.f126626f);
                b6g0Var2.m100403a(l6g0Var2);
                l6g0Var2.f126622b.getClass();
                break;
            case 5:
                l6g0 l6g0Var3 = (l6g0) message.obj;
                b6g0 b6g0Var3 = this.f98417a;
                b6g0Var3.getClass();
                Future future2 = l6g0Var3.f126634n;
                if (future2 == null || !future2.isCancelled()) {
                    if (b6g0Var3.f73807b.isShutdown()) {
                        l6g0Var3.f126622b.getClass();
                        b6g0Var3.f73809d.remove(l6g0Var3.f126626f);
                        b6g0Var3.m100403a(l6g0Var3);
                    } else {
                        if (b6g0Var3.f73818m) {
                            Context context = b6g0Var3.f73806a;
                            StringBuilder sb = slq0.f165256a;
                            activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                        }
                        int i2 = l6g0Var3.f126638r;
                        if (i2 > 0) {
                            l6g0Var3.f126638r = i2 - 1;
                            zMo150689c = l6g0Var3.f126630j.mo150689c(activeNetworkInfo);
                        } else {
                            zMo150689c = false;
                        }
                        if (zMo150689c) {
                            l6g0Var3.f126622b.getClass();
                            if (l6g0Var3.f126636p instanceof Sudwhile) {
                                l6g0Var3.f126629i |= 1;
                            }
                            seg0 seg0Var = b6g0Var3.f73807b;
                            seg0Var.getClass();
                            leg0 leg0Var = new leg0(l6g0Var3);
                            seg0Var.execute(leg0Var);
                            l6g0Var3.f126634n = leg0Var;
                        } else {
                            if (b6g0Var3.f73818m) {
                                mpg0 mpg0Var = l6g0Var3.f126630j;
                                mpg0Var.getClass();
                                if (mpg0Var instanceof lng0) {
                                    objArr = true;
                                } else {
                                    objArr = false;
                                }
                            } else {
                                objArr = false;
                            }
                            l6g0Var3.f126622b.getClass();
                            b6g0Var3.f73809d.remove(l6g0Var3.f126626f);
                            b6g0Var3.m100403a(l6g0Var3);
                            if (objArr != false) {
                                oig0 oig0Var2 = l6g0Var3.f126631k;
                                if (oig0Var2 != null && (objM164511b = oig0Var2.m164511b()) != null) {
                                    oig0Var2.f144120g = true;
                                    b6g0Var3.f73810e.put(objM164511b, oig0Var2);
                                }
                                ArrayList arrayList4 = l6g0Var3.f126632l;
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    while (i < size) {
                                        oig0 oig0Var3 = (oig0) arrayList4.get(i);
                                        Object objM164511b2 = oig0Var3.m164511b();
                                        if (objM164511b2 != null) {
                                            oig0Var3.f144120g = true;
                                            b6g0Var3.f73810e.put(objM164511b2, oig0Var3);
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
                l6g0 l6g0Var4 = (l6g0) message.obj;
                b6g0 b6g0Var4 = this.f98417a;
                b6g0Var4.getClass();
                l6g0Var4.f126622b.getClass();
                b6g0Var4.f73809d.remove(l6g0Var4.f126626f);
                b6g0Var4.m100403a(l6g0Var4);
                break;
            case 7:
                b6g0 b6g0Var5 = this.f98417a;
                b6g0Var5.getClass();
                ArrayList arrayList5 = new ArrayList(b6g0Var5.f73817l);
                b6g0Var5.f73817l.clear();
                Handler handler = b6g0Var5.f73814i;
                handler.sendMessage(handler.obtainMessage(8, arrayList5));
                if (!arrayList5.isEmpty()) {
                    ((l6g0) arrayList5.get(0)).f126622b.getClass();
                    break;
                }
                break;
            case 9:
                NetworkInfo networkInfo = (NetworkInfo) message.obj;
                b6g0 b6g0Var6 = this.f98417a;
                seg0 seg0Var2 = b6g0Var6.f73807b;
                if (seg0Var2 != null) {
                    seg0Var2.m183633b(networkInfo);
                }
                if (networkInfo != null && networkInfo.isConnected() && !b6g0Var6.f73810e.isEmpty()) {
                    Iterator it = b6g0Var6.f73810e.values().iterator();
                    while (it.hasNext()) {
                        oig0 oig0Var4 = (oig0) it.next();
                        it.remove();
                        x5g0 x5g0Var = oig0Var4.f144114a;
                        b6g0Var6.m100404b(oig0Var4, false);
                    }
                    break;
                }
                break;
            case 10:
                this.f98417a.getClass();
                break;
            case 11:
                Object obj = message.obj;
                b6g0 b6g0Var7 = this.f98417a;
                if (b6g0Var7.f73812g.add(obj)) {
                    Iterator it2 = b6g0Var7.f73809d.values().iterator();
                    while (it2.hasNext()) {
                        l6g0 l6g0Var5 = (l6g0) it2.next();
                        l6g0Var5.f126622b.getClass();
                        oig0 oig0Var5 = l6g0Var5.f126631k;
                        ArrayList arrayList6 = l6g0Var5.f126632l;
                        Object[] objArr2 = (arrayList6 == null || arrayList6.isEmpty()) ? false : true;
                        if (oig0Var5 != null || objArr2 != false) {
                            if (oig0Var5 != null && oig0Var5.f144119f.equals(obj)) {
                                l6g0Var5.m148733c(oig0Var5);
                                b6g0Var7.f73811f.put(oig0Var5.m164511b(), oig0Var5);
                            }
                            if (objArr2 != false) {
                                for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                                    oig0 oig0Var6 = (oig0) arrayList6.get(size2);
                                    if (oig0Var6.f144119f.equals(obj)) {
                                        l6g0Var5.m148733c(oig0Var6);
                                        b6g0Var7.f73811f.put(oig0Var6.m164511b(), oig0Var6);
                                    }
                                }
                            }
                            if (l6g0Var5.f126631k == null && ((arrayList2 = l6g0Var5.f126632l) == null || arrayList2.isEmpty())) {
                                Future future3 = l6g0Var5.f126634n;
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
                b6g0 b6g0Var8 = this.f98417a;
                if (b6g0Var8.f73812g.remove(obj2)) {
                    Iterator it3 = b6g0Var8.f73811f.values().iterator();
                    while (it3.hasNext()) {
                        oig0 oig0Var7 = (oig0) it3.next();
                        if (oig0Var7.f144119f.equals(obj2)) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(oig0Var7);
                            it3.remove();
                        }
                    }
                    if (arrayList3 != null) {
                        Handler handler2 = b6g0Var8.f73814i;
                        handler2.sendMessage(handler2.obtainMessage(13, arrayList3));
                    }
                    break;
                }
                break;
        }
    }
}
