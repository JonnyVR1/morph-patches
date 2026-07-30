package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.appevents.C1577f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ztb;
import p153l.ztv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ#\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m88121d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "open", "()V", "close", "finalize", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "applicationContext", "Landroid/content/Context;", "Companion", "a", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    @NotNull
    private static final String BOLTS_MEASUREMENT_EVENT_PREFIX = "bf_";

    @NotNull
    private static final String MEASUREMENT_EVENT_ARGS_KEY = "event_args";

    @NotNull
    private static final String MEASUREMENT_EVENT_NAME_KEY = "event_name";

    @Nullable
    private static BoltsMeasurementEventListener singleton;

    @NotNull
    private final Context applicationContext;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String MEASUREMENT_EVENT_NOTIFICATION_NAME = "com.parse.bolts.measurement_event";

    /* JADX INFO: renamed from: com.facebook.internal.BoltsMeasurementEventListener$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/facebook/internal/BoltsMeasurementEventListener;", "a", "(Landroid/content/Context;)Lcom/facebook/internal/BoltsMeasurementEventListener;", "", "BOLTS_MEASUREMENT_EVENT_PREFIX", "Ljava/lang/String;", "MEASUREMENT_EVENT_ARGS_KEY", "MEASUREMENT_EVENT_NAME_KEY", "singleton", "Lcom/facebook/internal/BoltsMeasurementEventListener;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final BoltsMeasurementEventListener m8713a(@NotNull Context context) {
            context.getClass();
            if (BoltsMeasurementEventListener.access$getSingleton$cp() != null) {
                return BoltsMeasurementEventListener.access$getSingleton$cp();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.access$open(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.access$setSingleton$cp(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.access$getSingleton$cp();
        }

        public Companion() {
        }
    }

    private BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.applicationContext = applicationContext;
    }

    public static final /* synthetic */ String access$getMEASUREMENT_EVENT_NOTIFICATION_NAME$cp() {
        if (ztb.m221490d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return MEASUREMENT_EVENT_NOTIFICATION_NAME;
        } catch (Throwable th) {
            ztb.m221488b(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ BoltsMeasurementEventListener access$getSingleton$cp() {
        if (ztb.m221490d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return singleton;
        } catch (Throwable th) {
            ztb.m221488b(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$open(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (ztb.m221490d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.open();
        } catch (Throwable th) {
            ztb.m221488b(th, BoltsMeasurementEventListener.class);
        }
    }

    public static final /* synthetic */ void access$setSingleton$cp(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (ztb.m221490d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            singleton = boltsMeasurementEventListener;
        } catch (Throwable th) {
            ztb.m221488b(th, BoltsMeasurementEventListener.class);
        }
    }

    private final void close() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            ztv ztvVarM221572b = ztv.m221572b(this.applicationContext);
            ztvVarM221572b.getClass();
            ztvVarM221572b.m221576e(this);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @JvmStatic
    @Nullable
    public static final BoltsMeasurementEventListener getInstance(@NotNull Context context) {
        if (ztb.m221490d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return INSTANCE.m8713a(context);
        } catch (Throwable th) {
            ztb.m221488b(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    private final void open() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            ztv ztvVarM221572b = ztv.m221572b(this.applicationContext);
            ztvVarM221572b.getClass();
            ztvVarM221572b.m221574c(this, new IntentFilter(MEASUREMENT_EVENT_NOTIFICATION_NAME));
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public final void finalize() throws Throwable {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            close();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1577f c1577f = new C1577f(context);
            StringBuilder sb = new StringBuilder(BOLTS_MEASUREMENT_EVENT_PREFIX);
            sb.append(intent != null ? intent.getStringExtra(MEASUREMENT_EVENT_NAME_KEY) : null);
            String string = sb.toString();
            Bundle bundleExtra = intent != null ? intent.getBundleExtra(MEASUREMENT_EVENT_ARGS_KEY) : null;
            Bundle bundle = new Bundle();
            Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
            if (setKeySet != null) {
                for (String str : setKeySet) {
                    str.getClass();
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(str, "-"), ""), ""), (String) bundleExtra.get(str));
                }
            }
            c1577f.m7828d(string, bundle);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
