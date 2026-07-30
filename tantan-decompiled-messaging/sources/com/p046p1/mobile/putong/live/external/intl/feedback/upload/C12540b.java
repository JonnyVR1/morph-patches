package com.p046p1.mobile.putong.live.external.intl.feedback.upload;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.external.intl.feedback.upload.C12540b;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveNormalApi;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e30;
import p149l.ffw;
import p149l.jji0;
import p149l.jq2;
import p149l.mcr;
import p149l.odn;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.feedback.upload.b */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/intl/feedback/upload/b;", "Ll/jq2;", "Ll/odn;", "Ll/mcr;", "lifecycleProvider", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Ll/mcr;Lcom/p1/mobile/android/app/Act;)V", "", "a0", "()V", "h0", "Lcom/p1/mobile/putong/live/external/intl/feedback/upload/a;", "bean", "g0", "(Lcom/p1/mobile/putong/live/external/intl/feedback/upload/a;)V", "destroy", "Lcom/p1/mobile/android/app/Act;", "f0", "()Lcom/p1/mobile/android/app/Act;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C12540b extends jq2<odn> {

    @NotNull
    private final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12540b(@Nullable mcr mcrVar, @NotNull Act act) {
        super(mcrVar);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m69958e0(C12540b c12540b, BaseLiveListBean baseLiveListBean) {
        odn odnVar = (odn) c12540b.viewModel;
        baseLiveListBean.getClass();
        odnVar.m163694i(baseLiveListBean);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        String stringExtra = this.act.getIntent().getStringExtra("liveType");
        if (jji0.m141806b(stringExtra)) {
            stringExtra = "live";
        }
        duringCreated(IntlLiveNormalApi.fetchLiveQuestionTypes(stringExtra)).subscribe(ffw.m121197h(new e30() { // from class: l.ldn
            @Override // p149l.e30
            public final void call(Object obj) {
                C12540b.m69958e0(this.f127569a, (BaseLiveListBean) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    @NotNull
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m69960g0(@NotNull C12539a bean) {
        bean.getClass();
        Intent intent = new Intent(this.act, (Class<?>) IntlFeedbackCommitAct.class);
        intent.putExtra("typeName", bean.typeName);
        intent.putExtra("liveType", this.act.getIntent().getStringExtra("liveType"));
        this.act.startActivity(intent);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m69961h0() {
        this.act.lambda$debugItems$19();
    }
}
