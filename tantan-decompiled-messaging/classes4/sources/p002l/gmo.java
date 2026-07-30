package p002l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.r;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import l.b1c0;
import l.d3c0;
import l.e30;
import l.hmb;
import l.hmo;
import l.hvc0;
import l.i0g0;
import l.j17;
import l.l7n;
import l.m6c0;
import l.swh0;
import l.t100;
import l.xdl0;
import v.AutoVDraweeView;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gmo implements vol {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f11532a;

    /* JADX INFO: renamed from: b */
    public VImage f11533b;

    /* JADX INFO: renamed from: c */
    public VRelative f11534c;

    /* JADX INFO: renamed from: d */
    public VImage f11535d;

    /* JADX INFO: renamed from: e */
    public VText f11536e;

    /* JADX INFO: renamed from: f */
    public VImage f11537f;

    /* JADX INFO: renamed from: g */
    public VImage f11538g;

    /* JADX INFO: renamed from: h */
    public VText f11539h;

    /* JADX INFO: renamed from: i */
    public VText f11540i;

    /* JADX INFO: renamed from: j */
    public VText f11541j;

    /* JADX INFO: renamed from: k */
    public Act f11542k;

    /* JADX INFO: renamed from: l */
    public final int f11543l;

    /* JADX INFO: renamed from: m */
    public Privilege f11544m;

    public gmo(Act act, int i) {
        this.f11542k = act;
        this.f11543l = i;
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: a */
    public View mo13945a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.J, viewGroup, false);
        m13949f(viewInflate);
        return viewInflate;
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: c */
    public void mo13947c(Act act, User user, boolean z) {
        m13951h();
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: d */
    public void mo13948d(Act act, CharSequence charSequence) {
        this.f11536e.setText(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final void m13949f(View view) {
        hmo.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final int m13950g(String str) {
        int iD;
        int iD2;
        float fO1 = hmb.o1(14, str);
        float fY0 = fO1 % (xdl0.y0() - t100.d(40.0f));
        int iY0 = (int) (fO1 / (xdl0.y0() - t100.d(40.0f)));
        if (fY0 != 0.0f) {
            iD = t100.d(299.0f);
            iY0++;
            iD2 = t100.d(17.0f);
        } else {
            iD = t100.d(299.0f);
            iD2 = t100.d(17.0f);
        }
        return iD + (iY0 * iD2);
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
    public final void m13951h() {
        boolean zX6;
        Act act;
        String strString;
        Privilege privilege;
        Privilege privilege2;
        Act act2;
        String string;
        int iA5;
        int i = this.f11543l;
        if (i == 1) {
            xdl0.C0(this.f11532a, m13950g(this.f11542k.getString(R.string.U1)));
            xdl0.M(this.f11532a, true);
            xdl0.M(this.f11533b, false);
            this.f11532a.setImageUrl("https://auto.tancdn.com/v1/raw/342232da-1c91-4f79-8f28-026d961d46b113.webp");
            this.f11540i.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
            this.f11536e.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
            this.f11539h.setTextColor(this.f11542k.getResources().getColor(b1c0.w));
            this.f11538g.setImageResource(d3c0.h1);
            zX6 = CoreModule.P().a().X6();
            act = this.f11542k;
            if (zX6) {
                strString = act.string(R.string.da) + "...";
            } else {
                strString = act.string(R.string.o);
            }
            this.f11539h.setText(strString);
            this.f11540i.setText(this.f11542k.getString(R.string.U1));
            this.f11541j.setBackgroundResource(d3c0.r);
            if (this.f11543l == 14) {
                string = this.f11542k.getString(l7n.g(), Integer.valueOf(j17.B3()));
            } else {
                privilege = this.f11544m;
                privilege2 = Privilege.minBoost;
                act2 = this.f11542k;
                if (privilege == privilege2) {
                    string = act2.getString(l7n.g(), Integer.valueOf(j17.D3()));
                    this.f11539h.setText(this.f11542k.string(R.string.m2));
                    this.f11540i.setText(this.f11542k.getString(R.string.l2));
                } else {
                    string = act2.getString(l7n.g(), Integer.valueOf(j17.z3()));
                }
            }
        } else if (i == 2) {
            xdl0.C0(this.f11532a, m13950g(this.f11542k.getString(R.string.I7)));
            xdl0.M(this.f11532a, true);
            xdl0.M(this.f11533b, false);
            this.f11532a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IkJQVTJTVkk1Q1VXTjJDTE5RM1VOM1FDNVRUWE1HUzEyIiwidyI6NzUwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTY2NDUyMDk5MDE4MzkxNjQ4fQ.png");
            this.f11540i.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
            this.f11536e.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
            this.f11539h.setTextColor(this.f11542k.getResources().getColor(b1c0.w));
            this.f11538g.setImageResource(d3c0.S0);
            this.f11539h.setText(R.string.d);
            this.f11540i.setText(this.f11542k.getString(R.string.I7));
            this.f11541j.setBackgroundResource(d3c0.u);
            string = this.f11542k.getString(l7n.g(), Integer.valueOf(swh0.u0()));
        } else if (i == 12) {
            this.f11533b.setBackgroundResource(d3c0.B1);
            this.f11538g.setImageResource(d3c0.R0);
            this.f11539h.setText(R.string.E8);
            this.f11540i.setText(this.f11542k.getString(R.string.w1));
            this.f11541j.setBackgroundResource(d3c0.s);
            string = this.f11542k.getString(R.string.B8, Integer.valueOf(CoreModule.c.H0.B4()));
        } else if (i == 14) {
            xdl0.C0(this.f11532a, m13950g(this.f11542k.getString(R.string.U1)));
            xdl0.M(this.f11532a, true);
            xdl0.M(this.f11533b, false);
            this.f11532a.setImageUrl("https://auto.tancdn.com/v1/raw/342232da-1c91-4f79-8f28-026d961d46b113.webp");
            this.f11540i.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
            this.f11536e.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
            this.f11539h.setTextColor(this.f11542k.getResources().getColor(b1c0.w));
            this.f11538g.setImageResource(d3c0.h1);
            zX6 = CoreModule.P().a().X6();
            act = this.f11542k;
            if (zX6) {
                strString = act.string(R.string.da) + "...";
            } else {
                strString = act.string(R.string.o);
            }
            this.f11539h.setText(strString);
            this.f11540i.setText(this.f11542k.getString(R.string.U1));
            this.f11541j.setBackgroundResource(d3c0.r);
            if (this.f11543l == 14) {
                string = this.f11542k.getString(l7n.g(), Integer.valueOf(j17.B3()));
            } else {
                privilege = this.f11544m;
                privilege2 = Privilege.minBoost;
                act2 = this.f11542k;
                if (privilege == privilege2) {
                    string = act2.getString(l7n.g(), Integer.valueOf(j17.D3()));
                    this.f11539h.setText(this.f11542k.string(R.string.m2));
                    this.f11540i.setText(this.f11542k.getString(R.string.l2));
                } else {
                    string = act2.getString(l7n.g(), Integer.valueOf(j17.z3()));
                }
            }
        } else if (i != 22) {
            switch (i) {
                case 27:
                case 28:
                case 29:
                case 30:
                    xdl0.C0(this.f11532a, m13950g(this.f11542k.getString(R.string.n2)));
                    xdl0.M(this.f11532a, true);
                    xdl0.M(this.f11533b, false);
                    this.f11532a.setImageUrl("https://auto.tancdn.com/v1/raw/65191013-c7e8-4c5e-9133-5d875afef43912.webp");
                    this.f11538g.setImageResource(d3c0.H0);
                    this.f11539h.setTextColor(this.f11542k.getResources().getColor(b1c0.w));
                    this.f11539h.setText(R.string.p2);
                    this.f11540i.setText(this.f11542k.getString(R.string.n2));
                    this.f11540i.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
                    this.f11536e.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
                    this.f11541j.setBackgroundResource(d3c0.t);
                    switch (this.f11543l) {
                        case 28:
                            iA5 = r.a5();
                            break;
                        case 29:
                            iA5 = r.Z4();
                            break;
                        case 30:
                            iA5 = r.Y4();
                            break;
                        default:
                            iA5 = r.X4();
                            break;
                    }
                    string = String.format(hvc0.c(l7n.a()), Integer.valueOf(iA5));
                    break;
                default:
                    string = "";
                    break;
            }
        } else {
            xdl0.C0(this.f11532a, m13950g(this.f11542k.getString(R.string.L3)));
            xdl0.M(this.f11532a, true);
            xdl0.M(this.f11533b, false);
            this.f11532a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IlVYWk81RFdJNVdVWllRWklIRTROTFZDU0NFVEE3WTEzIiwidyI6NzUwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Nzc1ODc3NTYwMTY4NjEyMTZ9.png");
            this.f11538g.setImageResource(d3c0.i1);
            this.f11539h.setTextColor(this.f11542k.getResources().getColor(b1c0.w));
            this.f11539h.setText(R.string.M3);
            this.f11540i.setText(this.f11542k.getString(R.string.L3));
            this.f11540i.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
            this.f11536e.setTextColor(this.f11542k.getResources().getColor(b1c0.q));
            this.f11541j.setBackgroundResource(d3c0.t);
            string = this.f11542k.getString(R.string.B8, Integer.valueOf(j17.E3()));
        }
        this.f11541j.setText(i0g0.M(string, 0, Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 0), t100.k));
    }

    /* JADX INFO: renamed from: i */
    public void m13952i(final e30<Integer> e30Var) {
        xdl0.E0(this.f11537f, new View.OnClickListener() { // from class: l.fmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(0);
            }
        });
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: b */
    public void mo13946b(C0190d c0190d) {
    }
}
