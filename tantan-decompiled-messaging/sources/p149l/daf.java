package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputGameLevel;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputGameName;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputGameTogether;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputGameVoice;
import com.p046p1.mobile.putong.data.ExtensionGame;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class daf extends AbstractC8639c {

    /* JADX INFO: renamed from: A */
    public List<String> f85223A;

    /* JADX INFO: renamed from: B */
    public List<ExpEditProfileUploadImageView> f85224B;

    /* JADX INFO: renamed from: u */
    public View f85225u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f85226v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f85227w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f85228x;

    /* JADX INFO: renamed from: y */
    public ExpEditItemView f85229y;

    /* JADX INFO: renamed from: z */
    public ExpEditItemView f85230z;

    /* JADX INFO: renamed from: l.daf$a */
    public class C16327a implements ExpEditProfileUploadImageView.InterfaceC8630b {
        public C16327a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8630b
        /* JADX INFO: renamed from: a */
        public void mo50942a(String str) {
            if (daf.this.f85223A.size() >= 3) {
                return;
            }
            daf.this.f85223A.add(str);
            daf dafVar = daf.this;
            dafVar.m110604g0(dafVar.f85223A);
            daf.this.m51172x().m94569i2().profile.extensions.game.screenshot = daf.this.f85223A;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8630b
        /* JADX INFO: renamed from: b */
        public void mo50943b(String str) {
            daf.this.f85223A.remove(str);
            daf dafVar = daf.this;
            dafVar.m110604g0(dafVar.f85223A);
            daf.this.m51172x().m94569i2().profile.extensions.game.screenshot = daf.this.f85223A;
        }
    }

    public daf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f85223A = new ArrayList();
        this.f85224B = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m110598b0(View view) {
        fif.m121508c(m51157i(), new ExpLoopInputGameName());
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m110599a0(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iM208412y0 = xdl0.m208412y0() - (t100.f167268q * 2);
        int i = t100.f167259h;
        int i2 = ((iM208412y0 - (i * 2)) - (i * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m50935L(m51172x().act(), mo51160l(), new C16327a());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m110600c0(View view) {
        fif.m121508c(m51157i(), new ExpLoopInputGameTogether());
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m110601d0(View view) {
        fif.m121508c(m51157i(), new ExpLoopInputGameLevel());
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m110602e0(View view) {
        fif.m121508c(m51157i(), new ExpLoopInputGameVoice());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m110603f0(View view) {
        if (vwb.m200296J(this.f85224B) || this.f85223A.size() >= 3) {
            return;
        }
        this.f85224B.get(1).m50941S();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m110604g0(List<String> list) {
        int i = 0;
        while (i < this.f85224B.size()) {
            String str = i < list.size() ? list.get(i) : null;
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f85224B.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m50940R(str);
            }
            i++;
        }
        xdl0.m208344M(this.f85225u, !list.isEmpty());
        boolean zIsEmpty = list.isEmpty();
        ExpEditItemView expEditItemView = this.f85230z;
        if (zIsEmpty) {
            expEditItemView.m50828c("添加", 1);
        } else {
            expEditItemView.m50826a();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: l */
    public int mo51160l() {
        return 15;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "游戏日常";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "game";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        this.f85224B.add((ExpEditProfileUploadImageView) this.f85225u.findViewById(u4c0.f173926M5));
        this.f85224B.add((ExpEditProfileUploadImageView) this.f85225u.findViewById(u4c0.f173943N5));
        this.f85224B.add((ExpEditProfileUploadImageView) this.f85225u.findViewById(u4c0.f173960O5));
        vwb.m200354z(this.f85224B, new e30() { // from class: l.x9f
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191620a.m110599a0((ExpEditProfileUploadImageView) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: w */
    public void mo51171w(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f85224B) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m50939Q(picture);
                    return;
                }
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f85226v = expEditItemView;
        expEditItemView.m50829d("游戏名称", x2c0.f190535rs);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f85227w = expEditItemView2;
        expEditItemView2.m50829d("想找人一起", x2c0.f189246Cs);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f85228x = expEditItemView3;
        expEditItemView3.m50829d("段位", x2c0.f190567ss);
        ExpEditItemView expEditItemView4 = new ExpEditItemView(viewGroup.getContext());
        this.f85229y = expEditItemView4;
        expEditItemView4.m50829d("开麦", x2c0.f189310Es);
        ExpEditItemView expEditItemView5 = new ExpEditItemView(viewGroup.getContext());
        this.f85230z = expEditItemView5;
        expEditItemView5.m50829d("游戏截图", x2c0.f189622Os);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f85226v);
        linearLayout.addView(this.f85226v.getDividerView());
        linearLayout.addView(this.f85227w);
        linearLayout.addView(this.f85227w.getDividerView());
        linearLayout.addView(this.f85228x);
        linearLayout.addView(this.f85228x.getDividerView());
        linearLayout.addView(this.f85229y);
        linearLayout.addView(this.f85229y.getDividerView());
        linearLayout.addView(this.f85230z);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96048v9, (ViewGroup) linearLayout, false);
        this.f85225u = viewInflate;
        linearLayout.addView(viewInflate);
        return linearLayout;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        if (m51154f().profile.extensions.game == null) {
            m51154f().profile.extensions.game = ExtensionGame.new_();
        }
        m51154f().profile.extensions.game.nullCheck();
        m51226Q(this.f85226v, et4.m117971a("、", m51154f().profile.extensions.game.name));
        m51226Q(this.f85227w, et4.m117971a("、", m51154f().profile.extensions.game.together));
        m51226Q(this.f85228x, (String) pc8.m168316t0(m51154f().profile.extensions.game.level));
        m51226Q(this.f85229y, (String) pc8.m168316t0(m51154f().profile.extensions.game.voice));
        List<String> list = m51172x().m94569i2().profile.extensions.game.screenshot;
        this.f85223A = list;
        m110604g0(list);
        xdl0.m208329E0(this.f85226v, new View.OnClickListener() { // from class: l.y9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196963a.m110598b0(view);
            }
        });
        xdl0.m208329E0(this.f85227w, new View.OnClickListener() { // from class: l.z9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202290a.m110600c0(view);
            }
        });
        xdl0.m208329E0(this.f85228x, new View.OnClickListener() { // from class: l.aaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68551a.m110601d0(view);
            }
        });
        xdl0.m208329E0(this.f85229y, new View.OnClickListener() { // from class: l.baf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74674a.m110602e0(view);
            }
        });
        xdl0.m208329E0(this.f85230z, new View.OnClickListener() { // from class: l.caf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80028a.m110603f0(view);
            }
        });
    }
}
