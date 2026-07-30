package p153l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.addemoji.AddEmojiAct;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fs90 extends bo90 {

    /* JADX INFO: renamed from: A */
    public boolean f100568A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f100569v;

    /* JADX INFO: renamed from: w */
    public VImage f100570w;

    /* JADX INFO: renamed from: x */
    public VImage f100571x;

    /* JADX INFO: renamed from: y */
    public VText f100572y;

    /* JADX INFO: renamed from: z */
    public g4b0 f100573z;

    public fs90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f100573z = new g4b0();
        this.f100568A = false;
    }

    @Override // p153l.bo90
    /* JADX INFO: renamed from: S */
    public boolean mo105673S() {
        if (mo53983O().mo52258P1()) {
            return false;
        }
        jyb.m147479J(mo53983O().mo52252K2().profile.extensions.interest.emoji);
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m127053X(boolean z) {
        i4g0.m138520r("e_other_profile_edit_emoji_banner", mo53983O().pageId());
        mo53983O().startActivity(AddEmojiAct.m56414b2(mo53983O().act(), true, !z, "other_profile"));
        mo53983O().act().overridePendingTransition(x7c0.f192710y, x7c0.f192702q);
    }

    /* JADX INFO: renamed from: Y */
    public final void m127054Y() {
        User userMo52252K2 = mo53983O().mo52252K2();
        final boolean zMo52258P1 = mo53983O().mo52258P1();
        mo53983O().mo53478me();
        if (jyb.m147479J(userMo52252K2.profile.extensions.interest.emoji)) {
            return;
        }
        if (!this.f100568A) {
            i4g0.m138526x("e_other_profile_edit_emoji_banner", mo53983O().pageId());
            this.f100568A = true;
        }
        bnl0.m105524M(this.f100569v, true);
        this.f100570w.setImageResource(dbc0.f86808a);
        ViewGroup.LayoutParams layoutParams = this.f100569v.getLayoutParams();
        layoutParams.height = qa00.m175859d(55.0f);
        this.f100569v.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f100570w.getLayoutParams();
        layoutParams2.width = qa00.m175859d(24.0f);
        layoutParams2.height = qa00.m175859d(24.0f);
        this.f100570w.setLayoutParams(layoutParams2);
        this.f100569v.setBackgroundColor(Color.parseColor("#e6f2ff"));
        ViewGroup.LayoutParams layoutParams3 = this.f100571x.getLayoutParams();
        layoutParams3.width = qa00.m175859d(24.0f);
        layoutParams3.height = qa00.m175859d(24.0f);
        this.f100571x.setLayoutParams(layoutParams3);
        this.f100571x.setImageResource(dbc0.f87428ss);
        this.f100572y.setTextColor(-11777466);
        m105675U(this.f100569v, 0, true, new x20() { // from class: l.es90
            @Override // p153l.x20
            public final void call() {
                this.f95579a.m127053X(zMo52258P1);
            }
        }, this.f100572y, mo53983O().act().getString(R$string.f19336ic));
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM128861a = this.f100573z.m128861a(m168325w().mo146493H2(), viewGroup);
        g4b0 g4b0Var = this.f100573z;
        this.f100569v = g4b0Var.f102159a;
        this.f100570w = g4b0Var.f102160b;
        this.f100571x = g4b0Var.f102161c;
        this.f100572y = g4b0Var.f102162d;
        return viewM128861a;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m127054Y();
    }
}
