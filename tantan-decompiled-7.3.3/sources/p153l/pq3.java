package p153l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzCallState;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.video.VideoBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.VoiceBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.voice.view.BuzzVoiceView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class pq3 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    public kcg0 f153622b;

    /* JADX INFO: renamed from: a */
    public final String f153621a = "buzz_voice_view";

    /* JADX INFO: renamed from: c */
    public boolean f153623c = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m173284b(BuzzVoiceView buzzVoiceView, Activity activity, View view) {
        if (NullChecker.m82486a(buzzVoiceView)) {
            if (buzzVoiceView.getParent() instanceof ViewGroup) {
                ((ViewGroup) buzzVoiceView.getParent()).removeView(buzzVoiceView);
            }
            if (!BuzzMediaCallManager.INSTANCE.m48133O() && k8w.INSTANCE.m148752a(activity)) {
                activity.startActivity(VoiceBuzzAct.INSTANCE.m48265a((Act) activity, "voice_call"));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m173286d() {
        Activity activity = NullChecker.m82486a(Act.foreground_()) ? Act.foreground_().f16062a.get() : null;
        if (k8w.INSTANCE.m148752a(activity)) {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View viewFindViewWithTag = viewGroup.findViewWithTag("buzz_voice_view");
            if (viewFindViewWithTag instanceof BuzzVoiceView) {
                o1j0.m165649w(R$string.f21009z0);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m173287e() {
        psd0.m173633z(this.f153622b);
        m173289g();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m173288f(BuzzCallState buzzCallState) {
        if (BuzzMediaCallManager.INSTANCE.m48133O()) {
            m173286d();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m173289g() {
        if (l51.m152884D()) {
            m173286d();
        } else {
            l51.m152887G(new Runnable() { // from class: l.oq3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148541a.m173286d();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public void m173290h() {
        this.f153623c = true;
        m173292j();
    }

    /* JADX INFO: renamed from: i */
    public void m173291i() {
        this.f153623c = false;
        psd0.m173633z(this.f153622b);
    }

    /* JADX INFO: renamed from: j */
    public void m173292j() {
        psd0.m173633z(this.f153622b);
        this.f153622b = BuzzMediaCallManager.INSTANCE.m48173y().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.nq3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143167a.m173288f((BuzzCallState) obj);
            }
        }));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull final Activity activity) {
        if (this.f153623c) {
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            if (buzzMediaCallManager.m48139U()) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View viewFindViewWithTag = viewGroup.findViewWithTag("buzz_voice_view");
            if ((activity instanceof VoiceBuzzAct) || (activity instanceof VideoBuzzAct) || (activity instanceof MemojiBuzzAct) || buzzMediaCallManager.m48133O() || buzzMediaCallManager.m48139U()) {
                if (NullChecker.m82486a(viewFindViewWithTag)) {
                    viewGroup.removeView(viewFindViewWithTag);
                }
            } else {
                if (NullChecker.m82486a(viewFindViewWithTag)) {
                    return;
                }
                final BuzzVoiceView buzzVoiceView = new BuzzVoiceView(activity.getApplicationContext());
                buzzVoiceView.setOnClickListener(new View.OnClickListener() { // from class: l.mq3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pq3.m173284b(buzzVoiceView, activity, view);
                    }
                });
                buzzVoiceView.setTag("buzz_voice_view");
                if (activity instanceof Act) {
                    ((Act) activity).addSwipeBackListener(new C19417a(buzzVoiceView));
                }
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                if (viewGroup instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
                    layoutParams2.gravity = 8388613;
                    layoutParams2.topMargin = qa00.f156294G + bnl0.m105511F0();
                    layoutParams = layoutParams2;
                }
                viewGroup.addView(buzzVoiceView, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: l.pq3$a */
    public class C19417a implements ujh0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BuzzVoiceView f153624a;

        public C19417a(BuzzVoiceView buzzVoiceView) {
            this.f153624a = buzzVoiceView;
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            this.f153624a.setVisibility(8);
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
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
