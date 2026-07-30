package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.Locale;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.nnn0;
import l.p1k0;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ayo0<D extends nnn0> extends wjm0<yxo0<D>, D> {
    public ayo0(bsm<D> bsmVar, VoiceUserCardMedalAndNameView voiceUserCardMedalAndNameView) {
        super(bsmVar);
        C(new yxo0(voiceUserCardMedalAndNameView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m11774o4(User user) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((yxo0) s7mVar).m25546j(((idv) ypv.m25491l(fld0.f13076b)).m16499i(m24303g4().userId()));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m11775O3() {
        super.O3();
        ((yxo0) ((bwr) this).viewModel).f23275a.l();
    }

    /* JADX INFO: renamed from: P3 */
    public void m11776P3() {
        super.P3();
        ((yxo0) ((bwr) this).viewModel).f23275a.C(this);
        ((yxo0) ((bwr) this).viewModel).m25547k(mo21933h4() == null ? null : mo21933h4().c);
        N3(((idv) ypv.m25491l(fld0.f13076b)).m16497g()).subscribe(ffw.d(new e30() { // from class: l.zxo0
            public final void call(Object obj) {
                this.f24032a.m11774o4((User) obj);
            }
        }));
    }

    @Override // p009l.wjm0
    /* JADX INFO: renamed from: Y3 */
    public void mo11777Y3(User user) {
        ((yxo0) ((bwr) this).viewModel).m25546j(user);
    }

    /* JADX INFO: renamed from: m4 */
    public String m11778m4(User user, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (user.isMe() || user.isHideLocationFromSVip()) {
            return String.format(Locale.getDefault(), "%s%s", charSequence, ypv.f23200e.getString(R.string.k));
        }
        Locale locale = Locale.getDefault();
        String string = ypv.f23200e.getString(R.string.k);
        if (TextUtils.isEmpty(charSequence3)) {
            charSequence3 = "";
        }
        return String.format(locale, "%s%s，%s %s", charSequence, string, charSequence3, charSequence2);
    }

    /* JADX INFO: renamed from: n4 */
    public p1k0 m11779n4() {
        return m24301e4().mo21933h4();
    }
}
