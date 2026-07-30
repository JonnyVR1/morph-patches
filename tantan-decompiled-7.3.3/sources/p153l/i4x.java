package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryPreviewProfileFrag;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public class i4x extends dzw<h4x> implements myl {

    /* JADX INFO: renamed from: b */
    public MarryPreviewProfileFrag f112952b;

    /* JADX INFO: renamed from: c */
    public v7m f112953c;

    public i4x(MarryPreviewProfileFrag marryPreviewProfileFrag) {
        this.f112952b = marryPreviewProfileFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112952b.act();
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: d */
    public void mo48632d(User user) {
        this.f112953c.mo39760a(user);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f91387a = true;
        FrameLayout frameLayout = new FrameLayout(act());
        this.f112953c = CoreModule.m30933P().m143405a().mo34373Mj(frameLayout, "preview", null);
        return frameLayout;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(h4x h4xVar) {
    }
}
