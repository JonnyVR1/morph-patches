package p153l;

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
public final class dut0 {

    /* JADX INFO: renamed from: a */
    public final Context f90852a;

    /* JADX INFO: renamed from: b */
    public final grw0 f90853b;

    /* JADX INFO: renamed from: c */
    public final lcv0 f90854c;

    /* JADX INFO: renamed from: d */
    public final ptu0 f90855d;

    /* JADX INFO: renamed from: e */
    public final xvw0 f90856e;

    /* JADX INFO: renamed from: f */
    public final Executor f90857f;

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorService f90858g;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public y2t0 f90859h;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public y2t0 f90860i;

    public dut0(Context context, grw0 grw0Var, lcv0 lcv0Var, ptu0 ptu0Var, xvw0 xvw0Var, xvw0 xvw0Var2, ScheduledExecutorService scheduledExecutorService) {
        this.f90852a = context;
        this.f90853b = grw0Var;
        this.f90854c = lcv0Var;
        this.f90855d = ptu0Var;
        this.f90856e = xvw0Var;
        this.f90857f = xvw0Var2;
        this.f90858g = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m118172h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) jas0.m144075c().m176505a(sgs0.f168069M9));
    }

    /* JADX INFO: renamed from: b */
    public final hpr m118173b(final String str, Random random) {
        return TextUtils.isEmpty(str) ? pvw0.m173981h(str) : pvw0.m173979f(m118178i(str, this.f90855d.m173781a(), random), Throwable.class, new xuw0() { // from class: l.ptt0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                return pvw0.m173981h(str);
            }
        }, this.f90856e);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hpr m118174c(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) jas0.m144075c().m176505a(sgs0.f168093O9), Constants.VIA_REPORT_TYPE_SHARE_TO_QQ);
            return pvw0.m173981h(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) jas0.m144075c().m176505a(sgs0.f168105P9), "1");
        builderBuildUpon.appendQueryParameter((String) jas0.m144075c().m176505a(sgs0.f168093O9), Constants.VIA_REPORT_TYPE_SET_AVATAR);
        if (str.contains((CharSequence) jas0.m144075c().m176505a(sgs0.f168117Q9))) {
            builderBuildUpon.authority((String) jas0.m144075c().m176505a(sgs0.f168129R9));
        }
        return pvw0.m173987n(gvw0.m132580C(this.f90854c.m153697b(builderBuildUpon.build(), inputEvent)), new xuw0() { // from class: l.ztt0
            @Override // p153l.xuw0
            public final hpr zza(Object obj) {
                String str2 = (String) jas0.m144075c().m176505a(sgs0.f168093O9);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, Constants.VIA_REPORT_TYPE_SET_AVATAR);
                return pvw0.m173981h(builder2.toString());
            }
        }, this.f90857f);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hpr m118175d(Uri.Builder builder, final Throwable th) throws Exception {
        this.f90856e.mo155970a(new Runnable() { // from class: l.ott0
            @Override // java.lang.Runnable
            public final void run() {
                this.f149007a.m118176f(th);
            }
        });
        builder.appendQueryParameter((String) jas0.m144075c().m176505a(sgs0.f168093O9), Constants.VIA_SHARE_TYPE_MINI_PROGRAM);
        return pvw0.m173981h(builder.toString());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m118176f(Throwable th) {
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168153T9)).booleanValue();
        Context context = this.f90852a;
        if (zBooleanValue) {
            y2t0 y2t0VarM204594e = w2t0.m204594e(context);
            this.f90860i = y2t0VarM204594e;
            y2t0VarM204594e.mo204598b(th, "AttributionReporting");
        } else {
            y2t0 y2t0VarM204592c = w2t0.m204592c(context);
            this.f90859h = y2t0VarM204592c;
            y2t0VarM204592c.mo204598b(th, "AttributionReporting");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m118177g(String str, yew0 yew0Var, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        pvw0.m173991r(pvw0.m173988o(m118178i(str, this.f90855d.m173781a(), random), ((Integer) jas0.m144075c().m176505a(sgs0.f168141S9)).intValue(), TimeUnit.MILLISECONDS, this.f90858g), new cut0(this, yew0Var, str), this.f90856e);
    }

    /* JADX INFO: renamed from: i */
    public final hpr m118178i(final String str, final InputEvent inputEvent, Random random) {
        final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (!str.contains((CharSequence) jas0.m144075c().m176505a(sgs0.f168069M9)) || this.f90853b.mo131896f()) {
            return pvw0.m173981h(str);
        }
        builderBuildUpon.appendQueryParameter((String) jas0.m144075c().m176505a(sgs0.f168081N9), String.valueOf(random.nextInt(Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        if (inputEvent != null) {
            return pvw0.m173979f(pvw0.m173987n(gvw0.m132580C(this.f90854c.m153696a()), new xuw0() { // from class: l.qtt0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return this.f159485a.m118174c(builderBuildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.f90857f), Throwable.class, new xuw0() { // from class: l.rtt0
                @Override // p153l.xuw0
                public final hpr zza(Object obj) {
                    return this.f164861a.m118175d(builderBuildUpon, (Throwable) obj);
                }
            }, this.f90856e);
        }
        builderBuildUpon.appendQueryParameter((String) jas0.m144075c().m176505a(sgs0.f168093O9), Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE);
        return pvw0.m173981h(builderBuildUpon.toString());
    }
}
