package p153l;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class c6f implements wc2 {
    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Arrays.asList("me.everything.launcher");
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://me.everything.badger/apps"), contentValues);
    }
}
