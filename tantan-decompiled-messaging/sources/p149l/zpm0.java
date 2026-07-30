package p149l;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p046p1.mobile.putong.core.newui.voicecall.VoiceCallView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class zpm0 {

    /* JADX INFO: renamed from: a */
    public final btm0 f204267a;

    public zpm0(btm0 btm0Var) {
        this.f204267a = btm0Var;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m219696b(Activity activity, View view) {
        this.f204267a.m103881p(activity);
    }

    /* JADX INFO: renamed from: c */
    public void m219697c(int i, Activity activity, String str) {
        if (activity == null || i == 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View viewFindViewWithTag = viewGroup.findViewWithTag("voice_call_view");
        if (i == 1) {
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                viewGroup.removeView(viewFindViewWithTag);
            }
        } else {
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                return;
            }
            m219698d(activity, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m219698d(final Activity activity, String str) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (TextUtils.isEmpty(str) || (activity instanceof VoiceCallAct)) {
            return;
        }
        VoiceCallView voiceCallView = new VoiceCallView(activity.getApplicationContext());
        voiceCallView.setOnClickListener(new View.OnClickListener() { // from class: l.ypm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199468a.m219696b(activity, view);
            }
        });
        voiceCallView.setTag("voice_call_view");
        if (activity instanceof Act) {
            ((Act) activity).addSwipeBackListener(new C21754a(voiceCallView));
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 5;
            layoutParams2.topMargin = t100.m186890d(63.0f) + xdl0.m208331F0();
            layoutParams = layoutParams2;
        }
        viewGroup.addView(voiceCallView, layoutParams);
    }

    /* JADX INFO: renamed from: l.zpm0$a */
    public class C21754a implements mbh0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VoiceCallView f204268a;

        public C21754a(VoiceCallView voiceCallView) {
            this.f204268a = voiceCallView;
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            this.f204268a.setVisibility(8);
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
}
