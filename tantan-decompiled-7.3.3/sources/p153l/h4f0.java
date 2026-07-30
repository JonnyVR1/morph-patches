package p153l;

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
public class h4f0 {

    /* JADX INFO: renamed from: b */
    @NonNull
    @KeepForSdk
    public static final Component<?> f107804b = Component.builder(h4f0.class).add(Dependency.required((Class<?>) rd00.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: l.nuy0
        @Override // com.google.firebase.components.ComponentFactory
        public final Object create(ComponentContainer componentContainer) {
            return new h4f0((Context) componentContainer.get(Context.class));
        }
    }).build();

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Context f107805a;

    public h4f0(@NonNull Context context) {
        this.f107805a = context;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public synchronized String m133571a() {
        String string = m133572b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        m133572b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final SharedPreferences m133572b() {
        return this.f107805a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
