package p153l;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.voicecall.VoiceCallAct;
import com.p051p1.mobile.putong.core.newui.voicecall.VoiceCallView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class dzm0 {

    /* JADX INFO: renamed from: a */
    public final f2n0 f91370a;

    public dzm0(f2n0 f2n0Var) {
        this.f91370a = f2n0Var;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m118752b(Activity activity, View view) {
        this.f91370a.m123645p(activity);
    }

    /* JADX INFO: renamed from: c */
    public void m118753c(int i, Activity activity, String str) {
        if (activity == null || i == 0) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        View viewFindViewWithTag = viewGroup.findViewWithTag("voice_call_view");
        if (i == 1) {
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                viewGroup.removeView(viewFindViewWithTag);
            }
        } else {
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                return;
            }
            m118754d(activity, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m118754d(final Activity activity, String str) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (TextUtils.isEmpty(str) || (activity instanceof VoiceCallAct)) {
            return;
        }
        VoiceCallView voiceCallView = new VoiceCallView(activity.getApplicationContext());
        voiceCallView.setOnClickListener(new View.OnClickListener() { // from class: l.czm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84485a.m118752b(activity, view);
            }
        });
        voiceCallView.setTag("voice_call_view");
        if (activity instanceof Act) {
            ((Act) activity).addSwipeBackListener(new C16670a(voiceCallView));
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 5;
            layoutParams2.topMargin = qa00.m175859d(63.0f) + bnl0.m105511F0();
            layoutParams = layoutParams2;
        }
        viewGroup.addView(voiceCallView, layoutParams);
    }

    /* JADX INFO: renamed from: l.dzm0$a */
    public class C16670a implements ujh0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ VoiceCallView f91371a;

        public C16670a(VoiceCallView voiceCallView) {
            this.f91371a = voiceCallView;
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            this.f91371a.setVisibility(8);
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
}
