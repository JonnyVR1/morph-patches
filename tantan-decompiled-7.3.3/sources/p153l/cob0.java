package p153l;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.work.C0768f;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.pushnotification.INotificationRenderer;
import com.clevertap.android.sdk.pushnotification.amp.CTPushAmpWorker;
import com.clevertap.android.sdk.validation.ValidationError;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class cob0 implements yw3 {

    /* JADX INFO: renamed from: d */
    private final sk0 f82842d;

    /* JADX INFO: renamed from: e */
    private final bj2 f82843e;

    /* JADX INFO: renamed from: f */
    private final CleverTapInstanceConfig f82844f;

    /* JADX INFO: renamed from: g */
    private final Context f82845g;

    /* JADX INFO: renamed from: h */
    private final gx3 f82846h;

    /* JADX INFO: renamed from: i */
    private final oa5 f82847i;

    /* JADX INFO: renamed from: k */
    private final u0l0 f82849k;

    /* JADX INFO: renamed from: a */
    private final ArrayList<kob0> f82839a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<xw3> f82840b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private final ArrayList<kob0> f82841c = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    private INotificationRenderer f82848j = new h4a();

    /* JADX INFO: renamed from: l */
    private final Object f82850l = new Object();

    /* JADX INFO: renamed from: m */
    private final Object f82851m = new Object();

    /* JADX INFO: renamed from: l.cob0$a */
    public class CallableC16324a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f82852a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ kob0 f82853b;

        public CallableC16324a(String str, kob0 kob0Var) {
            this.f82852a = str;
            this.f82853b = kob0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (cob0.this.m111609n(this.f82852a, this.f82853b)) {
                return null;
            }
            String strM150592d = this.f82853b.m150592d();
            if (TextUtils.isEmpty(strM150592d)) {
                return null;
            }
            v5g0.m199864y(cob0.this.f82845g, cob0.this.f82844f.getAccountId(), strM150592d, this.f82852a);
            cob0.this.f82844f.log("PushProvider", this.f82853b + "Cached New Token successfully " + this.f82852a);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.cob0$b */
    public class CallableC16325b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bundle f82855a;

        public CallableC16325b(Bundle bundle) {
            this.f82855a = bundle;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            String string = this.f82855a.getString(Constants.NOTIF_MSG);
            if (string == null) {
                string = "";
            }
            if (string.isEmpty()) {
                cob0.this.f82844f.getLogger().verbose(cob0.this.f82844f.getAccountId(), "Push notification message is empty, not rendering");
                cob0.this.f82843e.mo104583c(cob0.this.f82845g).m133297P();
                String string2 = this.f82855a.getString(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, "");
                if (TextUtils.isEmpty(string2)) {
                    return null;
                }
                cob0 cob0Var = cob0.this;
                cob0Var.m111625Y(cob0Var.f82845g, Integer.parseInt(string2));
                return null;
            }
            String string3 = this.f82855a.getString(Constants.WZRK_PUSH_ID);
            String string4 = this.f82855a.getString("wzrk_ttl");
            long jMo166827c = cob0.this.f82847i.mo166827c() + Constants.DEFAULT_PUSH_TTL_SECONDS;
            if (string4 != null) {
                jMo166827c = Long.parseLong(string4);
            }
            cob0 cob0Var2 = cob0.this;
            if (string3 == null) {
                cob0Var2.f82844f.getLogger().verbose("Will not save Push Notification in DB due to invalid id, processCustomPushNotification");
                return null;
            }
            cob0Var2.f82844f.getLogger().verbose("Storing Push Notification..." + string3 + " - with ttl - " + string4);
            cob0.this.f82843e.mo104583c(cob0.this.f82845g).m133296O(string3, jMo166827c);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.cob0$c */
    public class CallableC16326c implements Callable<Void> {
        public CallableC16326c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            cob0.this.m111611q(true);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.cob0$d */
    public class CallableC16327d implements Callable<Void> {
        public CallableC16327d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            cob0 cob0Var = cob0.this;
            cob0Var.m111595U(cob0Var.f82845g);
            if (cob0.this.f82844f.isBackgroundSync() && !cob0.this.f82844f.isAnalyticsOnly()) {
                cob0.this.m111611q(false);
                return null;
            }
            cob0.this.f82844f.getLogger().debug(cob0.this.f82844f.getAccountId(), "Pushamp - Cancelling worker as background sync is disabled or config is analytics only");
            cob0.this.m111596V();
            return null;
        }
    }

    /* JADX INFO: renamed from: l.cob0$e */
    public class CallableC16328e implements Callable<Void> {
        public CallableC16328e() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            cob0.this.m111591O();
            cob0.this.m111592P();
            return null;
        }
    }

    private cob0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, bj2 bj2Var, u0l0 u0l0Var, sk0 sk0Var, gx3 gx3Var, oa5 oa5Var) {
        this.f82845g = context;
        this.f82844f = cleverTapInstanceConfig;
        this.f82847i = oa5Var;
        this.f82843e = bj2Var;
        this.f82849k = u0l0Var;
        this.f82842d = sk0Var;
        this.f82846h = gx3Var;
        m111584E();
    }

    /* JADX INFO: renamed from: A */
    private int m111582A(Context context) {
        return v5g0.m199851c(context, com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, 240);
    }

    /* JADX INFO: renamed from: D */
    private void m111583D() {
        m111610p();
        ru3.m183186c(this.f82844f).m187991e("PushProviders").m7000g("asyncFindAvailableCTPushProviders", new Callable() { // from class: l.bob0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cob0.m111598b(this.f77664a);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private void m111584E() {
        ru3.m183186c(this.f82844f).m187991e("PushProviders").m7000g("createOrResetWorker", new CallableC16327d());
    }

    /* JADX INFO: renamed from: G */
    private boolean m111585G(Date date, Date date2, Date date3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date3);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date2);
        if (date2.compareTo(date) < 0) {
            if (calendar2.compareTo(calendar3) < 0) {
                calendar2.add(5, 1);
            }
            calendar3.add(5, 1);
        }
        return calendar2.compareTo(calendar) >= 0 && calendar2.compareTo(calendar3) < 0;
    }

    /* JADX INFO: renamed from: H */
    private boolean m111586H(xw3 xw3Var) {
        if (80200 >= xw3Var.minSDKSupportVersionCode()) {
            return true;
        }
        this.f82844f.log("PushProvider", "Provider: %s version %s does not match the SDK version %s. Make sure all CleverTap dependencies are the same version.");
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: I */
    public static cob0 m111587I(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, bj2 bj2Var, u0l0 u0l0Var, sk0 sk0Var, w36 w36Var, gx3 gx3Var, oa5 oa5Var) {
        cob0 cob0Var = new cob0(context, cleverTapInstanceConfig, bj2Var, u0l0Var, sk0Var, gx3Var, oa5Var);
        cob0Var.m111583D();
        w36Var.m204760w(cob0Var);
        return cob0Var;
    }

    /* JADX INFO: renamed from: K */
    private Date m111588K(String str, SimpleDateFormat simpleDateFormat) {
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException unused) {
            return new Date(0L);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: M */
    private void m111589M(String str, boolean z, kob0 kob0Var) {
        if (kob0Var == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = m111632z(kob0Var);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f82850l) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                String str2 = z ? "register" : MiPushClient.COMMAND_UNREGISTER;
                try {
                    jSONObject2.put("action", str2);
                    jSONObject2.put("id", str);
                    jSONObject2.put("type", kob0Var.m150593e());
                    jSONObject.put("data", jSONObject2);
                    this.f82844f.getLogger().verbose(this.f82844f.getAccountId(), kob0Var + str2 + " device token " + str);
                    this.f82842d.m186389R(jSONObject);
                } catch (Throwable th) {
                    this.f82844f.getLogger().verbose(this.f82844f.getAccountId(), kob0Var + str2 + " device token failed", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    private void m111590N() {
        ru3.m183186c(this.f82844f).m187991e("PushProviders").m7000g("PushProviders#refreshAllTokens", new CallableC16328e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m111591O() {
        for (xw3 xw3Var : this.f82840b) {
            try {
                xw3Var.requestToken();
            } catch (Throwable th) {
                this.f82844f.log("PushProvider", "Token Refresh error " + xw3Var, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public void m111592P() {
        for (kob0 kob0Var : this.f82841c) {
            try {
                m111589M(m111632z(kob0Var), true, kob0Var);
            } catch (Throwable th) {
                this.f82844f.log("PushProvider", "Token Refresh error " + kob0Var, th);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m111593Q(String str, kob0 kob0Var) {
        m111589M(str, true, kob0Var);
        m111628o(str, kob0Var);
    }

    /* JADX INFO: renamed from: S */
    private void m111594S(Context context, int i) {
        v5g0.m199860q(context, com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: U */
    public void m111595U(Context context) {
        int iM199851c = v5g0.m199851c(context, "pfjobid", -1);
        if (iM199851c != -1) {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(iM199851c);
            v5g0.m199865z(context, "pfjobid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m111596V() {
        String strM199855i = v5g0.m199855i(this.f82845g, "pfworkid", "");
        if (strM199855i.equals("")) {
            return;
        }
        try {
            WorkManager.m4349h(this.f82845g).mo4352b(strM199855i);
            v5g0.m199862v(this.f82845g, "pfworkid", "");
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Pushamp - Successfully cancelled work");
        } catch (Exception unused) {
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Pushamp - Failure while cancelling work");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.core.app.NotificationCompat$Builder] */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.core.app.NotificationCompat$Builder] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.clevertap.android.sdk.pushnotification.INotificationRenderer] */
    /* JADX WARN: Type inference failed for: r1v38, types: [androidx.core.app.NotificationCompat$Builder] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r4v19, types: [l.z81] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.core.app.NotificationCompat$Builder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: W */
    private void m111597W(Context context, Bundle bundle, int i) {
        String strM151791l;
        int iM198757t;
        ?? r13;
        boolean z;
        ?? builder;
        boolean zEquals;
        String string;
        ValidationError validationError;
        int iHashCode = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Unable to render notification, Notification Manager is null.");
            return;
        }
        String string2 = bundle.getString(Constants.WZRK_CHANNEL_ID, "");
        boolean z2 = Build.VERSION.SDK_INT >= 26;
        if (z2) {
            if (string2.isEmpty()) {
                validationError = ValidationError.CHANNEL_ID_MISSING_IN_PAYLOAD;
                string = bundle.toString();
            } else if (notificationManager.getNotificationChannel(string2) == null) {
                validationError = ValidationError.CHANNEL_ID_NOT_REGISTERED;
                string = string2;
            } else {
                string = "";
                validationError = null;
            }
            if (validationError != null) {
                s0l0 s0l0VarM188803a = t0l0.m188803a(validationError, string);
                this.f82844f.getLogger().debug(this.f82844f.getAccountId(), s0l0VarM188803a.m183968b());
                this.f82849k.m193845c(s0l0VarM188803a);
            }
            strM151791l = kx3.m151791l(notificationManager, string2, context, bu9.m106440x() && "true".equalsIgnoreCase(bundle.getString(Constants.WZRK_SILENCE_IN_FOREGROUND)));
            if (strM151791l == null || strM151791l.trim().isEmpty()) {
                this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Not rendering Push since channel id is null or blank.");
                return;
            }
            boolean zM151797r = kx3.m151797r(context, strM151791l);
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f82844f;
            if (!zM151797r) {
                cleverTapInstanceConfig.getLogger().verbose(this.f82844f.getAccountId(), "Not rendering push notification as channel = " + strM151791l + " is blocked by user");
                return;
            }
            cleverTapInstanceConfig.getLogger().debug(this.f82844f.getAccountId(), "Rendering Push on channel = ".concat(strM151791l));
        } else {
            strM151791l = null;
        }
        try {
            String strM5943l = ManifestInfo.getInstance(context).m5943l();
            if (strM5943l == null) {
                throw new IllegalArgumentException();
            }
            iM198757t = context.getResources().getIdentifier(strM5943l, "drawable", context.getPackageName());
            if (iM198757t == 0) {
                throw new IllegalArgumentException();
            }
            this.f82848j.setSmallIcon(iM198757t, context);
            String string3 = bundle.getString(Constants.NOTIF_PRIORITY);
            if (string3 != null) {
                zEquals = string3.equals(Constants.PRIORITY_HIGH);
                if (string3.equals(Constants.PRIORITY_MAX)) {
                    r13 = zEquals;
                    r13 = 2;
                }
            } else {
                r13 = 0;
            }
            r13 = zEquals;
            if (iHashCode == -1000) {
                try {
                    Object collapseKey = this.f82848j.getCollapseKey(bundle);
                    if (collapseKey != null) {
                        if (collapseKey instanceof Number) {
                            iHashCode = ((Number) collapseKey).intValue();
                        } else {
                            if (collapseKey instanceof String) {
                                try {
                                    iHashCode = Integer.parseInt(collapseKey.toString());
                                    z = z2;
                                    try {
                                        this.f82844f.getLogger().verbose(this.f82844f.getAccountId(), "Converting collapse_key: " + collapseKey + " to notificationId int: " + iHashCode);
                                    } catch (NumberFormatException unused) {
                                        try {
                                            iHashCode = collapseKey.toString().hashCode();
                                            this.f82844f.getLogger().verbose(this.f82844f.getAccountId(), "Converting collapse_key: " + collapseKey + " to notificationId int: " + iHashCode);
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                } catch (NumberFormatException unused3) {
                                    z = z2;
                                }
                            }
                            iHashCode = Math.abs(iHashCode);
                            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Creating the notification id: " + iHashCode + " from collapse_key: " + collapseKey);
                        }
                        z = z2;
                        iHashCode = Math.abs(iHashCode);
                        this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Creating the notification id: " + iHashCode + " from collapse_key: " + collapseKey);
                    } else {
                        z = z2;
                    }
                } catch (NumberFormatException unused4) {
                }
            } else {
                z = z2;
                this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Have user provided notificationId: " + iHashCode + " won't use collapse_key (if any) as basis for notificationId");
            }
            if (iHashCode == -1000) {
                iHashCode = (int) (Math.random() * 100.0d);
                this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Setting random notificationId: " + iHashCode);
            }
            int i2 = iHashCode;
            if (z) {
                builder = new NotificationCompat.Builder(context, strM151791l);
                String string4 = bundle.getString(Constants.WZRK_BADGE_ICON, null);
                if (string4 != null) {
                    try {
                        int i3 = Integer.parseInt(string4);
                        if (i3 >= 0) {
                            builder.setBadgeIconType(i3);
                        }
                    } catch (Throwable unused5) {
                    }
                }
                String string5 = bundle.getString(Constants.WZRK_BADGE_COUNT, null);
                if (string5 != null) {
                    try {
                        int i4 = Integer.parseInt(string5);
                        if (i4 >= 0) {
                            builder.setNumber(i4);
                        }
                    } catch (Throwable unused6) {
                    }
                }
            } else {
                builder = new NotificationCompat.Builder(context);
            }
            builder.setPriority(r13);
            INotificationRenderer iNotificationRenderer = this.f82848j;
            ?? Mo133551a = builder;
            if (iNotificationRenderer instanceof z81) {
                Mo133551a = ((z81) iNotificationRenderer).mo133551a(context, bundle, builder, this.f82844f);
            }
            NotificationCompat.Builder builderRenderNotification = this.f82848j.renderNotification(bundle, context, Mo133551a, this.f82844f, i2);
            if (builderRenderNotification == null) {
                return;
            }
            Notification notificationBuild = builderRenderNotification.build();
            jj5.m145013g(notificationManager, i2, notificationBuild);
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Rendered notification: " + notificationBuild);
            String string6 = bundle.getString(Constants.EXTRAS_FROM);
            if (string6 == null || !string6.equals("PTReceiver")) {
                String string7 = bundle.getString("wzrk_ttl");
                long jMo166827c = this.f82847i.mo166827c() + Constants.DEFAULT_PUSH_TTL_SECONDS;
                if (string7 != null) {
                    jMo166827c = Long.parseLong(string7);
                }
                String string8 = bundle.getString(Constants.WZRK_PUSH_ID);
                h1c h1cVarMo104583c = this.f82843e.mo104583c(context);
                CleverTapInstanceConfig cleverTapInstanceConfig2 = this.f82844f;
                if (string8 != null) {
                    cleverTapInstanceConfig2.getLogger().verbose("Storing Push Notification..." + string8 + " - with ttl - " + string7);
                    h1cVarMo104583c.m133296O(string8, jMo166827c);
                } else {
                    cleverTapInstanceConfig2.getLogger().verbose("Will not save Push Notification in DB due to invalid id");
                }
                if (!"true".equals(bundle.getString(Constants.WZRK_RNV, ""))) {
                    s0l0 s0l0VarM188803a2 = t0l0.m188803a(ValidationError.NOTIFICATION_VIEWED_DISABLED, bundle.toString());
                    this.f82844f.getLogger().debug(s0l0VarM188803a2.m183968b());
                    this.f82849k.m193845c(s0l0VarM188803a2);
                    return;
                }
                long j = bundle.getLong(Constants.OMR_INVOKE_TIME_IN_MILLIS, -1L);
                if (j >= 0) {
                    long jCurrentTimeMillis = this.f82847i.currentTimeMillis() - j;
                    this.f82844f.getLogger().verbose("Rendered Push Notification in " + jCurrentTimeMillis + " millis");
                }
                this.f82846h.m132743a();
                this.f82842d.m186384M(bundle);
            }
        } catch (Throwable unused7) {
            iM198757t = uzd.m198757t(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m111598b(cob0 cob0Var) {
        cob0Var.m111614u();
        cob0Var.m111615v();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public boolean m111609n(String str, kob0 kob0Var) {
        boolean z = (TextUtils.isEmpty(str) || kob0Var == null || !str.equalsIgnoreCase(m111632z(kob0Var))) ? false : true;
        if (kob0Var != null) {
            this.f82844f.log("PushProvider", kob0Var + "Token Already available value: " + z);
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    private void m111610p() {
        for (kob0 kob0Var : this.f82844f.getPushTypes()) {
            String strM150591c = kob0Var.m150591c();
            try {
                Class.forName(strM150591c);
                this.f82839a.add(kob0Var);
                this.f82844f.log("PushProvider", "SDK Class Available :" + strM150591c);
            } catch (Exception e) {
                this.f82844f.log("PushProvider", "SDK class Not available " + strM150591c + " Exception:" + e.getClass().getName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m111611q(boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Pushamp feature is not supported below Oreo");
            return;
        }
        String strM199855i = v5g0.m199855i(this.f82845g, "pfworkid", "");
        int iM111582A = m111582A(this.f82845g);
        if (strM199855i.equals("") && iM111582A <= 0) {
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Pushamp - There is no running work and nothing to create");
            return;
        }
        if (iM111582A <= 0) {
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Pushamp - Cancelling worker as pingFrequency <=0 ");
            m111596V();
            return;
        }
        try {
            WorkManager workManagerM4349h = WorkManager.m4349h(this.f82845g);
            if (!strM199855i.equals("") && !z) {
                return;
            }
            l06 l06VarM152318a = new l06.C18324a().m152319b(NetworkType.CONNECTED).m152321d(false).m152320c(true).m152318a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            C0768f c0768fM4438b = new C0768f.a(CTPushAmpWorker.class, iM111582A, timeUnit, 5L, timeUnit).m4443i(l06VarM152318a).m4438b();
            if (strM199855i.equals("")) {
                strM199855i = this.f82844f.getAccountId();
            }
            workManagerM4349h.mo4355e(strM199855i, ExistingPeriodicWorkPolicy.UPDATE, c0768fM4438b);
            v5g0.m199862v(this.f82845g, "pfworkid", strM199855i);
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Pushamp - Finished scheduling periodic work request - " + strM199855i + " with repeatInterval- " + iM111582A + " minutes");
        } catch (Exception e) {
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Pushamp - Failed scheduling/cancelling periodic work request" + e);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    private List<xw3> m111612r() {
        ArrayList arrayList = new ArrayList();
        Iterator<kob0> it = this.f82839a.iterator();
        while (it.hasNext()) {
            xw3 xw3VarM111616y = m111616y(it.next());
            if (xw3VarM111616y != null) {
                arrayList.add(xw3VarM111616y);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    private void m111614u() {
        List<xw3> listM111612r = m111612r();
        if (listM111612r.isEmpty()) {
            this.f82844f.log("PushProvider", "No push providers found!. Make sure to install at least one push provider");
            return;
        }
        for (xw3 xw3Var : listM111612r) {
            if (!m111586H(xw3Var)) {
                this.f82844f.log("PushProvider", "Invalid Provider: " + xw3Var.getClass());
            } else if (xw3Var.isSupported()) {
                boolean zIsAvailable = xw3Var.isAvailable();
                CleverTapInstanceConfig cleverTapInstanceConfig = this.f82844f;
                if (zIsAvailable) {
                    cleverTapInstanceConfig.log("PushProvider", "Available Provider: " + xw3Var.getClass());
                    this.f82840b.add(xw3Var);
                } else {
                    cleverTapInstanceConfig.log("PushProvider", "Unavailable Provider: " + xw3Var.getClass());
                }
            } else {
                this.f82844f.log("PushProvider", "Unsupported Provider: " + xw3Var.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private void m111615v() {
        this.f82841c.addAll(this.f82839a);
        Iterator<xw3> it = this.f82840b.iterator();
        while (it.hasNext()) {
            this.f82841c.remove(it.next().getPushType());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    private xw3 m111616y(kob0 kob0Var) {
        String strM150590b = kob0Var.m150590b();
        xw3 xw3Var = null;
        try {
            xw3 xw3Var2 = (xw3) Class.forName(strM150590b).getConstructor(yw3.class, Context.class, CleverTapInstanceConfig.class).newInstance(this, this.f82845g, this.f82844f);
            try {
                this.f82844f.log("PushProvider", "Found provider:" + strM150590b);
                return xw3Var2;
            } catch (ClassNotFoundException unused) {
                xw3Var = xw3Var2;
                this.f82844f.log("PushProvider", "Unable to create provider ClassNotFoundException" + strM150590b);
                return xw3Var;
            } catch (IllegalAccessException unused2) {
                xw3Var = xw3Var2;
                this.f82844f.log("PushProvider", "Unable to create provider IllegalAccessException" + strM150590b);
                return xw3Var;
            } catch (InstantiationException unused3) {
                xw3Var = xw3Var2;
                this.f82844f.log("PushProvider", "Unable to create provider InstantiationException" + strM150590b);
                return xw3Var;
            } catch (Exception e) {
                e = e;
                xw3Var = xw3Var2;
                this.f82844f.log("PushProvider", "Unable to create provider " + strM150590b + " Exception:" + e.getClass().getName());
                return xw3Var;
            }
        } catch (ClassNotFoundException unused4) {
        } catch (IllegalAccessException unused5) {
        } catch (InstantiationException unused6) {
        } catch (Exception e2) {
            e = e2;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: B */
    public Object m111617B() {
        return this.f82851m;
    }

    /* JADX INFO: renamed from: C */
    public void m111618C(String str, kob0 kob0Var, boolean z) {
        if (z) {
            m111593Q(str, kob0Var);
        } else {
            m111624X(str, kob0Var);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m111619F() {
        Iterator<kob0> it = m111631x().iterator();
        while (it.hasNext()) {
            if (m111632z(it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public void m111620J() {
        m111590N();
    }

    /* JADX INFO: renamed from: L */
    public void m111621L(Bundle bundle) {
        ru3.m183186c(this.f82844f).m187990d().m7000g("customHandlePushAmplification", new CallableC16325b(bundle));
    }

    /* JADX INFO: renamed from: R */
    public void m111622R(Context context) {
        Logger.m5928v(this.f82844f.getAccountId(), "Pushamp - Running work request");
        if (!m111619F()) {
            Logger.m5928v(this.f82844f.getAccountId(), "Pushamp - Token is not present, not running the work request");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
        if (m111585G(m111588K(Constants.DND_START, simpleDateFormat), m111588K(Constants.DND_STOP, simpleDateFormat), m111588K(i + ":" + i2, simpleDateFormat))) {
            Logger.m5928v(this.f82844f.getAccountId(), "Pushamp won't run in default DND hours");
            return;
        }
        long jM133316x = this.f82843e.mo104583c(context).m133316x();
        if (jM133316x == 0 || jM133316x > this.f82847i.currentTimeMillis() - 86400000) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bk", 1);
                this.f82842d.m186391T(jSONObject);
                Logger.m5928v(this.f82844f.getAccountId(), "Pushamp - Successfully completed work request");
            } catch (JSONException unused) {
                Logger.m5927v("Pushamp - Unable to complete work request");
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: T */
    public void m111623T(@NonNull INotificationRenderer iNotificationRenderer) {
        this.f82848j = iNotificationRenderer;
    }

    /* JADX INFO: renamed from: X */
    public void m111624X(String str, kob0 kob0Var) {
        m111589M(str, false, kob0Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m111625Y(Context context, int i) {
        this.f82844f.getLogger().verbose("Ping frequency received - " + i);
        this.f82844f.getLogger().verbose("Stored Ping Frequency - " + m111582A(context));
        if (i != m111582A(context)) {
            m111594S(context, i);
            if (!this.f82844f.isBackgroundSync() || this.f82844f.isAnalyticsOnly()) {
                return;
            }
            ru3.m183186c(this.f82844f).m187991e("PushProviders").m7000g("createOrResetWorker", new CallableC16326c());
        }
    }

    @Override // p153l.yw3
    /* JADX INFO: renamed from: a */
    public void mo111626a(String str, kob0 kob0Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m111629t(str, kob0Var);
        m111613s(str, kob0Var);
    }

    /* JADX INFO: renamed from: c */
    public void m111627c(Context context, Bundle bundle, int i) {
        if (bundle == null || bundle.get(Constants.NOTIFICATION_TAG) == null) {
            return;
        }
        if (this.f82844f.isAnalyticsOnly()) {
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Instance is set for Analytics only, cannot create notification");
            return;
        }
        try {
            if (bundle.getString(Constants.WZRK_PUSH_SILENT, "").equalsIgnoreCase("true")) {
                this.f82842d.m186384M(bundle);
                return;
            }
            String string = bundle.getString(Constants.EXTRAS_FROM);
            if (string == null || !string.equals("PTReceiver")) {
                this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Handling notification: " + bundle);
                if (bundle.getString(Constants.WZRK_PUSH_ID) != null && this.f82843e.mo104583c(context).m133309n(bundle.getString(Constants.WZRK_PUSH_ID))) {
                    this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Push Notification already rendered, not showing again");
                    return;
                }
                String message = this.f82848j.getMessage(bundle);
                if (message == null) {
                    message = "";
                }
                if (message.isEmpty()) {
                    this.f82844f.getLogger().verbose(this.f82844f.getAccountId(), "Push notification message is empty, not rendering");
                    this.f82843e.mo104583c(context).m133297P();
                    String string2 = bundle.getString(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, "");
                    if (TextUtils.isEmpty(string2)) {
                        return;
                    }
                    m111625Y(context, Integer.parseInt(string2));
                    return;
                }
            }
            if (this.f82848j.getTitle(bundle, context).isEmpty()) {
                String str = context.getApplicationInfo().name;
            }
            m111597W(context, bundle, i);
        } catch (Throwable th) {
            this.f82844f.getLogger().debug(this.f82844f.getAccountId(), "Couldn't render notification: ", th);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m111628o(String str, kob0 kob0Var) {
        if (TextUtils.isEmpty(str) || kob0Var == null) {
            return;
        }
        try {
            ru3.m183186c(this.f82844f).m187987a().m7000g("PushProviders#cacheToken", new CallableC16324a(str, kob0Var));
        } catch (Throwable th) {
            this.f82844f.log("PushProvider", kob0Var + "Unable to cache token " + str, th);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: t */
    public void m111629t(String str, kob0 kob0Var) {
        if (TextUtils.isEmpty(str) || kob0Var == null) {
            return;
        }
        m111618C(str, kob0Var, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: w */
    public void m111630w(boolean z) {
        Iterator<kob0> it = this.f82839a.iterator();
        while (it.hasNext()) {
            m111589M(null, z, it.next());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public ArrayList<kob0> m111631x() {
        ArrayList<kob0> arrayList = new ArrayList<>();
        Iterator<xw3> it = this.f82840b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPushType());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public String m111632z(kob0 kob0Var) {
        if (kob0Var != null) {
            String strM150592d = kob0Var.m150592d();
            if (!TextUtils.isEmpty(strM150592d)) {
                String strM199857k = v5g0.m199857k(this.f82845g, this.f82844f.getAccountId(), strM150592d, null);
                this.f82844f.log("PushProvider", kob0Var + "getting Cached Token - " + strM199857k);
                return strM199857k;
            }
        }
        if (kob0Var != null) {
            this.f82844f.log("PushProvider", kob0Var + " Unable to find cached Token for type ");
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private void m111613s(String str, kob0 kob0Var) {
    }
}
