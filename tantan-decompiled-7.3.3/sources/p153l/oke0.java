package p153l;

import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class oke0 {

    /* JADX INFO: renamed from: c */
    public static final oke0 f147750c = new oke0(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f147751a;

    /* JADX INFO: renamed from: b */
    public final long f147752b;

    public oke0(long j, long j2) {
        this.f147751a = j;
        this.f147752b = j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oke0.class == obj.getClass()) {
            oke0 oke0Var = (oke0) obj;
            if (this.f147751a == oke0Var.f147751a && this.f147752b == oke0Var.f147752b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f147751a) * 31) + ((int) this.f147752b);
    }

    public String toString() {
        return "[timeUs=" + this.f147751a + ", position=" + this.f147752b + Constants.AES_SUFFIX;
    }
}
