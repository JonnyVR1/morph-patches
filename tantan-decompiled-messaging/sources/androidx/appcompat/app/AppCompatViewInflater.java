package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import org.seamless.xhtml.XHTML;
import p149l.aac0;
import p149l.byv;
import p149l.e01;
import p149l.gbl0;
import p149l.m16;
import p149l.nri0;
import p149l.waq0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new e01();

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatViewInflater$a */
    public static class ViewOnClickListenerC0073a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final View f310a;

        /* JADX INFO: renamed from: b */
        public final String f311b;

        /* JADX INFO: renamed from: c */
        public Method f312c;

        /* JADX INFO: renamed from: d */
        public Context f313d;

        public ViewOnClickListenerC0073a(@NonNull View view, @NonNull String str) {
            this.f310a = view;
            this.f311b = str;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final void m355a(@Nullable Context context, @NonNull String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f311b, View.class)) != null) {
                        this.f312c = method;
                        this.f313d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f310a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                str2 = " with id '" + this.f310a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            waq0.m202461a("Could not find method ", this.f311b, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ", this.f310a.getClass(), str2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NonNull View view) {
            if (this.f312c == null) {
                m355a(this.f310a.getContext(), this.f311b);
            }
            try {
                this.f312c.invoke(this.f313d, view);
            } catch (IllegalAccessException e) {
                byv.m104511a("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                byv.m104511a("Could not execute method for android:onClick", e2);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && gbl0.m125166K(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new ViewOnClickListenerC0073a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String str3;
        Map<String, Constructor<? extends View>> map = sConstructorMap;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            map.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(OMSTemplateModeType.view)) {
            str = attributeSet.getAttributeValue(null, XHTML.ATTR.CLASS);
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                View viewCreateViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                if (viewCreateViewByPrefix != null) {
                    return viewCreateViewByPrefix;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aac0.f68347K3, 0, 0);
        int resourceId = z ? typedArrayObtainStyledAttributes.getResourceId(aac0.f68352L3, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = typedArrayObtainStyledAttributes.getResourceId(aac0.f68357M3, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof m16) && ((m16) context).m152573b() == resourceId)) ? context : new m16(context, resourceId);
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @NonNull
    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @NonNull
    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @NonNull
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @NonNull
    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @NonNull
    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @NonNull
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatToggleButton createToggleButton(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View viewCreateRatingBar;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = nri0.m160741b(context2);
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    b = 0;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    b = 1;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    b = 2;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    b = 3;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    b = 4;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    b = 5;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    b = 6;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    b = 7;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    b = 8;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    b = 9;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    b = 10;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    b = 11;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    b = 12;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
        }
        switch (b) {
            case 0:
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 1:
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 2:
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 3:
                viewCreateRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 4:
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 5:
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 6:
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 7:
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 8:
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 9:
                viewCreateRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 10:
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 11:
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 12:
                viewCreateRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            case 13:
                viewCreateRatingBar = createButton(context2, attributeSet);
                verifyNotNull(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            viewCreateRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (viewCreateRatingBar != null) {
            checkOnClickListener(viewCreateRatingBar, attributeSet);
        }
        return viewCreateRatingBar;
    }

    @Nullable
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }
}
