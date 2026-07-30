package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputSignature;
import l.f6c0;
import l.mcr;
import l.o6j0;
import l.u4c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lcf extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public TextView f14764u;

    /* JADX INFO: renamed from: v */
    public TextView f14765v;

    public lcf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m17132T(View view) {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "self_introduction")});
        fif.m13250c(m1609i(), new ExpLoopInputSignature());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "自我介绍";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "intro";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.y2, (ViewGroup) null);
        this.f14764u = (TextView) viewInflate.findViewById(u4c0.P1);
        this.f14765v = (TextView) viewInflate.findViewById(u4c0.t);
        return viewInflate;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        String str = m1624x().m9268i2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f14764u;
        if (zIsEmpty) {
            xdl0.M(textView, false);
            this.f14765v.setText("添加自我介绍");
        } else {
            xdl0.M(textView, true);
            this.f14765v.setText("编辑自我介绍");
        }
        this.f14764u.setText(str);
        m1596A().setOnClickListener(new View.OnClickListener() { // from class: l.kcf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14279a.m17132T(view);
            }
        });
    }
}
