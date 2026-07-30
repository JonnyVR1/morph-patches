package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pc5 implements vol {

    /* JADX INFO: renamed from: a */
    public VText f148140a;

    /* JADX INFO: renamed from: b */
    public VText f148141b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f148142c;

    /* JADX INFO: renamed from: d */
    public VIcon f148143d;

    /* JADX INFO: renamed from: e */
    public VText f148144e;

    /* JADX INFO: renamed from: f */
    public final Act f148145f;

    /* JADX INFO: renamed from: g */
    public final int f148146g;

    /* JADX INFO: renamed from: h */
    public int f148147h;

    public pc5(Act act, int i) {
        this.f148145f = act;
        this.f148146g = i;
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: a */
    public View mo127037a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(m6c0.f131460A2, viewGroup, false);
        m168309e(viewInflate);
        this.f148140a.setTypeface(eqh0.m117752c(3), 1);
        this.f148144e.setTypeface(eqh0.m117752c(3), 1);
        return viewInflate;
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: c */
    public void mo127039c(Act act, User user, boolean z) {
        m168311g();
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: d */
    public void mo127040d(Act act, CharSequence charSequence) {
        this.f148141b.setText(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public final void m168309e(View view) {
        qc5.m173865a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m168310f(@ColorInt int i) {
        int iM186890d = t100.m186890d(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iM186890d);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0304  */
    /* JADX WARN: Code duplicated, block: B:83:0x030a  */
    /* JADX WARN: Code duplicated, block: B:84:0x031d  */
    /* JADX INFO: renamed from: g */
    public final void m168311g() {
        Act act;
        String string;
        int color;
        int color2;
        int iMo33470bc;
        String string2;
        int i;
        String string3;
        int i2 = this.f148146g;
        if (i2 == 0 || i2 == 16 || i2 == 8 || i2 == 9 || i2 == 17 || i2 == 32) {
            xdl0.m208344M(this.f148142c, false);
            return;
        }
        if (i2 == 1) {
            act = this.f148145f;
            if (i2 == 14) {
                string = act.getString(R$string.f27252O7, String.valueOf(j17.m139229B3()));
            } else {
                string = act.getString(R$string.f27252O7, String.valueOf(j17.m139251z3()));
            }
            color = Color.parseColor("#14ff4798");
            color2 = Color.parseColor("#ff6298");
            iMo33470bc = d3c0.f83812X9;
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (CoreModule.m29935P().m94651a().mo33387Op()) {
                    string2 = CoreModule.m29935P().m94651a().mo33465al() + "：%s 探探币/次";
                } else {
                    string2 = this.f148145f.getString(R$string.f27274Q7);
                }
                string = String.format(string2, String.valueOf(CoreModule.f17545c.f19570H0.m210354f5()));
                color = Color.parseColor(CoreModule.m29935P().m94651a().mo33387Op() ? "#14fcbc87" : "#f9f1ff");
                color2 = Color.parseColor(CoreModule.m29935P().m94651a().mo33387Op() ? "#ff9f65" : "#ff7beb");
                iMo33470bc = CoreModule.m29935P().m94651a().mo33387Op() ? d3c0.f84094s0 : d3c0.f83852aa;
            } else if (i2 == 6) {
                int i3 = d3c0.f83838Z9;
                boolean zMo33658B = ura.m195053e().m195057d().mo33658B();
                Act act2 = this.f148145f;
                if (zMo33658B) {
                    string3 = act2.getString(R$string.f27225M2);
                    i = d3c0.f83906e8;
                } else {
                    i = i3;
                    string3 = act2.getString(R$string.f27263P7);
                }
                int color3 = Color.parseColor("#142bccff");
                color2 = Color.parseColor("#2bccff");
                string = String.format(string3, String.valueOf(CoreModule.f17545c.f19570H0.m210346X4()));
                iMo33470bc = i;
                color = color3;
            } else if (i2 == 7) {
                string = this.f148145f.getString(R$string.f27654x8, String.valueOf(CoreModule.f17545c.f19570H0.m210388y4()));
                color = Color.parseColor("#145adf9f");
                color2 = Color.parseColor("#5adf9f");
                iMo33470bc = d3c0.f83980jc;
            } else if (i2 != 22) {
                if (i2 == 31) {
                    string = String.format(CoreModule.f17557o.m195057d().mo33700I5() ? "抢先告白 %s探探币/次" : "打招呼 %s探探币/次", Integer.valueOf(CoreModule.f17545c.f19570H0.m210379t5()));
                    color = CoreModule.f17557o.m195057d().mo33700I5() ? Color.parseColor("#FFEEFD") : Color.parseColor("#15FFD359");
                    color2 = CoreModule.f17557o.m195057d().mo33700I5() ? Color.parseColor("#FF6DF0") : Color.parseColor("#F6C53E");
                    iMo33470bc = CoreModule.f17557o.m195057d().mo33700I5() ? d3c0.f83650L8 : d3c0.f83636K8;
                } else {
                    if (i2 != 33) {
                        switch (i2) {
                            case 11:
                                string = String.format("每日心动 %s探探币/次", Integer.valueOf(this.f148147h));
                                color = Color.parseColor("#14e7b853");
                                color2 = Color.parseColor("#ebb958");
                                iMo33470bc = d3c0.f83893d9;
                                break;
                            case 12:
                                string = this.f148145f.getString(R$string.f27132D8, this.f148147h + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                                color = Color.parseColor("#142b7aff");
                                color2 = Color.parseColor("#2b7aff");
                                iMo33470bc = d3c0.f83957i3;
                                break;
                            case 13:
                                string = String.format("语音闪聊：%s 探探币/次", Integer.valueOf(CoreModule.f17545c.f19570H0.m210362l4()));
                                color = Color.parseColor("#f9f1ff");
                                color2 = Color.parseColor("#ff7beb");
                                iMo33470bc = d3c0.f83852aa;
                                break;
                            case 14:
                                act = this.f148145f;
                                if (i2 == 14) {
                                    string = act.getString(R$string.f27252O7, String.valueOf(j17.m139229B3()));
                                } else {
                                    string = act.getString(R$string.f27252O7, String.valueOf(j17.m139251z3()));
                                }
                                color = Color.parseColor("#14ff4798");
                                color2 = Color.parseColor("#ff6298");
                                iMo33470bc = d3c0.f83812X9;
                                break;
                            case 15:
                                string = String.format("闪聊加速卡：%s 探探币/次", Integer.valueOf(CoreModule.f17545c.f19570H0.m210356h5()));
                                color = Color.parseColor("#eeffe4");
                                color2 = Color.parseColor("#43c21f");
                                iMo33470bc = d3c0.f83866ba;
                                break;
                            default:
                                switch (i2) {
                                    case 24:
                                        string = String.format("资料留言 %s探探币/次", Integer.valueOf(CoreModule.f17545c.f19570H0.m210352d5()));
                                        color = Color.parseColor("#19ff6298");
                                        color2 = Color.parseColor("#ff80b8");
                                        iMo33470bc = CoreModule.m29935P().m94651a().mo33470bc();
                                        break;
                                    case 25:
                                        this.f148140a.setText("超级喜欢叠加包");
                                        string = this.f148145f.getString(R$string.f27285R7, String.valueOf(CoreModule.f17545c.f19570H0.m210391z5()));
                                        color = Color.parseColor("#142bccff");
                                        color2 = Color.parseColor("#2bccff");
                                        iMo33470bc = d3c0.f83880ca;
                                        break;
                                    case 26:
                                        string = String.format("一键配对 限时%s探探币/次", Integer.valueOf(CoreModule.f17545c.f19570H0.m210318A4()));
                                        color = Color.parseColor("#15FFA378");
                                        color2 = Color.parseColor("#FAA780");
                                        iMo33470bc = d3c0.f83825Y9;
                                        break;
                                    default:
                                        dxc0.m114002a("Unexpected value: ", this.f148146g);
                                        break;
                                }
                                break;
                        }
                        return;
                    }
                    string = String.format("抢先告白 %s探探币/次", Integer.valueOf(CoreModule.f17545c.f19570H0.m210350b5()));
                    color = Color.parseColor("#FFEEFD");
                    color2 = Color.parseColor("#FF6DF0");
                    iMo33470bc = d3c0.f83650L8;
                }
            } else {
                string = this.f148145f.getString(R$string.f27237N3, String.valueOf(j17.m139231E3()));
                color = Color.parseColor("#fff6ef");
                color2 = Color.parseColor("#f78c41");
                iMo33470bc = d3c0.f83990k8;
            }
        } else {
            string = this.f148145f.getString(R$string.f27285R7, String.valueOf(CoreModule.f17545c.f19570H0.m210391z5()));
            color = Color.parseColor("#142bccff");
            color2 = Color.parseColor("#2bccff");
            iMo33470bc = d3c0.f83880ca;
        }
        if (TextUtils.isEmpty(string)) {
            ig3.m135964a("You should define coin purchase dialog desc style.");
            return;
        }
        this.f148143d.setImageResource(iMo33470bc);
        this.f148144e.setTextColor(color2);
        this.f148144e.setText(string);
        this.f148142c.setBackground(m168310f(color));
    }

    /* JADX INFO: renamed from: h */
    public void m168312h(int i) {
        this.f148147h = i;
    }

    @Override // p149l.vol
    /* JADX INFO: renamed from: b */
    public void mo127038b(C8765d c8765d) {
    }
}
