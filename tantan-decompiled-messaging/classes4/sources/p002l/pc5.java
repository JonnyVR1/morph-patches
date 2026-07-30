package p002l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import l.d3c0;
import l.dxc0;
import l.eqh0;
import l.ig3;
import l.j17;
import l.m6c0;
import l.qc5;
import l.t100;
import l.ura;
import l.xdl0;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pc5 implements vol {

    /* JADX INFO: renamed from: a */
    public VText f17187a;

    /* JADX INFO: renamed from: b */
    public VText f17188b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f17189c;

    /* JADX INFO: renamed from: d */
    public VIcon f17190d;

    /* JADX INFO: renamed from: e */
    public VText f17191e;

    /* JADX INFO: renamed from: f */
    public final Act f17192f;

    /* JADX INFO: renamed from: g */
    public final int f17193g;

    /* JADX INFO: renamed from: h */
    public int f17194h;

    public pc5(Act act, int i) {
        this.f17192f = act;
        this.f17193g = i;
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: a */
    public View mo13945a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.A2, viewGroup, false);
        m20182e(viewInflate);
        this.f17187a.setTypeface(eqh0.c(3), 1);
        this.f17191e.setTypeface(eqh0.c(3), 1);
        return viewInflate;
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: c */
    public void mo13947c(Act act, User user, boolean z) {
        m20184g();
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: d */
    public void mo13948d(Act act, CharSequence charSequence) {
        this.f17188b.setText(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public final void m20182e(View view) {
        qc5.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m20183f(@ColorInt int i) {
        int iD = t100.d(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iD);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0304  */
    /* JADX WARN: Code duplicated, block: B:83:0x030a  */
    /* JADX WARN: Code duplicated, block: B:84:0x031d  */
    /* JADX INFO: renamed from: g */
    public final void m20184g() {
        Act act;
        String string;
        int color;
        int color2;
        int iBc;
        String string2;
        int i;
        String string3;
        int i2 = this.f17193g;
        if (i2 == 0 || i2 == 16 || i2 == 8 || i2 == 9 || i2 == 17 || i2 == 32) {
            xdl0.M(this.f17189c, false);
            return;
        }
        if (i2 == 1) {
            act = this.f17192f;
            if (i2 == 14) {
                string = act.getString(R.string.O7, String.valueOf(j17.B3()));
            } else {
                string = act.getString(R.string.O7, String.valueOf(j17.z3()));
            }
            color = Color.parseColor("#14ff4798");
            color2 = Color.parseColor("#ff6298");
            iBc = d3c0.X9;
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (CoreModule.P().a().Op()) {
                    string2 = CoreModule.P().a().al() + "：%s 探探币/次";
                } else {
                    string2 = this.f17192f.getString(R.string.Q7);
                }
                string = String.format(string2, String.valueOf(CoreModule.c.H0.f5()));
                color = Color.parseColor(CoreModule.P().a().Op() ? "#14fcbc87" : "#f9f1ff");
                color2 = Color.parseColor(CoreModule.P().a().Op() ? "#ff9f65" : "#ff7beb");
                iBc = CoreModule.P().a().Op() ? d3c0.s0 : d3c0.aa;
            } else if (i2 == 6) {
                int i3 = d3c0.Z9;
                boolean zB = ura.e().d().B();
                Act act2 = this.f17192f;
                if (zB) {
                    string3 = act2.getString(R.string.M2);
                    i = d3c0.e8;
                } else {
                    i = i3;
                    string3 = act2.getString(R.string.P7);
                }
                int color3 = Color.parseColor("#142bccff");
                color2 = Color.parseColor("#2bccff");
                string = String.format(string3, String.valueOf(CoreModule.c.H0.X4()));
                iBc = i;
                color = color3;
            } else if (i2 == 7) {
                string = this.f17192f.getString(R.string.x8, String.valueOf(CoreModule.c.H0.y4()));
                color = Color.parseColor("#145adf9f");
                color2 = Color.parseColor("#5adf9f");
                iBc = d3c0.jc;
            } else if (i2 != 22) {
                if (i2 == 31) {
                    string = String.format(CoreModule.o.d().I5() ? "抢先告白 %s探探币/次" : "打招呼 %s探探币/次", Integer.valueOf(CoreModule.c.H0.t5()));
                    color = CoreModule.o.d().I5() ? Color.parseColor("#FFEEFD") : Color.parseColor("#15FFD359");
                    color2 = CoreModule.o.d().I5() ? Color.parseColor("#FF6DF0") : Color.parseColor("#F6C53E");
                    iBc = CoreModule.o.d().I5() ? d3c0.L8 : d3c0.K8;
                } else {
                    if (i2 != 33) {
                        switch (i2) {
                            case ExpLoopInputType.HOUSE /* 11 */:
                                string = String.format("每日心动 %s探探币/次", Integer.valueOf(this.f17194h));
                                color = Color.parseColor("#14e7b853");
                                color2 = Color.parseColor("#ebb958");
                                iBc = d3c0.d9;
                                break;
                            case ExpLoopInputType.PROFESSION /* 12 */:
                                string = this.f17192f.getString(R.string.D8, this.f17194h + " ");
                                color = Color.parseColor("#142b7aff");
                                color2 = Color.parseColor("#2b7aff");
                                iBc = d3c0.i3;
                                break;
                            case ExpLoopInputType.HEIGHT /* 13 */:
                                string = String.format("语音闪聊：%s 探探币/次", Integer.valueOf(CoreModule.c.H0.l4()));
                                color = Color.parseColor("#f9f1ff");
                                color2 = Color.parseColor("#ff7beb");
                                iBc = d3c0.aa;
                                break;
                            case ExpLoopInputType.SIGNATURE /* 14 */:
                                act = this.f17192f;
                                if (i2 == 14) {
                                    string = act.getString(R.string.O7, String.valueOf(j17.B3()));
                                } else {
                                    string = act.getString(R.string.O7, String.valueOf(j17.z3()));
                                }
                                color = Color.parseColor("#14ff4798");
                                color2 = Color.parseColor("#ff6298");
                                iBc = d3c0.X9;
                                break;
                            case ExpLoopInputType.COMPANY /* 15 */:
                                string = String.format("闪聊加速卡：%s 探探币/次", Integer.valueOf(CoreModule.c.H0.h5()));
                                color = Color.parseColor("#eeffe4");
                                color2 = Color.parseColor("#43c21f");
                                iBc = d3c0.ba;
                                break;
                            default:
                                switch (i2) {
                                    case ExpLoopInputType.MY_LIFE /* 24 */:
                                        string = String.format("资料留言 %s探探币/次", Integer.valueOf(CoreModule.c.H0.d5()));
                                        color = Color.parseColor("#19ff6298");
                                        color2 = Color.parseColor("#ff80b8");
                                        iBc = CoreModule.P().a().bc();
                                        break;
                                    case ExpLoopInputType.VERIFICATION /* 25 */:
                                        this.f17187a.setText("超级喜欢叠加包");
                                        string = this.f17192f.getString(R.string.R7, String.valueOf(CoreModule.c.H0.z5()));
                                        color = Color.parseColor("#142bccff");
                                        color2 = Color.parseColor("#2bccff");
                                        iBc = d3c0.ca;
                                        break;
                                    case ExpLoopInputType.FOOD_FLAVOR /* 26 */:
                                        string = String.format("一键配对 限时%s探探币/次", Integer.valueOf(CoreModule.c.H0.A4()));
                                        color = Color.parseColor("#15FFA378");
                                        color2 = Color.parseColor("#FAA780");
                                        iBc = d3c0.Y9;
                                        break;
                                    default:
                                        dxc0.a("Unexpected value: ", this.f17193g);
                                        break;
                                }
                                break;
                        }
                        return;
                    }
                    string = String.format("抢先告白 %s探探币/次", Integer.valueOf(CoreModule.c.H0.b5()));
                    color = Color.parseColor("#FFEEFD");
                    color2 = Color.parseColor("#FF6DF0");
                    iBc = d3c0.L8;
                }
            } else {
                string = this.f17192f.getString(R.string.N3, String.valueOf(j17.E3()));
                color = Color.parseColor("#fff6ef");
                color2 = Color.parseColor("#f78c41");
                iBc = d3c0.k8;
            }
        } else {
            string = this.f17192f.getString(R.string.R7, String.valueOf(CoreModule.c.H0.z5()));
            color = Color.parseColor("#142bccff");
            color2 = Color.parseColor("#2bccff");
            iBc = d3c0.ca;
        }
        if (TextUtils.isEmpty(string)) {
            ig3.a("You should define coin purchase dialog desc style.");
            return;
        }
        this.f17190d.setImageResource(iBc);
        this.f17191e.setTextColor(color2);
        this.f17191e.setText(string);
        this.f17189c.setBackground(m20183f(color));
    }

    /* JADX INFO: renamed from: h */
    public void m20185h(int i) {
        this.f17194h = i;
    }

    @Override // p002l.vol
    /* JADX INFO: renamed from: b */
    public void mo13946b(C0190d c0190d) {
    }
}
