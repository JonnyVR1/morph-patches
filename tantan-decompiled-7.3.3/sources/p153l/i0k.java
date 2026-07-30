package p153l;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class i0k {

    /* JADX INFO: renamed from: a */
    public static final int f112378a = qa00.m175859d(14.0f);

    /* JADX INFO: renamed from: b */
    public static final int f112379b = qa00.m175859d(16.0f);

    /* JADX INFO: renamed from: l.i0k$a */
    public class C17610a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f112380a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f112381b;

        public C17610a(int i, VDraweeView vDraweeView) {
            this.f112380a = i;
            this.f112381b = vDraweeView;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null) {
                return;
            }
            int width = (int) (this.f112380a * (qimVar.getWidth() / qimVar.getHeight()));
            ViewGroup.LayoutParams layoutParams = this.f112381b.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = this.f112380a;
            this.f112381b.setLayoutParams(layoutParams);
            this.f112381b.getHierarchy().m207062w(h1e0.f107444a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static View m137974a(ViewPager viewPager, int i) {
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
    public static int[] m137975b(View view) {
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
    public static void m137976c(String str, VDraweeView vDraweeView, int i) {
        izs.m142871v("context_livingAct", vDraweeView, str, i * 3, i, false, false, false, new C17610a(i, vDraweeView));
    }
}
