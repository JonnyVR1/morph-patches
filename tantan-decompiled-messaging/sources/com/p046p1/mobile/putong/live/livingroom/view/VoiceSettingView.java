package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.h1c0;
import p149l.t100;
import p149l.tb3;
import p149l.xdl0;
import p149l.zio0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceSettingView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VLinear f52101d;

    /* JADX INFO: renamed from: e */
    public Map<Integer, List<tb3<?>>> f52102e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.VoiceSettingView$a */
    public class C12944a extends GridLayoutManager {
        public C12944a(Context context, int i, int i2, boolean z) {
            super(context, i, i2, z);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean canScrollVertically() {
            return false;
        }
    }

    public VoiceSettingView(Context context) {
        super(context);
        this.f52102e = new ArrayMap();
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
    private void m76662i0() {
        LinearLayout.LayoutParams layoutParams;
        for (List<tb3<?>> list : this.f52102e.values()) {
            VText vText = new VText(getContext());
            vText.setTextSize(2, 15.0f);
            vText.setTextColor(getResources().getColor(h1c0.f105386m1));
            vText.setText(list.get(0).mo109668r1());
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = t100.f167259h;
            VRecyclerView vRecyclerView = new VRecyclerView(getContext());
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            if (list.get(0).m187792I().isGame()) {
                layoutParams = new LinearLayout.LayoutParams(-1, xdl0.f192404f);
                layoutParams.topMargin = xdl0.m208407w(6.0f);
                layoutParams.rightMargin = xdl0.m208407w(12.0f);
                vRecyclerView.setLayoutManager(new C12944a(getContext(), 4, 1, false));
            } else {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, xdl0.m208407w(89.0f));
                layoutParams3.topMargin = xdl0.m208407w(12.0f);
                layoutParams2.topMargin = t100.m186890d(18.0f);
                vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                layoutParams = layoutParams3;
            }
            this.f52101d.addView(vText, layoutParams2);
            this.f52101d.addView(vRecyclerView, layoutParams);
            vRecyclerView.setAdapter(liveBaseAdapter);
            liveBaseAdapter.m67371Z(list);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m76663h0(View view) {
        zio0.m219050a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76663h0(this);
    }

    public void setModels(List<tb3<?>> list) {
        this.f52102e.clear();
        this.f52101d.removeAllViews();
        if (list != null) {
            for (tb3<?> tb3Var : list) {
                if (this.f52102e.containsKey(Integer.valueOf(tb3Var.mo109665X1()))) {
                    this.f52102e.get(Integer.valueOf(tb3Var.mo109665X1())).add(tb3Var);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(tb3Var);
                    this.f52102e.put(Integer.valueOf(tb3Var.mo109665X1()), arrayList);
                }
            }
            if (this.f52102e.size() > 0) {
                m76662i0();
            }
        }
    }

    public VoiceSettingView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52102e = new ArrayMap();
    }

    public VoiceSettingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52102e = new ArrayMap();
    }
}
