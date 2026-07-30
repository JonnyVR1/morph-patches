package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class fkp0 {

    /* JADX INFO: renamed from: a */
    public static cwf0 f98092a = new cwf0(WebViewAct.class.getName(), WebViewAct.class.getName());

    /* JADX INFO: renamed from: l.fkp0$a */
    public static /* synthetic */ class C16870a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98093a;

        static {
            int[] iArr = new int[EventNameEnum.values().length];
            f98093a = iArr;
            try {
                iArr[EventNameEnum.PAGE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98093a[EventNameEnum.PAGE_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98093a[EventNameEnum.MODULE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98093a[EventNameEnum.MODULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98093a[EventNameEnum.MODULE_SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98093a[EventNameEnum.MODULE_VIEW_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98093a[EventNameEnum.MODULE_CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f98093a[EventNameEnum.SYS_CHECK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m121881a(String str, JSONObject jSONObject) {
        f98092a.m109033i();
        f98092a.m109041q(str);
        f98092a.m109039o(jSONObject);
        f98092a.m109036l();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m121882b() {
        f98092a.m109035k();
        f98092a.m109034j();
    }

    /* JADX INFO: renamed from: c */
    public static EventNameEnum m121883c(String str) {
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
    public static JSONObject m121884d(String[] strArr) {
        JSONObject jSONObject = null;
        if (vwb.m200297K(strArr)) {
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
                    CrashHelper.m81296c(e);
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
    public static void m121885e(String str, String str2, final String str3, final JSONObject jSONObject) {
        EventNameEnum eventNameEnumM121883c = m121883c(str);
        boolean z = false;
        switch (C16870a.f98093a[eventNameEnumM121883c.ordinal()]) {
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
                jSONObject.put("device_level", pyd.INSTANCE.m172109a());
            } catch (JSONException e) {
                CrashHelper.m81296c(e);
            }
        }
        if (z) {
            if (eventNameEnumM121883c.equals(EventNameEnum.PAGE_VIEW)) {
                e51.m114748M(new Runnable() { // from class: l.dkp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fkp0.m121881a(str3, jSONObject);
                    }
                });
                return;
            }
            if (eventNameEnumM121883c.equals(EventNameEnum.PAGE_DISAPPEAR)) {
                e51.m114748M(new Runnable() { // from class: l.ekp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        fkp0.m121882b();
                    }
                });
                return;
            }
            l3f l3fVar = new l3f();
            l3fVar.f125895n = str3;
            l3fVar.f125900s = str2;
            l3fVar.f125885d = eventNameEnumM121883c;
            l3fVar.f125904w = jSONObject;
            zvf0.m220391m(l3fVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m121886f(String str, String str2, String str3, String[] strArr) {
        m121885e(str, str2, str3, m121884d(strArr));
    }
}
