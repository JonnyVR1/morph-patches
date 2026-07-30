package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.dso0;
import p153l.ic3;
import p153l.n9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VLinear f52949d;

    /* JADX INFO: renamed from: e */
    public Map<Integer, List<ic3<?>>> f52950e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.VoiceSettingView$a */
    public class C13107a extends GridLayoutManager {
        public C13107a(Context context, int i, int i2, boolean z) {
            super(context, i, i2, z);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean canScrollVertically() {
            return false;
        }
    }

    public VoiceSettingView(Context context) {
        super(context);
        this.f52950e = new ArrayMap();
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
    private void m77845i0() {
        LinearLayout.LayoutParams layoutParams;
        for (List<ic3<?>> list : this.f52950e.values()) {
            VText vText = new VText(getContext());
            vText.setTextSize(2, 15.0f);
            vText.setTextColor(getResources().getColor(n9c0.f140847m1));
            vText.setText(list.get(0).mo113886r1());
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = qa00.f156321h;
            VRecyclerView vRecyclerView = new VRecyclerView(getContext());
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            if (list.get(0).m139425I().isGame()) {
                layoutParams = new LinearLayout.LayoutParams(-1, bnl0.f77545f);
                layoutParams.topMargin = bnl0.m105587w(6.0f);
                layoutParams.rightMargin = bnl0.m105587w(12.0f);
                vRecyclerView.setLayoutManager(new C13107a(getContext(), 4, 1, false));
            } else {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, bnl0.m105587w(89.0f));
                layoutParams3.topMargin = bnl0.m105587w(12.0f);
                layoutParams2.topMargin = qa00.m175859d(18.0f);
                vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                layoutParams = layoutParams3;
            }
            this.f52949d.addView(vText, layoutParams2);
            this.f52949d.addView(vRecyclerView, layoutParams);
            vRecyclerView.setAdapter(liveBaseAdapter);
            liveBaseAdapter.m68554Z(list);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77846h0(View view) {
        dso0.m117771a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77846h0(this);
    }

    public void setModels(List<ic3<?>> list) {
        this.f52950e.clear();
        this.f52949d.removeAllViews();
        if (list != null) {
            for (ic3<?> ic3Var : list) {
                if (this.f52950e.containsKey(Integer.valueOf(ic3Var.mo113884X1()))) {
                    this.f52950e.get(Integer.valueOf(ic3Var.mo113884X1())).add(ic3Var);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ic3Var);
                    this.f52950e.put(Integer.valueOf(ic3Var.mo113884X1()), arrayList);
                }
            }
            if (this.f52950e.size() > 0) {
                m77845i0();
            }
        }
    }

    public VoiceSettingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52950e = new ArrayMap();
    }

    public VoiceSettingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52950e = new ArrayMap();
    }
}
