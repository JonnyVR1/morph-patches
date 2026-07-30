package p153l;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p051p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rmf extends omf {
    public rmf(CacheCardType cacheCardType) {
        super(cacheCardType);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m182062A(Bundle bundle) {
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m182064C() {
        this.f147926a.clear();
        uj4.m196318c(m168222s());
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: e */
    public int mo164333e(Context context, ner nerVar) {
        nerVar.creates(new y20() { // from class: l.pmf
            @Override // p153l.y20
            public final void call(Object obj) {
                rmf.m182062A((Bundle) obj);
            }
        }, new x20() { // from class: l.qmf
            @Override // p153l.x20
            public final void call() {
                this.f158342a.m182064C();
            }
        });
        User userMe_ = CoreModule.m30930K().me_();
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = userMe_.f56859id;
        List<pf60<HomeCardExpandedType, Integer>> listM201734d = vmf.m201734d((Act) context, userMe_, userInfo);
        e3i0 e3i0Var = new e3i0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        if (!jyb.m147479J(listM201734d)) {
            Iterator<pf60<HomeCardExpandedType, Integer>> it = listM201734d.iterator();
            while (it.hasNext()) {
                m168227x(e3i0Var, context, frameLayout, it.next().f152156a, listM201734d.size());
            }
        }
        return listM201734d.size();
    }

    @Override // p153l.omf
    /* JADX INFO: renamed from: r */
    public int mo168221r() {
        return 1;
    }
}
