package p149l;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class olf0 implements pc2 {

    /* JADX INFO: renamed from: a */
    private final Uri f144496a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* JADX INFO: renamed from: b */
    private AsyncQueryHandler f144497b;

    /* JADX INFO: renamed from: l.olf0$a */
    public class C18969a extends AsyncQueryHandler {
        public C18969a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    /* JADX INFO: renamed from: c */
    private ContentValues m164925c(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    /* JADX INFO: renamed from: d */
    private static void m164926d(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        context.sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: e */
    private void m164927e(Context context, ComponentName componentName, int i) {
        if (i < 0) {
            return;
        }
        ContentValues contentValuesM164925c = m164925c(i, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m164929g(context, contentValuesM164925c);
            return;
        }
        if (this.f144497b == null) {
            this.f144497b = new C18969a(context.getApplicationContext().getContentResolver());
        }
        m164928f(contentValuesM164925c);
    }

    /* JADX INFO: renamed from: f */
    private void m164928f(ContentValues contentValues) {
        this.f144497b.startInsert(0, null, this.f144496a, contentValues);
    }

    /* JADX INFO: renamed from: g */
    private void m164929g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f144496a, contentValues);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m164930h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: a */
    public List<String> mo114456a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: b */
    public void mo114457b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (m164930h(context)) {
            m164927e(context, componentName, i);
        } else {
            m164926d(context, componentName, i);
        }
    }
}
