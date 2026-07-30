package p007l;

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
import l.ngm;
import l.qib0;
import l.t100;
import l.xdl0;
import l.ym2;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class chp0 {

    /* JADX INFO: renamed from: a */
    public static final int f6649a = t100.d(14.0f);

    /* JADX INFO: renamed from: b */
    public static final int f6650b = t100.d(16.0f);

    /* JADX INFO: renamed from: l.chp0$a */
    public class C2354a extends ym2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f6651a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f6652b;

        public C2354a(int i, VDraweeView vDraweeView) {
            this.f6651a = i;
            this.f6652b = vDraweeView;
        }

        /* JADX INFO: renamed from: h */
        public void m9181h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            if (ngmVar == null) {
                return;
            }
            int width = (int) (this.f6651a * (ngmVar.getWidth() / ngmVar.getHeight()));
            ViewGroup.LayoutParams layoutParams = this.f6652b.getLayoutParams();
            layoutParams.width = width + this.f6652b.getPaddingLeft() + this.f6652b.getPaddingRight();
            layoutParams.height = this.f6651a;
            this.f6652b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m9176a(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        popupWindow.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static Pair<View, Integer> m9177b(View view, int[] iArr, String str) {
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(o6c0.f11097N3, (ViewGroup) null);
        int i = 1;
        boolean z = iArr[1] > xdl0.w0() / 2;
        TextView textView = (TextView) viewInflate.findViewById(b5c0.f6025a2);
        textView.setText(str);
        int iD = t100.d(14.0f);
        int iD2 = t100.d(11.0f);
        int iD3 = t100.d(23.0f);
        int iD4 = t100.d(20.0f);
        int iD5 = t100.d(8.0f);
        int iD6 = t100.d(172.0f) / 2;
        int width = view.getWidth() / 2;
        int iY0 = xdl0.y0();
        if (z) {
            textView.setPadding(iD, iD2, iD, iD3);
            int i2 = iArr[0];
            if ((i2 + width) - iD5 < iD6) {
                textView.setBackgroundResource(f3c0.f7733W5);
                i = 4;
            } else if (((iY0 - i2) - width) - iD5 < iD6) {
                textView.setBackgroundResource(f3c0.f7747Y5);
                i = 5;
            } else {
                textView.setBackgroundResource(f3c0.f7719U5);
            }
        } else {
            textView.setPadding(iD, iD4, iD, iD);
            int i3 = iArr[0];
            if ((i3 + width) - iD5 < iD6) {
                textView.setBackgroundResource(f3c0.f7740X5);
                i = 2;
            } else if (((iY0 - i3) - width) - iD5 < iD6) {
                textView.setBackgroundResource(f3c0.f7754Z5);
                i = 3;
            } else {
                textView.setBackgroundResource(f3c0.f7726V5);
                i = 0;
            }
        }
        return new Pair<>(viewInflate, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c */
    public static void m9178c(String str, VDraweeView vDraweeView, int i) {
        qib0.G.M0(vDraweeView, str, new C2354a(i, vDraweeView));
    }

    /* JADX INFO: renamed from: d */
    public static void m9179d(View view, int[] iArr, PopupWindow popupWindow, int i) {
        int measuredWidth = popupWindow.getContentView().getMeasuredWidth();
        int measuredHeight = popupWindow.getContentView().getMeasuredHeight();
        int iD = t100.d(2.0f);
        int iD2 = t100.d(4.0f);
        if (i == 0) {
            popupWindow.showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2), iArr[1] + view.getHeight() + iD);
            return;
        }
        if (i == 1) {
            popupWindow.showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2), (iArr[1] - measuredHeight) - iD);
            return;
        }
        if (i == 2) {
            popupWindow.showAtLocation(view, 0, iArr[0] - iD2, iArr[1] + view.getHeight() + iD);
            return;
        }
        if (i == 3) {
            popupWindow.showAtLocation(view, 0, ((iArr[0] + view.getWidth()) - measuredWidth) + iD2, iArr[1] + view.getHeight() + iD);
        } else if (i == 4) {
            popupWindow.showAtLocation(view, 0, iArr[0] - iD2, (iArr[1] - measuredHeight) - iD);
        } else {
            if (i != 5) {
                return;
            }
            popupWindow.showAtLocation(view, 0, ((iArr[0] + view.getWidth()) - measuredWidth) + iD2, (iArr[1] - measuredHeight) - iD);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: e */
    public static void m9180e(View view, String str) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Pair<View, Integer> pairM9177b = m9177b(view, iArr, str);
        final PopupWindow popupWindow = new PopupWindow((View) pairM9177b.first, -2, -2, true);
        popupWindow.getContentView().measure(0, 0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: l.bhp0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return chp0.m9176a(popupWindow, view2, motionEvent);
            }
        });
        m9179d(view, iArr, popupWindow, ((Integer) pairM9177b.second).intValue());
    }
}
