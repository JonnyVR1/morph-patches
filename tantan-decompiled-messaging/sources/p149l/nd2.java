package p149l;

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
public class nd2 {

    /* JADX INFO: renamed from: i */
    public static nd2 f138247i;

    /* JADX INFO: renamed from: a */
    public AtomicInteger f138248a = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public HashMap<String, hd2> f138250c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public SparseArray<hd2> f138251d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    public int f138252e = -1;

    /* JADX INFO: renamed from: f */
    public long f138253f = -1;

    /* JADX INFO: renamed from: g */
    public long f138254g = -1;

    /* JADX INFO: renamed from: h */
    public List<C18679b> f138255h = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Handler f138249b = new HandlerC18678a(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.nd2$a */
    public class HandlerC18678a extends Handler {
        public HandlerC18678a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            nd2.this.m158968f(message.what, message.arg1);
        }
    }

    /* JADX INFO: renamed from: l.nd2$b */
    public static class C18679b {

        /* JADX INFO: renamed from: a */
        public int f138257a;

        /* JADX INFO: renamed from: b */
        public int f138258b;

        /* JADX INFO: renamed from: c */
        public String f138259c;

        /* JADX INFO: renamed from: d */
        public long f138260d;

        public C18679b(int i, int i2, String str, long j) {
            this.f138257a = i;
            this.f138258b = i2;
            this.f138259c = str;
            this.f138260d = j;
        }
    }

