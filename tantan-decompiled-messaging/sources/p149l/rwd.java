package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes3.dex */
public class rwd {

    /* JADX INFO: renamed from: l.rwd$a */
    public class C19806a implements AppBarLayout.OnOffsetChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ft6 f161329a;

        public C19806a(ft6 ft6Var) {
            this.f161329a = ft6Var;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f161329a.mo112613k(i >= 0, appBarLayout.getTotalScrollRange() + i <= 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m181388a(View view, gnc0 gnc0Var, ft6 ft6Var) {
        try {
            if (view instanceof CoordinatorLayout) {
                gnc0Var.mo127123c().mo131887a(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new C19806a(ft6Var));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
