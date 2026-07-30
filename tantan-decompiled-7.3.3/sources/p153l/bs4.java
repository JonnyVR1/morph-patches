package p153l;

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
import com.p051p1.mobile.putong.data.SkipPosition;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class bs4 extends ygj0 {

    /* JADX INFO: renamed from: d */
    public static final String[] f78087d = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: e */
    public static final Property<Drawable, PointF> f78088e = new C16101b(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: f */
    public static final Property<C16110k, PointF> f78089f = new C16102c(PointF.class, "topLeft");

    /* JADX INFO: renamed from: g */
    public static final Property<C16110k, PointF> f78090g = new C16103d(PointF.class, SkipPosition.bottomRight);

    /* JADX INFO: renamed from: h */
    public static final Property<View, PointF> f78091h = new C16104e(PointF.class, SkipPosition.bottomRight);

    /* JADX INFO: renamed from: i */
    public static final Property<View, PointF> f78092i = new C16105f(PointF.class, "topLeft");

    /* JADX INFO: renamed from: j */
    public static final Property<View, PointF> f78093j = new C16106g(PointF.class, "position");

    /* JADX INFO: renamed from: k */
    public static frc0 f78094k = new frc0();

    /* JADX INFO: renamed from: a */
    public int[] f78095a = new int[2];

    /* JADX INFO: renamed from: b */
    public boolean f78096b = false;

    /* JADX INFO: renamed from: c */
    public boolean f78097c = false;

    /* JADX INFO: renamed from: l.bs4$a */
    public class C16100a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f78098a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BitmapDrawable f78099b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f78100c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f78101d;

        public C16100a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f78098a = viewGroup;
            this.f78099b = bitmapDrawable;
            this.f78100c = view;
            this.f78101d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            hnl0.m136148b(this.f78098a).mo98689a(this.f78099b);
            hnl0.m136153g(this.f78100c, this.f78101d);
        }
    }

    /* JADX INFO: renamed from: l.bs4$b */
    public static class C16101b extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a */
        public Rect f78103a;

        public C16101b(Class cls, String str) {
            super(cls, str);
            this.f78103a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f78103a);
            Rect rect = this.f78103a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f78103a);
            this.f78103a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f78103a);
        }
    }

    /* JADX INFO: renamed from: l.bs4$c */
    public static class C16102c extends Property<C16110k, PointF> {
        public C16102c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C16110k c16110k) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C16110k c16110k, PointF pointF) {
            c16110k.m106216c(pointF);
        }
    }

    /* JADX INFO: renamed from: l.bs4$d */
    public static class C16103d extends Property<C16110k, PointF> {
        public C16103d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C16110k c16110k) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C16110k c16110k, PointF pointF) {
            c16110k.m106214a(pointF);
        }
    }

    /* JADX INFO: renamed from: l.bs4$e */
    public static class C16104e extends Property<View, PointF> {
        public C16104e(Class cls, String str) {
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
            hnl0.m136152f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: l.bs4$f */
    public static class C16105f extends Property<View, PointF> {
        public C16105f(Class cls, String str) {
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
            hnl0.m136152f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: l.bs4$g */
    public static class C16106g extends Property<View, PointF> {
        public C16106g(Class cls, String str) {
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
            hnl0.m136152f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: l.bs4$h */
    public class C16107h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C16110k f78104a;
        private C16110k mViewBounds;

        public C16107h(C16110k c16110k) {
            this.f78104a = c16110k;
            this.mViewBounds = c16110k;
        }
    }

    /* JADX INFO: renamed from: l.bs4$i */
    public class C16108i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f78106a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f78107b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rect f78108c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f78109d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f78110e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f78111f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f78112g;

        public C16108i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f78107b = view;
            this.f78108c = rect;
            this.f78109d = i;
            this.f78110e = i2;
            this.f78111f = i3;
            this.f78112g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f78106a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f78106a) {
                return;
            }
            kkl0.m150176p0(this.f78107b, this.f78108c);
            hnl0.m136152f(this.f78107b, this.f78109d, this.f78110e, this.f78111f, this.f78112g);
        }
    }

    /* JADX INFO: renamed from: l.bs4$j */
    public class C16109j extends yhj0 {

        /* JADX INFO: renamed from: a */
        public boolean f78114a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f78115b;

        public C16109j(ViewGroup viewGroup) {
            this.f78115b = viewGroup;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: b */
        public void mo106210b(@NonNull ygj0 ygj0Var) {
            dll0.m116772c(this.f78115b, false);
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(@NonNull ygj0 ygj0Var) {
            if (!this.f78114a) {
                dll0.m116772c(this.f78115b, false);
            }
            ygj0Var.removeListener(this);
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: d */
        public void mo106212d(@NonNull ygj0 ygj0Var) {
            dll0.m116772c(this.f78115b, true);
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: e */
        public void mo106213e(@NonNull ygj0 ygj0Var) {
            dll0.m116772c(this.f78115b, false);
            this.f78114a = true;
        }
    }

    /* JADX INFO: renamed from: l.bs4$k */
    public static class C16110k {

        /* JADX INFO: renamed from: a */
        public int f78117a;

        /* JADX INFO: renamed from: b */
        public int f78118b;

        /* JADX INFO: renamed from: c */
        public int f78119c;

        /* JADX INFO: renamed from: d */
        public int f78120d;

        /* JADX INFO: renamed from: e */
        public View f78121e;

        /* JADX INFO: renamed from: f */
        public int f78122f;

        /* JADX INFO: renamed from: g */
        public int f78123g;

        public C16110k(View view) {
            this.f78121e = view;
        }

        /* JADX INFO: renamed from: a */
        public void m106214a(PointF pointF) {
            this.f78119c = Math.round(pointF.x);
            this.f78120d = Math.round(pointF.y);
            int i = this.f78123g + 1;
            this.f78123g = i;
            if (this.f78122f == i) {
                m106215b();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m106215b() {
            hnl0.m136152f(this.f78121e, this.f78117a, this.f78118b, this.f78119c, this.f78120d);
            this.f78122f = 0;
            this.f78123g = 0;
        }

        /* JADX INFO: renamed from: c */
        public void m106216c(PointF pointF) {
            this.f78117a = Math.round(pointF.x);
            this.f78118b = Math.round(pointF.y);
            int i = this.f78122f + 1;
            this.f78122f = i;
            if (i == this.f78123g) {
                m106215b();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m106197a(View view, View view2) {
        if (!this.f78097c) {
            return true;
        }
        kij0 matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            return view == view2;
        }
        return view2 == matchedTransitionValues.f127001b;
    }

    @Override // p153l.ygj0
    public void captureEndValues(@NonNull kij0 kij0Var) {
        captureValues(kij0Var);
    }

    @Override // p153l.ygj0
    public void captureStartValues(@NonNull kij0 kij0Var) {
        captureValues(kij0Var);
    }

    public final void captureValues(kij0 kij0Var) {
        View view = kij0Var.f127001b;
        if (!kkl0.m150134P(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        kij0Var.f127000a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        kij0Var.f127000a.put("android:changeBounds:parent", kij0Var.f127001b.getParent());
        if (this.f78097c) {
            kij0Var.f127001b.getLocationInWindow(this.f78095a);
            kij0Var.f127000a.put("android:changeBounds:windowX", Integer.valueOf(this.f78095a[0]));
            kij0Var.f127000a.put("android:changeBounds:windowY", Integer.valueOf(this.f78095a[1]));
        }
        if (this.f78096b) {
            kij0Var.f127000a.put("android:changeBounds:clip", kkl0.m150179r(view));
        }
    }

    @Override // p153l.ygj0
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable kij0 kij0Var, @Nullable kij0 kij0Var2) {
        Animator animator;
        int i;
        int i2;
        Rect rect;
        Rect rect2;
        View view;
        ObjectAnimator objectAnimator;
        Animator animatorM144982c;
        if (kij0Var == null || kij0Var2 == null) {
            return null;
        }
        Map<String, Object> map = kij0Var.f127000a;
        Map<String, Object> map2 = kij0Var2.f127000a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = kij0Var2.f127001b;
        boolean zM106197a = m106197a(viewGroup2, viewGroup3);
        Map<String, Object> map3 = kij0Var.f127000a;
        if (zM106197a) {
            Rect rect3 = (Rect) map3.get("android:changeBounds:bounds");
            Rect rect4 = (Rect) kij0Var2.f127000a.get("android:changeBounds:bounds");
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
            Rect rect5 = (Rect) kij0Var.f127000a.get("android:changeBounds:clip");
            Rect rect6 = (Rect) kij0Var2.f127000a.get("android:changeBounds:clip");
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
                if (this.f78096b) {
                    hnl0.m136152f(view2, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    ObjectAnimator objectAnimatorM209688a = (i3 == i4 && i5 == i6) ? null : x850.m209688a(view2, f78093j, getPathMotion().mo98352a(i3, i5, i4, i6));
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
                        kkl0.m150176p0(view2, rect);
                        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view2, "clipBounds", f78094k, rect, rect2);
                        C16108i c16108i = new C16108i(view2, rect6, i4, i6, i8, i10);
                        view = view2;
                        objectAnimatorOfObject.addListener(c16108i);
                        objectAnimator = objectAnimatorOfObject;
                    }
                    animatorM144982c = jij0.m144982c(objectAnimatorM209688a, objectAnimator);
                } else {
                    hnl0.m136152f(view2, i3, i5, i7, i9);
                    if (i != 2) {
                        animatorM144982c = (i3 == i4 && i5 == i6) ? x850.m209688a(view2, f78091h, getPathMotion().mo98352a(i7, i9, i8, i10)) : x850.m209688a(view2, f78092i, getPathMotion().mo98352a(i3, i5, i4, i6));
                    } else if (i11 == i13 && i12 == i14) {
                        animatorM144982c = x850.m209688a(view2, f78093j, getPathMotion().mo98352a(i3, i5, i4, i6));
                    } else {
                        C16110k c16110k = new C16110k(view2);
                        ObjectAnimator objectAnimatorM209688a2 = x850.m209688a(c16110k, f78089f, getPathMotion().mo98352a(i3, i5, i4, i6));
                        ObjectAnimator objectAnimatorM209688a3 = x850.m209688a(c16110k, f78090g, getPathMotion().mo98352a(i7, i9, i8, i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorM209688a2, objectAnimatorM209688a3);
                        animatorSet.addListener(new C16107h(c16110k));
                        animatorM144982c = animatorSet;
                    }
                    view = view2;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    dll0.m116772c(viewGroup4, true);
                    addListener(new C16109j(viewGroup4));
                }
                return animatorM144982c;
            }
        } else {
            animator = null;
            int iIntValue = ((Integer) map3.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) kij0Var.f127000a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) kij0Var2.f127000a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) kij0Var2.f127000a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue != iIntValue3 || iIntValue2 != iIntValue4) {
                viewGroup.getLocationInWindow(this.f78095a);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(bitmapCreateBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                float fM136149c = hnl0.m136149c(view2);
                hnl0.m136153g(view2, 0.0f);
                hnl0.m136148b(viewGroup).mo98690b(bitmapDrawable);
                aj60 pathMotion = getPathMotion();
                int[] iArr = this.f78095a;
                int i15 = iArr[0];
                int i16 = iArr[1];
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, a7b0.m96355a(f78088e, pathMotion.mo98352a(iIntValue - i15, iIntValue2 - i16, iIntValue3 - i15, iIntValue4 - i16)));
                objectAnimatorOfPropertyValuesHolder.addListener(new C16100a(viewGroup, bitmapDrawable, view2, fM136149c));
                return objectAnimatorOfPropertyValuesHolder;
            }
        }
        return animator;
    }

    @Override // p153l.ygj0
    @Nullable
    public String[] getTransitionProperties() {
        return f78087d;
    }
}
