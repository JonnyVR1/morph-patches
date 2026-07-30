package p007l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.newui.topic.vote.TopicVoteAggregationFeedFrag;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class l4j0 implements s7m<k4j0> {

    /* JADX INFO: renamed from: a */
    public k4j0 f9879a;

    /* JADX INFO: renamed from: b */
    public PutongAct f9880b;

    public l4j0(PutongAct putongAct) {
        this.f9880b = putongAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11551C0() {
        return this.f9880b;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m11555i1(k4j0 k4j0Var) {
        this.f9879a = k4j0Var;
    }

    /* JADX INFO: renamed from: b */
    public void m11553b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m11554c(this.f9880b.getCurrentFocus(), motionEvent)) {
            this.f9880b.hideInput();
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11554c(View view, MotionEvent motionEvent) {
        if (!NullChecker.a(view) || !(view instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return motionEvent.getX() <= ((float) i) || motionEvent.getX() >= ((float) (view.getWidth() + i)) || motionEvent.getY() <= ((float) i2) || motionEvent.getY() >= ((float) (view.getHeight() + i2));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f9880b.fragmentManager().h0(R.id.content) != null) {
            return null;
        }
        k4j0 k4j0Var = this.f9879a;
        this.f9880b.fragmentManager().m().s(R.id.content, TopicVoteAggregationFeedFrag.m7330M4(k4j0Var.f9605b, k4j0Var.f9606c, k4j0Var.f9607d, k4j0Var.f9609f)).i();
        this.f9880b.fragmentManager().e0();
        return null;
    }

    public void destroy() {
    }
}
