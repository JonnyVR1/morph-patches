package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCards;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jme extends ep90 {

    /* JADX INFO: renamed from: u */
    public AvatarCards f121666u;

    public jme(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: S */
    public View m146153S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kme.m150432b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public List<Media> m146154T() {
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f121666u)) {
            for (int i = 0; i < this.f121666u.getChildCount(); i++) {
                if (this.f121666u.m51994h(i).m52960m0()) {
                    arrayList.add(this.f121666u.m51994h(i).getMedia());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U */
    public boolean m146155U() {
        if (NullChecker.m82486a(this.f121666u)) {
            for (int i = 0; i < this.f121666u.getChildCount(); i++) {
                if (this.f121666u.m51994h(i).m52960m0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m146156V() {
        mo53983O().mo52275Z2();
        mo53983O().mo52250J3();
    }

    /* JADX INFO: renamed from: W */
    public void m146157W(List<Media> list, boolean z) {
        this.f121666u.setMedia(list);
        this.f121666u.m51994h(0).setIllegalVisible(z);
    }

    @Override // p153l.on2
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        view.setElevation(10.0f);
        mo53983O().mo52272Y0().setClipChildren(false);
        view.setOutlineProvider(null);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM146153S = m146153S(mo53983O().mo146493H2(), viewGroup);
        this.f121666u.setViewCount(zk1.m219993b());
        this.f121666u.setConfig(new adf());
        this.f121666u.setMedia(mo53983O().m189086i2().pictures);
        this.f121666u.setOnMediaChanged(new Runnable() { // from class: l.ime
            @Override // java.lang.Runnable
            public final void run() {
                this.f115771a.m146156V();
            }
        });
        return viewM146153S;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
    }
}
