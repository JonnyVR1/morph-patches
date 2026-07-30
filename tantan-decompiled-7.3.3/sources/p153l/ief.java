package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;

/* JADX INFO: loaded from: classes4.dex */
public class ief extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f114574u;

    /* JADX INFO: renamed from: v */
    public String f114575v;

    public ief(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f114575v = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m139600U(View view) {
        l51.m152911q(this.f114575v);
        o1j0.m165649w(R$string.f18977Wk);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m139601V(View view) {
        l51.m152911q(this.f114575v);
        o1j0.m165649w(R$string.f18977Wk);
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的账号";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        this.f114574u.m52012d("探探ID", dbc0.f87655zt);
        this.f114574u.setRightIconRes(dbc0.f86936dt);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f114574u = expEditItemView;
        return expEditItemView;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        String str = m52355x().mo52241F1(false).publicId;
        this.f114575v = str;
        this.f114574u.m52011c(str, 2);
        this.f114574u.setOnClickListener(new View.OnClickListener() { // from class: l.gef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103821a.m139600U(view);
            }
        });
        this.f114574u.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hef
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f109147a.m139601V(view);
            }
        });
    }
}
