package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputSignature;

/* JADX INFO: loaded from: classes4.dex */
public class rdf extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public TextView f162303u;

    /* JADX INFO: renamed from: v */
    public TextView f162304v;

    public rdf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m180848T(View view) {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "self_introduction"));
        ljf.m154506c(m52340i(), new ExpLoopInputSignature());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "自我介绍";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "intro";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126146y2, (ViewGroup) null);
        this.f162303u = (TextView) viewInflate.findViewById(adc0.f70061P1);
        this.f162304v = (TextView) viewInflate.findViewById(adc0.f70564t);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        String str = m52355x().m189086i2().description;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f162303u;
        if (zIsEmpty) {
            bnl0.m105524M(textView, false);
            this.f162304v.setText("添加自我介绍");
        } else {
            bnl0.m105524M(textView, true);
            this.f162304v.setText("编辑自我介绍");
        }
        this.f162303u.setText(str);
        m52327A().setOnClickListener(new View.OnClickListener() { // from class: l.qdf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156719a.m180848T(view);
            }
        });
    }
}
