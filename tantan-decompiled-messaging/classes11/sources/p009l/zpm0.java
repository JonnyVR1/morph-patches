package p009l;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p000p1.mobile.putong.core.newui.voicecall.VoiceCallView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.mbh0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zpm0 {

    /* JADX INFO: renamed from: a */
    public final btm0 f23825a;

    public zpm0(btm0 btm0Var) {
        this.f23825a = btm0Var;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m25912b(Activity activity, View view) {
        this.f23825a.m12246p(activity);
    }

    /* JADX INFO: renamed from: c */
    public void m25913c(int i, Activity activity, String str) {
        if (activity == null || i == 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View viewFindViewWithTag = viewGroup.findViewWithTag("voice_call_view");
        if (i == 1) {
            if (NullChecker.a(viewFindViewWithTag)) {
                viewGroup.removeView(viewFindViewWithTag);
            }
        } else {
            if (NullChecker.a(viewFindViewWithTag)) {
                return;
            }
            m25914d(activity, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m25914d(final Activity activity, String str) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (TextUtils.isEmpty(str) || (activity instanceof VoiceCallAct)) {
            return;
        }
        VoiceCallView voiceCallView = new VoiceCallView(activity.getApplicationContext());
        voiceCallView.setOnClickListener(new View.OnClickListener() { // from class: l.ypm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23192a.m25912b(activity, view);
            }
        });
        voiceCallView.setTag("voice_call_view");
        if (activity instanceof Act) {
            ((Act) activity).addSwipeBackListener(new C1372a(voiceCallView));
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 5;
            layoutParams2.topMargin = t100.d(63.0f) + xdl0.F0();
            layoutParams = layoutParams2;
        }
        viewGroup.addView(voiceCallView, layoutParams);
    }

    /* JADX INFO: renamed from: l.zpm0$a */
    public class C1372a implements mbh0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VoiceCallView f23826a;

        public C1372a(VoiceCallView voiceCallView) {
            this.f23826a = voiceCallView;
        }

        /* JADX INFO: renamed from: O */
        public void m25917O() {
            this.f23826a.setVisibility(8);
        }

        /* JADX INFO: renamed from: E0 */
        public void m25916E0() {
        }

        /* JADX INFO: renamed from: Z */
        public void m25918Z() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m25915D0(boolean z, float f, int i) {
        }
    }
}
