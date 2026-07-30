package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import java.util.List;
import p147v.VText;
import p149l.e30;
import p149l.i3c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceGiftWallTabLayout extends TabLayout {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallTabLayout$a */
    public class C13049a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f53783a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f53784b;

        public C13049a(e30 e30Var, List list) {
            this.f53783a = e30Var;
            this.f53784b = list;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getCustomView().setSelected(true);
            ((VText) tab.getCustomView()).setTextColor(Color.parseColor("#CCFFFFFF"));
            this.f53783a.call((GiftTab) this.f53784b.get(tab.getPosition()));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getCustomView().setSelected(false);
            ((VText) tab.getCustomView()).setTextColor(Color.parseColor("#66ffffff"));
        }
    }

    public VoiceGiftWallTabLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m78688a(List<GiftTab> list, e30<GiftTab> e30Var) {
        removeAllTabs();
        clearOnTabSelectedListeners();
        if (vwb.m200296J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            TabLayout.Tab tabNewTab = newTab();
            VText vText = new VText(getContext());
            GiftTab giftTab = list.get(i);
            vText.setPadding(t100.m186890d(13.0f), t100.m186890d(6.0f), t100.m186890d(13.0f), t100.m186890d(6.0f));
            vText.setText(giftTab.name);
            vText.setBackgroundResource(i3c0.f110911X6);
            vText.setTextSize(14.0f);
            vText.setSingleLine(true);
            vText.setTextColor(Color.parseColor("#66ffffff"));
            int i2 = xdl0.f192404f;
            vText.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
            tabNewTab.setCustomView(vText);
            addTab(tabNewTab);
        }
        TabLayout.OnTabSelectedListener c13049a = new C13049a(e30Var, list);
        addOnTabSelectedListener(c13049a);
        c13049a.onTabSelected(getTabAt(0));
    }

    public VoiceGiftWallTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
