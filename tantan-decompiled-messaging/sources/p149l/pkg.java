package p149l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;
import com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class pkg implements p3h<FeedInteractionTabFrag> {

    /* JADX INFO: renamed from: a */
    public FeedInteractionTabFrag f149986a;

    /* JADX INFO: renamed from: b */
    public gah f149987b;

    /* JADX INFO: renamed from: l.pkg$a */
    public class C19260a extends gah {
        public C19260a() {
        }

        @Override // p149l.kwh
        /* JADX INFO: renamed from: a */
        public int mo147545a() {
            return pkg.this.mo115418g();
        }
    }

    @Override // p149l.p3h
    /* JADX INFO: renamed from: b */
    public Bundle mo167247b() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("TAB_VALUE", mo115417d());
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public abstract FeedInteractionTab mo115417d();

    @Override // p149l.p3h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FeedInteractionTabFrag mo167246a(@Nullable qpl qplVar) {
        if (this.f149986a == null) {
            FeedInteractionTabFrag feedInteractionTabFrag = new FeedInteractionTabFrag();
            this.f149986a = feedInteractionTabFrag;
            feedInteractionTabFrag.m64781m5(m170047f());
            if (mo115417d() == FeedInteractionTab.Like) {
                this.f149986a.m64780l5(true);
            }
        }
        return this.f149986a;
    }

    /* JADX INFO: renamed from: f */
    public kwh m170047f() {
        if (this.f149987b == null) {
            this.f149987b = new C19260a();
        }
        return this.f149987b;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo115418g();

    /* JADX INFO: renamed from: h */
    public void m170048h(ArrayList<User> arrayList, int i) {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f149986a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m64776h5(arrayList, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m170049i() {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f149986a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m64774e5();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m170050j() {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f149986a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m64775f5();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m170051k(List<String> list) {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f149986a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m64777i5(list);
        }
    }
}
