package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, m87232d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", j6f.GPS_DIRECTION_TRUE}, m87233k = 3, m87234mv = {1, 5, 1}, m87236xi = 48)
final class SharedPreferencesMigration$4 extends Lambda implements Function0<SharedPreferences> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $sharedPreferencesName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration$4(Context context, String str) {
        super(0);
        this.$context = context;
        this.$sharedPreferencesName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }
}
