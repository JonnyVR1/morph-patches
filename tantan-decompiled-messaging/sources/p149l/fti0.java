package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class fti0 {

    /* JADX INFO: renamed from: a */
    public final Context f99211a;

    /* JADX INFO: renamed from: b */
    public final View f99212b;

    /* JADX INFO: renamed from: c */
    public final TextView f99213c;

    /* JADX INFO: renamed from: d */
    public final WindowManager.LayoutParams f99214d;

    /* JADX INFO: renamed from: e */
    public final Rect f99215e;

    /* JADX INFO: renamed from: f */
    public final int[] f99216f;

    /* JADX INFO: renamed from: g */
    public final int[] f99217g;

    public fti0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f99214d = layoutParams;
        this.f99215e = new Rect();
        this.f99216f = new int[2];
        this.f99217g = new int[2];
        this.f99211a = context;
        View viewInflate = LayoutInflater.from(context).inflate(g7c0.f101373u, (ViewGroup) null);
        this.f99212b = viewInflate;
        this.f99213c = (TextView) viewInflate.findViewById(s5c0.f162541y);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = p8c0.f147582a;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: b */
    public static View m123051b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    /* JADX INFO: renamed from: a */
    public final void m123052a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f99211a.getResources().getDimensionPixelOffset(p2c0.f146841j);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f99211a.getResources().getDimensionPixelOffset(p2c0.f146840i);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f99211a.getResources().getDimensionPixelOffset(z ? p2c0.f146843l : p2c0.f146842k);
        View viewM123051b = m123051b(view);
        if (viewM123051b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewM123051b.getWindowVisibleDisplayFrame(this.f99215e);
        Rect rect = this.f99215e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f99211a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f99215e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewM123051b.getLocationOnScreen(this.f99217g);
        view.getLocationOnScreen(this.f99216f);
        int[] iArr = this.f99216f;
        int i4 = iArr[0];
        int[] iArr2 = this.f99217g;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (viewM123051b.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f99212b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f99212b.getMeasuredHeight();
        int i6 = this.f99216f[1];
        int i7 = ((i3 + i6) - dimensionPixelOffset3) - measuredHeight;
        int i8 = i6 + height + dimensionPixelOffset3;
        if (z) {
            if (i7 >= 0) {
                layoutParams.y = i7;
                return;
            } else {
                layoutParams.y = i8;
                return;
            }
        }
        if (measuredHeight + i8 <= this.f99215e.height()) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i7;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m123053c() {
        if (m123054d()) {
            ((WindowManager) this.f99211a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).removeView(this.f99212b);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m123054d() {
        return this.f99212b.getParent() != null;
    }

    /* JADX INFO: renamed from: e */
    public void m123055e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m123054d()) {
            m123053c();
        }
        this.f99213c.setText(charSequence);
        m123052a(view, i, i2, z, this.f99214d);
        ((WindowManager) this.f99211a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).addView(this.f99212b, this.f99214d);
    }
}
