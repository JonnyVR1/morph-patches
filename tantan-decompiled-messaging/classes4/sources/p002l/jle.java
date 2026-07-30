package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import java.util.Map;
import l.d30;
import l.e01;
import l.mcr;
import l.mqi0;
import l.x2c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jle extends ah90 {

    /* JADX INFO: renamed from: u */
    public yf90 f13864u;

    /* JADX INFO: renamed from: v */
    public Map<String, String> f13865v;

    public jle(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f13864u = new yf90();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m16036T() {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.BIRTHDAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m16037U() {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.NICKNAME);
    }

    /* JADX INFO: renamed from: V */
    public final void m16038V(User user) {
        this.f13864u.f22834f.setText(user.name);
        this.f13864u.f22839k.setText(this.f13865v.get(user.gender.toString()));
        this.f13864u.f22837i.setText(mqi0.b.format(user.settings.birthdate));
        boolean zIsFemale = user.isFemale();
        yf90 yf90Var = this.f13864u;
        if (zIsFemale) {
            yf90Var.f22840l.setImageResource(x2c0.km);
        } else {
            yf90Var.f22840l.setImageResource(x2c0.lm);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        VText vText = this.f13864u.f22830b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f13864u.f22832d.setTypeface(typeface);
        this.f13864u.f22835g.setTypeface(typeface);
        this.f13864u.f22838j.setTypeface(typeface);
        this.f13864u.f22837i.setTypeface(typeface);
        this.f13864u.f22839k.setTypeface(typeface);
        this.f13864u.f22834f.setTypeface(typeface);
        m9649N(this.f13864u.f22837i, new d30() { // from class: l.hle
            public final void call() {
                this.f12105a.m16036T();
            }
        }, true);
        m9649N(this.f13864u.f22831c, new d30() { // from class: l.ile
            public final void call() {
                this.f13297a.m16037U();
            }
        }, true);
        e01 e01Var = new e01();
        this.f13865v = e01Var;
        e01Var.put("male", mo3351O().act().getResources().getString(R.string.Eo));
        this.f13865v.put("female", mo3351O().act().getResources().getString(R.string.Do));
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
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return this.f13864u.m26675a(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m16038V(mo3351O().m9268i2());
    }
}
