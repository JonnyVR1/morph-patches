package p002l;

import com.tantan.live.eventbus.LiveEventBus;
import kotlin.Metadata;
import l.q2f;
import l.ygt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/eze0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "t", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "b", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class eze0 extends kud0<ygt> {
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(@Nullable ygt t, @Nullable c2e0 plug, @Nullable x1e0.C0892b extraInfo) {
        LiveEventBus liveEventBusM25548F2;
        q2f.c cVarShowGiftSkinList;
        if (plug == null || (liveEventBusM25548F2 = plug.m25548F2()) == null || (cVarShowGiftSkinList = new LiveEventBus.LiveGiftSkinEventGroup(liveEventBusM25548F2).showGiftSkinList()) == null) {
            return;
        }
        cVarShowGiftSkinList.p();
    }
}
