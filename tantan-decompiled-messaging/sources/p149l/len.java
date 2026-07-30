package p149l;

import android.net.Uri;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.intl.feedback.bean.IntlFeedbackPageData;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/len;", "Ll/jq2;", "Ll/wen;", "Ll/mcr;", "lifecycleProvider", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Ll/mcr;Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "i0", "j0", "", "conversationId", "k0", "(Ljava/lang/String;)V", "destroy", "a", "Lcom/p1/mobile/android/app/Act;", "h0", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData;", "b", "Lcom/p1/mobile/putong/live/external/intl/feedback/bean/IntlFeedbackPageData;", "pageData", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class len extends jq2<wen> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public IntlFeedbackPageData pageData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public len(@Nullable mcr mcrVar, @NotNull Act act) {
        super(mcrVar);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m149585e0(len lenVar, IntlFeedbackPageData intlFeedbackPageData) {
        lenVar.pageData = intlFeedbackPageData;
        wen wenVar = (wen) lenVar.viewModel;
        intlFeedbackPageData.getClass();
        wenVar.m202920n(intlFeedbackPageData);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m149586f0(len lenVar, String str, roj0 roj0Var) {
        Act act = lenVar.act;
        act.startActivity(l9s.m149083j0(act, str, false, false));
    }

    /* JADX INFO: renamed from: g0 */
    public static void m149587g0(len lenVar, Throwable th) {
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(IntlLiveNormalApi.reqFeedbackPageData()).subscribe(ffw.m121194e(new e30() { // from class: l.ien
            @Override // p149l.e30
            public final void call(Object obj) {
                len.m149585e0(this.f112815a, (IntlFeedbackPageData) obj);
            }
        }, new e30() { // from class: l.jen
            @Override // p149l.e30
            public final void call(Object obj) {
                len.m149587g0(this.f117588a, (Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m149589i0() {
        this.act.m66873d2();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m149590j0() {
        IntlFeedbackPageData intlFeedbackPageData = this.pageData;
        if (intlFeedbackPageData != null) {
            tht.m188929b(this.act, Uri.parse(intlFeedbackPageData.getFeedbackUrl()));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m149591k0(@NotNull final String conversationId) {
        conversationId.getClass();
        duringCreated(l9s.m149076g().mo30836xs(conversationId)).subscribe(ffw.m121193d(new e30() { // from class: l.ken
            @Override // p149l.e30
            public final void call(Object obj) {
                len.m149586f0(this.f122722a, conversationId, (roj0) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
