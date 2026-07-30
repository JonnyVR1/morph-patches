package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;

/* JADX INFO: loaded from: classes4.dex */
public class cdf extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f80365u;

    /* JADX INFO: renamed from: v */
    public String f80366v;

    public cdf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f80366v = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m106219U(View view) {
        e51.m114766q(this.f80366v);
        lsi0.m151593w(R$string.f17587Ak);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m106220V(View view) {
        e51.m114766q(this.f80366v);
        lsi0.m151593w(R$string.f17587Ak);
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的账号";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        this.f80365u.m50829d("探探ID", x2c0.f189498Ks);
        this.f80365u.setRightIconRes(x2c0.f190471ps);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f80365u = expEditItemView;
        return expEditItemView;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        String str = m51172x().mo51058F1(false).publicId;
        this.f80366v = str;
        this.f80365u.m50828c(str, 2);
        this.f80365u.setOnClickListener(new View.OnClickListener() { // from class: l.adf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68931a.m106219U(view);
            }
        });
        this.f80365u.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.bdf
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f75029a.m106220V(view);
            }
        });
    }
}
