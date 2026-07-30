package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputGameLevel;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputGameName;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputGameTogether;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputGameVoice;
import com.p051p1.mobile.putong.data.ExtensionGame;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jbf extends AbstractC8802c {

    /* JADX INFO: renamed from: A */
    public List<String> f119863A;

    /* JADX INFO: renamed from: B */
    public List<ExpEditProfileUploadImageView> f119864B;

    /* JADX INFO: renamed from: u */
    public View f119865u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f119866v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f119867w;

    /* JADX INFO: renamed from: x */
    public ExpEditItemView f119868x;

    /* JADX INFO: renamed from: y */
    public ExpEditItemView f119869y;

    /* JADX INFO: renamed from: z */
    public ExpEditItemView f119870z;

    /* JADX INFO: renamed from: l.jbf$a */
    public class C17915a implements ExpEditProfileUploadImageView.InterfaceC8793b {
        public C17915a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8793b
        /* JADX INFO: renamed from: a */
        public void mo52125a(String str) {
            if (jbf.this.f119863A.size() >= 3) {
                return;
            }
            jbf.this.f119863A.add(str);
            jbf jbfVar = jbf.this;
            jbfVar.m144216g0(jbfVar.f119863A);
            jbf.this.m52355x().m189086i2().profile.extensions.game.screenshot = jbf.this.f119863A;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView.InterfaceC8793b
        /* JADX INFO: renamed from: b */
        public void mo52126b(String str) {
            jbf.this.f119863A.remove(str);
            jbf jbfVar = jbf.this;
            jbfVar.m144216g0(jbfVar.f119863A);
            jbf.this.m52355x().m189086i2().profile.extensions.game.screenshot = jbf.this.f119863A;
        }
    }

    public jbf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f119863A = new ArrayList();
        this.f119864B = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m144210b0(View view) {
        ljf.m154506c(m52340i(), new ExpLoopInputGameName());
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m144211a0(ExpEditProfileUploadImageView expEditProfileUploadImageView) {
        int iM105592y0 = bnl0.m105592y0() - (qa00.f156330q * 2);
        int i = qa00.f156321h;
        int i2 = ((iM105592y0 - (i * 2)) - (i * 2)) / 3;
        ViewGroup.LayoutParams layoutParams = expEditProfileUploadImageView.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i2;
        expEditProfileUploadImageView.setLayoutParams(layoutParams);
        expEditProfileUploadImageView.m52118L(m52355x().act(), mo52343l(), new C17915a());
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m144212c0(View view) {
        ljf.m154506c(m52340i(), new ExpLoopInputGameTogether());
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m144213d0(View view) {
        ljf.m154506c(m52340i(), new ExpLoopInputGameLevel());
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m144214e0(View view) {
        ljf.m154506c(m52340i(), new ExpLoopInputGameVoice());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m144215f0(View view) {
        if (jyb.m147479J(this.f119864B) || this.f119863A.size() >= 3) {
            return;
        }
        this.f119864B.get(1).m52124S();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m144216g0(List<String> list) {
        int i = 0;
        while (i < this.f119864B.size()) {
            String str = i < list.size() ? list.get(i) : null;
            ExpEditProfileUploadImageView expEditProfileUploadImageView = this.f119864B.get(i);
            if (!TextUtils.equals(expEditProfileUploadImageView.getImageUrl(), str)) {
                expEditProfileUploadImageView.m52123R(str);
            }
            i++;
        }
        bnl0.m105524M(this.f119865u, !list.isEmpty());
        boolean zIsEmpty = list.isEmpty();
        ExpEditItemView expEditItemView = this.f119870z;
        if (zIsEmpty) {
            expEditItemView.m52011c("添加", 1);
        } else {
            expEditItemView.m52009a();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: l */
    public int mo52343l() {
        return 15;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "游戏日常";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "game";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        this.f119864B.add((ExpEditProfileUploadImageView) this.f119865u.findViewById(adc0.f70048O5));
        this.f119864B.add((ExpEditProfileUploadImageView) this.f119865u.findViewById(adc0.f70065P5));
        this.f119864B.add((ExpEditProfileUploadImageView) this.f119865u.findViewById(adc0.f70082Q5));
        jyb.m147537z(this.f119864B, new y20() { // from class: l.dbf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87661a.m144211a0((ExpEditProfileUploadImageView) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: w */
    public void mo52354w(List<Media> list) {
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            for (ExpEditProfileUploadImageView expEditProfileUploadImageView : this.f119864B) {
                if (TextUtils.isEmpty(expEditProfileUploadImageView.getImageUrl())) {
                    expEditProfileUploadImageView.m52122Q(picture);
                    return;
                }
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f119866v = expEditItemView;
        expEditItemView.m52012d("游戏名称", dbc0.f87002ft);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f119867w = expEditItemView2;
        expEditItemView2.m52012d("想找人一起", dbc0.f87396rt);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f119868x = expEditItemView3;
        expEditItemView3.m52012d("段位", dbc0.f87035gt);
        ExpEditItemView expEditItemView4 = new ExpEditItemView(viewGroup.getContext());
        this.f119869y = expEditItemView4;
        expEditItemView4.m52012d("开麦", dbc0.f87462tt);
        ExpEditItemView expEditItemView5 = new ExpEditItemView(viewGroup.getContext());
        this.f119870z = expEditItemView5;
        expEditItemView5.m52012d("游戏截图", dbc0.f86102Dt);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f119866v);
        linearLayout.addView(this.f119866v.getDividerView());
        linearLayout.addView(this.f119867w);
        linearLayout.addView(this.f119867w.getDividerView());
        linearLayout.addView(this.f119868x);
        linearLayout.addView(this.f119868x.getDividerView());
        linearLayout.addView(this.f119869y);
        linearLayout.addView(this.f119869y.getDividerView());
        linearLayout.addView(this.f119870z);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f125359C9, (ViewGroup) linearLayout, false);
        this.f119865u = viewInflate;
        linearLayout.addView(viewInflate);
        return linearLayout;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        if (m52337f().profile.extensions.game == null) {
            m52337f().profile.extensions.game = ExtensionGame.new_();
        }
        m52337f().profile.extensions.game.nullCheck();
        m52409Q(this.f119866v, du4.m118067a("、", m52337f().profile.extensions.game.name));
        m52409Q(this.f119867w, du4.m118067a("、", m52337f().profile.extensions.game.together));
        m52409Q(this.f119868x, (String) td8.m190610t0(m52337f().profile.extensions.game.level));
        m52409Q(this.f119869y, (String) td8.m190610t0(m52337f().profile.extensions.game.voice));
        List<String> list = m52355x().m189086i2().profile.extensions.game.screenshot;
        this.f119863A = list;
        m144216g0(list);
        bnl0.m105509E0(this.f119866v, new View.OnClickListener() { // from class: l.ebf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92921a.m144210b0(view);
            }
        });
        bnl0.m105509E0(this.f119867w, new View.OnClickListener() { // from class: l.fbf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98093a.m144212c0(view);
            }
        });
        bnl0.m105509E0(this.f119868x, new View.OnClickListener() { // from class: l.gbf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103463a.m144213d0(view);
            }
        });
        bnl0.m105509E0(this.f119869y, new View.OnClickListener() { // from class: l.hbf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108586a.m144214e0(view);
            }
        });
        bnl0.m105509E0(this.f119870z, new View.OnClickListener() { // from class: l.ibf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114208a.m144215f0(view);
            }
        });
    }
}
