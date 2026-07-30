package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p1.mobile.putong.core.R;
import l.e51;
import l.lsi0;
import l.mcr;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cdf extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f8599u;

    /* JADX INFO: renamed from: v */
    public String f8600v;

    public cdf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f8600v = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m10937U(View view) {
        e51.q(this.f8600v);
        lsi0.w(R.string.Ak);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m10938V(View view) {
        e51.q(this.f8600v);
        lsi0.w(R.string.Ak);
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的账号";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        this.f8599u.m1275d("探探ID", x2c0.Ks);
        this.f8599u.setRightIconRes(x2c0.ps);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f8599u = expEditItemView;
        return expEditItemView;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        String str = m1624x().mo1506F1(false).publicId;
        this.f8600v = str;
        this.f8599u.m1274c(str, 2);
        this.f8599u.setOnClickListener(new View.OnClickListener() { // from class: l.adf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7510a.m10937U(view);
            }
        });
        this.f8599u.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.bdf
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f8077a.m10938V(view);
            }
        });
    }
}
