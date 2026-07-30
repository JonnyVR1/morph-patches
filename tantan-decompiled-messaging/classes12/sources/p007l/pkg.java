package p007l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class pkg implements p3h<FeedInteractionTabFrag> {

    /* JADX INFO: renamed from: a */
    public FeedInteractionTabFrag f11877a;

    /* JADX INFO: renamed from: b */
    public gah f11878b;

    /* JADX INFO: renamed from: l.pkg$a */
    public class C2458a extends gah {
        public C2458a() {
        }

        @Override // p007l.kwh
        /* JADX INFO: renamed from: a */
        public int mo11530a() {
            return pkg.this.mo9687g();
        }
    }

    @Override // p007l.p3h
    /* JADX INFO: renamed from: b */
    public Bundle mo12906b() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("TAB_VALUE", mo9686d());
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public abstract FeedInteractionTab mo9686d();

    @Override // p007l.p3h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FeedInteractionTabFrag mo12905a(@Nullable qpl qplVar) {
        if (this.f11877a == null) {
            FeedInteractionTabFrag feedInteractionTabFrag = new FeedInteractionTabFrag();
            this.f11877a = feedInteractionTabFrag;
            feedInteractionTabFrag.m5877m5(m13068f());
            if (mo9686d() == FeedInteractionTab.Like) {
                this.f11877a.m5876l5(true);
            }
        }
        return this.f11877a;
    }

    /* JADX INFO: renamed from: f */
    public kwh m13068f() {
        if (this.f11878b == null) {
            this.f11878b = new C2458a();
        }
        return this.f11878b;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo9687g();

    /* JADX INFO: renamed from: h */
    public void m13069h(ArrayList<User> arrayList, int i) {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f11877a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m5872h5(arrayList, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13070i() {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f11877a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m5870e5();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m13071j() {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f11877a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m5871f5();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13072k(List<String> list) {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f11877a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m5873i5(list);
        }
    }
}
