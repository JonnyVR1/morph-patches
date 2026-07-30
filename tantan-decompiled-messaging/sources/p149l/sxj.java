package p149l;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class sxj {

    /* JADX INFO: renamed from: a */
    public static final int f166797a = t100.m186890d(14.0f);

    /* JADX INFO: renamed from: b */
    public static final int f166798b = t100.m186890d(16.0f);

    /* JADX INFO: renamed from: l.sxj$a */
    public class C20062a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f166799a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f166800b;

        public C20062a(int i, VDraweeView vDraweeView) {
            this.f166799a = i;
            this.f166800b = vDraweeView;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int width = (int) (this.f166799a * (ngmVar.getWidth() / ngmVar.getHeight()));
            ViewGroup.LayoutParams layoutParams = this.f166800b.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = this.f166799a;
            this.f166800b.setLayoutParams(layoutParams);
            this.f166800b.getHierarchy().m112076w(ftd0.f99177a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m186440a(ViewPager viewPager, int i) {
        int childCount = viewPager.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewPager.getChildAt(i2);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m186441b(View view) {
        int[] iArr = new int[2];
        if (view == null) {
            return iArr;
        }
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + (view.getWidth() / 2);
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public static void m186442c(String str, VDraweeView vDraweeView, int i) {
        hxs.m133409v("context_livingAct", vDraweeView, str, i * 3, i, false, false, false, new C20062a(i, vDraweeView));
    }
}