    /* JADX INFO: renamed from: j */
    public static nd2 m158964j() {
        if (f138247i == null) {
            synchronized (nd2.class) {
                try {
                    if (f138247i == null) {
                        f138247i = new nd2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f138247i;
    }

    /* JADX INFO: renamed from: c */
    public final Pair<Integer, String> m158965c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iIncrementAndGet = this.f138248a.incrementAndGet();
        return Pair.create(Integer.valueOf(iIncrementAndGet), jCurrentTimeMillis + "_banner_" + iIncrementAndGet);
    }

    /* JADX INFO: renamed from: e */
    public void m158967e(String str) {
        long duration;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hd2 hd2Var = this.f138250c.get(str);
        if (str == null || hd2Var == null) {
            return;
        }
        if (NullChecker.m81303a(null)) {
            throw null;
        }
        View viewM130539a = hd2Var.m130539a();
        if (viewM130539a == null) {
            m158977p(hd2Var, true);
            return;
        }
        if (viewM130539a.getParent() == null) {
            m158977p(hd2Var, false);
            return;
        }
        hd2.InterfaceC17283a interfaceC17283a = hd2Var.f107208r;
        Animator animatorMo40466a = interfaceC17283a != null ? interfaceC17283a.mo40466a(viewM130539a) : null;
        if (animatorMo40466a == null) {
            ViewPropertyAnimator viewPropertyAnimatorM158971i = m158971i(viewM130539a, hd2Var.m130547i(), viewM130539a.getHeight() + viewM130539a.getTop());
            duration = viewPropertyAnimatorM158971i.getDuration();
            viewPropertyAnimatorM158971i.start();
        } else {
            animatorMo40466a.start();
            duration = animatorMo40466a.getDuration();
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = hd2Var.m130541c();
        this.f138249b.sendMessageDelayed(messageObtain, duration);
    }

    /* JADX INFO: renamed from: f */
    public final void m158968f(int i, int i2) {
        if (this.f138254g > System.currentTimeMillis()) {
            return;
        }
        if (i == 4) {
            this.f138253f = -1L;
            m158984w();
            return;
        }
        hd2 hd2Var = this.f138251d.get(i2);
        if (hd2Var != null) {
            if (i == 1) {
                m158967e(hd2Var.m130542d());
                return;
            }
            if (i == 2) {
                m158976o(hd2Var.m130542d());
            } else if (i == 3) {
                this.f138253f = -1L;
                m158984w();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m158969g() {
        int i;
        if (this.f138251d.size() <= 0 || (i = this.f138252e) < 0) {
            return null;
        }
        hd2 hd2Var = this.f138251d.get(i);
        if (NullChecker.m81303a(hd2Var)) {
            return hd2Var.m130542d();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final ViewPropertyAnimator m158970h(View view, long j, int i) {
        ddl0 ddl0VarM125186c = gbl0.m125186c(view);
        view.setTranslationY(-i);
        view.setAlpha(0.0f);
        ddl0VarM125186c.m111040l(0.0f).m111030b(1.0f).m111033e(j);
        return view.animate();
    }

    /* JADX INFO: renamed from: i */
    public final ViewPropertyAnimator m158971i(View view, long j, int i) {
        gbl0.m125186c(view).m111040l(-i).m111030b(0.0f).m111033e(j);
        return view.animate();
    }

    /* JADX INFO: renamed from: k */
    public void m158972k(hd2 hd2Var) {
        C18679b c18679b = new C18679b(hd2Var.m130541c(), hd2Var.m130544f(), hd2Var.m130542d(), hd2Var.m130548j());
        boolean zIsEmpty = this.f138255h.isEmpty();
        List<C18679b> list = this.f138255h;
        if (zIsEmpty) {
            list.add(c18679b);
            return;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            List<C18679b> list2 = this.f138255h;
            if (i >= size) {
                list2.add(c18679b);
                return;
            }
            if (c18679b.f138258b > list2.get(i).f138258b) {
                this.f138255h.add(i, c18679b);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m158973l(hd2 hd2Var, View view, View view2, int[] iArr) {
        long duration;
        hd2.InterfaceC17285c interfaceC17285c = hd2Var.f107206p;
        if (interfaceC17285c != null) {
            interfaceC17285c.mo130565a(hd2Var.m130542d(), view, view2);
        }
        hd2.InterfaceC17283a interfaceC17283a = hd2Var.f107208r;
        Animator animatorMo40467b = interfaceC17283a != null ? interfaceC17283a.mo40467b(view2) : null;
        int height = iArr[0] + view2.getHeight();
        if (animatorMo40467b == null) {
            ViewPropertyAnimator viewPropertyAnimatorM158970h = m158970h(view2, hd2Var.m130546h(), height);
            duration = viewPropertyAnimatorM158970h.getDuration();
            viewPropertyAnimatorM158970h.start();
        } else {
            animatorMo40467b.start();
            duration = animatorMo40467b.getDuration();
        }
        if (hd2Var.m130540b() > 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.arg1 = hd2Var.m130541c();
            this.f138249b.sendMessageDelayed(messageObtain, hd2Var.m130540b() + duration);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m158974m() {
        this.f138252e = -1;
        this.f138253f = -1L;
        this.f138255h.clear();
        this.f138250c.clear();
        this.f138251d.clear();
    }

    /* JADX INFO: renamed from: n */
    public void m158975n(long j) {
        this.f138254g = System.currentTimeMillis() + j;
        this.f138249b.removeMessages(3);
        this.f138249b.removeMessages(4);
        this.f138249b.removeMessages(2);
        this.f138249b.removeMessages(1);
        if (this.f138252e >= 0) {
            String strM158969g = m158969g();
            if (!TextUtils.isEmpty(strM158969g)) {
                m158976o(strM158969g);
            }
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        this.f138249b.sendMessageDelayed(messageObtain, j);
    }

    /* JADX INFO: renamed from: o */
    public final void m158976o(String str) {
        hd2 hd2VarRemove = this.f138250c.remove(str);
        if (str != null && hd2VarRemove != null) {
            this.f138251d.remove(hd2VarRemove.m130541c());
            m158978q(hd2VarRemove.m130541c());
            View viewM130539a = hd2VarRemove.m130539a();
            if (viewM130539a != null) {
                ViewParent parent = viewM130539a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewM130539a);
                }
            }
        }
        this.f138252e = -1;
        m158985x(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m158977p(hd2 hd2Var, boolean z) {
        if (hd2Var != null) {
            this.f138250c.remove(hd2Var.m130542d());
            this.f138251d.remove(hd2Var.m130541c());
            if (!this.f138255h.isEmpty()) {
                Iterator<C18679b> it = this.f138255h.iterator();
                while (it.hasNext()) {
                    if (it.next().f138257a == hd2Var.m130541c()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        if (z) {
            m158984w();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m158978q(int i) {
        if (vwb.m200296J(this.f138255h)) {
            return;
        }
        Iterator<C18679b> it = this.f138255h.iterator();
        while (it.hasNext()) {
            if (it.next().f138257a == i) {
                it.remove();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m158979r() {
        this.f138254g = -1L;
        if (this.f138249b.hasMessages(4)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        this.f138249b.sendMessageDelayed(messageObtain, 200L);
    }

    /* JADX INFO: renamed from: s */
    public String m158980s(hd2 hd2Var) {
        m158966d();
        Pair<Integer, String> pairM158965c = m158965c();
        String str = (String) pairM158965c.second;
        hd2Var.m130556r(((Integer) pairM158965c.first).intValue(), str);
        m158983v(hd2Var);
        return str;
    }

    /* JADX INFO: renamed from: t */
    public void m158981t(hd2 hd2Var, String str) {
        m158966d();
        if (this.f138250c.get(str) != null) {
            return;
        }
        hd2Var.m130556r(this.f138248a.incrementAndGet(), str);
        m158983v(hd2Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m158982u(final hd2 hd2Var) {
        final FrameLayout frameLayout;
        ViewGroup viewGroupM130550l = hd2Var.m130550l();
        Context contextM130545g = hd2Var.m130545g();
        if (viewGroupM130550l == null || contextM130545g == null) {
            m158977p(hd2Var, true);
            return;
        }
        final View viewInflate = o7r.m163037a(contextM130545g).inflate(hd2Var.m130543e(), (ViewGroup) null);
        hd2Var.m130558t(viewInflate);
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        final int[] iArrM130549k = hd2Var.m130549k();
        if (hd2Var.m130551m()) {
            CardView cardView = new CardView(contextM130545g);
            cardView.setRadius(iArrM130549k[3]);
            cardView.addView(viewInflate, new FrameLayout.LayoutParams(-1, -2));
            cardView.setCardElevation(hd2Var.f107205o);
            frameLayout = new FrameLayout(contextM130545g);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = iArrM130549k[0];
            layoutParams.rightMargin = iArrM130549k[1];
            int i = iArrM130549k[2];
            layoutParams.leftMargin = i;
            layoutParams.bottomMargin = i;
            frameLayout.addView(cardView, layoutParams);
        } else {
            frameLayout = new FrameLayout(contextM130545g);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = iArrM130549k[0];
            layoutParams2.rightMargin = iArrM130549k[1];
            layoutParams2.leftMargin = iArrM130549k[2];
            frameLayout.addView(viewInflate, layoutParams2);
        }
        hd2Var.m130553o(frameLayout);
        viewGroupM130550l.addView(frameLayout, marginLayoutParams);
        hd2Var.m130552n(viewInflate);
        this.f138252e = hd2Var.m130541c();
        frameLayout.setAlpha(0.0f);
        frameLayout.post(new Runnable() { // from class: l.md2
            @Override // java.lang.Runnable
            public final void run() {
                this.f133206a.m158973l(hd2Var, viewInflate, frameLayout, iArrM130549k);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m158983v(hd2 hd2Var) {
        this.f138251d.put(hd2Var.m130541c(), hd2Var);
        this.f138250c.put(hd2Var.m130542d(), hd2Var);
        m158972k(hd2Var);
        m158984w();
    }

    /* JADX INFO: renamed from: w */
    public final void m158984w() {
        m158985x(false);
    }

    /* JADX INFO: renamed from: x */
    public final void m158985x(boolean z) {
        if (this.f138254g <= System.currentTimeMillis() && !this.f138255h.isEmpty() && this.f138252e == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f138253f;
            if (jCurrentTimeMillis < j) {
                this.f138249b.removeMessages(3);
                this.f138249b.removeMessages(4);
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                this.f138249b.sendMessageDelayed(messageObtain, this.f138253f - System.currentTimeMillis());
                return;
            }
            if (j == -1 && !z) {
                hd2 hd2Var = this.f138250c.get(this.f138255h.remove(0).f138259c);
                if (hd2Var != null) {
                    m158982u(hd2Var);
                    return;
                }
                return;
            }
            List<C18679b> list = this.f138255h;
            if (!z) {
                hd2 hd2Var2 = this.f138250c.get(list.remove(0).f138259c);
                if (hd2Var2 != null) {
                    m158982u(hd2Var2);
                    return;
                }
                return;
            }
            C18679b c18679b = list.get(0);
            this.f138253f = System.currentTimeMillis() + c18679b.f138260d;
            this.f138249b.removeMessages(3);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 3;
            messageObtain2.arg1 = c18679b.f138257a;
            this.f138249b.sendMessageDelayed(messageObtain2, c18679b.f138260d);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m158966d() {
    }
}
