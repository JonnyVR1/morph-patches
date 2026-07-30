package p149l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import java.util.ArrayList;
import p149l.xee;

/* JADX INFO: loaded from: classes.dex */
public abstract class xee<T extends xee<T>> implements dr0.InterfaceC16448b {

    /* JADX INFO: renamed from: m */
    public static final AbstractC21140s f192565m = new C21128g("translationX");

    /* JADX INFO: renamed from: n */
    public static final AbstractC21140s f192566n = new C21129h("translationY");

    /* JADX INFO: renamed from: o */
    public static final AbstractC21140s f192567o = new C21130i("translationZ");

    /* JADX INFO: renamed from: p */
    public static final AbstractC21140s f192568p = new C21131j("scaleX");

    /* JADX INFO: renamed from: q */
    public static final AbstractC21140s f192569q = new C21132k("scaleY");

    /* JADX INFO: renamed from: r */
    public static final AbstractC21140s f192570r = new C21133l(BLiveGiftItem.TYPE_ROTATION);

    /* JADX INFO: renamed from: s */
    public static final AbstractC21140s f192571s = new C21134m("rotationX");

    /* JADX INFO: renamed from: t */
    public static final AbstractC21140s f192572t = new C21135n("rotationY");

    /* JADX INFO: renamed from: u */
    public static final AbstractC21140s f192573u = new C21136o(BaseSei.f13930X);

    /* JADX INFO: renamed from: v */
    public static final AbstractC21140s f192574v = new C21122a(BaseSei.f13931Y);

    /* JADX INFO: renamed from: w */
    public static final AbstractC21140s f192575w = new C21123b(BaseSei.f13932Z);

    /* JADX INFO: renamed from: x */
    public static final AbstractC21140s f192576x = new C21124c("alpha");

    /* JADX INFO: renamed from: y */
    public static final AbstractC21140s f192577y = new C21125d("scrollX");

    /* JADX INFO: renamed from: z */
    public static final AbstractC21140s f192578z = new C21126e("scrollY");

    /* JADX INFO: renamed from: a */
    public float f192579a;

    /* JADX INFO: renamed from: b */
    public float f192580b;

    /* JADX INFO: renamed from: c */
    public boolean f192581c;

    /* JADX INFO: renamed from: d */
    public final Object f192582d;

    /* JADX INFO: renamed from: e */
    public final cqi f192583e;

    /* JADX INFO: renamed from: f */
    public boolean f192584f;

    /* JADX INFO: renamed from: g */
    public float f192585g;

    /* JADX INFO: renamed from: h */
    public float f192586h;

    /* JADX INFO: renamed from: i */
    public long f192587i;

    /* JADX INFO: renamed from: j */
    public float f192588j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<InterfaceC21138q> f192589k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<InterfaceC21139r> f192590l;

