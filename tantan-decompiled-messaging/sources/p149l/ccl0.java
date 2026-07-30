package p149l;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.liteav.TXLiteAVCode;
import com.vivo.push.PushClientConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010\u0012J%\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u0018J\u0017\u00101\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u0003J\u001d\u00106\u001a\b\u0012\u0002\b\u0003\u0018\u0001052\u0006\u00104\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00107R\u001c\u0010:\u001a\n 8*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00109R\u001e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010?¨\u0006A"}, m87232d2 = {"Ll/ccl0;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "Landroid/view/ViewGroup;", "j", "(Landroid/view/View;)Landroid/view/ViewGroup;", "", "b", "(Landroid/view/View;)Ljava/util/List;", "Lorg/json/JSONObject;", "json", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Landroid/view/View;Lorg/json/JSONObject;)V", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)Lorg/json/JSONObject;", "", "c", "(Landroid/view/View;)I", "", "o", "(Landroid/view/View;)Z", "", "k", "(Landroid/view/View;)Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "Landroid/view/View$OnClickListener;", "g", "(Landroid/view/View;)Landroid/view/View$OnClickListener;", "newListener", "r", "(Landroid/view/View;Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnTouchListener;", "h", "(Landroid/view/View;)Landroid/view/View$OnTouchListener;", "a", "(Landroid/view/View;)Landroid/view/View;", "RCTRootView", "p", "(Landroid/view/View;Landroid/view/View;)Z", "e", "", "location", BLiveStormDanmakuGiftResourceType.f44444l, "([FLandroid/view/View;)Landroid/view/View;", "q", "m", "(Landroid/view/View;)[F", "n", PushClientConstants.TAG_CLASS_NAME, "Ljava/lang/Class;", "f", "(Ljava/lang/String;)Ljava/lang/Class;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "RCTRootViewReference", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "methodFindTouchTargetView", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ccl0 {

    @NotNull
    public static final ccl0 INSTANCE = new ccl0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = ccl0.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static WeakReference<View> RCTRootViewReference = new WeakReference<>(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Method methodFindTouchTargetView;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final View m106065a(@Nullable View view) {
        if (lsb.m151554d(ccl0.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!INSTANCE.m106083q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                lsb.m151552b(th, ccl0.class);
            }
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<View> m106066b(@Nullable View view) {
        if (lsb.m151554d(ccl0.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m106067c(@NotNull View view) {
        if (lsb.m151554d(ccl0.class)) {
            return 0;
        }
        try {
            view.getClass();
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            if (m106074o(view)) {
                i |= 512;
            }
            if (view instanceof TextView) {
                int i2 = i | 1025;
                if (view instanceof Button) {
                    i2 = i | TXLiteAVCode.EVT_LOCAL_RECORD_RESULT;
                    if (view instanceof Switch) {
                        i2 = i | 9221;
                    } else if (view instanceof CheckBox) {
                        i2 = 33797 | i;
                    }
                }
                return view instanceof EditText ? i2 | 2048 : i2;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return 65536 | i;
                }
                if (view instanceof RadioGroup) {
                    return i | 16384;
                }
                return ((view instanceof ViewGroup) && INSTANCE.m106082p(view, RCTRootViewReference.get())) ? i | 64 : i;
            }
            return i | 4096;
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return 0;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final JSONObject m106068d(@NotNull View view) {
        if (lsb.m151554d(ccl0.class)) {
            return null;
        }
        try {
            view.getClass();
            if (Intrinsics.m87488d(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                RCTRootViewReference = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m106076s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> listM106066b = m106066b(view);
                int size = listM106066b.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(m106068d(listM106066b.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e) {
                Log.e(TAG, "Failed to create JSONObject for view.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final View.OnClickListener m106069g(@Nullable View view) {
        Field declaredField;
        if (lsb.m151554d(ccl0.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            obj2.getClass();
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final View.OnTouchListener m106070h(@Nullable View view) {
        Field declaredField;
        try {
            if (lsb.m151554d(ccl0.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    obj2.getClass();
                    return (View.OnTouchListener) obj2;
                } catch (NoSuchFieldException e) {
                    C1657e.m8842i0(TAG, e);
                    return null;
                }
            } catch (ClassNotFoundException e2) {
                C1657e.m8842i0(TAG, e2);
                return null;
            } catch (IllegalAccessException e3) {
                C1657e.m8842i0(TAG, e3);
                return null;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m106071i(@Nullable View view) {
        CharSequence hint;
        String string;
        if (lsb.m151554d(ccl0.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: j */
    public static final ViewGroup m106072j(@Nullable View view) {
        if (lsb.m151554d(ccl0.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f6 A[EDGE_INSN: B:42:0x00f6->B:43:0x00f7 BREAK  A[LOOP:0: B:32:0x00ca->B:38:0x00e4]] */
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m106073k(@Nullable View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (lsb.m151554d(ccl0.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i++;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            currentHour.getClass();
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            currentMinute.getClass();
                            int iIntValue2 = currentMinute.intValue();
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                        }
                    } else {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? "" : string;
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m106074o(View view) {
        if (lsb.m151554d(ccl0.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            ccl0 ccl0Var = INSTANCE;
            Class<?> clsM106078f = ccl0Var.m106078f("android.support.v4.view.NestedScrollingChild");
            if (clsM106078f != null && clsM106078f.isInstance(parent)) {
                return true;
            }
            Class<?> clsM106078f2 = ccl0Var.m106078f("androidx.core.view.NestedScrollingChild");
            return clsM106078f2 != null && clsM106078f2.isInstance(parent);
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m106075r(@NotNull View view, @Nullable View.OnClickListener newListener) {
        Field declaredField;
        Field declaredField2;
        if (lsb.m151554d(ccl0.class)) {
            return;
        }
        try {
            view.getClass();
            Object obj = null;
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } catch (ClassNotFoundException | NoSuchFieldException unused3) {
                declaredField = null;
            }
            if (declaredField == null || declaredField2 == null) {
                view.setOnClickListener(newListener);
                return;
            }
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            try {
                declaredField.setAccessible(true);
                obj = declaredField.get(view);
            } catch (IllegalAccessException unused4) {
            }
            if (obj == null) {
                view.setOnClickListener(newListener);
            } else {
                declaredField2.set(obj, newListener);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: s */
    public static final void m106076s(@NotNull View view, @NotNull JSONObject json) {
        if (lsb.m151554d(ccl0.class)) {
            return;
        }
        try {
            view.getClass();
            json.getClass();
            try {
                String strM106073k = m106073k(view);
                String strM106071i = m106071i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", m106067c(view));
                json.put("id", view.getId());
                if (uhe0.m193706g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", C1657e.m8845k(C1657e.m8812E0(strM106073k), ""));
                }
                json.put(TrackReferenceTypeBox.TYPE1, C1657e.m8845k(C1657e.m8812E0(strM106071i), ""));
                if (tag != null) {
                    json.put("tag", C1657e.m8845k(C1657e.m8812E0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", C1657e.m8845k(C1657e.m8812E0(contentDescription.toString()), ""));
                }
                json.put("dimension", INSTANCE.m106077e(view));
            } catch (JSONException e) {
                C1657e.m8842i0(TAG, e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, ccl0.class);
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m106077e(View view) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(StickStatus.top, view.getTop());
                jSONObject.put(BLiveGiftBubblePopupTitlePosition.left, view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e) {
                Log.e(TAG, "Failed to create JSONObject for dimension.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Class<?> m106078f(String className) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final View m106079l(float[] location, View RCTRootView) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            m106081n();
            Method method = methodFindTouchTargetView;
            if (method != null && RCTRootView != null) {
                try {
                    if (method == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Object objInvoke = method.invoke(null, location, RCTRootView);
                    objInvoke.getClass();
                    View view = (View) objInvoke;
                    if (view.getId() > 0) {
                        Object parent = view.getParent();
                        parent.getClass();
                        return (View) parent;
                    }
                } catch (IllegalAccessException e) {
                    C1657e.m8842i0(TAG, e);
                } catch (InvocationTargetException e2) {
                    C1657e.m8842i0(TAG, e2);
                }
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final float[] m106080m(View view) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m106081n() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (methodFindTouchTargetView != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                methodFindTouchTargetView = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e) {
                C1657e.m8842i0(TAG, e);
            } catch (NoSuchMethodException e2) {
                C1657e.m8842i0(TAG, e2);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m106082p(@NotNull View view, @Nullable View RCTRootView) {
        View viewM106079l;
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            view.getClass();
            return Intrinsics.m87488d(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") && (viewM106079l = m106079l(m106080m(view), RCTRootView)) != null && viewM106079l.getId() == view.getId();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m106083q(View view) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            return Intrinsics.m87488d(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }
}
