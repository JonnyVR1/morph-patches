package p002l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.AvatarCards;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.gle;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fle extends ah90 {

    /* JADX INFO: renamed from: u */
    public AvatarCards f10457u;

    public fle(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: S */
    public View m13291S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gle.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public List<Media> m13292T() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(this.f10457u)) {
            for (int i = 0; i < this.f10457u.getChildCount(); i++) {
                if (this.f10457u.m1257h(i).m2305m0()) {
                    arrayList.add(this.f10457u.m1257h(i).getMedia());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U */
    public boolean m13293U() {
        if (NullChecker.a(this.f10457u)) {
            for (int i = 0; i < this.f10457u.getChildCount(); i++) {
                if (this.f10457u.m1257h(i).m2305m0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m13294V() {
        mo3351O().mo1540Z2();
        mo3351O().mo1515J3();
    }

    /* JADX INFO: renamed from: W */
    public void m13295W(List<Media> list, boolean z) {
        this.f10457u.setMedia(list);
        this.f10457u.m1257h(0).setIllegalVisible(z);
    }

    @Override // p002l.hn2
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        view.setElevation(10.0f);
        mo3351O().mo1537Y0().setClipChildren(false);
        view.setOutlineProvider(null);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewM13291S = m13291S(mo3351O().mo9267H2(), viewGroup);
        this.f10457u.setViewCount(sk1.m22498b());
        this.f10457u.setConfig(new ubf());
        this.f10457u.setMedia(mo3351O().m9268i2().pictures);
        this.f10457u.setOnMediaChanged(new Runnable() { // from class: l.ele
            @Override // java.lang.Runnable
            public final void run() {
                this.f9856a.m13294V();
            }
        });
        return viewM13291S;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }
}
