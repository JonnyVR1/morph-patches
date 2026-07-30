package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import p151v.VIcon;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pd5 implements grl {

    /* JADX INFO: renamed from: a */
    public VText f151706a;

    /* JADX INFO: renamed from: b */
    public VText f151707b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f151708c;

    /* JADX INFO: renamed from: d */
    public VIcon f151709d;

    /* JADX INFO: renamed from: e */
    public VText f151710e;

    /* JADX INFO: renamed from: f */
    public final Act f151711f;

    /* JADX INFO: renamed from: g */
    public final int f151712g;

    /* JADX INFO: renamed from: h */
    public int f151713h;

    public pd5(Act act, int i) {
        this.f151711f = act;
        this.f151712g = i;
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: a */
    public View mo131121a(Act act, ViewGroup viewGroup) {
        View viewInflate = act.inflater().inflate(rec0.f162420A2, viewGroup, false);
        m171783e(viewInflate);
        this.f151706a.setTypeface(lyh0.m156283c(3), 1);
        this.f151710e.setTypeface(lyh0.m156283c(3), 1);
        return viewInflate;
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: c */
    public void mo131123c(Act act, User user, boolean z) {
        m171785g();
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: d */
    public void mo131124d(Act act, CharSequence charSequence) {
        this.f151707b.setText(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public final void m171783e(View view) {
        qd5.m176154a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m171784f(@ColorInt int i) {
        int iM175859d = qa00.m175859d(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iM175859d);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0304  */
    /* JADX WARN: Code duplicated, block: B:83:0x030a  */
    /* JADX WARN: Code duplicated, block: B:84:0x031d  */
    /* JADX INFO: renamed from: g */
    public final void m171785g() {
        Act act;
        String string;
        int color;
        int color2;
        int iMo34473bc;
        String string2;
        int i;
        String string3;
        int i2 = this.f151712g;
        if (i2 == 0 || i2 == 16 || i2 == 8 || i2 == 9 || i2 == 17 || i2 == 32) {
            bnl0.m105524M(this.f151708c, false);
            return;
        }
        if (i2 == 1) {
            act = this.f151711f;
            if (i2 == 14) {
                string = act.getString(R$string.f28100O7, String.valueOf(m27.m156741B3()));
            } else {
                string = act.getString(R$string.f28100O7, String.valueOf(m27.m156763z3()));
            }
            color = Color.parseColor("#14ff4798");
            color2 = Color.parseColor("#ff6298");
            iMo34473bc = jbc0.f119467X9;
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (CoreModule.m30933P().m143405a().mo34390Op()) {
                    string2 = CoreModule.m30933P().m143405a().mo34468al() + "：%s 探探币/次";
                } else {
                    string2 = this.f151711f.getString(R$string.f28122Q7);
                }
                string = String.format(string2, String.valueOf(CoreModule.f18264c.f20312H0.m155442f5()));
                color = Color.parseColor(CoreModule.m30933P().m143405a().mo34390Op() ? "#14fcbc87" : "#f9f1ff");
                color2 = Color.parseColor(CoreModule.m30933P().m143405a().mo34390Op() ? "#ff9f65" : "#ff7beb");
                iMo34473bc = CoreModule.m30933P().m143405a().mo34390Op() ? jbc0.f119749s0 : jbc0.f119507aa;
            } else if (i2 == 6) {
                int i3 = jbc0.f119493Z9;
                boolean zMo34661B = gta.m132210e().m132214d().mo34661B();
                Act act2 = this.f151711f;
                if (zMo34661B) {
                    string3 = act2.getString(R$string.f28073M2);
                    i = jbc0.f119561e8;
                } else {
                    i = i3;
                    string3 = act2.getString(R$string.f28111P7);
                }
                int color3 = Color.parseColor("#142bccff");
                color2 = Color.parseColor("#2bccff");
                string = String.format(string3, String.valueOf(CoreModule.f18264c.f20312H0.m155434X4()));
                iMo34473bc = i;
                color = color3;
            } else if (i2 == 7) {
                string = this.f151711f.getString(R$string.f28502x8, String.valueOf(CoreModule.f18264c.f20312H0.m155476y4()));
                color = Color.parseColor("#145adf9f");
                color2 = Color.parseColor("#5adf9f");
                iMo34473bc = jbc0.f119635jc;
            } else if (i2 != 22) {
                if (i2 == 31) {
                    string = String.format(CoreModule.f18276o.m132214d().mo34703I5() ? "抢先告白 %s探探币/次" : "打招呼 %s探探币/次", Integer.valueOf(CoreModule.f18264c.f20312H0.m155467t5()));
                    color = CoreModule.f18276o.m132214d().mo34703I5() ? Color.parseColor("#FFEEFD") : Color.parseColor("#15FFD359");
                    color2 = CoreModule.f18276o.m132214d().mo34703I5() ? Color.parseColor("#FF6DF0") : Color.parseColor("#F6C53E");
                    iMo34473bc = CoreModule.f18276o.m132214d().mo34703I5() ? jbc0.f119305L8 : jbc0.f119291K8;
                } else {
                    if (i2 != 33) {
                        switch (i2) {
                            case 11:
                                string = String.format("每日心动 %s探探币/次", Integer.valueOf(this.f151713h));
                                color = Color.parseColor("#14e7b853");
                                color2 = Color.parseColor("#ebb958");
                                iMo34473bc = jbc0.f119548d9;
                                break;
                            case 12:
                                string = this.f151711f.getString(R$string.f27980D8, this.f151713h + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                                color = Color.parseColor("#142b7aff");
                                color2 = Color.parseColor("#2b7aff");
                                iMo34473bc = jbc0.f119612i3;
                                break;
                            case 13:
                                string = String.format("语音闪聊：%s 探探币/次", Integer.valueOf(CoreModule.f18264c.f20312H0.m155450l4()));
                                color = Color.parseColor("#f9f1ff");
                                color2 = Color.parseColor("#ff7beb");
                                iMo34473bc = jbc0.f119507aa;
                                break;
                            case 14:
                                act = this.f151711f;
                                if (i2 == 14) {
                                    string = act.getString(R$string.f28100O7, String.valueOf(m27.m156741B3()));
                                } else {
                                    string = act.getString(R$string.f28100O7, String.valueOf(m27.m156763z3()));
                                }
                                color = Color.parseColor("#14ff4798");
                                color2 = Color.parseColor("#ff6298");
                                iMo34473bc = jbc0.f119467X9;
                                break;
                            case 15:
                                string = String.format("闪聊加速卡：%s 探探币/次", Integer.valueOf(CoreModule.f18264c.f20312H0.m155444h5()));
                                color = Color.parseColor("#eeffe4");
                                color2 = Color.parseColor("#43c21f");
                                iMo34473bc = jbc0.f119521ba;
                                break;
                            default:
                                switch (i2) {
                                    case 24:
                                        string = String.format("资料留言 %s探探币/次", Integer.valueOf(CoreModule.f18264c.f20312H0.m155440d5()));
                                        color = Color.parseColor("#19ff6298");
                                        color2 = Color.parseColor("#ff80b8");
                                        iMo34473bc = CoreModule.m30933P().m143405a().mo34473bc();
                                        break;
                                    case 25:
                                        this.f151706a.setText("超级喜欢叠加包");
                                        string = this.f151711f.getString(R$string.f28133R7, String.valueOf(CoreModule.f18264c.f20312H0.m155479z5()));
                                        color = Color.parseColor("#142bccff");
                                        color2 = Color.parseColor("#2bccff");
                                        iMo34473bc = jbc0.f119535ca;
                                        break;
                                    case 26:
                                        string = String.format("一键配对 限时%s探探币/次", Integer.valueOf(CoreModule.f18264c.f20312H0.m155406A4()));
                                        color = Color.parseColor("#15FFA378");
                                        color2 = Color.parseColor("#FAA780");
                                        iMo34473bc = jbc0.f119480Y9;
                                        break;
                                    default:
                                        h5d0.m133654a("Unexpected value: ", this.f151712g);
                                        break;
                                }
                                break;
                        }
                        return;
                    }
                    string = String.format("抢先告白 %s探探币/次", Integer.valueOf(CoreModule.f18264c.f20312H0.m155438b5()));
                    color = Color.parseColor("#FFEEFD");
                    color2 = Color.parseColor("#FF6DF0");
                    iMo34473bc = jbc0.f119305L8;
                }
            } else {
                string = this.f151711f.getString(R$string.f28085N3, String.valueOf(m27.m156743E3()));
                color = Color.parseColor("#fff6ef");
                color2 = Color.parseColor("#f78c41");
                iMo34473bc = jbc0.f119645k8;
            }
        } else {
            string = this.f151711f.getString(R$string.f28133R7, String.valueOf(CoreModule.f18264c.f20312H0.m155479z5()));
            color = Color.parseColor("#142bccff");
            color2 = Color.parseColor("#2bccff");
            iMo34473bc = jbc0.f119535ca;
        }
        if (TextUtils.isEmpty(string)) {
            wg3.m206174a("You should define coin purchase dialog desc style.");
            return;
        }
        this.f151709d.setImageResource(iMo34473bc);
        this.f151710e.setTextColor(color2);
        this.f151710e.setText(string);
        this.f151708c.setBackground(m171784f(color));
    }

    /* JADX INFO: renamed from: h */
    public void m171786h(int i) {
        this.f151713h = i;
    }

    @Override // p153l.grl
    /* JADX INFO: renamed from: b */
    public void mo131122b(C8928d c8928d) {
    }
}
