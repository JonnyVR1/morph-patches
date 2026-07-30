package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class awe0 {

    /* JADX INFO: renamed from: b */
    @NonNull
    @KeepForSdk
    public static final Component<?> f72037b = Component.builder(awe0.class).add(Dependency.required((Class<?>) c500.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: l.hly0
        @Override // com.google.firebase.components.ComponentFactory
        public final Object create(ComponentContainer componentContainer) {
            return new awe0((Context) componentContainer.get(Context.class));
        }
    }).build();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Context f72038a;

    public awe0(@NonNull Context context) {
        this.f72038a = context;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public synchronized String m99265a() {
        String string = m99266b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        m99266b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final SharedPreferences m99266b() {
        return this.f72038a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