    /* JADX INFO: renamed from: l.xee$a */
    public static class C21122a extends AbstractC21140s {
        public C21122a(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getY();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setY(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$b */
    public static class C21123b extends AbstractC21140s {
        public C21123b(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return gbl0.m125165J(view);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            gbl0.m125158F0(view, f);
        }
    }

    /* JADX INFO: renamed from: l.xee$c */
    public static class C21124c extends AbstractC21140s {
        public C21124c(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getAlpha();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$d */
    public static class C21125d extends AbstractC21140s {
        public C21125d(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getScrollX();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* JADX INFO: renamed from: l.xee$e */
    public static class C21126e extends AbstractC21140s {
        public C21126e(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getScrollY();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* JADX INFO: renamed from: l.xee$f */
    public class C21127f extends cqi {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dqi f192591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21127f(String str, dqi dqiVar) {
            super(str);
            this.f192591b = dqiVar;
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: a */
        public float mo108274a(Object obj) {
            return this.f192591b.m113071a();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: b */
        public void mo108275b(Object obj, float f) {
            this.f192591b.m113072b(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$g */
    public static class C21128g extends AbstractC21140s {
        public C21128g(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getTranslationX();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$h */
    public static class C21129h extends AbstractC21140s {
        public C21129h(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getTranslationY();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$i */
    public static class C21130i extends AbstractC21140s {
        public C21130i(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return gbl0.m125159G(view);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            gbl0.m125154D0(view, f);
        }
    }

    /* JADX INFO: renamed from: l.xee$j */
    public static class C21131j extends AbstractC21140s {
        public C21131j(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getScaleX();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$k */
    public static class C21132k extends AbstractC21140s {
        public C21132k(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getScaleY();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$l */
    public static class C21133l extends AbstractC21140s {
        public C21133l(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getRotation();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$m */
    public static class C21134m extends AbstractC21140s {
        public C21134m(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getRotationX();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$n */
    public static class C21135n extends AbstractC21140s {
        public C21135n(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getRotationY();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$o */
    public static class C21136o extends AbstractC21140s {
        public C21136o(String str) {
            super(str, null);
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo108274a(View view) {
            return view.getX();
        }

        @Override // p149l.cqi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo108275b(View view, float f) {
            view.setX(f);
        }
    }

    /* JADX INFO: renamed from: l.xee$p */
    public static class C21137p {

        /* JADX INFO: renamed from: a */
        public float f192593a;

        /* JADX INFO: renamed from: b */
        public float f192594b;
    }

    /* JADX INFO: renamed from: l.xee$q */
    public interface InterfaceC21138q {
        void onAnimationEnd(xee xeeVar, boolean z, float f, float f2);
    }

    /* JADX INFO: renamed from: l.xee$r */
    public interface InterfaceC21139r {
        /* JADX INFO: renamed from: a */
        void mo20888a(xee xeeVar, float f, float f2);
    }

    public <K> xee(K k, cqi<K> cqiVar) {
        this.f192579a = 0.0f;
        this.f192580b = Float.MAX_VALUE;
        this.f192581c = false;
        this.f192584f = false;
        this.f192585g = Float.MAX_VALUE;
        this.f192586h = -Float.MAX_VALUE;
        this.f192587i = 0L;
        this.f192589k = new ArrayList<>();
        this.f192590l = new ArrayList<>();
        this.f192582d = k;
        this.f192583e = cqiVar;
        if (cqiVar == f192570r || cqiVar == f192571s || cqiVar == f192572t) {
            this.f192588j = 0.1f;
            return;
        }
        if (cqiVar == f192576x) {
            this.f192588j = 0.00390625f;
        } else if (cqiVar == f192568p || cqiVar == f192569q) {
            this.f192588j = 0.00390625f;
        } else {
            this.f192588j = 1.0f;
        }
    }

    /* JADX INFO: renamed from: h */
    public static <T> void m208539h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // p149l.dr0.InterfaceC16448b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: a */
    public boolean mo113262a(long j) {
        long j2 = this.f192587i;
        if (j2 == 0) {
            this.f192587i = j;
            m208546i(this.f192580b);
            return false;
        }
        this.f192587i = j;
        boolean zMo146939n = mo146939n(j - j2);
        float fMin = Math.min(this.f192580b, this.f192585g);
        this.f192580b = fMin;
        float fMax = Math.max(fMin, this.f192586h);
        this.f192580b = fMax;
        m208546i(fMax);
        if (zMo146939n) {
            m208542d(false);
        }
        return zMo146939n;
    }

    /* JADX INFO: renamed from: b */
    public T m208540b(InterfaceC21139r interfaceC21139r) {
        if (m208545g()) {
            qq3.m175877a("Error: Update listeners must be added beforethe animation.");
            return null;
        }
        if (!this.f192590l.contains(interfaceC21139r)) {
            this.f192590l.add(interfaceC21139r);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m208541c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f192584f) {
            m208542d(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m208542d(boolean z) {
        int i = 0;
        this.f192584f = false;
        dr0.m113254d().m113260g(this);
        this.f192587i = 0L;
        this.f192581c = false;
        while (true) {
            int size = this.f192589k.size();
            ArrayList<InterfaceC21138q> arrayList = this.f192589k;
            if (i >= size) {
                m208539h(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    this.f192589k.get(i).onAnimationEnd(this, z, this.f192580b, this.f192579a);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m208543e() {
        return this.f192583e.mo108274a(this.f192582d);
    }

    /* JADX INFO: renamed from: f */
    public float m208544f() {
        return this.f192588j * 0.75f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m208545g() {
        return this.f192584f;
    }

    /* JADX INFO: renamed from: i */
    public void m208546i(float f) {
        this.f192583e.mo108275b(this.f192582d, f);
        int i = 0;
        while (true) {
            int size = this.f192590l.size();
            ArrayList<InterfaceC21139r> arrayList = this.f192590l;
            if (i >= size) {
                m208539h(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    this.f192590l.get(i).mo20888a(this, this.f192580b, this.f192579a);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public T m208547j(float f) {
        this.f192580b = f;
        this.f192581c = true;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public T m208548k(float f) {
        this.f192579a = f;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void mo146938l() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f192584f) {
            return;
        }
        m208549m();
    }

    /* JADX INFO: renamed from: m */
    public final void m208549m() {
        if (this.f192584f) {
            return;
        }
        this.f192584f = true;
        if (!this.f192581c) {
            this.f192580b = m208543e();
        }
        float f = this.f192580b;
        if (f > this.f192585g || f < this.f192586h) {
            ig3.m135964a("Starting value need to be in between min value and max value");
        } else {
            dr0.m113254d().m113255a(this, 0L);
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo146939n(long j);

    /* JADX INFO: renamed from: l.xee$s */
    public static abstract class AbstractC21140s extends cqi<View> {
        public /* synthetic */ AbstractC21140s(String str, C21128g c21128g) {
            this(str);
        }

        public AbstractC21140s(String str) {
            super(str);
        }
    }

    public xee(dqi dqiVar) {
        this.f192579a = 0.0f;
        this.f192580b = Float.MAX_VALUE;
        this.f192581c = false;
        this.f192584f = false;
        this.f192585g = Float.MAX_VALUE;
        this.f192586h = -Float.MAX_VALUE;
        this.f192587i = 0L;
        this.f192589k = new ArrayList<>();
        this.f192590l = new ArrayList<>();
        this.f192582d = null;
        this.f192583e = new C21127f("FloatValueHolder", dqiVar);
        this.f192588j = 1.0f;
    }
}
