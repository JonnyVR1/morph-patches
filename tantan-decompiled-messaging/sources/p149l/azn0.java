package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/azn0;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "b", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class azn0 extends kud0<ygt> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(@NotNull ygt liveRoomScheme, @NotNull c2e0 plug, @Nullable x1e0.C21019b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        String strM214763g = liveRoomScheme.m214763g("tabId");
        if (strM214763g != null) {
            switch (strM214763g.hashCode()) {
                case -2046584605:
                    if (strM214763g.equals("settleApply")) {
                        plug.m206028F2().MemberManagerEvent.showMemberManagerDialogForce().mo172463j(2);
                        return;
                    }
                    break;
                case -1012222381:
                    if (strM214763g.equals("online")) {
                        plug.m206028F2().MemberManagerEvent.showMemberManagerDialogForce().mo172463j(0);
                        return;
                    }
                    break;
                case 998724205:
                    if (strM214763g.equals("LMApply")) {
                        plug.m206028F2().MemberManagerEvent.showMemberManagerDialogForce().mo172463j(3);
                        return;
                    }
                    break;
                case 1985943673:
                    if (strM214763g.equals(BLiveVoiceVirtualRoomSettleItem.STATE_SETTLED)) {
                        plug.m206028F2().MemberManagerEvent.showMemberManagerDialogForce().mo172463j(1);
                        return;
                    }
                    break;
            }
        }
        plug.m206028F2().MemberManagerEvent.showMemberManagerDialog().mo172463j(-1);
    }
}
