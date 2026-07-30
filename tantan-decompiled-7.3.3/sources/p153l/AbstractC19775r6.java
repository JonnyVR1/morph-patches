package p153l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import p153l.AbstractC19775r6;

/* JADX INFO: renamed from: l.r6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC19775r6<T extends AbstractC19775r6<T>> {

    /* JADX INFO: renamed from: a */
    public final rwu0 f161419a;

    public AbstractC19775r6() {
        rwu0 rwu0Var = new rwu0();
        this.f161419a = rwu0Var;
        rwu0Var.m183496r("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public T m179960a(@NonNull String str) {
        this.f161419a.m183494p(str);
        return (T) mo179962c();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public T m179961b(@NonNull Class<Object> cls, @NonNull Bundle bundle) {
        this.f161419a.m183495q(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f161419a.m183497s("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (T) mo179962c();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract T mo179962c();

    @NonNull
    /* JADX INFO: renamed from: d */
    public T m179963d(@NonNull String str) {
        Preconditions.checkNotNull(str, "Content URL must be non-null.");
        Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.f161419a.m183498t(str);
        return (T) mo179962c();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public T m179964e(@NonNull List<String> list) {
        if (list == null) {
            dct0.m115298g("neighboring content URLs list should not be null");
            return (T) mo179962c();
        }
        this.f161419a.m183500v(list);
        return (T) mo179962c();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: f */
    public final AbstractC19775r6 m179965f(@NonNull String str) {
        this.f161419a.m183496r(str);
        return mo179962c();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: g */
    public final AbstractC19775r6 m179966g(boolean z) {
        this.f161419a.m183499u(z);
        return mo179962c();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: h */
    public final AbstractC19775r6 m179967h(boolean z) {
        this.f161419a.m183493a(z);
        return mo179962c();
    }
}
