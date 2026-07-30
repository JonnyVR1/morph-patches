package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/qy50;", "Ll/o2e0;", "Ll/zit;", "<init>", "()V", "liveRoomScheme", "Ll/gae0;", "plug", "Ll/bae0$b;", "extraInfo", "", Constants.INAPP_DATA_TAG, "(Ll/zit;Ll/gae0;Ll/bae0$b;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qy50 extends o2e0<zit> {
    /* JADX INFO: renamed from: e */
    public static final void m178622e(final gae0 gae0Var, Act act) {
        gae0Var.m213811F2().VoiceGameChangeEvent.stopVoiceGame().mo199273j(Integer.valueOf(ain0.m98000f().m98004g()));
        act.postDelayed(new Runnable() { // from class: l.py50
            @Override // java.lang.Runnable
            public final void run() {
                qy50.m178623f(gae0Var);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: f */
    public static final void m178623f(gae0 gae0Var) {
        gae0Var.m213811F2().VoiceGrabHatEvent.openStartGameDialog().m199277p();
    }

    @Override // p153l.o2e0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo97254a(@NotNull zit liveRoomScheme, @NotNull final gae0 plug, @Nullable bae0.C15954b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = (BLiveVoiceGrabHatGame) plug.m138856F3(new x8k(200));
        if (Intrinsics.m88377d("chatAreaCampaign", liveRoomScheme.m219937g("source"))) {
            plug.m213811F2().VoiceGrabHatEvent.openHatCpDialog().mo199273j(Boolean.TRUE);
            return;
        }
        if (fln0.m126164c(bLiveVoiceGrabHatGame)) {
            plug.m213811F2().VoiceGrabHatEvent.openHatCpDialog().mo199273j(Boolean.FALSE);
            return;
        }
        if (ain0.m98000f().m98004g() == 0) {
            plug.m213811F2().VoiceGrabHatEvent.openStartGameDialog().m199277p();
            return;
        }
        final Act act = plug.act();
        if (act != null) {
            Dialog.C4460e c4460eDialog = act.dialog();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = act.getString(R$string.f47956Zf);
            string.getClass();
            c4460eDialog.m21503F(String.format(string, Arrays.copyOf(new Object[]{ain0.m98000f().m98003e(act)}, 1))).m21540k0(R$string.f47690N1).m21555t0(R$string.f48195ke, new Runnable() { // from class: l.oy50
                @Override // java.lang.Runnable
                public final void run() {
                    qy50.m178622e(plug, act);
                }
            }).m21566z().show();
        }
    }
}
