package p149l;

import androidx.datastore.preferences.core.MutablePreferences;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/ci80;", "a", "()Ll/ci80;", "", "Ll/ci80$b;", "pairs", "Landroidx/datastore/preferences/core/MutablePreferences;", "b", "([Ll/ci80$b;)Landroidx/datastore/preferences/core/MutablePreferences;", "datastore-preferences-core"}, m87233k = 2, m87234mv = {1, 5, 1}, m87236xi = 48)
@JvmName
public final class di80 {
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ci80 m111869a() {
        return new MutablePreferences(null, true, 1, null);
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final MutablePreferences m111870b(@NotNull ci80.C16163b<?>... c16163bArr) {
        c16163bArr.getClass();
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.m1484h((ci80.C16163b[]) Arrays.copyOf(c16163bArr, c16163bArr.length));
        return mutablePreferences;
    }
}
