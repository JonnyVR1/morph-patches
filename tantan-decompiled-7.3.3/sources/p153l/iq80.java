package p153l;

import androidx.datastore.preferences.core.MutablePreferences;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/hq80;", "a", "()Ll/hq80;", "", "Ll/hq80$b;", "pairs", "Landroidx/datastore/preferences/core/MutablePreferences;", "b", "([Ll/hq80$b;)Landroidx/datastore/preferences/core/MutablePreferences;", "datastore-preferences-core"}, m88122k = 2, m88123mv = {1, 5, 1}, m88125xi = 48)
@JvmName
public final class iq80 {
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final hq80 m141660a() {
        return new MutablePreferences(null, true, 1, null);
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final MutablePreferences m141661b(@NotNull hq80.C17537b<?>... c17537bArr) {
        c17537bArr.getClass();
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.m1485h((hq80.C17537b[]) Arrays.copyOf(c17537bArr, c17537bArr.length));
        return mutablePreferences;
    }
}
