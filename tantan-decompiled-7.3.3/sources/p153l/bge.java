package p153l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import java.util.ArrayList;
import p153l.bge;

/* JADX INFO: loaded from: classes.dex */
public abstract class bge<T extends bge<T>> implements hr0.InterfaceC17544b {

    /* JADX INFO: renamed from: m */
    public static final AbstractC16002s f76586m = new C15990g("translationX");

    /* JADX INFO: renamed from: n */
    public static final AbstractC16002s f76587n = new C15991h("translationY");

    /* JADX INFO: renamed from: o */
    public static final AbstractC16002s f76588o = new C15992i("translationZ");

    /* JADX INFO: renamed from: p */
    public static final AbstractC16002s f76589p = new C15993j("scaleX");

    /* JADX INFO: renamed from: q */
    public static final AbstractC16002s f76590q = new C15994k("scaleY");

    /* JADX INFO: renamed from: r */
    public static final AbstractC16002s f76591r = new C15995l(BLiveGiftItem.TYPE_ROTATION);

    /* JADX INFO: renamed from: s */
    public static final AbstractC16002s f76592s = new C15996m("rotationX");

    /* JADX INFO: renamed from: t */
    public static final AbstractC16002s f76593t = new C15997n("rotationY");

    /* JADX INFO: renamed from: u */
    public static final AbstractC16002s f76594u = new C15998o(BaseSei.f14624X);

    /* JADX INFO: renamed from: v */
    public static final AbstractC16002s f76595v = new C15984a(BaseSei.f14625Y);

    /* JADX INFO: renamed from: w */
    public static final AbstractC16002s f76596w = new C15985b(BaseSei.f14626Z);

    /* JADX INFO: renamed from: x */
    public static final AbstractC16002s f76597x = new C15986c("alpha");

    /* JADX INFO: renamed from: y */
    public static final AbstractC16002s f76598y = new C15987d("scrollX");

    /* JADX INFO: renamed from: z */
    public static final AbstractC16002s f76599z = new C15988e("scrollY");

    /* JADX INFO: renamed from: a */
    public float f76600a;

    /* JADX INFO: renamed from: b */
    public float f76601b;

    /* JADX INFO: renamed from: c */
    public boolean f76602c;

    /* JADX INFO: renamed from: d */
    public final Object f76603d;

    /* JADX INFO: renamed from: e */
    public final ysi f76604e;

    /* JADX INFO: renamed from: f */
    public boolean f76605f;

    /* JADX INFO: renamed from: g */
    public float f76606g;

    /* JADX INFO: renamed from: h */
    public float f76607h;

    /* JADX INFO: renamed from: i */
    public long f76608i;

    /* JADX INFO: renamed from: j */
    public float f76609j;

    /* JADX INFO: renamed from: k */
    public final ArrayList<InterfaceC16000q> f76610k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<InterfaceC16001r> f76611l;

