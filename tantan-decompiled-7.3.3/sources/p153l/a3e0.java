package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.arch.card.carddata.LiveQuickEntrySuggested;
import com.p051p1.mobile.putong.live.external.module.api.LiveVoiceInternalSquareApi;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class a3e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        super.mo95798a(abe0Var, z20Var);
        if (abe0Var.m96739b() instanceof Act) {
            Map<String, String> mapM96743f = abe0Var.m96743f();
            String strM166119b = o5e0.m166119b(mapM96743f, "source");
            String strM166119b2 = o5e0.m166119b(mapM96743f, "liveId");
            final Act act = (Act) abe0Var.m96739b();
            act.duringCreated(LiveVoiceInternalSquareApi.requestSuggestVoiceLive(strM166119b, strM166119b2)).subscribe(dhw.m115826e(new y20() { // from class: l.y2e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197211a.m95800f(act, (BaseLiveListBean) obj);
                }
            }, new z2e0()));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void m95800f(Act act, BaseLiveListBean<LiveQuickEntrySuggested> baseLiveListBean) {
        if (baseLiveListBean == null || jyb.m147479J(baseLiveListBean.getList())) {
            return;
        }
        yrs.m217233a(act, baseLiveListBean.getList().get(0).getGoAction());
    }
}
