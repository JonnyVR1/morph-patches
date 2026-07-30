package p153l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class pdj0 implements iam<odj0> {

    /* JADX INFO: renamed from: a */
    public odj0 f151806a;

    /* JADX INFO: renamed from: b */
    public PutongAct f151807b;

    public pdj0(PutongAct putongAct) {
        this.f151807b = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f151807b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(odj0 odj0Var) {
        this.f151806a = odj0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m171882b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m171883c(this.f151807b.getCurrentFocus(), motionEvent)) {
            this.f151807b.hideInput();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m171883c(View view, MotionEvent motionEvent) {
        if (!NullChecker.m82486a(view) || !(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return motionEvent.getX() <= ((float) i) || motionEvent.getX() >= ((float) (view.getWidth() + i)) || motionEvent.getY() <= ((float) i2) || motionEvent.getY() >= ((float) (view.getHeight() + i2));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f151807b.fragmentManager().m2555h0(R.id.content) != null) {
            return null;
        }
        odj0 odj0Var = this.f151806a;
        this.f151807b.fragmentManager().m2568m().m2812s(R.id.content, TopicVoteAggregationFeedFrag.m67357M4(odj0Var.f146914b, odj0Var.f146915c, odj0Var.f146916d, odj0Var.f146918f)).mo2708i();
        this.f151807b.fragmentManager().m2546e0();
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
