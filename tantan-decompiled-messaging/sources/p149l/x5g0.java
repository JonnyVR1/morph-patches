package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x5g0 {

    /* JADX INFO: renamed from: i */
    public static final lpg0 f191136i = new lpg0(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    public static volatile x5g0 f191137j = null;

    /* JADX INFO: renamed from: a */
    public final List f191138a;

    /* JADX INFO: renamed from: b */
    public final Context f191139b;

    /* JADX INFO: renamed from: c */
    public final b6g0 f191140c;

    /* JADX INFO: renamed from: d */
    public final ueg0 f191141d;

    /* JADX INFO: renamed from: e */
    public final rqg0 f191142e;

    /* JADX INFO: renamed from: f */
    public final WeakHashMap f191143f;

    /* JADX INFO: renamed from: g */
    public final WeakHashMap f191144g;

    /* JADX INFO: renamed from: h */
    public final ReferenceQueue f191145h;

    public x5g0(Context context, b6g0 b6g0Var, ueg0 ueg0Var, rqg0 rqg0Var) {
        this.f191139b = context;
        this.f191140c = b6g0Var;
        this.f191141d = ueg0Var;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new dsg0(context));
        arrayList.add(new g9g0(context));
        arrayList.add(new npg0(context));
        arrayList.add(new heg0(context));
        arrayList.add(new gfg0(context));
        arrayList.add(new j8g0(context));
        arrayList.add(new lng0(b6g0Var.f73808c, rqg0Var));
        this.f191138a = Collections.unmodifiableList(arrayList);
        this.f191142e = rqg0Var;
        this.f191143f = new WeakHashMap();
        this.f191144g = new WeakHashMap();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f191145h = referenceQueue;
        new qqg0(referenceQueue, f191136i).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m207084a(Bitmap bitmap, int i, oig0 oig0Var, Exception exc) {
        if (oig0Var.f144121h) {
            return;
        }
        if (!oig0Var.f144120g) {
            this.f191143f.remove(oig0Var.m164511b());
        }
        if (bitmap == null) {
            oig0Var.mo158558a();
            return;
        }
        if (i == 0) {
            y9g0.m213537a("LoadedFrom cannot be null.");
            return;
        }
        n9g0 n9g0Var = (n9g0) oig0Var;
        ImageView imageView = (ImageView) n9g0Var.f144116c.get();
        if (imageView == null) {
            return;
        }
        t9g0.m187632b(imageView, n9g0Var.f144114a.f191139b, bitmap, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m207085b(Object obj) {
        slq0.m184847d();
        oig0 oig0Var = (oig0) this.f191143f.remove(obj);
        if (oig0Var != null) {
            ((n9g0) oig0Var).f144121h = true;
            fng0 fng0Var = this.f191140c.f73813h;
            fng0Var.sendMessage(fng0Var.obtainMessage(2, oig0Var));
        }
        if (obj instanceof ImageView) {
            if (this.f191144g.remove((ImageView) obj) != null) {
                throw new ClassCastException();
            }
        }
    }
}
