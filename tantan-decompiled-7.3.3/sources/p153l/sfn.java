package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Contact;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.external.intl.feedback.upload.IntlFeedbackResultAct;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ'\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m88121d2 = {"Ll/sfn;", "Ll/ar2;", "Ll/yfn;", "Ll/ner;", "lifecycleProvider", "Lcom/p1/mobile/putong/app/PutongAct;", SocialConstants.PARAM_ACT, "<init>", "(Ll/ner;Lcom/p1/mobile/putong/app/PutongAct;)V", "", "a0", "()V", "l0", "destroy", "k0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m0", "(IILandroid/content/Intent;)V", "", "content", Contact.TYPE, "picUrl", "", MatchFrom.selected, "h0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "n0", "j0", "Lcom/p1/mobile/putong/app/PutongAct;", "i0", "()Lcom/p1/mobile/putong/app/PutongAct;", "Ll/ggn;", "mediaHelper", "Ll/ggn;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sfn extends ar2<yfn> {

    @NotNull
    private final PutongAct act;

    @NotNull
    private final ggn mediaHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfn(@Nullable ner nerVar, @NotNull PutongAct putongAct) {
        super(nerVar);
        putongAct.getClass();
        this.act = putongAct;
        this.mediaHelper = new ggn(putongAct);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m185626e0(sfn sfnVar, BaseLiveBean baseLiveBean) {
        sfnVar.m185631j0();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m185627f0(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m185628g0(sfn sfnVar, String str) {
        yfn yfnVar = (yfn) sfnVar.viewModel;
        str.getClass();
        yfnVar.m215792C(str);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.mediaHelper.m130185r(new y20() { // from class: l.pfn
            @Override // p153l.y20
            public final void call(Object obj) {
                sfn.m185628g0(this.f152197a, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m185629h0(@NotNull String content, @NotNull String contact, @NotNull String picUrl, boolean selected) {
        content.getClass();
        contact.getClass();
        picUrl.getClass();
        String stringExtra = this.act.getIntent().getStringExtra("typeName");
        String stringExtra2 = this.act.getIntent().getStringExtra("liveType");
        if (TextUtils.isEmpty(stringExtra2)) {
            stringExtra2 = "live";
        }
        duringCreated(IntlLiveNormalApi.submitFeedback(stringExtra2, stringExtra, content, picUrl, contact, selected)).subscribe(dhw.m115826e(new y20() { // from class: l.qfn
            @Override // p153l.y20
            public final void call(Object obj) {
                sfn.m185626e0(this.f157316a, (BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.rfn
            @Override // p153l.y20
            public final void call(Object obj) {
                sfn.m185627f0((Throwable) obj);
            }
        }));
    }

    @NotNull
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final PutongAct getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m185631j0() {
        this.act.startActivity(new Intent(this.act, (Class<?>) IntlFeedbackResultAct.class));
        this.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m185632k0() {
        this.act.pickImagesWithPicker(1, false, false, false, ggn.REQUEST_JSCODE_PICKER);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m185633l0() {
        this.act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m185634m0(int requestCode, int resultCode, @Nullable Intent data) {
        this.mediaHelper.m130183p(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m185635n0() {
        this.mediaHelper.m130186s();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
