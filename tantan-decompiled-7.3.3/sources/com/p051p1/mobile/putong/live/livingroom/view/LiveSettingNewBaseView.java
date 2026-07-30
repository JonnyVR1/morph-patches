package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.bpt;
import p153l.cxv;
import p153l.ds3;
import p153l.e80;
import p153l.i9n;
import p153l.luf0;
import p153l.n9c0;
import p153l.qa00;
import p153l.te60;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSettingNewBaseView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f52892d;

    /* JADX INFO: renamed from: e */
    public VLinear f52893e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, List<e80<View>>> f52894f;

    public LiveSettingNewBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52894f = new ArrayMap();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77765h0(View view) {
        bpt.m105851a(this, view);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i0 */
    public final void m77766i0() {
        for (List<e80<View>> list : this.f52894f.values()) {
            VText vText = new VText(getContext());
            vText.setTextSize(2, 15.0f);
            vText.setTextColor(getResources().getColor(n9c0.f140847m1));
            vText.setText(list.get(0).f92495t);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = qa00.f156328o;
            this.f52893e.addView(vText, layoutParams);
            VRecyclerView vRecyclerView = new VRecyclerView(getContext());
            ds3 ds3Var = new ds3(getContext());
            vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            if (cxv.m113069a()) {
                vRecyclerView.addItemDecoration(new luf0(0, "big".equals(list.get(0).f92496u) ? qa00.f156322i : -qa00.f156319f));
            } else {
                vRecyclerView.addItemDecoration(new luf0(0, "big".equals(list.get(0).f92496u) ? qa00.f156326m : qa00.f156316c));
            }
            int iM105587w = "big".equals(list.get(0).f92496u) ? qa00.f156327n : bnl0.m105587w(11.0f);
            vRecyclerView.addItemDecoration(new te60(0, iM105587w, iM105587w));
            vRecyclerView.setAdapter(ds3Var);
            ds3Var.m117717C(list);
            ds3Var.notifyDataSetChanged();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, cxv.m113069a() ? bnl0.m105587w("big".equals(list.get(0).f92496u) ? 86.0f : 79.0f) : bnl0.m105587w("big".equals(list.get(0).f92496u) ? 88.0f : 81.0f));
            layoutParams2.topMargin = bnl0.m105587w(13.0f);
            this.f52893e.addView(vRecyclerView, layoutParams2);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m77767j0() {
        this.f52894f.clear();
        this.f52893e.removeAllViews();
    }

    /* JADX INFO: renamed from: k0 */
    public void m77768k0() {
        this.f52892d.m69687n();
    }

    /* JADX INFO: renamed from: l0 */
    public void m77769l0() {
        if (i9n.m139127b()) {
            return;
        }
        this.f52892d.m69683j("https://auto.tancdn.com/v1/raw/dd64c66a-551e-4a3e-8bde-1fac501b9a9411.pdf", -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77765h0(this);
    }

    public void setModels(List<e80<View>> list) {
        this.f52894f.clear();
        this.f52893e.removeAllViews();
        for (e80<View> e80Var : list) {
            if (this.f52894f.containsKey(Integer.valueOf(e80Var.mo113884X1()))) {
                this.f52894f.get(Integer.valueOf(e80Var.mo113884X1())).add(e80Var);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(e80Var);
                this.f52894f.put(Integer.valueOf(e80Var.mo113884X1()), arrayList);
            }
        }
        if (this.f52894f.size() > 0) {
            m77766i0();
        }
    }

    public LiveSettingNewBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52894f = new ArrayMap();
    }
}
