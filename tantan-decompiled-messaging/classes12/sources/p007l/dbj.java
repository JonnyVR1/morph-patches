package p007l;

import kotlin.Metadata;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0012"}, d2 = {"Ll/dbj;", "Ll/wrl;", "<init>", "()V", "", "getX", "()F", "getY", "x", "y", "", "a", "(FF)V", "", "hasConfig", "()Z", "clear", "Companion", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class dbj implements wrl {

    /* JADX INFO: renamed from: a */
    public static float f6889a = -1.0f;

    /* JADX INFO: renamed from: b */
    public static float f6890b = -1.0f;

    @Override // p007l.wrl
    /* JADX INFO: renamed from: a */
    public void mo9364a(float x, float y) {
        f6889a = x;
        f6890b = y;
    }

    @Override // p007l.wrl
    public void clear() {
        f6889a = -1.0f;
        f6890b = -1.0f;
    }

    @Override // p007l.wrl
    public float getX() {
        return f6889a;
    }

    @Override // p007l.wrl
    public float getY() {
        return f6890b;
    }

    @Override // p007l.wrl
    public boolean hasConfig() {
        return f6889a >= 0.0f && f6890b >= 0.0f;
    }
}
