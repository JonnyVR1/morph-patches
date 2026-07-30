package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.MomentMutedAct;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class xp00 extends AbstractC15610a<String> {

    /* JADX INFO: renamed from: c */
    public MomentMutedAct f195623c;

    /* JADX INFO: renamed from: d */
    public List<String> f195624d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Map<String, User> f195625e = new HashMap();

    public xp00(MomentMutedAct momentMutedAct) {
        this.f195623c = momentMutedAct;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, final String str, int i, int i2) {
        final VDraweeView vDraweeView = (VDraweeView) view.findViewById(adc0.f70070Pa);
        final TextView textView = (TextView) view.findViewById(adc0.f69983K8);
        View viewFindViewById = view.findViewById(adc0.f70424kc);
        jyb.m147537z(jyb.m147507f0(vDraweeView, textView), new y20() { // from class: l.rp00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164289a.m212498D(str, (View) obj);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.sp00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f169995a.m212499E(str, view2);
            }
        });
        mo68557c(this.f195623c, CoreModule.f18264c.f20381e0.m116483Ka(str)).subscribe(psd0.m173596G(new y20() { // from class: l.tp00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175527a.m212500F(vDraweeView, textView, str, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m212497C(String str, View view) {
        this.f195623c.startActivity(CoreModule.m30932N().argsToMomentsInProfileAct(this.f195623c, str, "from_MomentMutedAct"));
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m212498D(final String str, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.up00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f180201a.m212497C(str, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m212499E(String str, View view) {
        m212503I(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m212500F(VDraweeView vDraweeView, TextView textView, String str, User user) {
        uqb0.f180374G.m127125Q0(vDraweeView, user.m61308fp().profileSmall());
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
        if (TextUtils.isEmpty(strM116634y7)) {
            textView.setText(user.name);
        } else {
            textView.setText(strM116634y7);
        }
        this.f195625e.put(str, user);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m212501G(String str, uxj0 uxj0Var) {
        this.f195623c.progressDismiss();
        this.f195624d.remove(str);
        this.f195623c.f36671d.m111862f(this.f195624d);
        o1j0.m165643q(this.f195623c.getString(R$string.f19465mj), this.f195623c.getResources().getDrawable(dbc0.f86088Df));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m212502H(Throwable th) {
        this.f195623c.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: I */
    public final void m212503I(String str) {
        m212504J(str);
    }

    /* JADX INFO: renamed from: J */
    public final void m212504J(final String str) {
        this.f195623c.progress(R$string.f18632L5, true);
        CoreModule.m30932N().coreMomentMutedUsers().mo173496c(str, false).subscribe(psd0.m173597H(new y20() { // from class: l.vp00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185197a.m212501G(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.wp00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190231a.m212502H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m212505K(List<String> list) {
        this.f195624d = list;
        notifyDataSetChanged();
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f195623c.inflater().inflate(kec0.f125752af, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<String> mo21403p() {
        return this.f195624d;
    }
}
