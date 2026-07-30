package p149l;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p046p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class llf extends ilf {
    public llf(CacheCardType cacheCardType) {
        super(cacheCardType);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m150476A(Bundle bundle) {
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m150478C() {
        this.f113824a.clear();
        vi4.m198497c(m136996s());
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: e */
    public int mo108019e(Context context, mcr mcrVar) {
        mcrVar.creates(new e30() { // from class: l.jlf
            @Override // p149l.e30
            public final void call(Object obj) {
                llf.m150476A((Bundle) obj);
            }
        }, new d30() { // from class: l.klf
            @Override // p149l.d30
            public final void call() {
                this.f123667a.m150478C();
            }
        });
        User userMe_ = CoreModule.m29932K().me_();
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = userMe_.f56011id;
        List<j760<HomeCardExpandedType, Integer>> listM170172d = plf.m170172d((Act) context, userMe_, userInfo);
        wuh0 wuh0Var = new wuh0(context);
        FrameLayout frameLayout = new FrameLayout(context);
        if (!vwb.m200296J(listM170172d)) {
            Iterator<j760<HomeCardExpandedType, Integer>> it = listM170172d.iterator();
            while (it.hasNext()) {
                m137001x(wuh0Var, context, frameLayout, it.next().f116564a, listM170172d.size());
            }
        }
        return listM170172d.size();
    }

    @Override // p149l.ilf
    /* JADX INFO: renamed from: r */
    public int mo136995r() {
        return 1;
    }
}
