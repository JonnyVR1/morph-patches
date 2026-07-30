package p153l;

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
public final class feg0 {

    /* JADX INFO: renamed from: i */
    public static final txg0 f98665i = new txg0(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    public static volatile feg0 f98666j = null;

    /* JADX INFO: renamed from: a */
    public final List f98667a;

    /* JADX INFO: renamed from: b */
    public final Context f98668b;

    /* JADX INFO: renamed from: c */
    public final jeg0 f98669c;

    /* JADX INFO: renamed from: d */
    public final cng0 f98670d;

    /* JADX INFO: renamed from: e */
    public final zyg0 f98671e;

    /* JADX INFO: renamed from: f */
    public final WeakHashMap f98672f;

    /* JADX INFO: renamed from: g */
    public final WeakHashMap f98673g;

    /* JADX INFO: renamed from: h */
    public final ReferenceQueue f98674h;

    public feg0(Context context, jeg0 jeg0Var, cng0 cng0Var, zyg0 zyg0Var) {
        this.f98668b = context;
        this.f98669c = jeg0Var;
        this.f98670d = cng0Var;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new l0h0(context));
        arrayList.add(new ohg0(context));
        arrayList.add(new vxg0(context));
        arrayList.add(new pmg0(context));
        arrayList.add(new ong0(context));
        arrayList.add(new rgg0(context));
        arrayList.add(new tvg0(jeg0Var.f120488c, zyg0Var));
        this.f98667a = Collections.unmodifiableList(arrayList);
        this.f98671e = zyg0Var;
        this.f98672f = new WeakHashMap();
        this.f98673g = new WeakHashMap();
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f98674h = referenceQueue;
        new yyg0(referenceQueue, f98665i).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m125308a(Bitmap bitmap, int i, wqg0 wqg0Var, Exception exc) {
        if (wqg0Var.f190407h) {
            return;
        }
        if (!wqg0Var.f190406g) {
            this.f98672f.remove(wqg0Var.m207517b());
        }
        if (bitmap == null) {
            wqg0Var.mo201288a();
            return;
        }
        if (i == 0) {
            gig0.m130323a("LoadedFrom cannot be null.");
            return;
        }
        vhg0 vhg0Var = (vhg0) wqg0Var;
        ImageView imageView = (ImageView) vhg0Var.f190402c.get();
        if (imageView == null) {
            return;
        }
        big0.m104463b(imageView, vhg0Var.f190400a.f98668b, bitmap, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m125309b(Object obj) {
        yuq0.m217468d();
        wqg0 wqg0Var = (wqg0) this.f98672f.remove(obj);
        if (wqg0Var != null) {
            ((vhg0) wqg0Var).f190407h = true;
            nvg0 nvg0Var = this.f98669c.f120493h;
            nvg0Var.sendMessage(nvg0Var.obtainMessage(2, wqg0Var));
        }
        if (obj instanceof ImageView) {
            if (this.f98673g.remove((ImageView) obj) != null) {
                throw new ClassCastException();
            }
        }
    }
}
