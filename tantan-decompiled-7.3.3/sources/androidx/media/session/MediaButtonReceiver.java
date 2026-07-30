package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.media.MediaBrowserServiceCompat;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Objects;
import p153l.j26;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    private static final String TAG = "MediaButtonReceiver";

    /* JADX INFO: renamed from: androidx.media.session.MediaButtonReceiver$a */
    public static class C0523a extends MediaBrowserCompat.C0004c {

        /* JADX INFO: renamed from: c */
        public final Context f2489c;

        /* JADX INFO: renamed from: d */
        public final Intent f2490d;

        /* JADX INFO: renamed from: e */
        public final BroadcastReceiver.PendingResult f2491e;

        /* JADX INFO: renamed from: f */
        public MediaBrowserCompat f2492f;

        public C0523a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f2489c = context;
            this.f2490d = intent;
            this.f2491e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0004c
        /* JADX INFO: renamed from: a */
        public void mo12a() {
            new MediaControllerCompat(this.f2489c, this.f2492f.m3c()).m79a((KeyEvent) this.f2490d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            m3182e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0004c
        /* JADX INFO: renamed from: b */
        public void mo13b() {
            m3182e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.C0004c
        /* JADX INFO: renamed from: c */
        public void mo14c() {
            m3182e();
        }

        /* JADX INFO: renamed from: e */
        public final void m3182e() {
            this.f2492f.m2b();
            this.f2491e.finish();
        }

        /* JADX INFO: renamed from: f */
        public void m3183f(MediaBrowserCompat mediaBrowserCompat) {
            this.f2492f = mediaBrowserCompat;
        }
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, ComponentName componentName, long j) {
        int iM127b;
        if (componentName == null || (iM127b = PlaybackStateCompat.m127b(j)) == 0) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, iM127b));
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        return PendingIntent.getBroadcast(context, iM127b, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName getMediaButtonReceiverComponent(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        listQueryBroadcastReceivers.size();
        return null;
    }

    private static ComponentName getServiceComponentByAction(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + listQueryIntentServices.size());
    }

    public static KeyEvent handleIntent(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return null;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        mediaSessionCompat.m107b().m79a(keyEvent);
        return keyEvent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName serviceComponentByAction = getServiceComponentByAction(context, "android.intent.action.MEDIA_BUTTON");
        if (serviceComponentByAction != null) {
            intent.setComponent(serviceComponentByAction);
            j26.m143202o(context, intent);
            return;
        }
        ComponentName serviceComponentByAction2 = getServiceComponentByAction(context, MediaBrowserServiceCompat.SERVICE_INTERFACE);
        if (serviceComponentByAction2 == null) {
            wtq0.m207906a("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            return;
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        C0523a c0523a = new C0523a(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, serviceComponentByAction2, c0523a, null);
        c0523a.m3183f(mediaBrowserCompat);
        mediaBrowserCompat.m1a();
    }

    public static PendingIntent buildMediaButtonPendingIntent(Context context, long j) {
        ComponentName mediaButtonReceiverComponent = getMediaButtonReceiverComponent(context);
        if (mediaButtonReceiverComponent == null) {
            return null;
        }
        return buildMediaButtonPendingIntent(context, mediaButtonReceiverComponent, j);
    }
}
