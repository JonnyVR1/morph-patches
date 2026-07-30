package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.bcn0;
import l.f6k;
import l.w8n0;
import l.ygt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/kq50;", "Ll/kud0;", "Ll/ygt;", "<init>", "()V", "liveRoomScheme", "Ll/c2e0;", "plug", "Ll/x1e0$b;", "extraInfo", "", "d", "(Ll/ygt;Ll/c2e0;Ll/x1e0$b;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class kq50 extends kud0<ygt> {
    /* JADX INFO: renamed from: e */
    public static final void m16757e(final c2e0 c2e0Var, Act act) {
        c2e0Var.m25548F2().VoiceGameChangeEvent.stopVoiceGame().j(Integer.valueOf(w8n0.f().g()));
        act.postDelayed(new Runnable() { // from class: l.jq50
            @Override // java.lang.Runnable
            public final void run() {
                kq50.m16758f(c2e0Var);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: f */
    public static final void m16758f(c2e0 c2e0Var) {
        c2e0Var.m25548F2().VoiceGrabHatEvent.openStartGameDialog().p();
    }

    @Override // p002l.kud0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo9496a(@NotNull ygt liveRoomScheme, @NotNull final c2e0 plug, @Nullable x1e0.C0892b extraInfo) {
        liveRoomScheme.getClass();
        plug.getClass();
        BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame = (BLiveVoiceGrabHatGame) plug.m14184F3(new f6k(200));
        if (Intrinsics.d("chatAreaCampaign", liveRoomScheme.g("source"))) {
            plug.m25548F2().VoiceGrabHatEvent.openHatCpDialog().j(Boolean.TRUE);
            return;
        }
        if (bcn0.c(bLiveVoiceGrabHatGame)) {
            plug.m25548F2().VoiceGrabHatEvent.openHatCpDialog().j(Boolean.FALSE);
            return;
        }
        if (w8n0.f().g() == 0) {
            plug.m25548F2().VoiceGrabHatEvent.openStartGameDialog().p();
            return;
        }
        final Act act = plug.act();
        if (act != null) {
            Dialog.e eVarDialog = act.dialog();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = act.getString(R$string.f3150Zf);
            string.getClass();
            eVarDialog.F(String.format(string, Arrays.copyOf(new Object[]{w8n0.f().e(act)}, 1))).k0(R$string.f2884N1).t0(R$string.f3389ke, new Runnable() { // from class: l.iq50
                @Override // java.lang.Runnable
                public final void run() {
                    kq50.m16757e(plug, act);
                }
            }).z().show();
        }
    }
}
