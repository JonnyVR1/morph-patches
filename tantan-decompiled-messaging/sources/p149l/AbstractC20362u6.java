package p149l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import p149l.AbstractC20362u6;

/* JADX INFO: renamed from: l.u6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC20362u6<T extends AbstractC20362u6<T>> {

    /* JADX INFO: renamed from: a */
    public final lnu0 f174783a;

    public AbstractC20362u6() {
        lnu0 lnu0Var = new lnu0();
        this.f174783a = lnu0Var;
        lnu0Var.m150738r("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public T m191882a(@NonNull String str) {
        this.f174783a.m150736p(str);
        return (T) mo191884c();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public T m191883b(@NonNull Class<Object> cls, @NonNull Bundle bundle) {
        this.f174783a.m150737q(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f174783a.m150739s("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (T) mo191884c();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public abstract T mo191884c();

    @NonNull
    /* JADX INFO: renamed from: d */
    public T m191885d(@NonNull String str) {
        Preconditions.checkNotNull(str, "Content URL must be non-null.");
        Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        Preconditions.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.f174783a.m150740t(str);
        return (T) mo191884c();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public T m191886e(@NonNull List<String> list) {
        if (list == null) {
            x2t0.m206869g("neighboring content URLs list should not be null");
            return (T) mo191884c();
        }
        this.f174783a.m150742v(list);
        return (T) mo191884c();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: f */
    public final AbstractC20362u6 m191887f(@NonNull String str) {
        this.f174783a.m150738r(str);
        return mo191884c();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: g */
    public final AbstractC20362u6 m191888g(boolean z) {
        this.f174783a.m150741u(z);
        return mo191884c();
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: h */
    public final AbstractC20362u6 m191889h(boolean z) {
        this.f174783a.m150735a(z);
        return mo191884c();
    }
}
