package p153l;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import org.seamless.xhtml.XHTML;

/* JADX INFO: loaded from: classes2.dex */
public class axd0 implements wc2 {

    /* JADX INFO: renamed from: b */
    private static final String[] f73841b = {"_id", XHTML.ATTR.CLASS};

    /* JADX INFO: renamed from: a */
    private nmd f73842a = new nmd();

    /* JADX INFO: renamed from: c */
    private ContentValues m100772c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put(XHTML.ATTR.CLASS, componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        nmd nmdVar = this.f73842a;
        if (nmdVar != null && nmdVar.m163810c(context)) {
            this.f73842a.mo95771b(context, componentName, i);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f73841b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                String className = componentName.getClassName();
                boolean z = false;
                while (cursorQuery.moveToNext()) {
                    contentResolver.update(uri, m100772c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                    if (className.equals(cursorQuery.getString(cursorQuery.getColumnIndex(XHTML.ATTR.CLASS)))) {
                        z = true;
                    }
                }
                if (!z) {
                    contentResolver.insert(uri, m100772c(componentName, i, true));
                }
            }
        } finally {
            ua5.m195157a(cursorQuery);
        }
    }
}
