package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import l.xdl0;
import p007l.q0m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface s7m<P extends q0m> {
    @Nullable
    /* JADX INFO: renamed from: C0 */
    Context mo1334C0();

    @Nullable
    default Act act() {
        Object objD = xdl0.D(mo1334C0());
        if (objD instanceof Act) {
            return (Act) objD;
        }
        return null;
    }

    void destroy();

    /* JADX INFO: renamed from: i1 */
    void mo1337i1(P p);

    View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
