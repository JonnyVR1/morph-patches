package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m87232d2 = {"Ll/q1l0;", "Ll/dg2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "pageType", "modeType", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)V", "", "r", "()V", "q", ResourceDirection.f38808v, "f0", "Ll/j760;", "", "pair", "", StickerBundle.TYPE, "j0", "(Ll/j760;Z)V", "B", "", "M", "()I", "I", "()Ljava/lang/String;", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q1l0 extends dg2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1l0(@NotNull Act act, @NotNull String str, @NotNull String str2) {
        super(act, str, str2);
        act.getClass();
        str.getClass();
        str2.getClass();
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: B */
    public void mo111561B() {
        super.mo111561B();
        m111589h0("p_buzz_video_connecting");
    }

    @Override // p149l.dg2
    @NotNull
    /* JADX INFO: renamed from: I */
    public String mo111565I() {
        return kp3.INSTANCE.m146823m();
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: M */
    public int mo111569M() {
        return -1;
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: f0 */
    public void mo111587f0() {
        super.mo111587f0();
        m111589h0("p_intl_buzz_video_waiting");
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: j0 */
    public void mo111591j0(@NotNull j760<String, Object> pair, boolean bundle) {
        int i;
        pair.getClass();
        super.mo111591j0(pair, bundle);
        j8w.Companion companion = j8w.INSTANCE;
        LoveBuzzData loveBuzzDataM140468v0 = companion.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 == null || (i = loveBuzzDataM140468v0.remainingVideoBuzz) == getNOT_LIMIT_VALUE()) {
            return;
        }
        loveBuzzDataM140468v0.remainingVideoBuzz = C15167a.m87596b(i - 1, 0);
        companion.m140473a().m140416A0().m132487l(loveBuzzDataM140468v0);
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: q */
    public void mo111598q() {
        super.mo111598q();
        m111589h0("p_buzz_video_searching");
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: r */
    public void mo111599r() {
        super.mo111599r();
        m111580X().setTextColor(hvc0.m133154a(x0c0.f188959m));
        m111583a0().setBackgroundResource(y2c0.f195546a);
        m111572P().setBackgroundResource(y2c0.f195575o0);
        m111579W().setBackgroundResource(y2c0.f195579q0);
        m111585c0().setTextColor(-1);
        m111584b0().setTextColor(-1);
        m111578V().m47129d(hvc0.m133154a(x0c0.f188952f), hvc0.m133154a(x0c0.f188951e), t100.f167258g);
        if (!m111604z("videoBuzz")) {
            m111589h0("p_buzz_video_searching");
            return;
        }
        j8w.Companion companion = j8w.INSTANCE;
        j760<String, Object> j760VarM221515e = companion.m140473a().m140422G0().m221515e();
        j760VarM221515e.getClass();
        dg2.m111559y(this, j760VarM221515e, false, 2, null);
        if (!m111560A(j760VarM221515e)) {
            mo111561B();
        } else if (Intrinsics.m87488d(getModeType(), "passive")) {
            Object obj = j760VarM221515e.f116565b;
            LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            m111562E(loveBuzzPushData != null ? loveBuzzPushData.channelToken : null);
        } else {
            mo111601v();
        }
        m111596n0(j760VarM221515e);
        companion.m140473a().m140422G0().m132487l(vwb.m200311Y("intl.text.lovebuzz.close.notify", null));
    }

    @Override // p149l.dg2
    /* JADX INFO: renamed from: v */
    public void mo111601v() {
        super.mo111601v();
        m111589h0("p_intl_buzz_video_paired");
        p9w.INSTANCE.m167946o("videoBuzz");
    }
}
