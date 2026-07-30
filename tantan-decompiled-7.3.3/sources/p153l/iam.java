package p153l;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import p153l.k3m;

/* JADX INFO: loaded from: classes8.dex */
public interface iam<P extends k3m> {
    @Nullable
    /* JADX INFO: renamed from: C0 */
    Context mo22061C0();

    @Nullable
    default Act act() {
        Activity activityM105506D = bnl0.m105506D(mo22061C0());
        if (activityM105506D instanceof Act) {
            return (Act) activityM105506D;
        }
        return null;
    }

    void destroy();

    /* JADX INFO: renamed from: i1 */
    void mo22064i1(P p);

    View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
