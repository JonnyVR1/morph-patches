package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p149l.dac0;
import p149l.e30;
import p149l.f6c0;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomPetTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f33309F;

    /* JADX INFO: renamed from: G */
    public ViewGroup f33310G;

    /* JADX INFO: renamed from: H */
    public List<ExpEditProfileUploadImageView> f33311H = new ArrayList();

    /* JADX INFO: renamed from: I */
    public List<String> f33312I = new ArrayList();

    /* JADX INFO: renamed from: J */
    public VText f33313J;

    /* JADX INFO: renamed from: K */
    public String f33314K;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomPetTypeFrag$a */
    public class C8645a implements ExpEditProfileUploadImageView.InterfaceC8630b {
        public C8645a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8630b
        /* JADX INFO: renamed from: a */
        public void mo50942a(String str) {
            ExpProfileLoopCustomPetTypeFrag.this.f33312I.add(str);
            ExpProfileLoopCustomPetTypeFrag.this.m51249R4(true);
            ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag = ExpProfileLoopCustomPetTypeFrag.this;
            expProfileLoopCustomPetTypeFrag.m51299c5(expProfileLoopCustomPetTypeFrag.f33312I);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8630b
        /* JADX INFO: renamed from: b */
        public void mo50943b(String str) {
            ExpProfileLoopCustomPetTypeFrag.this.f33312I.remove(str);
            ExpProfileLoopCustomPetTypeFrag.this.m51249R4(true);
            ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag = ExpProfileLoopCustomPetTypeFrag.this;
            expProfileLoopCustomPetTypeFrag.m51299c5(expProfileLoopCustomPetTypeFrag.f33312I);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomPetTypeFrag$b */
    public static class C8646b extends dac0<ExpProfileLoopSelectTypeData.ItemData> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopCustomPetTypeFrag f33316c;

        /* JADX INFO: renamed from: d */
        public final ArrayList<ExpProfileLoopSelectTypeData.ItemData> f33317d;

        public C8646b(ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag, ArrayList<ExpProfileLoopSelectTypeData.ItemData> arrayList) {
            this.f33316c = expProfileLoopCustomPetTypeFrag;
            this.f33317d = arrayList;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f33317d.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            VText vText = new VText(viewGroup.getContext());
            vText.setBackgroundResource(x2c0.f190694wr);
            vText.setGravity(17);
            RecyclerView.C0578p c0578p = new RecyclerView.C0578p(xdl0.f192403e, t100.f167230E);
            ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin = t100.f167259h;
            vText.setLayoutParams(c0578p);
            return vText;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final ExpProfileLoopSelectTypeData.ItemData itemData, int i, int i2) {
            if (view instanceof VText) {
                VText vText = (VText) view;
                vText.setText(itemData.text);
                vText.setTextColor(itemData.boolValue ? -1 : RoundedDrawable.DEFAULT_BORDER_COLOR);
            }
            view.setSelected(itemData.boolValue);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.lgf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f127978a.m51304I(itemData, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public ExpProfileLoopSelectTypeData.ItemData getItem(int i) {
            return this.f33317d.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m51304I(ExpProfileLoopSelectTypeData.ItemData itemData, View view) {
            boolean z = itemData.boolValue;
            vwb.m200354z(this.f33317d, new e30() { // from class: l.mgf
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue = false;
                }
            });
            if (z) {
                this.f33316c.m51297a5(null);
            } else {
                itemData.boolValue = true;
                this.f33316c.m51297a5(itemData);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f33309F = new RecyclerView(viewGroup.getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f33309F);
        this.f33313J = new VText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xdl0.f192404f, t100.m186890d(21.0f));
        layoutParams.topMargin = t100.f167267p;
        layoutParams.bottomMargin = t100.f167260i;
        this.f33313J.setText("上传宠物照片");
        this.f33313J.setTextColor(getResources().getColor(w0c0.f183905z));
        this.f33313J.setTextSize(1, 15.0f);
        linearLayout.addView(this.f33313J, layoutParams);
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getContext()).inflate(f6c0.f96048v9, (ViewGroup) linearLayout, false);
        this.f33310G = viewGroup2;
        linearLayout.addView(viewGroup2, xdl0.f192403e, xdl0.f192404f);
        return linearLayout;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo51248Q4(List<Media> list, int i) {
        super.mo51248Q4(list, i);
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f33311H) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m50939Q(picture);
                    return;
                }
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public void mo51251T4(User user) {
        super.mo51251T4(user);
        if (TextUtils.isEmpty(this.f33314K)) {
            user.profile.extensions.wealth.pet = vwb.m200324f0(new String[0]);
        } else {
            user.profile.extensions.wealth.pet = vwb.m200324f0(this.f33314K);
        }
        if (TextUtils.isEmpty(this.f33314K) || TextUtils.equals(this.f33314K, "暂不透露")) {
            user.profile.extensions.wealth.petImg = vwb.m200324f0(new String[0]);
        } else {
            user.profile.extensions.wealth.petImg = this.f33312I;
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m51296Z4(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iM208412y0 = ((xdl0.m208412y0() - (t100.f167276y * 2)) - (t100.f167259h * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = iM208412y0;
        layoutParams.width = iM208412y0;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m50935L(m51243M4(), 17, new C8645a());
    }

    /* JADX INFO: renamed from: a5 */
    public final void m51297a5(ExpProfileLoopSelectTypeData.ItemData itemData) {
        if (itemData == null) {
            this.f33314K = null;
        } else {
            this.f33314K = itemData.boolValue ? itemData.text : null;
        }
        m51249R4(true);
        m51298b5(this.f33314K);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m51298b5(String str) {
        if (str == null || TextUtils.equals(str, "暂无") || TextUtils.equals(str, "暂不透露")) {
            xdl0.m208344M(this.f33310G, false);
            xdl0.m208344M(this.f33313J, false);
        } else {
            xdl0.m208344M(this.f33310G, true);
            xdl0.m208344M(this.f33313J, true);
            m51299c5(this.f33312I);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m51299c5(List<String> list) {
        int i = 0;
        while (i < this.f33311H.size()) {
            String str = i < list.size() ? list.get(i) : null;
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f33311H.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m50940R(str);
            }
            i++;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a6  */
    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        String str;
        super.mo20586g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f33311H.add((ExpEditProfileUploadImageView) this.f33310G.findViewById(u4c0.f173926M5));
        this.f33311H.add((ExpEditProfileUploadImageView) this.f33310G.findViewById(u4c0.f173943N5));
        this.f33311H.add((ExpEditProfileUploadImageView) this.f33310G.findViewById(u4c0.f173960O5));
        vwb.m200354z(this.f33311H, new e30() { // from class: l.kgf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123029a.m51296Z4((ExpEditProfileUploadImageView) obj);
            }
        });
        User userM51245N4 = m51245N4();
        if (NullChecker.m81303a(userM51245N4) && NullChecker.m81303a(userM51245N4.profile) && NullChecker.m81303a(userM51245N4.profile.extensions) && NullChecker.m81303a(userM51245N4.profile.extensions.wealth)) {
            if (!vwb.m200296J(userM51245N4.profile.extensions.wealth.petImg)) {
                this.f33312I = new ArrayList(userM51245N4.profile.extensions.wealth.petImg);
            }
            if (vwb.m200296J(userM51245N4.profile.extensions.wealth.pet)) {
                str = null;
            } else {
                str = userM51245N4.profile.extensions.wealth.pet.get(0);
            }
        } else {
            str = null;
        }
        this.f33314K = str;
        ExpProfileLoopSelectTypeData.ItemData itemData = new ExpProfileLoopSelectTypeData.ItemData("已有宠物");
        ExpProfileLoopSelectTypeData.ItemData itemData2 = new ExpProfileLoopSelectTypeData.ItemData("暂无");
        if (TextUtils.equals(str, "已有宠物")) {
            itemData.boolValue = true;
        } else if (TextUtils.equals(str, "暂无")) {
            itemData2.boolValue = true;
        }
        C8646b c8646b = new C8646b(this, vwb.m200324f0(itemData, itemData2));
        this.f33309F.setLayoutManager(linearLayoutManager);
        this.f33309F.setAdapter(c8646b);
        m51298b5(str);
    }
}
