package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes3.dex */
public class fyd {

    /* JADX INFO: renamed from: l.fyd$a */
    public class C17094a implements AppBarLayout.OnOffsetChangedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ iu6 f101367a;

        public C17094a(iu6 iu6Var) {
            this.f101367a = iu6Var;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            this.f101367a.mo142177k(i >= 0, appBarLayout.getTotalScrollRange() + i <= 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m128079a(View view, lvc0 lvc0Var, iu6 iu6Var) {
        try {
            if (view instanceof CoordinatorLayout) {
                lvc0Var.mo155985c().mo160260a(false);
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new C17094a(iu6Var));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
