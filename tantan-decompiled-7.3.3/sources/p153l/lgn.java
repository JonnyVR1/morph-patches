package p153l;

import android.net.Uri;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/lgn;", "Ll/ar2;", "Ll/wgn;", "Ll/ner;", "lifecycleProvider", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Ll/ner;Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "i0", "j0", "", "conversationId", "k0", "(Ljava/lang/String;)V", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "h0", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData;", "b", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData;", "pageData", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lgn extends ar2<wgn> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public IntlFeedbackPageData pageData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgn(@Nullable ner nerVar, @NotNull Act act) {
        super(nerVar);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m154089e0(lgn lgnVar, IntlFeedbackPageData intlFeedbackPageData) {
        lgnVar.pageData = intlFeedbackPageData;
        wgn wgnVar = (wgn) lgnVar.viewModel;
        intlFeedbackPageData.getClass();
        wgnVar.m206212n(intlFeedbackPageData);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m154090f0(lgn lgnVar, String str, uxj0 uxj0Var) {
        Act act = lgnVar.act;
        act.startActivity(mbs.m157860j0(act, str, false, false));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m154091g0(lgn lgnVar, Throwable th) {
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(IntlLiveNormalApi.reqFeedbackPageData()).subscribe(dhw.m115826e(new y20() { // from class: l.ign
            @Override // p153l.y20
            public final void call(Object obj) {
                lgn.m154089e0(this.f114803a, (IntlFeedbackPageData) obj);
            }
        }, new y20() { // from class: l.jgn
            @Override // p153l.y20
            public final void call(Object obj) {
                lgn.m154091g0(this.f120747a, (Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m154093i0() {
        this.act.m68056e2();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m154094j0() {
        IntlFeedbackPageData intlFeedbackPageData = this.pageData;
        if (intlFeedbackPageData != null) {
            ujt.m196460b(this.act, Uri.parse(intlFeedbackPageData.getFeedbackUrl()));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m154095k0(@NotNull final String conversationId) {
        conversationId.getClass();
        duringCreated(mbs.m157853g().mo31839xs(conversationId)).subscribe(dhw.m115825d(new y20() { // from class: l.kgn
            @Override // p153l.y20
            public final void call(Object obj) {
                lgn.m154090f0(this.f126632a, conversationId, (uxj0) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
