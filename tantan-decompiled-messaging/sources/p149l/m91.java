package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class m91 implements s7m<h91> {

    /* JADX INFO: renamed from: a */
    public View f132647a;

    /* JADX INFO: renamed from: b */
    public ImageView f132648b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f132649c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f132650d;

    /* JADX INFO: renamed from: e */
    public ImageView f132651e;

    /* JADX INFO: renamed from: f */
    public TextView f132652f;

    /* JADX INFO: renamed from: g */
    public TextView f132653g;

    /* JADX INFO: renamed from: h */
    public TextView f132654h;

    /* JADX INFO: renamed from: i */
    public VImage f132655i;

    /* JADX INFO: renamed from: j */
    public h91 f132656j;

    /* JADX INFO: renamed from: k */
    public DialogC12611a f132657k;

    /* JADX INFO: renamed from: q */
    private void m153570q() {
        xdl0.m208329E0(this.f132653g, new View.OnClickListener() { // from class: l.i91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112095a.m153575k(view);
            }
        });
        xdl0.m208329E0(this.f132654h, new View.OnClickListener() { // from class: l.j91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116837a.m153576l(view);
            }
        });
        xdl0.m208329E0(this.f132647a, new View.OnClickListener() { // from class: l.k91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121894a.m153577m(view);
            }
        });
        xdl0.m208329E0(this.f132655i, new View.OnClickListener() { // from class: l.l91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126875a.m153578n(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f132656j.act();
    }

    @Override // p149l.s7m
    public void destroy() {
        if (isShowing()) {
            lsi0.m151593w(R$string.f46924R);
            m153573i();
        }
    }

    /* JADX INFO: renamed from: e */
    public View m153571e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n91.m158526b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(h91 h91Var) {
        this.f132656j = h91Var;
    }

    /* JADX INFO: renamed from: i */
    public void m153573i() {
        uep0.m193327n(this.f132657k);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        return uep0.m193339z(this.f132657k);
    }

    /* JADX INFO: renamed from: j */
    public DialogC12611a m153574j() {
        if (this.f132657k == null) {
            byr byrVar = new byr(this.f132656j, m153571e(act().inflater(), null));
            this.f132657k = byrVar;
            byrVar.m71778j0(LiveDialogEnum.CALl_AUDIENCE_APPLY_DIALOG);
            m153570q();
            this.f132656j.m129944q4(1);
        }
        return this.f132657k;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m153575k(View view) {
        this.f132656j.m129945s4();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m153576l(View view) {
        this.f132656j.m129935d4();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m153577m(View view) {
        uep0.m193327n(this.f132657k);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m153578n(View view) {
        this.f132656j.m129946t4();
    }

    /* JADX INFO: renamed from: p */
    public void m153579p(String str) {
        this.f132654h.setText(str);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [l.ho2] */
    /* JADX INFO: renamed from: s */
    public void m153580s(int i) {
        if (this.f132657k == null) {
            return;
        }
        switch (i) {
            case 1:
                xdl0.m208344M(this.f132648b, true);
                this.f132648b.setImageResource(i3c0.f111083m1);
                xdl0.m208344M(this.f132649c, false);
                xdl0.m208344M(this.f132650d, false);
                xdl0.m208344M(this.f132651e, false);
                this.f132654h.setText(act().getString(R$string.f47445p2));
                this.f132654h.setBackgroundResource(i3c0.f110650B0);
                this.f132652f.setText(act().getString(R$string.f47202e0));
                this.f132654h.setTextColor(-1);
                this.f132654h.setEnabled(true);
                break;
            case 2:
                xdl0.m208344M(this.f132648b, true);
                this.f132648b.setImageResource(i3c0.f110651B1);
                xdl0.m208344M(this.f132649c, false);
                xdl0.m208344M(this.f132650d, false);
                xdl0.m208344M(this.f132651e, false);
                this.f132654h.setText(act().getString(R$string.f46863O1));
                this.f132654h.setTextColor(-1);
                this.f132654h.setBackgroundResource(i3c0.f110650B0);
                this.f132652f.setText(act().getString(R$string.f47158c0));
                this.f132654h.setEnabled(true);
                break;
            case 3:
                xdl0.m208344M(this.f132648b, false);
                xdl0.m208344M(this.f132649c, true);
                xdl0.m208344M(this.f132650d, true);
                xdl0.m208344M(this.f132651e, true);
                this.f132654h.setText(act().getString(R$string.f46863O1));
                this.f132654h.setBackgroundResource(i3c0.f110975d1);
                hxs.m133405r("context_single_room", this.f132649c, ypv.f199493a.m199329V().m60124fp().profileSmall());
                hxs.m133406s("context_single_room", this.f132650d, this.f132656j.m206027E2().m132146l0().m60124fp().profileSmall().formatted());
                this.f132652f.setText(act().getString(R$string.f47269h1));
                this.f132654h.setTextColor(1090519039);
                this.f132654h.setEnabled(false);
                lsi0.m151593w(R$string.f46988U0);
                break;
            case 4:
                this.f132654h.setEnabled(true);
                break;
            case 5:
                xdl0.m208344M(this.f132648b, true);
                this.f132648b.setImageResource(i3c0.f111083m1);
                xdl0.m208344M(this.f132649c, false);
                xdl0.m208344M(this.f132650d, false);
                xdl0.m208344M(this.f132651e, false);
                this.f132654h.setText(act().getString(R$string.f46969T2));
                this.f132654h.setBackgroundResource(i3c0.f110650B0);
                this.f132652f.setText(act().getString(R$string.f47202e0));
                this.f132654h.setTextColor(-1);
                this.f132654h.setEnabled(true);
                break;
            case 6:
                m153574j().dismiss();
                break;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m153581u() {
        m153574j().show();
    }
}
