package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputPet;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fef extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f98658u;

    /* JADX INFO: renamed from: v */
    public View f98659v;

    /* JADX INFO: renamed from: w */
    public List<ExpEditProfileUploadImageView> f98660w;

    /* JADX INFO: renamed from: x */
    public List<String> f98661x;

    /* JADX INFO: renamed from: l.fef$a */
    public class C16963a implements ExpEditProfileUploadImageView.InterfaceC8793b {
        public C16963a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8793b
        /* JADX INFO: renamed from: a */
        public void mo52125a(String str) {
            fef.this.f98661x.add(str);
            fef fefVar = fef.this;
            fefVar.m125307Y(fefVar.f98661x);
            fef.this.m52355x().m189086i2().profile.extensions.wealth.petImg = fef.this.f98661x;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8793b
        /* JADX INFO: renamed from: b */
        public void mo52126b(String str) {
            fef.this.f98661x.remove(str);
            fef fefVar = fef.this;
            fefVar.m125307Y(fefVar.f98661x);
            fef.this.m52355x().m189086i2().profile.extensions.wealth.petImg = fef.this.f98661x;
        }
    }

    public fef(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f98660w = new ArrayList();
        this.f98661x = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m125305W(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iM105592y0 = bnl0.m105592y0() - (qa00.f156330q * 2);
        int i = qa00.f156321h;
        int i2 = ((iM105592y0 - (i * 2)) - (i * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m52118L(m52355x().act(), mo52343l(), new C16963a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m125306X(View view) {
        sfj0.m185596c("e_edit_profile_pet", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputPet());
    }

    /* JADX INFO: renamed from: Y */
    public final void m125307Y(List<String> list) {
        int i = 0;
        while (i < this.f98660w.size()) {
            String str = (jyb.m147479J(list) || i >= list.size()) ? null : list.get(i);
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f98660w.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m52123R(str);
            }
            i++;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: l */
    public int mo52343l() {
        return 17;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的宠物";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "pet";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        this.f98660w.add((ExpEditProfileUploadImageView) this.f98659v.findViewById(adc0.f70048O5));
        this.f98660w.add((ExpEditProfileUploadImageView) this.f98659v.findViewById(adc0.f70065P5));
        this.f98660w.add((ExpEditProfileUploadImageView) this.f98659v.findViewById(adc0.f70082Q5));
        jyb.m147537z(this.f98660w, new y20() { // from class: l.eef
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93641a.m125305W((ExpEditProfileUploadImageView) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: w */
    public void mo52354w(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f98660w) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m52122Q(picture);
                    return;
                }
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f98658u = expEditItemView;
        expEditItemView.m52012d("宠物信息", dbc0.f87527vt);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f98658u);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125359C9, (ViewGroup) linearLayout, false);
        this.f98659v = viewInflate;
        linearLayout.addView(viewInflate);
        return linearLayout;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        User userM189086i2 = m52355x().m189086i2();
        String str = null;
        if (NullChecker.m82486a(userM189086i2) && NullChecker.m82486a(userM189086i2.profile) && NullChecker.m82486a(userM189086i2.profile.extensions) && NullChecker.m82486a(userM189086i2.profile.extensions.wealth)) {
            if (jyb.m147479J(userM189086i2.profile.extensions.wealth.petImg)) {
                this.f98661x = new ArrayList();
            } else {
                this.f98661x = userM189086i2.profile.extensions.wealth.petImg;
            }
            str = jyb.m147479J(userM189086i2.profile.extensions.wealth.pet) ? null : userM189086i2.profile.extensions.wealth.pet.get(0);
            if (TextUtils.equals(str, "暂不透露")) {
                str = "";
            }
        }
        m52409Q(this.f98658u, str);
        if (TextUtils.isEmpty(str) || "暂无".equals(str)) {
            bnl0.m105524M(this.f98659v, false);
        } else {
            bnl0.m105524M(this.f98659v, true);
            m125307Y(this.f98661x);
        }
        bnl0.m105509E0(this.f98658u, new View.OnClickListener() { // from class: l.def
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88022a.m125306X(view);
            }
        });
    }
}
