package p007l;

import com.p000p1.mobile.putong.data.Data;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p1.mobile.putong.core.ui.intloperation.quiz.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.cwf0;
import l.hpd0;
import l.i0e;
import l.r7p;
import l.ubo;
import l.uqd0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Ll/b8p;", "", "<init>", "()V", "Ll/hpd0;", "c", "()Ll/hpd0;", "Lcom/p1/mobile/android/app/Act;", "act", "", "source", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", Data.TYPE, "", "isUpdateShowNum", "", "d", "(Lcom/p1/mobile/android/app/Act;ILcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;Z)V", "g", "Ll/cwf0;", "pageHelper", "f", "(Ll/cwf0;)V", "e", "Ll/uqd0;", "a", "Ll/uqd0;", "getQuizReminderNum", "()Ll/uqd0;", "quizReminderNum", "b", "Ll/cwf0;", "()Ll/cwf0;", "pageHelper_result", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b8p {

    @NotNull
    public static final b8p INSTANCE = new b8p();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 quizReminderNum = new uqd0("quiz_reminder_num_" + CoreModule.H().userId(), "0_0_0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final cwf0 pageHelper_result;

    static {
        cwf0 cwf0VarC = i0e.c("p_intl_mkt_quiz_done", r7p.class.getName());
        cwf0VarC.getClass();
        pageHelper_result = cwf0VarC;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m8754a(Act act, IntlMarketResponseEnvelope intlMarketResponseEnvelope, int i, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        new a(act).r(intlMarketConfigEnvelope.data, intlMarketResponseEnvelope.data.quiz_option, i);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final cwf0 m8755b() {
        return pageHelper_result;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final hpd0 m8756c() {
        return new hpd0("IntlQuiz" + CoreModule.H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d */
    public final void m8757d(@NotNull final Act act, final int source, @NotNull final IntlMarketResponseEnvelope data, boolean isUpdateShowNum) {
        act.getClass();
        data.getClass();
        if (isUpdateShowNum) {
            ubo.INSTANCE.s(quizReminderNum);
        }
        CoreModule.c.A1.m3(act, new Function1() { // from class: l.a8p
            public final Object invoke(Object obj) {
                return b8p.m8754a(act, data, source, (IntlMarketConfigEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m8758e(@Nullable cwf0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.k();
            pageHelper.j();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8759f(@Nullable cwf0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.i();
            pageHelper.l();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8760g() {
        zvf0.r("e_intl_mkt_quiz_intro_btn", "p_intl_mkt_quiz_intro");
    }
}
