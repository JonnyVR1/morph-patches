package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntrySuggested;
import com.p046p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class wud0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        super.mo94421a(w2e0Var, f30Var);
        if (w2e0Var.m201094b() instanceof Act) {
            Map<String, String> mapM201098f = w2e0Var.m201098f();
            String strM147736b = kxd0.m147736b(mapM201098f, "source");
            String strM147736b2 = kxd0.m147736b(mapM201098f, "liveId");
            final Act act = (Act) w2e0Var.m201094b();
            act.duringCreated(LiveVoiceInternalSquareApi.requestSuggestVoiceLive(strM147736b, strM147736b2)).subscribe(ffw.m121194e(new e30() { // from class: l.uud0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178341a.m205617f(act, (BaseLiveListBean) obj);
                }
            }, new vud0()));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void m205617f(Act act, BaseLiveListBean<LiveQuickEntrySuggested> baseLiveListBean) {
        if (baseLiveListBean == null || vwb.m200296J(baseLiveListBean.getList())) {
            return;
        }
        xps.m210534a(act, baseLiveListBean.getList().get(0).getGoAction());
    }
}
