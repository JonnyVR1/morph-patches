package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.SkipPosition;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class cr4 extends u7j0 {

    /* JADX INFO: renamed from: d */
    public static final String[] f82149d = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: e */
    public static final Property<Drawable, PointF> f82150e = new C16216b(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: f */
    public static final Property<C16225k, PointF> f82151f = new C16217c(PointF.class, "topLeft");

    /* JADX INFO: renamed from: g */
    public static final Property<C16225k, PointF> f82152g = new C16218d(PointF.class, SkipPosition.bottomRight);

    /* JADX INFO: renamed from: h */
    public static final Property<View, PointF> f82153h = new C16219e(PointF.class, SkipPosition.bottomRight);

    /* JADX INFO: renamed from: i */
    public static final Property<View, PointF> f82154i = new C16220f(PointF.class, "topLeft");

    /* JADX INFO: renamed from: j */
    public static final Property<View, PointF> f82155j = new C16221g(PointF.class, "position");

    /* JADX INFO: renamed from: k */
    public static yic0 f82156k = new yic0();

    /* JADX INFO: renamed from: a */
    public int[] f82157a = new int[2];

    /* JADX INFO: renamed from: b */
    public boolean f82158b = false;

    /* JADX INFO: renamed from: c */
    public boolean f82159c = false;

    /* JADX INFO: renamed from: l.cr4$a */
    public class C16215a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f82160a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BitmapDrawable f82161b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f82162c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f82163d;

        public C16215a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f82160a = viewGroup;
            this.f82161b = bitmapDrawable;
            this.f82162c = view;
            this.f82163d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            del0.m111269b(this.f82160a).mo202576a(this.f82161b);
            del0.m111274g(this.f82162c, this.f82163d);
        }
    }

    /* JADX INFO: renamed from: l.cr4$b */
    public static class C16216b extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a */
        public Rect f82165a;

        public C16216b(Class cls, String str) {
            super(cls, str);
            this.f82165a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f82165a);
            Rect rect = this.f82165a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f82165a);
            this.f82165a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f82165a);
        }
    }

    /* JADX INFO: renamed from: l.cr4$c */
    public static class C16217c extends Property<C16225k, PointF> {
        public C16217c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C16225k c16225k) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C16225k c16225k, PointF pointF) {
            c16225k.m108343c(pointF);
        }
    }

    /* JADX INFO: renamed from: l.cr4$d */
    public static class C16218d extends Property<C16225k, PointF> {
        public C16218d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C16225k c16225k) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C16225k c16225k, PointF pointF) {
            c16225k.m108341a(pointF);
        }
    }

    /* JADX INFO: renamed from: l.cr4$e */
    public static class C16219e extends Property<View, PointF> {
        public C16219e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            del0.m111273f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: l.cr4$f */
    public static class C16220f extends Property<View, PointF> {
        public C16220f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            del0.m111273f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: l.cr4$g */
    public static class C16221g extends Property<View, PointF> {
        public C16221g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            del0.m111273f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: l.cr4$h */
    public class C16222h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C16225k f82166a;
        private C16225k mViewBounds;

        public C16222h(C16225k c16225k) {
            this.f82166a = c16225k;
            this.mViewBounds = c16225k;
        }
    }

    /* JADX INFO: renamed from: l.cr4$i */
    public class C16223i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f82168a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f82169b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rect f82170c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f82171d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f82172e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f82173f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f82174g;

        public C16223i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f82169b = view;
            this.f82170c = rect;
            this.f82171d = i;
            this.f82172e = i2;
            this.f82173f = i3;
            this.f82174g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f82168a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f82168a) {
                return;
            }
            gbl0.m125213p0(this.f82169b, this.f82170c);
            del0.m111273f(this.f82169b, this.f82171d, this.f82172e, this.f82173f, this.f82174g);
        }
    }

    /* JADX INFO: renamed from: l.cr4$j */
    public class C16224j extends u8j0 {

        /* JADX INFO: renamed from: a */
        public boolean f82176a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f82177b;

        public C16224j(ViewGroup viewGroup) {
            this.f82177b = viewGroup;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: b */
        public void mo100097b(@NonNull u7j0 u7j0Var) {
            zbl0.m217912c(this.f82177b, false);
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(@NonNull u7j0 u7j0Var) {
            if (!this.f82176a) {
                zbl0.m217912c(this.f82177b, false);
            }
            u7j0Var.removeListener(this);
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: d */
        public void mo100098d(@NonNull u7j0 u7j0Var) {
            zbl0.m217912c(this.f82177b, true);
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: e */
        public void mo100099e(@NonNull u7j0 u7j0Var) {
            zbl0.m217912c(this.f82177b, false);
            this.f82176a = true;
        }
    }

    /* JADX INFO: renamed from: l.cr4$k */
    public static class C16225k {

        /* JADX INFO: renamed from: a */
        public int f82179a;

        /* JADX INFO: renamed from: b */
        public int f82180b;

        /* JADX INFO: renamed from: c */
        public int f82181c;

        /* JADX INFO: renamed from: d */
        public int f82182d;

        /* JADX INFO: renamed from: e */
        public View f82183e;

        /* JADX INFO: renamed from: f */
        public int f82184f;

        /* JADX INFO: renamed from: g */
        public int f82185g;

        public C16225k(View view) {
            this.f82183e = view;
        }

        /* JADX INFO: renamed from: a */
        public void m108341a(PointF pointF) {
            this.f82181c = Math.round(pointF.x);
            this.f82182d = Math.round(pointF.y);
            int i = this.f82185g + 1;
            this.f82185g = i;
            if (this.f82184f == i) {
                m108342b();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m108342b() {
            del0.m111273f(this.f82183e, this.f82179a, this.f82180b, this.f82181c, this.f82182d);
            this.f82184f = 0;
            this.f82185g = 0;
        }

        /* JADX INFO: renamed from: c */
        public void m108343c(PointF pointF) {
            this.f82179a = Math.round(pointF.x);
            this.f82180b = Math.round(pointF.y);
            int i = this.f82184f + 1;
            this.f82184f = i;
            if (i == this.f82185g) {
                m108342b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m108328a(View view, View view2) {
        if (!this.f82159c) {
            return true;
        }
        g9j0 matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            return view == view2;
        }
        return view2 == matchedTransitionValues.f101571b;
    }

    @Override // p149l.u7j0
    public void captureEndValues(@NonNull g9j0 g9j0Var) {
        captureValues(g9j0Var);
    }

    @Override // p149l.u7j0
    public void captureStartValues(@NonNull g9j0 g9j0Var) {
        captureValues(g9j0Var);
    }

    public final void captureValues(g9j0 g9j0Var) {
        View view = g9j0Var.f101571b;
        if (!gbl0.m125171P(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        g9j0Var.f101570a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        g9j0Var.f101570a.put("android:changeBounds:parent", g9j0Var.f101571b.getParent());
        if (this.f82159c) {
            g9j0Var.f101571b.getLocationInWindow(this.f82157a);
            g9j0Var.f101570a.put("android:changeBounds:windowX", Integer.valueOf(this.f82157a[0]));
            g9j0Var.f101570a.put("android:changeBounds:windowY", Integer.valueOf(this.f82157a[1]));
        }
        if (this.f82158b) {
            g9j0Var.f101570a.put("android:changeBounds:clip", gbl0.m125216r(view));
        }
    }

    @Override // p149l.u7j0
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable g9j0 g9j0Var, @Nullable g9j0 g9j0Var2) {
        Animator animator;
        int i;
        int i2;
        Rect rect;
        Rect rect2;
        View view;
        ObjectAnimator objectAnimator;
        Animator animatorM120087c;
        if (g9j0Var == null || g9j0Var2 == null) {
            return null;
        }
        Map<String, Object> map = g9j0Var.f101570a;
        Map<String, Object> map2 = g9j0Var2.f101570a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = g9j0Var2.f101571b;
        boolean zM108328a = m108328a(viewGroup2, viewGroup3);
        Map<String, Object> map3 = g9j0Var.f101570a;
        if (zM108328a) {
            Rect rect3 = (Rect) map3.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) g9j0Var2.f101570a.get("android:changeBounds:bounds");
            int i3 = rect3.left;
            int i4 = rect4.left;
            int i5 = rect3.top;
            int i6 = rect4.top;
            int i7 = rect3.right;
            int i8 = rect4.right;
            int i9 = rect3.bottom;
            int i10 = rect4.bottom;
            int i11 = i7 - i3;
            animator = null;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect5 = (Rect) g9j0Var.f101570a.get("android:changeBounds:clip");
            Rect rect6 = (Rect) g9j0Var2.f101570a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (i7 != i8 || i9 != i10) {
                    i++;
                }
            }
            if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                i++;
            }
            if (i > 0) {
                if (this.f82158b) {
                    del0.m111273f(view2, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    ObjectAnimator objectAnimatorM133751a = (i3 == i4 && i5 == i6) ? null : i050.m133751a(view2, f82155j, getPathMotion().mo192140a(i3, i5, i4, i6));
                    if (rect5 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                    }
                    if (rect6 == null) {
                        rect = rect5;
                        rect2 = new Rect(i2, i2, i13, i14);
                    } else {
                        rect = rect5;
                        rect2 = rect6;
                    }
                    if (rect.equals(rect2)) {
                        view = view2;
                        objectAnimator = null;
                    } else {
                        gbl0.m125213p0(view2, rect);
                        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view2, "clipBounds", f82156k, rect, rect2);
                        C16223i c16223i = new C16223i(view2, rect6, i4, i6, i8, i10);
                        view = view2;
                        objectAnimatorOfObject.addListener(c16223i);
                        objectAnimator = objectAnimatorOfObject;
                    }
                    animatorM120087c = f9j0.m120087c(objectAnimatorM133751a, objectAnimator);
                } else {
                    del0.m111273f(view2, i3, i5, i7, i9);
                    if (i != 2) {
                        animatorM120087c = (i3 == i4 && i5 == i6) ? i050.m133751a(view2, f82153h, getPathMotion().mo192140a(i7, i9, i8, i10)) : i050.m133751a(view2, f82154i, getPathMotion().mo192140a(i3, i5, i4, i6));
                    } else if (i11 == i13 && i12 == i14) {
                        animatorM120087c = i050.m133751a(view2, f82155j, getPathMotion().mo192140a(i3, i5, i4, i6));
                    } else {
                        C16225k c16225k = new C16225k(view2);
                        ObjectAnimator objectAnimatorM133751a2 = i050.m133751a(c16225k, f82151f, getPathMotion().mo192140a(i3, i5, i4, i6));
                        ObjectAnimator objectAnimatorM133751a3 = i050.m133751a(c16225k, f82152g, getPathMotion().mo192140a(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorM133751a2, objectAnimatorM133751a3);
                        animatorSet.addListener(new C16222h(c16225k));
                        animatorM120087c = animatorSet;
                    }
                    view = view2;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    zbl0.m217912c(viewGroup4, true);
                    addListener(new C16224j(viewGroup4));
                }
                return animatorM120087c;
            }
        } else {
            animator = null;
            int iIntValue = ((Integer) map3.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) g9j0Var.f101570a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) g9j0Var2.f101570a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) g9j0Var2.f101570a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue != iIntValue3 || iIntValue2 != iIntValue4) {
                viewGroup.getLocationInWindow(this.f82157a);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(bitmapCreateBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                float fM111270c = del0.m111270c(view2);
                del0.m111274g(view2, 0.0f);
                del0.m111269b(viewGroup).mo202577b(bitmapDrawable);
                va60 pathMotion = getPathMotion();
                int[] iArr = this.f82157a;
                int i15 = iArr[0];
                int i16 = iArr[1];
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, wya0.m206095a(f82150e, pathMotion.mo192140a(iIntValue - i15, iIntValue2 - i16, iIntValue3 - i15, iIntValue4 - i16)));
                objectAnimatorOfPropertyValuesHolder.addListener(new C16215a(viewGroup, bitmapDrawable, view2, fM111270c));
                return objectAnimatorOfPropertyValuesHolder;
            }
        }
        return animator;
    }

    @Override // p149l.u7j0
    @Nullable
    public String[] getTransitionProperties() {
        return f82149d;
    }
}
