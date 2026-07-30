package p149l;

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
import androidx.work.C0766f;
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
public class yfb0 implements zv3 {

    /* JADX INFO: renamed from: d */
    private final wk0 f198030d;

    /* JADX INFO: renamed from: e */
    private final ui2 f198031e;

    /* JADX INFO: renamed from: f */
    private final CleverTapInstanceConfig f198032f;

    /* JADX INFO: renamed from: g */
    private final Context f198033g;

    /* JADX INFO: renamed from: h */
    private final hw3 f198034h;

    /* JADX INFO: renamed from: i */
    private final n95 f198035i;

    /* JADX INFO: renamed from: k */
    private final ork0 f198037k;

    /* JADX INFO: renamed from: a */
    private final ArrayList<ggb0> f198027a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private final ArrayList<yv3> f198028b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    private final ArrayList<ggb0> f198029c = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    private INotificationRenderer f198036j = new w2a();

    /* JADX INFO: renamed from: l */
    private final Object f198038l = new Object();

    /* JADX INFO: renamed from: m */
    private final Object f198039m = new Object();

    /* JADX INFO: renamed from: l.yfb0$a */
    public class CallableC21384a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f198040a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ggb0 f198041b;

        public CallableC21384a(String str, ggb0 ggb0Var) {
            this.f198040a = str;
            this.f198041b = ggb0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (yfb0.this.m214520n(this.f198040a, this.f198041b)) {
                return null;
            }
            String strM125958d = this.f198041b.m125958d();
            if (TextUtils.isEmpty(strM125958d)) {
                return null;
            }
            mxf0.m156898y(yfb0.this.f198033g, yfb0.this.f198032f.getAccountId(), strM125958d, this.f198040a);
            yfb0.this.f198032f.log("PushProvider", this.f198041b + "Cached New Token successfully " + this.f198040a);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.yfb0$b */
    public class CallableC21385b implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Bundle f198043a;

        public CallableC21385b(Bundle bundle) {
            this.f198043a = bundle;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            String string = this.f198043a.getString(Constants.NOTIF_MSG);
            if (string == null) {
                string = "";
            }
            if (string.isEmpty()) {
                yfb0.this.f198032f.getLogger().verbose(yfb0.this.f198032f.getAccountId(), "Push notification message is empty, not rendering");
                yfb0.this.f198031e.mo94410c(yfb0.this.f198033g).m191165P();
                String string2 = this.f198043a.getString(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, "");
                if (TextUtils.isEmpty(string2)) {
                    return null;
                }
                yfb0 yfb0Var = yfb0.this;
                yfb0Var.m214536Y(yfb0Var.f198033g, Integer.parseInt(string2));
                return null;
            }
            String string3 = this.f198043a.getString(Constants.WZRK_PUSH_ID);
            String string4 = this.f198043a.getString("wzrk_ttl");
            long jMo158533c = yfb0.this.f198035i.mo158533c() + Constants.DEFAULT_PUSH_TTL_SECONDS;
            if (string4 != null) {
                jMo158533c = Long.parseLong(string4);
            }
            yfb0 yfb0Var2 = yfb0.this;
            if (string3 == null) {
                yfb0Var2.f198032f.getLogger().verbose("Will not save Push Notification in DB due to invalid id, processCustomPushNotification");
                return null;
            }
            yfb0Var2.f198032f.getLogger().verbose("Storing Push Notification..." + string3 + " - with ttl - " + string4);
            yfb0.this.f198031e.mo94410c(yfb0.this.f198033g).m191164O(string3, jMo158533c);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.yfb0$c */
    public class CallableC21386c implements Callable<Void> {
        public CallableC21386c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            yfb0.this.m214522q(true);
            return null;
        }
    }

    /* JADX INFO: renamed from: l.yfb0$d */
    public class CallableC21387d implements Callable<Void> {
        public CallableC21387d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            yfb0 yfb0Var = yfb0.this;
            yfb0Var.m214506U(yfb0Var.f198033g);
            if (yfb0.this.f198032f.isBackgroundSync() && !yfb0.this.f198032f.isAnalyticsOnly()) {
                yfb0.this.m214522q(false);
                return null;
            }
            yfb0.this.f198032f.getLogger().debug(yfb0.this.f198032f.getAccountId(), "Pushamp - Cancelling worker as background sync is disabled or config is analytics only");
            yfb0.this.m214507V();
            return null;
        }
    }

