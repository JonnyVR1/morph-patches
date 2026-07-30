package p007l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.MultiTabTopicPhotoAlbumFeedFrag;
import com.p1.mobile.putong.app.PutongAct;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pyi0 implements s7m<oyi0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f12027a;

    /* JADX INFO: renamed from: b */
    public oyi0 f12028b;

    public pyi0(PutongAct putongAct) {
        this.f12027a = putongAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13359C0() {
        return this.f12027a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m13361i1(oyi0 oyi0Var) {
        this.f12028b = oyi0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String strUserId = FeedModule.m1139F().userId();
        oyi0 oyi0Var = this.f12028b;
        this.f12027a.fragmentManager().m().s(R.id.content, MultiTabTopicPhotoAlbumFeedFrag.m7324O4(strUserId, oyi0Var.f11646b, oyi0Var.f11647c, 7, oyi0Var.f11649e)).i();
        this.f12027a.fragmentManager().e0();
        return null;
    }

    public void destroy() {
    }
}
