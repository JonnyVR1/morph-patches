package p149l;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import p149l.q0m;

/* JADX INFO: loaded from: classes8.dex */
public interface s7m<P extends q0m> {
    @Nullable
    /* JADX INFO: renamed from: C0 */
    Context mo21062C0();

    @Nullable
    default Act act() {
        Activity activityM208326D = xdl0.m208326D(mo21062C0());
        if (activityM208326D instanceof Act) {
            return (Act) activityM208326D;
        }
        return null;
    }

    void destroy();

    /* JADX INFO: renamed from: i1 */
    void mo21065i1(P p);

    View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
