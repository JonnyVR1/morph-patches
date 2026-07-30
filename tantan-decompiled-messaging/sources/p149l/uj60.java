package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.common.R$string;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class uj60 {

    /* JADX INFO: renamed from: c */
    public static final Map<List<String>, C20444a> f176739c;

    /* JADX INFO: renamed from: a */
    public final List<String> f176740a;

    /* JADX INFO: renamed from: b */
    public SimplePushBubble f176741b;

    /* JADX INFO: renamed from: l.uj60$a */
    public static class C20444a {

        /* JADX INFO: renamed from: a */
        public final int f176742a;

        /* JADX INFO: renamed from: b */
        public final int f176743b;

        /* JADX INFO: renamed from: c */
        public final int f176744c;

        public C20444a(int i, int i2, int i3) {
            this.f176742a = i;
            this.f176743b = i2;
            this.f176744c = i3;
        }
    }

    static {
        ArrayList arrayListM200324f0;
        HashMap map = new HashMap();
        f176739c = map;
        int i = Build.VERSION.SDK_INT;
        map.put(i >= 29 ? vwb.m200324f0("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION") : vwb.m200324f0("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new C20444a(w2c0.f184160Y, R$string.f17482p1, R$string.f17477o1));
        map.put(vwb.m200324f0("android.permission.READ_CONTACTS"), new C20444a(w2c0.f184160Y, R$string.f17452j1, R$string.f17447i1));
        map.put(vwb.m200324f0("android.permission.CAMERA"), new C20444a(w2c0.f184160Y, R$string.f17472n1, R$string.f17467m1));
        if (i >= 34) {
            arrayListM200324f0 = vwb.m200324f0("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        } else {
            arrayListM200324f0 = i >= 33 ? vwb.m200324f0("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO") : vwb.m200324f0("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        map.put(arrayListM200324f0, new C20444a(w2c0.f184160Y, R$string.f17502t1, R$string.f17497s1));
        map.put(vwb.m200324f0("android.permission.RECORD_AUDIO"), new C20444a(w2c0.f184160Y, R$string.f17512v1, R$string.f17507u1));
        map.put(vwb.m200324f0("android.permission.READ_PHONE_STATE"), new C20444a(w2c0.f184160Y, R$string.f17492r1, R$string.f17487q1));
        if (i >= 31) {
            map.put(vwb.m200324f0("android.permission.BLUETOOTH_CONNECT"), new C20444a(w2c0.f184160Y, R$string.f17421d0, R$string.f17416c0));
        }
        map.put(vwb.m200324f0("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"), new C20444a(w2c0.f184159X, R$string.f17462l1, R$string.f17457k1));
        if (i >= 33) {
            map.put(vwb.m200324f0("android.permission.POST_NOTIFICATIONS"), new C20444a(w2c0.f184160Y, R$string.f17451j0, R$string.f17446i0));
        }
    }

    public uj60(List<String> list) {
        this.f176740a = list;
    }

    /* JADX INFO: renamed from: c */
    public final C20444a m194005c(Context context) {
        List<String> list = this.f176740a;
        if (list == null) {
            return null;
        }
        for (final String str : list) {
            if (e16.m114373a(context, str) != 0) {
                Map<List<String>, C20444a> map = f176739c;
                List list2 = (List) vwb.m200346r(map.keySet(), new w9j() { // from class: l.tj60
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(str));
                    }
                });
                if (list2 != null) {
                    return map.get(list2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m194006d() {
        SimplePushBubble simplePushBubble = this.f176741b;
        if (simplePushBubble != null) {
            simplePushBubble.m21135I();
        }
        this.f176741b = null;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m194007e(Activity activity, View view) {
        SimplePushBubble simplePushBubbleM21169s = new SimplePushBubble.C4372a(activity, view).m21171u("" + System.currentTimeMillis()).m21173w(Api.BaseClientBuilder.API_PRIORITY_OTHER).m21163A(5).m21169s();
        this.f176741b = simplePushBubbleM21169s;
        simplePushBubbleM21169s.m96808x(new h0m("PermissionPushBubble"));
        this.f176741b.m96809y(50000);
        hdb0.m130575c().m130582i(this.f176741b);
    }

    /* JADX INFO: renamed from: f */
    public void m194008f(final Activity activity) {
        C20444a c20444aM194005c;
        if (activity == null || activity.isFinishing() || this.f176741b != null || (c20444aM194005c = m194005c(activity)) == null) {
            return;
        }
        final View viewInflate = LayoutInflater.from(activity).inflate(e6c0.f89553l, (ViewGroup) null);
        ((VIcon) viewInflate.findViewById(s4c0.f162293F)).setImageResource(c20444aM194005c.f176742a);
        ((VText) viewInflate.findViewById(s4c0.f162360s0)).setText(c20444aM194005c.f176743b);
        ((VText) viewInflate.findViewById(s4c0.f162369x)).setText(c20444aM194005c.f176744c);
        e51.m114742G(new Runnable() { // from class: l.sj60
            @Override // java.lang.Runnable
            public final void run() {
                this.f164809a.m194007e(activity, viewInflate);
            }
        });
    }
}
