package p003l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.video.VideoBuzzAct;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.voice.VoiceBuzzAct;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.voice.view.BuzzVoiceView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzCallState;
import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.lsi0;
import l.m6w;
import l.mbh0;
import l.mkd0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class pp3 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    public c4g0 f6477b;

    /* JADX INFO: renamed from: a */
    public final String f6476a = "buzz_voice_view";

    /* JADX INFO: renamed from: c */
    public boolean f6478c = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6891b(BuzzVoiceView buzzVoiceView, Activity activity, View view) {
        if (NullChecker.a(buzzVoiceView)) {
            if (buzzVoiceView.getParent() instanceof ViewGroup) {
                ((ViewGroup) buzzVoiceView.getParent()).removeView(buzzVoiceView);
            }
            if (!BuzzMediaCallManager.INSTANCE.O() && m6w.INSTANCE.a(activity)) {
                activity.startActivity(VoiceBuzzAct.INSTANCE.m101a((Act) activity, "voice_call"));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6893d() {
        Activity activity = NullChecker.a(Act.foreground_()) ? (Activity) Act.foreground_().a.get() : null;
        if (m6w.INSTANCE.a(activity)) {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View viewFindViewWithTag = viewGroup.findViewWithTag("buzz_voice_view");
            if (viewFindViewWithTag instanceof BuzzVoiceView) {
                lsi0.w(R.string.z0);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m6894e() {
        mkd0.z(this.f6477b);
        m6896g();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6895f(BuzzCallState buzzCallState) {
        if (BuzzMediaCallManager.INSTANCE.O()) {
            m6893d();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6896g() {
        if (e51.D()) {
            m6893d();
        } else {
            e51.G(new Runnable() { // from class: l.op3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6192a.m6893d();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public void m6897h() {
        this.f6478c = true;
        m6899j();
    }

    /* JADX INFO: renamed from: i */
    public void m6898i() {
        this.f6478c = false;
        mkd0.z(this.f6477b);
    }

    /* JADX INFO: renamed from: j */
    public void m6899j() {
        mkd0.z(this.f6477b);
        this.f6477b = BuzzMediaCallManager.INSTANCE.y().observeOn(jo0.m5414a()).subscribe((m250) mkd0.G(new e30() { // from class: l.np3
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5942a.m6895f((BuzzCallState) obj);
            }
        }));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull final Activity activity) {
        if (this.f6478c) {
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            if (buzzMediaCallManager.U()) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View viewFindViewWithTag = viewGroup.findViewWithTag("buzz_voice_view");
            if ((activity instanceof VoiceBuzzAct) || (activity instanceof VideoBuzzAct) || (activity instanceof MemojiBuzzAct) || buzzMediaCallManager.O() || buzzMediaCallManager.U()) {
                if (NullChecker.a(viewFindViewWithTag)) {
                    viewGroup.removeView(viewFindViewWithTag);
                }
            } else {
                if (NullChecker.a(viewFindViewWithTag)) {
                    return;
                }
                final BuzzVoiceView buzzVoiceView = new BuzzVoiceView(activity.getApplicationContext());
                buzzVoiceView.setOnClickListener(new View.OnClickListener() { // from class: l.mp3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pp3.m6891b(buzzVoiceView, activity, view);
                    }
                });
                buzzVoiceView.setTag("buzz_voice_view");
                if (activity instanceof Act) {
                    ((Act) activity).addSwipeBackListener(new C0477a(buzzVoiceView));
                }
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                if (viewGroup instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
                    layoutParams2.gravity = 8388613;
                    layoutParams2.topMargin = t100.G + xdl0.F0();
                    layoutParams = layoutParams2;
                }
                viewGroup.addView(buzzVoiceView, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: l.pp3$a */
    public class C0477a implements mbh0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BuzzVoiceView f6479a;

        public C0477a(BuzzVoiceView buzzVoiceView) {
            this.f6479a = buzzVoiceView;
        }

        /* JADX INFO: renamed from: O */
        public void m6902O() {
            this.f6479a.setVisibility(8);
        }

        /* JADX INFO: renamed from: E0 */
        public void m6901E0() {
        }

        /* JADX INFO: renamed from: Z */
        public void m6903Z() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m6900D0(boolean z, float f, int i) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
