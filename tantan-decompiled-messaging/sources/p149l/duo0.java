package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.items.switchview.VoiceSwitchItemView;

/* JADX INFO: loaded from: classes5.dex */
public class duo0 extends tb3<VoiceSwitchItemView> {

    /* JADX INFO: renamed from: l */
    public VoiceSwitchItemView f88004l;

    /* JADX INFO: renamed from: m */
    public BLiveSettingButtonCategory f88005m;

    public duo0(String str, CharSequence charSequence, int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        super(str, charSequence, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name);
        this.f88005m = bLiveSettingButtonCategory;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo70999m(VoiceSwitchItemView voiceSwitchItemView) {
        super.mo70999m(voiceSwitchItemView);
    }

    /* JADX INFO: renamed from: P */
    public void mo113743P(VoiceSwitchItemView voiceSwitchItemView) {
        super.mo70566u(voiceSwitchItemView);
        voiceSwitchItemView.mo72138g0(false);
        this.f88004l = voiceSwitchItemView;
        m113744Q();
    }

    /* JADX INFO: renamed from: Q */
    public final void m113744Q() {
        this.f88004l.f48072i.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        this.f88004l.f48072i.setTextSize(12.0f);
        this.f88004l.f48069f.setBackground(kvc0.m147353b(i3c0.f110856S6));
        this.f88004l.f48070g.setBackground(kvc0.m147353b(i3c0.f110845R6));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168537u5;
    }
}
