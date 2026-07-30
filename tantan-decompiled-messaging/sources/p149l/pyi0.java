package p149l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.MultiTabTopicPhotoAlbumFeedFrag;

/* JADX INFO: loaded from: classes12.dex */
public class pyi0 implements s7m<oyi0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f151857a;

    /* JADX INFO: renamed from: b */
    public oyi0 f151858b;

    public pyi0(PutongAct putongAct) {
        this.f151857a = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f151857a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(oyi0 oyi0Var) {
        this.f151858b = oyi0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String strUserId = FeedModule.m60221F().userId();
        oyi0 oyi0Var = this.f151858b;
        this.f151857a.fragmentManager().m2567m().m2811s(R.id.content, MultiTabTopicPhotoAlbumFeedFrag.m66168O4(strUserId, oyi0Var.f146328b, oyi0Var.f146329c, 7, oyi0Var.f146331e)).mo2707i();
        this.f151857a.fragmentManager().m2545e0();
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
