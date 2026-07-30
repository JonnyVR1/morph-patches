package p007l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;
import com.p1.mobile.putong.app.PutongAct;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lmb0 implements s7m<bmb0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f10063a;

    /* JADX INFO: renamed from: b */
    public bmb0 f10064b;

    /* JADX INFO: renamed from: c */
    public QATopicPhotoAlbumFeedFrag f10065c;

    public lmb0(PutongAct putongAct) {
        this.f10063a = putongAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11643C0() {
        return this.f10063a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m11645i1(bmb0 bmb0Var) {
        this.f10064b = bmb0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f10063a.fragmentManager().h0(R.id.content) != null) {
            return null;
        }
        String strUserId = FeedModule.m1139F().userId();
        bmb0 bmb0Var = this.f10064b;
        this.f10065c = QATopicPhotoAlbumFeedFrag.m7150O4(strUserId, bmb0Var.f6373b, bmb0Var.f6374c, 8, bmb0Var.f6375d);
        this.f10063a.fragmentManager().m().s(R.id.content, this.f10065c).i();
        this.f10063a.fragmentManager().e0();
        return null;
    }

    public void destroy() {
    }
}
