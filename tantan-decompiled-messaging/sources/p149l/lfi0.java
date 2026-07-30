package p149l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lfi0 implements Iterable<Intent> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Intent> f127898a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final Context f127899b;

    /* JADX INFO: renamed from: l.lfi0$a */
    public interface InterfaceC18215a {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public lfi0(Context context) {
        this.f127899b = context;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static lfi0 m149704g(@NonNull Context context) {
        return new lfi0(context);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public lfi0 m149705a(@NonNull Intent intent) {
        this.f127898a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: c */
    public lfi0 m149706c(@NonNull Activity activity) {
        Intent supportParentActivityIntent = activity instanceof InterfaceC18215a ? ((InterfaceC18215a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = u620.m191904a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f127899b.getPackageManager());
            }
            m149707f(component);
            m149705a(supportParentActivityIntent);
        }
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public lfi0 m149707f(@NonNull ComponentName componentName) {
        int size = this.f127898a.size();
        try {
            Intent intentM191905b = u620.m191905b(this.f127899b, componentName);
            while (intentM191905b != null) {
                this.f127898a.add(size, intentM191905b);
                intentM191905b = u620.m191905b(this.f127899b, intentM191905b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            fg3.m121203a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m149708h() {
        m149709i(null);
    }

    /* JADX INFO: renamed from: i */
    public void m149709i(@Nullable Bundle bundle) {
        if (this.f127898a.isEmpty()) {
            qkq0.m175383a("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) this.f127898a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (e16.m114385m(this.f127899b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f127899b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @NonNull
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f127898a.iterator();
    }
}
