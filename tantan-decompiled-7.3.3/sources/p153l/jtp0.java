package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class jtp0 {

    /* JADX INFO: renamed from: a */
    public static l4g0 f122606a = new l4g0(WebViewAct.class.getName(), WebViewAct.class.getName());

    /* JADX INFO: renamed from: l.jtp0$a */
    public static /* synthetic */ class C18039a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f122607a;

        static {
            int[] iArr = new int[EventNameEnum.values().length];
            f122607a = iArr;
            try {
                iArr[EventNameEnum.PAGE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f122607a[EventNameEnum.PAGE_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f122607a[EventNameEnum.MODULE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f122607a[EventNameEnum.MODULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f122607a[EventNameEnum.MODULE_SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f122607a[EventNameEnum.MODULE_VIEW_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f122607a[EventNameEnum.MODULE_CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f122607a[EventNameEnum.SYS_CHECK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m146911a(String str, JSONObject jSONObject) {
        f122606a.m152774i();
        f122606a.m152782q(str);
        f122606a.m152780o(jSONObject);
        f122606a.m152777l();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m146912b() {
        f122606a.m152776k();
        f122606a.m152775j();
    }

    /* JADX INFO: renamed from: c */
    public static EventNameEnum m146913c(String str) {
        EventNameEnum eventNameEnum = EventNameEnum.DEFAULT;
        if (!TextUtils.isEmpty(str)) {
            for (EventNameEnum eventNameEnum2 : EventNameEnum.values()) {
                if (str.equals(eventNameEnum2.toString())) {
                    return eventNameEnum2;
                }
            }
        }
        return eventNameEnum;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m146914d(String[] strArr) {
        JSONObject jSONObject = null;
        if (jyb.m147480K(strArr)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 0; i < strArr.length; i += 2) {
                try {
                    jSONObject2.put(strArr[i], strArr[i + 1]);
                } catch (JSONException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    CrashHelper.m82479c(e);
                    return jSONObject;
                }
            }
            return jSONObject2;
        } catch (JSONException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX INFO: renamed from: e */
    public static void m146915e(String str, String str2, final String str3, final JSONObject jSONObject) {
        EventNameEnum eventNameEnumM146913c = m146913c(str);
        boolean z = false;
        switch (C18039a.f122607a[eventNameEnumM146913c.ordinal()]) {
            case 1:
            case 2:
                if (!TextUtils.isEmpty(str3)) {
                    z = true;
                }
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!TextUtils.isEmpty(str2)) {
                    z = true;
                }
                break;
            default:
                z = true;
                break;
        }
        if (jSONObject != null) {
            try {
                jSONObject.put("device_level", c0e.INSTANCE.m107408a());
            } catch (JSONException e) {
                CrashHelper.m82479c(e);
            }
        }
        if (z) {
            if (eventNameEnumM146913c.equals(EventNameEnum.PAGE_VIEW)) {
                l51.m152893M(new Runnable() { // from class: l.htp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        jtp0.m146911a(str3, jSONObject);
                    }
                });
                return;
            }
            if (eventNameEnumM146913c.equals(EventNameEnum.PAGE_DISAPPEAR)) {
                l51.m152893M(new Runnable() { // from class: l.itp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        jtp0.m146912b();
                    }
                });
                return;
            }
            q4f q4fVar = new q4f();
            q4fVar.f155576n = str3;
            q4fVar.f155581s = str2;
            q4fVar.f155566d = eventNameEnumM146913c;
            q4fVar.f155585w = jSONObject;
            i4g0.m138515m(q4fVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m146916f(String str, String str2, String str3, String[] strArr) {
        m146915e(str, str2, str3, m146914d(strArr));
    }
}
