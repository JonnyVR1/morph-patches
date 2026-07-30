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
import p153l.cic0;
import p153l.wmw;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C0423f implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a */
    public final FragmentManager f2057a;

    /* JADX INFO: renamed from: androidx.fragment.app.f$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0425h f2058a;

        public a(C0425h c0425h) {
            this.f2058a = c0425h;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentM2767k = this.f2058a.m2767k();
            this.f2058a.m2769m();
            SpecialEffectsController.m2664n((ViewGroup) fragmentM2767k.mView.getParent(), LayoutInflaterFactory2C0423f.this.f2057a).m2675j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C0423f(FragmentManager fragmentManager) {
        this.f2057a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        C0425h c0425hM2595v;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2057a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, XHTML.ATTR.CLASS);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cic0.f81922a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(cic0.f81923b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(cic0.f81924c, -1);
        String string = typedArrayObtainStyledAttributes.getString(cic0.f81925d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C0422e.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentM2555h0 = resourceId != -1 ? this.f2057a.m2555h0(resourceId) : null;
        if (fragmentM2555h0 == null && string != null) {
            fragmentM2555h0 = this.f2057a.m2558i0(string);
        }
        if (fragmentM2555h0 == null && id != -1) {
            fragmentM2555h0 = this.f2057a.m2555h0(id);
        }
        if (fragmentM2555h0 == null) {
            fragmentM2555h0 = this.f2057a.m2584r0().instantiate(context.getClassLoader(), attributeValue);
            fragmentM2555h0.mFromLayout = true;
            fragmentM2555h0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentM2555h0.mContainerId = id;
            fragmentM2555h0.mTag = string;
            fragmentM2555h0.mInLayout = true;
            FragmentManager fragmentManager = this.f2057a;
            fragmentM2555h0.mFragmentManager = fragmentManager;
            fragmentM2555h0.mHost = fragmentManager.m2593u0();
            fragmentM2555h0.onInflate(this.f2057a.m2593u0().m175362f(), attributeSet, fragmentM2555h0.mSavedFragmentState);
            c0425hM2595v = this.f2057a.m2551g(fragmentM2555h0);
            if (FragmentManager.m2481G0(2)) {
                fragmentM2555h0.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (fragmentM2555h0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentM2555h0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f2057a;
            fragmentM2555h0.mFragmentManager = fragmentManager2;
            fragmentM2555h0.mHost = fragmentManager2.m2593u0();
            fragmentM2555h0.onInflate(this.f2057a.m2593u0().m175362f(), attributeSet, fragmentM2555h0.mSavedFragmentState);
            c0425hM2595v = this.f2057a.m2595v(fragmentM2555h0);
            if (FragmentManager.m2481G0(2)) {
                fragmentM2555h0.toString();
                Integer.toHexString(resourceId);
            }
        }
        fragmentM2555h0.mContainer = (ViewGroup) view;
        c0425hM2595v.m2769m();
        c0425hM2595v.m2766j();
        View view2 = fragmentM2555h0.mView;
        if (view2 == null) {
            wmw.m207134a("Fragment ", attributeValue, " did not create a view.");
            return null;
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentM2555h0.mView.getTag() == null) {
            fragmentM2555h0.mView.setTag(string);
        }
        fragmentM2555h0.mView.addOnAttachStateChangeListener(new a(c0425hM2595v));
        return fragmentM2555h0.mView;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
