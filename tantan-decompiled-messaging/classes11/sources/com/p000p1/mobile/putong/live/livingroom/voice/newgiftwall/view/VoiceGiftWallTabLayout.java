package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftTab;
import java.util.List;
import l.e30;
import l.i3c0;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceGiftWallTabLayout extends TabLayout {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.newgiftwall.view.VoiceGiftWallTabLayout$a */
    public class C0451a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f7389a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f7390b;

        public C0451a(e30 e30Var, List list) {
            this.f7389a = e30Var;
            this.f7390b = list;
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            tab.getCustomView().setSelected(true);
            tab.getCustomView().setTextColor(Color.parseColor("#CCFFFFFF"));
            this.f7389a.call((GiftTab) this.f7390b.get(tab.getPosition()));
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            tab.getCustomView().setSelected(false);
            tab.getCustomView().setTextColor(Color.parseColor("#66ffffff"));
        }
    }

    public VoiceGiftWallTabLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m8904a(List<GiftTab> list, e30<GiftTab> e30Var) {
        removeAllTabs();
        clearOnTabSelectedListeners();
        if (vwb.J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            TabLayout.Tab tabNewTab = newTab();
            VText vText = new VText(getContext());
            GiftTab giftTab = list.get(i);
            vText.setPadding(t100.d(13.0f), t100.d(6.0f), t100.d(13.0f), t100.d(6.0f));
            vText.setText(giftTab.name);
            vText.setBackgroundResource(i3c0.X6);
            vText.setTextSize(14.0f);
            vText.setSingleLine(true);
            vText.setTextColor(Color.parseColor("#66ffffff"));
            int i2 = xdl0.f;
            vText.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
            tabNewTab.setCustomView(vText);
            addTab(tabNewTab);
        }
        C0451a c0451a = new C0451a(e30Var, list);
        addOnTabSelectedListener(c0451a);
        c0451a.onTabSelected(getTabAt(0));
    }

    public VoiceGiftWallTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
