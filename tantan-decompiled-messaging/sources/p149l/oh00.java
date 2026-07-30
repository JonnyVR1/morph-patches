package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.MomentMutedAct;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class oh00 extends AbstractC15503a<String> {

    /* JADX INFO: renamed from: c */
    public MomentMutedAct f143938c;

    /* JADX INFO: renamed from: d */
    public List<String> f143939d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public Map<String, User> f143940e = new HashMap();

    public oh00(MomentMutedAct momentMutedAct) {
        this.f143938c = momentMutedAct;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, final String str, int i, int i2) {
        final VDraweeView vDraweeView = (VDraweeView) view.findViewById(u4c0.f173948Na);
        final TextView textView = (TextView) view.findViewById(u4c0.f173861I8);
        View viewFindViewById = view.findViewById(u4c0.f174300ic);
        vwb.m200354z(vwb.m200324f0(vDraweeView, textView), new e30() { // from class: l.ih00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113197a.m164317D(str, (View) obj);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.jh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f117864a.m164318E(str, view2);
            }
        });
        mo67374c(this.f143938c, CoreModule.f17545c.f19639e0.m169410Ka(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.kh00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123109a.m164319F(vDraweeView, textView, str, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m164316C(String str, View view) {
        this.f143938c.startActivity(CoreModule.m29934N().argsToMomentsInProfileAct(this.f143938c, str, "from_MomentMutedAct"));
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m164317D(final String str, View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.lh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f128028a.m164316C(str, view2);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m164318E(String str, View view) {
        m164322I(str);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m164319F(VDraweeView vDraweeView, TextView textView, String str, User user) {
        qib0.f154691G.m102341Q0(vDraweeView, user.m60124fp().profileSmall());
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
        if (TextUtils.isEmpty(strM169561y7)) {
            textView.setText(user.name);
        } else {
            textView.setText(strM169561y7);
        }
        this.f143940e.put(str, user);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m164320G(String str, roj0 roj0Var) {
        this.f143938c.progressDismiss();
        this.f143939d.remove(str);
        this.f143938c.f35823d.m188841f(this.f143939d);
        lsi0.m151587q(this.f143938c.getString(R$string.f18065Qi), this.f143938c.getResources().getDrawable(x2c0.f189608Oe));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m164321H(Throwable th) {
        this.f143938c.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: I */
    public final void m164322I(String str) {
        m164323J(str);
    }

    /* JADX INFO: renamed from: J */
    public final void m164323J(final String str) {
        this.f143938c.progress(R$string.f17842J5, true);
        CoreModule.m29934N().coreMomentMutedUsers().mo106875c(str, false).subscribe(mkd0.m154956H(new e30() { // from class: l.mh00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133764a.m164320G(str, (roj0) obj);
            }
        }, new e30() { // from class: l.nh00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138941a.m164321H((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public void m164324K(List<String> list) {
        this.f143939d = list;
        notifyDataSetChanged();
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f143938c.inflater().inflate(f6c0.f95585Te, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<String> mo20404p() {
        return this.f143939d;
    }
}
