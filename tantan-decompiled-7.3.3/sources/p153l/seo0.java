package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/seo0;", "Ll/o2e0;", "Ll/zit;", "<init>", "()V", "liveRoomScheme", "Ll/gae0;", "plug", "Ll/bae0$b;", "extraInfo", "", Constants.INAPP_DATA_TAG, "(Ll/zit;Ll/gae0;Ll/bae0$b;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class seo0 extends o2e0<zit> {
    /* JADX INFO: renamed from: e */
    public static final void m185563e(BLiveVoiceLivePush bLiveVoiceLivePush) {
        if (TextUtils.isEmpty(bLiveVoiceLivePush.message)) {
            return;
        }
        o1j0.m165651y(bLiveVoiceLivePush.message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m185564f(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo97254a(@NotNull zit liveRoomScheme, @NotNull gae0 plug, @Nullable bae0.C15954b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        if (plug.act() != null) {
            String strM207631D0 = zrv.f205799a.m207631D0();
            jkp0.m145885p(plug);
            strM207631D0.getClass();
            String strM202191k = plug.m213810E2().m202191k();
            strM202191k.getClass();
            plug.duringCreated(VirtualVoiceRoomApiProvider.notifyFans(strM207631D0, strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.qeo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    seo0.m185563e((BLiveVoiceLivePush) obj);
                }
            }, new y20() { // from class: l.reo0
                @Override // p153l.y20
                public final void call(Object obj) {
                    seo0.m185564f((Throwable) obj);
                }
            }));
        }
    }
}
