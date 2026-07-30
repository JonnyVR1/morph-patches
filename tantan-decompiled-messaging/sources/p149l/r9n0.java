package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.items.switchview.VoiceSwitchItemView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class r9n0 extends duo0 {
    public r9n0(String str, CharSequence charSequence, int i, BLiveSettingButtonCategory bLiveSettingButtonCategory) {
        super(str, charSequence, i, bLiveSettingButtonCategory);
    }

    @Override // p149l.tb3, p149l.d1q
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo70566u(final VoiceSwitchItemView voiceSwitchItemView) {
        mo109662A(new View.OnClickListener() { // from class: l.q9n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153454a.m178459S(voiceSwitchItemView, view);
            }
        });
        super.mo70566u(voiceSwitchItemView);
        voiceSwitchItemView.m77791c(this.f169212f.toString(), this.f169211e, ((hdv) ypv.m215673l(fld0.f98150e)).f107303i.get().booleanValue());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m178459S(VoiceSwitchItemView voiceSwitchItemView, View view) {
        fld0<hdv> fld0Var = fld0.f98150e;
        boolean zBooleanValue = ((hdv) ypv.m215673l(fld0Var)).f107303i.get().booleanValue();
        lkm0.m150376d(this.f169207a, this.f169208b, this.f88005m.f44435id, !zBooleanValue);
        ((hdv) ypv.m215673l(fld0Var)).f107303i.put(Boolean.valueOf(!zBooleanValue));
        if (NullChecker.m81303a(voiceSwitchItemView)) {
            voiceSwitchItemView.m77792d(!zBooleanValue, true);
        }
    }
}
