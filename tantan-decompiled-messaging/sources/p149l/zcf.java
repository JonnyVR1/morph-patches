package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputPet;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zcf extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f202529u;

    /* JADX INFO: renamed from: v */
    public View f202530v;

    /* JADX INFO: renamed from: w */
    public List<ExpEditProfileUploadImageView> f202531w;

    /* JADX INFO: renamed from: x */
    public List<String> f202532x;

    /* JADX INFO: renamed from: l.zcf$a */
    public class C21657a implements ExpEditProfileUploadImageView.InterfaceC8630b {
        public C21657a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8630b
        /* JADX INFO: renamed from: a */
        public void mo50942a(String str) {
            zcf.this.f202532x.add(str);
            zcf zcfVar = zcf.this;
            zcfVar.m218020Y(zcfVar.f202532x);
            zcf.this.m51172x().m94569i2().profile.extensions.wealth.petImg = zcf.this.f202532x;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8630b
        /* JADX INFO: renamed from: b */
        public void mo50943b(String str) {
            zcf.this.f202532x.remove(str);
            zcf zcfVar = zcf.this;
            zcfVar.m218020Y(zcfVar.f202532x);
            zcf.this.m51172x().m94569i2().profile.extensions.wealth.petImg = zcf.this.f202532x;
        }
    }

    public zcf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f202531w = new ArrayList();
        this.f202532x = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m218018W(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iM208412y0 = xdl0.m208412y0() - (t100.f167268q * 2);
        int i = t100.f167259h;
        int i2 = ((iM208412y0 - (i * 2)) - (i * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m50935L(m51172x().act(), mo51160l(), new C21657a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m218019X(View view) {
        o6j0.m162859c("e_edit_profile_pet", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputPet());
    }

    /* JADX INFO: renamed from: Y */
    public final void m218020Y(List<String> list) {
        int i = 0;
        while (i < this.f202531w.size()) {
            String str = (vwb.m200296J(list) || i >= list.size()) ? null : list.get(i);
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f202531w.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m50940R(str);
            }
            i++;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: l */
    public int mo51160l() {
        return 17;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的宠物";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "pet";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        this.f202531w.add((ExpEditProfileUploadImageView) this.f202530v.findViewById(u4c0.f173926M5));
        this.f202531w.add((ExpEditProfileUploadImageView) this.f202530v.findViewById(u4c0.f173943N5));
        this.f202531w.add((ExpEditProfileUploadImageView) this.f202530v.findViewById(u4c0.f173960O5));
        vwb.m200354z(this.f202531w, new e30() { // from class: l.ycf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197437a.m218018W((ExpEditProfileUploadImageView) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: w */
    public void mo51171w(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f202531w) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m50939Q(picture);
                    return;
                }
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f202529u = expEditItemView;
        expEditItemView.m50829d("宠物信息", x2c0.f189374Gs);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f202529u);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96048v9, (ViewGroup) linearLayout, false);
        this.f202530v = viewInflate;
        linearLayout.addView(viewInflate);
        return linearLayout;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        User userM94569i2 = m51172x().m94569i2();
        String str = null;
        if (NullChecker.m81303a(userM94569i2) && NullChecker.m81303a(userM94569i2.profile) && NullChecker.m81303a(userM94569i2.profile.extensions) && NullChecker.m81303a(userM94569i2.profile.extensions.wealth)) {
            if (vwb.m200296J(userM94569i2.profile.extensions.wealth.petImg)) {
                this.f202532x = new ArrayList();
            } else {
                this.f202532x = userM94569i2.profile.extensions.wealth.petImg;
            }
            str = vwb.m200296J(userM94569i2.profile.extensions.wealth.pet) ? null : userM94569i2.profile.extensions.wealth.pet.get(0);
            if (TextUtils.equals(str, "暂不透露")) {
                str = "";
            }
        }
        m51226Q(this.f202529u, str);
        if (TextUtils.isEmpty(str) || "暂无".equals(str)) {
            xdl0.m208344M(this.f202530v, false);
        } else {
            xdl0.m208344M(this.f202530v, true);
            m218020Y(this.f202532x);
        }
        xdl0.m208329E0(this.f202529u, new View.OnClickListener() { // from class: l.xcf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192227a.m218019X(view);
            }
        });
    }
}
