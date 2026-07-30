package immomo.com.mklibrary.core.base.p115ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import p149l.l5c0;
import p149l.wul;
import p149l.y6c0;

/* JADX INFO: loaded from: classes2.dex */
public class MKBaseFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    protected MKWebView f63217A;

    /* JADX INFO: renamed from: z */
    private wul f63218z;

    @LayoutRes
    /* JADX INFO: renamed from: V3 */
    public int m86994V3() {
        return y6c0.f196543a;
    }

    /* JADX INFO: renamed from: W3 */
    public wul m86995W3() {
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public String m86996X3() {
        return "";
    }

    /* JADX INFO: renamed from: Y3 */
    public void m86997Y3(View view) {
        this.f63217A = (MKWebView) view.findViewById(l5c0.f126110c);
        wul wulVarM86995W3 = m86995W3();
        this.f63218z = wulVarM86995W3;
        if (wulVarM86995W3 != null) {
            wulVarM86995W3.mo87114k(m86996X3(), "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(m86994V3(), viewGroup, false);
        m86997Y3(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        wul wulVar = this.f63218z;
        if (wulVar != null) {
            wulVar.mo87110d();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        wul wulVar = this.f63218z;
        if (wulVar != null) {
            wulVar.mo87116m();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        wul wulVar = this.f63218z;
        if (wulVar != null) {
            wulVar.mo87117n();
        }
    }
}
