package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.User;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class e0c extends ah90 {

    /* JADX INFO: renamed from: u */
    public VText f88556u;

    /* JADX INFO: renamed from: v */
    public VImage f88557v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f88558w;

    public e0c(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m114175S(View view) {
        gxf gxfVar = new gxf(mo52800O().act());
        gxfVar.m128575C(CoreModule.f17545c.f19639e0.m169464Z7(), true, NavigationIntent.profile_edit);
        gxfVar.show();
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f88556u = (VText) view.findViewById(u4c0.f174375n3);
        this.f88557v = (VImage) view.findViewById(u4c0.f173952Ne);
        this.f88558w = (ProfileIntegrityOptView) view.findViewById(u4c0.f174446r6);
        this.f88556u.setTypeface(Typeface.DEFAULT_BOLD);
        if (upa.m194665L3()) {
            this.f88556u.setText("我的生活照");
        }
        xdl0.m208329E0(this.f88557v, new View.OnClickListener() { // from class: l.d0c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f83174a.m114175S(view2);
            }
        });
        if (upa.m194665L3()) {
            xdl0.m208344M(this.f88557v, false);
        }
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
        return mo52800O().mo94568H2().inflate(f6c0.f95341Ea, viewGroup, false);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        String str;
        String str2;
        boolean zM194665L3 = upa.m194665L3();
        ProfileIntegrityOptView profileIntegrityOptView = this.f88558w;
        if (!zM194665L3) {
            xdl0.m208344M(profileIntegrityOptView, false);
            return;
        }
        xdl0.m208344M(profileIntegrityOptView, true);
        List<Integer> list = lqa.m150981s().weight.picture;
        Iterator<Integer> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().intValue() > 0) {
                i++;
            }
        }
        User userM94569i2 = mo52800O().m94569i2();
        int iIntValue = 0;
        for (int i2 = 0; i2 < Math.min(userM94569i2.pictures.size(), list.size()); i2++) {
            iIntValue += list.get(i2).intValue();
        }
        int iIntValue2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iIntValue2 += list.get(i3).intValue();
        }
        if (iIntValue2 != iIntValue) {
            str = String.format("添加%s张照片", Integer.valueOf(i - userM94569i2.pictures.size()));
            str2 = lqa.m150981s().weight.pictureExtendedText;
        } else {
            str = "";
            str2 = "";
        }
        this.f88558w.m52884Q(iIntValue, iIntValue2, str, str2);
    }
}
