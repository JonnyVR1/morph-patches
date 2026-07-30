package p003l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import l.d43;
import l.e51;
import l.gbl0;
import l.j760;
import l.t100;
import l.xdl0;
import p014rx.C1099c;
import p028v.VConstraintTextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mep0 extends xdl0 {

    /* JADX INFO: renamed from: l.mep0$a */
    public class C0425a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5616a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5617b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f5618c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f5619d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f5620e;

        public C0425a(int i, int i2, int i3, int i4, int i5) {
            this.f5616a = i;
            this.f5617b = i2;
            this.f5618c = i3;
            this.f5619d = i4;
            this.f5620e = i5;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect(this.f5616a, this.f5617b, (view.getRight() - view.getLeft()) - this.f5618c, (view.getBottom() - view.getTop()) - this.f5619d);
            outline.setRect(rect);
            int i = this.f5620e;
            if (i > 0) {
                outline.setRoundRect(rect, i);
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m6378R0(View view, int[] iArr, z3g0 z3g0Var) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height();
        int i = iArr[0];
        if (i == 0) {
            iArr[0] = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        int i2 = i - iHeight;
        if (i2 > 200) {
            z3g0Var.onNext(Integer.valueOf(i2));
            iArr[0] = iHeight;
        } else if (iHeight - i > 200) {
            z3g0Var.onNext(-1);
            iArr[0] = iHeight;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ boolean m6379S0(boolean z, View view, MotionEvent motionEvent) {
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m6380T0(final VConstraintTextView vConstraintTextView, final View view, final ViewGroup viewGroup, final int i, final int i2, final int i3, final boolean z, final ViewGroup.LayoutParams layoutParams, View view2, int i4, final d30 d30Var) {
        vConstraintTextView.m11477l(view, new e30() { // from class: l.kep0
            @Override // p003l.e30
            public final void call(Object obj) {
                mep0.m6382V0(view, viewGroup, vConstraintTextView, i, i2, i3, z, layoutParams, (j760) obj);
            }
        });
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        vConstraintTextView.setVisibility(0);
        if (i4 != -1) {
            e51.H(viewGroup.getContext(), new Runnable() { // from class: l.lep0
                @Override // java.lang.Runnable
                public final void run() {
                    mep0.m6383W0(viewGroup, vConstraintTextView, d30Var);
                }
            }, i4);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m6381U0(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, View view) {
        if (NullChecker.a(onGlobalLayoutListenerArr[0])) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m6382V0(View view, ViewGroup viewGroup, VConstraintTextView vConstraintTextView, int i, int i2, int i3, boolean z, ViewGroup.LayoutParams layoutParams, j760 j760Var) {
        int i4;
        int i5;
        int i6;
        xdl0.g gVarJ0 = xdl0.j0(view, viewGroup);
        xdl0.g gVarJ1 = xdl0.j0(vConstraintTextView, viewGroup);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, gbl0.x(viewGroup)) & 7;
        int i7 = i & 112;
        if (absoluteGravity != 3) {
            if (absoluteGravity != 5) {
                i5 = (gVarJ0.a - gVarJ1.a) + ((gVarJ0.c - gVarJ1.c) / 2);
            } else {
                i4 = (gVarJ0.a - gVarJ1.a) + (gVarJ0.c - gVarJ1.c);
            }
            if (i7 != 16 || i7 == 48) {
                i6 = ((gVarJ0.b - gVarJ1.b) - gVarJ1.d) + i3;
            } else {
                i6 = i7 != 80 ? (gVarJ0.b - gVarJ1.b) - gVarJ1.d : (gVarJ0.b - gVarJ1.b) + gVarJ0.d + i3;
            }
            if (z) {
                vConstraintTextView.setTranslationX(vConstraintTextView.getTranslationX() + i5);
                vConstraintTextView.setTranslationY(vConstraintTextView.getTranslationY() + i6);
                return;
            }
            if (viewGroup instanceof LinearLayout) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin += i5;
                layoutParams2.topMargin += i6;
            } else if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams3.leftMargin += i5;
                layoutParams3.topMargin += i6;
            } else if (viewGroup instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams4.leftMargin += i5;
                layoutParams4.topMargin += i6;
            }
            vConstraintTextView.setLayoutParams(layoutParams);
            xdl0.m0(vConstraintTextView, i5, i6);
        }
        i4 = gVarJ0.a - gVarJ1.a;
        i5 = i2 + i4;
        if (i7 != 16) {
            i6 = ((gVarJ0.b - gVarJ1.b) - gVarJ1.d) + i3;
        } else {
            i6 = ((gVarJ0.b - gVarJ1.b) - gVarJ1.d) + i3;
        }
        if (z) {
            vConstraintTextView.setTranslationX(vConstraintTextView.getTranslationX() + i5);
            vConstraintTextView.setTranslationY(vConstraintTextView.getTranslationY() + i6);
            return;
        }
        if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams5.leftMargin += i5;
            layoutParams5.topMargin += i6;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams6.leftMargin += i5;
            layoutParams6.topMargin += i6;
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams7.leftMargin += i5;
            layoutParams7.topMargin += i6;
        }
        vConstraintTextView.setLayoutParams(layoutParams);
        xdl0.m0(vConstraintTextView, i5, i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m6383W0(ViewGroup viewGroup, VConstraintTextView vConstraintTextView, d30 d30Var) {
        if (viewGroup == null || vConstraintTextView == 0) {
            return;
        }
        viewGroup.removeView(vConstraintTextView);
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m6384X0(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, final View view, final int[] iArr, final z3g0 z3g0Var) {
        onGlobalLayoutListenerArr[0] = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.jep0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                mep0.m6378R0(view, iArr, z3g0Var);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0426b(onGlobalLayoutListenerArr, view, z3g0Var));
    }

    /* JADX INFO: renamed from: Y0 */
    public static void m6385Y0(@Nullable Activity activity, @NonNull Activity activity2) {
        ImageView imageView = new ImageView(activity2);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (activity != null) {
            Bitmap bitmapA = d43.a(xdl0.x(activity.getWindow().getDecorView(), 4), t100.d(4.0f), false);
            new Canvas(bitmapA).drawColor(-1476395008);
            imageView.setBackgroundDrawable(new BitmapDrawable(bitmapA));
        } else {
            imageView.setBackgroundColor(-1);
        }
        ((ViewGroup) activity2.getWindow().getDecorView()).addView(imageView, 0);
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    /* JADX INFO: renamed from: Z0 */
    public static TextView m6386Z0(ViewGroup viewGroup, View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, d30 d30Var, boolean z2) {
        String string;
        if (view.getTag() != null) {
            string = view.getTag() + "child";
        } else {
            string = drawable.toString();
        }
        return m6387a1(viewGroup, view, string, drawable, charSequence, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, z, d30Var, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, v.VConstraintTextView] */
    /* JADX INFO: renamed from: a1 */
    public static TextView m6387a1(final ViewGroup viewGroup, final View view, String str, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, final int i4, int i5, int i6, int i7, int i8, int i9, final int i10, final int i11, final int i12, final boolean z, final d30 d30Var, boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        final View viewFindViewWithTag = viewGroup.findViewWithTag(str);
        final ?? vConstraintTextView = new VConstraintTextView(viewGroup.getContext());
        vConstraintTextView.setTextColor(i);
        vConstraintTextView.setTextSize(1, i2);
        vConstraintTextView.setGravity(i3);
        vConstraintTextView.setText(charSequence);
        vConstraintTextView.setBackgroundDrawable(drawable);
        vConstraintTextView.setTag(str);
        if (z2) {
            vConstraintTextView.getPaint().setFakeBoldText(true);
        }
        if (i9 > 0) {
            vConstraintTextView.setMaxWidth(i9);
        }
        if (i5 > 0 || i6 > 0 || i7 > 0 || i8 > 0) {
            vConstraintTextView.setPadding(i5, i6, i7, i8);
        }
        if (viewGroup instanceof LinearLayout) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        } else if (viewGroup instanceof FrameLayout) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = viewGroup instanceof RelativeLayout ? new RelativeLayout.LayoutParams(-2, -2) : new ViewGroup.LayoutParams(-2, -2);
        }
        final ViewGroup.LayoutParams layoutParams2 = layoutParams;
        viewGroup.addView((View) vConstraintTextView, layoutParams2);
        vConstraintTextView.setVisibility(4);
        if (z) {
            vConstraintTextView.setOnTouchListener(new View.OnTouchListener() { // from class: l.fep0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return mep0.m6379S0(z, view2, motionEvent);
                }
            });
        }
        e51.G(new Runnable() { // from class: l.gep0
            @Override // java.lang.Runnable
            public final void run() {
                mep0.m6380T0(vConstraintTextView, view, viewGroup, i10, i11, i12, z, layoutParams2, viewFindViewWithTag, i4, d30Var);
            }
        });
        return vConstraintTextView;
    }

    /* JADX INFO: renamed from: b1 */
    public static View m6388b1(ViewGroup viewGroup, View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, d30 d30Var) {
        return m6386Z0(viewGroup, view, drawable, charSequence, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, 0, z, d30Var, false);
    }

    /* JADX INFO: renamed from: c1 */
    public static void m6389c1(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        view.setOutlineProvider(new C0425a(i, i2, i3, i4, i5));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m6390d1(@NonNull View view, int i) {
        m6389c1(view, 0, 0, 0, 0, i);
    }

    /* JADX INFO: renamed from: e1 */
    public static void m6391e1(TextView textView, @DrawableRes int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setTextCursorDrawable(i);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(textView, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public static C1099c<Integer> m6392f1(final View view) {
        final int[] iArr = {0};
        final ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr = new ViewTreeObserver.OnGlobalLayoutListener[1];
        return C1099c.create(new C1099c.a() { // from class: l.hep0
            @Override // p003l.e30
            public final void call(Object obj) {
                mep0.m6384X0(onGlobalLayoutListenerArr, view, iArr, (z3g0) obj);
            }
        }).observeOn(jo0.m5414a()).doOnUnsubscribe(new d30() { // from class: l.iep0
            @Override // p003l.d30
            public final void call() {
                mep0.m6381U0(onGlobalLayoutListenerArr, view);
            }
        });
    }

    /* JADX INFO: renamed from: l.mep0$b */
    public class ViewOnAttachStateChangeListenerC0426b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener[] f5621a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f5622b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z3g0 f5623c;

        public ViewOnAttachStateChangeListenerC0426b(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, View view, z3g0 z3g0Var) {
            this.f5621a = onGlobalLayoutListenerArr;
            this.f5622b = view;
            this.f5623c = z3g0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NonNull View view) {
            if (this.f5621a[0] != null) {
                this.f5622b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f5621a[0]);
                this.f5623c.onCompleted();
            }
            this.f5622b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
        }
    }
}
