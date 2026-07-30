package p149l;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.GraphRequest;
import com.facebook.appevents.C1554f;
import com.facebook.appevents.p026ml.ModelManager;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0015B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/ucl0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "hostView", "rootView", "", "activityName", "<init>", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", OMSTemplateModeType.view, "", "onClick", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "()V", "pathID", "buttonText", "Lorg/json/JSONObject;", "viewData", "c", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "a", "Landroid/view/View$OnClickListener;", "baseListener", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "rootViewWeakReference", "hostViewWeakReference", "Ljava/lang/String;", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ucl0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Set<Integer> f175832e = new HashSet();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final View.OnClickListener baseListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<View> rootViewWeakReference;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<View> hostViewWeakReference;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String activityName;

    public ucl0(View view, View view2, String str) {
        this.baseListener = ccl0.m106069g(view);
        this.rootViewWeakReference = new WeakReference<>(view2);
        this.hostViewWeakReference = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        this.activityName = C15386d.m93479F(lowerCase, "activity", "", false, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m193086a(JSONObject jSONObject, String str, ucl0 ucl0Var, String str2) {
        String[] strArrM7941n;
        if (lsb.m151554d(ucl0.class)) {
            return;
        }
        try {
            jSONObject.getClass();
            str.getClass();
            ucl0Var.getClass();
            str2.getClass();
            try {
                String lowerCase = C1657e.m8864v(C1577c.m8047l()).toLowerCase();
                lowerCase.getClass();
                float[] fArrM131493a = hkg.m131493a(jSONObject, lowerCase);
                String strM131494c = hkg.m131494c(str, ucl0Var.activityName, lowerCase);
                if (fArrM131493a != null && (strArrM7941n = ModelManager.m7941n(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{fArrM131493a}, new String[]{strM131494c})) != null) {
                    String str3 = strArrM7941n[0];
                    qh80.m174510a(str2, str3);
                    if (Intrinsics.m87488d(str3, "other")) {
                        return;
                    }
                    INSTANCE.m193094e(str3, str, fArrM131493a);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lsb.m151552b(th, ucl0.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Set m193087b() {
        if (lsb.m151554d(ucl0.class)) {
            return null;
        }
        try {
            return f175832e;
        } catch (Throwable th) {
            lsb.m151552b(th, ucl0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m193088c(final String pathID, final String buttonText, final JSONObject viewData) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1657e.m8806A0(new Runnable() { // from class: l.scl0
                @Override // java.lang.Runnable
                public final void run() {
                    ucl0.m193086a(viewData, buttonText, this, pathID);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m193089d() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            View view = this.rootViewWeakReference.get();
            View view2 = this.hostViewWeakReference.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strM216012d = ytg0.m216012d(view2);
                String strM174511b = qh80.m174511b(view2, strM216012d);
                if (strM174511b != null && !INSTANCE.m193095f(strM174511b, strM216012d)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(OMSTemplateModeType.view, ytg0.m216011b(view, view2));
                    jSONObject.put("screenname", this.activityName);
                    m193088c(strM174511b, strM216012d, jSONObject);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            view.getClass();
            View.OnClickListener onClickListener = this.baseListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            m193089d();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.ucl0$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/ucl0$a;", "", "<init>", "()V", "Landroid/view/View;", "hostView", "rootView", "", "activityName", "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", "pathID", "buttonText", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "predictedEvent", "", "dense", "e", "(Ljava/lang/String;Ljava/lang/String;[F)V", "eventToPost", "g", "API_ENDPOINT", "Ljava/lang/String;", "OTHER_EVENT", "", "", "viewsAttachedListener", "Ljava/util/Set;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m193090a(String str, String str2) {
            str.getClass();
            str2.getClass();
            ucl0.INSTANCE.m193094e(str, str2, new float[0]);
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final void m193093d(@NotNull View hostView, @NotNull View rootView, @NotNull String activityName) {
            hostView.getClass();
            rootView.getClass();
            activityName.getClass();
            int iHashCode = hostView.hashCode();
            if (ucl0.m193087b().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            ccl0.m106075r(hostView, new ucl0(hostView, rootView, activityName, null));
            ucl0.m193087b().add(Integer.valueOf(iHashCode));
        }

        /* JADX INFO: renamed from: e */
        public final void m193094e(String predictedEvent, String buttonText, float[] dense) {
            if (aug0.m98989e(predictedEvent)) {
                new C1554f(C1577c.m8047l()).m7775e(predictedEvent, buttonText);
            } else if (aug0.m98988d(predictedEvent)) {
                m193096g(predictedEvent, buttonText, dense);
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m193095f(String pathID, final String buttonText) {
            final String strM174512d = qh80.m174512d(pathID);
            if (strM174512d == null) {
                return false;
            }
            if (Intrinsics.m87488d(strM174512d, "other")) {
                return true;
            }
            C1657e.m8806A0(new Runnable() { // from class: l.tcl0
                @Override // java.lang.Runnable
                public final void run() {
                    ucl0.Companion.m193090a(strM174512d, buttonText);
                }
            });
            return true;
        }

        /* JADX INFO: renamed from: g */
        public final void m193096g(String eventToPost, String buttonText, float[] dense) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", eventToPost);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f : dense) {
                    sb.append(f);
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", buttonText);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.Companion companion = GraphRequest.INSTANCE;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                GraphRequest graphRequestM7587z = companion.m7587z(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{C1577c.m8048m()}, 1)), null, null);
                graphRequestM7587z.m7520G(bundle);
                graphRequestM7587z.m7525j();
            } catch (JSONException unused) {
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ ucl0(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }
}
