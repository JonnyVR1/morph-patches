package p009l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.ui.pushbubble.SimplePushBubble;
import com.p1.mobile.putong.common.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e16;
import l.e51;
import l.e6c0;
import l.h0m;
import l.hdb0;
import l.s4c0;
import l.vwb;
import l.w2c0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class uj60 {

    /* JADX INFO: renamed from: c */
    public static final Map<List<String>, C1218a> f21212c;

    /* JADX INFO: renamed from: a */
    public final List<String> f21213a;

    /* JADX INFO: renamed from: b */
    public SimplePushBubble f21214b;

    /* JADX INFO: renamed from: l.uj60$a */
    public static class C1218a {

        /* JADX INFO: renamed from: a */
        public final int f21215a;

        /* JADX INFO: renamed from: b */
        public final int f21216b;

        /* JADX INFO: renamed from: c */
        public final int f21217c;

        public C1218a(int i, int i2, int i3) {
            this.f21215a = i;
            this.f21216b = i2;
            this.f21217c = i3;
        }
    }

    static {
        ArrayList arrayListF0;
        HashMap map = new HashMap();
        f21212c = map;
        int i = Build.VERSION.SDK_INT;
        map.put(i >= 29 ? vwb.f0(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}) : vwb.f0(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}), new C1218a(w2c0.Y, R.string.p1, R.string.o1));
        map.put(vwb.f0(new String[]{"android.permission.READ_CONTACTS"}), new C1218a(w2c0.Y, R.string.j1, R.string.i1));
        map.put(vwb.f0(new String[]{"android.permission.CAMERA"}), new C1218a(w2c0.Y, R.string.n1, R.string.m1));
        if (i >= 34) {
            arrayListF0 = vwb.f0(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        } else {
            arrayListF0 = i >= 33 ? vwb.f0(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}) : vwb.f0(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        }
        map.put(arrayListF0, new C1218a(w2c0.Y, R.string.t1, R.string.s1));
        map.put(vwb.f0(new String[]{"android.permission.RECORD_AUDIO"}), new C1218a(w2c0.Y, R.string.v1, R.string.u1));
        map.put(vwb.f0(new String[]{"android.permission.READ_PHONE_STATE"}), new C1218a(w2c0.Y, R.string.r1, R.string.q1));
        if (i >= 31) {
            map.put(vwb.f0(new String[]{"android.permission.BLUETOOTH_CONNECT"}), new C1218a(w2c0.Y, R.string.d0, R.string.c0));
        }
        map.put(vwb.f0(new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"}), new C1218a(w2c0.X, R.string.l1, R.string.k1));
        if (i >= 33) {
            map.put(vwb.f0(new String[]{"android.permission.POST_NOTIFICATIONS"}), new C1218a(w2c0.Y, R.string.j0, R.string.i0));
        }
    }

    public uj60(List<String> list) {
        this.f21213a = list;
    }

    /* JADX INFO: renamed from: c */
    public final C1218a m23059c(Context context) {
        List<String> list = this.f21213a;
        if (list == null) {
            return null;
        }
        for (final String str : list) {
            if (e16.a(context, str) != 0) {
                Map<List<String>, C1218a> map = f21212c;
                List list2 = (List) vwb.r(map.keySet(), new w9j() { // from class: l.tj60
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
    public void m23060d() {
        SimplePushBubble simplePushBubble = this.f21214b;
        if (simplePushBubble != null) {
            simplePushBubble.I();
        }
        this.f21214b = null;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m23061e(Activity activity, View view) {
        SimplePushBubble simplePushBubbleS = new SimplePushBubble.a(activity, view).u("" + System.currentTimeMillis()).w(Integer.MAX_VALUE).A(5).s();
        this.f21214b = simplePushBubbleS;
        simplePushBubbleS.x(new h0m("PermissionPushBubble"));
        this.f21214b.y(50000);
        hdb0.c().i(this.f21214b);
    }

    /* JADX INFO: renamed from: f */
    public void m23062f(final Activity activity) {
        C1218a c1218aM23059c;
        if (activity == null || activity.isFinishing() || this.f21214b != null || (c1218aM23059c = m23059c(activity)) == null) {
            return;
        }
        final View viewInflate = LayoutInflater.from(activity).inflate(e6c0.l, (ViewGroup) null);
        viewInflate.findViewById(s4c0.F).setImageResource(c1218aM23059c.f21215a);
        viewInflate.findViewById(s4c0.s0).setText(c1218aM23059c.f21216b);
        viewInflate.findViewById(s4c0.x).setText(c1218aM23059c.f21217c);
        e51.G(new Runnable() { // from class: l.sj60
            @Override // java.lang.Runnable
            public final void run() {
                this.f20311a.m23061e(activity, viewInflate);
            }
        });
    }
}
