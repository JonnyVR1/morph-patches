package p149l;

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
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class chp0 {

    /* JADX INFO: renamed from: a */
    public static final int f80992a = t100.m186890d(14.0f);

    /* JADX INFO: renamed from: b */
    public static final int f80993b = t100.m186890d(16.0f);

    /* JADX INFO: renamed from: l.chp0$a */
    public class C16157a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f80994a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f80995b;

        public C16157a(int i, VDraweeView vDraweeView) {
            this.f80994a = i;
            this.f80995b = vDraweeView;
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int width = (int) (this.f80994a * (ngmVar.getWidth() / ngmVar.getHeight()));
            ViewGroup.LayoutParams layoutParams = this.f80995b.getLayoutParams();
            layoutParams.width = width + this.f80995b.getPaddingLeft() + this.f80995b.getPaddingRight();
            layoutParams.height = this.f80994a;
            this.f80995b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m106982a(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        popupWindow.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Pair<View, Integer> m106983b(View view, int[] iArr, String str) {
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(o6c0.f142078N3, (ViewGroup) null);
        int i = 1;
        boolean z = iArr[1] > xdl0.m208408w0() / 2;
        TextView textView = (TextView) viewInflate.findViewById(b5c0.f73544a2);
        textView.setText(str);
        int iM186890d = t100.m186890d(14.0f);
        int iM186890d2 = t100.m186890d(11.0f);
        int iM186890d3 = t100.m186890d(23.0f);
        int iM186890d4 = t100.m186890d(20.0f);
        int iM186890d5 = t100.m186890d(8.0f);
        int iM186890d6 = t100.m186890d(172.0f) / 2;
        int width = view.getWidth() / 2;
        int iM208412y0 = xdl0.m208412y0();
        if (z) {
            textView.setPadding(iM186890d, iM186890d2, iM186890d, iM186890d3);
            int i2 = iArr[0];
            if ((i2 + width) - iM186890d5 < iM186890d6) {
                textView.setBackgroundResource(f3c0.f94450W5);
                i = 4;
            } else if (((iM208412y0 - i2) - width) - iM186890d5 < iM186890d6) {
                textView.setBackgroundResource(f3c0.f94464Y5);
                i = 5;
            } else {
                textView.setBackgroundResource(f3c0.f94436U5);
            }
        } else {
            textView.setPadding(iM186890d, iM186890d4, iM186890d, iM186890d);
            int i3 = iArr[0];
            if ((i3 + width) - iM186890d5 < iM186890d6) {
                textView.setBackgroundResource(f3c0.f94457X5);
                i = 2;
            } else if (((iM208412y0 - i3) - width) - iM186890d5 < iM186890d6) {
                textView.setBackgroundResource(f3c0.f94471Z5);
                i = 3;
            } else {
                textView.setBackgroundResource(f3c0.f94443V5);
                i = 0;
            }
        }
        return new Pair<>(viewInflate, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public static void m106984c(String str, VDraweeView vDraweeView, int i) {
        qib0.f154691G.m102333M0(vDraweeView, str, new C16157a(i, vDraweeView));
    }

    /* JADX INFO: renamed from: d */
    public static void m106985d(View view, int[] iArr, PopupWindow popupWindow, int i) {
        int measuredWidth = popupWindow.getContentView().getMeasuredWidth();
        int measuredHeight = popupWindow.getContentView().getMeasuredHeight();
        int iM186890d = t100.m186890d(2.0f);
        int iM186890d2 = t100.m186890d(4.0f);
        if (i == 0) {
            popupWindow.showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2), iArr[1] + view.getHeight() + iM186890d);
            return;
        }
        if (i == 1) {
            popupWindow.showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2), (iArr[1] - measuredHeight) - iM186890d);
            return;
        }
        if (i == 2) {
            popupWindow.showAtLocation(view, 0, iArr[0] - iM186890d2, iArr[1] + view.getHeight() + iM186890d);
            return;
        }
        if (i == 3) {
            popupWindow.showAtLocation(view, 0, ((iArr[0] + view.getWidth()) - measuredWidth) + iM186890d2, iArr[1] + view.getHeight() + iM186890d);
        } else if (i == 4) {
            popupWindow.showAtLocation(view, 0, iArr[0] - iM186890d2, (iArr[1] - measuredHeight) - iM186890d);
        } else {
            if (i != 5) {
                return;
            }
            popupWindow.showAtLocation(view, 0, ((iArr[0] + view.getWidth()) - measuredWidth) + iM186890d2, (iArr[1] - measuredHeight) - iM186890d);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: e */
    public static void m106986e(View view, String str) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Pair<View, Integer> pairM106983b = m106983b(view, iArr, str);
        final PopupWindow popupWindow = new PopupWindow((View) pairM106983b.first, -2, -2, true);
        popupWindow.getContentView().measure(0, 0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: l.bhp0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return chp0.m106982a(popupWindow, view2, motionEvent);
            }
        });
        m106985d(view, iArr, popupWindow, ((Integer) pairM106983b.second).intValue());
    }
}
