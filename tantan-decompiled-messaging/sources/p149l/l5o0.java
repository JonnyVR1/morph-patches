package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.SiteWideBroadcastFinder;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/l5o0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", Constants.INAPP_DATA_TAG, "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class l5o0 extends kud0<ygt> {
    /* JADX INFO: renamed from: e */
    public static final void m148654e(SiteWideBroadcastFinder siteWideBroadcastFinder) {
        if (TextUtils.isEmpty(siteWideBroadcastFinder.message)) {
            return;
        }
        lsi0.m151595y(siteWideBroadcastFinder.message);
    }

    /* JADX INFO: renamed from: f */
    public static final void m148655f(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo95830a(@NotNull ygt liveRoomScheme, @NotNull c2e0 plug, @Nullable x1e0.C21019b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        if (plug.act() != null) {
            String strM149818o = plug.m206027E2().m149818o();
            strM149818o.getClass();
            plug.duringCreated(VirtualVoiceRoomApiProvider.notifyBroadcastAll(strM149818o)).subscribe(ffw.m121194e(new e30() { // from class: l.j5o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    l5o0.m148654e((SiteWideBroadcastFinder) obj);
                }
            }, new e30() { // from class: l.k5o0
                @Override // p149l.e30
                public final void call(Object obj) {
                    l5o0.m148655f((Throwable) obj);
                }
            }));
        }
    }
}
