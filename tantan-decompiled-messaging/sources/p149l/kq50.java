package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/kq50;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", Constants.INAPP_DATA_TAG, "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kq50 extends kud0<ygt> {
    /* JADX INFO: renamed from: e */
    public static final void m146923e(final c2e0 c2e0Var, Act act) {
        c2e0Var.m206028F2().VoiceGameChangeEvent.stopVoiceGame().mo172463j(Integer.valueOf(w8n0.m202192f().m202196g()));
        act.postDelayed(new Runnable() { // from class: l.jq50
            @Override // java.lang.Runnable
            public final void run() {
                kq50.m146924f(c2e0Var);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: f */
    public static final void m146924f(c2e0 c2e0Var) {
        c2e0Var.m206028F2().VoiceGrabHatEvent.openStartGameDialog().m172467p();
    }

    @Override // p149l.kud0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo95830a(@NotNull ygt liveRoomScheme, @NotNull final c2e0 plug, @Nullable x1e0.C21019b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = (BLiveVoiceGrabHatGame) plug.m129297F3(new f6k(200));
        if (Intrinsics.m87488d("chatAreaCampaign", liveRoomScheme.m214763g("source"))) {
            plug.m206028F2().VoiceGrabHatEvent.openHatCpDialog().mo172463j(Boolean.TRUE);
            return;
        }
        if (bcn0.m101094c(bLiveVoiceGrabHatGame)) {
            plug.m206028F2().VoiceGrabHatEvent.openHatCpDialog().mo172463j(Boolean.FALSE);
            return;
        }
        if (w8n0.m202192f().m202196g() == 0) {
            plug.m206028F2().VoiceGrabHatEvent.openStartGameDialog().m172467p();
            return;
        }
        final Act act = plug.act();
        if (act != null) {
            Dialog.C4309e c4309eDialog = act.dialog();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = act.getString(R$string.f47108Zf);
            string.getClass();
            c4309eDialog.m20504F(String.format(string, Arrays.copyOf(new Object[]{w8n0.m202192f().m202195e(act)}, 1))).m20541k0(R$string.f46842N1).m20556t0(R$string.f47347ke, new Runnable() { // from class: l.iq50
                @Override // java.lang.Runnable
                public final void run() {
                    kq50.m146923e(plug, act);
                }
            }).m20567z().show();
        }
    }
}
