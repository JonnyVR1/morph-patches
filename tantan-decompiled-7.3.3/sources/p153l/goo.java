package p153l;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4903r;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class goo implements grl {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f105318a;

    /* JADX INFO: renamed from: b */
    public VImage f105319b;

    /* JADX INFO: renamed from: c */
    public VRelative f105320c;

    /* JADX INFO: renamed from: d */
    public VImage f105321d;

    /* JADX INFO: renamed from: e */
    public VText f105322e;

    /* JADX INFO: renamed from: f */
    public VImage f105323f;

    /* JADX INFO: renamed from: g */
    public VImage f105324g;

    /* JADX INFO: renamed from: h */
    public VText f105325h;

    /* JADX INFO: renamed from: i */
    public VText f105326i;

    /* JADX INFO: renamed from: j */
    public VText f105327j;

    /* JADX INFO: renamed from: k */
    public Act f105328k;

    /* JADX INFO: renamed from: l */
    public final int f105329l;

    /* JADX INFO: renamed from: m */
    public Privilege f105330m;

    public goo(Act act, int i) {
        this.f105328k = act;
        this.f105329l = i;
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: a */
    public View mo131121a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(rec0.f162453J, viewGroup, false);
        m131125f(viewInflate);
        return viewInflate;
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: c */
    public void mo131123c(Act act, User user, boolean z) {
        m131127h();
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: d */
    public void mo131124d(Act act, CharSequence charSequence) {
        this.f105322e.setText(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public final void m131125f(View view) {
        hoo.m136450a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final int m131126g(String str) {
        int iM175859d;
        int iM175859d2;
        float fM201955o1 = vnb.m201955o1(14, str);
        float fM105592y0 = fM201955o1 % (bnl0.m105592y0() - qa00.m175859d(40.0f));
        int iM105592y0 = (int) (fM201955o1 / (bnl0.m105592y0() - qa00.m175859d(40.0f)));
        if (fM105592y0 != 0.0f) {
            iM175859d = qa00.m175859d(299.0f);
            iM105592y0++;
            iM175859d2 = qa00.m175859d(17.0f);
        } else {
            iM175859d = qa00.m175859d(299.0f);
            iM175859d2 = qa00.m175859d(17.0f);
        }
        return iM175859d + (iM105592y0 * iM175859d2);
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
    public final void m131127h() {
        boolean zMo34443X6;
        Act act;
        String strString;
        Privilege privilege;
        Privilege privilege2;
        Act act2;
        String string;
        int iM35470a5;
        int i = this.f105329l;
        if (i == 1) {
            bnl0.m105505C0(this.f105318a, m131126g(this.f105328k.getString(R$string.f28160U1)));
            bnl0.m105524M(this.f105318a, true);
            bnl0.m105524M(this.f105319b, false);
            this.f105318a.setImageUrl("https://auto.tancdn.com/v1/raw/342232da-1c91-4f79-8f28-026d961d46b113.webp");
            this.f105326i.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
            this.f105322e.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
            this.f105325h.setTextColor(this.f105328k.getResources().getColor(h9c0.f108400w));
            this.f105324g.setImageResource(jbc0.f119596h1);
            zMo34443X6 = CoreModule.m30933P().m143405a().mo34443X6();
            act = this.f105328k;
            if (zMo34443X6) {
                strString = act.string(R$string.f28271da) + "...";
            } else {
                strString = act.string(R$string.f28392o);
            }
            this.f105325h.setText(strString);
            this.f105326i.setText(this.f105328k.getString(R$string.f28160U1));
            this.f105327j.setBackgroundResource(jbc0.f119734r);
            if (this.f105329l == 14) {
                string = this.f105328k.getString(l9n.m153442g(), Integer.valueOf(m27.m156741B3()));
            } else {
                privilege = this.f105330m;
                privilege2 = Privilege.minBoost;
                act2 = this.f105328k;
                if (privilege == privilege2) {
                    string = act2.getString(l9n.m153442g(), Integer.valueOf(m27.m156742D3()));
                    this.f105325h.setText(this.f105328k.string(R$string.f28371m2));
                    this.f105326i.setText(this.f105328k.getString(R$string.f28359l2));
                } else {
                    string = act2.getString(l9n.m153442g(), Integer.valueOf(m27.m156763z3()));
                }
            }
        } else if (i == 2) {
            bnl0.m105505C0(this.f105318a, m131126g(this.f105328k.getString(R$string.f28034I7)));
            bnl0.m105524M(this.f105318a, true);
            bnl0.m105524M(this.f105319b, false);
            this.f105318a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IkJQVTJTVkk1Q1VXTjJDTE5RM1VOM1FDNVRUWE1HUzEyIiwidyI6NzUwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTY2NDUyMDk5MDE4MzkxNjQ4fQ.png");
            this.f105326i.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
            this.f105322e.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
            this.f105325h.setTextColor(this.f105328k.getResources().getColor(h9c0.f108400w));
            this.f105324g.setImageResource(jbc0.f119393S0);
            this.f105325h.setText(R$string.f28260d);
            this.f105326i.setText(this.f105328k.getString(R$string.f28034I7));
            this.f105327j.setBackgroundResource(jbc0.f119776u);
            string = this.f105328k.getString(l9n.m153442g(), Integer.valueOf(a5i0.m96172u0()));
        } else if (i == 12) {
            this.f105319b.setBackgroundResource(jbc0.f119158B1);
            this.f105324g.setImageResource(jbc0.f119380R0);
            this.f105325h.setText(R$string.f27991E8);
            this.f105326i.setText(this.f105328k.getString(R$string.f28484w1));
            this.f105327j.setBackgroundResource(jbc0.f119748s);
            string = this.f105328k.getString(R$string.f27958B8, Integer.valueOf(CoreModule.f18264c.f20312H0.m155408B4()));
        } else if (i == 14) {
            bnl0.m105505C0(this.f105318a, m131126g(this.f105328k.getString(R$string.f28160U1)));
            bnl0.m105524M(this.f105318a, true);
            bnl0.m105524M(this.f105319b, false);
            this.f105318a.setImageUrl("https://auto.tancdn.com/v1/raw/342232da-1c91-4f79-8f28-026d961d46b113.webp");
            this.f105326i.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
            this.f105322e.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
            this.f105325h.setTextColor(this.f105328k.getResources().getColor(h9c0.f108400w));
            this.f105324g.setImageResource(jbc0.f119596h1);
            zMo34443X6 = CoreModule.m30933P().m143405a().mo34443X6();
            act = this.f105328k;
            if (zMo34443X6) {
                strString = act.string(R$string.f28271da) + "...";
            } else {
                strString = act.string(R$string.f28392o);
            }
            this.f105325h.setText(strString);
            this.f105326i.setText(this.f105328k.getString(R$string.f28160U1));
            this.f105327j.setBackgroundResource(jbc0.f119734r);
            if (this.f105329l == 14) {
                string = this.f105328k.getString(l9n.m153442g(), Integer.valueOf(m27.m156741B3()));
            } else {
                privilege = this.f105330m;
                privilege2 = Privilege.minBoost;
                act2 = this.f105328k;
                if (privilege == privilege2) {
                    string = act2.getString(l9n.m153442g(), Integer.valueOf(m27.m156742D3()));
                    this.f105325h.setText(this.f105328k.string(R$string.f28371m2));
                    this.f105326i.setText(this.f105328k.getString(R$string.f28359l2));
                } else {
                    string = act2.getString(l9n.m153442g(), Integer.valueOf(m27.m156763z3()));
                }
            }
        } else if (i != 22) {
            switch (i) {
                case 27:
                case 28:
                case 29:
                case 30:
                    bnl0.m105505C0(this.f105318a, m131126g(this.f105328k.getString(R$string.f28383n2)));
                    bnl0.m105524M(this.f105318a, true);
                    bnl0.m105524M(this.f105319b, false);
                    this.f105318a.setImageUrl("https://auto.tancdn.com/v1/raw/65191013-c7e8-4c5e-9133-5d875afef43912.webp");
                    this.f105324g.setImageResource(jbc0.f119241H0);
                    this.f105325h.setTextColor(this.f105328k.getResources().getColor(h9c0.f108400w));
                    this.f105325h.setText(R$string.f28407p2);
                    this.f105326i.setText(this.f105328k.getString(R$string.f28383n2));
                    this.f105326i.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
                    this.f105322e.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
                    this.f105327j.setBackgroundResource(jbc0.f119762t);
                    switch (this.f105329l) {
                        case 28:
                            iM35470a5 = C4903r.m35470a5();
                            break;
                        case 29:
                            iM35470a5 = C4903r.m35466Z4();
                            break;
                        case 30:
                            iM35470a5 = C4903r.m35463Y4();
                            break;
                        default:
                            iM35470a5 = C4903r.m35460X4();
                            break;
                    }
                    string = String.format(k3d0.m148007c(l9n.m153436a()), Integer.valueOf(iM35470a5));
                    break;
                default:
                    string = "";
                    break;
            }
        } else {
            bnl0.m105505C0(this.f105318a, m131126g(this.f105328k.getString(R$string.f28063L3)));
            bnl0.m105524M(this.f105318a, true);
            bnl0.m105524M(this.f105319b, false);
            this.f105318a.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IlVYWk81RFdJNVdVWllRWklIRTROTFZDU0NFVEE3WTEzIiwidyI6NzUwLCJoIjo2MzYsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Nzc1ODc3NTYwMTY4NjEyMTZ9.png");
            this.f105324g.setImageResource(jbc0.f119610i1);
            this.f105325h.setTextColor(this.f105328k.getResources().getColor(h9c0.f108400w));
            this.f105325h.setText(R$string.f28074M3);
            this.f105326i.setText(this.f105328k.getString(R$string.f28063L3));
            this.f105326i.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
            this.f105322e.setTextColor(this.f105328k.getResources().getColor(h9c0.f108389q));
            this.f105327j.setBackgroundResource(jbc0.f119762t);
            string = this.f105328k.getString(R$string.f27958B8, Integer.valueOf(m27.m156743E3()));
        }
        this.f105327j.setText(q8g0.m175781M(string, 0, Color.parseColor("#FE7E1D"), Typeface.create("sans-serif", 0), qa00.f156324k));
    }

    /* JADX INFO: renamed from: i */
    public void m131128i(final y20<Integer> y20Var) {
        bnl0.m105509E0(this.f105323f, new View.OnClickListener() { // from class: l.foo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(0);
            }
        });
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: b */
    public void mo131122b(C8928d c8928d) {
    }
}
