package p149l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicPhotoAlbumFeedFrag;

/* JADX INFO: loaded from: classes12.dex */
public class lmb0 implements s7m<bmb0> {

    /* JADX INFO: renamed from: a */
    public PutongAct f128779a;

    /* JADX INFO: renamed from: b */
    public bmb0 f128780b;

    /* JADX INFO: renamed from: c */
    public QATopicPhotoAlbumFeedFrag f128781c;

    public lmb0(PutongAct putongAct) {
        this.f128779a = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128779a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bmb0 bmb0Var) {
        this.f128780b = bmb0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f128779a.fragmentManager().m2554h0(R.id.content) != null) {
            return null;
        }
        String strUserId = FeedModule.m60221F().userId();
        bmb0 bmb0Var = this.f128780b;
        this.f128781c = QATopicPhotoAlbumFeedFrag.m65998O4(strUserId, bmb0Var.f76258b, bmb0Var.f76259c, 8, bmb0Var.f76260d);
        this.f128779a.fragmentManager().m2567m().m2811s(R.id.content, this.f128781c).mo2707i();
        this.f128779a.fragmentManager().m2545e0();
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
