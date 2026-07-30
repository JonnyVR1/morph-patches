package p009l;

import com.p1.mobile.putong.core.data.IntlMarketQuestionData;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import kotlin.Metadata;
import l.jq2;
import l.mcr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll/l7p;", "Ll/jq2;", "Ll/r7p;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "f0", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "e0", "(Lcom/p1/mobile/putong/core/data/IntlMarketQuestionData;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l7p extends jq2<r7p> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7p(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m17726e0(@NotNull IntlMarketQuestionData data) {
        data.getClass();
        ((r7p) ((jq2) this).viewModel).m21446B(data);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m17727f0() {
        ((r7p) ((jq2) this).viewModel).m21456r();
    }

    public void destroy() {
    }
}
