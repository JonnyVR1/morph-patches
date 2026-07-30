package p149l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4752r;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gmo implements vol {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f103495a;

    /* JADX INFO: renamed from: b */
    public VImage f103496b;

    /* JADX INFO: renamed from: c */
    public VRelative f103497c;

    /* JADX INFO: renamed from: d */
    public VImage f103498d;

    /* JADX INFO: renamed from: e */
    public VText f103499e;

    /* JADX INFO: renamed from: f */
    public VImage f103500f;

    /* JADX INFO: renamed from: g */
    public VImage f103501g;

    /* JADX INFO: renamed from: h */
    public VText f103502h;

    /* JADX INFO: renamed from: i */
    public VText f103503i;

    /* JADX INFO: renamed from: j */
    public VText f103504j;

    /* JADX INFO: renamed from: k */
    public Act f103505k;

    /* JADX INFO: renamed from: l */
    public final int f103506l;

    /* JADX INFO: renamed from: m */
    public Privilege f103507m;

    public gmo(Act act, int i) {
        this.f103505k = act;
        this.f103506l = i;
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: a */
    public View mo127037a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.f131493J, viewGroup, false);
        m127041f(viewInflate);
        return viewInflate;
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: c */
    public void mo127039c(Act act, User user, boolean z) {
        m127043h();
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: d */
    public void mo127040d(Act act, CharSequence charSequence) {
        this.f103499e.setText(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final void m127041f(View view) {
        hmo.m131738a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final int m127042g(String str) {
        int iM186890d;
        int iM186890d2;
        float fM131710o1 = hmb.m131710o1(14, str);
        float fM208412y0 = fM131710o1 % (xdl0.m208412y0() - t100.m186890d(40.0f));
        int iM208412y0 = (int) (fM131710o1 / (xdl0.m208412y0() - t100.m186890d(40.0f)));
        if (fM208412y0 != 0.0f) {
            iM186890d = t100.m186890d(299.0f);
            iM208412y0++;
            iM186890d2 = t100.m186890d(17.0f);
        } else {
            iM186890d = t100.m186890d(299.0f);
            iM186890d2 = t100.m186890d(17.0f);
        }
        return iM186890d + (iM208412y0 * iM186890d2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0220  */
    /* JADX WARN: Code duplicated, block: B:25:0x028c  */
    /* JADX WARN: Code duplicated, block: B:26:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:29:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:30:0x02de  */
    /* JADX WARN: Code duplicated, block: B:32:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:33:0x0315  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x028c, please report this as an issue */
    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: h */
    public final void m127043h() {
        boolean zMo33440X6;
        Act act;
        String strString;
        Privilege privilege;
        Privilege privilege2;
        Act act2;
        String string;
        int iM34467a5;
        int i = this.f103506l;
        if (i == 1) {
            xdl0.m208325C0(this.f103495a, m127042g(this.f103505k.getString(R$string.f27312U1)));
            xdl0.m208344M(this.f103495a, true);
            xdl0.m208344M(this.f103496b, false);
            this.f103495a.setImageUrl("https://auto.tancdn.com/v1/raw/342232da-1c91-4f79-8f28-026d961d46b113.webp");
            this.f103503i.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
            this.f103499e.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
            this.f103502h.setTextColor(this.f103505k.getResources().getColor(b1c0.f72580w));
            this.f103501g.setImageResource(d3c0.f83941h1);
            zMo33440X6 = CoreModule.m29935P().m94651a().mo33440X6();
            act = this.f103505k;
            if (zMo33440X6) {
                strString = act.string(R$string.f27423da) + "...";
            } else {
                strString = act.string(R$string.f27544o);
            }
            this.f103502h.setText(strString);
            this.f103503i.setText(this.f103505k.getString(R$string.f27312U1));
            this.f103504j.setBackgroundResource(d3c0.f84079r);
            if (this.f103506l == 14) {
                string = this.f103505k.getString(l7n.m148819g(), Integer.valueOf(j17.m139229B3()));
            } else {
                privilege = this.f103507m;
                privilege2 = Privilege.minBoost;
                act2 = this.f103505k;
                if (privilege == privilege2) {
                    string = act2.getString(l7n.m148819g(), Integer.valueOf(j17.m139230D3()));
                    this.f103502h.setText(this.f103505k.string(R$string.f27523m2));
                    this.f103503i.setText(this.f103505k.getString(R$string.f27511l2));
                } else {
                    string = act2.getString(l7n.m148819g(), Integer.valueOf(j17.m139251z3()));
                }
            }
        } else if (i == 2) {
            xdl0.m208325C0(this.f103495a, m127042g(this.f103505k.getString(R$string.f27186I7)));
            xdl0.m208344M(this.f103495a, true);
            xdl0.m208344M(this.f103496b, false);
            this.f103495a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IkJQVTJTVkk1Q1VXTjJDTE5RM1VOM1FDNVRUWE1HUzEyIiwidyI6NzUwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTY2NDUyMDk5MDE4MzkxNjQ4fQ.png");
            this.f103503i.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
            this.f103499e.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
            this.f103502h.setTextColor(this.f103505k.getResources().getColor(b1c0.f72580w));
            this.f103501g.setImageResource(d3c0.f83738S0);
            this.f103502h.setText(R$string.f27412d);
            this.f103503i.setText(this.f103505k.getString(R$string.f27186I7));
            this.f103504j.setBackgroundResource(d3c0.f84121u);
            string = this.f103505k.getString(l7n.m148819g(), Integer.valueOf(swh0.m186267u0()));
        } else if (i == 12) {
            this.f103496b.setBackgroundResource(d3c0.f83503B1);
            this.f103501g.setImageResource(d3c0.f83725R0);
            this.f103502h.setText(R$string.f27143E8);
            this.f103503i.setText(this.f103505k.getString(R$string.f27636w1));
            this.f103504j.setBackgroundResource(d3c0.f84093s);
            string = this.f103505k.getString(R$string.f27110B8, Integer.valueOf(CoreModule.f17545c.f19570H0.m210320B4()));
        } else if (i == 14) {
            xdl0.m208325C0(this.f103495a, m127042g(this.f103505k.getString(R$string.f27312U1)));
            xdl0.m208344M(this.f103495a, true);
            xdl0.m208344M(this.f103496b, false);
            this.f103495a.setImageUrl("https://auto.tancdn.com/v1/raw/342232da-1c91-4f79-8f28-026d961d46b113.webp");
            this.f103503i.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
            this.f103499e.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
            this.f103502h.setTextColor(this.f103505k.getResources().getColor(b1c0.f72580w));
            this.f103501g.setImageResource(d3c0.f83941h1);
            zMo33440X6 = CoreModule.m29935P().m94651a().mo33440X6();
            act = this.f103505k;
            if (zMo33440X6) {
                strString = act.string(R$string.f27423da) + "...";
            } else {
                strString = act.string(R$string.f27544o);
            }
            this.f103502h.setText(strString);
            this.f103503i.setText(this.f103505k.getString(R$string.f27312U1));
            this.f103504j.setBackgroundResource(d3c0.f84079r);
            if (this.f103506l == 14) {
                string = this.f103505k.getString(l7n.m148819g(), Integer.valueOf(j17.m139229B3()));
            } else {
                privilege = this.f103507m;
                privilege2 = Privilege.minBoost;
                act2 = this.f103505k;
                if (privilege == privilege2) {
                    string = act2.getString(l7n.m148819g(), Integer.valueOf(j17.m139230D3()));
                    this.f103502h.setText(this.f103505k.string(R$string.f27523m2));
                    this.f103503i.setText(this.f103505k.getString(R$string.f27511l2));
                } else {
                    string = act2.getString(l7n.m148819g(), Integer.valueOf(j17.m139251z3()));
                }
            }
        } else if (i != 22) {
            switch (i) {
                case 27:
                case 28:
                case 29:
                case 30:
                    xdl0.m208325C0(this.f103495a, m127042g(this.f103505k.getString(R$string.f27535n2)));
                    xdl0.m208344M(this.f103495a, true);
                    xdl0.m208344M(this.f103496b, false);
                    this.f103495a.setImageUrl("https://auto.tancdn.com/v1/raw/65191013-c7e8-4c5e-9133-5d875afef43912.webp");
                    this.f103501g.setImageResource(d3c0.f83586H0);
                    this.f103502h.setTextColor(this.f103505k.getResources().getColor(b1c0.f72580w));
                    this.f103502h.setText(R$string.f27559p2);
                    this.f103503i.setText(this.f103505k.getString(R$string.f27535n2));
                    this.f103503i.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
                    this.f103499e.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
                    this.f103504j.setBackgroundResource(d3c0.f84107t);
                    switch (this.f103506l) {
                        case 28:
                            iM34467a5 = C4752r.m34467a5();
                            break;
                        case 29:
                            iM34467a5 = C4752r.m34463Z4();
                            break;
                        case 30:
                            iM34467a5 = C4752r.m34460Y4();
                            break;
                        default:
                            iM34467a5 = C4752r.m34457X4();
                            break;
                    }
                    string = String.format(hvc0.m133156c(l7n.m148813a()), Integer.valueOf(iM34467a5));
                    break;
                default:
                    string = "";
                    break;
            }
        } else {
            xdl0.m208325C0(this.f103495a, m127042g(this.f103505k.getString(R$string.f27215L3)));
            xdl0.m208344M(this.f103495a, true);
            xdl0.m208344M(this.f103496b, false);
            this.f103495a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IlVYWk81RFdJNVdVWllRWklIRTROTFZDU0NFVEE3WTEzIiwidyI6NzUwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Nzc1ODc3NTYwMTY4NjEyMTZ9.png");
            this.f103501g.setImageResource(d3c0.f83955i1);
            this.f103502h.setTextColor(this.f103505k.getResources().getColor(b1c0.f72580w));
            this.f103502h.setText(R$string.f27226M3);
            this.f103503i.setText(this.f103505k.getString(R$string.f27215L3));
            this.f103503i.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
            this.f103499e.setTextColor(this.f103505k.getResources().getColor(b1c0.f72569q));
            this.f103504j.setBackgroundResource(d3c0.f84107t);
            string = this.f103505k.getString(R$string.f27110B8, Integer.valueOf(j17.m139231E3()));
        }
        this.f103504j.setText(i0g0.m133846M(string, 0, Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 0), t100.f167262k));
    }

    /* JADX INFO: renamed from: i */
    public void m127044i(final e30<Integer> e30Var) {
        xdl0.m208329E0(this.f103500f, new View.OnClickListener() { // from class: l.fmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(0);
            }
        });
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: b */
    public void mo127038b(C8765d c8765d) {
    }
}
