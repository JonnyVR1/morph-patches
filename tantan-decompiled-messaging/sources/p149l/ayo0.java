package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import java.util.Locale;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class ayo0<D extends nnn0> extends wjm0<yxo0<D>, D> {
    public ayo0(bsm<D> bsmVar, VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView) {
        super(bsmVar);
        mo51532C(new yxo0(voiceUserCardMedalAndNameView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m99575o4(User user) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((yxo0) v2).m216477j(((idv) ypv.m215673l(fld0.f98147b)).m135637i(m203476g4().userId()));
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        ((yxo0) this.viewModel).f200647a.m200967l();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        ((yxo0) this.viewModel).f200647a.m200963C(this);
        ((yxo0) this.viewModel).m216478k(mo181707h4() == null ? null : mo181707h4().f146688c);
        m207199N3(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).subscribe(ffw.m121193d(new e30() { // from class: l.zxo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205477a.m99575o4((User) obj);
            }
        }));
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: Y3 */
    public void mo99577Y3(User user) {
        ((yxo0) this.viewModel).m216477j(user);
    }

    /* JADX INFO: renamed from: m4 */
    public String m99578m4(User user, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (user.isMe() || user.isHideLocationFromSVip()) {
            return String.format(Locale.getDefault(), "%s%s", charSequence, ypv.f199497e.getString(R$string.f47332k));
        }
        Locale locale = Locale.getDefault();
        String string = ypv.f199497e.getString(R$string.f47332k);
        if (TextUtils.isEmpty(charSequence3)) {
            charSequence3 = "";
        }
        return String.format(locale, "%s%s，%s %s", charSequence, string, charSequence3, charSequence2);
    }

    /* JADX INFO: renamed from: n4 */
    public p1k0 m99579n4() {
        return m203474e4().mo181707h4();
    }
}
