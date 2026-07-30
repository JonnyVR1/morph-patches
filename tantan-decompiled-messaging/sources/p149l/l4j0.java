package p149l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class l4j0 implements s7m<k4j0> {

    /* JADX INFO: renamed from: a */
    public k4j0 f126038a;

    /* JADX INFO: renamed from: b */
    public PutongAct f126039b;

    public l4j0(PutongAct putongAct) {
        this.f126039b = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f126039b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(k4j0 k4j0Var) {
        this.f126038a = k4j0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m148448b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m148449c(this.f126039b.getCurrentFocus(), motionEvent)) {
            this.f126039b.hideInput();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m148449c(View view, MotionEvent motionEvent) {
        if (!NullChecker.m81303a(view) || !(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return motionEvent.getX() <= ((float) i) || motionEvent.getX() >= ((float) (view.getWidth() + i)) || motionEvent.getY() <= ((float) i2) || motionEvent.getY() >= ((float) (view.getHeight() + i2));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f126039b.fragmentManager().m2554h0(R.id.content) != null) {
            return null;
        }
        k4j0 k4j0Var = this.f126038a;
        this.f126039b.fragmentManager().m2567m().m2811s(R.id.content, TopicVoteAggregationFeedFrag.m66174M4(k4j0Var.f121099b, k4j0Var.f121100c, k4j0Var.f121101d, k4j0Var.f121103f)).mo2707i();
        this.f126039b.fragmentManager().m2545e0();
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
