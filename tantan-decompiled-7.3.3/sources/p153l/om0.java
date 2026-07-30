package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserFrag;
import com.p051p1.mobile.putong.core.p058ui.likedusers.anchor.AnchorLikedUserItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class om0 extends jic0<pm0> {

    /* JADX INFO: renamed from: c */
    public List<pm0> f147886c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public fjr f147887d;

    /* JADX INFO: renamed from: e */
    public LikedUserFrag f147888e;

    public om0(LikedUserFrag likedUserFrag) {
        this.f147887d = likedUserFrag.m47967S4();
        this.f147888e = likedUserFrag;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f147886c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f147887d.act().inflater().inflate(pec0.f151977d, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, pm0 pm0Var, int i, int i2) {
        ((AnchorLikedUserItemView) view).m47989g(pm0Var);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public pm0 getItem(int i) {
        return this.f147886c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m168180G(List<pm0> list) {
        this.f147886c.clear();
        if (!jyb.m147479J(list)) {
            this.f147886c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        super.mo48510e(i);
        if (!this.f147886c.isEmpty() && i == this.f147886c.size() - 3 && Network.isConnected(this.f147887d.act())) {
            this.f147887d.m125907a1();
        }
    }
}
