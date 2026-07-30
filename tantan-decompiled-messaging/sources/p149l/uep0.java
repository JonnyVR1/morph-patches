package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class uep0 {

    /* JADX INFO: renamed from: a */
    public static final int f176059a = t100.m186890d(100.0f);

    /* JADX INFO: renamed from: b */
    public static long f176060b;

    /* JADX INFO: renamed from: l.uep0$a */
    public class C20415a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f176061a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f176062b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f176063c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f176064d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f176065e;

        public C20415a(int i, int i2, int i3, int i4, int i5) {
            this.f176061a = i;
            this.f176062b = i2;
            this.f176063c = i3;
            this.f176064d = i4;
            this.f176065e = i5;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect(this.f176061a, this.f176062b, (view.getRight() - view.getLeft()) - this.f176063c, (view.getBottom() - view.getTop()) - this.f176064d);
            outline.setRect(rect);
            int i = this.f176065e;
            if (i > 0) {
                outline.setRoundRect(rect, i);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m193306A(View.OnClickListener onClickListener, View... viewArr) {
        for (View view : viewArr) {
            xdl0.m208329E0(view, onClickListener);
        }
    }

    @ColorInt
    /* JADX INFO: renamed from: B */
    public static int m193307B(String str) {
        return Color.parseColor(m193323j(str));
    }

    /* JADX INFO: renamed from: C */
    public static void m193308C(View view, Rect rect) {
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
    public static void m193309D(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = m193329p();
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: E */
    public static void m193310E(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        xdl0.m208329E0(view, onClickListener);
    }

    /* JADX INFO: renamed from: F */
    public static void m193311F(View view, final View.OnClickListener onClickListener, final long j) {
        if (onClickListener != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.nep0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    uep0.m193317d(j, onClickListener, view2);
                }
            });
        } else {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: G */
    public static C22306c<Boolean> m193312G(final View view) {
        final ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr = new ViewTreeObserver.OnGlobalLayoutListener[1];
        return C22306c.create(new C22306c.a() { // from class: l.rep0
            @Override // p149l.e30
            public final void call(Object obj) {
                uep0.m193315b(onGlobalLayoutListenerArr, view, (z3g0) obj);
            }
        }).debounce(200L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).doOnUnsubscribe(new d30() { // from class: l.sep0
            @Override // p149l.d30
            public final void call() {
                uep0.m193320g(onGlobalLayoutListenerArr, view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static C22306c<CharSequence> m193313H(final EditText editText) {
        return C22306c.create(new C22306c.a() { // from class: l.oep0
            @Override // p149l.e30
            public final void call(Object obj) {
                uep0.m193318e(editText, (z3g0) obj);
            }
        }).compose(mkd0.m154966R());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m193314a(View view, z3g0 z3g0Var) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        z3g0Var.onNext(Boolean.valueOf(view.getRootView().getHeight() - rect.bottom > f176059a));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m193315b(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, final View view, final z3g0 z3g0Var) {
        onGlobalLayoutListenerArr[0] = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.tep0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                uep0.m193314a(view, z3g0Var);
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m193317d(long j, View.OnClickListener onClickListener, View view) {
        if (SystemClock.uptimeMillis() - f176060b > j) {
            f176060b = SystemClock.uptimeMillis();
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m193318e(final EditText editText, z3g0 z3g0Var) {
        final C20416b c20416b = new C20416b(z3g0Var);
        editText.addTextChangedListener(c20416b);
        z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.pep0
            @Override // p149l.d30
            public final void call() {
                editText.removeTextChangedListener(c20416b);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m193320g(ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArr, View view) {
        if (NullChecker.m81303a(onGlobalLayoutListenerArr[0])) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListenerArr[0]);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m193321h(int i, TextView textView) {
        if (i <= 0 || textView == null) {
            return;
        }
        textView.setTextSize(2, i);
    }

    /* JADX INFO: renamed from: i */
    public static void m193322i(boolean z, View... viewArr) {
        for (View view : viewArr) {
            xdl0.m208344M(view, z);
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m193323j(String str) {
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
    public static void m193324k(@Nullable Toolbar toolbar) {
        View viewFindViewById;
        if (toolbar == null || (viewFindViewById = toolbar.findViewById(d5c0.f84477g0)) == null) {
            return;
        }
        toolbar.removeView(viewFindViewById);
    }

    /* JADX INFO: renamed from: l */
    public static void m193325l(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
        view.setOutlineProvider(new C20415a(i, i2, i3, i4, i5));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: m */
    public static void m193326m(@NonNull View view, int i) {
        m193325l(view, 0, 0, 0, 0, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m193327n(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m193328o(String str, int i) {
        String strM193330q = m193330q(i);
        StringBuilder sb = new StringBuilder();
        if (!str.startsWith("#")) {
            sb.append("#");
            sb.append(strM193330q);
            sb.append(str);
            return "#" + strM193330q + str;
        }
        String[] strArrSplit = str.split("#");
        if (strArrSplit.length == 2) {
            sb.append("#");
            sb.append(strM193330q);
            sb.append(strArrSplit[1]);
        } else {
            sb.append("#");
            sb.append(strM193330q);
            sb.append("000000");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static int m193329p() {
        if (!m193337x()) {
            return xdl0.m208412y0();
        }
        if (xdl0.m208412y0() / 2 > 1080) {
            return xdl0.m208412y0() / 2;
        }
        return 1080;
    }

    /* JADX INFO: renamed from: q */
    public static String m193330q(int i) {
        String hexString = Integer.toHexString(m193331r(i));
        return hexString.length() == 1 ? "0".concat(hexString) : hexString;
    }

    /* JADX INFO: renamed from: r */
    public static int m193331r(int i) {
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
    public static int m193332s(int i, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186892f(i));
        return Math.round(textPaint.measureText(str));
    }

    /* JADX INFO: renamed from: t */
    public static int m193333t(int i, String str, Typeface typeface) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186892f(i));
        textPaint.setTypeface(typeface);
        return Math.round(textPaint.measureText(str));
    }

    /* JADX INFO: renamed from: u */
    public static float m193334u(@Nullable View view, boolean z) {
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
    public static void m193335v(View view, boolean z) {
        if (view == null) {
            return;
        }
        xdl0.m208344M(view, z);
    }

    /* JADX INFO: renamed from: w */
    public static void m193336w(final boolean z, View... viewArr) {
        vwb.m200287A(viewArr, new e30() { // from class: l.qep0
            @Override // p149l.e30
            public final void call(Object obj) {
                uep0.m193335v((View) obj, z);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static boolean m193337x() {
        return xdl0.m208412y0() > 1080 && (((float) xdl0.m208412y0()) * 1.0f) / ((float) xdl0.m208408w0()) > 0.7f;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m193338y(@NotNull Context context) {
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
            if (xdl0.m208336I(context) + i3 > i) {
                return false;
            }
        } else if (xdl0.m208336I(context) + i4 > i2) {
            return false;
        }
        return i2 - i4 > 0 || i - i3 > 0;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m193339z(Dialog dialog) {
        return dialog != null && dialog.isShowing();
    }

    /* JADX INFO: renamed from: l.uep0$b */
    public class C20416b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f176066a;

        public C20416b(z3g0 z3g0Var) {
            this.f176066a = z3g0Var;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f176066a.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
