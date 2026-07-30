package com.p046p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p046p1.mobile.putong.live.base.view.MaximumScroll;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.h1c0;
import p149l.t100;
import p149l.tb3;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xen0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceIntlSettingLayout extends MaximumScroll {

    /* JADX INFO: renamed from: g */
    public VLinear f52927g;

    /* JADX INFO: renamed from: h */
    public Map<String, List<tb3<?>>> f52928h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.bottom.VoiceIntlSettingLayout$a */
    public class C12990a extends GridLayoutManager {
        public C12990a(Context context, int i, int i2, boolean z) {
            super(context, i, i2, z);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public boolean canScrollVertically() {
            return false;
        }
    }

    public VoiceIntlSettingLayout(Context context) {
        super(context);
        this.f52928h = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: f */
    public final void m77782f(View view) {
        xen0.m208586a(this, view);
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
    public final void m77783g(List<BLiveSettingButtonCategory> list) {
        VoiceIntlSettingLayout voiceIntlSettingLayout;
        for (String str : this.f52928h.keySet()) {
            final List<tb3<?>> list2 = this.f52928h.get(str);
            VText vText = new VText(this.getContext());
            vText.setTextSize(2, 15.0f);
            vText.setTextColor(this.getResources().getColor(h1c0.f105386m1));
            vText.setText(str);
            vText.getPaint().setFakeBoldText(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = t100.f167259h;
            layoutParams.topMargin = t100.m186890d(18.0f);
            VRecyclerView vRecyclerView = new VRecyclerView(this.getContext());
            LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, xdl0.f192404f);
            if (((BLiveSettingButtonCategory) vwb.m200346r(list, new w9j() { // from class: l.wen0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveSettingButtonCategory) obj).f44435id == ((tb3) list2.get(0)).m187792I().category);
                }
            })).viewType == 0) {
                layoutParams2.topMargin = xdl0.m208407w(6.0f);
                voiceIntlSettingLayout = this;
                vRecyclerView.setLayoutManager(voiceIntlSettingLayout.new C12990a(this.getContext(), 4, 1, false));
            } else {
                voiceIntlSettingLayout = this;
                layoutParams2.topMargin = xdl0.m208407w(12.0f);
                vRecyclerView.setLayoutManager(new LinearLayoutManager(voiceIntlSettingLayout.getContext(), 0, false));
            }
            voiceIntlSettingLayout.f52927g.addView(vText, layoutParams);
            voiceIntlSettingLayout.f52927g.addView(vRecyclerView, layoutParams2);
            vRecyclerView.setAdapter(liveBaseAdapter);
            liveBaseAdapter.m67371Z(list2);
            this = voiceIntlSettingLayout;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m77784h(Map<String, List<tb3<?>>> map, List<BLiveSettingButtonCategory> list) {
        this.f52928h.clear();
        this.f52927g.removeAllViews();
        if (vwb.m200296J(map.keySet())) {
            return;
        }
        for (String str : map.keySet()) {
            if (this.f52928h.containsKey(str)) {
                this.f52928h.get(str).addAll(map.get(str));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(map.get(str));
                this.f52928h.put(str, arrayList);
            }
        }
        if (this.f52928h.isEmpty()) {
            return;
        }
        m77783g(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77782f(this);
    }

    public VoiceIntlSettingLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52928h = new LinkedHashMap();
    }

    public VoiceIntlSettingLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52928h = new LinkedHashMap();
    }
}
