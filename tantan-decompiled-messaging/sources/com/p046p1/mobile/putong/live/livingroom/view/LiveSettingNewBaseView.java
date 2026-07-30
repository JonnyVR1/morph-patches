package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.bvv;
import p149l.cmf0;
import p149l.er3;
import p149l.h1c0;
import p149l.i7n;
import p149l.i80;
import p149l.n660;
import p149l.t100;
import p149l.xdl0;
import p149l.zmt;

/* JADX INFO: loaded from: classes5.dex */
public class LiveSettingNewBaseView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f52044d;

    /* JADX INFO: renamed from: e */
    public VLinear f52045e;

    /* JADX INFO: renamed from: f */
    public Map<Integer, List<i80<View>>> f52046f;

    public LiveSettingNewBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52046f = new ArrayMap();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76582h0(View view) {
        zmt.m219373a(this, view);
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
    public final void m76583i0() {
        for (List<i80<View>> list : this.f52046f.values()) {
            VText vText = new VText(getContext());
            vText.setTextSize(2, 15.0f);
            vText.setTextColor(getResources().getColor(h1c0.f105386m1));
            vText.setText(list.get(0).f111969t);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = t100.f167266o;
            this.f52045e.addView(vText, layoutParams);
            VRecyclerView vRecyclerView = new VRecyclerView(getContext());
            er3 er3Var = new er3(getContext());
            vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            if (bvv.m104078a()) {
                vRecyclerView.addItemDecoration(new cmf0(0, "big".equals(list.get(0).f111970u) ? t100.f167260i : -t100.f167257f));
            } else {
                vRecyclerView.addItemDecoration(new cmf0(0, "big".equals(list.get(0).f111970u) ? t100.f167264m : t100.f167254c));
            }
            int iM208407w = "big".equals(list.get(0).f111970u) ? t100.f167265n : xdl0.m208407w(11.0f);
            vRecyclerView.addItemDecoration(new n660(0, iM208407w, iM208407w));
            vRecyclerView.setAdapter(er3Var);
            er3Var.m117810C(list);
            er3Var.notifyDataSetChanged();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, bvv.m104078a() ? xdl0.m208407w("big".equals(list.get(0).f111970u) ? 86.0f : 79.0f) : xdl0.m208407w("big".equals(list.get(0).f111970u) ? 88.0f : 81.0f));
            layoutParams2.topMargin = xdl0.m208407w(13.0f);
            this.f52045e.addView(vRecyclerView, layoutParams2);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m76584j0() {
        this.f52046f.clear();
        this.f52045e.removeAllViews();
    }

    /* JADX INFO: renamed from: k0 */
    public void m76585k0() {
        this.f52044d.m68504n();
    }

    /* JADX INFO: renamed from: l0 */
    public void m76586l0() {
        if (i7n.m134916b()) {
            return;
        }
        this.f52044d.m68500j("https://auto.tancdn.com/v1/raw/dd64c66a-551e-4a3e-8bde-1fac501b9a9411.pdf", -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76582h0(this);
    }

    public void setModels(List<i80<View>> list) {
        this.f52046f.clear();
        this.f52045e.removeAllViews();
        for (i80<View> i80Var : list) {
            if (this.f52046f.containsKey(Integer.valueOf(i80Var.mo109665X1()))) {
                this.f52046f.get(Integer.valueOf(i80Var.mo109665X1())).add(i80Var);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(i80Var);
                this.f52046f.put(Integer.valueOf(i80Var.mo109665X1()), arrayList);
            }
        }
        if (this.f52046f.size() > 0) {
            m76583i0();
        }
    }

    public LiveSettingNewBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52046f = new ArrayMap();
    }
}
