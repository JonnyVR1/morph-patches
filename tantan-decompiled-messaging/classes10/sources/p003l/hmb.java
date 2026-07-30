package p003l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.bd50;
import l.eew;
import l.gbl0;
import l.ikf0;
import l.mep0;
import l.qib0;
import l.t100;
import l.v9j;
import l.xdl0;
import l.y6q0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hmb extends mep0 {
    /* JADX INFO: renamed from: M */
    public static void m7020M(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ y6q0 m7021g1(View view, y6q0 y6q0Var) {
        view.setPadding(view.getPaddingLeft(), y6q0Var.f(y6q0.l.e()).b, view.getPaddingRight(), view.getPaddingBottom());
        return y6q0Var;
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ Boolean m7022h1(ActionMenuView actionMenuView) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            ActionMenuItemView childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                childAt.setTextColor(CoreModule.P().a().Gl());
                break;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m7023i1(VText vText, int i, String str) {
        int lineEnd;
        String str2;
        if (vText.getLineCount() < i) {
            return;
        }
        if (!(vText.getLineCount() == i && vText.getEllipsize() == TextUtils.TruncateAt.END && vText.getLayout().getEllipsisCount(i - 1) <= 0) && str.contains("%s")) {
            boolean z = vText.getEllipsize() == TextUtils.TruncateAt.END && vText.getLayout().getEllipsisCount(i + (-1)) > 0;
            if (z) {
                int i2 = i - 1;
                lineEnd = vText.getLayout().getLineStart(i2) + vText.getLayout().getEllipsisStart(i2);
            } else {
                lineEnd = vText.getLayout().getLineEnd(i - 1);
            }
            String strSubstring = str.substring(str.indexOf("%s") + 2, str.length());
            int length = lineEnd - strSubstring.length();
            if (!z) {
                length -= 3;
            }
            if (length < 0) {
                str2 = vText.getText().toString().substring(0, lineEnd - 1) + "..." + strSubstring;
            } else {
                str2 = vText.getText().toString().substring(0, length) + "..." + strSubstring;
            }
            vText.setText(str2);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public static void m7024j1(View view) {
        if (view == null) {
            return;
        }
        gbl0.y0(view, new bd50() { // from class: l.gmb
            public final y6q0 onApplyWindowInsets(View view2, y6q0 y6q0Var) {
                return hmb.m7021g1(view2, y6q0Var);
            }
        });
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static Bitmap m7025k1(Drawable drawable) {
        boolean zH = xdl0.y0() < 1080;
        if (!zH) {
            zH = eew.h(CoreModule.b);
        }
        float f = zH ? 4.0f : 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (drawable.getIntrinsicWidth() / f), (int) (drawable.getIntrinsicHeight() / f), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() / f), (int) (drawable.getIntrinsicHeight() / f));
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l1 */
    public static void m7026l1(final VText vText, final String str, final int i) {
        vText.post(new Runnable() { // from class: l.fmb
            @Override // java.lang.Runnable
            public final void run() {
                hmb.m7023i1(vText, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public static float m7027m1() {
        if (xdl0.w0() < 960) {
            return 0.7f;
        }
        return xdl0.w0() <= 1280 ? 0.8f : 1.0f;
    }

    @Deprecated
    /* JADX INFO: renamed from: n1 */
    public static int m7028n1(Act act) {
        return xdl0.F0();
    }

    /* JADX INFO: renamed from: o1 */
    public static float m7029o1(int i, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.f(i));
        return textPaint.measureText(str);
    }

    /* JADX INFO: renamed from: p1 */
    public static boolean m7030p1() {
        int iW0 = xdl0.w0();
        return iW0 >= 960 && ((int) (((float) iW0) / t100.c().density)) <= 640;
    }

    /* JADX INFO: renamed from: q1 */
    public static boolean m7031q1() {
        return xdl0.w0() < 960;
    }

    /* JADX INFO: renamed from: r1 */
    public static boolean m7032r1(float f, float f2) {
        if (xdl0.y0() > f) {
            return (((float) xdl0.y0()) / f) * f2 > ((float) (xdl0.w0() * 2)) && f2 > ((float) xdl0.w0()) && f2 / f > (((float) xdl0.w0()) / ((float) xdl0.y0())) * 2.0f;
        }
        return f2 > ((float) (xdl0.w0() * 2)) && f2 / f > (((float) xdl0.w0()) / ((float) xdl0.y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: s1 */
    public static boolean m7033s1() {
        return ikf0.i(xdl0.y0()) >= 600.0f;
    }

    /* JADX INFO: renamed from: t1 */
    public static int m7034t1(int i) {
        return (int) (i / CoreModule.b.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: u1 */
    public static int m7035u1(float f) {
        return (int) ((f / CoreModule.b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* JADX INFO: renamed from: v1 */
    public static void m7036v1(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i) {
        if (NullChecker.a(imageUri)) {
            qib0.G.Q0(vDraweeView, imageUri);
        } else {
            qib0.G.Y0(vDraweeView, i);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public static void m7037w1(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i) {
        if (NullChecker.a(imageUri)) {
            qib0.G.O(vDraweeView, imageUri.formatted(), 2, 8);
        } else {
            qib0.G.K(vDraweeView, i, 2, 8);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m7038x1(Act act) {
        if (NullChecker.a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.a(actionMenuView)) {
                    xdl0.b0(actionMenuView, new v9j() { // from class: l.emb
                        public final Object call() {
                            return hmb.m7022h1(actionMenuView);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.c(new Exception("setMenuColorForWhiteBar error: " + e.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: y1 */
    public static long m7039y1(String str) {
        return m7040z1(str, 0L);
    }

    /* JADX INFO: renamed from: z1 */
    public static long m7040z1(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                CrashHelper.c(new IllegalArgumentException(String.format("Illegal string argument: can not parse string %s to long", str)));
            }
        }
        return j;
    }
}
