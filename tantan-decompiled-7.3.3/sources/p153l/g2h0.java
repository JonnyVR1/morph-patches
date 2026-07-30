package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0010R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00160\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, m88121d2 = {"Ll/g2h0;", "", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "clickedView", "Lorg/json/JSONObject;", "b", "(Landroid/view/View;Landroid/view/View;)Lorg/json/JSONObject;", "json", "", "e", "(Landroid/view/View;Lorg/json/JSONObject;)V", "", "a", "(Landroid/view/View;)Ljava/util/List;", "hostView", "", Constants.INAPP_DATA_TAG, "(Landroid/view/View;)Ljava/lang/String;", "c", "Ljava/lang/Class;", "Ljava/util/List;", "blacklistedViews", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class g2h0 {

    @NotNull
    public static final g2h0 INSTANCE = new g2h0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<Class<? extends View>> blacklistedViews = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<View> m128622a(@NotNull View view) {
        if (ztb.m221490d(g2h0.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = blacklistedViews.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator<View> it2 = gll0.m130678b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(m128622a(it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            ztb.m221488b(th, g2h0.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final JSONObject m128623b(@NotNull View view, @NotNull View clickedView) {
        if (ztb.m221490d(g2h0.class)) {
            return null;
        }
        try {
            view.getClass();
            clickedView.getClass();
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m128625e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = gll0.m130678b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m128623b(it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            ztb.m221488b(th, g2h0.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m128624d(@NotNull View hostView) {
        if (ztb.m221490d(g2h0.class)) {
            return null;
        }
        try {
            hostView.getClass();
            String strM130685k = gll0.m130685k(hostView);
            if (strM130685k.length() > 0) {
                return strM130685k;
            }
            String strJoin = TextUtils.join(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, INSTANCE.m128626c(hostView));
            strJoin.getClass();
            return strJoin;
        } catch (Throwable th) {
            ztb.m221488b(th, g2h0.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m128625e(@NotNull View view, @NotNull JSONObject json) {
        if (ztb.m221490d(g2h0.class)) {
            return;
        }
        try {
            view.getClass();
            json.getClass();
            try {
                String strM130685k = gll0.m130685k(view);
                String strM130683i = gll0.m130683i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", gll0.m130679c(view));
                if (strM130685k.length() > 0) {
                    json.put("text", strM130685k);
                }
                if (strM130683i.length() > 0) {
                    json.put(TrackReferenceTypeBox.TYPE1, strM130683i);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, g2h0.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m128626c(View view) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : gll0.m130678b(view)) {
                String strM130685k = gll0.m130685k(view2);
                if (strM130685k.length() > 0) {
                    arrayList.add(strM130685k);
                }
                arrayList.addAll(m128626c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }
}
