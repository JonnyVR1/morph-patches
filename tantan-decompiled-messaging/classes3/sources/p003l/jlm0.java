package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import com.p1.mobile.putong.core.data.LoveBuzzPushData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import l.dg2;
import l.hvc0;
import l.j760;
import l.j8w;
import l.kp3;
import l.p9w;
import l.t100;
import l.vwb;
import l.x0c0;
import l.y2c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0012\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Ll/jlm0;", "Ll/dg2;", "Lcom/p1/mobile/android/app/Act;", "act", "", "pageType", "modeType", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)V", "", "r", "()V", "q", "Ll/j760;", "", "pair", "", "bundle", "j0", "(Ll/j760;Z)V", "v", "f0", "B", "", "M", "()I", "I", "()Ljava/lang/String;", "Companion", "a", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jlm0 extends dg2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlm0(@NotNull Act act, @NotNull String str, @NotNull String str2) {
        super(act, str, str2);
        act.getClass();
        str.getClass();
        str2.getClass();
    }

    /* JADX INFO: renamed from: B */
    public void m5356B() {
        super.B();
        h0("p_buzz_voice_connecting");
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public String m5357I() {
        return kp3.INSTANCE.a();
    }

    /* JADX INFO: renamed from: M */
    public int m5358M() {
        return y2c0.l0;
    }

    /* JADX INFO: renamed from: f0 */
    public void m5359f0() {
        super.f0();
        h0("p_intl_buzz_voice_waiting");
    }

    /* JADX INFO: renamed from: j0 */
    public void m5360j0(@NotNull j760<String, Object> pair, boolean bundle) {
        int i;
        pair.getClass();
        super.j0(pair, bundle);
        if (CoreModule.K().xf()) {
            return;
        }
        j8w.a aVar = j8w.Companion;
        LoveBuzzData loveBuzzDataV0 = aVar.a().v0();
        if (loveBuzzDataV0 == null || (i = loveBuzzDataV0.remainingVoiceBuzz) == L()) {
            return;
        }
        loveBuzzDataV0.remainingVoiceBuzz = a.b(i - 1, 0);
        aVar.a().A0().onNext(loveBuzzDataV0);
    }

    /* JADX INFO: renamed from: q */
    public void m5361q() {
        super.q();
        h0("p_buzz_voice_searching");
    }

    /* JADX INFO: renamed from: r */
    public void m5362r() {
        super.r();
        P().setBackgroundResource(y2c0.t0);
        W().setBackgroundResource(y2c0.v0);
        V().m154d(hvc0.a(x0c0.c), hvc0.a(x0c0.d), t100.g);
        if (!z("voiceBuzz")) {
            h0("p_buzz_voice_searching");
            return;
        }
        j8w.a aVar = j8w.Companion;
        j760 j760Var = (j760) aVar.a().G0().m9972e();
        j760Var.getClass();
        dg2.y(this, j760Var, false, 2, (Object) null);
        if (!A(j760Var)) {
            m5356B();
        } else if (Intrinsics.d(K(), "passive")) {
            Object obj = j760Var.b;
            LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            E(loveBuzzPushData != null ? loveBuzzPushData.channelToken : null);
        } else {
            m5363v();
        }
        n0(j760Var);
        aVar.a().G0().onNext(vwb.Y("intl.text.lovebuzz.close.notify", (Object) null));
    }

    /* JADX INFO: renamed from: v */
    public void m5363v() {
        super.v();
        h0("p_intl_buzz_voice_paired");
        p9w.p(p9w.INSTANCE, (String) null, 1, (Object) null);
    }
}
