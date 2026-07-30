package p153l;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;
import com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.module.fragment.FeedInteractionTabFrag;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class emg implements e5h<FeedInteractionTabFrag> {

    /* JADX INFO: renamed from: a */
    public FeedInteractionTabFrag f94649a;

    /* JADX INFO: renamed from: b */
    public vbh f94650b;

    /* JADX INFO: renamed from: l.emg$a */
    public class C16797a extends vbh {
        public C16797a() {
        }

        @Override // p153l.zxh
        /* JADX INFO: renamed from: a */
        public int mo121367a() {
            return emg.this.mo121362g();
        }
    }

    @Override // p153l.e5h
    /* JADX INFO: renamed from: b */
    public Bundle mo119534b() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("TAB_VALUE", mo121359d());
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public abstract FeedInteractionTab mo121359d();

    @Override // p153l.e5h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FeedInteractionTabFrag mo119533a(@Nullable dsl dslVar) {
        if (this.f94649a == null) {
            FeedInteractionTabFrag feedInteractionTabFrag = new FeedInteractionTabFrag();
            this.f94649a = feedInteractionTabFrag;
            feedInteractionTabFrag.m65964m5(m121361f());
            if (mo121359d() == FeedInteractionTab.Like) {
                this.f94649a.m65963l5(true);
            }
        }
        return this.f94649a;
    }

    /* JADX INFO: renamed from: f */
    public zxh m121361f() {
        if (this.f94650b == null) {
            this.f94650b = new C16797a();
        }
        return this.f94650b;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo121362g();

    /* JADX INFO: renamed from: h */
    public void m121363h(ArrayList<User> arrayList, int i) {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f94649a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m65959h5(arrayList, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m121364i() {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f94649a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m65957e5();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m121365j() {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f94649a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m65958f5();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m121366k(List<String> list) {
        FeedInteractionTabFrag feedInteractionTabFrag = this.f94649a;
        if (feedInteractionTabFrag != null) {
            feedInteractionTabFrag.m65960i5(list);
        }
    }
}
