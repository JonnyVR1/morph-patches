package p153l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.AvatarClapAnimView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class w600 {

    /* JADX INFO: renamed from: g */
    public static long f187573g = 1100;

    /* JADX INFO: renamed from: h */
    public static long f187574h = 200;

    /* JADX INFO: renamed from: i */
    public static long f187575i = 900;

    /* JADX INFO: renamed from: j */
    public static long f187576j = 300;

    /* JADX INFO: renamed from: a */
    public ValueAnimator f187577a;

    /* JADX INFO: renamed from: b */
    public String f187578b;

    /* JADX INFO: renamed from: c */
    public String f187579c;

    /* JADX INFO: renamed from: d */
    public WeakReference<InterfaceC21034d> f187580d;

    /* JADX INFO: renamed from: e */
    public WeakReference<AvatarClapAnimView> f187581e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f187582f;

    /* JADX INFO: renamed from: l.w600$a */
    public class C21031a implements ValueAnimator.AnimatorUpdateListener {
        public C21031a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue > 30.0f) {
                fFloatValue -= 30.0f;
            }
            if (TextUtils.isEmpty(w600.this.f187578b) || TextUtils.isEmpty(w600.this.f187579c) || !NullChecker.m82486a(w600.this.f187580d) || !NullChecker.m82486a(w600.this.f187580d.get())) {
                return;
            }
            ((InterfaceC21034d) w600.this.f187580d.get()).mo42928a(false, fFloatValue, w600.this.f187578b, w600.this.f187579c);
        }
    }

    /* JADX INFO: renamed from: l.w600$b */
    public class C21032b implements ValueAnimator.AnimatorUpdateListener {
        public C21032b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (w600.this.f187582f == null || w600.this.f187582f.get() == null) {
                return;
            }
            View view = (View) w600.this.f187582f.get();
            if (view.getTag(edc0.f93434q) instanceof String) {
                if (TextUtils.equals((String) view.getTag(edc0.f93434q), w600.this.f187578b + w600.this.f187579c)) {
                    view.setRotation(fFloatValue);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.w600$c */
    public static class C21033c {

        /* JADX INFO: renamed from: a */
        public static final w600 f187585a = new w600();
    }

    /* JADX INFO: renamed from: l.w600$d */
    public interface InterfaceC21034d {
        /* JADX INFO: renamed from: a */
        void mo42928a(boolean z, float f, String str, String str2);
    }

    /* JADX INFO: renamed from: h */
    public static w600 m205009h() {
        return C21033c.f187585a;
    }

    /* JADX INFO: renamed from: g */
    public final AvatarClapAnimView m205010g(Context context) {
        if (this.f187581e == null) {
            AvatarClapAnimView avatarClapAnimView = new AvatarClapAnimView(context);
            m205013k(avatarClapAnimView);
            this.f187581e = new WeakReference<>(avatarClapAnimView);
            m205016n();
        }
        AvatarClapAnimView avatarClapAnimView2 = this.f187581e.get();
        if (NullChecker.m82486a(avatarClapAnimView2) && (avatarClapAnimView2.getParent() instanceof ViewGroup)) {
            ((ViewGroup) avatarClapAnimView2.getParent()).removeView(avatarClapAnimView2);
        }
        return avatarClapAnimView2;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m205011i() {
        CoreModule.f18264c.f20384f0.m34044mh(this.f187578b);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m205012j() {
        WeakReference<AvatarClapAnimView> weakReference = this.f187581e;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        gt0.m132171q(this.f187581e.get(), "alpha", 1.0f, 0.0f).setDuration(f187576j).start();
    }

    /* JADX INFO: renamed from: k */
    public final void m205013k(InterfaceC21034d interfaceC21034d) {
        this.f187580d = new WeakReference<>(interfaceC21034d);
    }

    /* JADX INFO: renamed from: l */
    public void m205014l() {
        this.f187578b = null;
        this.f187579c = null;
        this.f187580d = null;
        this.f187581e = null;
        this.f187582f = null;
        ValueAnimator valueAnimator = this.f187577a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f187577a.cancel();
        }
        this.f187577a = null;
    }

    /* JADX INFO: renamed from: m */
    public void m205015m(String str, String str2) {
        this.f187578b = str;
        this.f187579c = str2;
    }

    /* JADX INFO: renamed from: n */
    public final void m205016n() {
        if (this.f187577a != null) {
            return;
        }
        m205017o();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 60.0f);
        this.f187577a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setStartDelay(f187574h);
        this.f187577a.setDuration(f187573g * 2);
        this.f187577a.addUpdateListener(new C21031a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, -15.0f, 0.0f, 15.0f, 0.0f, -15.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(f187575i).setStartDelay((f187573g * 2) + f187574h);
        valueAnimatorOfFloat2.addUpdateListener(new C21032b());
        gt0.m132160f(valueAnimatorOfFloat2, new Runnable() { // from class: l.u600
            @Override // java.lang.Runnable
            public final void run() {
                this.f177703a.m205011i();
            }
        }).start();
        gt0.m132160f(this.f187577a, new Runnable() { // from class: l.v600
            @Override // java.lang.Runnable
            public final void run() {
                this.f182592a.m205012j();
            }
        }).start();
        CoreModule.f18264c.f20373b1.m209842i3();
    }

    /* JADX INFO: renamed from: o */
    public final void m205017o() {
        sfj0.m185601h("e_tickle_popup", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("tooltips_trigger_module", "null"), sfj0.C20032a.m185615h("tooltips_trigger_page", "chat_page"), sfj0.C20032a.m185615h("tooltips_trigger_reason", "guide"), sfj0.C20032a.m185615h("tooltips_type_ui", "overlay"));
    }

    /* JADX INFO: renamed from: p */
    public void m205018p(String str, String str2, FrameLayout frameLayout, View view) {
        if (NullChecker.m82486a(frameLayout.getContext()) && (frameLayout.getContext() instanceof MessagesAct)) {
            if (((MessagesAct) frameLayout.getContext()).mo50158l() instanceof jlz) {
                return;
            }
            if (((MessagesAct) frameLayout.getContext()).mo50158l() instanceof tvz) {
                ((tvz) ((MessagesAct) frameLayout.getContext()).mo50158l()).mo110925V2();
                return;
            }
        }
        if (User.isTeamAccount(str)) {
            return;
        }
        view.setTag(edc0.f93434q, str + str2);
        if (TextUtils.equals(str, this.f187578b) && TextUtils.equals(str2, this.f187579c)) {
            this.f187582f = new WeakReference<>(view);
            AvatarClapAnimView avatarClapAnimViewM205010g = m205010g(frameLayout.getContext());
            if (avatarClapAnimViewM205010g != null) {
                frameLayout.addView(avatarClapAnimViewM205010g, new FrameLayout.LayoutParams(-1, -1));
            }
            jxd0 jxd0Var = CoreModule.f18264c.f20373b1.f193005S;
            Boolean bool = Boolean.TRUE;
            jxd0Var.put(bool);
            CoreModule.f18264c.f20373b1.f193006T.put(bool);
            CoreModule.f18264c.f20373b1.f193007U.put(str);
        }
    }

    public w600() {
    }
}
