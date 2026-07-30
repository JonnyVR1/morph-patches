package p149l;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.TextSwitcher;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public final class fr0 {

    /* JADX INFO: renamed from: l.fr0$a */
    public static class C16912a {

        /* JADX INFO: renamed from: a */
        public IntlPrivilegeDescListItem f98868a;

        /* JADX INFO: renamed from: b */
        public IntlPrivilegeDescListItem f98869b;

        /* JADX INFO: renamed from: c */
        public IntlPrivilegeDescListItem f98870c;

        /* JADX INFO: renamed from: d */
        public IntlPrivilegeDescListItem f98871d;
    }

    /* JADX INFO: renamed from: l.fr0$b */
    public static class C16913b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f98872a;

        /* JADX INFO: renamed from: b */
        public float f98873b;

        /* JADX INFO: renamed from: c */
        public final boolean f98874c;

        /* JADX INFO: renamed from: d */
        public final boolean f98875d;

        /* JADX INFO: renamed from: e */
        public Camera f98876e;

        public C16913b(boolean z, boolean z2) {
            this.f98874c = z;
            this.f98875d = z2;
        }

        /* JADX INFO: renamed from: a */
        public final float m122780a(float f) {
            boolean z = this.f98874c;
            boolean z2 = this.f98875d;
            if (z) {
                return z2 ? (1.0f - f) * (-90.0f) : (1.0f - f) * 90.0f;
            }
            return z2 ? f * 90.0f : f * (-90.0f);
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f98872a;
            float f3 = this.f98873b;
            Camera camera = this.f98876e;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            camera.rotateX(m122780a(f));
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f2, -f3);
            matrix.postTranslate(f2, f3);
        }

        @Override // android.view.animation.Animation
        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f98876e = new Camera();
            this.f98872a = i / 2.0f;
            this.f98873b = i2 / 2.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m122769a(int[] iArr, int i, Runnable runnable) {
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 < i || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: b */
    public static void m122770b(IntlPrivilegeDescListItem intlPrivilegeDescListItem, List<VText> list) {
        VText vText;
        if (intlPrivilegeDescListItem == null || (vText = intlPrivilegeDescListItem.f37154d) == null || vText.getVisibility() != 0 || vText.getText() == null || vText.getText().toString().isEmpty()) {
            return;
        }
        list.add(vText);
    }

    /* JADX INFO: renamed from: c */
    public static void m122771c(PurchaseType purchaseType, PurchaseType purchaseType2, C16912a c16912a, Runnable runnable) {
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType == purchaseType3 && sab0.m182904v(purchaseType2);
        if (purchaseType2 == purchaseType3 && purchaseType != null && (purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_LIKERS)) {
            z = true;
        }
        if (!z2 && !z) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<VText> listM122772d = m122772d(c16912a, z2);
        if (!listM122772d.isEmpty()) {
            m122776h(c16912a, listM122772d, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<VText> m122772d(C16912a c16912a, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            m122770b(c16912a.f98868a, arrayList);
            m122770b(c16912a.f98869b, arrayList);
        }
        m122770b(c16912a.f98870c, arrayList);
        m122770b(c16912a.f98871d, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static AnimationSet m122773e(C16913b c16913b, boolean z) {
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimationM122775g = m122775g(z ? 1.0f : -1.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(translateAnimationM122775g);
        animationSet.addAnimation(c16913b);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(650L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* JADX INFO: renamed from: f */
    public static AnimationSet m122774f(boolean z, boolean z2) {
        C16913b c16913b = new C16913b(z, z2);
        c16913b.setDuration(650L);
        c16913b.setInterpolator(new AccelerateDecelerateInterpolator());
        c16913b.setFillAfter(false);
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimationM122775g = m122775g(0.0f, z2 ? -1.0f : 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        animationSet.addAnimation(translateAnimationM122775g);
        animationSet.addAnimation(c16913b);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(650L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* JADX INFO: renamed from: g */
    public static TranslateAnimation m122775g(float f, float f2) {
        return new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f, 1, f2);
    }

    /* JADX INFO: renamed from: h */
    public static void m122776h(C16912a c16912a, List<VText> list, final Runnable runnable) {
        final int[] iArr = {0};
        final int size = list.size();
        for (VText vText : list) {
            Runnable runnable2 = new Runnable() { // from class: l.er0
                @Override // java.lang.Runnable
                public final void run() {
                    fr0.m122769a(iArr, size, runnable);
                }
            };
            IntlPrivilegeDescListItem intlPrivilegeDescListItem = c16912a.f98868a;
            if (intlPrivilegeDescListItem == null || vText != intlPrivilegeDescListItem.f37154d) {
                IntlPrivilegeDescListItem intlPrivilegeDescListItem2 = c16912a.f98869b;
                if (intlPrivilegeDescListItem2 == null || vText != intlPrivilegeDescListItem2.f37154d) {
                    IntlPrivilegeDescListItem intlPrivilegeDescListItem3 = c16912a.f98870c;
                    if (intlPrivilegeDescListItem3 == null || vText != intlPrivilegeDescListItem3.f37154d) {
                        IntlPrivilegeDescListItem intlPrivilegeDescListItem4 = c16912a.f98871d;
                        if (intlPrivilegeDescListItem4 != null && vText == intlPrivilegeDescListItem4.f37154d) {
                            intlPrivilegeDescListItem4.m56494f(vText, runnable2);
                        }
                    } else {
                        intlPrivilegeDescListItem3.m56494f(vText, runnable2);
                    }
                } else {
                    intlPrivilegeDescListItem2.m56494f(vText, runnable2);
                }
            } else {
                intlPrivilegeDescListItem.m56494f(vText, runnable2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m122777i(TextSwitcher textSwitcher) {
        C16913b c16913b = new C16913b(true, false);
        c16913b.setDuration(650L);
        c16913b.setInterpolator(new AccelerateDecelerateInterpolator());
        c16913b.setFillAfter(false);
        AnimationSet animationSetM122773e = m122773e(c16913b, false);
        AnimationSet animationSetM122774f = m122774f(false, false);
        textSwitcher.setInAnimation(animationSetM122773e);
        textSwitcher.setOutAnimation(animationSetM122774f);
    }

    /* JADX INFO: renamed from: j */
    public static void m122778j(TextSwitcher textSwitcher) {
        C16913b c16913b = new C16913b(true, true);
        c16913b.setDuration(300L);
        c16913b.setInterpolator(new AccelerateDecelerateInterpolator());
        c16913b.setFillAfter(false);
        AnimationSet animationSetM122773e = m122773e(c16913b, true);
        AnimationSet animationSetM122774f = m122774f(false, true);
        textSwitcher.setInAnimation(animationSetM122773e);
        textSwitcher.setOutAnimation(animationSetM122774f);
    }

    /* JADX INFO: renamed from: k */
    public static void m122779k(TextSwitcher textSwitcher, boolean z) {
        if (textSwitcher == null) {
            return;
        }
        if (z) {
            m122778j(textSwitcher);
        } else {
            m122777i(textSwitcher);
        }
    }
}
