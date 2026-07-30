package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r1c extends ep90 {

    /* JADX INFO: renamed from: u */
    public VText f160797u;

    /* JADX INFO: renamed from: v */
    public VImage f160798v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f160799w;

    public r1c(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m179397S(View view) {
        uyf uyfVar = new uyf(mo53983O().act());
        uyfVar.m198611C(CoreModule.f18264c.f20381e0.m116537Z7(), true, NavigationIntent.profile_edit);
        uyfVar.show();
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f160797u = (VText) view.findViewById(adc0.f70500p3);
        this.f160798v = (VImage) view.findViewById(adc0.f70091Qe);
        this.f160799w = (ProfileIntegrityOptView) view.findViewById(adc0.f70571t6);
        this.f160797u.setTypeface(Typeface.DEFAULT_BOLD);
        if (gra.m131596L3()) {
            this.f160797u.setText("我的生活照");
        }
        bnl0.m105509E0(this.f160798v, new View.OnClickListener() { // from class: l.q1c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f155168a.m179397S(view2);
            }
        });
        if (gra.m131596L3()) {
            bnl0.m105524M(this.f160798v, false);
        }
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
        return mo53983O().mo146493H2().inflate(kec0.f125507La, viewGroup, false);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        String str;
        String str2;
        boolean zM131596L3 = gra.m131596L3();
        ProfileIntegrityOptView profileIntegrityOptView = this.f160799w;
        if (!zM131596L3) {
            bnl0.m105524M(profileIntegrityOptView, false);
            return;
        }
        bnl0.m105524M(profileIntegrityOptView, true);
        List<Integer> list = xra.m212800s().weight.picture;
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().intValue() > 0) {
                i++;
            }
        }
        User userM189086i2 = mo53983O().m189086i2();
        int iIntValue = 0;
        for (int i2 = 0; i2 < Math.min(userM189086i2.pictures.size(), list.size()); i2++) {
            iIntValue += list.get(i2).intValue();
        }
        int iIntValue2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIntValue2 += list.get(i3).intValue();
        }
        if (iIntValue2 != iIntValue) {
            str = String.format("添加%s张照片", Integer.valueOf(i - userM189086i2.pictures.size()));
            str2 = xra.m212800s().weight.pictureExtendedText;
        } else {
            str = "";
            str2 = "";
        }
        this.f160799w.m54067Q(iIntValue, iIntValue2, str, str2);
    }
}
