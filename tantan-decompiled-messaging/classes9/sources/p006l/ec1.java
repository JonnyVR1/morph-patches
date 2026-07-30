package p006l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.DropDownAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.QuickChatPartyCampaignPage;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import l.cwf0;
import l.fc1;
import l.i0e;
import l.j760;
import l.o6j0;
import l.szd;
import l.t100;
import l.xdl0;
import l.y7c0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ec1 extends szd {

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f11049j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f11050k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f11051l;

    /* JADX INFO: renamed from: m */
    public ImageView f11052m;

    /* JADX INFO: renamed from: n */
    public VImage f11053n;

    /* JADX INFO: renamed from: o */
    public VText f11054o;

    /* JADX INFO: renamed from: p */
    public VText f11055p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f11056q;

    /* JADX INFO: renamed from: r */
    public VText f11057r;

    /* JADX INFO: renamed from: s */
    public VText f11058s;

    /* JADX INFO: renamed from: t */
    public View f11059t;

    /* JADX INFO: renamed from: u */
    public Act f11060u;

    /* JADX INFO: renamed from: v */
    public cwf0 f11061v;

    /* JADX INFO: renamed from: w */
    public QuickChatPartyCampaignPage f11062w;

    /* JADX INFO: renamed from: x */
    public Map<Integer, j760<Integer, Integer>> f11063x;

    public ec1(Act act, QuickChatPartyCampaignPage quickChatPartyCampaignPage) {
        super(act, false, y7c0.b);
        this.f11063x = new HashMap(24);
        this.f11060u = act;
        this.f11062w = quickChatPartyCampaignPage;
    }

    /* JADX INFO: renamed from: L */
    private String m14438L(int i) {
        switch (i) {
            case 0:
                return "每周日";
            case 1:
                return "每周一";
            case 2:
                return "每周二";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "每周三";
            case CameraSticker.STATE_ERROR /* 4 */:
                return "每周四";
            case 5:
                return "每周五";
            case 6:
                return "每周六";
            case 7:
                return "每周日";
            default:
                return "每周";
        }
    }

    /* JADX INFO: renamed from: M */
    private void m14439M() {
        this.f11053n.setImageResource(x2c0.f25936Hn);
        qib0.f19782G.m12738I0(this.f11051l, "https://static.tancdn.com/pe-webplatform/XJvjQCUAgG5U7X23Hy_4Mgxo.webp", t100.d(272.0f), t100.d(272.0f));
        qib0.f19782G.m12738I0(this.f11050k, "https://static.tancdn.com/pe-webplatform/0ehHwqaySoNpt_4Ce5KsYbDq.webp", t100.d(236.0f), t100.d(228.0f));
        qib0.f19782G.m12738I0(this.f11056q, "https://static.tancdn.com/pe-webplatform/WZj8NDixaW5RhIFWlQug_4JA.webp", t100.d(311.0f), t100.d(320.0f));
    }

    /* JADX INFO: renamed from: N */
    private void m14440N() {
        this.f11053n.setImageResource(x2c0.f25967In);
        qib0.f19782G.m12738I0(this.f11051l, "https://static.tancdn.com/pe-webplatform/d1leZpYbk787D4DthEXMG_EV.webp", t100.d(272.0f), t100.d(272.0f));
        qib0.f19782G.m12738I0(this.f11050k, "https://static.tancdn.com/pe-webplatform/4Mf14tKMzXfmszs-NB4SdlaY.webp", t100.d(236.0f), t100.d(228.0f));
        qib0.f19782G.m12738I0(this.f11056q, "https://static.tancdn.com/pe-webplatform/Espsnpgm79p15sNAVGOcsGTv.webp", t100.d(311.0f), t100.d(320.0f));
    }

    /* JADX INFO: renamed from: O */
    private void m14441O() {
        if (NullChecker.a(this.f11062w) && TEnum.equals(this.f11062w.partyType, "quickchat")) {
            m14440N();
        } else {
            m14439M();
        }
    }

    /* JADX INFO: renamed from: P */
    private void m14442P() {
        m14441O();
        this.f11055p.setText(m14451K());
        this.f11057r.setText(m14449I());
        ((ViewGroup.MarginLayoutParams) this.f11052m.getLayoutParams()).topMargin = xdl0.F0() + t100.g;
        this.f11054o.setTypeface(Typeface.defaultFromStyle(1));
        this.f11058s.setTypeface(Typeface.defaultFromStyle(1));
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bc1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f8810a.m14443Q(dialogInterface);
            }
        });
        xdl0.E0(this.f11058s, new View.OnClickListener() { // from class: l.cc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9586a.m14444R(view);
            }
        });
        xdl0.E0(this.f11052m, new View.OnClickListener() { // from class: l.dc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10286a.m14445S(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m14443Q(DialogInterface dialogInterface) {
        i0e.e(this.f11061v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m14444R(View view) {
        boolean z = NullChecker.a(this.f11062w) && TEnum.equals(this.f11062w.partyType, "quickchat");
        dismiss();
        if (z) {
            zvf0.u("e_quickchat_button", "p_quickchat_party_begin", new j760[]{j760.a("remainingtimes", Integer.valueOf(a.b0()))});
            Act act = this.f11060u;
            act.startActivity(DropDownAct.m7783b2(act, "quick_chat", "text_quickchat_party", Boolean.FALSE));
        } else {
            zvf0.u("e_voicechat_button", "p_quickchat_party_begin", new j760[]{j760.a("remainingtimes", Integer.valueOf(sqb0.m24051i0()))});
            Act act2 = this.f11060u;
            act2.startActivity(DropDownAct.m7783b2(act2, "voice_quick_chat", "voice_quickchat_party", Boolean.FALSE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m14445S(View view) {
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    private void m14446T() {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: U */
    public static void m14447U(@NonNull Act act, @NonNull QuickChatPartyCampaignPage quickChatPartyCampaignPage) {
        new ec1(act, quickChatPartyCampaignPage).show();
    }

    /* JADX INFO: renamed from: H */
    public View m14448H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fc1.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: I */
    public final String m14449I() {
        return "活动火热进行中\n目前共有" + m14450J() + "人在线热聊";
    }

    /* JADX INFO: renamed from: J */
    public final int m14450J() {
        if (this.f11063x.size() <= 0) {
            this.f11063x.put(0, j760.a(8762, 11014));
            this.f11063x.put(1, j760.a(5528, 9765));
            this.f11063x.put(2, j760.a(4669, 6161));
            this.f11063x.put(3, j760.a(3211, 5203));
            this.f11063x.put(4, j760.a(2881, 3578));
            this.f11063x.put(5, j760.a(4249, 6004));
            this.f11063x.put(6, j760.a(5388, 8066));
            this.f11063x.put(7, j760.a(7238, 10093));
            this.f11063x.put(8, j760.a(8347, 11238));
            this.f11063x.put(9, j760.a(9294, 12185));
            this.f11063x.put(10, j760.a(11164, 12291));
            this.f11063x.put(11, j760.a(12261, 12837));
            this.f11063x.put(12, j760.a(10707, 12454));
            this.f11063x.put(13, j760.a(11410, 12639));
            this.f11063x.put(14, j760.a(11444, 12759));
            this.f11063x.put(15, j760.a(11203, 12570));
            this.f11063x.put(16, j760.a(11516, 12914));
            this.f11063x.put(17, j760.a(10781, 12353));
            this.f11063x.put(18, j760.a(11317, 13007));
            this.f11063x.put(19, j760.a(11917, 14604));
            this.f11063x.put(20, j760.a(13380, 15737));
            this.f11063x.put(21, j760.a(14238, 15995));
            this.f11063x.put(22, j760.a(13014, 13793));
            this.f11063x.put(23, j760.a(11781, 12583));
        }
        j760<Integer, Integer> j760Var = this.f11063x.get(Integer.valueOf(Calendar.getInstance().get(11)));
        return (int) ((((double) (((Integer) j760Var.b).intValue() - ((Integer) j760Var.a).intValue())) * Math.random()) + ((double) ((Integer) j760Var.a).intValue()));
    }

    /* JADX INFO: renamed from: K */
    public final String m14451K() {
        StringBuilder sb = new StringBuilder();
        QuickChatPartyCampaignPage quickChatPartyCampaignPage = this.f11062w;
        if (quickChatPartyCampaignPage == null || !quickChatPartyCampaignPage.isValueAvailable()) {
            sb.append("每周");
            return sb.toString();
        }
        sb.append(m14438L(this.f11062w.weekDay));
        int i = this.f11062w.beginHour;
        if (i > 9) {
            sb.append(i);
        } else {
            sb.append(0);
            sb.append(this.f11062w.beginHour);
        }
        sb.append(":00至");
        int i2 = this.f11062w.endHour;
        if (i2 > 9) {
            sb.append(i2);
        } else {
            sb.append(0);
            sb.append(this.f11062w.endHour);
        }
        sb.append(":00，限时开启");
        return sb.toString();
    }

    public void dismiss() {
        super.dismiss();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        View viewM14448H = m14448H(this.f11060u.getLayoutInflater(), null);
        this.f11059t = viewM14448H;
        setContentView(viewM14448H);
        m14446T();
        m14442P();
    }

    public void show() {
        super.show();
        cwf0 cwf0VarC = i0e.c("p_quickchat_party_begin", getClass().getName());
        this.f11061v = cwf0VarC;
        cwf0VarC.o(o6j0.b(new o6j0.a[]{o6j0.a.i("is_voicechat", (NullChecker.a(this.f11062w) && TEnum.equals(this.f11062w.partyType, "quickchat")) ? false : true)}));
        i0e.f(this.f11061v);
    }
}
