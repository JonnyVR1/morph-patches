package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.qa00;
import p153l.y20;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomPetTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f34157F;

    /* JADX INFO: renamed from: G */
    public ViewGroup f34158G;

    /* JADX INFO: renamed from: H */
    public List<ExpEditProfileUploadImageView> f34159H = new ArrayList();

    /* JADX INFO: renamed from: I */
    public List<String> f34160I = new ArrayList();

    /* JADX INFO: renamed from: J */
    public VText f34161J;

    /* JADX INFO: renamed from: K */
    public String f34162K;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomPetTypeFrag$a */
    public class C8808a implements ExpEditProfileUploadImageView.InterfaceC8793b {
        public C8808a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8793b
        /* JADX INFO: renamed from: a */
        public void mo52125a(String str) {
            ExpProfileLoopCustomPetTypeFrag.this.f34160I.add(str);
            ExpProfileLoopCustomPetTypeFrag.this.m52432R4(true);
            ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag = ExpProfileLoopCustomPetTypeFrag.this;
            expProfileLoopCustomPetTypeFrag.m52482c5(expProfileLoopCustomPetTypeFrag.f34160I);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8793b
        /* JADX INFO: renamed from: b */
        public void mo52126b(String str) {
            ExpProfileLoopCustomPetTypeFrag.this.f34160I.remove(str);
            ExpProfileLoopCustomPetTypeFrag.this.m52432R4(true);
            ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag = ExpProfileLoopCustomPetTypeFrag.this;
            expProfileLoopCustomPetTypeFrag.m52482c5(expProfileLoopCustomPetTypeFrag.f34160I);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomPetTypeFrag$b */
    public static class C8809b extends jic0<ExpProfileLoopSelectTypeData.ItemData> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopCustomPetTypeFrag f34164c;

        /* JADX INFO: renamed from: d */
        public final ArrayList<ExpProfileLoopSelectTypeData.ItemData> f34165d;

        public C8809b(ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag, ArrayList<ExpProfileLoopSelectTypeData.ItemData> arrayList) {
            this.f34164c = expProfileLoopCustomPetTypeFrag;
            this.f34165d = arrayList;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f34165d.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            VText vText = new VText(viewGroup.getContext());
            vText.setBackgroundResource(dbc0.f87164ks);
            vText.setGravity(17);
            RecyclerView.C0580p c0580p = new RecyclerView.C0580p(bnl0.f77544e, qa00.f156292E);
            ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin = qa00.f156321h;
            vText.setLayoutParams(c0580p);
            return vText;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final ExpProfileLoopSelectTypeData.ItemData itemData, int i, int i2) {
            if (view instanceof VText) {
                VText vText = (VText) view;
                vText.setText(itemData.text);
                vText.setTextColor(itemData.boolValue ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
            }
            view.setSelected(itemData.boolValue);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.rhf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f163158a.m52487I(itemData, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public ExpProfileLoopSelectTypeData.ItemData getItem(int i) {
            return this.f34165d.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m52487I(ExpProfileLoopSelectTypeData.ItemData itemData, View view) {
            boolean z = itemData.boolValue;
            jyb.m147537z(this.f34165d, new y20() { // from class: l.shf
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue = false;
                }
            });
            if (z) {
                this.f34164c.m52480a5(null);
            } else {
                itemData.boolValue = true;
                this.f34164c.m52480a5(itemData);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f34157F = new RecyclerView(viewGroup.getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f34157F);
        this.f34161J = new VText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bnl0.f77545f, qa00.m175859d(21.0f));
        layoutParams.topMargin = qa00.f156329p;
        layoutParams.bottomMargin = qa00.f156322i;
        this.f34161J.setText("上传宠物照片");
        this.f34161J.setTextColor(getResources().getColor(c9c0.f80475z));
        this.f34161J.setTextSize(1, 15.0f);
        linearLayout.addView(this.f34161J, layoutParams);
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getContext()).inflate(kec0.f125359C9, (ViewGroup) linearLayout, false);
        this.f34158G = viewGroup2;
        linearLayout.addView(viewGroup2, bnl0.f77544e, bnl0.f77545f);
        return linearLayout;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo52431Q4(List<Media> list, int i) {
        super.mo52431Q4(list, i);
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f34159H) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m52122Q(picture);
                    return;
                }
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public void mo52434T4(User user) {
        super.mo52434T4(user);
        if (TextUtils.isEmpty(this.f34162K)) {
            user.profile.extensions.wealth.pet = jyb.m147507f0(new String[0]);
        } else {
            user.profile.extensions.wealth.pet = jyb.m147507f0(this.f34162K);
        }
        if (TextUtils.isEmpty(this.f34162K) || TextUtils.equals(this.f34162K, "暂不透露")) {
            user.profile.extensions.wealth.petImg = jyb.m147507f0(new String[0]);
        } else {
            user.profile.extensions.wealth.petImg = this.f34160I;
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m52479Z4(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iM105592y0 = ((bnl0.m105592y0() - (qa00.f156338y * 2)) - (qa00.f156321h * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = iM105592y0;
        layoutParams.width = iM105592y0;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m52118L(m52426M4(), 17, new C8808a());
    }

    /* JADX INFO: renamed from: a5 */
    public final void m52480a5(ExpProfileLoopSelectTypeData.ItemData itemData) {
        if (itemData == null) {
            this.f34162K = null;
        } else {
            this.f34162K = itemData.boolValue ? itemData.text : null;
        }
        m52432R4(true);
        m52481b5(this.f34162K);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m52481b5(String str) {
        if (str == null || TextUtils.equals(str, "暂无") || TextUtils.equals(str, "暂不透露")) {
            bnl0.m105524M(this.f34158G, false);
            bnl0.m105524M(this.f34161J, false);
        } else {
            bnl0.m105524M(this.f34158G, true);
            bnl0.m105524M(this.f34161J, true);
            m52482c5(this.f34160I);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m52482c5(List<String> list) {
        int i = 0;
        while (i < this.f34159H.size()) {
            String str = i < list.size() ? list.get(i) : null;
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f34159H.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m52123R(str);
            }
            i++;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a6  */
    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        String str;
        super.mo21585g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f34159H.add((ExpEditProfileUploadImageView) this.f34158G.findViewById(adc0.f70048O5));
        this.f34159H.add((ExpEditProfileUploadImageView) this.f34158G.findViewById(adc0.f70065P5));
        this.f34159H.add((ExpEditProfileUploadImageView) this.f34158G.findViewById(adc0.f70082Q5));
        jyb.m147537z(this.f34159H, new y20() { // from class: l.qhf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157677a.m52479Z4((ExpEditProfileUploadImageView) obj);
            }
        });
        User userM52428N4 = m52428N4();
        if (NullChecker.m82486a(userM52428N4) && NullChecker.m82486a(userM52428N4.profile) && NullChecker.m82486a(userM52428N4.profile.extensions) && NullChecker.m82486a(userM52428N4.profile.extensions.wealth)) {
            if (!jyb.m147479J(userM52428N4.profile.extensions.wealth.petImg)) {
                this.f34160I = new ArrayList(userM52428N4.profile.extensions.wealth.petImg);
            }
            if (jyb.m147479J(userM52428N4.profile.extensions.wealth.pet)) {
                str = null;
            } else {
                str = userM52428N4.profile.extensions.wealth.pet.get(0);
            }
        } else {
            str = null;
        }
        this.f34162K = str;
        ExpProfileLoopSelectTypeData.ItemData itemData = new ExpProfileLoopSelectTypeData.ItemData("已有宠物");
        ExpProfileLoopSelectTypeData.ItemData itemData2 = new ExpProfileLoopSelectTypeData.ItemData("暂无");
        if (TextUtils.equals(str, "已有宠物")) {
            itemData.boolValue = true;
        } else if (TextUtils.equals(str, "暂无")) {
            itemData2.boolValue = true;
        }
        C8809b c8809b = new C8809b(this, jyb.m147507f0(itemData, itemData2));
        this.f34157F.setLayoutManager(linearLayoutManager);
        this.f34157F.setAdapter(c8809b);
        m52481b5(str);
    }
}
