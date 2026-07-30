package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.putong.core.data.Privilege;
import kotlin.Metadata;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
public final /* synthetic */ class oto$c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f18372a;

    static {
        int[] iArr = new int[Privilege.values().length];
        try {
            iArr[Privilege.vip_super_like.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Privilege.boost.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Privilege.vip_badge.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18372a = iArr;
    }
}
