package p153l;

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
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class j2j0 {

    /* JADX INFO: renamed from: a */
    public final Context f118057a;

    /* JADX INFO: renamed from: b */
    public final View f118058b;

    /* JADX INFO: renamed from: c */
    public final TextView f118059c;

    /* JADX INFO: renamed from: d */
    public final WindowManager.LayoutParams f118060d;

    /* JADX INFO: renamed from: e */
    public final Rect f118061e;

    /* JADX INFO: renamed from: f */
    public final int[] f118062f;

    /* JADX INFO: renamed from: g */
    public final int[] f118063g;

    public j2j0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f118060d = layoutParams;
        this.f118061e = new Rect();
        this.f118062f = new int[2];
        this.f118063g = new int[2];
        this.f118057a = context;
        View viewInflate = LayoutInflater.from(context).inflate(kfc0.f126285u, (ViewGroup) null);
        this.f118058b = viewInflate;
        this.f118059c = (TextView) viewInflate.findViewById(xdc0.f193580y);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = ugc0.f178880a;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: b */
    public static View m143218b(View view) {
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
    public final void m143219a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f118057a.getResources().getDimensionPixelOffset(wac0.f188113j);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f118057a.getResources().getDimensionPixelOffset(wac0.f188112i);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f118057a.getResources().getDimensionPixelOffset(z ? wac0.f188115l : wac0.f188114k);
        View viewM143218b = m143218b(view);
        if (viewM143218b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewM143218b.getWindowVisibleDisplayFrame(this.f118061e);
        Rect rect = this.f118061e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f118057a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f118061e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewM143218b.getLocationOnScreen(this.f118063g);
        view.getLocationOnScreen(this.f118062f);
        int[] iArr = this.f118062f;
        int i4 = iArr[0];
        int[] iArr2 = this.f118063g;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (viewM143218b.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f118058b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f118058b.getMeasuredHeight();
        int i6 = this.f118062f[1];
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
        if (measuredHeight + i8 <= this.f118061e.height()) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i7;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m143220c() {
        if (m143221d()) {
            ((WindowManager) this.f118057a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).removeView(this.f118058b);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m143221d() {
        return this.f118058b.getParent() != null;
    }

    /* JADX INFO: renamed from: e */
    public void m143222e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m143221d()) {
            m143220c();
        }
        this.f118059c.setText(charSequence);
        m143219a(view, i, i2, z, this.f118060d);
        ((WindowManager) this.f118057a.getSystemService(BLiveBottomPopupStyleTypeEnum.window)).addView(this.f118058b, this.f118060d);
    }
}
