package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileItemTextView;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ene extends ep90 {

    /* JADX INFO: renamed from: A */
    public VImage f94764A;

    /* JADX INFO: renamed from: B */
    public VImage f94765B;

    /* JADX INFO: renamed from: C */
    public VLinear f94766C;

    /* JADX INFO: renamed from: D */
    public EditProfileGameImageView f94767D;

    /* JADX INFO: renamed from: E */
    public EditProfileGameImageView f94768E;

    /* JADX INFO: renamed from: F */
    public EditProfileGameImageView f94769F;

    /* JADX INFO: renamed from: G */
    public List<String> f94770G;

    /* JADX INFO: renamed from: H */
    public List<EditProfileGameImageView> f94771H;

    /* JADX INFO: renamed from: u */
    public EditProfileItemTextView f94772u;

    /* JADX INFO: renamed from: v */
    public EditProfileItemTextView f94773v;

    /* JADX INFO: renamed from: w */
    public EditProfileItemTextView f94774w;

    /* JADX INFO: renamed from: x */
    public EditProfileItemTextView f94775x;

    /* JADX INFO: renamed from: y */
    public VLinear f94776y;

    /* JADX INFO: renamed from: z */
    public VLinear f94777z;

    /* JADX INFO: renamed from: l.ene$a */
    public class C16799a implements EditProfileGameImageView.InterfaceC8904b {
        public C16799a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView.InterfaceC8904b
        /* JADX INFO: renamed from: a */
        public void mo54094a(String str) {
            if (ene.this.f94770G != null) {
                ene.this.f94770G.add(str);
            }
            ene eneVar = ene.this;
            eneVar.m121537j0(eneVar.f94770G);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView.InterfaceC8904b
        /* JADX INFO: renamed from: b */
        public void mo54095b(String str) {
            if (ene.this.f94770G != null) {
                ene.this.f94770G.remove(str);
            }
            ene eneVar = ene.this;
            eneVar.m121537j0(eneVar.f94770G);
        }
    }

    public ene(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m121534b0() {
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(60.0f)) / 3;
        bnl0.m105507D0(iM105592y0, this.f94767D, this.f94768E, this.f94769F);
        bnl0.m105505C0(this.f94767D, iM105592y0);
        bnl0.m105505C0(this.f94768E, iM105592y0);
        bnl0.m105505C0(this.f94769F, iM105592y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m121535d0(View view) {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.GAME_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m121536e0(View view) {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.GAME_TOGETHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m121537j0(List<String> list) {
        if (this.f94771H == null) {
            return;
        }
        this.f94770G = td8.m190607q0(list);
        int i = 0;
        while (i < 3) {
            String str = i < this.f94770G.size() ? this.f94770G.get(i) : null;
            EditProfileGameImageView editProfileGameImageView = this.f94771H.get(i);
            if (!TextUtils.equals(editProfileGameImageView.getImageUrl(), str)) {
                editProfileGameImageView.m54092P(str);
            }
            i++;
        }
        bnl0.m105524M(this.f94764A, this.f94770G.isEmpty());
        bnl0.m105524M(this.f94765B, !this.f94770G.isEmpty());
        bnl0.m105524M(this.f94766C, !this.f94770G.isEmpty());
        mo53983O().m189086i2().profile.extensions.game.screenshot = this.f94770G;
    }

    /* JADX INFO: renamed from: a0 */
    public View m121538a0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fne.m126365b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m121539c0(EditProfileGameImageView editProfileGameImageView) {
        editProfileGameImageView.m54090G(mo53983O().act(), new C16799a());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m121540f0(View view) {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.GAME_LEVEL);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m121541g0(View view) {
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.GAME_VOICE);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m121542h0(View view) {
        if (!NullChecker.m82486a(this.f94770G) || this.f94770G.size() >= 3) {
            return;
        }
        this.f94767D.m54093Q();
    }

    /* JADX INFO: renamed from: i0 */
    public void m121543i0(List<Media> list) {
        Media media = list.get(0);
        if ((media instanceof Picture) && NullChecker.m82486a(this.f94771H)) {
            Picture picture = (Picture) media;
            for (EditProfileGameImageView editProfileGameImageView : this.f94771H) {
                if (TextUtils.isEmpty(editProfileGameImageView.getImageUrl())) {
                    editProfileGameImageView.m54091O(picture);
                    return;
                }
            }
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f94766C.post(new Runnable() { // from class: l.cne
            @Override // java.lang.Runnable
            public final void run() {
                this.f82714a.m121534b0();
            }
        });
        ArrayList arrayListM147507f0 = jyb.m147507f0(this.f94767D, this.f94768E, this.f94769F);
        this.f94771H = arrayListM147507f0;
        jyb.m147537z(arrayListM147507f0, new y20() { // from class: l.dne
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89795a.m121539c0((EditProfileGameImageView) obj);
            }
        });
        this.f94772u.setTitle("游戏名称");
        this.f94773v.setTitle("跟人一起玩");
        this.f94774w.setTitle("段位");
        this.f94775x.setTitle("开麦");
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m121538a0(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        if (mo53983O().m189086i2().profile.extensions.game == null) {
            mo53983O().m189086i2().profile.extensions.game = ExtensionGame.new_();
        }
        mo53983O().m189086i2().profile.extensions.game.nullCheck();
        this.f94770G = new ArrayList();
        this.f94772u.setValue(du4.m118067a("、", mo53983O().m189086i2().profile.extensions.game.name));
        this.f94773v.setValue(du4.m118067a("、", mo53983O().m189086i2().profile.extensions.game.together));
        this.f94774w.setValue((String) td8.m190610t0(mo53983O().m189086i2().profile.extensions.game.level));
        this.f94775x.setValue((String) td8.m190610t0(mo53983O().m189086i2().profile.extensions.game.voice));
        m121537j0(mo53983O().m189086i2().profile.extensions.game.screenshot);
        bnl0.m105509E0(this.f94772u, new View.OnClickListener() { // from class: l.xme
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195077a.m121535d0(view);
            }
        });
        bnl0.m105509E0(this.f94773v, new View.OnClickListener() { // from class: l.yme
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200656a.m121536e0(view);
            }
        });
        bnl0.m105509E0(this.f94774w, new View.OnClickListener() { // from class: l.zme
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205063a.m121540f0(view);
            }
        });
        bnl0.m105509E0(this.f94775x, new View.OnClickListener() { // from class: l.ane
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72344a.m121541g0(view);
            }
        });
        bnl0.m105509E0(this.f94777z, new View.OnClickListener() { // from class: l.bne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77461a.m121542h0(view);
            }
        });
    }
}
