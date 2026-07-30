package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputSignature;

/* JADX INFO: loaded from: classes4.dex */
public class lcf extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public TextView f127406u;

    /* JADX INFO: renamed from: v */
    public TextView f127407v;

    public lcf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m149295T(View view) {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "self_introduction"));
        fif.m121508c(m51157i(), new ExpLoopInputSignature());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "自我介绍";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "intro";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96092y2, (ViewGroup) null);
        this.f127406u = (TextView) viewInflate.findViewById(u4c0.f173973P1);
        this.f127407v = (TextView) viewInflate.findViewById(u4c0.f174473t);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        String str = m51172x().m94569i2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f127406u;
        if (zIsEmpty) {
            xdl0.m208344M(textView, false);
            this.f127407v.setText("添加自我介绍");
        } else {
            xdl0.m208344M(textView, true);
            this.f127407v.setText("编辑自我介绍");
        }
        this.f127406u.setText(str);
        m51144A().setOnClickListener(new View.OnClickListener() { // from class: l.kcf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122327a.m149295T(view);
            }
        });
    }
}
