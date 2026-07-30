package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.p053ui.pushbubble.SimplePushBubble;
import com.p051p1.mobile.putong.common.R$string;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class as60 {

    /* JADX INFO: renamed from: c */
    public static final Map<List<String>, C15819a> f73083c;

    /* JADX INFO: renamed from: a */
    public final List<String> f73084a;

    /* JADX INFO: renamed from: b */
    public SimplePushBubble f73085b;

    /* JADX INFO: renamed from: l.as60$a */
    public static class C15819a {

        /* JADX INFO: renamed from: a */
        public final int f73086a;

        /* JADX INFO: renamed from: b */
        public final int f73087b;

        /* JADX INFO: renamed from: c */
        public final int f73088c;

        public C15819a(int i, int i2, int i3) {
            this.f73086a = i;
            this.f73087b = i2;
            this.f73088c = i3;
        }
    }

    static {
        ArrayList arrayListM147507f0;
        HashMap map = new HashMap();
        f73083c = map;
        int i = Build.VERSION.SDK_INT;
        map.put(i >= 29 ? jyb.m147507f0("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION") : jyb.m147507f0("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new C15819a(cbc0.f80756Y, R$string.f18201p1, R$string.f18196o1));
        map.put(jyb.m147507f0("android.permission.READ_CONTACTS"), new C15819a(cbc0.f80756Y, R$string.f18171j1, R$string.f18166i1));
        map.put(jyb.m147507f0("android.permission.CAMERA"), new C15819a(cbc0.f80756Y, R$string.f18191n1, R$string.f18186m1));
        if (i >= 34) {
            arrayListM147507f0 = jyb.m147507f0("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        } else {
            arrayListM147507f0 = i >= 33 ? jyb.m147507f0("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO") : jyb.m147507f0("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        map.put(arrayListM147507f0, new C15819a(cbc0.f80756Y, R$string.f18221t1, R$string.f18216s1));
        map.put(jyb.m147507f0("android.permission.RECORD_AUDIO"), new C15819a(cbc0.f80756Y, R$string.f18231v1, R$string.f18226u1));
        map.put(jyb.m147507f0("android.permission.READ_PHONE_STATE"), new C15819a(cbc0.f80756Y, R$string.f18211r1, R$string.f18206q1));
        if (i >= 31) {
            map.put(jyb.m147507f0("android.permission.BLUETOOTH_CONNECT"), new C15819a(cbc0.f80756Y, R$string.f18140d0, R$string.f18135c0));
        }
        map.put(jyb.m147507f0("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"), new C15819a(cbc0.f80755X, R$string.f18181l1, R$string.f18176k1));
        if (i >= 33) {
            map.put(jyb.m147507f0("android.permission.POST_NOTIFICATIONS"), new C15819a(cbc0.f80756Y, R$string.f18170j0, R$string.f18165i0));
        }
    }

    public as60(List<String> list) {
        this.f73084a = list;
    }

    /* JADX INFO: renamed from: c */
    public final C15819a m99887c(Context context) {
        List<String> list = this.f73084a;
        if (list == null) {
            return null;
        }
        for (final String str : list) {
            if (j26.m143188a(context, str) != 0) {
                Map<List<String>, C15819a> map = f73083c;
                List list2 = (List) jyb.m147529r(map.keySet(), new qcj() { // from class: l.zr60
                    @Override // p153l.qcj
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
    public void m99888d() {
        SimplePushBubble simplePushBubble = this.f73085b;
        if (simplePushBubble != null) {
            simplePushBubble.m22134I();
        }
        this.f73085b = null;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m99889e(Activity activity, View view) {
        SimplePushBubble simplePushBubbleM22168s = new SimplePushBubble.C4523a(activity, view).m22170u("" + System.currentTimeMillis()).m22172w(Api.BaseClientBuilder.API_PRIORITY_OTHER).m22162A(5).m22168s();
        this.f73085b = simplePushBubbleM22168s;
        simplePushBubbleM22168s.m126745x(new b3m("PermissionPushBubble"));
        this.f73085b.m126746y(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
        llb0.m154703c().m154710i(this.f73085b);
    }

    /* JADX INFO: renamed from: f */
    public void m99890f(final Activity activity) {
        C15819a c15819aM99887c;
        if (activity == null || activity.isFinishing() || this.f73085b != null || (c15819aM99887c = m99887c(activity)) == null) {
            return;
        }
        final View viewInflate = LayoutInflater.from(activity).inflate(jec0.f120466l, (ViewGroup) null);
        ((VIcon) viewInflate.findViewById(ycc0.f198414F)).setImageResource(c15819aM99887c.f73086a);
        ((VText) viewInflate.findViewById(ycc0.f198481s0)).setText(c15819aM99887c.f73087b);
        ((VText) viewInflate.findViewById(ycc0.f198490x)).setText(c15819aM99887c.f73088c);
        l51.m152887G(new Runnable() { // from class: l.yr60
            @Override // java.lang.Runnable
            public final void run() {
                this.f201283a.m99889e(activity, viewInflate);
            }
        });
    }
}
