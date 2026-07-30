package p153l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class hg70 implements iam<lf70> {

    /* JADX INFO: renamed from: a */
    public PutongAct f109374a;

    /* JADX INFO: renamed from: b */
    public lf70 f109375b;

    /* JADX INFO: renamed from: c */
    public PutongFrag f109376c;

    public hg70(PutongAct putongAct) {
        this.f109374a = putongAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f109374a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lf70 lf70Var) {
        this.f109375b = lf70Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f109374a.fragmentManager().m2555h0(R.id.content) != null) {
            return null;
        }
        lf70 lf70Var = this.f109375b;
        String str = lf70Var.f131822b;
        String str2 = lf70Var.f131823c;
        int i = lf70Var.f131824d;
        String str3 = NullChecker.m82486a(lf70Var.f131825e) ? this.f109375b.f131825e : User.ID_TEAM_ACCOUNT;
        lf70 lf70Var2 = this.f109375b;
        this.f109376c = PersonalPhotoAlbumFeedFrag.m65601M4(str, str2, i, str3, lf70Var2.f131826f, lf70Var2.f131828h);
        this.f109374a.fragmentManager().m2568m().m2812s(R.id.content, this.f109376c).mo2708i();
        this.f109374a.fragmentManager().m2546e0();
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
