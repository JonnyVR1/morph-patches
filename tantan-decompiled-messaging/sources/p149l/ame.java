package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileItemTextView;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ame extends ah90 {

    /* JADX INFO: renamed from: A */
    public VImage f70578A;

    /* JADX INFO: renamed from: B */
    public VImage f70579B;

    /* JADX INFO: renamed from: C */
    public VLinear f70580C;

    /* JADX INFO: renamed from: D */
    public EditProfileGameImageView f70581D;

    /* JADX INFO: renamed from: E */
    public EditProfileGameImageView f70582E;

    /* JADX INFO: renamed from: F */
    public EditProfileGameImageView f70583F;

    /* JADX INFO: renamed from: G */
    public List<String> f70584G;

    /* JADX INFO: renamed from: H */
    public List<EditProfileGameImageView> f70585H;

    /* JADX INFO: renamed from: u */
    public EditProfileItemTextView f70586u;

    /* JADX INFO: renamed from: v */
    public EditProfileItemTextView f70587v;

    /* JADX INFO: renamed from: w */
    public EditProfileItemTextView f70588w;

    /* JADX INFO: renamed from: x */
    public EditProfileItemTextView f70589x;

    /* JADX INFO: renamed from: y */
    public VLinear f70590y;

    /* JADX INFO: renamed from: z */
    public VLinear f70591z;

    /* JADX INFO: renamed from: l.ame$a */
    public class C15666a implements EditProfileGameImageView.InterfaceC8741b {
        public C15666a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView.InterfaceC8741b
        /* JADX INFO: renamed from: a */
        public void mo52911a(String str) {
            if (ame.this.f70584G != null) {
                ame.this.f70584G.add(str);
            }
            ame ameVar = ame.this;
            ameVar.m97547j0(ameVar.f70584G);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView.InterfaceC8741b
        /* JADX INFO: renamed from: b */
        public void mo52912b(String str) {
            if (ame.this.f70584G != null) {
                ame.this.f70584G.remove(str);
            }
            ame ameVar = ame.this;
            ameVar.m97547j0(ameVar.f70584G);
        }
    }

    public ame(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m97544b0() {
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(60.0f)) / 3;
        xdl0.m208327D0(iM208412y0, this.f70581D, this.f70582E, this.f70583F);
        xdl0.m208325C0(this.f70581D, iM208412y0);
        xdl0.m208325C0(this.f70582E, iM208412y0);
        xdl0.m208325C0(this.f70583F, iM208412y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m97545d0(View view) {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.GAME_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m97546e0(View view) {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.GAME_TOGETHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m97547j0(List<String> list) {
        if (this.f70585H == null) {
            return;
        }
        this.f70584G = pc8.m168313q0(list);
        int i = 0;
        while (i < 3) {
            String str = i < this.f70584G.size() ? this.f70584G.get(i) : null;
            EditProfileGameImageView editProfileGameImageView = this.f70585H.get(i);
            if (!TextUtils.equals(editProfileGameImageView.getImageUrl(), str)) {
                editProfileGameImageView.m52909P(str);
            }
            i++;
        }
        xdl0.m208344M(this.f70578A, this.f70584G.isEmpty());
        xdl0.m208344M(this.f70579B, !this.f70584G.isEmpty());
        xdl0.m208344M(this.f70580C, !this.f70584G.isEmpty());
        mo52800O().m94569i2().profile.extensions.game.screenshot = this.f70584G;
    }

    /* JADX INFO: renamed from: a0 */
    public View m97548a0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bme.m102641b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m97549c0(EditProfileGameImageView editProfileGameImageView) {
        editProfileGameImageView.m52907G(mo52800O().act(), new C15666a());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m97550f0(View view) {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.GAME_LEVEL);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m97551g0(View view) {
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.GAME_VOICE);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m97552h0(View view) {
        if (!NullChecker.m81303a(this.f70584G) || this.f70584G.size() >= 3) {
            return;
        }
        this.f70581D.m52910Q();
    }

    /* JADX INFO: renamed from: i0 */
    public void m97553i0(List<Media> list) {
        Media media = list.get(0);
        if ((media instanceof Picture) && NullChecker.m81303a(this.f70585H)) {
            Picture picture = (Picture) media;
            for (EditProfileGameImageView editProfileGameImageView : this.f70585H) {
                if (TextUtils.isEmpty(editProfileGameImageView.getImageUrl())) {
                    editProfileGameImageView.m52908O(picture);
                    return;
                }
            }
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f70580C.post(new Runnable() { // from class: l.yle
            @Override // java.lang.Runnable
            public final void run() {
                this.f198877a.m97544b0();
            }
        });
        ArrayList arrayListM200324f0 = vwb.m200324f0(this.f70581D, this.f70582E, this.f70583F);
        this.f70585H = arrayListM200324f0;
        vwb.m200354z(arrayListM200324f0, new e30() { // from class: l.zle
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203627a.m97549c0((EditProfileGameImageView) obj);
            }
        });
        this.f70586u.setTitle("游戏名称");
        this.f70587v.setTitle("跟人一起玩");
        this.f70588w.setTitle("段位");
        this.f70589x.setTitle("开麦");
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m97548a0(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        if (mo52800O().m94569i2().profile.extensions.game == null) {
            mo52800O().m94569i2().profile.extensions.game = ExtensionGame.new_();
        }
        mo52800O().m94569i2().profile.extensions.game.nullCheck();
        this.f70584G = new ArrayList();
        this.f70586u.setValue(et4.m117971a("、", mo52800O().m94569i2().profile.extensions.game.name));
        this.f70587v.setValue(et4.m117971a("、", mo52800O().m94569i2().profile.extensions.game.together));
        this.f70588w.setValue((String) pc8.m168316t0(mo52800O().m94569i2().profile.extensions.game.level));
        this.f70589x.setValue((String) pc8.m168316t0(mo52800O().m94569i2().profile.extensions.game.voice));
        m97547j0(mo52800O().m94569i2().profile.extensions.game.screenshot);
        xdl0.m208329E0(this.f70586u, new View.OnClickListener() { // from class: l.tle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171016a.m97545d0(view);
            }
        });
        xdl0.m208329E0(this.f70587v, new View.OnClickListener() { // from class: l.ule
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177060a.m97546e0(view);
            }
        });
        xdl0.m208329E0(this.f70588w, new View.OnClickListener() { // from class: l.vle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181943a.m97550f0(view);
            }
        });
        xdl0.m208329E0(this.f70589x, new View.OnClickListener() { // from class: l.wle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186892a.m97551g0(view);
            }
        });
        xdl0.m208329E0(this.f70591z, new View.OnClickListener() { // from class: l.xle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193408a.m97552h0(view);
            }
        });
    }
}
