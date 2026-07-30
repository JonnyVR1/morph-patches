package p153l;

import com.clevertap.android.sdk.Constants;
import com.tantan.live.eventbus.LiveEventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/iin;", "Ll/o2e0;", "Ll/zit;", "<init>", "()V", Constants.KEY_T, "Ll/gae0;", "plug", "Ll/bae0$b;", "extraInfo", "", "b", "(Ll/zit;Ll/gae0;Ll/bae0$b;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class iin extends o2e0<zit> {
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(@Nullable zit t, @Nullable gae0 plug, @Nullable bae0.C15954b extraInfo) {
        LiveEventBus liveEventBusM213811F2;
        LiveEventBus.IntlGameBoardEvent intlGameBoardEvent;
        v3f.C20735c<C22421c<vxj0>> c20735cOpenGameBoard;
        if (plug == null || (liveEventBusM213811F2 = plug.m213811F2()) == null || (intlGameBoardEvent = liveEventBusM213811F2.IntlGameBoardEvent) == null || (c20735cOpenGameBoard = intlGameBoardEvent.openGameBoard()) == null) {
            return;
        }
        c20735cOpenGameBoard.m199277p();
    }
}
