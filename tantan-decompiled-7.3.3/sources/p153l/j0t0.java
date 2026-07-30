package p153l;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.util.C2098b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes6.dex */
public final class j0t0 extends s0t0 {

    /* JADX INFO: renamed from: c */
    public final Map f117850c;

    /* JADX INFO: renamed from: d */
    public final Context f117851d;

    /* JADX INFO: renamed from: e */
    public final String f117852e;

    /* JADX INFO: renamed from: f */
    public final long f117853f;

    /* JADX INFO: renamed from: g */
    public final long f117854g;

    /* JADX INFO: renamed from: h */
    public final String f117855h;

    /* JADX INFO: renamed from: i */
    public final String f117856i;

    public j0t0(wit0 wit0Var, Map map) {
        super(wit0Var, "createCalendarEvent");
        this.f117850c = map;
        this.f117851d = wit0Var.zzi();
        this.f117852e = m143006l("description");
        this.f117855h = m143006l("summary");
        this.f117853f = m143005k("start_ticks");
        this.f117854g = m143005k("end_ticks");
        this.f117856i = m143006l("location");
    }

    /* JADX INFO: renamed from: i */
    public final Intent m143003i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f117852e);
        data.putExtra("eventLocation", this.f117856i);
        data.putExtra("description", this.f117855h);
        long j = this.f117853f;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.f117854g;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        return data;
    }

    /* JADX INFO: renamed from: j */
    public final void m143004j() {
        if (this.f117851d == null) {
            m183979c("Activity context is not available.");
            return;
        }
        bxy0.m106934r();
        if (!new vfs0(this.f117851d).m201182b()) {
            m183979c("This feature is not available on the device.");
            return;
        }
        bxy0.m106934r();
        AlertDialog.Builder builderM12371j = C2098b.m12371j(this.f117851d);
        Resources resourcesM120261e = bxy0.m106933q().m120261e();
        builderM12371j.setTitle(resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9709q) : "Create calendar event");
        builderM12371j.setMessage(resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9710r) : "Allow Ad to create a calendar event?");
        builderM12371j.setPositiveButton(resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9707o) : HttpHeaders.ACCEPT, new h0t0(this));
        builderM12371j.setNegativeButton(resourcesM120261e != null ? resourcesM120261e.getString(R$string.f9708p) : "Decline", new i0t0(this));
        builderM12371j.create().show();
    }

    /* JADX INFO: renamed from: k */
    public final long m143005k(String str) {
        String str2 = (String) this.f117850c.get(str);
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
    public final String m143006l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f117850c.get(str)) ? "" : (String) this.f117850c.get(str);
    }
}
