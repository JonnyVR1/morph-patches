package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0012"}, m88121d2 = {"Ll/xdj;", "Ll/kul;", "<init>", "()V", "", "getX", "()F", "getY", BaseSei.f14624X, BaseSei.f14625Y, "", "a", "(FF)V", "", "hasConfig", "()Z", BLiveResOperation.clear, "Companion", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xdj implements kul {

    /* JADX INFO: renamed from: a */
    public static float f193599a = -1.0f;

    /* JADX INFO: renamed from: b */
    public static float f193600b = -1.0f;

    @Override // p153l.kul
    /* JADX INFO: renamed from: a */
    public void mo151558a(float x, float y) {
        f193599a = x;
        f193600b = y;
    }

    @Override // p153l.kul
    public void clear() {
        f193599a = -1.0f;
        f193600b = -1.0f;
    }

    @Override // p153l.kul
    public float getX() {
        return f193599a;
    }

    @Override // p153l.kul
    public float getY() {
        return f193600b;
    }

    @Override // p153l.kul
    public boolean hasConfig() {
        return f193599a >= 0.0f && f193600b >= 0.0f;
    }
}
