package p153l;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.TextSwitcher;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public final class jr0 {

    /* JADX INFO: renamed from: l.jr0$a */
    public static class C18008a {

        /* JADX INFO: renamed from: a */
        public IntlPrivilegeDescListItem f122265a;

        /* JADX INFO: renamed from: b */
        public IntlPrivilegeDescListItem f122266b;

        /* JADX INFO: renamed from: c */
        public IntlPrivilegeDescListItem f122267c;

        /* JADX INFO: renamed from: d */
        public IntlPrivilegeDescListItem f122268d;
    }

    /* JADX INFO: renamed from: l.jr0$b */
    public static class C18009b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f122269a;

        /* JADX INFO: renamed from: b */
        public float f122270b;

        /* JADX INFO: renamed from: c */
        public final boolean f122271c;

        /* JADX INFO: renamed from: d */
        public final boolean f122272d;

        /* JADX INFO: renamed from: e */
        public Camera f122273e;

        public C18009b(boolean z, boolean z2) {
            this.f122271c = z;
            this.f122272d = z2;
        }

        /* JADX INFO: renamed from: a */
        public final float m146654a(float f) {
            boolean z = this.f122271c;
            boolean z2 = this.f122272d;
            if (z) {
                return z2 ? (1.0f - f) * (-90.0f) : (1.0f - f) * 90.0f;
            }
            return z2 ? f * 90.0f : f * (-90.0f);
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f122269a;
            float f3 = this.f122270b;
            Camera camera = this.f122273e;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            camera.rotateX(m146654a(f));
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f2, -f3);
            matrix.postTranslate(f2, f3);
        }

        @Override // android.view.animation.Animation
        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f122273e = new Camera();
            this.f122269a = i / 2.0f;
            this.f122270b = i2 / 2.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m146643a(int[] iArr, int i, Runnable runnable) {
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 < i || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: b */
    public static void m146644b(IntlPrivilegeDescListItem intlPrivilegeDescListItem, List<VText> list) {
        VText vText;
        if (intlPrivilegeDescListItem == null || (vText = intlPrivilegeDescListItem.f38002d) == null || vText.getVisibility() != 0 || vText.getText() == null || vText.getText().toString().isEmpty()) {
            return;
        }
        list.add(vText);
    }

    /* JADX INFO: renamed from: c */
    public static void m146645c(PurchaseType purchaseType, PurchaseType purchaseType2, C18008a c18008a, Runnable runnable) {
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType == purchaseType3 && wib0.m206578v(purchaseType2);
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
        List<VText> listM146646d = m146646d(c18008a, z2);
        if (!listM146646d.isEmpty()) {
            m146650h(c18008a, listM146646d, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<VText> m146646d(C18008a c18008a, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            m146644b(c18008a.f122265a, arrayList);
            m146644b(c18008a.f122266b, arrayList);
        }
        m146644b(c18008a.f122267c, arrayList);
        m146644b(c18008a.f122268d, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static AnimationSet m146647e(C18009b c18009b, boolean z) {
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimationM146649g = m146649g(z ? 1.0f : -1.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(translateAnimationM146649g);
        animationSet.addAnimation(c18009b);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(650L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* JADX INFO: renamed from: f */
    public static AnimationSet m146648f(boolean z, boolean z2) {
        C18009b c18009b = new C18009b(z, z2);
        c18009b.setDuration(650L);
        c18009b.setInterpolator(new AccelerateDecelerateInterpolator());
        c18009b.setFillAfter(false);
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimationM146649g = m146649g(0.0f, z2 ? -1.0f : 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        animationSet.addAnimation(translateAnimationM146649g);
        animationSet.addAnimation(c18009b);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(650L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* JADX INFO: renamed from: g */
    public static TranslateAnimation m146649g(float f, float f2) {
        return new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f, 1, f2);
    }

    /* JADX INFO: renamed from: h */
    public static void m146650h(C18008a c18008a, List<VText> list, final Runnable runnable) {
        final int[] iArr = {0};
        final int size = list.size();
        for (VText vText : list) {
            Runnable runnable2 = new Runnable() { // from class: l.ir0
                @Override // java.lang.Runnable
                public final void run() {
                    jr0.m146643a(iArr, size, runnable);
                }
            };
            IntlPrivilegeDescListItem intlPrivilegeDescListItem = c18008a.f122265a;
            if (intlPrivilegeDescListItem == null || vText != intlPrivilegeDescListItem.f38002d) {
                IntlPrivilegeDescListItem intlPrivilegeDescListItem2 = c18008a.f122266b;
                if (intlPrivilegeDescListItem2 == null || vText != intlPrivilegeDescListItem2.f38002d) {
                    IntlPrivilegeDescListItem intlPrivilegeDescListItem3 = c18008a.f122267c;
                    if (intlPrivilegeDescListItem3 == null || vText != intlPrivilegeDescListItem3.f38002d) {
                        IntlPrivilegeDescListItem intlPrivilegeDescListItem4 = c18008a.f122268d;
                        if (intlPrivilegeDescListItem4 != null && vText == intlPrivilegeDescListItem4.f38002d) {
                            intlPrivilegeDescListItem4.m57677f(vText, runnable2);
                        }
                    } else {
                        intlPrivilegeDescListItem3.m57677f(vText, runnable2);
                    }
                } else {
                    intlPrivilegeDescListItem2.m57677f(vText, runnable2);
                }
            } else {
                intlPrivilegeDescListItem.m57677f(vText, runnable2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m146651i(TextSwitcher textSwitcher) {
        C18009b c18009b = new C18009b(true, false);
        c18009b.setDuration(650L);
        c18009b.setInterpolator(new AccelerateDecelerateInterpolator());
        c18009b.setFillAfter(false);
        AnimationSet animationSetM146647e = m146647e(c18009b, false);
        AnimationSet animationSetM146648f = m146648f(false, false);
        textSwitcher.setInAnimation(animationSetM146647e);
        textSwitcher.setOutAnimation(animationSetM146648f);
    }

    /* JADX INFO: renamed from: j */
    public static void m146652j(TextSwitcher textSwitcher) {
        C18009b c18009b = new C18009b(true, true);
        c18009b.setDuration(300L);
        c18009b.setInterpolator(new AccelerateDecelerateInterpolator());
        c18009b.setFillAfter(false);
        AnimationSet animationSetM146647e = m146647e(c18009b, true);
        AnimationSet animationSetM146648f = m146648f(false, true);
        textSwitcher.setInAnimation(animationSetM146647e);
        textSwitcher.setOutAnimation(animationSetM146648f);
    }

    /* JADX INFO: renamed from: k */
    public static void m146653k(TextSwitcher textSwitcher, boolean z) {
        if (textSwitcher == null) {
            return;
        }
        if (z) {
            m146652j(textSwitcher);
        } else {
            m146651i(textSwitcher);
        }
    }
}
