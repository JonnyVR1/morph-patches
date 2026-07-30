package p153l;

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
import p137rx.C22421c;
import p151v.VConstraintTextView;

/* JADX INFO: loaded from: classes3.dex */
public class qnp0 extends bnl0 {

    /* JADX INFO: renamed from: l.qnp0$a */
    public class C19609a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f158511a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f158512b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f158513c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f158514d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f158515e;

        public C19609a(int i, int i2, int i3, int i4, int i5) {
            this.f158511a = i;
            this.f158512b = i2;
            this.f158513c = i3;
            this.f158514d = i4;
            this.f158515e = i5;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect(this.f158511a, this.f158512b, (view.getRight() - view.getLeft()) - this.f158513c, (view.getBottom() - view.getTop()) - this.f158514d);
            outline.setRect(rect);
            int i = this.f158515e;
            if (i > 0) {
                outline.setRoundRect(rect, i);
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m177249R0(View view, int[] iArr, gcg0 gcg0Var) {
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
            gcg0Var.onNext(Integer.valueOf(i2));
            iArr[0] = iHeight;
        } else if (iHeight - i > 200) {
            gcg0Var.onNext(-1);
            iArr[0] = iHeight;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ boolean m177250S0(boolean z, View view, MotionEvent motionEvent) {
        return z;
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m177251T0(final VConstraintTextView vConstraintTextView, final View view, final ViewGroup viewGroup, final int i, final int i2, final int i3, final boolean z, final ViewGroup.LayoutParams layoutParams, View view2, int i4, final x20 x20Var) {
        vConstraintTextView.m224250l(view, new y20() { // from class: l.onp0
            @Override // p153l.y20
            public final void call(Object obj) {
                qnp0.m177253V0(view, viewGroup, vConstraintTextView, i, i2, i3, z, layoutParams, (pf60) obj);
            }
        });
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        vConstraintTextView.setVisibility(0);
        if (i4 != -1) {
            l51.m152888H(viewGroup.getContext(), new Runnable() { // from class: l.pnp0
                @Override // java.lang.Runnable
                public final void run() {
                    qnp0.m177254W0(viewGroup, vConstraintTextView, x20Var);
                }
            }, i4);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m177252U0(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, View view) {
        if (NullChecker.m82486a(onGlobalLayoutListenerArr[0])) {
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
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m177253V0(View view, ViewGroup viewGroup, VConstraintTextView vConstraintTextView, int i, int i2, int i3, boolean z, ViewGroup.LayoutParams layoutParams, pf60 pf60Var) {
        int i4;
        int i5;
        int i6;
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(view, viewGroup);
        bnl0.C16067g c16067gM105562j1 = bnl0.m105562j0(vConstraintTextView, viewGroup);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, kkl0.m150191x(viewGroup)) & 7;
        int i7 = i & 112;
        if (absoluteGravity != 3) {
            if (absoluteGravity != 5) {
                i5 = (c16067gM105562j0.f77559a - c16067gM105562j1.f77559a) + ((c16067gM105562j0.f77561c - c16067gM105562j1.f77561c) / 2);
            } else {
                i4 = (c16067gM105562j0.f77559a - c16067gM105562j1.f77559a) + (c16067gM105562j0.f77561c - c16067gM105562j1.f77561c);
            }
            if (i7 != 16 || i7 == 48) {
                i6 = ((c16067gM105562j0.f77560b - c16067gM105562j1.f77560b) - c16067gM105562j1.f77562d) + i3;
            } else {
                i6 = i7 != 80 ? (c16067gM105562j0.f77560b - c16067gM105562j1.f77560b) - c16067gM105562j1.f77562d : (c16067gM105562j0.f77560b - c16067gM105562j1.f77560b) + c16067gM105562j0.f77562d + i3;
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
            bnl0.m105568m0(vConstraintTextView, i5, i6);
        }
        i4 = c16067gM105562j0.f77559a - c16067gM105562j1.f77559a;
        i5 = i2 + i4;
        if (i7 != 16) {
            i6 = ((c16067gM105562j0.f77560b - c16067gM105562j1.f77560b) - c16067gM105562j1.f77562d) + i3;
        } else {
            i6 = ((c16067gM105562j0.f77560b - c16067gM105562j1.f77560b) - c16067gM105562j1.f77562d) + i3;
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
        bnl0.m105568m0(vConstraintTextView, i5, i6);
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m177254W0(ViewGroup viewGroup, VConstraintTextView vConstraintTextView, x20 x20Var) {
        if (viewGroup == null || vConstraintTextView == null) {
            return;
        }
        viewGroup.removeView(vConstraintTextView);
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m177255X0(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, final View view, final int[] iArr, final gcg0 gcg0Var) {
        onGlobalLayoutListenerArr[0] = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.nnp0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                qnp0.m177249R0(view, iArr, gcg0Var);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC19610b(onGlobalLayoutListenerArr, view, gcg0Var));
    }

    /* JADX INFO: renamed from: Y0 */
    public static void m177256Y0(@Nullable Activity activity, @NonNull Activity activity2) {
        ImageView imageView = new ImageView(activity2);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (activity != null) {
            Bitmap bitmapM189143a = t43.m189143a(bnl0.m105589x(activity.getWindow().getDecorView(), 4), qa00.m175859d(4.0f), false);
            new Canvas(bitmapM189143a).drawColor(-1476395008);
            imageView.setBackgroundDrawable(new BitmapDrawable(bitmapM189143a));
        } else {
            imageView.setBackgroundColor(-1);
        }
        ((ViewGroup) activity2.getWindow().getDecorView()).addView(imageView, 0);
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = -1;
    }

    /* JADX INFO: renamed from: Z0 */
    public static TextView m177257Z0(ViewGroup viewGroup, View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, x20 x20Var, boolean z2) {
        String string;
        if (view.getTag() != null) {
            string = view.getTag() + "child";
        } else {
            string = drawable.toString();
        }
        return m177258a1(viewGroup, view, string, drawable, charSequence, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, z, x20Var, z2);
    }

    /* JADX INFO: renamed from: a1 */
    public static TextView m177258a1(final ViewGroup viewGroup, final View view, String str, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, final int i4, int i5, int i6, int i7, int i8, int i9, final int i10, final int i11, final int i12, final boolean z, final x20 x20Var, boolean z2) {
        ViewGroup.LayoutParams layoutParams;
        final View viewFindViewWithTag = viewGroup.findViewWithTag(str);
        final VConstraintTextView vConstraintTextView = new VConstraintTextView(viewGroup.getContext());
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
        viewGroup.addView(vConstraintTextView, layoutParams2);
        vConstraintTextView.setVisibility(4);
        if (z) {
            vConstraintTextView.setOnTouchListener(new View.OnTouchListener() { // from class: l.jnp0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return qnp0.m177250S0(z, view2, motionEvent);
                }
            });
        }
        l51.m152887G(new Runnable() { // from class: l.knp0
            @Override // java.lang.Runnable
            public final void run() {
                qnp0.m177251T0(vConstraintTextView, view, viewGroup, i10, i11, i12, z, layoutParams2, viewFindViewWithTag, i4, x20Var);
            }
        });
        return vConstraintTextView;
    }

    /* JADX INFO: renamed from: b1 */
    public static View m177259b1(ViewGroup viewGroup, View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z, x20 x20Var) {
        return m177257Z0(viewGroup, view, drawable, charSequence, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, 0, z, x20Var, false);
    }

    /* JADX INFO: renamed from: c1 */
    public static void m177260c1(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        view.setOutlineProvider(new C19609a(i, i2, i3, i4, i5));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: d1 */
    public static void m177261d1(@NonNull View view, int i) {
        m177260c1(view, 0, 0, 0, 0, i);
    }

    /* JADX INFO: renamed from: e1 */
    public static void m177262e1(TextView textView, @DrawableRes int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setTextCursorDrawable(i);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(textView, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public static C22421c<Integer> m177263f1(final View view) {
        final int[] iArr = {0};
        final ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr = new ViewTreeObserver.OnGlobalLayoutListener[1];
        return C22421c.create(new C22421c.a() { // from class: l.lnp0
            @Override // p153l.y20
            public final void call(Object obj) {
                qnp0.m177255X0(onGlobalLayoutListenerArr, view, iArr, (gcg0) obj);
            }
        }).observeOn(fo0.m126432a()).doOnUnsubscribe(new x20() { // from class: l.mnp0
            @Override // p153l.x20
            public final void call() {
                qnp0.m177252U0(onGlobalLayoutListenerArr, view);
            }
        });
    }

    /* JADX INFO: renamed from: l.qnp0$b */
    public class ViewOnAttachStateChangeListenerC19610b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener[] f158516a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f158517b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gcg0 f158518c;

        public ViewOnAttachStateChangeListenerC19610b(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, View view, gcg0 gcg0Var) {
            this.f158516a = onGlobalLayoutListenerArr;
            this.f158517b = view;
            this.f158518c = gcg0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NonNull View view) {
            if (this.f158516a[0] != null) {
                this.f158517b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f158516a[0]);
                this.f158518c.onCompleted();
            }
            this.f158517b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
        }
    }
}
