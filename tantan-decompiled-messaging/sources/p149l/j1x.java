package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryPreviewProfileFrag;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes3.dex */
public class j1x extends eww<i1x> implements uvl {

    /* JADX INFO: renamed from: b */
    public MarryPreviewProfileFrag f115850b;

    /* JADX INFO: renamed from: c */
    public f5m f115851c;

    public j1x(MarryPreviewProfileFrag marryPreviewProfileFrag) {
        this.f115850b = marryPreviewProfileFrag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f115850b.act();
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: d */
    public void mo47449d(User user) {
        this.f115851c.mo38757a(user);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f93544a = true;
        FrameLayout frameLayout = new FrameLayout(act());
        this.f115851c = CoreModule.m29935P().m94651a().mo33370Mj(frameLayout, "preview", null);
        return frameLayout;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i1x i1xVar) {
    }
}
