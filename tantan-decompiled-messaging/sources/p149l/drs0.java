package p149l;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class drs0 extends mrs0 {

    /* JADX INFO: renamed from: c */
    public final Map f87665c;

    /* JADX INFO: renamed from: d */
    public final Context f87666d;

    /* JADX INFO: renamed from: e */
    public final String f87667e;

    /* JADX INFO: renamed from: f */
    public final long f87668f;

    /* JADX INFO: renamed from: g */
    public final long f87669g;

    /* JADX INFO: renamed from: h */
    public final String f87670h;

    /* JADX INFO: renamed from: i */
    public final String f87671i;

    public drs0(q9t0 q9t0Var, Map map) {
        super(q9t0Var, "createCalendarEvent");
        this.f87665c = map;
        this.f87666d = q9t0Var.zzi();
        this.f87667e = m113338l("description");
        this.f87670h = m113338l("summary");
        this.f87668f = m113337k("start_ticks");
        this.f87669g = m113337k("end_ticks");
        this.f87671i = m113338l("location");
    }

    /* JADX INFO: renamed from: i */
    public final Intent m113335i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f87667e);
        data.putExtra("eventLocation", this.f87671i);
        data.putExtra("description", this.f87670h);
        long j = this.f87668f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f87669g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }

    /* JADX INFO: renamed from: j */
    public final void m113336j() {
        if (this.f87666d == null) {
            m156080c("Activity context is not available.");
            return;
        }
        vny0.m199080r();
        if (!new p6s0(this.f87666d).m167691b()) {
            m156080c("This feature is not available on the device.");
            return;
        }
        vny0.m199080r();
        AlertDialog.Builder builderM12317j = C2075b.m12317j(this.f87666d);
        Resources resourcesM212276e = vny0.m199079q().m212276e();
        builderM12317j.setTitle(resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9672q) : "Create calendar event");
        builderM12317j.setMessage(resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9673r) : "Allow Ad to create a calendar event?");
        builderM12317j.setPositiveButton(resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9670o) : "Accept", new brs0(this));
        builderM12317j.setNegativeButton(resourcesM212276e != null ? resourcesM212276e.getString(R$string.f9671p) : "Decline", new crs0(this));
        builderM12317j.create().show();
    }

    /* JADX INFO: renamed from: k */
    public final long m113337k(String str) {
        String str2 = (String) this.f87665c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m113338l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f87665c.get(str)) ? "" : (String) this.f87665c.get(str);
    }
}
