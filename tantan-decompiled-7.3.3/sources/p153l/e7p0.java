package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import java.util.Locale;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class e7p0<D extends rwn0> extends atm0<c7p0<D>, D> {
    public e7p0(dum<D> dumVar, VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView) {
        super(dumVar);
        mo52715C(new c7p0(voiceUserCardMedalAndNameView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m119763o4(User user) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((c7p0) v2).m108320j(((jfv) zrv.m221194l(htd0.f111520b)).m144722i(m100218g4().userId()));
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        ((c7p0) this.viewModel).f80128a.m209279l();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        ((c7p0) this.viewModel).f80128a.m209275C(this);
        ((c7p0) this.viewModel).m108321k(mo100219h4() == null ? null : mo100219h4().f183108c);
        m214779N3(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).subscribe(dhw.m115825d(new y20() { // from class: l.d7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85540a.m119763o4((User) obj);
            }
        }));
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: Y3 */
    public void mo100210Y3(User user) {
        ((c7p0) this.viewModel).m108320j(user);
    }

    /* JADX INFO: renamed from: m4 */
    public String m119764m4(User user, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (user.isMe() || user.isHideLocationFromSVip()) {
            return String.format(Locale.getDefault(), "%s%s", charSequence, zrv.f205803e.getString(R$string.f48180k));
        }
        Locale locale = Locale.getDefault();
        String string = zrv.f205803e.getString(R$string.f48180k);
        if (TextUtils.isEmpty(charSequence3)) {
            charSequence3 = "";
        }
        return String.format(locale, "%s%s，%s %s", charSequence, string, charSequence3, charSequence2);
    }

    /* JADX INFO: renamed from: n4 */
    public vak0 m119765n4() {
        return m100216e4().mo100219h4();
    }
}
