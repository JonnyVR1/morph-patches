package p153l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class loi0 implements Iterable<Intent> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Intent> f132908a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final Context f132909b;

    /* JADX INFO: renamed from: l.loi0$a */
    public interface InterfaceC18428a {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public loi0(Context context) {
        this.f132909b = context;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static loi0 m155079g(@NonNull Context context) {
        return new loi0(context);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public loi0 m155080a(@NonNull Intent intent) {
        this.f132908a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: c */
    public loi0 m155081c(@NonNull Activity activity) {
        Intent supportParentActivityIntent = activity instanceof InterfaceC18428a ? ((InterfaceC18428a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = cf20.m109506a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f132909b.getPackageManager());
            }
            m155082f(component);
            m155080a(supportParentActivityIntent);
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public loi0 m155082f(@NonNull ComponentName componentName) {
        int size = this.f132908a.size();
        try {
            Intent intentM109507b = cf20.m109507b(this.f132909b, componentName);
            while (intentM109507b != null) {
                this.f132908a.add(size, intentM109507b);
                intentM109507b = cf20.m109507b(this.f132909b, intentM109507b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            tg3.m191013a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m155083h() {
        m155084i(null);
    }

    /* JADX INFO: renamed from: i */
    public void m155084i(@Nullable Bundle bundle) {
        if (this.f132908a.isEmpty()) {
            wtq0.m207906a("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) this.f132908a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (j26.m143200m(this.f132909b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        this.f132909b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f132908a.iterator();
    }
}
