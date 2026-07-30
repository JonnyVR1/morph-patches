package p153l;

import android.annotation.SuppressLint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class gqp0 {

    /* JADX INFO: renamed from: a */
    public static final int f105714a = qa00.m175859d(14.0f);

    /* JADX INFO: renamed from: b */
    public static final int f105715b = qa00.m175859d(16.0f);

    /* JADX INFO: renamed from: l.gqp0$a */
    public class C17275a extends fn2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f105716a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f105717b;

        public C17275a(int i, VDraweeView vDraweeView) {
            this.f105716a = i;
            this.f105717b = vDraweeView;
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            if (qimVar == null) {
                return;
            }
            int width = (int) (this.f105716a * (qimVar.getWidth() / qimVar.getHeight()));
            ViewGroup.LayoutParams layoutParams = this.f105717b.getLayoutParams();
            layoutParams.width = width + this.f105717b.getPaddingLeft() + this.f105717b.getPaddingRight();
            layoutParams.height = this.f105716a;
            this.f105717b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m131414a(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        popupWindow.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Pair<View, Integer> m131415b(View view, int[] iArr, String str) {
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(tec0.f173547N3, (ViewGroup) null);
        int i = 1;
        boolean z = iArr[1] > bnl0.m105588w0() / 2;
        TextView textView = (TextView) viewInflate.findViewById(hdc0.f108897a2);
        textView.setText(str);
        int iM175859d = qa00.m175859d(14.0f);
        int iM175859d2 = qa00.m175859d(11.0f);
        int iM175859d3 = qa00.m175859d(23.0f);
        int iM175859d4 = qa00.m175859d(20.0f);
        int iM175859d5 = qa00.m175859d(8.0f);
        int iM175859d6 = qa00.m175859d(172.0f) / 2;
        int width = view.getWidth() / 2;
        int iM105592y0 = bnl0.m105592y0();
        if (z) {
            textView.setPadding(iM175859d, iM175859d2, iM175859d, iM175859d3);
            int i2 = iArr[0];
            if ((i2 + width) - iM175859d5 < iM175859d6) {
                textView.setBackgroundResource(lbc0.f130968W5);
                i = 4;
            } else if (((iM105592y0 - i2) - width) - iM175859d5 < iM175859d6) {
                textView.setBackgroundResource(lbc0.f130982Y5);
                i = 5;
            } else {
                textView.setBackgroundResource(lbc0.f130954U5);
            }
        } else {
            textView.setPadding(iM175859d, iM175859d4, iM175859d, iM175859d);
            int i3 = iArr[0];
            if ((i3 + width) - iM175859d5 < iM175859d6) {
                textView.setBackgroundResource(lbc0.f130975X5);
                i = 2;
            } else if (((iM105592y0 - i3) - width) - iM175859d5 < iM175859d6) {
                textView.setBackgroundResource(lbc0.f130989Z5);
                i = 3;
            } else {
                textView.setBackgroundResource(lbc0.f130961V5);
                i = 0;
            }
        }
        return new Pair<>(viewInflate, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public static void m131416c(String str, VDraweeView vDraweeView, int i) {
        uqb0.f180374G.m127117M0(vDraweeView, str, new C17275a(i, vDraweeView));
    }

    /* JADX INFO: renamed from: d */
    public static void m131417d(View view, int[] iArr, PopupWindow popupWindow, int i) {
        int measuredWidth = popupWindow.getContentView().getMeasuredWidth();
        int measuredHeight = popupWindow.getContentView().getMeasuredHeight();
        int iM175859d = qa00.m175859d(2.0f);
        int iM175859d2 = qa00.m175859d(4.0f);
        if (i == 0) {
            popupWindow.showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2), iArr[1] + view.getHeight() + iM175859d);
            return;
        }
        if (i == 1) {
            popupWindow.showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2), (iArr[1] - measuredHeight) - iM175859d);
            return;
        }
        if (i == 2) {
            popupWindow.showAtLocation(view, 0, iArr[0] - iM175859d2, iArr[1] + view.getHeight() + iM175859d);
            return;
        }
        if (i == 3) {
            popupWindow.showAtLocation(view, 0, ((iArr[0] + view.getWidth()) - measuredWidth) + iM175859d2, iArr[1] + view.getHeight() + iM175859d);
        } else if (i == 4) {
            popupWindow.showAtLocation(view, 0, iArr[0] - iM175859d2, (iArr[1] - measuredHeight) - iM175859d);
        } else {
            if (i != 5) {
                return;
            }
            popupWindow.showAtLocation(view, 0, ((iArr[0] + view.getWidth()) - measuredWidth) + iM175859d2, (iArr[1] - measuredHeight) - iM175859d);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: e */
    public static void m131418e(View view, String str) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Pair<View, Integer> pairM131415b = m131415b(view, iArr, str);
        final PopupWindow popupWindow = new PopupWindow((View) pairM131415b.first, -2, -2, true);
        popupWindow.getContentView().measure(0, 0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: l.fqp0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return gqp0.m131414a(popupWindow, view2, motionEvent);
            }
        });
        m131417d(view, iArr, popupWindow, ((Integer) pairM131415b.second).intValue());
    }
}
