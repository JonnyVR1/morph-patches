package p149l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.addemoji.AddEmojiAct;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bk90 extends xf90 {

    /* JADX INFO: renamed from: A */
    public boolean f75975A;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f75976v;

    /* JADX INFO: renamed from: w */
    public VImage f75977w;

    /* JADX INFO: renamed from: x */
    public VImage f75978x;

    /* JADX INFO: renamed from: y */
    public VText f75979y;

    /* JADX INFO: renamed from: z */
    public cwa0 f75980z;

    public bk90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f75980z = new cwa0();
        this.f75975A = false;
    }

    @Override // p149l.xf90
    /* JADX INFO: renamed from: S */
    public boolean mo102271S() {
        if (mo52800O().mo51075P1()) {
            return false;
        }
        vwb.m200296J(mo52800O().mo51069K2().profile.extensions.interest.emoji);
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m102272X(boolean z) {
        zvf0.m220396r("e_other_profile_edit_emoji_banner", mo52800O().pageId());
        mo52800O().startActivity(AddEmojiAct.m55231a2(mo52800O().act(), true, !z, "other_profile"));
        mo52800O().act().overridePendingTransition(rzb0.f161653y, rzb0.f161645q);
    }

    /* JADX INFO: renamed from: Y */
    public final void m102273Y() {
        User userMo51069K2 = mo52800O().mo51069K2();
        final boolean zMo51075P1 = mo52800O().mo51075P1();
        mo52800O().mo52295me();
        if (vwb.m200296J(userMo51069K2.profile.extensions.interest.emoji)) {
            return;
        }
        if (!this.f75975A) {
            zvf0.m220402x("e_other_profile_edit_emoji_banner", mo52800O().pageId());
            this.f75975A = true;
        }
        xdl0.m208344M(this.f75976v, true);
        this.f75977w.setImageResource(x2c0.f189965a);
        ViewGroup.LayoutParams layoutParams = this.f75976v.getLayoutParams();
        layoutParams.height = t100.m186890d(55.0f);
        this.f75976v.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f75977w.getLayoutParams();
        layoutParams2.width = t100.m186890d(24.0f);
        layoutParams2.height = t100.m186890d(24.0f);
        this.f75977w.setLayoutParams(layoutParams2);
        this.f75976v.setBackgroundColor(Color.parseColor("#e6f2ff"));
        ViewGroup.LayoutParams layoutParams3 = this.f75978x.getLayoutParams();
        layoutParams3.width = t100.m186890d(24.0f);
        layoutParams3.height = t100.m186890d(24.0f);
        this.f75978x.setLayoutParams(layoutParams3);
        this.f75978x.setImageResource(x2c0.f189309Er);
        this.f75979y.setTextColor(-11777466);
        m208598U(this.f75976v, 0, true, new d30() { // from class: l.ak90
            @Override // p149l.d30
            public final void call() {
                this.f70263a.m102272X(zMo51075P1);
            }
        }, this.f75979y, mo52800O().act().getString(R$string.f18148Tb));
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM108989a = this.f75980z.m108989a(m131825w().mo94568H2(), viewGroup);
        cwa0 cwa0Var = this.f75980z;
        this.f75976v = cwa0Var.f82764a;
        this.f75977w = cwa0Var.f82765b;
        this.f75978x = cwa0Var.f82766c;
        this.f75979y = cwa0Var.f82767d;
        return viewM108989a;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m102273Y();
    }
}