    /* JADX INFO: renamed from: l.bge$a */
    public static class C15984a extends AbstractC16002s {
        public C15984a(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getY();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setY(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$b */
    public static class C15985b extends AbstractC16002s {
        public C15985b(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return kkl0.m150128J(view);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            kkl0.m150121F0(view, f);
        }
    }

    /* JADX INFO: renamed from: l.bge$c */
    public static class C15986c extends AbstractC16002s {
        public C15986c(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getAlpha();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$d */
    public static class C15987d extends AbstractC16002s {
        public C15987d(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getScrollX();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* JADX INFO: renamed from: l.bge$e */
    public static class C15988e extends AbstractC16002s {
        public C15988e(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getScrollY();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* JADX INFO: renamed from: l.bge$f */
    public class C15989f extends ysi {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zsi f76612b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15989f(String str, zsi zsiVar) {
            super(str);
            this.f76612b = zsiVar;
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: a */
        public float mo104132a(Object obj) {
            return this.f76612b.m221344a();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: b */
        public void mo104133b(Object obj, float f) {
            this.f76612b.m221345b(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$g */
    public static class C15990g extends AbstractC16002s {
        public C15990g(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getTranslationX();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$h */
    public static class C15991h extends AbstractC16002s {
        public C15991h(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getTranslationY();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$i */
    public static class C15992i extends AbstractC16002s {
        public C15992i(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return kkl0.m150122G(view);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            kkl0.m150117D0(view, f);
        }
    }

    /* JADX INFO: renamed from: l.bge$j */
    public static class C15993j extends AbstractC16002s {
        public C15993j(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getScaleX();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$k */
    public static class C15994k extends AbstractC16002s {
        public C15994k(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getScaleY();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$l */
    public static class C15995l extends AbstractC16002s {
        public C15995l(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getRotation();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$m */
    public static class C15996m extends AbstractC16002s {
        public C15996m(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getRotationX();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$n */
    public static class C15997n extends AbstractC16002s {
        public C15997n(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getRotationY();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$o */
    public static class C15998o extends AbstractC16002s {
        public C15998o(String str) {
            super(str, null);
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo104132a(View view) {
            return view.getX();
        }

        @Override // p153l.ysi
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo104133b(View view, float f) {
            view.setX(f);
        }
    }

    /* JADX INFO: renamed from: l.bge$p */
    public static class C15999p {

        /* JADX INFO: renamed from: a */
        public float f76614a;

        /* JADX INFO: renamed from: b */
        public float f76615b;
    }

    /* JADX INFO: renamed from: l.bge$q */
    public interface InterfaceC16000q {
        void onAnimationEnd(bge bgeVar, boolean z, float f, float f2);
    }

    /* JADX INFO: renamed from: l.bge$r */
    public interface InterfaceC16001r {
        /* JADX INFO: renamed from: a */
        void mo21887a(bge bgeVar, float f, float f2);
    }

    public <K> bge(K k, ysi<K> ysiVar) {
        this.f76600a = 0.0f;
        this.f76601b = Float.MAX_VALUE;
        this.f76602c = false;
        this.f76605f = false;
        this.f76606g = Float.MAX_VALUE;
        this.f76607h = -Float.MAX_VALUE;
        this.f76608i = 0L;
        this.f76610k = new ArrayList<>();
        this.f76611l = new ArrayList<>();
        this.f76603d = k;
        this.f76604e = ysiVar;
        if (ysiVar == f76591r || ysiVar == f76592s || ysiVar == f76593t) {
            this.f76609j = 0.1f;
            return;
        }
        if (ysiVar == f76597x) {
            this.f76609j = 0.00390625f;
        } else if (ysiVar == f76589p || ysiVar == f76590q) {
            this.f76609j = 0.00390625f;
        } else {
            this.f76609j = 1.0f;
        }
    }

    /* JADX INFO: renamed from: h */
    public static <T> void m104118h(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // p153l.hr0.InterfaceC17544b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: a */
    public boolean mo104119a(long j) {
        long j2 = this.f76608i;
        if (j2 == 0) {
            this.f76608i = j;
            m104126i(this.f76601b);
            return false;
        }
        this.f76608i = j;
        boolean zMo104131n = mo104131n(j - j2);
        float fMin = Math.min(this.f76601b, this.f76606g);
        this.f76601b = fMin;
        float fMax = Math.max(fMin, this.f76607h);
        this.f76601b = fMax;
        m104126i(fMax);
        if (zMo104131n) {
            m104122d(false);
        }
        return zMo104131n;
    }

    /* JADX INFO: renamed from: b */
    public T m104120b(InterfaceC16001r interfaceC16001r) {
        if (m104125g()) {
            pr3.m173429a("Error: Update listeners must be added beforethe animation.");
            return null;
        }
        if (!this.f76611l.contains(interfaceC16001r)) {
            this.f76611l.add(interfaceC16001r);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m104121c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f76605f) {
            m104122d(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m104122d(boolean z) {
        int i = 0;
        this.f76605f = false;
        hr0.m136726d().m136732g(this);
        this.f76608i = 0L;
        this.f76602c = false;
        while (true) {
            int size = this.f76610k.size();
            ArrayList<InterfaceC16000q> arrayList = this.f76610k;
            if (i >= size) {
                m104118h(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    this.f76610k.get(i).onAnimationEnd(this, z, this.f76601b, this.f76600a);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m104123e() {
        return this.f76604e.mo104132a(this.f76603d);
    }

    /* JADX INFO: renamed from: f */
    public float m104124f() {
        return this.f76609j * 0.75f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m104125g() {
        return this.f76605f;
    }

    /* JADX INFO: renamed from: i */
    public void m104126i(float f) {
        this.f76604e.mo104133b(this.f76603d, f);
        int i = 0;
        while (true) {
            int size = this.f76611l.size();
            ArrayList<InterfaceC16001r> arrayList = this.f76611l;
            if (i >= size) {
                m104118h(arrayList);
                return;
            } else {
                if (arrayList.get(i) != null) {
                    this.f76611l.get(i).mo21887a(this, this.f76601b, this.f76600a);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public T m104127j(float f) {
        this.f76601b = f;
        this.f76602c = true;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public T m104128k(float f) {
        this.f76600a = f;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public void mo104129l() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f76605f) {
            return;
        }
        m104130m();
    }

    /* JADX INFO: renamed from: m */
    public final void m104130m() {
        if (this.f76605f) {
            return;
        }
        this.f76605f = true;
        if (!this.f76602c) {
            this.f76601b = m104123e();
        }
        float f = this.f76601b;
        if (f > this.f76606g || f < this.f76607h) {
            wg3.m206174a("Starting value need to be in between min value and max value");
        } else {
            hr0.m136726d().m136727a(this, 0L);
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo104131n(long j);

    /* JADX INFO: renamed from: l.bge$s */
    public static abstract class AbstractC16002s extends ysi<View> {
        public /* synthetic */ AbstractC16002s(String str, C15990g c15990g) {
            this(str);
        }

        public AbstractC16002s(String str) {
            super(str);
        }
    }

    public bge(zsi zsiVar) {
        this.f76600a = 0.0f;
        this.f76601b = Float.MAX_VALUE;
        this.f76602c = false;
        this.f76605f = false;
        this.f76606g = Float.MAX_VALUE;
        this.f76607h = -Float.MAX_VALUE;
        this.f76608i = 0L;
        this.f76610k = new ArrayList<>();
        this.f76611l = new ArrayList<>();
        this.f76603d = null;
        this.f76604e = new C15989f("FloatValueHolder", zsiVar);
        this.f76609j = 1.0f;
    }
}
