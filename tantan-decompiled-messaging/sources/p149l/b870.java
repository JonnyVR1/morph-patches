package p149l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class b870 implements s7m<f770> {

    /* JADX INFO: renamed from: a */
    public PutongAct f74070a;

    /* JADX INFO: renamed from: b */
    public f770 f74071b;

    /* JADX INFO: renamed from: c */
    public PutongFrag f74072c;

    public b870(PutongAct putongAct) {
        this.f74070a = putongAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f74070a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(f770 f770Var) {
        this.f74071b = f770Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f74070a.fragmentManager().m2554h0(R.id.content) != null) {
            return null;
        }
        f770 f770Var = this.f74071b;
        String str = f770Var.f96213b;
        String str2 = f770Var.f96214c;
        int i = f770Var.f96215d;
        String str3 = NullChecker.m81303a(f770Var.f96216e) ? this.f74071b.f96216e : User.ID_TEAM_ACCOUNT;
        f770 f770Var2 = this.f74071b;
        this.f74072c = PersonalPhotoAlbumFeedFrag.m64418M4(str, str2, i, str3, f770Var2.f96217f, f770Var2.f96219h);
        this.f74070a.fragmentManager().m2567m().m2811s(R.id.content, this.f74072c).mo2707i();
        this.f74070a.fragmentManager().m2545e0();
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
