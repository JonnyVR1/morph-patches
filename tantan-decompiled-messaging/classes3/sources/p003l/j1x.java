package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryPreviewProfileFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.f5m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class j1x extends eww<i1x> implements uvl {

    /* JADX INFO: renamed from: b */
    public MarryPreviewProfileFrag f4551b;

    /* JADX INFO: renamed from: c */
    public f5m f4552c;

    public j1x(MarryPreviewProfileFrag marryPreviewProfileFrag) {
        this.f4551b = marryPreviewProfileFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5298C0() {
        return this.f4551b.act();
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: d */
    public void mo494d(User user) {
        this.f4552c.a(user);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f3407a = true;
        FrameLayout frameLayout = new FrameLayout(act());
        this.f4552c = CoreModule.P().a().Mj(frameLayout, "preview", (RecyclerView.t) null);
        return frameLayout;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m5300i1(i1x i1xVar) {
    }
}
