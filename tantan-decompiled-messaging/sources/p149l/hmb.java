package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hmb extends mep0 {
    /* JADX INFO: renamed from: M */
    public static void m131701M(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ y6q0 m131702g1(View view, y6q0 y6q0Var) {
        view.setPadding(view.getPaddingLeft(), y6q0Var.m213179f(y6q0.C21326l.m213235e()).f160973b, view.getPaddingRight(), view.getPaddingBottom());
        return y6q0Var;
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ Boolean m131703h1(ActionMenuView actionMenuView) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            View childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                ((ActionMenuItemView) childAt).setTextColor(CoreModule.m29935P().m94651a().mo33326Gl());
                break;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m131704i1(VText vText, int i, String str) {
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
    public static void m131705j1(View view) {
        if (view == null) {
            return;
        }
        gbl0.m125231y0(view, new bd50() { // from class: l.gmb
            @Override // p149l.bd50
            public final y6q0 onApplyWindowInsets(View view2, y6q0 y6q0Var) {
                return hmb.m131702g1(view2, y6q0Var);
            }
        });
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static Bitmap m131706k1(Drawable drawable) {
        boolean zM116012h = xdl0.m208412y0() < 1080;
        if (!zM116012h) {
            zM116012h = eew.m116012h(CoreModule.f17544b);
        }
        float f = zM116012h ? 4.0f : 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (drawable.getIntrinsicWidth() / f), (int) (drawable.getIntrinsicHeight() / f), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() / f), (int) (drawable.getIntrinsicHeight() / f));
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l1 */
    public static void m131707l1(final VText vText, final String str, final int i) {
        vText.post(new Runnable() { // from class: l.fmb
            @Override // java.lang.Runnable
            public final void run() {
                hmb.m131704i1(vText, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public static float m131708m1() {
        if (xdl0.m208408w0() < 960) {
            return 0.7f;
        }
        return xdl0.m208408w0() <= 1280 ? 0.8f : 1.0f;
    }

    @Deprecated
    /* JADX INFO: renamed from: n1 */
    public static int m131709n1(Act act) {
        return xdl0.m208331F0();
    }

    /* JADX INFO: renamed from: o1 */
    public static float m131710o1(int i, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186892f(i));
        return textPaint.measureText(str);
    }

    /* JADX INFO: renamed from: p1 */
    public static boolean m131711p1() {
        int iM208408w0 = xdl0.m208408w0();
        return iM208408w0 >= 960 && ((int) (((float) iM208408w0) / t100.m186889c().density)) <= 640;
    }

    /* JADX INFO: renamed from: q1 */
    public static boolean m131712q1() {
        return xdl0.m208408w0() < 960;
    }

    /* JADX INFO: renamed from: r1 */
    public static boolean m131713r1(float f, float f2) {
        if (xdl0.m208412y0() > f) {
            return (((float) xdl0.m208412y0()) / f) * f2 > ((float) (xdl0.m208408w0() * 2)) && f2 > ((float) xdl0.m208408w0()) && f2 / f > (((float) xdl0.m208408w0()) / ((float) xdl0.m208412y0())) * 2.0f;
        }
        return f2 > ((float) (xdl0.m208408w0() * 2)) && f2 / f > (((float) xdl0.m208408w0()) / ((float) xdl0.m208412y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: s1 */
    public static boolean m131714s1() {
        return ikf0.m136795i(xdl0.m208412y0()) >= 600.0f;
    }

    /* JADX INFO: renamed from: t1 */
    public static int m131715t1(int i) {
        return (int) (i / CoreModule.f17544b.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: u1 */
    public static int m131716u1(float f) {
        return (int) ((f / CoreModule.f17544b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* JADX INFO: renamed from: v1 */
    public static void m131717v1(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i) {
        if (NullChecker.m81303a(imageUri)) {
            qib0.f154691G.m102341Q0(vDraweeView, imageUri);
        } else {
            qib0.f154691G.m102354Y0(vDraweeView, i);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public static void m131718w1(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i) {
        if (NullChecker.m81303a(imageUri)) {
            qib0.f154691G.m102336O(vDraweeView, imageUri.formatted(), 2, 8);
        } else {
            qib0.f154691G.m102328K(vDraweeView, i, 2, 8);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m131719x1(Act act) {
        if (NullChecker.m81303a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.m81303a(actionMenuView)) {
                    xdl0.m208366b0(actionMenuView, new v9j() { // from class: l.emb
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return hmb.m131703h1(actionMenuView);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("setMenuColorForWhiteBar error: " + e.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: y1 */
    public static long m131720y1(String str) {
        return m131721z1(str, 0L);
    }

    /* JADX INFO: renamed from: z1 */
    public static long m131721z1(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                CrashHelper.m81296c(new IllegalArgumentException(String.format("Illegal string argument: can not parse string %s to long", str)));
            }
        }
        return j;
    }
}
