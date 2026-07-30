package p153l;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class ud2 {

    /* JADX INFO: renamed from: i */
    public static ud2 f178486i;

    /* JADX INFO: renamed from: a */
    public AtomicInteger f178487a = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public HashMap<String, od2> f178489c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public SparseArray<od2> f178490d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    public int f178491e = -1;

    /* JADX INFO: renamed from: f */
    public long f178492f = -1;

    /* JADX INFO: renamed from: g */
    public long f178493g = -1;

    /* JADX INFO: renamed from: h */
    public List<C20546b> f178494h = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Handler f178488b = new HandlerC20545a(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.ud2$a */
    public class HandlerC20545a extends Handler {
        public HandlerC20545a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            ud2.this.m195460f(message.what, message.arg1);
        }
    }

    /* JADX INFO: renamed from: l.ud2$b */
    public static class C20546b {

        /* JADX INFO: renamed from: a */
        public int f178496a;

        /* JADX INFO: renamed from: b */
        public int f178497b;

        /* JADX INFO: renamed from: c */
        public String f178498c;

        /* JADX INFO: renamed from: d */
        public long f178499d;

        public C20546b(int i, int i2, String str, long j) {
            this.f178496a = i;
            this.f178497b = i2;
            this.f178498c = str;
            this.f178499d = j;
        }
    }

    /* JADX INFO: renamed from: j */
    public static ud2 m195456j() {
        if (f178486i == null) {
            synchronized (ud2.class) {
                try {
                    if (f178486i == null) {
                        f178486i = new ud2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f178486i;
    }

    /* JADX INFO: renamed from: c */
    public final Pair<Integer, String> m195457c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iIncrementAndGet = this.f178487a.incrementAndGet();
        return Pair.create(Integer.valueOf(iIncrementAndGet), jCurrentTimeMillis + "_banner_" + iIncrementAndGet);
    }

    /* JADX INFO: renamed from: e */
    public void m195459e(String str) {
        long duration;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        od2 od2Var = this.f178489c.get(str);
        if (str == null || od2Var == null) {
            return;
        }
        if (NullChecker.m82486a(null)) {
            throw null;
        }
        View viewM167250a = od2Var.m167250a();
        if (viewM167250a == null) {
            m195469p(od2Var, true);
            return;
        }
        if (viewM167250a.getParent() == null) {
            m195469p(od2Var, false);
            return;
        }
        od2.InterfaceC19106a interfaceC19106a = od2Var.f146843r;
        Animator animatorMo41477a = interfaceC19106a != null ? interfaceC19106a.mo41477a(viewM167250a) : null;
        if (animatorMo41477a == null) {
            ViewPropertyAnimator viewPropertyAnimatorM195463i = m195463i(viewM167250a, od2Var.m167258i(), viewM167250a.getHeight() + viewM167250a.getTop());
            duration = viewPropertyAnimatorM195463i.getDuration();
            viewPropertyAnimatorM195463i.start();
        } else {
            animatorMo41477a.start();
            duration = animatorMo41477a.getDuration();
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = od2Var.m167252c();
        this.f178488b.sendMessageDelayed(messageObtain, duration);
    }

    /* JADX INFO: renamed from: f */
    public final void m195460f(int i, int i2) {
        if (this.f178493g > System.currentTimeMillis()) {
            return;
        }
        if (i == 4) {
            this.f178492f = -1L;
            m195476w();
            return;
        }
        od2 od2Var = this.f178490d.get(i2);
        if (od2Var != null) {
            if (i == 1) {
                m195459e(od2Var.m167253d());
                return;
            }
            if (i == 2) {
                m195468o(od2Var.m167253d());
            } else if (i == 3) {
                this.f178492f = -1L;
                m195476w();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m195461g() {
        int i;
        if (this.f178490d.size() <= 0 || (i = this.f178491e) < 0) {
            return null;
        }
        od2 od2Var = this.f178490d.get(i);
        if (NullChecker.m82486a(od2Var)) {
            return od2Var.m167253d();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final ViewPropertyAnimator m195462h(View view, long j, int i) {
        hml0 hml0VarM150149c = kkl0.m150149c(view);
        view.setTranslationY(-i);
        view.setAlpha(0.0f);
        hml0VarM150149c.m135949l(0.0f).m135939b(1.0f).m135942e(j);
        return view.animate();
    }

    /* JADX INFO: renamed from: i */
    public final ViewPropertyAnimator m195463i(View view, long j, int i) {
        kkl0.m150149c(view).m135949l(-i).m135939b(0.0f).m135942e(j);
        return view.animate();
    }

    /* JADX INFO: renamed from: k */
    public void m195464k(od2 od2Var) {
        C20546b c20546b = new C20546b(od2Var.m167252c(), od2Var.m167255f(), od2Var.m167253d(), od2Var.m167259j());
        boolean zIsEmpty = this.f178494h.isEmpty();
        List<C20546b> list = this.f178494h;
        if (zIsEmpty) {
            list.add(c20546b);
            return;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            List<C20546b> list2 = this.f178494h;
            if (i >= size) {
                list2.add(c20546b);
                return;
            }
            if (c20546b.f178497b > list2.get(i).f178497b) {
                this.f178494h.add(i, c20546b);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m195465l(od2 od2Var, View view, View view2, int[] iArr) {
        long duration;
        od2.InterfaceC19108c interfaceC19108c = od2Var.f146841p;
        if (interfaceC19108c != null) {
            interfaceC19108c.mo167276a(od2Var.m167253d(), view, view2);
        }
        od2.InterfaceC19106a interfaceC19106a = od2Var.f146843r;
        Animator animatorMo41478b = interfaceC19106a != null ? interfaceC19106a.mo41478b(view2) : null;
        int height = iArr[0] + view2.getHeight();
        if (animatorMo41478b == null) {
            ViewPropertyAnimator viewPropertyAnimatorM195462h = m195462h(view2, od2Var.m167257h(), height);
            duration = viewPropertyAnimatorM195462h.getDuration();
            viewPropertyAnimatorM195462h.start();
        } else {
            animatorMo41478b.start();
            duration = animatorMo41478b.getDuration();
        }
        if (od2Var.m167251b() > 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.arg1 = od2Var.m167252c();
            this.f178488b.sendMessageDelayed(messageObtain, od2Var.m167251b() + duration);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m195466m() {
        this.f178491e = -1;
        this.f178492f = -1L;
        this.f178494h.clear();
        this.f178489c.clear();
        this.f178490d.clear();
    }

    /* JADX INFO: renamed from: n */
    public void m195467n(long j) {
        this.f178493g = System.currentTimeMillis() + j;
        this.f178488b.removeMessages(3);
        this.f178488b.removeMessages(4);
        this.f178488b.removeMessages(2);
        this.f178488b.removeMessages(1);
        if (this.f178491e >= 0) {
            String strM195461g = m195461g();
            if (!TextUtils.isEmpty(strM195461g)) {
                m195468o(strM195461g);
            }
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        this.f178488b.sendMessageDelayed(messageObtain, j);
    }

    /* JADX INFO: renamed from: o */
    public final void m195468o(String str) {
        od2 od2VarRemove = this.f178489c.remove(str);
        if (str != null && od2VarRemove != null) {
            this.f178490d.remove(od2VarRemove.m167252c());
            m195470q(od2VarRemove.m167252c());
            View viewM167250a = od2VarRemove.m167250a();
            if (viewM167250a != null) {
                ViewParent parent = viewM167250a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewM167250a);
                }
            }
        }
        this.f178491e = -1;
        m195477x(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m195469p(od2 od2Var, boolean z) {
        if (od2Var != null) {
            this.f178489c.remove(od2Var.m167253d());
            this.f178490d.remove(od2Var.m167252c());
            if (!this.f178494h.isEmpty()) {
                Iterator<C20546b> it = this.f178494h.iterator();
                while (it.hasNext()) {
                    if (it.next().f178496a == od2Var.m167252c()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        if (z) {
            m195476w();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m195470q(int i) {
        if (jyb.m147479J(this.f178494h)) {
            return;
        }
        Iterator<C20546b> it = this.f178494h.iterator();
        while (it.hasNext()) {
            if (it.next().f178496a == i) {
                it.remove();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m195471r() {
        this.f178493g = -1L;
        if (this.f178488b.hasMessages(4)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        this.f178488b.sendMessageDelayed(messageObtain, 200L);
    }

    /* JADX INFO: renamed from: s */
    public String m195472s(od2 od2Var) {
        m195458d();
        Pair<Integer, String> pairM195457c = m195457c();
        String str = (String) pairM195457c.second;
        od2Var.m167267r(((Integer) pairM195457c.first).intValue(), str);
        m195475v(od2Var);
        return str;
    }

    /* JADX INFO: renamed from: t */
    public void m195473t(od2 od2Var, String str) {
        m195458d();
        if (this.f178489c.get(str) != null) {
            return;
        }
        od2Var.m167267r(this.f178487a.incrementAndGet(), str);
        m195475v(od2Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m195474u(final od2 od2Var) {
        final FrameLayout frameLayout;
        ViewGroup viewGroupM167261l = od2Var.m167261l();
        Context contextM167256g = od2Var.m167256g();
        if (viewGroupM167261l == null || contextM167256g == null) {
            m195469p(od2Var, true);
            return;
        }
        final View viewInflate = p9r.m171370a(contextM167256g).inflate(od2Var.m167254e(), (ViewGroup) null);
        od2Var.m167269t(viewInflate);
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        final int[] iArrM167260k = od2Var.m167260k();
        if (od2Var.m167262m()) {
            CardView cardView = new CardView(contextM167256g);
            cardView.setRadius(iArrM167260k[3]);
            cardView.addView(viewInflate, new FrameLayout.LayoutParams(-1, -2));
            cardView.setCardElevation(od2Var.f146840o);
            frameLayout = new FrameLayout(contextM167256g);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = iArrM167260k[0];
            layoutParams.rightMargin = iArrM167260k[1];
            int i = iArrM167260k[2];
            layoutParams.leftMargin = i;
            layoutParams.bottomMargin = i;
            frameLayout.addView(cardView, layoutParams);
        } else {
            frameLayout = new FrameLayout(contextM167256g);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = iArrM167260k[0];
            layoutParams2.rightMargin = iArrM167260k[1];
            layoutParams2.leftMargin = iArrM167260k[2];
            frameLayout.addView(viewInflate, layoutParams2);
        }
        od2Var.m167264o(frameLayout);
        viewGroupM167261l.addView(frameLayout, marginLayoutParams);
        od2Var.m167263n(viewInflate);
        this.f178491e = od2Var.m167252c();
        frameLayout.setAlpha(0.0f);
        frameLayout.post(new Runnable() { // from class: l.td2
            @Override // java.lang.Runnable
            public final void run() {
                this.f173298a.m195465l(od2Var, viewInflate, frameLayout, iArrM167260k);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m195475v(od2 od2Var) {
        this.f178490d.put(od2Var.m167252c(), od2Var);
        this.f178489c.put(od2Var.m167253d(), od2Var);
        m195464k(od2Var);
        m195476w();
    }

    /* JADX INFO: renamed from: w */
    public final void m195476w() {
        m195477x(false);
    }

    /* JADX INFO: renamed from: x */
    public final void m195477x(boolean z) {
        if (this.f178493g <= System.currentTimeMillis() && !this.f178494h.isEmpty() && this.f178491e == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f178492f;
            if (jCurrentTimeMillis < j) {
                this.f178488b.removeMessages(3);
                this.f178488b.removeMessages(4);
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                this.f178488b.sendMessageDelayed(messageObtain, this.f178492f - System.currentTimeMillis());
                return;
            }
            if (j == -1 && !z) {
                od2 od2Var = this.f178489c.get(this.f178494h.remove(0).f178498c);
                if (od2Var != null) {
                    m195474u(od2Var);
                    return;
                }
                return;
            }
            List<C20546b> list = this.f178494h;
            if (!z) {
                od2 od2Var2 = this.f178489c.get(list.remove(0).f178498c);
                if (od2Var2 != null) {
                    m195474u(od2Var2);
                    return;
                }
                return;
            }
            C20546b c20546b = list.get(0);
            this.f178492f = System.currentTimeMillis() + c20546b.f178499d;
            this.f178488b.removeMessages(3);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 3;
            messageObtain2.arg1 = c20546b.f178496a;
            this.f178488b.sendMessageDelayed(messageObtain2, c20546b.f178499d);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m195458d() {
    }
}
