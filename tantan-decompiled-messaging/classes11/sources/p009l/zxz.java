package p009l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.AvatarClapAnimView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.bt0;
import l.hpd0;
import l.mcz;
import l.o6j0;
import l.wmz;
import l.y4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zxz {

    /* JADX INFO: renamed from: g */
    public static long f24034g = 1100;

    /* JADX INFO: renamed from: h */
    public static long f24035h = 200;

    /* JADX INFO: renamed from: i */
    public static long f24036i = 900;

    /* JADX INFO: renamed from: j */
    public static long f24037j = 300;

    /* JADX INFO: renamed from: a */
    public ValueAnimator f24038a;

    /* JADX INFO: renamed from: b */
    public String f24039b;

    /* JADX INFO: renamed from: c */
    public String f24040c;

    /* JADX INFO: renamed from: d */
    public WeakReference<InterfaceC1382d> f24041d;

    /* JADX INFO: renamed from: e */
    public WeakReference<AvatarClapAnimView> f24042e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f24043f;

    /* JADX INFO: renamed from: l.zxz$a */
    public class C1379a implements ValueAnimator.AnimatorUpdateListener {
        public C1379a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue > 30.0f) {
                fFloatValue -= 30.0f;
            }
            if (TextUtils.isEmpty(zxz.this.f24039b) || TextUtils.isEmpty(zxz.this.f24040c) || !NullChecker.a(zxz.this.f24041d) || !NullChecker.a(zxz.this.f24041d.get())) {
                return;
            }
            ((InterfaceC1382d) zxz.this.f24041d.get()).mo6059a(false, fFloatValue, zxz.this.f24039b, zxz.this.f24040c);
        }
    }

    /* JADX INFO: renamed from: l.zxz$b */
    public class C1380b implements ValueAnimator.AnimatorUpdateListener {
        public C1380b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (zxz.this.f24043f == null || zxz.this.f24043f.get() == null) {
                return;
            }
            View view = (View) zxz.this.f24043f.get();
            if (view.getTag(y4c0.q) instanceof String) {
                if (TextUtils.equals((String) view.getTag(y4c0.q), zxz.this.f24039b + zxz.this.f24040c)) {
                    view.setRotation(fFloatValue);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.zxz$c */
    public static class C1381c {

        /* JADX INFO: renamed from: a */
        public static final zxz f24046a = new zxz();
    }

    /* JADX INFO: renamed from: l.zxz$d */
    public interface InterfaceC1382d {
        /* JADX INFO: renamed from: a */
        void mo6059a(boolean z, float f, String str, String str2);
    }

    /* JADX INFO: renamed from: h */
    public static zxz m26132h() {
        return C1381c.f24046a;
    }

    /* JADX INFO: renamed from: g */
    public final AvatarClapAnimView m26133g(Context context) {
        if (this.f24042e == null) {
            AvatarClapAnimView avatarClapAnimView = new AvatarClapAnimView(context);
            m26136k(avatarClapAnimView);
            this.f24042e = new WeakReference<>(avatarClapAnimView);
            m26139n();
        }
        AvatarClapAnimView avatarClapAnimView2 = this.f24042e.get();
        if (NullChecker.a(avatarClapAnimView2) && (avatarClapAnimView2.getParent() instanceof ViewGroup)) {
            ((ViewGroup) avatarClapAnimView2.getParent()).removeView(avatarClapAnimView2);
        }
        return avatarClapAnimView2;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m26134i() {
        CoreModule.c.f0.mh(this.f24039b);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m26135j() {
        WeakReference<AvatarClapAnimView> weakReference = this.f24042e;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        bt0.q(this.f24042e.get(), "alpha", new float[]{1.0f, 0.0f}).setDuration(f24037j).start();
    }

    /* JADX INFO: renamed from: k */
    public final void m26136k(InterfaceC1382d interfaceC1382d) {
        this.f24041d = new WeakReference<>(interfaceC1382d);
    }

    /* JADX INFO: renamed from: l */
    public void m26137l() {
        this.f24039b = null;
        this.f24040c = null;
        this.f24041d = null;
        this.f24042e = null;
        this.f24043f = null;
        ValueAnimator valueAnimator = this.f24038a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f24038a.cancel();
        }
        this.f24038a = null;
    }

    /* JADX INFO: renamed from: m */
    public void m26138m(String str, String str2) {
        this.f24039b = str;
        this.f24040c = str2;
    }

    /* JADX INFO: renamed from: n */
    public final void m26139n() {
        if (this.f24038a != null) {
            return;
        }
        m26140o();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 60.0f);
        this.f24038a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setStartDelay(f24035h);
        this.f24038a.setDuration(f24034g * 2);
        this.f24038a.addUpdateListener(new C1379a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, -15.0f, 0.0f, 15.0f, 0.0f, -15.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(f24036i).setStartDelay((f24034g * 2) + f24035h);
        valueAnimatorOfFloat2.addUpdateListener(new C1380b());
        bt0.f(valueAnimatorOfFloat2, new Runnable() { // from class: l.xxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f22802a.m26134i();
            }
        }).start();
        bt0.f(this.f24038a, new Runnable() { // from class: l.yxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f23283a.m26135j();
            }
        }).start();
        CoreModule.c.b1.i3();
    }

    /* JADX INFO: renamed from: o */
    public final void m26140o() {
        o6j0.h("e_tickle_popup", "p_chat_view", new o6j0.a[]{o6j0.a.h("tooltips_trigger_module", "null"), o6j0.a.h("tooltips_trigger_page", "chat_page"), o6j0.a.h("tooltips_trigger_reason", "guide"), o6j0.a.h("tooltips_type_ui", "overlay")});
    }

    /* JADX INFO: renamed from: p */
    public void m26141p(String str, String str2, FrameLayout frameLayout, View view) {
        if (NullChecker.a(frameLayout.getContext()) && (frameLayout.getContext() instanceof MessagesAct)) {
            if (frameLayout.getContext().l() instanceof mcz) {
                return;
            }
            if (frameLayout.getContext().l() instanceof wmz) {
                frameLayout.getContext().l().V2();
                return;
            }
        }
        if (User.isTeamAccount(str)) {
            return;
        }
        view.setTag(y4c0.q, str + str2);
        if (TextUtils.equals(str, this.f24039b) && TextUtils.equals(str2, this.f24040c)) {
            this.f24043f = new WeakReference<>(view);
            AvatarClapAnimView avatarClapAnimViewM26133g = m26133g(frameLayout.getContext());
            if (avatarClapAnimViewM26133g != null) {
                frameLayout.addView(avatarClapAnimViewM26133g, new FrameLayout.LayoutParams(-1, -1));
            }
            hpd0 hpd0Var = CoreModule.c.b1.S;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            CoreModule.c.b1.T.put(bool);
            CoreModule.c.b1.U.put(str);
        }
    }

    public zxz() {
    }
}
