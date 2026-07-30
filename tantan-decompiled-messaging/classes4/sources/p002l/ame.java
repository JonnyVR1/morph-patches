package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileGameImageView;
import com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileItemTextView;
import com.p1.mobile.putong.data.ExtensionGame;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bme;
import l.e30;
import l.et4;
import l.mcr;
import l.pc8;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ame extends ah90 {

    /* JADX INFO: renamed from: A */
    public VImage f7737A;

    /* JADX INFO: renamed from: B */
    public VImage f7738B;

    /* JADX INFO: renamed from: C */
    public VLinear f7739C;

    /* JADX INFO: renamed from: D */
    public EditProfileGameImageView f7740D;

    /* JADX INFO: renamed from: E */
    public EditProfileGameImageView f7741E;

    /* JADX INFO: renamed from: F */
    public EditProfileGameImageView f7742F;

    /* JADX INFO: renamed from: G */
    public List<String> f7743G;

    /* JADX INFO: renamed from: H */
    public List<EditProfileGameImageView> f7744H;

    /* JADX INFO: renamed from: u */
    public EditProfileItemTextView f7745u;

    /* JADX INFO: renamed from: v */
    public EditProfileItemTextView f7746v;

    /* JADX INFO: renamed from: w */
    public EditProfileItemTextView f7747w;

    /* JADX INFO: renamed from: x */
    public EditProfileItemTextView f7748x;

    /* JADX INFO: renamed from: y */
    public VLinear f7749y;

    /* JADX INFO: renamed from: z */
    public VLinear f7750z;

    /* JADX INFO: renamed from: l.ame$a */
    public class C0491a implements EditProfileGameImageView.InterfaceC0166b {
        public C0491a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileGameImageView.InterfaceC0166b
        /* JADX INFO: renamed from: a */
        public void mo3466a(String str) {
            if (ame.this.f7743G != null) {
                ame.this.f7743G.add(str);
            }
            ame ameVar = ame.this;
            ameVar.m9907j0(ameVar.f7743G);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.EditProfileGameImageView.InterfaceC0166b
        /* JADX INFO: renamed from: b */
        public void mo3467b(String str) {
            if (ame.this.f7743G != null) {
                ame.this.f7743G.remove(str);
            }
            ame ameVar = ame.this;
            ameVar.m9907j0(ameVar.f7743G);
        }
    }

    public ame(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m9904b0() {
        int iY0 = (xdl0.y0() - t100.d(60.0f)) / 3;
        xdl0.D0(iY0, new View[]{this.f7740D, this.f7741E, this.f7742F});
        xdl0.C0(this.f7740D, iY0);
        xdl0.C0(this.f7741E, iY0);
        xdl0.C0(this.f7742F, iY0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m9905d0(View view) {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.GAME_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m9906e0(View view) {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.GAME_TOGETHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m9907j0(List<String> list) {
        if (this.f7744H == null) {
            return;
        }
        this.f7743G = pc8.q0(list);
        int i = 0;
        while (i < 3) {
            String str = i < this.f7743G.size() ? this.f7743G.get(i) : null;
            EditProfileGameImageView editProfileGameImageView = this.f7744H.get(i);
            if (!TextUtils.equals(editProfileGameImageView.getImageUrl(), str)) {
                editProfileGameImageView.m3462P(str);
            }
            i++;
        }
        xdl0.M(this.f7737A, this.f7743G.isEmpty());
        xdl0.M(this.f7738B, !this.f7743G.isEmpty());
        xdl0.M(this.f7739C, !this.f7743G.isEmpty());
        mo3351O().m9268i2().profile.extensions.game.screenshot = this.f7743G;
    }

    /* JADX INFO: renamed from: a0 */
    public View m9908a0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bme.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m9909c0(EditProfileGameImageView editProfileGameImageView) {
        editProfileGameImageView.m3460G(mo3351O().act(), new C0491a());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m9910f0(View view) {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.GAME_LEVEL);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m9911g0(View view) {
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.GAME_VOICE);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m9912h0(View view) {
        if (!NullChecker.a(this.f7743G) || this.f7743G.size() >= 3) {
            return;
        }
        this.f7740D.m3463Q();
    }

    /* JADX INFO: renamed from: i0 */
    public void m9913i0(List<Media> list) {
        Picture picture = (Media) list.get(0);
        if ((picture instanceof Picture) && NullChecker.a(this.f7744H)) {
            Picture picture2 = picture;
            for (EditProfileGameImageView editProfileGameImageView : this.f7744H) {
                if (TextUtils.isEmpty(editProfileGameImageView.getImageUrl())) {
                    editProfileGameImageView.m3461O(picture2);
                    return;
                }
            }
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f7739C.post(new Runnable() { // from class: l.yle
            @Override // java.lang.Runnable
            public final void run() {
                this.f22965a.m9904b0();
            }
        });
        ArrayList arrayListF0 = vwb.f0(new EditProfileGameImageView[]{this.f7740D, this.f7741E, this.f7742F});
        this.f7744H = arrayListF0;
        vwb.z(arrayListF0, new e30() { // from class: l.zle
            public final void call(Object obj) {
                this.f23495a.m9909c0((EditProfileGameImageView) obj);
            }
        });
        this.f7745u.setTitle("游戏名称");
        this.f7746v.setTitle("跟人一起玩");
        this.f7747w.setTitle("段位");
        this.f7748x.setTitle("开麦");
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m9908a0(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        if (mo3351O().m9268i2().profile.extensions.game == null) {
            mo3351O().m9268i2().profile.extensions.game = ExtensionGame.new_();
        }
        mo3351O().m9268i2().profile.extensions.game.nullCheck();
        this.f7743G = new ArrayList();
        this.f7745u.setValue(et4.a("、", mo3351O().m9268i2().profile.extensions.game.name));
        this.f7746v.setValue(et4.a("、", mo3351O().m9268i2().profile.extensions.game.together));
        this.f7747w.setValue((String) pc8.t0(mo3351O().m9268i2().profile.extensions.game.level));
        this.f7748x.setValue((String) pc8.t0(mo3351O().m9268i2().profile.extensions.game.voice));
        m9907j0(mo3351O().m9268i2().profile.extensions.game.screenshot);
        xdl0.E0(this.f7745u, new View.OnClickListener() { // from class: l.tle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20299a.m9905d0(view);
            }
        });
        xdl0.E0(this.f7746v, new View.OnClickListener() { // from class: l.ule
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20699a.m9906e0(view);
            }
        });
        xdl0.E0(this.f7747w, new View.OnClickListener() { // from class: l.vle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21216a.m9910f0(view);
            }
        });
        xdl0.E0(this.f7748x, new View.OnClickListener() { // from class: l.wle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21822a.m9911g0(view);
            }
        });
        xdl0.E0(this.f7750z, new View.OnClickListener() { // from class: l.xle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22347a.m9912h0(view);
            }
        });
    }
}
