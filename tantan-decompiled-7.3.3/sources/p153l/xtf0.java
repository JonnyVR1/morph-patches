package p153l;

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
public class xtf0 implements wc2 {

    /* JADX INFO: renamed from: a */
    private final Uri f196207a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* JADX INFO: renamed from: b */
    private AsyncQueryHandler f196208b;

    /* JADX INFO: renamed from: l.xtf0$a */
    public class C21447a extends AsyncQueryHandler {
        public C21447a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    /* JADX INFO: renamed from: c */
    private ContentValues m213073c(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    /* JADX INFO: renamed from: d */
    private static void m213074d(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        context.sendBroadcast(intent);
    }

    /* JADX INFO: renamed from: e */
    private void m213075e(Context context, ComponentName componentName, int i) {
        if (i < 0) {
            return;
        }
        ContentValues contentValuesM213073c = m213073c(i, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m213077g(context, contentValuesM213073c);
            return;
        }
        if (this.f196208b == null) {
            this.f196208b = new C21447a(context.getApplicationContext().getContentResolver());
        }
        m213076f(contentValuesM213073c);
    }

    /* JADX INFO: renamed from: f */
    private void m213076f(ContentValues contentValues) {
        this.f196208b.startInsert(0, null, this.f196207a, contentValues);
    }

    /* JADX INFO: renamed from: g */
    private void m213077g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f196207a, contentValues);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m213078h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (m213078h(context)) {
            m213075e(context, componentName, i);
        } else {
            m213074d(context, componentName, i);
        }
    }
}