    /* JADX INFO: renamed from: l.yfb0$e */
    public class CallableC21388e implements Callable<Void> {
        public CallableC21388e() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            yfb0.this.m214502O();
            yfb0.this.m214503P();
            return null;
        }
    }

    private yfb0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ui2 ui2Var, ork0 ork0Var, wk0 wk0Var, hw3 hw3Var, n95 n95Var) {
        this.f198033g = context;
        this.f198032f = cleverTapInstanceConfig;
        this.f198035i = n95Var;
        this.f198031e = ui2Var;
        this.f198037k = ork0Var;
        this.f198030d = wk0Var;
        this.f198034h = hw3Var;
        m214495E();
    }

    /* JADX INFO: renamed from: A */
    private int m214493A(Context context) {
        return mxf0.m156885c(context, com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, 240);
    }

    /* JADX INFO: renamed from: D */
    private void m214494D() {
        m214521p();
        st3.m185849c(this.f198032f).m190593e("PushProviders").m6946g("asyncFindAvailableCTPushProviders", new Callable() { // from class: l.xfb0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yfb0.m214509b(this.f192678a);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    private void m214495E() {
        st3.m185849c(this.f198032f).m190593e("PushProviders").m6946g("createOrResetWorker", new CallableC21387d());
    }

    /* JADX INFO: renamed from: G */
    private boolean m214496G(Date date, Date date2, Date date3) {
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
    private boolean m214497H(yv3 yv3Var) {
        if (80200 >= yv3Var.minSDKSupportVersionCode()) {
            return true;
        }
        this.f198032f.log("PushProvider", "Provider: %s version %s does not match the SDK version %s. Make sure all CleverTap dependencies are the same version.");
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: I */
    public static yfb0 m214498I(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, ui2 ui2Var, ork0 ork0Var, wk0 wk0Var, r26 r26Var, hw3 hw3Var, n95 n95Var) {
        yfb0 yfb0Var = new yfb0(context, cleverTapInstanceConfig, ui2Var, ork0Var, wk0Var, hw3Var, n95Var);
        yfb0Var.m214494D();
        r26Var.m177588w(yfb0Var);
        return yfb0Var;
    }

    /* JADX INFO: renamed from: K */
    private Date m214499K(String str, SimpleDateFormat simpleDateFormat) {
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
    private void m214500M(String str, boolean z, ggb0 ggb0Var) {
        if (ggb0Var == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = m214543z(ggb0Var);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f198038l) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                String str2 = z ? "register" : MiPushClient.COMMAND_UNREGISTER;
                try {
                    jSONObject2.put("action", str2);
                    jSONObject2.put("id", str);
                    jSONObject2.put("type", ggb0Var.m125959e());
                    jSONObject.put("data", jSONObject2);
                    this.f198032f.getLogger().verbose(this.f198032f.getAccountId(), ggb0Var + str2 + " device token " + str);
                    this.f198030d.m203633R(jSONObject);
                } catch (Throwable th) {
                    this.f198032f.getLogger().verbose(this.f198032f.getAccountId(), ggb0Var + str2 + " device token failed", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: N */
    private void m214501N() {
        st3.m185849c(this.f198032f).m190593e("PushProviders").m6946g("PushProviders#refreshAllTokens", new CallableC21388e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m214502O() {
        for (yv3 yv3Var : this.f198028b) {
            try {
                yv3Var.requestToken();
            } catch (Throwable th) {
                this.f198032f.log("PushProvider", "Token Refresh error " + yv3Var, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public void m214503P() {
        for (ggb0 ggb0Var : this.f198029c) {
            try {
                m214500M(m214543z(ggb0Var), true, ggb0Var);
            } catch (Throwable th) {
                this.f198032f.log("PushProvider", "Token Refresh error " + ggb0Var, th);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m214504Q(String str, ggb0 ggb0Var) {
        m214500M(str, true, ggb0Var);
        m214539o(str, ggb0Var);
    }

    /* JADX INFO: renamed from: S */
    private void m214505S(Context context, int i) {
        mxf0.m156894q(context, com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: U */
    public void m214506U(Context context) {
        int iM156885c = mxf0.m156885c(context, "pfjobid", -1);
        if (iM156885c != -1) {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(iM156885c);
            mxf0.m156899z(context, "pfjobid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m214507V() {
        String strM156889i = mxf0.m156889i(this.f198033g, "pfworkid", "");
        if (strM156889i.equals("")) {
            return;
        }
        try {
            WorkManager.m4347h(this.f198033g).mo4350b(strM156889i);
            mxf0.m156896v(this.f198033g, "pfworkid", "");
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Pushamp - Successfully cancelled work");
        } catch (Exception unused) {
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Pushamp - Failure while cancelling work");
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
    /* JADX WARN: Type inference failed for: r4v19, types: [l.s81] */
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
    private void m214508W(Context context, Bundle bundle, int i) {
        String strM151942l;
        int iM133534t;
        ?? r13;
        boolean z;
        ?? builder;
        boolean zEquals;
        String string;
        ValidationError validationError;
        int iHashCode = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Unable to render notification, Notification Manager is null.");
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
                mrk0 mrk0VarM160744a = nrk0.m160744a(validationError, string);
                this.f198032f.getLogger().debug(this.f198032f.getAccountId(), mrk0VarM160744a.m156035b());
                this.f198037k.m165676c(mrk0VarM160744a);
            }
            strM151942l = lw3.m151942l(notificationManager, string2, context, qs9.m176173x() && "true".equalsIgnoreCase(bundle.getString(Constants.WZRK_SILENCE_IN_FOREGROUND)));
            if (strM151942l == null || strM151942l.trim().isEmpty()) {
                this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Not rendering Push since channel id is null or blank.");
                return;
            }
            boolean zM151948r = lw3.m151948r(context, strM151942l);
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f198032f;
            if (!zM151948r) {
                cleverTapInstanceConfig.getLogger().verbose(this.f198032f.getAccountId(), "Not rendering push notification as channel = " + strM151942l + " is blocked by user");
                return;
            }
            cleverTapInstanceConfig.getLogger().debug(this.f198032f.getAccountId(), "Rendering Push on channel = ".concat(strM151942l));
        } else {
            strM151942l = null;
        }
        try {
            String strM5889l = ManifestInfo.getInstance(context).m5889l();
            if (strM5889l == null) {
                throw new IllegalArgumentException();
            }
            iM133534t = context.getResources().getIdentifier(strM5889l, "drawable", context.getPackageName());
            if (iM133534t == 0) {
                throw new IllegalArgumentException();
            }
            this.f198036j.setSmallIcon(iM133534t, context);
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
                    Object collapseKey = this.f198036j.getCollapseKey(bundle);
                    if (collapseKey != null) {
                        if (collapseKey instanceof Number) {
                            iHashCode = ((Number) collapseKey).intValue();
                        } else {
                            if (collapseKey instanceof String) {
                                try {
                                    iHashCode = Integer.parseInt(collapseKey.toString());
                                    z = z2;
                                    try {
                                        this.f198032f.getLogger().verbose(this.f198032f.getAccountId(), "Converting collapse_key: " + collapseKey + " to notificationId int: " + iHashCode);
                                    } catch (NumberFormatException unused) {
                                        try {
                                            iHashCode = collapseKey.toString().hashCode();
                                            this.f198032f.getLogger().verbose(this.f198032f.getAccountId(), "Converting collapse_key: " + collapseKey + " to notificationId int: " + iHashCode);
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                } catch (NumberFormatException unused3) {
                                    z = z2;
                                }
                            }
                            iHashCode = Math.abs(iHashCode);
                            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Creating the notification id: " + iHashCode + " from collapse_key: " + collapseKey);
                        }
                        z = z2;
                        iHashCode = Math.abs(iHashCode);
                        this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Creating the notification id: " + iHashCode + " from collapse_key: " + collapseKey);
                    } else {
                        z = z2;
                    }
                } catch (NumberFormatException unused4) {
                }
            } else {
                z = z2;
                this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Have user provided notificationId: " + iHashCode + " won't use collapse_key (if any) as basis for notificationId");
            }
            if (iHashCode == -1000) {
                iHashCode = (int) (Math.random() * 100.0d);
                this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Setting random notificationId: " + iHashCode);
            }
            int i2 = iHashCode;
            if (z) {
                builder = new NotificationCompat.Builder(context, strM151942l);
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
            INotificationRenderer iNotificationRenderer = this.f198036j;
            ?? Mo182553a = builder;
            if (iNotificationRenderer instanceof s81) {
                Mo182553a = ((s81) iNotificationRenderer).mo182553a(context, bundle, builder, this.f198032f);
            }
            NotificationCompat.Builder builderRenderNotification = this.f198036j.renderNotification(bundle, context, Mo182553a, this.f198032f, i2);
            if (builderRenderNotification == null) {
                return;
            }
            Notification notificationBuild = builderRenderNotification.build();
            ii5.m136337g(notificationManager, i2, notificationBuild);
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Rendered notification: " + notificationBuild);
            String string6 = bundle.getString(Constants.EXTRAS_FROM);
            if (string6 == null || !string6.equals("PTReceiver")) {
                String string7 = bundle.getString("wzrk_ttl");
                long jMo158533c = this.f198035i.mo158533c() + Constants.DEFAULT_PUSH_TTL_SECONDS;
                if (string7 != null) {
                    jMo158533c = Long.parseLong(string7);
                }
                String string8 = bundle.getString(Constants.WZRK_PUSH_ID);
                tzb tzbVarMo94410c = this.f198031e.mo94410c(context);
                CleverTapInstanceConfig cleverTapInstanceConfig2 = this.f198032f;
                if (string8 != null) {
                    cleverTapInstanceConfig2.getLogger().verbose("Storing Push Notification..." + string8 + " - with ttl - " + string7);
                    tzbVarMo94410c.m191164O(string8, jMo158533c);
                } else {
                    cleverTapInstanceConfig2.getLogger().verbose("Will not save Push Notification in DB due to invalid id");
                }
                if (!"true".equals(bundle.getString(Constants.WZRK_RNV, ""))) {
                    mrk0 mrk0VarM160744a2 = nrk0.m160744a(ValidationError.NOTIFICATION_VIEWED_DISABLED, bundle.toString());
                    this.f198032f.getLogger().debug(mrk0VarM160744a2.m156035b());
                    this.f198037k.m165676c(mrk0VarM160744a2);
                    return;
                }
                long j = bundle.getLong(Constants.OMR_INVOKE_TIME_IN_MILLIS, -1L);
                if (j >= 0) {
                    long jCurrentTimeMillis = this.f198035i.currentTimeMillis() - j;
                    this.f198032f.getLogger().verbose("Rendered Push Notification in " + jCurrentTimeMillis + " millis");
                }
                this.f198034h.m133233a();
                this.f198030d.m203628M(bundle);
            }
        } catch (Throwable unused7) {
            iM133534t = hyd.m133534t(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m214509b(yfb0 yfb0Var) {
        yfb0Var.m214525u();
        yfb0Var.m214526v();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public boolean m214520n(String str, ggb0 ggb0Var) {
        boolean z = (TextUtils.isEmpty(str) || ggb0Var == null || !str.equalsIgnoreCase(m214543z(ggb0Var))) ? false : true;
        if (ggb0Var != null) {
            this.f198032f.log("PushProvider", ggb0Var + "Token Already available value: " + z);
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    private void m214521p() {
        for (ggb0 ggb0Var : this.f198032f.getPushTypes()) {
            String strM125957c = ggb0Var.m125957c();
            try {
                Class.forName(strM125957c);
                this.f198027a.add(ggb0Var);
                this.f198032f.log("PushProvider", "SDK Class Available :" + strM125957c);
            } catch (Exception e) {
                this.f198032f.log("PushProvider", "SDK class Not available " + strM125957c + " Exception:" + e.getClass().getName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public void m214522q(boolean z) {
        if (Build.VERSION.SDK_INT < 26) {
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Pushamp feature is not supported below Oreo");
            return;
        }
        String strM156889i = mxf0.m156889i(this.f198033g, "pfworkid", "");
        int iM214493A = m214493A(this.f198033g);
        if (strM156889i.equals("") && iM214493A <= 0) {
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Pushamp - There is no running work and nothing to create");
            return;
        }
        if (iM214493A <= 0) {
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Pushamp - Cancelling worker as pingFrequency <=0 ");
            m214507V();
            return;
        }
        try {
            WorkManager workManagerM4347h = WorkManager.m4347h(this.f198033g);
            if (!strM156889i.equals("") && !z) {
                return;
            }
            gz5 gz5VarM128831a = new gz5.C17205a().m128832b(NetworkType.CONNECTED).m128834d(false).m128833c(true).m128831a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            C0766f c0766fM4436b = new C0766f.a(CTPushAmpWorker.class, iM214493A, timeUnit, 5L, timeUnit).m4441i(gz5VarM128831a).m4436b();
            if (strM156889i.equals("")) {
                strM156889i = this.f198032f.getAccountId();
            }
            workManagerM4347h.mo4353e(strM156889i, ExistingPeriodicWorkPolicy.UPDATE, c0766fM4436b);
            mxf0.m156896v(this.f198033g, "pfworkid", strM156889i);
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Pushamp - Finished scheduling periodic work request - " + strM156889i + " with repeatInterval- " + iM214493A + " minutes");
        } catch (Exception e) {
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Pushamp - Failed scheduling/cancelling periodic work request" + e);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    private List<yv3> m214523r() {
        ArrayList arrayList = new ArrayList();
        Iterator<ggb0> it = this.f198027a.iterator();
        while (it.hasNext()) {
            yv3 yv3VarM214527y = m214527y(it.next());
            if (yv3VarM214527y != null) {
                arrayList.add(yv3VarM214527y);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    private void m214525u() {
        List<yv3> listM214523r = m214523r();
        if (listM214523r.isEmpty()) {
            this.f198032f.log("PushProvider", "No push providers found!. Make sure to install at least one push provider");
            return;
        }
        for (yv3 yv3Var : listM214523r) {
            if (!m214497H(yv3Var)) {
                this.f198032f.log("PushProvider", "Invalid Provider: " + yv3Var.getClass());
            } else if (yv3Var.isSupported()) {
                boolean zIsAvailable = yv3Var.isAvailable();
                CleverTapInstanceConfig cleverTapInstanceConfig = this.f198032f;
                if (zIsAvailable) {
                    cleverTapInstanceConfig.log("PushProvider", "Available Provider: " + yv3Var.getClass());
                    this.f198028b.add(yv3Var);
                } else {
                    cleverTapInstanceConfig.log("PushProvider", "Unavailable Provider: " + yv3Var.getClass());
                }
            } else {
                this.f198032f.log("PushProvider", "Unsupported Provider: " + yv3Var.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    private void m214526v() {
        this.f198029c.addAll(this.f198027a);
        Iterator<yv3> it = this.f198028b.iterator();
        while (it.hasNext()) {
            this.f198029c.remove(it.next().getPushType());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    private yv3 m214527y(ggb0 ggb0Var) {
        String strM125956b = ggb0Var.m125956b();
        yv3 yv3Var = null;
        try {
            yv3 yv3Var2 = (yv3) Class.forName(strM125956b).getConstructor(zv3.class, Context.class, CleverTapInstanceConfig.class).newInstance(this, this.f198033g, this.f198032f);
            try {
                this.f198032f.log("PushProvider", "Found provider:" + strM125956b);
                return yv3Var2;
            } catch (ClassNotFoundException unused) {
                yv3Var = yv3Var2;
                this.f198032f.log("PushProvider", "Unable to create provider ClassNotFoundException" + strM125956b);
                return yv3Var;
            } catch (IllegalAccessException unused2) {
                yv3Var = yv3Var2;
                this.f198032f.log("PushProvider", "Unable to create provider IllegalAccessException" + strM125956b);
                return yv3Var;
            } catch (InstantiationException unused3) {
                yv3Var = yv3Var2;
                this.f198032f.log("PushProvider", "Unable to create provider InstantiationException" + strM125956b);
                return yv3Var;
            } catch (Exception e) {
                e = e;
                yv3Var = yv3Var2;
                this.f198032f.log("PushProvider", "Unable to create provider " + strM125956b + " Exception:" + e.getClass().getName());
                return yv3Var;
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
    public Object m214528B() {
        return this.f198039m;
    }

    /* JADX INFO: renamed from: C */
    public void m214529C(String str, ggb0 ggb0Var, boolean z) {
        if (z) {
            m214504Q(str, ggb0Var);
        } else {
            m214535X(str, ggb0Var);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m214530F() {
        Iterator<ggb0> it = m214542x().iterator();
        while (it.hasNext()) {
            if (m214543z(it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public void m214531J() {
        m214501N();
    }

    /* JADX INFO: renamed from: L */
    public void m214532L(Bundle bundle) {
        st3.m185849c(this.f198032f).m190592d().m6946g("customHandlePushAmplification", new CallableC21385b(bundle));
    }

    /* JADX INFO: renamed from: R */
    public void m214533R(Context context) {
        Logger.m5874v(this.f198032f.getAccountId(), "Pushamp - Running work request");
        if (!m214530F()) {
            Logger.m5874v(this.f198032f.getAccountId(), "Pushamp - Token is not present, not running the work request");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
        if (m214496G(m214499K(Constants.DND_START, simpleDateFormat), m214499K(Constants.DND_STOP, simpleDateFormat), m214499K(i + ":" + i2, simpleDateFormat))) {
            Logger.m5874v(this.f198032f.getAccountId(), "Pushamp won't run in default DND hours");
            return;
        }
        long jM191184x = this.f198031e.mo94410c(context).m191184x();
        if (jM191184x == 0 || jM191184x > this.f198035i.currentTimeMillis() - 86400000) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bk", 1);
                this.f198030d.m203635T(jSONObject);
                Logger.m5874v(this.f198032f.getAccountId(), "Pushamp - Successfully completed work request");
            } catch (JSONException unused) {
                Logger.m5873v("Pushamp - Unable to complete work request");
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: T */
    public void m214534T(@NonNull INotificationRenderer iNotificationRenderer) {
        this.f198036j = iNotificationRenderer;
    }

    /* JADX INFO: renamed from: X */
    public void m214535X(String str, ggb0 ggb0Var) {
        m214500M(str, false, ggb0Var);
    }

    /* JADX INFO: renamed from: Y */
    public void m214536Y(Context context, int i) {
        this.f198032f.getLogger().verbose("Ping frequency received - " + i);
        this.f198032f.getLogger().verbose("Stored Ping Frequency - " + m214493A(context));
        if (i != m214493A(context)) {
            m214505S(context, i);
            if (!this.f198032f.isBackgroundSync() || this.f198032f.isAnalyticsOnly()) {
                return;
            }
            st3.m185849c(this.f198032f).m190593e("PushProviders").m6946g("createOrResetWorker", new CallableC21386c());
        }
    }

    @Override // p149l.zv3
    /* JADX INFO: renamed from: a */
    public void mo214537a(String str, ggb0 ggb0Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m214540t(str, ggb0Var);
        m214524s(str, ggb0Var);
    }

    /* JADX INFO: renamed from: c */
    public void m214538c(Context context, Bundle bundle, int i) {
        if (bundle == null || bundle.get(Constants.NOTIFICATION_TAG) == null) {
            return;
        }
        if (this.f198032f.isAnalyticsOnly()) {
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Instance is set for Analytics only, cannot create notification");
            return;
        }
        try {
            if (bundle.getString(Constants.WZRK_PUSH_SILENT, "").equalsIgnoreCase("true")) {
                this.f198030d.m203628M(bundle);
                return;
            }
            String string = bundle.getString(Constants.EXTRAS_FROM);
            if (string == null || !string.equals("PTReceiver")) {
                this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Handling notification: " + bundle);
                if (bundle.getString(Constants.WZRK_PUSH_ID) != null && this.f198031e.mo94410c(context).m191177n(bundle.getString(Constants.WZRK_PUSH_ID))) {
                    this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Push Notification already rendered, not showing again");
                    return;
                }
                String message = this.f198036j.getMessage(bundle);
                if (message == null) {
                    message = "";
                }
                if (message.isEmpty()) {
                    this.f198032f.getLogger().verbose(this.f198032f.getAccountId(), "Push notification message is empty, not rendering");
                    this.f198031e.mo94410c(context).m191165P();
                    String string2 = bundle.getString(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, "");
                    if (TextUtils.isEmpty(string2)) {
                        return;
                    }
                    m214536Y(context, Integer.parseInt(string2));
                    return;
                }
            }
            if (this.f198036j.getTitle(bundle, context).isEmpty()) {
                String str = context.getApplicationInfo().name;
            }
            m214508W(context, bundle, i);
        } catch (Throwable th) {
            this.f198032f.getLogger().debug(this.f198032f.getAccountId(), "Couldn't render notification: ", th);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m214539o(String str, ggb0 ggb0Var) {
        if (TextUtils.isEmpty(str) || ggb0Var == null) {
            return;
        }
        try {
            st3.m185849c(this.f198032f).m190589a().m6946g("PushProviders#cacheToken", new CallableC21384a(str, ggb0Var));
        } catch (Throwable th) {
            this.f198032f.log("PushProvider", ggb0Var + "Unable to cache token " + str, th);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: t */
    public void m214540t(String str, ggb0 ggb0Var) {
        if (TextUtils.isEmpty(str) || ggb0Var == null) {
            return;
        }
        m214529C(str, ggb0Var, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: w */
    public void m214541w(boolean z) {
        Iterator<ggb0> it = this.f198027a.iterator();
        while (it.hasNext()) {
            m214500M(null, z, it.next());
        }
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public ArrayList<ggb0> m214542x() {
        ArrayList<ggb0> arrayList = new ArrayList<>();
        Iterator<yv3> it = this.f198028b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPushType());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    public String m214543z(ggb0 ggb0Var) {
        if (ggb0Var != null) {
            String strM125958d = ggb0Var.m125958d();
            if (!TextUtils.isEmpty(strM125958d)) {
                String strM156891k = mxf0.m156891k(this.f198033g, this.f198032f.getAccountId(), strM125958d, null);
                this.f198032f.log("PushProvider", ggb0Var + "getting Cached Token - " + strM156891k);
                return strM156891k;
            }
        }
        if (ggb0Var != null) {
            this.f198032f.log("PushProvider", ggb0Var + " Unable to find cached Token for type ");
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private void m214524s(String str, ggb0 ggb0Var) {
    }
}
