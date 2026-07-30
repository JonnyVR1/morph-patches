package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xyc0 {

    /* JADX INFO: renamed from: d */
    public static final Map f196734d = new EnumMap(BaseModel.class);

    /* JADX INFO: renamed from: e */
    @NonNull
    @VisibleForTesting
    public static final Map f196735e = new EnumMap(BaseModel.class);

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f196736a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final BaseModel f196737b;

    /* JADX INFO: renamed from: c */
    public final ModelType f196738c;

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xyc0)) {
            return false;
        }
        xyc0 xyc0Var = (xyc0) obj;
        return Objects.equal(this.f196736a, xyc0Var.f196736a) && Objects.equal(this.f196737b, xyc0Var.f196737b) && Objects.equal(this.f196738c, xyc0Var.f196738c);
    }

    public int hashCode() {
        return Objects.hashCode(this.f196736a, this.f196737b, this.f196738c);
    }

    @NonNull
    public String toString() {
        tqy0 tqy0VarM187802a = ssy0.m187802a("RemoteModel");
        tqy0VarM187802a.m192381a("modelName", this.f196736a);
        tqy0VarM187802a.m192381a("baseModel", this.f196737b);
        tqy0VarM187802a.m192381a("modelType", this.f196738c);
        return tqy0VarM187802a.toString();
    }
}
