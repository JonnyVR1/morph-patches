package p149l;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzCallState;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.media.BuzzMediaCallManager;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.memoji.MemojiBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.video.VideoBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.VoiceBuzzAct;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.voice.view.BuzzVoiceView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class pp3 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    public c4g0 f150615b;

    /* JADX INFO: renamed from: a */
    public final String f150614a = "buzz_voice_view";

    /* JADX INFO: renamed from: c */
    public boolean f150616c = false;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m170698b(BuzzVoiceView buzzVoiceView, Activity activity, View view) {
        if (NullChecker.m81303a(buzzVoiceView)) {
            if (buzzVoiceView.getParent() instanceof ViewGroup) {
                ((ViewGroup) buzzVoiceView.getParent()).removeView(buzzVoiceView);
            }
            if (!BuzzMediaCallManager.INSTANCE.m46950O() && m6w.INSTANCE.m153296a(activity)) {
                activity.startActivity(VoiceBuzzAct.INSTANCE.m47082a((Act) activity, "voice_call"));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m170700d() {
        Activity activity = NullChecker.m81303a(Act.foreground_()) ? Act.foreground_().f15343a.get() : null;
        if (m6w.INSTANCE.m153296a(activity)) {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View viewFindViewWithTag = viewGroup.findViewWithTag("buzz_voice_view");
            if (viewFindViewWithTag instanceof BuzzVoiceView) {
                lsi0.m151593w(R$string.f20267z0);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m170701e() {
        mkd0.m154992z(this.f150615b);
        m170703g();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m170702f(BuzzCallState buzzCallState) {
        if (BuzzMediaCallManager.INSTANCE.m46950O()) {
            m170700d();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m170703g() {
        if (e51.m114739D()) {
            m170700d();
        } else {
            e51.m114742G(new Runnable() { // from class: l.op3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144948a.m170700d();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public void m170704h() {
        this.f150616c = true;
        m170706j();
    }

    /* JADX INFO: renamed from: i */
    public void m170705i() {
        this.f150616c = false;
        mkd0.m154992z(this.f150615b);
    }

    /* JADX INFO: renamed from: j */
    public void m170706j() {
        mkd0.m154992z(this.f150615b);
        this.f150615b = BuzzMediaCallManager.INSTANCE.m46990y().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.np3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139908a.m170702f((BuzzCallState) obj);
            }
        }));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull final Activity activity) {
        if (this.f150616c) {
            BuzzMediaCallManager buzzMediaCallManager = BuzzMediaCallManager.INSTANCE;
            if (buzzMediaCallManager.m46956U()) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            View viewFindViewWithTag = viewGroup.findViewWithTag("buzz_voice_view");
            if ((activity instanceof VoiceBuzzAct) || (activity instanceof VideoBuzzAct) || (activity instanceof MemojiBuzzAct) || buzzMediaCallManager.m46950O() || buzzMediaCallManager.m46956U()) {
                if (NullChecker.m81303a(viewFindViewWithTag)) {
                    viewGroup.removeView(viewFindViewWithTag);
                }
            } else {
                if (NullChecker.m81303a(viewFindViewWithTag)) {
                    return;
                }
                final BuzzVoiceView buzzVoiceView = new BuzzVoiceView(activity.getApplicationContext());
                buzzVoiceView.setOnClickListener(new View.OnClickListener() { // from class: l.mp3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        pp3.m170698b(buzzVoiceView, activity, view);
                    }
                });
                buzzVoiceView.setTag("buzz_voice_view");
                if (activity instanceof Act) {
                    ((Act) activity).addSwipeBackListener(new C19308a(buzzVoiceView));
                }
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                if (viewGroup instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
                    layoutParams2.gravity = 8388613;
                    layoutParams2.topMargin = t100.f167232G + xdl0.m208331F0();
                    layoutParams = layoutParams2;
                }
                viewGroup.addView(buzzVoiceView, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: l.pp3$a */
    public class C19308a implements mbh0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BuzzVoiceView f150617a;

        public C19308a(BuzzVoiceView buzzVoiceView) {
            this.f150617a = buzzVoiceView;
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            this.f150617a.setVisibility(8);
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
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
