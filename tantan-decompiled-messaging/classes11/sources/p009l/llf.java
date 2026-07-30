package p009l;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.mcr;
import l.vwb;
import l.wuh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class llf extends ilf {
    public llf(CacheCardType cacheCardType) {
        super(cacheCardType);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m17959A(Bundle bundle) {
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m17961C() {
        this.f14689a.clear();
        vi4.m23380c(m16632s());
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: e */
    public int mo12745e(Context context, mcr mcrVar) {
        mcrVar.creates(new e30() { // from class: l.jlf
            public final void call(Object obj) {
                llf.m17959A((Bundle) obj);
            }
        }, new d30() { // from class: l.klf
            public final void call() {
                this.f15759a.m17961C();
            }
        });
        User userMe_ = CoreModule.K().me_();
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ((DbObject) userMe_).id;
        List<j760<HomeCardExpandedType, Integer>> listM20501d = plf.m20501d((Act) context, userMe_, userInfo);
        wuh0 wuh0Var = new wuh0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        if (!vwb.J(listM20501d)) {
            Iterator<j760<HomeCardExpandedType, Integer>> it = listM20501d.iterator();
            while (it.hasNext()) {
                m16637x(wuh0Var, context, frameLayout, (HomeCardExpandedType) it.next().a, listM20501d.size());
            }
        }
        return listM20501d.size();
    }

    @Override // p009l.ilf
    /* JADX INFO: renamed from: r */
    public int mo16631r() {
        return 1;
    }
}
