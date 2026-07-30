package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.data.User;
import java.util.Map;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jle extends ah90 {

    /* JADX INFO: renamed from: u */
    public yf90 f118535u;

    /* JADX INFO: renamed from: v */
    public Map<String, String> f118536v;

    public jle(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f118535u = new yf90();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m142069T() {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.BIRTHDAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m142070U() {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.NICKNAME);
    }

    /* JADX INFO: renamed from: V */
    public final void m142071V(User user) {
        this.f118535u.f198015f.setText(user.name);
        this.f118535u.f198020k.setText(this.f118536v.get(user.gender.toString()));
        this.f118535u.f198018i.setText(mqi0.f135250b.format(user.settings.birthdate));
        boolean zIsFemale = user.isFemale();
        yf90 yf90Var = this.f118535u;
        if (zIsFemale) {
            yf90Var.f198021l.setImageResource(x2c0.f190305km);
        } else {
            yf90Var.f198021l.setImageResource(x2c0.f190337lm);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        VText vText = this.f118535u.f198011b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f118535u.f198013d.setTypeface(typeface);
        this.f118535u.f198016g.setTypeface(typeface);
        this.f118535u.f198019j.setTypeface(typeface);
        this.f118535u.f198018i.setTypeface(typeface);
        this.f118535u.f198020k.setTypeface(typeface);
        this.f118535u.f198015f.setTypeface(typeface);
        m96418N(this.f118535u.f198018i, new d30() { // from class: l.hle
            @Override // p149l.d30
            public final void call() {
                this.f108340a.m142069T();
            }
        }, true);
        m96418N(this.f118535u.f198012c, new d30() { // from class: l.ile
            @Override // p149l.d30
            public final void call() {
                this.f113819a.m142070U();
            }
        }, true);
        e01 e01Var = new e01();
        this.f118536v = e01Var;
        e01Var.put("male", mo52800O().act().getResources().getString(R$string.f17711Eo));
        this.f118536v.put("female", mo52800O().act().getResources().getString(R$string.f17681Do));
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
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return this.f118535u.m214492a(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m142071V(mo52800O().m94569i2());
    }
}
