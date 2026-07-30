package p003l;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rwd {

    /* JADX INFO: renamed from: l.rwd$a */
    public class C0521a implements AppBarLayout.OnOffsetChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ft6 f7108a;

        public C0521a(ft6 ft6Var) {
            this.f7108a = ft6Var;
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f7108a.mo3623k(i >= 0, appBarLayout.getTotalScrollRange() + i <= 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m7404a(View view, gnc0 gnc0Var, ft6 ft6Var) {
        try {
            if (view instanceof CoordinatorLayout) {
                gnc0Var.mo4652c().mo4989a(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    AppBarLayout childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        childAt.addOnOffsetChangedListener(new C0521a(ft6Var));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
