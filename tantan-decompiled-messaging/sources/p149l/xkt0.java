package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Api;
import com.tencent.connect.common.Constants;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class xkt0 {

    /* JADX INFO: renamed from: a */
    public final Context f193352a;

    /* JADX INFO: renamed from: b */
    public final aiw0 f193353b;

    /* JADX INFO: renamed from: c */
    public final f3v0 f193354c;

    /* JADX INFO: renamed from: d */
    public final jku0 f193355d;

    /* JADX INFO: renamed from: e */
    public final rmw0 f193356e;

    /* JADX INFO: renamed from: f */
    public final Executor f193357f;

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService f193358g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public sts0 f193359h;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public sts0 f193360i;

    public xkt0(Context context, aiw0 aiw0Var, f3v0 f3v0Var, jku0 jku0Var, rmw0 rmw0Var, rmw0 rmw0Var2, ScheduledExecutorService scheduledExecutorService) {
        this.f193352a = context;
        this.f193353b = aiw0Var;
        this.f193354c = f3v0Var;
        this.f193355d = jku0Var;
        this.f193356e = rmw0Var;
        this.f193357f = rmw0Var2;
        this.f193358g = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m209826h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) d1s0.m109677c().m144697a(m7s0.f131998M9));
    }

    /* JADX INFO: renamed from: b */
    public final gnr m209827b(final String str, Random random) {
        return TextUtils.isEmpty(str) ? jmw0.m142235h(str) : jmw0.m142233f(m209832i(str, this.f193355d.m141914a(), random), Throwable.class, new rlw0() { // from class: l.jkt0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return jmw0.m142235h(str);
            }
        }, this.f193356e);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gnr m209828c(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) d1s0.m109677c().m144697a(m7s0.f132022O9), Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
            return jmw0.m142235h(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) d1s0.m109677c().m144697a(m7s0.f132034P9), "1");
        builderBuildUpon.appendQueryParameter((String) d1s0.m109677c().m144697a(m7s0.f132022O9), Constants.VIA_REPORT_TYPE_SET_AVATAR);
        if (str.contains((CharSequence) d1s0.m109677c().m144697a(m7s0.f132046Q9))) {
            builderBuildUpon.authority((String) d1s0.m109677c().m144697a(m7s0.f132058R9));
        }
        return jmw0.m142241n(amw0.m97696C(this.f193354c.m119266b(builderBuildUpon.build(), inputEvent)), new rlw0() { // from class: l.tkt0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                String str2 = (String) d1s0.m109677c().m144697a(m7s0.f132022O9);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, Constants.VIA_REPORT_TYPE_SET_AVATAR);
                return jmw0.m142235h(builder2.toString());
            }
        }, this.f193357f);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gnr m209829d(Uri.Builder builder, final Throwable th) throws Exception {
        this.f193356e.mo122103a(new Runnable() { // from class: l.ikt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f113725a.m209830f(th);
            }
        });
        builder.appendQueryParameter((String) d1s0.m109677c().m144697a(m7s0.f132022O9), Constants.VIA_SHARE_TYPE_MINI_PROGRAM);
        return jmw0.m142235h(builder.toString());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m209830f(Throwable th) {
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132082T9)).booleanValue();
        Context context = this.f193352a;
        if (zBooleanValue) {
            sts0 sts0VarM176479e = qts0.m176479e(context);
            this.f193360i = sts0VarM176479e;
            sts0VarM176479e.mo176483b(th, "AttributionReporting");
        } else {
            sts0 sts0VarM176477c = qts0.m176477c(context);
            this.f193359h = sts0VarM176477c;
            sts0VarM176477c.mo176483b(th, "AttributionReporting");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m209831g(String str, s5w0 s5w0Var, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        jmw0.m142245r(jmw0.m142242o(m209832i(str, this.f193355d.m141914a(), random), ((Integer) d1s0.m109677c().m144697a(m7s0.f132070S9)).intValue(), TimeUnit.MILLISECONDS, this.f193358g), new wkt0(this, s5w0Var, str), this.f193356e);
    }

    /* JADX INFO: renamed from: i */
    public final gnr m209832i(final String str, final InputEvent inputEvent, Random random) {
        final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (!str.contains((CharSequence) d1s0.m109677c().m144697a(m7s0.f131998M9)) || this.f193353b.mo96947f()) {
            return jmw0.m142235h(str);
        }
        builderBuildUpon.appendQueryParameter((String) d1s0.m109677c().m144697a(m7s0.f132010N9), String.valueOf(random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        if (inputEvent != null) {
            return jmw0.m142233f(jmw0.m142241n(amw0.m97696C(this.f193354c.m119265a()), new rlw0() { // from class: l.kkt0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    return this.f123597a.m209828c(builderBuildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.f193357f), Throwable.class, new rlw0() { // from class: l.lkt0
                @Override // p149l.rlw0
                public final gnr zza(Object obj) {
                    return this.f128601a.m209829d(builderBuildUpon, (Throwable) obj);
                }
            }, this.f193356e);
        }
        builderBuildUpon.appendQueryParameter((String) d1s0.m109677c().m144697a(m7s0.f132022O9), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
        return jmw0.m142235h(builderBuildUpon.toString());
    }
}
