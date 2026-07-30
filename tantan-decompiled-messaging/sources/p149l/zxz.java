package p149l;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.AvatarClapAnimView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class zxz {

    /* JADX INFO: renamed from: g */
    public static long f205580g = 1100;

    /* JADX INFO: renamed from: h */
    public static long f205581h = 200;

    /* JADX INFO: renamed from: i */
    public static long f205582i = 900;

    /* JADX INFO: renamed from: j */
    public static long f205583j = 300;

    /* JADX INFO: renamed from: a */
    public ValueAnimator f205584a;

    /* JADX INFO: renamed from: b */
    public String f205585b;

    /* JADX INFO: renamed from: c */
    public String f205586c;

    /* JADX INFO: renamed from: d */
    public WeakReference<InterfaceC21817d> f205587d;

    /* JADX INFO: renamed from: e */
    public WeakReference<AvatarClapAnimView> f205588e;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f205589f;

    /* JADX INFO: renamed from: l.zxz$a */
    public class C21814a implements ValueAnimator.AnimatorUpdateListener {
        public C21814a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (fFloatValue > 30.0f) {
                fFloatValue -= 30.0f;
            }
            if (TextUtils.isEmpty(zxz.this.f205585b) || TextUtils.isEmpty(zxz.this.f205586c) || !NullChecker.m81303a(zxz.this.f205587d) || !NullChecker.m81303a(zxz.this.f205587d.get())) {
                return;
            }
            ((InterfaceC21817d) zxz.this.f205587d.get()).mo41917a(false, fFloatValue, zxz.this.f205585b, zxz.this.f205586c);
        }
    }

    /* JADX INFO: renamed from: l.zxz$b */
    public class C21815b implements ValueAnimator.AnimatorUpdateListener {
        public C21815b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (zxz.this.f205589f == null || zxz.this.f205589f.get() == null) {
                return;
            }
            View view = (View) zxz.this.f205589f.get();
            if (view.getTag(y4c0.f196199q) instanceof String) {
                if (TextUtils.equals((String) view.getTag(y4c0.f196199q), zxz.this.f205585b + zxz.this.f205586c)) {
                    view.setRotation(fFloatValue);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.zxz$c */
    public static class C21816c {

        /* JADX INFO: renamed from: a */
        public static final zxz f205592a = new zxz();
    }

    /* JADX INFO: renamed from: l.zxz$d */
    public interface InterfaceC21817d {
        /* JADX INFO: renamed from: a */
        void mo41917a(boolean z, float f, String str, String str2);
    }

    /* JADX INFO: renamed from: h */
    public static zxz m220864h() {
        return C21816c.f205592a;
    }

    /* JADX INFO: renamed from: g */
    public final AvatarClapAnimView m220865g(Context context) {
        if (this.f205588e == null) {
            AvatarClapAnimView avatarClapAnimView = new AvatarClapAnimView(context);
            m220868k(avatarClapAnimView);
            this.f205588e = new WeakReference<>(avatarClapAnimView);
            m220871n();
        }
        AvatarClapAnimView avatarClapAnimView2 = this.f205588e.get();
        if (NullChecker.m81303a(avatarClapAnimView2) && (avatarClapAnimView2.getParent() instanceof ViewGroup)) {
            ((ViewGroup) avatarClapAnimView2.getParent()).removeView(avatarClapAnimView2);
        }
        return avatarClapAnimView2;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m220866i() {
        CoreModule.f17545c.f19642f0.m33041mh(this.f205585b);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m220867j() {
        WeakReference<AvatarClapAnimView> weakReference = this.f205588e;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        bt0.m103744q(this.f205588e.get(), "alpha", 1.0f, 0.0f).setDuration(f205583j).start();
    }

    /* JADX INFO: renamed from: k */
    public final void m220868k(InterfaceC21817d interfaceC21817d) {
        this.f205587d = new WeakReference<>(interfaceC21817d);
    }

    /* JADX INFO: renamed from: l */
    public void m220869l() {
        this.f205585b = null;
        this.f205586c = null;
        this.f205587d = null;
        this.f205588e = null;
        this.f205589f = null;
        ValueAnimator valueAnimator = this.f205584a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f205584a.cancel();
        }
        this.f205584a = null;
    }

    /* JADX INFO: renamed from: m */
    public void m220870m(String str, String str2) {
        this.f205585b = str;
        this.f205586c = str2;
    }

    /* JADX INFO: renamed from: n */
    public final void m220871n() {
        if (this.f205584a != null) {
            return;
        }
        m220872o();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 60.0f);
        this.f205584a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setStartDelay(f205581h);
        this.f205584a.setDuration(f205580g * 2);
        this.f205584a.addUpdateListener(new C21814a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, -15.0f, 0.0f, 15.0f, 0.0f, -15.0f, 0.0f);
        valueAnimatorOfFloat2.setDuration(f205582i).setStartDelay((f205580g * 2) + f205581h);
        valueAnimatorOfFloat2.addUpdateListener(new C21815b());
        bt0.m103733f(valueAnimatorOfFloat2, new Runnable() { // from class: l.xxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f194979a.m220866i();
            }
        }).start();
        bt0.m103733f(this.f205584a, new Runnable() { // from class: l.yxz
            @Override // java.lang.Runnable
            public final void run() {
                this.f200683a.m220867j();
            }
        }).start();
        CoreModule.f17545c.f19631b1.m145039i3();
    }

    /* JADX INFO: renamed from: o */
    public final void m220872o() {
        o6j0.m162864h("e_tickle_popup", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("tooltips_trigger_module", "null"), o6j0.C18854a.m162878h("tooltips_trigger_page", "chat_page"), o6j0.C18854a.m162878h("tooltips_trigger_reason", "guide"), o6j0.C18854a.m162878h("tooltips_type_ui", "overlay"));
    }

    /* JADX INFO: renamed from: p */
    public void m220873p(String str, String str2, FrameLayout frameLayout, View view) {
        if (NullChecker.m81303a(frameLayout.getContext()) && (frameLayout.getContext() instanceof MessagesAct)) {
            if (((MessagesAct) frameLayout.getContext()).mo48974l() instanceof mcz) {
                return;
            }
            if (((MessagesAct) frameLayout.getContext()).mo48974l() instanceof wmz) {
                ((wmz) ((MessagesAct) frameLayout.getContext()).mo48974l()).mo120719V2();
                return;
            }
        }
        if (User.isTeamAccount(str)) {
            return;
        }
        view.setTag(y4c0.f196199q, str + str2);
        if (TextUtils.equals(str, this.f205585b) && TextUtils.equals(str2, this.f205586c)) {
            this.f205589f = new WeakReference<>(view);
            AvatarClapAnimView avatarClapAnimViewM220865g = m220865g(frameLayout.getContext());
            if (avatarClapAnimViewM220865g != null) {
                frameLayout.addView(avatarClapAnimViewM220865g, new FrameLayout.LayoutParams(-1, -1));
            }
            hpd0 hpd0Var = CoreModule.f17545c.f19631b1.f121927S;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            CoreModule.f17545c.f19631b1.f121928T.put(bool);
            CoreModule.f17545c.f19631b1.f121929U.put(str);
        }
    }

    public zxz() {
    }
}
