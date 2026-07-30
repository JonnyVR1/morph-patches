package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import l.cwf0;
import l.e51;
import l.l3f;
import l.vwb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fkp0 {

    /* JADX INFO: renamed from: a */
    public static cwf0 f13074a = new cwf0(WebViewAct.class.getName(), WebViewAct.class.getName());

    /* JADX INFO: renamed from: l.fkp0$a */
    public static /* synthetic */ class C0900a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13075a;

        static {
            int[] iArr = new int[EventNameEnum.values().length];
            f13075a = iArr;
            try {
                iArr[EventNameEnum.PAGE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13075a[EventNameEnum.PAGE_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13075a[EventNameEnum.MODULE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13075a[EventNameEnum.MODULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13075a[EventNameEnum.MODULE_SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13075a[EventNameEnum.MODULE_VIEW_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13075a[EventNameEnum.MODULE_CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13075a[EventNameEnum.SYS_CHECK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14492a(String str, JSONObject jSONObject) {
        f13074a.i();
        f13074a.q(str);
        f13074a.o(jSONObject);
        f13074a.l();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14493b() {
        f13074a.k();
        f13074a.j();
    }

    /* JADX INFO: renamed from: c */
    public static EventNameEnum m14494c(String str) {
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
    public static JSONObject m14495d(String[] strArr) {
        JSONObject jSONObject = null;
        if (vwb.K(strArr)) {
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
                    CrashHelper.c(e);
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
    public static void m14496e(String str, String str2, final String str3, final JSONObject jSONObject) {
        EventNameEnum eventNameEnumM14494c = m14494c(str);
        boolean z = false;
        switch (C0900a.f13075a[eventNameEnumM14494c.ordinal()]) {
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
                jSONObject.put("device_level", pyd.INSTANCE.m20770a());
            } catch (JSONException e) {
                CrashHelper.c(e);
            }
        }
        if (z) {
            if (eventNameEnumM14494c.equals(EventNameEnum.PAGE_VIEW)) {
                e51.M(new Runnable() { // from class: l.dkp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fkp0.m14492a(str3, jSONObject);
                    }
                });
                return;
            }
            if (eventNameEnumM14494c.equals(EventNameEnum.PAGE_DISAPPEAR)) {
                e51.M(new Runnable() { // from class: l.ekp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fkp0.m14493b();
                    }
                });
                return;
            }
            l3f l3fVar = new l3f();
            l3fVar.n = str3;
            l3fVar.s = str2;
            l3fVar.d = eventNameEnumM14494c;
            l3fVar.w = jSONObject;
            zvf0.m(l3fVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14497f(String str, String str2, String str3, String[] strArr) {
        m14496e(str, str2, str3, m14495d(strArr));
    }
}
