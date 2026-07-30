package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import l.f6c0;
import l.gxf;
import l.lqa;
import l.mcr;
import l.u4c0;
import l.upa;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e0c extends ah90 {

    /* JADX INFO: renamed from: u */
    public VText f9502u;

    /* JADX INFO: renamed from: v */
    public VImage f9503v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f9504w;

    public e0c(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m12097S(View view) {
        gxf gxfVar = new gxf(mo3351O().act());
        gxfVar.C(CoreModule.c.e0.Z7(), true, "profile_edit");
        gxfVar.show();
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f9502u = view.findViewById(u4c0.n3);
        this.f9503v = view.findViewById(u4c0.Ne);
        this.f9504w = (ProfileIntegrityOptView) view.findViewById(u4c0.r6);
        this.f9502u.setTypeface(Typeface.DEFAULT_BOLD);
        if (upa.L3()) {
            this.f9502u.setText("我的生活照");
        }
        xdl0.E0(this.f9503v, new View.OnClickListener() { // from class: l.d0c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9009a.m12097S(view2);
            }
        });
        if (upa.L3()) {
            xdl0.M(this.f9503v, false);
        }
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
        return mo3351O().mo9267H2().inflate(f6c0.Ea, viewGroup, false);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        String str;
        String str2;
        boolean zL3 = upa.L3();
        VLinear vLinear = this.f9504w;
        if (!zL3) {
            xdl0.M(vLinear, false);
            return;
        }
        xdl0.M(vLinear, true);
        List list = lqa.s().weight.picture;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Integer) it.next()).intValue() > 0) {
                i++;
            }
        }
        User userM9268i2 = mo3351O().m9268i2();
        int iIntValue = 0;
        for (int i2 = 0; i2 < Math.min(userM9268i2.pictures.size(), list.size()); i2++) {
            iIntValue += ((Integer) list.get(i2)).intValue();
        }
        int iIntValue2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIntValue2 += ((Integer) list.get(i3)).intValue();
        }
        if (iIntValue2 != iIntValue) {
            str = String.format("添加%s张照片", Integer.valueOf(i - userM9268i2.pictures.size()));
            str2 = lqa.s().weight.pictureExtendedText;
        } else {
            str = "";
            str2 = "";
        }
        this.f9504w.m3437Q(iIntValue, iIntValue2, str, str2);
    }
}
