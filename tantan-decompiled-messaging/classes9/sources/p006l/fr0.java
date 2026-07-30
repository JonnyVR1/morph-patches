package p006l;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.TextSwitcher;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import java.util.List;
import l.sab0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class fr0 {

    /* JADX INFO: renamed from: l.fr0$a */
    public static class C0731a {

        /* JADX INFO: renamed from: a */
        public IntlPrivilegeDescListItem f12859a;

        /* JADX INFO: renamed from: b */
        public IntlPrivilegeDescListItem f12860b;

        /* JADX INFO: renamed from: c */
        public IntlPrivilegeDescListItem f12861c;

        /* JADX INFO: renamed from: d */
        public IntlPrivilegeDescListItem f12862d;
    }

    /* JADX INFO: renamed from: l.fr0$b */
    public static class C0732b extends Animation {

        /* JADX INFO: renamed from: a */
        public float f12863a;

        /* JADX INFO: renamed from: b */
        public float f12864b;

        /* JADX INFO: renamed from: c */
        public final boolean f12865c;

        /* JADX INFO: renamed from: d */
        public final boolean f12866d;

        /* JADX INFO: renamed from: e */
        public Camera f12867e;

        public C0732b(boolean z, boolean z2) {
            this.f12865c = z;
            this.f12866d = z2;
        }

        /* JADX INFO: renamed from: a */
        public final float m15458a(float f) {
            boolean z = this.f12865c;
            boolean z2 = this.f12866d;
            if (z) {
                return z2 ? (1.0f - f) * (-90.0f) : (1.0f - f) * 90.0f;
            }
            return z2 ? f * 90.0f : f * (-90.0f);
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f12863a;
            float f3 = this.f12864b;
            Camera camera = this.f12867e;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            camera.rotateX(m15458a(f));
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f2, -f3);
            matrix.postTranslate(f2, f3);
        }

        @Override // android.view.animation.Animation
        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            this.f12867e = new Camera();
            this.f12863a = i / 2.0f;
            this.f12864b = i2 / 2.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15447a(int[] iArr, int i, Runnable runnable) {
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        if (i2 < i || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: b */
    public static void m15448b(IntlPrivilegeDescListItem intlPrivilegeDescListItem, List<VText> list) {
        VText vText;
        if (intlPrivilegeDescListItem == null || (vText = intlPrivilegeDescListItem.f6935d) == null || vText.getVisibility() != 0 || vText.getText() == null || vText.getText().toString().isEmpty()) {
            return;
        }
        list.add(vText);
    }

    /* JADX INFO: renamed from: c */
    public static void m15449c(PurchaseType purchaseType, PurchaseType purchaseType2, C0731a c0731a, Runnable runnable) {
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        boolean z = false;
        boolean z2 = purchaseType == purchaseType3 && sab0.v(purchaseType2);
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
        List<VText> listM15450d = m15450d(c0731a, z2);
        if (!listM15450d.isEmpty()) {
            m15454h(c0731a, listM15450d, runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<VText> m15450d(C0731a c0731a, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            m15448b(c0731a.f12859a, arrayList);
            m15448b(c0731a.f12860b, arrayList);
        }
        m15448b(c0731a.f12861c, arrayList);
        m15448b(c0731a.f12862d, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static AnimationSet m15451e(C0732b c0732b, boolean z) {
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimationM15453g = m15453g(z ? 1.0f : -1.0f, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(translateAnimationM15453g);
        animationSet.addAnimation(c0732b);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(650L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* JADX INFO: renamed from: f */
    public static AnimationSet m15452f(boolean z, boolean z2) {
        C0732b c0732b = new C0732b(z, z2);
        c0732b.setDuration(650L);
        c0732b.setInterpolator(new AccelerateDecelerateInterpolator());
        c0732b.setFillAfter(false);
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimationM15453g = m15453g(0.0f, z2 ? -1.0f : 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        animationSet.addAnimation(translateAnimationM15453g);
        animationSet.addAnimation(c0732b);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(650L);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.setFillAfter(false);
        return animationSet;
    }

    /* JADX INFO: renamed from: g */
    public static TranslateAnimation m15453g(float f, float f2) {
        return new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f, 1, f2);
    }

    /* JADX INFO: renamed from: h */
    public static void m15454h(C0731a c0731a, List<VText> list, final Runnable runnable) {
        final int[] iArr = {0};
        final int size = list.size();
        for (VText vText : list) {
            Runnable runnable2 = new Runnable() { // from class: l.er0
                @Override // java.lang.Runnable
                public final void run() {
                    fr0.m15447a(iArr, size, runnable);
                }
            };
            IntlPrivilegeDescListItem intlPrivilegeDescListItem = c0731a.f12859a;
            if (intlPrivilegeDescListItem == null || vText != intlPrivilegeDescListItem.f6935d) {
                IntlPrivilegeDescListItem intlPrivilegeDescListItem2 = c0731a.f12860b;
                if (intlPrivilegeDescListItem2 == null || vText != intlPrivilegeDescListItem2.f6935d) {
                    IntlPrivilegeDescListItem intlPrivilegeDescListItem3 = c0731a.f12861c;
                    if (intlPrivilegeDescListItem3 == null || vText != intlPrivilegeDescListItem3.f6935d) {
                        IntlPrivilegeDescListItem intlPrivilegeDescListItem4 = c0731a.f12862d;
                        if (intlPrivilegeDescListItem4 != null && vText == intlPrivilegeDescListItem4.f6935d) {
                            intlPrivilegeDescListItem4.m9935f(vText, runnable2);
                        }
                    } else {
                        intlPrivilegeDescListItem3.m9935f(vText, runnable2);
                    }
                } else {
                    intlPrivilegeDescListItem2.m9935f(vText, runnable2);
                }
            } else {
                intlPrivilegeDescListItem.m9935f(vText, runnable2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m15455i(TextSwitcher textSwitcher) {
        C0732b c0732b = new C0732b(true, false);
        c0732b.setDuration(650L);
        c0732b.setInterpolator(new AccelerateDecelerateInterpolator());
        c0732b.setFillAfter(false);
        AnimationSet animationSetM15451e = m15451e(c0732b, false);
        AnimationSet animationSetM15452f = m15452f(false, false);
        textSwitcher.setInAnimation(animationSetM15451e);
        textSwitcher.setOutAnimation(animationSetM15452f);
    }

    /* JADX INFO: renamed from: j */
    public static void m15456j(TextSwitcher textSwitcher) {
        C0732b c0732b = new C0732b(true, true);
        c0732b.setDuration(300L);
        c0732b.setInterpolator(new AccelerateDecelerateInterpolator());
        c0732b.setFillAfter(false);
        AnimationSet animationSetM15451e = m15451e(c0732b, true);
        AnimationSet animationSetM15452f = m15452f(false, true);
        textSwitcher.setInAnimation(animationSetM15451e);
        textSwitcher.setOutAnimation(animationSetM15452f);
    }

    /* JADX INFO: renamed from: k */
    public static void m15457k(TextSwitcher textSwitcher, boolean z) {
        if (textSwitcher == null) {
            return;
        }
        if (z) {
            m15456j(textSwitcher);
        } else {
            m15455i(textSwitcher);
        }
    }
}
