package p153l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.MultiTabTopicPhotoAlbumFeedFrag;

/* JADX INFO: loaded from: classes13.dex */
public class t7j0 implements iam<s7j0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f172443a;

    /* JADX INFO: renamed from: b */
    public s7j0 f172444b;

    public t7j0(PutongAct putongAct) {
        this.f172443a = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f172443a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(s7j0 s7j0Var) {
        this.f172444b = s7j0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String strUserId = FeedModule.m61405F().userId();
        s7j0 s7j0Var = this.f172444b;
        this.f172443a.fragmentManager().m2568m().m2812s(R.id.content, MultiTabTopicPhotoAlbumFeedFrag.m67351O4(strUserId, s7j0Var.f166694b, s7j0Var.f166695c, 7, s7j0Var.f166697e)).mo2708i();
        this.f172443a.fragmentManager().m2546e0();
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
