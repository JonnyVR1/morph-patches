package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCards;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fle extends ah90 {

    /* JADX INFO: renamed from: u */
    public AvatarCards f98153u;

    public fle(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: S */
    public View m121968S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gle.m126749b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public List<Media> m121969T() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f98153u)) {
            for (int i = 0; i < this.f98153u.getChildCount(); i++) {
                if (this.f98153u.m50811h(i).m51777m0()) {
                    arrayList.add(this.f98153u.m50811h(i).getMedia());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U */
    public boolean m121970U() {
        if (NullChecker.m81303a(this.f98153u)) {
            for (int i = 0; i < this.f98153u.getChildCount(); i++) {
                if (this.f98153u.m50811h(i).m51777m0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m121971V() {
        mo52800O().mo51092Z2();
        mo52800O().mo51067J3();
    }

    /* JADX INFO: renamed from: W */
    public void m121972W(List<Media> list, boolean z) {
        this.f98153u.setMedia(list);
        this.f98153u.m50811h(0).setIllegalVisible(z);
    }

    @Override // p149l.hn2
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        view.setElevation(10.0f);
        mo52800O().mo51089Y0().setClipChildren(false);
        view.setOutlineProvider(null);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM121968S = m121968S(mo52800O().mo94568H2(), viewGroup);
        this.f98153u.setViewCount(sk1.m184570b());
        this.f98153u.setConfig(new ubf());
        this.f98153u.setMedia(mo52800O().m94569i2().pictures);
        this.f98153u.setOnMediaChanged(new Runnable() { // from class: l.ele
            @Override // java.lang.Runnable
            public final void run() {
                this.f92094a.m121971V();
            }
        });
        return viewM121968S;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
    }
}
