package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.jyb;
import p153l.obc0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceGiftWallTabLayout extends TabLayout {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallTabLayout$a */
    public class C13212a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f54631a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f54632b;

        public C13212a(y20 y20Var, List list) {
            this.f54631a = y20Var;
            this.f54632b = list;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            tab.getCustomView().setSelected(true);
            ((VText) tab.getCustomView()).setTextColor(Color.parseColor("#CCFFFFFF"));
            this.f54631a.call((GiftTab) this.f54632b.get(tab.getPosition()));
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
    public void m79871a(List<GiftTab> list, y20<GiftTab> y20Var) {
        removeAllTabs();
        clearOnTabSelectedListeners();
        if (jyb.m147479J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            TabLayout.Tab tabNewTab = newTab();
            VText vText = new VText(getContext());
            GiftTab giftTab = list.get(i);
            vText.setPadding(qa00.m175859d(13.0f), qa00.m175859d(6.0f), qa00.m175859d(13.0f), qa00.m175859d(6.0f));
            vText.setText(giftTab.name);
            vText.setBackgroundResource(obc0.f146239X6);
            vText.setTextSize(14.0f);
            vText.setSingleLine(true);
            vText.setTextColor(Color.parseColor("#66ffffff"));
            int i2 = bnl0.f77545f;
            vText.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
            tabNewTab.setCustomView(vText);
            addTab(tabNewTab);
        }
        TabLayout.OnTabSelectedListener c13212a = new C13212a(y20Var, list);
        addOnTabSelectedListener(c13212a);
        c13212a.onTabSelected(getTabAt(0));
    }

    public VoiceGiftWallTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
