package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class vnb extends qnp0 {
    /* JADX INFO: renamed from: M */
    public static void m201946M(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ dgq0 m201947g1(View view, dgq0 dgq0Var) {
        view.setPadding(view.getPaddingLeft(), dgq0Var.m115680f(dgq0.C16531l.m115736e()).f170858b, view.getPaddingRight(), view.getPaddingBottom());
        return dgq0Var;
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ Boolean m201948h1(ActionMenuView actionMenuView) {
        for (int i = 0; i < actionMenuView.getChildCount(); i++) {
            View childAt = actionMenuView.getChildAt(i);
            if (childAt instanceof ActionMenuItemView) {
                ((ActionMenuItemView) childAt).setTextColor(CoreModule.m30933P().m143405a().mo34329Gl());
                break;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m201949i1(VText vText, int i, String str) {
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
    public static void m201950j1(View view) {
        if (view == null) {
            return;
        }
        kkl0.m150194y0(view, new il50() { // from class: l.unb
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view2, dgq0 dgq0Var) {
                return vnb.m201947g1(view2, dgq0Var);
            }
        });
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static Bitmap m201951k1(Drawable drawable) {
        boolean zM109764h = bnl0.m105592y0() < 1080;
        if (!zM109764h) {
            zM109764h = cgw.m109764h(CoreModule.f18263b);
        }
        float f = zM109764h ? 4.0f : 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (drawable.getIntrinsicWidth() / f), (int) (drawable.getIntrinsicHeight() / f), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_4444 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() / f), (int) (drawable.getIntrinsicHeight() / f));
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l1 */
    public static void m201952l1(final VText vText, final String str, final int i) {
        vText.post(new Runnable() { // from class: l.tnb
            @Override // java.lang.Runnable
            public final void run() {
                vnb.m201949i1(vText, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public static float m201953m1() {
        if (bnl0.m105588w0() < 960) {
            return 0.7f;
        }
        return bnl0.m105588w0() <= 1280 ? 0.8f : 1.0f;
    }

    @Deprecated
    /* JADX INFO: renamed from: n1 */
    public static int m201954n1(Act act) {
        return bnl0.m105511F0();
    }

    /* JADX INFO: renamed from: o1 */
    public static float m201955o1(int i, String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(i));
        return textPaint.measureText(str);
    }

    /* JADX INFO: renamed from: p1 */
    public static boolean m201956p1() {
        int iM105588w0 = bnl0.m105588w0();
        return iM105588w0 >= 960 && ((int) (((float) iM105588w0) / qa00.m175858c().density)) <= 640;
    }

    /* JADX INFO: renamed from: q1 */
    public static boolean m201957q1() {
        return bnl0.m105588w0() < 960;
    }

    /* JADX INFO: renamed from: r1 */
    public static boolean m201958r1(float f, float f2) {
        if (bnl0.m105592y0() > f) {
            return (((float) bnl0.m105592y0()) / f) * f2 > ((float) (bnl0.m105588w0() * 2)) && f2 > ((float) bnl0.m105588w0()) && f2 / f > (((float) bnl0.m105588w0()) / ((float) bnl0.m105592y0())) * 2.0f;
        }
        return f2 > ((float) (bnl0.m105588w0() * 2)) && f2 / f > (((float) bnl0.m105588w0()) / ((float) bnl0.m105592y0())) * 2.0f;
    }

    /* JADX INFO: renamed from: s1 */
    public static boolean m201959s1() {
        return rsf0.m182965i(bnl0.m105592y0()) >= 600.0f;
    }

    /* JADX INFO: renamed from: t1 */
    public static int m201960t1(int i) {
        return (int) (i / CoreModule.f18263b.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: u1 */
    public static int m201961u1(float f) {
        return (int) ((f / CoreModule.f18263b.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* JADX INFO: renamed from: v1 */
    public static void m201962v1(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i) {
        if (NullChecker.m82486a(imageUri)) {
            uqb0.f180374G.m127125Q0(vDraweeView, imageUri);
        } else {
            uqb0.f180374G.m127138Y0(vDraweeView, i);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public static void m201963w1(VDraweeView vDraweeView, Picture.ImageUri imageUri, int i) {
        if (NullChecker.m82486a(imageUri)) {
            uqb0.f180374G.m127120O(vDraweeView, imageUri.formatted(), 2, 8);
        } else {
            uqb0.f180374G.m127112K(vDraweeView, i, 2, 8);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m201964x1(Act act) {
        if (NullChecker.m82486a(act.toolbar())) {
            try {
                final ActionMenuView actionMenuView = (ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(act.toolbar());
                if (NullChecker.m82486a(actionMenuView)) {
                    bnl0.m105546b0(actionMenuView, new pcj() { // from class: l.snb
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return vnb.m201948h1(actionMenuView);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("setMenuColorForWhiteBar error: " + e.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: y1 */
    public static long m201965y1(String str) {
        return m201966z1(str, 0L);
    }

    /* JADX INFO: renamed from: z1 */
    public static long m201966z1(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                CrashHelper.m82479c(new IllegalArgumentException(String.format("Illegal string argument: can not parse string %s to long", str)));
            }
        }
        return j;
    }
}
