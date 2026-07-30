package p153l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;

/* JADX INFO: loaded from: classes13.dex */
public class pub0 implements iam<fub0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f154161a;

    /* JADX INFO: renamed from: b */
    public fub0 f154162b;

    /* JADX INFO: renamed from: c */
    public QATopicPhotoAlbumFeedFrag f154163c;

    public pub0(PutongAct putongAct) {
        this.f154161a = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f154161a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fub0 fub0Var) {
        this.f154162b = fub0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f154161a.fragmentManager().m2555h0(R.id.content) != null) {
            return null;
        }
        String strUserId = FeedModule.m61405F().userId();
        fub0 fub0Var = this.f154162b;
        this.f154163c = QATopicPhotoAlbumFeedFrag.m67181O4(strUserId, fub0Var.f100897b, fub0Var.f100898c, 8, fub0Var.f100899d);
        this.f154161a.fragmentManager().m2568m().m2812s(R.id.content, this.f154163c).mo2708i();
        this.f154161a.fragmentManager().m2546e0();
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
