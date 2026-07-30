package p153l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Ll/sll0;", "", "<init>", "()V", "", Constants.KEY_KEY, "Ll/nll0;", "viewModel", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ll/nll0;)V", "b", "(Ljava/lang/String;)Ll/nll0;", "", "c", "()Ljava/util/Set;", "a", "", "Ljava/util/Map;", "map", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class sll0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, nll0> map = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m186596a() {
        Iterator<nll0> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel_release();
        }
        this.map.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    /* JADX INFO: renamed from: b */
    public final nll0 m186597b(@NotNull String key) {
        key.getClass();
        return this.map.get(key);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m186598c() {
        return new HashSet(this.map.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: d */
    public final void m186599d(@NotNull String key, @NotNull nll0 viewModel) {
        key.getClass();
        viewModel.getClass();
        nll0 nll0VarPut = this.map.put(key, viewModel);
        if (nll0VarPut != null) {
            nll0VarPut.clear$lifecycle_viewmodel_release();
        }
    }
}
