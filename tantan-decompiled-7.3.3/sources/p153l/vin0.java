package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.items.switchview.VoiceSwitchItemView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class vin0 extends h3p0 {
    public vin0(String str, CharSequence charSequence, int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        super(str, charSequence, i, bLiveSettingButtonCategory);
    }

    @Override // p153l.ic3, p153l.d3q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo71749u(final VoiceSwitchItemView voiceSwitchItemView) {
        mo113881A(new View.OnClickListener() { // from class: l.uin0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179137a.m201405S(voiceSwitchItemView, view);
            }
        });
        super.mo71749u(voiceSwitchItemView);
        voiceSwitchItemView.m78974c(this.f114275f.toString(), this.f114274e, ((ifv) zrv.m221194l(htd0.f111523e)).f114700i.get().booleanValue());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m201405S(VoiceSwitchItemView voiceSwitchItemView, View view) {
        htd0<ifv> htd0Var = htd0.f111523e;
        boolean zBooleanValue = ((ifv) zrv.m221194l(htd0Var)).f114700i.get().booleanValue();
        ptm0.m173771d(this.f114270a, this.f114271b, this.f107681m.f45283id, !zBooleanValue);
        ((ifv) zrv.m221194l(htd0Var)).f114700i.put(Boolean.valueOf(!zBooleanValue));
        if (NullChecker.m82486a(voiceSwitchItemView)) {
            voiceSwitchItemView.m78975d(!zBooleanValue, true);
        }
    }
}
