package p153l;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class ynp0 {

    /* JADX INFO: renamed from: a */
    public static final int f200900a = qa00.m175859d(100.0f);

    /* JADX INFO: renamed from: b */
    public static long f200901b;

    /* JADX INFO: renamed from: l.ynp0$a */
    public class C21650a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f200902a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f200903b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f200904c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f200905d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f200906e;

        public C21650a(int i, int i2, int i3, int i4, int i5) {
            this.f200902a = i;
            this.f200903b = i2;
            this.f200904c = i3;
            this.f200905d = i4;
            this.f200906e = i5;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect(this.f200902a, this.f200903b, (view.getRight() - view.getLeft()) - this.f200904c, (view.getBottom() - view.getTop()) - this.f200905d);
            outline.setRect(rect);
            int i = this.f200906e;
            if (i > 0) {
                outline.setRoundRect(rect, i);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m216916A(View.OnClickListener onClickListener, View... viewArr) {
        for (View view : viewArr) {
            bnl0.m105509E0(view, onClickListener);
        }
    }

    @ColorInt
    /* JADX INFO: renamed from: B */
    public static int m216917B(String str) {
        return Color.parseColor(m216933j(str));
    }

    /* JADX INFO: renamed from: C */
    public static void m216918C(View view, Rect rect) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = rect.bottom;
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.rightMargin = rect.right;
            marginLayoutParams.leftMargin = rect.left;
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: D */
    public static void m216919D(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = m216939p();
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: E */
    public static void m216920E(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        bnl0.m105509E0(view, onClickListener);
    }

    /* JADX INFO: renamed from: F */
    public static void m216921F(View view, final View.OnClickListener onClickListener, final long j) {
        if (onClickListener != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.rnp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ynp0.m216927d(j, onClickListener, view2);
                }
            });
        } else {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: G */
    public static C22421c<Boolean> m216922G(final View view) {
        final ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr = new ViewTreeObserver.OnGlobalLayoutListener[1];
        return C22421c.create(new C22421c.a() { // from class: l.vnp0
            @Override // p153l.y20
            public final void call(Object obj) {
                ynp0.m216925b(onGlobalLayoutListenerArr, view, (gcg0) obj);
            }
        }).debounce(200L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).doOnUnsubscribe(new x20() { // from class: l.wnp0
            @Override // p153l.x20
            public final void call() {
                ynp0.m216930g(onGlobalLayoutListenerArr, view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static C22421c<CharSequence> m216923H(final EditText editText) {
        return C22421c.create(new C22421c.a() { // from class: l.snp0
            @Override // p153l.y20
            public final void call(Object obj) {
                ynp0.m216928e(editText, (gcg0) obj);
            }
        }).compose(psd0.m173607R());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m216924a(View view, gcg0 gcg0Var) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        gcg0Var.onNext(Boolean.valueOf(view.getRootView().getHeight() - rect.bottom > f200900a));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m216925b(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, final View view, final gcg0 gcg0Var) {
        onGlobalLayoutListenerArr[0] = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.xnp0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ynp0.m216924a(view, gcg0Var);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m216927d(long j, View.OnClickListener onClickListener, View view) {
        if (SystemClock.uptimeMillis() - f200901b > j) {
            f200901b = SystemClock.uptimeMillis();
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m216928e(final EditText editText, gcg0 gcg0Var) {
        final C21651b c21651b = new C21651b(gcg0Var);
        editText.addTextChangedListener(c21651b);
        gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.tnp0
            @Override // p153l.x20
            public final void call() {
                editText.removeTextChangedListener(c21651b);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m216930g(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, View view) {
        if (NullChecker.m82486a(onGlobalLayoutListenerArr[0])) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m216931h(int i, TextView textView) {
        if (i <= 0 || textView == null) {
            return;
        }
        textView.setTextSize(2, i);
    }

    /* JADX INFO: renamed from: i */
    public static void m216932i(boolean z, View... viewArr) {
        for (View view : viewArr) {
            bnl0.m105524M(view, z);
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m216933j(String str) {
        if (str.length() == 3) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 3; i++) {
                char cCharAt = str.charAt(i);
                sb.append(cCharAt);
                sb.append(cCharAt);
            }
            return sb.toString();
        }
        if (str.length() != 4 || !str.startsWith("#")) {
            return !str.startsWith("#") ? "#".concat(str) : str;
        }
        StringBuilder sb2 = new StringBuilder("#");
        for (int i2 = 1; i2 < 4; i2++) {
            char cCharAt2 = str.charAt(i2);
            sb2.append(cCharAt2);
            sb2.append(cCharAt2);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k */
    public static void m216934k(@Nullable Toolbar toolbar) {
        View viewFindViewById;
        if (toolbar == null || (viewFindViewById = toolbar.findViewById(jdc0.f120195g0)) == null) {
            return;
        }
        toolbar.removeView(viewFindViewById);
    }

    /* JADX INFO: renamed from: l */
    public static void m216935l(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        view.setOutlineProvider(new C21650a(i, i2, i3, i4, i5));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: m */
    public static void m216936m(@NonNull View view, int i) {
        m216935l(view, 0, 0, 0, 0, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m216937n(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m216938o(String str, int i) {
        String strM216940q = m216940q(i);
        StringBuilder sb = new StringBuilder();
        if (!str.startsWith("#")) {
            sb.append("#");
            sb.append(strM216940q);
            sb.append(str);
            return "#" + strM216940q + str;
        }
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length == 2) {
            sb.append("#");
            sb.append(strM216940q);
            sb.append(strArrSplit[1]);
        } else {
            sb.append("#");
            sb.append(strM216940q);
            sb.append("000000");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static int m216939p() {
        if (!m216947x()) {
            return bnl0.m105592y0();
        }
        if (bnl0.m105592y0() / 2 > 1080) {
            return bnl0.m105592y0() / 2;
        }
        return 1080;
    }

    /* JADX INFO: renamed from: q */
    public static String m216940q(int i) {
        String hexString = Integer.toHexString(m216941r(i));
        return hexString.length() == 1 ? "0".concat(hexString) : hexString;
    }

    /* JADX INFO: renamed from: r */
    public static int m216941r(int i) {
        float f = i;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        return 255 - ((int) ((f / 100.0f) * 255.0f));
    }

    /* JADX INFO: renamed from: s */
    public static int m216942s(int i, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(i));
        return Math.round(textPaint.measureText(str));
    }

    /* JADX INFO: renamed from: t */
    public static int m216943t(int i, String str, Typeface typeface) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(i));
        textPaint.setTypeface(typeface);
        return Math.round(textPaint.measureText(str));
    }

    /* JADX INFO: renamed from: u */
    public static float m216944u(@Nullable View view, boolean z) {
        float f;
        int width;
        if (view == null || !view.isAttachedToWindow()) {
            return 0.0f;
        }
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        if (z) {
            f = rect.bottom - rect.top;
            width = view.getHeight();
        } else {
            f = rect.right - rect.left;
            width = view.getWidth();
        }
        return f / width;
    }

    /* JADX INFO: renamed from: v */
    public static void m216945v(View view, boolean z) {
        if (view == null) {
            return;
        }
        bnl0.m105524M(view, z);
    }

    /* JADX INFO: renamed from: w */
    public static void m216946w(final boolean z, View... viewArr) {
        jyb.m147470A(viewArr, new y20() { // from class: l.unp0
            @Override // p153l.y20
            public final void call(Object obj) {
                ynp0.m216945v((View) obj, z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static boolean m216947x() {
        return bnl0.m105592y0() > 1080 && (((float) bnl0.m105592y0()) * 1.0f) / ((float) bnl0.m105588w0()) > 0.7f;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m216948y(@NotNull Context context) {
        String str;
        String str2 = Build.BRAND;
        if (str2.equalsIgnoreCase("HUAWEI")) {
            str = "navigationbar_is_min";
        } else {
            str = str2.equalsIgnoreCase("XIAOMI") ? "force_fsg_nav_bar" : null;
        }
        if (!TextUtils.isEmpty(str)) {
            return Settings.Global.getInt(context.getContentResolver(), str, 0) != 1;
        }
        Object systemService = context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        if (systemService == null) {
            return false;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        int i3 = displayMetrics2.heightPixels;
        int i4 = displayMetrics2.widthPixels;
        if (i3 > i4) {
            if (bnl0.m105516I(context) + i3 > i) {
                return false;
            }
        } else if (bnl0.m105516I(context) + i4 > i2) {
            return false;
        }
        return i2 - i4 > 0 || i - i3 > 0;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m216949z(Dialog dialog) {
        return dialog != null && dialog.isShowing();
    }

    /* JADX INFO: renamed from: l.ynp0$b */
    public class C21651b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f200907a;

        public C21651b(gcg0 gcg0Var) {
            this.f200907a = gcg0Var;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f200907a.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
