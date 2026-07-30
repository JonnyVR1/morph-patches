package p007l;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personalfeed.PersonalPhotoAlbumFeedFrag;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class b870 implements s7m<f770> {

    /* JADX INFO: renamed from: a */
    public PutongAct f6169a;

    /* JADX INFO: renamed from: b */
    public f770 f6170b;

    /* JADX INFO: renamed from: c */
    public PutongFrag f6171c;

    public b870(PutongAct putongAct) {
        this.f6169a = putongAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8742C0() {
        return this.f6169a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m8744i1(f770 f770Var) {
        this.f6170b = f770Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.f6169a.fragmentManager().h0(R.id.content) != null) {
            return null;
        }
        f770 f770Var = this.f6170b;
        String str = f770Var.f8004b;
        String str2 = f770Var.f8005c;
        int i = f770Var.f8006d;
        String str3 = NullChecker.a(f770Var.f8007e) ? this.f6170b.f8007e : User.ID_TEAM_ACCOUNT;
        f770 f770Var2 = this.f6170b;
        this.f6171c = PersonalPhotoAlbumFeedFrag.m5498M4(str, str2, i, str3, f770Var2.f8008f, f770Var2.f8010h);
        this.f6169a.fragmentManager().m().s(R.id.content, this.f6171c).i();
        this.f6169a.fragmentManager().e0();
        return null;
    }

    public void destroy() {
    }
}
