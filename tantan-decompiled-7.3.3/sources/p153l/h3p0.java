package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.items.switchview.VoiceSwitchItemView;

/* JADX INFO: loaded from: classes5.dex */
public class h3p0 extends ic3<VoiceSwitchItemView> {

    /* JADX INFO: renamed from: l */
    public VoiceSwitchItemView f107680l;

    /* JADX INFO: renamed from: m */
    public BLiveSettingButtonCategory f107681m;

    public h3p0(String str, CharSequence charSequence, int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        super(str, charSequence, i, bLiveSettingButtonCategory.sort, bLiveSettingButtonCategory.name);
        this.f107681m = bLiveSettingButtonCategory;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo72182m(VoiceSwitchItemView voiceSwitchItemView) {
        super.mo72182m(voiceSwitchItemView);
    }

    /* JADX INFO: renamed from: P */
    public void mo133515P(VoiceSwitchItemView voiceSwitchItemView) {
        super.mo71749u(voiceSwitchItemView);
        voiceSwitchItemView.mo73321g0(false);
        this.f107680l = voiceSwitchItemView;
        m133516Q();
    }

    /* JADX INFO: renamed from: Q */
    public final void m133516Q() {
        this.f107680l.f48920i.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        this.f107680l.f48920i.setTextSize(12.0f);
        this.f107680l.f48917f.setBackground(n3d0.m161278b(obc0.f146184S6));
        this.f107680l.f48918g.setBackground(n3d0.m161278b(obc0.f146173R6));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199269u5;
    }
}
