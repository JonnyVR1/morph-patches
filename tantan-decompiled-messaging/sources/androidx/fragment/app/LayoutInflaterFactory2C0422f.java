package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.seamless.xhtml.XHTML;
import p149l.w9c0;
import p149l.xjw;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C0422f implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final FragmentManager f2057a;

    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0424h f2058a;

        public a(C0424h c0424h) {
            this.f2058a = c0424h;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentM2766k = this.f2058a.m2766k();
            this.f2058a.m2768m();
            SpecialEffectsController.m2663n((ViewGroup) fragmentM2766k.mView.getParent(), LayoutInflaterFactory2C0422f.this.f2057a).m2674j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C0422f(FragmentManager fragmentManager) {
        this.f2057a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        C0424h c0424hM2594v;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2057a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, XHTML.ATTR.CLASS);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w9c0.f185332a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(w9c0.f185333b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(w9c0.f185334c, -1);
        String string = typedArrayObtainStyledAttributes.getString(w9c0.f185335d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C0421e.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentM2554h0 = resourceId != -1 ? this.f2057a.m2554h0(resourceId) : null;
        if (fragmentM2554h0 == null && string != null) {
            fragmentM2554h0 = this.f2057a.m2557i0(string);
        }
        if (fragmentM2554h0 == null && id != -1) {
            fragmentM2554h0 = this.f2057a.m2554h0(id);
        }
        if (fragmentM2554h0 == null) {
            fragmentM2554h0 = this.f2057a.m2583r0().instantiate(context.getClassLoader(), attributeValue);
            fragmentM2554h0.mFromLayout = true;
            fragmentM2554h0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentM2554h0.mContainerId = id;
            fragmentM2554h0.mTag = string;
            fragmentM2554h0.mInLayout = true;
            FragmentManager fragmentManager = this.f2057a;
            fragmentM2554h0.mFragmentManager = fragmentManager;
            fragmentM2554h0.mHost = fragmentManager.m2592u0();
            fragmentM2554h0.onInflate(this.f2057a.m2592u0().m196786f(), attributeSet, fragmentM2554h0.mSavedFragmentState);
            c0424hM2594v = this.f2057a.m2550g(fragmentM2554h0);
            if (FragmentManager.m2480G0(2)) {
                fragmentM2554h0.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (fragmentM2554h0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentM2554h0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f2057a;
            fragmentM2554h0.mFragmentManager = fragmentManager2;
            fragmentM2554h0.mHost = fragmentManager2.m2592u0();
            fragmentM2554h0.onInflate(this.f2057a.m2592u0().m196786f(), attributeSet, fragmentM2554h0.mSavedFragmentState);
            c0424hM2594v = this.f2057a.m2594v(fragmentM2554h0);
            if (FragmentManager.m2480G0(2)) {
                fragmentM2554h0.toString();
                Integer.toHexString(resourceId);
            }
        }
        fragmentM2554h0.mContainer = (ViewGroup) view;
        c0424hM2594v.m2768m();
        c0424hM2594v.m2765j();
        View view2 = fragmentM2554h0.mView;
        if (view2 == null) {
            xjw.m209754a("Fragment ", attributeValue, " did not create a view.");
            return null;
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentM2554h0.mView.getTag() == null) {
            fragmentM2554h0.mView.setTag(string);
        }
        fragmentM2554h0.mView.addOnAttachStateChangeListener(new a(c0424hM2594v));
        return fragmentM2554h0.mView;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
