package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseMediaBuzzAct;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\tH&¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\tH&¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\tH&¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u000bR$\u0010)\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00107\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u00103\u001a\u0004\b+\u00104\"\u0004\b5\u00106¨\u00068"}, m87232d2 = {"Ll/dp2;", "Ll/s7m;", "Ll/bp2;", "Lcom/p1/mobile/putong/core/api/c0$c;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "presenter", "", "b", "(Ll/bp2;)V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", BaseSei.f13930X, "()V", "j", BaseSei.f13931Y, "k", "p", "q", BaseSei.f13932Z, BLiveStormDanmakuGiftResourceType.f44444l, "m", "n", BLiveStormDanmakuGiftResourceType.f44446s, "a", "Lcom/p1/mobile/android/app/Act;", "c", "()Lcom/p1/mobile/android/app/Act;", "Ll/bp2;", "f", "()Ll/bp2;", "setPresenter$buzz_intlGmsRelease", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "e", "()Lcom/p1/mobile/putong/data/User;", ResourceDirection.f38808v, "(Lcom/p1/mobile/putong/data/User;)V", "peerUser", "Lcom/p1/mobile/putong/data/Gender;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/data/Gender;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/data/Gender;", "w", "(Lcom/p1/mobile/putong/data/Gender;)V", "selfGender", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "setEndRunnable$buzz_intlGmsRelease", "(Ljava/lang/Runnable;)V", "endRunnable", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class dp2 implements s7m<bp2>, RunnableC4733c0.c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public bp2 presenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public User peerUser;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Gender selfGender;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public Runnable endRunnable;

    public dp2(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.endRunnable = new Runnable() { // from class: l.cp2
            @Override // java.lang.Runnable
            public final void run() {
                dp2.m112844a(this.f81897a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m112844a(dp2 dp2Var) {
        if (m6w.INSTANCE.m153296a(dp2Var.getAct())) {
            j8w.Companion companion = j8w.INSTANCE;
            companion.m140473a().m140417B0().m131190p(companion.m140473a().m140417B0().getStartTime() + 1950);
            Act act = dp2Var.act;
            BaseMediaBuzzAct baseMediaBuzzAct = act instanceof BaseMediaBuzzAct ? (BaseMediaBuzzAct) act : null;
            if (baseMediaBuzzAct != null) {
                baseMediaBuzzAct.mo46922V1("call_end");
            }
        }
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable bp2 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Runnable getEndRunnable() {
        return this.endRunnable;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final User getPeerUser() {
        return this.peerUser;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final bp2 getPresenter() {
        return this.presenter;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Gender getSelfGender() {
        return this.selfGender;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo112851j();

    /* JADX INFO: renamed from: k */
    public abstract void mo112852k();

    /* JADX INFO: renamed from: l */
    public abstract void mo112853l();

    /* JADX INFO: renamed from: m */
    public abstract void mo112854m();

    /* JADX INFO: renamed from: p */
    public abstract void mo112856p();

    /* JADX INFO: renamed from: q */
    public abstract void mo112857q();

    /* JADX INFO: renamed from: v */
    public final void m112859v(@Nullable User user) {
        this.peerUser = user;
    }

    /* JADX INFO: renamed from: w */
    public final void m112860w(@Nullable Gender gender) {
        this.selfGender = gender;
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo112861x();

    /* JADX INFO: renamed from: y */
    public abstract void mo112862y();

    /* JADX INFO: renamed from: z */
    public abstract void mo112863z();

    /* JADX INFO: renamed from: n */
    public void mo112855n() {
    }

    /* JADX INFO: renamed from: s */
    public void mo112858s() {
    }
}
