package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.LoveBuzzPushData;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0012\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m88121d2 = {"Ll/num0;", "Ll/kg2;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "pageType", "modeType", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)V", "", "r", "()V", "q", "Ll/pf60;", "", "pair", "", StickerBundle.TYPE, "j0", "(Ll/pf60;Z)V", ResourceDirection.f39656v, "f0", "B", "", "M", "()I", "I", "()Ljava/lang/String;", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class num0 extends kg2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public num0(@NotNull Act act, @NotNull String str, @NotNull String str2) {
        super(act, str, str2);
        act.getClass();
        str.getClass();
        str2.getClass();
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: B */
    public void mo99381B() {
        super.mo99381B();
        m149719h0("p_buzz_voice_connecting");
    }

    @Override // p153l.kg2
    @NotNull
    /* JADX INFO: renamed from: I */
    public String mo99382I() {
        return kq3.INSTANCE.m150807a();
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: M */
    public int mo99383M() {
        return ebc0.f92891l0;
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: f0 */
    public void mo99384f0() {
        super.mo99384f0();
        m149719h0("p_intl_buzz_voice_waiting");
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: j0 */
    public void mo99385j0(@NotNull pf60<String, Object> pair, boolean bundle) {
        int i;
        pair.getClass();
        super.mo99385j0(pair, bundle);
        if (CoreModule.m30930K().mo31838xf()) {
            return;
        }
        haw.Companion companion = haw.INSTANCE;
        LoveBuzzData loveBuzzDataM134315v0 = companion.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 == null || (i = loveBuzzDataM134315v0.remainingVoiceBuzz) == getNOT_LIMIT_VALUE()) {
            return;
        }
        loveBuzzDataM134315v0.remainingVoiceBuzz = C15274a.m88486b(i - 1, 0);
        companion.m134320a().m134263A0().m137019l(loveBuzzDataM134315v0);
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: q */
    public void mo99386q() {
        super.mo99386q();
        m149719h0("p_buzz_voice_searching");
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: r */
    public void mo99387r() {
        super.mo99387r();
        m149703P().setBackgroundResource(ebc0.f92907t0);
        m149710W().setBackgroundResource(ebc0.f92911v0);
        m149709V().m48312d(k3d0.m148005a(d9c0.f85746c), k3d0.m148005a(d9c0.f85747d), qa00.f156320g);
        if (!m149730z("voiceBuzz")) {
            m149719h0("p_buzz_voice_searching");
            return;
        }
        haw.Companion companion = haw.INSTANCE;
        pf60<String, Object> pf60VarM222761e = companion.m134320a().m134269G0().m222761e();
        pf60VarM222761e.getClass();
        kg2.m149693y(this, pf60VarM222761e, false, 2, null);
        if (!m149694A(pf60VarM222761e)) {
            mo99381B();
        } else if (Intrinsics.m88377d(getModeType(), "passive")) {
            Object obj = pf60VarM222761e.f152157b;
            LoveBuzzPushData loveBuzzPushData = obj instanceof LoveBuzzPushData ? (LoveBuzzPushData) obj : null;
            m149695E(loveBuzzPushData != null ? loveBuzzPushData.channelToken : null);
        } else {
            mo99388v();
        }
        m149725n0(pf60VarM222761e);
        companion.m134320a().m134269G0().m137019l(jyb.m147494Y("intl.text.lovebuzz.close.notify", null));
    }

    @Override // p153l.kg2
    /* JADX INFO: renamed from: v */
    public void mo99388v() {
        super.mo99388v();
        m149719h0("p_intl_buzz_voice_paired");
        nbw.m162202p(nbw.INSTANCE, null, 1, null);
    }
}
