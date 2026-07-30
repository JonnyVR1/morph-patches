package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p051p1.mobile.putong.live.base.view.MaximumScroll;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.bon0;
import p153l.ic3;
import p153l.jyb;
import p153l.n9c0;
import p153l.qa00;
import p153l.qcj;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceIntlSettingLayout extends MaximumScroll {

    /* JADX INFO: renamed from: g */
    public VLinear f53775g;

    /* JADX INFO: renamed from: h */
    public Map<String, List<ic3<?>>> f53776h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.bottom.VoiceIntlSettingLayout$a */
    public class C13153a extends GridLayoutManager {
        public C13153a(Context context, int i, int i2, boolean z) {
            super(context, i, i2, z);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public boolean canScrollVertically() {
            return false;
        }
    }

    public VoiceIntlSettingLayout(Context context) {
        super(context);
        this.f53776h = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: f */
    public final void m78965f(View view) {
        bon0.m105707a(this, view);
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
    /* JADX INFO: renamed from: g */
    public final void m78966g(List<BLiveSettingButtonCategory> list) {
        VoiceIntlSettingLayout voiceIntlSettingLayout;
        for (String str : this.f53776h.keySet()) {
            final List<ic3<?>> list2 = this.f53776h.get(str);
            VText vText = new VText(this.getContext());
            vText.setTextSize(2, 15.0f);
            vText.setTextColor(this.getResources().getColor(n9c0.f140847m1));
            vText.setText(str);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = qa00.f156321h;
            layoutParams.topMargin = qa00.m175859d(18.0f);
            VRecyclerView vRecyclerView = new VRecyclerView(this.getContext());
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, bnl0.f77545f);
            if (((BLiveSettingButtonCategory) jyb.m147529r(list, new qcj() { // from class: l.aon0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveSettingButtonCategory) obj).f45283id == ((ic3) list2.get(0)).m139425I().category);
                }
            })).viewType == 0) {
                layoutParams2.topMargin = bnl0.m105587w(6.0f);
                voiceIntlSettingLayout = this;
                vRecyclerView.setLayoutManager(voiceIntlSettingLayout.new C13153a(this.getContext(), 4, 1, false));
            } else {
                voiceIntlSettingLayout = this;
                layoutParams2.topMargin = bnl0.m105587w(12.0f);
                vRecyclerView.setLayoutManager(new LinearLayoutManager(voiceIntlSettingLayout.getContext(), 0, false));
            }
            voiceIntlSettingLayout.f53775g.addView(vText, layoutParams);
            voiceIntlSettingLayout.f53775g.addView(vRecyclerView, layoutParams2);
            vRecyclerView.setAdapter(liveBaseAdapter);
            liveBaseAdapter.m68554Z(list2);
            this = voiceIntlSettingLayout;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m78967h(Map<String, List<ic3<?>>> map, List<BLiveSettingButtonCategory> list) {
        this.f53776h.clear();
        this.f53775g.removeAllViews();
        if (jyb.m147479J(map.keySet())) {
            return;
        }
        for (String str : map.keySet()) {
            if (this.f53776h.containsKey(str)) {
                this.f53776h.get(str).addAll(map.get(str));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(map.get(str));
                this.f53776h.put(str, arrayList);
            }
        }
        if (this.f53776h.isEmpty()) {
            return;
        }
        m78966g(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78965f(this);
    }

    public VoiceIntlSettingLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53776h = new LinkedHashMap();
    }

    public VoiceIntlSettingLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53776h = new LinkedHashMap();
    }
}
