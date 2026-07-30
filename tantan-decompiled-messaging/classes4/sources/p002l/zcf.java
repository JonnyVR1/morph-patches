package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputPet;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.f6c0;
import l.mcr;
import l.o6j0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zcf extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f23339u;

    /* JADX INFO: renamed from: v */
    public View f23340v;

    /* JADX INFO: renamed from: w */
    public List<ExpEditProfileUploadImageView> f23341w;

    /* JADX INFO: renamed from: x */
    public List<String> f23342x;

    /* JADX INFO: renamed from: l.zcf$a */
    public class C0939a implements ExpEditProfileUploadImageView.InterfaceC0055b {
        public C0939a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC0055b
        /* JADX INFO: renamed from: a */
        public void mo1390a(String str) {
            zcf.this.f23342x.add(str);
            zcf zcfVar = zcf.this;
            zcfVar.m27164Y(zcfVar.f23342x);
            zcf.this.m1624x().m9268i2().profile.extensions.wealth.petImg = zcf.this.f23342x;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC0055b
        /* JADX INFO: renamed from: b */
        public void mo1391b(String str) {
            zcf.this.f23342x.remove(str);
            zcf zcfVar = zcf.this;
            zcfVar.m27164Y(zcfVar.f23342x);
            zcf.this.m1624x().m9268i2().profile.extensions.wealth.petImg = zcf.this.f23342x;
        }
    }

    public zcf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f23341w = new ArrayList();
        this.f23342x = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m27162W(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iY0 = xdl0.y0() - (t100.q * 2);
        int i = t100.h;
        int i2 = ((iY0 - (i * 2)) - (i * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m1381L(m1624x().act(), mo1612l(), new C0939a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m27163X(View view) {
        o6j0.c("e_edit_profile_pet", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputPet());
    }

    /* JADX INFO: renamed from: Y */
    public final void m27164Y(List<String> list) {
        int i = 0;
        while (i < this.f23341w.size()) {
            String str = (vwb.J(list) || i >= list.size()) ? null : list.get(i);
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f23341w.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m1386R(str);
            }
            i++;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: l */
    public int mo1612l() {
        return 17;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的宠物";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "pet";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        this.f23341w.add((ExpEditProfileUploadImageView) this.f23340v.findViewById(u4c0.M5));
        this.f23341w.add((ExpEditProfileUploadImageView) this.f23340v.findViewById(u4c0.N5));
        this.f23341w.add((ExpEditProfileUploadImageView) this.f23340v.findViewById(u4c0.O5));
        vwb.z(this.f23341w, new e30() { // from class: l.ycf
            public final void call(Object obj) {
                this.f22801a.m27162W((ExpEditProfileUploadImageView) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: w */
    public void mo1623w(List<Media> list) {
        Picture picture = (Media) list.get(0);
        if (picture instanceof Picture) {
            Picture picture2 = picture;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f23341w) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m1385Q(picture2);
                    return;
                }
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f23339u = expEditItemView;
        expEditItemView.m1275d("宠物信息", x2c0.Gs);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f23339u);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.v9, (ViewGroup) linearLayout, false);
        this.f23340v = viewInflate;
        linearLayout.addView(viewInflate);
        return linearLayout;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        User userM9268i2 = m1624x().m9268i2();
        String str = null;
        if (NullChecker.a(userM9268i2) && NullChecker.a(userM9268i2.profile) && NullChecker.a(userM9268i2.profile.extensions) && NullChecker.a(userM9268i2.profile.extensions.wealth)) {
            if (vwb.J(userM9268i2.profile.extensions.wealth.petImg)) {
                this.f23342x = new ArrayList();
            } else {
                this.f23342x = userM9268i2.profile.extensions.wealth.petImg;
            }
            str = vwb.J(userM9268i2.profile.extensions.wealth.pet) ? null : (String) userM9268i2.profile.extensions.wealth.pet.get(0);
            if (TextUtils.equals(str, "暂不透露")) {
                str = "";
            }
        }
        m1681Q(this.f23339u, str);
        if (TextUtils.isEmpty(str) || "暂无".equals(str)) {
            xdl0.M(this.f23340v, false);
        } else {
            xdl0.M(this.f23340v, true);
            m27164Y(this.f23342x);
        }
        xdl0.E0(this.f23339u, new View.OnClickListener() { // from class: l.xcf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22216a.m27163X(view);
            }
        });
    }
}
