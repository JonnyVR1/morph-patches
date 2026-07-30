package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0012"}, m87232d2 = {"Ll/dbj;", "Ll/wrl;", "<init>", "()V", "", "getX", "()F", "getY", BaseSei.f13930X, BaseSei.f13931Y, "", "a", "(FF)V", "", "hasConfig", "()Z", BLiveResOperation.clear, "Companion", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class dbj implements wrl {

    /* JADX INFO: renamed from: a */
    public static float f85321a = -1.0f;

    /* JADX INFO: renamed from: b */
    public static float f85322b = -1.0f;

    @Override // p149l.wrl
    /* JADX INFO: renamed from: a */
    public void mo110645a(float x, float y) {
        f85321a = x;
        f85322b = y;
    }

    @Override // p149l.wrl
    public void clear() {
        f85321a = -1.0f;
        f85322b = -1.0f;
    }

    @Override // p149l.wrl
    public float getX() {
        return f85321a;
    }

    @Override // p149l.wrl
    public float getY() {
        return f85322b;
    }

    @Override // p149l.wrl
    public boolean hasConfig() {
        return f85321a >= 0.0f && f85322b >= 0.0f;
    }
}
