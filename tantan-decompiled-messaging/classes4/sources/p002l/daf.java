package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputGameLevel;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputGameName;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputGameTogether;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputGameVoice;
import com.p1.mobile.putong.data.ExtensionGame;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.et4;
import l.f6c0;
import l.mcr;
import l.pc8;
import l.t100;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class daf extends AbstractC0064c {

    /* JADX INFO: renamed from: A */
    public List<String> f9137A;

    /* JADX INFO: renamed from: B */
    public List<ExpEditProfileUploadImageView> f9138B;

    /* JADX INFO: renamed from: u */
    public View f9139u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f9140v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f9141w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f9142x;

    /* JADX INFO: renamed from: y */
    public ExpEditItemView f9143y;

    /* JADX INFO: renamed from: z */
    public ExpEditItemView f9144z;

    /* JADX INFO: renamed from: l.daf$a */
    public class C0526a implements ExpEditProfileUploadImageView.InterfaceC0055b {
        public C0526a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC0055b
        /* JADX INFO: renamed from: a */
        public void mo1390a(String str) {
            if (daf.this.f9137A.size() >= 3) {
                return;
            }
            daf.this.f9137A.add(str);
            daf dafVar = daf.this;
            dafVar.m11714g0(dafVar.f9137A);
            daf.this.m1624x().m9268i2().profile.extensions.game.screenshot = daf.this.f9137A;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC0055b
        /* JADX INFO: renamed from: b */
        public void mo1391b(String str) {
            daf.this.f9137A.remove(str);
            daf dafVar = daf.this;
            dafVar.m11714g0(dafVar.f9137A);
            daf.this.m1624x().m9268i2().profile.extensions.game.screenshot = daf.this.f9137A;
        }
    }

    public daf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f9137A = new ArrayList();
        this.f9138B = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m11708b0(View view) {
        fif.m13250c(m1609i(), new ExpLoopInputGameName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m11709a0(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iY0 = xdl0.y0() - (t100.q * 2);
        int i = t100.h;
        int i2 = ((iY0 - (i * 2)) - (i * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m1381L(m1624x().act(), mo1612l(), new C0526a());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m11710c0(View view) {
        fif.m13250c(m1609i(), new ExpLoopInputGameTogether());
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m11711d0(View view) {
        fif.m13250c(m1609i(), new ExpLoopInputGameLevel());
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m11712e0(View view) {
        fif.m13250c(m1609i(), new ExpLoopInputGameVoice());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m11713f0(View view) {
        if (vwb.J(this.f9138B) || this.f9137A.size() >= 3) {
            return;
        }
        this.f9138B.get(1).m1387S();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m11714g0(List<String> list) {
        int i = 0;
        while (i < this.f9138B.size()) {
            String str = i < list.size() ? list.get(i) : null;
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f9138B.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m1386R(str);
            }
            i++;
        }
        xdl0.M(this.f9139u, !list.isEmpty());
        boolean zIsEmpty = list.isEmpty();
        ExpEditItemView expEditItemView = this.f9144z;
        if (zIsEmpty) {
            expEditItemView.m1274c("添加", 1);
        } else {
            expEditItemView.m1272a();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: l */
    public int mo1612l() {
        return 15;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "游戏日常";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "game";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        this.f9138B.add((ExpEditProfileUploadImageView) this.f9139u.findViewById(u4c0.M5));
        this.f9138B.add((ExpEditProfileUploadImageView) this.f9139u.findViewById(u4c0.N5));
        this.f9138B.add((ExpEditProfileUploadImageView) this.f9139u.findViewById(u4c0.O5));
        vwb.z(this.f9138B, new e30() { // from class: l.x9f
            public final void call(Object obj) {
                this.f22180a.m11709a0((ExpEditProfileUploadImageView) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: w */
    public void mo1623w(List<Media> list) {
        Picture picture = (Media) list.get(0);
        if (picture instanceof Picture) {
            Picture picture2 = picture;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f9138B) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m1385Q(picture2);
                    return;
                }
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f9140v = expEditItemView;
        expEditItemView.m1275d("游戏名称", x2c0.rs);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f9141w = expEditItemView2;
        expEditItemView2.m1275d("想找人一起", x2c0.Cs);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f9142x = expEditItemView3;
        expEditItemView3.m1275d("段位", x2c0.ss);
        ExpEditItemView expEditItemView4 = new ExpEditItemView(viewGroup.getContext());
        this.f9143y = expEditItemView4;
        expEditItemView4.m1275d("开麦", x2c0.Es);
        ExpEditItemView expEditItemView5 = new ExpEditItemView(viewGroup.getContext());
        this.f9144z = expEditItemView5;
        expEditItemView5.m1275d("游戏截图", x2c0.Os);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f9140v);
        linearLayout.addView(this.f9140v.getDividerView());
        linearLayout.addView(this.f9141w);
        linearLayout.addView(this.f9141w.getDividerView());
        linearLayout.addView(this.f9142x);
        linearLayout.addView(this.f9142x.getDividerView());
        linearLayout.addView(this.f9143y);
        linearLayout.addView(this.f9143y.getDividerView());
        linearLayout.addView(this.f9144z);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.v9, (ViewGroup) linearLayout, false);
        this.f9139u = viewInflate;
        linearLayout.addView(viewInflate);
        return linearLayout;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        if (m1606f().profile.extensions.game == null) {
            m1606f().profile.extensions.game = ExtensionGame.new_();
        }
        m1606f().profile.extensions.game.nullCheck();
        m1681Q(this.f9140v, et4.a("、", m1606f().profile.extensions.game.name));
        m1681Q(this.f9141w, et4.a("、", m1606f().profile.extensions.game.together));
        m1681Q(this.f9142x, (String) pc8.t0(m1606f().profile.extensions.game.level));
        m1681Q(this.f9143y, (String) pc8.t0(m1606f().profile.extensions.game.voice));
        List<String> list = m1624x().m9268i2().profile.extensions.game.screenshot;
        this.f9137A = list;
        m11714g0(list);
        xdl0.E0(this.f9140v, new View.OnClickListener() { // from class: l.y9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22746a.m11708b0(view);
            }
        });
        xdl0.E0(this.f9141w, new View.OnClickListener() { // from class: l.z9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23315a.m11710c0(view);
            }
        });
        xdl0.E0(this.f9142x, new View.OnClickListener() { // from class: l.aaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7473a.m11711d0(view);
            }
        });
        xdl0.E0(this.f9143y, new View.OnClickListener() { // from class: l.baf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8046a.m11712e0(view);
            }
        });
        xdl0.E0(this.f9144z, new View.OnClickListener() { // from class: l.caf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8569a.m11713f0(view);
            }
        });
    }
}
