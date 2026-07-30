package p006l;

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
import l.ddl0;
import l.gbl0;
import l.o7r;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nd2 {

    /* JADX INFO: renamed from: i */
    public static nd2 f17596i;

    /* JADX INFO: renamed from: a */
    public AtomicInteger f17597a = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public HashMap<String, hd2> f17599c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public SparseArray<hd2> f17600d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    public int f17601e = -1;

    /* JADX INFO: renamed from: f */
    public long f17602f = -1;

    /* JADX INFO: renamed from: g */
    public long f17603g = -1;

    /* JADX INFO: renamed from: h */
    public List<C1045b> f17604h = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Handler f17598b = new HandlerC1044a(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.nd2$a */
    public class HandlerC1044a extends Handler {
        public HandlerC1044a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            nd2.this.m20054f(message.what, message.arg1);
        }
    }

    /* JADX INFO: renamed from: l.nd2$b */
    public static class C1045b {

        /* JADX INFO: renamed from: a */
        public int f17606a;

        /* JADX INFO: renamed from: b */
        public int f17607b;

        /* JADX INFO: renamed from: c */
        public String f17608c;

        /* JADX INFO: renamed from: d */
        public long f17609d;

        public C1045b(int i, int i2, String str, long j) {
            this.f17606a = i;
            this.f17607b = i2;
            this.f17608c = str;
            this.f17609d = j;
        }
    }

    /* JADX INFO: renamed from: j */
    public static nd2 m20050j() {
        if (f17596i == null) {
            synchronized (nd2.class) {
                try {
                    if (f17596i == null) {
                        f17596i = new nd2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17596i;
    }

    /* JADX INFO: renamed from: c */
    public final Pair<Integer, String> m20051c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iIncrementAndGet = this.f17597a.incrementAndGet();
        return Pair.create(Integer.valueOf(iIncrementAndGet), jCurrentTimeMillis + "_banner_" + iIncrementAndGet);
    }

    /* JADX INFO: renamed from: e */
    public void m20053e(String str) {
        long duration;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hd2 hd2Var = this.f17599c.get(str);
        if (str == null || hd2Var == null) {
            return;
        }
        if (NullChecker.a((Object) null)) {
            throw null;
        }
        View viewM16167a = hd2Var.m16167a();
        if (viewM16167a == null) {
            m20063p(hd2Var, true);
            return;
        }
        if (viewM16167a.getParent() == null) {
            m20063p(hd2Var, false);
            return;
        }
        hd2.InterfaceC0794a interfaceC0794a = hd2Var.f13834r;
        Animator animatorM16193a = interfaceC0794a != null ? interfaceC0794a.m16193a(viewM16167a) : null;
        if (animatorM16193a == null) {
            ViewPropertyAnimator viewPropertyAnimatorM20057i = m20057i(viewM16167a, hd2Var.m16175i(), viewM16167a.getHeight() + viewM16167a.getTop());
            duration = viewPropertyAnimatorM20057i.getDuration();
            viewPropertyAnimatorM20057i.start();
        } else {
            animatorM16193a.start();
            duration = animatorM16193a.getDuration();
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = hd2Var.m16169c();
        this.f17598b.sendMessageDelayed(messageObtain, duration);
    }

    /* JADX INFO: renamed from: f */
    public final void m20054f(int i, int i2) {
        if (this.f17603g > System.currentTimeMillis()) {
            return;
        }
        if (i == 4) {
            this.f17602f = -1L;
            m20070w();
            return;
        }
        hd2 hd2Var = this.f17600d.get(i2);
        if (hd2Var != null) {
            if (i == 1) {
                m20053e(hd2Var.m16170d());
                return;
            }
            if (i == 2) {
                m20062o(hd2Var.m16170d());
            } else if (i == 3) {
                this.f17602f = -1L;
                m20070w();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m20055g() {
        int i;
        if (this.f17600d.size() <= 0 || (i = this.f17601e) < 0) {
            return null;
        }
        hd2 hd2Var = this.f17600d.get(i);
        if (NullChecker.a(hd2Var)) {
            return hd2Var.m16170d();
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final ViewPropertyAnimator m20056h(View view, long j, int i) {
        ddl0 ddl0VarC = gbl0.c(view);
        view.setTranslationY(-i);
        view.setAlpha(0.0f);
        ddl0VarC.l(0.0f).b(1.0f).e(j);
        return view.animate();
    }

    /* JADX INFO: renamed from: i */
    public final ViewPropertyAnimator m20057i(View view, long j, int i) {
        gbl0.c(view).l(-i).b(0.0f).e(j);
        return view.animate();
    }

    /* JADX INFO: renamed from: k */
    public void m20058k(hd2 hd2Var) {
        C1045b c1045b = new C1045b(hd2Var.m16169c(), hd2Var.m16172f(), hd2Var.m16170d(), hd2Var.m16176j());
        boolean zIsEmpty = this.f17604h.isEmpty();
        List<C1045b> list = this.f17604h;
        if (zIsEmpty) {
            list.add(c1045b);
            return;
        }
        int size = list.size();
        int i = 0;
        while (true) {
            List<C1045b> list2 = this.f17604h;
            if (i >= size) {
                list2.add(c1045b);
                return;
            }
            if (c1045b.f17607b > list2.get(i).f17607b) {
                this.f17604h.add(i, c1045b);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m20059l(hd2 hd2Var, View view, View view2, int[] iArr) {
        long duration;
        hd2.InterfaceC0796c interfaceC0796c = hd2Var.f13832p;
        if (interfaceC0796c != null) {
            interfaceC0796c.m16196a(hd2Var.m16170d(), view, view2);
        }
        hd2.InterfaceC0794a interfaceC0794a = hd2Var.f13834r;
        Animator animatorM16194b = interfaceC0794a != null ? interfaceC0794a.m16194b(view2) : null;
        int height = iArr[0] + view2.getHeight();
        if (animatorM16194b == null) {
            ViewPropertyAnimator viewPropertyAnimatorM20056h = m20056h(view2, hd2Var.m16174h(), height);
            duration = viewPropertyAnimatorM20056h.getDuration();
            viewPropertyAnimatorM20056h.start();
        } else {
            animatorM16194b.start();
            duration = animatorM16194b.getDuration();
        }
        if (hd2Var.m16168b() > 0) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.arg1 = hd2Var.m16169c();
            this.f17598b.sendMessageDelayed(messageObtain, hd2Var.m16168b() + duration);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m20060m() {
        this.f17601e = -1;
        this.f17602f = -1L;
        this.f17604h.clear();
        this.f17599c.clear();
        this.f17600d.clear();
    }

    /* JADX INFO: renamed from: n */
    public void m20061n(long j) {
        this.f17603g = System.currentTimeMillis() + j;
        this.f17598b.removeMessages(3);
        this.f17598b.removeMessages(4);
        this.f17598b.removeMessages(2);
        this.f17598b.removeMessages(1);
        if (this.f17601e >= 0) {
            String strM20055g = m20055g();
            if (!TextUtils.isEmpty(strM20055g)) {
                m20062o(strM20055g);
            }
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        this.f17598b.sendMessageDelayed(messageObtain, j);
    }

    /* JADX INFO: renamed from: o */
    public final void m20062o(String str) {
        hd2 hd2VarRemove = this.f17599c.remove(str);
        if (str != null && hd2VarRemove != null) {
            this.f17600d.remove(hd2VarRemove.m16169c());
            m20064q(hd2VarRemove.m16169c());
            View viewM16167a = hd2VarRemove.m16167a();
            if (viewM16167a != null) {
                ViewParent parent = viewM16167a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(viewM16167a);
                }
            }
        }
        this.f17601e = -1;
        m20071x(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m20063p(hd2 hd2Var, boolean z) {
        if (hd2Var != null) {
            this.f17599c.remove(hd2Var.m16170d());
            this.f17600d.remove(hd2Var.m16169c());
            if (!this.f17604h.isEmpty()) {
                Iterator<C1045b> it = this.f17604h.iterator();
                while (it.hasNext()) {
                    if (it.next().f17606a == hd2Var.m16169c()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        if (z) {
            m20070w();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m20064q(int i) {
        if (vwb.J(this.f17604h)) {
            return;
        }
        Iterator<C1045b> it = this.f17604h.iterator();
        while (it.hasNext()) {
            if (it.next().f17606a == i) {
                it.remove();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m20065r() {
        this.f17603g = -1L;
        if (this.f17598b.hasMessages(4)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        this.f17598b.sendMessageDelayed(messageObtain, 200L);
    }

    /* JADX INFO: renamed from: s */
    public String m20066s(hd2 hd2Var) {
        m20052d();
        Pair<Integer, String> pairM20051c = m20051c();
        String str = (String) pairM20051c.second;
        hd2Var.m16184r(((Integer) pairM20051c.first).intValue(), str);
        m20069v(hd2Var);
        return str;
    }

    /* JADX INFO: renamed from: t */
    public void m20067t(hd2 hd2Var, String str) {
        m20052d();
        if (this.f17599c.get(str) != null) {
            return;
        }
        hd2Var.m16184r(this.f17597a.incrementAndGet(), str);
        m20069v(hd2Var);
    }

    /* JADX INFO: renamed from: u */
    public final void m20068u(final hd2 hd2Var) {
        final FrameLayout frameLayout;
        ViewGroup viewGroupM16178l = hd2Var.m16178l();
        Context contextM16173g = hd2Var.m16173g();
        if (viewGroupM16178l == null || contextM16173g == null) {
            m20063p(hd2Var, true);
            return;
        }
        final View viewInflate = o7r.a(contextM16173g).inflate(hd2Var.m16171e(), (ViewGroup) null);
        hd2Var.m16186t(viewInflate);
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        final int[] iArrM16177k = hd2Var.m16177k();
        if (hd2Var.m16179m()) {
            CardView cardView = new CardView(contextM16173g);
            cardView.setRadius(iArrM16177k[3]);
            cardView.addView(viewInflate, new FrameLayout.LayoutParams(-1, -2));
            cardView.setCardElevation(hd2Var.f13831o);
            frameLayout = new FrameLayout(contextM16173g);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = iArrM16177k[0];
            layoutParams.rightMargin = iArrM16177k[1];
            int i = iArrM16177k[2];
            layoutParams.leftMargin = i;
            layoutParams.bottomMargin = i;
            frameLayout.addView((View) cardView, (ViewGroup.LayoutParams) layoutParams);
        } else {
            frameLayout = new FrameLayout(contextM16173g);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = iArrM16177k[0];
            layoutParams2.rightMargin = iArrM16177k[1];
            layoutParams2.leftMargin = iArrM16177k[2];
            frameLayout.addView(viewInflate, layoutParams2);
        }
        hd2Var.m16181o(frameLayout);
        viewGroupM16178l.addView(frameLayout, marginLayoutParams);
        hd2Var.m16180n(viewInflate);
        this.f17601e = hd2Var.m16169c();
        frameLayout.setAlpha(0.0f);
        frameLayout.post(new Runnable() { // from class: l.md2
            @Override // java.lang.Runnable
            public final void run() {
                this.f16918a.m20059l(hd2Var, viewInflate, frameLayout, iArrM16177k);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public void m20069v(hd2 hd2Var) {
        this.f17600d.put(hd2Var.m16169c(), hd2Var);
        this.f17599c.put(hd2Var.m16170d(), hd2Var);
        m20058k(hd2Var);
        m20070w();
    }

    /* JADX INFO: renamed from: w */
    public final void m20070w() {
        m20071x(false);
    }

    /* JADX INFO: renamed from: x */
    public final void m20071x(boolean z) {
        if (this.f17603g <= System.currentTimeMillis() && !this.f17604h.isEmpty() && this.f17601e == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f17602f;
            if (jCurrentTimeMillis < j) {
                this.f17598b.removeMessages(3);
                this.f17598b.removeMessages(4);
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                this.f17598b.sendMessageDelayed(messageObtain, this.f17602f - System.currentTimeMillis());
                return;
            }
            if (j == -1 && !z) {
                hd2 hd2Var = this.f17599c.get(this.f17604h.remove(0).f17608c);
                if (hd2Var != null) {
                    m20068u(hd2Var);
                    return;
                }
                return;
            }
            List<C1045b> list = this.f17604h;
            if (!z) {
                hd2 hd2Var2 = this.f17599c.get(list.remove(0).f17608c);
                if (hd2Var2 != null) {
                    m20068u(hd2Var2);
                    return;
                }
                return;
            }
            C1045b c1045b = list.get(0);
            this.f17602f = System.currentTimeMillis() + c1045b.f17609d;
            this.f17598b.removeMessages(3);
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 3;
            messageObtain2.arg1 = c1045b.f17606a;
            this.f17598b.sendMessageDelayed(messageObtain2, c1045b.f17609d);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m20052d() {
    }
}
