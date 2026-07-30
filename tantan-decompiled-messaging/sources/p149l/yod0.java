package p149l;

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
public class yod0 implements pc2 {

    /* JADX INFO: renamed from: b */
    private static final String[] f199287b = {"_id", XHTML.ATTR.CLASS};

    /* JADX INFO: renamed from: a */
    private hld f199288a = new hld();

    /* JADX INFO: renamed from: c */
    private ContentValues m215491c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put(XHTML.ATTR.CLASS, componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: a */
    public List<String> mo114456a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: b */
    public void mo114457b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        hld hldVar = this.f199288a;
        if (hldVar != null && hldVar.m131648c(context)) {
            this.f199288a.mo114457b(context, componentName, i);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f199287b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                String className = componentName.getClassName();
                boolean z = false;
                while (cursorQuery.moveToNext()) {
                    contentResolver.update(uri, m215491c(componentName, i, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                    if (className.equals(cursorQuery.getString(cursorQuery.getColumnIndex(XHTML.ATTR.CLASS)))) {
                        z = true;
                    }
                }
                if (!z) {
                    contentResolver.insert(uri, m215491c(componentName, i, true));
                }
            }
        } finally {
            t95.m187603a(cursorQuery);
        }
    }
}
