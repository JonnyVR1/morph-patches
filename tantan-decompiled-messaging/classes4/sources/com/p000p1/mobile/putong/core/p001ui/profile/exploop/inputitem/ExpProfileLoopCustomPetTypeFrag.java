package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopSelectTypeData;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.f6c0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopCustomPetTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public RecyclerView f1131F;

    /* JADX INFO: renamed from: G */
    public ViewGroup f1132G;

    /* JADX INFO: renamed from: H */
    public List<ExpEditProfileUploadImageView> f1133H = new ArrayList();

    /* JADX INFO: renamed from: I */
    public List<String> f1134I = new ArrayList();

    /* JADX INFO: renamed from: J */
    public VText f1135J;

    /* JADX INFO: renamed from: K */
    public String f1136K;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomPetTypeFrag$a */
    public class C0070a implements ExpEditProfileUploadImageView.InterfaceC0055b {
        public C0070a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC0055b
        /* JADX INFO: renamed from: a */
        public void mo1390a(String str) {
            ExpProfileLoopCustomPetTypeFrag.this.f1134I.add(str);
            ExpProfileLoopCustomPetTypeFrag.this.m1704R4(true);
            ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag = ExpProfileLoopCustomPetTypeFrag.this;
            expProfileLoopCustomPetTypeFrag.m1758c5(expProfileLoopCustomPetTypeFrag.f1134I);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC0055b
        /* JADX INFO: renamed from: b */
        public void mo1391b(String str) {
            ExpProfileLoopCustomPetTypeFrag.this.f1134I.remove(str);
            ExpProfileLoopCustomPetTypeFrag.this.m1704R4(true);
            ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag = ExpProfileLoopCustomPetTypeFrag.this;
            expProfileLoopCustomPetTypeFrag.m1758c5(expProfileLoopCustomPetTypeFrag.f1134I);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomPetTypeFrag$b */
    public static class C0071b extends dac0<ExpProfileLoopSelectTypeData.ItemData> {

        /* JADX INFO: renamed from: c */
        public final ExpProfileLoopCustomPetTypeFrag f1138c;

        /* JADX INFO: renamed from: d */
        public final ArrayList<ExpProfileLoopSelectTypeData.ItemData> f1139d;

        public C0071b(ExpProfileLoopCustomPetTypeFrag expProfileLoopCustomPetTypeFrag, ArrayList<ExpProfileLoopSelectTypeData.ItemData> arrayList) {
            this.f1138c = expProfileLoopCustomPetTypeFrag;
            this.f1139d = arrayList;
        }

        /* JADX INFO: renamed from: C */
        public int m1764C() {
            return this.f1139d.size();
        }

        /* JADX INFO: renamed from: D */
        public View m1765D(ViewGroup viewGroup, int i) {
            VText vText = new VText(viewGroup.getContext());
            vText.setBackgroundResource(x2c0.wr);
            vText.setGravity(17);
            RecyclerView.p pVar = new RecyclerView.p(xdl0.e, t100.E);
            ((ViewGroup.MarginLayoutParams) pVar).bottomMargin = t100.h;
            vText.setLayoutParams(pVar);
            return vText;
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m1763A(View view, final ExpProfileLoopSelectTypeData.ItemData itemData, int i, int i2) {
            if (view instanceof VText) {
                VText vText = (VText) view;
                vText.setText(itemData.text);
                vText.setTextColor(itemData.boolValue ? -1 : -16777216);
            }
            view.setSelected(itemData.boolValue);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.lgf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14854a.m1768I(itemData, view2);
                }
            });
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public ExpProfileLoopSelectTypeData.ItemData getItem(int i) {
            return this.f1139d.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m1768I(ExpProfileLoopSelectTypeData.ItemData itemData, View view) {
            boolean z = itemData.boolValue;
            vwb.z(this.f1139d, new e30() { // from class: l.mgf
                public final void call(Object obj) {
                    ((ExpProfileLoopSelectTypeData.ItemData) obj).boolValue = false;
                }
            });
            if (z) {
                this.f1138c.m1756a5(null);
            } else {
                itemData.boolValue = true;
                this.f1138c.m1756a5(itemData);
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f1131F = new RecyclerView(viewGroup.getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f1131F);
        this.f1135J = new VText(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(xdl0.f, t100.d(21.0f));
        layoutParams.topMargin = t100.p;
        layoutParams.bottomMargin = t100.i;
        this.f1135J.setText("上传宠物照片");
        this.f1135J.setTextColor(getResources().getColor(w0c0.z));
        this.f1135J.setTextSize(1, 15.0f);
        linearLayout.addView(this.f1135J, layoutParams);
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getContext()).inflate(f6c0.v9, (ViewGroup) linearLayout, false);
        this.f1132G = viewGroup2;
        linearLayout.addView(viewGroup2, xdl0.e, xdl0.f);
        return linearLayout;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo1703Q4(List<Media> list, int i) {
        super.mo1703Q4(list, i);
        Picture picture = (Media) list.get(0);
        if (picture instanceof Picture) {
            Picture picture2 = picture;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f1133H) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m1385Q(picture2);
                    return;
                }
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: T4 */
    public void mo1706T4(User user) {
        super.mo1706T4(user);
        if (TextUtils.isEmpty(this.f1136K)) {
            user.profile.extensions.wealth.pet = vwb.f0(new String[0]);
        } else {
            user.profile.extensions.wealth.pet = vwb.f0(new String[]{this.f1136K});
        }
        if (TextUtils.isEmpty(this.f1136K) || TextUtils.equals(this.f1136K, "暂不透露")) {
            user.profile.extensions.wealth.petImg = vwb.f0(new String[0]);
        } else {
            user.profile.extensions.wealth.petImg = this.f1134I;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m1755Z4(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iY0 = ((xdl0.y0() - (t100.y * 2)) - (t100.h * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = iY0;
        layoutParams.width = iY0;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m1381L(m1698M4(), 17, new C0070a());
    }

    /* JADX INFO: renamed from: a5 */
    public final void m1756a5(ExpProfileLoopSelectTypeData.ItemData itemData) {
        if (itemData == null) {
            this.f1136K = null;
        } else {
            this.f1136K = itemData.boolValue ? itemData.text : null;
        }
        m1704R4(true);
        m1757b5(this.f1136K);
    }

    /* JADX INFO: renamed from: b5 */
    public final void m1757b5(String str) {
        if (str == null || TextUtils.equals(str, "暂无") || TextUtils.equals(str, "暂不透露")) {
            xdl0.M(this.f1132G, false);
            xdl0.M(this.f1135J, false);
        } else {
            xdl0.M(this.f1132G, true);
            xdl0.M(this.f1135J, true);
            m1758c5(this.f1134I);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m1758c5(List<String> list) {
        int i = 0;
        while (i < this.f1133H.size()) {
            String str = i < list.size() ? list.get(i) : null;
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f1133H.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m1386R(str);
            }
            i++;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1708d4() {
        super.mo1708d4();
    }

    /* JADX INFO: renamed from: f4 */
    public void m1759f4() {
        super.f4();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a6  */
    /* JADX INFO: renamed from: g4 */
    public void m1760g4(Bundle bundle) {
        String str;
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f1133H.add((ExpEditProfileUploadImageView) this.f1132G.findViewById(u4c0.M5));
        this.f1133H.add((ExpEditProfileUploadImageView) this.f1132G.findViewById(u4c0.N5));
        this.f1133H.add((ExpEditProfileUploadImageView) this.f1132G.findViewById(u4c0.O5));
        vwb.z(this.f1133H, new e30() { // from class: l.kgf
            public final void call(Object obj) {
                this.f14320a.m1755Z4((ExpEditProfileUploadImageView) obj);
            }
        });
        User userM1700N4 = m1700N4();
        if (NullChecker.a(userM1700N4) && NullChecker.a(userM1700N4.profile) && NullChecker.a(userM1700N4.profile.extensions) && NullChecker.a(userM1700N4.profile.extensions.wealth)) {
            if (!vwb.J(userM1700N4.profile.extensions.wealth.petImg)) {
                this.f1134I = new ArrayList(userM1700N4.profile.extensions.wealth.petImg);
            }
            if (vwb.J(userM1700N4.profile.extensions.wealth.pet)) {
                str = null;
            } else {
                str = (String) userM1700N4.profile.extensions.wealth.pet.get(0);
            }
        } else {
            str = null;
        }
        this.f1136K = str;
        ExpProfileLoopSelectTypeData.ItemData itemData = new ExpProfileLoopSelectTypeData.ItemData("已有宠物");
        ExpProfileLoopSelectTypeData.ItemData itemData2 = new ExpProfileLoopSelectTypeData.ItemData("暂无");
        if (TextUtils.equals(str, "已有宠物")) {
            itemData.boolValue = true;
        } else if (TextUtils.equals(str, "暂无")) {
            itemData2.boolValue = true;
        }
        C0071b c0071b = new C0071b(this, vwb.f0(new ExpProfileLoopSelectTypeData.ItemData[]{itemData, itemData2}));
        this.f1131F.setLayoutManager(linearLayoutManager);
        this.f1131F.setAdapter(c0071b);
        m1757b5(str);
    }
}
