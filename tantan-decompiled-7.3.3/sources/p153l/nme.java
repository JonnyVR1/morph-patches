package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.data.User;
import java.util.Map;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nme extends ep90 {

    /* JADX INFO: renamed from: u */
    public co90 f142697u;

    /* JADX INFO: renamed from: v */
    public Map<String, String> f142698v;

    public nme(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f142697u = new co90();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m163813T() {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.BIRTHDAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m163814U() {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.NICKNAME);
    }

    /* JADX INFO: renamed from: V */
    public final void m163815V(User user) {
        this.f142697u.f82828f.setText(user.name);
        this.f142697u.f82833k.setText(this.f142698v.get(user.gender.toString()));
        this.f142697u.f82831i.setText(pzi0.f154855b.format(user.settings.birthdate));
        boolean zIsFemale = user.isFemale();
        co90 co90Var = this.f142697u;
        if (zIsFemale) {
            co90Var.f82834l.setImageResource(dbc0.f86767Ym);
        } else {
            co90Var.f82834l.setImageResource(dbc0.f86799Zm);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        VText vText = this.f142697u.f82824b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f142697u.f82826d.setTypeface(typeface);
        this.f142697u.f82829g.setTypeface(typeface);
        this.f142697u.f82832j.setTypeface(typeface);
        this.f142697u.f82831i.setTypeface(typeface);
        this.f142697u.f82833k.setTypeface(typeface);
        this.f142697u.f82828f.setTypeface(typeface);
        m121843N(this.f142697u.f82831i, new x20() { // from class: l.lme
            @Override // p153l.x20
            public final void call() {
                this.f132675a.m163813T();
            }
        }, true);
        m121843N(this.f142697u.f82825c, new x20() { // from class: l.mme
            @Override // p153l.x20
            public final void call() {
                this.f137561a.m163814U();
            }
        }, true);
        l01 l01Var = new l01();
        this.f142698v = l01Var;
        l01Var.put("male", mo53983O().act().getResources().getString(R$string.f19102ap));
        this.f142698v.put("female", mo53983O().act().getResources().getString(R$string.f19071Zo));
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
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return this.f142697u.m111573a(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m163815V(mo53983O().m189086i2());
    }
}
