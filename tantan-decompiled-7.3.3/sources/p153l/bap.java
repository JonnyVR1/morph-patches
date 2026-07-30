package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p051p1.mobile.putong.core.p058ui.intloperation.quiz.C8549a;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, m88121d2 = {"Ll/bap;", "", "<init>", "()V", "Ll/jxd0;", "c", "()Ll/jxd0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", "data", "", "isUpdateShowNum", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;ILcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;Z)V", "g", "Ll/l4g0;", "pageHelper", "f", "(Ll/l4g0;)V", "e", "Ll/wyd0;", "a", "Ll/wyd0;", "getQuizReminderNum", "()Ll/wyd0;", "quizReminderNum", "b", "Ll/l4g0;", "()Ll/l4g0;", "pageHelper_result", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bap {

    @NotNull
    public static final bap INSTANCE = new bap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final wyd0 quizReminderNum = new wyd0("quiz_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final l4g0 pageHelper_result;

    static {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_mkt_quiz_done", r9p.class.getName());
        l4g0VarM204399c.getClass();
        pageHelper_result = l4g0VarM204399c;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m103222a(Act act, IntlMarketResponseEnvelope intlMarketResponseEnvelope, int i, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        new C8549a(act).m47525r(intlMarketConfigEnvelope.data, intlMarketResponseEnvelope.data.quiz_option, i);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final l4g0 m103223b() {
        return pageHelper_result;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final jxd0 m103224c() {
        return new jxd0("IntlQuiz" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d */
    public final void m103225d(@NotNull final Act act, final int source, @NotNull final IntlMarketResponseEnvelope data, boolean isUpdateShowNum) {
        act.getClass();
        data.getClass();
        if (isUpdateShowNum) {
            udo.INSTANCE.m195519s(quizReminderNum);
        }
        CoreModule.f18264c.f20292A1.m102932m3(act, new Function1() { // from class: l.aap
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bap.m103222a(act, data, source, (IntlMarketConfigEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m103226e(@Nullable l4g0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m152776k();
            pageHelper.m152775j();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m103227f(@Nullable l4g0 pageHelper) {
        if (pageHelper != null) {
            pageHelper.m152774i();
            pageHelper.m152777l();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m103228g() {
        i4g0.m138520r("e_intl_mkt_quiz_intro_btn", "p_intl_mkt_quiz_intro");
    }
}
