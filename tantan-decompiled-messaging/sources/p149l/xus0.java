package p149l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.material.badge.BadgeDrawable;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.feed.data.Frame;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class xus0 {
    /* JADX INFO: renamed from: a */
    public static Point m211184a(MotionEvent motionEvent, @Nullable View view) {
        int[] iArrM211193j = m211193j(view);
        return new Point(((int) motionEvent.getRawX()) - iArrM211193j[0], ((int) motionEvent.getRawY()) - iArrM211193j[1]);
    }

    /* JADX INFO: renamed from: b */
    public static WindowManager.LayoutParams m211185b() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) d1s0.m109677c().m144697a(m7s0.f132080T7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = BadgeDrawable.TOP_START;
        return layoutParams;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m211186c(@Nullable String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(BaseSei.f13930X, exr0.m118703b().m134100e(context, point2.x));
                    jSONObject3.put(BaseSei.f13931Y, exr0.m118703b().m134100e(context, point2.y));
                    jSONObject3.put("start_x", exr0.m118703b().m134100e(context, point.x));
                    jSONObject3.put("start_y", exr0.m118703b().m134100e(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    x2t0.m206867e("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                x2t0.m206867e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m211187d(Context context, @Nullable Map map, @Nullable Map map2, @Nullable View view, @Nullable ImageView.ScaleType scaleType) {
        String str;
        String str2;
        Iterator it;
        JSONObject jSONObject;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int[] iArrM211193j = m211193j(view);
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArrM211193j2 = m211193j(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    int[] iArr = iArrM211193j;
                    try {
                        it = it2;
                        try {
                            jSONObject4.put("width", exr0.m118703b().m134100e(context, view2.getMeasuredWidth()));
                            jSONObject4.put("height", exr0.m118703b().m134100e(context, view2.getMeasuredHeight()));
                            jSONObject4.put(BaseSei.f13930X, exr0.m118703b().m134100e(context, iArrM211193j2[0] - iArr[0]));
                            jSONObject4.put(BaseSei.f13931Y, exr0.m118703b().m134100e(context, iArrM211193j2[1] - iArr[1]));
                            jSONObject4.put(str4, str3);
                            jSONObject3.put(Frame.TYPE, jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = m211194k(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put(BaseSei.f13930X, exr0.m118703b().m134100e(context, iArrM211193j2[0] - iArr[0]));
                                jSONObject.put(BaseSei.f13931Y, exr0.m118703b().m134100e(context, iArrM211193j2[1] - iArr[1]));
                                jSONObject.put(str4, str3);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132008N7)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132020O7)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", m211195l(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", m211195l(layoutParams.height) - 1);
                                }
                                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132032P7)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132044Q7)).booleanValue() && scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    x2t0.m206869g("Unable to get asset views information");
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        it = it2;
                    }
                    it2 = it;
                    iArrM211193j = iArr;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m211188e(Context context, @Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                vny0.m199080r();
                jSONObject.put("can_show_on_lock_screen", C2075b.m12295P(view));
                vny0.m199080r();
                jSONObject.put("is_keyguard_locked", C2075b.m12310c(context));
                return jSONObject;
            } catch (JSONException unused) {
                x2t0.m206869g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m211189f(@Nullable View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z = true;
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131996M7)).booleanValue()) {
                    vny0.m199080r();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                vny0.m199080r();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x011a  */
    /* JADX WARN: Code duplicated, block: B:32:0x013c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0149  */
    /* JADX WARN: Code duplicated, block: B:46:0x015e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    /* JADX WARN: Code duplicated, block: B:50:0x016c A[Catch: JSONException -> 0x015c, TRY_LEAVE, TryCatch #6 {JSONException -> 0x015c, blocks: (B:33:0x013e, B:42:0x0158, B:50:0x016c, B:49:0x0168), top: B:66:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static JSONObject m211190g(Context context, @Nullable View view) {
        int i;
        ViewParent parent;
        String str;
        int iHashCode;
        JSONObject jSONObjectM211194k;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            int i2 = 1;
            try {
                int[] iArrM211193j = m211193j(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i2;
                    try {
                        iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                        iArr[i] = Math.min(viewGroup.getMeasuredHeight(), iArr[i]);
                        parent2 = parent2.getParent();
                        i2 = i;
                    } catch (Exception unused) {
                        x2t0.m206869g("Unable to get native ad view bounding box");
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132306l6)).booleanValue()) {
                            parent = view.getParent();
                            if (parent != null) {
                                try {
                                    str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    x2t0.m206867e("Cannot access method getTemplateTypeName: ", e);
                                    str = "";
                                } catch (NoSuchMethodException unused2) {
                                    str = "";
                                } catch (SecurityException e2) {
                                    e = e2;
                                    x2t0.m206867e("Cannot access method getTemplateTypeName: ", e);
                                    str = "";
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    x2t0.m206867e("Cannot access method getTemplateTypeName: ", e);
                                    str = "";
                                }
                            } else {
                                str = "";
                            }
                            try {
                                iHashCode = str.hashCode();
                                if (iHashCode != -2066603854) {
                                    if (iHashCode != 2019754500) {
                                        jSONObject.put("native_template_type", 0);
                                    } else {
                                        jSONObject.put("native_template_type", 2);
                                    }
                                } else if (str.equals("small_template")) {
                                    jSONObject.put("native_template_type", i);
                                } else {
                                    jSONObject.put("native_template_type", 0);
                                }
                            } catch (JSONException e4) {
                                x2t0.m206867e("Could not log native template signal to JSON", e4);
                            }
                        }
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132020O7)).booleanValue()) {
                            try {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                jSONObject.put("view_width_layout_type", m211195l(layoutParams.width) - 1);
                                jSONObject.put("view_height_layout_type", m211195l(layoutParams.height) - 1);
                            } catch (Exception unused3) {
                                xsu0.m210834k("Unable to get native ad view layout types");
                            }
                        }
                        return jSONObject;
                    }
                }
                i = i2;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", exr0.m118703b().m134100e(context, view.getMeasuredWidth()));
                jSONObject2.put("height", exr0.m118703b().m134100e(context, view.getMeasuredHeight()));
                jSONObject2.put(BaseSei.f13930X, exr0.m118703b().m134100e(context, iArrM211193j[0]));
                jSONObject2.put(BaseSei.f13931Y, exr0.m118703b().m134100e(context, iArrM211193j[i]));
                jSONObject2.put("maximum_visible_width", exr0.m118703b().m134100e(context, iArr[0]));
                jSONObject2.put("maximum_visible_height", exr0.m118703b().m134100e(context, iArr[i]));
                jSONObject2.put("relative_to", BLiveBottomPopupStyleTypeEnum.window);
                jSONObject.put(Frame.TYPE, jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectM211194k = m211194k(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put(BaseSei.f13930X, exr0.m118703b().m134100e(context, iArrM211193j[0]));
                    jSONObject3.put(BaseSei.f13931Y, exr0.m118703b().m134100e(context, iArrM211193j[i]));
                    jSONObject3.put("relative_to", BLiveBottomPopupStyleTypeEnum.window);
                    jSONObjectM211194k = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectM211194k);
            } catch (Exception unused4) {
                i = i2;
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132306l6)).booleanValue()) {
                parent = view.getParent();
                if (parent != null) {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                } else {
                    str = "";
                }
                iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode != 2019754500 && str.equals("medium_template")) {
                        jSONObject.put("native_template_type", 2);
                    } else {
                        jSONObject.put("native_template_type", 0);
                    }
                } else if (str.equals("small_template")) {
                    jSONObject.put("native_template_type", i);
                } else {
                    jSONObject.put("native_template_type", 0);
                }
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132020O7)).booleanValue()) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                jSONObject.put("view_width_layout_type", m211195l(layoutParams2.width) - 1);
                jSONObject.put("view_height_layout_type", m211195l(layoutParams2.height) - 1);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m211191h(Context context, kxv0 kxv0Var) {
        if (!kxv0Var.f125171O) {
            return false;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132056R7)).booleanValue()) {
            return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132092U7)).booleanValue();
        }
        String str = (String) d1s0.m109677c().m144697a(m7s0.f132068S7);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = xfw0.m208616c(vew0.m198261b(';')).m208618d(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m211192i(int i) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132329n3)).booleanValue()) {
            return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132342o3)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static int[] m211193j(@Nullable View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k */
    public static JSONObject m211194k(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", exr0.m118703b().m134100e(context, rect.right - rect.left));
        jSONObject.put("height", exr0.m118703b().m134100e(context, rect.bottom - rect.top));
        jSONObject.put(BaseSei.f13930X, exr0.m118703b().m134100e(context, rect.left));
        jSONObject.put(BaseSei.f13931Y, exr0.m118703b().m134100e(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* JADX INFO: renamed from: l */
    public static int m211195l(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
